package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CustomerApiRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/stripe/android/model/PaymentMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2", f = "CustomerApiRepository.kt", i = {0}, l = {89}, m = "invokeSuspend", n = {"paymentMethods"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class CustomerApiRepository$getPaymentMethods$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends PaymentMethod>>>, Object> {
    final /* synthetic */ CustomerRepository.CustomerInfo $customerInfo;
    final /* synthetic */ boolean $silentlyFail;
    final /* synthetic */ List<PaymentMethod.Type> $types;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CustomerApiRepository$getPaymentMethods$2(List<? extends PaymentMethod.Type> list, CustomerApiRepository customerApiRepository, CustomerRepository.CustomerInfo customerInfo, boolean z, Continuation<? super CustomerApiRepository$getPaymentMethods$2> continuation) {
        super(2, continuation);
        this.$types = list;
        this.this$0 = customerApiRepository;
        this.$customerInfo = customerInfo;
        this.$silentlyFail = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CustomerApiRepository$getPaymentMethods$2 customerApiRepository$getPaymentMethods$2 = new CustomerApiRepository$getPaymentMethods$2(this.$types, this.this$0, this.$customerInfo, this.$silentlyFail, continuation);
        customerApiRepository$getPaymentMethods$2.L$0 = obj;
        return customerApiRepository$getPaymentMethods$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends PaymentMethod>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<PaymentMethod>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<PaymentMethod>>> continuation) {
        return ((CustomerApiRepository$getPaymentMethods$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List<PaymentMethod.Type> list2 = this.$types;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (SetsKt.setOf((Object[]) new PaymentMethod.Type[]{PaymentMethod.Type.Card, PaymentMethod.Type.USBankAccount, PaymentMethod.Type.SepaDebit}).contains((PaymentMethod.Type) obj2)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = arrayList;
            CustomerApiRepository customerApiRepository = this.this$0;
            CustomerRepository.CustomerInfo customerInfo = this.$customerInfo;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CustomerApiRepository$getPaymentMethods$2$requests$2$1(customerApiRepository, customerInfo, (PaymentMethod.Type) it.next(), null), 3, null));
            }
            ArrayList arrayList4 = new ArrayList();
            this.L$0 = arrayList4;
            this.label = 1;
            Object objAwaitAll = AwaitKt.awaitAll(arrayList3, this);
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList4;
            obj = objAwaitAll;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        CustomerApiRepository customerApiRepository2 = this.this$0;
        boolean z = this.$silentlyFail;
        Iterator it2 = ((Iterable) obj).iterator();
        while (it2.hasNext()) {
            Object value = ((Result) it2.next()).getValue();
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(value);
            if (thM9121exceptionOrNullimpl == null) {
                list.addAll(customerApiRepository2.filterPaymentMethods((List) value));
            } else if (!z) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9117boximpl(Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl)));
            }
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m9117boximpl(Result.m9118constructorimpl(list));
    }
}
