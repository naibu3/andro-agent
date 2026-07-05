package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaai {
    public static final zzaac zza = new zzaac(0, -9223372036854775807L, null);
    public static final zzaac zzb = new zzaac(1, -9223372036854775807L, null);
    public static final zzaac zzc = new zzaac(2, -9223372036854775807L, null);
    public static final zzaac zzd = new zzaac(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzgd.zzE("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzaad zzf;
    private IOException zzg;

    public zzaai(String str) {
    }

    public static zzaac zzb(boolean z, long j) {
        return new zzaac(z ? 1 : 0, j, null);
    }

    public final long zza(zzaae zzaaeVar, zzaaa zzaaaVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        zzeq.zzb(looperMyLooper);
        this.zzg = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzaad(this, looperMyLooper, zzaaeVar, zzaaaVar, i, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzaad zzaadVar = this.zzf;
        zzeq.zzb(zzaadVar);
        zzaadVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzaad zzaadVar = this.zzf;
        if (zzaadVar != null) {
            zzaadVar.zzb(i);
        }
    }

    public final void zzj(zzaaf zzaafVar) {
        zzaad zzaadVar = this.zzf;
        if (zzaadVar != null) {
            zzaadVar.zza(true);
        }
        this.zze.execute(new zzaag(zzaafVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
