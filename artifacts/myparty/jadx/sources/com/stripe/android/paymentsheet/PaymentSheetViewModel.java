package com.stripe.android.paymentsheet;

import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.login.LoginLogger;
import com.stripe.android.analytics.SessionSavedStateHandler;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.common.model.CommonConfigurationKt;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEventKt;
import com.stripe.android.paymentsheet.cvcrecollection.CvcRecollectionHandler;
import com.stripe.android.paymentsheet.injection.DaggerPaymentSheetLauncherComponent;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelModule;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.Args;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcCompletionState;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionData;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import com.stripe.android.paymentsheet.state.WalletsProcessingState;
import com.stripe.android.paymentsheet.state.WalletsState;
import com.stripe.android.paymentsheet.ui.DefaultAddPaymentMethodInteractor;
import com.stripe.android.paymentsheet.ui.DefaultSelectSavedPaymentMethodsInteractor;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.utils.ConfirmationReportingUtilsKt;
import com.stripe.android.paymentsheet.utils.GooglePayUtilsKt;
import com.stripe.android.paymentsheet.utils.SelectionUtilsKt;
import com.stripe.android.paymentsheet.verticalmode.VerticalModeInitialScreenFactory;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.PrimaryButtonUiStateMapper;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentSheetViewModel.kt */
@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 ®\u00012\u00020\u0001:\u0006¬\u0001\u00ad\u0001®\u0001B\u008b\u0001\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b!\u0010\"J\u000e\u0010h\u001a\u00020iH\u0082@¢\u0006\u0002\u0010jJ\u0010\u0010k\u001a\u00020i2\u0006\u0010[\u001a\u00020lH\u0002J\u0016\u0010m\u001a\u00020i2\u0006\u0010n\u001a\u00020oH\u0082@¢\u0006\u0002\u0010pJ\u0016\u0010q\u001a\u00020i2\u0006\u0010n\u001a\u00020oH\u0082@¢\u0006\u0002\u0010pJ\u0014\u0010r\u001a\u00020i2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\\H\u0002J\u001c\u0010t\u001a\u00020i2\u0006\u0010u\u001a\u00020v2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\\H\u0002J\u0010\u0010x\u001a\u00020i2\u0006\u00108\u001a\u000209H\u0002J\u0006\u0010y\u001a\u00020iJ\u0006\u0010z\u001a\u00020iJ\u0006\u0010{\u001a\u00020iJ\b\u0010|\u001a\u00020iH\u0002J\u001a\u0010y\u001a\u00020i2\b\u0010}\u001a\u0004\u0018\u00010F2\u0006\u0010~\u001a\u000209H\u0002J\u0013\u0010\u007f\u001a\u00020i2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010FH\u0016J\t\u0010\u0081\u0001\u001a\u00020iH\u0016J\u0013\u0010\u0082\u0001\u001a\u00020i2\b\u0010\u0080\u0001\u001a\u00030\u0083\u0001H\u0002J\u0013\u0010\u0084\u0001\u001a\u00020i2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001H\u0002J\u001d\u0010\u0087\u0001\u001a\u00020i2\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0014J\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010F2\b\u0010}\u001a\u0004\u0018\u00010FH\u0002J\u0013\u0010\u008d\u0001\u001a\u00020i2\b\u0010}\u001a\u0004\u0018\u00010FH\u0002J\u001b\u0010\u008e\u0001\u001a\u00020i2\u0007\u0010[\u001a\u00030\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020\\H\u0002J(\u0010\u0091\u0001\u001a\u00020i2\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0095\u00012\u0007\u0010\u0096\u0001\u001a\u00020 H\u0002J\u0015\u0010\u0097\u0001\u001a\u00020i2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0002J\u0013\u0010\u009a\u0001\u001a\u00020i2\b\u0010\u009b\u0001\u001a\u00030\u009c\u0001H\u0002J\u0012\u0010\u009d\u0001\u001a\u00020i2\u0007\u0010\u009e\u0001\u001a\u00020lH\u0002J\t\u0010\u009f\u0001\u001a\u00020iH\u0016J\u0013\u0010 \u0001\u001a\u00020i2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J$\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010¢\u00012\u0007\u0010¤\u0001\u001a\u00020v2\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0002J\u0010\u0010§\u0001\u001a\u00030\u0093\u0001H\u0082@¢\u0006\u0002\u0010jJ\u0010\u0010¨\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bª\u0001J\u001d\u0010«\u0001\u001a\u0004\u0018\u0001032\b\u00101\u001a\u0004\u0018\u0001032\u0006\u00108\u001a\u000209H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010'R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0.X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R$\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103028\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u000209X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0019\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR(\u0010G\u001a\u0004\u0018\u00010F2\b\u0010E\u001a\u0004\u0018\u00010F8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010DR\u001c\u0010M\u001a\u0004\u0018\u00010NX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001e\u0010S\u001a\u0004\u0018\u00010T8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u00105\u001a\u0004\bV\u0010WR\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0?X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0?X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u001c\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010_0?X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0?X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u000e\u0010d\u001a\u00020eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020 0?X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010A¨\u0006¯\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", CardScanActivity.ARGS, "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "paymentElementLoader", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "prefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "confirmationHandlerFactory", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "cvcRecollectionHandler", "Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;", "cvcRecollectionInteractorFactory", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionInteractor$Factory;", "isLiveModeProvider", "Lkotlin/Function0;", "", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/state/PaymentElementLoader;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/core/Logger;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionInteractor$Factory;Lkotlin/jvm/functions/Function0;)V", "getArgs$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "getCvcRecollectionHandler$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/cvcrecollection/CvcRecollectionHandler;", "()Lkotlin/jvm/functions/Function0;", "primaryButtonUiStateMapper", "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;", "_paymentSheetResult", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "paymentSheetResult", "Lkotlinx/coroutines/flow/SharedFlow;", "getPaymentSheetResult$paymentsheet_release", "()Lkotlinx/coroutines/flow/SharedFlow;", "viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "getViewState$paymentsheet_release$annotations", "()V", "getViewState$paymentsheet_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "checkoutIdentifier", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "getCheckoutIdentifier$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "setCheckoutIdentifier$paymentsheet_release", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;)V", "buyButtonState", "Lkotlinx/coroutines/flow/StateFlow;", "getBuyButtonState", "()Lkotlinx/coroutines/flow/StateFlow;", "isProcessingPaymentIntent", "isProcessingPaymentIntent$paymentsheet_release", "()Z", "value", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "inProgressSelection", "getInProgressSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setInProgressSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "isConfirmingWithLinkExpress", "newPaymentSelection", "Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "getNewPaymentSelection", "()Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;", "setNewPaymentSelection", "(Lcom/stripe/android/paymentsheet/NewPaymentOptionSelection;)V", "googlePayLauncherConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "getGooglePayLauncherConfig$paymentsheet_release$annotations", "getGooglePayLauncherConfig$paymentsheet_release", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "primaryButtonUiState", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;", "getPrimaryButtonUiState", "error", "Lcom/stripe/android/core/strings/ResolvableString;", "getError", "walletsState", "Lcom/stripe/android/paymentsheet/state/WalletsState;", "getWalletsState", "walletsProcessingState", "Lcom/stripe/android/paymentsheet/state/WalletsProcessingState;", "getWalletsProcessingState", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "contentVisible", "getContentVisible$paymentsheet_release", "loadPaymentSheetState", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePaymentSheetStateLoadFailure", "", "handlePaymentSheetStateLoaded", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeWithState", "resetViewState", "userErrorMessage", "initializeNavigationStateIfNeeded", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "errorMessage", "startProcessing", "checkout", "checkoutWithGooglePay", "checkoutWithLink", "checkoutWithLinkExpress", "paymentSelection", NotificationsService.IDENTIFIER_KEY, "handlePaymentMethodSelected", BaseSheetViewModel.SAVE_SELECTION, "clearErrorMessages", "launchCvcRecollection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "handleCvcCompletionState", "completionState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;", "registerFromActivity", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "paymentSelectionWithCvcIfEnabled", "confirmPaymentSelection", "handlePaymentFailed", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetConfirmationError;", "message", "handlePaymentCompleted", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "finishImmediately", "processConfirmationResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "processConfirmationFailure", LoginLogger.EVENT_EXTRAS_FAILURE, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Failed;", "onFatal", "throwable", "onUserCancel", "onError", "determineInitialBackStack", "", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;", "paymentMethodMetadata", "customerStateHolder", "Lcom/stripe/android/paymentsheet/CustomerStateHolder;", "awaitStripeIntent", "getCvcRecollectionState", "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods$CvcRecollectionState;", "getCvcRecollectionState$paymentsheet_release", "mapViewStateToCheckoutIdentifier", "Factory", "CheckoutIdentifier", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetViewModel extends BaseSheetViewModel {

    @Deprecated
    public static final String IN_PROGRESS_SELECTION = "IN_PROGRESS_PAYMENT_SELECTION";
    private final MutableSharedFlow<PaymentSheetResult> _paymentSheetResult;
    private final PaymentSheetContractV2.Args args;
    private final StateFlow<PaymentSheetViewState> buyButtonState;
    private CheckoutIdentifier checkoutIdentifier;
    private final ConfirmationHandler confirmationHandler;
    private final StateFlow<Boolean> contentVisible;
    private final CvcRecollectionHandler cvcRecollectionHandler;
    private final CvcRecollectionInteractor.Factory cvcRecollectionInteractorFactory;
    private final StateFlow<ResolvableString> error;
    private final ErrorReporter errorReporter;
    private final GooglePayPaymentMethodLauncher.Config googlePayLauncherConfig;
    private final Function0<Boolean> isLiveModeProvider;
    private final Logger logger;
    private NewPaymentOptionSelection newPaymentSelection;
    private final PaymentElementLoader paymentElementLoader;
    private final SharedFlow<PaymentSheetResult> paymentSheetResult;
    private final PrefsRepository prefsRepository;
    private final StateFlow<PrimaryButton.UIState> primaryButtonUiState;
    private final PrimaryButtonUiStateMapper primaryButtonUiStateMapper;
    private final MutableStateFlow<PaymentSheetViewState> viewState;
    private final StateFlow<WalletsProcessingState> walletsProcessingState;
    private final StateFlow<WalletsState> walletsState;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.GooglePayConfiguration.Environment.values().length];
            try {
                iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {}, l = {686}, m = "awaitStripeIntent", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$awaitStripeIntent$1, reason: invalid class name and case insensitive filesystem */
    static final class C11021 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C11021(Continuation<? super C11021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentSheetViewModel.this.awaitStripeIntent(this);
        }
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {0, 0}, l = {264, 277}, m = "handlePaymentSheetStateLoaded", n = {"this", ServerProtocol.DIALOG_PARAM_STATE}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$handlePaymentSheetStateLoaded$1, reason: invalid class name and case insensitive filesystem */
    static final class C11041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C11041(Continuation<? super C11041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentSheetViewModel.this.handlePaymentSheetStateLoaded(null, this);
        }
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {0}, l = {282}, m = "initializeWithState", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$1, reason: invalid class name and case insensitive filesystem */
    static final class C11051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11051(Continuation<? super C11051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentSheetViewModel.this.initializeWithState(null, this);
        }
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel", f = "PaymentSheetViewModel.kt", i = {0}, l = {241, 253}, m = "loadPaymentSheetState", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$loadPaymentSheetState$1, reason: invalid class name and case insensitive filesystem */
    static final class C11061 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11061(Continuation<? super C11061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentSheetViewModel.this.loadPaymentSheetState(this);
        }
    }

    public static /* synthetic */ void getGooglePayLauncherConfig$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getViewState$paymentsheet_release$annotations() {
    }

    /* renamed from: getArgs$paymentsheet_release, reason: from getter */
    public final PaymentSheetContractV2.Args getArgs() {
        return this.args;
    }

    /* renamed from: getCvcRecollectionHandler$paymentsheet_release, reason: from getter */
    public final CvcRecollectionHandler getCvcRecollectionHandler() {
        return this.cvcRecollectionHandler;
    }

    public final Function0<Boolean> isLiveModeProvider() {
        return this.isLiveModeProvider;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PaymentSheetViewModel(PaymentSheetContractV2.Args args, final EventReporter eventReporter, PaymentElementLoader paymentElementLoader, CustomerRepository customerRepository, PrefsRepository prefsRepository, Logger logger, @IOContext CoroutineContext workContext, SavedStateHandle savedStateHandle, LinkHandler linkHandler, ConfirmationHandler.Factory confirmationHandlerFactory, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, ErrorReporter errorReporter, CvcRecollectionHandler cvcRecollectionHandler, CvcRecollectionInteractor.Factory cvcRecollectionInteractorFactory, @Named(NamedConstantsKt.IS_LIVE_MODE) Function0<Boolean> isLiveModeProvider) {
        GooglePayPaymentMethodLauncher.Config config;
        GooglePayEnvironment googlePayEnvironment;
        super(args.getConfig$paymentsheet_release(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, cardAccountRangeRepositoryFactory, true);
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(paymentElementLoader, "paymentElementLoader");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(prefsRepository, "prefsRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        Intrinsics.checkNotNullParameter(confirmationHandlerFactory, "confirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(cvcRecollectionHandler, "cvcRecollectionHandler");
        Intrinsics.checkNotNullParameter(cvcRecollectionInteractorFactory, "cvcRecollectionInteractorFactory");
        Intrinsics.checkNotNullParameter(isLiveModeProvider, "isLiveModeProvider");
        this.args = args;
        this.paymentElementLoader = paymentElementLoader;
        this.prefsRepository = prefsRepository;
        this.logger = logger;
        this.errorReporter = errorReporter;
        this.cvcRecollectionHandler = cvcRecollectionHandler;
        this.cvcRecollectionInteractorFactory = cvcRecollectionInteractorFactory;
        this.isLiveModeProvider = isLiveModeProvider;
        PrimaryButtonUiStateMapper primaryButtonUiStateMapper = new PrimaryButtonUiStateMapper(getConfig(), isProcessingPaymentIntent$paymentsheet_release(), getNavigationHandler().getCurrentScreen(), getButtonsEnabled(), StateFlowsKt.mapAsStateFlow(getPaymentMethodMetadata$paymentsheet_release(), new Function1() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentSheetViewModel.primaryButtonUiStateMapper$lambda$0((PaymentMethodMetadata) obj);
            }
        }), getSelection$paymentsheet_release(), getCustomPrimaryButtonUiState(), getCvcRecollectionCompleteFlow$paymentsheet_release(), new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentSheetViewModel.primaryButtonUiStateMapper$lambda$2(this.f$0, eventReporter);
            }
        });
        this.primaryButtonUiStateMapper = primaryButtonUiStateMapper;
        MutableSharedFlow<PaymentSheetResult> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._paymentSheetResult = mutableSharedFlowMutableSharedFlow$default;
        this.paymentSheetResult = mutableSharedFlowMutableSharedFlow$default;
        MutableStateFlow<PaymentSheetViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.viewState = MutableStateFlow;
        this.checkoutIdentifier = CheckoutIdentifier.SheetBottomBuy;
        StateFlow<PaymentSheetViewState> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentSheetViewModel.buyButtonState$lambda$3(this.f$0, (PaymentSheetViewState) obj);
            }
        });
        this.buyButtonState = stateFlowMapAsStateFlow;
        PaymentSheet.GooglePayConfiguration googlePayConfig = args.getGooglePayConfig();
        if (googlePayConfig == null) {
            config = null;
        } else if (googlePayConfig.getCurrencyCode() == null && !isProcessingPaymentIntent$paymentsheet_release()) {
            logger.warning("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            config = null;
        } else {
            if (WhenMappings.$EnumSwitchMapping$0[googlePayConfig.getEnvironment().ordinal()] == 1) {
                googlePayEnvironment = GooglePayEnvironment.Production;
            } else {
                googlePayEnvironment = GooglePayEnvironment.Test;
            }
            config = new GooglePayPaymentMethodLauncher.Config(googlePayEnvironment, googlePayConfig.getCountryCode(), getConfig().getMerchantDisplayName(), args.getConfig$paymentsheet_release().getBillingDetailsCollectionConfiguration().getCollectsEmail$paymentsheet_release(), args.getConfig$paymentsheet_release().getBillingDetailsCollectionConfiguration().toBillingAddressConfig$paymentsheet_release(), false, false, 96, null);
        }
        this.googlePayLauncherConfig = config;
        this.primaryButtonUiState = primaryButtonUiStateMapper.forCompleteFlow();
        this.error = StateFlowsKt.mapAsStateFlow(stateFlowMapAsStateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentSheetViewModel.error$lambda$6((PaymentSheetViewState) obj);
            }
        });
        this.walletsState = StateFlowsKt.combineAsStateFlow(linkHandler.isLinkEnabled(), linkHandler.getLinkConfigurationCoordinator().getEmailFlow(), getButtonsEnabled(), getPaymentMethodMetadata$paymentsheet_release(), new Function4() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return PaymentSheetViewModel.walletsState$lambda$7(this.f$0, (Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (PaymentMethodMetadata) obj4);
            }
        });
        this.walletsProcessingState = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentSheetViewModel.walletsProcessingState$lambda$8(this.f$0, (PaymentSheetViewState) obj);
            }
        });
        PaymentSheetViewModel paymentSheetViewModel = this;
        ConfirmationHandler confirmationHandlerCreate = confirmationHandlerFactory.create(ViewModelKt.getViewModelScope(paymentSheetViewModel));
        this.confirmationHandler = confirmationHandlerCreate;
        this.contentVisible = StateFlowsKt.mapAsStateFlow(confirmationHandlerCreate.getState(), new Function1() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PaymentSheetViewModel.contentVisible$lambda$9((ConfirmationHandler.State) obj));
            }
        });
        SessionSavedStateHandler.INSTANCE.attachTo(paymentSheetViewModel, savedStateHandle);
        boolean z = args.getInitializationMode$paymentsheet_release() instanceof PaymentElementLoader.InitializationMode.DeferredIntent;
        eventReporter.onInit(CommonConfigurationKt.asCommonConfiguration(getConfig()), getConfig().getAppearance(), Boolean.valueOf(PaymentSheetEventKt.primaryButtonColorUsage(getConfig())), new PaymentSheetEvent.ConfigurationSpecificPayload.PaymentSheet(getConfig()), z);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(paymentSheetViewModel), workContext, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Amount primaryButtonUiStateMapper$lambda$0(PaymentMethodMetadata paymentMethodMetadata) {
        if (paymentMethodMetadata != null) {
            return paymentMethodMetadata.amount();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit primaryButtonUiStateMapper$lambda$2(PaymentSheetViewModel paymentSheetViewModel, EventReporter eventReporter) {
        PaymentSelection value = paymentSheetViewModel.getSelection$paymentsheet_release().getValue();
        if (value != null) {
            eventReporter.onPressConfirmButton(value);
        }
        paymentSheetViewModel.checkout();
        return Unit.INSTANCE;
    }

    public final SharedFlow<PaymentSheetResult> getPaymentSheetResult$paymentsheet_release() {
        return this.paymentSheetResult;
    }

    public final MutableStateFlow<PaymentSheetViewState> getViewState$paymentsheet_release() {
        return this.viewState;
    }

    /* renamed from: getCheckoutIdentifier$paymentsheet_release, reason: from getter */
    public final CheckoutIdentifier getCheckoutIdentifier() {
        return this.checkoutIdentifier;
    }

    public final void setCheckoutIdentifier$paymentsheet_release(CheckoutIdentifier checkoutIdentifier) {
        Intrinsics.checkNotNullParameter(checkoutIdentifier, "<set-?>");
        this.checkoutIdentifier = checkoutIdentifier;
    }

    public final StateFlow<PaymentSheetViewState> getBuyButtonState() {
        return this.buyButtonState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentSheetViewState buyButtonState$lambda$3(PaymentSheetViewModel paymentSheetViewModel, PaymentSheetViewState paymentSheetViewState) {
        return paymentSheetViewModel.mapViewStateToCheckoutIdentifier(paymentSheetViewState, CheckoutIdentifier.SheetBottomBuy);
    }

    public final boolean isProcessingPaymentIntent$paymentsheet_release() {
        return PaymentSheetViewModelKt.isProcessingPayment(this.args.getInitializationMode$paymentsheet_release());
    }

    private final PaymentSelection getInProgressSelection() {
        return (PaymentSelection) getSavedStateHandle().get(IN_PROGRESS_SELECTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInProgressSelection(PaymentSelection paymentSelection) {
        getSavedStateHandle().set(IN_PROGRESS_SELECTION, paymentSelection);
    }

    private final boolean isConfirmingWithLinkExpress() {
        LinkExpressMode linkExpressMode;
        PaymentSelection inProgressSelection = getInProgressSelection();
        PaymentSelection.Link link = inProgressSelection instanceof PaymentSelection.Link ? (PaymentSelection.Link) inProgressSelection : null;
        return (link == null || (linkExpressMode = link.getLinkExpressMode()) == null || linkExpressMode == LinkExpressMode.DISABLED) ? false : true;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public NewPaymentOptionSelection getNewPaymentSelection() {
        return this.newPaymentSelection;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void setNewPaymentSelection(NewPaymentOptionSelection newPaymentOptionSelection) {
        this.newPaymentSelection = newPaymentOptionSelection;
    }

    /* renamed from: getGooglePayLauncherConfig$paymentsheet_release, reason: from getter */
    public final GooglePayPaymentMethodLauncher.Config getGooglePayLauncherConfig() {
        return this.googlePayLauncherConfig;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<PrimaryButton.UIState> getPrimaryButtonUiState() {
        return this.primaryButtonUiState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString error$lambda$6(PaymentSheetViewState paymentSheetViewState) {
        PaymentSheetViewState.UserErrorMessage errorMessage;
        if (paymentSheetViewState == null || (errorMessage = paymentSheetViewState.getErrorMessage()) == null) {
            return null;
        }
        return errorMessage.getMessage();
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<ResolvableString> getError() {
        return this.error;
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<WalletsState> getWalletsState() {
        return this.walletsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WalletsState walletsState$lambda$7(PaymentSheetViewModel paymentSheetViewModel, Boolean bool, String str, boolean z, PaymentMethodMetadata paymentMethodMetadata) {
        boolean z2;
        WalletsState.Companion companion = WalletsState.INSTANCE;
        if (paymentMethodMetadata != null) {
            z2 = paymentMethodMetadata.isGooglePayReady();
        }
        List<String> listSupportedPaymentMethodTypes = paymentMethodMetadata != null ? paymentMethodMetadata.supportedPaymentMethodTypes() : null;
        if (listSupportedPaymentMethodTypes == null) {
            listSupportedPaymentMethodTypes = CollectionsKt.emptyList();
        }
        List<String> list = listSupportedPaymentMethodTypes;
        GooglePayPaymentMethodLauncher.Config config = paymentSheetViewModel.googlePayLauncherConfig;
        PaymentSheet.GooglePayConfiguration googlePayConfig = paymentSheetViewModel.args.getGooglePayConfig();
        return companion.create(bool, str, z2, GooglePayUtilsKt.getAsGooglePayButtonType(googlePayConfig != null ? googlePayConfig.getButtonType() : null), z, list, config, new PaymentSheetViewModel$walletsState$1$1(paymentSheetViewModel), new PaymentSheetViewModel$walletsState$1$2(paymentSheetViewModel), (paymentMethodMetadata != null ? paymentMethodMetadata.getStripeIntent() : null) instanceof SetupIntent);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public StateFlow<WalletsProcessingState> getWalletsProcessingState() {
        return this.walletsProcessingState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WalletsProcessingState walletsProcessingState$lambda$8(PaymentSheetViewModel paymentSheetViewModel, PaymentSheetViewState paymentSheetViewState) {
        PaymentSheetViewState paymentSheetViewStateMapViewStateToCheckoutIdentifier = paymentSheetViewModel.mapViewStateToCheckoutIdentifier(paymentSheetViewState, CheckoutIdentifier.SheetTopWallet);
        if (paymentSheetViewStateMapViewStateToCheckoutIdentifier == null) {
            return null;
        }
        if (paymentSheetViewStateMapViewStateToCheckoutIdentifier instanceof PaymentSheetViewState.Reset) {
            PaymentSheetViewState.UserErrorMessage errorMessage = ((PaymentSheetViewState.Reset) paymentSheetViewStateMapViewStateToCheckoutIdentifier).getErrorMessage();
            return new WalletsProcessingState.Idle(errorMessage != null ? errorMessage.getMessage() : null);
        }
        if (paymentSheetViewStateMapViewStateToCheckoutIdentifier instanceof PaymentSheetViewState.StartProcessing) {
            if (paymentSheetViewModel.isConfirmingWithLinkExpress()) {
                return new WalletsProcessingState.Idle(null);
            }
            return WalletsProcessingState.Processing.INSTANCE;
        }
        if (paymentSheetViewStateMapViewStateToCheckoutIdentifier instanceof PaymentSheetViewState.FinishProcessing) {
            return new WalletsProcessingState.Completed(((PaymentSheetViewState.FinishProcessing) paymentSheetViewStateMapViewStateToCheckoutIdentifier).getOnComplete());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean contentVisible$lambda$9(ConfirmationHandler.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaymentSheetViewModelKt.getContentVisible(it);
    }

    public final StateFlow<Boolean> getContentVisible$paymentsheet_release() {
        return this.contentVisible;
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$1", f = "PaymentSheetViewModel.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentSheetViewModel.this.new AnonymousClass1(continuation);
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
                if (PaymentSheetViewModel.this.loadPaymentSheetState(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r2.handlePaymentSheetStateLoaded(r5, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadPaymentSheetState(Continuation<? super Unit> continuation) {
        C11061 c11061;
        PaymentSheetViewModel paymentSheetViewModel;
        if (continuation instanceof C11061) {
            c11061 = (C11061) continuation;
            if ((c11061.label & Integer.MIN_VALUE) != 0) {
                c11061.label -= Integer.MIN_VALUE;
            } else {
                c11061 = new C11061(continuation);
            }
        }
        Object objWithContext = c11061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11061.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext workContext = getWorkContext();
            PaymentSheetViewModel$loadPaymentSheetState$result$1 paymentSheetViewModel$loadPaymentSheetState$result$1 = new PaymentSheetViewModel$loadPaymentSheetState$result$1(this, null);
            c11061.L$0 = this;
            c11061.label = 1;
            objWithContext = BuildersKt.withContext(workContext, paymentSheetViewModel$loadPaymentSheetState$result$1, c11061);
            if (objWithContext != coroutine_suspended) {
                paymentSheetViewModel = this;
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
        paymentSheetViewModel = (PaymentSheetViewModel) c11061.L$0;
        ResultKt.throwOnFailure(objWithContext);
        Object value = ((Result) objWithContext).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
        if (thM9121exceptionOrNullimpl == null) {
            PaymentSheetState.Full full = new PaymentSheetState.Full((PaymentElementLoader.State) value);
            c11061.L$0 = null;
            c11061.label = 2;
        } else {
            paymentSheetViewModel.handlePaymentSheetStateLoadFailure(thM9121exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    private final void handlePaymentSheetStateLoadFailure(Throwable error) {
        setPaymentMethodMetadata(null);
        onFatal(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r2.initializeWithState(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handlePaymentSheetStateLoaded(PaymentSheetState.Full full, Continuation<? super Unit> continuation) {
        C11041 c11041;
        PaymentSheetViewModel paymentSheetViewModel;
        if (continuation instanceof C11041) {
            c11041 = (C11041) continuation;
            if ((c11041.label & Integer.MIN_VALUE) != 0) {
                c11041.label -= Integer.MIN_VALUE;
            } else {
                c11041 = new C11041(continuation);
            }
        }
        Object objAwaitResult = c11041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11041.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwaitResult);
            ConfirmationHandler confirmationHandler = this.confirmationHandler;
            c11041.L$0 = this;
            c11041.L$1 = full;
            c11041.label = 1;
            objAwaitResult = confirmationHandler.awaitResult(c11041);
            if (objAwaitResult != coroutine_suspended) {
                paymentSheetViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwaitResult);
            return Unit.INSTANCE;
        }
        full = (PaymentSheetState.Full) c11041.L$1;
        paymentSheetViewModel = (PaymentSheetViewModel) c11041.L$0;
        ResultKt.throwOnFailure(objAwaitResult);
        ConfirmationHandler.Result result = (ConfirmationHandler.Result) objAwaitResult;
        if (result instanceof ConfirmationHandler.Result.Succeeded) {
            ConfirmationHandler.Result.Succeeded succeeded = (ConfirmationHandler.Result.Succeeded) result;
            paymentSheetViewModel.handlePaymentCompleted(succeeded.getIntent(), succeeded.getDeferredIntentConfirmationType(), true);
        } else if (full.getValidationError() != null) {
            paymentSheetViewModel.handlePaymentSheetStateLoadFailure(full.getValidationError());
        } else {
            c11041.L$0 = null;
            c11041.L$1 = null;
            c11041.label = 2;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$2", f = "PaymentSheetViewModel.kt", i = {1}, l = {283, 298}, m = "invokeSuspend", n = {"shouldLaunchEagerly"}, s = {"Z$0"})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSheetState.Full $state;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaymentSheetState.Full full, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$state = full;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentSheetViewModel.this.new AnonymousClass2(this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            ResolvableString resolvableStringStripeErrorMessage;
            ConfirmationHandler.Result.Failed failed;
            Throwable cause;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = PaymentSheetViewModel.this.getLinkHandler().setupLinkWithEagerLaunch(this.$state.getPaymentMethodMetadata().getLinkState(), this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                resolvableStringStripeErrorMessage = null;
                failed = !(obj instanceof ConfirmationHandler.Result.Failed) ? (ConfirmationHandler.Result.Failed) obj : null;
                if (failed != null && (cause = failed.getCause()) != null) {
                    resolvableStringStripeErrorMessage = ExceptionKtKt.stripeErrorMessage(cause);
                }
                if (!z) {
                    PaymentSheetViewModel.this.initializeNavigationStateIfNeeded(this.$state.getPaymentMethodMetadata(), resolvableStringStripeErrorMessage);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                PaymentSheetViewModel.this.checkoutWithLinkExpress();
            }
            PaymentSheetViewModel.this.getCustomerStateHolder().setCustomerState(this.$state.getCustomer());
            PaymentSelection paymentSelection = this.$state.getPaymentSelection();
            if (!(paymentSelection instanceof PaymentSelection.GooglePay) && !(paymentSelection instanceof PaymentSelection.Link)) {
                PaymentSheetViewModel.this.updateSelection(this.$state.getPaymentSelection());
            }
            PaymentSheetViewModel.this.setPaymentMethodMetadata(this.$state.getPaymentMethodMetadata());
            this.Z$0 = zBooleanValue;
            this.label = 2;
            Object objAwaitResult = PaymentSheetViewModel.this.confirmationHandler.awaitResult(this);
            if (objAwaitResult != coroutine_suspended) {
                z = zBooleanValue;
                obj = objAwaitResult;
                resolvableStringStripeErrorMessage = null;
                if (!(obj instanceof ConfirmationHandler.Result.Failed)) {
                }
                if (failed != null) {
                    resolvableStringStripeErrorMessage = ExceptionKtKt.stripeErrorMessage(cause);
                }
                if (!z) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeWithState(PaymentSheetState.Full full, Continuation<? super Unit> continuation) {
        C11051 c11051;
        PaymentSheetViewModel paymentSheetViewModel;
        if (continuation instanceof C11051) {
            c11051 = (C11051) continuation;
            if ((c11051.label & Integer.MIN_VALUE) != 0) {
                c11051.label -= Integer.MIN_VALUE;
            } else {
                c11051 = new C11051(continuation);
            }
        }
        Object obj = c11051.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11051.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(full, null);
            c11051.L$0 = this;
            c11051.label = 1;
            if (BuildersKt.withContext(immediate, anonymousClass2, c11051) == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentSheetViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentSheetViewModel = (PaymentSheetViewModel) c11051.L$0;
            ResultKt.throwOnFailure(obj);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(paymentSheetViewModel), null, null, paymentSheetViewModel.new AnonymousClass3(null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$3", f = "PaymentSheetViewModel.kt", i = {}, l = {311}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PaymentSheetViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PaymentSheetViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$3$1", f = "PaymentSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$initializeWithState$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<ConfirmationHandler.State, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PaymentSheetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PaymentSheetViewModel paymentSheetViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = paymentSheetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ConfirmationHandler.State state, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ConfirmationHandler.State state = (ConfirmationHandler.State) this.L$0;
                if (!(state instanceof ConfirmationHandler.State.Idle)) {
                    if (state instanceof ConfirmationHandler.State.Confirming) {
                        PaymentSheetViewModel paymentSheetViewModel = this.this$0;
                        paymentSheetViewModel.startProcessing(paymentSheetViewModel.getCheckoutIdentifier());
                        if (!(this.this$0.getViewState$paymentsheet_release().getValue() instanceof PaymentSheetViewState.StartProcessing)) {
                            PaymentSheetViewModel paymentSheetViewModel2 = this.this$0;
                            paymentSheetViewModel2.startProcessing(paymentSheetViewModel2.getCheckoutIdentifier());
                        }
                    } else {
                        if (!(state instanceof ConfirmationHandler.State.Complete)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PaymentMethodMetadata value = this.this$0.getPaymentMethodMetadata$paymentsheet_release().getValue();
                        if (value != null) {
                            PaymentSheetViewModel.initializeNavigationStateIfNeeded$default(this.this$0, value, null, 2, null);
                        }
                        this.this$0.processConfirmationResult(((ConfirmationHandler.State.Complete) state).getResult());
                    }
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
                if (FlowKt.collectLatest(PaymentSheetViewModel.this.confirmationHandler.getState(), new AnonymousClass1(PaymentSheetViewModel.this, null), this) == coroutine_suspended) {
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

    static /* synthetic */ void resetViewState$default(PaymentSheetViewModel paymentSheetViewModel, ResolvableString resolvableString, int i, Object obj) {
        if ((i & 1) != 0) {
            resolvableString = null;
        }
        paymentSheetViewModel.resetViewState(resolvableString);
    }

    private final void resetViewState(ResolvableString userErrorMessage) {
        this.viewState.setValue(new PaymentSheetViewState.Reset(userErrorMessage != null ? new PaymentSheetViewState.UserErrorMessage(userErrorMessage) : null));
        getSavedStateHandle().set(BaseSheetViewModel.SAVE_PROCESSING, false);
    }

    static /* synthetic */ void initializeNavigationStateIfNeeded$default(PaymentSheetViewModel paymentSheetViewModel, PaymentMethodMetadata paymentMethodMetadata, ResolvableString resolvableString, int i, Object obj) {
        if ((i & 2) != 0) {
            resolvableString = null;
        }
        paymentSheetViewModel.initializeNavigationStateIfNeeded(paymentMethodMetadata, resolvableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeNavigationStateIfNeeded(PaymentMethodMetadata metadata, ResolvableString errorMessage) {
        if (Intrinsics.areEqual(getNavigationHandler().getCurrentScreen().getValue(), PaymentSheetScreen.Loading.INSTANCE)) {
            resetViewState(errorMessage);
            getNavigationHandler().resetTo(determineInitialBackStack(metadata, getCustomerStateHolder()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startProcessing(CheckoutIdentifier checkoutIdentifier) {
        this.checkoutIdentifier = checkoutIdentifier;
        getSavedStateHandle().set(BaseSheetViewModel.SAVE_PROCESSING, true);
        this.viewState.setValue(PaymentSheetViewState.StartProcessing.INSTANCE);
    }

    public final void checkout() {
        PaymentSelection value = getSelection$paymentsheet_release().getValue();
        if (value instanceof PaymentSelection.Saved) {
            PaymentSelection.Saved saved = (PaymentSelection.Saved) value;
            if (PaymentSheetViewModelCvcHelperKt.shouldLaunchCvcRecollectionScreen(this, saved)) {
                launchCvcRecollection(saved);
                return;
            }
        }
        checkout(value, CheckoutIdentifier.SheetBottomBuy);
    }

    public final void checkoutWithGooglePay() {
        checkout(PaymentSelection.GooglePay.INSTANCE, CheckoutIdentifier.SheetTopWallet);
    }

    public final void checkoutWithLink() {
        checkout(new PaymentSelection.Link(LinkExpressMode.DISABLED, null, null, 6, null), CheckoutIdentifier.SheetTopWallet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkoutWithLinkExpress() {
        checkout(new PaymentSelection.Link(LinkExpressMode.ENABLED_NO_WEB_FALLBACK, null, null, 6, null), CheckoutIdentifier.SheetTopWallet);
    }

    private final void checkout(PaymentSelection paymentSelection, CheckoutIdentifier identifier) {
        this.checkoutIdentifier = identifier;
        confirmPaymentSelection(paymentSelection);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void handlePaymentMethodSelected(PaymentSelection selection) {
        if (Intrinsics.areEqual(selection, getSelection$paymentsheet_release().getValue())) {
            return;
        }
        updateSelection(selection);
        if (selection != null) {
            getEventReporter().onSelectPaymentOption(selection);
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void clearErrorMessages() {
        if (this.viewState.getValue() instanceof PaymentSheetViewState.Reset) {
            this.viewState.setValue(new PaymentSheetViewState.Reset(null));
        }
    }

    private final void launchCvcRecollection(PaymentSelection.Saved selection) {
        this.cvcRecollectionHandler.launch(selection.getPaymentMethod(), new Function1() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentSheetViewModel.launchCvcRecollection$lambda$14(this.f$0, (CvcRecollectionData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchCvcRecollection$lambda$14(PaymentSheetViewModel paymentSheetViewModel, CvcRecollectionData cvcRecollectionData) {
        StripeIntent stripeIntent;
        Intrinsics.checkNotNullParameter(cvcRecollectionData, "cvcRecollectionData");
        CvcRecollectionInteractor.Factory factory = paymentSheetViewModel.cvcRecollectionInteractorFactory;
        String lastFour = cvcRecollectionData.getLastFour();
        if (lastFour == null) {
            lastFour = "";
        }
        CardBrand brand = cvcRecollectionData.getBrand();
        PaymentMethodMetadata value = paymentSheetViewModel.getPaymentMethodMetadata$paymentsheet_release().getValue();
        boolean z = false;
        if (value != null && (stripeIntent = value.getStripeIntent()) != null && !stripeIntent.isLiveMode()) {
            z = true;
        }
        PaymentSheetViewModel paymentSheetViewModel2 = paymentSheetViewModel;
        CvcRecollectionInteractor cvcRecollectionInteractorCreate = factory.create(new Args(lastFour, brand, "", z), paymentSheetViewModel.getProcessing(), ViewModelKt.getViewModelScope(paymentSheetViewModel2));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(paymentSheetViewModel2), null, null, new PaymentSheetViewModel$launchCvcRecollection$1$1(cvcRecollectionInteractorCreate, paymentSheetViewModel, null), 3, null);
        paymentSheetViewModel.getNavigationHandler().transitionTo(new PaymentSheetScreen.CvcRecollection(cvcRecollectionInteractorCreate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCvcCompletionState(CvcCompletionState completionState) {
        PaymentMethodOptionsParams.Card card;
        PaymentSelection value = getSelection$paymentsheet_release().getValue();
        PaymentSelection.Saved saved = value instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) value : null;
        if (saved != null) {
            if (completionState instanceof CvcCompletionState.Completed) {
                card = new PaymentMethodOptionsParams.Card(((CvcCompletionState.Completed) completionState).getCvc(), null, null, 6, null);
            } else {
                if (!Intrinsics.areEqual(completionState, CvcCompletionState.Incomplete.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                card = new PaymentMethodOptionsParams.Card("", null, null, 6, null);
            }
            updateSelection(new PaymentSelection.Saved(saved.getPaymentMethod(), saved.getWalletType(), card));
        }
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    protected void registerFromActivity(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.confirmationHandler.register(activityResultCaller, lifecycleOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSelection paymentSelectionWithCvcIfEnabled(PaymentSelection paymentSelection) {
        if (!(paymentSelection instanceof PaymentSelection.Saved)) {
            return paymentSelection;
        }
        PaymentSelection.Saved saved = (PaymentSelection.Saved) paymentSelection;
        if (!PaymentSheetViewModelCvcHelperKt.shouldAttachCvc(this, saved)) {
            return paymentSelection;
        }
        PaymentMethodOptionsParams paymentMethodOptionsParams = saved.getPaymentMethodOptionsParams();
        PaymentMethodOptionsParams.Card card = paymentMethodOptionsParams instanceof PaymentMethodOptionsParams.Card ? (PaymentMethodOptionsParams.Card) paymentMethodOptionsParams : null;
        PaymentSelection.Saved savedCopy$default = PaymentSelection.Saved.copy$default(saved, null, null, PaymentMethodOptionsParams.Card.copy$default(card == null ? new PaymentMethodOptionsParams.Card(null, null, null, 7, null) : card, getCvcControllerFlow$paymentsheet_release().getValue().getFieldValue().getValue(), null, null, null, 14, null), 3, null);
        updateSelection(savedCopy$default);
        return savedCopy$default;
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$confirmPaymentSelection$1", f = "PaymentSheetViewModel.kt", i = {0, 1, 1, 2}, l = {496, TypedValues.PositionType.TYPE_PERCENT_Y, 509, 533}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "option", "$this$launch"}, s = {"L$0", "L$0", "L$2", "L$0"})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$confirmPaymentSelection$1, reason: invalid class name and case insensitive filesystem */
    static final class C11031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSelection $paymentSelection;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11031(PaymentSelection paymentSelection, Continuation<? super C11031> continuation) {
            super(2, continuation);
            this.$paymentSelection = paymentSelection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11031 c11031 = PaymentSheetViewModel.this.new C11031(this.$paymentSelection, continuation);
            c11031.L$0 = obj;
            return c11031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
        
            if (r15.start(r7, r14) != r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0127, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r14) != r0) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            String str;
            PaymentSheetViewModel paymentSheetViewModel;
            ConfirmationHandler.Option option;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                this.L$0 = coroutineScope3;
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(ViewModelKt.getViewModelScope(PaymentSheetViewModel.this).getCoroutineContext(), new PaymentSheetViewModel$confirmPaymentSelection$1$confirmationOption$1(PaymentSheetViewModel.this, this.$paymentSelection, null), this);
                if (objWithContext != coroutine_suspended) {
                    coroutineScope = coroutineScope3;
                    obj = objWithContext;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ConfirmationHandler.Option option2 = (ConfirmationHandler.Option) this.L$2;
                paymentSheetViewModel = (PaymentSheetViewModel) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                option = option2;
                StripeIntent stripeIntent = (StripeIntent) obj;
                ConfirmationHandler confirmationHandler = paymentSheetViewModel.confirmationHandler;
                ConfirmationHandler.Args args = new ConfirmationHandler.Args(stripeIntent, option, paymentSheetViewModel.getConfig().getAppearance(), paymentSheetViewModel.getArgs().getInitializationMode$paymentsheet_release(), paymentSheetViewModel.getConfig().getShippingDetails());
                this.L$0 = coroutineScope2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
            } else {
                if (i == 3) {
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ConfirmationHandler.Option option3 = (ConfirmationHandler.Option) obj;
            if (option3 != null) {
                paymentSheetViewModel = PaymentSheetViewModel.this;
                this.L$0 = coroutineScope;
                this.L$1 = paymentSheetViewModel;
                this.L$2 = option3;
                this.label = 2;
                Object objAwaitStripeIntent = paymentSheetViewModel.awaitStripeIntent(this);
                if (objAwaitStripeIntent != coroutine_suspended) {
                    option = option3;
                    obj = objAwaitStripeIntent;
                    coroutineScope2 = coroutineScope;
                    StripeIntent stripeIntent2 = (StripeIntent) obj;
                    ConfirmationHandler confirmationHandler2 = paymentSheetViewModel.confirmationHandler;
                    ConfirmationHandler.Args args2 = new ConfirmationHandler.Args(stripeIntent2, option, paymentSheetViewModel.getConfig().getAppearance(), paymentSheetViewModel.getArgs().getInitializationMode$paymentsheet_release(), paymentSheetViewModel.getConfig().getShippingDetails());
                    this.L$0 = coroutineScope2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                }
            } else {
                PaymentSheetViewModel paymentSheetViewModel2 = PaymentSheetViewModel.this;
                PaymentSelection paymentSelection = this.$paymentSelection;
                paymentSheetViewModel2.setInProgressSelection(null);
                if (paymentSelection != null) {
                    str = "Cannot confirm using a " + Reflection.getOrCreateKotlinClass(paymentSelection.getClass()).getQualifiedName() + " payment selection!";
                    if (str == null) {
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(str);
                    if (paymentSelection != null || (unexpectedErrorEvent = ErrorReporter.UnexpectedErrorEvent.PAYMENT_SHEET_INVALID_PAYMENT_SELECTION_ON_CHECKOUT) == null) {
                        ErrorReporter.UnexpectedErrorEvent unexpectedErrorEvent = ErrorReporter.UnexpectedErrorEvent.PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT;
                    }
                    ErrorReporter.DefaultImpls.report$default(paymentSheetViewModel2.errorReporter, unexpectedErrorEvent, StripeException.INSTANCE.create(illegalStateException), null, 4, null);
                    CoroutineContext coroutineContext = ViewModelKt.getViewModelScope(paymentSheetViewModel2).getCoroutineContext();
                    PaymentSheetViewModel$confirmPaymentSelection$1$2$1 paymentSheetViewModel$confirmPaymentSelection$1$2$1 = new PaymentSheetViewModel$confirmPaymentSelection$1$2$1(paymentSheetViewModel2, illegalStateException, null);
                    this.L$0 = null;
                    this.label = 4;
                }
                str = "Cannot confirm without a payment selection!";
                IllegalStateException illegalStateException2 = new IllegalStateException(str);
                if (paymentSelection != null) {
                }
                ErrorReporter.UnexpectedErrorEvent unexpectedErrorEvent2 = ErrorReporter.UnexpectedErrorEvent.PAYMENT_SHEET_NO_PAYMENT_SELECTION_ON_CHECKOUT;
                ErrorReporter.DefaultImpls.report$default(paymentSheetViewModel2.errorReporter, unexpectedErrorEvent2, StripeException.INSTANCE.create(illegalStateException2), null, 4, null);
                CoroutineContext coroutineContext2 = ViewModelKt.getViewModelScope(paymentSheetViewModel2).getCoroutineContext();
                PaymentSheetViewModel$confirmPaymentSelection$1$2$1 paymentSheetViewModel$confirmPaymentSelection$1$2$12 = new PaymentSheetViewModel$confirmPaymentSelection$1$2$1(paymentSheetViewModel2, illegalStateException2, null);
                this.L$0 = null;
                this.label = 4;
            }
            return coroutine_suspended;
        }
    }

    private final void confirmPaymentSelection(PaymentSelection paymentSelection) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), getWorkContext(), null, new C11031(paymentSelection, null), 2, null);
    }

    private final void handlePaymentFailed(PaymentSheetConfirmationError error, ResolvableString message) {
        PaymentSelection inProgressSelection = getInProgressSelection();
        if (inProgressSelection != null) {
            getEventReporter().onPaymentFailure(inProgressSelection, error);
        }
        resetViewState(message);
    }

    private final void handlePaymentCompleted(StripeIntent intent, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean finishImmediately) {
        PaymentSelection.Saved inProgressSelection = getInProgressSelection();
        if (inProgressSelection != null) {
            getEventReporter().onPaymentSuccess(inProgressSelection, deferredIntentConfirmationType);
        }
        if (inProgressSelection != null && PaymentSelectionKt.isLink(inProgressSelection)) {
            getLinkHandler().logOut();
        }
        if (inProgressSelection instanceof PaymentSelection.New) {
            PaymentMethod paymentMethod = SelectionUtilsKt.canSave((PaymentSelection.New) inProgressSelection, this.args.getInitializationMode$paymentsheet_release()) ? intent.getPaymentMethod() : null;
            inProgressSelection = paymentMethod != null ? new PaymentSelection.Saved(paymentMethod, null, null, 6, null) : null;
        }
        if (inProgressSelection != null) {
            this.prefsRepository.savePaymentSelection(inProgressSelection);
        }
        setInProgressSelection(null);
        if (finishImmediately) {
            this._paymentSheetResult.tryEmit(PaymentSheetResult.Completed.INSTANCE);
        } else {
            this.viewState.setValue(new PaymentSheetViewState.FinishProcessing(new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentSheetViewModel.handlePaymentCompleted$lambda$21(this.f$0);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePaymentCompleted$lambda$21(PaymentSheetViewModel paymentSheetViewModel) {
        paymentSheetViewModel._paymentSheetResult.tryEmit(PaymentSheetResult.Completed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processConfirmationResult(ConfirmationHandler.Result result) {
        if (result instanceof ConfirmationHandler.Result.Succeeded) {
            ConfirmationHandler.Result.Succeeded succeeded = (ConfirmationHandler.Result.Succeeded) result;
            handlePaymentCompleted(succeeded.getIntent(), succeeded.getDeferredIntentConfirmationType(), false);
        } else if (result instanceof ConfirmationHandler.Result.Failed) {
            processConfirmationFailure((ConfirmationHandler.Result.Failed) result);
        } else {
            if (!(result instanceof ConfirmationHandler.Result.Canceled) && result != null) {
                throw new NoWhenBranchMatchedException();
            }
            resetViewState$default(this, null, 1, null);
        }
        setInProgressSelection(null);
    }

    private final void processConfirmationFailure(ConfirmationHandler.Result.Failed failure) {
        ConfirmationHandler.Result.Failed.ErrorType type = failure.getType();
        if (Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.Payment.INSTANCE) || Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.ExternalPaymentMethod.INSTANCE) || (type instanceof ConfirmationHandler.Result.Failed.ErrorType.GooglePay)) {
            PaymentSheetConfirmationError confirmationError = ConfirmationReportingUtilsKt.toConfirmationError(failure);
            if (confirmationError != null) {
                handlePaymentFailed(confirmationError, failure.getMessage());
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.Fatal.INSTANCE)) {
            onFatal(failure.getCause());
        } else {
            if (!Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.MerchantIntegration.INSTANCE) && !Intrinsics.areEqual(type, ConfirmationHandler.Result.Failed.ErrorType.Internal.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            onError(failure.getMessage());
        }
    }

    private final void onFatal(Throwable throwable) {
        this.logger.error("Payment Sheet error", throwable);
        this._paymentSheetResult.tryEmit(new PaymentSheetResult.Failed(throwable));
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onUserCancel() {
        getEventReporter().onDismiss();
        this._paymentSheetResult.tryEmit(PaymentSheetResult.Canceled.INSTANCE);
    }

    @Override // com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel
    public void onError(ResolvableString error) {
        resetViewState(error);
    }

    private final List<PaymentSheetScreen> determineInitialBackStack(PaymentMethodMetadata paymentMethodMetadata, CustomerStateHolder customerStateHolder) {
        Object addFirstPaymentMethod;
        if (getConfig().getPaymentMethodLayout$paymentsheet_release() != PaymentSheet.PaymentMethodLayout.Horizontal) {
            return VerticalModeInitialScreenFactory.INSTANCE.create(this, paymentMethodMetadata, customerStateHolder);
        }
        if (!customerStateHolder.getPaymentMethods().getValue().isEmpty()) {
            addFirstPaymentMethod = new PaymentSheetScreen.SelectSavedPaymentMethods(DefaultSelectSavedPaymentMethodsInteractor.INSTANCE.create(this, paymentMethodMetadata, customerStateHolder, getSavedPaymentMethodMutator()), getCvcRecollectionState$paymentsheet_release());
        } else {
            addFirstPaymentMethod = new PaymentSheetScreen.AddFirstPaymentMethod(DefaultAddPaymentMethodInteractor.INSTANCE.create(this, paymentMethodMetadata));
        }
        return CollectionsKt.listOf(addFirstPaymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitStripeIntent(Continuation<? super StripeIntent> continuation) {
        C11021 c11021;
        if (continuation instanceof C11021) {
            c11021 = (C11021) continuation;
            if ((c11021.label & Integer.MIN_VALUE) != 0) {
                c11021.label -= Integer.MIN_VALUE;
            } else {
                c11021 = new C11021(continuation);
            }
        }
        Object objFirst = c11021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11021.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow flowFilterNotNull = FlowKt.filterNotNull(getPaymentMethodMetadata$paymentsheet_release());
            c11021.label = 1;
            objFirst = FlowKt.first(flowFilterNotNull, c11021);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        return ((PaymentMethodMetadata) objFirst).getStripeIntent();
    }

    public final PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState getCvcRecollectionState$paymentsheet_release() {
        if (PaymentSheetViewModelCvcHelperKt.isCvcRecollectionEnabled(this)) {
            return new PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState.Required(getCvcControllerFlow$paymentsheet_release());
        }
        return PaymentSheetScreen.SelectSavedPaymentMethods.CvcRecollectionState.NotRequired.INSTANCE;
    }

    private final PaymentSheetViewState mapViewStateToCheckoutIdentifier(PaymentSheetViewState viewState, CheckoutIdentifier checkoutIdentifier) {
        if (this.checkoutIdentifier != checkoutIdentifier) {
            return null;
        }
        return viewState;
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "starterArgsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final Function0<PaymentSheetContractV2.Args> starterArgsSupplier;

        public Factory(Function0<PaymentSheetContractV2.Args> starterArgsSupplier) {
            Intrinsics.checkNotNullParameter(starterArgsSupplier, "starterArgsSupplier");
            this.starterArgsSupplier = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application applicationRequireApplication = CreationExtrasKtxKt.requireApplication(extras);
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentSheetContractV2.Args argsInvoke = this.starterArgsSupplier.invoke();
            PaymentSheetViewModel viewModel = DaggerPaymentSheetLauncherComponent.builder().application(applicationRequireApplication).savedStateHandle(savedStateHandleCreateSavedStateHandle).paymentElementCallbackIdentifier(argsInvoke.getPaymentElementCallbackIdentifier$paymentsheet_release()).build().getPaymentSheetViewModelSubcomponentBuilder().paymentSheetViewModelModule(new PaymentSheetViewModelModule(argsInvoke)).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create");
            return viewModel;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$CheckoutIdentifier;", "", "<init>", "(Ljava/lang/String;I)V", "SheetTopWallet", "SheetBottomBuy", "None", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutIdentifier {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutIdentifier[] $VALUES;
        public static final CheckoutIdentifier SheetTopWallet = new CheckoutIdentifier("SheetTopWallet", 0);
        public static final CheckoutIdentifier SheetBottomBuy = new CheckoutIdentifier("SheetBottomBuy", 1);
        public static final CheckoutIdentifier None = new CheckoutIdentifier("None", 2);

        private static final /* synthetic */ CheckoutIdentifier[] $values() {
            return new CheckoutIdentifier[]{SheetTopWallet, SheetBottomBuy, None};
        }

        public static EnumEntries<CheckoutIdentifier> getEntries() {
            return $ENTRIES;
        }

        private CheckoutIdentifier(String str, int i) {
        }

        static {
            CheckoutIdentifier[] checkoutIdentifierArr$values = $values();
            $VALUES = checkoutIdentifierArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(checkoutIdentifierArr$values);
        }

        public static CheckoutIdentifier valueOf(String str) {
            return (CheckoutIdentifier) Enum.valueOf(CheckoutIdentifier.class, str);
        }

        public static CheckoutIdentifier[] values() {
            return (CheckoutIdentifier[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Companion;", "", "<init>", "()V", "IN_PROGRESS_SELECTION", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
