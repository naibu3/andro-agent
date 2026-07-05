package expo.modules.camera;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Options.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lexpo/modules/camera/RecordingOptions;", "Lexpo/modules/kotlin/records/Record;", "maxDuration", "", "maxFileSize", "<init>", "(II)V", "getMaxDuration$annotations", "()V", "getMaxDuration", "()I", "getMaxFileSize$annotations", "getMaxFileSize", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class RecordingOptions implements Record {
    private final int maxDuration;
    private final int maxFileSize;

    /* JADX WARN: Illegal instructions before constructor call */
    public RecordingOptions() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ RecordingOptions copy$default(RecordingOptions recordingOptions, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = recordingOptions.maxDuration;
        }
        if ((i3 & 2) != 0) {
            i2 = recordingOptions.maxFileSize;
        }
        return recordingOptions.copy(i, i2);
    }

    @Field
    public static /* synthetic */ void getMaxDuration$annotations() {
    }

    @Field
    public static /* synthetic */ void getMaxFileSize$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxFileSize() {
        return this.maxFileSize;
    }

    public final RecordingOptions copy(int maxDuration, int maxFileSize) {
        return new RecordingOptions(maxDuration, maxFileSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordingOptions)) {
            return false;
        }
        RecordingOptions recordingOptions = (RecordingOptions) other;
        return this.maxDuration == recordingOptions.maxDuration && this.maxFileSize == recordingOptions.maxFileSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxDuration) * 31) + Integer.hashCode(this.maxFileSize);
    }

    public String toString() {
        return "RecordingOptions(maxDuration=" + this.maxDuration + ", maxFileSize=" + this.maxFileSize + ")";
    }

    public RecordingOptions(int i, int i2) {
        this.maxDuration = i;
        this.maxFileSize = i2;
    }

    public /* synthetic */ RecordingOptions(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getMaxFileSize() {
        return this.maxFileSize;
    }
}
