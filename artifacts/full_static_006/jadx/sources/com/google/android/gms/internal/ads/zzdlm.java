package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdlm implements zzgfp {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdlo zzb;

    zzdlm(zzdlo zzdloVar, String str, boolean z) {
        this.zzb = zzdloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze.zzT((zzchd) obj);
        zzdlo zzdloVar = this.zzb;
        zzccn zzccnVarZzp = zzdloVar.zze.zzp();
        zzehg zzehgVarZzf = zzdloVar.zzf(this.zza, true);
        if (zzehgVarZzf != null && zzccnVarZzp != null) {
            zzccnVarZzp.zzc(zzehgVarZzf);
        } else if (zzccnVarZzp != null) {
            zzccnVarZzp.cancel(false);
        }
    }
}
