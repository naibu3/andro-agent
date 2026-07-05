package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzalw implements zzadx {
    private final zzadx zzb;
    private final zzalt zzc;
    private final SparseArray zzd = new SparseArray();

    public zzalw(zzadx zzadxVar, zzalt zzaltVar) {
        this.zzb = zzadxVar;
        this.zzc = zzaltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzO(zzaet zzaetVar) {
        this.zzb.zzO(zzaetVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final zzafa zzw(int i, int i2) {
        if (i2 != 3) {
            return this.zzb.zzw(i, i2);
        }
        zzaly zzalyVar = (zzaly) this.zzd.get(i);
        if (zzalyVar != null) {
            return zzalyVar;
        }
        zzaly zzalyVar2 = new zzaly(this.zzb.zzw(i, 3), this.zzc);
        this.zzd.put(i, zzalyVar2);
        return zzalyVar2;
    }
}
