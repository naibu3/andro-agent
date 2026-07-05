package com.qonversion.android.sdk.automations;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.internal.AutomationsInternal;
import com.qonversion.android.sdk.listeners.QonversionShowScreenCallback;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;

/* compiled from: Automations.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J,\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H'J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/qonversion/android/sdk/automations/Automations;", "", "getNotificationCustomPayload", "", "", "messageData", "handleNotification", "", "setDelegate", "", "delegate", "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;", "setNotificationsToken", "token", "setScreenCustomizationDelegate", "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;", "showScreen", "withID", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface Automations {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    static Automations getSharedInstance() {
        return INSTANCE.getSharedInstance();
    }

    Map<String, Object> getNotificationCustomPayload(Map<String, String> messageData);

    @Deprecated(message = "Consider removing this method. Qonversion is not working with push notifications anymore")
    boolean handleNotification(Map<String, String> messageData);

    void setDelegate(AutomationsDelegate delegate);

    @Deprecated(message = "Consider removing this method as it isn't needed anymore")
    void setNotificationsToken(String token);

    void setScreenCustomizationDelegate(ScreenCustomizationDelegate delegate);

    void showScreen(String withID, QonversionShowScreenCallback callback);

    /* compiled from: Automations.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/automations/Automations$Companion;", "", "()V", "backingInstance", "Lcom/qonversion/android/sdk/automations/Automations;", "shared", "getSharedInstance$annotations", "getSharedInstance", "()Lcom/qonversion/android/sdk/automations/Automations;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Automations backingInstance;

        @JvmStatic
        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        private Companion() {
        }

        public final Automations getSharedInstance() {
            if (backingInstance == null) {
                synchronized (Automations.class) {
                    if (backingInstance == null) {
                        try {
                            Qonversion.INSTANCE.getSharedInstance();
                            backingInstance = new AutomationsInternal();
                        } catch (UninitializedPropertyAccessException unused) {
                            throw new UninitializedPropertyAccessException("Qonversion has not been initialized. Automations should be used after Qonversion is initialized.");
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            Automations automations = backingInstance;
            if (automations != null) {
                return automations;
            }
            throw new IllegalStateException("Unexpected uninitialized state");
        }
    }
}
