package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.common.coroutines.CoalescingOrchestrator;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EmbeddedConfigurationHandler.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class DefaultEmbeddedConfigurationHandler$configure$4 extends FunctionReferenceImpl implements Function1<Continuation<? super Result<? extends PaymentElementLoader.State>>, Object>, SuspendFunction {
    DefaultEmbeddedConfigurationHandler$configure$4(Object obj) {
        super(1, obj, CoalescingOrchestrator.class, "get", "get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-IoAF18A, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Object invoke(Continuation<? super Result<PaymentElementLoader.State>> continuation) {
        return ((CoalescingOrchestrator) this.receiver).get(continuation);
    }
}
