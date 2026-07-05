package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachFinancialConnectionsSession.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\u0012\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;)V", "forPaymentIntent", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentIntent;", "publishableKey", "", "linkedAccountSessionId", "clientSecret", NamedConstantsKt.STRIPE_ACCOUNT_ID, "forPaymentIntent-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forSetupIntent", "Lcom/stripe/android/model/SetupIntent;", "forSetupIntent-yxL6bBk", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AttachFinancialConnectionsSession {
    private final StripeRepository stripeRepository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> EXPAND_PAYMENT_METHOD = CollectionsKt.listOf("payment_method");

    @Inject
    public AttachFinancialConnectionsSession(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: forPaymentIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8160forPaymentIntentyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<PaymentIntent>> continuation) {
        AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$1;
        Object objCreateFailure;
        Object objMo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk;
        if (continuation instanceof AttachFinancialConnectionsSession$forPaymentIntent$1) {
            attachFinancialConnectionsSession$forPaymentIntent$1 = (AttachFinancialConnectionsSession$forPaymentIntent$1) continuation;
            if ((attachFinancialConnectionsSession$forPaymentIntent$1.label & Integer.MIN_VALUE) != 0) {
                attachFinancialConnectionsSession$forPaymentIntent$1.label -= Integer.MIN_VALUE;
            } else {
                attachFinancialConnectionsSession$forPaymentIntent$1 = new AttachFinancialConnectionsSession$forPaymentIntent$1(this, continuation);
            }
        }
        AttachFinancialConnectionsSession$forPaymentIntent$1 attachFinancialConnectionsSession$forPaymentIntent$12 = attachFinancialConnectionsSession$forPaymentIntent$1;
        Object obj = attachFinancialConnectionsSession$forPaymentIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = attachFinancialConnectionsSession$forPaymentIntent$12.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objCreateFailure = ResultKt.createFailure(th);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                AttachFinancialConnectionsSession attachFinancialConnectionsSession = this;
                objCreateFailure = Result.m9118constructorimpl(new PaymentIntent.ClientSecret(str3));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objCreateFailure = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                Result.Companion companion4 = Result.INSTANCE;
                PaymentIntent.ClientSecret clientSecret = (PaymentIntent.ClientSecret) objCreateFailure;
                StripeRepository stripeRepository = this.stripeRepository;
                String value$payments_core_release = clientSecret.getValue$payments_core_release();
                String paymentIntentId = clientSecret.getPaymentIntentId();
                ApiRequest.Options options = new ApiRequest.Options(str, str4, null, 4, null);
                List<String> list = EXPAND_PAYMENT_METHOD;
                attachFinancialConnectionsSession$forPaymentIntent$12.label = 1;
                objMo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk = stripeRepository.mo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk(value$payments_core_release, paymentIntentId, str2, options, list, attachFinancialConnectionsSession$forPaymentIntent$12);
                if (objMo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Result.m9118constructorimpl(objCreateFailure);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objMo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk = ((Result) obj).getValue();
        ResultKt.throwOnFailure(objMo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk);
        return Result.m9118constructorimpl((PaymentIntent) objMo8013attachFinancialConnectionsSessionToPaymentIntenthUnOzRk);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: forSetupIntent-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8161forSetupIntentyxL6bBk(String str, String str2, String str3, String str4, Continuation<? super Result<SetupIntent>> continuation) {
        AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$1;
        Object objCreateFailure;
        Object objMo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk;
        if (continuation instanceof AttachFinancialConnectionsSession$forSetupIntent$1) {
            attachFinancialConnectionsSession$forSetupIntent$1 = (AttachFinancialConnectionsSession$forSetupIntent$1) continuation;
            if ((attachFinancialConnectionsSession$forSetupIntent$1.label & Integer.MIN_VALUE) != 0) {
                attachFinancialConnectionsSession$forSetupIntent$1.label -= Integer.MIN_VALUE;
            } else {
                attachFinancialConnectionsSession$forSetupIntent$1 = new AttachFinancialConnectionsSession$forSetupIntent$1(this, continuation);
            }
        }
        AttachFinancialConnectionsSession$forSetupIntent$1 attachFinancialConnectionsSession$forSetupIntent$12 = attachFinancialConnectionsSession$forSetupIntent$1;
        Object obj = attachFinancialConnectionsSession$forSetupIntent$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = attachFinancialConnectionsSession$forSetupIntent$12.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            objCreateFailure = ResultKt.createFailure(th);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Result.Companion companion2 = Result.INSTANCE;
                AttachFinancialConnectionsSession attachFinancialConnectionsSession = this;
                objCreateFailure = Result.m9118constructorimpl(new SetupIntent.ClientSecret(str3));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objCreateFailure = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m9125isSuccessimpl(objCreateFailure)) {
                Result.Companion companion4 = Result.INSTANCE;
                SetupIntent.ClientSecret clientSecret = (SetupIntent.ClientSecret) objCreateFailure;
                StripeRepository stripeRepository = this.stripeRepository;
                String value$payments_core_release = clientSecret.getValue$payments_core_release();
                String setupIntentId = clientSecret.getSetupIntentId();
                ApiRequest.Options options = new ApiRequest.Options(str, str4, null, 4, null);
                List<String> list = EXPAND_PAYMENT_METHOD;
                attachFinancialConnectionsSession$forSetupIntent$12.label = 1;
                objMo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk = stripeRepository.mo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk(value$payments_core_release, setupIntentId, str2, options, list, attachFinancialConnectionsSession$forSetupIntent$12);
                if (objMo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Result.m9118constructorimpl(objCreateFailure);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objMo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk = ((Result) obj).getValue();
        ResultKt.throwOnFailure(objMo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk);
        return Result.m9118constructorimpl((SetupIntent) objMo8014attachFinancialConnectionsSessionToSetupIntenthUnOzRk);
    }

    /* compiled from: AttachFinancialConnectionsSession.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/bankaccount/domain/AttachFinancialConnectionsSession$Companion;", "", "<init>", "()V", "EXPAND_PAYMENT_METHOD", "", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
