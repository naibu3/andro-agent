package com.stripe.android.paymentelement.confirmation.epms;

import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackIdentifier;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.ExternalPaymentMethodConfirmHandler;
import com.stripe.android.paymentsheet.ExternalPaymentMethodContract;
import com.stripe.android.paymentsheet.ExternalPaymentMethodInput;
import com.stripe.android.paymentsheet.ExternalPaymentMethodProxyActivity;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalPaymentMethodConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u001fH\u0016J3\u0010 \u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¢\u0006\u0002\u0010#J*\u0010$\u001a\u00020%2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodInput;", "", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentElementCallbackIdentifier", "", "externalPaymentMethodConfirmHandlerProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "<init>", "(Ljava/lang/String;Ljavax/inject/Provider;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V", SDKConstants.PARAM_KEY, "getKey", "()Ljava/lang/String;", "option", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "(Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLauncher", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "Lkotlin/Function1;", "launch", "launcher", "arguments", "(Landroidx/activity/result/ActivityResultLauncher;Lkotlin/Unit;Lcom/stripe/android/paymentelement/confirmation/epms/ExternalPaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V", "toResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExternalPaymentMethodConfirmationDefinition implements ConfirmationDefinition<ExternalPaymentMethodConfirmationOption, ActivityResultLauncher<ExternalPaymentMethodInput>, Unit, PaymentResult> {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;
    private final Provider<ExternalPaymentMethodConfirmHandler> externalPaymentMethodConfirmHandlerProvider;
    private final String key;
    private final String paymentElementCallbackIdentifier;

    @Inject
    public ExternalPaymentMethodConfirmationDefinition(@PaymentElementCallbackIdentifier String paymentElementCallbackIdentifier, Provider<ExternalPaymentMethodConfirmHandler> externalPaymentMethodConfirmHandlerProvider, ErrorReporter errorReporter) {
        Intrinsics.checkNotNullParameter(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandlerProvider, "externalPaymentMethodConfirmHandlerProvider");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        this.paymentElementCallbackIdentifier = paymentElementCallbackIdentifier;
        this.externalPaymentMethodConfirmHandlerProvider = externalPaymentMethodConfirmHandlerProvider;
        this.errorReporter = errorReporter;
        this.key = "ExternalPaymentMethod";
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public boolean canConfirm(ExternalPaymentMethodConfirmationOption externalPaymentMethodConfirmationOption, ConfirmationDefinition.Parameters parameters) {
        return ConfirmationDefinition.DefaultImpls.canConfirm(this, externalPaymentMethodConfirmationOption, parameters);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public /* bridge */ /* synthetic */ ActivityResultLauncher<ExternalPaymentMethodInput> createLauncher(ActivityResultCaller activityResultCaller, Function1 function1) {
        return createLauncher(activityResultCaller, (Function1<? super PaymentResult, Unit>) function1);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void unregister(ActivityResultLauncher<ExternalPaymentMethodInput> activityResultLauncher) {
        ConfirmationDefinition.DefaultImpls.unregister(this, activityResultLauncher);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public String getKey() {
        return this.key;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ExternalPaymentMethodConfirmationOption option(ConfirmationHandler.Option confirmationOption) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        if (confirmationOption instanceof ExternalPaymentMethodConfirmationOption) {
            return (ExternalPaymentMethodConfirmationOption) confirmationOption;
        }
        return null;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public Object action(ExternalPaymentMethodConfirmationOption externalPaymentMethodConfirmationOption, ConfirmationDefinition.Parameters parameters, Continuation<? super ConfirmationDefinition.Action<Unit>> continuation) {
        String type = externalPaymentMethodConfirmationOption.getType();
        if (this.externalPaymentMethodConfirmHandlerProvider.get() == null) {
            ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.ExpectedErrorEvent.EXTERNAL_PAYMENT_METHOD_CONFIRM_HANDLER_NULL, null, MapsKt.mapOf(TuplesKt.to(ExternalPaymentMethodProxyActivity.EXTRA_EXTERNAL_PAYMENT_METHOD_TYPE, type)), 2, null);
            IllegalStateException illegalStateException = new IllegalStateException("externalPaymentMethodConfirmHandler is null. Cannot process payment for payment selection: " + type);
            return new ConfirmationDefinition.Action.Fail(illegalStateException, ExceptionKtKt.stripeErrorMessage(illegalStateException), ConfirmationHandler.Result.Failed.ErrorType.ExternalPaymentMethod.INSTANCE);
        }
        return new ConfirmationDefinition.Action.Launch(Unit.INSTANCE, false, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ActivityResultLauncher<ExternalPaymentMethodInput> createLauncher(ActivityResultCaller activityResultCaller, Function1<? super PaymentResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        return activityResultCaller.registerForActivityResult(new ExternalPaymentMethodContract(this.errorReporter), new ExternalPaymentMethodConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0(onResult));
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void launch(ActivityResultLauncher<ExternalPaymentMethodInput> launcher, Unit arguments, ExternalPaymentMethodConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.SuccessEvent.EXTERNAL_PAYMENT_METHODS_LAUNCH_SUCCESS, null, MapsKt.mapOf(TuplesKt.to(ExternalPaymentMethodProxyActivity.EXTRA_EXTERNAL_PAYMENT_METHOD_TYPE, confirmationOption.getType())), 2, null);
        launcher.launch(new ExternalPaymentMethodInput(this.paymentElementCallbackIdentifier, confirmationOption.getType(), confirmationOption.getBillingDetails()));
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ConfirmationDefinition.Result toResult(ExternalPaymentMethodConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType, PaymentResult result) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof PaymentResult.Completed) {
            return new ConfirmationDefinition.Result.Succeeded(confirmationParameters.getIntent(), null, false, 4, null);
        }
        if (result instanceof PaymentResult.Failed) {
            PaymentResult.Failed failed = (PaymentResult.Failed) result;
            return new ConfirmationDefinition.Result.Failed(failed.getThrowable(), ExceptionKtKt.stripeErrorMessage(failed.getThrowable()), ConfirmationHandler.Result.Failed.ErrorType.ExternalPaymentMethod.INSTANCE);
        }
        if (!(result instanceof PaymentResult.Canceled)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ConfirmationDefinition.Result.Canceled(ConfirmationHandler.Result.Canceled.Action.None);
    }
}
