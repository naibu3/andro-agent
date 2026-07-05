package a;

import H.AbstractC0029x;
import android.window.BackEvent;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034a {

    /* renamed from: a, reason: collision with root package name */
    public final float f736a;

    /* renamed from: b, reason: collision with root package name */
    public final float f737b;

    /* renamed from: c, reason: collision with root package name */
    public final float f738c;

    /* renamed from: d, reason: collision with root package name */
    public final int f739d;

    public C0034a(BackEvent backEvent) {
        float fK = AbstractC0029x.k(backEvent);
        float fL = AbstractC0029x.l(backEvent);
        float fH = AbstractC0029x.h(backEvent);
        int iJ = AbstractC0029x.j(backEvent);
        this.f736a = fK;
        this.f737b = fL;
        this.f738c = fH;
        this.f739d = iJ;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f736a + ", touchY=" + this.f737b + ", progress=" + this.f738c + ", swipeEdge=" + this.f739d + '}';
    }
}
