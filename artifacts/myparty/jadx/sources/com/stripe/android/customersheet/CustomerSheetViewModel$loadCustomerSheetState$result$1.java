package com.stripe.android.customersheet;

import com.stripe.android.customersheet.CustomerSheetState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerSheetViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/customersheet/CustomerSheetState$Full;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetViewModel$loadCustomerSheetState$result$1", f = "CustomerSheetViewModel.kt", i = {}, l = {339}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CustomerSheetViewModel$loadCustomerSheetState$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends CustomerSheetState.Full>>, Object> {
    int label;
    final /* synthetic */ CustomerSheetViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerSheetViewModel$loadCustomerSheetState$result$1(CustomerSheetViewModel customerSheetViewModel, Continuation<? super CustomerSheetViewModel$loadCustomerSheetState$result$1> continuation) {
        super(2, continuation);
        this.this$0 = customerSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerSheetViewModel$loadCustomerSheetState$result$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends CustomerSheetState.Full>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<CustomerSheetState.Full>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<CustomerSheetState.Full>> continuation) {
        return ((CustomerSheetViewModel$loadCustomerSheetState$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo7250loadgIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            objMo7250loadgIAlus = this.this$0.customerSheetLoader.mo7250loadgIAlus(this.this$0.configuration, this);
            if (objMo7250loadgIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo7250loadgIAlus = ((Result) obj).getValue();
        }
        return Result.m9117boximpl(objMo7250loadgIAlus);
    }
}
