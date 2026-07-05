package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzso {
    public final int zza;
    public final zzvo zzb;
    private final CopyOnWriteArrayList zzc;

    public zzso() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzso(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzvo zzvoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvoVar;
    }

    public final zzso zza(int i, zzvo zzvoVar) {
        return new zzso(this.zzc, 0, zzvoVar);
    }

    public final void zzb(Handler handler, zzsp zzspVar) {
        this.zzc.add(new zzsn(handler, zzspVar));
    }

    public final void zzc(zzsp zzspVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzsn zzsnVar = (zzsn) it.next();
            if (zzsnVar.zzb == zzspVar) {
                this.zzc.remove(zzsnVar);
            }
        }
    }
}
