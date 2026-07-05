package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzepp {
    private final zzdme zza;
    private final zzepc zzb;
    private final zzczo zzc;

    public zzepp(zzdme zzdmeVar, zzdvc zzdvcVar) {
        this.zza = zzdmeVar;
        final zzepc zzepcVar = new zzepc(zzdvcVar);
        this.zzb = zzepcVar;
        final zzboi zzboiVarZzg = zzdmeVar.zzg();
        this.zzc = new zzczo() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // com.google.android.gms.internal.ads.zzczo
            public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzepcVar.zzdB(zzeVar);
                zzboi zzboiVar = zzboiVarZzg;
                if (zzboiVar != null) {
                    try {
                        zzboiVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzboiVar != null) {
                    try {
                        zzboiVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzczo zza() {
        return this.zzc;
    }

    public final zzdaz zzb() {
        return this.zzb;
    }

    public final zzdjy zzc() {
        return new zzdjy(this.zza, this.zzb.zzg());
    }

    public final zzepc zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zzj(zzbhVar);
    }
}
