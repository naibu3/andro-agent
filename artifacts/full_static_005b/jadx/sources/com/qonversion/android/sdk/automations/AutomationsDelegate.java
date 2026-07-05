package com.qonversion.android.sdk.automations;

import com.qonversion.android.sdk.automations.dto.AutomationsEvent;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import java.util.Map;

/* loaded from: classes2.dex */
public interface AutomationsDelegate {
    default void automationsDidFailExecuting(QActionResult qActionResult) {
    }

    default void automationsDidFinishExecuting(QActionResult qActionResult) {
    }

    default void automationsDidShowScreen(String str) {
    }

    default void automationsDidStartExecuting(QActionResult qActionResult) {
    }

    default void automationsFinished() {
    }

    default Boolean shouldHandleEvent(AutomationsEvent automationsEvent, Map<String, String> map) {
        return true;
    }
}
