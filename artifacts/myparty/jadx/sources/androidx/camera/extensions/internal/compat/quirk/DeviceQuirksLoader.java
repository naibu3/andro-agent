package androidx.camera.extensions.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    static List<Quirk> loadQuirks(QuirkSettings quirkSettings) {
        ArrayList arrayList = new ArrayList();
        if (quirkSettings.shouldEnableQuirk(ExtensionDisabledQuirk.class, ExtensionDisabledQuirk.load())) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(CrashWhenOnDisableTooSoon.class, CrashWhenOnDisableTooSoon.load())) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (quirkSettings.shouldEnableQuirk(GetAvailableKeysNeedsOnInit.class, GetAvailableKeysNeedsOnInit.load())) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (quirkSettings.shouldEnableQuirk(CaptureOutputSurfaceOccupiedQuirk.class, CaptureOutputSurfaceOccupiedQuirk.load())) {
            arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(EnsurePostviewFormatEquivalenceQuirk.class, EnsurePostviewFormatEquivalenceQuirk.load())) {
            arrayList.add(new EnsurePostviewFormatEquivalenceQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(AvoidPostviewAvailabilityCheckQuirk.class, AvoidPostviewAvailabilityCheckQuirk.load())) {
            arrayList.add(new AvoidPostviewAvailabilityCheckQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(AvoidCaptureProcessProgressAvailabilityCheckQuirk.class, AvoidCaptureProcessProgressAvailabilityCheckQuirk.load())) {
            arrayList.add(new AvoidCaptureProcessProgressAvailabilityCheckQuirk());
        }
        return arrayList;
    }
}
