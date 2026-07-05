package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzamo {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamo(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        if (r5 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamo zzb(String str, zzamm zzammVar) throws NumberFormatException {
        float f;
        int i;
        String strTrim;
        zzeq.zzd(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = zzammVar.zzk;
        if (length != i2) {
            zzfk.zzf("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i2), Integer.valueOf(length), str));
            return null;
        }
        try {
            String strTrim2 = strArrSplit[zzammVar.zza].trim();
            int i3 = zzammVar.zzb;
            int iZzd = i3 != -1 ? zzd(strArrSplit[i3].trim()) : -1;
            int i4 = zzammVar.zzc;
            Integer numZzc = i4 != -1 ? zzc(strArrSplit[i4].trim()) : null;
            int i5 = zzammVar.zzd;
            Integer numZzc2 = i5 != -1 ? zzc(strArrSplit[i5].trim()) : null;
            int i6 = zzammVar.zze;
            if (i6 != -1) {
                String strTrim3 = strArrSplit[i6].trim();
                try {
                    f = Float.parseFloat(strTrim3);
                } catch (NumberFormatException e) {
                    zzfk.zzg("SsaStyle", "Failed to parse font size: '" + strTrim3 + "'", e);
                }
            } else {
                f = -3.4028235E38f;
            }
            int i7 = zzammVar.zzf;
            boolean z = i7 != -1 && zze(strArrSplit[i7].trim());
            int i8 = zzammVar.zzg;
            boolean z2 = i8 != -1 && zze(strArrSplit[i8].trim());
            int i9 = zzammVar.zzh;
            boolean z3 = i9 != -1 && zze(strArrSplit[i9].trim());
            int i10 = zzammVar.zzi;
            boolean z4 = i10 != -1 && zze(strArrSplit[i10].trim());
            int i11 = zzammVar.zzj;
            if (i11 != -1) {
                strTrim = strArrSplit[i11].trim();
                try {
                    i = Integer.parseInt(strTrim.trim());
                    if (i != 1) {
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i = -1;
            }
            return new zzamo(strTrim2, iZzd, numZzc, numZzc2, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            zzfk.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
        zzfk.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim)));
        i = -1;
        return new zzamo(strTrim2, iZzd, numZzc, numZzc2, f, z, z2, z3, z4, i);
    }

    public static Integer zzc(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzeq.zzd(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgea.zzb(((j >> 24) & 255) ^ 255), zzgea.zzb(j & 255), zzgea.zzb((j >> 8) & 255), zzgea.zzb((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzfk.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) throws NumberFormatException {
        int i;
        try {
            i = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                zzfk.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            zzfk.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
