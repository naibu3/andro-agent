package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyWithMicrodeposit.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0016\u0010\u0010J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0017\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/payments/bankaccount/domain/VerifyWithMicrodeposit;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;)V", "forPaymentIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;", "publishableKey", "", "clientSecret", "firstAmount", "", "secondAmount", "forPaymentIntent-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "descriptorCode", "forPaymentIntent-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "forSetupIntent-yxL6bBk", "forSetupIntent-BWLJW6A", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerifyWithMicrodeposit {
    public static final int $stable = 8;
    private final StripeRepository stripeRepository;

    @Inject
    public VerifyWithMicrodeposit(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: forPaymentIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8167forPaymentIntentyxL6bBk(String str, String str2, int i, int i2, Continuation<? super Result<PaymentIntent>> continuation) {
        VerifyWithMicrodeposit$forPaymentIntent$1 verifyWithMicrodeposit$forPaymentIntent$1;
        if (continuation instanceof VerifyWithMicrodeposit$forPaymentIntent$1) {
            verifyWithMicrodeposit$forPaymentIntent$1 = (VerifyWithMicrodeposit$forPaymentIntent$1) continuation;
            if ((verifyWithMicrodeposit$forPaymentIntent$1.label & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forPaymentIntent$1.label -= Integer.MIN_VALUE;
            } else {
                verifyWithMicrodeposit$forPaymentIntent$1 = new VerifyWithMicrodeposit$forPaymentIntent$1(this, continuation);
            }
        }
        VerifyWithMicrodeposit$forPaymentIntent$1 verifyWithMicrodeposit$forPaymentIntent$12 = verifyWithMicrodeposit$forPaymentIntent$1;
        Object obj = verifyWithMicrodeposit$forPaymentIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = verifyWithMicrodeposit$forPaymentIntent$12.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
        verifyWithMicrodeposit$forPaymentIntent$12.label = 1;
        Object objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk = stripeRepository.mo8062verifyPaymentIntentWithMicrodepositsyxL6bBk(str2, i, i2, options, verifyWithMicrodeposit$forPaymentIntent$12);
        return objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk == coroutine_suspended ? coroutine_suspended : objMo8062verifyPaymentIntentWithMicrodepositsyxL6bBk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: forPaymentIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8166forPaymentIntentBWLJW6A(String str, String str2, String str3, Continuation<? super Result<PaymentIntent>> continuation) {
        VerifyWithMicrodeposit$forPaymentIntent$2 verifyWithMicrodeposit$forPaymentIntent$2;
        if (continuation instanceof VerifyWithMicrodeposit$forPaymentIntent$2) {
            verifyWithMicrodeposit$forPaymentIntent$2 = (VerifyWithMicrodeposit$forPaymentIntent$2) continuation;
            if ((verifyWithMicrodeposit$forPaymentIntent$2.label & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forPaymentIntent$2.label -= Integer.MIN_VALUE;
            } else {
                verifyWithMicrodeposit$forPaymentIntent$2 = new VerifyWithMicrodeposit$forPaymentIntent$2(this, continuation);
            }
        }
        Object obj = verifyWithMicrodeposit$forPaymentIntent$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = verifyWithMicrodeposit$forPaymentIntent$2.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
        verifyWithMicrodeposit$forPaymentIntent$2.label = 1;
        Object objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A = stripeRepository.mo8061verifyPaymentIntentWithMicrodepositsBWLJW6A(str2, str3, options, verifyWithMicrodeposit$forPaymentIntent$2);
        return objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8061verifyPaymentIntentWithMicrodepositsBWLJW6A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: forSetupIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8169forSetupIntentyxL6bBk(String str, String str2, int i, int i2, Continuation<? super Result<SetupIntent>> continuation) {
        VerifyWithMicrodeposit$forSetupIntent$1 verifyWithMicrodeposit$forSetupIntent$1;
        if (continuation instanceof VerifyWithMicrodeposit$forSetupIntent$1) {
            verifyWithMicrodeposit$forSetupIntent$1 = (VerifyWithMicrodeposit$forSetupIntent$1) continuation;
            if ((verifyWithMicrodeposit$forSetupIntent$1.label & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forSetupIntent$1.label -= Integer.MIN_VALUE;
            } else {
                verifyWithMicrodeposit$forSetupIntent$1 = new VerifyWithMicrodeposit$forSetupIntent$1(this, continuation);
            }
        }
        VerifyWithMicrodeposit$forSetupIntent$1 verifyWithMicrodeposit$forSetupIntent$12 = verifyWithMicrodeposit$forSetupIntent$1;
        Object obj = verifyWithMicrodeposit$forSetupIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = verifyWithMicrodeposit$forSetupIntent$12.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
        verifyWithMicrodeposit$forSetupIntent$12.label = 1;
        Object objMo8064verifySetupIntentWithMicrodepositsyxL6bBk = stripeRepository.mo8064verifySetupIntentWithMicrodepositsyxL6bBk(str2, i, i2, options, verifyWithMicrodeposit$forSetupIntent$12);
        return objMo8064verifySetupIntentWithMicrodepositsyxL6bBk == coroutine_suspended ? coroutine_suspended : objMo8064verifySetupIntentWithMicrodepositsyxL6bBk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: forSetupIntent-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8168forSetupIntentBWLJW6A(String str, String str2, String str3, Continuation<? super Result<SetupIntent>> continuation) {
        VerifyWithMicrodeposit$forSetupIntent$2 verifyWithMicrodeposit$forSetupIntent$2;
        if (continuation instanceof VerifyWithMicrodeposit$forSetupIntent$2) {
            verifyWithMicrodeposit$forSetupIntent$2 = (VerifyWithMicrodeposit$forSetupIntent$2) continuation;
            if ((verifyWithMicrodeposit$forSetupIntent$2.label & Integer.MIN_VALUE) != 0) {
                verifyWithMicrodeposit$forSetupIntent$2.label -= Integer.MIN_VALUE;
            } else {
                verifyWithMicrodeposit$forSetupIntent$2 = new VerifyWithMicrodeposit$forSetupIntent$2(this, continuation);
            }
        }
        Object obj = verifyWithMicrodeposit$forSetupIntent$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = verifyWithMicrodeposit$forSetupIntent$2.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        StripeRepository stripeRepository = this.stripeRepository;
        ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
        verifyWithMicrodeposit$forSetupIntent$2.label = 1;
        Object objMo8063verifySetupIntentWithMicrodepositsBWLJW6A = stripeRepository.mo8063verifySetupIntentWithMicrodepositsBWLJW6A(str2, str3, options, verifyWithMicrodeposit$forSetupIntent$2);
        return objMo8063verifySetupIntentWithMicrodepositsBWLJW6A == coroutine_suspended ? coroutine_suspended : objMo8063verifySetupIntentWithMicrodepositsBWLJW6A;
    }
}
