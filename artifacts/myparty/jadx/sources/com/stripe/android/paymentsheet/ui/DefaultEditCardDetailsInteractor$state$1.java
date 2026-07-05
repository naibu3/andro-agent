package com.stripe.android.paymentsheet.ui;

import com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: EditCardDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;", "inputState", "Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.ui.DefaultEditCardDetailsInteractor$state$1", f = "EditCardDetailsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultEditCardDetailsInteractor$state$1 extends SuspendLambda implements Function2<CardDetailsEntry, Continuation<? super EditCardDetailsInteractor.State>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultEditCardDetailsInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEditCardDetailsInteractor$state$1(DefaultEditCardDetailsInteractor defaultEditCardDetailsInteractor, Continuation<? super DefaultEditCardDetailsInteractor$state$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultEditCardDetailsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultEditCardDetailsInteractor$state$1 defaultEditCardDetailsInteractor$state$1 = new DefaultEditCardDetailsInteractor$state$1(this.this$0, continuation);
        defaultEditCardDetailsInteractor$state$1.L$0 = obj;
        return defaultEditCardDetailsInteractor$state$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CardDetailsEntry cardDetailsEntry, Continuation<? super EditCardDetailsInteractor.State> continuation) {
        return ((DefaultEditCardDetailsInteractor$state$1) create(cardDetailsEntry, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CardDetailsEntry cardDetailsEntry = (CardDetailsEntry) this.L$0;
        DefaultEditCardDetailsInteractor defaultEditCardDetailsInteractor = this.this$0;
        return defaultEditCardDetailsInteractor.uiState(cardDetailsEntry, defaultEditCardDetailsInteractor.billingDetailsForm);
    }
}
