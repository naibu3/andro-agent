package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzzs {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzzt zzztVar) {
        zzc(zzztVar);
        this.zza.add(new zzzr(handler, zzztVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzzr zzzrVar = (zzzr) it.next();
            if (!zzzrVar.zzc) {
                zzzrVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzq
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzzrVar.zzb.zzX(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzzt zzztVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzzr zzzrVar = (zzzr) it.next();
            if (zzzrVar.zzb == zzztVar) {
                zzzrVar.zzc();
                this.zza.remove(zzzrVar);
            }
        }
    }
}
