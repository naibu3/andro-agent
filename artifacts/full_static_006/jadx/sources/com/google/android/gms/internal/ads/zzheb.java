package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzheb {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzheq zzc;
    private static final zzheq zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzheq zzheqVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzheqVar = (zzheq) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzheqVar;
        zzd = new zzhes();
    }

    public static void zzA(int i, List list, zzhfi zzhfiVar, zzhdz zzhdzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzhau) zzhfiVar).zzq(i, list.get(i2), zzhdzVar);
        }
    }

    public static void zzB(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzs(i, list, z);
    }

    public static void zzC(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzu(i, list, z);
    }

    public static void zzD(int i, List list, zzhfi zzhfiVar, zzhdz zzhdzVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzhau) zzhfiVar).zzv(i, list.get(i2), zzhdzVar);
        }
    }

    public static void zzE(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzy(i, list, z);
    }

    public static void zzF(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzA(i, list, z);
    }

    public static void zzG(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzC(i, list, z);
    }

    public static void zzH(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzE(i, list, z);
    }

    public static void zzI(int i, List list, zzhfi zzhfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzH(i, list);
    }

    public static void zzJ(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzJ(i, list, z);
    }

    public static void zzK(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzL(i, list, z);
    }

    static boolean zzL(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(zzhbpVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhat.zzD(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhat.zzD(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(zzhbpVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzg(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(zzhctVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    static int zzh(int i, Object obj, zzhdz zzhdzVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzhck)) {
            return zzhat.zzD(i2) + zzhat.zzA((zzhde) obj, zzhdzVar);
        }
        int iZzD = zzhat.zzD(i2);
        int iZza = ((zzhck) obj).zza();
        return iZzD + zzhat.zzD(iZza) + iZza;
    }

    static int zzi(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            iZzD = 0;
            while (i < size) {
                int iZzd = zzhbpVar.zzd(i);
                iZzD += zzhat.zzD((iZzd >> 31) ^ (iZzd + iZzd));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzD += zzhat.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzD;
    }

    static int zzj(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            iZzE = 0;
            while (i < size) {
                long jZza = zzhctVar.zza(i);
                iZzE += zzhat.zzE((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzE += zzhat.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzE;
    }

    static int zzk(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            iZzD = 0;
            while (i < size) {
                iZzD += zzhat.zzD(zzhbpVar.zzd(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += zzhat.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzD;
    }

    static int zzl(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(zzhctVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzhat.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    public static zzheq zzm() {
        return zzc;
    }

    public static zzheq zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i, List list, zzhbu zzhbuVar, Object obj2, zzheq zzheqVar) {
        if (zzhbuVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                if (zzhbuVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, iIntValue, obj2, zzheqVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzhbuVar.zza(iIntValue2)) {
                    obj2 = zzp(obj, i, iIntValue2, obj2, zzheqVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i, int i2, Object obj2, zzheq zzheqVar) {
        if (obj2 == null) {
            obj2 = zzheqVar.zzc(obj);
        }
        zzheqVar.zzl(obj2, i, i2);
        return obj2;
    }

    static void zzq(zzhaz zzhazVar, Object obj, Object obj2) {
        zzhbd zzhbdVarZzb = zzhazVar.zzb(obj2);
        if (zzhbdVarZzb.zza.isEmpty()) {
            return;
        }
        zzhazVar.zzc(obj).zzj(zzhbdVarZzb);
    }

    static void zzr(zzheq zzheqVar, Object obj, Object obj2) {
        zzheqVar.zzo(obj, zzheqVar.zze(zzheqVar.zzd(obj), zzheqVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzhbo.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzc(i, list, z);
    }

    public static void zzu(int i, List list, zzhfi zzhfiVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zze(i, list);
    }

    public static void zzv(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzg(i, list, z);
    }

    public static void zzw(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzj(i, list, z);
    }

    public static void zzx(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzl(i, list, z);
    }

    public static void zzy(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzn(i, list, z);
    }

    public static void zzz(int i, List list, zzhfi zzhfiVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhfiVar.zzp(i, list, z);
    }
}
