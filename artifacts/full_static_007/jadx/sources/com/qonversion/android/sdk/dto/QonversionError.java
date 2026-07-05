package com.qonversion.android.sdk.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionError.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\b\u0010\u001c\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/dto/QonversionError;", "", "code", "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "additionalMessage", "", "httpCode", "", "(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;)V", "getAdditionalMessage", "()Ljava/lang/String;", "getCode", "()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;", "description", "getDescription", "getHttpCode$sdk_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component3$sdk_release", "copy", "(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;)Lcom/qonversion/android/sdk/dto/QonversionError;", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QonversionError {
    private final String additionalMessage;
    private final QonversionErrorCode code;
    private final String description;
    private final Integer httpCode;

    public static /* synthetic */ QonversionError copy$default(QonversionError qonversionError, QonversionErrorCode qonversionErrorCode, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            qonversionErrorCode = qonversionError.code;
        }
        if ((i & 2) != 0) {
            str = qonversionError.additionalMessage;
        }
        if ((i & 4) != 0) {
            num = qonversionError.httpCode;
        }
        return qonversionError.copy(qonversionErrorCode, str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final QonversionErrorCode getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdditionalMessage() {
        return this.additionalMessage;
    }

    /* renamed from: component3$sdk_release, reason: from getter */
    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public final QonversionError copy(QonversionErrorCode code, String additionalMessage, Integer httpCode) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(additionalMessage, "additionalMessage");
        return new QonversionError(code, additionalMessage, httpCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QonversionError)) {
            return false;
        }
        QonversionError qonversionError = (QonversionError) other;
        return this.code == qonversionError.code && Intrinsics.areEqual(this.additionalMessage, qonversionError.additionalMessage) && Intrinsics.areEqual(this.httpCode, qonversionError.httpCode);
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.additionalMessage.hashCode()) * 31;
        Integer num = this.httpCode;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public QonversionError(QonversionErrorCode code, String additionalMessage, Integer num) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(additionalMessage, "additionalMessage");
        this.code = code;
        this.additionalMessage = additionalMessage;
        this.httpCode = num;
        this.description = code.getSpecification();
    }

    public final QonversionErrorCode getCode() {
        return this.code;
    }

    public /* synthetic */ QonversionError(QonversionErrorCode qonversionErrorCode, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qonversionErrorCode, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num);
    }

    public final String getAdditionalMessage() {
        return this.additionalMessage;
    }

    public final Integer getHttpCode$sdk_release() {
        return this.httpCode;
    }

    public final String getDescription() {
        return this.description;
    }

    public String toString() {
        return "QonversionError: {code=" + this.code + ", description=" + this.description + ", additionalMessage=" + this.additionalMessage + "}";
    }
}
