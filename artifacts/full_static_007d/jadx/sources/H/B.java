package H;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class B extends D {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314e;

    public B(int i2, Class cls, int i3, int i4, int i5) {
        this.f314e = i5;
        this.f316a = i2;
        this.f319d = cls;
        this.f318c = i3;
        this.f317b = i4;
    }

    @Override // H.D
    public final Object b(View view) {
        switch (this.f314e) {
            case 0:
                return Boolean.valueOf(I.c(view));
            case 1:
                return I.a(view);
            default:
                return Boolean.valueOf(I.b(view));
        }
    }

    @Override // H.D
    public final void c(View view, Object obj) {
        switch (this.f314e) {
            case 0:
                I.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                I.e(view, (CharSequence) obj);
                break;
            default:
                I.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // H.D
    public final boolean e(Object obj, Object obj2) {
        switch (this.f314e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
