package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzekv extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzdfc zzc;
    private final zzelf zzd;
    private final zzehq zze;

    zzekv(zzcjd zzcjdVar, zzcyt zzcytVar, zzdfc zzdfcVar, zzelf zzelfVar, zzehq zzehqVar) {
        this.zza = zzcjdVar;
        this.zzb = zzcytVar;
        this.zzc = zzdfcVar;
        this.zzd = zzelfVar;
        this.zze = zzehqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    protected final ListenableFuture zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar) {
        zzcyt zzcytVar = this.zzb;
        zzcytVar.zzi(zzfhoVar);
        zzcytVar.zzf(bundle);
        zzcytVar.zzg(new zzcyn(zzfhfVar, zzfgtVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcjd zzcjdVar = this.zza;
        zzcyt zzcytVar2 = this.zzb;
        zzcrs zzcrsVarZzd = zzcjdVar.zzd();
        zzcrsVarZzd.zzd(zzcytVar2.zzj());
        zzcrsVarZzd.zzc(this.zzc);
        zzcvx zzcvxVarZzb = zzcrsVarZzd.zze().zzb();
        return zzcvxVarZzb.zzi(zzcvxVarZzb.zzj());
    }
}
