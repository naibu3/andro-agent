package com.stripe.android.paymentsheet.state;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* compiled from: PaymentElementLoader.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0002\u001a\f\u0010\r\u001a\u00020\u0007*\u00020\u000eH\u0002\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u000eH\u0002¨\u0006\u0011"}, d2 = {"withDefaultPaymentMethodOrLastUsedPaymentMethodFirst", "", "Lcom/stripe/android/model/PaymentMethod;", "savedSelection", "Lkotlinx/coroutines/Deferred;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isPaymentMethodSetAsDefaultEnabled", "", "defaultPaymentMethodId", "", "(Ljava/util/List;Lkotlinx/coroutines/Deferred;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "paymentMethodOptionsSetupFutureUsageMap", "Lcom/stripe/android/model/StripeIntent;", "setupFutureUsage", "Lcom/stripe/android/model/StripeIntent$Usage;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentElementLoaderKt {

    /* compiled from: PaymentElementLoader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.state.PaymentElementLoaderKt", f = "PaymentElementLoader.kt", i = {0}, l = {917}, m = "withDefaultPaymentMethodOrLastUsedPaymentMethodFirst", n = {"$this$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst"}, s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.state.PaymentElementLoaderKt$withDefaultPaymentMethodOrLastUsedPaymentMethodFirst$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaymentElementLoaderKt.withDefaultPaymentMethodOrLastUsedPaymentMethodFirst(null, null, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075 A[EDGE_INSN: B:40:0x0075->B:33:0x0075 BREAK  A[LOOP:0: B:28:0x005f->B:42:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object withDefaultPaymentMethodOrLastUsedPaymentMethodFirst(List<PaymentMethod> list, Deferred<? extends SavedSelection> deferred, boolean z, String str, Continuation<? super List<PaymentMethod>> continuation) {
        AnonymousClass1 anonymousClass1;
        Iterator<T> it;
        List listPlus;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objAwait = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        Object obj = null;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            if (!z) {
                anonymousClass1.L$0 = list;
                anonymousClass1.label = 1;
                objAwait = deferred.await(anonymousClass1);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            List<PaymentMethod> list2 = list;
            it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((PaymentMethod) next).id, str)) {
                    obj = next;
                    break;
                }
            }
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return (paymentMethod != null || (listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf(paymentMethod), (Iterable) CollectionsKt.minus(list2, paymentMethod))) == null) ? list : listPlus;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objAwait);
        SavedSelection.PaymentMethod paymentMethod2 = objAwait instanceof SavedSelection.PaymentMethod ? (SavedSelection.PaymentMethod) objAwait : null;
        str = paymentMethod2 != null ? paymentMethod2.getId() : null;
        List<PaymentMethod> list22 = list;
        it = list22.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        PaymentMethod paymentMethod3 = (PaymentMethod) obj;
        if (paymentMethod3 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentSelection.Saved toPaymentSelection(PaymentMethod paymentMethod) {
        return new PaymentSelection.Saved(paymentMethod, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean paymentMethodOptionsSetupFutureUsageMap(StripeIntent stripeIntent) {
        Map<String, Object> paymentMethodOptions = stripeIntent.getPaymentMethodOptions();
        if (paymentMethodOptions.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, Object>> it = paymentMethodOptions.entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            Object obj = null;
            Map map = value instanceof Map ? (Map) value : null;
            if (map != null) {
                obj = map.get("setup_future_usage");
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeIntent.Usage setupFutureUsage(StripeIntent stripeIntent) {
        if (stripeIntent instanceof SetupIntent) {
            return ((SetupIntent) stripeIntent).getUsage();
        }
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).getSetupFutureUsage();
        }
        throw new NoWhenBranchMatchedException();
    }
}
