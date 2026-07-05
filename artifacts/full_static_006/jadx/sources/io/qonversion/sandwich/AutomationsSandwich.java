package io.qonversion.sandwich;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.automations.Automations;
import com.qonversion.android.sdk.automations.AutomationsDelegate;
import com.qonversion.android.sdk.automations.ScreenCustomizationDelegate;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationConfig;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.listeners.QonversionShowScreenCallback;
import io.qonversion.sandwich.AutomationsEventListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutomationsSandwich.kt */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J,\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\u001c\u0010\u0015\u001a\u00020\b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eJ(\u0010\u001a\u001a\u00020\u00172\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lio/qonversion/sandwich/AutomationsSandwich;", "", "()V", "automationsDelegate", "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;", "defaultPresentationConfig", "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;", "isCustomizationDelegateSet", "", "screenCustomizationDelegate", "io/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1", "Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;", "screenPresentationConfigs", "", "", "createAutomationsDelegate", "eventListener", "Lio/qonversion/sandwich/AutomationsEventListener;", "getNotificationCustomPayload", "", "notificationData", "handleNotification", "setDelegate", "", "setNotificationToken", "token", "setScreenPresentationConfig", "configData", ScreenActivity.INTENT_SCREEN_ID, "showScreen", "resultListener", "Lio/qonversion/sandwich/ResultListener;", "sandwich_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AutomationsSandwich {
    private AutomationsDelegate automationsDelegate;
    private QScreenPresentationConfig defaultPresentationConfig;
    private boolean isCustomizationDelegateSet;
    private final Map<String, QScreenPresentationConfig> screenPresentationConfigs = new LinkedHashMap();
    private final AutomationsSandwich$screenCustomizationDelegate$1 screenCustomizationDelegate = new ScreenCustomizationDelegate() { // from class: io.qonversion.sandwich.AutomationsSandwich$screenCustomizationDelegate$1
        @Override // com.qonversion.android.sdk.automations.ScreenCustomizationDelegate
        public QScreenPresentationConfig getPresentationConfigurationForScreen(String screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            QScreenPresentationConfig qScreenPresentationConfig = (QScreenPresentationConfig) this.this$0.screenPresentationConfigs.get(screenId);
            if (qScreenPresentationConfig != null) {
                return qScreenPresentationConfig;
            }
            QScreenPresentationConfig qScreenPresentationConfig2 = this.this$0.defaultPresentationConfig;
            return qScreenPresentationConfig2 == null ? new QScreenPresentationConfig(null, 1, null) : qScreenPresentationConfig2;
        }
    };

    public final void setDelegate(AutomationsEventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.automationsDelegate = createAutomationsDelegate(eventListener);
        Automations sharedInstance = Automations.INSTANCE.getSharedInstance();
        AutomationsDelegate automationsDelegate = this.automationsDelegate;
        if (automationsDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("automationsDelegate");
            automationsDelegate = null;
        }
        sharedInstance.setDelegate(automationsDelegate);
    }

    public static /* synthetic */ void setScreenPresentationConfig$default(AutomationsSandwich automationsSandwich, Map map, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        automationsSandwich.setScreenPresentationConfig(map, str);
    }

    public final void setScreenPresentationConfig(Map<String, ? extends Object> configData, String screenId) {
        Unit unit;
        Intrinsics.checkNotNullParameter(configData, "configData");
        QScreenPresentationConfig screenPresentationConfig = MappersKt.toScreenPresentationConfig(configData);
        if (!this.isCustomizationDelegateSet) {
            this.isCustomizationDelegateSet = true;
            Automations.INSTANCE.getSharedInstance().setScreenCustomizationDelegate(this.screenCustomizationDelegate);
        }
        if (screenId != null) {
            this.screenPresentationConfigs.put(screenId, screenPresentationConfig);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.screenPresentationConfigs.clear();
            this.defaultPresentationConfig = screenPresentationConfig;
        }
    }

    public final Map<String, Object> getNotificationCustomPayload(Map<String, ? extends Object> notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        return Automations.INSTANCE.getSharedInstance().getNotificationCustomPayload(MappersKt.toStringMap(notificationData));
    }

    public final void setNotificationToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Automations.INSTANCE.getSharedInstance().setNotificationsToken(token);
    }

    public final boolean handleNotification(Map<String, ? extends Object> notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        return Automations.INSTANCE.getSharedInstance().handleNotification(MappersKt.toStringMap(notificationData));
    }

    public final void showScreen(String screenId, final ResultListener resultListener) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        Automations.INSTANCE.getSharedInstance().showScreen(screenId, new QonversionShowScreenCallback() { // from class: io.qonversion.sandwich.AutomationsSandwich.showScreen.1
            @Override // com.qonversion.android.sdk.listeners.QonversionShowScreenCallback
            public void onSuccess() {
                resultListener.onSuccess(MapsKt.emptyMap());
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionShowScreenCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                resultListener.onError(MappersKt.toSandwichError(error));
            }
        });
    }

    private final AutomationsDelegate createAutomationsDelegate(final AutomationsEventListener eventListener) {
        return new AutomationsDelegate() { // from class: io.qonversion.sandwich.AutomationsSandwich.createAutomationsDelegate.1
            @Override // com.qonversion.android.sdk.automations.AutomationsDelegate
            public void automationsDidShowScreen(String screenId) {
                Intrinsics.checkNotNullParameter(screenId, "screenId");
                eventListener.onAutomationEvent(AutomationsEventListener.Event.ScreenShown, MapsKt.mapOf(TuplesKt.to(ScreenActivity.INTENT_SCREEN_ID, screenId)));
            }

            @Override // com.qonversion.android.sdk.automations.AutomationsDelegate
            public void automationsDidStartExecuting(QActionResult actionResult) {
                Intrinsics.checkNotNullParameter(actionResult, "actionResult");
                eventListener.onAutomationEvent(AutomationsEventListener.Event.ActionStarted, MappersKt.toMap(actionResult));
            }

            @Override // com.qonversion.android.sdk.automations.AutomationsDelegate
            public void automationsDidFailExecuting(QActionResult actionResult) {
                Intrinsics.checkNotNullParameter(actionResult, "actionResult");
                eventListener.onAutomationEvent(AutomationsEventListener.Event.ActionFailed, MappersKt.toMap(actionResult));
            }

            @Override // com.qonversion.android.sdk.automations.AutomationsDelegate
            public void automationsDidFinishExecuting(QActionResult actionResult) {
                Intrinsics.checkNotNullParameter(actionResult, "actionResult");
                eventListener.onAutomationEvent(AutomationsEventListener.Event.ActionFinished, MappersKt.toMap(actionResult));
            }

            @Override // com.qonversion.android.sdk.automations.AutomationsDelegate
            public void automationsFinished() {
                AutomationsEventListener.DefaultImpls.onAutomationEvent$default(eventListener, AutomationsEventListener.Event.AutomationsFinished, null, 2, null);
            }
        };
    }
}
