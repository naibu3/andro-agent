package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfpv implements Runnable {
    final /* synthetic */ zzfpw zza;
    private final WebView zzb;

    zzfpv(zzfpw zzfpwVar) {
        this.zza = zzfpwVar;
        this.zzb = zzfpwVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
