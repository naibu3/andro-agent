package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzabq {
    private final zzabp zza;
    private final zzabu zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzer zzk = zzer.zza;

    public zzabq(Context context, zzabp zzabpVar, long j) {
        this.zza = zzabpVar;
        this.zzb = new zzabu(context);
    }

    private final void zzq(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r15 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r20 >= r24) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r17.zzc != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(long j, long j2, long j3, long j4, boolean z, zzabo zzaboVar) throws zzjh {
        zzabo.zzg(zzaboVar);
        if (this.zze == -9223372036854775807L) {
            this.zze = j2;
        }
        if (this.zzg != j) {
            this.zzb.zzd(j);
            this.zzg = j;
        }
        long jZzr = (long) ((j - j2) / this.zzj);
        if (this.zzc) {
            jZzr -= zzgd.zzr(SystemClock.elapsedRealtime()) - j3;
        }
        zzaboVar.zza = jZzr;
        long j5 = zzaboVar.zza;
        boolean z2 = false;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i = this.zzd;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException();
                        }
                        long jZzr2 = zzgd.zzr(SystemClock.elapsedRealtime()) - this.zzf;
                        if (this.zzc) {
                            if (j5 < -30000) {
                            }
                        }
                    }
                }
                return 0;
            }
        }
        if (!this.zzc || j2 == this.zze) {
            return 5;
        }
        zzabu zzabuVar = this.zzb;
        long jNanoTime = System.nanoTime();
        zzaboVar.zzb = zzabuVar.zza((zzaboVar.zza * 1000) + jNanoTime);
        zzaboVar.zza = (zzaboVar.zzb - jNanoTime) / 1000;
        if (this.zzh != -9223372036854775807L && !this.zzi) {
            z2 = true;
        }
        zzabp zzabpVar = this.zza;
        if (zzaboVar.zza >= -500000 || z || !((zzabj) zzabpVar).zzaP(j2, z2)) {
            return (zzaboVar.zza >= -30000 || z) ? zzaboVar.zza > 50000 ? 5 : 1 : z2 ? 3 : 2;
        }
        return 4;
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z) {
        this.zzd = z ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzgd.zzr(SystemClock.elapsedRealtime());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzq(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i) {
        this.zzb.zzj(i);
    }

    public final void zzk(zzer zzerVar) {
        this.zzk = zzerVar;
    }

    public final void zzl(float f) {
        this.zzb.zzc(f);
    }

    public final void zzm(Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f) {
        this.zzj = f;
        this.zzb.zze(f);
    }

    public final boolean zzo(boolean z) {
        boolean z2 = true;
        if (z && this.zzd == 3) {
            this.zzh = -9223372036854775807L;
        } else {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() >= this.zzh) {
                z2 = false;
                this.zzh = -9223372036854775807L;
            }
        }
        return z2;
    }

    public final boolean zzp() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzgd.zzr(SystemClock.elapsedRealtime());
        return i != 3;
    }
}
