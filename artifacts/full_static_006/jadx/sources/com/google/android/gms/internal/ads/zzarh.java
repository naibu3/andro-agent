package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzarh {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaqo zze;
    private final zzaqx zzf;
    private final zzaqy[] zzg;
    private zzaqq zzh;
    private final List zzi;
    private final List zzj;
    private final zzaqv zzk;

    public zzarh(zzaqo zzaqoVar, zzaqx zzaqxVar, int i) {
        zzaqv zzaqvVar = new zzaqv(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaqoVar;
        this.zzf = zzaqxVar;
        this.zzg = new zzaqy[4];
        this.zzk = zzaqvVar;
    }

    public final zzare zza(zzare zzareVar) {
        zzareVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzareVar);
        }
        zzareVar.zzg(this.zza.incrementAndGet());
        zzareVar.zzm("add-to-queue");
        zzc(zzareVar, 0);
        this.zzc.add(zzareVar);
        return zzareVar;
    }

    final void zzb(zzare zzareVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzareVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzarg) it.next()).zza();
            }
        }
        zzc(zzareVar, 5);
    }

    final void zzc(zzare zzareVar, int i) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzaqq zzaqqVar = this.zzh;
        if (zzaqqVar != null) {
            zzaqqVar.zzb();
        }
        zzaqy[] zzaqyVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzaqy zzaqyVar = zzaqyVarArr[i];
            if (zzaqyVar != null) {
                zzaqyVar.zza();
            }
        }
        zzaqq zzaqqVar2 = new zzaqq(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaqqVar2;
        zzaqqVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzaqy zzaqyVar2 = new zzaqy(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzaqyVar2;
            zzaqyVar2.start();
        }
    }
}
