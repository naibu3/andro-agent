package com.stripe.android.networking;

import com.stripe.android.AlipayAuthenticator;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.AlipayAuthResult;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultAlipayRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository;", "Lcom/stripe/android/networking/AlipayRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;)V", "authenticate", "Lcom/stripe/android/model/AlipayAuthResult;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pingAlipayEndpointBeforeRetrievingPaymentIntentStatus", "", "redirect", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "(Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultAlipayRepository implements AlipayRepository {
    private static final String ALIPAY_RESULT_FIELD = "resultStatus";
    private final StripeRepository stripeRepository;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DefaultAlipayRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.DefaultAlipayRepository", f = "DefaultAlipayRepository.kt", i = {0}, l = {34}, m = "authenticate", n = {"output"}, s = {"L$0"})
    /* renamed from: com.stripe.android.networking.DefaultAlipayRepository$authenticate$1, reason: invalid class name */
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
            return DefaultAlipayRepository.this.authenticate(null, null, null, this);
        }
    }

    /* compiled from: DefaultAlipayRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.networking.DefaultAlipayRepository", f = "DefaultAlipayRepository.kt", i = {}, l = {57}, m = "pingAlipayEndpointBeforeRetrievingPaymentIntentStatus", n = {}, s = {})
    /* renamed from: com.stripe.android.networking.DefaultAlipayRepository$pingAlipayEndpointBeforeRetrievingPaymentIntentStatus$1, reason: invalid class name and case insensitive filesystem */
    static final class C10671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C10671(Continuation<? super C10671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAlipayRepository.this.pingAlipayEndpointBeforeRetrievingPaymentIntentStatus(null, null, this);
        }
    }

    public DefaultAlipayRepository(StripeRepository stripeRepository) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.networking.AlipayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object authenticate(PaymentIntent paymentIntent, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super AlipayAuthResult> continuation) {
        AnonymousClass1 anonymousClass1;
        Map<String, String> mapOnAuthenticationRequest;
        Map<String, String> map;
        String str;
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
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaymentMethod paymentMethod = paymentIntent.getPaymentMethod();
            if (paymentMethod != null && !paymentMethod.liveMode) {
                throw new IllegalArgumentException("Attempted to authenticate test mode PaymentIntent with the Alipay SDK.\nThe Alipay SDK does not support test mode payments.");
            }
            StripeIntent.NextActionData nextActionData = paymentIntent.getNextActionData();
            if (nextActionData instanceof StripeIntent.NextActionData.AlipayRedirect) {
                StripeIntent.NextActionData.AlipayRedirect alipayRedirect = (StripeIntent.NextActionData.AlipayRedirect) nextActionData;
                mapOnAuthenticationRequest = alipayAuthenticator.onAuthenticationRequest(alipayRedirect.getData());
                if (Intrinsics.areEqual(mapOnAuthenticationRequest.get(ALIPAY_RESULT_FIELD), AlipayAuthResult.RESULT_CODE_SUCCESS)) {
                    anonymousClass1.L$0 = mapOnAuthenticationRequest;
                    anonymousClass1.label = 1;
                    if (pingAlipayEndpointBeforeRetrievingPaymentIntentStatus(alipayRedirect, options, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    map = mapOnAuthenticationRequest;
                }
                str = mapOnAuthenticationRequest.get(ALIPAY_RESULT_FIELD);
                if (str == null) {
                    i2 = 0;
                } else {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 1596796) {
                        if (iHashCode != 1656379) {
                            if (iHashCode != 1745751 || !str.equals(AlipayAuthResult.RESULT_CODE_SUCCESS)) {
                            }
                        } else if (str.equals(AlipayAuthResult.RESULT_CODE_CANCELLED)) {
                            i2 = 3;
                        }
                    } else if (str.equals(AlipayAuthResult.RESULT_CODE_FAILED)) {
                        i2 = 2;
                    }
                }
                return new AlipayAuthResult(i2);
            }
            throw new RuntimeException("Unable to authenticate Payment Intent with Alipay SDK");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        map = (Map) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        mapOnAuthenticationRequest = map;
        str = mapOnAuthenticationRequest.get(ALIPAY_RESULT_FIELD);
        if (str == null) {
        }
        return new AlipayAuthResult(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pingAlipayEndpointBeforeRetrievingPaymentIntentStatus(StripeIntent.NextActionData.AlipayRedirect alipayRedirect, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        C10671 c10671;
        if (continuation instanceof C10671) {
            c10671 = (C10671) continuation;
            if ((c10671.label & Integer.MIN_VALUE) != 0) {
                c10671.label -= Integer.MIN_VALUE;
            } else {
                c10671 = new C10671(continuation);
            }
        }
        Object obj = c10671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10671.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (alipayRedirect.getAuthCompleteUrl() != null) {
                StripeRepository stripeRepository = this.stripeRepository;
                String authCompleteUrl = alipayRedirect.getAuthCompleteUrl();
                c10671.label = 1;
                if (stripeRepository.mo8048retrieveObject0E7RQCE(authCompleteUrl, options, c10671) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).getValue();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DefaultAlipayRepository.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;", "", "<init>", "()V", "ALIPAY_RESULT_FIELD", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
