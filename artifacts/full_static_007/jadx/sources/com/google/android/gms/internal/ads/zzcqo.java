package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcqo implements zzgfp {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcqp zzb;

    zzcqo(zzcqp zzcqpVar, String str) {
        this.zza = str;
        this.zzb = zzcqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzcqp zzcqpVar = this.zzb;
        zzcqpVar.zzh.zza(zzcqpVar.zzg.zzd(zzcqpVar.zze, zzcqpVar.zzf, false, this.zza, null, zzcqpVar.zzu()));
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcqp zzcqpVar = this.zzb;
        zzcqpVar.zzh.zza(zzcqpVar.zzg.zzd(zzcqpVar.zze, zzcqpVar.zzf, false, this.zza, (String) obj, zzcqpVar.zzu()));
    }
}
