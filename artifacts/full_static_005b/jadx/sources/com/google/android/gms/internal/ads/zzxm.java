package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzxm implements zzxf {
    private final zzxf zza;
    private final long zzb;

    public zzxm(zzxf zzxfVar, long j) {
        this.zza = zzxfVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zza(zzlj zzljVar, zzin zzinVar, int i) {
        int iZza = this.zza.zza(zzljVar, zzinVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzinVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzxf zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final boolean zze() {
        return this.zza.zze();
    }
}
