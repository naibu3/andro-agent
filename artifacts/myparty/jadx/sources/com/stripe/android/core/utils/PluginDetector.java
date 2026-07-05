package com.stripe.android.core.utils;

import android.util.Log;
import com.facebook.react.common.ReactConstants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: PluginDetector.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/core/utils/PluginDetector;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "pluginType", "getPluginType", "()Ljava/lang/String;", "isPlugin", "", "className", "PluginType", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PluginDetector {
    public static final PluginDetector INSTANCE = new PluginDetector();
    private static final String TAG = "PluginDetector";
    private static final String pluginType;

    private PluginDetector() {
    }

    static {
        PluginType next;
        Iterator<PluginType> it = PluginType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (INSTANCE.isPlugin(next.getClassName())) {
                    break;
                }
            }
        }
        PluginType pluginType2 = next;
        pluginType = pluginType2 != null ? pluginType2.getPluginName() : null;
    }

    public final String getPluginType() {
        return pluginType;
    }

    private final boolean isPlugin(String className) throws ClassNotFoundException {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            Log.d(TAG, className + " not found: " + e);
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PluginDetector.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/core/utils/PluginDetector$PluginType;", "", "className", "", "pluginName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getPluginName", ReactConstants.TAG, "Flutter", "Cordova", "Unity", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PluginType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PluginType[] $VALUES;
        private final String className;
        private final String pluginName;
        public static final PluginType ReactNative = new PluginType(ReactConstants.TAG, 0, "com.facebook.react.bridge.NativeModule", "react-native");
        public static final PluginType Flutter = new PluginType("Flutter", 1, "io.flutter.embedding.engine.FlutterEngine", "flutter");
        public static final PluginType Cordova = new PluginType("Cordova", 2, "org.apache.cordova.CordovaActivity", "cordova");
        public static final PluginType Unity = new PluginType("Unity", 3, "com.unity3d.player.UnityPlayerActivity", "unity");

        private static final /* synthetic */ PluginType[] $values() {
            return new PluginType[]{ReactNative, Flutter, Cordova, Unity};
        }

        public static EnumEntries<PluginType> getEntries() {
            return $ENTRIES;
        }

        private PluginType(String str, int i, String str2, String str3) {
            this.className = str2;
            this.pluginName = str3;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getPluginName() {
            return this.pluginName;
        }

        static {
            PluginType[] pluginTypeArr$values = $values();
            $VALUES = pluginTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(pluginTypeArr$values);
        }

        public static PluginType valueOf(String str) {
            return (PluginType) Enum.valueOf(PluginType.class, str);
        }

        public static PluginType[] values() {
            return (PluginType[]) $VALUES.clone();
        }
    }
}
