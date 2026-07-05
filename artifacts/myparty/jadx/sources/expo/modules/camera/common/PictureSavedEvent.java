package expo.modules.camera.common;

import android.os.Bundle;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonEvents.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/camera/common/PictureSavedEvent;", "Lexpo/modules/kotlin/records/Record;", "id", "", "data", "Landroid/os/Bundle;", "<init>", "(ILandroid/os/Bundle;)V", "getId$annotations", "()V", "getId", "()I", "getData$annotations", "getData", "()Landroid/os/Bundle;", "expo-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PictureSavedEvent implements Record {
    private final Bundle data;
    private final int id;

    @Field
    public static /* synthetic */ void getData$annotations() {
    }

    @Field
    public static /* synthetic */ void getId$annotations() {
    }

    public PictureSavedEvent(int i, Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = i;
        this.data = data;
    }

    public final int getId() {
        return this.id;
    }

    public final Bundle getData() {
        return this.data;
    }
}
