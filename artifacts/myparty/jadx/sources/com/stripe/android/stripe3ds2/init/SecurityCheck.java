package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SecurityCheck.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "", "warning", "Lcom/stripe/android/stripe3ds2/init/Warning;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/Warning;)V", "getWarning", "()Lcom/stripe/android/stripe3ds2/init/Warning;", "check", "", "RootedCheck", "Tampered", "Emulator", "DebuggerAttached", "UnsupportedOS", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SecurityCheck {
    private final Warning warning;

    public /* synthetic */ SecurityCheck(Warning warning, DefaultConstructorMarker defaultConstructorMarker) {
        this(warning);
    }

    /* renamed from: check */
    public abstract boolean getIsDebuggerConnected();

    private SecurityCheck(Warning warning) {
        this.warning = warning;
    }

    public final Warning getWarning() {
        return this.warning;
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "<init>", "()V", "check", "", "findSuBinary", "findSuperuserApk", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RootedCheck extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final List<String> BINARY_PATHS = CollectionsKt.listOf((Object[]) new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"});
        private static final Warning WARNING = new Warning("SW01", "The device is jailbroken.", Warning.Severity.HIGH);

        public RootedCheck() {
            super(WARNING, null);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return findSuBinary() || findSuperuserApk();
        }

        private final boolean findSuBinary() {
            List<String> list = BINARY_PATHS;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (new File(((String) it.next()) + "su").exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean findSuperuserApk() {
            return new File(Environment.getRootDirectory() + "/Superuser").isDirectory();
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck$Companion;", "", "<init>", "()V", "BINARY_PATHS", "", "", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "<init>", "()V", "check", "", "hasValidFields", "hasValidMethods", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tampered extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW02", "The integrity of the SDK has been tampered.", Warning.Severity.HIGH);

        public Tampered() {
            super(WARNING, null);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return (hasValidFields() && hasValidMethods()) ? false : true;
        }

        private final boolean hasValidFields() {
            Field[] declaredFields = StripeThreeDs2ServiceImpl.class.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (!field.isSynthetic()) {
                    arrayList.add(field);
                }
            }
            return arrayList.size() == 8;
        }

        private final boolean hasValidMethods() throws SecurityException {
            Method[] declaredMethods = StripeThreeDs2ServiceImpl.class.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (!method.isSynthetic()) {
                    arrayList.add(method);
                }
            }
            return arrayList.size() == 5;
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered$Companion;", "", "<init>", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "<init>", "()V", "isEmulator", "", "()Z", "check", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Emulator extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW02", "An emulator is being used to run the App.", Warning.Severity.HIGH);

        public Emulator() {
            super(WARNING, null);
        }

        private final boolean isEmulator() {
            String FINGERPRINT = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            if (StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
                return true;
            }
            String FINGERPRINT2 = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
            if (StringsKt.startsWith$default(FINGERPRINT2, "unknown", false, 2, (Object) null)) {
                return true;
            }
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            if (StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "Emulator", false, 2, (Object) null)) {
                return true;
            }
            String MODEL2 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
            if (StringsKt.contains$default((CharSequence) MODEL2, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                return true;
            }
            String MODEL3 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
            if (StringsKt.contains$default((CharSequence) MODEL3, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                return true;
            }
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                return true;
            }
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
                String DEVICE = Build.DEVICE;
                Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                if (StringsKt.startsWith$default(DEVICE, "generic", false, 2, (Object) null)) {
                    return true;
                }
            }
            return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return isEmulator();
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator$Companion;", "", "<init>", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "isDebuggerConnected", "", "<init>", "(Z)V", "()Z", "check", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DebuggerAttached extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW04", "A debugger is attached to the App.", Warning.Severity.MEDIUM);
        private final boolean isDebuggerConnected;

        public DebuggerAttached() {
            this(false, 1, null);
        }

        public /* synthetic */ DebuggerAttached(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Debug.isDebuggerConnected() : z);
        }

        public final boolean isDebuggerConnected() {
            return this.isDebuggerConnected;
        }

        public DebuggerAttached(boolean z) {
            super(WARNING, null);
            this.isDebuggerConnected = z;
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check, reason: from getter */
        public boolean getIsDebuggerConnected() {
            return this.isDebuggerConnected;
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;", "", "<init>", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: SecurityCheck.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;", "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;", "<init>", "()V", "check", "", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnsupportedOS extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        private static final Warning WARNING = new Warning("SW05", "The OS or the OS version is not supported.", Warning.Severity.HIGH);

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        /* renamed from: check */
        public boolean getIsDebuggerConnected() {
            return false;
        }

        public UnsupportedOS() {
            super(WARNING, null);
        }

        /* compiled from: SecurityCheck.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS$Companion;", "", "<init>", "()V", "WARNING", "Lcom/stripe/android/stripe3ds2/init/Warning;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
