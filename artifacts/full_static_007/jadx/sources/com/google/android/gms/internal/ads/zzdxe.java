package com.google.android.gms.internal.ads;

import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdxe extends zzbnq {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfmc zzd;
    final /* synthetic */ zzccn zze;
    final /* synthetic */ zzdxf zzf;

    zzdxe(zzdxf zzdxfVar, Object obj, String str, long j, zzfmc zzfmcVar, zzccn zzccnVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfmcVar;
        this.zze = zzccnVar;
        this.zzf = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final void zze(String str) {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            this.zzf.zzo.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzfmq zzfmqVar = this.zzf.zzp;
            zzfmc zzfmcVar = this.zzd;
            zzfmcVar.zzc(str);
            zzfmcVar.zzh(false);
            zzfmqVar.zzb(zzfmcVar.zzn());
            this.zze.zzc(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final void zzf() {
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            this.zzf.zzl.zzd(this.zzb);
            this.zzf.zzo.zzd(this.zzb);
            zzfmq zzfmqVar = this.zzf.zzp;
            zzfmc zzfmcVar = this.zzd;
            zzfmcVar.zzh(true);
            zzfmqVar.zzb(zzfmcVar.zzn());
            this.zze.zzc(true);
        }
    }
}
