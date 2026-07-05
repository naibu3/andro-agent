package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcmc implements zzdwd {
    private final zzcla zza;
    private final zzcmi zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcmc(zzcla zzclaVar, zzcmi zzcmiVar, zzcmb zzcmbVar) {
        this.zza = zzclaVar;
        this.zzb = zzcmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwd
    public final /* synthetic */ zzdwd zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwd
    public final /* bridge */ /* synthetic */ zzdwd zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwd
    public final zzdwe zzc() {
        zzhkx.zzc(this.zzc, Long.class);
        zzhkx.zzc(this.zzd, String.class);
        return new zzcme(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
