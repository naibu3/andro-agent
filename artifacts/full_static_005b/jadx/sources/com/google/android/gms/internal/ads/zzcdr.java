package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcdr implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcds zzb;

    zzcdr(zzcds zzcdsVar, boolean z) {
        this.zza = z;
        this.zzb = zzcdsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
