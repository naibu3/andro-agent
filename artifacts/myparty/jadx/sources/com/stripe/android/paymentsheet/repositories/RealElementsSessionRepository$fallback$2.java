package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.ElementsSessionParams;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ElementsSessionRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/ElementsSession;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository$fallback$2", f = "ElementsSessionRepository.kt", i = {}, l = {88, 95}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class RealElementsSessionRepository$fallback$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ElementsSession>>, Object> {
    final /* synthetic */ Throwable $elementsSessionFailure;
    final /* synthetic */ ElementsSessionParams $params;
    int label;
    final /* synthetic */ RealElementsSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealElementsSessionRepository$fallback$2(ElementsSessionParams elementsSessionParams, RealElementsSessionRepository realElementsSessionRepository, Throwable th, Continuation<? super RealElementsSessionRepository$fallback$2> continuation) {
        super(2, continuation);
        this.$params = elementsSessionParams;
        this.this$0 = realElementsSessionRepository;
        this.$elementsSessionFailure = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RealElementsSessionRepository$fallback$2(this.$params, this.this$0, this.$elementsSessionFailure, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ElementsSession>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ElementsSession>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ElementsSession>> continuation) {
        return ((RealElementsSessionRepository$fallback$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM9118constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ElementsSessionParams elementsSessionParams = this.$params;
            if (elementsSessionParams instanceof ElementsSessionParams.PaymentIntentType) {
                this.label = 1;
                objM9118constructorimpl = this.this$0.stripeRepository.mo8049retrievePaymentIntentBWLJW6A(((ElementsSessionParams.PaymentIntentType) this.$params).getClientSecret(), this.this$0.getRequestOptions(), CollectionsKt.listOf("payment_method"), this);
            } else if (elementsSessionParams instanceof ElementsSessionParams.SetupIntentType) {
                this.label = 2;
                objM9118constructorimpl = this.this$0.stripeRepository.mo8051retrieveSetupIntentBWLJW6A(((ElementsSessionParams.SetupIntentType) this.$params).getClientSecret(), this.this$0.getRequestOptions(), CollectionsKt.listOf("payment_method"), this);
            } else {
                if (!(elementsSessionParams instanceof ElementsSessionParams.DeferredIntentType)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ElementsSessionRepositoryKt.toStripeIntent((ElementsSessionParams.DeferredIntentType) this.$params, this.this$0.getRequestOptions()));
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM9118constructorimpl = ((Result) obj).getValue();
        }
        Throwable th = this.$elementsSessionFailure;
        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = ElementsSession.Companion.createFromFallback$default(ElementsSession.INSTANCE, ElementsSessionRepositoryKt.withoutWeChatPay((StripeIntent) objM9118constructorimpl), th, null, 4, null);
        }
        return Result.m9117boximpl(Result.m9118constructorimpl(objM9118constructorimpl));
    }
}
