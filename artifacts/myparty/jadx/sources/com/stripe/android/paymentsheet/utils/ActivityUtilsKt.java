package com.stripe.android.paymentsheet.utils;

import android.app.Activity;
import android.app.ActivityManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"applicationIsTaskOwner", "", "Landroid/app/Activity;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivityUtilsKt {
    public static final boolean applicationIsTaskOwner(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Object systemService = activity.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
        Intrinsics.checkNotNullExpressionValue(appTasks, "getAppTasks(...)");
        List<ActivityManager.AppTask> list = appTasks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ActivityManager.AppTask) it.next()).getTaskInfo().persistentId == activity.getTaskId()) {
                return true;
            }
        }
        return false;
    }
}
