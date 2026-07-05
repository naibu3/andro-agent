package com.qonversion.android.sdk.automations.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.automations.AutomationsDelegate;
import com.qonversion.android.sdk.automations.ScreenCustomizationDelegate;
import com.qonversion.android.sdk.automations.dto.AutomationsEvent;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationConfig;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.dto.automations.ActionPointScreen;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.listeners.QonversionShowScreenCallback;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: QAutomationsManager.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\"\u001a\u00020\u001aJ*\u0010#\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010$2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0$J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0$H\u0002J\u001a\u0010'\u001a\u00020(2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0$J\u001a\u0010)\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+J\b\u0010,\u001a\u00020\u001aH\u0002J\u0012\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u00060"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "eventMapper", "Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;", "appContext", "Landroid/app/Application;", "activityProvider", "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/internal/AutomationsEventMapper;Landroid/app/Application;Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;)V", "<set-?>", "Ljava/lang/ref/WeakReference;", "Lcom/qonversion/android/sdk/automations/AutomationsDelegate;", "automationsDelegate", "getAutomationsDelegate", "()Ljava/lang/ref/WeakReference;", "setAutomationsDelegate", "(Ljava/lang/ref/WeakReference;)V", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;", "screenCustomizationDelegate", "getScreenCustomizationDelegate", "setScreenCustomizationDelegate", "automationsDidFailExecuting", "", "actionResult", "Lcom/qonversion/android/sdk/automations/dto/QActionResult;", "automationsDidFinishExecuting", "automationsDidShowScreen", ScreenActivity.INTENT_SCREEN_ID, "", "automationsDidStartExecuting", "automationsFinished", "getNotificationCustomPayload", "", "messageData", "getQueryParams", "handlePushIfPossible", "", "loadScreen", "callback", "Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;", "loadScreenIfPossible", "logDelegateErrorForFunctionName", "functionName", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QAutomationsManager {
    private static final String KEY_CUSTOM_PAYLOAD = "qonv.custom_payload";
    private static final String PICK_SCREEN = "qonv.pick_screen";
    private static final String QUERY_PARAM_ACTIVE = "active";
    private static final int QUERY_PARAM_ACTIVE_VALUE = 1;
    private static final String QUERY_PARAM_TYPE = "type";
    private static final String QUERY_PARAM_TYPE_VALUE = "screen_view";
    private final ActivityProvider activityProvider;
    private final Application appContext;
    private volatile WeakReference<AutomationsDelegate> automationsDelegate;
    private final AutomationsEventMapper eventMapper;
    private final ConsoleLogger logger;
    private final QRepository repository;
    private volatile WeakReference<ScreenCustomizationDelegate> screenCustomizationDelegate;

    @Inject
    public QAutomationsManager(QRepository repository, AutomationsEventMapper eventMapper, Application appContext, ActivityProvider activityProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eventMapper, "eventMapper");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.repository = repository;
        this.eventMapper = eventMapper;
        this.appContext = appContext;
        this.activityProvider = activityProvider;
        this.logger = new ConsoleLogger();
    }

    public final synchronized void setAutomationsDelegate(WeakReference<AutomationsDelegate> weakReference) {
        this.automationsDelegate = weakReference;
    }

    public final synchronized WeakReference<AutomationsDelegate> getAutomationsDelegate() {
        return this.automationsDelegate;
    }

    public final synchronized void setScreenCustomizationDelegate(WeakReference<ScreenCustomizationDelegate> weakReference) {
        this.screenCustomizationDelegate = weakReference;
    }

    public final synchronized WeakReference<ScreenCustomizationDelegate> getScreenCustomizationDelegate() {
        return this.screenCustomizationDelegate;
    }

    public final boolean handlePushIfPossible(Map<String, String> messageData) throws JSONException {
        AutomationsDelegate automationsDelegate;
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        boolean z = ExtensionsKt.toBoolean(messageData.get(PICK_SCREEN));
        if (z) {
            this.logger.release("handlePushIfPossible() -> Qonversion push notification was received");
            AutomationsEvent eventFromRemoteMessage = this.eventMapper.getEventFromRemoteMessage(messageData);
            boolean zBooleanValue = true;
            if (eventFromRemoteMessage != null) {
                WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
                Boolean boolShouldHandleEvent = (weakReference == null || (automationsDelegate = weakReference.get()) == null) ? null : automationsDelegate.shouldHandleEvent(eventFromRemoteMessage, messageData);
                if (boolShouldHandleEvent != null) {
                    Intrinsics.checkNotNull(boolShouldHandleEvent);
                    zBooleanValue = boolShouldHandleEvent.booleanValue();
                }
            }
            if (zBooleanValue) {
                loadScreenIfPossible();
            }
        }
        return z;
    }

    public final Map<String, Object> getNotificationCustomPayload(Map<String, String> messageData) {
        Intrinsics.checkNotNullParameter(messageData, "messageData");
        String str = messageData.get(KEY_CUSTOM_PAYLOAD);
        if (str == null) {
            return null;
        }
        try {
            return ExtensionsKt.toMap(new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static /* synthetic */ void loadScreen$default(QAutomationsManager qAutomationsManager, String str, QonversionShowScreenCallback qonversionShowScreenCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            qonversionShowScreenCallback = null;
        }
        qAutomationsManager.loadScreen(str, qonversionShowScreenCallback);
    }

    public final void loadScreen(final String screenId, final QonversionShowScreenCallback callback) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        this.repository.screens(screenId, new Function1<Screen, Unit>() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.loadScreen.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Screen screen) {
                invoke2(screen);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Screen screen) {
                QScreenPresentationConfig qScreenPresentationConfig;
                ScreenCustomizationDelegate screenCustomizationDelegate;
                Intrinsics.checkNotNullParameter(screen, "screen");
                Context currentActivity = QAutomationsManager.this.activityProvider.getCurrentActivity();
                if (currentActivity == null) {
                    currentActivity = QAutomationsManager.this.appContext;
                }
                Context context = currentActivity;
                WeakReference<ScreenCustomizationDelegate> screenCustomizationDelegate2 = QAutomationsManager.this.getScreenCustomizationDelegate();
                if (screenCustomizationDelegate2 == null || (screenCustomizationDelegate = screenCustomizationDelegate2.get()) == null || (qScreenPresentationConfig = screenCustomizationDelegate.getPresentationConfigurationForScreen(screenId)) == null) {
                    qScreenPresentationConfig = new QScreenPresentationConfig(null, 1, null);
                }
                Intent callingIntent = ScreenActivity.INSTANCE.getCallingIntent(context, screenId, screen.getHtmlPage(), qScreenPresentationConfig.getPresentationStyle());
                if (!(context instanceof Activity)) {
                    callingIntent.addFlags(268435456);
                    QAutomationsManager.this.logger.debug("loadScreen() -> Screen intent will process with a non-Activity context");
                }
                try {
                    context.startActivity(callingIntent);
                    Pair<Integer, Integer> screenTransactionAnimations = UtilsKt.getScreenTransactionAnimations(qScreenPresentationConfig.getPresentationStyle());
                    if (screenTransactionAnimations != null) {
                        QAutomationsManager qAutomationsManager = QAutomationsManager.this;
                        if (context instanceof Activity) {
                            ((Activity) context).overridePendingTransition(screenTransactionAnimations.component1().intValue(), screenTransactionAnimations.component2().intValue());
                        } else {
                            qAutomationsManager.logger.debug("Can't use transition animations, cause the provided context is not an activity. To override default animation, please, provide an activity context to AutomationsDelegate.contextForScreenIntent");
                        }
                    }
                    QonversionShowScreenCallback qonversionShowScreenCallback = callback;
                    if (qonversionShowScreenCallback != null) {
                        qonversionShowScreenCallback.onSuccess();
                    }
                } catch (Exception e) {
                    String str = "Failed to start screen with id " + screenId + " with exception: " + e;
                    QAutomationsManager.this.logger.error("loadScreen() -> " + str);
                    QonversionShowScreenCallback qonversionShowScreenCallback2 = callback;
                    if (qonversionShowScreenCallback2 != null) {
                        qonversionShowScreenCallback2.onError(new QonversionError(QonversionErrorCode.Unknown, str, null, 4, null));
                    }
                }
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.loadScreen.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                invoke2(qonversionError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QonversionError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = "Failed to load screen with id " + screenId + ". " + it.getAdditionalMessage();
                this.logger.error("loadScreen() -> " + str);
                QonversionShowScreenCallback qonversionShowScreenCallback = callback;
                if (qonversionShowScreenCallback != null) {
                    qonversionShowScreenCallback.onError(new QonversionError(it.getCode(), str, null, 4, null));
                }
            }
        });
    }

    public final void automationsDidStartExecuting(QActionResult actionResult) {
        Unit unit;
        AutomationsDelegate automationsDelegate;
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            unit = null;
        } else {
            automationsDelegate.automationsDidStartExecuting(actionResult);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Method enclosingMethod = new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidStartExecuting.1
            }.getClass().getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsDidFailExecuting(QActionResult actionResult) {
        Unit unit;
        AutomationsDelegate automationsDelegate;
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            unit = null;
        } else {
            automationsDelegate.automationsDidFailExecuting(actionResult);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Method enclosingMethod = new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidFailExecuting.1
            }.getClass().getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsDidFinishExecuting(QActionResult actionResult) {
        Unit unit;
        AutomationsDelegate automationsDelegate;
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            unit = null;
        } else {
            automationsDelegate.automationsDidFinishExecuting(actionResult);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Method enclosingMethod = new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidFinishExecuting.1
            }.getClass().getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsDidShowScreen(String screenId) {
        Unit unit;
        AutomationsDelegate automationsDelegate;
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            unit = null;
        } else {
            automationsDelegate.automationsDidShowScreen(screenId);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Method enclosingMethod = new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsDidShowScreen.1
            }.getClass().getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    public final void automationsFinished() {
        Unit unit;
        AutomationsDelegate automationsDelegate;
        WeakReference<AutomationsDelegate> weakReference = this.automationsDelegate;
        if (weakReference == null || (automationsDelegate = weakReference.get()) == null) {
            unit = null;
        } else {
            automationsDelegate.automationsFinished();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Method enclosingMethod = new Object() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.automationsFinished.1
            }.getClass().getEnclosingMethod();
            logDelegateErrorForFunctionName(enclosingMethod != null ? enclosingMethod.getName() : null);
        }
    }

    private final void logDelegateErrorForFunctionName(String functionName) {
        this.logger.error("AutomationsDelegate." + functionName + "() function can not be executed. It looks like Automations.setDelegate() was not called or delegate has been destroyed by GC");
    }

    private final void loadScreenIfPossible() {
        this.repository.actionPoints(getQueryParams(), new Function1<ActionPointScreen, Unit>() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.loadScreenIfPossible.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ActionPointScreen actionPointScreen) {
                invoke2(actionPointScreen);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ActionPointScreen actionPointScreen) {
                Unit unit = null;
                if (actionPointScreen != null) {
                    QAutomationsManager qAutomationsManager = QAutomationsManager.this;
                    qAutomationsManager.logger.debug("loadScreenIfPossible() ->  Screen with id " + actionPointScreen.getScreenId() + " was found to show");
                    QAutomationsManager.loadScreen$default(qAutomationsManager, actionPointScreen.getScreenId(), null, 2, null);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    QAutomationsManager.this.logger.warn("loadScreenIfPossible() ->  No screens to show");
                }
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.automations.internal.QAutomationsManager.loadScreenIfPossible.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                invoke2(qonversionError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QonversionError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                QAutomationsManager.this.logger.error("loadScreenIfPossible() -> Failed to retrieve screenId to show");
            }
        });
    }

    private final Map<String, String> getQueryParams() {
        return MapsKt.mapOf(TuplesKt.to(QUERY_PARAM_TYPE, QUERY_PARAM_TYPE_VALUE), TuplesKt.to("active", "1"));
    }
}
