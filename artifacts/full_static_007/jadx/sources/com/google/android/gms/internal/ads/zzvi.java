package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzvi extends zzdc {
    private final zzbu zzc;

    public zzvi(zzbu zzbuVar) {
        this.zzc = zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        return obj == zzvh.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i, zzcz zzczVar, boolean z) {
        zzczVar.zzl(z ? 0 : null, z ? zzvh.zzd : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i, zzdb zzdbVar, long j) {
        zzdbVar.zza(zzdb.zza, this.zzc, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzdbVar.zzm = true;
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i) {
        return zzvh.zzd;
    }
}
