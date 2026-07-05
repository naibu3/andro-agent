package H;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class L {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0013g b(View view, C0013g c0013g) {
        ContentInfo contentInfoV = c0013g.f367a.v();
        Objects.requireNonNull(contentInfoV);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoV);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoV ? c0013g : new C0013g(new A.f(contentInfoPerformReceiveContent));
    }
}
