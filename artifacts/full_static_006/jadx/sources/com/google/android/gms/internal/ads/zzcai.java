package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcai {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcau zzc;

    zzcai(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcau zzcauVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcauVar;
    }

    public final void zza(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaq)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzar)).booleanValue()) {
            this.zzb.zzM(i);
            this.zzb.zzN(j);
        } else {
            this.zzb.zzM(-1);
            this.zzb.zzN(j);
        }
    }
}
