package androidx.camera.core.impl;

import java.util.List;

/* loaded from: classes.dex */
public interface InternalCameraPresenceListener {
    void onCamerasUpdated(List<String> list) throws CameraUpdateException;
}
