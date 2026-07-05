package com.qonversion.android.sdk.dto.experiments;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QExperiment.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/qonversion/android/sdk/dto/experiments/QExperiment;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "group", "Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;)V", "getGroup", "()Lcom/qonversion/android/sdk/dto/experiments/QExperimentGroup;", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QExperiment {
    private final QExperimentGroup group;
    private final String id;
    private final String name;

    public static /* synthetic */ QExperiment copy$default(QExperiment qExperiment, String str, String str2, QExperimentGroup qExperimentGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qExperiment.id;
        }
        if ((i & 2) != 0) {
            str2 = qExperiment.name;
        }
        if ((i & 4) != 0) {
            qExperimentGroup = qExperiment.group;
        }
        return qExperiment.copy(str, str2, qExperimentGroup);
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
    public final QExperimentGroup getGroup() {
        return this.group;
    }

    public final QExperiment copy(@Json(name = "uid") String id, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "group") QExperimentGroup group) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group, "group");
        return new QExperiment(id, name, group);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QExperiment)) {
            return false;
        }
        QExperiment qExperiment = (QExperiment) other;
        return Intrinsics.areEqual(this.id, qExperiment.id) && Intrinsics.areEqual(this.name, qExperiment.name) && Intrinsics.areEqual(this.group, qExperiment.group);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.group.hashCode();
    }

    public String toString() {
        return "QExperiment(id=" + this.id + ", name=" + this.name + ", group=" + this.group + ")";
    }

    public QExperiment(@Json(name = "uid") String id, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "group") QExperimentGroup group) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(group, "group");
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final QExperimentGroup getGroup() {
        return this.group;
    }
}
