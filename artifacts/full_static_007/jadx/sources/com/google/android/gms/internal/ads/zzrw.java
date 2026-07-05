package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzrw extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzrz zza;
    final /* synthetic */ zzrx zzb;

    zzrw(zzrx zzrxVar, zzrz zzrzVar) {
        this.zza = zzrzVar;
        this.zzb = zzrxVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzrz zzrzVar = this.zzb.zza;
            if (zzrzVar.zzq == null || !zzrzVar.zzS) {
                return;
            }
            zzrzVar.zzq.zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            this.zzb.zza.zzR = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzu)) {
            zzrz zzrzVar = this.zzb.zza;
            if (zzrzVar.zzq == null || !zzrzVar.zzS) {
                return;
            }
            zzrzVar.zzq.zzb();
        }
    }
}
