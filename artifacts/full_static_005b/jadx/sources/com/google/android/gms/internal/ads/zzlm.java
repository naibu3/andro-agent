package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzlm {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlm() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    /* synthetic */ zzlm(zzlo zzloVar, zzll zzllVar) {
        this.zza = zzloVar.zza;
        this.zzb = zzloVar.zzb;
        this.zzc = zzloVar.zzc;
    }

    public final zzlm zzd(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzeq.zzd(z);
        this.zzc = j;
        return this;
    }

    public final zzlm zze(long j) {
        this.zza = j;
        return this;
    }

    public final zzlm zzf(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzeq.zzd(z);
        this.zzb = f;
        return this;
    }

    public final zzlo zzg() {
        return new zzlo(this, null);
    }
}
