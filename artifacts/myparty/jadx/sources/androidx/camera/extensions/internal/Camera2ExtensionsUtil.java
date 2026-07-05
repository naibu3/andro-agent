package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Camera2ExtensionsUtil.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsUtil;", "", "<init>", "()V", "TAG", "", "convertCameraXModeToCamera2Mode", "", "cameraXMode", "convertCamera2ModeToCameraXMode", "camera2Mode", "createCameraId2CameraExtensionCharacteristicsMap", "", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "applicationContext", "Landroid/content/Context;", "shouldUseCamera2Extensions", "", "configImplType", "camera-extensions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Camera2ExtensionsUtil {
    public static final Camera2ExtensionsUtil INSTANCE = new Camera2ExtensionsUtil();
    private static final String TAG = "Camera2ExtensionsUtil";

    @JvmStatic
    public static final boolean shouldUseCamera2Extensions(int configImplType) {
        return configImplType == 1;
    }

    private Camera2ExtensionsUtil() {
    }

    public final int convertCameraXModeToCamera2Mode(int cameraXMode) {
        if (cameraXMode == 1) {
            return 2;
        }
        if (cameraXMode == 2) {
            return 3;
        }
        if (cameraXMode == 3) {
            return 4;
        }
        if (cameraXMode == 4) {
            return 1;
        }
        if (cameraXMode == 5) {
            return 0;
        }
        throw new IllegalArgumentException("Unavailable CameraX extension mode (" + cameraXMode + ')');
    }

    public final int convertCamera2ModeToCameraXMode(int camera2Mode) {
        if (camera2Mode == 0) {
            return 5;
        }
        if (camera2Mode == 1) {
            return 4;
        }
        if (camera2Mode == 2) {
            return 1;
        }
        if (camera2Mode == 3) {
            return 2;
        }
        if (camera2Mode == 4) {
            return 3;
        }
        throw new IllegalArgumentException("Unavailable Camera2 extension mode (" + camera2Mode + ')');
    }

    @JvmStatic
    public static final Map<String, CameraExtensionCharacteristics> createCameraId2CameraExtensionCharacteristicsMap(Context applicationContext) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (Build.VERSION.SDK_INT < 31) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            CameraManager cameraManager = (CameraManager) applicationContext.getSystemService(CameraManager.class);
            for (String str : cameraManager.getCameraIdList()) {
                Intrinsics.checkNotNull(str);
                CameraExtensionCharacteristics cameraExtensionCharacteristics = cameraManager.getCameraExtensionCharacteristics(str);
                Intrinsics.checkNotNullExpressionValue(cameraExtensionCharacteristics, "getCameraExtensionCharacteristics(...)");
                linkedHashMap.put(str, cameraExtensionCharacteristics);
            }
            return linkedHashMap;
        } catch (CameraAccessException e) {
            Log.e(TAG, "Failed to retrieve CameraExtensionCharacteristics info. ", e);
            return linkedHashMap;
        }
    }
}
