package com.qonversion.android.sdk.internal.services;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.listeners.QonversionExperimentAttachCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigListCallback;
import com.qonversion.android.sdk.listeners.QonversionRemoteConfigurationAttachCallback;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QRemoteConfigService.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000eJ\u0018\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0015J$\u0010\u0014\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/internal/services/QRemoteConfigService;", "", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;)V", "attachUserToExperiment", "", "experimentId", "", "groupId", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionExperimentAttachCallback;", "attachUserToRemoteConfiguration", "remoteConfigurationId", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;", "detachUserFromExperiment", "detachUserFromRemoteConfiguration", "loadRemoteConfig", "contextKey", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigCallback;", "loadRemoteConfigs", "Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigListCallback;", "contextKeys", "", "includeEmptyContextKey", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QRemoteConfigService {
    private final QRepository repository;

    @Inject
    public QRemoteConfigService(QRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final void loadRemoteConfig(String contextKey, QonversionRemoteConfigCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.remoteConfig(contextKey, callback);
    }

    public final void loadRemoteConfigs(QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.remoteConfigList(callback);
    }

    public final void loadRemoteConfigs(List<String> contextKeys, boolean includeEmptyContextKey, QonversionRemoteConfigListCallback callback) {
        Intrinsics.checkNotNullParameter(contextKeys, "contextKeys");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.remoteConfigList(contextKeys, includeEmptyContextKey, callback);
    }

    public final void attachUserToExperiment(String experimentId, String groupId, QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.attachUserToExperiment(experimentId, groupId, callback);
    }

    public final void detachUserFromExperiment(String experimentId, QonversionExperimentAttachCallback callback) {
        Intrinsics.checkNotNullParameter(experimentId, "experimentId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.detachUserFromExperiment(experimentId, callback);
    }

    public final void attachUserToRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.attachUserToRemoteConfiguration(remoteConfigurationId, callback);
    }

    public final void detachUserFromRemoteConfiguration(String remoteConfigurationId, QonversionRemoteConfigurationAttachCallback callback) {
        Intrinsics.checkNotNullParameter(remoteConfigurationId, "remoteConfigurationId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.detachUserFromRemoteConfiguration(remoteConfigurationId, callback);
    }
}
