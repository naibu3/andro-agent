package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgdp {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zza(double d, RoundingMode roundingMode) {
        double dRint;
        long j;
        long j2;
        if (!zzgdq.zza(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzgdo.zza[roundingMode.ordinal()]) {
            case 1:
                zzgdv.zzb(zzb(d));
                dRint = d;
                if (((-9.223372036854776E18d) - dRint < 1.0d) && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d < 0.0d && !zzb(d)) {
                    j = (long) d;
                    j2 = -1;
                    dRint = j + j2;
                    if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                    }
                }
                dRint = d;
                if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                }
                break;
            case 3:
                if (d > 0.0d && !zzb(d)) {
                    j = (long) d;
                    j2 = 1;
                    dRint = j + j2;
                    if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                    }
                }
                dRint = d;
                if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                }
                break;
            case 4:
                dRint = d;
                if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                }
                break;
            case 5:
                if (!zzb(d)) {
                    j = (long) d;
                    j2 = d > 0.0d ? 1 : -1;
                    dRint = j + j2;
                    if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                    }
                }
                dRint = d;
                if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                }
                break;
            case 6:
                dRint = Math.rint(d);
                if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                }
                break;
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d + Math.copySign(0.5d, d);
                }
                if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                }
                break;
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                }
                if (((-9.223372036854776E18d) - dRint < 1.0d) & (dRint < 9.223372036854776E18d)) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzb(double d) {
        if (!zzgdq.zza(d)) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        zzfyg.zzf(zzgdq.zza(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return 52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d);
    }
}
