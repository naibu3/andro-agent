package com.stripe.android.stripe3ds2.transaction;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ImmediateTimeoutTransactionTimer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ImmediateTimeoutTransactionTimer;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "<init>", "()V", ViewProps.START, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeout", "Lkotlinx/coroutines/flow/Flow;", "", "getTimeout", "()Lkotlinx/coroutines/flow/Flow;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImmediateTimeoutTransactionTimer implements TransactionTimer {
    private final Flow<Boolean> timeout = FlowKt.flowOf(true);

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public Object start(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public Flow<Boolean> getTimeout() {
        return this.timeout;
    }
}
