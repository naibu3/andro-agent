package com.stripe.android.link.confirmation;

import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkDismissalCoordinator;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAccountUtilKt;
import com.stripe.android.link.confirmation.CompleteLinkFlow;
import com.stripe.android.link.confirmation.Result;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.model.ConsumerShippingAddress;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompleteLinkFlow.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096B¢\u0006\u0002\u0010\u0012J<\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00152\u0006\u0010\u0019\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/link/confirmation/DefaultCompleteLinkFlow;", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow;", "linkConfirmationHandler", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "dismissalCoordinator", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "<init>", "(Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/LinkDismissalCoordinator;Lcom/stripe/android/link/LinkLaunchMode;)V", "invoke", "Lcom/stripe/android/link/confirmation/CompleteLinkFlow$Result;", "selectedPaymentDetails", "Lcom/stripe/android/link/LinkPaymentMethod;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "(Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/link/model/LinkAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeLinkFlow", "confirmPayment", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/stripe/android/link/confirmation/Result;", "", "paymentMethodSelection", "(Lcom/stripe/android/link/LinkLaunchMode;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultCompleteLinkFlow implements CompleteLinkFlow {
    public static final int $stable = 0;
    private final LinkDismissalCoordinator dismissalCoordinator;
    private final LinkAccountManager linkAccountManager;
    private final LinkConfirmationHandler linkConfirmationHandler;
    private final LinkLaunchMode linkLaunchMode;

    /* compiled from: CompleteLinkFlow.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.confirmation.DefaultCompleteLinkFlow", f = "CompleteLinkFlow.kt", i = {0, 0}, l = {94, 110}, m = "completeLinkFlow", n = {"$this$withDismissalDisabled$iv", "originalDismissible$iv"}, s = {"L$0", "Z$0"})
    /* renamed from: com.stripe.android.link.confirmation.DefaultCompleteLinkFlow$completeLinkFlow$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultCompleteLinkFlow.this.completeLinkFlow(null, null, null, this);
        }
    }

    @Inject
    public DefaultCompleteLinkFlow(LinkConfirmationHandler linkConfirmationHandler, LinkAccountManager linkAccountManager, LinkDismissalCoordinator dismissalCoordinator, LinkLaunchMode linkLaunchMode) {
        Intrinsics.checkNotNullParameter(linkConfirmationHandler, "linkConfirmationHandler");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(dismissalCoordinator, "dismissalCoordinator");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        this.linkConfirmationHandler = linkConfirmationHandler;
        this.linkAccountManager = linkAccountManager;
        this.dismissalCoordinator = dismissalCoordinator;
        this.linkLaunchMode = linkLaunchMode;
    }

    /* compiled from: CompleteLinkFlow.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/link/confirmation/Result;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.confirmation.DefaultCompleteLinkFlow$invoke$2", f = "CompleteLinkFlow.kt", i = {}, l = {68, 74}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.confirmation.DefaultCompleteLinkFlow$invoke$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Result>, Object> {
        final /* synthetic */ LinkAccount $linkAccount;
        final /* synthetic */ LinkPaymentMethod $selectedPaymentDetails;
        int label;
        final /* synthetic */ DefaultCompleteLinkFlow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LinkPaymentMethod linkPaymentMethod, DefaultCompleteLinkFlow defaultCompleteLinkFlow, LinkAccount linkAccount, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$selectedPaymentDetails = linkPaymentMethod;
            this.this$0 = defaultCompleteLinkFlow;
            this.$linkAccount = linkAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$selectedPaymentDetails, this.this$0, this.$linkAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Result> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        
            if (r11 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
        
            if (r11 == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (Result) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (Result) obj;
            }
            ResultKt.throwOnFailure(obj);
            LinkPaymentMethod linkPaymentMethod = this.$selectedPaymentDetails;
            if (linkPaymentMethod instanceof LinkPaymentMethod.ConsumerPaymentDetails) {
                this.label = 1;
                obj = this.this$0.linkConfirmationHandler.confirm(((LinkPaymentMethod.ConsumerPaymentDetails) this.$selectedPaymentDetails).getDetails(), this.$linkAccount, ((LinkPaymentMethod.ConsumerPaymentDetails) this.$selectedPaymentDetails).getCollectedCvc(), ((LinkPaymentMethod.ConsumerPaymentDetails) this.$selectedPaymentDetails).getBillingPhone(), this);
            } else {
                if (!(linkPaymentMethod instanceof LinkPaymentMethod.LinkPaymentDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.label = 2;
                obj = this.this$0.linkConfirmationHandler.confirm(((LinkPaymentMethod.LinkPaymentDetails) this.$selectedPaymentDetails).getLinkPaymentDetails(), this.$linkAccount, ((LinkPaymentMethod.LinkPaymentDetails) this.$selectedPaymentDetails).getCollectedCvc(), ((LinkPaymentMethod.LinkPaymentDetails) this.$selectedPaymentDetails).getBillingPhone(), this);
            }
            return coroutine_suspended;
        }
    }

    @Override // com.stripe.android.link.confirmation.CompleteLinkFlow
    public Object invoke(LinkPaymentMethod linkPaymentMethod, LinkAccount linkAccount, Continuation<? super CompleteLinkFlow.Result> continuation) {
        return completeLinkFlow(this.linkLaunchMode, new AnonymousClass2(linkPaymentMethod, this, linkAccount, null), linkPaymentMethod, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeLinkFlow(LinkLaunchMode linkLaunchMode, Function1<? super Continuation<? super Result>, ? extends Object> function1, LinkPaymentMethod linkPaymentMethod, Continuation<? super CompleteLinkFlow.Result> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        LinkDismissalCoordinator linkDismissalCoordinator;
        boolean z;
        LinkAccountUpdate linkAccountUpdate;
        LinkPaymentMethod linkPaymentMethod2;
        Result result;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objLoadDefaultShippingAddress = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkPaymentMethod2 = (LinkPaymentMethod) anonymousClass1.L$1;
                linkAccountUpdate = (LinkAccountUpdate) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objLoadDefaultShippingAddress);
                return new CompleteLinkFlow.Result.Completed(new LinkActivityResult.Completed(linkAccountUpdate, linkPaymentMethod2, (ConsumerShippingAddress) objLoadDefaultShippingAddress));
            }
            z = anonymousClass1.Z$0;
            linkDismissalCoordinator = (LinkDismissalCoordinator) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objLoadDefaultShippingAddress);
                result = (Result) objLoadDefaultShippingAddress;
                linkDismissalCoordinator.setDismissible(z);
                if (!Intrinsics.areEqual(result, Result.Canceled.INSTANCE)) {
                    return CompleteLinkFlow.Result.Canceled.INSTANCE;
                }
                if (result instanceof Result.Failed) {
                    return new CompleteLinkFlow.Result.Failed(((Result.Failed) result).getMessage());
                }
                if (!Intrinsics.areEqual(result, Result.Succeeded.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new CompleteLinkFlow.Result.Completed(new LinkActivityResult.Completed(new LinkAccountUpdate.Value(null, LinkAccountUpdate.Value.UpdateReason.PaymentConfirmed), null, null, 4, null));
            } catch (Throwable th) {
                th = th;
                linkDismissalCoordinator.setDismissible(z);
                throw th;
            }
        }
        ResultKt.throwOnFailure(objLoadDefaultShippingAddress);
        if ((linkLaunchMode instanceof LinkLaunchMode.Full) || (linkLaunchMode instanceof LinkLaunchMode.Confirmation)) {
            LinkDismissalCoordinator linkDismissalCoordinator2 = this.dismissalCoordinator;
            boolean z2 = linkDismissalCoordinator2.get_canDismiss();
            linkDismissalCoordinator2.setDismissible(false);
            try {
                anonymousClass1.L$0 = linkDismissalCoordinator2;
                anonymousClass1.Z$0 = z2;
                anonymousClass1.label = 1;
                Object objInvoke = function1.invoke(anonymousClass1);
                if (objInvoke != coroutine_suspended) {
                    linkDismissalCoordinator = linkDismissalCoordinator2;
                    z = z2;
                    objLoadDefaultShippingAddress = objInvoke;
                    result = (Result) objLoadDefaultShippingAddress;
                    linkDismissalCoordinator.setDismissible(z);
                    if (!Intrinsics.areEqual(result, Result.Canceled.INSTANCE)) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                linkDismissalCoordinator = linkDismissalCoordinator2;
                z = z2;
                linkDismissalCoordinator.setDismissible(z);
                throw th;
            }
        } else if (linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) {
            LinkAccountUpdate linkAccountUpdate2 = LinkAccountUtilKt.getLinkAccountUpdate(this.linkAccountManager);
            LinkAccountManager linkAccountManager = this.linkAccountManager;
            anonymousClass1.L$0 = linkAccountUpdate2;
            anonymousClass1.L$1 = linkPaymentMethod;
            anonymousClass1.label = 2;
            objLoadDefaultShippingAddress = LinkAccountUtilKt.loadDefaultShippingAddress(linkAccountManager, anonymousClass1);
            if (objLoadDefaultShippingAddress != coroutine_suspended) {
                linkAccountUpdate = linkAccountUpdate2;
                linkPaymentMethod2 = linkPaymentMethod;
                return new CompleteLinkFlow.Result.Completed(new LinkActivityResult.Completed(linkAccountUpdate, linkPaymentMethod2, (ConsumerShippingAddress) objLoadDefaultShippingAddress));
            }
        } else {
            if (!(linkLaunchMode instanceof LinkLaunchMode.Authentication)) {
                throw new NoWhenBranchMatchedException();
            }
            return new CompleteLinkFlow.Result.Completed(new LinkActivityResult.Completed(LinkAccountUtilKt.getLinkAccountUpdate(this.linkAccountManager), null, null));
        }
        return coroutine_suspended;
    }
}
