package com.stripe.android.customersheet.data;

import com.stripe.android.model.ElementsSession;
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

/* compiled from: CustomerAdapterDataSource.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/ElementsSession;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1", f = "CustomerAdapterDataSource.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ElementsSession>>, Object> {
    int label;
    final /* synthetic */ CustomerAdapterDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1(CustomerAdapterDataSource customerAdapterDataSource, Continuation<? super CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1> continuation) {
        super(2, continuation);
        this.this$0 = customerAdapterDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ElementsSession>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ElementsSession>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ElementsSession>> continuation) {
        return ((CustomerAdapterDataSource$loadCustomerSheetSession$2$elementsSessionResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM7266fetchElementsSessionIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            objM7266fetchElementsSessionIoAF18A = this.this$0.m7266fetchElementsSessionIoAF18A(this);
            if (objM7266fetchElementsSessionIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM7266fetchElementsSessionIoAF18A = ((Result) obj).getValue();
        }
        return Result.m9117boximpl(objM7266fetchElementsSessionIoAF18A);
    }
}
