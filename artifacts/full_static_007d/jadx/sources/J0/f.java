package J0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f475a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f476b;

    /* renamed from: c, reason: collision with root package name */
    public long f477c;

    /* renamed from: d, reason: collision with root package name */
    public long f478d;

    /* renamed from: e, reason: collision with root package name */
    public char f479e;

    /* renamed from: f, reason: collision with root package name */
    public final Reader f480f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f481g;
    public long h;

    public f(String str) {
        Reader stringReader = new StringReader(str);
        this.f480f = stringReader.markSupported() ? stringReader : new BufferedReader(stringReader);
        this.f476b = false;
        this.f481g = false;
        this.f479e = (char) 0;
        this.f477c = 0L;
        this.f475a = 1L;
        this.h = 0L;
        this.f478d = 1L;
    }

    public final void a() {
        if (!this.f481g) {
            long j2 = this.f477c;
            if (j2 > 0) {
                this.f477c = j2 - 1;
                char c2 = this.f479e;
                if (c2 == '\r' || c2 == '\n') {
                    this.f478d--;
                    this.f475a = this.h;
                } else {
                    long j3 = this.f475a;
                    if (j3 > 0) {
                        this.f475a = j3 - 1;
                    }
                }
                this.f481g = true;
                this.f476b = false;
                return;
            }
        }
        throw new b("Stepping back two steps is not supported");
    }

    public final char b() throws IOException {
        int i2;
        if (this.f481g) {
            this.f481g = false;
            i2 = this.f479e;
        } else {
            try {
                i2 = this.f480f.read();
            } catch (IOException e2) {
                throw new b(e2.getMessage(), e2);
            }
        }
        if (i2 <= 0) {
            this.f476b = true;
            return (char) 0;
        }
        if (i2 > 0) {
            this.f477c++;
            if (i2 == 13) {
                this.f478d++;
                this.h = this.f475a;
                this.f475a = 0L;
            } else if (i2 == 10) {
                if (this.f479e != '\r') {
                    this.f478d++;
                    this.h = this.f475a;
                }
                this.f475a = 0L;
            } else {
                this.f475a++;
            }
        }
        char c2 = (char) i2;
        this.f479e = c2;
        return c2;
    }

    public final char c() throws IOException {
        char cB;
        do {
            cB = b();
            if (cB == 0) {
                break;
            }
        } while (cB <= ' ');
        return cB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0165, code lost:
    
        throw e("Substring bounds error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01bf, code lost:
    
        throw e("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() throws IOException {
        char c2 = c();
        if (c2 != '\"' && c2 != '\'') {
            if (c2 != '[') {
                if (c2 == '{') {
                    a();
                    return new c(this);
                }
                StringBuilder sb = new StringBuilder();
                while (c2 >= ' ' && ",:]}/\\\"[{;=#".indexOf(c2) < 0) {
                    sb.append(c2);
                    c2 = b();
                }
                if (!this.f476b) {
                    a();
                }
                String strTrim = sb.toString().trim();
                if (BuildConfig.FLAVOR.equals(strTrim)) {
                    throw e("Missing value");
                }
                if (BuildConfig.FLAVOR.equals(strTrim)) {
                    return strTrim;
                }
                if ("true".equalsIgnoreCase(strTrim)) {
                    return Boolean.TRUE;
                }
                if ("false".equalsIgnoreCase(strTrim)) {
                    return Boolean.FALSE;
                }
                if ("null".equalsIgnoreCase(strTrim)) {
                    return c.f473c;
                }
                char cCharAt = strTrim.charAt(0);
                if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '-') {
                    return strTrim;
                }
                try {
                    return c.k(strTrim);
                } catch (Exception unused) {
                    return strTrim;
                }
            }
            a();
            a aVar = new a();
            if (c() != '[') {
                throw e("A JSONArray text must start with '['");
            }
            char c3 = c();
            if (c3 == 0) {
                throw e("Expected a ',' or ']'");
            }
            if (c3 != ']') {
                a();
                while (true) {
                    char c4 = c();
                    ArrayList arrayList = aVar.f471a;
                    if (c4 == ',') {
                        a();
                        arrayList.add(c.f473c);
                    } else {
                        a();
                        arrayList.add(d());
                    }
                    char c5 = c();
                    if (c5 == 0) {
                        throw e("Expected a ',' or ']'");
                    }
                    if (c5 == ',') {
                        char c6 = c();
                        if (c6 == 0) {
                            throw e("Expected a ',' or ']'");
                        }
                        if (c6 == ']') {
                            break;
                        }
                        a();
                    } else if (c5 != ']') {
                        throw e("Expected a ',' or ']'");
                    }
                }
            }
            return aVar;
        }
        StringBuilder sb2 = new StringBuilder();
        loop2: while (true) {
            char cB = b();
            if (cB == 0 || cB == '\n' || cB == '\r') {
                break;
            }
            if (cB == '\\') {
                char cB2 = b();
                if (cB2 == '\"' || cB2 == '\'' || cB2 == '/' || cB2 == '\\') {
                    sb2.append(cB2);
                } else if (cB2 == 'b') {
                    sb2.append('\b');
                } else if (cB2 == 'f') {
                    sb2.append('\f');
                } else if (cB2 == 'n') {
                    sb2.append('\n');
                } else if (cB2 == 'r') {
                    sb2.append('\r');
                } else if (cB2 == 't') {
                    sb2.append('\t');
                } else {
                    if (cB2 != 'u') {
                        throw e("Illegal escape.");
                    }
                    try {
                        char[] cArr = new char[4];
                        for (int i2 = 0; i2 < 4; i2++) {
                            cArr[i2] = b();
                            if (this.f476b && !this.f481g) {
                                break loop2;
                            }
                        }
                        sb2.append((char) Integer.parseInt(new String(cArr), 16));
                    } catch (NumberFormatException e2) {
                        throw new b("Illegal escape." + toString(), e2);
                    }
                }
            } else {
                if (cB == c2) {
                    return sb2.toString();
                }
                sb2.append(cB);
            }
        }
    }

    public final b e(String str) {
        return new b(str + toString());
    }

    public final String toString() {
        return " at " + this.f477c + " [character " + this.f475a + " line " + this.f478d + "]";
    }
}
