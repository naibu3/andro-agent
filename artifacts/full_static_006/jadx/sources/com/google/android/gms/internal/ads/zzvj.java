package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzvj extends zzxt {
    private final boolean zzb;
    private final zzdb zzc;
    private final zzcz zzd;
    private zzvh zze;
    private zzvg zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzvj(zzvq zzvqVar, boolean z) {
        boolean z2;
        super(zzvqVar);
        if (z) {
            zzvqVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzdb();
        this.zzd = new zzcz();
        zzvqVar.zzM();
        this.zze = zzvh.zzq(zzvqVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzvh.zzd)) ? obj : this.zze.zzf;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzL(long j) {
        zzvg zzvgVar = this.zzf;
        int iZza = this.zze.zza(zzvgVar.zza.zza);
        if (iZza == -1) {
            return;
        }
        zzvh zzvhVar = this.zze;
        zzcz zzczVar = this.zzd;
        zzvhVar.zzd(iZza, zzczVar, false);
        long j2 = zzczVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzvgVar.zzs(j);
    }

    public final zzdc zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    protected final zzvo zzD(zzvo zzvoVar) {
        Object obj = this.zze.zzf;
        Object obj2 = zzvoVar.zza;
        if (obj != null && this.zze.zzf.equals(obj2)) {
            obj2 = zzvh.zzd;
        }
        return zzvoVar.zza(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzxt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzE(zzdc zzdcVar) {
        zzvo zzvoVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzdcVar);
            zzvg zzvgVar = this.zzf;
            if (zzvgVar != null) {
                zzL(zzvgVar.zzn());
            }
        } else if (zzdcVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzdcVar) : zzvh.zzr(zzdcVar, zzdb.zza, zzvh.zzd);
        } else {
            zzdcVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzc;
            zzvg zzvgVar2 = this.zzf;
            if (zzvgVar2 != null) {
                long jZzq = zzvgVar2.zzq();
                this.zze.zzn(zzvgVar2.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                long j = jZzq != 0 ? jZzq : 0L;
                Pair pairZzl = zzdcVar.zzl(this.zzc, this.zzd, 0, j);
                Object obj2 = pairZzl.first;
                long jLongValue = ((Long) pairZzl.second).longValue();
                this.zze = this.zzi ? this.zze.zzp(zzdcVar) : zzvh.zzr(zzdcVar, obj, obj2);
                zzvg zzvgVar3 = this.zzf;
                if (zzvgVar3 != null) {
                    zzL(jLongValue);
                    zzvo zzvoVar = zzvgVar3.zza;
                    zzvoVarZza = zzvoVar.zza(zzK(zzvoVar.zza));
                }
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzvoVarZza != null) {
            zzvg zzvgVar4 = this.zzf;
            zzvgVar4.getClass();
            zzvgVar4.zzr(zzvoVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzxt) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzxt, com.google.android.gms.internal.ads.zzvq
    public final void zzG(zzvm zzvmVar) {
        ((zzvg) zzvmVar).zzt();
        if (zzvmVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxt, com.google.android.gms.internal.ads.zzvq
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzvg zzI(zzvo zzvoVar, zzzv zzzvVar, long j) {
        zzvg zzvgVar = new zzvg(zzvoVar, zzzvVar, j);
        zzvgVar.zzu(this.zza);
        if (this.zzh) {
            zzvgVar.zzr(zzvoVar.zza(zzK(zzvoVar.zza)));
        } else {
            this.zzf = zzvgVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzxt) this).zza);
            }
        }
        return zzvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzuo
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzvq
    public final void zzt(zzbu zzbuVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzxo(this.zze.zzc, zzbuVar));
        } else {
            this.zze = zzvh.zzq(zzbuVar);
        }
        this.zza.zzt(zzbuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuw, com.google.android.gms.internal.ads.zzvq
    public final void zzz() {
    }
}
