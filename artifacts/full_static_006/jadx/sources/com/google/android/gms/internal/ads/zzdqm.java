package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdqm implements zzgfp {
    final /* synthetic */ zzfgt zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzcqd zzc;
    final /* synthetic */ zzdqs zzd;

    zzdqm(zzdqs zzdqsVar, zzfgt zzfgtVar, zzfgw zzfgwVar, zzcqd zzcqdVar) {
        this.zza = zzfgtVar;
        this.zzb = zzfgwVar;
        this.zzc = zzcqdVar;
        this.zzd = zzdqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzchd zzchdVar = (zzchd) obj;
        zzchdVar.zzW(this.zza, this.zzb);
        zzciv zzcivVarZzN = zzchdVar.zzN();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzke)).booleanValue() || zzcivVarZzN == null) {
            return;
        }
        zzcqd zzcqdVar = this.zzc;
        zzdqs zzdqsVar = this.zzd;
        zzcivVarZzN.zzI(zzcqdVar, zzdqsVar.zzj, zzdqsVar.zzk);
        zzcqd zzcqdVar2 = this.zzc;
        zzdqs zzdqsVar2 = this.zzd;
        zzcivVarZzN.zzK(zzcqdVar2, zzdqsVar2.zzj, zzdqsVar2.zze);
    }
}
