package com.stripe.android.financialconnections.repository;

import androidx.autofill.HintConstants;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.frauddetection.FraudDetectionData;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiService;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.financialconnections.utils.BillingDetailsExtensionsKt;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import com.stripe.android.model.CustomEmailType;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.SignUpParams;
import com.stripe.android.model.UpdateAvailableIncentives;
import com.stripe.android.model.VerificationType;
import com.stripe.android.repository.ConsumersApiService;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\"J6\u0010#\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010&Jn\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00192\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00192.\u0010(\u001a*\b\u0001\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0-0,\u0012\u0006\u0012\u0004\u0018\u00010.0)H\u0082@¢\u0006\u0002\u0010/J2\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u00010\u00192\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0096@¢\u0006\u0002\u00108J&\u00109\u001a\u0002012\u0006\u00102\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00192\u0006\u00104\u001a\u000205H\u0096@¢\u0006\u0002\u0010;J\u001e\u0010<\u001a\u00020=2\u0006\u00102\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010?J(\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\b\u0010C\u001a\u0004\u0018\u00010DH\u0096@¢\u0006\u0002\u0010EJ0\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u00192\b\u0010J\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0002\u0010KJ.\u0010L\u001a\b\u0012\u0004\u0012\u00020M0-2\u0006\u0010N\u001a\u00020\u00192\u0006\u0010H\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019H\u0096@¢\u0006\u0004\bO\u0010\"J\u001e\u0010P\u001a\u00020Q2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010?J6\u0010R\u001a\u00020Q2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010S\u001a\u00020T2\u0006\u0010$\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010UJ\u0018\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u000201H\u0002J\u0010\u0010Z\u001a\u00020W2\u0006\u0010[\u001a\u00020QH\u0002J\u0010\u0010\\\u001a\u00020W2\u0006\u0010]\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "financialConnectionsConsumersApiService", "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;", "consumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "consumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;", "provideApiRequestOptions", "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;", "locale", "Ljava/util/Locale;", "logger", "Lcom/stripe/android/core/Logger;", "fraudDetectionDataRepository", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "isLinkWithStripe", "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;", "<init>", "(Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;Lcom/stripe/android/repository/ConsumersApiService;Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "requestSurface", "", "getCachedConsumerSession", "Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/stripe/android/model/ConsumerSessionSignup;", "email", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mobileSignUp", "verificationToken", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performSignUp", "signupCall", "Lkotlin/Function3;", "Lcom/stripe/android/model/SignUpParams;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConsumerVerification", "Lcom/stripe/android/model/ConsumerSession;", "consumerSessionClientSecret", "connectionsMerchantName", "type", "Lcom/stripe/android/model/VerificationType;", "customEmailType", "Lcom/stripe/android/model/CustomEmailType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lcom/stripe/android/model/CustomEmailType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmConsumerVerification", "verificationCode", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/VerificationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachLinkConsumerToLinkAccountSession", "Lcom/stripe/android/model/AttachConsumerToLinkAccountSession;", "clientSecret", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentDetails", "Lcom/stripe/android/model/ConsumerPaymentDetails;", "bankAccountId", "billingDetails", "Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/ElementsSessionContext$BillingDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sharePaymentDetails", "Lcom/stripe/android/model/SharePaymentDetails;", "paymentDetailsId", "expectedPaymentMethodType", "billingPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAvailableIncentives", "Lcom/stripe/android/model/UpdateAvailableIncentives;", "sessionId", "updateAvailableIncentives-BWLJW6A", "postConsumerSession", "Lcom/stripe/android/model/ConsumerSessionLookup;", "mobileLookupConsumerSession", "emailSource", "Lcom/stripe/android/model/EmailSource;", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCachedConsumerSession", "", "source", "consumerSession", "updateCachedConsumerSessionFromLookup", Constants.LOCALEMATCHER_LOOKUP, "updateCachedConsumerSessionFromSignup", "signup", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FinancialConnectionsConsumerSessionRepositoryImpl implements FinancialConnectionsConsumerSessionRepository {
    private final ConsumerSessionRepository consumerSessionRepository;
    private final ConsumersApiService consumersApiService;
    private final ElementsSessionContext elementsSessionContext;
    private final FinancialConnectionsConsumersApiService financialConnectionsConsumersApiService;
    private final FraudDetectionDataRepository fraudDetectionDataRepository;
    private final Locale locale;
    private final Logger logger;
    private final Mutex mutex;
    private final ProvideApiRequestOptions provideApiRequestOptions;
    private final String requestSurface;

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {366, 231}, m = "confirmConsumerVerification", n = {"this", "consumerSessionClientSecret", "verificationCode", "type", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$confirmConsumerVerification$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.confirmConsumerVerification(null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {}, l = {259}, m = "createPaymentDetails", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$createPaymentDetails$1, reason: invalid class name and case insensitive filesystem */
    static final class C09941 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C09941(Continuation<? super C09941> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.createPaymentDetails(null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0}, l = {366}, m = "getCachedConsumerSession", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$getCachedConsumerSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C09951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C09951(Continuation<? super C09951> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.getCachedConsumerSession(this);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0}, l = {322}, m = "mobileLookupConsumerSession", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$mobileLookupConsumerSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C09961 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09961(Continuation<? super C09961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.mobileLookupConsumerSession(null, null, null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, l = {366, 202}, m = "performSignUp", n = {"this", "email", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "country", "verificationToken", "appId", "signupCall", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$performSignUp$1, reason: invalid class name and case insensitive filesystem */
    static final class C09971 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C09971(Continuation<? super C09971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.performSignUp(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0}, l = {308}, m = "postConsumerSession", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$postConsumerSession$1, reason: invalid class name and case insensitive filesystem */
    static final class C09981 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09981(Continuation<? super C09981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.postConsumerSession(null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {}, l = {280}, m = "sharePaymentDetails", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$sharePaymentDetails$1, reason: invalid class name and case insensitive filesystem */
    static final class C09991 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C09991(Continuation<? super C09991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.sharePaymentDetails(null, null, null, null, this);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0, 0, 0, 0, 0, 1, 1}, l = {366, 213}, m = "startConsumerVerification", n = {"this", "consumerSessionClientSecret", "connectionsMerchantName", "type", "customEmailType", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$startConsumerVerification$1, reason: invalid class name and case insensitive filesystem */
    static final class C10011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C10011(Continuation<? super C10011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsConsumerSessionRepositoryImpl.this.startConsumerVerification(null, null, null, null, this);
        }
    }

    public FinancialConnectionsConsumerSessionRepositoryImpl(FinancialConnectionsConsumersApiService financialConnectionsConsumersApiService, ConsumersApiService consumersApiService, ConsumerSessionRepository consumerSessionRepository, ProvideApiRequestOptions provideApiRequestOptions, Locale locale, Logger logger, FraudDetectionDataRepository fraudDetectionDataRepository, ElementsSessionContext elementsSessionContext, IsLinkWithStripe isLinkWithStripe) {
        String str;
        Intrinsics.checkNotNullParameter(financialConnectionsConsumersApiService, "financialConnectionsConsumersApiService");
        Intrinsics.checkNotNullParameter(consumersApiService, "consumersApiService");
        Intrinsics.checkNotNullParameter(consumerSessionRepository, "consumerSessionRepository");
        Intrinsics.checkNotNullParameter(provideApiRequestOptions, "provideApiRequestOptions");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        Intrinsics.checkNotNullParameter(isLinkWithStripe, "isLinkWithStripe");
        this.financialConnectionsConsumersApiService = financialConnectionsConsumersApiService;
        this.consumersApiService = consumersApiService;
        this.consumerSessionRepository = consumerSessionRepository;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.locale = locale;
        this.logger = logger;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.elementsSessionContext = elementsSessionContext;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        if (isLinkWithStripe.invoke()) {
            str = "android_instant_debits";
        } else {
            str = "android_connections";
        }
        this.requestSurface = str;
        fraudDetectionDataRepository.refresh();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getCachedConsumerSession(Continuation<? super CachedConsumerSession> continuation) {
        C09951 c09951;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl;
        Mutex mutex;
        if (continuation instanceof C09951) {
            c09951 = (C09951) continuation;
            if ((c09951.label & Integer.MIN_VALUE) != 0) {
                c09951.label -= Integer.MIN_VALUE;
            } else {
                c09951 = new C09951(continuation);
            }
        }
        Object obj = c09951.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09951.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Mutex mutex2 = this.mutex;
            c09951.L$0 = this;
            c09951.L$1 = mutex2;
            c09951.label = 1;
            if (mutex2.lock(null, c09951) == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsConsumerSessionRepositoryImpl = this;
            mutex = mutex2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c09951.L$1;
            financialConnectionsConsumerSessionRepositoryImpl = (FinancialConnectionsConsumerSessionRepositoryImpl) c09951.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            return financialConnectionsConsumerSessionRepositoryImpl.consumerSessionRepository.provideConsumerSession();
        } finally {
            mutex.unlock(null);
        }
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$signUp$2, reason: invalid class name and case insensitive filesystem */
    /* synthetic */ class C10002 extends FunctionReferenceImpl implements Function3<SignUpParams, ApiRequest.Options, Continuation<? super Result<? extends ConsumerSessionSignup>>, Object>, SuspendFunction {
        C10002(Object obj) {
            super(3, obj, ConsumersApiService.class, "signUp", "signUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: invoke-0E7RQCE, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Object invoke(SignUpParams signUpParams, ApiRequest.Options options, Continuation<? super Result<ConsumerSessionSignup>> continuation) {
            Object objMo8602signUp0E7RQCE = ((ConsumersApiService) this.receiver).mo8602signUp0E7RQCE(signUpParams, options, continuation);
            return objMo8602signUp0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8602signUp0E7RQCE : Result.m9117boximpl(objMo8602signUp0E7RQCE);
        }
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    public Object signUp(String str, String str2, String str3, Continuation<? super ConsumerSessionSignup> continuation) {
        return performSignUp$default(this, str, str2, str3, null, null, new C10002(this.consumersApiService), continuation, 24, null);
    }

    /* compiled from: FinancialConnectionsConsumerSessionRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl$mobileSignUp$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function3<SignUpParams, ApiRequest.Options, Continuation<? super Result<? extends ConsumerSessionSignup>>, Object>, SuspendFunction {
        AnonymousClass2(Object obj) {
            super(3, obj, ConsumersApiService.class, "mobileSignUp", "mobileSignUp-0E7RQCE(Lcom/stripe/android/model/SignUpParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: invoke-0E7RQCE, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Object invoke(SignUpParams signUpParams, ApiRequest.Options options, Continuation<? super Result<ConsumerSessionSignup>> continuation) {
            Object objMo8600mobileSignUp0E7RQCE = ((ConsumersApiService) this.receiver).mo8600mobileSignUp0E7RQCE(signUpParams, options, continuation);
            return objMo8600mobileSignUp0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo8600mobileSignUp0E7RQCE : Result.m9117boximpl(objMo8600mobileSignUp0E7RQCE);
        }
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    public Object mobileSignUp(String str, String str2, String str3, String str4, String str5, Continuation<? super ConsumerSessionSignup> continuation) {
        return performSignUp(str, str2, str3, str4, str5, new AnonymousClass2(this.consumersApiService), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0036, B:40:0x00fd, B:42:0x0109, B:43:0x010f), top: B:52:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performSignUp(String str, String str2, String str3, String str4, String str5, Function3<? super SignUpParams, ? super ApiRequest.Options, ? super Continuation<? super Result<ConsumerSessionSignup>>, ? extends Object> function3, Continuation<? super ConsumerSessionSignup> continuation) throws Throwable {
        C09971 c09971;
        String str6;
        String str7;
        Function3<? super SignUpParams, ? super ApiRequest.Options, ? super Continuation<? super Result<ConsumerSessionSignup>>, ? extends Object> function32;
        String str8;
        String str9;
        String str10;
        Mutex mutex;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl;
        Mutex mutex2;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl2;
        Object value;
        if (continuation instanceof C09971) {
            c09971 = (C09971) continuation;
            if ((c09971.label & Integer.MIN_VALUE) != 0) {
                c09971.label -= Integer.MIN_VALUE;
            } else {
                c09971 = new C09971(continuation);
            }
        }
        Object obj = c09971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09971.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Mutex mutex3 = this.mutex;
                c09971.L$0 = this;
                c09971.L$1 = str;
                c09971.L$2 = str2;
                c09971.L$3 = str3;
                c09971.L$4 = str4;
                c09971.L$5 = str5;
                c09971.L$6 = function3;
                c09971.L$7 = mutex3;
                c09971.label = 1;
                if (mutex3.lock(null, c09971) != coroutine_suspended) {
                    str6 = str4;
                    str7 = str5;
                    function32 = function3;
                    str8 = str2;
                    str9 = str3;
                    str10 = str;
                    mutex = mutex3;
                    financialConnectionsConsumerSessionRepositoryImpl = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c09971.L$1;
                financialConnectionsConsumerSessionRepositoryImpl2 = (FinancialConnectionsConsumerSessionRepositoryImpl) c09971.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    value = ((Result) obj).getValue();
                    if (Result.m9125isSuccessimpl(value)) {
                        financialConnectionsConsumerSessionRepositoryImpl2.updateCachedConsumerSessionFromSignup((ConsumerSessionSignup) value);
                    }
                    ResultKt.throwOnFailure(value);
                    ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) value;
                    mutex2.unlock(null);
                    return consumerSessionSignup;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            mutex = (Mutex) c09971.L$7;
            function32 = (Function3) c09971.L$6;
            String str11 = (String) c09971.L$5;
            String str12 = (String) c09971.L$4;
            String str13 = (String) c09971.L$3;
            String str14 = (String) c09971.L$2;
            String str15 = (String) c09971.L$1;
            FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl3 = (FinancialConnectionsConsumerSessionRepositoryImpl) c09971.L$0;
            ResultKt.throwOnFailure(obj);
            str9 = str13;
            str8 = str14;
            str7 = str11;
            str6 = str12;
            str10 = str15;
            financialConnectionsConsumerSessionRepositoryImpl = financialConnectionsConsumerSessionRepositoryImpl3;
            Locale locale = financialConnectionsConsumerSessionRepositoryImpl.locale;
            ElementsSessionContext elementsSessionContext = financialConnectionsConsumerSessionRepositoryImpl.elementsSessionContext;
            Long amount = elementsSessionContext != null ? elementsSessionContext.getAmount() : null;
            ElementsSessionContext elementsSessionContext2 = financialConnectionsConsumerSessionRepositoryImpl.elementsSessionContext;
            String currency = elementsSessionContext2 != null ? elementsSessionContext2.getCurrency() : null;
            ElementsSessionContext elementsSessionContext3 = financialConnectionsConsumerSessionRepositoryImpl.elementsSessionContext;
            SignUpParams signUpParams = new SignUpParams(str10, str8, str9, null, locale, amount, currency, elementsSessionContext3 != null ? elementsSessionContext3.getIncentiveEligibilitySession() : null, financialConnectionsConsumerSessionRepositoryImpl.requestSurface, ConsumerSignUpConsentAction.EnteredPhoneNumberClickedSaveToLink, str6, str7);
            ApiRequest.Options optionsInvoke = financialConnectionsConsumerSessionRepositoryImpl.provideApiRequestOptions.invoke(false);
            c09971.L$0 = financialConnectionsConsumerSessionRepositoryImpl;
            c09971.L$1 = mutex;
            c09971.L$2 = null;
            c09971.L$3 = null;
            c09971.L$4 = null;
            c09971.L$5 = null;
            c09971.L$6 = null;
            c09971.L$7 = null;
            c09971.label = 2;
            Object objInvoke = function32.invoke(signUpParams, optionsInvoke, c09971);
            if (objInvoke != coroutine_suspended) {
                financialConnectionsConsumerSessionRepositoryImpl2 = financialConnectionsConsumerSessionRepositoryImpl;
                obj = objInvoke;
                mutex2 = mutex;
                value = ((Result) obj).getValue();
                if (Result.m9125isSuccessimpl(value)) {
                }
                ResultKt.throwOnFailure(value);
                ConsumerSessionSignup consumerSessionSignup2 = (ConsumerSessionSignup) value;
                mutex2.unlock(null);
                return consumerSessionSignup2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    static /* synthetic */ Object performSignUp$default(FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl, String str, String str2, String str3, String str4, String str5, Function3 function3, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        return financialConnectionsConsumerSessionRepositoryImpl.performSignUp(str, str2, str3, str4, str5, function3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startConsumerVerification(String str, String str2, VerificationType verificationType, CustomEmailType customEmailType, Continuation<? super ConsumerSession> continuation) throws Throwable {
        C10011 c10011;
        String str3;
        VerificationType verificationType2;
        CustomEmailType customEmailType2;
        Mutex mutex;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl;
        String str4;
        Mutex mutex2;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl2;
        Object obj;
        if (continuation instanceof C10011) {
            c10011 = (C10011) continuation;
            if ((c10011.label & Integer.MIN_VALUE) != 0) {
                c10011.label -= Integer.MIN_VALUE;
            } else {
                c10011 = new C10011(continuation);
            }
        }
        C10011 c100112 = c10011;
        Object obj2 = c100112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c100112.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj2);
                Mutex mutex3 = this.mutex;
                c100112.L$0 = this;
                str3 = str;
                c100112.L$1 = str3;
                c100112.L$2 = str2;
                verificationType2 = verificationType;
                c100112.L$3 = verificationType2;
                customEmailType2 = customEmailType;
                c100112.L$4 = customEmailType2;
                c100112.L$5 = mutex3;
                c100112.label = 1;
                if (mutex3.lock(null, c100112) != coroutine_suspended) {
                    mutex = mutex3;
                    financialConnectionsConsumerSessionRepositoryImpl = this;
                    str4 = str2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c100112.L$1;
                financialConnectionsConsumerSessionRepositoryImpl2 = (FinancialConnectionsConsumerSessionRepositoryImpl) c100112.L$0;
                try {
                    ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    financialConnectionsConsumerSessionRepositoryImpl2.updateCachedConsumerSession("startConsumerVerification", (ConsumerSession) obj);
                    ConsumerSession consumerSession = (ConsumerSession) obj;
                    mutex2.unlock(null);
                    return consumerSession;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex4 = (Mutex) c100112.L$5;
            CustomEmailType customEmailType3 = (CustomEmailType) c100112.L$4;
            VerificationType verificationType3 = (VerificationType) c100112.L$3;
            String str5 = (String) c100112.L$2;
            String str6 = (String) c100112.L$1;
            FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl3 = (FinancialConnectionsConsumerSessionRepositoryImpl) c100112.L$0;
            ResultKt.throwOnFailure(obj2);
            mutex = mutex4;
            str3 = str6;
            financialConnectionsConsumerSessionRepositoryImpl = financialConnectionsConsumerSessionRepositoryImpl3;
            customEmailType2 = customEmailType3;
            str4 = str5;
            verificationType2 = verificationType3;
            ConsumersApiService consumersApiService = financialConnectionsConsumerSessionRepositoryImpl.consumersApiService;
            Locale locale = financialConnectionsConsumerSessionRepositoryImpl.locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Intrinsics.checkNotNull(locale);
            Locale locale2 = locale;
            String str7 = financialConnectionsConsumerSessionRepositoryImpl.requestSurface;
            ApiRequest.Options optionsInvoke = financialConnectionsConsumerSessionRepositoryImpl.provideApiRequestOptions.invoke(false);
            c100112.L$0 = financialConnectionsConsumerSessionRepositoryImpl;
            c100112.L$1 = mutex;
            c100112.L$2 = null;
            c100112.L$3 = null;
            c100112.L$4 = null;
            c100112.L$5 = null;
            c100112.label = 2;
            Object objStartConsumerVerification = consumersApiService.startConsumerVerification(str3, locale2, str7, verificationType2, customEmailType2, str4, optionsInvoke, c100112);
            if (objStartConsumerVerification != coroutine_suspended) {
                financialConnectionsConsumerSessionRepositoryImpl2 = financialConnectionsConsumerSessionRepositoryImpl;
                obj = objStartConsumerVerification;
                mutex2 = mutex;
                financialConnectionsConsumerSessionRepositoryImpl2.updateCachedConsumerSession("startConsumerVerification", (ConsumerSession) obj);
                ConsumerSession consumerSession2 = (ConsumerSession) obj;
                mutex2.unlock(null);
                return consumerSession2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object confirmConsumerVerification(String str, String str2, VerificationType verificationType, Continuation<? super ConsumerSession> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Mutex mutex;
        String str3;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl;
        VerificationType verificationType2;
        Throwable th;
        Mutex mutex2;
        Object obj;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object obj2 = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj2);
                mutex = this.mutex;
                anonymousClass12.L$0 = this;
                anonymousClass12.L$1 = str;
                anonymousClass12.L$2 = str2;
                anonymousClass12.L$3 = verificationType;
                anonymousClass12.L$4 = mutex;
                anonymousClass12.label = 1;
                if (mutex.lock(null, anonymousClass12) != coroutine_suspended) {
                    str3 = str2;
                    financialConnectionsConsumerSessionRepositoryImpl = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) anonymousClass12.L$1;
                financialConnectionsConsumerSessionRepositoryImpl = (FinancialConnectionsConsumerSessionRepositoryImpl) anonymousClass12.L$0;
                try {
                    ResultKt.throwOnFailure(obj2);
                    obj = obj2;
                    financialConnectionsConsumerSessionRepositoryImpl.updateCachedConsumerSession("confirmConsumerVerification", (ConsumerSession) obj);
                    mutex2.unlock(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) anonymousClass12.L$4;
            verificationType = (VerificationType) anonymousClass12.L$3;
            String str4 = (String) anonymousClass12.L$2;
            String str5 = (String) anonymousClass12.L$1;
            FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl2 = (FinancialConnectionsConsumerSessionRepositoryImpl) anonymousClass12.L$0;
            ResultKt.throwOnFailure(obj2);
            str3 = str4;
            financialConnectionsConsumerSessionRepositoryImpl = financialConnectionsConsumerSessionRepositoryImpl2;
            mutex = mutex3;
            str = str5;
            ConsumersApiService consumersApiService = financialConnectionsConsumerSessionRepositoryImpl.consumersApiService;
            String str6 = financialConnectionsConsumerSessionRepositoryImpl.requestSurface;
            ApiRequest.Options optionsInvoke = financialConnectionsConsumerSessionRepositoryImpl.provideApiRequestOptions.invoke(false);
            anonymousClass12.L$0 = financialConnectionsConsumerSessionRepositoryImpl;
            anonymousClass12.L$1 = mutex;
            anonymousClass12.L$2 = null;
            anonymousClass12.L$3 = null;
            anonymousClass12.L$4 = null;
            anonymousClass12.label = 2;
            Object objConfirmConsumerVerification = consumersApiService.confirmConsumerVerification(str, str3, str6, verificationType2, optionsInvoke, anonymousClass12);
            if (objConfirmConsumerVerification != coroutine_suspended) {
                Mutex mutex4 = mutex;
                obj = objConfirmConsumerVerification;
                mutex2 = mutex4;
                financialConnectionsConsumerSessionRepositoryImpl.updateCachedConsumerSession("confirmConsumerVerification", (ConsumerSession) obj);
                mutex2.unlock(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        verificationType2 = verificationType;
    }

    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    public Object attachLinkConsumerToLinkAccountSession(String str, String str2, Continuation<? super AttachConsumerToLinkAccountSession> continuation) {
        return this.consumersApiService.attachLinkConsumerToLinkAccountSession(str, str2, this.requestSurface, this.provideApiRequestOptions.invoke(false), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createPaymentDetails(String str, String str2, ElementsSessionContext.BillingDetails billingDetails, Continuation<? super ConsumerPaymentDetails> continuation) {
        C09941 c09941;
        Object objMo8599createPaymentDetailsyxL6bBk;
        if (continuation instanceof C09941) {
            c09941 = (C09941) continuation;
            if ((c09941.label & Integer.MIN_VALUE) != 0) {
                c09941.label -= Integer.MIN_VALUE;
            } else {
                c09941 = new C09941(continuation);
            }
        }
        C09941 c099412 = c09941;
        Object obj = c099412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c099412.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConsumersApiService consumersApiService = this.consumersApiService;
            ConsumerPaymentDetailsCreateParams.BankAccount bankAccount = new ConsumerPaymentDetailsCreateParams.BankAccount(str, billingDetails != null ? BillingDetailsExtensionsKt.toConsumerBillingAddressParams(billingDetails) : null, billingDetails != null ? billingDetails.getEmail() : null);
            String str3 = this.requestSurface;
            ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(true);
            c099412.label = 1;
            objMo8599createPaymentDetailsyxL6bBk = consumersApiService.mo8599createPaymentDetailsyxL6bBk(str2, bankAccount, str3, optionsInvoke, c099412);
            if (objMo8599createPaymentDetailsyxL6bBk == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8599createPaymentDetailsyxL6bBk = ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(objMo8599createPaymentDetailsyxL6bBk);
        return objMo8599createPaymentDetailsyxL6bBk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sharePaymentDetails(String str, String str2, String str3, String str4, Continuation<? super SharePaymentDetails> continuation) {
        C09991 c09991;
        String phone;
        Object objMo8601sharePaymentDetailseH_QyT8;
        ElementsSessionContext.BillingDetails billingDetails;
        if (continuation instanceof C09991) {
            c09991 = (C09991) continuation;
            if ((c09991.label & Integer.MIN_VALUE) != 0) {
                c09991.label -= Integer.MIN_VALUE;
            } else {
                c09991 = new C09991(continuation);
            }
        }
        C09991 c099912 = c09991;
        Object obj = c099912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c099912.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FraudDetectionData cached = this.fraudDetectionDataRepository.getCached();
            Map<String, String> params = cached != null ? cached.getParams() : null;
            if (params == null) {
                params = MapsKt.emptyMap();
            }
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("expand", CollectionsKt.listOf("payment_method")));
            ConsumersApiService consumersApiService = this.consumersApiService;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            if (elementsSessionContext == null || (billingDetails = elementsSessionContext.getBillingDetails()) == null || (phone = billingDetails.getPhone()) == null || StringsKt.isBlank(phone)) {
                phone = null;
            }
            String str5 = this.requestSurface;
            ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(false);
            Map<String, ? extends Object> mapPlus = MapsKt.plus(params, mapMapOf);
            c099912.label = 1;
            objMo8601sharePaymentDetailseH_QyT8 = consumersApiService.mo8601sharePaymentDetailseH_QyT8(str2, str, str3, phone, str5, optionsInvoke, mapPlus, c099912);
            if (objMo8601sharePaymentDetailseH_QyT8 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo8601sharePaymentDetailseH_QyT8 = ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(objMo8601sharePaymentDetailseH_QyT8);
        return objMo8601sharePaymentDetailseH_QyT8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /* renamed from: updateAvailableIncentives-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7548updateAvailableIncentivesBWLJW6A(String str, String str2, String str3, Continuation<? super Result<UpdateAvailableIncentives>> continuation) {
        FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1 financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;
        if (continuation instanceof FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1) {
            financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1 = (FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1) continuation;
            if ((financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1.label & Integer.MIN_VALUE) != 0) {
                financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1.label -= Integer.MIN_VALUE;
            } else {
                financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1 = new FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1(this, continuation);
            }
        }
        FinancialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1 financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$12 = financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$1;
        Object obj = financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$12.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        ConsumersApiService consumersApiService = this.consumersApiService;
        String str4 = this.requestSurface;
        ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(false);
        financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$12.label = 1;
        Object objMo8603updateAvailableIncentiveshUnOzRk = consumersApiService.mo8603updateAvailableIncentiveshUnOzRk(str, str2, str3, str4, optionsInvoke, financialConnectionsConsumerSessionRepositoryImpl$updateAvailableIncentives$12);
        return objMo8603updateAvailableIncentiveshUnOzRk == coroutine_suspended ? coroutine_suspended : objMo8603updateAvailableIncentiveshUnOzRk;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object postConsumerSession(String str, String str2, Continuation<? super ConsumerSessionLookup> continuation) {
        C09981 c09981;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl;
        Object obj;
        if (continuation instanceof C09981) {
            c09981 = (C09981) continuation;
            if ((c09981.label & Integer.MIN_VALUE) != 0) {
                c09981.label -= Integer.MIN_VALUE;
            } else {
                c09981 = new C09981(continuation);
            }
        }
        Object obj2 = c09981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09981.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            FinancialConnectionsConsumersApiService financialConnectionsConsumersApiService = this.financialConnectionsConsumersApiService;
            String str3 = this.requestSurface;
            c09981.L$0 = this;
            c09981.label = 1;
            Object objPostConsumerSession = financialConnectionsConsumersApiService.postConsumerSession(str, str2, str3, c09981);
            if (objPostConsumerSession == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsConsumerSessionRepositoryImpl = this;
            obj = objPostConsumerSession;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsConsumerSessionRepositoryImpl = (FinancialConnectionsConsumerSessionRepositoryImpl) c09981.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsConsumerSessionRepositoryImpl.updateCachedConsumerSessionFromLookup((ConsumerSessionLookup) obj);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mobileLookupConsumerSession(String str, EmailSource emailSource, String str2, String str3, String str4, Continuation<? super ConsumerSessionLookup> continuation) {
        C09961 c09961;
        FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl;
        Object obj;
        if (continuation instanceof C09961) {
            c09961 = (C09961) continuation;
            if ((c09961.label & Integer.MIN_VALUE) != 0) {
                c09961.label -= Integer.MIN_VALUE;
            } else {
                c09961 = new C09961(continuation);
            }
        }
        C09961 c099612 = c09961;
        Object obj2 = c099612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c099612.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            ConsumersApiService consumersApiService = this.consumersApiService;
            String str5 = this.requestSurface;
            ApiRequest.Options optionsInvoke = this.provideApiRequestOptions.invoke(false);
            c099612.L$0 = this;
            c099612.label = 1;
            Object objMobileLookupConsumerSession = consumersApiService.mobileLookupConsumerSession(str, emailSource, str5, str2, str4, optionsInvoke, str3, null, c099612);
            if (objMobileLookupConsumerSession == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsConsumerSessionRepositoryImpl = this;
            obj = objMobileLookupConsumerSession;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsConsumerSessionRepositoryImpl = (FinancialConnectionsConsumerSessionRepositoryImpl) c099612.L$0;
            ResultKt.throwOnFailure(obj2);
            obj = obj2;
        }
        financialConnectionsConsumerSessionRepositoryImpl.updateCachedConsumerSessionFromLookup((ConsumerSessionLookup) obj);
        return obj;
    }

    private final void updateCachedConsumerSession(String source, ConsumerSession consumerSession) {
        this.logger.debug("SYNC_CACHE: updating local consumer session from " + source);
        this.consumerSessionRepository.updateConsumerSession(consumerSession);
    }

    private final void updateCachedConsumerSessionFromLookup(ConsumerSessionLookup lookup) {
        this.logger.debug("SYNC_CACHE: updating local consumer session from lookupConsumerSession");
        this.consumerSessionRepository.storeNewConsumerSession(lookup.getConsumerSession(), lookup.getPublishableKey());
    }

    private final void updateCachedConsumerSessionFromSignup(ConsumerSessionSignup signup) {
        this.logger.debug("SYNC_CACHE: updating local consumer session from signUp");
        this.consumerSessionRepository.storeNewConsumerSession(signup.getConsumerSession(), signup.getPublishableKey());
    }
}
