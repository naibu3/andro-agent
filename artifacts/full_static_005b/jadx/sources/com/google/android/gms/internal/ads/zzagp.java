package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzagp implements zzadx {
    private final long zzb;
    private final zzadx zzc;

    public zzagp(long j, zzadx zzadxVar) {
        this.zzb = j;
        this.zzc = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzO(zzaet zzaetVar) {
        this.zzc.zzO(new zzago(this, zzaetVar, zzaetVar));
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final zzafa zzw(int i, int i2) {
        return this.zzc.zzw(i, i2);
    }
}
