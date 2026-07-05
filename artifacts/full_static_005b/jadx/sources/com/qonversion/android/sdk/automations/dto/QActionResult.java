package com.qonversion.android.sdk.automations.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QonversionError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QActionResult.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/qonversion/android/sdk/automations/dto/QActionResult;", "", "type", "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "", "(Lcom/qonversion/android/sdk/automations/dto/QActionResultType;Ljava/util/Map;)V", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "getError", "()Lcom/qonversion/android/sdk/dto/QonversionError;", "setError", "(Lcom/qonversion/android/sdk/dto/QonversionError;)V", "getType", "()Lcom/qonversion/android/sdk/automations/dto/QActionResultType;", "getValue", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QActionResult {
    private QonversionError error;
    private final QActionResultType type;
    private final Map<String, String> value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QActionResult copy$default(QActionResult qActionResult, QActionResultType qActionResultType, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            qActionResultType = qActionResult.type;
        }
        if ((i & 2) != 0) {
            map = qActionResult.value;
        }
        return qActionResult.copy(qActionResultType, map);
    }

    /* renamed from: component1, reason: from getter */
    public final QActionResultType getType() {
        return this.type;
    }

    public final Map<String, String> component2() {
        return this.value;
    }

    public final QActionResult copy(QActionResultType type, Map<String, String> value) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new QActionResult(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QActionResult)) {
            return false;
        }
        QActionResult qActionResult = (QActionResult) other;
        return this.type == qActionResult.type && Intrinsics.areEqual(this.value, qActionResult.value);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Map<String, String> map = this.value;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "QActionResult(type=" + this.type + ", value=" + this.value + ")";
    }

    public QActionResult(QActionResultType type, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.value = map;
    }

    public /* synthetic */ QActionResult(QActionResultType qActionResultType, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qActionResultType, (i & 2) != 0 ? null : map);
    }

    public final QActionResultType getType() {
        return this.type;
    }

    public final Map<String, String> getValue() {
        return this.value;
    }

    public final QonversionError getError() {
        return this.error;
    }

    public final void setError(QonversionError qonversionError) {
        this.error = qonversionError;
    }
}
