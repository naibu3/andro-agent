package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzapy {
    public final int zza;
    public final long zzb;

    private zzapy(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzapy zza(zzadv zzadvVar, zzfu zzfuVar) throws IOException {
        ((zzadi) zzadvVar).zzm(zzfuVar.zzM(), 0, 8, false);
        zzfuVar.zzK(0);
        return new zzapy(zzfuVar.zzg(), zzfuVar.zzs());
    }
}
