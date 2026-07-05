package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcuh {
    private final zzdca zza;
    private final zzdeh zzb;

    public zzcuh(zzdca zzdcaVar, zzdeh zzdehVar) {
        this.zza = zzdcaVar;
        this.zzb = zzdehVar;
    }

    public final zzdca zza() {
        return this.zza;
    }

    final zzdeh zzb() {
        return this.zzb;
    }

    final zzdha zzc() {
        zzdeh zzdehVar = this.zzb;
        return zzdehVar != null ? new zzdha(zzdehVar, zzcci.zzf) : new zzdha(new zzcug(this), zzcci.zzf);
    }
}
