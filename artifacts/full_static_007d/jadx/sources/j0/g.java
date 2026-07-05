package j0;

import B0.F;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1738a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1739b;

    public g(int i2) {
        this.f1738a = i2;
        switch (i2) {
            case 1:
                Pattern patternCompile = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
                AbstractC0150d.d(patternCompile, "compile(...)");
                this.f1739b = patternCompile;
                break;
        }
    }

    public final String toString() {
        switch (this.f1738a) {
            case 0:
                return String.valueOf((F) this.f1739b);
            default:
                String string = ((Pattern) this.f1739b).toString();
                AbstractC0150d.d(string, "toString(...)");
                return string;
        }
    }
}
