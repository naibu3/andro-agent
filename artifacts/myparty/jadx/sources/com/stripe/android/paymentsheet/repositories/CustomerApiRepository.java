package com.stripe.android.paymentsheet.repositories;

import com.facebook.internal.NativeProtocol;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodUpdateParams;
import com.stripe.android.model.wallets.Wallet;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: CustomerApiRepository.kt */
@Singleton
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J:\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 J.\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b$\u0010%J&\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b'\u0010(J.\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+H\u0096@¢\u0006\u0004\b,\u0010-J(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b/\u0010(J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J*\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0018*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b5\u00106R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "lazyPaymentConfig", "Ljavax/inject/Provider;", "Lcom/stripe/android/PaymentConfiguration;", "logger", "Lcom/stripe/android/core/Logger;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "productUsageTokens", "", "", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Ljavax/inject/Provider;Lcom/stripe/android/core/Logger;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V", "retrieveCustomer", "Lcom/stripe/android/model/Customer;", "customerInfo", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethods", "Lkotlin/Result;", "", "Lcom/stripe/android/model/PaymentMethod;", "types", "Lcom/stripe/android/model/PaymentMethod$Type;", "silentlyFail", "", "getPaymentMethods-BWLJW6A", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detachPaymentMethod", "paymentMethodId", "canRemoveDuplicates", "detachPaymentMethod-BWLJW6A", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachPaymentMethod", "attachPaymentMethod-0E7RQCE", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentMethod", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodUpdateParams;", "updatePaymentMethod-BWLJW6A", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultPaymentMethod", "setDefaultPaymentMethod-0E7RQCE", "filterPaymentMethods", "allPaymentMethods", "getLinkPaymentMethods", "paymentMethods", "detachPaymentMethodAndDuplicates", "detachPaymentMethodAndDuplicates-BWLJW6A", "(Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository$CustomerInfo;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomerApiRepository implements CustomerRepository {
    public static final int $stable = 8;
    private final ErrorReporter errorReporter;
    private final Provider<PaymentConfiguration> lazyPaymentConfig;
    private final Logger logger;
    private final Set<String> productUsageTokens;
    private final StripeRepository stripeRepository;
    private final CoroutineContext workContext;

    /* compiled from: CustomerApiRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository", f = "CustomerApiRepository.kt", i = {}, l = {42}, m = "retrieveCustomer", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.repositories.CustomerApiRepository$retrieveCustomer$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerApiRepository.this.retrieveCustomer(null, this);
        }
    }

    @Inject
    public CustomerApiRepository(StripeRepository stripeRepository, Provider<PaymentConfiguration> lazyPaymentConfig, Logger logger, ErrorReporter errorReporter, @IOContext CoroutineContext workContext, @Named(NamedConstantsKt.PRODUCT_USAGE) Set<String> productUsageTokens) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(lazyPaymentConfig, "lazyPaymentConfig");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(productUsageTokens, "productUsageTokens");
        this.stripeRepository = stripeRepository;
        this.lazyPaymentConfig = lazyPaymentConfig;
        this.logger = logger;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.productUsageTokens = productUsageTokens;
    }

    public /* synthetic */ CustomerApiRepository(StripeRepository stripeRepository, Provider provider, Logger logger, ErrorReporter errorReporter, CoroutineContext coroutineContext, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeRepository, provider, logger, errorReporter, coroutineContext, (i & 32) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrieveCustomer(CustomerRepository.CustomerInfo customerInfo, Continuation<? super Customer> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objMo8045retrieveCustomerBWLJW6A;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = this.stripeRepository;
            String id = customerInfo.getId();
            Set<String> set = this.productUsageTokens;
            ApiRequest.Options options = new ApiRequest.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
            anonymousClass1.label = 1;
            objMo8045retrieveCustomerBWLJW6A = stripeRepository.mo8045retrieveCustomerBWLJW6A(id, set, options, anonymousClass1);
            if (objMo8045retrieveCustomerBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8045retrieveCustomerBWLJW6A = ((Result) obj).getValue();
        }
        if (Result.m9124isFailureimpl(objMo8045retrieveCustomerBWLJW6A)) {
            return null;
        }
        return objMo8045retrieveCustomerBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    /* renamed from: getPaymentMethods-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8417getPaymentMethodsBWLJW6A(CustomerRepository.CustomerInfo customerInfo, List<? extends PaymentMethod.Type> list, boolean z, Continuation<? super Result<? extends List<PaymentMethod>>> continuation) {
        CustomerApiRepository$getPaymentMethods$1 customerApiRepository$getPaymentMethods$1;
        if (continuation instanceof CustomerApiRepository$getPaymentMethods$1) {
            customerApiRepository$getPaymentMethods$1 = (CustomerApiRepository$getPaymentMethods$1) continuation;
            if ((customerApiRepository$getPaymentMethods$1.label & Integer.MIN_VALUE) != 0) {
                customerApiRepository$getPaymentMethods$1.label -= Integer.MIN_VALUE;
            } else {
                customerApiRepository$getPaymentMethods$1 = new CustomerApiRepository$getPaymentMethods$1(this, continuation);
            }
        }
        Object objWithContext = customerApiRepository$getPaymentMethods$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerApiRepository$getPaymentMethods$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            CustomerApiRepository$getPaymentMethods$2 customerApiRepository$getPaymentMethods$2 = new CustomerApiRepository$getPaymentMethods$2(list, this, customerInfo, z, null);
            customerApiRepository$getPaymentMethods$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, customerApiRepository$getPaymentMethods$2, customerApiRepository$getPaymentMethods$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r0 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r0 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r0 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        r2 = r13;
        r1 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    /* renamed from: detachPaymentMethod-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8416detachPaymentMethodBWLJW6A(CustomerRepository.CustomerInfo customerInfo, String str, boolean z, Continuation<? super Result<PaymentMethod>> continuation) {
        CustomerApiRepository$detachPaymentMethod$1 customerApiRepository$detachPaymentMethod$1;
        Object objMo8033detachPaymentMethodBWLJW6A;
        CustomerApiRepository customerApiRepository;
        String str2;
        if (continuation instanceof CustomerApiRepository$detachPaymentMethod$1) {
            customerApiRepository$detachPaymentMethod$1 = (CustomerApiRepository$detachPaymentMethod$1) continuation;
            if ((customerApiRepository$detachPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                customerApiRepository$detachPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                customerApiRepository$detachPaymentMethod$1 = new CustomerApiRepository$detachPaymentMethod$1(this, continuation);
            }
        }
        CustomerApiRepository$detachPaymentMethod$1 customerApiRepository$detachPaymentMethod$12 = customerApiRepository$detachPaymentMethod$1;
        Object obj = customerApiRepository$detachPaymentMethod$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerApiRepository$detachPaymentMethod$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (z) {
                customerApiRepository$detachPaymentMethod$12.L$0 = this;
                customerApiRepository$detachPaymentMethod$12.L$1 = str;
                customerApiRepository$detachPaymentMethod$12.label = 1;
                objMo8033detachPaymentMethodBWLJW6A = m8414detachPaymentMethodAndDuplicatesBWLJW6A(this, customerInfo, str, customerApiRepository$detachPaymentMethod$12);
            } else if (customerInfo.getCustomerSessionClientSecret() != null) {
                StripeRepository stripeRepository = this.stripeRepository;
                String customerSessionClientSecret = customerInfo.getCustomerSessionClientSecret();
                Set<String> set = this.productUsageTokens;
                ApiRequest.Options options = new ApiRequest.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
                customerApiRepository$detachPaymentMethod$12.L$0 = this;
                customerApiRepository$detachPaymentMethod$12.L$1 = str;
                customerApiRepository$detachPaymentMethod$12.label = 2;
                objMo8033detachPaymentMethodBWLJW6A = stripeRepository.mo8034detachPaymentMethodyxL6bBk(customerSessionClientSecret, set, str, options, customerApiRepository$detachPaymentMethod$12);
            } else {
                StripeRepository stripeRepository2 = this.stripeRepository;
                Set<String> set2 = this.productUsageTokens;
                ApiRequest.Options options2 = new ApiRequest.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
                customerApiRepository$detachPaymentMethod$12.L$0 = this;
                customerApiRepository$detachPaymentMethod$12.L$1 = str;
                customerApiRepository$detachPaymentMethod$12.label = 3;
                objMo8033detachPaymentMethodBWLJW6A = stripeRepository2.mo8033detachPaymentMethodBWLJW6A(set2, str, options2, customerApiRepository$detachPaymentMethod$12);
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) customerApiRepository$detachPaymentMethod$12.L$1;
            customerApiRepository = (CustomerApiRepository) customerApiRepository$detachPaymentMethod$12.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8033detachPaymentMethodBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8033detachPaymentMethodBWLJW6A);
        if (thM9121exceptionOrNullimpl != null) {
            customerApiRepository.logger.error("Failed to detach payment method " + str2 + ".", thM9121exceptionOrNullimpl);
        }
        return objMo8033detachPaymentMethodBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    /* renamed from: attachPaymentMethod-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8415attachPaymentMethod0E7RQCE(CustomerRepository.CustomerInfo customerInfo, String str, Continuation<? super Result<PaymentMethod>> continuation) {
        CustomerApiRepository$attachPaymentMethod$1 customerApiRepository$attachPaymentMethod$1;
        Object objMo8016attachPaymentMethodyxL6bBk;
        CustomerApiRepository customerApiRepository;
        String str2;
        if (continuation instanceof CustomerApiRepository$attachPaymentMethod$1) {
            customerApiRepository$attachPaymentMethod$1 = (CustomerApiRepository$attachPaymentMethod$1) continuation;
            if ((customerApiRepository$attachPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                customerApiRepository$attachPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                customerApiRepository$attachPaymentMethod$1 = new CustomerApiRepository$attachPaymentMethod$1(this, continuation);
            }
        }
        CustomerApiRepository$attachPaymentMethod$1 customerApiRepository$attachPaymentMethod$12 = customerApiRepository$attachPaymentMethod$1;
        Object obj = customerApiRepository$attachPaymentMethod$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerApiRepository$attachPaymentMethod$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = this.stripeRepository;
            String id = customerInfo.getId();
            Set<String> set = this.productUsageTokens;
            ApiRequest.Options options = new ApiRequest.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
            customerApiRepository$attachPaymentMethod$12.L$0 = this;
            customerApiRepository$attachPaymentMethod$12.L$1 = str;
            customerApiRepository$attachPaymentMethod$12.label = 1;
            objMo8016attachPaymentMethodyxL6bBk = stripeRepository.mo8016attachPaymentMethodyxL6bBk(id, set, str, options, customerApiRepository$attachPaymentMethod$12);
            if (objMo8016attachPaymentMethodyxL6bBk == coroutine_suspended) {
                return coroutine_suspended;
            }
            customerApiRepository = this;
            str2 = str;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) customerApiRepository$attachPaymentMethod$12.L$1;
            customerApiRepository = (CustomerApiRepository) customerApiRepository$attachPaymentMethod$12.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8016attachPaymentMethodyxL6bBk = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8016attachPaymentMethodyxL6bBk);
        if (thM9121exceptionOrNullimpl != null) {
            customerApiRepository.logger.error("Failed to attach payment method " + str2 + ".", thM9121exceptionOrNullimpl);
        }
        return objMo8016attachPaymentMethodyxL6bBk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    /* renamed from: updatePaymentMethod-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8419updatePaymentMethodBWLJW6A(CustomerRepository.CustomerInfo customerInfo, String str, PaymentMethodUpdateParams paymentMethodUpdateParams, Continuation<? super Result<PaymentMethod>> continuation) {
        CustomerApiRepository$updatePaymentMethod$1 customerApiRepository$updatePaymentMethod$1;
        Object objMo8060updatePaymentMethodBWLJW6A;
        CustomerApiRepository customerApiRepository;
        if (continuation instanceof CustomerApiRepository$updatePaymentMethod$1) {
            customerApiRepository$updatePaymentMethod$1 = (CustomerApiRepository$updatePaymentMethod$1) continuation;
            if ((customerApiRepository$updatePaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                customerApiRepository$updatePaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                customerApiRepository$updatePaymentMethod$1 = new CustomerApiRepository$updatePaymentMethod$1(this, continuation);
            }
        }
        Object obj = customerApiRepository$updatePaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerApiRepository$updatePaymentMethod$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StripeRepository stripeRepository = this.stripeRepository;
            ApiRequest.Options options = new ApiRequest.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
            customerApiRepository$updatePaymentMethod$1.L$0 = this;
            customerApiRepository$updatePaymentMethod$1.L$1 = str;
            customerApiRepository$updatePaymentMethod$1.label = 1;
            objMo8060updatePaymentMethodBWLJW6A = stripeRepository.mo8060updatePaymentMethodBWLJW6A(str, paymentMethodUpdateParams, options, customerApiRepository$updatePaymentMethod$1);
            if (objMo8060updatePaymentMethodBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
            customerApiRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) customerApiRepository$updatePaymentMethod$1.L$1;
            customerApiRepository = (CustomerApiRepository) customerApiRepository$updatePaymentMethod$1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo8060updatePaymentMethodBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8060updatePaymentMethodBWLJW6A);
        if (thM9121exceptionOrNullimpl != null) {
            customerApiRepository.logger.error("Failed to update payment method " + str + ".", thM9121exceptionOrNullimpl);
        }
        return objMo8060updatePaymentMethodBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.repositories.CustomerRepository
    /* renamed from: setDefaultPaymentMethod-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo8418setDefaultPaymentMethod0E7RQCE(CustomerRepository.CustomerInfo customerInfo, String str, Continuation<? super Result<Customer>> continuation) {
        CustomerApiRepository$setDefaultPaymentMethod$1 customerApiRepository$setDefaultPaymentMethod$1;
        if (continuation instanceof CustomerApiRepository$setDefaultPaymentMethod$1) {
            customerApiRepository$setDefaultPaymentMethod$1 = (CustomerApiRepository$setDefaultPaymentMethod$1) continuation;
            if ((customerApiRepository$setDefaultPaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                customerApiRepository$setDefaultPaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                customerApiRepository$setDefaultPaymentMethod$1 = new CustomerApiRepository$setDefaultPaymentMethod$1(this, continuation);
            }
        }
        Object obj = customerApiRepository$setDefaultPaymentMethod$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerApiRepository$setDefaultPaymentMethod$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        String id = customerInfo.getId();
        ApiRequest.Options options = new ApiRequest.Options(customerInfo.getEphemeralKeySecret(), this.lazyPaymentConfig.get().getStripeAccountId(), null, 4, null);
        customerApiRepository$setDefaultPaymentMethod$1.label = 1;
        Object objMo8056setDefaultPaymentMethodBWLJW6A = stripeRepository.mo8056setDefaultPaymentMethodBWLJW6A(id, str, options, customerApiRepository$setDefaultPaymentMethod$1);
        return objMo8056setDefaultPaymentMethodBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8056setDefaultPaymentMethodBWLJW6A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<PaymentMethod> filterPaymentMethods(List<PaymentMethod> allPaymentMethods) {
        boolean z;
        Wallet wallet;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLinkPaymentMethods(allPaymentMethods));
        Set of = SetsKt.setOf((Object[]) new Wallet.Type[]{Wallet.Type.ApplePay, Wallet.Type.GooglePay, Wallet.Type.SamsungPay, Wallet.Type.Link});
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : allPaymentMethods) {
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (paymentMethod.type == PaymentMethod.Type.Card) {
                Set set = of;
                PaymentMethod.Card card = paymentMethod.card;
                z = CollectionsKt.contains(set, (card == null || (wallet = card.wallet) == null) ? null : wallet.getWalletType());
            }
            if (!z) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    private final List<PaymentMethod> getLinkPaymentMethods(List<PaymentMethod> paymentMethods) {
        CardBrand cardBrand;
        Wallet wallet;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paymentMethods.iterator();
        while (true) {
            Wallet.Type walletType = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            PaymentMethod paymentMethod = (PaymentMethod) next;
            if (paymentMethod.type == PaymentMethod.Type.Card) {
                PaymentMethod.Card card = paymentMethod.card;
                if (card != null && (wallet = card.wallet) != null) {
                    walletType = wallet.getWalletType();
                }
                if (walletType == Wallet.Type.Link) {
                    arrayList.add(next);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            PaymentMethod.Card card2 = ((PaymentMethod) obj).card;
            if (hashSet.add((card2 != null ? card2.last4 : null) + "-" + (card2 != null ? card2.expiryMonth : null) + "-" + (card2 != null ? card2.expiryYear : null) + "-" + ((card2 == null || (cardBrand = card2.brand) == null) ? null : cardBrand.getCode()))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: detachPaymentMethodAndDuplicates-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8414detachPaymentMethodAndDuplicatesBWLJW6A(CustomerRepository customerRepository, CustomerRepository.CustomerInfo customerInfo, String str, Continuation<? super Result<PaymentMethod>> continuation) {
        CustomerApiRepository$detachPaymentMethodAndDuplicates$1 customerApiRepository$detachPaymentMethodAndDuplicates$1;
        CoroutineScope CoroutineScope;
        Object objMo8417getPaymentMethodsBWLJW6A;
        CustomerRepository customerRepository2;
        String str2;
        Object next;
        String str3;
        List list;
        CustomerRepository.CustomerInfo customerInfo2;
        CustomerRepository customerRepository3;
        CustomerRepository.CustomerInfo customerInfo3 = customerInfo;
        if (continuation instanceof CustomerApiRepository$detachPaymentMethodAndDuplicates$1) {
            customerApiRepository$detachPaymentMethodAndDuplicates$1 = (CustomerApiRepository$detachPaymentMethodAndDuplicates$1) continuation;
            if ((customerApiRepository$detachPaymentMethodAndDuplicates$1.label & Integer.MIN_VALUE) != 0) {
                customerApiRepository$detachPaymentMethodAndDuplicates$1.label -= Integer.MIN_VALUE;
            } else {
                customerApiRepository$detachPaymentMethodAndDuplicates$1 = new CustomerApiRepository$detachPaymentMethodAndDuplicates$1(this, continuation);
            }
        }
        Object obj = customerApiRepository$detachPaymentMethodAndDuplicates$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = customerApiRepository$detachPaymentMethodAndDuplicates$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope = CoroutineScopeKt.CoroutineScope(this.workContext);
            List<? extends PaymentMethod.Type> listListOf = CollectionsKt.listOf(PaymentMethod.Type.Card);
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$0 = customerRepository;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$1 = customerInfo3;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$2 = str;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$3 = CoroutineScope;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.label = 1;
            objMo8417getPaymentMethodsBWLJW6A = customerRepository.mo8417getPaymentMethodsBWLJW6A(customerInfo3, listListOf, false, customerApiRepository$detachPaymentMethodAndDuplicates$1);
            if (objMo8417getPaymentMethodsBWLJW6A != coroutine_suspended) {
                customerRepository2 = customerRepository;
                str2 = str;
            }
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            list = (List) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$3;
            str3 = (String) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$2;
            customerInfo2 = (CustomerRepository.CustomerInfo) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$1;
            customerRepository3 = (CustomerRepository) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$0;
            ResultKt.throwOnFailure(obj);
            if (list.isEmpty()) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new DuplicatePaymentMethodDetachFailureException(list)));
            }
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$0 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$1 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$2 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$3 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.label = 4;
            Object objMo8416detachPaymentMethodBWLJW6A = customerRepository3.mo8416detachPaymentMethodBWLJW6A(customerInfo2, str3, false, customerApiRepository$detachPaymentMethodAndDuplicates$1);
            return objMo8416detachPaymentMethodBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8416detachPaymentMethodBWLJW6A;
        }
        CoroutineScope coroutineScope = (CoroutineScope) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$3;
        String str4 = (String) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$2;
        CustomerRepository.CustomerInfo customerInfo4 = (CustomerRepository.CustomerInfo) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$1;
        CustomerRepository customerRepository4 = (CustomerRepository) customerApiRepository$detachPaymentMethodAndDuplicates$1.L$0;
        ResultKt.throwOnFailure(obj);
        Object value = ((Result) obj).getValue();
        CoroutineScope = coroutineScope;
        str2 = str4;
        customerInfo3 = customerInfo4;
        objMo8417getPaymentMethodsBWLJW6A = value;
        customerRepository2 = customerRepository4;
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo8417getPaymentMethodsBWLJW6A);
        if (thM9121exceptionOrNullimpl != null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
        }
        List list2 = (List) objMo8417getPaymentMethodsBWLJW6A;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentMethod) next).id, str2)) {
                break;
            }
        }
        PaymentMethod paymentMethod = (PaymentMethod) next;
        if (paymentMethod == null) {
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$0 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$1 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$2 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$3 = null;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.label = 2;
            Object objMo8416detachPaymentMethodBWLJW6A2 = customerRepository2.mo8416detachPaymentMethodBWLJW6A(customerInfo3, str2, false, customerApiRepository$detachPaymentMethodAndDuplicates$1);
            if (objMo8416detachPaymentMethodBWLJW6A2 != coroutine_suspended) {
                return objMo8416detachPaymentMethodBWLJW6A2;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                PaymentMethod paymentMethod2 = (PaymentMethod) obj2;
                if (paymentMethod2.type == PaymentMethod.Type.Card) {
                    PaymentMethod.Card card = paymentMethod2.card;
                    String str5 = card != null ? card.fingerprint : null;
                    PaymentMethod.Card card2 = paymentMethod.card;
                    if (Intrinsics.areEqual(str5, card2 != null ? card2.fingerprint : null) && !Intrinsics.areEqual(paymentMethod2.id, str2)) {
                        arrayList.add(obj2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                CustomerRepository.CustomerInfo customerInfo5 = customerInfo3;
                CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1 customerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1 = new CustomerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1((PaymentMethod) it2.next(), customerRepository2, customerInfo5, arrayList2, null);
                CoroutineScope coroutineScope2 = CoroutineScope;
                arrayList4.add(BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, customerApiRepository$detachPaymentMethodAndDuplicates$2$paymentMethodAsyncRemovals$1$1, 3, null));
                arrayList2 = arrayList2;
                customerInfo3 = customerInfo5;
                CoroutineScope = coroutineScope2;
            }
            CustomerRepository.CustomerInfo customerInfo6 = customerInfo3;
            ArrayList arrayList5 = arrayList2;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$0 = customerRepository2;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$1 = customerInfo6;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$2 = str2;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.L$3 = arrayList5;
            customerApiRepository$detachPaymentMethodAndDuplicates$1.label = 3;
            if (AwaitKt.awaitAll(arrayList4, customerApiRepository$detachPaymentMethodAndDuplicates$1) != coroutine_suspended) {
                str3 = str2;
                list = arrayList5;
                customerInfo2 = customerInfo6;
                customerRepository3 = customerRepository2;
                if (list.isEmpty()) {
                }
            }
        }
    }
}
