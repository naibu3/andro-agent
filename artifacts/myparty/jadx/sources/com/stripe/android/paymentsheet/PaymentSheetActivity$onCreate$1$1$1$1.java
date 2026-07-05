package com.stripe.android.paymentsheet;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PaymentSheetActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$1$1$1$1", f = "PaymentSheetActivity.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PaymentSheetActivity$onCreate$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StripeBottomSheetState $bottomSheetState;
    int label;
    final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentSheetActivity$onCreate$1$1$1$1(PaymentSheetActivity paymentSheetActivity, StripeBottomSheetState stripeBottomSheetState, Continuation<? super PaymentSheetActivity$onCreate$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentSheetActivity;
        this.$bottomSheetState = stripeBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentSheetActivity$onCreate$1$1$1$1(this.this$0, this.$bottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentSheetActivity$onCreate$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: PaymentSheetActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$1$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ StripeBottomSheetState $bottomSheetState;
        final /* synthetic */ PaymentSheetActivity this$0;

        AnonymousClass1(PaymentSheetActivity paymentSheetActivity, StripeBottomSheetState stripeBottomSheetState) {
            this.this$0 = paymentSheetActivity;
            this.$bottomSheetState = stripeBottomSheetState;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(PaymentSheetResult paymentSheetResult, Continuation<? super Unit> continuation) throws IOException {
            PaymentSheetActivity$onCreate$1$1$1$1$1$emit$1 paymentSheetActivity$onCreate$1$1$1$1$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (continuation instanceof PaymentSheetActivity$onCreate$1$1$1$1$1$emit$1) {
                paymentSheetActivity$onCreate$1$1$1$1$1$emit$1 = (PaymentSheetActivity$onCreate$1$1$1$1$1$emit$1) continuation;
                if ((paymentSheetActivity$onCreate$1$1$1$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    paymentSheetActivity$onCreate$1$1$1$1$1$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    paymentSheetActivity$onCreate$1$1$1$1$1$emit$1 = new PaymentSheetActivity$onCreate$1$1$1$1$1$emit$1(this, continuation);
                }
            }
            Object obj = paymentSheetActivity$onCreate$1$1$1$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = paymentSheetActivity$onCreate$1$1$1$1$1$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setActivityResult(paymentSheetResult);
                StripeBottomSheetState stripeBottomSheetState = this.$bottomSheetState;
                paymentSheetActivity$onCreate$1$1$1$1$1$emit$1.L$0 = this;
                paymentSheetActivity$onCreate$1$1$1$1$1$emit$1.label = 1;
                if (stripeBottomSheetState.hide(paymentSheetActivity$onCreate$1$1$1$1$1$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass1 = this;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                anonymousClass1 = (AnonymousClass1) paymentSheetActivity$onCreate$1$1$1$1$1$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            anonymousClass1.this$0.getViewModel().getNavigationHandler().closeScreens();
            anonymousClass1.this$0.finish();
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((PaymentSheetResult) obj, (Continuation<? super Unit>) continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.filterNotNull(this.this$0.getViewModel().getPaymentSheetResult$paymentsheet_release()).collect(new AnonymousClass1(this.this$0, this.$bottomSheetState), this) == coroutine_suspended) {
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
}
