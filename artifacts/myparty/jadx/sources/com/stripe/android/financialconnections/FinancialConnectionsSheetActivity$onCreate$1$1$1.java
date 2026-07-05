package com.stripe.android.financialconnections;

import androidx.compose.runtime.State;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FinancialConnectionsSheetActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.FinancialConnectionsSheetActivity$onCreate$1$1$1", f = "FinancialConnectionsSheetActivity.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FinancialConnectionsSheetActivity$onCreate$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StripeBottomSheetState $bottomSheetState;
    final /* synthetic */ State<FinancialConnectionsSheetState> $state$delegate;
    Object L$0;
    int label;
    final /* synthetic */ FinancialConnectionsSheetActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinancialConnectionsSheetActivity$onCreate$1$1$1(State<FinancialConnectionsSheetState> state, FinancialConnectionsSheetActivity financialConnectionsSheetActivity, StripeBottomSheetState stripeBottomSheetState, Continuation<? super FinancialConnectionsSheetActivity$onCreate$1$1$1> continuation) {
        super(2, continuation);
        this.$state$delegate = state;
        this.this$0 = financialConnectionsSheetActivity;
        this.$bottomSheetState = stripeBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetActivity$onCreate$1$1$1(this.$state$delegate, this.this$0, this.$bottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetActivity$onCreate$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FinancialConnectionsSheetActivity financialConnectionsSheetActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsSheetViewEffect viewEffect = FinancialConnectionsSheetActivity.C08501.invoke$lambda$0(this.$state$delegate).getViewEffect();
            if (viewEffect != null) {
                FinancialConnectionsSheetActivity financialConnectionsSheetActivity2 = this.this$0;
                StripeBottomSheetState stripeBottomSheetState = this.$bottomSheetState;
                this.L$0 = financialConnectionsSheetActivity2;
                this.label = 1;
                if (financialConnectionsSheetActivity2.handleViewEffect(viewEffect, stripeBottomSheetState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                financialConnectionsSheetActivity = financialConnectionsSheetActivity2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        financialConnectionsSheetActivity = (FinancialConnectionsSheetActivity) this.L$0;
        ResultKt.throwOnFailure(obj);
        financialConnectionsSheetActivity.getViewModel().onViewEffectLaunched$financial_connections_release();
        return Unit.INSTANCE;
    }
}
