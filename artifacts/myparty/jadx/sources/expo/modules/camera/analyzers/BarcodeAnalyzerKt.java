package expo.modules.camera.analyzers;

import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BarcodeAnalyzer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"toByteArray", "", "", "Landroidx/camera/core/ImageProxy$PlaneProxy;", "([Landroidx/camera/core/ImageProxy$PlaneProxy;)[B", "expo-camera_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeAnalyzerKt {
    public static final byte[] toByteArray(ImageProxy.PlaneProxy[] planeProxyArr) {
        Intrinsics.checkNotNullParameter(planeProxyArr, "<this>");
        int iRemaining = 0;
        for (ImageProxy.PlaneProxy planeProxy : planeProxyArr) {
            iRemaining += planeProxy.getBuffer().remaining();
        }
        byte[] bArr = new byte[iRemaining];
        int i = 0;
        for (ImageProxy.PlaneProxy planeProxy2 : planeProxyArr) {
            ByteBuffer buffer = planeProxy2.getBuffer();
            Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
            int iRemaining2 = buffer.remaining();
            buffer.get(bArr, i, iRemaining2);
            i += iRemaining2;
        }
        return bArr;
    }
}
