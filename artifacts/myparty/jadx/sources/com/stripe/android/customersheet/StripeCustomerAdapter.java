package com.stripe.android.customersheet;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.common.coroutines.CoalescingOrchestrator;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.customersheet.CustomerAdapter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* compiled from: StripeCustomerAdapter.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 92\u00020\u0001:\u00019Bg\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\t0\u001eH\u0096@¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001e2\u0006\u0010'\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010(J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\u001e2\u0006\u0010'\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010(J$\u0010*\u001a\b\u0012\u0004\u0012\u00020$0\u001e2\u0006\u0010'\u001a\u00020\n2\u0006\u0010+\u001a\u00020,H\u0096@¢\u0006\u0002\u0010-J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001e2\b\u00100\u001a\u0004\u0018\u000101H\u0096@¢\u0006\u0002\u00102J\u0016\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u001eH\u0096@¢\u0006\u0002\u0010%J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\u001eH\u0096@¢\u0006\u0002\u0010%J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eH\u0080@¢\u0006\u0004\b6\u0010%J\u0010\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006:"}, d2 = {"Lcom/stripe/android/customersheet/StripeCustomerAdapter;", "Lcom/stripe/android/customersheet/CustomerAdapter;", "context", "Landroid/content/Context;", "customerEphemeralKeyProvider", "Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;", "setupIntentClientSecretProvider", "Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;", "paymentMethodTypes", "", "", "timeProvider", "Lkotlin/Function0;", "", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "prefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/customersheet/CustomerEphemeralKey;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/customersheet/CustomerEphemeralKeyProvider;Lcom/stripe/android/customersheet/SetupIntentClientSecretProvider;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/CoroutineContext;)V", "getPaymentMethodTypes", "()Ljava/util/List;", "cachedCustomerEphemeralKey", "Lcom/stripe/android/customersheet/CachedCustomerEphemeralKey;", "customerEphemeralKeyCoalescingOrchestrator", "Lcom/stripe/android/common/coroutines/CoalescingOrchestrator;", "Lcom/stripe/android/customersheet/CustomerAdapter$Result;", "canCreateSetupIntents", "", "getCanCreateSetupIntents", "()Z", "retrievePaymentMethods", "Lcom/stripe/android/model/PaymentMethod;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "paymentMethodId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "updatePaymentMethod", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "(Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSelectedPaymentOption", "", "paymentOption", "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;", "(Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveSelectedPaymentOption", "setupIntentClientSecretForCustomerAttach", "getCustomerEphemeralKey", "getCustomerEphemeralKey$paymentsheet_release", "shouldRefreshCustomer", "cacheDate", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeCustomerAdapter implements CustomerAdapter {
    public static final long CACHED_CUSTOMER_MAX_AGE_MILLIS = 1800000;
    private volatile CachedCustomerEphemeralKey cachedCustomerEphemeralKey;
    private final Context context;
    private final CoalescingOrchestrator<CustomerAdapter.Result<CustomerEphemeralKey>> customerEphemeralKeyCoalescingOrchestrator;
    private final CustomerEphemeralKeyProvider customerEphemeralKeyProvider;
    private final CustomerRepository customerRepository;
    private final List<String> paymentMethodTypes;
    private final Function1<CustomerEphemeralKey, PrefsRepository> prefsRepositoryFactory;
    private final SetupIntentClientSecretProvider setupIntentClientSecretProvider;
    private final Function0<Long> timeProvider;
    private final CoroutineContext workContext;
    public static final int $stable = 8;
    private static final List<PaymentMethod.Type> supportedPaymentMethodTypes = CollectionsKt.listOf((Object[]) new PaymentMethod.Type[]{PaymentMethod.Type.Card, PaymentMethod.Type.USBankAccount});

    /* compiled from: StripeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 1}, l = {89, 90}, m = "attachPaymentMethod", n = {"this", "paymentMethodId", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: com.stripe.android.customersheet.StripeCustomerAdapter$attachPaymentMethod$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeCustomerAdapter.this.attachPaymentMethod(null, this);
        }
    }

    /* compiled from: StripeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 1}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 110}, m = "detachPaymentMethod", n = {"this", "paymentMethodId", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: com.stripe.android.customersheet.StripeCustomerAdapter$detachPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C08291 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08291(Continuation<C08291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeCustomerAdapter.this.detachPaymentMethod(null, this);
        }
    }

    /* compiled from: StripeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 1}, l = {68, 69}, m = "retrievePaymentMethods", n = {"this", "requestedTypes", "this"}, s = {"L$0", "L$1", "L$0"})
    /* renamed from: com.stripe.android.customersheet.StripeCustomerAdapter$retrievePaymentMethods$1, reason: invalid class name and case insensitive filesystem */
    static final class C08301 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08301(Continuation<C08301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeCustomerAdapter.this.retrievePaymentMethods(this);
        }
    }

    /* compiled from: StripeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0}, l = {169, 171}, m = "retrieveSelectedPaymentOption", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.customersheet.StripeCustomerAdapter$retrieveSelectedPaymentOption$1, reason: invalid class name and case insensitive filesystem */
    static final class C08311 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08311(Continuation<C08311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeCustomerAdapter.this.retrieveSelectedPaymentOption(this);
        }
    }

    /* compiled from: StripeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0}, l = {152, 154}, m = "setSelectedPaymentOption", n = {"this", "paymentOption"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.customersheet.StripeCustomerAdapter$setSelectedPaymentOption$1, reason: invalid class name and case insensitive filesystem */
    static final class C08321 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08321(Continuation<C08321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeCustomerAdapter.this.setSelectedPaymentOption(null, this);
        }
    }

    /* compiled from: StripeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0}, l = {188, 189}, m = "setupIntentClientSecretForCustomerAttach", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.customersheet.StripeCustomerAdapter$setupIntentClientSecretForCustomerAttach$1, reason: invalid class name and case insensitive filesystem */
    static final class C08331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08331(Continuation<C08331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeCustomerAdapter.this.setupIntentClientSecretForCustomerAttach(this);
        }
    }

    /* compiled from: StripeCustomerAdapter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.StripeCustomerAdapter", f = "StripeCustomerAdapter.kt", i = {0, 0, 0, 1}, l = {131, 132}, m = "updatePaymentMethod", n = {"this", "paymentMethodId", NativeProtocol.WEB_DIALOG_PARAMS, "this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: com.stripe.android.customersheet.StripeCustomerAdapter$updatePaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C08341 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C08341(Continuation<C08341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StripeCustomerAdapter.this.updatePaymentMethod(null, null, this);
        }
    }

    @Inject
    public StripeCustomerAdapter(Context context, CustomerEphemeralKeyProvider customerEphemeralKeyProvider, SetupIntentClientSecretProvider setupIntentClientSecretProvider, List<String> list, Function0<Long> timeProvider, CustomerRepository customerRepository, Function1<CustomerEphemeralKey, PrefsRepository> prefsRepositoryFactory, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customerEphemeralKeyProvider, "customerEphemeralKeyProvider");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(prefsRepositoryFactory, "prefsRepositoryFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.context = context;
        this.customerEphemeralKeyProvider = customerEphemeralKeyProvider;
        this.setupIntentClientSecretProvider = setupIntentClientSecretProvider;
        this.paymentMethodTypes = list;
        this.timeProvider = timeProvider;
        this.customerRepository = customerRepository;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.workContext = workContext;
        this.customerEphemeralKeyCoalescingOrchestrator = new CoalescingOrchestrator<>(new StripeCustomerAdapter$customerEphemeralKeyCoalescingOrchestrator$1(customerEphemeralKeyProvider), null, null, 6, null);
    }

    @Override // com.stripe.android.customersheet.CustomerAdapter
    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    @Override // com.stripe.android.customersheet.CustomerAdapter
    public boolean getCanCreateSetupIntents() {
        return this.setupIntentClientSecretProvider != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePaymentMethods(Continuation<CustomerAdapter.Result<List<PaymentMethod>>> continuation) {
        C08301 c08301;
        List listEmptyList;
        ArrayList arrayList;
        StripeCustomerAdapter stripeCustomerAdapter;
        Object objMo8417getPaymentMethodsBWLJW6A;
        StripeCustomerAdapter stripeCustomerAdapter2;
        CustomerAdapter.Result.Companion companion;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C08301) {
            c08301 = (C08301) continuation;
            if ((c08301.label & Integer.MIN_VALUE) != 0) {
                c08301.label -= Integer.MIN_VALUE;
            } else {
                c08301 = new C08301(continuation);
            }
        }
        Object customerEphemeralKey$paymentsheet_release = c08301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08301.label;
        if (i == 0) {
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            List<String> paymentMethodTypes = getPaymentMethodTypes();
            if (paymentMethodTypes != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : paymentMethodTypes) {
                    if (PaymentMethod.Type.INSTANCE.fromCode((String) obj) == null) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (arrayList3.isEmpty()) {
                    arrayList3 = null;
                }
                if (arrayList3 != null) {
                    return CustomerAdapter.Result.INSTANCE.failure(new IllegalStateException("Invalid payment method types provided (" + CollectionsKt.joinToString$default(arrayList3, null, null, null, 0, null, null, 63, null) + ")."), null);
                }
            }
            List<PaymentMethod.Type> list = supportedPaymentMethodTypes;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(((PaymentMethod.Type) it.next()).code);
            }
            Set set = CollectionsKt.toSet(arrayList4);
            List<String> paymentMethodTypes2 = getPaymentMethodTypes();
            if (paymentMethodTypes2 == null || (listEmptyList = CollectionsKt.minus((Iterable) paymentMethodTypes2, (Iterable) set)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (!listEmptyList.isEmpty()) {
                return CustomerAdapter.Result.INSTANCE.failure(new IllegalStateException("Unsupported payment method types provided (" + CollectionsKt.joinToString$default(listEmptyList, null, null, null, 0, null, null, 63, null) + ")."), null);
            }
            List<String> paymentMethodTypes3 = getPaymentMethodTypes();
            if (paymentMethodTypes3 == null || paymentMethodTypes3.isEmpty()) {
                arrayList = supportedPaymentMethodTypes;
            } else {
                List<String> paymentMethodTypes4 = getPaymentMethodTypes();
                ArrayList arrayList5 = new ArrayList();
                Iterator<T> it2 = paymentMethodTypes4.iterator();
                while (it2.hasNext()) {
                    PaymentMethod.Type typeFromCode = PaymentMethod.Type.INSTANCE.fromCode((String) it2.next());
                    if (typeFromCode != null) {
                        arrayList5.add(typeFromCode);
                    }
                }
                arrayList = arrayList5;
            }
            c08301.L$0 = this;
            c08301.L$1 = arrayList;
            c08301.label = 1;
            customerEphemeralKey$paymentsheet_release = getCustomerEphemeralKey$paymentsheet_release(c08301);
            if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                stripeCustomerAdapter = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (CustomerAdapter.Result.Companion) c08301.L$1;
            stripeCustomerAdapter2 = (StripeCustomerAdapter) c08301.L$0;
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            objMo8417getPaymentMethodsBWLJW6A = ((Result) customerEphemeralKey$paymentsheet_release).getValue();
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8417getPaymentMethodsBWLJW6A);
            if (thM9121exceptionOrNullimpl == null) {
                return CustomerAdapter.Result.INSTANCE.failure(thM9121exceptionOrNullimpl, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl, stripeCustomerAdapter2.context));
            }
            return companion.success((List) objMo8417getPaymentMethodsBWLJW6A);
        }
        arrayList = (List) c08301.L$1;
        stripeCustomerAdapter = (StripeCustomerAdapter) c08301.L$0;
        ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
        CustomerAdapter.Result result = (CustomerAdapter.Result) customerEphemeralKey$paymentsheet_release;
        if (result instanceof CustomerAdapter.Result.Success) {
            CustomerAdapter.Result.Companion companion2 = CustomerAdapter.Result.INSTANCE;
            CustomerEphemeralKey customerEphemeralKey = (CustomerEphemeralKey) ((CustomerAdapter.Result.Success) result).getValue();
            CustomerRepository customerRepository = stripeCustomerAdapter.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(customerEphemeralKey.getCustomerId(), customerEphemeralKey.getEphemeralKey(), null);
            c08301.L$0 = stripeCustomerAdapter;
            c08301.L$1 = companion2;
            c08301.label = 2;
            objMo8417getPaymentMethodsBWLJW6A = customerRepository.mo8417getPaymentMethodsBWLJW6A(customerInfo, arrayList, false, c08301);
            if (objMo8417getPaymentMethodsBWLJW6A != coroutine_suspended) {
                stripeCustomerAdapter2 = stripeCustomerAdapter;
                companion = companion2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8417getPaymentMethodsBWLJW6A);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
            return coroutine_suspended;
        }
        if (!(result instanceof CustomerAdapter.Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
        return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object attachPaymentMethod(String str, Continuation<CustomerAdapter.Result<PaymentMethod>> continuation) {
        AnonymousClass1 anonymousClass1;
        StripeCustomerAdapter stripeCustomerAdapter;
        Object objMo8415attachPaymentMethod0E7RQCE;
        StripeCustomerAdapter stripeCustomerAdapter2;
        CustomerAdapter.Result.Companion companion;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object customerEphemeralKey$paymentsheet_release = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.label = 1;
            customerEphemeralKey$paymentsheet_release = getCustomerEphemeralKey$paymentsheet_release(anonymousClass1);
            if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                stripeCustomerAdapter = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (CustomerAdapter.Result.Companion) anonymousClass1.L$1;
            stripeCustomerAdapter2 = (StripeCustomerAdapter) anonymousClass1.L$0;
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            objMo8415attachPaymentMethod0E7RQCE = ((Result) customerEphemeralKey$paymentsheet_release).getValue();
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8415attachPaymentMethod0E7RQCE);
            if (thM9121exceptionOrNullimpl == null) {
                return CustomerAdapter.Result.INSTANCE.failure(thM9121exceptionOrNullimpl, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl, stripeCustomerAdapter2.context));
            }
            return companion.success((PaymentMethod) objMo8415attachPaymentMethod0E7RQCE);
        }
        str = (String) anonymousClass1.L$1;
        stripeCustomerAdapter = (StripeCustomerAdapter) anonymousClass1.L$0;
        ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
        CustomerAdapter.Result result = (CustomerAdapter.Result) customerEphemeralKey$paymentsheet_release;
        if (result instanceof CustomerAdapter.Result.Success) {
            CustomerAdapter.Result.Companion companion2 = CustomerAdapter.Result.INSTANCE;
            CustomerEphemeralKey customerEphemeralKey = (CustomerEphemeralKey) ((CustomerAdapter.Result.Success) result).getValue();
            CustomerRepository customerRepository = stripeCustomerAdapter.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(customerEphemeralKey.getCustomerId(), customerEphemeralKey.getEphemeralKey(), null);
            anonymousClass1.L$0 = stripeCustomerAdapter;
            anonymousClass1.L$1 = companion2;
            anonymousClass1.label = 2;
            objMo8415attachPaymentMethod0E7RQCE = customerRepository.mo8415attachPaymentMethod0E7RQCE(customerInfo, str, anonymousClass1);
            if (objMo8415attachPaymentMethod0E7RQCE != coroutine_suspended) {
                stripeCustomerAdapter2 = stripeCustomerAdapter;
                companion = companion2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8415attachPaymentMethod0E7RQCE);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
            return coroutine_suspended;
        }
        if (!(result instanceof CustomerAdapter.Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
        return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0032, B:30:0x0093, B:32:0x0099, B:33:0x00a0, B:26:0x006a), top: B:43:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0032, B:30:0x0093, B:32:0x0099, B:33:0x00a0, B:26:0x006a), top: B:43:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object detachPaymentMethod(String str, Continuation<CustomerAdapter.Result<PaymentMethod>> continuation) {
        C08291 c08291;
        StripeCustomerAdapter stripeCustomerAdapter;
        Object objMo8416detachPaymentMethodBWLJW6A;
        StripeCustomerAdapter stripeCustomerAdapter2;
        CustomerAdapter.Result.Companion companion;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C08291) {
            c08291 = (C08291) continuation;
            if ((c08291.label & Integer.MIN_VALUE) != 0) {
                c08291.label -= Integer.MIN_VALUE;
            } else {
                c08291 = new C08291(continuation);
            }
        }
        Object customerEphemeralKey$paymentsheet_release = c08291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08291.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
                c08291.L$0 = this;
                c08291.L$1 = str;
                c08291.label = 1;
                customerEphemeralKey$paymentsheet_release = getCustomerEphemeralKey$paymentsheet_release(c08291);
                if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                    stripeCustomerAdapter = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (CustomerAdapter.Result.Companion) c08291.L$1;
                stripeCustomerAdapter2 = (StripeCustomerAdapter) c08291.L$0;
                ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
                objMo8416detachPaymentMethodBWLJW6A = ((Result) customerEphemeralKey$paymentsheet_release).getValue();
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8416detachPaymentMethodBWLJW6A);
                if (thM9121exceptionOrNullimpl == null) {
                    return CustomerAdapter.Result.INSTANCE.failure(thM9121exceptionOrNullimpl, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl, stripeCustomerAdapter2.context));
                }
                return companion.success((PaymentMethod) objMo8416detachPaymentMethodBWLJW6A);
            }
            str = (String) c08291.L$1;
            stripeCustomerAdapter = (StripeCustomerAdapter) c08291.L$0;
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            CustomerAdapter.Result result = (CustomerAdapter.Result) customerEphemeralKey$paymentsheet_release;
            if (!(result instanceof CustomerAdapter.Result.Success)) {
                if (!(result instanceof CustomerAdapter.Result.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
                return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
            }
            CustomerAdapter.Result.Companion companion2 = CustomerAdapter.Result.INSTANCE;
            CustomerEphemeralKey customerEphemeralKey = (CustomerEphemeralKey) ((CustomerAdapter.Result.Success) result).getValue();
            CustomerRepository customerRepository = stripeCustomerAdapter.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(customerEphemeralKey.getCustomerId(), customerEphemeralKey.getEphemeralKey(), null);
            c08291.L$0 = stripeCustomerAdapter;
            c08291.L$1 = companion2;
            c08291.label = 2;
            objMo8416detachPaymentMethodBWLJW6A = customerRepository.mo8416detachPaymentMethodBWLJW6A(customerInfo, str, false, c08291);
            if (objMo8416detachPaymentMethodBWLJW6A != coroutine_suspended) {
                stripeCustomerAdapter2 = stripeCustomerAdapter;
                companion = companion2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8416detachPaymentMethodBWLJW6A);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            return CustomerAdapter.Result.INSTANCE.failure(th, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a6, B:33:0x00ad, B:26:0x0077), top: B:43:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0032, B:30:0x00a0, B:32:0x00a6, B:33:0x00ad, B:26:0x0077), top: B:43:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updatePaymentMethod(String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<CustomerAdapter.Result<PaymentMethod>> continuation) {
        C08341 c08341;
        Object obj;
        PaymentMethodUpdateParams paymentMethodUpdateParams2;
        StripeCustomerAdapter stripeCustomerAdapter;
        Object objMo8419updatePaymentMethodBWLJW6A;
        CustomerAdapter.Result.Companion companion;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C08341) {
            c08341 = (C08341) continuation;
            if ((c08341.label & Integer.MIN_VALUE) != 0) {
                c08341.label -= Integer.MIN_VALUE;
            } else {
                c08341 = new C08341(continuation);
            }
        }
        Object obj2 = c08341.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08341.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj2);
                c08341.L$0 = this;
                c08341.L$1 = str;
                c08341.L$2 = paymentMethodUpdateParams;
                c08341.label = 1;
                Object customerEphemeralKey$paymentsheet_release = getCustomerEphemeralKey$paymentsheet_release(c08341);
                if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                    obj = customerEphemeralKey$paymentsheet_release;
                    paymentMethodUpdateParams2 = paymentMethodUpdateParams;
                    stripeCustomerAdapter = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (CustomerAdapter.Result.Companion) c08341.L$1;
                stripeCustomerAdapter = (StripeCustomerAdapter) c08341.L$0;
                ResultKt.throwOnFailure(obj2);
                objMo8419updatePaymentMethodBWLJW6A = ((Result) obj2).getValue();
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8419updatePaymentMethodBWLJW6A);
                if (thM9121exceptionOrNullimpl == null) {
                    return CustomerAdapter.Result.INSTANCE.failure(thM9121exceptionOrNullimpl, ExceptionKtKt.stripeErrorMessage(thM9121exceptionOrNullimpl, stripeCustomerAdapter.context));
                }
                return companion.success((PaymentMethod) objMo8419updatePaymentMethodBWLJW6A);
            }
            PaymentMethodUpdateParams paymentMethodUpdateParams3 = (PaymentMethodUpdateParams) c08341.L$2;
            str = (String) c08341.L$1;
            StripeCustomerAdapter stripeCustomerAdapter2 = (StripeCustomerAdapter) c08341.L$0;
            ResultKt.throwOnFailure(obj2);
            paymentMethodUpdateParams2 = paymentMethodUpdateParams3;
            stripeCustomerAdapter = stripeCustomerAdapter2;
            obj = obj2;
            CustomerAdapter.Result result = (CustomerAdapter.Result) obj;
            if (!(result instanceof CustomerAdapter.Result.Success)) {
                if (!(result instanceof CustomerAdapter.Result.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
                return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
            }
            CustomerAdapter.Result.Companion companion2 = CustomerAdapter.Result.INSTANCE;
            CustomerEphemeralKey customerEphemeralKey = (CustomerEphemeralKey) ((CustomerAdapter.Result.Success) result).getValue();
            CustomerRepository customerRepository = stripeCustomerAdapter.customerRepository;
            CustomerRepository.CustomerInfo customerInfo = new CustomerRepository.CustomerInfo(customerEphemeralKey.getCustomerId(), customerEphemeralKey.getEphemeralKey(), null);
            c08341.L$0 = stripeCustomerAdapter;
            c08341.L$1 = companion2;
            c08341.L$2 = null;
            c08341.label = 2;
            objMo8419updatePaymentMethodBWLJW6A = customerRepository.mo8419updatePaymentMethodBWLJW6A(customerInfo, str, paymentMethodUpdateParams2, c08341);
            if (objMo8419updatePaymentMethodBWLJW6A != coroutine_suspended) {
                companion = companion2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8419updatePaymentMethodBWLJW6A);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            return CustomerAdapter.Result.INSTANCE.failure(th, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setSelectedPaymentOption(CustomerAdapter.PaymentOption paymentOption, Continuation<CustomerAdapter.Result<Unit>> continuation) {
        C08321 c08321;
        StripeCustomerAdapter stripeCustomerAdapter;
        if (continuation instanceof C08321) {
            c08321 = (C08321) continuation;
            if ((c08321.label & Integer.MIN_VALUE) != 0) {
                c08321.label -= Integer.MIN_VALUE;
            } else {
                c08321 = new C08321(continuation);
            }
        }
        Object customerEphemeralKey$paymentsheet_release = c08321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08321.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
                c08321.L$0 = this;
                c08321.L$1 = paymentOption;
                c08321.label = 1;
                customerEphemeralKey$paymentsheet_release = getCustomerEphemeralKey$paymentsheet_release(c08321);
                if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                    stripeCustomerAdapter = this;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
                return customerEphemeralKey$paymentsheet_release;
            }
            paymentOption = (CustomerAdapter.PaymentOption) c08321.L$1;
            stripeCustomerAdapter = (StripeCustomerAdapter) c08321.L$0;
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            CustomerAdapter.Result result = (CustomerAdapter.Result) customerEphemeralKey$paymentsheet_release;
            if (!(result instanceof CustomerAdapter.Result.Success)) {
                if (!(result instanceof CustomerAdapter.Result.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
                return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
            }
            CustomerAdapter.Result.Companion companion = CustomerAdapter.Result.INSTANCE;
            PrefsRepository prefsRepositoryInvoke = stripeCustomerAdapter.prefsRepositoryFactory.invoke((CustomerEphemeralKey) ((CustomerAdapter.Result.Success) result).getValue());
            CoroutineContext coroutineContext = stripeCustomerAdapter.workContext;
            StripeCustomerAdapter$setSelectedPaymentOption$2$1 stripeCustomerAdapter$setSelectedPaymentOption$2$1 = new StripeCustomerAdapter$setSelectedPaymentOption$2$1(prefsRepositoryInvoke, paymentOption, stripeCustomerAdapter, null);
            c08321.L$0 = null;
            c08321.L$1 = null;
            c08321.label = 2;
            Object objWithContext = BuildersKt.withContext(coroutineContext, stripeCustomerAdapter$setSelectedPaymentOption$2$1, c08321);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        } catch (Throwable th) {
            return CustomerAdapter.Result.INSTANCE.failure(th, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveSelectedPaymentOption(Continuation<CustomerAdapter.Result<CustomerAdapter.PaymentOption>> continuation) {
        C08311 c08311;
        StripeCustomerAdapter stripeCustomerAdapter;
        CustomerAdapter.Result.Companion companion;
        if (continuation instanceof C08311) {
            c08311 = (C08311) continuation;
            if ((c08311.label & Integer.MIN_VALUE) != 0) {
                c08311.label -= Integer.MIN_VALUE;
            } else {
                c08311 = new C08311(continuation);
            }
        }
        Object customerEphemeralKey$paymentsheet_release = c08311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08311.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
                c08311.L$0 = this;
                c08311.label = 1;
                customerEphemeralKey$paymentsheet_release = getCustomerEphemeralKey$paymentsheet_release(c08311);
                if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                    stripeCustomerAdapter = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (CustomerAdapter.Result.Companion) c08311.L$0;
                ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
                return companion.success(CustomerAdapter.PaymentOption.INSTANCE.toPaymentOption$paymentsheet_release((SavedSelection) customerEphemeralKey$paymentsheet_release));
            }
            stripeCustomerAdapter = (StripeCustomerAdapter) c08311.L$0;
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            CustomerAdapter.Result result = (CustomerAdapter.Result) customerEphemeralKey$paymentsheet_release;
            if (!(result instanceof CustomerAdapter.Result.Success)) {
                if (!(result instanceof CustomerAdapter.Result.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
                return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
            }
            CustomerAdapter.Result.Companion companion2 = CustomerAdapter.Result.INSTANCE;
            PrefsRepository prefsRepositoryInvoke = stripeCustomerAdapter.prefsRepositoryFactory.invoke((CustomerEphemeralKey) ((CustomerAdapter.Result.Success) result).getValue());
            c08311.L$0 = companion2;
            c08311.label = 2;
            customerEphemeralKey$paymentsheet_release = prefsRepositoryInvoke.getSavedSelection(true, false, c08311);
            if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                companion = companion2;
                return companion.success(CustomerAdapter.PaymentOption.INSTANCE.toPaymentOption$paymentsheet_release((SavedSelection) customerEphemeralKey$paymentsheet_release));
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            return CustomerAdapter.Result.INSTANCE.failure(th, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.customersheet.CustomerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setupIntentClientSecretForCustomerAttach(Continuation<CustomerAdapter.Result<String>> continuation) {
        C08331 c08331;
        StripeCustomerAdapter stripeCustomerAdapter;
        if (continuation instanceof C08331) {
            c08331 = (C08331) continuation;
            if ((c08331.label & Integer.MIN_VALUE) != 0) {
                c08331.label -= Integer.MIN_VALUE;
            } else {
                c08331 = new C08331(continuation);
            }
        }
        Object customerEphemeralKey$paymentsheet_release = c08331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08331.label;
        if (i == 0) {
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            if (this.setupIntentClientSecretProvider == null) {
                throw new IllegalArgumentException("setupIntentClientSecretProvider cannot be null");
            }
            c08331.L$0 = this;
            c08331.label = 1;
            customerEphemeralKey$paymentsheet_release = getCustomerEphemeralKey$paymentsheet_release(c08331);
            if (customerEphemeralKey$paymentsheet_release != coroutine_suspended) {
                stripeCustomerAdapter = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
            return (CustomerAdapter.Result) customerEphemeralKey$paymentsheet_release;
        }
        stripeCustomerAdapter = (StripeCustomerAdapter) c08331.L$0;
        ResultKt.throwOnFailure(customerEphemeralKey$paymentsheet_release);
        CustomerAdapter.Result result = (CustomerAdapter.Result) customerEphemeralKey$paymentsheet_release;
        if (result instanceof CustomerAdapter.Result.Success) {
            CustomerEphemeralKey customerEphemeralKey = (CustomerEphemeralKey) ((CustomerAdapter.Result.Success) result).getValue();
            SetupIntentClientSecretProvider setupIntentClientSecretProvider = stripeCustomerAdapter.setupIntentClientSecretProvider;
            String customerId = customerEphemeralKey.getCustomerId();
            c08331.L$0 = null;
            c08331.label = 2;
            customerEphemeralKey$paymentsheet_release = setupIntentClientSecretProvider.provideSetupIntentClientSecret(customerId, c08331);
        } else {
            if (!(result instanceof CustomerAdapter.Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            CustomerAdapter.Result.Failure failure = (CustomerAdapter.Result.Failure) result;
            return CustomerAdapter.Result.INSTANCE.failure(failure.getCause(), failure.getDisplayMessage());
        }
    }

    public final Object getCustomerEphemeralKey$paymentsheet_release(Continuation<CustomerAdapter.Result<CustomerEphemeralKey>> continuation) {
        return BuildersKt.withContext(this.workContext, new StripeCustomerAdapter$getCustomerEphemeralKey$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRefreshCustomer(long cacheDate) {
        return cacheDate + CACHED_CUSTOMER_MAX_AGE_MILLIS < this.timeProvider.invoke().longValue();
    }
}
