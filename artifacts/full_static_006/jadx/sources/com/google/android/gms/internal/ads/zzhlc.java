package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhlc {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhlc(int i, int i2, zzhlb zzhlbVar) {
        this.zza = zzhkm.zzc(i);
        this.zzb = zzhkm.zzc(i2);
    }

    public final zzhlc zza(zzhky zzhkyVar) {
        this.zzb.add(zzhkyVar);
        return this;
    }

    public final zzhlc zzb(zzhky zzhkyVar) {
        this.zza.add(zzhkyVar);
        return this;
    }

    public final zzhld zzc() {
        return new zzhld(this.zza, this.zzb, null);
    }
}
