package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationResult;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BacsMandateConfirmationActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1$1$1", f = "BacsMandateConfirmationActivity.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BacsMandateConfirmationActivity$onCreate$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StripeBottomSheetState $bottomSheetState;
    int label;
    final /* synthetic */ BacsMandateConfirmationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BacsMandateConfirmationActivity$onCreate$2$1$1$1(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, StripeBottomSheetState stripeBottomSheetState, Continuation<? super BacsMandateConfirmationActivity$onCreate$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bacsMandateConfirmationActivity;
        this.$bottomSheetState = stripeBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BacsMandateConfirmationActivity$onCreate$2$1$1$1(this.this$0, this.$bottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BacsMandateConfirmationActivity$onCreate$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: BacsMandateConfirmationActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1$1$1$1", f = "BacsMandateConfirmationActivity.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity$onCreate$2$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<BacsMandateConfirmationResult, Continuation<? super Unit>, Object> {
        final /* synthetic */ StripeBottomSheetState $bottomSheetState;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BacsMandateConfirmationActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, StripeBottomSheetState stripeBottomSheetState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bacsMandateConfirmationActivity;
            this.$bottomSheetState = stripeBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$bottomSheetState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BacsMandateConfirmationResult bacsMandateConfirmationResult, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(bacsMandateConfirmationResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BacsMandateConfirmationResult bacsMandateConfirmationResult = (BacsMandateConfirmationResult) this.L$0;
                BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.this$0;
                BacsMandateConfirmationResult.Companion companion = BacsMandateConfirmationResult.INSTANCE;
                Intent intent = this.this$0.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                bacsMandateConfirmationActivity.setResult(-1, companion.toIntent(intent, bacsMandateConfirmationResult));
                this.label = 1;
                if (this.$bottomSheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.collectLatest(this.this$0.getViewModel().getResult(), new AnonymousClass1(this.this$0, this.$bottomSheetState, null), this) == coroutine_suspended) {
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
