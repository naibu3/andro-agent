package com.google.android.gms.internal.ads;

import admob.plus.cordova.Generated;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzanl {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static SpannedString zza(String str, String str2, List list) {
        char c;
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        char c3 = 0;
        int i = 0;
        while (i < str2.length()) {
            int length = i + 1;
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode == 3309) {
                        if (strSubstring.equals("gt")) {
                            c = 1;
                        }
                        if (c != 0) {
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i = iIndexOf + 1;
                    } else if (iHashCode == 3464) {
                        if (strSubstring.equals("lt")) {
                            c = 0;
                        }
                        if (c != 0) {
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i = iIndexOf + 1;
                    } else if (iHashCode != 96708) {
                        c = (iHashCode == 3374865 && strSubstring.equals("nbsp")) ? (char) 2 : (char) 65535;
                        if (c != 0) {
                            spannableStringBuilder.append(Typography.less);
                        } else if (c == 1) {
                            spannableStringBuilder.append(Typography.greater);
                        } else if (c == 2) {
                            spannableStringBuilder.append(' ');
                        } else if (c != 3) {
                            zzfk.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                        } else {
                            spannableStringBuilder.append(Typography.amp);
                        }
                        if (iIndexOf == iIndexOf2) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i = iIndexOf + 1;
                    } else {
                        if (strSubstring.equals("amp")) {
                            c = 3;
                        }
                        if (c != 0) {
                        }
                        if (iIndexOf == iIndexOf2) {
                        }
                        i = iIndexOf + 1;
                    }
                    c3 = 0;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i2 = length - 2;
                char c4 = str2.charAt(i2) == '/' ? (char) 1 : c3;
                int i3 = i + (cCharAt2 == '/' ? 2 : 1);
                if (c4 == 0) {
                    i2 = length - 1;
                }
                String strSubstring2 = str2.substring(i3, i2);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzeq.zzd(!strTrim.isEmpty());
                    int i4 = zzgd.zza;
                    String str3 = strTrim.split("[ \\.]", 2)[c3];
                    int iHashCode2 = str3.hashCode();
                    if (iHashCode2 == 98) {
                        if (str3.equals("b")) {
                            c2 = 0;
                        }
                        switch (c2) {
                        }
                    } else if (iHashCode2 == 99) {
                        if (str3.equals("c")) {
                            c2 = 1;
                        }
                        switch (c2) {
                        }
                    } else if (iHashCode2 == 105) {
                        if (str3.equals("i")) {
                            c2 = 2;
                        }
                        switch (c2) {
                        }
                    } else if (iHashCode2 == 3650) {
                        if (str3.equals("rt")) {
                            c2 = 5;
                        }
                        switch (c2) {
                        }
                    } else if (iHashCode2 == 3314158) {
                        if (str3.equals("lang")) {
                            c2 = 3;
                        }
                        switch (c2) {
                        }
                    } else if (iHashCode2 == 3511770) {
                        if (str3.equals("ruby")) {
                            c2 = 4;
                        }
                        switch (c2) {
                        }
                    } else if (iHashCode2 != 117) {
                        c2 = (iHashCode2 == 118 && str3.equals("v")) ? (char) 7 : (char) 65535;
                        switch (c2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (cCharAt2 != '/') {
                                    if (c4 == 0) {
                                        arrayDeque.push(zzani.zza(strSubstring2, spannableStringBuilder.length()));
                                        break;
                                    }
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        zzani zzaniVar = (zzani) arrayDeque.pop();
                                        zzg(str, zzaniVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new zzanh(zzaniVar, spannableStringBuilder.length(), null));
                                        }
                                        if (zzaniVar.zza.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    } else {
                        if (str3.equals("u")) {
                            c2 = 6;
                        }
                        switch (c2) {
                        }
                    }
                    c3 = 0;
                }
            }
            i = length;
            c3 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzg(str, (zzani) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzg(str, zzani.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    static zzeg zzb(String str) {
        zzank zzankVar = new zzank();
        zzh(str, zzankVar);
        return zzankVar.zza();
    }

    public static zzane zzc(zzfu zzfuVar, List list) {
        String strZzy = zzfuVar.zzy(zzfxs.zzc);
        if (strZzy != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzy);
            if (matcher.matches()) {
                return zze(null, matcher, zzfuVar, list);
            }
            String strZzy2 = zzfuVar.zzy(zzfxs.zzc);
            if (strZzy2 != null) {
                Matcher matcher2 = pattern.matcher(strZzy2);
                if (matcher2.matches()) {
                    return zze(strZzy.trim(), matcher2, zzfuVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzani zzaniVar) {
        List listZzf = zzf(list, str, zzaniVar);
        for (int i = 0; i < listZzf.size(); i++) {
            zzand zzandVar = ((zzanj) listZzf.get(i)).zzb;
            if (zzandVar.zze() != -1) {
                return zzandVar.zze();
            }
        }
        return -1;
    }

    private static zzane zze(String str, Matcher matcher, zzfu zzfuVar, List list) {
        zzank zzankVar = new zzank();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzankVar.zza = zzann.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzankVar.zzb = zzann.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zzh(strGroup3, zzankVar);
            StringBuilder sb = new StringBuilder();
            String strZzy = zzfuVar.zzy(zzfxs.zzc);
            while (!TextUtils.isEmpty(strZzy)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzy.trim());
                strZzy = zzfuVar.zzy(zzfxs.zzc);
            }
            zzankVar.zzc = zza(str, sb.toString(), list);
            return new zzane(zzankVar.zza().zzp(), zzankVar.zza, zzankVar.zzb);
        } catch (NumberFormatException unused) {
            zzfk.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzani zzaniVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzand zzandVar = (zzand) list.get(i);
            int iZzf = zzandVar.zzf(str, zzaniVar.zza, zzaniVar.zzd, zzaniVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new zzanj(iZzf, zzandVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzg(String str, zzani zzaniVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        int i = zzaniVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaniVar.zza;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    c = (iHashCode == 118 && str2.equals("v")) ? (char) 6 : (char) 65535;
                                } else if (str2.equals("u")) {
                                    c = 3;
                                }
                            } else if (str2.equals("c")) {
                                c = 4;
                            }
                        } else if (str2.equals("b")) {
                            c = 0;
                        }
                    } else if (str2.equals("ruby")) {
                        c = 2;
                    }
                } else if (str2.equals("lang")) {
                    c = 5;
                }
            } else if (str2.equals("i")) {
                c = 1;
            }
        } else if (str2.equals("")) {
            c = 7;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                int iZzd = zzd(list2, str, zzaniVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzanh.zza);
                int i3 = zzaniVar.zzb;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((zzanh) arrayList.get(i4)).zzb.zza)) {
                        zzanh zzanhVar = (zzanh) arrayList.get(i4);
                        int iZzd2 = zzd(list2, str, zzanhVar.zzb);
                        if (iZzd2 == i2) {
                            iZzd2 = iZzd != i2 ? iZzd : 1;
                        }
                        int i5 = zzanhVar.zzb.zzb - length2;
                        int i6 = zzanhVar.zzc - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new zzen(charSequenceSubSequence.toString(), iZzd2), i3, i5, 33);
                        length2 += charSequenceSubSequence.length();
                        i3 = i5;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : zzaniVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzf = zzf(list2, str, zzaniVar);
        for (int i7 = 0; i7 < listZzf.size(); i7++) {
            zzand zzandVar = ((zzanj) listZzf.get(i7)).zzb;
            if (zzandVar != null) {
                if (zzandVar.zzg() != -1) {
                    zzeo.zza(spannableStringBuilder, new StyleSpan(zzandVar.zzg()), i, length, 33);
                }
                if (zzandVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzandVar.zzy()) {
                    zzeo.zza(spannableStringBuilder, new ForegroundColorSpan(zzandVar.zzc()), i, length, 33);
                }
                if (zzandVar.zzx()) {
                    zzeo.zza(spannableStringBuilder, new BackgroundColorSpan(zzandVar.zzb()), i, length, 33);
                }
                if (zzandVar.zzr() != null) {
                    zzeo.zza(spannableStringBuilder, new TypefaceSpan(zzandVar.zzr()), i, length, 33);
                }
                int iZzd3 = zzandVar.zzd();
                if (iZzd3 == 1) {
                    zzeo.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzandVar.zza(), true), i, length, 33);
                } else if (iZzd3 == 2) {
                    zzeo.zza(spannableStringBuilder, new RelativeSizeSpan(zzandVar.zza()), i, length, 33);
                } else if (iZzd3 == 3) {
                    zzeo.zza(spannableStringBuilder, new RelativeSizeSpan(zzandVar.zza() / 100.0f), i, length, 33);
                }
                if (zzandVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzem(), i, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(String str, zzank zzankVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                char c = 65535;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals(Generated.Actions.START)) {
                                    c = 0;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            i2 = 0;
                        } else if (c == 1 || c == 2) {
                            i2 = 1;
                        } else if (c != 3) {
                            zzfk.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzankVar.zzg = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzankVar.zze = zzann.zza(strGroup2);
                        zzankVar.zzf = 0;
                    } else {
                        zzankVar.zze = Integer.parseInt(strGroup2);
                        zzankVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals(Generated.Actions.START)) {
                                c = 0;
                                break;
                            }
                            break;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            i = 4;
                        } else if (c == 2 || c == 3) {
                            i = 2;
                        } else if (c != 4) {
                            i = 5;
                            if (c != 5) {
                                zzfk.zzf("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                            }
                        } else {
                            i = 3;
                        }
                    }
                    zzankVar.zzd = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals(Generated.Actions.START)) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1) {
                            i = 0;
                        } else if (c != 2 && c != 3) {
                            if (c == 4 || c == 5) {
                                i = 2;
                            } else {
                                zzfk.zzf("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzankVar.zzi = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzankVar.zzh = zzann.zza(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzankVar.zzj = zzann.zza(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            c = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        c = 1;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            zzfk.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzankVar.zzk = i;
                } else {
                    zzfk.zzf("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                zzfk.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
