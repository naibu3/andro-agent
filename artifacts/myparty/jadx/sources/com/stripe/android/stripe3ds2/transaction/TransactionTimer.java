package com.stripe.android.stripe3ds2.transaction;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: TransactionTimer.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "", ViewProps.START, "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeout", "Lkotlinx/coroutines/flow/Flow;", "", "getTimeout", "()Lkotlinx/coroutines/flow/Flow;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TransactionTimer {
    Flow<Boolean> getTimeout();

    Object start(Continuation<? super Unit> continuation);
}
