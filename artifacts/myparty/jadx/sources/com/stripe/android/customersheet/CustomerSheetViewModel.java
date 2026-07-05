package com.stripe.android.customersheet;

import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.common.coroutines.Single;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetContract;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.customersheet.CustomerSheetState;
import com.stripe.android.customersheet.CustomerSheetViewAction;
import com.stripe.android.customersheet.CustomerSheetViewModel;
import com.stripe.android.customersheet.CustomerSheetViewState;
import com.stripe.android.customersheet.InternalCustomerSheetResult;
import com.stripe.android.customersheet.analytics.CustomerSheetEventReporter;
import com.stripe.android.customersheet.data.CustomerSheetDataResult;
import com.stripe.android.customersheet.data.CustomerSheetDataResultKtxKt;
import com.stripe.android.customersheet.data.CustomerSheetIntentDataSource;
import com.stripe.android.customersheet.data.CustomerSheetPaymentMethodDataSource;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import com.stripe.android.customersheet.injection.CustomerSheetViewModelScope;
import com.stripe.android.customersheet.injection.DaggerCustomerSheetViewModelComponent;
import com.stripe.android.customersheet.util.CustomerSheetHacks;
import com.stripe.android.customersheet.util.CustomerSheetUtilsKt;
import com.stripe.android.customersheet.util.PaymentMethodKtxKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentSheetCardBrandFilter;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.financialconnections.GetFinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.forms.FormArgumentsFactory;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.SavedSelectionKt;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.ui.AddPaymentMethodKt;
import com.stripe.android.paymentsheet.ui.DefaultUpdatePaymentMethodInteractor;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CustomerSheetViewModel.kt */
@CustomerSheetViewModelScope
@Metadata(d1 = {"\u0000î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ¾\u00012\u00020\u0001:\b¼\u0001½\u0001¾\u0001¿\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)B\u0093\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u001b\u0012\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010*J\u000e\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020\u001eJ\u0016\u0010K\u001a\u00020L2\u000e\u0010M\u001a\n\u0018\u00010!j\u0004\u0018\u0001`NJ\u0016\u0010O\u001a\u00020G2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SJ\u000e\u0010T\u001a\u00020GH\u0082@¢\u0006\u0002\u0010UJ\b\u0010V\u001a\u00020GH\u0002J\b\u0010W\u001a\u00020GH\u0002J\b\u0010X\u001a\u00020GH\u0002J\b\u0010Y\u001a\u00020GH\u0002J\b\u0010Z\u001a\u00020GH\u0002J\u0010\u0010[\u001a\u00020G2\u0006\u0010\\\u001a\u00020CH\u0002J\u0012\u0010]\u001a\u00020G2\b\u0010^\u001a\u0004\u0018\u00010_H\u0002J\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010\\\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ$\u0010d\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010\\\u001a\u00020b2\u0006\u0010e\u001a\u00020fH\u0082@¢\u0006\u0002\u0010gJ\u0010\u0010h\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0002J\u0010\u0010i\u001a\u00020G2\u0006\u0010\\\u001a\u00020jH\u0002J\u0018\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010\\\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ&\u0010m\u001a\b\u0012\u0004\u0012\u00020b0n2\u0006\u0010\\\u001a\u00020b2\u0006\u0010e\u001a\u00020fH\u0082@¢\u0006\u0004\bo\u0010gJ\u0016\u0010p\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ\u0010\u0010q\u001a\u00020G2\u0006\u0010r\u001a\u00020bH\u0002J\u0012\u0010s\u001a\u00020G2\b\u0010t\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010u\u001a\u00020GH\u0002J\u0010\u0010v\u001a\u00020G2\u0006\u0010w\u001a\u00020xH\u0002J\u0010\u0010y\u001a\u00020G2\u0006\u0010z\u001a\u00020\u001eH\u0002J\u0012\u0010{\u001a\u00020|2\b\u0010}\u001a\u0004\u0018\u00010~H\u0002J$\u0010\u007f\u001a\u00020G2\u001a\u0010\u0080\u0001\u001a\u0015\u0012\u0007\u0012\u0005\u0018\u00010\u0082\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0082\u00010\u0081\u0001H\u0002J\u001d\u0010\u0083\u0001\u001a\u00020G2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010L2\u0007\u0010\u0085\u0001\u001a\u00020\u001eH\u0002J\u0014\u0010\u0086\u0001\u001a\u00020G2\t\u0010t\u001a\u0005\u0018\u00010\u0087\u0001H\u0002J\t\u0010\u0088\u0001\u001a\u00020GH\u0002J\u0013\u0010\u0089\u0001\u001a\u00020G2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0002J\u0013\u0010\u008c\u0001\u001a\u00020G2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J\u0014\u0010\u008f\u0001\u001a\u00020G2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010LH\u0002J\t\u0010\u0091\u0001\u001a\u00020GH\u0002J\u001f\u0010\u0092\u0001\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0\u0081\u0001H\u0002J\u001f\u0010\u0094\u0001\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0081\u0001H\u0002J\"\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020b0n2\u0007\u0010\u0096\u0001\u001a\u00020xH\u0082@¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0002J\u0017\u0010\u009a\u0001\u001a\u00020G2\u0006\u0010\\\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ)\u0010\u009b\u0001\u001a\u00020G2\u0006\u0010}\u001a\u00020~2\u0007\u0010\u009c\u0001\u001a\u00020!2\u0006\u0010\\\u001a\u00020bH\u0082@¢\u0006\u0003\u0010\u009d\u0001J\u0019\u0010\u009e\u0001\u001a\u00020G2\u0007\u0010\u009f\u0001\u001a\u00020!H\u0082@¢\u0006\u0003\u0010 \u0001J\u0018\u0010¡\u0001\u001a\u00020G2\u0007\u0010¢\u0001\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ\u0015\u0010£\u0001\u001a\u00020G2\n\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0002J\t\u0010¦\u0001\u001a\u00020GH\u0002J/\u0010§\u0001\u001a\u00020G2\b\u0010t\u001a\u0004\u0018\u00010\u00052\t\u0010¨\u0001\u001a\u0004\u0018\u00010!2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0003\u0010ª\u0001JC\u0010«\u0001\u001a\u00020G2\b\u0010t\u001a\u0004\u0018\u00010\u00052\t\u0010¨\u0001\u001a\u0004\u0018\u00010!2\t\u0010©\u0001\u001a\u0004\u0018\u00010\u001e2\u0007\u0010¬\u0001\u001a\u00020l2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0003\u0010®\u0001J\u001d\u0010¯\u0001\u001a\u00020G2\u0007\u0010°\u0001\u001a\u0002002\t\b\u0002\u0010±\u0001\u001a\u00020\u001eH\u0002J/\u0010²\u0001\u001a\u00020G\"\u000b\b\u0000\u0010³\u0001\u0018\u0001*\u0002002\u0016\u0010´\u0001\u001a\u0011\u0012\u0005\u0012\u0003H³\u0001\u0012\u0005\u0012\u0003H³\u00010\u0081\u0001H\u0082\bJ\u000f\u0010µ\u0001\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010UJ\u000f\u0010¶\u0001\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010UJ\u000f\u0010·\u0001\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010UR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020002¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010602¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001e0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020=0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020A02X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020C0EX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010¸\u0001\u001a\u0005\u0018\u00010¹\u0001*\u0002008BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001¨\u0006À\u0001"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "originalPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentConfigurationProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "paymentMethodDataSourceProvider", "Lcom/stripe/android/common/coroutines/Single;", "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;", "intentDataSourceProvider", "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;", "savedSelectionDataSourceProvider", "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "integrationType", "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;", "logger", "Lcom/stripe/android/core/Logger;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "eventReporter", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "isLiveModeProvider", "Lkotlin/Function0;", "", NamedConstantsKt.PRODUCT_USAGE, "", "", "confirmationHandlerFactory", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;", "customerSheetLoader", "Lcom/stripe/android/customersheet/CustomerSheetLoader;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/common/coroutines/Single;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljavax/inject/Provider;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/core/Logger;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/customersheet/CustomerSheetLoader;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "backStack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/stripe/android/customersheet/CustomerSheetViewState;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "_result", "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "getResult", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "isEditing", "selectionConfirmationState", "Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;", "customerState", "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;", "selectPaymentMethodState", "Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;", "previouslySelectedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "supportedPaymentMethods", "", "handleViewAction", "", "viewAction", "Lcom/stripe/android/customersheet/CustomerSheetViewAction;", "bottomSheetConfirmStateChange", "providePaymentMethodName", "Lcom/stripe/android/core/strings/ResolvableString;", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "registerFromActivity", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "loadCustomerSheetState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionToInitialScreen", "onAddCardPressed", "onDismissed", "onBackPressed", "onEditPressed", "onAddPaymentMethodItemChanged", "paymentMethod", "onFormFieldValuesCompleted", "formFieldValues", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "removePaymentMethod", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifyCardPaymentMethod", "cardUpdateParams", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePaymentMethodRemovedFromEditScreen", "onModifyItem", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "removeExecutor", "", "updatePaymentMethodExecutor", "Lkotlin/Result;", "updatePaymentMethodExecutor-0E7RQCE", "removePaymentMethodFromState", "updatePaymentMethodInState", "updatedMethod", "onItemSelected", "paymentSelection", "onPrimaryButtonPressed", "createAndAttach", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "transitionToAddPaymentMethod", "isFirstPaymentMethod", "createDefaultUsBankArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "updateCustomButtonUIState", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "updateMandateText", "mandateText", "showAbove", "onCollectUSBankAccountResult", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;", "onCardNumberInputCompleted", "onAnalyticsEvent", "event", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "onDisallowedCardBrandEntered", "brand", "Lcom/stripe/android/model/CardBrand;", "onFormError", "error", "onCancelCloseForm", "setCustomerState", "update", "setSelectionConfirmationState", "createPaymentMethod", "createParams", "createPaymentMethod-gIAlu-s", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethodToCustomer", "attachWithSetupIntent", "handleStripeIntent", "clientSecret", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAndUpdatePaymentMethods", "newPaymentMethod", "selectSavedPaymentMethod", "savedPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "selectGooglePay", "confirmPaymentSelection", "type", "syncDefaultEnabled", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;)V", "confirmPaymentSelectionError", "cause", "displayMessage", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Throwable;Ljava/lang/String;)V", "transition", "to", "reset", "updateViewState", ExifInterface.GPS_DIRECTION_TRUE, ViewProps.TRANSFORM, "awaitPaymentMethodDataSource", "awaitIntentDataSource", "awaitSavedSelectionDataSource", "eventReporterScreen", "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;", "getEventReporterScreen", "(Lcom/stripe/android/customersheet/CustomerSheetViewState;)Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;", "CustomerState", "SelectionConfirmationState", "Companion", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetViewModel extends ViewModel {
    public static final long REMOVAL_TRANSITION_DELAY = 50;
    private final MutableStateFlow<InternalCustomerSheetResult> _result;
    private final MutableStateFlow<List<CustomerSheetViewState>> backStack;
    private final DefaultCardAccountRangeRepositoryFactory cardAccountRangeRepositoryFactory;
    private final CustomerSheet.Configuration configuration;
    private final ConfirmationHandler confirmationHandler;
    private final CustomerSheetLoader customerSheetLoader;
    private final MutableStateFlow<CustomerState> customerState;
    private final ErrorReporter errorReporter;
    private final CustomerSheetEventReporter eventReporter;
    private final CustomerSheetIntegration.Type integrationType;
    private final Single<CustomerSheetIntentDataSource> intentDataSourceProvider;
    private final MutableStateFlow<Boolean> isEditing;
    private final Function0<Boolean> isLiveModeProvider;
    private final Logger logger;
    private PaymentSelection originalPaymentSelection;
    private final Provider<PaymentConfiguration> paymentConfigurationProvider;
    private final Single<CustomerSheetPaymentMethodDataSource> paymentMethodDataSourceProvider;
    private SupportedPaymentMethod previouslySelectedPaymentMethod;
    private final Set<String> productUsage;
    private final StateFlow<InternalCustomerSheetResult> result;
    private final Single<CustomerSheetSavedSelectionDataSource> savedSelectionDataSourceProvider;
    private final StateFlow<CustomerSheetViewState.SelectPaymentMethod> selectPaymentMethodState;
    private final MutableStateFlow<SelectionConfirmationState> selectionConfirmationState;
    private final StripeRepository stripeRepository;
    private List<SupportedPaymentMethod> supportedPaymentMethods;
    private final StateFlow<CustomerSheetViewState> viewState;
    private final CoroutineContext workContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2}, l = {1078, 1078, 1083}, m = "attachPaymentMethod", n = {"this", "id", "this", "id", "this", "id", "$this$onSuccess$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$attachPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C08081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C08081(Continuation<? super C08081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSheetViewModel.this.attachPaymentMethod(null, this);
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 4}, l = {982, 982, 984, 992, PointerIconCompat.TYPE_HELP}, m = "attachWithSetupIntent", n = {"this", "paymentMethod", "this", "paymentMethod", "this", "paymentMethod", "clientSecret", "this", "paymentMethod", "$this$onFailure$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$attachWithSetupIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C08101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C08101(Continuation<? super C08101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSheetViewModel.this.attachWithSetupIntent(null, this);
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1}, l = {PointerIconCompat.TYPE_GRABBING, 1036, 1042, 1054}, m = "handleStripeIntent", n = {"this", "paymentMethod", "this", "paymentMethod"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$handleStripeIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C08131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08131(Continuation<? super C08131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSheetViewModel.this.handleStripeIntent(null, null, null, this);
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0}, l = {338, 344}, m = "loadCustomerSheetState", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$loadCustomerSheetState$1, reason: invalid class name and case insensitive filesystem */
    static final class C08151 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08151(Continuation<? super C08151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSheetViewModel.this.loadCustomerSheetState(this);
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 0, 1, 1}, l = {522, 522}, m = "modifyCardPaymentMethod", n = {"this", "paymentMethod", "cardUpdateParams", "this", "cardUpdateParams"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$modifyCardPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C08171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C08171(Continuation<? super C08171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSheetViewModel.this.modifyCardPaymentMethod(null, null, this);
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0}, l = {597}, m = "removeExecutor", n = {"this", "paymentMethod"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$removeExecutor$1, reason: invalid class name and case insensitive filesystem */
    static final class C08221 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08221(Continuation<? super C08221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSheetViewModel.this.removeExecutor(null, this);
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel", f = "CustomerSheetViewModel.kt", i = {0, 0, 1, 1}, l = {TypedValues.PositionType.TYPE_SIZE_PERCENT, TypedValues.PositionType.TYPE_SIZE_PERCENT}, m = "removePaymentMethod", n = {"this", "paymentMethod", "this", "paymentMethod"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$removePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C08231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08231(Continuation<? super C08231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerSheetViewModel.this.removePaymentMethod(null, this);
        }
    }

    public /* synthetic */ CustomerSheetViewModel(Application application, PaymentSelection paymentSelection, Provider provider, Single single, Single single2, Single single3, CustomerSheet.Configuration configuration, CustomerSheetIntegration.Type type, Logger logger, StripeRepository stripeRepository, CustomerSheetEventReporter customerSheetEventReporter, CoroutineContext coroutineContext, Function0 function0, Set set, ConfirmationHandler.Factory factory, CustomerSheetLoader customerSheetLoader, ErrorReporter errorReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, paymentSelection, provider, single, single2, single3, configuration, type, logger, stripeRepository, customerSheetEventReporter, (i & 2048) != 0 ? Dispatchers.getIO() : coroutineContext, function0, set, factory, customerSheetLoader, errorReporter);
    }

    public CustomerSheetViewModel(Application application, PaymentSelection paymentSelection, Provider<PaymentConfiguration> paymentConfigurationProvider, Single<CustomerSheetPaymentMethodDataSource> paymentMethodDataSourceProvider, Single<CustomerSheetIntentDataSource> intentDataSourceProvider, Single<CustomerSheetSavedSelectionDataSource> savedSelectionDataSourceProvider, CustomerSheet.Configuration configuration, CustomerSheetIntegration.Type integrationType, Logger logger, StripeRepository stripeRepository, CustomerSheetEventReporter eventReporter, CoroutineContext workContext, Function0<Boolean> isLiveModeProvider, Set<String> productUsage, ConfirmationHandler.Factory confirmationHandlerFactory, CustomerSheetLoader customerSheetLoader, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(paymentConfigurationProvider, "paymentConfigurationProvider");
        Intrinsics.checkNotNullParameter(paymentMethodDataSourceProvider, "paymentMethodDataSourceProvider");
        Intrinsics.checkNotNullParameter(intentDataSourceProvider, "intentDataSourceProvider");
        Intrinsics.checkNotNullParameter(savedSelectionDataSourceProvider, "savedSelectionDataSourceProvider");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(isLiveModeProvider, "isLiveModeProvider");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(confirmationHandlerFactory, "confirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(customerSheetLoader, "customerSheetLoader");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.originalPaymentSelection = paymentSelection;
        this.paymentConfigurationProvider = paymentConfigurationProvider;
        this.paymentMethodDataSourceProvider = paymentMethodDataSourceProvider;
        this.intentDataSourceProvider = intentDataSourceProvider;
        this.savedSelectionDataSourceProvider = savedSelectionDataSourceProvider;
        this.configuration = configuration;
        this.integrationType = integrationType;
        this.logger = logger;
        this.stripeRepository = stripeRepository;
        this.eventReporter = eventReporter;
        this.workContext = workContext;
        this.isLiveModeProvider = isLiveModeProvider;
        this.productUsage = productUsage;
        this.customerSheetLoader = customerSheetLoader;
        this.errorReporter = errorReporter;
        this.cardAccountRangeRepositoryFactory = new DefaultCardAccountRangeRepositoryFactory(application, productUsage);
        MutableStateFlow<List<CustomerSheetViewState>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.listOf(new CustomerSheetViewState.Loading(isLiveModeProvider.invoke().booleanValue())));
        this.backStack = MutableStateFlow;
        StateFlow<CustomerSheetViewState> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.viewState$lambda$0((List) obj);
            }
        });
        this.viewState = stateFlowMapAsStateFlow;
        MutableStateFlow<InternalCustomerSheetResult> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._result = MutableStateFlow2;
        this.result = MutableStateFlow2;
        CustomerSheetViewModel customerSheetViewModel = this;
        this.confirmationHandler = confirmationHandlerFactory.create(ViewModelKt.getViewModelScope(customerSheetViewModel));
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(false);
        this.isEditing = MutableStateFlow3;
        MutableStateFlow<SelectionConfirmationState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new SelectionConfirmationState(false, null));
        this.selectionConfirmationState = MutableStateFlow4;
        MutableStateFlow<CustomerState> MutableStateFlow5 = StateFlowKt.MutableStateFlow(new CustomerState(CollectionsKt.emptyList(), this.originalPaymentSelection, null, new CustomerPermissions(false, false, false), configuration));
        this.customerState = MutableStateFlow5;
        this.selectPaymentMethodState = StateFlowsKt.combineAsStateFlow(MutableStateFlow5, MutableStateFlow4, MutableStateFlow3, new Function3() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CustomerSheetViewModel.selectPaymentMethodState$lambda$2(this.f$0, (CustomerSheetViewModel.CustomerState) obj, (CustomerSheetViewModel.SelectionConfirmationState) obj2, ((Boolean) obj3).booleanValue());
            }
        });
        this.supportedPaymentMethods = new ArrayList();
        PaymentSheetConfigurationKtxKt.parseAppearance(configuration.getAppearance());
        eventReporter.onInit(configuration, integrationType);
        if (stateFlowMapAsStateFlow.getValue() instanceof CustomerSheetViewState.Loading) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(customerSheetViewModel), workContext, null, new AnonymousClass1(null), 2, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(customerSheetViewModel), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(customerSheetViewModel), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(customerSheetViewModel), null, null, new AnonymousClass4(null), 3, null);
    }

    public /* synthetic */ CustomerSheetViewModel(Application application, PaymentSelection paymentSelection, Provider provider, CustomerSheet.Configuration configuration, CustomerSheetIntegration.Type type, Logger logger, StripeRepository stripeRepository, CustomerSheetEventReporter customerSheetEventReporter, CoroutineContext coroutineContext, Function0 function0, Set set, ConfirmationHandler.Factory factory, CustomerSheetLoader customerSheetLoader, ErrorReporter errorReporter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, paymentSelection, provider, configuration, type, logger, stripeRepository, customerSheetEventReporter, (i & 256) != 0 ? Dispatchers.getIO() : coroutineContext, function0, set, factory, customerSheetLoader, errorReporter);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public CustomerSheetViewModel(Application application, PaymentSelection paymentSelection, Provider<PaymentConfiguration> paymentConfigurationProvider, CustomerSheet.Configuration configuration, CustomerSheetIntegration.Type integrationType, Logger logger, StripeRepository stripeRepository, CustomerSheetEventReporter eventReporter, @IOContext CoroutineContext workContext, @Named(com.stripe.android.core.injection.NamedConstantsKt.IS_LIVE_MODE) Function0<Boolean> isLiveModeProvider, @Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage, ConfirmationHandler.Factory confirmationHandlerFactory, CustomerSheetLoader customerSheetLoader, ErrorReporter errorReporter) {
        this(application, paymentSelection, paymentConfigurationProvider, CustomerSheetHacks.INSTANCE.getPaymentMethodDataSource(), CustomerSheetHacks.INSTANCE.getIntentDataSource(), CustomerSheetHacks.INSTANCE.getSavedSelectionDataSource(), configuration, integrationType, logger, stripeRepository, eventReporter, workContext, isLiveModeProvider, productUsage, confirmationHandlerFactory, customerSheetLoader, errorReporter);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(paymentConfigurationProvider, "paymentConfigurationProvider");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(integrationType, "integrationType");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(isLiveModeProvider, "isLiveModeProvider");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(confirmationHandlerFactory, "confirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(customerSheetLoader, "customerSheetLoader");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerSheetViewState viewState$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (CustomerSheetViewState) CollectionsKt.last(it);
    }

    public final StateFlow<CustomerSheetViewState> getViewState() {
        return this.viewState;
    }

    public final StateFlow<InternalCustomerSheetResult> getResult() {
        return this.result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerSheetViewState.SelectPaymentMethod selectPaymentMethodState$lambda$2(CustomerSheetViewModel customerSheetViewModel, CustomerState customerState, SelectionConfirmationState selectionConfirmationState, boolean z) {
        ResolvableString resolvableStringMandateText;
        Intrinsics.checkNotNullParameter(customerState, "customerState");
        Intrinsics.checkNotNullParameter(selectionConfirmationState, "selectionConfirmationState");
        List<PaymentMethod> paymentMethods = customerState.getPaymentMethods();
        PaymentMethodMetadata metadata = customerState.getMetadata();
        PaymentSelection currentSelection = customerState.getCurrentSelection();
        boolean z2 = z && customerState.getCanEdit();
        boolean z3 = (z2 || Intrinsics.areEqual(customerSheetViewModel.originalPaymentSelection, currentSelection)) ? false : true;
        String headerTextForSelectionScreen = customerSheetViewModel.configuration.getHeaderTextForSelectionScreen();
        boolean zBooleanValue = customerSheetViewModel.isLiveModeProvider.invoke().booleanValue();
        boolean canRemove = customerState.getCanRemove();
        boolean zShouldShowGooglePay = INSTANCE.shouldShowGooglePay(metadata);
        return new CustomerSheetViewState.SelectPaymentMethod(headerTextForSelectionScreen, paymentMethods, currentSelection, zBooleanValue, selectionConfirmationState.isConfirming(), z2, zShouldShowGooglePay, z3, customerState.getCanEdit(), canRemove, selectionConfirmationState.getError(), (currentSelection == null || (resolvableStringMandateText = currentSelection.mandateText(customerSheetViewModel.configuration.getMerchantDisplayName(), false)) == null || !z3) ? null : resolvableStringMandateText, customerState.getCbcEligibility() instanceof CardBrandChoiceEligibility.Eligible);
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$1", f = "CustomerSheetViewModel.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (CustomerSheetViewModel.this.loadCustomerSheetState(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$2", f = "CustomerSheetViewModel.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CustomerSheetViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "selectPaymentMethodState", "Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$2$1", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CustomerSheetViewState.SelectPaymentMethod, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CustomerSheetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomerSheetViewModel customerSheetViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = customerSheetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CustomerSheetViewState.SelectPaymentMethod selectPaymentMethod, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(selectPaymentMethod, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                ArrayList arrayList;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = (CustomerSheetViewState.SelectPaymentMethod) this.L$0;
                    MutableStateFlow mutableStateFlow = this.this$0.backStack;
                    do {
                        value = mutableStateFlow.getValue();
                        List<Object> list = (List) value;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (Object obj3 : list) {
                            if (obj3 instanceof CustomerSheetViewState.SelectPaymentMethod) {
                                obj3 = (CustomerSheetViewState) obj2;
                            }
                            arrayList.add(obj3);
                        }
                    } while (!mutableStateFlow.compareAndSet(value, arrayList));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(CustomerSheetViewModel.this.selectPaymentMethodState, new AnonymousClass1(CustomerSheetViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$3", f = "CustomerSheetViewModel.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CustomerSheetViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$3$1", f = "CustomerSheetViewModel.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CustomerState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CustomerSheetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomerSheetViewModel customerSheetViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = customerSheetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CustomerState customerState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(customerState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!((CustomerState) this.L$0).getCanShowSavedPaymentMethods() && (this.this$0.getViewState().getValue() instanceof CustomerSheetViewState.SelectPaymentMethod)) {
                        this.label = 1;
                        if (DelayKt.delay(50L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.transitionToAddPaymentMethod(true);
                this.this$0.selectionConfirmationState.setValue(new SelectionConfirmationState(false, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(CustomerSheetViewModel.this.customerState, new AnonymousClass1(CustomerSheetViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$4", f = "CustomerSheetViewModel.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CustomerSheetViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$4$1", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CustomerState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CustomerSheetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CustomerSheetViewModel customerSheetViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = customerSheetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CustomerState customerState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(customerState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!((CustomerState) this.L$0).getCanEdit() && ((Boolean) this.this$0.isEditing.getValue()).booleanValue()) {
                    this.this$0.isEditing.setValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(CustomerSheetViewModel.this.customerState, new AnonymousClass1(CustomerSheetViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void handleViewAction(CustomerSheetViewAction viewAction) {
        Intrinsics.checkNotNullParameter(viewAction, "viewAction");
        if (viewAction instanceof CustomerSheetViewAction.OnDismissed) {
            onDismissed();
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnAddCardPressed) {
            onAddCardPressed();
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnCardNumberInputCompleted) {
            onCardNumberInputCompleted();
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnDisallowedCardBrandEntered) {
            onDisallowedCardBrandEntered(((CustomerSheetViewAction.OnDisallowedCardBrandEntered) viewAction).getBrand());
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnAnalyticsEvent) {
            onAnalyticsEvent(((CustomerSheetViewAction.OnAnalyticsEvent) viewAction).getEvent());
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnBackPressed) {
            onBackPressed();
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnEditPressed) {
            onEditPressed();
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnModifyItem) {
            onModifyItem(((CustomerSheetViewAction.OnModifyItem) viewAction).getPaymentMethod());
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnItemSelected) {
            onItemSelected(((CustomerSheetViewAction.OnItemSelected) viewAction).getSelection());
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnPrimaryButtonPressed) {
            onPrimaryButtonPressed();
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnAddPaymentMethodItemChanged) {
            onAddPaymentMethodItemChanged(((CustomerSheetViewAction.OnAddPaymentMethodItemChanged) viewAction).getPaymentMethod());
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnFormFieldValuesCompleted) {
            onFormFieldValuesCompleted(((CustomerSheetViewAction.OnFormFieldValuesCompleted) viewAction).getFormFieldValues());
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnUpdateCustomButtonUIState) {
            updateCustomButtonUIState(((CustomerSheetViewAction.OnUpdateCustomButtonUIState) viewAction).getCallback());
            return;
        }
        if (viewAction instanceof CustomerSheetViewAction.OnUpdateMandateText) {
            CustomerSheetViewAction.OnUpdateMandateText onUpdateMandateText = (CustomerSheetViewAction.OnUpdateMandateText) viewAction;
            updateMandateText(onUpdateMandateText.getMandateText(), onUpdateMandateText.getShowAbovePrimaryButton());
        } else if (viewAction instanceof CustomerSheetViewAction.OnBankAccountSelectionChanged) {
            onCollectUSBankAccountResult(((CustomerSheetViewAction.OnBankAccountSelectionChanged) viewAction).getPaymentSelection());
        } else if (viewAction instanceof CustomerSheetViewAction.OnFormError) {
            onFormError(((CustomerSheetViewAction.OnFormError) viewAction).getError());
        } else {
            if (!(viewAction instanceof CustomerSheetViewAction.OnCancelClose)) {
                throw new NoWhenBranchMatchedException();
            }
            onCancelCloseForm();
        }
    }

    public final boolean bottomSheetConfirmStateChange() {
        Object value;
        ArrayList arrayList;
        if (!this.viewState.getValue().shouldDisplayDismissConfirmationModal()) {
            return true;
        }
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                    addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default((CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, null, false, true, null, null, 917503, null);
                }
                arrayList.add(addPaymentMethodCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
        return false;
    }

    public final ResolvableString providePaymentMethodName(String code) {
        ResolvableString displayName = null;
        if (code != null) {
            PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
            SupportedPaymentMethod supportedPaymentMethodSupportedPaymentMethodForCode = metadata != null ? metadata.supportedPaymentMethodForCode(code) : null;
            if (supportedPaymentMethodSupportedPaymentMethodForCode != null) {
                displayName = supportedPaymentMethodSupportedPaymentMethodForCode.getDisplayName();
            }
        }
        return ResolvableStringUtilsKt.orEmpty(displayName);
    }

    public final void registerFromActivity(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.confirmationHandler.register(activityResultCaller, lifecycleOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r4, r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadCustomerSheetState(Continuation<? super Unit> continuation) {
        C08151 c08151;
        CustomerSheetViewModel customerSheetViewModel;
        if (continuation instanceof C08151) {
            c08151 = (C08151) continuation;
            if ((c08151.label & Integer.MIN_VALUE) != 0) {
                c08151.label -= Integer.MIN_VALUE;
            } else {
                c08151 = new C08151(continuation);
            }
        }
        Object objWithContext = c08151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08151.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            CustomerSheetViewModel$loadCustomerSheetState$result$1 customerSheetViewModel$loadCustomerSheetState$result$1 = new CustomerSheetViewModel$loadCustomerSheetState$result$1(this, null);
            c08151.L$0 = this;
            c08151.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, customerSheetViewModel$loadCustomerSheetState$result$1, c08151);
            if (objWithContext != coroutine_suspended) {
                customerSheetViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
            return Unit.INSTANCE;
        }
        customerSheetViewModel = (CustomerSheetViewModel) c08151.L$0;
        ResultKt.throwOnFailure(objWithContext);
        Object value = ((Result) objWithContext).getValue();
        CoroutineContext coroutineContext2 = ViewModelKt.getViewModelScope(customerSheetViewModel).getCoroutineContext();
        C08162 c08162 = new C08162(value, customerSheetViewModel, null);
        c08151.L$0 = null;
        c08151.label = 2;
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$loadCustomerSheetState$2", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$loadCustomerSheetState$2, reason: invalid class name and case insensitive filesystem */
    static final class C08162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $result;
        int label;
        final /* synthetic */ CustomerSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08162(Object obj, CustomerSheetViewModel customerSheetViewModel, Continuation<? super C08162> continuation) {
            super(2, continuation);
            this.$result = obj;
            this.this$0 = customerSheetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C08162(this.$result, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$result;
            CustomerSheetViewModel customerSheetViewModel = this.this$0;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(obj2);
            if (thM9121exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = customerSheetViewModel._result;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new InternalCustomerSheetResult.Error(thM9121exceptionOrNullimpl)));
            } else {
                CustomerSheetState.Full full = (CustomerSheetState.Full) obj2;
                if (full.getValidationError() != null) {
                    MutableStateFlow mutableStateFlow2 = customerSheetViewModel._result;
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, new InternalCustomerSheetResult.Error(full.getValidationError())));
                } else {
                    customerSheetViewModel.supportedPaymentMethods.clear();
                    customerSheetViewModel.supportedPaymentMethods.addAll(full.getSupportedPaymentMethods());
                    customerSheetViewModel.originalPaymentSelection = full.getPaymentSelection();
                    customerSheetViewModel.customerState.setValue(new CustomerState(full.getCustomerPaymentMethods(), full.getPaymentSelection(), full.getPaymentMethodMetadata(), full.getCustomerPermissions(), customerSheetViewModel.configuration));
                    customerSheetViewModel.transitionToInitialScreen();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transitionToInitialScreen() {
        if (this.customerState.getValue().getCanShowSavedPaymentMethods()) {
            transition(this.selectPaymentMethodState.getValue(), true);
        } else {
            transitionToAddPaymentMethod(true);
        }
    }

    private final void onAddCardPressed() {
        transitionToAddPaymentMethod(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDismissed() {
        MutableStateFlow<InternalCustomerSheetResult> mutableStateFlow = this._result;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InternalCustomerSheetResult.Canceled(this.originalPaymentSelection))) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackPressed() {
        List<CustomerSheetViewState> value;
        List<CustomerSheetViewState> list;
        if (this.backStack.getValue().size() == 1) {
            this._result.tryEmit(new InternalCustomerSheetResult.Canceled(this.originalPaymentSelection));
            return;
        }
        MutableStateFlow<List<CustomerSheetViewState>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            list = value;
            CustomerSheetEventReporter.Screen eventReporterScreen = getEventReporterScreen((CustomerSheetViewState) CollectionsKt.last((List) list));
            if (eventReporterScreen != null) {
                this.eventReporter.onScreenHidden(eventReporterScreen);
            }
        } while (!mutableStateFlow.compareAndSet(value, CollectionsKt.dropLast(list, 1)));
    }

    private final void onEditPressed() {
        if (this.customerState.getValue().getCanEdit()) {
            boolean zBooleanValue = this.isEditing.getValue().booleanValue();
            if (zBooleanValue) {
                this.eventReporter.onEditCompleted();
            } else {
                this.eventReporter.onEditTapped();
            }
            this.isEditing.setValue(Boolean.valueOf(!zBooleanValue));
        }
    }

    private final void onAddPaymentMethodItemChanged(SupportedPaymentMethod paymentMethod) {
        Object value;
        ArrayList arrayList;
        ResolvableString resolvableString;
        CustomerSheetViewState value2 = this.viewState.getValue();
        CustomerSheetViewState.AddPaymentMethod addPaymentMethod = value2 instanceof CustomerSheetViewState.AddPaymentMethod ? (CustomerSheetViewState.AddPaymentMethod) value2 : null;
        if (addPaymentMethod == null || !Intrinsics.areEqual(addPaymentMethod.getPaymentMethodCode(), paymentMethod.getCode())) {
            PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
            if (metadata == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            this.eventReporter.onPaymentMethodSelected(paymentMethod.getCode());
            this.previouslySelectedPaymentMethod = paymentMethod;
            MutableStateFlow mutableStateFlow = this.backStack;
            do {
                value = mutableStateFlow.getValue();
                List<CustomerSheetViewState> list = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                    if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                        CustomerSheetViewState.AddPaymentMethod addPaymentMethod2 = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                        String code = paymentMethod.getCode();
                        FormArguments formArgumentsCreate = FormArgumentsFactory.INSTANCE.create(paymentMethod.getCode(), metadata);
                        List<FormElement> listFormElementsForCode = metadata.formElementsForCode(paymentMethod.getCode(), new UiDefinitionFactory.Arguments.Factory.Default(this.cardAccountRangeRepositoryFactory, null, null, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CustomerSheetViewModel.onAddPaymentMethodItemChanged$lambda$10$lambda$9((InlineSignupViewState) obj);
                            }
                        }, null, null, null, null, false, null, 496, null));
                        if (listFormElementsForCode == null) {
                            listFormElementsForCode = CollectionsKt.emptyList();
                        }
                        List<FormElement> list2 = listFormElementsForCode;
                        if (Intrinsics.areEqual(paymentMethod.getCode(), PaymentMethod.Type.USBankAccount.code) && addPaymentMethod2.getBankAccountSelection() == null) {
                            resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_continue_button_label);
                        } else {
                            resolvableString = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_save);
                        }
                        ResolvableString resolvableString2 = resolvableString;
                        PaymentSelection draftPaymentSelection = addPaymentMethod2.getDraftPaymentSelection();
                        addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod2, code, null, null, list2, formArgumentsCreate, null, null, false, false, false, null, false, resolvableString2, (addPaymentMethod2.getFormFieldValues() == null || addPaymentMethod2.getIsProcessing()) ? false : true, null, draftPaymentSelection != null ? draftPaymentSelection.mandateText(this.configuration.getMerchantDisplayName(), true) : null, false, false, null, null, 1003494, null);
                    }
                    arrayList.add(addPaymentMethodCopy$default);
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAddPaymentMethodItemChanged$lambda$10$lambda$9(InlineSignupViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
    }

    private final void onFormFieldValuesCompleted(FormFieldValues formFieldValues) {
        PaymentMethodMetadata paymentMethodMetadata;
        MutableStateFlow mutableStateFlow;
        Object obj;
        ArrayList arrayList;
        PaymentSelection paymentSelectionTransformToPaymentSelection;
        FormFieldValues formFieldValues2 = formFieldValues;
        PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
        if (metadata == null) {
            return;
        }
        MutableStateFlow mutableStateFlow2 = this.backStack;
        while (true) {
            Object value = mutableStateFlow2.getValue();
            List<CustomerSheetViewState> list = (List) value;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                    CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                    boolean z = (formFieldValues2 == null || addPaymentMethod.getIsProcessing()) ? false : true;
                    if (formFieldValues2 != null) {
                        for (SupportedPaymentMethod supportedPaymentMethod : addPaymentMethod.getSupportedPaymentMethods()) {
                            if (Intrinsics.areEqual(supportedPaymentMethod.getCode(), addPaymentMethod.getPaymentMethodCode())) {
                                paymentSelectionTransformToPaymentSelection = AddPaymentMethodKt.transformToPaymentSelection(formFieldValues2, supportedPaymentMethod, metadata);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    paymentSelectionTransformToPaymentSelection = null;
                    paymentMethodMetadata = metadata;
                    mutableStateFlow = mutableStateFlow2;
                    obj = value;
                    arrayList = arrayList2;
                    addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod, null, null, formFieldValues2, null, null, null, paymentSelectionTransformToPaymentSelection, false, false, false, null, false, null, z, null, null, false, false, null, null, 1040315, null);
                } else {
                    paymentMethodMetadata = metadata;
                    mutableStateFlow = mutableStateFlow2;
                    obj = value;
                    arrayList = arrayList2;
                }
                arrayList.add(addPaymentMethodCopy$default);
                formFieldValues2 = formFieldValues;
                arrayList2 = arrayList;
                metadata = paymentMethodMetadata;
                mutableStateFlow2 = mutableStateFlow;
                value = obj;
            }
            PaymentMethodMetadata paymentMethodMetadata2 = metadata;
            MutableStateFlow mutableStateFlow3 = mutableStateFlow2;
            if (mutableStateFlow3.compareAndSet(value, arrayList2)) {
                return;
            }
            formFieldValues2 = formFieldValues;
            mutableStateFlow2 = mutableStateFlow3;
            metadata = paymentMethodMetadata2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removePaymentMethod(PaymentMethod paymentMethod, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        C08231 c08231;
        CustomerSheetViewModel customerSheetViewModel;
        CustomerSheetViewModel customerSheetViewModel2;
        CustomerSheetDataResult customerSheetDataResult;
        CustomerSheetDataResult.Failure failureFailureOrNull;
        StripeError stripeError;
        if (continuation instanceof C08231) {
            c08231 = (C08231) continuation;
            if ((c08231.label & Integer.MIN_VALUE) != 0) {
                c08231.label -= Integer.MIN_VALUE;
            } else {
                c08231 = new C08231(continuation);
            }
        }
        Object objAwaitPaymentMethodDataSource = c08231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08231.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwaitPaymentMethodDataSource);
            c08231.L$0 = this;
            c08231.L$1 = paymentMethod;
            c08231.label = 1;
            objAwaitPaymentMethodDataSource = awaitPaymentMethodDataSource(c08231);
            if (objAwaitPaymentMethodDataSource != coroutine_suspended) {
                customerSheetViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethod = (PaymentMethod) c08231.L$1;
            customerSheetViewModel2 = (CustomerSheetViewModel) c08231.L$0;
            ResultKt.throwOnFailure(objAwaitPaymentMethodDataSource);
            customerSheetDataResult = (CustomerSheetDataResult) objAwaitPaymentMethodDataSource;
            if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
                customerSheetViewModel2.eventReporter.onRemovePaymentMethodSucceeded();
            }
            failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
            if (failureFailureOrNull != null) {
                if (failureFailureOrNull.getDisplayMessage() == null) {
                    Throwable cause = failureFailureOrNull.getCause();
                    StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                    if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                        stripeError.getMessage();
                    }
                }
                Throwable cause2 = failureFailureOrNull.getCause();
                customerSheetViewModel2.eventReporter.onRemovePaymentMethodFailed();
                customerSheetViewModel2.logger.error("Failed to detach payment method: " + paymentMethod, cause2);
            }
            return customerSheetDataResult;
        }
        paymentMethod = (PaymentMethod) c08231.L$1;
        customerSheetViewModel = (CustomerSheetViewModel) c08231.L$0;
        ResultKt.throwOnFailure(objAwaitPaymentMethodDataSource);
        String str = paymentMethod.id;
        Intrinsics.checkNotNull(str);
        c08231.L$0 = customerSheetViewModel;
        c08231.L$1 = paymentMethod;
        c08231.label = 2;
        objAwaitPaymentMethodDataSource = ((CustomerSheetPaymentMethodDataSource) objAwaitPaymentMethodDataSource).detachPaymentMethod(str, c08231);
        if (objAwaitPaymentMethodDataSource != coroutine_suspended) {
            customerSheetViewModel2 = customerSheetViewModel;
            customerSheetDataResult = (CustomerSheetDataResult) objAwaitPaymentMethodDataSource;
            if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            }
            failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
            if (failureFailureOrNull != null) {
            }
            return customerSheetDataResult;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object modifyCardPaymentMethod(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super CustomerSheetDataResult<PaymentMethod>> continuation) {
        C08171 c08171;
        PaymentMethod paymentMethod2;
        CardUpdateParams cardUpdateParams2;
        Object objAwaitPaymentMethodDataSource;
        CustomerSheetViewModel customerSheetViewModel;
        CardUpdateParams cardUpdateParams3;
        CustomerSheetViewModel customerSheetViewModel2;
        CustomerSheetDataResult customerSheetDataResult;
        CustomerSheetDataResult.Failure failureFailureOrNull;
        StripeError stripeError;
        if (continuation instanceof C08171) {
            c08171 = (C08171) continuation;
            if ((c08171.label & Integer.MIN_VALUE) != 0) {
                c08171.label -= Integer.MIN_VALUE;
            } else {
                c08171 = new C08171(continuation);
            }
        }
        Object objUpdatePaymentMethod = c08171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08171.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objUpdatePaymentMethod);
            c08171.L$0 = this;
            paymentMethod2 = paymentMethod;
            c08171.L$1 = paymentMethod2;
            cardUpdateParams2 = cardUpdateParams;
            c08171.L$2 = cardUpdateParams2;
            c08171.label = 1;
            objAwaitPaymentMethodDataSource = awaitPaymentMethodDataSource(c08171);
            if (objAwaitPaymentMethodDataSource != coroutine_suspended) {
                customerSheetViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cardUpdateParams3 = (CardUpdateParams) c08171.L$1;
            customerSheetViewModel2 = (CustomerSheetViewModel) c08171.L$0;
            ResultKt.throwOnFailure(objUpdatePaymentMethod);
            customerSheetDataResult = (CustomerSheetDataResult) objUpdatePaymentMethod;
            if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
                customerSheetViewModel2.updatePaymentMethodInState((PaymentMethod) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue());
                customerSheetViewModel2.eventReporter.onUpdatePaymentMethodSucceeded(cardUpdateParams3.getCardBrand());
            }
            failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
            if (failureFailureOrNull != null) {
                if (failureFailureOrNull.getDisplayMessage() == null) {
                    Throwable cause = failureFailureOrNull.getCause();
                    StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                    if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                        stripeError.getMessage();
                    }
                }
                customerSheetViewModel2.eventReporter.onUpdatePaymentMethodFailed(cardUpdateParams3.getCardBrand(), failureFailureOrNull.getCause());
            }
            return customerSheetDataResult;
        }
        cardUpdateParams2 = (CardUpdateParams) c08171.L$2;
        PaymentMethod paymentMethod3 = (PaymentMethod) c08171.L$1;
        customerSheetViewModel = (CustomerSheetViewModel) c08171.L$0;
        ResultKt.throwOnFailure(objUpdatePaymentMethod);
        objAwaitPaymentMethodDataSource = objUpdatePaymentMethod;
        paymentMethod2 = paymentMethod3;
        CustomerSheetPaymentMethodDataSource customerSheetPaymentMethodDataSource = (CustomerSheetPaymentMethodDataSource) objAwaitPaymentMethodDataSource;
        String str = paymentMethod2.id;
        Intrinsics.checkNotNull(str);
        PaymentMethodUpdateParams.Companion companion = PaymentMethodUpdateParams.INSTANCE;
        CardBrand cardBrand = cardUpdateParams2.getCardBrand();
        PaymentMethodUpdateParams paymentMethodUpdateParamsCreateCard$default = PaymentMethodUpdateParams.Companion.createCard$default(companion, cardUpdateParams2.getExpiryMonth(), cardUpdateParams2.getExpiryYear(), cardBrand != null ? new PaymentMethodUpdateParams.Card.Networks(cardBrand.getCode()) : null, cardUpdateParams2.getBillingDetails(), null, SetsKt.setOf("CustomerSheet"), 16, null);
        c08171.L$0 = customerSheetViewModel;
        c08171.L$1 = cardUpdateParams2;
        c08171.L$2 = null;
        c08171.label = 2;
        objUpdatePaymentMethod = customerSheetPaymentMethodDataSource.updatePaymentMethod(str, paymentMethodUpdateParamsCreateCard$default, c08171);
        if (objUpdatePaymentMethod != coroutine_suspended) {
            cardUpdateParams3 = cardUpdateParams2;
            customerSheetViewModel2 = customerSheetViewModel;
            customerSheetDataResult = (CustomerSheetDataResult) objUpdatePaymentMethod;
            if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            }
            failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
            if (failureFailureOrNull != null) {
            }
            return customerSheetDataResult;
        }
        return coroutine_suspended;
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$handlePaymentMethodRemovedFromEditScreen$1", f = "CustomerSheetViewModel.kt", i = {}, l = {551, 552}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$handlePaymentMethodRemovedFromEditScreen$1, reason: invalid class name and case insensitive filesystem */
    static final class C08121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentMethod $paymentMethod;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08121(PaymentMethod paymentMethod, Continuation<? super C08121> continuation) {
            super(2, continuation);
            this.$paymentMethod = paymentMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08121(this.$paymentMethod, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (r5.this$0.removePaymentMethodFromState(r5.$paymentMethod, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(600L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePaymentMethodRemovedFromEditScreen(PaymentMethod paymentMethod) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C08121(paymentMethod, null), 2, null);
    }

    private final void onModifyItem(DisplayableSavedPaymentMethod paymentMethod) {
        CustomerState value = this.customerState.getValue();
        boolean zBooleanValue = this.isLiveModeProvider.invoke().booleanValue();
        boolean canRemove = value.getCanRemove();
        boolean canUpdateFullPaymentMethodDetails = value.getCanUpdateFullPaymentMethodDetails();
        PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode address = this.configuration.getBillingDetailsCollectionConfiguration().getAddress();
        transition$default(this, new CustomerSheetViewState.UpdatePaymentMethod(new DefaultUpdatePaymentMethodInteractor(zBooleanValue, canRemove, paymentMethod, new PaymentSheetCardBrandFilter(value.getConfiguration().getCardBrandAcceptance()), address, canUpdateFullPaymentMethodDetails, false, false, new C08181(this), new C08192(this), new C08203(null), new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.onModifyItem$lambda$19(this.f$0, (CardBrand) obj);
            }
        }, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomerSheetViewModel.onModifyItem$lambda$20(this.f$0);
            }
        }, null, 8192, null), this.isLiveModeProvider.invoke().booleanValue()), false, 2, null);
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$onModifyItem$1, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C08181 extends FunctionReferenceImpl implements Function2<PaymentMethod, Continuation<? super Throwable>, Object>, SuspendFunction {
        C08181(Object obj) {
            super(2, obj, CustomerSheetViewModel.class, "removeExecutor", "removeExecutor(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
            return ((CustomerSheetViewModel) this.receiver).removeExecutor(paymentMethod, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onModifyItem$lambda$19(CustomerSheetViewModel customerSheetViewModel, CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        customerSheetViewModel.eventReporter.onBrandChoiceSelected(CustomerSheetEventReporter.CardBrandChoiceEventSource.Edit, brand);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onModifyItem$lambda$20(CustomerSheetViewModel customerSheetViewModel) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(customerSheetViewModel), null, null, new CustomerSheetViewModel$onModifyItem$5$1(customerSheetViewModel, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$onModifyItem$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C08192 extends FunctionReferenceImpl implements Function3<PaymentMethod, CardUpdateParams, Continuation<? super Result<? extends PaymentMethod>>, Object>, SuspendFunction {
        C08192(Object obj) {
            super(3, obj, CustomerSheetViewModel.class, "updatePaymentMethodExecutor", "updatePaymentMethodExecutor-0E7RQCE(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: invoke-0E7RQCE, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Object invoke(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<PaymentMethod>> continuation) {
            Object objM7260updatePaymentMethodExecutor0E7RQCE = ((CustomerSheetViewModel) this.receiver).m7260updatePaymentMethodExecutor0E7RQCE(paymentMethod, cardUpdateParams, continuation);
            return objM7260updatePaymentMethodExecutor0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM7260updatePaymentMethodExecutor0E7RQCE : Result.m9117boximpl(objM7260updatePaymentMethodExecutor0E7RQCE);
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "it", "Lcom/stripe/android/model/PaymentMethod;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$onModifyItem$3", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$onModifyItem$3, reason: invalid class name and case insensitive filesystem */
    static final class C08203 extends SuspendLambda implements Function2<PaymentMethod, Continuation<? super Result<? extends Unit>>, Object> {
        int label;

        C08203(Continuation<? super C08203> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C08203(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PaymentMethod paymentMethod, Continuation<? super Result<Unit>> continuation) {
            return ((C08203) create(paymentMethod, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PaymentMethod paymentMethod, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(paymentMethod, (Continuation<? super Result<Unit>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Result.Companion companion = Result.INSTANCE;
            return Result.m9117boximpl(Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("Unexpected attempt to update default from CustomerSheet."))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeExecutor(PaymentMethod paymentMethod, Continuation<? super Throwable> continuation) {
        C08221 c08221;
        CustomerSheetViewModel customerSheetViewModel;
        if (continuation instanceof C08221) {
            c08221 = (C08221) continuation;
            if ((c08221.label & Integer.MIN_VALUE) != 0) {
                c08221.label -= Integer.MIN_VALUE;
            } else {
                c08221 = new C08221(continuation);
            }
        }
        Object objRemovePaymentMethod = c08221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08221.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objRemovePaymentMethod);
            c08221.L$0 = this;
            c08221.L$1 = paymentMethod;
            c08221.label = 1;
            objRemovePaymentMethod = removePaymentMethod(paymentMethod, c08221);
            if (objRemovePaymentMethod == coroutine_suspended) {
                return coroutine_suspended;
            }
            customerSheetViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethod = (PaymentMethod) c08221.L$1;
            customerSheetViewModel = (CustomerSheetViewModel) c08221.L$0;
            ResultKt.throwOnFailure(objRemovePaymentMethod);
        }
        CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) objRemovePaymentMethod;
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(customerSheetViewModel), null, null, new CustomerSheetViewModel$removeExecutor$2$1(customerSheetViewModel, paymentMethod, null), 3, null);
        }
        CustomerSheetDataResult.Failure failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
        if (failureFailureOrNull != null) {
            return failureFailureOrNull.getCause();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: updatePaymentMethodExecutor-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7260updatePaymentMethodExecutor0E7RQCE(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        CustomerSheetViewModel$updatePaymentMethodExecutor$1 customerSheetViewModel$updatePaymentMethodExecutor$1;
        if (continuation instanceof CustomerSheetViewModel$updatePaymentMethodExecutor$1) {
            customerSheetViewModel$updatePaymentMethodExecutor$1 = (CustomerSheetViewModel$updatePaymentMethodExecutor$1) continuation;
            if ((customerSheetViewModel$updatePaymentMethodExecutor$1.label & Integer.MIN_VALUE) != 0) {
                customerSheetViewModel$updatePaymentMethodExecutor$1.label -= Integer.MIN_VALUE;
            } else {
                customerSheetViewModel$updatePaymentMethodExecutor$1 = new CustomerSheetViewModel$updatePaymentMethodExecutor$1(this, continuation);
            }
        }
        Object objModifyCardPaymentMethod = customerSheetViewModel$updatePaymentMethodExecutor$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerSheetViewModel$updatePaymentMethodExecutor$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objModifyCardPaymentMethod);
            customerSheetViewModel$updatePaymentMethodExecutor$1.label = 1;
            objModifyCardPaymentMethod = modifyCardPaymentMethod(paymentMethod, cardUpdateParams, customerSheetViewModel$updatePaymentMethodExecutor$1);
            if (objModifyCardPaymentMethod == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objModifyCardPaymentMethod);
        }
        CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) objModifyCardPaymentMethod;
        if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(((CustomerSheetDataResult.Success) customerSheetDataResult).getValue());
        }
        if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(((CustomerSheetDataResult.Failure) customerSheetDataResult).getCause()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removePaymentMethodFromState(PaymentMethod paymentMethod, Continuation<? super Unit> continuation) {
        CustomerState value = this.customerState.getValue();
        List<PaymentMethod> paymentMethods = value.getPaymentMethods();
        ArrayList arrayList = new ArrayList();
        for (Object obj : paymentMethods) {
            String str = ((PaymentMethod) obj).id;
            String str2 = paymentMethod.id;
            Intrinsics.checkNotNull(str2);
            if (!Intrinsics.areEqual(str, str2)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        PaymentSelection currentSelection = value.getCurrentSelection();
        PaymentSelection paymentSelection = this.originalPaymentSelection;
        boolean z = (currentSelection instanceof PaymentSelection.Saved) && Intrinsics.areEqual(((PaymentSelection.Saved) currentSelection).getPaymentMethod().id, paymentMethod.id);
        if ((paymentSelection instanceof PaymentSelection.Saved) && Intrinsics.areEqual(((PaymentSelection.Saved) paymentSelection).getPaymentMethod().id, paymentMethod.id)) {
            this.originalPaymentSelection = null;
        }
        Object objWithContext = BuildersKt.withContext(ViewModelKt.getViewModelScope(this).getCoroutineContext(), new C08242(value, arrayList2, currentSelection, z, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$removePaymentMethodFromState$2", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$removePaymentMethodFromState$2, reason: invalid class name and case insensitive filesystem */
    static final class C08242 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CustomerState $currentCustomerState;
        final /* synthetic */ PaymentSelection $currentSelection;
        final /* synthetic */ boolean $didRemoveCurrentSelection;
        final /* synthetic */ List<PaymentMethod> $newSavedPaymentMethods;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08242(CustomerState customerState, List<PaymentMethod> list, PaymentSelection paymentSelection, boolean z, Continuation<? super C08242> continuation) {
            super(2, continuation);
            this.$currentCustomerState = customerState;
            this.$newSavedPaymentMethods = list;
            this.$currentSelection = paymentSelection;
            this.$didRemoveCurrentSelection = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08242(this.$currentCustomerState, this.$newSavedPaymentMethods, this.$currentSelection, this.$didRemoveCurrentSelection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = CustomerSheetViewModel.this.customerState;
                CustomerState customerState = this.$currentCustomerState;
                List<PaymentMethod> list = this.$newSavedPaymentMethods;
                PaymentSelection paymentSelection = this.$currentSelection;
                if (this.$didRemoveCurrentSelection) {
                    paymentSelection = null;
                }
                if (paymentSelection == null) {
                    paymentSelection = CustomerSheetViewModel.this.originalPaymentSelection;
                }
                mutableStateFlow.setValue(CustomerState.copy$default(customerState, list, paymentSelection, null, null, null, 28, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$updatePaymentMethodInState$1", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$updatePaymentMethodInState$1, reason: invalid class name and case insensitive filesystem */
    static final class C08271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentMethod $updatedMethod;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08271(PaymentMethod paymentMethod, Continuation<? super C08271> continuation) {
            super(2, continuation);
            this.$updatedMethod = paymentMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08271(this.$updatedMethod, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CustomerState customerState = (CustomerState) CustomerSheetViewModel.this.customerState.getValue();
                List<PaymentMethod> paymentMethods = customerState.getPaymentMethods();
                PaymentMethod paymentMethod = this.$updatedMethod;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paymentMethods, 10));
                for (PaymentMethod paymentMethod2 : paymentMethods) {
                    String str = paymentMethod2.id;
                    String str2 = paymentMethod.id;
                    if (str2 != null && str != null && Intrinsics.areEqual(str2, str)) {
                        paymentMethod2 = paymentMethod;
                    }
                    arrayList.add(paymentMethod2);
                }
                final ArrayList arrayList2 = arrayList;
                PaymentSelection.Saved savedCopy$default = CustomerSheetViewModel.this.originalPaymentSelection;
                final PaymentSelection.Saved currentSelection = customerState.getCurrentSelection();
                CustomerSheetViewModel customerSheetViewModel = CustomerSheetViewModel.this;
                if (savedCopy$default instanceof PaymentSelection.Saved) {
                    PaymentSelection.Saved saved = (PaymentSelection.Saved) savedCopy$default;
                    if (Intrinsics.areEqual(saved.getPaymentMethod().id, this.$updatedMethod.id)) {
                        savedCopy$default = PaymentSelection.Saved.copy$default(saved, this.$updatedMethod, null, null, 6, null);
                    }
                }
                customerSheetViewModel.originalPaymentSelection = savedCopy$default;
                if (currentSelection instanceof PaymentSelection.Saved) {
                    PaymentSelection.Saved saved2 = (PaymentSelection.Saved) currentSelection;
                    if (Intrinsics.areEqual(saved2.getPaymentMethod().id, this.$updatedMethod.id)) {
                        currentSelection = PaymentSelection.Saved.copy$default(saved2, this.$updatedMethod, null, null, 6, null);
                    }
                }
                CustomerSheetViewModel.this.setCustomerState(new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$updatePaymentMethodInState$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CustomerSheetViewModel.C08271.invokeSuspend$lambda$1(arrayList2, currentSelection, (CustomerSheetViewModel.CustomerState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CustomerState invokeSuspend$lambda$1(List list, PaymentSelection paymentSelection, CustomerState customerState) {
            return CustomerState.copy$default(customerState, list, paymentSelection, null, null, null, 28, null);
        }
    }

    private final void updatePaymentMethodInState(PaymentMethod updatedMethod) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08271(updatedMethod, null), 3, null);
    }

    private final void onItemSelected(final PaymentSelection paymentSelection) {
        if ((paymentSelection instanceof PaymentSelection.GooglePay) || (paymentSelection instanceof PaymentSelection.Saved)) {
            if (this.isEditing.getValue().booleanValue()) {
                return;
            }
            setCustomerState(new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CustomerSheetViewModel.onItemSelected$lambda$23(paymentSelection, (CustomerSheetViewModel.CustomerState) obj);
                }
            });
            return;
        }
        throw new IllegalStateException(("Unsupported payment selection " + paymentSelection).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CustomerState onItemSelected$lambda$23(PaymentSelection paymentSelection, CustomerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return CustomerState.copy$default(state, null, paymentSelection, null, null, null, 29, null);
    }

    private final void onPrimaryButtonPressed() {
        Object value;
        ArrayList arrayList;
        PaymentMethodCreateParams paymentMethodCreateParamsTransformToPaymentMethodCreateParams;
        CustomerSheetViewState value2 = this.viewState.getValue();
        if (value2 instanceof CustomerSheetViewState.AddPaymentMethod) {
            CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) value2;
            if (addPaymentMethod.getCustomPrimaryButtonUiState() == null) {
                MutableStateFlow mutableStateFlow = this.backStack;
                do {
                    value = mutableStateFlow.getValue();
                    List<CustomerSheetViewState> list = (List) value;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                        if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                            addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default((CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default, null, null, null, null, null, null, null, false, false, true, null, false, null, false, null, null, false, false, null, null, 1039743, null);
                        }
                        arrayList.add(addPaymentMethodCopy$default);
                    }
                } while (!mutableStateFlow.compareAndSet(value, arrayList));
                if (Intrinsics.areEqual(addPaymentMethod.getPaymentMethodCode(), PaymentMethod.Type.USBankAccount.code)) {
                    PaymentSelection.New.USBankAccount bankAccountSelection = addPaymentMethod.getBankAccountSelection();
                    if (bankAccountSelection == null || (paymentMethodCreateParamsTransformToPaymentMethodCreateParams = bankAccountSelection.getPaymentMethodCreateParams()) == null) {
                        throw new IllegalStateException("Invalid bankAccountSelection".toString());
                    }
                } else {
                    FormFieldValues formFieldValues = addPaymentMethod.getFormFieldValues();
                    if (formFieldValues == null) {
                        throw new IllegalStateException("completeFormValues cannot be null".toString());
                    }
                    String paymentMethodCode = addPaymentMethod.getPaymentMethodCode();
                    PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
                    if (metadata != null) {
                        paymentMethodCreateParamsTransformToPaymentMethodCreateParams = AddPaymentMethodKt.transformToPaymentMethodCreateParams(formFieldValues, paymentMethodCode, metadata);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                createAndAttach(paymentMethodCreateParamsTransformToPaymentMethodCreateParams);
                return;
            }
            addPaymentMethod.getCustomPrimaryButtonUiState().getOnClick().invoke();
            return;
        }
        if (!(value2 instanceof CustomerSheetViewState.SelectPaymentMethod)) {
            throw new IllegalStateException((this.viewState.getValue() + " is not supported").toString());
        }
        setSelectionConfirmationState(new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.onPrimaryButtonPressed$lambda$25((CustomerSheetViewModel.SelectionConfirmationState) obj);
            }
        });
        PaymentSelection paymentSelection = ((CustomerSheetViewState.SelectPaymentMethod) value2).getPaymentSelection();
        if (paymentSelection instanceof PaymentSelection.GooglePay) {
            selectGooglePay();
        } else {
            if (!(paymentSelection instanceof PaymentSelection.Saved)) {
                if (paymentSelection == null) {
                    selectSavedPaymentMethod(null);
                    return;
                }
                throw new IllegalStateException((paymentSelection + " is not supported").toString());
            }
            selectSavedPaymentMethod((PaymentSelection.Saved) paymentSelection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionConfirmationState onPrimaryButtonPressed$lambda$25(SelectionConfirmationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SelectionConfirmationState.copy$default(state, true, null, 2, null);
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$createAndAttach$1", f = "CustomerSheetViewModel.kt", i = {}, l = {756}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$createAndAttach$1, reason: invalid class name and case insensitive filesystem */
    static final class C08111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08111(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super C08111> continuation) {
            super(2, continuation);
            this.$paymentMethodCreateParams = paymentMethodCreateParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08111(this.$paymentMethodCreateParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            ArrayList arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                Object objM7259createPaymentMethodgIAlus = CustomerSheetViewModel.this.m7259createPaymentMethodgIAlus(this.$paymentMethodCreateParams, this);
                if (objM7259createPaymentMethodgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objM7259createPaymentMethodgIAlus;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
            }
            CustomerSheetViewModel customerSheetViewModel = CustomerSheetViewModel.this;
            if (Result.m9125isSuccessimpl(value)) {
                PaymentMethod paymentMethod = (PaymentMethod) value;
                if (!PaymentMethodKtxKt.isUnverifiedUSBankAccount(paymentMethod)) {
                    customerSheetViewModel.attachPaymentMethodToCustomer(paymentMethod);
                } else {
                    Boxing.boxBoolean(customerSheetViewModel._result.tryEmit(new InternalCustomerSheetResult.Selected(new PaymentSelection.Saved(paymentMethod, null, null, 6, null))));
                }
            }
            CustomerSheetViewModel customerSheetViewModel2 = CustomerSheetViewModel.this;
            PaymentMethodCreateParams paymentMethodCreateParams = this.$paymentMethodCreateParams;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
            if (thM9121exceptionOrNullimpl != null) {
                customerSheetViewModel2.logger.error("Failed to create payment method for " + paymentMethodCreateParams.getTypeCode(), thM9121exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = customerSheetViewModel2.backStack;
                do {
                    value2 = mutableStateFlow.getValue();
                    List<CustomerSheetViewState> list = (List) value2;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                        if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                            CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                            addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl), false, null, addPaymentMethod.getFormFieldValues() != null, null, null, false, false, null, null, 1038847, null);
                        }
                        arrayList.add(addPaymentMethodCopy$default);
                    }
                } while (!mutableStateFlow.compareAndSet(value2, arrayList));
            }
            return Unit.INSTANCE;
        }
    }

    private final void createAndAttach(PaymentMethodCreateParams paymentMethodCreateParams) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C08111(paymentMethodCreateParams, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transitionToAddPaymentMethod(boolean isFirstPaymentMethod) {
        String code;
        PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
        if (metadata == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        SupportedPaymentMethod supportedPaymentMethod = this.previouslySelectedPaymentMethod;
        if ((supportedPaymentMethod == null || (code = supportedPaymentMethod.getCode()) == null) && (code = (String) CollectionsKt.firstOrNull((List) metadata.supportedPaymentMethodTypes())) == null) {
            code = PaymentMethod.Type.Card.code;
        }
        String str = code;
        FormArguments formArgumentsCreate = FormArgumentsFactory.INSTANCE.create(str, metadata);
        SupportedPaymentMethod supportedPaymentMethodSupportedPaymentMethodForCode = this.previouslySelectedPaymentMethod;
        if (supportedPaymentMethodSupportedPaymentMethodForCode == null && (supportedPaymentMethodSupportedPaymentMethodForCode = metadata.supportedPaymentMethodForCode(str)) == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        StripeIntent stripeIntent = metadata.getStripeIntent();
        List<FormElement> listFormElementsForCode = metadata.formElementsForCode(supportedPaymentMethodSupportedPaymentMethodForCode.getCode(), new UiDefinitionFactory.Arguments.Factory.Default(this.cardAccountRangeRepositoryFactory, null, null, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.transitionToAddPaymentMethod$lambda$26((InlineSignupViewState) obj);
            }
        }, null, null, null, null, false, null, 496, null));
        if (listFormElementsForCode == null) {
            listFormElementsForCode = CollectionsKt.emptyList();
        }
        transition(new CustomerSheetViewState.AddPaymentMethod(str, this.supportedPaymentMethods, null, listFormElementsForCode, formArgumentsCreate, createDefaultUsBankArguments(stripeIntent), null, true, this.isLiveModeProvider.invoke().booleanValue(), false, null, isFirstPaymentMethod, ResolvableStringUtilsKt.getResolvableString(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_save), false, null, null, false, false, null, this.errorReporter, 230400, null), isFirstPaymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transitionToAddPaymentMethod$lambda$26(InlineSignupViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("`CustomerSheet` does not implement `Link` and should not receive `InlineSignUpViewState` updates");
    }

    private final USBankAccountFormArguments createDefaultUsBankArguments(StripeIntent stripeIntent) {
        return new USBankAccountFormArguments(false, null, null, null, false, false, false, stripeIntent != null ? stripeIntent.getId() : null, stripeIntent != null ? stripeIntent.getClientSecret() : null, "customer_sheet", null, null, null, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.createDefaultUsBankArguments$lambda$27((USBankAccountFormViewModel.AnalyticsEvent) obj);
            }
        }, new Function2() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CustomerSheetViewModel.createDefaultUsBankArguments$lambda$28(this.f$0, (ResolvableString) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.createDefaultUsBankArguments$lambda$29(this.f$0, (PaymentSelection.New.USBankAccount) obj);
            }
        }, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.createDefaultUsBankArguments$lambda$30(this.f$0, (Function1) obj);
            }
        }, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.createDefaultUsBankArguments$lambda$31((PrimaryButton.State) obj);
            }
        }, new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.createDefaultUsBankArguments$lambda$32(this.f$0, (ResolvableString) obj);
            }
        }, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, false, GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, null, null, 2, null), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDefaultUsBankArguments$lambda$28(CustomerSheetViewModel customerSheetViewModel, ResolvableString resolvableString, boolean z) {
        customerSheetViewModel.handleViewAction(new CustomerSheetViewAction.OnUpdateMandateText(resolvableString, z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDefaultUsBankArguments$lambda$29(CustomerSheetViewModel customerSheetViewModel, PaymentSelection.New.USBankAccount uSBankAccount) {
        customerSheetViewModel.handleViewAction(new CustomerSheetViewAction.OnBankAccountSelectionChanged(uSBankAccount));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDefaultUsBankArguments$lambda$30(CustomerSheetViewModel customerSheetViewModel, Function1 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        customerSheetViewModel.handleViewAction(new CustomerSheetViewAction.OnUpdateCustomButtonUIState(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDefaultUsBankArguments$lambda$31(PrimaryButton.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDefaultUsBankArguments$lambda$32(CustomerSheetViewModel customerSheetViewModel, ResolvableString resolvableString) {
        customerSheetViewModel.handleViewAction(new CustomerSheetViewAction.OnFormError(resolvableString));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDefaultUsBankArguments$lambda$27(USBankAccountFormViewModel.AnalyticsEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void onCardNumberInputCompleted() {
        this.eventReporter.onCardNumberCompleted();
    }

    private final void onAnalyticsEvent(AnalyticsEvent event) {
        this.eventReporter.onAnalyticsEvent(event);
    }

    private final void onDisallowedCardBrandEntered(CardBrand brand) {
        this.eventReporter.onDisallowedCardBrandEntered(brand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCustomerState(Function1<? super CustomerState, CustomerState> update) {
        MutableStateFlow<CustomerState> mutableStateFlow = this.customerState;
        mutableStateFlow.setValue(update.invoke(mutableStateFlow.getValue()));
    }

    private final void setSelectionConfirmationState(Function1<? super SelectionConfirmationState, SelectionConfirmationState> update) {
        MutableStateFlow<SelectionConfirmationState> mutableStateFlow = this.selectionConfirmationState;
        mutableStateFlow.setValue(update.invoke(mutableStateFlow.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: createPaymentMethod-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7259createPaymentMethodgIAlus(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        CustomerSheetViewModel$createPaymentMethod$1 customerSheetViewModel$createPaymentMethod$1;
        if (continuation instanceof CustomerSheetViewModel$createPaymentMethod$1) {
            customerSheetViewModel$createPaymentMethod$1 = (CustomerSheetViewModel$createPaymentMethod$1) continuation;
            if ((customerSheetViewModel$createPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                customerSheetViewModel$createPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                customerSheetViewModel$createPaymentMethod$1 = new CustomerSheetViewModel$createPaymentMethod$1(this, continuation);
            }
        }
        Object obj = customerSheetViewModel$createPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerSheetViewModel$createPaymentMethod$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options options = new ApiRequest.Options(this.paymentConfigurationProvider.get().getPublishableKey(), this.paymentConfigurationProvider.get().getStripeAccountId(), null, 4, null);
        customerSheetViewModel$createPaymentMethod$1.label = 1;
        Object objMo8025createPaymentMethod0E7RQCE = stripeRepository.mo8025createPaymentMethod0E7RQCE(paymentMethodCreateParams, options, customerSheetViewModel$createPaymentMethod$1);
        return objMo8025createPaymentMethod0E7RQCE == coroutine_suspended ? coroutine_suspended : objMo8025createPaymentMethod0E7RQCE;
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$attachPaymentMethodToCustomer$1", f = "CustomerSheetViewModel.kt", i = {}, l = {973, 974, 976}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$attachPaymentMethodToCustomer$1, reason: invalid class name and case insensitive filesystem */
    static final class C08091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentMethod $paymentMethod;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08091(PaymentMethod paymentMethod, Continuation<? super C08091> continuation) {
            super(2, continuation);
            this.$paymentMethod = paymentMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08091(this.$paymentMethod, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        
            if (r5.this$0.attachWithSetupIntent(r5.$paymentMethod, r5) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r6.attachPaymentMethod(r1, r5) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = CustomerSheetViewModel.this.awaitIntentDataSource(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (((CustomerSheetIntentDataSource) obj).getCanCreateSetupIntents()) {
                this.label = 2;
            } else {
                CustomerSheetViewModel customerSheetViewModel = CustomerSheetViewModel.this;
                String str = this.$paymentMethod.id;
                Intrinsics.checkNotNull(str);
                this.label = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachPaymentMethodToCustomer(PaymentMethod paymentMethod) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C08091(paymentMethod, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01db, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r5, r6, r7) == r2) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attachWithSetupIntent(PaymentMethod paymentMethod, Continuation<? super Unit> continuation) {
        C08101 c08101;
        Object objM9118constructorimpl;
        CustomerSheetViewModel customerSheetViewModel;
        PaymentMethod paymentMethod2;
        CustomerSheetDataResult.Failure failure;
        CustomerSheetDataResult.Failure failureFailureOrNull;
        StripeError stripeError;
        CustomerSheetViewModel customerSheetViewModel2;
        PaymentMethod paymentMethod3;
        Throwable thM9121exceptionOrNullimpl;
        PaymentMethod paymentMethod4;
        Object objAwaitIntentDataSource;
        CustomerSheetViewModel customerSheetViewModel3;
        CustomerSheetDataResult customerSheetDataResult;
        CustomerSheetDataResult.Companion companion;
        Object objM8069retrieveSetupIntentBWLJW6A$default;
        String str;
        PaymentMethod paymentMethod5;
        CustomerSheetViewModel customerSheetViewModel4;
        CustomerSheetDataResult.Companion companion2;
        if (continuation instanceof C08101) {
            c08101 = (C08101) continuation;
            if ((c08101.label & Integer.MIN_VALUE) != 0) {
                c08101.label -= Integer.MIN_VALUE;
            } else {
                c08101 = new C08101(continuation);
            }
        }
        C08101 c081012 = c08101;
        Object obj = c081012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c081012.label;
        ?? r4 = 3;
        ?? r5 = 2;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c081012.L$0 = this;
            paymentMethod4 = paymentMethod;
            c081012.L$1 = paymentMethod4;
            c081012.label = 1;
            objAwaitIntentDataSource = awaitIntentDataSource(c081012);
            if (objAwaitIntentDataSource != coroutine_suspended) {
                customerSheetViewModel3 = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                PaymentMethod paymentMethod6 = (PaymentMethod) c081012.L$1;
                CustomerSheetViewModel customerSheetViewModel5 = (CustomerSheetViewModel) c081012.L$0;
                ResultKt.throwOnFailure(obj);
                paymentMethod2 = paymentMethod6;
                customerSheetViewModel = customerSheetViewModel5;
                customerSheetDataResult = (CustomerSheetDataResult) obj;
                if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Success)) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        companion = CustomerSheetDataResult.INSTANCE;
                        String str2 = (String) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue();
                        StripeRepository stripeRepository = customerSheetViewModel.stripeRepository;
                        ApiRequest.Options options = new ApiRequest.Options(customerSheetViewModel.paymentConfigurationProvider.get().getPublishableKey(), customerSheetViewModel.paymentConfigurationProvider.get().getStripeAccountId(), null, 4, null);
                        c081012.L$0 = customerSheetViewModel;
                        c081012.L$1 = paymentMethod2;
                        c081012.L$2 = companion;
                        c081012.L$3 = str2;
                        c081012.label = 3;
                        objM8069retrieveSetupIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8069retrieveSetupIntentBWLJW6A$default(stripeRepository, str2, options, null, c081012, 4, null);
                        if (objM8069retrieveSetupIntentBWLJW6A$default != coroutine_suspended) {
                            str = str2;
                            paymentMethod5 = paymentMethod2;
                            customerSheetViewModel4 = customerSheetViewModel;
                            ResultKt.throwOnFailure(objM8069retrieveSetupIntentBWLJW6A$default);
                            c081012.L$0 = customerSheetViewModel4;
                            c081012.L$1 = paymentMethod5;
                            c081012.L$2 = companion;
                            c081012.L$3 = null;
                            c081012.label = 4;
                            if (customerSheetViewModel4.handleStripeIntent((SetupIntent) objM8069retrieveSetupIntentBWLJW6A$default, str, paymentMethod5, c081012) != coroutine_suspended) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = paymentMethod2;
                        r5 = customerSheetViewModel;
                        Result.Companion companion4 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        paymentMethod3 = r4;
                        customerSheetViewModel2 = r5;
                        paymentMethod2 = paymentMethod3;
                        customerSheetViewModel = customerSheetViewModel2;
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                        failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(failure);
                        if (failureFailureOrNull != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomerSheetDataResult.Failure failure2 = (CustomerSheetDataResult.Failure) customerSheetDataResult;
                failure = CustomerSheetDataResult.INSTANCE.failure(failure2.getCause(), failure2.getDisplayMessage());
                failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(failure);
                if (failureFailureOrNull != null) {
                }
                return Unit.INSTANCE;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                companion2 = (CustomerSheetDataResult.Companion) c081012.L$2;
                PaymentMethod paymentMethod7 = (PaymentMethod) c081012.L$1;
                CustomerSheetViewModel customerSheetViewModel6 = (CustomerSheetViewModel) c081012.L$0;
                ResultKt.throwOnFailure(obj);
                r4 = paymentMethod7;
                r5 = customerSheetViewModel6;
                objM9118constructorimpl = Result.m9118constructorimpl(companion2.success(Unit.INSTANCE));
                paymentMethod3 = r4;
                customerSheetViewModel2 = r5;
                paymentMethod2 = paymentMethod3;
                customerSheetViewModel = customerSheetViewModel2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    failure = (CustomerSheetDataResult.Success) objM9118constructorimpl;
                } else {
                    failure = CustomerSheetDataResult.INSTANCE.failure(thM9121exceptionOrNullimpl, null);
                }
                failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(failure);
                if (failureFailureOrNull != null) {
                    String displayMessage = failureFailureOrNull.getDisplayMessage();
                    if (displayMessage == null) {
                        Throwable cause = failureFailureOrNull.getCause();
                        StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                        displayMessage = (stripeException == null || (stripeError = stripeException.getStripeError()) == null) ? null : stripeError.getMessage();
                    }
                    Throwable cause2 = failureFailureOrNull.getCause();
                    customerSheetViewModel.eventReporter.onAttachPaymentMethodFailed(CustomerSheetEventReporter.AddPaymentMethodStyle.SetupIntent);
                    customerSheetViewModel.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod2, cause2);
                    CoroutineContext coroutineContext = ViewModelKt.getViewModelScope(customerSheetViewModel).getCoroutineContext();
                    CustomerSheetViewModel$attachWithSetupIntent$3$1 customerSheetViewModel$attachWithSetupIntent$3$1 = new CustomerSheetViewModel$attachWithSetupIntent$3$1(customerSheetViewModel, displayMessage, cause2, null);
                    c081012.L$0 = failure;
                    c081012.L$1 = null;
                    c081012.L$2 = null;
                    c081012.L$3 = null;
                    c081012.label = 5;
                }
                return Unit.INSTANCE;
            }
            str = (String) c081012.L$3;
            CustomerSheetDataResult.Companion companion5 = (CustomerSheetDataResult.Companion) c081012.L$2;
            PaymentMethod paymentMethod8 = (PaymentMethod) c081012.L$1;
            CustomerSheetViewModel customerSheetViewModel7 = (CustomerSheetViewModel) c081012.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objM8069retrieveSetupIntentBWLJW6A$default = ((Result) obj).getValue();
                companion = companion5;
                paymentMethod5 = paymentMethod8;
                customerSheetViewModel4 = customerSheetViewModel7;
                ResultKt.throwOnFailure(objM8069retrieveSetupIntentBWLJW6A$default);
                c081012.L$0 = customerSheetViewModel4;
                c081012.L$1 = paymentMethod5;
                c081012.L$2 = companion;
                c081012.L$3 = null;
                c081012.label = 4;
            } catch (Throwable th3) {
                th = th3;
                r4 = paymentMethod8;
                r5 = customerSheetViewModel7;
                Result.Companion companion42 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                paymentMethod3 = r4;
                customerSheetViewModel2 = r5;
                paymentMethod2 = paymentMethod3;
                customerSheetViewModel = customerSheetViewModel2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
                failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(failure);
                if (failureFailureOrNull != null) {
                }
                return Unit.INSTANCE;
            }
            if (customerSheetViewModel4.handleStripeIntent((SetupIntent) objM8069retrieveSetupIntentBWLJW6A$default, str, paymentMethod5, c081012) != coroutine_suspended) {
                return coroutine_suspended;
            }
            companion2 = companion;
            r4 = paymentMethod5;
            r5 = customerSheetViewModel4;
            objM9118constructorimpl = Result.m9118constructorimpl(companion2.success(Unit.INSTANCE));
            paymentMethod3 = r4;
            customerSheetViewModel2 = r5;
            paymentMethod2 = paymentMethod3;
            customerSheetViewModel = customerSheetViewModel2;
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
            }
            failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(failure);
            if (failureFailureOrNull != null) {
            }
            return Unit.INSTANCE;
        }
        PaymentMethod paymentMethod9 = (PaymentMethod) c081012.L$1;
        customerSheetViewModel3 = (CustomerSheetViewModel) c081012.L$0;
        ResultKt.throwOnFailure(obj);
        objAwaitIntentDataSource = obj;
        paymentMethod4 = paymentMethod9;
        c081012.L$0 = customerSheetViewModel3;
        c081012.L$1 = paymentMethod4;
        c081012.label = 2;
        Object objRetrieveSetupIntentClientSecret = ((CustomerSheetIntentDataSource) objAwaitIntentDataSource).retrieveSetupIntentClientSecret(c081012);
        if (objRetrieveSetupIntentClientSecret != coroutine_suspended) {
            paymentMethod2 = paymentMethod4;
            obj = objRetrieveSetupIntentClientSecret;
            customerSheetViewModel = customerSheetViewModel3;
            customerSheetDataResult = (CustomerSheetDataResult) obj;
            if (!(customerSheetDataResult instanceof CustomerSheetDataResult.Success)) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        if (r7.refreshAndUpdatePaymentMethods(r4, r2) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010b, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r4, r6, r2) == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleStripeIntent(StripeIntent stripeIntent, String str, PaymentMethod paymentMethod, Continuation<? super Unit> continuation) {
        C08131 c08131;
        CustomerSheetViewModel customerSheetViewModel;
        PaymentMethod paymentMethod2;
        CustomerSheetViewModel customerSheetViewModel2;
        ConfirmationHandler.Result result;
        Object value;
        ArrayList arrayList;
        if (continuation instanceof C08131) {
            c08131 = (C08131) continuation;
            if ((c08131.label & Integer.MIN_VALUE) != 0) {
                c08131.label -= Integer.MIN_VALUE;
            } else {
                c08131 = new C08131(continuation);
            }
        }
        Object objAwaitResult = c08131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08131.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwaitResult);
            ConfirmationHandler confirmationHandler = this.confirmationHandler;
            ConfirmationHandler.Args args = new ConfirmationHandler.Args(stripeIntent, new PaymentMethodConfirmationOption.Saved(paymentMethod, null, false, 4, null), this.configuration.getAppearance(), new PaymentElementLoader.InitializationMode.SetupIntent(str), null);
            c08131.L$0 = this;
            c08131.L$1 = paymentMethod;
            c08131.label = 1;
            if (confirmationHandler.start(args, c08131) != coroutine_suspended) {
                customerSheetViewModel = this;
                paymentMethod2 = paymentMethod;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(objAwaitResult);
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwaitResult);
                return Unit.INSTANCE;
            }
            paymentMethod2 = (PaymentMethod) c08131.L$1;
            customerSheetViewModel2 = (CustomerSheetViewModel) c08131.L$0;
            ResultKt.throwOnFailure(objAwaitResult);
            result = (ConfirmationHandler.Result) objAwaitResult;
            if (!(result instanceof ConfirmationHandler.Result.Succeeded)) {
                customerSheetViewModel2.eventReporter.onAttachPaymentMethodSucceeded(CustomerSheetEventReporter.AddPaymentMethodStyle.SetupIntent);
                c08131.L$0 = null;
                c08131.L$1 = null;
                c08131.label = 3;
            } else if (result instanceof ConfirmationHandler.Result.Failed) {
                customerSheetViewModel2.eventReporter.onAttachPaymentMethodFailed(CustomerSheetEventReporter.AddPaymentMethodStyle.SetupIntent);
                customerSheetViewModel2.logger.error("Failed to attach payment method to SetupIntent: " + paymentMethod2, ((ConfirmationHandler.Result.Failed) result).getCause());
                CoroutineContext coroutineContext = ViewModelKt.getViewModelScope(customerSheetViewModel2).getCoroutineContext();
                C08142 c08142 = customerSheetViewModel2.new C08142(result, null);
                c08131.L$0 = null;
                c08131.L$1 = null;
                c08131.label = 4;
            } else {
                if ((result instanceof ConfirmationHandler.Result.Canceled) || result == null) {
                    MutableStateFlow mutableStateFlow = customerSheetViewModel2.backStack;
                    do {
                        value = mutableStateFlow.getValue();
                        List<CustomerSheetViewState> list = (List) value;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                            if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                                CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                                addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod, null, null, null, null, null, null, null, true, false, false, null, false, null, addPaymentMethod.getFormFieldValues() != null, null, null, false, false, null, null, 1039743, null);
                            }
                            arrayList.add(addPaymentMethodCopy$default);
                        }
                    } while (!mutableStateFlow.compareAndSet(value, arrayList));
                    return Unit.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return coroutine_suspended;
        }
        paymentMethod2 = (PaymentMethod) c08131.L$1;
        customerSheetViewModel = (CustomerSheetViewModel) c08131.L$0;
        ResultKt.throwOnFailure(objAwaitResult);
        ConfirmationHandler confirmationHandler2 = customerSheetViewModel.confirmationHandler;
        c08131.L$0 = customerSheetViewModel;
        c08131.L$1 = paymentMethod2;
        c08131.label = 2;
        objAwaitResult = confirmationHandler2.awaitResult(c08131);
        if (objAwaitResult != coroutine_suspended) {
            customerSheetViewModel2 = customerSheetViewModel;
            result = (ConfirmationHandler.Result) objAwaitResult;
            if (!(result instanceof ConfirmationHandler.Result.Succeeded)) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$handleStripeIntent$2", f = "CustomerSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$handleStripeIntent$2, reason: invalid class name and case insensitive filesystem */
    static final class C08142 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConfirmationHandler.Result $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08142(ConfirmationHandler.Result result, Continuation<? super C08142> continuation) {
            super(2, continuation);
            this.$result = result;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08142(this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08142) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            ArrayList arrayList;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CustomerSheetViewModel customerSheetViewModel = CustomerSheetViewModel.this;
            ConfirmationHandler.Result result = this.$result;
            MutableStateFlow mutableStateFlow = customerSheetViewModel.backStack;
            do {
                value = mutableStateFlow.getValue();
                List<CustomerSheetViewState> list = (List) value;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                    if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                        CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                        addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, ((ConfirmationHandler.Result.Failed) result).getMessage(), false, null, addPaymentMethod.getFormFieldValues() != null, null, null, false, false, null, null, 1038847, null);
                    }
                    arrayList.add(addPaymentMethodCopy$default);
                }
            } while (!mutableStateFlow.compareAndSet(value, arrayList));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attachPaymentMethod(String str, Continuation<? super Unit> continuation) {
        C08081 c08081;
        String str2;
        Object objAwaitPaymentMethodDataSource;
        CustomerSheetViewModel customerSheetViewModel;
        String str3;
        CustomerSheetViewModel customerSheetViewModel2;
        CustomerSheetDataResult customerSheetDataResult;
        CustomerSheetDataResult customerSheetDataResult2;
        CustomerSheetViewModel customerSheetViewModel3;
        CustomerSheetDataResult.Failure failureFailureOrNull;
        Object value;
        ArrayList arrayList;
        StripeError stripeError;
        if (continuation instanceof C08081) {
            c08081 = (C08081) continuation;
            if ((c08081.label & Integer.MIN_VALUE) != 0) {
                c08081.label -= Integer.MIN_VALUE;
            } else {
                c08081 = new C08081(continuation);
            }
        }
        Object obj = c08081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08081.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c08081.L$0 = this;
            str2 = str;
            c08081.L$1 = str2;
            c08081.label = 1;
            objAwaitPaymentMethodDataSource = awaitPaymentMethodDataSource(c08081);
            if (objAwaitPaymentMethodDataSource != coroutine_suspended) {
                customerSheetViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                str3 = (String) c08081.L$1;
                customerSheetViewModel2 = (CustomerSheetViewModel) c08081.L$0;
                ResultKt.throwOnFailure(obj);
                customerSheetDataResult = (CustomerSheetDataResult) obj;
                if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
                    PaymentMethod paymentMethod = (PaymentMethod) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue();
                    customerSheetViewModel2.eventReporter.onAttachPaymentMethodSucceeded(CustomerSheetEventReporter.AddPaymentMethodStyle.CreateAttach);
                    c08081.L$0 = customerSheetViewModel2;
                    c08081.L$1 = str3;
                    c08081.L$2 = customerSheetDataResult;
                    c08081.label = 3;
                    if (customerSheetViewModel2.refreshAndUpdatePaymentMethods(paymentMethod, c08081) != coroutine_suspended) {
                        customerSheetDataResult2 = customerSheetDataResult;
                        customerSheetViewModel3 = customerSheetViewModel2;
                        customerSheetViewModel2 = customerSheetViewModel3;
                        customerSheetDataResult = customerSheetDataResult2;
                    }
                    return coroutine_suspended;
                }
                failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
                if (failureFailureOrNull != null) {
                }
                return Unit.INSTANCE;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            customerSheetDataResult2 = (CustomerSheetDataResult) c08081.L$2;
            str3 = (String) c08081.L$1;
            customerSheetViewModel3 = (CustomerSheetViewModel) c08081.L$0;
            ResultKt.throwOnFailure(obj);
            customerSheetViewModel2 = customerSheetViewModel3;
            customerSheetDataResult = customerSheetDataResult2;
            failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
            if (failureFailureOrNull != null) {
                String displayMessage = failureFailureOrNull.getDisplayMessage();
                if (displayMessage == null) {
                    Throwable cause = failureFailureOrNull.getCause();
                    StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                    displayMessage = (stripeException == null || (stripeError = stripeException.getStripeError()) == null) ? null : stripeError.getMessage();
                }
                Throwable cause2 = failureFailureOrNull.getCause();
                customerSheetViewModel2.eventReporter.onAttachPaymentMethodFailed(CustomerSheetEventReporter.AddPaymentMethodStyle.CreateAttach);
                customerSheetViewModel2.logger.error("Failed to attach payment method " + str3 + " to customer", cause2);
                MutableStateFlow mutableStateFlow = customerSheetViewModel2.backStack;
                do {
                    value = mutableStateFlow.getValue();
                    List<CustomerSheetViewState> list = (List) value;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                        if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                            CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                            addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, displayMessage != null ? ResolvableStringUtilsKt.getResolvableString(displayMessage) : null, false, null, addPaymentMethod.getFormFieldValues() != null, null, null, false, false, null, null, 1038847, null);
                        }
                        arrayList.add(addPaymentMethodCopy$default);
                    }
                } while (!mutableStateFlow.compareAndSet(value, arrayList));
            }
            return Unit.INSTANCE;
        }
        String str4 = (String) c08081.L$1;
        customerSheetViewModel = (CustomerSheetViewModel) c08081.L$0;
        ResultKt.throwOnFailure(obj);
        objAwaitPaymentMethodDataSource = obj;
        str2 = str4;
        c08081.L$0 = customerSheetViewModel;
        c08081.L$1 = str2;
        c08081.label = 2;
        Object objAttachPaymentMethod = ((CustomerSheetPaymentMethodDataSource) objAwaitPaymentMethodDataSource).attachPaymentMethod(str2, c08081);
        if (objAttachPaymentMethod != coroutine_suspended) {
            str3 = str2;
            obj = objAttachPaymentMethod;
            customerSheetViewModel2 = customerSheetViewModel;
            customerSheetDataResult = (CustomerSheetDataResult) obj;
            if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
            }
            failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
            if (failureFailureOrNull != null) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2", f = "CustomerSheetViewModel.kt", i = {}, l = {1106, 1106}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2, reason: invalid class name and case insensitive filesystem */
    static final class C08212 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<List<? extends PaymentMethod>>>, Object> {
        final /* synthetic */ PaymentMethod $newPaymentMethod;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08212(PaymentMethod paymentMethod, Continuation<? super C08212> continuation) {
            super(2, continuation);
            this.$newPaymentMethod = paymentMethod;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08212(this.$newPaymentMethod, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<List<? extends PaymentMethod>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super CustomerSheetDataResult<List<PaymentMethod>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<List<PaymentMethod>>> continuation) {
            return ((C08212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            StripeError stripeError;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = CustomerSheetViewModel.this.awaitPaymentMethodDataSource(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) obj;
                final CustomerSheetViewModel customerSheetViewModel = CustomerSheetViewModel.this;
                final PaymentMethod paymentMethod = this.$newPaymentMethod;
                if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
                    final List list = (List) ((CustomerSheetDataResult.Success) customerSheetDataResult).getValue();
                    ErrorReporter.DefaultImpls.report$default(customerSheetViewModel.errorReporter, ErrorReporter.SuccessEvent.CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_SUCCESS, null, null, 6, null);
                    customerSheetViewModel.setCustomerState(new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$refreshAndUpdatePaymentMethods$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CustomerSheetViewModel.C08212.invokeSuspend$lambda$5$lambda$4(list, paymentMethod, customerSheetViewModel, (CustomerSheetViewModel.CustomerState) obj2);
                        }
                    });
                    customerSheetViewModel.transition((CustomerSheetViewState) customerSheetViewModel.selectPaymentMethodState.getValue(), true);
                }
                CustomerSheetViewModel customerSheetViewModel2 = CustomerSheetViewModel.this;
                CustomerSheetDataResult.Failure failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
                if (failureFailureOrNull != null) {
                    if (failureFailureOrNull.getDisplayMessage() == null) {
                        Throwable cause = failureFailureOrNull.getCause();
                        StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                        if (stripeException != null && (stripeError = stripeException.getStripeError()) != null) {
                            stripeError.getMessage();
                        }
                    }
                    ErrorReporter.DefaultImpls.report$default(customerSheetViewModel2.errorReporter, ErrorReporter.ExpectedErrorEvent.CUSTOMER_SHEET_PAYMENT_METHODS_REFRESH_FAILURE, StripeException.INSTANCE.create(failureFailureOrNull.getCause()), null, 4, null);
                    customerSheetViewModel2.onDismissed();
                }
                return customerSheetDataResult;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
            obj = ((CustomerSheetPaymentMethodDataSource) obj).retrievePaymentMethods(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CustomerState invokeSuspend$lambda$5$lambda$4(List list, PaymentMethod paymentMethod, CustomerSheetViewModel customerSheetViewModel, CustomerState customerState) {
            Object next;
            PaymentSelection.Saved currentSelection;
            List list2 = list;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(paymentMethod.id, ((PaymentMethod) next).id)) {
                    break;
                }
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) next;
            if (paymentMethod2 != null) {
                currentSelection = new PaymentSelection.Saved(paymentMethod2, null, null, 6, null);
            } else {
                currentSelection = customerState.getCurrentSelection();
            }
            PaymentSelection paymentSelection = currentSelection;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                PaymentMethod.Card card = ((PaymentMethod) obj).card;
                if (card != null ? new PaymentSheetCardBrandFilter(customerSheetViewModel.configuration.getCardBrandAcceptance()).isAccepted(card.brand) : true) {
                    arrayList.add(obj);
                }
            }
            return CustomerState.copy$default(customerState, CustomerSheetUtilsKt.sortPaymentMethods(arrayList, paymentSelection instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) paymentSelection : null), paymentSelection, null, null, null, 28, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object refreshAndUpdatePaymentMethods(PaymentMethod paymentMethod, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(ViewModelKt.getViewModelScope(this).getCoroutineContext(), new C08212(paymentMethod, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final void selectSavedPaymentMethod(PaymentSelection.Saved savedPaymentSelection) {
        CustomerMetadata customerMetadata;
        PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C08261(savedPaymentSelection, (metadata == null || (customerMetadata = metadata.getCustomerMetadata()) == null) ? null : Boolean.valueOf(customerMetadata.isPaymentMethodSetAsDefaultEnabled()), null), 3, null);
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$selectSavedPaymentMethod$1", f = "CustomerSheetViewModel.kt", i = {}, l = {1150}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$selectSavedPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C08261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSelection.Saved $savedPaymentSelection;
        final /* synthetic */ Boolean $syncDefaultEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08261(PaymentSelection.Saved saved, Boolean bool, Continuation<? super C08261> continuation) {
            super(2, continuation);
            this.$savedPaymentSelection = saved;
            this.$syncDefaultEnabled = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08261(this.$savedPaymentSelection, this.$syncDefaultEnabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CustomerSheetViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/data/CustomerSheetDataResult;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$selectSavedPaymentMethod$1$1", f = "CustomerSheetViewModel.kt", i = {}, l = {1151, 1151}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$selectSavedPaymentMethod$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerSheetDataResult<Unit>>, Object> {
            final /* synthetic */ PaymentSelection.Saved $savedPaymentSelection;
            final /* synthetic */ Boolean $syncDefaultEnabled;
            int label;
            final /* synthetic */ CustomerSheetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01481(CustomerSheetViewModel customerSheetViewModel, PaymentSelection.Saved saved, Boolean bool, Continuation<? super C01481> continuation) {
                super(2, continuation);
                this.this$0 = customerSheetViewModel;
                this.$savedPaymentSelection = saved;
                this.$syncDefaultEnabled = bool;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01481(this.this$0, this.$savedPaymentSelection, this.$syncDefaultEnabled, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerSheetDataResult<Unit>> continuation) {
                return ((C01481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    obj = this.this$0.awaitSavedSelectionDataSource(this);
                    if (obj != coroutine_suspended) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                CustomerSheetSavedSelectionDataSource customerSheetSavedSelectionDataSource = (CustomerSheetSavedSelectionDataSource) obj;
                PaymentSelection.Saved saved = this.$savedPaymentSelection;
                SavedSelection savedSelection = saved != null ? SavedSelectionKt.toSavedSelection(saved) : null;
                this.label = 2;
                Object savedSelection2 = customerSheetSavedSelectionDataSource.setSavedSelection(savedSelection, Intrinsics.areEqual(this.$syncDefaultEnabled, Boxing.boxBoolean(true)), this);
                return savedSelection2 == coroutine_suspended ? coroutine_suspended : savedSelection2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            PaymentMethod paymentMethod;
            PaymentMethod.Type type;
            StripeError stripeError;
            PaymentMethod paymentMethod2;
            PaymentMethod.Type type2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            String str2 = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = BuildersKt.withContext(CustomerSheetViewModel.this.workContext, new C01481(CustomerSheetViewModel.this, this.$savedPaymentSelection, this.$syncDefaultEnabled, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) obj;
            CustomerSheetViewModel customerSheetViewModel = CustomerSheetViewModel.this;
            PaymentSelection.Saved saved = this.$savedPaymentSelection;
            Boolean bool = this.$syncDefaultEnabled;
            if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
                customerSheetViewModel.confirmPaymentSelection(saved, (saved == null || (paymentMethod2 = saved.getPaymentMethod()) == null || (type2 = paymentMethod2.type) == null) ? null : type2.code, bool);
            }
            PaymentSelection.Saved saved2 = this.$savedPaymentSelection;
            CustomerSheetViewModel customerSheetViewModel2 = CustomerSheetViewModel.this;
            Boolean bool2 = this.$syncDefaultEnabled;
            CustomerSheetDataResult.Failure failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
            if (failureFailureOrNull != null) {
                String displayMessage = failureFailureOrNull.getDisplayMessage();
                if (displayMessage == null) {
                    Throwable cause = failureFailureOrNull.getCause();
                    StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                    if (stripeException == null || (stripeError = stripeException.getStripeError()) == null) {
                        str = null;
                        Throwable cause2 = failureFailureOrNull.getCause();
                        if (saved2 != null && (paymentMethod = saved2.getPaymentMethod()) != null && (type = paymentMethod.type) != null) {
                            str2 = type.code;
                        }
                        customerSheetViewModel2.confirmPaymentSelectionError(saved2, str2, bool2, cause2, str);
                    } else {
                        displayMessage = stripeError.getMessage();
                        str = displayMessage;
                        Throwable cause22 = failureFailureOrNull.getCause();
                        if (saved2 != null) {
                            str2 = type.code;
                        }
                        customerSheetViewModel2.confirmPaymentSelectionError(saved2, str2, bool2, cause22, str);
                    }
                } else {
                    str = displayMessage;
                    Throwable cause222 = failureFailureOrNull.getCause();
                    if (saved2 != null) {
                    }
                    customerSheetViewModel2.confirmPaymentSelectionError(saved2, str2, bool2, cause222, str);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void selectGooglePay() {
        CustomerMetadata customerMetadata;
        PaymentMethodMetadata metadata = this.customerState.getValue().getMetadata();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.workContext, null, new C08251((metadata == null || (customerMetadata = metadata.getCustomerMetadata()) == null) ? null : Boolean.valueOf(customerMetadata.isPaymentMethodSetAsDefaultEnabled()), null), 2, null);
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$selectGooglePay$1", f = "CustomerSheetViewModel.kt", i = {}, l = {1177, 1177}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.customersheet.CustomerSheetViewModel$selectGooglePay$1, reason: invalid class name and case insensitive filesystem */
    static final class C08251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Boolean $syncDefaultEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08251(Boolean bool, Continuation<? super C08251> continuation) {
            super(2, continuation);
            this.$syncDefaultEnabled = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomerSheetViewModel.this.new C08251(this.$syncDefaultEnabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            StripeError stripeError;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = CustomerSheetViewModel.this.awaitSavedSelectionDataSource(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CustomerSheetDataResult customerSheetDataResult = (CustomerSheetDataResult) obj;
                CustomerSheetViewModel customerSheetViewModel = CustomerSheetViewModel.this;
                Boolean bool = this.$syncDefaultEnabled;
                if (customerSheetDataResult instanceof CustomerSheetDataResult.Success) {
                    customerSheetViewModel.confirmPaymentSelection(PaymentSelection.GooglePay.INSTANCE, "google_pay", bool);
                }
                CustomerSheetViewModel customerSheetViewModel2 = CustomerSheetViewModel.this;
                Boolean bool2 = this.$syncDefaultEnabled;
                CustomerSheetDataResult.Failure failureFailureOrNull = CustomerSheetDataResultKtxKt.failureOrNull(customerSheetDataResult);
                if (failureFailureOrNull != null) {
                    String displayMessage = failureFailureOrNull.getDisplayMessage();
                    if (displayMessage != null) {
                        str = displayMessage;
                        customerSheetViewModel2.confirmPaymentSelectionError(PaymentSelection.GooglePay.INSTANCE, "google_pay", bool2, failureFailureOrNull.getCause(), str);
                    } else {
                        Throwable cause = failureFailureOrNull.getCause();
                        StripeException stripeException = cause instanceof StripeException ? (StripeException) cause : null;
                        if (stripeException == null || (stripeError = stripeException.getStripeError()) == null) {
                            str = null;
                            customerSheetViewModel2.confirmPaymentSelectionError(PaymentSelection.GooglePay.INSTANCE, "google_pay", bool2, failureFailureOrNull.getCause(), str);
                        } else {
                            displayMessage = stripeError.getMessage();
                            str = displayMessage;
                            customerSheetViewModel2.confirmPaymentSelectionError(PaymentSelection.GooglePay.INSTANCE, "google_pay", bool2, failureFailureOrNull.getCause(), str);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
            obj = ((CustomerSheetSavedSelectionDataSource) obj).setSavedSelection(SavedSelection.GooglePay.INSTANCE, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmPaymentSelection(PaymentSelection paymentSelection, String type, Boolean syncDefaultEnabled) {
        if (type != null) {
            this.eventReporter.onConfirmPaymentMethodSucceeded(type, syncDefaultEnabled);
        }
        this._result.tryEmit(new InternalCustomerSheetResult.Selected(paymentSelection));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmPaymentSelectionError(PaymentSelection paymentSelection, String type, Boolean syncDefaultEnabled, Throwable cause, final String displayMessage) {
        if (type != null) {
            this.eventReporter.onConfirmPaymentMethodFailed(type, syncDefaultEnabled);
        }
        this.logger.error("Failed to persist payment selection: " + paymentSelection, cause);
        setSelectionConfirmationState(new Function1() { // from class: com.stripe.android.customersheet.CustomerSheetViewModel$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomerSheetViewModel.confirmPaymentSelectionError$lambda$47(displayMessage, (CustomerSheetViewModel.SelectionConfirmationState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionConfirmationState confirmPaymentSelectionError$lambda$47(String str, SelectionConfirmationState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state.copy(false, str);
    }

    static /* synthetic */ void transition$default(CustomerSheetViewModel customerSheetViewModel, CustomerSheetViewState customerSheetViewState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        customerSheetViewModel.transition(customerSheetViewState, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transition(CustomerSheetViewState to, boolean reset) {
        List<CustomerSheetViewState> value;
        if (to instanceof CustomerSheetViewState.AddPaymentMethod) {
            this.eventReporter.onScreenPresented(CustomerSheetEventReporter.Screen.AddPaymentMethod);
        } else if (to instanceof CustomerSheetViewState.SelectPaymentMethod) {
            this.eventReporter.onScreenPresented(CustomerSheetEventReporter.Screen.SelectPaymentMethod);
        } else if (to instanceof CustomerSheetViewState.UpdatePaymentMethod) {
            this.eventReporter.onScreenPresented(CustomerSheetEventReporter.Screen.EditPaymentMethod);
        }
        MutableStateFlow<List<CustomerSheetViewState>> mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, reset ? CollectionsKt.listOf(to) : CollectionsKt.plus((Collection<? extends CustomerSheetViewState>) value, to)));
    }

    private final /* synthetic */ <T extends CustomerSheetViewState> void updateViewState(Function1<? super T, ? extends T> transform) {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T tInvoke : list) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                if (tInvoke instanceof CustomerSheetViewState) {
                    tInvoke = transform.invoke(tInvoke);
                }
                arrayList.add(tInvoke);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitPaymentMethodDataSource(Continuation<? super CustomerSheetPaymentMethodDataSource> continuation) {
        return this.paymentMethodDataSourceProvider.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitIntentDataSource(Continuation<? super CustomerSheetIntentDataSource> continuation) {
        return this.intentDataSourceProvider.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitSavedSelectionDataSource(Continuation<? super CustomerSheetSavedSelectionDataSource> continuation) {
        return this.savedSelectionDataSourceProvider.await(continuation);
    }

    private final CustomerSheetEventReporter.Screen getEventReporterScreen(CustomerSheetViewState customerSheetViewState) {
        if (customerSheetViewState instanceof CustomerSheetViewState.AddPaymentMethod) {
            return CustomerSheetEventReporter.Screen.AddPaymentMethod;
        }
        if (customerSheetViewState instanceof CustomerSheetViewState.SelectPaymentMethod) {
            return CustomerSheetEventReporter.Screen.SelectPaymentMethod;
        }
        if (customerSheetViewState instanceof CustomerSheetViewState.UpdatePaymentMethod) {
            return CustomerSheetEventReporter.Screen.EditPaymentMethod;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003JE\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010%\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001c¨\u00063"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewModel$CustomerState;", "", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "currentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "permissions", "Lcom/stripe/android/customersheet/CustomerPermissions;", "configuration", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;Lcom/stripe/android/customersheet/CustomerPermissions;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)V", "getPaymentMethods", "()Ljava/util/List;", "getCurrentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "getPermissions", "()Lcom/stripe/android/customersheet/CustomerPermissions;", "getConfiguration", "()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "canRemove", "", "getCanRemove", "()Z", "canUpdateFullPaymentMethodDetails", "getCanUpdateFullPaymentMethodDetails", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "getCbcEligibility", "()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "canEdit", "getCanEdit", "canShowSavedPaymentMethods", "getCanShowSavedPaymentMethods", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class CustomerState {
        private final boolean canEdit;
        private final boolean canRemove;
        private final boolean canShowSavedPaymentMethods;
        private final boolean canUpdateFullPaymentMethodDetails;
        private final CardBrandChoiceEligibility cbcEligibility;
        private final CustomerSheet.Configuration configuration;
        private final PaymentSelection currentSelection;
        private final PaymentMethodMetadata metadata;
        private final List<PaymentMethod> paymentMethods;
        private final CustomerPermissions permissions;

        public static /* synthetic */ CustomerState copy$default(CustomerState customerState, List list, PaymentSelection paymentSelection, PaymentMethodMetadata paymentMethodMetadata, CustomerPermissions customerPermissions, CustomerSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                list = customerState.paymentMethods;
            }
            if ((i & 2) != 0) {
                paymentSelection = customerState.currentSelection;
            }
            if ((i & 4) != 0) {
                paymentMethodMetadata = customerState.metadata;
            }
            if ((i & 8) != 0) {
                customerPermissions = customerState.permissions;
            }
            if ((i & 16) != 0) {
                configuration = customerState.configuration;
            }
            CustomerSheet.Configuration configuration2 = configuration;
            PaymentMethodMetadata paymentMethodMetadata2 = paymentMethodMetadata;
            return customerState.copy(list, paymentSelection, paymentMethodMetadata2, customerPermissions, configuration2);
        }

        public final List<PaymentMethod> component1() {
            return this.paymentMethods;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSelection getCurrentSelection() {
            return this.currentSelection;
        }

        /* renamed from: component3, reason: from getter */
        public final PaymentMethodMetadata getMetadata() {
            return this.metadata;
        }

        /* renamed from: component4, reason: from getter */
        public final CustomerPermissions getPermissions() {
            return this.permissions;
        }

        /* renamed from: component5, reason: from getter */
        public final CustomerSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public final CustomerState copy(List<PaymentMethod> paymentMethods, PaymentSelection currentSelection, PaymentMethodMetadata metadata, CustomerPermissions permissions, CustomerSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new CustomerState(paymentMethods, currentSelection, metadata, permissions, configuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerState)) {
                return false;
            }
            CustomerState customerState = (CustomerState) other;
            return Intrinsics.areEqual(this.paymentMethods, customerState.paymentMethods) && Intrinsics.areEqual(this.currentSelection, customerState.currentSelection) && Intrinsics.areEqual(this.metadata, customerState.metadata) && Intrinsics.areEqual(this.permissions, customerState.permissions) && Intrinsics.areEqual(this.configuration, customerState.configuration);
        }

        public int hashCode() {
            int iHashCode = this.paymentMethods.hashCode() * 31;
            PaymentSelection paymentSelection = this.currentSelection;
            int iHashCode2 = (iHashCode + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31;
            PaymentMethodMetadata paymentMethodMetadata = this.metadata;
            return ((((iHashCode2 + (paymentMethodMetadata != null ? paymentMethodMetadata.hashCode() : 0)) * 31) + this.permissions.hashCode()) * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "CustomerState(paymentMethods=" + this.paymentMethods + ", currentSelection=" + this.currentSelection + ", metadata=" + this.metadata + ", permissions=" + this.permissions + ", configuration=" + this.configuration + ")";
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CustomerState(List<PaymentMethod> paymentMethods, PaymentSelection paymentSelection, PaymentMethodMetadata paymentMethodMetadata, CustomerPermissions permissions, CustomerSheet.Configuration configuration) {
            boolean canRemovePaymentMethods;
            boolean z;
            CardBrandChoiceEligibility.Ineligible cbcEligibility;
            Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.paymentMethods = paymentMethods;
            this.currentSelection = paymentSelection;
            this.metadata = paymentMethodMetadata;
            this.permissions = permissions;
            this.configuration = configuration;
            int size = paymentMethods.size();
            if (size == 0) {
                canRemovePaymentMethods = false;
            } else if (size == 1) {
                if (permissions.getCanRemoveLastPaymentMethod() && permissions.getCanRemovePaymentMethods()) {
                    canRemovePaymentMethods = true;
                }
            } else {
                canRemovePaymentMethods = permissions.getCanRemovePaymentMethods();
            }
            this.canRemove = canRemovePaymentMethods;
            this.canUpdateFullPaymentMethodDetails = permissions.getCanUpdateFullPaymentMethodDetails();
            this.cbcEligibility = (paymentMethodMetadata == null || (cbcEligibility = paymentMethodMetadata.getCbcEligibility()) == null) ? CardBrandChoiceEligibility.Ineligible.INSTANCE : cbcEligibility;
            if (canRemovePaymentMethods) {
                z = true;
                break;
            }
            List<PaymentMethod> list = paymentMethods;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (CustomerSheetViewStateKt.isModifiable((PaymentMethod) it.next(), this.cbcEligibility, this.canUpdateFullPaymentMethodDetails)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            this.canEdit = z;
            this.canShowSavedPaymentMethods = !this.paymentMethods.isEmpty() || CustomerSheetViewModel.INSTANCE.shouldShowGooglePay(this.metadata);
        }

        public final List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final PaymentSelection getCurrentSelection() {
            return this.currentSelection;
        }

        public final PaymentMethodMetadata getMetadata() {
            return this.metadata;
        }

        public final CustomerPermissions getPermissions() {
            return this.permissions;
        }

        public final CustomerSheet.Configuration getConfiguration() {
            return this.configuration;
        }

        public final boolean getCanRemove() {
            return this.canRemove;
        }

        public final boolean getCanUpdateFullPaymentMethodDetails() {
            return this.canUpdateFullPaymentMethodDetails;
        }

        public final CardBrandChoiceEligibility getCbcEligibility() {
            return this.cbcEligibility;
        }

        public final boolean getCanEdit() {
            return this.canEdit;
        }

        public final boolean getCanShowSavedPaymentMethods() {
            return this.canShowSavedPaymentMethods;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewModel$SelectionConfirmationState;", "", "isConfirming", "", "error", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class SelectionConfirmationState {
        private final String error;
        private final boolean isConfirming;

        public static /* synthetic */ SelectionConfirmationState copy$default(SelectionConfirmationState selectionConfirmationState, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = selectionConfirmationState.isConfirming;
            }
            if ((i & 2) != 0) {
                str = selectionConfirmationState.error;
            }
            return selectionConfirmationState.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsConfirming() {
            return this.isConfirming;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final SelectionConfirmationState copy(boolean isConfirming, String error) {
            return new SelectionConfirmationState(isConfirming, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionConfirmationState)) {
                return false;
            }
            SelectionConfirmationState selectionConfirmationState = (SelectionConfirmationState) other;
            return this.isConfirming == selectionConfirmationState.isConfirming && Intrinsics.areEqual(this.error, selectionConfirmationState.error);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isConfirming) * 31;
            String str = this.error;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SelectionConfirmationState(isConfirming=" + this.isConfirming + ", error=" + this.error + ")";
        }

        public SelectionConfirmationState(boolean z, String str) {
            this.isConfirming = z;
            this.error = str;
        }

        public final boolean isConfirming() {
            return this.isConfirming;
        }

        public final String getError() {
            return this.error;
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewModel$Companion;", "", "<init>", "()V", "REMOVAL_TRANSITION_DELAY", "", "shouldShowGooglePay", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean shouldShowGooglePay(PaymentMethodMetadata paymentMethodMetadata) {
            if (paymentMethodMetadata == null || !paymentMethodMetadata.isGooglePayReady()) {
                return false;
            }
            CustomerMetadata customerMetadata = paymentMethodMetadata.getCustomerMetadata();
            return customerMetadata == null || !customerMetadata.isPaymentMethodSetAsDefaultEnabled();
        }
    }

    /* compiled from: CustomerSheetViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/customersheet/CustomerSheetViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", CardScanActivity.ARGS, "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;", "<init>", "(Lcom/stripe/android/customersheet/CustomerSheetContract$Args;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final CustomerSheetContract.Args args;

        public Factory(CustomerSheetContract.Args args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            CustomerSheetViewModel viewModel = DaggerCustomerSheetViewModelComponent.builder().application(CreationExtrasKtxKt.requireApplication(extras)).configuration(this.args.getConfiguration()).integrationType(this.args.getIntegrationType()).statusBarColor(this.args.getStatusBarColor()).savedStateHandle(SavedStateHandleSupport.createSavedStateHandle(extras)).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.customersheet.CustomerSheetViewModel.Factory.create");
            return viewModel;
        }
    }

    private final void updateCustomButtonUIState(Function1<? super PrimaryButton.UIState, PrimaryButton.UIState> callback) {
        Object value;
        ArrayList arrayList;
        CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethod : list) {
                if (addPaymentMethod instanceof CustomerSheetViewState.AddPaymentMethod) {
                    CustomerSheetViewState.AddPaymentMethod addPaymentMethod2 = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethod;
                    PrimaryButton.UIState uIStateInvoke = callback.invoke(addPaymentMethod2.getCustomPrimaryButtonUiState());
                    if (uIStateInvoke != null) {
                        addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod2, null, null, null, null, null, null, null, false, false, false, null, false, null, uIStateInvoke.getEnabled(), uIStateInvoke, null, false, false, null, null, 1023999, null);
                    } else {
                        addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod2, null, null, null, null, null, null, null, false, false, false, null, false, null, (Intrinsics.areEqual(addPaymentMethod2.getPaymentMethodCode(), PaymentMethod.Type.USBankAccount.code) || addPaymentMethod2.getFormFieldValues() != null) && !addPaymentMethod2.getIsProcessing(), null, null, false, false, null, null, 1023999, null);
                    }
                    addPaymentMethod = addPaymentMethodCopy$default;
                }
                arrayList.add(addPaymentMethod);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void updateMandateText(ResolvableString mandateText, boolean showAbove) {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                    addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default((CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, mandateText, showAbove, false, null, null, 950271, null);
                }
                arrayList.add(addPaymentMethodCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void onCollectUSBankAccountResult(PaymentSelection.New.USBankAccount paymentSelection) {
        Object value;
        ArrayList arrayList;
        ResolvableString resolvableString;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                    CustomerSheetViewState.AddPaymentMethod addPaymentMethod = (CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default;
                    if (paymentSelection != null) {
                        resolvableString = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_save);
                    } else {
                        resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_continue_button_label);
                    }
                    addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default(addPaymentMethod, null, null, null, null, null, null, null, false, false, false, null, false, resolvableString, false, null, null, false, false, paymentSelection, null, 782335, null);
                }
                arrayList.add(addPaymentMethodCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void onFormError(ResolvableString error) {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                    addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default((CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default, null, null, null, null, null, null, null, false, false, false, error, false, null, false, null, null, false, false, null, null, 1047551, null);
                }
                arrayList.add(addPaymentMethodCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }

    private final void onCancelCloseForm() {
        Object value;
        ArrayList arrayList;
        MutableStateFlow mutableStateFlow = this.backStack;
        do {
            value = mutableStateFlow.getValue();
            List<CustomerSheetViewState> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CustomerSheetViewState.AddPaymentMethod addPaymentMethodCopy$default : list) {
                if (addPaymentMethodCopy$default instanceof CustomerSheetViewState.AddPaymentMethod) {
                    addPaymentMethodCopy$default = CustomerSheetViewState.AddPaymentMethod.copy$default((CustomerSheetViewState.AddPaymentMethod) addPaymentMethodCopy$default, null, null, null, null, null, null, null, false, false, false, null, false, null, false, null, null, false, false, null, null, 917503, null);
                }
                arrayList.add(addPaymentMethodCopy$default);
            }
        } while (!mutableStateFlow.compareAndSet(value, arrayList));
    }
}
