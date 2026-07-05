package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzuu implements zzvy, zzsp {
    final /* synthetic */ zzuw zza;
    private final Object zzb;
    private zzvx zzc;
    private zzso zzd;

    public zzuu(zzuw zzuwVar, Object obj) {
        this.zza = zzuwVar;
        this.zzc = zzuwVar.zze(null);
        this.zzd = zzuwVar.zzc(null);
        this.zzb = obj;
    }

    private final zzvk zzf(zzvk zzvkVar, zzvo zzvoVar) {
        zzuw zzuwVar = this.zza;
        Object obj = this.zzb;
        long j = zzvkVar.zzc;
        zzuwVar.zzx(obj, j, zzvoVar);
        zzuw zzuwVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzvkVar.zzd;
        zzuwVar2.zzx(obj2, j2, zzvoVar);
        return (j == zzvkVar.zzc && j2 == zzvkVar.zzd) ? zzvkVar : new zzvk(1, zzvkVar.zza, zzvkVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, zzvo zzvoVar) {
        zzvo zzvoVarZzy;
        if (zzvoVar != null) {
            zzvoVarZzy = this.zza.zzy(this.zzb, zzvoVar);
            if (zzvoVarZzy == null) {
                return false;
            }
        } else {
            zzvoVarZzy = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzvx zzvxVar = this.zzc;
        int i2 = zzvxVar.zza;
        if (!zzgd.zzG(zzvxVar.zzb, zzvoVarZzy)) {
            this.zzc = this.zza.zzf(0, zzvoVarZzy);
        }
        zzso zzsoVar = this.zzd;
        int i3 = zzsoVar.zza;
        if (zzgd.zzG(zzsoVar.zzb, zzvoVarZzy)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzvoVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzae(int i, zzvo zzvoVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzc(zzf(zzvkVar, zzvoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzaf(int i, zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzd(zzvfVar, zzf(zzvkVar, zzvoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzag(int i, zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zze(zzvfVar, zzf(zzvkVar, zzvoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzah(int i, zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar, IOException iOException, boolean z) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzf(zzvfVar, zzf(zzvkVar, zzvoVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzai(int i, zzvo zzvoVar, zzvf zzvfVar, zzvk zzvkVar) {
        if (zzg(0, zzvoVar)) {
            this.zzc.zzg(zzvfVar, zzf(zzvkVar, zzvoVar));
        }
    }
}
