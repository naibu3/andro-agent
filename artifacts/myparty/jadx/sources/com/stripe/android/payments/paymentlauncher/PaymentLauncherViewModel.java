package com.stripe.android.payments.paymentlauncher;

import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.utils.CreationExtrasKtxKt;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParamsKt;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.injection.DaggerPaymentLauncherViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.utils.MapUtilsKt;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 P2\u00020\u0001:\u0002OPB\u0095\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0000¢\u0006\u0002\b0J\u001d\u00101\u001a\u00020+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\b6J\u001c\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f082\u0006\u00102\u001a\u000203H\u0002J(\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u00102\u001a\u0002032\b\u0010<\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020\u000f2\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0002\bAJ\u001c\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f082\u0006\u0010@\u001a\u00020\u000fH\u0002J\u0015\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\bFJ\u0016\u0010G\u001a\u00020+2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020;0IH\u0002J2\u0010J\u001a\u00020+2\u0006\u0010K\u001a\u00020'2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010;2\u0014\b\u0002\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f08H\u0002J\u0012\u0010N\u001a\u00020+2\b\u0010<\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006Q"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", NamedConstantsKt.IS_PAYMENT_INTENT, "", "stripeApiRepository", "Lcom/stripe/android/networking/StripeRepository;", "nextActionHandlerRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "apiRequestOptionsProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "threeDs1IntentReturnUrlMap", "", "", "lazyPaymentIntentFlowResultProcessor", "Ldagger/Lazy;", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "lazySetupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", NamedConstantsKt.IS_INSTANT_APP, "<init>", "(ZLcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;Lcom/stripe/android/payments/DefaultReturnUrl;Ljavax/inject/Provider;Ljava/util/Map;Ldagger/Lazy;Ldagger/Lazy;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;Z)V", "hasStarted", "getHasStarted", "()Z", "confirmActionRequested", "getConfirmActionRequested", "internalPaymentResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "getInternalPaymentResult$payments_core_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "register", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "register$payments_core_release", "confirmStripeIntent", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "confirmStripeIntent$payments_core_release", "logConfirmStarted", "", "confirmIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "returnUrl", "confirmIntent-0E7RQCE", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleNextActionForStripeIntent", "clientSecret", "handleNextActionForStripeIntent$payments_core_release", "logHandleNextActionStarted", "onPaymentFlowResult", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "onPaymentFlowResult$payments_core_release", "postResult", "stripeIntentResult", "Lcom/stripe/android/StripeIntentResult;", "postInternalResult", "stripeInternalResult", SDKConstants.PARAM_INTENT, "analyticsParams", "logReturnUrl", "Factory", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentLauncherViewModel extends ViewModel {
    private static final String KEY_CONFIRM_ACTION_REQUESTED = "confirm_action_requested";
    public static final String KEY_HAS_STARTED = "key_has_started";
    public static final String TIMEOUT_ERROR = "Payment fails due to time out. \n";
    public static final String UNKNOWN_ERROR = "Payment fails due to unknown error. \n";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final Provider<ApiRequest.Options> apiRequestOptionsProvider;
    private final DefaultReturnUrl defaultReturnUrl;
    private final MutableStateFlow<InternalPaymentResult> internalPaymentResult;
    private final boolean isInstantApp;
    private final boolean isPaymentIntent;
    private final Lazy<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor;
    private final Lazy<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor;
    private final PaymentNextActionHandlerRegistry nextActionHandlerRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final SavedStateHandle savedStateHandle;
    private final StripeRepository stripeApiRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");

    @Inject
    public PaymentLauncherViewModel(@Named(NamedConstantsKt.IS_PAYMENT_INTENT) boolean z, StripeRepository stripeApiRepository, PaymentNextActionHandlerRegistry nextActionHandlerRegistry, DefaultReturnUrl defaultReturnUrl, Provider<ApiRequest.Options> apiRequestOptionsProvider, Map<String, String> threeDs1IntentReturnUrlMap, Lazy<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor, Lazy<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @UIContext CoroutineContext uiContext, SavedStateHandle savedStateHandle, @Named(NamedConstantsKt.IS_INSTANT_APP) boolean z2) {
        Intrinsics.checkNotNullParameter(stripeApiRepository, "stripeApiRepository");
        Intrinsics.checkNotNullParameter(nextActionHandlerRegistry, "nextActionHandlerRegistry");
        Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
        Intrinsics.checkNotNullParameter(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        Intrinsics.checkNotNullParameter(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        Intrinsics.checkNotNullParameter(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.isPaymentIntent = z;
        this.stripeApiRepository = stripeApiRepository;
        this.nextActionHandlerRegistry = nextActionHandlerRegistry;
        this.defaultReturnUrl = defaultReturnUrl;
        this.apiRequestOptionsProvider = apiRequestOptionsProvider;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.lazyPaymentIntentFlowResultProcessor = lazyPaymentIntentFlowResultProcessor;
        this.lazySetupIntentFlowResultProcessor = lazySetupIntentFlowResultProcessor;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = uiContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z2;
        this.internalPaymentResult = StateFlowKt.MutableStateFlow(null);
    }

    private final boolean getHasStarted() {
        Boolean bool = (Boolean) this.savedStateHandle.get(KEY_HAS_STARTED);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean getConfirmActionRequested() {
        Boolean bool = (Boolean) this.savedStateHandle.get(KEY_CONFIRM_ACTION_REQUESTED);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final MutableStateFlow<InternalPaymentResult> getInternalPaymentResult$payments_core_release() {
        return this.internalPaymentResult;
    }

    public final void register$payments_core_release(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.nextActionHandlerRegistry.onNewActivityResultCaller(activityResultCaller, new PaymentLauncherViewModel$register$1(this));
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.this$0.nextActionHandlerRegistry.onLauncherInvalidated();
                super.onDestroy(owner);
            }
        });
    }

    public final void confirmStripeIntent$payments_core_release(ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
        Intrinsics.checkNotNullParameter(host, "host");
        if (getHasStarted()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaymentLauncherViewModel$confirmStripeIntent$1(this, confirmStripeIntentParams, host, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> logConfirmStarted(ConfirmStripeIntentParams confirmStripeIntentParams) {
        Map<String, String> mapFilterNotNullValues = MapUtilsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("payment_method_type", ConfirmStripeIntentParamsKt.getPaymentMethodCode(confirmStripeIntentParams)), TuplesKt.to(PaymentSheetEvent.INTENT_ID, PaymentLauncherViewModelKt.toStripeId(confirmStripeIntentParams.getClientSecret()))));
        this.analyticsRequestExecutor.executeAsync(this.paymentAnalyticsRequestFactory.createRequest(PaymentAnalyticsEvent.PaymentLauncherConfirmStarted, mapFilterNotNullValues));
        return mapFilterNotNullValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: confirmIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8204confirmIntent0E7RQCE(ConfirmStripeIntentParams confirmStripeIntentParams, String str, Continuation<? super Result<? extends StripeIntent>> continuation) {
        PaymentLauncherViewModel$confirmIntent$1 paymentLauncherViewModel$confirmIntent$1;
        if (continuation instanceof PaymentLauncherViewModel$confirmIntent$1) {
            paymentLauncherViewModel$confirmIntent$1 = (PaymentLauncherViewModel$confirmIntent$1) continuation;
            if ((paymentLauncherViewModel$confirmIntent$1.label & Integer.MIN_VALUE) != 0) {
                paymentLauncherViewModel$confirmIntent$1.label -= Integer.MIN_VALUE;
            } else {
                paymentLauncherViewModel$confirmIntent$1 = new PaymentLauncherViewModel$confirmIntent$1(this, continuation);
            }
        }
        Object obj = paymentLauncherViewModel$confirmIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = paymentLauncherViewModel$confirmIntent$1.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        confirmStripeIntentParams.setReturnUrl(str);
        ConfirmStripeIntentParams confirmStripeIntentParamsWithShouldUseStripeSdk = confirmStripeIntentParams.withShouldUseStripeSdk(true);
        if (confirmStripeIntentParamsWithShouldUseStripeSdk instanceof ConfirmPaymentIntentParams) {
            ApiRequest.Options options = this.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(options, "get(...)");
            List<String> list = EXPAND_PAYMENT_METHOD;
            paymentLauncherViewModel$confirmIntent$1.label = 1;
            Object objMo8020confirmPaymentIntentBWLJW6A = this.stripeApiRepository.mo8020confirmPaymentIntentBWLJW6A((ConfirmPaymentIntentParams) confirmStripeIntentParamsWithShouldUseStripeSdk, options, list, paymentLauncherViewModel$confirmIntent$1);
            if (objMo8020confirmPaymentIntentBWLJW6A != coroutine_suspended) {
                return objMo8020confirmPaymentIntentBWLJW6A;
            }
        } else {
            if (!(confirmStripeIntentParamsWithShouldUseStripeSdk instanceof ConfirmSetupIntentParams)) {
                throw new NoWhenBranchMatchedException();
            }
            ApiRequest.Options options2 = this.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(options2, "get(...)");
            List<String> list2 = EXPAND_PAYMENT_METHOD;
            paymentLauncherViewModel$confirmIntent$1.label = 2;
            Object objMo8021confirmSetupIntentBWLJW6A = this.stripeApiRepository.mo8021confirmSetupIntentBWLJW6A((ConfirmSetupIntentParams) confirmStripeIntentParamsWithShouldUseStripeSdk, options2, list2, paymentLauncherViewModel$confirmIntent$1);
            if (objMo8021confirmSetupIntentBWLJW6A != coroutine_suspended) {
                return objMo8021confirmSetupIntentBWLJW6A;
            }
        }
        return coroutine_suspended;
    }

    public final void handleNextActionForStripeIntent$payments_core_release(String clientSecret, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(host, "host");
        if (getHasStarted()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this, clientSecret, host, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> logHandleNextActionStarted(String clientSecret) {
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to(PaymentSheetEvent.INTENT_ID, PaymentLauncherViewModelKt.toStripeId(clientSecret)));
        this.analyticsRequestExecutor.executeAsync(this.paymentAnalyticsRequestFactory.createRequest(PaymentAnalyticsEvent.PaymentLauncherNextActionStarted, mapMapOf));
        return mapMapOf;
    }

    public final void onPaymentFlowResult$payments_core_release(PaymentFlowResult.Unvalidated paymentFlowResult) {
        Intrinsics.checkNotNullParameter(paymentFlowResult, "paymentFlowResult");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PaymentLauncherViewModel$onPaymentFlowResult$1(this, paymentFlowResult, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postResult(StripeIntentResult<? extends StripeIntent> stripeIntentResult) {
        InternalPaymentResult.Completed completed;
        int outcome = stripeIntentResult.getOutcome();
        if (outcome == 1) {
            completed = new InternalPaymentResult.Completed(stripeIntentResult.getIntent());
        } else if (outcome == 2) {
            completed = new InternalPaymentResult.Failed(new LocalStripeException(stripeIntentResult.getFailureMessage(), "failedIntentOutcomeError"));
        } else if (outcome == 3) {
            completed = InternalPaymentResult.Canceled.INSTANCE;
        } else if (outcome == 4) {
            completed = new InternalPaymentResult.Failed(new LocalStripeException(TIMEOUT_ERROR + stripeIntentResult.getFailureMessage(), "timedOutIntentOutcomeError"));
        } else {
            completed = new InternalPaymentResult.Failed(new LocalStripeException(UNKNOWN_ERROR + stripeIntentResult.getFailureMessage(), "unknownIntentOutcomeError"));
        }
        postInternalResult$default(this, completed, stripeIntentResult.getIntent(), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void postInternalResult$default(PaymentLauncherViewModel paymentLauncherViewModel, InternalPaymentResult internalPaymentResult, StripeIntent stripeIntent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            stripeIntent = null;
        }
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        paymentLauncherViewModel.postInternalResult(internalPaymentResult, stripeIntent, map);
    }

    private final void postInternalResult(InternalPaymentResult stripeInternalResult, StripeIntent intent, Map<String, String> analyticsParams) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        Map<String, String> mapEmptyMap;
        PaymentMethod paymentMethod;
        PaymentMethod.Type type;
        StripeIntent.Status status;
        String clientSecret;
        MutableStateFlow<InternalPaymentResult> mutableStateFlow = this.internalPaymentResult;
        if (getConfirmActionRequested()) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.PaymentLauncherConfirmFinished;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.PaymentLauncherNextActionFinished;
        }
        Pair[] pairArr = new Pair[3];
        String str = null;
        pairArr[0] = TuplesKt.to(PaymentSheetEvent.INTENT_ID, (intent == null || (clientSecret = intent.getClientSecret()) == null) ? null : PaymentLauncherViewModelKt.toStripeId(clientSecret));
        pairArr[1] = TuplesKt.to("status", (intent == null || (status = intent.getStatus()) == null) ? null : status.getCode());
        if (intent != null && (paymentMethod = intent.getPaymentMethod()) != null && (type = paymentMethod.type) != null) {
            str = type.code;
        }
        pairArr[2] = TuplesKt.to("payment_method_type", str);
        Map mapFilterNotNullValues = MapUtilsKt.filterNotNullValues(MapsKt.mapOf(pairArr));
        if (stripeInternalResult instanceof InternalPaymentResult.Failed) {
            mapEmptyMap = ErrorReporter.INSTANCE.getAdditionalParamsFromStripeException(StripeException.INSTANCE.create(((InternalPaymentResult.Failed) stripeInternalResult).getThrowable()));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        this.analyticsRequestExecutor.executeAsync(this.paymentAnalyticsRequestFactory.createRequest(paymentAnalyticsEvent, MapsKt.plus(MapsKt.plus(analyticsParams, mapFilterNotNullValues), mapEmptyMap)));
        mutableStateFlow.setValue(stripeInternalResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logReturnUrl(String returnUrl) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (Intrinsics.areEqual(returnUrl, this.defaultReturnUrl.getValue())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlDefault;
        } else if (returnUrl == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlNull;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    /* compiled from: PaymentLauncherViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argsSupplier", "Lkotlin/Function0;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final Function0<PaymentLauncherContract.Args> argsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends PaymentLauncherContract.Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            final PaymentLauncherContract.Args argsInvoke = this.argsSupplier.invoke();
            Application applicationRequireApplication = CreationExtrasKtxKt.requireApplication(extras);
            SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(extras);
            PaymentLauncherViewModelSubcomponent.Builder viewModelSubcomponentBuilder = DaggerPaymentLauncherViewModelFactoryComponent.builder().context(applicationRequireApplication).enableLogging(argsInvoke.getEnableLogging()).publishableKeyProvider(new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$Factory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return argsInvoke.getPublishableKey();
                }
            }).stripeAccountIdProvider(new Function0() { // from class: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$Factory$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return argsInvoke.getStripeAccountId();
                }
            }).productUsage(argsInvoke.getProductUsage()).includePaymentSheetNextHandlers(argsInvoke.getIncludePaymentSheetNextHandlers()).build().getViewModelSubcomponentBuilder();
            boolean z = false;
            if (argsInvoke instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                ConfirmStripeIntentParams confirmStripeIntentParams = ((PaymentLauncherContract.Args.IntentConfirmationArgs) argsInvoke).getConfirmStripeIntentParams();
                if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                    z = true;
                } else if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!(argsInvoke instanceof PaymentLauncherContract.Args.HashedPaymentIntentNextActionArgs) && !(argsInvoke instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs)) {
                if (!(argsInvoke instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            PaymentLauncherViewModel viewModel = viewModelSubcomponentBuilder.isPaymentIntent(z).savedStateHandle(savedStateHandleCreateSavedStateHandle).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
            return viewModel;
        }
    }

    /* compiled from: PaymentLauncherViewModel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Companion;", "", "<init>", "()V", "TIMEOUT_ERROR", "", "UNKNOWN_ERROR", "EXPAND_PAYMENT_METHOD", "", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "KEY_HAS_STARTED", "getKEY_HAS_STARTED$payments_core_release$annotations", "KEY_CONFIRM_ACTION_REQUESTED", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_HAS_STARTED$payments_core_release$annotations() {
        }

        private Companion() {
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentLauncherViewModel.EXPAND_PAYMENT_METHOD;
        }
    }
}
