package expo.modules.camera;

import androidx.camera.video.AudioStats;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lexpo/modules/camera/SavePictureOptions;", "Lexpo/modules/kotlin/records/Record;", "quality", "", "base64", "", "metadata", "", "", "", "<init>", "(DZLjava/util/Map;)V", "getQuality$annotations", "()V", "getQuality", "()D", "getBase64$annotations", "getBase64", "()Z", "getMetadata$annotations", "getMetadata", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SavePictureOptions implements Record {
    private final boolean base64;
    private final Map<String, Object> metadata;
    private final double quality;

    public SavePictureOptions() {
        this(AudioStats.AUDIO_AMPLITUDE_NONE, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavePictureOptions copy$default(SavePictureOptions savePictureOptions, double d, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            d = savePictureOptions.quality;
        }
        if ((i & 2) != 0) {
            z = savePictureOptions.base64;
        }
        if ((i & 4) != 0) {
            map = savePictureOptions.metadata;
        }
        return savePictureOptions.copy(d, z, map);
    }

    @Field
    public static /* synthetic */ void getBase64$annotations() {
    }

    @Field
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @Field
    public static /* synthetic */ void getQuality$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final double getQuality() {
        return this.quality;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBase64() {
        return this.base64;
    }

    public final Map<String, Object> component3() {
        return this.metadata;
    }

    public final SavePictureOptions copy(double quality, boolean base64, Map<String, ? extends Object> metadata) {
        return new SavePictureOptions(quality, base64, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavePictureOptions)) {
            return false;
        }
        SavePictureOptions savePictureOptions = (SavePictureOptions) other;
        return Double.compare(this.quality, savePictureOptions.quality) == 0 && this.base64 == savePictureOptions.base64 && Intrinsics.areEqual(this.metadata, savePictureOptions.metadata);
    }

    public int hashCode() {
        int iHashCode = ((Double.hashCode(this.quality) * 31) + Boolean.hashCode(this.base64)) * 31;
        Map<String, Object> map = this.metadata;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "SavePictureOptions(quality=" + this.quality + ", base64=" + this.base64 + ", metadata=" + this.metadata + ")";
    }

    public SavePictureOptions(double d, boolean z, Map<String, ? extends Object> map) {
        this.quality = d;
        this.base64 = z;
        this.metadata = map;
    }

    public final double getQuality() {
        return this.quality;
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public /* synthetic */ SavePictureOptions(double d, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0d : d, (i & 2) != 0 ? false : z, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }
}
