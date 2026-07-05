package com.stripe.android.stripe3ds2.transaction;

import com.facebook.soloader.Elf64;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.security.EcKeyFactory;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StripeChallengeRequestExecutor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002&'Be\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "sdkReferenceId", "", "sdkPrivateKey", "Ljava/security/PrivateKey;", "acsPublicKey", "Ljava/security/interfaces/ECPublicKey;", "acsUrl", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "dhKeyGenerator", "Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "httpClient", "Lcom/stripe/android/stripe3ds2/transaction/HttpClient;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "responseProcessorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljava/lang/String;Ljava/security/PrivateKey;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/security/DiffieHellmanKeyGenerator;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/HttpClient;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessorFactory;)V", "secretKey", "Ljavax/crypto/SecretKey;", "responseProcessor", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "execute", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRequestBody", "payload", "Lorg/json/JSONObject;", "generateSecretKey", "Factory", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeChallengeRequestExecutor implements ChallengeRequestExecutor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long TIMEOUT = TimeUnit.SECONDS.toMillis(10);
    private final ECPublicKey acsPublicKey;
    private final ChallengeRequestExecutor.Config creqExecutorConfig;
    private final DiffieHellmanKeyGenerator dhKeyGenerator;
    private final ErrorReporter errorReporter;
    private final HttpClient httpClient;
    private final MessageTransformer messageTransformer;
    private final ChallengeResponseProcessor responseProcessor;
    private final PrivateKey sdkPrivateKey;
    private final String sdkReferenceId;
    private final SecretKey secretKey;
    private final CoroutineContext workContext;

    /* compiled from: StripeChallengeRequestExecutor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor", f = "StripeChallengeRequestExecutor.kt", i = {0}, l = {60}, m = "execute", n = {"creqData"}, s = {"L$0"})
    /* renamed from: com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1, reason: invalid class name */
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
            return StripeChallengeRequestExecutor.this.execute(null, this);
        }
    }

    public StripeChallengeRequestExecutor(MessageTransformer messageTransformer, String sdkReferenceId, PrivateKey sdkPrivateKey, ECPublicKey acsPublicKey, String acsUrl, ErrorReporter errorReporter, DiffieHellmanKeyGenerator dhKeyGenerator, CoroutineContext workContext, HttpClient httpClient, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeResponseProcessorFactory responseProcessorFactory) {
        Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
        Intrinsics.checkNotNullParameter(sdkReferenceId, "sdkReferenceId");
        Intrinsics.checkNotNullParameter(sdkPrivateKey, "sdkPrivateKey");
        Intrinsics.checkNotNullParameter(acsPublicKey, "acsPublicKey");
        Intrinsics.checkNotNullParameter(acsUrl, "acsUrl");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(dhKeyGenerator, "dhKeyGenerator");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
        Intrinsics.checkNotNullParameter(responseProcessorFactory, "responseProcessorFactory");
        this.messageTransformer = messageTransformer;
        this.sdkReferenceId = sdkReferenceId;
        this.sdkPrivateKey = sdkPrivateKey;
        this.acsPublicKey = acsPublicKey;
        this.errorReporter = errorReporter;
        this.dhKeyGenerator = dhKeyGenerator;
        this.workContext = workContext;
        this.httpClient = httpClient;
        this.creqExecutorConfig = creqExecutorConfig;
        SecretKey secretKeyGenerateSecretKey = generateSecretKey();
        this.secretKey = secretKeyGenerateSecretKey;
        this.responseProcessor = responseProcessorFactory.create(secretKeyGenerateSecretKey);
    }

    public /* synthetic */ StripeChallengeRequestExecutor(MessageTransformer messageTransformer, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, ErrorReporter errorReporter, DiffieHellmanKeyGenerator diffieHellmanKeyGenerator, CoroutineContext coroutineContext, HttpClient httpClient, ChallengeRequestExecutor.Config config, ChallengeResponseProcessorFactory challengeResponseProcessorFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        HttpClient stripeHttpClient;
        MessageTransformer messageTransformer2;
        ErrorReporter errorReporter2;
        ChallengeRequestExecutor.Config config2;
        ChallengeResponseProcessorFactory challengeResponseProcessorFactory2;
        if ((i & 256) != 0) {
            stripeHttpClient = new StripeHttpClient(str2, null, errorReporter, coroutineContext, 2, null);
        } else {
            stripeHttpClient = httpClient;
        }
        if ((i & 1024) != 0) {
            messageTransformer2 = messageTransformer;
            challengeResponseProcessorFactory2 = new ChallengeResponseProcessorFactory.Default(messageTransformer2, errorReporter, config);
            config2 = config;
            errorReporter2 = errorReporter;
        } else {
            messageTransformer2 = messageTransformer;
            errorReporter2 = errorReporter;
            config2 = config;
            challengeResponseProcessorFactory2 = challengeResponseProcessorFactory;
        }
        this(messageTransformer2, str, privateKey, eCPublicKey, str2, errorReporter2, diffieHellmanKeyGenerator, coroutineContext, stripeHttpClient, config2, challengeResponseProcessorFactory2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objWithTimeoutOrNull = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            long j = TIMEOUT;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(challengeRequestData, null);
            anonymousClass1.L$0 = challengeRequestData;
            anonymousClass1.label = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, anonymousClass2, anonymousClass1);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            challengeRequestData = (ChallengeRequestData) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        ChallengeRequestResult challengeRequestResult = (ChallengeRequestResult) objWithTimeoutOrNull;
        return challengeRequestResult == null ? INSTANCE.createTimeoutResult(challengeRequestData) : challengeRequestResult;
    }

    /* compiled from: StripeChallengeRequestExecutor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2", f = "StripeChallengeRequestExecutor.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX, 70}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChallengeRequestResult>, Object> {
        final /* synthetic */ ChallengeRequestData $creqData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ChallengeRequestData challengeRequestData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$creqData = challengeRequestData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = StripeChallengeRequestExecutor.this.new AnonymousClass2(this.$creqData, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChallengeRequestResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r6 == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StripeChallengeRequestExecutor stripeChallengeRequestExecutor = StripeChallengeRequestExecutor.this;
                ChallengeRequestData challengeRequestData = this.$creqData;
                Result.Companion companion2 = Result.INSTANCE;
                HttpClient httpClient = stripeChallengeRequestExecutor.httpClient;
                String requestBody = stripeChallengeRequestExecutor.getRequestBody(challengeRequestData.toJson$3ds2sdk_release());
                this.label = 1;
                obj = httpClient.doPostRequest(requestBody, JOSEObject.MIME_TYPE_COMPACT, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return (ChallengeRequestResult) obj;
                }
                ResultKt.throwOnFailure(obj);
            }
            objM9118constructorimpl = Result.m9118constructorimpl((HttpResponse) obj);
            StripeChallengeRequestExecutor stripeChallengeRequestExecutor2 = StripeChallengeRequestExecutor.this;
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                stripeChallengeRequestExecutor2.errorReporter.reportError(thM9121exceptionOrNullimpl);
            }
            StripeChallengeRequestExecutor stripeChallengeRequestExecutor3 = StripeChallengeRequestExecutor.this;
            ChallengeRequestData challengeRequestData2 = this.$creqData;
            Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl2 == null) {
                ChallengeResponseProcessor challengeResponseProcessor = stripeChallengeRequestExecutor3.responseProcessor;
                this.label = 2;
                obj = challengeResponseProcessor.process(challengeRequestData2, (HttpResponse) objM9118constructorimpl, this);
            } else {
                if (!(thM9121exceptionOrNullimpl2 instanceof TimeoutCancellationException)) {
                    return new ChallengeRequestResult.RuntimeError(thM9121exceptionOrNullimpl2);
                }
                return StripeChallengeRequestExecutor.INSTANCE.createTimeoutResult(challengeRequestData2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRequestBody(JSONObject payload) throws JSONException, JOSEException {
        return this.messageTransformer.encrypt(payload, this.secretKey);
    }

    private final SecretKey generateSecretKey() {
        DiffieHellmanKeyGenerator diffieHellmanKeyGenerator = this.dhKeyGenerator;
        ECPublicKey eCPublicKey = this.acsPublicKey;
        PrivateKey privateKey = this.sdkPrivateKey;
        Intrinsics.checkNotNull(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        return diffieHellmanKeyGenerator.generate(eCPublicKey, (ECPrivateKey) privateKey, this.sdkReferenceId);
    }

    /* compiled from: StripeChallengeRequestExecutor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "config", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V", "create", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ChallengeRequestExecutor.Factory {
        private final ChallengeRequestExecutor.Config config;

        public Factory(ChallengeRequestExecutor.Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor.Factory
        public ChallengeRequestExecutor create(ErrorReporter errorReporter, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            EcKeyFactory ecKeyFactory = new EcKeyFactory(errorReporter);
            return new StripeChallengeRequestExecutor(this.config.getMessageTransformer$3ds2sdk_release(), this.config.getSdkReferenceId$3ds2sdk_release(), ecKeyFactory.createPrivate(this.config.getKeys$3ds2sdk_release().getSdkPrivateKeyEncoded$3ds2sdk_release()), ecKeyFactory.createPublic(this.config.getKeys$3ds2sdk_release().getAcsPublicKeyEncoded$3ds2sdk_release()), this.config.getAcsUrl$3ds2sdk_release(), errorReporter, new StripeDiffieHellmanKeyGenerator(errorReporter), workContext, null, this.config, null, 1280, null);
        }
    }

    /* compiled from: StripeChallengeRequestExecutor.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Companion;", "", "<init>", "()V", "TIMEOUT", "", "getTIMEOUT", "()J", "createTimeoutResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final long getTIMEOUT() {
            return StripeChallengeRequestExecutor.TIMEOUT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ChallengeRequestResult.Timeout createTimeoutResult(ChallengeRequestData creqData) {
            SdkTransactionId sdkTransId = creqData.getSdkTransId();
            String messageVersion = creqData.getMessageVersion();
            String acsTransId = creqData.getAcsTransId();
            return new ChallengeRequestResult.Timeout(new ErrorData(creqData.getThreeDsServerTransId(), acsTransId, null, String.valueOf(ProtocolError.TransactionTimedout.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, ProtocolError.TransactionTimedout.getDescription(), "Challenge request timed-out", ChallengeRequestData.MESSAGE_TYPE, messageVersion, sdkTransId, 4, null));
        }
    }
}
