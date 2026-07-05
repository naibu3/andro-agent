package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzamp implements zzalv {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzfu zze = new zzfu();

    public static float zzb(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = j + (Long.parseLong(strGroup2) * 60000);
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = j2 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0197  */
    @Override // com.google.android.gms.internal.ads.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzalu zzaluVar, zzev zzevVar) throws NumberFormatException {
        String str;
        char c;
        char c2;
        int i3;
        zzei zzeiVarZzp;
        zzamp zzampVar = this;
        zzampVar.zze.zzI(bArr, i + i2);
        zzampVar.zze.zzK(i);
        Charset charsetZzB = zzampVar.zze.zzB();
        if (charsetZzB == null) {
            charsetZzB = zzfxs.zzc;
        }
        while (true) {
            String strZzy = zzampVar.zze.zzy(charsetZzB);
            if (strZzy == null) {
                return;
            }
            if (strZzy.length() != 0) {
                try {
                    Integer.parseInt(strZzy);
                    String strZzy2 = zzampVar.zze.zzy(charsetZzB);
                    if (strZzy2 == null) {
                        zzfk.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzy2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        int i4 = 0;
                        zzampVar.zzc.setLength(0);
                        zzampVar.zzd.clear();
                        String strZzy3 = zzampVar.zze.zzy(charsetZzB);
                        while (!TextUtils.isEmpty(strZzy3)) {
                            if (zzampVar.zzc.length() > 0) {
                                zzampVar.zzc.append("<br>");
                            }
                            StringBuilder sb = zzampVar.zzc;
                            ArrayList arrayList = zzampVar.zzd;
                            String strTrim = strZzy3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i5 = i4;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i5;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i5 += length;
                            }
                            sb.append(sb2.toString());
                            strZzy3 = zzampVar.zze.zzy(charsetZzB);
                            i4 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(zzampVar.zzc.toString());
                        int i6 = 0;
                        while (true) {
                            if (i6 < zzampVar.zzd.size()) {
                                str = (String) zzampVar.zzd.get(i6);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i6++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzeg zzegVar = new zzeg();
                        zzegVar.zzl(spannedFromHtml);
                        if (str == null) {
                            zzeiVarZzp = zzegVar.zzp();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        c = 65535;
                                        break;
                                    } else {
                                        c = 0;
                                        break;
                                    }
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                            }
                            if (c == 0 || c == 1 || c == 2) {
                                zzegVar.zzi(0);
                            } else if (c == 3 || c == 4 || c == 5) {
                                zzegVar.zzi(2);
                            } else {
                                zzegVar.zzi(1);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        c2 = 65535;
                                        break;
                                    } else {
                                        c2 = 0;
                                        break;
                                    }
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c2 = 4;
                                        break;
                                    }
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c2 = 5;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 == 0 || c2 == 1) {
                                i3 = 2;
                            } else if (c2 != 2) {
                                if (c2 == 3 || c2 == 4 || c2 == 5) {
                                    zzegVar.zzf(0);
                                } else {
                                    zzegVar.zzf(1);
                                }
                                zzegVar.zzh(zzb(zzegVar.zzb()));
                                zzegVar.zze(zzb(zzegVar.zza()), 0);
                                zzeiVarZzp = zzegVar.zzp();
                            } else {
                                i3 = 2;
                            }
                            zzegVar.zzf(i3);
                            zzegVar.zzh(zzb(zzegVar.zzb()));
                            zzegVar.zze(zzb(zzegVar.zza()), 0);
                            zzeiVarZzp = zzegVar.zzp();
                        }
                        zzevVar.zza(new zzaln(zzgbc.zzn(zzeiVarZzp), jZzc, jZzc2 - jZzc));
                    } else {
                        zzfk.zzf("SubripParser", "Skipping invalid timing: ".concat(strZzy2));
                    }
                } catch (NumberFormatException unused) {
                    zzfk.zzf("SubripParser", "Skipping invalid index: ".concat(strZzy));
                }
            }
            zzampVar = this;
        }
    }
}
