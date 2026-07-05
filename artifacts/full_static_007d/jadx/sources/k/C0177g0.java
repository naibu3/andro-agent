package k;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: k.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177g0 extends C0175f0 {
    @Override // k.C0175f0, k.AbstractC0179h0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // k.AbstractC0179h0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
