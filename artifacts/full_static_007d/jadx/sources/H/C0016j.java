package H;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: H.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f375a;

    public C0016j(DisplayCutout displayCutout) {
        this.f375a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0016j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f375a, ((C0016j) obj).f375a);
    }

    public final int hashCode() {
        return this.f375a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f375a + "}";
    }
}
