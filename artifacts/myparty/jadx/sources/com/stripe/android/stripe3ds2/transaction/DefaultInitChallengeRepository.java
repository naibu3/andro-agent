package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.InitChallengeResult;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InitChallengeRepository.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BY\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultInitChallengeRepository;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "jwsValidator", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "acsDataParser", "Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "challengeRequestResultRepository", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;", "errorRequestExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor$Factory;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/Logger;)V", "startChallenge", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", CardScanActivity.ARGS, "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createCreqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultInitChallengeRepository implements InitChallengeRepository {
    private final AcsDataParser acsDataParser;
    private final ChallengeRequestResultRepository challengeRequestResultRepository;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor.Factory errorRequestExecutorFactory;
    private final JwsValidator jwsValidator;
    private final Logger logger;
    private final MessageTransformer messageTransformer;
    private final MessageVersionRegistry messageVersionRegistry;
    private final SdkTransactionId sdkTransactionId;
    private final StripeUiCustomization uiCustomization;

    /* compiled from: InitChallengeRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository", f = "InitChallengeRepository.kt", i = {0, 0, 0, 0, 0}, l = {68}, m = "startChallenge", n = {"this", CardScanActivity.ARGS, "$this$startChallenge_u24lambda_u240", "errorRequestExecutor", "creqExecutorConfig"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository$startChallenge$1, reason: invalid class name */
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
            return DefaultInitChallengeRepository.this.startChallenge(null, this);
        }
    }

    public DefaultInitChallengeRepository(SdkTransactionId sdkTransactionId, MessageVersionRegistry messageVersionRegistry, JwsValidator jwsValidator, MessageTransformer messageTransformer, AcsDataParser acsDataParser, ChallengeRequestResultRepository challengeRequestResultRepository, ErrorRequestExecutor.Factory errorRequestExecutorFactory, StripeUiCustomization uiCustomization, ErrorReporter errorReporter, Logger logger) {
        Intrinsics.checkNotNullParameter(sdkTransactionId, "sdkTransactionId");
        Intrinsics.checkNotNullParameter(messageVersionRegistry, "messageVersionRegistry");
        Intrinsics.checkNotNullParameter(jwsValidator, "jwsValidator");
        Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
        Intrinsics.checkNotNullParameter(acsDataParser, "acsDataParser");
        Intrinsics.checkNotNullParameter(challengeRequestResultRepository, "challengeRequestResultRepository");
        Intrinsics.checkNotNullParameter(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.sdkTransactionId = sdkTransactionId;
        this.messageVersionRegistry = messageVersionRegistry;
        this.jwsValidator = jwsValidator;
        this.messageTransformer = messageTransformer;
        this.acsDataParser = acsDataParser;
        this.challengeRequestResultRepository = challengeRequestResultRepository;
        this.errorRequestExecutorFactory = errorRequestExecutorFactory;
        this.uiCustomization = uiCustomization;
        this.errorReporter = errorReporter;
        this.logger = logger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da A[Catch: all -> 0x0184, TryCatch #1 {all -> 0x0184, blocks: (B:27:0x00d4, B:29:0x00da, B:42:0x0179, B:30:0x0106, B:32:0x010a, B:34:0x0119, B:35:0x0123, B:36:0x013c, B:38:0x0140, B:39:0x015d, B:41:0x0161, B:43:0x017e, B:44:0x0183), top: B:62:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106 A[Catch: all -> 0x0184, TryCatch #1 {all -> 0x0184, blocks: (B:27:0x00d4, B:29:0x00da, B:42:0x0179, B:30:0x0106, B:32:0x010a, B:34:0x0119, B:35:0x0123, B:36:0x013c, B:38:0x0140, B:39:0x015d, B:41:0x0161, B:43:0x017e, B:44:0x0183), top: B:62:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.stripe.android.stripe3ds2.transaction.InitChallengeArgs] */
    @Override // com.stripe.android.stripe3ds2.transaction.InitChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startChallenge(InitChallengeArgs initChallengeArgs, Continuation<? super InitChallengeResult> continuation) {
        AnonymousClass1 anonymousClass1;
        DefaultInitChallengeRepository defaultInitChallengeRepository;
        ErrorRequestExecutor errorRequestExecutor;
        ChallengeRequestExecutor.Config config;
        DefaultInitChallengeRepository defaultInitChallengeRepository2;
        Object objM9118constructorimpl;
        InitChallengeArgs initChallengeArgs2;
        Throwable thM9121exceptionOrNullimpl;
        ChallengeRequestResult challengeRequestResult;
        InitChallengeResult.End end;
        ?? r2 = "getEncoded(...)";
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
            this.logger.info("Make initial challenge request.");
            try {
                Result.Companion companion = Result.INSTANCE;
                DefaultInitChallengeRepository defaultInitChallengeRepository3 = this;
                AcsDataParser acsDataParser = this.acsDataParser;
                JwsValidator jwsValidator = this.jwsValidator;
                String acsSignedContent = initChallengeArgs.getChallengeParameters$3ds2sdk_release().getAcsSignedContent();
                try {
                    if (acsSignedContent != null) {
                        AcsData acsData = acsDataParser.parse(jwsValidator.getPayload(acsSignedContent));
                        String acsUrl = acsData.getAcsUrl();
                        ECPublicKey acsEphemPubKey = acsData.getAcsEphemPubKey();
                        ChallengeRequestData challengeRequestDataCreateCreqData = createCreqData(this.sdkTransactionId, initChallengeArgs.getChallengeParameters$3ds2sdk_release());
                        ErrorRequestExecutor errorRequestExecutorCreate = this.errorRequestExecutorFactory.create(acsUrl, this.errorReporter);
                        MessageTransformer messageTransformer = this.messageTransformer;
                        String sdkReferenceNumber$3ds2sdk_release = initChallengeArgs.getSdkReferenceNumber$3ds2sdk_release();
                        byte[] encoded = initChallengeArgs.getSdkKeyPair$3ds2sdk_release().getPrivate().getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
                        byte[] encoded2 = acsEphemPubKey.getEncoded();
                        Intrinsics.checkNotNullExpressionValue(encoded2, "getEncoded(...)");
                        ChallengeRequestExecutor.Config config2 = new ChallengeRequestExecutor.Config(messageTransformer, sdkReferenceNumber$3ds2sdk_release, challengeRequestDataCreateCreqData, acsUrl, new ChallengeRequestExecutor.Config.Keys(encoded, encoded2));
                        ChallengeRequestResultRepository challengeRequestResultRepository = this.challengeRequestResultRepository;
                        anonymousClass1.L$0 = this;
                        InitChallengeArgs initChallengeArgs3 = initChallengeArgs;
                        anonymousClass1.L$1 = initChallengeArgs3;
                        anonymousClass1.L$2 = this;
                        anonymousClass1.L$3 = errorRequestExecutorCreate;
                        anonymousClass1.L$4 = config2;
                        anonymousClass1.label = 1;
                        obj = challengeRequestResultRepository.get(config2, challengeRequestDataCreateCreqData, anonymousClass1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultInitChallengeRepository = this;
                        errorRequestExecutor = errorRequestExecutorCreate;
                        config = config2;
                        defaultInitChallengeRepository2 = defaultInitChallengeRepository;
                        r2 = initChallengeArgs3;
                        challengeRequestResult = (ChallengeRequestResult) obj;
                        if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
                        }
                        objM9118constructorimpl = Result.m9118constructorimpl(end);
                        initChallengeArgs2 = r2;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Throwable th) {
                    th = th;
                    defaultInitChallengeRepository = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    initChallengeArgs2 = r2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = initChallengeArgs;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChallengeRequestExecutor.Config config3 = (ChallengeRequestExecutor.Config) anonymousClass1.L$4;
            errorRequestExecutor = (ErrorRequestExecutor) anonymousClass1.L$3;
            defaultInitChallengeRepository2 = (DefaultInitChallengeRepository) anonymousClass1.L$2;
            InitChallengeArgs initChallengeArgs4 = (InitChallengeArgs) anonymousClass1.L$1;
            defaultInitChallengeRepository = (DefaultInitChallengeRepository) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                config = config3;
                r2 = initChallengeArgs4;
                try {
                    challengeRequestResult = (ChallengeRequestResult) obj;
                    if (!(challengeRequestResult instanceof ChallengeRequestResult.Success)) {
                        end = new InitChallengeResult.Start(new ChallengeViewArgs(((ChallengeRequestResult.Success) challengeRequestResult).getCresData(), ((ChallengeRequestResult.Success) challengeRequestResult).getCreqData(), defaultInitChallengeRepository2.uiCustomization, config, new StripeChallengeRequestExecutor.Factory(config), r2.getTimeoutMins$3ds2sdk_release(), r2.getIntentData$3ds2sdk_release()));
                    } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
                        if (((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData().getErrorComponent() == ErrorData.ErrorComponent.ThreeDsSdk) {
                            errorRequestExecutor.executeAsync(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData());
                        }
                        end = new InitChallengeResult.End(new ChallengeResult.ProtocolError(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData(), null, r2.getIntentData$3ds2sdk_release()));
                    } else if (challengeRequestResult instanceof ChallengeRequestResult.Timeout) {
                        errorRequestExecutor.executeAsync(((ChallengeRequestResult.Timeout) challengeRequestResult).getData());
                        end = new InitChallengeResult.End(new ChallengeResult.Timeout(null, null, r2.getIntentData$3ds2sdk_release()));
                    } else {
                        if (!(challengeRequestResult instanceof ChallengeRequestResult.RuntimeError)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        end = new InitChallengeResult.End(new ChallengeResult.RuntimeError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).getThrowable(), null, r2.getIntentData$3ds2sdk_release()));
                    }
                    objM9118constructorimpl = Result.m9118constructorimpl(end);
                    initChallengeArgs2 = r2;
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion22 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    initChallengeArgs2 = r2;
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r2 = initChallengeArgs4;
                Result.Companion companion222 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                initChallengeArgs2 = r2;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
            }
        }
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            return objM9118constructorimpl;
        }
        defaultInitChallengeRepository.errorReporter.reportError(thM9121exceptionOrNullimpl);
        defaultInitChallengeRepository.logger.error("Exception during initial challenge request.", thM9121exceptionOrNullimpl);
        return new InitChallengeResult.End(new ChallengeResult.RuntimeError(thM9121exceptionOrNullimpl, null, initChallengeArgs2.getIntentData$3ds2sdk_release()));
    }

    private final ChallengeRequestData createCreqData(SdkTransactionId sdkTransactionId, ChallengeParameters challengeParameters) {
        String acsTransactionId = challengeParameters.getAcsTransactionId();
        if (acsTransactionId == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        String threeDsServerTransactionId = challengeParameters.getThreeDsServerTransactionId();
        if (threeDsServerTransactionId != null) {
            return new ChallengeRequestData(this.messageVersionRegistry.getCurrent(), threeDsServerTransactionId, acsTransactionId, sdkTransactionId, challengeParameters.getThreeDSRequestorAppURL(), null, null, null, null, null, null, null, 4064, null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
