package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzxj extends zzdc {
    private static final Object zzc = new Object();
    private static final zzbu zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    private final zzbu zzh;
    private final zzbk zzi;

    static {
        zzaw zzawVar = new zzaw();
        zzawVar.zza("SinglePeriodTimeline");
        zzawVar.zzb(Uri.EMPTY);
        zzd = zzawVar.zzc();
    }

    public zzxj(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, zzbu zzbuVar, zzbk zzbkVar) {
        this.zze = j4;
        this.zzf = j5;
        this.zzg = z;
        zzbuVar.getClass();
        this.zzh = zzbuVar;
        this.zzi = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
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
        zzeq.zza(i, 0, 1);
        zzczVar.zzl(null, z ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i, zzdb zzdbVar, long j) {
        zzeq.zza(i, 0, 1);
        Object obj = zzdb.zza;
        zzbu zzbuVar = this.zzh;
        long j2 = this.zzf;
        zzdbVar.zza(obj, zzbuVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, j2, 0, 0, 0L);
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i) {
        zzeq.zza(i, 0, 1);
        return zzc;
    }
}
