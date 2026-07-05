package H0;

import j0.AbstractC0150d;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final h f413d = new h(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f414a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f415b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f416c;

    public h(byte[] bArr) {
        AbstractC0150d.e(bArr, "data");
        this.f414a = bArr;
    }

    public int a() {
        return this.f414a.length;
    }

    public String b() {
        byte[] bArr = this.f414a;
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b2 = bArr[i2];
            i2++;
            int i4 = i3 + 1;
            char[] cArr2 = I0.b.f465a;
            cArr[i3] = cArr2[(b2 >> 4) & 15];
            i3 += 2;
            cArr[i4] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.f414a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        AbstractC0150d.e(hVar, "other");
        int iA = a();
        int iA2 = hVar.a();
        int iMin = Math.min(iA, iA2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iD = d(i2) & 255;
            int iD2 = hVar.d(i2) & 255;
            if (iD == iD2) {
            }
        }
        if (iA == iA2) {
            return 0;
        }
    }

    public byte d(int i2) {
        return this.f414a[i2];
    }

    public boolean e(int i2, byte[] bArr, int i3, int i4) {
        AbstractC0150d.e(bArr, "other");
        if (i2 >= 0) {
            byte[] bArr2 = this.f414a;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && C0.f.a(bArr2, i2, i3, bArr, i4)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int iA = hVar.a();
            byte[] bArr = this.f414a;
            if (iA == bArr.length && hVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(h hVar, int i2) {
        AbstractC0150d.e(hVar, "other");
        return hVar.e(0, this.f414a, 0, i2);
    }

    public h g() {
        byte b2;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f414a;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i2];
            byte b4 = (byte) 65;
            if (b3 >= b4 && b3 <= (b2 = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC0150d.d(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b3 + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b5 = bArrCopyOf[i3];
                    if (b5 >= b4 && b5 <= b2) {
                        bArrCopyOf[i3] = (byte) (b5 + 32);
                    }
                }
                return new h(bArrCopyOf);
            }
            i2++;
        }
    }

    public final String h() {
        String str = this.f416c;
        if (str != null) {
            return str;
        }
        byte[] bArrC = c();
        AbstractC0150d.e(bArrC, "<this>");
        String str2 = new String(bArrC, q0.a.f2219a);
        this.f416c = str2;
        return str2;
    }

    public int hashCode() {
        int i2 = this.f415b;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f414a);
        this.f415b = iHashCode;
        return iHashCode;
    }

    public void i(e eVar, int i2) {
        AbstractC0150d.e(eVar, "buffer");
        eVar.s(this.f414a, i2);
    }

    public String toString() {
        h hVar;
        byte b2;
        int i2;
        byte[] bArr = this.f414a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                int i6 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b3 != 10 && b3 != 13 && ((b3 >= 0 && b3 <= 31) || (127 <= b3 && b3 <= 159))) || b3 == 65533) {
                    break;
                }
                i4 += b3 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b2 = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 <= 31) || (127 <= b2 && b2 <= 159))) || b2 == 65533) {
                            break loop0;
                        }
                        i4 += b2 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b3 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length > i7) {
                    byte b4 = bArr[i7];
                    if ((b4 & 192) == 128) {
                        int i8 = (b4 ^ 3968) ^ (b3 << 6);
                        if (i8 >= 128) {
                            i2 = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 <= 31) || (127 <= i8 && i8 <= 159))) || i8 == 65533) {
                                break;
                            }
                            i4 += i8 < 65536 ? 1 : 2;
                            i3 += 2;
                            i5 = i2;
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b3 >> 4) == -2) {
                int i9 = i3 + 2;
                if (length > i9) {
                    byte b5 = bArr[i3 + 1];
                    if ((b5 & 192) == 128) {
                        byte b6 = bArr[i9];
                        if ((b6 & 192) == 128) {
                            int i10 = ((b6 ^ (-123008)) ^ (b5 << 6)) ^ (b3 << 12);
                            if (i10 < 2048) {
                                if (i5 != 64) {
                                    break;
                                }
                            } else if (55296 > i10 || i10 > 57343) {
                                i2 = i5 + 1;
                                if (i5 == 64) {
                                    break;
                                }
                                if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 <= 31) || (127 <= i10 && i10 <= 159))) || i10 == 65533) {
                                    break;
                                }
                                i4 += i10 < 65536 ? 1 : 2;
                                i3 += 3;
                                i5 = i2;
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if ((b3 >> 3) == -2) {
                int i11 = i3 + 3;
                if (length > i11) {
                    byte b7 = bArr[i3 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i3 + 2];
                        if ((b8 & 192) == 128) {
                            byte b9 = bArr[i11];
                            if ((b9 & 192) == 128) {
                                int i12 = (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12)) ^ (b3 << 18);
                                if (i12 > 1114111) {
                                    if (i5 != 64) {
                                        break;
                                    }
                                } else if (55296 > i12 || i12 > 57343) {
                                    if (i12 >= 65536) {
                                        i2 = i5 + 1;
                                        if (i5 == 64) {
                                            break;
                                        }
                                        if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 <= 31) || (127 <= i12 && i12 <= 159))) || i12 == 65533) {
                                            break;
                                        }
                                        i4 += i12 < 65536 ? 1 : 2;
                                        i3 += 4;
                                        i5 = i2;
                                    } else if (i5 != 64) {
                                        break;
                                    }
                                } else if (i5 != 64) {
                                    break;
                                }
                            } else if (i5 != 64) {
                                break;
                            }
                        } else if (i5 != 64) {
                            break;
                        }
                    } else if (i5 != 64) {
                        break;
                    }
                } else if (i5 != 64) {
                    break;
                }
            } else if (i5 != 64) {
                break;
            }
        }
        i4 = -1;
        if (i4 != -1) {
            String strH = h();
            String strSubstring = strH.substring(0, i4);
            AbstractC0150d.d(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String strZ = q0.k.z(q0.k.z(q0.k.z(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i4 >= strH.length()) {
                return "[text=" + strZ + ']';
            }
            return "[size=" + bArr.length + " text=" + strZ + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            hVar = this;
        } else {
            C0.m.c(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            AbstractC0150d.d(bArrCopyOfRange, "copyOfRange(...)");
            hVar = new h(bArrCopyOfRange);
        }
        sb.append(hVar.b());
        sb.append("…]");
        return sb.toString();
    }
}
