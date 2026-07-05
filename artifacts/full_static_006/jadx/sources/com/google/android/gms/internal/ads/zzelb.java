package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzelb extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzdfc zzc;
    private final zzelf zzd;

    @Nullable
    private final zzfhg zze;
    private final zzehq zzf;

    public zzelb(zzcjd zzcjdVar, zzcyt zzcytVar, zzdfc zzdfcVar, @Nullable zzfhg zzfhgVar, zzelf zzelfVar, zzehq zzehqVar) {
        this.zza = zzcjdVar;
        this.zzb = zzcytVar;
        this.zzc = zzdfcVar;
        this.zze = zzfhgVar;
        this.zzd = zzelfVar;
        this.zzf = zzehqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    protected final ListenableFuture zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar) {
        zzfhg zzfhgVar;
        zzcyt zzcytVar = this.zzb;
        zzcytVar.zzi(zzfhoVar);
        zzcytVar.zzf(bundle);
        zzcytVar.zzg(new zzcyn(zzfhfVar, zzfgtVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdz)).booleanValue() && (zzfhgVar = this.zze) != null) {
            this.zzb.zzh(zzfhgVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcjd zzcjdVar = this.zza;
        zzcyt zzcytVar2 = this.zzb;
        zzdrl zzdrlVarZzi = zzcjdVar.zzi();
        zzdrlVarZzi.zzd(zzcytVar2.zzj());
        zzdrlVarZzi.zzc(this.zzc);
        zzcvx zzcvxVarZzb = zzdrlVarZzi.zze().zzb();
        return zzcvxVarZzb.zzi(zzcvxVarZzb.zzj());
    }
}
