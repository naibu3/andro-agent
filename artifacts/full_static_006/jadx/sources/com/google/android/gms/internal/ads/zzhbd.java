package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhbd {
    private static final zzhbd zzb = new zzhbd(true);
    final zzhem zza = new zzhec(16);
    private boolean zzc;
    private boolean zzd;

    private zzhbd() {
    }

    static int zza(zzhfg zzhfgVar, int i, Object obj) {
        int iZzD = zzhat.zzD(i << 3);
        if (zzhfgVar == zzhfg.GROUP) {
            zzhde zzhdeVar = (zzhde) obj;
            byte[] bArr = zzhcb.zzd;
            if (zzhdeVar instanceof zzgzj) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + zzb(zzhfgVar, obj);
    }

    static int zzb(zzhfg zzhfgVar, Object obj) {
        int iZzd;
        int iZzD;
        zzhfg zzhfgVar2 = zzhfg.DOUBLE;
        zzhfh zzhfhVar = zzhfh.INT;
        switch (zzhfgVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzhat.zzf;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzhat.zzf;
                return 4;
            case INT64:
                return zzhat.zzE(((Long) obj).longValue());
            case UINT64:
                return zzhat.zzE(((Long) obj).longValue());
            case INT32:
                return zzhat.zzE(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzhat.zzf;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzhat.zzf;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzhat.zzf;
                return 1;
            case STRING:
                if (!(obj instanceof zzhac)) {
                    return zzhat.zzC((String) obj);
                }
                int i6 = zzhat.zzf;
                iZzd = ((zzhac) obj).zzd();
                iZzD = zzhat.zzD(iZzd);
                break;
            case GROUP:
                int i7 = zzhat.zzf;
                return ((zzhde) obj).zzaY();
            case MESSAGE:
                if (!(obj instanceof zzhcj)) {
                    return zzhat.zzz((zzhde) obj);
                }
                int i8 = zzhat.zzf;
                iZzd = ((zzhcj) obj).zza();
                iZzD = zzhat.zzD(iZzd);
                break;
            case BYTES:
                if (!(obj instanceof zzhac)) {
                    int i9 = zzhat.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = zzhat.zzD(iZzd);
                    break;
                } else {
                    int i10 = zzhat.zzf;
                    iZzd = ((zzhac) obj).zzd();
                    iZzD = zzhat.zzD(iZzd);
                    break;
                }
            case UINT32:
                return zzhat.zzD(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzhbs ? zzhat.zzE(((zzhbs) obj).zza()) : zzhat.zzE(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i11 = zzhat.zzf;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i12 = zzhat.zzf;
                return 8;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                return zzhat.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                return zzhat.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    public static int zzc(zzhbc zzhbcVar, Object obj) {
        zzhfg zzhfgVarZzd = zzhbcVar.zzd();
        int iZza = zzhbcVar.zza();
        if (!zzhbcVar.zzg()) {
            return zza(zzhfgVarZzd, iZza, obj);
        }
        List list = (List) obj;
        int iZza2 = 0;
        if (!zzhbcVar.zzf()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza2 += zza(zzhfgVarZzd, iZza, it.next());
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iZza2 += zzb(zzhfgVarZzd, it2.next());
        }
        return zzhat.zzD(iZza << 3) + iZza2 + zzhat.zzD(iZza2);
    }

    public static zzhbd zze() {
        return zzb;
    }

    private static Object zzm(Object obj) {
        if (obj instanceof zzhdj) {
            return ((zzhdj) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzn(Map.Entry entry) {
        zzhde zzhdeVarZzbr;
        zzhbc zzhbcVar = (zzhbc) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzhcj;
        if (zzhbcVar.zzg()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objZzf = zzf(zzhbcVar);
            if (objZzf == null) {
                objZzf = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objZzf).add(zzm(it.next()));
            }
            this.zza.put(zzhbcVar, objZzf);
            return;
        }
        if (zzhbcVar.zze() != zzhfh.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzhbcVar, zzm(value));
            return;
        }
        Object objZzf2 = zzf(zzhbcVar);
        if (objZzf2 == null) {
            this.zza.put(zzhbcVar, zzm(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objZzf2 instanceof zzhdj) {
            zzhdeVarZzbr = zzhbcVar.zzc((zzhdj) objZzf2, (zzhdj) value);
        } else {
            zzhdd zzhddVarZzcZ = ((zzhde) objZzf2).zzcZ();
            zzhbcVar.zzb(zzhddVarZzcZ, (zzhde) value);
            zzhdeVarZzbr = zzhddVarZzcZ.zzbr();
        }
        this.zza.put(zzhbcVar, zzhdeVarZzbr);
    }

    private static boolean zzo(Map.Entry entry) {
        zzhbc zzhbcVar = (zzhbc) entry.getKey();
        if (zzhbcVar.zze() != zzhfh.MESSAGE) {
            return true;
        }
        if (!zzhbcVar.zzg()) {
            return zzp(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzp(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzp(Object obj) {
        if (obj instanceof zzhdf) {
            return ((zzhdf) obj).zzbw();
        }
        if (obj instanceof zzhcj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzq(Map.Entry entry) {
        int i;
        int iZzD;
        int iZzD2;
        zzhbc zzhbcVar = (zzhbc) entry.getKey();
        Object value = entry.getValue();
        if (zzhbcVar.zze() != zzhfh.MESSAGE || zzhbcVar.zzg() || zzhbcVar.zzf()) {
            return zzc(zzhbcVar, value);
        }
        if (value instanceof zzhcj) {
            int iZza = ((zzhbc) entry.getKey()).zza();
            int iZzD3 = zzhat.zzD(8);
            i = iZzD3 + iZzD3;
            iZzD = zzhat.zzD(16) + zzhat.zzD(iZza);
            int iZzD4 = zzhat.zzD(24);
            int iZza2 = ((zzhcj) value).zza();
            iZzD2 = iZzD4 + zzhat.zzD(iZza2) + iZza2;
        } else {
            int iZza3 = ((zzhbc) entry.getKey()).zza();
            int iZzD5 = zzhat.zzD(8);
            i = iZzD5 + iZzD5;
            iZzD = zzhat.zzD(16) + zzhat.zzD(iZza3);
            iZzD2 = zzhat.zzD(24) + zzhat.zzz((zzhde) value);
        }
        return i + iZzD + iZzD2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzr(zzhbc zzhbcVar, Object obj) {
        boolean z;
        zzhbcVar.zzd();
        byte[] bArr = zzhcb.zzd;
        obj.getClass();
        zzhfg zzhfgVar = zzhfg.DOUBLE;
        zzhfh zzhfhVar = zzhfh.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzhac) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzhbs)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzhde) || (obj instanceof zzhcj)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzhbcVar.zza()), zzhbcVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzhbd zzhbdVar = new zzhbd();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzhbdVar.zzk((zzhbc) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzhbdVar.zzk((zzhbc) entry.getKey(), entry.getValue());
        }
        zzhbdVar.zzd = this.zzd;
        return zzhbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhbd) {
            return this.zza.equals(((zzhbd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int iZzq = 0;
        for (int i = 0; i < this.zza.zzb(); i++) {
            iZzq += zzq(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzq += zzq((Map.Entry) it.next());
        }
        return iZzq;
    }

    public final Object zzf(zzhbc zzhbcVar) {
        Object obj = this.zza.get(zzhbcVar);
        if (!(obj instanceof zzhcj)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        return this.zzd ? new zzhci(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzh(zzhbc zzhbcVar, Object obj) {
        List arrayList;
        if (!((zzhbl) zzhbcVar).zzd) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        zzr(zzhbcVar, obj);
        Object objZzf = zzf(zzhbcVar);
        if (objZzf == null) {
            arrayList = new ArrayList();
            this.zza.put(zzhbcVar, arrayList);
        } else {
            arrayList = (List) objZzf;
        }
        arrayList.add(obj);
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzhbo) {
                ((zzhbo) entryZzg.getValue()).zzbV();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzhbd zzhbdVar) {
        for (int i = 0; i < zzhbdVar.zza.zzb(); i++) {
            zzn(zzhbdVar.zza.zzg(i));
        }
        Iterator it = zzhbdVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzn((Map.Entry) it.next());
        }
    }

    public final void zzk(zzhbc zzhbcVar, Object obj) {
        if (!zzhbcVar.zzg()) {
            zzr(zzhbcVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzr(zzhbcVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzhcj) {
            this.zzd = true;
        }
        this.zza.put(zzhbcVar, obj);
    }

    public final boolean zzl() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzo(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzo((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzhbd(boolean z) {
        zzi();
        zzi();
    }
}
