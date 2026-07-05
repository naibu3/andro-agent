package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzum implements zztn {
    private final MediaCodec zza;

    public zzum(MediaCodec mediaCodec) {
        this.zza = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzd(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zze(int i, int i2, zzik zzikVar, long j, int i3) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i, 0, zzikVar.zza(), j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzf(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzh() {
    }
}
