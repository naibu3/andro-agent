package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzagg {
    protected final zzafa zza;

    protected zzagg(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    protected abstract boolean zza(zzfu zzfuVar) throws zzch;

    protected abstract boolean zzb(zzfu zzfuVar, long j) throws zzch;

    public final boolean zzf(zzfu zzfuVar, long j) throws zzch {
        return zza(zzfuVar) && zzb(zzfuVar, j);
    }
}
