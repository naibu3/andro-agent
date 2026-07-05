package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzwo implements zzxf {
    final /* synthetic */ zzwr zza;
    private final int zzb;

    public zzwo(zzwr zzwrVar, int i) {
        this.zza = zzwrVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zza(zzlj zzljVar, zzin zzinVar, int i) {
        return this.zza.zzg(this.zzb, zzljVar, zzinVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxf
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
