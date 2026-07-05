package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QRemoteConfig;
import com.qonversion.android.sdk.dto.QRemoteConfigList;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QonversionMappingAdapters.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0003¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QRemoteConfigListAdapter;", "", "()V", "fromJson", "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "remoteConfigs", "", "Lcom/qonversion/android/sdk/dto/QRemoteConfig;", "toJson", "remoteConfigList", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QRemoteConfigListAdapter {
    @ToJson
    private final List<QRemoteConfig> toJson(QRemoteConfigList remoteConfigList) {
        List<QRemoteConfig> remoteConfigs;
        return (remoteConfigList == null || (remoteConfigs = remoteConfigList.getRemoteConfigs()) == null) ? CollectionsKt.emptyList() : remoteConfigs;
    }

    @FromJson
    public final QRemoteConfigList fromJson(List<QRemoteConfig> remoteConfigs) {
        Intrinsics.checkNotNullParameter(remoteConfigs, "remoteConfigs");
        if (remoteConfigs.isEmpty()) {
            return null;
        }
        return new QRemoteConfigList(remoteConfigs);
    }
}
