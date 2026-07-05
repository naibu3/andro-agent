package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdre implements zzbmg {
    private final zzdas zza;
    private final zzbyt zzb;
    private final String zzc;
    private final String zzd;

    public zzdre(zzdas zzdasVar, zzfgt zzfgtVar) {
        this.zza = zzdasVar;
        this.zzb = zzfgtVar.zzm;
        this.zzc = zzfgtVar.zzk;
        this.zzd = zzfgtVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    @ParametersAreNonnullByDefault
    public final void zza(zzbyt zzbytVar) {
        int i;
        String str;
        zzbyt zzbytVar2 = this.zzb;
        if (zzbytVar2 != null) {
            zzbytVar = zzbytVar2;
        }
        if (zzbytVar != null) {
            str = zzbytVar.zza;
            i = zzbytVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbye(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zzc() {
        this.zza.zzf();
    }
}
