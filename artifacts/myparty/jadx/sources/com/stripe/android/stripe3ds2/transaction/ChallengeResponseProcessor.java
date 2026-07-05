package com.stripe.android.stripe3ds2.transaction;

import androidx.webkit.Profile;
import com.nimbusds.jose.JOSEException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.text.ParseException;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChallengeResponseProcessor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "", "process", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "response", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Profile.DEFAULT_PROFILE_NAME, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChallengeResponseProcessor {
    Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, Continuation<? super ChallengeRequestResult> continuation);

    /* compiled from: ChallengeResponseProcessor.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResponseProcessor;", "messageTransformer", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "secretKey", "Ljavax/crypto/SecretKey;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "<init>", "(Lcom/stripe/android/stripe3ds2/security/MessageTransformer;Ljavax/crypto/SecretKey;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V", "process", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "response", "Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transaction/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processPayload", "payload", "Lorg/json/JSONObject;", "isValidChallengeResponse", "", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "isMessageVersionCorrect", "getResponsePayload", "responseBody", "", "createErrorData", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "code", "", "description", "detail", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Default implements ChallengeResponseProcessor {
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;
        private final SecretKey secretKey;

        public Default(MessageTransformer messageTransformer, SecretKey secretKey, ErrorReporter errorReporter, ChallengeRequestExecutor.Config creqExecutorConfig) {
            Intrinsics.checkNotNullParameter(messageTransformer, "messageTransformer");
            Intrinsics.checkNotNullParameter(secretKey, "secretKey");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.secretKey = secretKey;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessor
        public Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, Continuation<? super ChallengeRequestResult> continuation) {
            Object objM9118constructorimpl;
            ChallengeRequestResult.RuntimeError runtimeError;
            if (httpResponse.getIsJsonContentType()) {
                JSONObject jSONObject = new JSONObject(httpResponse.getContent());
                if (ErrorData.INSTANCE.isErrorMessage$3ds2sdk_release(jSONObject)) {
                    runtimeError = new ChallengeRequestResult.ProtocolError(ErrorData.INSTANCE.fromJson$3ds2sdk_release(jSONObject));
                } else {
                    runtimeError = new ChallengeRequestResult.RuntimeError(new IllegalArgumentException("Received a JSON response that was not an Error message."));
                }
                return runtimeError;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Default r8 = this;
                objM9118constructorimpl = Result.m9118constructorimpl(getResponsePayload(httpResponse.getContent()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                this.errorReporter.reportError(new RuntimeException(StringsKt.trimIndent("\n                            Failed to process challenge response.\n\n                            CReq = " + challengeRequestData.sanitize$3ds2sdk_release() + "\n                            "), thM9121exceptionOrNullimpl));
            }
            Throwable thM9121exceptionOrNullimpl2 = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl2 == null) {
                return processPayload(challengeRequestData, (JSONObject) objM9118constructorimpl);
            }
            ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
            int code = protocolError.getCode();
            String description = protocolError.getDescription();
            String message = thM9121exceptionOrNullimpl2.getMessage();
            if (message == null) {
                message = "";
            }
            return new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, code, description, message));
        }

        public final ChallengeRequestResult processPayload(ChallengeRequestData creqData, JSONObject payload) {
            Object objM9118constructorimpl;
            ChallengeRequestResult.RuntimeError runtimeError;
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (ErrorData.INSTANCE.isErrorMessage$3ds2sdk_release(payload)) {
                return new ChallengeRequestResult.ProtocolError(ErrorData.INSTANCE.fromJson$3ds2sdk_release(payload));
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Default r0 = this;
                objM9118constructorimpl = Result.m9118constructorimpl(ChallengeResponseData.INSTANCE.fromJson$3ds2sdk_release(payload));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
                ChallengeResponseData challengeResponseData = (ChallengeResponseData) objM9118constructorimpl;
                if (!isValidChallengeResponse(creqData, challengeResponseData)) {
                    ProtocolError protocolError = ProtocolError.InvalidTransactionId;
                    return new ChallengeRequestResult.ProtocolError(createErrorData(creqData, protocolError.getCode(), protocolError.getDescription(), "The Transaction ID received was invalid."));
                }
                if (!isMessageVersionCorrect(creqData, challengeResponseData)) {
                    return new ChallengeRequestResult.ProtocolError(createErrorData(creqData, ProtocolError.UnsupportedMessageVersion.getCode(), ProtocolError.UnsupportedMessageVersion.getDescription(), creqData.getMessageVersion()));
                }
                return new ChallengeRequestResult.Success(creqData, challengeResponseData, this.creqExecutorConfig);
            }
            if (thM9121exceptionOrNullimpl instanceof ChallengeResponseParseException) {
                ChallengeResponseParseException challengeResponseParseException = (ChallengeResponseParseException) thM9121exceptionOrNullimpl;
                runtimeError = new ChallengeRequestResult.ProtocolError(createErrorData(creqData, challengeResponseParseException.getCode(), challengeResponseParseException.getDescription(), challengeResponseParseException.getDetail()));
            } else {
                runtimeError = new ChallengeRequestResult.RuntimeError(thM9121exceptionOrNullimpl);
            }
            return runtimeError;
        }

        private final boolean isValidChallengeResponse(ChallengeRequestData creqData, ChallengeResponseData cresData) {
            return Intrinsics.areEqual(creqData.getSdkTransId(), cresData.getSdkTransId()) && Intrinsics.areEqual(creqData.getThreeDsServerTransId(), cresData.getServerTransId()) && Intrinsics.areEqual(creqData.getAcsTransId(), cresData.getAcsTransId());
        }

        private final boolean isMessageVersionCorrect(ChallengeRequestData creqData, ChallengeResponseData cresData) {
            return Intrinsics.areEqual(creqData.getMessageVersion(), cresData.getMessageVersion());
        }

        private final JSONObject getResponsePayload(String responseBody) throws JSONException, ChallengeResponseParseException, JOSEException, ParseException {
            return this.messageTransformer.decrypt(responseBody, this.secretKey);
        }

        private final ErrorData createErrorData(ChallengeRequestData creqData, int code, String description, String detail) {
            String strValueOf = String.valueOf(code);
            ErrorData.ErrorComponent errorComponent = ErrorData.ErrorComponent.ThreeDsSdk;
            return new ErrorData(creqData.getThreeDsServerTransId(), creqData.getAcsTransId(), null, strValueOf, errorComponent, description, detail, ChallengeResponseData.MESSAGE_TYPE, creqData.getMessageVersion(), creqData.getSdkTransId(), 4, null);
        }
    }
}
