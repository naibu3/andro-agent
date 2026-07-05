package com.stripe.android.link.confirmation;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.core.Logger;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.link.confirmation.Result;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.wallets.Wallet;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.link.LinkPassthroughConfirmationOption;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultLinkConfirmationHandler.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001!B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u0010\u0013J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u0010\u0015J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0082@¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J,\u0010\u001d\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J,\u0010\u001e\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u001f\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020 2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "logger", "Lcom/stripe/android/core/Logger;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;)V", "confirm", "Lcom/stripe/android/link/confirmation/Result;", "paymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "cvc", "", "billingPhone", "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/link/LinkPaymentDetails;", "(Lcom/stripe/android/link/LinkPaymentDetails;Lcom/stripe/android/link/model/LinkAccount;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createArgs", "Lkotlin/Function0;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Args;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Result;", "confirmationArgs", "newConfirmationArgs", "savedConfirmationArgs", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkConfirmationHandler implements LinkConfirmationHandler {
    public static final int $stable = 8;
    private final LinkConfiguration configuration;
    private final ConfirmationHandler confirmationHandler;
    private final Logger logger;

    /* compiled from: DefaultLinkConfirmationHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler", f = "DefaultLinkConfirmationHandler.kt", i = {0, 0, 1, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "confirm", n = {"this", "$this$confirm_u24lambda_u242", "this", "$this$confirm_u24lambda_u242"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler$confirm$5, reason: invalid class name */
    static final class AnonymousClass5 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultLinkConfirmationHandler.this.confirm(null, this);
        }
    }

    @Inject
    public DefaultLinkConfirmationHandler(LinkConfiguration configuration, Logger logger, ConfirmationHandler confirmationHandler) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(confirmationHandler, "confirmationHandler");
        this.configuration = configuration;
        this.logger = logger;
        this.confirmationHandler = confirmationHandler;
    }

    @Override // com.stripe.android.link.confirmation.LinkConfirmationHandler
    public Object confirm(final ConsumerPaymentDetails.PaymentDetails paymentDetails, final LinkAccount linkAccount, final String str, final String str2, Continuation<? super Result> continuation) {
        return confirm(new Function0() { // from class: com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.newConfirmationArgs(paymentDetails, linkAccount, str, str2);
            }
        }, continuation);
    }

    @Override // com.stripe.android.link.confirmation.LinkConfirmationHandler
    public Object confirm(final LinkPaymentDetails linkPaymentDetails, final LinkAccount linkAccount, final String str, final String str2, Continuation<? super Result> continuation) {
        return confirm(new Function0() { // from class: com.stripe.android.link.confirmation.DefaultLinkConfirmationHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.confirmationArgs(linkPaymentDetails, linkAccount, str, str2);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirm(Function0<ConfirmationHandler.Args> function0, Continuation<? super Result> continuation) {
        AnonymousClass5 anonymousClass5;
        DefaultLinkConfirmationHandler defaultLinkConfirmationHandler;
        DefaultLinkConfirmationHandler defaultLinkConfirmationHandler2;
        DefaultLinkConfirmationHandler defaultLinkConfirmationHandler3;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof AnonymousClass5) {
            anonymousClass5 = (AnonymousClass5) continuation;
            if ((anonymousClass5.label & Integer.MIN_VALUE) != 0) {
                anonymousClass5.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass5 = new AnonymousClass5(continuation);
            }
        }
        Object objAwaitResult = anonymousClass5.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass5.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwaitResult);
            try {
                Result.Companion companion = kotlin.Result.INSTANCE;
                DefaultLinkConfirmationHandler defaultLinkConfirmationHandler4 = this;
                ConfirmationHandler.Args argsInvoke = function0.invoke();
                ConfirmationHandler confirmationHandler = this.confirmationHandler;
                anonymousClass5.L$0 = this;
                anonymousClass5.L$1 = this;
                anonymousClass5.label = 1;
                if (confirmationHandler.start(argsInvoke, anonymousClass5) != coroutine_suspended) {
                    defaultLinkConfirmationHandler2 = this;
                    defaultLinkConfirmationHandler3 = defaultLinkConfirmationHandler2;
                }
                return coroutine_suspended;
            } catch (Throwable th) {
                th = th;
                defaultLinkConfirmationHandler = this;
                Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM9118constructorimpl = kotlin.Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = kotlin.Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defaultLinkConfirmationHandler2 = (DefaultLinkConfirmationHandler) anonymousClass5.L$1;
                defaultLinkConfirmationHandler = (DefaultLinkConfirmationHandler) anonymousClass5.L$0;
                try {
                    ResultKt.throwOnFailure(objAwaitResult);
                    objM9118constructorimpl = kotlin.Result.m9118constructorimpl(defaultLinkConfirmationHandler2.transformResult((ConfirmationHandler.Result) objAwaitResult));
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion22 = kotlin.Result.INSTANCE;
                    objM9118constructorimpl = kotlin.Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = kotlin.Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl == null) {
                    }
                }
                thM9121exceptionOrNullimpl = kotlin.Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                    return objM9118constructorimpl;
                }
                defaultLinkConfirmationHandler.logger.error("DefaultLinkConfirmationHandler: Failed to confirm payment", thM9121exceptionOrNullimpl);
                return new Result.Failed(ResolvableStringUtilsKt.getResolvableString(R.string.stripe_something_went_wrong));
            }
            defaultLinkConfirmationHandler2 = (DefaultLinkConfirmationHandler) anonymousClass5.L$1;
            defaultLinkConfirmationHandler3 = (DefaultLinkConfirmationHandler) anonymousClass5.L$0;
            try {
                ResultKt.throwOnFailure(objAwaitResult);
            } catch (Throwable th3) {
                th = th3;
                defaultLinkConfirmationHandler = defaultLinkConfirmationHandler3;
                Result.Companion companion222 = kotlin.Result.INSTANCE;
                objM9118constructorimpl = kotlin.Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = kotlin.Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        ConfirmationHandler confirmationHandler2 = defaultLinkConfirmationHandler2.confirmationHandler;
        anonymousClass5.L$0 = defaultLinkConfirmationHandler3;
        anonymousClass5.L$1 = defaultLinkConfirmationHandler2;
        anonymousClass5.label = 2;
        objAwaitResult = confirmationHandler2.awaitResult(anonymousClass5);
        if (objAwaitResult != coroutine_suspended) {
            defaultLinkConfirmationHandler = defaultLinkConfirmationHandler3;
            objM9118constructorimpl = kotlin.Result.m9118constructorimpl(defaultLinkConfirmationHandler2.transformResult((ConfirmationHandler.Result) objAwaitResult));
            thM9121exceptionOrNullimpl = kotlin.Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
            }
        }
        return coroutine_suspended;
    }

    private final Result transformResult(ConfirmationHandler.Result result) {
        if (result instanceof ConfirmationHandler.Result.Canceled) {
            return Result.Canceled.INSTANCE;
        }
        if (result instanceof ConfirmationHandler.Result.Failed) {
            ConfirmationHandler.Result.Failed failed = (ConfirmationHandler.Result.Failed) result;
            this.logger.error("DefaultLinkConfirmationHandler: Failed to confirm payment", failed.getCause());
            return new Result.Failed(failed.getMessage());
        }
        if (result instanceof ConfirmationHandler.Result.Succeeded) {
            return Result.Succeeded.INSTANCE;
        }
        if (result != null) {
            throw new NoWhenBranchMatchedException();
        }
        Logger.DefaultImpls.error$default(this.logger, "DefaultLinkConfirmationHandler: Payment confirmation returned null", null, 2, null);
        return new Result.Failed(ResolvableStringUtilsKt.getResolvableString(R.string.stripe_something_went_wrong));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfirmationHandler.Args confirmationArgs(LinkPaymentDetails paymentDetails, LinkAccount linkAccount, String cvc, String billingPhone) {
        if (paymentDetails instanceof LinkPaymentDetails.New) {
            return newConfirmationArgs(((LinkPaymentDetails.New) paymentDetails).getPaymentDetails(), linkAccount, cvc, billingPhone);
        }
        if (!(paymentDetails instanceof LinkPaymentDetails.Saved)) {
            throw new NoWhenBranchMatchedException();
        }
        return savedConfirmationArgs((LinkPaymentDetails.Saved) paymentDetails, cvc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfirmationHandler.Args newConfirmationArgs(ConsumerPaymentDetails.PaymentDetails paymentDetails, LinkAccount linkAccount, String cvc, String billingPhone) {
        PaymentMethodConfirmationOption.New linkPassthroughConfirmationOption;
        if (this.configuration.getPassthroughModeEnabled()) {
            linkPassthroughConfirmationOption = new LinkPassthroughConfirmationOption(paymentDetails.getId(), DefaultLinkConfirmationHandlerKt.computeExpectedPaymentMethodType(this.configuration, paymentDetails), cvc, billingPhone);
        } else {
            linkPassthroughConfirmationOption = new PaymentMethodConfirmationOption.New(DefaultLinkConfirmationHandlerKt.createPaymentMethodCreateParams(paymentDetails, linkAccount.getClientSecret(), cvc, billingPhone), null, null, false, null, 16, null);
        }
        return new ConfirmationHandler.Args(this.configuration.getStripeIntent(), linkPassthroughConfirmationOption, new PaymentSheet.Appearance(), this.configuration.getInitializationMode(), this.configuration.getShippingDetails());
    }

    private final ConfirmationHandler.Args savedConfirmationArgs(LinkPaymentDetails.Saved paymentDetails, String cvc) {
        return new ConfirmationHandler.Args(this.configuration.getStripeIntent(), new PaymentMethodConfirmationOption.Saved(new PaymentMethod.Builder().setId(paymentDetails.getPaymentDetails().getPaymentMethodId()).setCode(paymentDetails.getPaymentMethodCreateParams().getTypeCode()).setCard(new PaymentMethod.Card(null, null, null, null, null, null, null, paymentDetails.getPaymentDetails().getLast4(), null, new Wallet.LinkWallet(paymentDetails.getPaymentDetails().getLast4()), null, null, 3455, null)).setType(PaymentMethod.Type.Card).build(), new PaymentMethodOptionsParams.Card((cvc == null || this.configuration.getPassthroughModeEnabled()) ? null : cvc, null, ConfirmPaymentIntentParams.SetupFutureUsage.OffSession, 2, null), false, 4, null), new PaymentSheet.Appearance(), this.configuration.getInitializationMode(), this.configuration.getShippingDetails());
    }

    /* compiled from: DefaultLinkConfirmationHandler.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;)V", "create", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements LinkConfirmationHandler.Factory {
        public static final int $stable = 8;
        private final LinkConfiguration configuration;
        private final Logger logger;

        @Inject
        public Factory(LinkConfiguration configuration, Logger logger) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.configuration = configuration;
            this.logger = logger;
        }

        @Override // com.stripe.android.link.confirmation.LinkConfirmationHandler.Factory
        public LinkConfirmationHandler create(ConfirmationHandler confirmationHandler) {
            Intrinsics.checkNotNullParameter(confirmationHandler, "confirmationHandler");
            return new DefaultLinkConfirmationHandler(this.configuration, this.logger, confirmationHandler);
        }
    }
}
