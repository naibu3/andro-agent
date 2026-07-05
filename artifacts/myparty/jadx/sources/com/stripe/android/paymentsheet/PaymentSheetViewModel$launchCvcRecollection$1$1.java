package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcCompletionState;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaymentSheetViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetViewModel$launchCvcRecollection$1$1", f = "PaymentSheetViewModel.kt", i = {}, l = {434}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentSheetViewModel$launchCvcRecollection$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CvcRecollectionInteractor $interactor;
    int label;
    final /* synthetic */ PaymentSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSheetViewModel$launchCvcRecollection$1$1(CvcRecollectionInteractor cvcRecollectionInteractor, PaymentSheetViewModel paymentSheetViewModel, Continuation<? super PaymentSheetViewModel$launchCvcRecollection$1$1> continuation) {
        super(2, continuation);
        this.$interactor = cvcRecollectionInteractor;
        this.this$0 = paymentSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentSheetViewModel$launchCvcRecollection$1$1(this.$interactor, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentSheetViewModel$launchCvcRecollection$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PaymentSheetViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetViewModel$launchCvcRecollection$1$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CvcCompletionState, Continuation<? super Unit>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(2, obj, PaymentSheetViewModel.class, "handleCvcCompletionState", "handleCvcCompletionState(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CvcCompletionState cvcCompletionState, Continuation<? super Unit> continuation) {
            return PaymentSheetViewModel$launchCvcRecollection$1$1.invokeSuspend$handleCvcCompletionState((PaymentSheetViewModel) this.receiver, cvcCompletionState, continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(this.$interactor.getCvcCompletionState(), new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$handleCvcCompletionState(PaymentSheetViewModel paymentSheetViewModel, CvcCompletionState cvcCompletionState, Continuation continuation) {
        paymentSheetViewModel.handleCvcCompletionState(cvcCompletionState);
        return Unit.INSTANCE;
    }
}
