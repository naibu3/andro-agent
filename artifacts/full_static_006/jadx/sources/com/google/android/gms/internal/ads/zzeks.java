package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeks extends zzeku {
    private final zzcjd zza;
    private final zzdjy zzb;
    private final zzcyt zzc;
    private final zzdfc zzd;
    private final zzelf zze;
    private final zzehq zzf;

    public zzeks(zzcjd zzcjdVar, zzdjy zzdjyVar, zzcyt zzcytVar, zzdfc zzdfcVar, zzelf zzelfVar, zzehq zzehqVar) {
        this.zza = zzcjdVar;
        this.zzb = zzdjyVar;
        this.zzc = zzcytVar;
        this.zzd = zzdfcVar;
        this.zze = zzelfVar;
        this.zzf = zzehqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    protected final ListenableFuture zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar) {
        zzcyt zzcytVar = this.zzc;
        zzcytVar.zzi(zzfhoVar);
        zzcytVar.zzf(bundle);
        zzcytVar.zzg(new zzcyn(zzfhfVar, zzfgtVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzcjd zzcjdVar = this.zza;
        zzcyt zzcytVar2 = this.zzc;
        zzdkc zzdkcVarZzh = zzcjdVar.zzh();
        zzdkcVarZzh.zzf(zzcytVar2.zzj());
        zzdkcVarZzh.zze(this.zzd);
        zzdkcVarZzh.zzd(this.zzb);
        zzdkcVarZzh.zzc(new zzcsc(null));
        zzcvx zzcvxVarZza = zzdkcVarZzh.zzg().zza();
        return zzcvxVarZza.zzi(zzcvxVarZza.zzj());
    }
}
