package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.work.WorkRequest;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaml implements zzalv {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzamk zzc;
    private final zzfu zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaml() {
        this(null);
    }

    private static float zzb(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = zzgd.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zze(zzfu zzfuVar, Charset charset) throws NumberFormatException {
        while (true) {
            String strZzy = zzfuVar.zzy(charset);
            if (strZzy == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzy)) {
                while (true) {
                    String strZzy2 = zzfuVar.zzy(charset);
                    if (strZzy2 == null || (zzfuVar.zzb() != 0 && zzfuVar.zza(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strZzy2.split(":");
                    if (strArrSplit.length == 2) {
                        char c = 0;
                        String strZza = zzfxm.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    c = 65535;
                                    break;
                                }
                                break;
                            case 1879649549:
                                if (strZza.equals("playresy")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            this.zzf = Float.parseFloat(strArrSplit[1].trim());
                        } else if (c == 1) {
                            try {
                                this.zzg = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzy)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzamm zzammVarZza = null;
                while (true) {
                    String strZzy3 = zzfuVar.zzy(charset);
                    if (strZzy3 != null && (zzfuVar.zzb() == 0 || zzfuVar.zza(charset) != '[')) {
                        if (strZzy3.startsWith("Format:")) {
                            zzammVarZza = zzamm.zza(strZzy3);
                        } else if (strZzy3.startsWith("Style:")) {
                            if (zzammVarZza == null) {
                                zzfk.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzy3));
                            } else {
                                zzamo zzamoVarZzb = zzamo.zzb(strZzy3, zzammVarZza);
                                if (zzamoVarZzb != null) {
                                    linkedHashMap.put(zzamoVarZzb.zza, zzamoVarZzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzy)) {
                zzfk.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzy)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    @Override // com.google.android.gms.internal.ads.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, zzalu zzaluVar, zzev zzevVar) throws NumberFormatException {
        int i3;
        Charset charset;
        zzfu zzfuVar;
        zzamk zzamkVar;
        long j;
        int i4;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int i7;
        Integer num;
        int i8;
        zzaml zzamlVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzamlVar.zzd.zzI(bArr, i + i2);
        zzamlVar.zzd.zzK(i);
        Charset charsetZzB = zzamlVar.zzd.zzB();
        if (charsetZzB == null) {
            charsetZzB = zzfxs.zzc;
        }
        if (!zzamlVar.zzb) {
            zzamlVar.zze(zzamlVar.zzd, charsetZzB);
        }
        zzfu zzfuVar2 = zzamlVar.zzd;
        zzamk zzamkVarZza = zzamlVar.zzb ? zzamlVar.zzc : null;
        while (true) {
            String strZzy = zzfuVar2.zzy(charsetZzB);
            if (strZzy == null) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    List list = (List) arrayList.get(i9);
                    if (!list.isEmpty()) {
                        if (i9 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        zzevVar.zza(new zzaln(list, ((Long) arrayList2.get(i9)).longValue(), ((Long) arrayList2.get(i9 + 1)).longValue() - ((Long) arrayList2.get(i9)).longValue()));
                        i3 = 1;
                    } else if (i9 != 0) {
                        i3 = 1;
                    } else {
                        i9 = 0;
                        if (i9 != arrayList.size() - 1) {
                        }
                    }
                    i9 += i3;
                }
                return;
            }
            if (strZzy.startsWith("Format:")) {
                zzamkVarZza = zzamk.zza(strZzy);
            } else if (strZzy.startsWith("Dialogue:")) {
                if (zzamkVarZza == null) {
                    zzfk.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzy));
                } else {
                    zzeq.zzd(strZzy.startsWith("Dialogue:"));
                    String[] strArrSplit = strZzy.substring(9).split(",", zzamkVarZza.zze);
                    if (strArrSplit.length != zzamkVarZza.zze) {
                        zzfk.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzy));
                    } else {
                        long jZzd = zzd(strArrSplit[zzamkVarZza.zza]);
                        if (jZzd == -9223372036854775807L) {
                            zzfk.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzy));
                        } else {
                            long jZzd2 = zzd(strArrSplit[zzamkVarZza.zzb]);
                            if (jZzd2 == -9223372036854775807L) {
                                zzfk.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzy));
                            } else {
                                Map map = zzamlVar.zze;
                                zzamo zzamoVar = (map == null || (i8 = zzamkVarZza.zzc) == -1) ? null : (zzamo) map.get(strArrSplit[i8].trim());
                                String str = strArrSplit[zzamkVarZza.zzd];
                                zzamn zzamnVarZza = zzamn.zza(str);
                                String strReplace = zzamn.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f = zzamlVar.zzf;
                                float f2 = zzamlVar.zzg;
                                SpannableString spannableString = new SpannableString(strReplace);
                                zzeg zzegVar = new zzeg();
                                zzegVar.zzl(spannableString);
                                charset = charsetZzB;
                                if (zzamoVar != null) {
                                    Integer num2 = zzamoVar.zzc;
                                    zzfuVar = zzfuVar2;
                                    if (num2 != null) {
                                        zzamkVar = zzamkVarZza;
                                        j = jZzd2;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        zzamkVar = zzamkVarZza;
                                        j = jZzd2;
                                    }
                                    if (zzamoVar.zzj == 3 && (num = zzamoVar.zzd) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f3 = zzamoVar.zze;
                                    if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                        zzegVar.zzn(f3 / f2, 1);
                                    }
                                    if (!zzamoVar.zzf) {
                                        i6 = 33;
                                        i7 = 0;
                                        if (zzamoVar.zzg) {
                                            i4 = 2;
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                        if (zzamoVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i7, spannableString.length(), i6);
                                        }
                                        if (zzamoVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i7, spannableString.length(), i6);
                                        }
                                    } else if (zzamoVar.zzg) {
                                        i6 = 33;
                                        i7 = 0;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i6 = 33;
                                        i7 = 0;
                                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                    }
                                    i4 = 2;
                                    if (zzamoVar.zzh) {
                                    }
                                    if (zzamoVar.zzi) {
                                    }
                                } else {
                                    zzfuVar = zzfuVar2;
                                    zzamkVar = zzamkVarZza;
                                    j = jZzd2;
                                    i4 = 2;
                                }
                                int i10 = zzamnVarZza.zza;
                                if (i10 == -1) {
                                    i10 = zzamoVar != null ? zzamoVar.zzb : -1;
                                }
                                switch (i10) {
                                    case 0:
                                    default:
                                        zzfk.zzf("SsaParser", "Unknown alignment: " + i10);
                                    case -1:
                                        alignment = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        break;
                                }
                                zzegVar.zzm(alignment);
                                int i11 = Integer.MIN_VALUE;
                                switch (i10) {
                                    case 0:
                                    default:
                                        zzfk.zzf("SsaParser", "Unknown alignment: " + i10);
                                    case -1:
                                        i5 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i5 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i5 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i5 = i4;
                                        break;
                                }
                                zzegVar.zzi(i5);
                                switch (i10) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        zzfk.zzf("SsaParser", "Unknown alignment: " + i10);
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i11 = i4;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i11 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i11 = 0;
                                        break;
                                }
                                zzegVar.zzf(i11);
                                PointF pointF = zzamnVarZza.zzb;
                                if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                    zzegVar.zzh(zzb(zzegVar.zzb()));
                                    zzegVar.zze(zzb(zzegVar.zza()), 0);
                                } else {
                                    zzegVar.zzh(pointF.x / f);
                                    zzegVar.zze(zzamnVarZza.zzb.y / f2, 0);
                                }
                                zzei zzeiVarZzp = zzegVar.zzp();
                                int iZzc = zzc(j, arrayList2, arrayList);
                                for (int iZzc2 = zzc(jZzd, arrayList2, arrayList); iZzc2 < iZzc; iZzc2++) {
                                    ((List) arrayList.get(iZzc2)).add(zzeiVarZzp);
                                }
                                zzamlVar = this;
                                charsetZzB = charset;
                                zzfuVar2 = zzfuVar;
                                zzamkVarZza = zzamkVar;
                            }
                        }
                    }
                }
                charset = charsetZzB;
                zzfuVar = zzfuVar2;
                zzamkVar = zzamkVarZza;
                zzamlVar = this;
                charsetZzB = charset;
                zzfuVar2 = zzfuVar;
                zzamkVarZza = zzamkVar;
            } else {
                charset = charsetZzB;
                zzfuVar = zzfuVar2;
                zzamkVar = zzamkVarZza;
                zzamlVar = this;
                charsetZzB = charset;
                zzfuVar2 = zzfuVar;
                zzamkVarZza = zzamkVar;
            }
        }
    }

    public zzaml(List list) throws NumberFormatException {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzfu();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzA = zzgd.zzA((byte[]) list.get(0));
        zzeq.zzd(strZzA.startsWith("Format:"));
        zzamk zzamkVarZza = zzamk.zza(strZzA);
        zzamkVarZza.getClass();
        this.zzc = zzamkVarZza;
        zze(new zzfu((byte[]) list.get(1)), zzfxs.zzc);
    }
}
