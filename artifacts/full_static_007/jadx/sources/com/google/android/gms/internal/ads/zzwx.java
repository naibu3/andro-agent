package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzwx implements zzzp {
    public long zza;
    public long zzb;
    public zzzo zzc;
    public zzwx zzd;

    public zzwx(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzwx zzb() {
        this.zzc = null;
        zzwx zzwxVar = this.zzd;
        this.zzd = null;
        return zzwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final zzzo zzc() {
        zzzo zzzoVar = this.zzc;
        zzzoVar.getClass();
        return zzzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzp
    public final zzzp zzd() {
        zzwx zzwxVar = this.zzd;
        if (zzwxVar == null || zzwxVar.zzc == null) {
            return null;
        }
        return zzwxVar;
    }

    public final void zze(long j, int i) {
        zzeq.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
