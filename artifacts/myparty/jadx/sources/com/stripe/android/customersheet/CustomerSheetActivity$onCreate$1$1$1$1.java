package com.stripe.android.customersheet;

import androidx.compose.runtime.State;
import com.stripe.android.customersheet.CustomerSheetActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
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

/* compiled from: CustomerSheetActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetActivity$onCreate$1$1$1$1", f = "CustomerSheetActivity.kt", i = {0}, l = {84}, m = "invokeSuspend", n = {FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, s = {"L$1"})
/* loaded from: classes5.dex */
final class CustomerSheetActivity$onCreate$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StripeBottomSheetState $bottomSheetState;
    final /* synthetic */ State<InternalCustomerSheetResult> $result$delegate;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CustomerSheetActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomerSheetActivity$onCreate$1$1$1$1(State<? extends InternalCustomerSheetResult> state, StripeBottomSheetState stripeBottomSheetState, CustomerSheetActivity customerSheetActivity, Continuation<? super CustomerSheetActivity$onCreate$1$1$1$1> continuation) {
        super(2, continuation);
        this.$result$delegate = state;
        this.$bottomSheetState = stripeBottomSheetState;
        this.this$0 = customerSheetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerSheetActivity$onCreate$1$1$1$1(this.$result$delegate, this.$bottomSheetState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CustomerSheetActivity$onCreate$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InternalCustomerSheetResult internalCustomerSheetResult;
        CustomerSheetActivity customerSheetActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InternalCustomerSheetResult internalCustomerSheetResultInvoke$lambda$2 = CustomerSheetActivity.AnonymousClass1.C01471.invoke$lambda$2(this.$result$delegate);
            if (internalCustomerSheetResultInvoke$lambda$2 != null) {
                StripeBottomSheetState stripeBottomSheetState = this.$bottomSheetState;
                CustomerSheetActivity customerSheetActivity2 = this.this$0;
                this.L$0 = customerSheetActivity2;
                this.L$1 = internalCustomerSheetResultInvoke$lambda$2;
                this.label = 1;
                if (stripeBottomSheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                internalCustomerSheetResult = internalCustomerSheetResultInvoke$lambda$2;
                customerSheetActivity = customerSheetActivity2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        internalCustomerSheetResult = (InternalCustomerSheetResult) this.L$1;
        customerSheetActivity = (CustomerSheetActivity) this.L$0;
        ResultKt.throwOnFailure(obj);
        customerSheetActivity.finishWithResult(internalCustomerSheetResult);
        return Unit.INSTANCE;
    }
}
