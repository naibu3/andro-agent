package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzze extends zzzj implements zzmo {
    private static final zzgcn zzb = zzgcn.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzyb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Context zza;
    private final Object zzc;
    private final boolean zzd;
    private zzys zze;
    private zzyx zzf;
    private zzk zzg;
    private final zzxx zzh;

    public zzze(Context context) {
        zzxx zzxxVar = new zzxx();
        zzys zzysVarZzd = zzys.zzd(context);
        this.zzc = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzh = zzxxVar;
        this.zze = zzysVarZzd;
        this.zzg = zzk.zza;
        boolean z = false;
        if (context != null && zzgd.zzN(context)) {
            z = true;
        }
        this.zzd = z;
        if (!z && context != null && zzgd.zza >= 32) {
            this.zzf = zzyx.zza(context);
        }
        if (this.zze.zzS && context == null) {
            zzfk.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int zzb(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    protected static int zzc(zzan zzanVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzanVar.zze)) {
            return 4;
        }
        String strZzh = zzh(str);
        String strZzh2 = zzh(zzanVar.zze);
        if (strZzh2 == null || strZzh == null) {
            return (z && strZzh2 == null) ? 1 : 0;
        }
        if (strZzh2.startsWith(strZzh) || strZzh.startsWith(strZzh2)) {
            return 3;
        }
        int i = zzgd.zza;
        return strZzh2.split("-", 2)[0].equals(strZzh.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ boolean zzm(zzze zzzeVar, zzan zzanVar) {
        boolean z;
        char c;
        zzyx zzyxVar;
        zzyx zzyxVar2;
        synchronized (zzzeVar.zzc) {
            z = true;
            if (zzzeVar.zze.zzS && !zzzeVar.zzd && zzanVar.zzA > 2) {
                String str = zzanVar.zzn;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (!str.equals("audio/eac3-joc")) {
                                c = 65535;
                                break;
                            } else {
                                c = 2;
                                break;
                            }
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c = 1;
                                break;
                            }
                            break;
                    }
                    if ((c != 0 && c != 1 && c != 2 && c != 3) || (zzgd.zza >= 32 && (zzyxVar = zzzeVar.zzf) != null && zzyxVar.zzg())) {
                    }
                }
                if (zzgd.zza < 32 || (zzyxVar2 = zzzeVar.zzf) == null || !zzyxVar2.zzg() || !zzyxVar2.zze() || !zzzeVar.zzf.zzf() || !zzzeVar.zzf.zzd(zzzeVar.zzg, zzanVar)) {
                    z = false;
                }
            }
        }
        return z;
    }

    protected static boolean zzo(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    private static void zzu(zzxr zzxrVar, zzdl zzdlVar, Map map) {
        for (int i = 0; i < zzxrVar.zzc; i++) {
            if (((zzdg) zzdlVar.zzD.get(zzxrVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        boolean z;
        zzyx zzyxVar;
        synchronized (this.zzc) {
            z = false;
            if (this.zze.zzS && !this.zzd && zzgd.zza >= 32 && (zzyxVar = this.zzf) != null && zzyxVar.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzt();
        }
    }

    private static final Pair zzw(int i, zzzi zzziVar, int[][][] iArr, zzyz zzyzVar, Comparator comparator) {
        RandomAccess randomAccessZzn;
        zzzi zzziVar2 = zzziVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzziVar2.zzc(i2)) {
                zzxr zzxrVarZzd = zzziVar2.zzd(i2);
                for (int i3 = 0; i3 < zzxrVarZzd.zzc; i3++) {
                    zzde zzdeVarZzb = zzxrVarZzd.zzb(i3);
                    List listZza = zzyzVar.zza(i2, zzdeVarZzb, iArr[i2][i3]);
                    boolean[] zArr = new boolean[zzdeVarZzb.zzb];
                    int i4 = 0;
                    while (i4 < zzdeVarZzb.zzb) {
                        int i5 = i4 + 1;
                        zzza zzzaVar = (zzza) listZza.get(i4);
                        int iZzb = zzzaVar.zzb();
                        if (!zArr[i4] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzn = zzgbc.zzn(zzzaVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzaVar);
                                for (int i6 = i5; i6 < zzdeVarZzb.zzb; i6++) {
                                    zzza zzzaVar2 = (zzza) listZza.get(i6);
                                    if (zzzaVar2.zzb() == 2 && zzzaVar.zzc(zzzaVar2)) {
                                        arrayList2.add(zzzaVar2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccessZzn = arrayList2;
                            }
                            arrayList.add(randomAccessZzn);
                        }
                        i4 = i5;
                    }
                }
            }
            i2++;
            zzziVar2 = zzziVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((zzza) list.get(i7)).zzc;
        }
        zzza zzzaVar3 = (zzza) list.get(0);
        return Pair.create(new zzzf(zzzaVar3.zzb, iArr2, 0), Integer.valueOf(zzzaVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmo
    public final void zza(zzmn zzmnVar) {
        synchronized (this.zzc) {
            boolean z = this.zze.zzW;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzzj
    protected final Pair zzd(zzzi zzziVar, int[][][] iArr, final int[] iArr2, zzvo zzvoVar, zzdc zzdcVar) throws zzjh {
        final zzys zzysVar;
        Pair pairZzw;
        int i;
        final boolean z;
        int i2;
        int[] iArr3;
        int length;
        zzzg zzzgVarZza;
        zzyx zzyxVar;
        synchronized (this.zzc) {
            zzysVar = this.zze;
            if (zzysVar.zzS && zzgd.zza >= 32 && (zzyxVar = this.zzf) != null) {
                Looper looperMyLooper = Looper.myLooper();
                zzeq.zzb(looperMyLooper);
                zzyxVar.zzb(this, looperMyLooper);
            }
        }
        int i3 = 2;
        zzzf[] zzzfVarArr = new zzzf[2];
        zzdj zzdjVar = zzysVar.zzv;
        Pair pairZzw2 = zzw(2, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyh
            /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzyz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List zza(int i4, zzde zzdeVar, int[] iArr4) {
                char c;
                int i5;
                int i6;
                int i7;
                Point point;
                int i8;
                zzys zzysVar2 = zzysVar;
                int i9 = iArr2[i4];
                int i10 = zzysVar2.zzl;
                int i11 = zzysVar2.zzm;
                boolean z2 = zzysVar2.zzn;
                int i12 = Integer.MAX_VALUE;
                if (i10 == Integer.MAX_VALUE) {
                    i12 = Integer.MAX_VALUE;
                } else if (i11 != Integer.MAX_VALUE) {
                    int i13 = Integer.MAX_VALUE;
                    for (int i14 = 0; i14 < zzdeVar.zzb; i14++) {
                        zzan zzanVarZzb = zzdeVar.zzb(i14);
                        int i15 = zzanVarZzb.zzs;
                        if (i15 > 0 && (i5 = zzanVarZzb.zzt) > 0) {
                            if (z2) {
                                if ((i15 > i5) != (i10 > i11)) {
                                    i7 = i10;
                                    i6 = i11;
                                }
                                if (i15 * i7 < i5 * i6) {
                                }
                                i8 = zzanVarZzb.zzs;
                                int i16 = zzanVarZzb.zzt * i8;
                                if (i8 < ((int) (point.x * 0.98f))) {
                                }
                            } else {
                                i6 = i10;
                                i7 = i11;
                                if (i15 * i7 < i5 * i6) {
                                    int i17 = zzgd.zza;
                                    point = new Point(i6, ((r12 + i15) - 1) / i15);
                                } else {
                                    int i18 = zzgd.zza;
                                    point = new Point(((r15 + i5) - 1) / i5, i7);
                                }
                                i8 = zzanVarZzb.zzs;
                                int i162 = zzanVarZzb.zzt * i8;
                                if (i8 < ((int) (point.x * 0.98f)) && zzanVarZzb.zzt >= ((int) (point.y * 0.98f)) && i162 < i13) {
                                    i13 = i162;
                                }
                            }
                        }
                    }
                    i12 = i13;
                }
                zzgaz zzgazVar = new zzgaz();
                for (int i19 = 0; i19 < zzdeVar.zzb; i19++) {
                    int iZza = zzdeVar.zzb(i19).zza();
                    if (i12 != Integer.MAX_VALUE) {
                        c = 65535;
                        boolean z3 = iZza != -1 && iZza <= i12;
                        zzgazVar.zzf(new zzzd(i4, zzdeVar, i19, zzysVar2, iArr4[i19], i9, z3));
                    } else {
                        c = 65535;
                    }
                    zzgazVar.zzf(new zzzd(i4, zzdeVar, i19, zzysVar2, iArr4[i19], i9, z3));
                }
                return zzgazVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzgar.zzk().zzd((zzzd) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zzd((zzzd) obj3, (zzzd) obj4);
                    }
                }), (zzzd) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zzd((zzzd) obj3, (zzzd) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zzd((zzzd) obj3, (zzzd) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzd((zzzd) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zza((zzzd) obj3, (zzzd) obj4);
                    }
                }), (zzzd) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zza((zzzd) obj3, (zzzd) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzzc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zza((zzzd) obj3, (zzzd) obj4);
                    }
                }).zza();
            }
        });
        boolean z2 = zzysVar.zzA;
        int i4 = 4;
        if (pairZzw2 == null) {
            zzdj zzdjVar2 = zzysVar.zzv;
            pairZzw = zzw(4, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyd
                @Override // com.google.android.gms.internal.ads.zzyz
                public final List zza(int i5, zzde zzdeVar, int[] iArr4) {
                    zzgaz zzgazVar = new zzgaz();
                    for (int i6 = 0; i6 < zzdeVar.zzb; i6++) {
                        zzgazVar.zzf(new zzym(i5, zzdeVar, i6, zzysVar, iArr4[i6]));
                    }
                    return zzgazVar.zzi();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzye
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((zzym) ((List) obj).get(0)).zza((zzym) ((List) obj2).get(0));
                }
            });
        } else {
            pairZzw = null;
        }
        int i5 = 0;
        if (pairZzw != null) {
            zzzfVarArr[((Integer) pairZzw.second).intValue()] = (zzzf) pairZzw.first;
        } else if (pairZzw2 != null) {
            zzzfVarArr[((Integer) pairZzw2.second).intValue()] = (zzzf) pairZzw2.first;
        }
        int i6 = 0;
        while (true) {
            i = 1;
            if (i6 >= 2) {
                z = false;
                break;
            }
            if (zzziVar.zzc(i6) == 2 && zzziVar.zzd(i6).zzc > 0) {
                z = true;
                break;
            }
            i6++;
        }
        Pair pairZzw3 = zzw(1, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyf
            @Override // com.google.android.gms.internal.ads.zzyz
            public final List zza(int i7, zzde zzdeVar, int[] iArr4) {
                final zzze zzzeVar = this.zza;
                zzfyh zzfyhVar = new zzfyh() { // from class: com.google.android.gms.internal.ads.zzyc
                    @Override // com.google.android.gms.internal.ads.zzfyh
                    public final boolean zza(Object obj) {
                        return zzze.zzm(zzzeVar, (zzan) obj);
                    }
                };
                int i8 = iArr2[i7];
                zzgaz zzgazVar = new zzgaz();
                for (int i9 = 0; i9 < zzdeVar.zzb; i9++) {
                    zzgazVar.zzf(new zzyl(i7, zzdeVar, i9, zzysVar, iArr4[i9], z, zzfyhVar, i8));
                }
                return zzgazVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzyl) Collections.max((List) obj)).zza((zzyl) Collections.max((List) obj2));
            }
        });
        if (pairZzw3 != null) {
            zzzfVarArr[((Integer) pairZzw3.second).intValue()] = (zzzf) pairZzw3.first;
        }
        final String str = pairZzw3 == null ? null : ((zzzf) pairZzw3.first).zza.zzb(((zzzf) pairZzw3.first).zzb[0]).zze;
        zzdj zzdjVar3 = zzysVar.zzv;
        int i7 = 3;
        Pair pairZzw4 = zzw(3, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyj
            @Override // com.google.android.gms.internal.ads.zzyz
            public final List zza(int i8, zzde zzdeVar, int[] iArr4) {
                zzgaz zzgazVar = new zzgaz();
                for (int i9 = 0; i9 < zzdeVar.zzb; i9++) {
                    int i10 = i9;
                    zzgazVar.zzf(new zzyy(i8, zzdeVar, i10, zzysVar, iArr4[i9], str));
                }
                return zzgazVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzyy) ((List) obj).get(0)).zza((zzyy) ((List) obj2).get(0));
            }
        });
        if (pairZzw4 != null) {
            zzzfVarArr[((Integer) pairZzw4.second).intValue()] = (zzzf) pairZzw4.first;
        }
        int i8 = 0;
        while (i8 < i3) {
            int iZzc = zzziVar.zzc(i8);
            if (iZzc != i3 && iZzc != i && iZzc != i7 && iZzc != i4) {
                zzxr zzxrVarZzd = zzziVar.zzd(i8);
                int[][] iArr4 = iArr[i8];
                zzdj zzdjVar4 = zzysVar.zzv;
                int i9 = i5;
                int i10 = i9;
                zzde zzdeVar = null;
                zzyn zzynVar = null;
                while (i9 < zzxrVarZzd.zzc) {
                    zzde zzdeVarZzb = zzxrVarZzd.zzb(i9);
                    int[] iArr5 = iArr4[i9];
                    zzyn zzynVar2 = zzynVar;
                    for (int i11 = i5; i11 < zzdeVarZzb.zzb; i11++) {
                        if (zzo(iArr5[i11], zzysVar.zzT)) {
                            zzyn zzynVar3 = new zzyn(zzdeVarZzb.zzb(i11), iArr5[i11]);
                            if (zzynVar2 == null || zzynVar3.compareTo(zzynVar2) > 0) {
                                zzdeVar = zzdeVarZzb;
                                zzynVar2 = zzynVar3;
                                i10 = i11;
                            }
                        }
                    }
                    i9++;
                    zzynVar = zzynVar2;
                    i5 = 0;
                }
                zzzfVarArr[i8] = zzdeVar == null ? null : new zzzf(zzdeVar, new int[]{i10}, 0);
            }
            i8++;
            i3 = 2;
            i4 = 4;
            i = 1;
            i5 = 0;
            i7 = 3;
        }
        HashMap map = new HashMap();
        int i12 = 2;
        for (int i13 = 0; i13 < 2; i13++) {
            zzu(zzziVar.zzd(i13), zzysVar, map);
        }
        zzu(zzziVar.zze(), zzysVar, map);
        for (int i14 = 0; i14 < 2; i14++) {
            if (((zzdg) map.get(Integer.valueOf(zzziVar.zzc(i14)))) != null) {
                throw null;
            }
        }
        int i15 = 0;
        while (i15 < i12) {
            zzxr zzxrVarZzd2 = zzziVar.zzd(i15);
            if (zzysVar.zzg(i15, zzxrVarZzd2)) {
                if (zzysVar.zze(i15, zzxrVarZzd2) != null) {
                    throw null;
                }
                zzzfVarArr[i15] = null;
            }
            i15++;
            i12 = 2;
        }
        int i16 = 0;
        for (int i17 = i12; i16 < i17; i17 = 2) {
            int iZzc2 = zzziVar.zzc(i16);
            if (zzysVar.zzf(i16) || zzysVar.zzE.contains(Integer.valueOf(iZzc2))) {
                zzzfVarArr[i16] = null;
            }
            i16++;
        }
        zzxx zzxxVar = this.zzh;
        zzzu zzzuVarZzr = zzr();
        zzgbc zzgbcVarZzf = zzxy.zzf(zzzfVarArr);
        int i18 = 2;
        zzzg[] zzzgVarArr = new zzzg[2];
        int i19 = 0;
        while (i19 < i18) {
            zzzf zzzfVar = zzzfVarArr[i19];
            if (zzzfVar == null || (length = (iArr3 = zzzfVar.zzb).length) == 0) {
                i2 = i19;
            } else {
                if (length == 1) {
                    zzzgVarZza = new zzzh(zzzfVar.zza, iArr3[0], 0, 0, null);
                    i2 = i19;
                } else {
                    i2 = i19;
                    zzzgVarZza = zzxxVar.zza(zzzfVar.zza, iArr3, 0, zzzuVarZzr, (zzgbc) zzgbcVarZzf.get(i19));
                }
                zzzgVarArr[i2] = zzzgVarZza;
            }
            i19 = i2 + 1;
            i18 = 2;
        }
        zzmq[] zzmqVarArr = new zzmq[i18];
        for (int i20 = 0; i20 < i18; i20++) {
            zzmqVarArr[i20] = (zzysVar.zzf(i20) || zzysVar.zzE.contains(Integer.valueOf(zzziVar.zzc(i20))) || (zzziVar.zzc(i20) != -2 && zzzgVarArr[i20] == null)) ? null : zzmq.zza;
        }
        boolean z3 = zzysVar.zzU;
        zzdj zzdjVar5 = zzysVar.zzv;
        return Pair.create(zzmqVarArr, zzzgVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final zzmo zze() {
        return this;
    }

    public final zzys zzf() {
        zzys zzysVar;
        synchronized (this.zzc) {
            zzysVar = this.zze;
        }
        return zzysVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzj() {
        zzyx zzyxVar;
        synchronized (this.zzc) {
            if (zzgd.zza >= 32 && (zzyxVar = this.zzf) != null) {
                zzyxVar.zzc();
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzk(zzk zzkVar) {
        boolean zEquals;
        synchronized (this.zzc) {
            zEquals = this.zzg.equals(zzkVar);
            this.zzg = zzkVar;
        }
        if (zEquals) {
            return;
        }
        zzv();
    }

    public final void zzl(zzyq zzyqVar) {
        boolean zEquals;
        zzys zzysVar = new zzys(zzyqVar);
        synchronized (this.zzc) {
            zEquals = this.zze.equals(zzysVar);
            this.zze = zzysVar;
        }
        if (zEquals) {
            return;
        }
        if (zzysVar.zzS && this.zza == null) {
            zzfk.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final boolean zzn() {
        return true;
    }
}
