package com.qonversion.android.sdk.automations.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.automations.Automations;
import com.qonversion.android.sdk.automations.AutomationsDelegate;
import com.qonversion.android.sdk.automations.ScreenCustomizationDelegate;
import com.qonversion.android.sdk.internal.di.QDependencyInjector;
import com.qonversion.android.sdk.listeners.QonversionShowScreenCallback;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutomationsInternal.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0017J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/AutomationsInternal;", "Lcom/qonversion/android/sdk/automations/Automations;", "()V", "automationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "getNotificationCustomPayload", "", "", "", "messageData", "handleNotification", "", "setDelegate", "", "delegate", "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;", "setNotificationsToken", "token", "setScreenCustomizationDelegate", "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;", "showScreen", "withID", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AutomationsInternal implements Automations {
    private final QAutomationsManager automationsManager = QDependencyInjector.INSTANCE.getAppComponent$sdk_release().automationsManager();

    @Override // com.qonversion.android.sdk.automations.Automations
    @Deprecated(message = "Consider removing this method as it isn't needed anymore")
    public void setNotificationsToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    public void setDelegate(AutomationsDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.automationsManager.setAutomationsDelegate(new WeakReference<>(delegate));
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    public void setScreenCustomizationDelegate(ScreenCustomizationDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.automationsManager.setScreenCustomizationDelegate(new WeakReference<>(delegate));
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    public void showScreen(String withID, QonversionShowScreenCallback callback) {
        Intrinsics.checkNotNullParameter(withID, "withID");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.automationsManager.loadScreen(withID, callback);
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    @Deprecated(message = "Consider removing this method. Qonversion is not working with push notifications anymore")
    public boolean handleNotification(Map<String, String> messageData) {
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        return this.automationsManager.handlePushIfPossible(messageData);
    }

    @Override // com.qonversion.android.sdk.automations.Automations
    public Map<String, Object> getNotificationCustomPayload(Map<String, String> messageData) {
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        return this.automationsManager.getNotificationCustomPayload(messageData);
    }
}
