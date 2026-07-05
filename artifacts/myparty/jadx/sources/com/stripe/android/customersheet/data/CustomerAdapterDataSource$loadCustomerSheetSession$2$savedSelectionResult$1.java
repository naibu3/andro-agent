package com.stripe.android.customersheet.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.paymentsheet.model.SavedSelection;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.data.CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1", f = "CustomerAdapterDataSource.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends SavedSelection>>, Object> {
    int label;
    final /* synthetic */ CustomerAdapterDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1(CustomerAdapterDataSource customerAdapterDataSource, Continuation<? super CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1> continuation) {
        super(2, continuation);
        this.this$0 = customerAdapterDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends SavedSelection>> continuation) {
        return ((CustomerAdapterDataSource$loadCustomerSheetSession$2$savedSelectionResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.retrieveSavedSelection(null, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Result.m9117boximpl(((CustomerSheetDataResult) obj).mo7270toResultd1pmJ48());
    }
}
