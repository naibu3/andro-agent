package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaad extends Handler implements Runnable {
    final /* synthetic */ zzaai zza;
    private final zzaae zzb;
    private final long zzc;
    private zzaaa zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaad(zzaai zzaaiVar, Looper looper, zzaae zzaaeVar, zzaaa zzaaaVar, int i, long j) {
        super(looper);
        this.zza = zzaaiVar;
        this.zzb = zzaaeVar;
        this.zzd = zzaaaVar;
        this.zzc = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        if (message.what == 0) {
            zzd();
            return;
        }
        if (message.what == 3) {
            throw ((Error) message.obj);
        }
        this.zza.zzf = null;
        long j = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - j;
        zzaaa zzaaaVar = this.zzd;
        zzaaaVar.getClass();
        if (this.zzh) {
            zzaaaVar.zzJ(this.zzb, jElapsedRealtime, j2, false);
            return;
        }
        int i = message.what;
        if (i == 1) {
            try {
                zzaaaVar.zzK(this.zzb, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                zzfk.zzd("LoadTask", "Unexpected exception handling load completed", e);
                this.zza.zzg = new zzaah(e);
                return;
            }
        }
        if (i != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i2 = this.zzf + 1;
        this.zzf = i2;
        zzaac zzaacVarZzu = zzaaaVar.zzu(this.zzb, jElapsedRealtime, j2, iOException, i2);
        if (zzaacVarZzu.zza == 3) {
            this.zza.zzg = this.zze;
        } else if (zzaacVarZzu.zza != 2) {
            if (zzaacVarZzu.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzaacVarZzu.zzb != -9223372036854775807L ? zzaacVarZzu.zzb : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.zzi) {
                return;
            }
            zzfk.zzd("LoadTask", "OutOfMemory error loading stream", e2);
            obtainMessage(2, new zzaah(e2)).sendToTarget();
        } catch (Error e3) {
            if (!this.zzi) {
                zzfk.zzd("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.zzi) {
                return;
            }
            zzfk.zzd("LoadTask", "Unexpected exception loading stream", e4);
            obtainMessage(2, new zzaah(e4)).sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzaaa zzaaaVar = this.zzd;
            zzaaaVar.getClass();
            zzaaaVar.zzJ(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzeq.zzf(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    private final void zzd() {
        this.zze = null;
        zzaai zzaaiVar = this.zza;
        ExecutorService executorService = zzaaiVar.zze;
        zzaad zzaadVar = zzaaiVar.zzf;
        zzaadVar.getClass();
        executorService.execute(zzaadVar);
    }
}
