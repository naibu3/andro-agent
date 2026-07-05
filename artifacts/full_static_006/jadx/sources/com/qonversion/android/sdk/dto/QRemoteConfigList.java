package com.qonversion.android.sdk.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.JsonClass;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QRemoteConfigList.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "", "remoteConfigs", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "(Ljava/util/List;)V", "remoteConfigForEmptyContextKey", "getRemoteConfigForEmptyContextKey", "()Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "getRemoteConfigs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "remoteConfigForContextKey", "key", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QRemoteConfigList {
    private final QRemoteConfig remoteConfigForEmptyContextKey;
    private final List<QRemoteConfig> remoteConfigs;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QRemoteConfigList copy$default(QRemoteConfigList qRemoteConfigList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qRemoteConfigList.remoteConfigs;
        }
        return qRemoteConfigList.copy(list);
    }

    public final List<QRemoteConfig> component1() {
        return this.remoteConfigs;
    }

    public final QRemoteConfigList copy(List<QRemoteConfig> remoteConfigs) {
        Intrinsics.checkNotNullParameter(remoteConfigs, "remoteConfigs");
        return new QRemoteConfigList(remoteConfigs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QRemoteConfigList) && Intrinsics.areEqual(this.remoteConfigs, ((QRemoteConfigList) other).remoteConfigs);
    }

    public int hashCode() {
        return this.remoteConfigs.hashCode();
    }

    public String toString() {
        return "QRemoteConfigList(remoteConfigs=" + this.remoteConfigs + ")";
    }

    public QRemoteConfigList(List<QRemoteConfig> remoteConfigs) {
        Object next;
        Intrinsics.checkNotNullParameter(remoteConfigs, "remoteConfigs");
        this.remoteConfigs = remoteConfigs;
        Iterator<T> it = remoteConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((QRemoteConfig) next).getSource().getContextKey() == null) {
                    break;
                }
            }
        }
        this.remoteConfigForEmptyContextKey = (QRemoteConfig) next;
    }

    public final List<QRemoteConfig> getRemoteConfigs() {
        return this.remoteConfigs;
    }

    public final QRemoteConfig remoteConfigForContextKey(String key) {
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<T> it = this.remoteConfigs.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((QRemoteConfig) next).getSource().getContextKey(), key)) {
                break;
            }
        }
        return (QRemoteConfig) next;
    }

    public final QRemoteConfig getRemoteConfigForEmptyContextKey() {
        return this.remoteConfigForEmptyContextKey;
    }
}
