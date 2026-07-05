package D;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f239b = new e(new f(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final f f240a;

    public e(f fVar) {
        this.f240a = fVar;
    }

    public static e a(String str) {
        if (str == null || str.isEmpty()) {
            return f239b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArrSplit[i2];
            int i3 = d.f238a;
            localeArr[i2] = Locale.forLanguageTag(str2);
        }
        return new e(new f(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f240a.equals(((e) obj).f240a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f240a.f241a.hashCode();
    }

    public final String toString() {
        return this.f240a.f241a.toString();
    }
}
