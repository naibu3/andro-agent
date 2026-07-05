package O;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends C0.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f601a;

    public g(TextView textView) {
        this.f601a = new f(textView);
    }

    @Override // C0.d
    public final void F(boolean z2) {
        if (M.j.f533k != null) {
            this.f601a.F(z2);
        }
    }

    @Override // C0.d
    public final void G(boolean z2) {
        boolean z3 = M.j.f533k != null;
        f fVar = this.f601a;
        if (z3) {
            fVar.G(z2);
        } else {
            fVar.f600c = z2;
        }
    }

    @Override // C0.d
    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        return !(M.j.f533k != null) ? inputFilterArr : this.f601a.w(inputFilterArr);
    }
}
