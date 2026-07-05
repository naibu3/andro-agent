package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountUtilKt;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.AccountStatusKt;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.WalletType;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.ConfirmationOptionKtxKt;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.InitializedViaCompose;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionResult;
import com.stripe.android.paymentsheet.PaymentOptionResultCallback;
import com.stripe.android.paymentsheet.PaymentOptionsActivityResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetConfigurationKtxKt;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.PaymentSheetConfirmationError;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerConfigurationHandler;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.PaymentSelectionKt;
import com.stripe.android.paymentsheet.state.CustomerState;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import com.stripe.android.paymentsheet.ui.SepaMandateContract;
import com.stripe.android.paymentsheet.ui.SepaMandateResult;
import com.stripe.android.paymentsheet.utils.ConfirmationReportingUtilsKt;
import com.stripe.android.paymentsheet.utils.SelectionUtilsKt;
import com.stripe.android.uicore.utils.AnimationConstants;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DefaultFlowController.kt */
@FlowControllerScope
@Metadata(d1 = {"\u0000æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u0096\u00012\u00020\u0001:\u0006\u0094\u0001\u0095\u0001\u0096\u0001Bæ\u0001\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0019\u0010\f\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\b\b\u0001\u0010#\u001a\u00020$\u0012\b\b\u0001\u0010%\u001a\u00020$\u0012\b\b\u0001\u0010&\u001a\u00020'\u0012\u000e\b\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\b\b\u0001\u0010/\u001a\u00020'\u0012\b\b\u0001\u00100\u001a\u00020*¢\u0006\u0004\b1\u00102J\r\u0010I\u001a\u00020JH\u0017¢\u0006\u0002\u0010KJ\"\u0010L\u001a\u00020J2\u0006\u0010M\u001a\u00020*2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020QH\u0016J\"\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020*2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020QH\u0016J\"\u0010T\u001a\u00020J2\u0006\u0010U\u001a\u00020V2\b\u0010N\u001a\u0004\u0018\u00010O2\u0006\u0010P\u001a\u00020QH\u0016J \u0010W\u001a\u00020J2\u0006\u0010X\u001a\u00020?2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0002J\n\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\u001c\u0010[\u001a\u00020J2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020J0\rH\u0002J\b\u0010^\u001a\u00020JH\u0016J\"\u0010_\u001a\u00020'2\b\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020eH\u0002J\u001a\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020]2\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u000e\u0010h\u001a\u00020J2\u0006\u0010i\u001a\u00020jJ\u000e\u0010k\u001a\u00020J2\u0006\u0010i\u001a\u00020jJ\n\u0010l\u001a\u00020'*\u00020aJ\f\u0010m\u001a\u00020J*\u00020nH\u0002J\u001a\u0010o\u001a\u00020J2\b\u0010p\u001a\u0004\u0018\u00010q2\u0006\u0010r\u001a\u00020'H\u0002J\b\u0010s\u001a\u00020JH\u0016J(\u0010t\u001a\u00020J2\u0006\u0010`\u001a\u00020u2\u0006\u0010g\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010>\u001a\u00020?H\u0002J*\u0010y\u001a\u00020J2\b\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010g\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010>\u001a\u00020?H\u0007J\u0017\u0010z\u001a\u00020J2\b\u0010i\u001a\u0004\u0018\u00010{H\u0000¢\u0006\u0002\b|J\u0010\u0010}\u001a\u00020J2\u0006\u0010r\u001a\u00020'H\u0002J\u0010\u0010~\u001a\u00020J2\u0006\u0010i\u001a\u00020\u007fH\u0002J\u0013\u0010\u0080\u0001\u001a\u00020J2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0002J\u0012\u0010\u0083\u0001\u001a\u00020J2\u0007\u0010r\u001a\u00030\u0084\u0001H\u0002J=\u0010\u0085\u0001\u001a\u00020J2\b\u0010\u0086\u0001\u001a\u00030\u0087\u00012\f\b\u0002\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\b\u0002\u0010\u008a\u0001\u001a\u00020'2\t\b\u0002\u0010\u008b\u0001\u001a\u00020'H\u0000¢\u0006\u0003\b\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020J2\b\u0010\u008e\u0001\u001a\u00030\u008f\u0001H\u0000¢\u0006\u0003\b\u0090\u0001J!\u0010\u0091\u0001\u001a\u00020J2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u00012\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0002J\u000f\u0010\u0092\u0001\u001a\u00030\u0093\u0001*\u00030\u0087\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020704X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000209X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR(\u0010D\u001a\u0004\u0018\u00010C2\b\u0010B\u001a\u0004\u0018\u00010C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006\u0097\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "paymentOptionResultCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "prefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "context", "Landroid/content/Context;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "linkGateFactory", "Lcom/stripe/android/link/gate/LinkGate$Factory;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "flowControllerLinkLauncher", "Lcom/stripe/android/link/LinkPaymentLauncher;", "walletsButtonLinkLauncher", NamedConstantsKt.ENABLE_LOGGING, "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "", "configurationHandler", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "initializedViaCompose", "paymentElementCallbackIdentifier", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lkotlin/jvm/functions/Function1;Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/ActivityResultRegistryOwner;Landroid/content/Context;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;Lcom/stripe/android/link/gate/LinkGate$Factory;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/LinkPaymentLauncher;ZLjava/util/Set;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerConfigurationHandler;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ZLjava/lang/String;)V", "paymentOptionActivityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "sepaMandateActivityLauncher", "Lcom/stripe/android/paymentsheet/ui/SepaMandateContract$Args;", "flowControllerComponent", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "getFlowControllerComponent", "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;", "setFlowControllerComponent", "(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent;)V", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "value", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "shippingDetails", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "setShippingDetails", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "WalletButtons", "", "(Landroidx/compose/runtime/Composer;I)V", "configureWithPaymentIntent", "paymentIntentClientSecret", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "configureWithSetupIntent", "setupIntentClientSecret", "configureWithIntentConfiguration", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "configure", "mode", "getPaymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "withCurrentState", "block", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;", "presentPaymentOptions", "shouldPresentLinkInsteadOfPaymentOptions", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "linkAccountInfo", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "showPaymentOptionList", ServerProtocol.DIALOG_PARAM_STATE, "onLinkResultFromFlowController", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/link/LinkActivityResult;", "onLinkResultFromWalletsButton", "readyToPayWithLink", "updateLinkAccount", "Lcom/stripe/android/link/LinkAccountUpdate;", "updateLinkPaymentSelection", "linkPaymentMethod", "Lcom/stripe/android/link/LinkPaymentMethod;", "canceled", "confirm", "confirmSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "confirmPaymentSelection", "onPaymentOptionResult", "Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;", "onPaymentOptionResult$paymentsheet_release", "onPaymentSelection", "onIntentResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "savePaymentSelectionIfEligible", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "handleCancellation", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result$Canceled;", "onPaymentResult", "paymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", "shouldLog", "shouldResetOnCompleted", "onPaymentResult$paymentsheet_release", "onSepaMandateResult", "sepaMandateResult", "Lcom/stripe/android/paymentsheet/ui/SepaMandateResult;", "onSepaMandateResult$paymentsheet_release", "logPaymentResult", "convertToPaymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "Args", "State", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultFlowController implements PaymentSheet.FlowController {
    public static final String FLOW_CONTROLLER_LINK_LAUNCHER = "LinkPaymentLauncher_DefaultFlowController";
    public static final String WALLETS_BUTTON_LINK_LAUNCHER = "LinkPaymentLauncher_WalletsButton";
    private final FlowControllerConfigurationHandler configurationHandler;
    private final ConfirmationHandler confirmationHandler;
    private final Context context;
    private final boolean enableLogging;
    private final ErrorReporter errorReporter;
    private final EventReporter eventReporter;
    public FlowControllerComponent flowControllerComponent;
    private final LinkPaymentLauncher flowControllerLinkLauncher;
    private final boolean initializedViaCompose;
    private final LifecycleOwner lifecycleOwner;
    private final LinkAccountHolder linkAccountHolder;
    private final LinkGate.Factory linkGateFactory;
    private final LinkHandler linkHandler;
    private final String paymentElementCallbackIdentifier;
    private final ActivityResultLauncher<PaymentOptionContract.Args> paymentOptionActivityLauncher;
    private final PaymentOptionFactory paymentOptionFactory;
    private final PaymentOptionResultCallback paymentOptionResultCallback;
    private final PaymentSheetResultCallback paymentResultCallback;
    private final Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory;
    private final Set<String> productUsage;
    private final ActivityResultLauncher<SepaMandateContract.Args> sepaMandateActivityLauncher;
    private final FlowControllerViewModel viewModel;
    private final CoroutineScope viewModelScope;
    private final LinkPaymentLauncher walletsButtonLinkLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DefaultFlowController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[LinkActivityResult.Canceled.Reason.values().length];
            try {
                iArr[LinkActivityResult.Canceled.Reason.BackPressed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkActivityResult.Canceled.Reason.LoggedOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkActivityResult.Canceled.Reason.PayAnotherWay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentSelection.Saved.WalletType.values().length];
            try {
                iArr2[PaymentSelection.Saved.WalletType.GooglePay.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PaymentSelection.Saved.WalletType.Link.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConfirmationHandler.Result.Canceled.Action.values().length];
            try {
                iArr3[ConfirmationHandler.Result.Canceled.Action.InformCancellation.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ConfirmationHandler.Result.Canceled.Action.ModifyPaymentDetails.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ConfirmationHandler.Result.Canceled.Action.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Inject
    public DefaultFlowController(CoroutineScope viewModelScope, LifecycleOwner lifecycleOwner, PaymentOptionFactory paymentOptionFactory, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentResultCallback, Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory, ActivityResultCaller activityResultCaller, ActivityResultRegistryOwner activityResultRegistryOwner, Context context, EventReporter eventReporter, FlowControllerViewModel viewModel, ConfirmationHandler confirmationHandler, LinkGate.Factory linkGateFactory, LinkHandler linkHandler, LinkAccountHolder linkAccountHolder, @Named(FLOW_CONTROLLER_LINK_LAUNCHER) LinkPaymentLauncher flowControllerLinkLauncher, @Named(WALLETS_BUTTON_LINK_LAUNCHER) LinkPaymentLauncher walletsButtonLinkLauncher, @Named(NamedConstantsKt.ENABLE_LOGGING) boolean z, @Named(com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsage, FlowControllerConfigurationHandler configurationHandler, ErrorReporter errorReporter, @InitializedViaCompose boolean z2, @PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(paymentOptionFactory, "paymentOptionFactory");
        Intrinsics.checkNotNullParameter(paymentOptionResultCallback, "paymentOptionResultCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        Intrinsics.checkNotNullParameter(prefsRepositoryFactory, "prefsRepositoryFactory");
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(confirmationHandler, "confirmationHandler");
        Intrinsics.checkNotNullParameter(linkGateFactory, "linkGateFactory");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        Intrinsics.checkNotNullParameter(flowControllerLinkLauncher, "flowControllerLinkLauncher");
        Intrinsics.checkNotNullParameter(walletsButtonLinkLauncher, "walletsButtonLinkLauncher");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(configurationHandler, "configurationHandler");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.viewModelScope = viewModelScope;
        this.lifecycleOwner = lifecycleOwner;
        this.paymentOptionFactory = paymentOptionFactory;
        this.paymentOptionResultCallback = paymentOptionResultCallback;
        this.paymentResultCallback = paymentResultCallback;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.context = context;
        this.eventReporter = eventReporter;
        this.viewModel = viewModel;
        this.confirmationHandler = confirmationHandler;
        this.linkGateFactory = linkGateFactory;
        this.linkHandler = linkHandler;
        this.linkAccountHolder = linkAccountHolder;
        this.flowControllerLinkLauncher = flowControllerLinkLauncher;
        this.walletsButtonLinkLauncher = walletsButtonLinkLauncher;
        this.enableLogging = z;
        this.productUsage = productUsage;
        this.configurationHandler = configurationHandler;
        this.errorReporter = errorReporter;
        this.initializedViaCompose = z2;
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        confirmationHandler.register(activityResultCaller, lifecycleOwner);
        this.paymentOptionActivityLauncher = activityResultCaller.registerForActivityResult(new PaymentOptionContract(), new AnonymousClass1());
        this.sepaMandateActivityLauncher = activityResultCaller.registerForActivityResult(new SepaMandateContract(), new AnonymousClass2());
        flowControllerLinkLauncher.register(FLOW_CONTROLLER_LINK_LAUNCHER, activityResultRegistryOwner.getActivityResultRegistry(), new AnonymousClass3(this));
        walletsButtonLinkLauncher.register(WALLETS_BUTTON_LINK_LAUNCHER, activityResultRegistryOwner.getActivityResultRegistry(), new AnonymousClass4(this));
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.5
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                DefaultFlowController.this.paymentOptionActivityLauncher.unregister();
                DefaultFlowController.this.sepaMandateActivityLauncher.unregister();
                DefaultFlowController.this.walletsButtonLinkLauncher.unregister();
                DefaultFlowController.this.flowControllerLinkLauncher.unregister();
                PaymentElementCallbackReferences.INSTANCE.remove(DefaultFlowController.this.paymentElementCallbackIdentifier);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass6(null), 3, null);
    }

    public final FlowControllerComponent getFlowControllerComponent() {
        FlowControllerComponent flowControllerComponent = this.flowControllerComponent;
        if (flowControllerComponent != null) {
            return flowControllerComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flowControllerComponent");
        return null;
    }

    public final void setFlowControllerComponent(FlowControllerComponent flowControllerComponent) {
        Intrinsics.checkNotNullParameter(flowControllerComponent, "<set-?>");
        this.flowControllerComponent = flowControllerComponent;
    }

    private final PaymentElementLoader.InitializationMode getInitializationMode() {
        FlowControllerConfigurationHandler.ConfigureRequest previousConfigureRequest = this.viewModel.getPreviousConfigureRequest();
        if (previousConfigureRequest != null) {
            return previousConfigureRequest.getInitializationMode();
        }
        return null;
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public AddressDetails getShippingDetails() {
        PaymentSheet.Configuration config;
        State state = this.viewModel.getState();
        if (state == null || (config = state.getConfig()) == null) {
            return null;
        }
        return config.getShippingDetails();
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void setShippingDetails(AddressDetails addressDetails) {
        State state = this.viewModel.getState();
        if (state != null) {
            this.viewModel.setState(State.copy$default(state, null, state.getConfig().newBuilder$paymentsheet_release().shippingDetails(addressDetails).build(), false, 5, null));
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 implements ActivityResultCallback, FunctionAdapter {
        AnonymousClass1() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, DefaultFlowController.this, DefaultFlowController.class, "onPaymentOptionResult", "onPaymentOptionResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/PaymentOptionsActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(PaymentOptionsActivityResult paymentOptionsActivityResult) {
            DefaultFlowController.this.onPaymentOptionResult$paymentsheet_release(paymentOptionsActivityResult);
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 implements ActivityResultCallback, FunctionAdapter {
        AnonymousClass2() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, DefaultFlowController.this, DefaultFlowController.class, "onSepaMandateResult", "onSepaMandateResult$paymentsheet_release(Lcom/stripe/android/paymentsheet/ui/SepaMandateResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(SepaMandateResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            DefaultFlowController.this.onSepaMandateResult$paymentsheet_release(p0);
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<LinkActivityResult, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, DefaultFlowController.class, "onLinkResultFromFlowController", "onLinkResultFromFlowController(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LinkActivityResult linkActivityResult) {
            invoke2(linkActivityResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkActivityResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DefaultFlowController) this.receiver).onLinkResultFromFlowController(p0);
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<LinkActivityResult, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, DefaultFlowController.class, "onLinkResultFromWalletsButton", "onLinkResultFromWalletsButton(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LinkActivityResult linkActivityResult) {
            invoke2(linkActivityResult);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkActivityResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DefaultFlowController) this.receiver).onLinkResultFromWalletsButton(p0);
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$6", f = "DefaultFlowController.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultFlowController.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DefaultFlowController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$6$1", f = "DefaultFlowController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<ConfirmationHandler.State, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultFlowController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DefaultFlowController defaultFlowController, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = defaultFlowController;
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
                if (!(state instanceof ConfirmationHandler.State.Idle) && !(state instanceof ConfirmationHandler.State.Confirming)) {
                    if (state instanceof ConfirmationHandler.State.Complete) {
                        this.this$0.onIntentResult(((ConfirmationHandler.State.Complete) state).getResult());
                    } else {
                        throw new NoWhenBranchMatchedException();
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
                if (FlowKt.collectLatest(DefaultFlowController.this.confirmationHandler.getState(), new AnonymousClass1(DefaultFlowController.this, null), this) == coroutine_suspended) {
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

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void WalletButtons(Composer composer, int i) {
        composer.startReplaceGroup(-484216348);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-484216348, i, -1, "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.WalletButtons (DefaultFlowController.kt:182)");
        }
        this.viewModel.getFlowControllerStateComponent().getWalletButtonsContent().Content(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithPaymentIntent(String paymentIntentClientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        PaymentElementLoader.InitializationMode.PaymentIntent paymentIntent = new PaymentElementLoader.InitializationMode.PaymentIntent(paymentIntentClientSecret);
        if (configuration == null) {
            configuration = PaymentSheet.Configuration.INSTANCE.m8222default(this.context);
        }
        configure(paymentIntent, configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithSetupIntent(String setupIntentClientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        Intrinsics.checkNotNullParameter(callback, "callback");
        PaymentElementLoader.InitializationMode.SetupIntent setupIntent = new PaymentElementLoader.InitializationMode.SetupIntent(setupIntentClientSecret);
        if (configuration == null) {
            configuration = PaymentSheet.Configuration.INSTANCE.m8222default(this.context);
        }
        configure(setupIntent, configuration, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void configureWithIntentConfiguration(PaymentSheet.IntentConfiguration intentConfiguration, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        PaymentElementLoader.InitializationMode.DeferredIntent deferredIntent = new PaymentElementLoader.InitializationMode.DeferredIntent(intentConfiguration);
        if (configuration == null) {
            configuration = PaymentSheet.Configuration.INSTANCE.m8222default(this.context);
        }
        configure(deferredIntent, configuration, callback);
    }

    private final void configure(PaymentElementLoader.InitializationMode mode, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback callback) {
        this.configurationHandler.configure(this.viewModelScope, mode, configuration, this.initializedViaCompose, callback);
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public PaymentOption getPaymentOption() {
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        if (paymentSelection != null) {
            return this.paymentOptionFactory.create(paymentSelection);
        }
        return null;
    }

    private final void withCurrentState(Function1<? super State, Unit> block) {
        State state = this.viewModel.getState();
        if (state == null) {
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling presentPaymentOptions().")));
        } else if (!this.configurationHandler.isConfigured()) {
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(new IllegalStateException("FlowController is not configured, or has a configuration update in flight.")));
        } else {
            block.invoke(state);
        }
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void presentPaymentOptions() {
        withCurrentState(new Function1() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultFlowController.presentPaymentOptions$lambda$1(this.f$0, (DefaultFlowController.State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit presentPaymentOptions$lambda$1(DefaultFlowController defaultFlowController, State state) {
        LinkPaymentMethod selectedPayment;
        Intrinsics.checkNotNullParameter(state, "state");
        LinkConfiguration linkConfiguration = state.getPaymentSheetState().getLinkConfiguration();
        PaymentSelection paymentSelection = defaultFlowController.viewModel.getPaymentSelection();
        LinkAccountUpdate.Value value = defaultFlowController.linkAccountHolder.getLinkAccountInfo().getValue();
        if (linkConfiguration != null && defaultFlowController.shouldPresentLinkInsteadOfPaymentOptions(paymentSelection, value, linkConfiguration)) {
            LinkPaymentLauncher linkPaymentLauncher = defaultFlowController.flowControllerLinkLauncher;
            LinkExpressMode linkExpressMode = LinkExpressMode.ENABLED;
            ConsumerPaymentDetails.PaymentDetails details = null;
            PaymentSelection.Link link = paymentSelection instanceof PaymentSelection.Link ? (PaymentSelection.Link) paymentSelection : null;
            if (link != null && (selectedPayment = link.getSelectedPayment()) != null) {
                details = selectedPayment.getDetails();
            }
            linkPaymentLauncher.present(linkConfiguration, value, new LinkLaunchMode.PaymentMethodSelection(details, false, null, 6, null), linkExpressMode);
        } else {
            defaultFlowController.showPaymentOptionList(state, paymentSelection);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldPresentLinkInsteadOfPaymentOptions(PaymentSelection paymentSelection, LinkAccountUpdate.Value linkAccountInfo, LinkConfiguration linkConfiguration) {
        PaymentMethod paymentMethod;
        boolean z;
        if (paymentSelection == null || !PaymentSelectionKt.isLink(paymentSelection)) {
            PaymentSelection.Saved saved = paymentSelection instanceof PaymentSelection.Saved ? (PaymentSelection.Saved) paymentSelection : null;
            z = (saved == null || (paymentMethod = saved.getPaymentMethod()) == null || !paymentMethod.isLinkPassthroughMode()) ? false : true;
        }
        State state = this.viewModel.getState();
        return (state == null || !state.getDeclinedLink2FA()) && z && linkAccountInfo.getAccount() != null && this.linkGateFactory.create(linkConfiguration).getShowRuxInFlowController();
    }

    private final void showPaymentOptionList(State state, PaymentSelection paymentSelection) {
        ArrayList allowedWalletTypes;
        PaymentSheetState.Full fullCopy$default = PaymentSheetState.Full.copy$default(state.getPaymentSheetState(), null, null, paymentSelection, null, null, 27, null);
        PaymentSheet.Configuration config = state.getConfig();
        boolean z = this.enableLogging;
        Set<String> set = this.productUsage;
        LinkAccountUpdate.Value value = this.linkAccountHolder.getLinkAccountInfo().getValue();
        if (this.viewModel.getWalletButtonsRendered()) {
            EnumEntries<WalletType> entries = WalletType.getEntries();
            ArrayList arrayList = new ArrayList();
            for (WalletType walletType : entries) {
                if (!PaymentSheetConfigurationKtxKt.getAllowedWalletTypes(state.getConfig().getWalletButtons$paymentsheet_release()).contains(walletType)) {
                    arrayList.add(walletType);
                }
            }
            allowedWalletTypes = arrayList;
        } else {
            allowedWalletTypes = PaymentSheetConfigurationKtxKt.getAllowedWalletTypes(state.getConfig().getWalletButtons$paymentsheet_release());
        }
        PaymentOptionContract.Args args = new PaymentOptionContract.Args(fullCopy$default, config, value, z, allowedWalletTypes, set, this.paymentElementCallbackIdentifier);
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(this.viewModel.getApplication(), AnimationConstants.INSTANCE.getFADE_IN(), AnimationConstants.INSTANCE.getFADE_OUT());
        Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        try {
            this.paymentOptionActivityLauncher.launch(args, activityOptionsCompatMakeCustomAnimation);
        } catch (IllegalStateException e) {
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(new IllegalStateException("The host activity is not in a valid state (" + this.lifecycleOwner.getLifecycle().getState() + ").", e)));
        }
    }

    public final void onLinkResultFromFlowController(LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LinkAccountUpdate linkAccountUpdate = result.getLinkAccountUpdate();
        if (linkAccountUpdate != null) {
            updateLinkAccount(linkAccountUpdate);
        }
        if ((result instanceof LinkActivityResult.PaymentMethodObtained) || (result instanceof LinkActivityResult.Failed)) {
            return;
        }
        if (!(result instanceof LinkActivityResult.Canceled)) {
            if (!(result instanceof LinkActivityResult.Completed)) {
                throw new NoWhenBranchMatchedException();
            }
            updateLinkPaymentSelection(((LinkActivityResult.Completed) result).getSelectedPayment(), false);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((LinkActivityResult.Canceled) result).getReason().ordinal()];
        if (i == 1) {
            withCurrentState(new Function1() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultFlowController.onLinkResultFromFlowController$lambda$4(this.f$0, (DefaultFlowController.State) obj);
                }
            });
            return;
        }
        if (i == 2) {
            updateLinkPaymentSelection(null, true);
            withCurrentState(new Function1() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultFlowController.onLinkResultFromFlowController$lambda$5(this.f$0, (DefaultFlowController.State) obj);
                }
            });
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            withCurrentState(new Function1() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultFlowController.onLinkResultFromFlowController$lambda$6(this.f$0, (DefaultFlowController.State) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLinkResultFromFlowController$lambda$4(DefaultFlowController defaultFlowController, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LinkAccount account = defaultFlowController.linkAccountHolder.getLinkAccountInfo().getValue().getAccount();
        if ((account != null ? account.getAccountStatus() : null) == AccountStatus.VerificationStarted) {
            defaultFlowController.viewModel.updateState(new Function1() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DefaultFlowController.onLinkResultFromFlowController$lambda$4$lambda$3((DefaultFlowController.State) obj);
                }
            });
        }
        PaymentSelection paymentSelection = defaultFlowController.viewModel.getPaymentSelection();
        if (paymentSelection != null && !defaultFlowController.readyToPayWithLink(paymentSelection)) {
            defaultFlowController.showPaymentOptionList(it, defaultFlowController.viewModel.getPaymentSelection());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State onLinkResultFromFlowController$lambda$4$lambda$3(State state) {
        if (state != null) {
            return State.copy$default(state, null, null, true, 3, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLinkResultFromFlowController$lambda$5(DefaultFlowController defaultFlowController, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        defaultFlowController.showPaymentOptionList(it, defaultFlowController.viewModel.getPaymentSelection());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLinkResultFromFlowController$lambda$6(DefaultFlowController defaultFlowController, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        defaultFlowController.showPaymentOptionList(it, defaultFlowController.viewModel.getPaymentSelection());
        return Unit.INSTANCE;
    }

    public final void onLinkResultFromWalletsButton(LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LinkAccountUpdate linkAccountUpdate = result.getLinkAccountUpdate();
        if (linkAccountUpdate != null) {
            updateLinkAccount(linkAccountUpdate);
        }
        this.viewModel.getFlowControllerStateComponent().getLinkInlineInteractor().onLinkResult();
        if ((result instanceof LinkActivityResult.PaymentMethodObtained) || (result instanceof LinkActivityResult.Failed)) {
            return;
        }
        if (!(result instanceof LinkActivityResult.Canceled)) {
            if (!(result instanceof LinkActivityResult.Completed)) {
                throw new NoWhenBranchMatchedException();
            }
            PaymentSelection.Link link = new PaymentSelection.Link(null, ((LinkActivityResult.Completed) result).getSelectedPayment(), null, 5, null);
            this.viewModel.setPaymentSelection(link);
            this.paymentOptionResultCallback.onPaymentOptionResult(new PaymentOptionResult(this.paymentOptionFactory.create(link), false));
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((LinkActivityResult.Canceled) result).getReason().ordinal()];
        if (i != 1) {
            if (i == 2) {
                updateLinkPaymentSelection(null, true);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                withCurrentState(new Function1() { // from class: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DefaultFlowController.onLinkResultFromWalletsButton$lambda$7(this.f$0, (DefaultFlowController.State) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLinkResultFromWalletsButton$lambda$7(DefaultFlowController defaultFlowController, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        defaultFlowController.showPaymentOptionList(it, defaultFlowController.viewModel.getPaymentSelection());
        return Unit.INSTANCE;
    }

    public final boolean readyToPayWithLink(PaymentSelection paymentSelection) {
        Intrinsics.checkNotNullParameter(paymentSelection, "<this>");
        if (paymentSelection instanceof PaymentSelection.Link) {
            return ((PaymentSelection.Link) paymentSelection).getSelectedPayment() != null;
        }
        return PaymentSelectionKt.isLink(paymentSelection);
    }

    private final void updateLinkAccount(LinkAccountUpdate linkAccountUpdate) {
        AccountStatus accountStatus;
        LinkAccountUtilKt.updateLinkAccount(linkAccountUpdate, this.linkAccountHolder);
        if (linkAccountUpdate instanceof LinkAccountUpdate.Value) {
            State state = this.viewModel.getState();
            if (state == null) {
                return;
            }
            PaymentMethodMetadata paymentMethodMetadata = state.getPaymentSheetState().getPaymentMethodMetadata();
            LinkAccount account = ((LinkAccountUpdate.Value) linkAccountUpdate).getAccount();
            if (account == null || (accountStatus = account.getAccountStatus()) == null) {
                accountStatus = AccountStatus.SignedOut;
            }
            LinkState linkState = paymentMethodMetadata.getLinkState();
            this.viewModel.setState(State.copyPaymentSheetState$default(state, null, null, PaymentMethodMetadata.copy$default(paymentMethodMetadata, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, linkState != null ? LinkState.copy$default(linkState, null, AccountStatusKt.toLoginState(accountStatus), null, 5, null) : null, null, null, null, null, null, null, 66584575, null), 3, null));
            return;
        }
        if (!Intrinsics.areEqual(linkAccountUpdate, LinkAccountUpdate.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void updateLinkPaymentSelection(LinkPaymentMethod linkPaymentMethod, boolean canceled) {
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        if (paymentSelection instanceof PaymentSelection.Link) {
            PaymentSelection.Link linkCopy$default = PaymentSelection.Link.copy$default((PaymentSelection.Link) paymentSelection, null, linkPaymentMethod, null, 5, null);
            this.viewModel.setPaymentSelection(linkCopy$default);
            this.paymentOptionResultCallback.onPaymentOptionResult(new PaymentOptionResult(this.paymentOptionFactory.create(linkCopy$default), canceled));
        }
    }

    @Override // com.stripe.android.paymentsheet.PaymentSheet.FlowController
    public void confirm() {
        State state = this.viewModel.getState();
        if (state == null) {
            throw new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling confirm().".toString());
        }
        if (!this.configurationHandler.isConfigured()) {
            onPaymentResult$paymentsheet_release$default(this, new PaymentResult.Failed(new IllegalStateException("FlowController.confirm() can only be called if the most recent call to configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() has completed successfully.")), null, false, false, 14, null);
            return;
        }
        PaymentElementLoader.InitializationMode initializationMode = getInitializationMode();
        if (initializationMode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        if ((paymentSelection instanceof PaymentSelection.Link) || (paymentSelection instanceof PaymentSelection.New.LinkInline) || (paymentSelection instanceof PaymentSelection.GooglePay) || (paymentSelection instanceof PaymentSelection.ExternalPaymentMethod) || (paymentSelection instanceof PaymentSelection.CustomPaymentMethod) || (paymentSelection instanceof PaymentSelection.New) || (paymentSelection instanceof PaymentSelection.ShopPay) || paymentSelection == null) {
            confirmPaymentSelection(paymentSelection, state.getPaymentSheetState(), state.getConfig().getAppearance(), initializationMode);
        } else {
            if (!(paymentSelection instanceof PaymentSelection.Saved)) {
                throw new NoWhenBranchMatchedException();
            }
            confirmSavedPaymentMethod((PaymentSelection.Saved) paymentSelection, state.getPaymentSheetState(), state.getConfig().getAppearance(), initializationMode);
        }
    }

    private final void confirmSavedPaymentMethod(PaymentSelection.Saved paymentSelection, PaymentSheetState.Full state, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode) {
        PaymentSelection paymentSelection2;
        if (paymentSelection.getPaymentMethod().type == PaymentMethod.Type.SepaDebit && (paymentSelection2 = this.viewModel.getPaymentSelection()) != null && !paymentSelection2.getHasAcknowledgedSepaMandate()) {
            this.sepaMandateActivityLauncher.launch(new SepaMandateContract.Args(state.getConfig().getMerchantDisplayName()));
        } else {
            confirmPaymentSelection(paymentSelection, state, appearance, initializationMode);
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmPaymentSelection$1", f = "DefaultFlowController.kt", i = {0}, l = {540}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$confirmPaymentSelection$1, reason: invalid class name and case insensitive filesystem */
    static final class C11251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PaymentSheet.Appearance $appearance;
        final /* synthetic */ PaymentElementLoader.InitializationMode $initializationMode;
        final /* synthetic */ PaymentSelection $paymentSelection;
        final /* synthetic */ PaymentSheetState.Full $state;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultFlowController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11251(PaymentSelection paymentSelection, PaymentSheetState.Full full, DefaultFlowController defaultFlowController, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode, Continuation<? super C11251> continuation) {
            super(2, continuation);
            this.$paymentSelection = paymentSelection;
            this.$state = full;
            this.this$0 = defaultFlowController;
            this.$appearance = appearance;
            this.$initializationMode = initializationMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11251 c11251 = new C11251(this.$paymentSelection, this.$state, this.this$0, this.$appearance, this.$initializationMode, continuation);
            c11251.L$0 = obj;
            return c11251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PaymentSelection paymentSelection = this.$paymentSelection;
                ConfirmationHandler.Option confirmationOption = paymentSelection != null ? ConfirmationOptionKtxKt.toConfirmationOption(paymentSelection, this.$state.getConfig(), this.$state.getLinkConfiguration()) : null;
                if (confirmationOption != null) {
                    PaymentSheetState.Full full = this.$state;
                    DefaultFlowController defaultFlowController = this.this$0;
                    PaymentSheet.Appearance appearance = this.$appearance;
                    PaymentElementLoader.InitializationMode initializationMode = this.$initializationMode;
                    StripeIntent stripeIntent = full.getStripeIntent();
                    if (stripeIntent != null) {
                        ConfirmationHandler confirmationHandler = defaultFlowController.confirmationHandler;
                        ConfirmationHandler.Args args = new ConfirmationHandler.Args(stripeIntent, confirmationOption, appearance, initializationMode, full.getConfig().getShippingDetails());
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        if (confirmationHandler.start(args, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    PaymentSelection paymentSelection2 = this.$paymentSelection;
                    DefaultFlowController defaultFlowController2 = this.this$0;
                    if (paymentSelection2 != null) {
                        String str = "Cannot confirm using a " + Reflection.getOrCreateKotlinClass(paymentSelection2.getClass()).getQualifiedName() + " payment selection!";
                        if (str == null) {
                            str = "Cannot confirm without a payment selection!";
                        }
                        IllegalStateException illegalStateException = new IllegalStateException(str);
                        if (paymentSelection2 != null) {
                            ErrorReporter.DefaultImpls.report$default(defaultFlowController2.errorReporter, ErrorReporter.UnexpectedErrorEvent.FLOW_CONTROLLER_INVALID_PAYMENT_SELECTION_ON_CHECKOUT, StripeException.INSTANCE.create(illegalStateException), null, 4, null);
                        }
                        IllegalStateException illegalStateException2 = illegalStateException;
                        defaultFlowController2.onIntentResult(new ConfirmationHandler.Result.Failed(illegalStateException2, ExceptionKtKt.stripeErrorMessage(illegalStateException2), ConfirmationHandler.Result.Failed.ErrorType.Internal.INSTANCE));
                    }
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

    public final void confirmPaymentSelection(PaymentSelection paymentSelection, PaymentSheetState.Full state, PaymentSheet.Appearance appearance, PaymentElementLoader.InitializationMode initializationMode) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        BuildersKt__Builders_commonKt.launch$default(this.viewModelScope, null, null, new C11251(paymentSelection, state, this, appearance, initializationMode, null), 3, null);
    }

    public final /* synthetic */ void onPaymentOptionResult$paymentsheet_release(PaymentOptionsActivityResult result) {
        List<PaymentMethod> paymentMethods;
        State stateCopyPaymentSheetState$default;
        LinkAccountUpdate.Value linkAccountInfo;
        if (result != null && (linkAccountInfo = result.getLinkAccountInfo()) != null) {
            this.linkAccountHolder.set(linkAccountInfo);
        }
        if (result != null && (paymentMethods = result.getPaymentMethods()) != null) {
            State state = this.viewModel.getState();
            FlowControllerViewModel flowControllerViewModel = this.viewModel;
            if (state != null) {
                CustomerState customer = state.getPaymentSheetState().getCustomer();
                stateCopyPaymentSheetState$default = State.copyPaymentSheetState$default(state, null, customer != null ? CustomerState.copy$default(customer, null, null, null, paymentMethods, null, 23, null) : null, null, 5, null);
            } else {
                stateCopyPaymentSheetState$default = null;
            }
            flowControllerViewModel.setState(stateCopyPaymentSheetState$default);
        }
        if (result instanceof PaymentOptionsActivityResult.Succeeded) {
            FlowControllerViewModel flowControllerViewModel2 = this.viewModel;
            PaymentSelection paymentSelection = ((PaymentOptionsActivityResult.Succeeded) result).getPaymentSelection();
            paymentSelection.setHasAcknowledgedSepaMandate(true);
            flowControllerViewModel2.setPaymentSelection(paymentSelection);
            onPaymentSelection(false);
            return;
        }
        if (result != null && !(result instanceof PaymentOptionsActivityResult.Canceled)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentOptionsActivityResult.Canceled canceled = (PaymentOptionsActivityResult.Canceled) result;
        this.viewModel.setPaymentSelection(canceled != null ? canceled.getPaymentSelection() : null);
        onPaymentSelection(true);
    }

    private final void onPaymentSelection(boolean canceled) {
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        this.paymentOptionResultCallback.onPaymentOptionResult(new PaymentOptionResult(paymentSelection != null ? this.paymentOptionFactory.create(paymentSelection) : null, canceled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIntentResult(ConfirmationHandler.Result result) {
        PaymentSelection paymentSelection;
        if (result instanceof ConfirmationHandler.Result.Succeeded) {
            ConfirmationHandler.Result.Succeeded succeeded = (ConfirmationHandler.Result.Succeeded) result;
            savePaymentSelectionIfEligible(succeeded.getIntent());
            PaymentSelection paymentSelection2 = this.viewModel.getPaymentSelection();
            if (paymentSelection2 != null) {
                this.eventReporter.onPaymentSuccess(paymentSelection2, succeeded.getDeferredIntentConfirmationType());
            }
            onPaymentResult$paymentsheet_release(PaymentResult.Completed.INSTANCE, succeeded.getDeferredIntentConfirmationType(), false, succeeded.getCompletedFullPaymentFlow());
            return;
        }
        if (result instanceof ConfirmationHandler.Result.Failed) {
            ConfirmationHandler.Result.Failed failed = (ConfirmationHandler.Result.Failed) result;
            PaymentSheetConfirmationError confirmationError = ConfirmationReportingUtilsKt.toConfirmationError(failed);
            if (confirmationError != null && (paymentSelection = this.viewModel.getPaymentSelection()) != null) {
                this.eventReporter.onPaymentFailure(paymentSelection, confirmationError);
            }
            onPaymentResult$paymentsheet_release$default(this, new PaymentResult.Failed(failed.getCause()), null, false, false, 8, null);
            return;
        }
        if (!(result instanceof ConfirmationHandler.Result.Canceled)) {
            throw new NoWhenBranchMatchedException();
        }
        handleCancellation((ConfirmationHandler.Result.Canceled) result);
    }

    private final void savePaymentSelectionIfEligible(StripeIntent stripeIntent) {
        PaymentSheet.Configuration config;
        PaymentSelection.GooglePay paymentSelection = this.viewModel.getPaymentSelection();
        PaymentElementLoader.InitializationMode initializationMode = getInitializationMode();
        PaymentSheet.CustomerConfiguration customer = null;
        if (paymentSelection instanceof PaymentSelection.New) {
            PaymentMethod paymentMethod = (initializationMode == null || !SelectionUtilsKt.canSave((PaymentSelection.New) paymentSelection, initializationMode)) ? null : stripeIntent.getPaymentMethod();
            paymentSelection = paymentMethod != null ? new PaymentSelection.Saved(paymentMethod, null, null, 6, null) : null;
        } else if (paymentSelection instanceof PaymentSelection.Saved) {
            PaymentSelection.Saved.WalletType walletType = ((PaymentSelection.Saved) paymentSelection).getWalletType();
            int i = walletType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[walletType.ordinal()];
            if (i == 1) {
                paymentSelection = PaymentSelection.GooglePay.INSTANCE;
            } else if (i == 2) {
                paymentSelection = new PaymentSelection.Link(null, null, null, 7, null);
            }
        }
        if (paymentSelection != null) {
            Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> function1 = this.prefsRepositoryFactory;
            State state = this.viewModel.getState();
            if (state != null && (config = state.getConfig()) != null) {
                customer = config.getCustomer();
            }
            function1.invoke(customer).savePaymentSelection(paymentSelection);
        }
    }

    private final void handleCancellation(ConfirmationHandler.Result.Canceled canceled) {
        int i = WhenMappings.$EnumSwitchMapping$2[canceled.getAction().ordinal()];
        if (i == 1) {
            onPaymentResult$paymentsheet_release$default(this, PaymentResult.Canceled.INSTANCE, null, false, false, 8, null);
        } else if (i == 2) {
            presentPaymentOptions();
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ void onPaymentResult$paymentsheet_release$default(DefaultFlowController defaultFlowController, PaymentResult paymentResult, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            deferredIntentConfirmationType = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        defaultFlowController.onPaymentResult$paymentsheet_release(paymentResult, deferredIntentConfirmationType, z, z2);
    }

    public final void onPaymentResult$paymentsheet_release(PaymentResult paymentResult, DeferredIntentConfirmationType deferredIntentConfirmationType, boolean shouldLog, boolean shouldResetOnCompleted) {
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        if (shouldLog) {
            logPaymentResult(paymentResult, deferredIntentConfirmationType);
        }
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        boolean z = paymentResult instanceof PaymentResult.Completed;
        if (z && paymentSelection != null && PaymentSelectionKt.isLink(paymentSelection)) {
            this.linkHandler.logOut();
        }
        if (z && shouldResetOnCompleted) {
            this.viewModel.setPaymentSelection(null);
            this.viewModel.setState(null);
        }
        BuildersKt__Builders_commonKt.launch$default(this.viewModelScope, null, null, new DefaultFlowController$onPaymentResult$1(this, paymentResult, null), 3, null);
    }

    public final void onSepaMandateResult$paymentsheet_release(SepaMandateResult sepaMandateResult) {
        Intrinsics.checkNotNullParameter(sepaMandateResult, "sepaMandateResult");
        if (Intrinsics.areEqual(sepaMandateResult, SepaMandateResult.Acknowledged.INSTANCE)) {
            PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
            if (paymentSelection != null) {
                paymentSelection.setHasAcknowledgedSepaMandate(true);
            }
            confirm();
            return;
        }
        if (!Intrinsics.areEqual(sepaMandateResult, SepaMandateResult.Canceled.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        this.paymentResultCallback.onPaymentSheetResult(PaymentSheetResult.Canceled.INSTANCE);
    }

    private final void logPaymentResult(PaymentResult paymentResult, DeferredIntentConfirmationType deferredIntentConfirmationType) {
        PaymentSelection paymentSelection;
        if (paymentResult instanceof PaymentResult.Completed) {
            PaymentSelection paymentSelection2 = this.viewModel.getPaymentSelection();
            if (paymentSelection2 != null) {
                this.eventReporter.onPaymentSuccess(paymentSelection2, deferredIntentConfirmationType);
                return;
            }
            return;
        }
        if (!(paymentResult instanceof PaymentResult.Failed) || (paymentSelection = this.viewModel.getPaymentSelection()) == null) {
            return;
        }
        this.eventReporter.onPaymentFailure(paymentSelection, new PaymentSheetConfirmationError.Stripe(((PaymentResult.Failed) paymentResult).getThrowable()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentSheetResult convertToPaymentSheetResult(PaymentResult paymentResult) {
        if (paymentResult instanceof PaymentResult.Completed) {
            return PaymentSheetResult.Completed.INSTANCE;
        }
        if (paymentResult instanceof PaymentResult.Canceled) {
            return PaymentSheetResult.Canceled.INSTANCE;
        }
        if (paymentResult instanceof PaymentResult.Failed) {
            return new PaymentSheetResult.Failed(((PaymentResult.Failed) paymentResult).getThrowable());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Args;", "Landroid/os/Parcelable;", "clientSecret", "", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "getClientSecret", "()Ljava/lang/String;", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {
        private final String clientSecret;
        private final PaymentSheet.Configuration config;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: DefaultFlowController.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, PaymentSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i & 2) != 0) {
                configuration = args.config;
            }
            return args.copy(str, configuration);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public final Args copy(String clientSecret, PaymentSheet.Configuration config) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Args(clientSecret, config);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.config, args.config);
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            PaymentSheet.Configuration configuration = this.config;
            return iHashCode + (configuration == null ? 0 : configuration.hashCode());
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", config=" + this.config + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.clientSecret);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                configuration.writeToParcel(dest, flags);
            }
        }

        public Args(String clientSecret, PaymentSheet.Configuration configuration) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.config = configuration;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J'\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$State;", "Landroid/os/Parcelable;", "paymentSheetState", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "declinedLink2FA", "", "<init>", "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Z)V", "getPaymentSheetState", "()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getDeclinedLink2FA", "()Z", "copyPaymentSheetState", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "customer", "Lcom/stripe/android/paymentsheet/state/CustomerState;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "getLinkConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {
        private final PaymentSheet.Configuration config;
        private final boolean declinedLink2FA;
        private final PaymentSheetState.Full paymentSheetState;
        public static final Parcelable.Creator<State> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: DefaultFlowController.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(PaymentSheetState.Full.CREATOR.createFromParcel(parcel), PaymentSheet.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public static /* synthetic */ State copy$default(State state, PaymentSheetState.Full full, PaymentSheet.Configuration configuration, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                full = state.paymentSheetState;
            }
            if ((i & 2) != 0) {
                configuration = state.config;
            }
            if ((i & 4) != 0) {
                z = state.declinedLink2FA;
            }
            return state.copy(full, configuration, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentSheetState.Full getPaymentSheetState() {
            return this.paymentSheetState;
        }

        /* renamed from: component2, reason: from getter */
        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getDeclinedLink2FA() {
            return this.declinedLink2FA;
        }

        public final State copy(PaymentSheetState.Full paymentSheetState, PaymentSheet.Configuration config, boolean declinedLink2FA) {
            Intrinsics.checkNotNullParameter(paymentSheetState, "paymentSheetState");
            Intrinsics.checkNotNullParameter(config, "config");
            return new State(paymentSheetState, config, declinedLink2FA);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.paymentSheetState, state.paymentSheetState) && Intrinsics.areEqual(this.config, state.config) && this.declinedLink2FA == state.declinedLink2FA;
        }

        public int hashCode() {
            return (((this.paymentSheetState.hashCode() * 31) + this.config.hashCode()) * 31) + Boolean.hashCode(this.declinedLink2FA);
        }

        public String toString() {
            return "State(paymentSheetState=" + this.paymentSheetState + ", config=" + this.config + ", declinedLink2FA=" + this.declinedLink2FA + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.paymentSheetState.writeToParcel(dest, flags);
            this.config.writeToParcel(dest, flags);
            dest.writeInt(this.declinedLink2FA ? 1 : 0);
        }

        public State(PaymentSheetState.Full paymentSheetState, PaymentSheet.Configuration config, boolean z) {
            Intrinsics.checkNotNullParameter(paymentSheetState, "paymentSheetState");
            Intrinsics.checkNotNullParameter(config, "config");
            this.paymentSheetState = paymentSheetState;
            this.config = config;
            this.declinedLink2FA = z;
        }

        public /* synthetic */ State(PaymentSheetState.Full full, PaymentSheet.Configuration configuration, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(full, configuration, (i & 4) != 0 ? false : z);
        }

        public final PaymentSheetState.Full getPaymentSheetState() {
            return this.paymentSheetState;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public final boolean getDeclinedLink2FA() {
            return this.declinedLink2FA;
        }

        public static /* synthetic */ State copyPaymentSheetState$default(State state, PaymentSelection paymentSelection, CustomerState customerState, PaymentMethodMetadata paymentMethodMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSelection = state.paymentSheetState.getPaymentSelection();
            }
            if ((i & 2) != 0) {
                customerState = state.paymentSheetState.getCustomer();
            }
            if ((i & 4) != 0) {
                paymentMethodMetadata = state.paymentSheetState.getPaymentMethodMetadata();
            }
            return state.copyPaymentSheetState(paymentSelection, customerState, paymentMethodMetadata);
        }

        public final State copyPaymentSheetState(PaymentSelection paymentSelection, CustomerState customer, PaymentMethodMetadata metadata) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            return copy$default(this, PaymentSheetState.Full.copy$default(this.paymentSheetState, null, customer, paymentSelection, null, metadata, 9, null), null, false, 6, null);
        }

        public final LinkConfiguration getLinkConfiguration() {
            LinkState linkState = this.paymentSheetState.getPaymentMethodMetadata().getLinkState();
            if (linkState != null) {
                return linkState.getConfiguration();
            }
            return null;
        }
    }

    /* compiled from: DefaultFlowController.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Companion;", "", "<init>", "()V", "FLOW_CONTROLLER_LINK_LAUNCHER", "", "WALLETS_BUTTON_LINK_LAUNCHER", "getInstance", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "statusBarColor", "Lkotlin/Function0;", "", "paymentOptionResultCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentElementCallbackIdentifier", "initializedViaCompose", "", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentSheet.FlowController getInstance(ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, ActivityResultCaller activityResultCaller, Function0<Integer> statusBarColor, PaymentOptionResultCallback paymentOptionResultCallback, PaymentSheetResultCallback paymentResultCallback, String paymentElementCallbackIdentifier, boolean initializedViaCompose, ActivityResultRegistryOwner activityResultRegistryOwner) {
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
            Intrinsics.checkNotNullParameter(statusBarColor, "statusBarColor");
            Intrinsics.checkNotNullParameter(paymentOptionResultCallback, "paymentOptionResultCallback");
            Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
            Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
            Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
            FlowControllerComponent flowControllerComponentBuild = ((FlowControllerViewModel) new ViewModelProvider(viewModelStoreOwner, new FlowControllerViewModel.Factory(statusBarColor.invoke(), paymentElementCallbackIdentifier)).get("FlowControllerViewModel(instance = " + paymentElementCallbackIdentifier + ")", FlowControllerViewModel.class)).getFlowControllerStateComponent().getFlowControllerComponentBuilder().lifeCycleOwner(lifecycleOwner).activityResultRegistryOwner(activityResultRegistryOwner).activityResultCaller(activityResultCaller).paymentOptionResultCallback(paymentOptionResultCallback).paymentResultCallback(paymentResultCallback).initializedViaCompose(initializedViaCompose).build();
            DefaultFlowController flowController = flowControllerComponentBuild.getFlowController();
            flowController.setFlowControllerComponent(flowControllerComponentBuild);
            return flowController;
        }
    }
}
