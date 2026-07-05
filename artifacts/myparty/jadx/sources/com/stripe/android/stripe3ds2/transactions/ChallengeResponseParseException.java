package com.stripe.android.stripe3ds2.transactions;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeResponseParseException.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0012B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "description", "", "detail", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "protocolError", "Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;", "(Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;Ljava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "getDetail", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeResponseParseException extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int code;
    private final String description;
    private final String detail;

    @JvmStatic
    public static final ChallengeResponseParseException createInvalidDataElementFormat(String str) {
        return INSTANCE.createInvalidDataElementFormat(str);
    }

    @JvmStatic
    public static final ChallengeResponseParseException createRequiredDataElementMissing(String str) {
        return INSTANCE.createRequiredDataElementMissing(str);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetail() {
        return this.detail;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(int i, String description, String detail) {
        super(i + " - " + description + " (" + detail + ")");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.code = i;
        this.description = description;
        this.detail = detail;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(ProtocolError protocolError, String detail) {
        this(protocolError.getCode(), protocolError.getDescription(), detail);
        Intrinsics.checkNotNullParameter(protocolError, "protocolError");
        Intrinsics.checkNotNullParameter(detail, "detail");
    }

    /* compiled from: ChallengeResponseParseException.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;", "", "<init>", "()V", "createRequiredDataElementMissing", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "fieldName", "", "createInvalidDataElementFormat", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ChallengeResponseParseException createRequiredDataElementMissing(String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.RequiredDataElementMissing.getCode(), "A message element required as defined in Table A.1 is missing from the message.", fieldName);
        }

        @JvmStatic
        public final ChallengeResponseParseException createInvalidDataElementFormat(String fieldName) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.InvalidDataElementFormat.getCode(), "Data element not in the required format or value is invalid as defined in Table A.1", fieldName);
        }
    }
}
