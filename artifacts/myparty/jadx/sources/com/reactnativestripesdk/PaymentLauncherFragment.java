package com.reactnativestripesdk;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativestripesdk.utils.ConfirmPaymentErrorType;
import com.reactnativestripesdk.utils.ConfirmSetupIntentErrorType;
import com.reactnativestripesdk.utils.ErrorType;
import com.reactnativestripesdk.utils.ErrorsKt;
import com.reactnativestripesdk.utils.ExtensionsKt;
import com.reactnativestripesdk.utils.MappersKt;
import com.reactnativestripesdk.utils.StripeFragment;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.Stripe;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentLauncherFragment.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/reactnativestripesdk/PaymentLauncherFragment;", "Lcom/reactnativestripesdk/utils/StripeFragment;", "<init>", "()V", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "stripe", "Lcom/stripe/android/Stripe;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "paymentIntentClientSecret", "confirmPaymentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "setupIntentClientSecret", "confirmSetupParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "handleNextActionPaymentIntentClientSecret", "handleNextActionSetupIntentClientSecret", "paymentLauncher", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "prepare", "", "createPaymentLauncher", "retrieveSetupIntent", "clientSecret", "retrievePaymentIntent", "isNextActionSuccessState", "", "nextAction", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "Companion", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentLauncherFragment extends StripeFragment {
    public static final String TAG = "payment_launcher_fragment";
    private ConfirmPaymentIntentParams confirmPaymentParams;
    private ConfirmSetupIntentParams confirmSetupParams;
    private ReactApplicationContext context;
    private String handleNextActionPaymentIntentClientSecret;
    private String handleNextActionSetupIntentClientSecret;
    private String paymentIntentClientSecret;
    private PaymentLauncher paymentLauncher;
    private Promise promise;
    private String publishableKey;
    private String setupIntentClientSecret;
    private Stripe stripe;
    private String stripeAccountId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaymentLauncherFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PaymentLauncherFragment.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jz\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0002J@\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011J@\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014J8\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000bJ8\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000bJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u001e\u001a\u00020\u000bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/reactnativestripesdk/PaymentLauncherFragment$Companion;", "", "<init>", "()V", "create", "Lcom/reactnativestripesdk/PaymentLauncherFragment;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "stripe", "Lcom/stripe/android/Stripe;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "paymentIntentClientSecret", "confirmPaymentParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "setupIntentClientSecret", "confirmSetupParams", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "handleNextActionPaymentIntentClientSecret", "handleNextActionSetupIntentClientSecret", "forPayment", "forSetup", "forNextActionPayment", "forNextActionSetup", "addFragment", "", "fragment", "TAG", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ PaymentLauncherFragment create$default(Companion companion, ReactApplicationContext reactApplicationContext, Stripe stripe, String str, String str2, Promise promise, String str3, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str4, ConfirmSetupIntentParams confirmSetupIntentParams, String str5, String str6, int i, Object obj) {
            if ((i & 32) != 0) {
                str3 = null;
            }
            if ((i & 64) != 0) {
                confirmPaymentIntentParams = null;
            }
            if ((i & 128) != 0) {
                str4 = null;
            }
            if ((i & 256) != 0) {
                confirmSetupIntentParams = null;
            }
            if ((i & 512) != 0) {
                str5 = null;
            }
            if ((i & 1024) != 0) {
                str6 = null;
            }
            return companion.create(reactApplicationContext, stripe, str, str2, promise, str3, confirmPaymentIntentParams, str4, confirmSetupIntentParams, str5, str6);
        }

        private final PaymentLauncherFragment create(ReactApplicationContext context, Stripe stripe, String publishableKey, String stripeAccountId, Promise promise, String paymentIntentClientSecret, ConfirmPaymentIntentParams confirmPaymentParams, String setupIntentClientSecret, ConfirmSetupIntentParams confirmSetupParams, String handleNextActionPaymentIntentClientSecret, String handleNextActionSetupIntentClientSecret) {
            PaymentLauncherFragment paymentLauncherFragment = new PaymentLauncherFragment();
            paymentLauncherFragment.context = context;
            paymentLauncherFragment.stripe = stripe;
            paymentLauncherFragment.publishableKey = publishableKey;
            paymentLauncherFragment.stripeAccountId = stripeAccountId;
            paymentLauncherFragment.promise = promise;
            paymentLauncherFragment.paymentIntentClientSecret = paymentIntentClientSecret;
            paymentLauncherFragment.confirmPaymentParams = confirmPaymentParams;
            paymentLauncherFragment.setupIntentClientSecret = setupIntentClientSecret;
            paymentLauncherFragment.confirmSetupParams = confirmSetupParams;
            paymentLauncherFragment.handleNextActionPaymentIntentClientSecret = handleNextActionPaymentIntentClientSecret;
            paymentLauncherFragment.handleNextActionSetupIntentClientSecret = handleNextActionSetupIntentClientSecret;
            return paymentLauncherFragment;
        }

        public final PaymentLauncherFragment forPayment(ReactApplicationContext context, Stripe stripe, String publishableKey, String stripeAccountId, Promise promise, String paymentIntentClientSecret, ConfirmPaymentIntentParams confirmPaymentParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stripe, "stripe");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
            Intrinsics.checkNotNullParameter(confirmPaymentParams, "confirmPaymentParams");
            PaymentLauncherFragment paymentLauncherFragmentCreate$default = create$default(this, context, stripe, publishableKey, stripeAccountId, promise, paymentIntentClientSecret, confirmPaymentParams, null, null, null, null, 1920, null);
            addFragment(paymentLauncherFragmentCreate$default, context, promise);
            return paymentLauncherFragmentCreate$default;
        }

        public final PaymentLauncherFragment forSetup(ReactApplicationContext context, Stripe stripe, String publishableKey, String stripeAccountId, Promise promise, String setupIntentClientSecret, ConfirmSetupIntentParams confirmSetupParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stripe, "stripe");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
            Intrinsics.checkNotNullParameter(confirmSetupParams, "confirmSetupParams");
            PaymentLauncherFragment paymentLauncherFragmentCreate$default = create$default(this, context, stripe, publishableKey, stripeAccountId, promise, null, null, setupIntentClientSecret, confirmSetupParams, null, null, 1632, null);
            addFragment(paymentLauncherFragmentCreate$default, context, promise);
            return paymentLauncherFragmentCreate$default;
        }

        public final PaymentLauncherFragment forNextActionPayment(ReactApplicationContext context, Stripe stripe, String publishableKey, String stripeAccountId, Promise promise, String handleNextActionPaymentIntentClientSecret) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stripe, "stripe");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Intrinsics.checkNotNullParameter(handleNextActionPaymentIntentClientSecret, "handleNextActionPaymentIntentClientSecret");
            PaymentLauncherFragment paymentLauncherFragmentCreate$default = create$default(this, context, stripe, publishableKey, stripeAccountId, promise, null, null, null, null, handleNextActionPaymentIntentClientSecret, null, 1504, null);
            addFragment(paymentLauncherFragmentCreate$default, context, promise);
            return paymentLauncherFragmentCreate$default;
        }

        public final PaymentLauncherFragment forNextActionSetup(ReactApplicationContext context, Stripe stripe, String publishableKey, String stripeAccountId, Promise promise, String handleNextActionSetupIntentClientSecret) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stripe, "stripe");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Intrinsics.checkNotNullParameter(handleNextActionSetupIntentClientSecret, "handleNextActionSetupIntentClientSecret");
            PaymentLauncherFragment paymentLauncherFragmentCreate$default = create$default(this, context, stripe, publishableKey, stripeAccountId, promise, null, null, null, null, null, handleNextActionSetupIntentClientSecret, 992, null);
            addFragment(paymentLauncherFragmentCreate$default, context, promise);
            return paymentLauncherFragmentCreate$default;
        }

        private final void addFragment(PaymentLauncherFragment fragment, ReactApplicationContext context, Promise promise) {
            Activity currentActivity = context.getCurrentActivity();
            FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
            if (fragmentActivity == null) {
                promise.resolve(ErrorsKt.createMissingActivityError());
                return;
            }
            try {
                Integer.valueOf(fragmentActivity.getSupportFragmentManager().beginTransaction().add(fragment, PaymentLauncherFragment.TAG).commit());
            } catch (IllegalStateException e) {
                promise.resolve(ErrorsKt.createError(ErrorType.Failed.toString(), e.getMessage()));
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.reactnativestripesdk.utils.StripeFragment
    public void prepare() throws Exception {
        PaymentLauncher paymentLauncherCreatePaymentLauncher = createPaymentLauncher();
        this.paymentLauncher = paymentLauncherCreatePaymentLauncher;
        if (this.paymentIntentClientSecret != null && this.confirmPaymentParams != null) {
            if (paymentLauncherCreatePaymentLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentLauncher");
                paymentLauncherCreatePaymentLauncher = null;
            }
            ConfirmPaymentIntentParams confirmPaymentIntentParams = this.confirmPaymentParams;
            Intrinsics.checkNotNull(confirmPaymentIntentParams);
            paymentLauncherCreatePaymentLauncher.confirm(confirmPaymentIntentParams);
            return;
        }
        if (this.setupIntentClientSecret != null && this.confirmSetupParams != null) {
            if (paymentLauncherCreatePaymentLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentLauncher");
                paymentLauncherCreatePaymentLauncher = null;
            }
            ConfirmSetupIntentParams confirmSetupIntentParams = this.confirmSetupParams;
            Intrinsics.checkNotNull(confirmSetupIntentParams);
            paymentLauncherCreatePaymentLauncher.confirm(confirmSetupIntentParams);
            return;
        }
        if (this.handleNextActionPaymentIntentClientSecret != null) {
            if (paymentLauncherCreatePaymentLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("paymentLauncher");
                paymentLauncherCreatePaymentLauncher = null;
            }
            String str = this.handleNextActionPaymentIntentClientSecret;
            Intrinsics.checkNotNull(str);
            paymentLauncherCreatePaymentLauncher.handleNextActionForPaymentIntent(str);
            return;
        }
        if (this.handleNextActionSetupIntentClientSecret == null) {
            throw new Exception("Invalid parameters provided to PaymentLauncher. Ensure that you are providing the correct client secret and setup params (if necessary).");
        }
        if (paymentLauncherCreatePaymentLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentLauncher");
            paymentLauncherCreatePaymentLauncher = null;
        }
        String str2 = this.handleNextActionSetupIntentClientSecret;
        Intrinsics.checkNotNull(str2);
        paymentLauncherCreatePaymentLauncher.handleNextActionForSetupIntent(str2);
    }

    private final PaymentLauncher createPaymentLauncher() {
        PaymentLauncher.Companion companion = PaymentLauncher.INSTANCE;
        PaymentLauncherFragment paymentLauncherFragment = this;
        String str = this.publishableKey;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publishableKey");
            str = null;
        }
        return companion.create(paymentLauncherFragment, str, this.stripeAccountId, new PaymentLauncher.PaymentResultCallback() { // from class: com.reactnativestripesdk.PaymentLauncherFragment$$ExternalSyntheticLambda0
            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback
            public final void onPaymentResult(PaymentResult paymentResult) throws Exception {
                PaymentLauncherFragment.createPaymentLauncher$lambda$4(this.f$0, paymentResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPaymentLauncher$lambda$4(PaymentLauncherFragment paymentLauncherFragment, PaymentResult paymentResult) throws Exception {
        Unit unit;
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        ReactApplicationContext reactApplicationContext = null;
        Unit unit2 = null;
        ReactApplicationContext reactApplicationContext2 = null;
        if (paymentResult instanceof PaymentResult.Completed) {
            String str = paymentLauncherFragment.paymentIntentClientSecret;
            if (str != null) {
                paymentLauncherFragment.retrievePaymentIntent(str, paymentLauncherFragment.stripeAccountId);
                return;
            }
            String str2 = paymentLauncherFragment.handleNextActionPaymentIntentClientSecret;
            if (str2 != null) {
                paymentLauncherFragment.retrievePaymentIntent(str2, paymentLauncherFragment.stripeAccountId);
                return;
            }
            String str3 = paymentLauncherFragment.setupIntentClientSecret;
            if (str3 != null) {
                paymentLauncherFragment.retrieveSetupIntent(str3, paymentLauncherFragment.stripeAccountId);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                String str4 = paymentLauncherFragment.handleNextActionSetupIntentClientSecret;
                if (str4 != null) {
                    paymentLauncherFragment.retrieveSetupIntent(str4, paymentLauncherFragment.stripeAccountId);
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    throw new Exception("Failed to create Payment Launcher. No client secret provided.");
                }
                return;
            }
            return;
        }
        if (paymentResult instanceof PaymentResult.Canceled) {
            Promise promise = paymentLauncherFragment.promise;
            if (promise == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                promise = null;
            }
            promise.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Canceled.toString(), (String) null));
            PaymentLauncherFragment paymentLauncherFragment2 = paymentLauncherFragment;
            ReactApplicationContext reactApplicationContext3 = paymentLauncherFragment.context;
            if (reactApplicationContext3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            } else {
                reactApplicationContext2 = reactApplicationContext3;
            }
            ExtensionsKt.removeFragment(paymentLauncherFragment2, reactApplicationContext2);
            return;
        }
        if (!(paymentResult instanceof PaymentResult.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        Promise promise2 = paymentLauncherFragment.promise;
        if (promise2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
            promise2 = null;
        }
        promise2.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), ((PaymentResult.Failed) paymentResult).getThrowable()));
        PaymentLauncherFragment paymentLauncherFragment3 = paymentLauncherFragment;
        ReactApplicationContext reactApplicationContext4 = paymentLauncherFragment.context;
        if (reactApplicationContext4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        } else {
            reactApplicationContext = reactApplicationContext4;
        }
        ExtensionsKt.removeFragment(paymentLauncherFragment3, reactApplicationContext);
    }

    private final void retrieveSetupIntent(String clientSecret, String stripeAccountId) throws InvalidRequestException, APIConnectionException, APIException, AuthenticationException {
        Stripe stripe = this.stripe;
        if (stripe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stripe");
            stripe = null;
        }
        stripe.retrieveSetupIntent(clientSecret, stripeAccountId, CollectionsKt.listOf("payment_method"), new ApiResultCallback<SetupIntent>() { // from class: com.reactnativestripesdk.PaymentLauncherFragment.retrieveSetupIntent.1

            /* compiled from: PaymentLauncherFragment.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.reactnativestripesdk.PaymentLauncherFragment$retrieveSetupIntent$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[StripeIntent.Status.values().length];
                    try {
                        iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[StripeIntent.Status.Processing.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresAction.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[StripeIntent.Status.Canceled.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                Promise promise = PaymentLauncherFragment.this.promise;
                ReactApplicationContext reactApplicationContext = null;
                if (promise == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                    promise = null;
                }
                promise.resolve(ErrorsKt.createError(ConfirmSetupIntentErrorType.Failed.toString(), e));
                PaymentLauncherFragment paymentLauncherFragment = PaymentLauncherFragment.this;
                PaymentLauncherFragment paymentLauncherFragment2 = paymentLauncherFragment;
                ReactApplicationContext reactApplicationContext2 = paymentLauncherFragment.context;
                if (reactApplicationContext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                } else {
                    reactApplicationContext = reactApplicationContext2;
                }
                ExtensionsKt.removeFragment(paymentLauncherFragment2, reactApplicationContext);
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onSuccess(SetupIntent result) {
                Intrinsics.checkNotNullParameter(result, "result");
                StripeIntent.Status status = result.getStatus();
                ReactApplicationContext reactApplicationContext = null;
                switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        Promise promise = PaymentLauncherFragment.this.promise;
                        if (promise == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise = null;
                        }
                        promise.resolve(MappersKt.createResult("setupIntent", MappersKt.mapFromSetupIntentResult(result)));
                        break;
                    case 5:
                        if (PaymentLauncherFragment.this.isNextActionSuccessState(result.getNextActionType())) {
                            Promise promise2 = PaymentLauncherFragment.this.promise;
                            if (promise2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                                promise2 = null;
                            }
                            promise2.resolve(MappersKt.createResult("setupIntent", MappersKt.mapFromSetupIntentResult(result)));
                            break;
                        } else {
                            SetupIntent.Error lastSetupError = result.getLastSetupError();
                            if (lastSetupError != null) {
                                Promise promise3 = PaymentLauncherFragment.this.promise;
                                if (promise3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                                    promise3 = null;
                                }
                                promise3.resolve(ErrorsKt.createError(ConfirmSetupIntentErrorType.Canceled.toString(), lastSetupError));
                                break;
                            } else {
                                Promise promise4 = PaymentLauncherFragment.this.promise;
                                if (promise4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                                    promise4 = null;
                                }
                                promise4.resolve(ErrorsKt.createError(ConfirmSetupIntentErrorType.Canceled.toString(), "Setup has been canceled"));
                                break;
                            }
                        }
                    case 6:
                        Promise promise5 = PaymentLauncherFragment.this.promise;
                        if (promise5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise5 = null;
                        }
                        promise5.resolve(ErrorsKt.createError(ConfirmSetupIntentErrorType.Failed.toString(), result.getLastSetupError()));
                        break;
                    case 7:
                        Promise promise6 = PaymentLauncherFragment.this.promise;
                        if (promise6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise6 = null;
                        }
                        promise6.resolve(ErrorsKt.createError(ConfirmSetupIntentErrorType.Canceled.toString(), result.getLastSetupError()));
                        break;
                    default:
                        Promise promise7 = PaymentLauncherFragment.this.promise;
                        if (promise7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise7 = null;
                        }
                        promise7.resolve(ErrorsKt.createError(ConfirmSetupIntentErrorType.Unknown.toString(), "unhandled error: " + result.getStatus()));
                        break;
                }
                PaymentLauncherFragment paymentLauncherFragment = PaymentLauncherFragment.this;
                PaymentLauncherFragment paymentLauncherFragment2 = paymentLauncherFragment;
                ReactApplicationContext reactApplicationContext2 = paymentLauncherFragment.context;
                if (reactApplicationContext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                } else {
                    reactApplicationContext = reactApplicationContext2;
                }
                ExtensionsKt.removeFragment(paymentLauncherFragment2, reactApplicationContext);
            }
        });
    }

    private final void retrievePaymentIntent(String clientSecret, String stripeAccountId) {
        Stripe stripe = this.stripe;
        if (stripe == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stripe");
            stripe = null;
        }
        stripe.retrievePaymentIntent(clientSecret, stripeAccountId, CollectionsKt.listOf("payment_method"), new ApiResultCallback<PaymentIntent>() { // from class: com.reactnativestripesdk.PaymentLauncherFragment.retrievePaymentIntent.1

            /* compiled from: PaymentLauncherFragment.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.reactnativestripesdk.PaymentLauncherFragment$retrievePaymentIntent$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[StripeIntent.Status.values().length];
                    try {
                        iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[StripeIntent.Status.Processing.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresAction.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[StripeIntent.Status.Canceled.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onError(Exception e) {
                Intrinsics.checkNotNullParameter(e, "e");
                Promise promise = PaymentLauncherFragment.this.promise;
                ReactApplicationContext reactApplicationContext = null;
                if (promise == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                    promise = null;
                }
                promise.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), e));
                PaymentLauncherFragment paymentLauncherFragment = PaymentLauncherFragment.this;
                PaymentLauncherFragment paymentLauncherFragment2 = paymentLauncherFragment;
                ReactApplicationContext reactApplicationContext2 = paymentLauncherFragment.context;
                if (reactApplicationContext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                } else {
                    reactApplicationContext = reactApplicationContext2;
                }
                ExtensionsKt.removeFragment(paymentLauncherFragment2, reactApplicationContext);
            }

            @Override // com.stripe.android.ApiResultCallback
            public void onSuccess(PaymentIntent result) {
                Intrinsics.checkNotNullParameter(result, "result");
                StripeIntent.Status status = result.getStatus();
                ReactApplicationContext reactApplicationContext = null;
                switch (status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        Promise promise = PaymentLauncherFragment.this.promise;
                        if (promise == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise = null;
                        }
                        promise.resolve(MappersKt.createResult("paymentIntent", MappersKt.mapFromPaymentIntentResult(result)));
                        break;
                    case 5:
                        if (PaymentLauncherFragment.this.isNextActionSuccessState(result.getNextActionType())) {
                            Promise promise2 = PaymentLauncherFragment.this.promise;
                            if (promise2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                                promise2 = null;
                            }
                            promise2.resolve(MappersKt.createResult("paymentIntent", MappersKt.mapFromPaymentIntentResult(result)));
                            break;
                        } else {
                            PaymentIntent.Error lastPaymentError = result.getLastPaymentError();
                            if (lastPaymentError != null) {
                                Promise promise3 = PaymentLauncherFragment.this.promise;
                                if (promise3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                                    promise3 = null;
                                }
                                promise3.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Canceled.toString(), lastPaymentError));
                                break;
                            } else {
                                Promise promise4 = PaymentLauncherFragment.this.promise;
                                if (promise4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                                    promise4 = null;
                                }
                                promise4.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Canceled.toString(), "The payment has been canceled"));
                                break;
                            }
                        }
                    case 6:
                        Promise promise5 = PaymentLauncherFragment.this.promise;
                        if (promise5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise5 = null;
                        }
                        promise5.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Failed.toString(), result.getLastPaymentError()));
                        break;
                    case 7:
                        Promise promise6 = PaymentLauncherFragment.this.promise;
                        if (promise6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise6 = null;
                        }
                        promise6.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Canceled.toString(), result.getLastPaymentError()));
                        break;
                    default:
                        Promise promise7 = PaymentLauncherFragment.this.promise;
                        if (promise7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_PROMISE);
                            promise7 = null;
                        }
                        promise7.resolve(ErrorsKt.createError(ConfirmPaymentErrorType.Unknown.toString(), "unhandled error: " + result.getStatus()));
                        break;
                }
                PaymentLauncherFragment paymentLauncherFragment = PaymentLauncherFragment.this;
                PaymentLauncherFragment paymentLauncherFragment2 = paymentLauncherFragment;
                ReactApplicationContext reactApplicationContext2 = paymentLauncherFragment.context;
                if (reactApplicationContext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                } else {
                    reactApplicationContext = reactApplicationContext2;
                }
                ExtensionsKt.removeFragment(paymentLauncherFragment2, reactApplicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNextActionSuccessState(StripeIntent.NextActionType nextAction) {
        switch (nextAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[nextAction.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
    }
}
