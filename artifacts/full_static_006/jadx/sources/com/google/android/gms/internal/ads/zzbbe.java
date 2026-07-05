package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbbe implements Runnable {
    final /* synthetic */ zzbbf zza;

    zzbbe(zzbbf zzbbfVar) {
        this.zza = zzbbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            zzbbf zzbbfVar = this.zza;
            if (zzbbfVar.zzd && zzbbfVar.zze) {
                zzbbfVar.zzd = false;
                com.google.android.gms.ads.internal.util.client.zzm.zze("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbbg) it.next()).zza(false);
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground");
            }
        }
    }
}
