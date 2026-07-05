package com.stripe.android.paymentelement.confirmation;

import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: DefaultConfirmationHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "", "it", "", "com/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$firstInstanceOf$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler$firstInstanceOf$2", f = "DefaultConfirmationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1 defaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1 = new DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1(continuation);
        defaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1.L$0 = obj;
        return defaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return ((DefaultConfirmationHandler$awaitResult$$inlined$firstInstanceOf$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.L$0 instanceof ConfirmationHandler.State.Complete);
    }
}
