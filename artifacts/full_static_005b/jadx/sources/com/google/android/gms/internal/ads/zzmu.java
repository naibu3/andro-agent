package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzmu implements zzlp {
    private final zzer zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzcl zze = zzcl.zza;

    public zzmu(zzer zzerVar) {
        this.zza = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final long zza() {
        long j = this.zzc;
        if (!this.zzb) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzcl zzclVar = this.zze;
        return j + (zzclVar.zzc == 1.0f ? zzgd.zzr(jElapsedRealtime) : zzclVar.zza(jElapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final zzcl zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (this.zzb) {
            return;
        }
        this.zzd = SystemClock.elapsedRealtime();
        this.zzb = true;
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zzg(zzcl zzclVar) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}
