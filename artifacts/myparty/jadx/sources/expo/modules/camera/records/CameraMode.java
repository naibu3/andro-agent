package expo.modules.camera.records;

import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraRecords.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/camera/records/CameraMode;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PICTURE", ShareConstants.VIDEO_URL, "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraMode implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraMode[] $VALUES;
    public static final CameraMode PICTURE = new CameraMode("PICTURE", 0, "picture");
    public static final CameraMode VIDEO = new CameraMode(ShareConstants.VIDEO_URL, 1, AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    private final String value;

    private static final /* synthetic */ CameraMode[] $values() {
        return new CameraMode[]{PICTURE, VIDEO};
    }

    public static EnumEntries<CameraMode> getEntries() {
        return $ENTRIES;
    }

    private CameraMode(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        CameraMode[] cameraModeArr$values = $values();
        $VALUES = cameraModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cameraModeArr$values);
    }

    public static CameraMode valueOf(String str) {
        return (CameraMode) Enum.valueOf(CameraMode.class, str);
    }

    public static CameraMode[] values() {
        return (CameraMode[]) $VALUES.clone();
    }
}
