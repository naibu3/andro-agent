package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: SavedPaymentMethodMutator.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "method", "cardUpdateParams", "Lcom/stripe/android/paymentsheet/CardUpdateParams;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3", f = "SavedPaymentMethodMutator.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3 extends SuspendLambda implements Function3<PaymentMethod, CardUpdateParams, Continuation<? super Result<? extends PaymentMethod>>, Object> {
    final /* synthetic */ Function2<CardUpdateParams, Continuation<? super Result<PaymentMethod>>, Object> $updatePaymentMethodExecutor;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3(Function2<? super CardUpdateParams, ? super Continuation<? super Result<PaymentMethod>>, ? extends Object> function2, Continuation<? super SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3> continuation) {
        super(3, continuation);
        this.$updatePaymentMethodExecutor = function2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3 savedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3 = new SavedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3(this.$updatePaymentMethodExecutor, continuation);
        savedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3.L$0 = cardUpdateParams;
        return savedPaymentMethodMutator$Companion$onUpdatePaymentMethod$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(PaymentMethod paymentMethod, CardUpdateParams cardUpdateParams, Continuation<? super Result<? extends PaymentMethod>> continuation) {
        return invoke2(paymentMethod, cardUpdateParams, (Continuation<? super Result<PaymentMethod>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CardUpdateParams cardUpdateParams = (CardUpdateParams) this.L$0;
        Function2<CardUpdateParams, Continuation<? super Result<PaymentMethod>>, Object> function2 = this.$updatePaymentMethodExecutor;
        this.label = 1;
        Object objInvoke = function2.invoke(cardUpdateParams, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}
