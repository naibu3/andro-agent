package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdll implements zzban {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdlo zzb;

    zzdll(zzdlo zzdloVar, String str) {
        this.zza = str;
        this.zzb = zzdloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbK)).booleanValue()) {
            if (zzbamVar.zzj) {
                zzdlo zzdloVar = this.zzb;
                zzdloVar.zzy.put(this.zza, true);
                zzdlo zzdloVar2 = this.zzb;
                zzdloVar2.zzB(zzdloVar2.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzbamVar.zzj) {
                zzdlo zzdloVar3 = this.zzb;
                if (zzdloVar3.zzo == null) {
                    return;
                }
                zzdloVar3.zzy.put(this.zza, true);
                zzdlo zzdloVar4 = this.zzb;
                zzdloVar4.zzB(zzdloVar4.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
            }
        }
    }
}
