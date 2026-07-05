package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzza {
    public final int zza;
    public final zzde zzb;
    public final int zzc;
    public final zzan zzd;

    public zzza(int i, zzde zzdeVar, int i2) {
        this.zza = i;
        this.zzb = zzdeVar;
        this.zzc = i2;
        this.zzd = zzdeVar.zzb(i2);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzza zzzaVar);
}
