package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzmj {
    private final zzmi zza;
    private final zzmh zzb;
    private final zzer zzc;
    private final zzdc zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzmj(zzmh zzmhVar, zzmi zzmiVar, zzdc zzdcVar, int i, zzer zzerVar, Looper looper) {
        this.zzb = zzmhVar;
        this.zza = zzmiVar;
        this.zzd = zzdcVar;
        this.zzg = looper;
        this.zzc = zzerVar;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzmi zzc() {
        return this.zza;
    }

    public final zzmj zzd() {
        zzeq.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzmj zze(Object obj) {
        zzeq.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzmj zzf(int i) {
        zzeq.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        zzeq.zzf(this.zzi);
        zzeq.zzf(this.zzg.getThread() != Thread.currentThread());
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzk) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
