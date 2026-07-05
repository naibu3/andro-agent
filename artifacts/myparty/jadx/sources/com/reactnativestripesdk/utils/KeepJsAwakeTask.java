package com.reactnativestripesdk.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeepJsAwakeTask.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\f"}, d2 = {"Lcom/reactnativestripesdk/utils/KeepJsAwakeTask;", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "taskId", "", "Ljava/lang/Integer;", ViewProps.START, "", "stop", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KeepJsAwakeTask {
    public static final int $stable = 8;
    private final ReactApplicationContext context;
    private Integer taskId;

    public KeepJsAwakeTask(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void start() {
        final HeadlessJsTaskContext companion = HeadlessJsTaskContext.INSTANCE.getInstance(this.context);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.reactnativestripesdk.utils.KeepJsAwakeTask$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                KeepJsAwakeTask.start$lambda$0(this.f$0, companion);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(KeepJsAwakeTask keepJsAwakeTask, HeadlessJsTaskContext headlessJsTaskContext) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        keepJsAwakeTask.taskId = Integer.valueOf(headlessJsTaskContext.startTask(new HeadlessJsTaskConfig("StripeKeepJsAwakeTask", writableMapCreateMap, 0L, true, null, 16, null)));
    }

    public final void stop() {
        Integer num = this.taskId;
        if (num != null) {
            HeadlessJsTaskContext.INSTANCE.getInstance(this.context).finishTask(num.intValue());
            this.taskId = null;
        }
    }
}
