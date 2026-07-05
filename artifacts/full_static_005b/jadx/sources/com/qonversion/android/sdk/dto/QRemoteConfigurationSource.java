package com.qonversion.android.sdk.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QRemoteConfigurationSource.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001aJ=\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSource;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "assignmentType", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;", "type", "Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;", "contextKeyApi", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;Ljava/lang/String;)V", "getAssignmentType", "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationAssignmentType;", "contextKey", "getContextKey", "()Ljava/lang/String;", "getContextKeyApi$sdk_release", "getId", "getName", "getType", "()Lcom/qonversion/android/sdk/dto/QRemoteConfigurationSourceType;", "component1", "component2", "component3", "component4", "component5", "component5$sdk_release", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QRemoteConfigurationSource {
    private final QRemoteConfigurationAssignmentType assignmentType;
    private final String contextKey;
    private final String contextKeyApi;
    private final String id;
    private final String name;
    private final QRemoteConfigurationSourceType type;

    public static /* synthetic */ QRemoteConfigurationSource copy$default(QRemoteConfigurationSource qRemoteConfigurationSource, String str, String str2, QRemoteConfigurationAssignmentType qRemoteConfigurationAssignmentType, QRemoteConfigurationSourceType qRemoteConfigurationSourceType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRemoteConfigurationSource.id;
        }
        if ((i & 2) != 0) {
            str2 = qRemoteConfigurationSource.name;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            qRemoteConfigurationAssignmentType = qRemoteConfigurationSource.assignmentType;
        }
        QRemoteConfigurationAssignmentType qRemoteConfigurationAssignmentType2 = qRemoteConfigurationAssignmentType;
        if ((i & 8) != 0) {
            qRemoteConfigurationSourceType = qRemoteConfigurationSource.type;
        }
        QRemoteConfigurationSourceType qRemoteConfigurationSourceType2 = qRemoteConfigurationSourceType;
        if ((i & 16) != 0) {
            str3 = qRemoteConfigurationSource.contextKeyApi;
        }
        return qRemoteConfigurationSource.copy(str, str4, qRemoteConfigurationAssignmentType2, qRemoteConfigurationSourceType2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final QRemoteConfigurationAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    /* renamed from: component4, reason: from getter */
    public final QRemoteConfigurationSourceType getType() {
        return this.type;
    }

    /* renamed from: component5$sdk_release, reason: from getter */
    public final String getContextKeyApi() {
        return this.contextKeyApi;
    }

    public final QRemoteConfigurationSource copy(@Json(name = "uid") String id, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "assignment_type") QRemoteConfigurationAssignmentType assignmentType, @Json(name = "type") QRemoteConfigurationSourceType type, @Json(name = "context_key") String contextKeyApi) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(assignmentType, "assignmentType");
        Intrinsics.checkNotNullParameter(type, "type");
        return new QRemoteConfigurationSource(id, name, assignmentType, type, contextKeyApi);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRemoteConfigurationSource)) {
            return false;
        }
        QRemoteConfigurationSource qRemoteConfigurationSource = (QRemoteConfigurationSource) other;
        return Intrinsics.areEqual(this.id, qRemoteConfigurationSource.id) && Intrinsics.areEqual(this.name, qRemoteConfigurationSource.name) && this.assignmentType == qRemoteConfigurationSource.assignmentType && this.type == qRemoteConfigurationSource.type && Intrinsics.areEqual(this.contextKeyApi, qRemoteConfigurationSource.contextKeyApi);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.assignmentType.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str = this.contextKeyApi;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "QRemoteConfigurationSource(id=" + this.id + ", name=" + this.name + ", assignmentType=" + this.assignmentType + ", type=" + this.type + ", contextKeyApi=" + this.contextKeyApi + ")";
    }

    public QRemoteConfigurationSource(@Json(name = "uid") String id, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "assignment_type") QRemoteConfigurationAssignmentType assignmentType, @Json(name = "type") QRemoteConfigurationSourceType type, @Json(name = "context_key") String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(assignmentType, "assignmentType");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.name = name;
        this.assignmentType = assignmentType;
        this.type = type;
        this.contextKeyApi = str;
        this.contextKey = (str == null || str.length() <= 0) ? null : str;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final QRemoteConfigurationAssignmentType getAssignmentType() {
        return this.assignmentType;
    }

    public final QRemoteConfigurationSourceType getType() {
        return this.type;
    }

    public final String getContextKeyApi$sdk_release() {
        return this.contextKeyApi;
    }

    public final String getContextKey() {
        return this.contextKey;
    }
}
