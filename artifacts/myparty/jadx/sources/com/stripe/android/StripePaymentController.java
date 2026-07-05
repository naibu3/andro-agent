package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.instantapps.InstantApps;
import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AlipayAuthResult;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.AlipayRepository;
import com.stripe.android.networking.DefaultAlipayRepository;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowFailureMessageFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandlerRegistry;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: StripePaymentController.kt */
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 u2\u00020\u0001:\u0001uBa\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\b\u00101\u001a\u00020+H\u0016J&\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0096@¢\u0006\u0002\u00108J.\u00109\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0096@¢\u0006\u0004\b@\u0010AJ&\u0010B\u001a\b\u0012\u0004\u0012\u00020C0:2\u0006\u0010<\u001a\u00020=2\u0006\u00106\u001a\u000207H\u0096@¢\u0006\u0004\bD\u0010EJ&\u0010F\u001a\b\u0012\u0004\u0012\u00020G0:2\u0006\u00104\u001a\u00020=2\u0006\u00106\u001a\u000207H\u0082@¢\u0006\u0004\bH\u0010EJ&\u0010I\u001a\b\u0012\u0004\u0012\u00020J0:2\u0006\u00104\u001a\u00020K2\u0006\u00106\u001a\u000207H\u0082@¢\u0006\u0004\bL\u0010MJ.\u0010N\u001a\u00020+2\u0006\u00103\u001a\u00020$2\u0006\u0010O\u001a\u00020\u00062\u0006\u00106\u001a\u0002072\u0006\u0010P\u001a\u00020QH\u0096@¢\u0006\u0002\u0010RJ&\u0010S\u001a\u00020+2\u0006\u00103\u001a\u00020$2\u0006\u0010T\u001a\u00020U2\u0006\u00106\u001a\u000207H\u0096@¢\u0006\u0002\u0010VJ&\u0010W\u001a\u00020+2\u0006\u00103\u001a\u00020$2\u0006\u0010T\u001a\u00020U2\u0006\u00106\u001a\u000207H\u0082@¢\u0006\u0002\u0010VJ\u001a\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\u001a\u0010]\u001a\u00020\n2\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\u001a\u0010^\u001a\u00020\n2\u0006\u0010Y\u001a\u00020Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\u001e\u0010_\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010[\u001a\u00020\\H\u0096@¢\u0006\u0004\b`\u0010aJ\u001e\u0010b\u001a\b\u0012\u0004\u0012\u00020c0:2\u0006\u0010[\u001a\u00020\\H\u0096@¢\u0006\u0004\bd\u0010aJ\u001e\u0010e\u001a\b\u0012\u0004\u0012\u00020U0:2\u0006\u0010[\u001a\u00020\\H\u0096@¢\u0006\u0004\bf\u0010aJ.\u0010g\u001a\b\u0012\u0004\u0012\u00020;0:2\u0006\u0010h\u001a\u00020G2\u0006\u0010>\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0082@¢\u0006\u0004\bi\u0010jJ&\u0010k\u001a\u00020+2\u0006\u00103\u001a\u00020$2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010l\u001a\u00020mH\u0082@¢\u0006\u0002\u0010nJ&\u0010o\u001a\u00020+2\u0006\u00103\u001a\u00020$2\u0006\u0010p\u001a\u00020q2\u0006\u00106\u001a\u000207H\u0097@¢\u0006\u0002\u0010rJ\u0012\u0010s\u001a\u00020+2\b\u0010t\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/stripe/android/StripePaymentController;", "Lcom/stripe/android/PaymentController;", "context", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "alipayRepository", "Lcom/stripe/android/networking/AlipayRepository;", "uiContext", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;)V", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "paymentIntentFlowResultProcessor", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "setupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_INSTANT_APP, "paymentRelayLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentRelayStarter;", "threeDs1IntentReturnUrlMap", "", "nextActionHandlerRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandlerRegistry;", "registerLaunchersWithActivityResultCaller", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "activityResultCallback", "Landroidx/activity/result/ActivityResultCallback;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "unregisterLaunchers", "startConfirmAndAuth", "host", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmAndAuthenticateAlipay", "Lkotlin/Result;", "Lcom/stripe/android/PaymentIntentResult;", "confirmPaymentIntentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "confirmAndAuthenticateAlipay-BWLJW6A", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmWeChatPay", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPay-0E7RQCE", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntent-0E7RQCE", "confirmSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntent-0E7RQCE", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuth", "clientSecret", "type", "Lcom/stripe/android/PaymentController$StripeIntentType;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthenticateSource", "source", "Lcom/stripe/android/model/Source;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSourceRetrieved", "shouldHandlePaymentResult", "requestCode", "", "data", "Landroid/content/Intent;", "shouldHandleSetupResult", "shouldHandleSourceResult", "getPaymentIntentResult", "getPaymentIntentResult-gIAlu-s", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSetupIntentResult", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult-gIAlu-s", "getAuthenticateSourceResult", "getAuthenticateSourceResult-gIAlu-s", "authenticateAlipay", "paymentIntent", "authenticateAlipay-BWLJW6A", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleError", "throwable", "", "(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleNextAction", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logReturnUrl", "returnUrl", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripePaymentController implements PaymentController {
    public static final int PAYMENT_REQUEST_CODE = 50000;
    public static final int SETUP_REQUEST_CODE = 50001;
    public static final int SOURCE_REQUEST_CODE = 50002;
    private final AlipayRepository alipayRepository;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean enableLogging;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final boolean isInstantApp;
    private final PaymentNextActionHandlerRegistry nextActionHandlerRegistry;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor;
    private ActivityResultLauncher<PaymentRelayStarter.Args> paymentRelayLauncher;
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;
    private final Function0<String> publishableKeyProvider;
    private final SetupIntentFlowResultProcessor setupIntentFlowResultProcessor;
    private final StripeRepository stripeRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");
    private static final long CHALLENGE_DELAY = TimeUnit.SECONDS.toMillis(2);

    /* compiled from: StripePaymentController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentController.StripeIntentType.values().length];
            try {
                iArr[PaymentController.StripeIntentType.PaymentIntent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentController.StripeIntentType.SetupIntent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StripePaymentController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {260, 263, 269, 276}, m = "startAuth", n = {"this", "host", "requestOptions", "type", "this", "host", "requestOptions", "type"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.stripe.android.StripePaymentController$startAuth$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripePaymentController.this.startAuth(null, null, null, null, this);
        }
    }

    /* compiled from: StripePaymentController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {0, 0, 0}, l = {301, 307, 310}, m = "startAuthenticateSource", n = {"this", "host", "requestOptions"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.StripePaymentController$startAuthenticateSource$1, reason: invalid class name and case insensitive filesystem */
    static final class C07981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07981(Continuation<? super C07981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripePaymentController.this.startAuthenticateSource(null, null, null, this);
        }
    }

    /* compiled from: StripePaymentController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {152, 160, 178, 185}, m = "startConfirmAndAuth", n = {"this", "host", "confirmStripeIntentParams", "requestOptions", "returnUrl", "this", "host", "confirmStripeIntentParams", "requestOptions", "returnUrl"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.stripe.android.StripePaymentController$startConfirmAndAuth$1, reason: invalid class name and case insensitive filesystem */
    static final class C07991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C07991(Continuation<? super C07991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripePaymentController.this.startConfirmAndAuth(null, null, null, this);
        }
    }

    @JvmStatic
    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository) {
        return INSTANCE.create(context, str, stripeRepository);
    }

    @JvmStatic
    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository, boolean z) {
        return INSTANCE.create(context, str, stripeRepository, z);
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandlePaymentResult(int requestCode, Intent data) {
        return requestCode == 50000 && data != null;
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandleSetupResult(int requestCode, Intent data) {
        return requestCode == 50001 && data != null;
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandleSourceResult(int requestCode, Intent data) {
        return requestCode == 50002 && data != null;
    }

    public StripePaymentController(Context context, Function0<String> publishableKeyProvider, StripeRepository stripeRepository, boolean z, CoroutineContext workContext, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AlipayRepository alipayRepository, CoroutineContext uiContext) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(alipayRepository, "alipayRepository");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeRepository = stripeRepository;
        this.enableLogging = z;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.alipayRepository = alipayRepository;
        this.uiContext = uiContext;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
        this.paymentIntentFlowResultProcessor = new PaymentIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, Logger.INSTANCE.getInstance(z), workContext);
        this.setupIntentFlowResultProcessor = new SetupIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, Logger.INSTANCE.getInstance(z), workContext);
        this.defaultReturnUrl = DefaultReturnUrl.INSTANCE.create(context);
        boolean zIsInstantApp = InstantApps.isInstantApp(context);
        this.isInstantApp = zIsInstantApp;
        this.paymentRelayStarterFactory = new Function1() { // from class: com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StripePaymentController.paymentRelayStarterFactory$lambda$2(this.f$0, (AuthActivityStarterHost) obj);
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.threeDs1IntentReturnUrlMap = linkedHashMap;
        this.nextActionHandlerRegistry = DefaultPaymentNextActionHandlerRegistry.INSTANCE.createInstance(context, paymentAnalyticsRequestFactory, z, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.getDefaultProductUsageTokens$payments_core_release(), zIsInstantApp, false);
    }

    public /* synthetic */ StripePaymentController(Context context, final Function0 function0, StripeRepository stripeRepository, boolean z, CoroutineContext coroutineContext, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AlipayRepository alipayRepository, CoroutineContext coroutineContext2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        boolean z2 = (i & 8) != 0 ? false : z;
        CoroutineContext io = (i & 16) != 0 ? Dispatchers.getIO() : coroutineContext;
        AnalyticsRequestExecutor defaultAnalyticsRequestExecutor = (i & 32) != 0 ? new DefaultAnalyticsRequestExecutor(Logger.INSTANCE.getInstance(z2), io) : analyticsRequestExecutor;
        if ((i & 64) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(applicationContext, new Provider() { // from class: com.stripe.android.StripePaymentController$$ExternalSyntheticLambda0
                @Override // javax.inject.Provider
                public final Object get() {
                    return StripePaymentController._init_$lambda$0(function0);
                }
            });
        } else {
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
        }
        this(context, function0, stripeRepository, z2, io, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory2, (i & 128) != 0 ? new DefaultAlipayRepository(stripeRepository) : alipayRepository, (i & 256) != 0 ? Dispatchers.getMain() : coroutineContext2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 function0) {
        return (String) function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentRelayStarter paymentRelayStarterFactory$lambda$2(StripePaymentController stripePaymentController, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(host, "host");
        ActivityResultLauncher<PaymentRelayStarter.Args> activityResultLauncher = stripePaymentController.paymentRelayLauncher;
        if (activityResultLauncher != null) {
            return new PaymentRelayStarter.Modern(activityResultLauncher);
        }
        return new PaymentRelayStarter.Legacy(host);
    }

    @Override // com.stripe.android.PaymentController
    public void registerLaunchersWithActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.nextActionHandlerRegistry.onNewActivityResultCaller(activityResultCaller, activityResultCallback);
    }

    @Override // com.stripe.android.PaymentController
    public void unregisterLaunchers() {
        ActivityResultLauncher<PaymentRelayStarter.Args> activityResultLauncher = this.paymentRelayLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.paymentRelayLauncher = null;
        this.nextActionHandlerRegistry.onLauncherInvalidated();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r2 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r2 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f9, code lost:
    
        if (r5.handleNextAction(r10, r2, r12, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
    
        if (r5.handleError(r10, r11, r6, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startConfirmAndAuth(AuthActivityStarterHost authActivityStarterHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        C07991 c07991;
        String returnUrl;
        Object objM7208confirmSetupIntent0E7RQCE;
        StripePaymentController stripePaymentController;
        String id;
        if (continuation instanceof C07991) {
            c07991 = (C07991) continuation;
            if ((c07991.label & Integer.MIN_VALUE) != 0) {
                c07991.label -= Integer.MIN_VALUE;
            } else {
                c07991 = new C07991(continuation);
            }
        }
        Object obj = c07991.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07991.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            logReturnUrl(confirmStripeIntentParams.getReturnUrl());
            if (this.isInstantApp) {
                returnUrl = confirmStripeIntentParams.getReturnUrl();
            } else {
                returnUrl = confirmStripeIntentParams.getReturnUrl();
                String str = returnUrl;
                if (str == null || StringsKt.isBlank(str)) {
                    returnUrl = null;
                }
                if (returnUrl == null) {
                    returnUrl = this.defaultReturnUrl.getValue();
                }
            }
            if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) confirmStripeIntentParams;
                confirmPaymentIntentParams.setReturnUrl(returnUrl);
                c07991.L$0 = this;
                c07991.L$1 = authActivityStarterHost;
                c07991.L$2 = confirmStripeIntentParams;
                c07991.L$3 = options;
                c07991.L$4 = returnUrl;
                c07991.label = 1;
                objM7208confirmSetupIntent0E7RQCE = m7207confirmPaymentIntent0E7RQCE(confirmPaymentIntentParams, options, c07991);
            } else {
                if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) confirmStripeIntentParams;
                confirmSetupIntentParams.setReturnUrl(returnUrl);
                c07991.L$0 = this;
                c07991.L$1 = authActivityStarterHost;
                c07991.L$2 = confirmStripeIntentParams;
                c07991.L$3 = options;
                c07991.L$4 = returnUrl;
                c07991.label = 2;
                objM7208confirmSetupIntent0E7RQCE = m7208confirmSetupIntent0E7RQCE(confirmSetupIntentParams, options, c07991);
            }
        } else {
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            String str2 = (String) c07991.L$4;
            options = (ApiRequest.Options) c07991.L$3;
            confirmStripeIntentParams = (ConfirmStripeIntentParams) c07991.L$2;
            AuthActivityStarterHost authActivityStarterHost2 = (AuthActivityStarterHost) c07991.L$1;
            stripePaymentController = (StripePaymentController) c07991.L$0;
            ResultKt.throwOnFailure(obj);
            Object value = ((Result) obj).getValue();
            returnUrl = str2;
            authActivityStarterHost = authActivityStarterHost2;
            objM7208confirmSetupIntent0E7RQCE = value;
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7208confirmSetupIntent0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            StripeIntent stripeIntent = (StripeIntent) objM7208confirmSetupIntent0E7RQCE;
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData != null && (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) && (id = stripeIntent.getId()) != null) {
                Map<String, String> map = stripePaymentController.threeDs1IntentReturnUrlMap;
                if (returnUrl == null) {
                    returnUrl = "";
                }
                map.put(id, returnUrl);
            }
            c07991.L$0 = null;
            c07991.L$1 = null;
            c07991.L$2 = null;
            c07991.L$3 = null;
            c07991.L$4 = null;
            c07991.label = 3;
        } else {
            int requestCode$payments_core_release = INSTANCE.getRequestCode$payments_core_release(confirmStripeIntentParams);
            c07991.L$0 = null;
            c07991.L$1 = null;
            c07991.L$2 = null;
            c07991.L$3 = null;
            c07991.L$4 = null;
            c07991.label = 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.PaymentController
    /* renamed from: confirmAndAuthenticateAlipay-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7195confirmAndAuthenticateAlipayBWLJW6A(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super Result<PaymentIntentResult>> continuation) {
        StripePaymentController$confirmAndAuthenticateAlipay$1 stripePaymentController$confirmAndAuthenticateAlipay$1;
        Object objM7207confirmPaymentIntent0E7RQCE;
        StripePaymentController stripePaymentController;
        if (continuation instanceof StripePaymentController$confirmAndAuthenticateAlipay$1) {
            stripePaymentController$confirmAndAuthenticateAlipay$1 = (StripePaymentController$confirmAndAuthenticateAlipay$1) continuation;
            if ((stripePaymentController$confirmAndAuthenticateAlipay$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmAndAuthenticateAlipay$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$confirmAndAuthenticateAlipay$1 = new StripePaymentController$confirmAndAuthenticateAlipay$1(this, continuation);
            }
        }
        Object obj = stripePaymentController$confirmAndAuthenticateAlipay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripePaymentController$confirmAndAuthenticateAlipay$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            stripePaymentController$confirmAndAuthenticateAlipay$1.L$0 = this;
            stripePaymentController$confirmAndAuthenticateAlipay$1.L$1 = alipayAuthenticator;
            stripePaymentController$confirmAndAuthenticateAlipay$1.L$2 = options;
            stripePaymentController$confirmAndAuthenticateAlipay$1.label = 1;
            objM7207confirmPaymentIntent0E7RQCE = m7207confirmPaymentIntent0E7RQCE(confirmPaymentIntentParams, options, stripePaymentController$confirmAndAuthenticateAlipay$1);
            if (objM7207confirmPaymentIntent0E7RQCE != coroutine_suspended) {
                stripePaymentController = this;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        options = (ApiRequest.Options) stripePaymentController$confirmAndAuthenticateAlipay$1.L$2;
        alipayAuthenticator = (AlipayAuthenticator) stripePaymentController$confirmAndAuthenticateAlipay$1.L$1;
        stripePaymentController = (StripePaymentController) stripePaymentController$confirmAndAuthenticateAlipay$1.L$0;
        ResultKt.throwOnFailure(obj);
        objM7207confirmPaymentIntent0E7RQCE = ((Result) obj).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7207confirmPaymentIntent0E7RQCE);
        if (thM9121exceptionOrNullimpl == null) {
            stripePaymentController$confirmAndAuthenticateAlipay$1.L$0 = null;
            stripePaymentController$confirmAndAuthenticateAlipay$1.L$1 = null;
            stripePaymentController$confirmAndAuthenticateAlipay$1.L$2 = null;
            stripePaymentController$confirmAndAuthenticateAlipay$1.label = 2;
            Object objM7206authenticateAlipayBWLJW6A = stripePaymentController.m7206authenticateAlipayBWLJW6A((PaymentIntent) objM7207confirmPaymentIntent0E7RQCE, alipayAuthenticator, options, stripePaymentController$confirmAndAuthenticateAlipay$1);
            return objM7206authenticateAlipayBWLJW6A == coroutine_suspended ? coroutine_suspended : objM7206authenticateAlipayBWLJW6A;
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.PaymentController
    /* renamed from: confirmWeChatPay-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7196confirmWeChatPay0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super Result<WeChatPayNextAction>> continuation) {
        StripePaymentController$confirmWeChatPay$1 stripePaymentController$confirmWeChatPay$1;
        Object objM7207confirmPaymentIntent0E7RQCE;
        if (continuation instanceof StripePaymentController$confirmWeChatPay$1) {
            stripePaymentController$confirmWeChatPay$1 = (StripePaymentController$confirmWeChatPay$1) continuation;
            if ((stripePaymentController$confirmWeChatPay$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmWeChatPay$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$confirmWeChatPay$1 = new StripePaymentController$confirmWeChatPay$1(this, continuation);
            }
        }
        Object obj = stripePaymentController$confirmWeChatPay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripePaymentController$confirmWeChatPay$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            stripePaymentController$confirmWeChatPay$1.label = 1;
            objM7207confirmPaymentIntent0E7RQCE = m7207confirmPaymentIntent0E7RQCE(confirmPaymentIntentParams, options, stripePaymentController$confirmWeChatPay$1);
            if (objM7207confirmPaymentIntent0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM7207confirmPaymentIntent0E7RQCE = ((Result) obj).getValue();
        }
        if (!Result.m9125isSuccessimpl(objM7207confirmPaymentIntent0E7RQCE)) {
            return Result.m9118constructorimpl(objM7207confirmPaymentIntent0E7RQCE);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            PaymentIntent paymentIntent = (PaymentIntent) objM7207confirmPaymentIntent0E7RQCE;
            if (paymentIntent.getNextActionData() instanceof StripeIntent.NextActionData.WeChatPayRedirect) {
                return Result.m9118constructorimpl(new WeChatPayNextAction(paymentIntent, ((StripeIntent.NextActionData.WeChatPayRedirect) paymentIntent.getNextActionData()).getWeChat()));
            }
            throw new IllegalArgumentException("Unable to confirm Payment Intent with WeChatPay SDK".toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: confirmPaymentIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7207confirmPaymentIntent0E7RQCE(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super Result<PaymentIntent>> continuation) {
        StripePaymentController$confirmPaymentIntent$1 stripePaymentController$confirmPaymentIntent$1;
        if (continuation instanceof StripePaymentController$confirmPaymentIntent$1) {
            stripePaymentController$confirmPaymentIntent$1 = (StripePaymentController$confirmPaymentIntent$1) continuation;
            if ((stripePaymentController$confirmPaymentIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmPaymentIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$confirmPaymentIntent$1 = new StripePaymentController$confirmPaymentIntent$1(this, continuation);
            }
        }
        Object obj = stripePaymentController$confirmPaymentIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripePaymentController$confirmPaymentIntent$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ConfirmPaymentIntentParams confirmPaymentIntentParamsWithShouldUseStripeSdk = confirmPaymentIntentParams.withShouldUseStripeSdk(true);
        List<String> list = EXPAND_PAYMENT_METHOD;
        stripePaymentController$confirmPaymentIntent$1.label = 1;
        Object objMo8020confirmPaymentIntentBWLJW6A = stripeRepository.mo8020confirmPaymentIntentBWLJW6A(confirmPaymentIntentParamsWithShouldUseStripeSdk, options, list, stripePaymentController$confirmPaymentIntent$1);
        return objMo8020confirmPaymentIntentBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8020confirmPaymentIntentBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: confirmSetupIntent-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7208confirmSetupIntent0E7RQCE(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, Continuation<? super Result<SetupIntent>> continuation) {
        StripePaymentController$confirmSetupIntent$1 stripePaymentController$confirmSetupIntent$1;
        if (continuation instanceof StripePaymentController$confirmSetupIntent$1) {
            stripePaymentController$confirmSetupIntent$1 = (StripePaymentController$confirmSetupIntent$1) continuation;
            if ((stripePaymentController$confirmSetupIntent$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmSetupIntent$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$confirmSetupIntent$1 = new StripePaymentController$confirmSetupIntent$1(this, continuation);
            }
        }
        Object obj = stripePaymentController$confirmSetupIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripePaymentController$confirmSetupIntent$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ConfirmSetupIntentParams confirmSetupIntentParamsWithShouldUseStripeSdk = confirmSetupIntentParams.withShouldUseStripeSdk(true);
        List<String> list = EXPAND_PAYMENT_METHOD;
        stripePaymentController$confirmSetupIntent$1.label = 1;
        Object objMo8021confirmSetupIntentBWLJW6A = stripeRepository.mo8021confirmSetupIntentBWLJW6A(confirmSetupIntentParamsWithShouldUseStripeSdk, options, list, stripePaymentController$confirmSetupIntent$1);
        return objMo8021confirmSetupIntentBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8021confirmSetupIntentBWLJW6A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r3.handleNextAction(r14, (com.stripe.android.model.StripeIntent) r0, r1, r4) == r8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00eb, code lost:
    
        if (r3.handleError(r14, r0, r2, r4) == r8) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startAuth(AuthActivityStarterHost authActivityStarterHost, String str, ApiRequest.Options options, PaymentController.StripeIntentType stripeIntentType, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM8068retrievePaymentIntentBWLJW6A$default;
        StripePaymentController stripePaymentController;
        ApiRequest.Options options2;
        int i;
        PaymentController.StripeIntentType stripeIntentType2 = stripeIntentType;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass12.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            int i3 = WhenMappings.$EnumSwitchMapping$0[stripeIntentType2.ordinal()];
            if (i3 == 1) {
                StripeRepository stripeRepository = this.stripeRepository;
                anonymousClass12.L$0 = this;
                anonymousClass12.L$1 = authActivityStarterHost;
                anonymousClass12.L$2 = options;
                anonymousClass12.L$3 = stripeIntentType2;
                anonymousClass12.label = 1;
                objM8068retrievePaymentIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8068retrievePaymentIntentBWLJW6A$default(stripeRepository, str, options, null, anonymousClass12, 4, null);
                if (objM8068retrievePaymentIntentBWLJW6A$default != coroutine_suspended) {
                    stripePaymentController = this;
                    options2 = options;
                }
                return coroutine_suspended;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StripeRepository stripeRepository2 = this.stripeRepository;
            anonymousClass12.L$0 = this;
            anonymousClass12.L$1 = authActivityStarterHost;
            anonymousClass12.L$2 = options;
            anonymousClass12.L$3 = stripeIntentType2;
            anonymousClass12.label = 2;
            objM8068retrievePaymentIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8069retrieveSetupIntentBWLJW6A$default(stripeRepository2, str, options, null, anonymousClass12, 4, null);
            if (objM8068retrievePaymentIntentBWLJW6A$default != coroutine_suspended) {
                stripePaymentController = this;
                options2 = options;
            }
            return coroutine_suspended;
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        PaymentController.StripeIntentType stripeIntentType3 = (PaymentController.StripeIntentType) anonymousClass12.L$3;
        options2 = (ApiRequest.Options) anonymousClass12.L$2;
        AuthActivityStarterHost authActivityStarterHost2 = (AuthActivityStarterHost) anonymousClass12.L$1;
        stripePaymentController = (StripePaymentController) anonymousClass12.L$0;
        ResultKt.throwOnFailure(obj);
        objM8068retrievePaymentIntentBWLJW6A$default = ((Result) obj).getValue();
        stripeIntentType2 = stripeIntentType3;
        authActivityStarterHost = authActivityStarterHost2;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM8068retrievePaymentIntentBWLJW6A$default);
        if (thM9121exceptionOrNullimpl == null) {
            anonymousClass12.L$0 = null;
            anonymousClass12.L$1 = null;
            anonymousClass12.L$2 = null;
            anonymousClass12.L$3 = null;
            anonymousClass12.label = 3;
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[stripeIntentType2.ordinal()];
            if (i4 == 1) {
                i = PAYMENT_REQUEST_CODE;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = SETUP_REQUEST_CODE;
            }
            anonymousClass12.L$0 = null;
            anonymousClass12.L$1 = null;
            anonymousClass12.L$2 = null;
            anonymousClass12.L$3 = null;
            anonymousClass12.label = 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r8.onSourceRetrieved(r5, (com.stripe.android.model.Source) r2, r1, r3) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r8.handleError(r5, com.stripe.android.StripePaymentController.SOURCE_REQUEST_CODE, r9, r3) == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startAuthenticateSource(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        C07981 c07981;
        Object objMo8052retrieveSourceBWLJW6A;
        StripePaymentController stripePaymentController;
        AuthActivityStarterHost authActivityStarterHost2;
        ApiRequest.Options options2 = options;
        if (continuation instanceof C07981) {
            c07981 = (C07981) continuation;
            if ((c07981.label & Integer.MIN_VALUE) != 0) {
                c07981.label -= Integer.MIN_VALUE;
            } else {
                c07981 = new C07981(continuation);
            }
        }
        Object obj = c07981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c07981.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceStart, null, null, null, null, null, 62, null));
            StripeRepository stripeRepository = this.stripeRepository;
            String id = source.getId();
            if (id == null) {
                id = "";
            }
            String clientSecret = source.getClientSecret();
            String str = clientSecret != null ? clientSecret : "";
            c07981.L$0 = this;
            c07981.L$1 = authActivityStarterHost;
            c07981.L$2 = options2;
            c07981.label = 1;
            objMo8052retrieveSourceBWLJW6A = stripeRepository.mo8052retrieveSourceBWLJW6A(id, str, options2, c07981);
            if (objMo8052retrieveSourceBWLJW6A != coroutine_suspended) {
                stripePaymentController = this;
                authActivityStarterHost2 = authActivityStarterHost;
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
        options2 = (ApiRequest.Options) c07981.L$2;
        authActivityStarterHost2 = (AuthActivityStarterHost) c07981.L$1;
        stripePaymentController = (StripePaymentController) c07981.L$0;
        ResultKt.throwOnFailure(obj);
        objMo8052retrieveSourceBWLJW6A = ((Result) obj).getValue();
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8052retrieveSourceBWLJW6A);
        if (thM9121exceptionOrNullimpl == null) {
            c07981.L$0 = null;
            c07981.L$1 = null;
            c07981.L$2 = null;
            c07981.label = 2;
        } else {
            c07981.L$0 = null;
            c07981.L$1 = null;
            c07981.L$2 = null;
            c07981.label = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onSourceRetrieved(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Object objPerformNextAction = this.nextActionHandlerRegistry.getNextActionHandler(source).performNextAction(authActivityStarterHost, source, options, continuation);
        return objPerformNextAction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformNextAction : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.PaymentController
    /* renamed from: getPaymentIntentResult-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7198getPaymentIntentResultgIAlus(Intent intent, Continuation<? super Result<PaymentIntentResult>> continuation) {
        StripePaymentController$getPaymentIntentResult$1 stripePaymentController$getPaymentIntentResult$1;
        if (continuation instanceof StripePaymentController$getPaymentIntentResult$1) {
            stripePaymentController$getPaymentIntentResult$1 = (StripePaymentController$getPaymentIntentResult$1) continuation;
            if ((stripePaymentController$getPaymentIntentResult$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$getPaymentIntentResult$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$getPaymentIntentResult$1 = new StripePaymentController$getPaymentIntentResult$1(this, continuation);
            }
        }
        Object obj = stripePaymentController$getPaymentIntentResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripePaymentController$getPaymentIntentResult$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor = this.paymentIntentFlowResultProcessor;
        PaymentFlowResult.Unvalidated unvalidatedFromIntent = PaymentFlowResult.Unvalidated.INSTANCE.fromIntent(intent);
        stripePaymentController$getPaymentIntentResult$1.label = 1;
        Object obj2 = paymentIntentFlowResultProcessor.m8153processResultgIAlus(unvalidatedFromIntent, stripePaymentController$getPaymentIntentResult$1);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.PaymentController
    /* renamed from: getSetupIntentResult-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7199getSetupIntentResultgIAlus(Intent intent, Continuation<? super Result<SetupIntentResult>> continuation) {
        StripePaymentController$getSetupIntentResult$1 stripePaymentController$getSetupIntentResult$1;
        if (continuation instanceof StripePaymentController$getSetupIntentResult$1) {
            stripePaymentController$getSetupIntentResult$1 = (StripePaymentController$getSetupIntentResult$1) continuation;
            if ((stripePaymentController$getSetupIntentResult$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$getSetupIntentResult$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$getSetupIntentResult$1 = new StripePaymentController$getSetupIntentResult$1(this, continuation);
            }
        }
        Object obj = stripePaymentController$getSetupIntentResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripePaymentController$getSetupIntentResult$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        SetupIntentFlowResultProcessor setupIntentFlowResultProcessor = this.setupIntentFlowResultProcessor;
        PaymentFlowResult.Unvalidated unvalidatedFromIntent = PaymentFlowResult.Unvalidated.INSTANCE.fromIntent(intent);
        stripePaymentController$getSetupIntentResult$1.label = 1;
        Object obj2 = setupIntentFlowResultProcessor.m8153processResultgIAlus(unvalidatedFromIntent, stripePaymentController$getSetupIntentResult$1);
        return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.PaymentController
    /* renamed from: getAuthenticateSourceResult-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7197getAuthenticateSourceResultgIAlus(Intent intent, Continuation<? super Result<Source>> continuation) {
        StripePaymentController$getAuthenticateSourceResult$1 stripePaymentController$getAuthenticateSourceResult$1;
        if (continuation instanceof StripePaymentController$getAuthenticateSourceResult$1) {
            stripePaymentController$getAuthenticateSourceResult$1 = (StripePaymentController$getAuthenticateSourceResult$1) continuation;
            if ((stripePaymentController$getAuthenticateSourceResult$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$getAuthenticateSourceResult$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$getAuthenticateSourceResult$1 = new StripePaymentController$getAuthenticateSourceResult$1(this, continuation);
            }
        }
        Object obj = stripePaymentController$getAuthenticateSourceResult$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = stripePaymentController$getAuthenticateSourceResult$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        PaymentFlowResult.Unvalidated unvalidatedFromIntent = PaymentFlowResult.Unvalidated.INSTANCE.fromIntent(intent);
        String sourceId$payments_core_release = unvalidatedFromIntent.getSourceId$payments_core_release();
        if (sourceId$payments_core_release == null) {
            sourceId$payments_core_release = "";
        }
        String clientSecret = unvalidatedFromIntent.getClientSecret();
        String str = clientSecret != null ? clientSecret : "";
        ApiRequest.Options options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), unvalidatedFromIntent.getStripeAccountId(), null, 4, null);
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceResult, null, null, null, null, null, 62, null));
        StripeRepository stripeRepository = this.stripeRepository;
        stripePaymentController$getAuthenticateSourceResult$1.label = 1;
        Object objMo8052retrieveSourceBWLJW6A = stripeRepository.mo8052retrieveSourceBWLJW6A(sourceId$payments_core_release, str, options, stripePaymentController$getAuthenticateSourceResult$1);
        return objMo8052retrieveSourceBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8052retrieveSourceBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: authenticateAlipay-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7206authenticateAlipayBWLJW6A(PaymentIntent paymentIntent, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super Result<PaymentIntentResult>> continuation) {
        StripePaymentController$authenticateAlipay$1 stripePaymentController$authenticateAlipay$1;
        StripePaymentController stripePaymentController;
        Object objMo8049retrievePaymentIntentBWLJW6A;
        int i;
        if (continuation instanceof StripePaymentController$authenticateAlipay$1) {
            stripePaymentController$authenticateAlipay$1 = (StripePaymentController$authenticateAlipay$1) continuation;
            if ((stripePaymentController$authenticateAlipay$1.label & Integer.MIN_VALUE) != 0) {
                stripePaymentController$authenticateAlipay$1.label -= Integer.MIN_VALUE;
            } else {
                stripePaymentController$authenticateAlipay$1 = new StripePaymentController$authenticateAlipay$1(this, continuation);
            }
        }
        Object objAuthenticate = stripePaymentController$authenticateAlipay$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = stripePaymentController$authenticateAlipay$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAuthenticate);
            AlipayRepository alipayRepository = this.alipayRepository;
            stripePaymentController$authenticateAlipay$1.L$0 = this;
            stripePaymentController$authenticateAlipay$1.L$1 = paymentIntent;
            stripePaymentController$authenticateAlipay$1.L$2 = options;
            stripePaymentController$authenticateAlipay$1.label = 1;
            objAuthenticate = alipayRepository.authenticate(paymentIntent, alipayAuthenticator, options, stripePaymentController$authenticateAlipay$1);
            if (objAuthenticate != coroutine_suspended) {
                stripePaymentController = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = stripePaymentController$authenticateAlipay$1.I$0;
            stripePaymentController = (StripePaymentController) stripePaymentController$authenticateAlipay$1.L$0;
            ResultKt.throwOnFailure(objAuthenticate);
            objMo8049retrievePaymentIntentBWLJW6A = ((Result) objAuthenticate).getValue();
            if (Result.m9125isSuccessimpl(objMo8049retrievePaymentIntentBWLJW6A)) {
                return Result.m9118constructorimpl(objMo8049retrievePaymentIntentBWLJW6A);
            }
            Result.Companion companion = Result.INSTANCE;
            PaymentIntent paymentIntent2 = (PaymentIntent) objMo8049retrievePaymentIntentBWLJW6A;
            return Result.m9118constructorimpl(new PaymentIntentResult(paymentIntent2, i, stripePaymentController.failureMessageFactory.create(paymentIntent2, i)));
        }
        options = (ApiRequest.Options) stripePaymentController$authenticateAlipay$1.L$2;
        paymentIntent = (PaymentIntent) stripePaymentController$authenticateAlipay$1.L$1;
        stripePaymentController = (StripePaymentController) stripePaymentController$authenticateAlipay$1.L$0;
        ResultKt.throwOnFailure(objAuthenticate);
        int outcome = ((AlipayAuthResult) objAuthenticate).getOutcome();
        StripeRepository stripeRepository = stripePaymentController.stripeRepository;
        String clientSecret = paymentIntent.getClientSecret();
        if (clientSecret == null) {
            clientSecret = "";
        }
        List<String> list = EXPAND_PAYMENT_METHOD;
        stripePaymentController$authenticateAlipay$1.L$0 = stripePaymentController;
        stripePaymentController$authenticateAlipay$1.L$1 = null;
        stripePaymentController$authenticateAlipay$1.L$2 = null;
        stripePaymentController$authenticateAlipay$1.I$0 = outcome;
        stripePaymentController$authenticateAlipay$1.label = 2;
        objMo8049retrievePaymentIntentBWLJW6A = stripeRepository.mo8049retrievePaymentIntentBWLJW6A(clientSecret, options, list, stripePaymentController$authenticateAlipay$1);
        if (objMo8049retrievePaymentIntentBWLJW6A != coroutine_suspended) {
            i = outcome;
            if (Result.m9125isSuccessimpl(objMo8049retrievePaymentIntentBWLJW6A)) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: StripePaymentController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.StripePaymentController$handleError$2", f = "StripePaymentController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.StripePaymentController$handleError$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ Throwable $throwable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AuthActivityStarterHost authActivityStarterHost, Throwable th, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$host = authActivityStarterHost;
            this.$throwable = th;
            this.$requestCode = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StripePaymentController.this.new AnonymousClass2(this.$host, this.$throwable, this.$requestCode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((PaymentRelayStarter) StripePaymentController.this.paymentRelayStarterFactory.invoke(this.$host)).start(new PaymentRelayStarter.Args.ErrorArgs(StripeException.INSTANCE.create(this.$throwable), this.$requestCode));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleError(AuthActivityStarterHost authActivityStarterHost, int i, Throwable th, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.uiContext, new AnonymousClass2(authActivityStarterHost, th, i, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Override // com.stripe.android.PaymentController
    public Object handleNextAction(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Object objPerformNextAction = this.nextActionHandlerRegistry.getNextActionHandler(stripeIntent).performNextAction(authActivityStarterHost, stripeIntent, options, continuation);
        return objPerformNextAction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformNextAction : Unit.INSTANCE;
    }

    private final void logReturnUrl(String returnUrl) {
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

    /* compiled from: StripePaymentController.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000bJ*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/stripe/android/StripePaymentController$Companion;", "", "<init>", "()V", "PAYMENT_REQUEST_CODE", "", "SETUP_REQUEST_CODE", "SOURCE_REQUEST_CODE", "getRequestCode", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "getRequestCode$payments_core_release", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "create", "Lcom/stripe/android/PaymentController;", "context", "Landroid/content/Context;", "publishableKey", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", NamedConstantsKt.ENABLE_LOGGING, "", "EXPAND_PAYMENT_METHOD", "", "getEXPAND_PAYMENT_METHOD$payments_core_release", "()Ljava/util/List;", "CHALLENGE_DELAY", "", "getCHALLENGE_DELAY$payments_core_release", "()J", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String create$lambda$0(String str) {
            return str;
        }

        @JvmStatic
        public final PaymentController create(Context context, String publishableKey, StripeRepository stripeRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
            return create$default(this, context, publishableKey, stripeRepository, false, 8, null);
        }

        private Companion() {
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(StripeIntent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent instanceof PaymentIntent ? StripePaymentController.PAYMENT_REQUEST_CODE : StripePaymentController.SETUP_REQUEST_CODE;
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(ConfirmStripeIntentParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (params instanceof ConfirmPaymentIntentParams) {
                return StripePaymentController.PAYMENT_REQUEST_CODE;
            }
            if (params instanceof ConfirmSetupIntentParams) {
                return StripePaymentController.SETUP_REQUEST_CODE;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static /* synthetic */ PaymentController create$default(Companion companion, Context context, String str, StripeRepository stripeRepository, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.create(context, str, stripeRepository, z);
        }

        @JvmStatic
        public final PaymentController create(Context context, final String publishableKey, StripeRepository stripeRepository, boolean enableLogging) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return new StripePaymentController(applicationContext, new Function0() { // from class: com.stripe.android.StripePaymentController$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StripePaymentController.Companion.create$lambda$0(publishableKey);
                }
            }, stripeRepository, enableLogging, null, null, null, null, null, 496, null);
        }

        public final List<String> getEXPAND_PAYMENT_METHOD$payments_core_release() {
            return StripePaymentController.EXPAND_PAYMENT_METHOD;
        }

        public final long getCHALLENGE_DELAY$payments_core_release() {
            return StripePaymentController.CHALLENGE_DELAY;
        }
    }
}
