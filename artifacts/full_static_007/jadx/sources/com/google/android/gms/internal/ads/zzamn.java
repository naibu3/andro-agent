package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzamn {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd = Pattern.compile(String.format(Locale.US, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final Pattern zze = Pattern.compile(String.format(Locale.US, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    private static final Pattern zzf = Pattern.compile("\\\\an(\\d+)");
    public final int zza;
    public final PointF zzb;

    private zzamn(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:23:0x0082, B:25:0x008e, B:27:0x0094, B:28:0x0099), top: B:37:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamn zza(String str) throws NumberFormatException {
        Matcher matcher;
        int iZzd;
        Matcher matcher2;
        Matcher matcher3;
        boolean zFind;
        boolean zFind2;
        PointF pointF;
        String strGroup;
        String strGroup2;
        Matcher matcher4 = zzc.matcher(str);
        PointF pointF2 = null;
        int i = -1;
        while (matcher4.find()) {
            String strGroup3 = matcher4.group(1);
            strGroup3.getClass();
            try {
                matcher2 = zzd.matcher(strGroup3);
                matcher3 = zze.matcher(strGroup3);
                zFind = matcher2.find();
                zFind2 = matcher3.find();
            } catch (RuntimeException unused) {
            }
            if (zFind) {
                if (zFind2) {
                    zzfk.zze("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + strGroup3 + "'");
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            } else if (zFind2) {
                String strGroup4 = matcher3.group(1);
                String strGroup5 = matcher3.group(2);
                strGroup = strGroup4;
                strGroup2 = strGroup5;
            } else {
                pointF = null;
                if (pointF != null) {
                    pointF2 = pointF;
                }
                try {
                    matcher = zzf.matcher(strGroup3);
                    if (matcher.find()) {
                        iZzd = -1;
                    } else {
                        String strGroup6 = matcher.group(1);
                        if (strGroup6 == null) {
                            throw null;
                        }
                        iZzd = zzamo.zzd(strGroup6);
                    }
                    if (iZzd == -1) {
                        i = iZzd;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            if (strGroup == null) {
                throw null;
            }
            float f = Float.parseFloat(strGroup.trim());
            if (strGroup2 == null) {
                throw null;
            }
            pointF = new PointF(f, Float.parseFloat(strGroup2.trim()));
            if (pointF != null) {
            }
            matcher = zzf.matcher(strGroup3);
            if (matcher.find()) {
            }
            if (iZzd == -1) {
            }
        }
        return new zzamn(i, pointF2);
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
