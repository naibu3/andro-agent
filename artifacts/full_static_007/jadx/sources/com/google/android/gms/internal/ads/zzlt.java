package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzlt {
    private final zzcz zza = new zzcz();
    private final zzdb zzb = new zzdb();
    private final zzmx zzc;
    private final zzfb zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzlq zzh;
    private zzlq zzi;
    private zzlq zzj;
    private int zzk;
    private Object zzl;
    private long zzm;
    private final zzkz zzn;

    public zzlt(zzmx zzmxVar, zzfb zzfbVar, zzkz zzkzVar) {
        this.zzc = zzmxVar;
        this.zzd = zzfbVar;
        this.zzn = zzkzVar;
    }

    private final boolean zzA(zzdc zzdcVar, zzvo zzvoVar) {
        if (zzC(zzvoVar)) {
            return zzdcVar.zze(zzdcVar.zzn(zzvoVar.zza, this.zza).zzd, this.zzb, 0L).zzq == zzdcVar.zza(zzvoVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzdc zzdcVar) {
        zzlq zzlqVarZzg = this.zzh;
        if (zzlqVarZzg == null) {
            return true;
        }
        int iZza = zzdcVar.zza(zzlqVarZzg.zzb);
        while (true) {
            iZza = zzdcVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlqVarZzg.getClass();
                if (zzlqVarZzg.zzg() == null || zzlqVarZzg.zzf.zzg) {
                    break;
                }
                zzlqVarZzg = zzlqVarZzg.zzg();
            }
            zzlq zzlqVarZzg2 = zzlqVarZzg.zzg();
            if (iZza == -1 || zzlqVarZzg2 == null || zzdcVar.zza(zzlqVarZzg2.zzb) != iZza) {
                break;
            }
            zzlqVarZzg = zzlqVarZzg2;
        }
        boolean zZzn = zzn(zzlqVarZzg);
        zzlqVarZzg.zzf = zzh(zzdcVar, zzlqVarZzg.zzf);
        return !zZzn;
    }

    private static final boolean zzC(zzvo zzvoVar) {
        return !zzvoVar.zzb() && zzvoVar.zze == -1;
    }

    private final long zzs(zzdc zzdcVar, Object obj, int i) {
        zzdcVar.zzn(obj, this.zza);
        this.zza.zzi(i);
        this.zza.zzk(i);
        return 0L;
    }

    private final zzlr zzt(zzdc zzdcVar, zzlq zzlqVar, long j) {
        long j2;
        zzlr zzlrVar = zzlqVar.zzf;
        long jZze = (zzlqVar.zze() + zzlrVar.zze) - j;
        if (zzlrVar.zzg) {
            long j3 = 0;
            int iZzi = zzdcVar.zzi(zzdcVar.zza(zzlrVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (iZzi != -1) {
                int i = zzdcVar.zzd(iZzi, this.zza, true).zzd;
                Object obj = this.zza.zzc;
                obj.getClass();
                long j4 = zzlrVar.zza.zzd;
                if (zzdcVar.zze(i, this.zzb, 0L).zzp == iZzi) {
                    Pair pairZzm = zzdcVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm != null) {
                        obj = pairZzm.first;
                        long jLongValue = ((Long) pairZzm.second).longValue();
                        zzlq zzlqVarZzg = zzlqVar.zzg();
                        if (zzlqVarZzg == null || !zzlqVarZzg.zzb.equals(obj)) {
                            j4 = this.zze;
                            this.zze = 1 + j4;
                        } else {
                            j4 = zzlqVarZzg.zzf.zza.zzd;
                        }
                        j2 = jLongValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zzvo zzvoVarZzx = zzx(zzdcVar, obj, j2, j4, this.zzb, this.zza);
                if (j3 != -9223372036854775807L && zzlrVar.zzc != -9223372036854775807L) {
                    zzdcVar.zzn(zzlrVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzu(zzdcVar, zzvoVarZzx, j3, j2);
            }
        } else {
            zzvo zzvoVar = zzlrVar.zza;
            zzdcVar.zzn(zzvoVar.zza, this.zza);
            if (!zzvoVar.zzb()) {
                int i2 = zzvoVar.zze;
                if (i2 != -1) {
                    this.zza.zzm(i2);
                }
                zzcz zzczVar = this.zza;
                int i3 = zzvoVar.zze;
                int iZze = zzczVar.zze(i3);
                zzczVar.zzn(i3);
                if (iZze != this.zza.zza(zzvoVar.zze)) {
                    return zzv(zzdcVar, zzvoVar.zza, zzvoVar.zze, iZze, zzlrVar.zze, zzvoVar.zzd);
                }
                zzs(zzdcVar, zzvoVar.zza, zzvoVar.zze);
                return zzw(zzdcVar, zzvoVar.zza, 0L, zzlrVar.zze, zzvoVar.zzd);
            }
            int i4 = zzvoVar.zzb;
            if (this.zza.zza(i4) != -1) {
                int iZzf = this.zza.zzf(i4, zzvoVar.zzc);
                if (iZzf < 0) {
                    return zzv(zzdcVar, zzvoVar.zza, i4, iZzf, zzlrVar.zzc, zzvoVar.zzd);
                }
                long jLongValue2 = zzlrVar.zzc;
                if (jLongValue2 == -9223372036854775807L) {
                    zzdb zzdbVar = this.zzb;
                    zzcz zzczVar2 = this.zza;
                    Pair pairZzm2 = zzdcVar.zzm(zzdbVar, zzczVar2, zzczVar2.zzd, -9223372036854775807L, Math.max(0L, jZze));
                    if (pairZzm2 != null) {
                        jLongValue2 = ((Long) pairZzm2.second).longValue();
                    }
                }
                zzs(zzdcVar, zzvoVar.zza, zzvoVar.zzb);
                return zzw(zzdcVar, zzvoVar.zza, Math.max(0L, jLongValue2), zzlrVar.zzc, zzvoVar.zzd);
            }
        }
        return null;
    }

    private final zzlr zzu(zzdc zzdcVar, zzvo zzvoVar, long j, long j2) {
        zzdcVar.zzn(zzvoVar.zza, this.zza);
        return zzvoVar.zzb() ? zzv(zzdcVar, zzvoVar.zza, zzvoVar.zzb, zzvoVar.zzc, j, zzvoVar.zzd) : zzw(zzdcVar, zzvoVar.zza, j2, j, zzvoVar.zzd);
    }

    private final zzlr zzv(zzdc zzdcVar, Object obj, int i, int i2, long j, long j2) {
        zzvo zzvoVar = new zzvo(obj, i, i2, j2);
        long jZzh = zzdcVar.zzn(zzvoVar.zza, this.zza).zzh(zzvoVar.zzb, zzvoVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzj();
        }
        this.zza.zzn(zzvoVar.zzb);
        return new zzlr(zzvoVar, (jZzh == -9223372036854775807L || jZzh > 0) ? 0L : Math.max(0L, (-1) + jZzh), j, -9223372036854775807L, jZzh, false, false, false, false);
    }

    private final zzlr zzw(zzdc zzdcVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long jMax = j;
        zzdcVar.zzn(obj, this.zza);
        int iZzc = this.zza.zzc(jMax);
        if (iZzc != -1) {
            this.zza.zzm(iZzc);
        }
        if (iZzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(iZzc);
        }
        zzvo zzvoVar = new zzvo(obj, j3, iZzc);
        boolean zZzC = zzC(zzvoVar);
        boolean zZzA = zzA(zzdcVar, zzvoVar);
        boolean zZzz = zzz(zzdcVar, zzvoVar, zZzC);
        if (iZzc != -1) {
            this.zza.zzn(iZzc);
        }
        if (iZzc != -1) {
            this.zza.zzi(iZzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zze;
        }
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        return new zzlr(zzvoVar, jMax, j2, j5, j6, false, zZzC, zZzA, zZzz);
    }

    private static zzvo zzx(zzdc zzdcVar, Object obj, long j, long j2, zzdb zzdbVar, zzcz zzczVar) {
        zzdcVar.zzn(obj, zzczVar);
        zzdcVar.zze(zzczVar.zzd, zzdbVar, 0L);
        zzdcVar.zza(obj);
        zzczVar.zzb();
        zzdcVar.zzn(obj, zzczVar);
        int iZzd = zzczVar.zzd(j);
        return iZzd == -1 ? new zzvo(obj, j2, zzczVar.zzc(j)) : new zzvo(obj, iZzd, zzczVar.zze(iZzd), j2);
    }

    private final void zzy() {
        final zzgaz zzgazVar = new zzgaz();
        for (zzlq zzlqVarZzg = this.zzh; zzlqVarZzg != null; zzlqVarZzg = zzlqVarZzg.zzg()) {
            zzgazVar.zzf(zzlqVarZzg.zzf.zza);
        }
        zzlq zzlqVar = this.zzi;
        final zzvo zzvoVar = zzlqVar == null ? null : zzlqVar.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(zzgazVar, zzvoVar);
            }
        });
    }

    private final boolean zzz(zzdc zzdcVar, zzvo zzvoVar, boolean z) {
        int iZza = zzdcVar.zza(zzvoVar.zza);
        return !zzdcVar.zze(zzdcVar.zzd(iZza, this.zza, false).zzd, this.zzb, 0L).zzj && zzdcVar.zzi(iZza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    public final zzlq zza() {
        zzlq zzlqVar = this.zzh;
        if (zzlqVar == null) {
            return null;
        }
        if (zzlqVar == this.zzi) {
            this.zzi = zzlqVar.zzg();
        }
        zzlqVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzlq zzlqVar2 = this.zzh;
            this.zzl = zzlqVar2.zzb;
            this.zzm = zzlqVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzlq zzb() {
        zzlq zzlqVar = this.zzi;
        zzeq.zzb(zzlqVar);
        this.zzi = zzlqVar.zzg();
        zzy();
        zzlq zzlqVar2 = this.zzi;
        zzeq.zzb(zzlqVar2);
        return zzlqVar2;
    }

    public final zzlq zzd() {
        return this.zzj;
    }

    public final zzlq zze() {
        return this.zzh;
    }

    public final zzlq zzf() {
        return this.zzi;
    }

    public final zzlr zzg(long j, zzmg zzmgVar) {
        zzlq zzlqVar = this.zzj;
        return zzlqVar == null ? zzu(zzmgVar.zza, zzmgVar.zzb, zzmgVar.zzc, zzmgVar.zzr) : zzt(zzmgVar.zza, zzlqVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzlr zzh(zzdc zzdcVar, zzlr zzlrVar) {
        long j;
        long jZzh;
        long j2;
        long j3;
        int i;
        zzvo zzvoVar = zzlrVar.zza;
        boolean zZzC = zzC(zzvoVar);
        boolean zZzA = zzA(zzdcVar, zzvoVar);
        boolean zZzz = zzz(zzdcVar, zzvoVar, zZzC);
        zzdcVar.zzn(zzlrVar.zza.zza, this.zza);
        if (zzvoVar.zzb() || (i = zzvoVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzi(i);
            j = 0;
        }
        if (zzvoVar.zzb()) {
            jZzh = this.zza.zzh(zzvoVar.zzb, zzvoVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j2 = 0;
                j3 = 0;
                if (zzvoVar.zzb()) {
                    int i2 = zzvoVar.zze;
                    if (i2 != -1) {
                        this.zza.zzn(i2);
                    }
                } else {
                    this.zza.zzn(zzvoVar.zzb);
                }
                return new zzlr(zzvoVar, zzlrVar.zzb, zzlrVar.zzc, j2, j3, false, zZzC, zZzA, zZzz);
            }
            jZzh = this.zza.zze;
        }
        j2 = j;
        j3 = jZzh;
        if (zzvoVar.zzb()) {
        }
        return new zzlr(zzvoVar, zzlrVar.zzb, zzlrVar.zzc, j2, j3, false, zZzC, zZzA, zZzz);
    }

    public final zzvo zzi(zzdc zzdcVar, Object obj, long j) {
        long j2;
        int iZza;
        int i = zzdcVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (iZza = zzdcVar.zza(obj2)) == -1 || zzdcVar.zzd(iZza, this.zza, false).zzd != i) {
            zzlq zzlqVarZzg = this.zzh;
            while (true) {
                if (zzlqVarZzg == null) {
                    zzlq zzlqVarZzg2 = this.zzh;
                    while (true) {
                        if (zzlqVarZzg2 != null) {
                            int iZza2 = zzdcVar.zza(zzlqVarZzg2.zzb);
                            if (iZza2 != -1 && zzdcVar.zzd(iZza2, this.zza, false).zzd == i) {
                                j2 = zzlqVarZzg2.zzf.zza.zzd;
                                break;
                            }
                            zzlqVarZzg2 = zzlqVarZzg2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else {
                    if (zzlqVarZzg.zzb.equals(obj)) {
                        j2 = zzlqVarZzg.zzf.zza.zzd;
                        break;
                    }
                    zzlqVarZzg = zzlqVarZzg.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzdcVar.zzn(obj, this.zza);
        zzdcVar.zze(this.zza.zzd, this.zzb, 0L);
        int iZza3 = zzdcVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzdb zzdbVar = this.zzb;
            if (iZza3 < zzdbVar.zzp) {
                return zzx(zzdcVar, obj3, j, j3, zzdbVar, this.zza);
            }
            zzdcVar.zzd(iZza3, this.zza, true);
            this.zza.zzb();
            zzcz zzczVar = this.zza;
            if (zzczVar.zzd(zzczVar.zze) != -1) {
                obj3 = this.zza.zzc;
                obj3.getClass();
            }
            iZza3--;
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzlq zzlqVarZzg = this.zzh;
        zzeq.zzb(zzlqVarZzg);
        this.zzl = zzlqVarZzg.zzb;
        this.zzm = zzlqVarZzg.zzf.zza.zzd;
        while (zzlqVarZzg != null) {
            zzlqVarZzg.zzn();
            zzlqVarZzg = zzlqVarZzg.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    final /* synthetic */ void zzk(zzgaz zzgazVar, zzvo zzvoVar) {
        this.zzc.zzS(zzgazVar.zzi(), zzvoVar);
    }

    public final void zzl(long j) {
        zzlq zzlqVar = this.zzj;
        if (zzlqVar != null) {
            zzlqVar.zzm(j);
        }
    }

    public final boolean zzm(zzvm zzvmVar) {
        zzlq zzlqVar = this.zzj;
        return zzlqVar != null && zzlqVar.zza == zzvmVar;
    }

    public final boolean zzn(zzlq zzlqVar) {
        zzeq.zzb(zzlqVar);
        boolean z = false;
        if (zzlqVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzlqVar;
        while (zzlqVar.zzg() != null) {
            zzlqVar = zzlqVar.zzg();
            zzlqVar.getClass();
            if (zzlqVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzlqVar.zzn();
            this.zzk--;
        }
        zzlq zzlqVar2 = this.zzj;
        zzlqVar2.getClass();
        zzlqVar2.zzo(null);
        zzy();
        return z;
    }

    public final boolean zzo() {
        zzlq zzlqVar = this.zzj;
        if (zzlqVar == null) {
            return true;
        }
        if (zzlqVar.zzf.zzi || !zzlqVar.zzr() || this.zzj.zzf.zze == -9223372036854775807L) {
            return false;
        }
        return this.zzk < 100;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzp(zzdc zzdcVar, long j, long j2) {
        zzlr zzlrVarZzh;
        boolean z;
        zzlq zzlqVar = null;
        for (zzlq zzlqVarZzg = this.zzh; zzlqVarZzg != null; zzlqVarZzg = zzlqVarZzg.zzg()) {
            zzlr zzlrVar = zzlqVarZzg.zzf;
            if (zzlqVar == null) {
                zzlrVarZzh = zzh(zzdcVar, zzlrVar);
            } else {
                zzlr zzlrVarZzt = zzt(zzdcVar, zzlqVar, j);
                if (zzlrVarZzt == null) {
                    return !zzn(zzlqVar);
                }
                if (zzlrVar.zzb != zzlrVarZzt.zzb || !zzlrVar.zza.equals(zzlrVarZzt.zza)) {
                    return !zzn(zzlqVar);
                }
                zzlrVarZzh = zzlrVarZzt;
            }
            zzlqVarZzg.zzf = zzlrVarZzh.zza(zzlrVar.zzc);
            long j3 = zzlrVar.zze;
            long j4 = zzlrVarZzh.zze;
            if (j3 != -9223372036854775807L && j3 != j4) {
                zzlqVarZzg.zzq();
                long j5 = zzlrVarZzh.zze;
                long jZze = j5 == -9223372036854775807L ? Long.MAX_VALUE : j5 + zzlqVarZzg.zze();
                if (zzlqVarZzg == this.zzi) {
                    boolean z2 = zzlqVarZzg.zzf.zzf;
                    z = j2 == Long.MIN_VALUE || j2 >= jZze;
                }
                return (zzn(zzlqVarZzg) || z) ? false : true;
            }
            zzlqVar = zzlqVarZzg;
        }
        return true;
    }

    public final boolean zzq(zzdc zzdcVar, int i) {
        this.zzf = i;
        return zzB(zzdcVar);
    }

    public final boolean zzr(zzdc zzdcVar, boolean z) {
        this.zzg = z;
        return zzB(zzdcVar);
    }

    public final zzlq zzc(zzlr zzlrVar) {
        zzlq zzlqVar = this.zzj;
        zzlq zzlqVarZzd = zzlh.zzd(this.zzn.zza, zzlrVar, zzlqVar == null ? 1000000000000L : (zzlqVar.zze() + zzlqVar.zzf.zze) - zzlrVar.zzb);
        zzlq zzlqVar2 = this.zzj;
        if (zzlqVar2 != null) {
            zzlqVar2.zzo(zzlqVarZzd);
        } else {
            this.zzh = zzlqVarZzd;
            this.zzi = zzlqVarZzd;
        }
        this.zzl = null;
        this.zzj = zzlqVarZzd;
        this.zzk++;
        zzy();
        return zzlqVarZzd;
    }
}
