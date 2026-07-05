package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzarc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzare zzc;

    zzarc(zzare zzareVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzareVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzare zzareVar = this.zzc;
        zzareVar.zza.zzb(zzareVar.toString());
    }
}
