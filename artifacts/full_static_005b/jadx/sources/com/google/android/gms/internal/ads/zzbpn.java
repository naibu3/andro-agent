package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbpn extends zzccu {
    private final Object zza = new Object();
    private final zzbps zzb;
    private boolean zzc;

    public zzbpn(zzbps zzbpsVar) {
        this.zzb = zzbpsVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
            if (this.zzc) {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new zzbpk(this), new zzccq());
            zzj(new zzbpl(this), new zzbpm(this));
            com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
        }
    }
}
