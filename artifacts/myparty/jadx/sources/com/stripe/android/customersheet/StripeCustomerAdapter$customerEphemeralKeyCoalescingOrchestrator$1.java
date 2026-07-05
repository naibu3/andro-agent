package com.stripe.android.customersheet;

import com.stripe.android.customersheet.CustomerAdapter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StripeCustomerAdapter.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class StripeCustomerAdapter$customerEphemeralKeyCoalescingOrchestrator$1 extends FunctionReferenceImpl implements Function1<Continuation<? super CustomerAdapter.Result<CustomerEphemeralKey>>, Object>, SuspendFunction {
    StripeCustomerAdapter$customerEphemeralKeyCoalescingOrchestrator$1(Object obj) {
        super(1, obj, CustomerEphemeralKeyProvider.class, "provideCustomerEphemeralKey", "provideCustomerEphemeralKey(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super CustomerAdapter.Result<CustomerEphemeralKey>> continuation) {
        return invoke2((Continuation<CustomerAdapter.Result<CustomerEphemeralKey>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<CustomerAdapter.Result<CustomerEphemeralKey>> continuation) {
        return ((CustomerEphemeralKeyProvider) this.receiver).provideCustomerEphemeralKey(continuation);
    }
}
