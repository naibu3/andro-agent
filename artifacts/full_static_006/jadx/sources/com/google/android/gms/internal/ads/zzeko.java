package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeko implements zzgfp {
    final /* synthetic */ zzfgt zza;
    final /* synthetic */ zzekp zzb;

    zzeko(zzekp zzekpVar, zzfgt zzfgtVar) {
        this.zza = zzfgtVar;
        this.zzb = zzekpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zzh.zzb(th, this.zza);
            zzfgt zzfgtVarZza = this.zzb.zzh.zza();
            if (this.zza.zzaw) {
                while (zzfgtVarZza != null) {
                    this.zzb.zze(zzfgtVarZza);
                    zzfgtVarZza = this.zzb.zzh.zza();
                }
            } else if (zzfgtVarZza != null) {
                this.zzb.zze(zzfgtVarZza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzelg zzelgVar = (zzelg) obj;
        synchronized (this.zzb) {
            this.zzb.zzh.zzc(zzelgVar, this.zza);
            zzfgt zzfgtVarZza = this.zzb.zzh.zza();
            if (zzfgtVarZza != null) {
                this.zzb.zze(zzfgtVarZza);
            }
        }
    }
}
