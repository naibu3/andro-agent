package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfs {
    private static zzfs zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzfs(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzfr(this, null), intentFilter);
    }

    public static synchronized zzfs zzb(Context context) {
        if (zza == null) {
            zza = new zzfs(context);
        }
        return zza;
    }

    static /* synthetic */ void zzc(zzfs zzfsVar, int i) {
        synchronized (zzfsVar.zzd) {
            if (zzfsVar.zze == i) {
                return;
            }
            zzfsVar.zze = i;
            Iterator it = zzfsVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzzw zzzwVar = (zzzw) weakReference.get();
                if (zzzwVar != null) {
                    zzzwVar.zza.zzk(i);
                } else {
                    zzfsVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzzw zzzwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzzwVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
            @Override // java.lang.Runnable
            public final void run() {
                zzzwVar.zza.zzk(this.zza.zza());
            }
        });
    }
}
