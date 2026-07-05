package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzams {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzamy zzf;
    public final String zzg;
    public final String zzh;
    public final zzams zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    public static zzams zzb(String str, long j, long j2, zzamy zzamyVar, String[] strArr, String str2, String str3, zzams zzamsVar) {
        return new zzams(str, null, j, j2, zzamyVar, strArr, str2, str3, zzamsVar);
    }

    public static zzams zzc(String str) {
        return new zzams(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzeg zzegVar = new zzeg();
            zzegVar.zzl(new SpannableStringBuilder());
            map.put(str, zzegVar);
        }
        CharSequence charSequenceZzq = ((zzeg) map.get(str)).zzq();
        charSequenceZzq.getClass();
        return (SpannableStringBuilder) charSequenceZzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzams zzamsVar = (zzams) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzamsVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j, str, list);
        }
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        zzams zzamsVar;
        int i;
        int iZzf;
        zzamy zzamyVarZza;
        int i2;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            for (Map.Entry entry : this.zzl.entrySet()) {
                String str3 = (String) entry.getKey();
                int iIntValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzeg zzegVar = (zzeg) map3.get(str3);
                    zzegVar.getClass();
                    zzamw zzamwVar = (zzamw) map2.get(str2);
                    zzamwVar.getClass();
                    zzamy zzamyVarZza2 = zzamx.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzegVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzegVar.zzl(spannableStringBuilder);
                    }
                    if (zzamyVarZza2 != null) {
                        zzams zzamsVar2 = this.zzi;
                        if (zzamyVarZza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzamyVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamyVarZza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzamyVarZza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzamyVarZza2.zzH()) {
                            zzeo.zza(spannableStringBuilder, new ForegroundColorSpan(zzamyVarZza2.zzd()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamyVarZza2.zzG()) {
                            zzeo.zza(spannableStringBuilder, new BackgroundColorSpan(zzamyVarZza2.zzc()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamyVarZza2.zzD() != null) {
                            zzeo.zza(spannableStringBuilder, new TypefaceSpan(zzamyVarZza2.zzD()), iIntValue, iIntValue2, 33);
                        }
                        if (zzamyVarZza2.zzk() != null) {
                            zzamr zzamrVarZzk = zzamyVarZza2.zzk();
                            zzamrVarZzk.getClass();
                            int i3 = zzamrVarZzk.zza;
                            if (i3 == -1) {
                                int i4 = zzamwVar.zzj;
                                i3 = (i4 == 2 || i4 == 1) ? 3 : 1;
                                i2 = 1;
                            } else {
                                i2 = zzamrVarZzk.zzb;
                            }
                            int i5 = zzamrVarZzk.zzc;
                            if (i5 == -2) {
                                i5 = 1;
                            }
                            zzeo.zza(spannableStringBuilder, new zzep(i3, i2, i5), iIntValue, iIntValue2, 33);
                        }
                        int iZzg = zzamyVarZza2.zzg();
                        if (iZzg == 2) {
                            while (true) {
                                if (zzamsVar2 == null) {
                                    zzamsVar2 = null;
                                    break;
                                }
                                zzamy zzamyVarZza3 = zzamx.zza(zzamsVar2.zzf, zzamsVar2.zzj, map);
                                if (zzamyVarZza3 != null && zzamyVarZza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzamsVar2 = zzamsVar2.zzi;
                                }
                            }
                            if (zzamsVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzamsVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzamsVar = null;
                                        break;
                                    }
                                    zzams zzamsVar3 = (zzams) arrayDeque.pop();
                                    zzamy zzamyVarZza4 = zzamx.zza(zzamsVar3.zzf, zzamsVar3.zzj, map);
                                    if (zzamyVarZza4 != null && zzamyVarZza4.zzg() == 3) {
                                        zzamsVar = zzamsVar3;
                                        break;
                                    }
                                    for (int iZza = zzamsVar3.zza() - 1; iZza >= 0; iZza--) {
                                        arrayDeque.push(zzamsVar3.zzd(iZza));
                                    }
                                }
                                if (zzamsVar != null) {
                                    if (zzamsVar.zza() != 1 || zzamsVar.zzd(0).zzb == null) {
                                        zzfk.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzamsVar.zzd(0).zzb;
                                        int i6 = zzgd.zza;
                                        zzamy zzamyVarZza5 = zzamx.zza(zzamsVar.zzf, zzamsVar.zzj, map);
                                        if (zzamyVarZza5 != null) {
                                            iZzf = zzamyVarZza5.zzf();
                                            i = -1;
                                        } else {
                                            i = -1;
                                            iZzf = -1;
                                        }
                                        if (iZzf == i && (zzamyVarZza = zzamx.zza(zzamsVar2.zzf, zzamsVar2.zzj, map)) != null) {
                                            iZzf = zzamyVarZza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzen(str4, iZzf), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzg == 3 || iZzg == 4) {
                            spannableStringBuilder.setSpan(new zzamq(), iIntValue, iIntValue2, 33);
                        }
                        if (zzamyVarZza2.zzF()) {
                            zzeo.zza(spannableStringBuilder, new zzem(), iIntValue, iIntValue2, 33);
                        }
                        int iZze = zzamyVarZza2.zze();
                        if (iZze == 1) {
                            zzeo.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzamyVarZza2.zza(), true), iIntValue, iIntValue2, 33);
                        } else if (iZze == 2) {
                            zzeo.zza(spannableStringBuilder, new RelativeSizeSpan(zzamyVarZza2.zza()), iIntValue, iIntValue2, 33);
                        } else if (iZze == 3) {
                            zzeo.zza(spannableStringBuilder, new RelativeSizeSpan(zzamyVarZza2.zza() / 100.0f), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzamyVarZza2.zzb() != Float.MAX_VALUE) {
                                zzegVar.zzj((zzamyVarZza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zzamyVarZza2.zzj() != null) {
                                zzegVar.zzm(zzamyVarZza2.zzj());
                            }
                            if (zzamyVarZza2.zzi() != null) {
                                zzegVar.zzg(zzamyVarZza2.zzi());
                            }
                        }
                    }
                }
            }
            for (int i7 = 0; i7 < zza(); i7++) {
                zzd(i7).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if ("metadata".equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z) {
            SpannableStringBuilder spannableStringBuilderZzi = zzi(str, map);
            String str2 = this.zzb;
            str2.getClass();
            spannableStringBuilderZzi.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.zza) && z) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.zzk;
                String str3 = (String) entry.getKey();
                CharSequence charSequenceZzq = ((zzeg) entry.getValue()).zzq();
                charSequenceZzq.getClass();
                map2.put(str3, Integer.valueOf(charSequenceZzq.length()));
            }
            boolean zEquals = "p".equals(this.zza);
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzm(j, z || zEquals, str, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str, map);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap map3 = this.zzl;
                String str4 = (String) entry2.getKey();
                CharSequence charSequenceZzq2 = ((zzeg) entry2.getValue()).zzq();
                charSequenceZzq2.getClass();
                map3.put(str4, Integer.valueOf(charSequenceZzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzams zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzams) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzamw zzamwVar = (zzamw) map2.get(pair.first);
                zzamwVar.getClass();
                zzeg zzegVar = new zzeg();
                zzegVar.zzc(bitmapDecodeByteArray);
                zzegVar.zzh(zzamwVar.zzb);
                zzegVar.zzi(0);
                zzegVar.zze(zzamwVar.zzc, 0);
                zzegVar.zzf(zzamwVar.zze);
                zzegVar.zzk(zzamwVar.zzf);
                zzegVar.zzd(zzamwVar.zzg);
                zzegVar.zzo(zzamwVar.zzj);
                arrayList2.add(zzegVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzamw zzamwVar2 = (zzamw) map2.get(entry.getKey());
            zzamwVar2.getClass();
            zzeg zzegVar2 = (zzeg) entry.getValue();
            CharSequence charSequenceZzq = zzegVar2.zzq();
            charSequenceZzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzq;
            for (zzamq zzamqVar : (zzamq[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzamq.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzamqVar), spannableStringBuilder.getSpanEnd(zzamqVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzegVar2.zze(zzamwVar2.zzc, zzamwVar2.zzd);
            zzegVar2.zzf(zzamwVar2.zze);
            zzegVar2.zzh(zzamwVar2.zzb);
            zzegVar2.zzk(zzamwVar2.zzf);
            zzegVar2.zzn(zzamwVar2.zzi, zzamwVar2.zzh);
            zzegVar2.zzo(zzamwVar2.zzj);
            arrayList2.add(zzegVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzams zzamsVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzamsVar);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    private zzams(String str, String str2, long j, long j2, zzamy zzamyVar, String[] strArr, String str3, String str4, zzams zzamsVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzamyVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzamsVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }
}
