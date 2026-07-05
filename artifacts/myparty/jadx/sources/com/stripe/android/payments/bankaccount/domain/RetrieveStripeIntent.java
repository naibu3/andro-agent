package com.stripe.android.payments.bankaccount.domain;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetrieveStripeIntent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/bankaccount/domain/RetrieveStripeIntent;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;)V", "invoke", "Lkotlin/Result;", "Lcom/stripe/android/model/StripeIntent;", "publishableKey", "", "clientSecret", "invoke-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RetrieveStripeIntent {
    public static final int $stable = 8;
    private final StripeRepository stripeRepository;

    @Inject
    public RetrieveStripeIntent(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: invoke-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8165invoke0E7RQCE(String str, String str2, Continuation<? super Result<? extends StripeIntent>> continuation) {
        RetrieveStripeIntent$invoke$1 retrieveStripeIntent$invoke$1;
        if (continuation instanceof RetrieveStripeIntent$invoke$1) {
            retrieveStripeIntent$invoke$1 = (RetrieveStripeIntent$invoke$1) continuation;
            if ((retrieveStripeIntent$invoke$1.label & Integer.MIN_VALUE) != 0) {
                retrieveStripeIntent$invoke$1.label -= Integer.MIN_VALUE;
            } else {
                retrieveStripeIntent$invoke$1 = new RetrieveStripeIntent$invoke$1(this, continuation);
            }
        }
        RetrieveStripeIntent$invoke$1 retrieveStripeIntent$invoke$12 = retrieveStripeIntent$invoke$1;
        Object obj = retrieveStripeIntent$invoke$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = retrieveStripeIntent$invoke$12.label;
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
        retrieveStripeIntent$invoke$12.label = 1;
        Object objM8070retrieveStripeIntentBWLJW6A$default = StripeRepository.DefaultImpls.m8070retrieveStripeIntentBWLJW6A$default(stripeRepository, str2, options, null, retrieveStripeIntent$invoke$12, 4, null);
        return objM8070retrieveStripeIntentBWLJW6A$default == coroutine_suspended ? coroutine_suspended : objM8070retrieveStripeIntentBWLJW6A$default;
    }
}
