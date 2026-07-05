package com.stripe.attestation;

import com.google.android.play.core.integrity.StandardIntegrityException;
import expo.modules.notifications.service.NotificationsService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttestationError.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0002\r\u000eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/attestation/AttestationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorType", "Lcom/stripe/attestation/AttestationError$ErrorType;", "message", "", "cause", "", "<init>", "(Lcom/stripe/attestation/AttestationError$ErrorType;Ljava/lang/String;Ljava/lang/Throwable;)V", "getErrorType", "()Lcom/stripe/attestation/AttestationError$ErrorType;", "ErrorType", "Companion", "stripe-attestation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AttestationError extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Integer, ErrorType> errorCodeToErrorTypeMap = MapsKt.mapOf(TuplesKt.to(-1, ErrorType.API_NOT_AVAILABLE), TuplesKt.to(-5, ErrorType.APP_NOT_INSTALLED), TuplesKt.to(-7, ErrorType.APP_UID_MISMATCH), TuplesKt.to(-9, ErrorType.CANNOT_BIND_TO_SERVICE), TuplesKt.to(-18, ErrorType.CLIENT_TRANSIENT_ERROR), TuplesKt.to(-16, ErrorType.CLOUD_PROJECT_NUMBER_IS_INVALID), TuplesKt.to(-12, ErrorType.GOOGLE_SERVER_UNAVAILABLE), TuplesKt.to(-19, ErrorType.INTEGRITY_TOKEN_PROVIDER_INVALID), TuplesKt.to(-100, ErrorType.INTERNAL_ERROR), TuplesKt.to(-3, ErrorType.NETWORK_ERROR), TuplesKt.to(0, ErrorType.NO_ERROR), TuplesKt.to(-6, ErrorType.PLAY_SERVICES_NOT_FOUND), TuplesKt.to(-15, ErrorType.PLAY_SERVICES_VERSION_OUTDATED), TuplesKt.to(-2, ErrorType.PLAY_STORE_NOT_FOUND), TuplesKt.to(-14, ErrorType.PLAY_STORE_VERSION_OUTDATED), TuplesKt.to(-17, ErrorType.REQUEST_HASH_TOO_LONG), TuplesKt.to(-8, ErrorType.TOO_MANY_REQUESTS));
    private final ErrorType errorType;

    public /* synthetic */ AttestationError(ErrorType errorType, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, str, (i & 4) != 0 ? null : th);
    }

    public final ErrorType getErrorType() {
        return this.errorType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttestationError(ErrorType errorType, String message, Throwable th) {
        super(message, th);
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(message, "message");
        this.errorType = errorType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttestationError.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/attestation/AttestationError$ErrorType;", "", "isRetriable", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "API_NOT_AVAILABLE", "APP_NOT_INSTALLED", "APP_UID_MISMATCH", "CANNOT_BIND_TO_SERVICE", "CLIENT_TRANSIENT_ERROR", "CLOUD_PROJECT_NUMBER_IS_INVALID", "GOOGLE_SERVER_UNAVAILABLE", "INTEGRITY_TOKEN_PROVIDER_INVALID", "INTERNAL_ERROR", "NO_ERROR", "NETWORK_ERROR", "PLAY_SERVICES_NOT_FOUND", "PLAY_SERVICES_VERSION_OUTDATED", "PLAY_STORE_NOT_FOUND", "PLAY_STORE_VERSION_OUTDATED", "REQUEST_HASH_TOO_LONG", "TOO_MANY_REQUESTS", "BACKEND_VERDICT_FAILED", "UNKNOWN", "stripe-attestation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;
        private final boolean isRetriable;
        public static final ErrorType API_NOT_AVAILABLE = new ErrorType("API_NOT_AVAILABLE", 0, false);
        public static final ErrorType APP_NOT_INSTALLED = new ErrorType("APP_NOT_INSTALLED", 1, false);
        public static final ErrorType APP_UID_MISMATCH = new ErrorType("APP_UID_MISMATCH", 2, false);
        public static final ErrorType CANNOT_BIND_TO_SERVICE = new ErrorType("CANNOT_BIND_TO_SERVICE", 3, true);
        public static final ErrorType CLIENT_TRANSIENT_ERROR = new ErrorType("CLIENT_TRANSIENT_ERROR", 4, true);
        public static final ErrorType CLOUD_PROJECT_NUMBER_IS_INVALID = new ErrorType("CLOUD_PROJECT_NUMBER_IS_INVALID", 5, false);
        public static final ErrorType GOOGLE_SERVER_UNAVAILABLE = new ErrorType("GOOGLE_SERVER_UNAVAILABLE", 6, true);
        public static final ErrorType INTEGRITY_TOKEN_PROVIDER_INVALID = new ErrorType("INTEGRITY_TOKEN_PROVIDER_INVALID", 7, false);
        public static final ErrorType INTERNAL_ERROR = new ErrorType("INTERNAL_ERROR", 8, true);
        public static final ErrorType NO_ERROR = new ErrorType("NO_ERROR", 9, false);
        public static final ErrorType NETWORK_ERROR = new ErrorType("NETWORK_ERROR", 10, true);
        public static final ErrorType PLAY_SERVICES_NOT_FOUND = new ErrorType("PLAY_SERVICES_NOT_FOUND", 11, false);
        public static final ErrorType PLAY_SERVICES_VERSION_OUTDATED = new ErrorType("PLAY_SERVICES_VERSION_OUTDATED", 12, false);
        public static final ErrorType PLAY_STORE_NOT_FOUND = new ErrorType("PLAY_STORE_NOT_FOUND", 13, true);
        public static final ErrorType PLAY_STORE_VERSION_OUTDATED = new ErrorType("PLAY_STORE_VERSION_OUTDATED", 14, false);
        public static final ErrorType REQUEST_HASH_TOO_LONG = new ErrorType("REQUEST_HASH_TOO_LONG", 15, false);
        public static final ErrorType TOO_MANY_REQUESTS = new ErrorType("TOO_MANY_REQUESTS", 16, true);
        public static final ErrorType BACKEND_VERDICT_FAILED = new ErrorType("BACKEND_VERDICT_FAILED", 17, false);
        public static final ErrorType UNKNOWN = new ErrorType("UNKNOWN", 18, false);

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{API_NOT_AVAILABLE, APP_NOT_INSTALLED, APP_UID_MISMATCH, CANNOT_BIND_TO_SERVICE, CLIENT_TRANSIENT_ERROR, CLOUD_PROJECT_NUMBER_IS_INVALID, GOOGLE_SERVER_UNAVAILABLE, INTEGRITY_TOKEN_PROVIDER_INVALID, INTERNAL_ERROR, NO_ERROR, NETWORK_ERROR, PLAY_SERVICES_NOT_FOUND, PLAY_SERVICES_VERSION_OUTDATED, PLAY_STORE_NOT_FOUND, PLAY_STORE_VERSION_OUTDATED, REQUEST_HASH_TOO_LONG, TOO_MANY_REQUESTS, BACKEND_VERDICT_FAILED, UNKNOWN};
        }

        public static EnumEntries<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i, boolean z) {
            this.isRetriable = z;
        }

        /* renamed from: isRetriable, reason: from getter */
        public final boolean getIsRetriable() {
            return this.isRetriable;
        }

        static {
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(errorTypeArr$values);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* compiled from: AttestationError.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/attestation/AttestationError$Companion;", "", "<init>", "()V", "fromException", "Lcom/stripe/attestation/AttestationError;", NotificationsService.EXCEPTION_KEY, "", "errorCodeToErrorTypeMap", "", "", "Lcom/stripe/attestation/AttestationError$ErrorType;", "stripe-attestation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AttestationError fromException(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            if (exception instanceof StandardIntegrityException) {
                ErrorType errorType = (ErrorType) AttestationError.errorCodeToErrorTypeMap.get(Integer.valueOf(((StandardIntegrityException) exception).getErrorCode()));
                if (errorType == null) {
                    errorType = ErrorType.UNKNOWN;
                }
                String message = exception.getMessage();
                if (message == null) {
                    message = "Integrity error occurred";
                }
                return new AttestationError(errorType, message, exception);
            }
            return new AttestationError(ErrorType.UNKNOWN, "An unknown error occurred", exception);
        }
    }
}
