package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcdc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcdi zzc;

    zzcdc(zzcdi zzcdiVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdi zzcdiVar = this.zzc;
        if (zzcdiVar.zzq != null) {
            zzcdiVar.zzq.zzb(this.zza, this.zzb);
        }
    }
}
