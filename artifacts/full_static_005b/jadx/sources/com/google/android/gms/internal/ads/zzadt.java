package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzadt implements zzafa {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ int zzf(zzu zzuVar, int i, boolean z) {
        return zzaey.zza(this, zzuVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final int zzg(zzu zzuVar, int i, boolean z, int i2) throws IOException {
        int iZza = zzuVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzl(zzan zzanVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ void zzq(zzfu zzfuVar, int i) {
        zzaey.zzb(this, zzfuVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzr(zzfu zzfuVar, int i, int i2) {
        zzfuVar.zzL(i);
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final void zzs(long j, int i, int i2, int i3, zzaez zzaezVar) {
    }
}
