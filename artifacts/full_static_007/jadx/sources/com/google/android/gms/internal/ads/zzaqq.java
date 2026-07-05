package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaqq extends Thread {
    private static final boolean zza = zzarq.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaqo zzd;
    private volatile boolean zze = false;
    private final zzarr zzf;
    private final zzaqv zzg;

    public zzaqq(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaqo zzaqoVar, zzaqv zzaqvVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaqoVar;
        this.zzg = zzaqvVar;
        this.zzf = new zzarr(this, blockingQueue2, zzaqvVar);
    }

    private void zzc() throws InterruptedException {
        zzare zzareVar = (zzare) this.zzb.take();
        zzareVar.zzm("cache-queue-take");
        zzareVar.zzt(1);
        try {
            zzareVar.zzw();
            zzaqn zzaqnVarZza = this.zzd.zza(zzareVar.zzj());
            if (zzaqnVarZza == null) {
                zzareVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzareVar)) {
                    this.zzc.put(zzareVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzaqnVarZza.zza(jCurrentTimeMillis)) {
                    zzareVar.zzm("cache-hit-expired");
                    zzareVar.zze(zzaqnVarZza);
                    if (!this.zzf.zzc(zzareVar)) {
                        this.zzc.put(zzareVar);
                    }
                } else {
                    zzareVar.zzm("cache-hit");
                    zzark zzarkVarZzh = zzareVar.zzh(new zzara(zzaqnVarZza.zza, zzaqnVarZza.zzg));
                    zzareVar.zzm("cache-hit-parsed");
                    if (!zzarkVarZzh.zzc()) {
                        zzareVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzareVar.zzj(), true);
                        zzareVar.zze(null);
                        if (!this.zzf.zzc(zzareVar)) {
                            this.zzc.put(zzareVar);
                        }
                    } else if (zzaqnVarZza.zzf < jCurrentTimeMillis) {
                        zzareVar.zzm("cache-hit-refresh-needed");
                        zzareVar.zze(zzaqnVarZza);
                        zzarkVarZzh.zzd = true;
                        if (this.zzf.zzc(zzareVar)) {
                            this.zzg.zzb(zzareVar, zzarkVarZzh, null);
                        } else {
                            this.zzg.zzb(zzareVar, zzarkVarZzh, new zzaqp(this, zzareVar));
                        }
                    } else {
                        this.zzg.zzb(zzareVar, zzarkVarZzh, null);
                    }
                }
            }
        } finally {
            zzareVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (zza) {
            zzarq.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzarq.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
