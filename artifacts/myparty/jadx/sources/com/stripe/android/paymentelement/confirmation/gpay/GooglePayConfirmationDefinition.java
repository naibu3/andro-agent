package com.stripe.android.paymentelement.confirmation.gpay;

import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherFactory;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationOption;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GooglePayConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0002\u0010\u0018J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u001dH\u0016J3\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0002\u0010!J*\u0010\"\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0006H\u0016J&\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010+\u001a\u00020,H\u0002J\u000e\u0010-\u001a\u0004\u0018\u00010.*\u00020/H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u00100\u001a\u000201*\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00103¨\u00064"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "googlePayPaymentMethodLauncherFactory", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "userFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "<init>", "(Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;Lcom/stripe/android/core/utils/UserFacingLogger;)V", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "option", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "(Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLauncher", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "Lkotlin/Function1;", "launch", "launcher", "arguments", "(Landroidx/activity/result/ActivityResultLauncher;Lkotlin/Unit;Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V", "toResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "createGooglePayLauncher", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "factory", "activityLauncher", "config", "Lcom/stripe/android/paymentelement/confirmation/gpay/GooglePayConfirmationOption$Config;", "asPaymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/StripeIntent;", "isProcessingPayment", "", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;)Z", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayConfirmationDefinition implements ConfirmationDefinition<GooglePayConfirmationOption, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args>, Unit, GooglePayPaymentMethodLauncher.Result> {
    public static final int $stable = 8;
    private final GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory;
    private final String key;
    private final UserFacingLogger userFacingLogger;

    /* compiled from: GooglePayConfirmationDefinition.kt */
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createGooglePayLauncher$lambda$0(boolean z) {
    }

    @Inject
    public GooglePayConfirmationDefinition(GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, UserFacingLogger userFacingLogger) {
        Intrinsics.checkNotNullParameter(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        this.googlePayPaymentMethodLauncherFactory = googlePayPaymentMethodLauncherFactory;
        this.userFacingLogger = userFacingLogger;
        this.key = "GooglePay";
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public boolean canConfirm(GooglePayConfirmationOption googlePayConfirmationOption, ConfirmationDefinition.Parameters parameters) {
        return ConfirmationDefinition.DefaultImpls.canConfirm(this, googlePayConfirmationOption, parameters);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public /* bridge */ /* synthetic */ ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> createLauncher(ActivityResultCaller activityResultCaller, Function1 function1) {
        return createLauncher(activityResultCaller, (Function1<? super GooglePayPaymentMethodLauncher.Result, Unit>) function1);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void unregister(ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher) {
        ConfirmationDefinition.DefaultImpls.unregister(this, activityResultLauncher);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public String getKey() {
        return this.key;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public GooglePayConfirmationOption option(ConfirmationHandler.Option confirmationOption) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        if (confirmationOption instanceof GooglePayConfirmationOption) {
            return (GooglePayConfirmationOption) confirmationOption;
        }
        return null;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public Object action(GooglePayConfirmationOption googlePayConfirmationOption, ConfirmationDefinition.Parameters parameters, Continuation<? super ConfirmationDefinition.Action<Unit>> continuation) {
        if (googlePayConfirmationOption.getConfig().getMerchantCurrencyCode() == null && !isProcessingPayment(parameters.getInitializationMode())) {
            UserFacingLogger userFacingLogger = this.userFacingLogger;
            if (userFacingLogger != null) {
                userFacingLogger.logWarningWithoutPii("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            }
            return new ConfirmationDefinition.Action.Fail(new IllegalStateException("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent"), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_something_went_wrong), ConfirmationHandler.Result.Failed.ErrorType.MerchantIntegration.INSTANCE);
        }
        return new ConfirmationDefinition.Action.Launch(Unit.INSTANCE, true, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> createLauncher(ActivityResultCaller activityResultCaller, Function1<? super GooglePayPaymentMethodLauncher.Result, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        return activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new GooglePayConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0(onResult));
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void launch(ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> launcher, Unit arguments, GooglePayConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters) {
        String merchantCurrencyCode;
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        GooglePayConfirmationOption.Config config = confirmationOption.getConfig();
        StripeIntent intent = confirmationParameters.getIntent();
        GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncherCreateGooglePayLauncher = createGooglePayLauncher(this.googlePayPaymentMethodLauncherFactory, launcher, confirmationOption.getConfig());
        PaymentIntent paymentIntentAsPaymentIntent = asPaymentIntent(intent);
        if ((paymentIntentAsPaymentIntent == null || (merchantCurrencyCode = paymentIntentAsPaymentIntent.getCurrency()) == null) && (merchantCurrencyCode = config.getMerchantCurrencyCode()) == null) {
            merchantCurrencyCode = "";
        }
        String str = merchantCurrencyCode;
        long jLongValue = 0;
        if (intent instanceof PaymentIntent) {
            Long amount = ((PaymentIntent) intent).getAmount();
            if (amount != null) {
                jLongValue = amount.longValue();
            }
        } else {
            if (!(intent instanceof SetupIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            Long customAmount = config.getCustomAmount();
            if (customAmount != null) {
                jLongValue = customAmount.longValue();
            }
        }
        googlePayPaymentMethodLauncherCreateGooglePayLauncher.present(str, jLongValue, intent.getId(), config.getCustomLabel());
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ConfirmationDefinition.Result toResult(GooglePayConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType, GooglePayPaymentMethodLauncher.Result result) {
        ResolvableString resolvableString;
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof GooglePayPaymentMethodLauncher.Result.Completed) {
            return new ConfirmationDefinition.Result.NextStep(new PaymentMethodConfirmationOption.Saved(((GooglePayPaymentMethodLauncher.Result.Completed) result).getPaymentMethod(), null, true), confirmationParameters);
        }
        if (result instanceof GooglePayPaymentMethodLauncher.Result.Failed) {
            GooglePayPaymentMethodLauncher.Result.Failed failed = (GooglePayPaymentMethodLauncher.Result.Failed) result;
            Throwable error = failed.getError();
            if (failed.getErrorCode() == 3) {
                resolvableString = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_failure_connection_error);
            } else {
                resolvableString = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.R.string.stripe_internal_error);
            }
            return new ConfirmationDefinition.Result.Failed(error, resolvableString, new ConfirmationHandler.Result.Failed.ErrorType.GooglePay(failed.getErrorCode()));
        }
        if (!(result instanceof GooglePayPaymentMethodLauncher.Result.Canceled)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ConfirmationDefinition.Result.Canceled(ConfirmationHandler.Result.Canceled.Action.InformCancellation);
    }

    private final GooglePayPaymentMethodLauncher createGooglePayLauncher(GooglePayPaymentMethodLauncherFactory factory, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityLauncher, GooglePayConfirmationOption.Config config) {
        GooglePayEnvironment googlePayEnvironment;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
        PaymentSheet.GooglePayConfiguration.Environment environment = config.getEnvironment();
        if ((environment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[environment.ordinal()]) == 1) {
            googlePayEnvironment = GooglePayEnvironment.Production;
        } else {
            googlePayEnvironment = GooglePayEnvironment.Test;
        }
        return factory.create(CoroutineScope, new GooglePayPaymentMethodLauncher.Config(googlePayEnvironment, config.getMerchantCountryCode(), config.getMerchantName(), config.getBillingDetailsCollectionConfiguration().getCollectsEmail$paymentsheet_release(), config.getBillingDetailsCollectionConfiguration().toBillingAddressConfig$paymentsheet_release(), false, false, 96, null), new GooglePayPaymentMethodLauncher.ReadyCallback() { // from class: com.stripe.android.paymentelement.confirmation.gpay.GooglePayConfirmationDefinition$$ExternalSyntheticLambda0
            @Override // com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback
            public final void onReady(boolean z) {
                GooglePayConfirmationDefinition.createGooglePayLauncher$lambda$0(z);
            }
        }, activityLauncher, true, config.getCardBrandFilter());
    }

    private final PaymentIntent asPaymentIntent(StripeIntent stripeIntent) {
        if (stripeIntent instanceof PaymentIntent) {
            return (PaymentIntent) stripeIntent;
        }
        return null;
    }

    private final boolean isProcessingPayment(PaymentElementLoader.InitializationMode initializationMode) {
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.PaymentIntent) {
            return true;
        }
        if (initializationMode instanceof PaymentElementLoader.InitializationMode.SetupIntent) {
            return false;
        }
        if (!(initializationMode instanceof PaymentElementLoader.InitializationMode.DeferredIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        return ((PaymentElementLoader.InitializationMode.DeferredIntent) initializationMode).getIntentConfiguration().getMode() instanceof PaymentSheet.IntentConfiguration.Mode.Payment;
    }
}
