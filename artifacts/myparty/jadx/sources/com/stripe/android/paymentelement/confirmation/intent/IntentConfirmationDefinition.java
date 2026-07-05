package com.stripe.android.paymentelement.confirmation.intent;

import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationInterceptor;
import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001.B)\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\tH\u0016J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\"\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\u0005H\u0016J \u0010'\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006/"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;", "Lcom/stripe/android/payments/paymentlauncher/InternalPaymentResult;", "intentConfirmationInterceptor", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;", "paymentLauncherFactory", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;Lkotlin/jvm/functions/Function1;)V", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "option", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLauncher", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "", "launch", "launcher", "arguments", "toResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "launchNextAction", "clientSecret", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/model/StripeIntent;", "launchConfirm", "confirmStripeIntentParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Args", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntentConfirmationDefinition implements ConfirmationDefinition<PaymentMethodConfirmationOption, PaymentLauncher, Args, InternalPaymentResult> {
    public static final int $stable = 8;
    private final IntentConfirmationInterceptor intentConfirmationInterceptor;
    private final String key;
    private final Function1<ActivityResultLauncher<PaymentLauncherContract.Args>, PaymentLauncher> paymentLauncherFactory;

    /* compiled from: IntentConfirmationDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationDefinition", f = "IntentConfirmationDefinition.kt", i = {0, 0}, l = {38}, m = "action", n = {"confirmationOption", "confirmationParameters"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationDefinition$action$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IntentConfirmationDefinition.this.action((PaymentMethodConfirmationOption) null, (ConfirmationDefinition.Parameters) null, (Continuation<? super ConfirmationDefinition.Action<Args>>) this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntentConfirmationDefinition(IntentConfirmationInterceptor intentConfirmationInterceptor, Function1<? super ActivityResultLauncher<PaymentLauncherContract.Args>, ? extends PaymentLauncher> paymentLauncherFactory) {
        Intrinsics.checkNotNullParameter(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        Intrinsics.checkNotNullParameter(paymentLauncherFactory, "paymentLauncherFactory");
        this.intentConfirmationInterceptor = intentConfirmationInterceptor;
        this.paymentLauncherFactory = paymentLauncherFactory;
        this.key = "IntentConfirmation";
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public boolean canConfirm(PaymentMethodConfirmationOption paymentMethodConfirmationOption, ConfirmationDefinition.Parameters parameters) {
        return ConfirmationDefinition.DefaultImpls.canConfirm(this, paymentMethodConfirmationOption, parameters);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public /* bridge */ /* synthetic */ PaymentLauncher createLauncher(ActivityResultCaller activityResultCaller, Function1 function1) {
        return createLauncher(activityResultCaller, (Function1<? super InternalPaymentResult, Unit>) function1);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void unregister(PaymentLauncher paymentLauncher) {
        ConfirmationDefinition.DefaultImpls.unregister(this, paymentLauncher);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public String getKey() {
        return this.key;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public PaymentMethodConfirmationOption option(ConfirmationHandler.Option confirmationOption) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        if (confirmationOption instanceof PaymentMethodConfirmationOption) {
            return (PaymentMethodConfirmationOption) confirmationOption;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object action(PaymentMethodConfirmationOption paymentMethodConfirmationOption, ConfirmationDefinition.Parameters parameters, Continuation<? super ConfirmationDefinition.Action<Args>> continuation) {
        AnonymousClass1 anonymousClass1;
        PaymentMethodConfirmationOption paymentMethodConfirmationOption2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objIntercept = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objIntercept);
            IntentConfirmationInterceptor intentConfirmationInterceptor = this.intentConfirmationInterceptor;
            StripeIntent intent = parameters.getIntent();
            PaymentElementLoader.InitializationMode initializationMode = parameters.getInitializationMode();
            AddressDetails shippingDetails = parameters.getShippingDetails();
            anonymousClass12.L$0 = paymentMethodConfirmationOption;
            anonymousClass12.L$1 = parameters;
            anonymousClass12.label = 1;
            objIntercept = IntentConfirmationInterceptorKtxKt.intercept(intentConfirmationInterceptor, paymentMethodConfirmationOption, intent, initializationMode, shippingDetails, anonymousClass12);
            if (objIntercept == coroutine_suspended) {
                return coroutine_suspended;
            }
            paymentMethodConfirmationOption2 = paymentMethodConfirmationOption;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            parameters = (ConfirmationDefinition.Parameters) anonymousClass12.L$1;
            paymentMethodConfirmationOption2 = (PaymentMethodConfirmationOption) anonymousClass12.L$0;
            ResultKt.throwOnFailure(objIntercept);
        }
        IntentConfirmationInterceptor.NextStep nextStep = (IntentConfirmationInterceptor.NextStep) objIntercept;
        DeferredIntentConfirmationType deferredIntentConfirmationType = nextStep.getDeferredIntentConfirmationType();
        if (nextStep instanceof IntentConfirmationInterceptor.NextStep.HandleNextAction) {
            return new ConfirmationDefinition.Action.Launch(new Args.NextAction(((IntentConfirmationInterceptor.NextStep.HandleNextAction) nextStep).getClientSecret()), false, deferredIntentConfirmationType);
        }
        if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Confirm) {
            return new ConfirmationDefinition.Action.Launch(new Args.Confirm(((IntentConfirmationInterceptor.NextStep.Confirm) nextStep).getConfirmParams()), false, deferredIntentConfirmationType);
        }
        if (nextStep instanceof IntentConfirmationInterceptor.NextStep.Fail) {
            IntentConfirmationInterceptor.NextStep.Fail fail = (IntentConfirmationInterceptor.NextStep.Fail) nextStep;
            return new ConfirmationDefinition.Action.Fail(fail.getCause(), fail.getMessage(), ConfirmationHandler.Result.Failed.ErrorType.Payment.INSTANCE);
        }
        if (!(nextStep instanceof IntentConfirmationInterceptor.NextStep.Complete)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ConfirmationDefinition.Action.Complete(parameters.getIntent(), paymentMethodConfirmationOption2, deferredIntentConfirmationType, ((IntentConfirmationInterceptor.NextStep.Complete) nextStep).getCompletedFullPaymentFlow());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public PaymentLauncher createLauncher(ActivityResultCaller activityResultCaller, Function1<? super InternalPaymentResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        return this.paymentLauncherFactory.invoke(activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new IntentConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0(onResult)));
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void launch(PaymentLauncher launcher, Args arguments, PaymentMethodConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        if (arguments instanceof Args.Confirm) {
            launchConfirm(launcher, ((Args.Confirm) arguments).getConfirmNextParams());
        } else {
            if (!(arguments instanceof Args.NextAction)) {
                throw new NoWhenBranchMatchedException();
            }
            launchNextAction(launcher, ((Args.NextAction) arguments).getClientSecret(), confirmationParameters.getIntent());
        }
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ConfirmationDefinition.Result toResult(PaymentMethodConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType, InternalPaymentResult result) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof InternalPaymentResult.Completed) {
            return new ConfirmationDefinition.Result.Succeeded(((InternalPaymentResult.Completed) result).getIntent(), deferredIntentConfirmationType, false, 4, null);
        }
        if (result instanceof InternalPaymentResult.Failed) {
            InternalPaymentResult.Failed failed = (InternalPaymentResult.Failed) result;
            return new ConfirmationDefinition.Result.Failed(failed.getThrowable(), ExceptionKtKt.stripeErrorMessage(failed.getThrowable()), ConfirmationHandler.Result.Failed.ErrorType.Payment.INSTANCE);
        }
        if (!(result instanceof InternalPaymentResult.Canceled)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ConfirmationDefinition.Result.Canceled(ConfirmationHandler.Result.Canceled.Action.InformCancellation);
    }

    private final void launchNextAction(PaymentLauncher launcher, String clientSecret, StripeIntent intent) {
        if (intent instanceof PaymentIntent) {
            launcher.handleNextActionForPaymentIntent(clientSecret);
        } else {
            if (!(intent instanceof SetupIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            launcher.handleNextActionForSetupIntent(clientSecret);
        }
    }

    private final void launchConfirm(PaymentLauncher launcher, ConfirmStripeIntentParams confirmStripeIntentParams) {
        if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
            launcher.confirm((ConfirmPaymentIntentParams) confirmStripeIntentParams);
        } else {
            if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                throw new NoWhenBranchMatchedException();
            }
            launcher.confirm((ConfirmSetupIntentParams) confirmStripeIntentParams);
        }
    }

    /* compiled from: IntentConfirmationDefinition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;", "", "NextAction", "Confirm", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$Confirm;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$NextAction;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Args {

        /* compiled from: IntentConfirmationDefinition.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$NextAction;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;", "clientSecret", "", "<init>", "(Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NextAction implements Args {
            public static final int $stable = 0;
            private final String clientSecret;

            public static /* synthetic */ NextAction copy$default(NextAction nextAction, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = nextAction.clientSecret;
                }
                return nextAction.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public final NextAction copy(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new NextAction(clientSecret);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NextAction) && Intrinsics.areEqual(this.clientSecret, ((NextAction) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                return "NextAction(clientSecret=" + this.clientSecret + ")";
            }

            public NextAction(String clientSecret) {
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            public final String getClientSecret() {
                return this.clientSecret;
            }
        }

        /* compiled from: IntentConfirmationDefinition.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args$Confirm;", "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationDefinition$Args;", "confirmNextParams", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "<init>", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;)V", "getConfirmNextParams", "()Lcom/stripe/android/model/ConfirmStripeIntentParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Confirm implements Args {
            public static final int $stable = 8;
            private final ConfirmStripeIntentParams confirmNextParams;

            public static /* synthetic */ Confirm copy$default(Confirm confirm, ConfirmStripeIntentParams confirmStripeIntentParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmStripeIntentParams = confirm.confirmNextParams;
                }
                return confirm.copy(confirmStripeIntentParams);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmStripeIntentParams getConfirmNextParams() {
                return this.confirmNextParams;
            }

            public final Confirm copy(ConfirmStripeIntentParams confirmNextParams) {
                Intrinsics.checkNotNullParameter(confirmNextParams, "confirmNextParams");
                return new Confirm(confirmNextParams);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Confirm) && Intrinsics.areEqual(this.confirmNextParams, ((Confirm) other).confirmNextParams);
            }

            public int hashCode() {
                return this.confirmNextParams.hashCode();
            }

            public String toString() {
                return "Confirm(confirmNextParams=" + this.confirmNextParams + ")";
            }

            public Confirm(ConfirmStripeIntentParams confirmNextParams) {
                Intrinsics.checkNotNullParameter(confirmNextParams, "confirmNextParams");
                this.confirmNextParams = confirmNextParams;
            }

            public final ConfirmStripeIntentParams getConfirmNextParams() {
                return this.confirmNextParams;
            }
        }
    }
}
