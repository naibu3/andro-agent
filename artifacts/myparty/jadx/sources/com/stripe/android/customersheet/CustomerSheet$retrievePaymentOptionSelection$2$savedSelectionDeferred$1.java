package com.stripe.android.customersheet;

import com.stripe.android.customersheet.data.CustomerSheetDataResult;
import com.stripe.android.customersheet.data.CustomerSheetSavedSelectionDataSource;
import com.stripe.android.customersheet.util.CustomerSheetHacks;
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

/* compiled from: CustomerSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1", f = "CustomerSheet.kt", i = {}, l = {135, 135}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends SavedSelection>>, Object> {
    int label;

    CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1(Continuation<? super CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends SavedSelection>> continuation) {
        return ((CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = CustomerSheetHacks.INSTANCE.getSavedSelectionDataSource().await(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Result.m9117boximpl(((CustomerSheetDataResult) obj).mo7270toResultd1pmJ48());
        }
        ResultKt.throwOnFailure(obj);
        this.label = 2;
        obj = ((CustomerSheetSavedSelectionDataSource) obj).retrieveSavedSelection(null, this);
    }
}
