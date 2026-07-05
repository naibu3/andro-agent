package com.stripe.android.customersheet;

import com.stripe.android.common.coroutines.CoalescingOrchestrator;
import com.stripe.android.customersheet.CustomerAdapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StripeCustomerAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "Lcom/stripe/android/customersheet/CustomerEphemeralKey;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter$getCustomerEphemeralKey$2", f = "StripeCustomerAdapter.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class StripeCustomerAdapter$getCustomerEphemeralKey$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CustomerAdapter.Result<CustomerEphemeralKey>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StripeCustomerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StripeCustomerAdapter$getCustomerEphemeralKey$2(StripeCustomerAdapter stripeCustomerAdapter, Continuation<StripeCustomerAdapter$getCustomerEphemeralKey$2> continuation) {
        super(2, continuation);
        this.this$0 = stripeCustomerAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StripeCustomerAdapter$getCustomerEphemeralKey$2 stripeCustomerAdapter$getCustomerEphemeralKey$2 = new StripeCustomerAdapter$getCustomerEphemeralKey$2(this.this$0, continuation);
        stripeCustomerAdapter$getCustomerEphemeralKey$2.L$0 = obj;
        return stripeCustomerAdapter$getCustomerEphemeralKey$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super CustomerAdapter.Result<CustomerEphemeralKey>> continuation) {
        return invoke2(coroutineScope, (Continuation<CustomerAdapter.Result<CustomerEphemeralKey>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<CustomerAdapter.Result<CustomerEphemeralKey>> continuation) {
        return ((StripeCustomerAdapter$getCustomerEphemeralKey$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StripeCustomerAdapter stripeCustomerAdapter;
        CustomerAdapter.Result<CustomerEphemeralKey> result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CachedCustomerEphemeralKey cachedCustomerEphemeralKey = this.this$0.cachedCustomerEphemeralKey;
            StripeCustomerAdapter stripeCustomerAdapter2 = this.this$0;
            if (cachedCustomerEphemeralKey == null || stripeCustomerAdapter2.shouldRefreshCustomer(cachedCustomerEphemeralKey.getDate())) {
                cachedCustomerEphemeralKey = null;
            }
            if (cachedCustomerEphemeralKey != null && (result = cachedCustomerEphemeralKey.getResult()) != null) {
                return result;
            }
            StripeCustomerAdapter stripeCustomerAdapter3 = this.this$0;
            CoalescingOrchestrator coalescingOrchestrator = stripeCustomerAdapter3.customerEphemeralKeyCoalescingOrchestrator;
            this.L$0 = stripeCustomerAdapter3;
            this.label = 1;
            Object obj2 = coalescingOrchestrator.get(this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            stripeCustomerAdapter = stripeCustomerAdapter3;
            obj = obj2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stripeCustomerAdapter = (StripeCustomerAdapter) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        CachedCustomerEphemeralKey cachedCustomerEphemeralKey2 = new CachedCustomerEphemeralKey((CustomerAdapter.Result) obj, ((Number) stripeCustomerAdapter.timeProvider.invoke()).longValue());
        stripeCustomerAdapter.cachedCustomerEphemeralKey = cachedCustomerEphemeralKey2;
        return cachedCustomerEphemeralKey2.getResult();
    }
}
