package io.qonversion.sandwich;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QonversionError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SandwichError.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lio/qonversion/sandwich/SandwichError;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "code", "", "description", "additionalMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalMessage", "()Ljava/lang/String;", "getCode", "getDescription", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SandwichError {
    private final String additionalMessage;
    private final String code;
    private final String description;

    public SandwichError(String code, String description, String additionalMessage) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(additionalMessage, "additionalMessage");
        this.code = code;
        this.description = description;
        this.additionalMessage = additionalMessage;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getAdditionalMessage() {
        return this.additionalMessage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SandwichError(QonversionError error) {
        this(error.getCode().toString(), error.getDescription(), error.getAdditionalMessage());
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
