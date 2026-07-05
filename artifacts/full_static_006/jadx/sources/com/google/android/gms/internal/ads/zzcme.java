package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcme implements zzdwe {
    private final Long zza;
    private final String zzb;
    private final zzcla zzc;
    private final zzcmi zzd;
    private final zzcme zze = this;

    /* synthetic */ zzcme(zzcla zzclaVar, zzcmi zzcmiVar, Long l, String str, zzcmd zzcmdVar) {
        this.zzc = zzclaVar;
        this.zzd = zzcmiVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdwe
    public final zzdwo zza() {
        zzcmi zzcmiVar = this.zzd;
        return zzdwp.zza(this.zza.longValue(), zzcmiVar.zza, zzdwi.zzc(zzcmiVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdwe
    public final zzdws zzb() {
        zzcmi zzcmiVar = this.zzd;
        return zzdwt.zza(this.zza.longValue(), zzcmiVar.zza, zzdwi.zzc(zzcmiVar.zzb), this.zzc, this.zzb);
    }
}
