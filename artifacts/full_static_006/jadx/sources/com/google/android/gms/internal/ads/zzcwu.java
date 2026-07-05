package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcwu implements zzdew, zzdaz {
    private final Clock zza;
    private final zzcww zzb;
    private final zzfho zzc;
    private final String zzd;

    zzcwu(Clock clock, zzcww zzcwwVar, zzfho zzfhoVar, String str) {
        this.zza = clock;
        this.zzb = zzcwwVar;
        this.zzc = zzfhoVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        zzfho zzfhoVar = this.zzc;
        this.zzb.zzd(zzfhoVar.zzf, this.zzd, this.zza.elapsedRealtime());
    }
}
