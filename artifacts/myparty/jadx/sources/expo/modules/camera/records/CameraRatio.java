package expo.modules.camera.records;

import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraRecords.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u00070\r¢\u0006\u0002\b\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000f"}, d2 = {"Lexpo/modules/camera/records/CameraRatio;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FOUR_THREE", "SIXTEEN_NINE", "ONE_ONE", "mapToStrategy", "Landroidx/camera/core/resolutionselector/AspectRatioStrategy;", "Lorg/jspecify/annotations/NonNull;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraRatio implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraRatio[] $VALUES;
    private final String value;
    public static final CameraRatio FOUR_THREE = new CameraRatio("FOUR_THREE", 0, "4:3");
    public static final CameraRatio SIXTEEN_NINE = new CameraRatio("SIXTEEN_NINE", 1, "16:9");
    public static final CameraRatio ONE_ONE = new CameraRatio("ONE_ONE", 2, "1:1");

    /* compiled from: CameraRecords.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraRatio.values().length];
            try {
                iArr[CameraRatio.FOUR_THREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraRatio.SIXTEEN_NINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CameraRatio[] $values() {
        return new CameraRatio[]{FOUR_THREE, SIXTEEN_NINE, ONE_ONE};
    }

    public static EnumEntries<CameraRatio> getEntries() {
        return $ENTRIES;
    }

    private CameraRatio(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        CameraRatio[] cameraRatioArr$values = $values();
        $VALUES = cameraRatioArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(cameraRatioArr$values);
    }

    public final AspectRatioStrategy mapToStrategy() {
        AspectRatioStrategy aspectRatioStrategy;
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1 && i == 2) {
            aspectRatioStrategy = AspectRatioStrategy.RATIO_16_9_FALLBACK_AUTO_STRATEGY;
        } else {
            aspectRatioStrategy = AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
        }
        Intrinsics.checkNotNull(aspectRatioStrategy);
        return aspectRatioStrategy;
    }

    public static CameraRatio valueOf(String str) {
        return (CameraRatio) Enum.valueOf(CameraRatio.class, str);
    }

    public static CameraRatio[] values() {
        return (CameraRatio[]) $VALUES.clone();
    }
}
