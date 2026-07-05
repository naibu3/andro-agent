package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaqy extends Thread {
    private final BlockingQueue zza;
    private final zzaqx zzb;
    private final zzaqo zzc;
    private volatile boolean zzd = false;
    private final zzaqv zze;

    public zzaqy(BlockingQueue blockingQueue, zzaqx zzaqxVar, zzaqo zzaqoVar, zzaqv zzaqvVar) {
        this.zza = blockingQueue;
        this.zzb = zzaqxVar;
        this.zzc = zzaqoVar;
        this.zze = zzaqvVar;
    }

    private void zzb() throws InterruptedException {
        zzare zzareVar = (zzare) this.zza.take();
        SystemClock.elapsedRealtime();
        zzareVar.zzt(3);
        try {
            try {
                zzareVar.zzm("network-queue-take");
                zzareVar.zzw();
                TrafficStats.setThreadStatsTag(zzareVar.zzc());
                zzara zzaraVarZza = this.zzb.zza(zzareVar);
                zzareVar.zzm("network-http-complete");
                if (zzaraVarZza.zze && zzareVar.zzv()) {
                    zzareVar.zzp("not-modified");
                    zzareVar.zzr();
                } else {
                    zzark zzarkVarZzh = zzareVar.zzh(zzaraVarZza);
                    zzareVar.zzm("network-parse-complete");
                    if (zzarkVarZzh.zzb != null) {
                        this.zzc.zzd(zzareVar.zzj(), zzarkVarZzh.zzb);
                        zzareVar.zzm("network-cache-written");
                    }
                    zzareVar.zzq();
                    this.zze.zzb(zzareVar, zzarkVarZzh, null);
                    zzareVar.zzs(zzarkVarZzh);
                }
            } catch (zzarn e) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzareVar, e);
                zzareVar.zzr();
            } catch (Exception e2) {
                zzarq.zzc(e2, "Unhandled exception %s", e2.toString());
                zzarn zzarnVar = new zzarn(e2);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzareVar, zzarnVar);
                zzareVar.zzr();
            }
        } finally {
            zzareVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzarq.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
