package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.QAttributionProvider;
import com.qonversion.android.sdk.internal.provider.AppStateProvider;
import com.qonversion.android.sdk.internal.repository.QRepository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QAttributionManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/qonversion/android/sdk/internal/QAttributionManager;", "", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "appStateProvider", "Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/provider/AppStateProvider;)V", "pendingAttributionProvider", "Lcom/qonversion/android/sdk/dto/QAttributionProvider;", "pendingData", "", "", "attribution", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "provider", "onAppForeground", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QAttributionManager {
    private final AppStateProvider appStateProvider;
    private QAttributionProvider pendingAttributionProvider;
    private Map<String, ? extends Object> pendingData;
    private final QRepository repository;

    public QAttributionManager(QRepository repository, AppStateProvider appStateProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(appStateProvider, "appStateProvider");
        this.repository = repository;
        this.appStateProvider = appStateProvider;
    }

    public final void onAppForeground() {
        QAttributionProvider qAttributionProvider = this.pendingAttributionProvider;
        Map<String, ? extends Object> map = this.pendingData;
        if (qAttributionProvider == null || map == null || map.isEmpty()) {
            return;
        }
        QRepository.DefaultImpls.attribution$default(this.repository, map, qAttributionProvider.getId(), null, null, 12, null);
        this.pendingData = null;
        this.pendingAttributionProvider = null;
    }

    public final void attribution(Map<String, ? extends Object> data, QAttributionProvider provider) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (this.appStateProvider.getAppState().isBackground()) {
            this.pendingAttributionProvider = provider;
            this.pendingData = data;
        } else {
            QRepository.DefaultImpls.attribution$default(this.repository, data, provider.getId(), null, null, 12, null);
        }
    }
}
