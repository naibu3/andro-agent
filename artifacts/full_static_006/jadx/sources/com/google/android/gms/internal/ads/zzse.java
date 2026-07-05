package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzse implements zzqs {
    final /* synthetic */ zzsf zza;

    /* synthetic */ zzse(zzsf zzsfVar, zzsd zzsdVar) {
        this.zza = zzsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final void zza(Exception exc) {
        zzfk.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqs
    public final void zzb() {
        zzsf zzsfVar = this.zza;
        if (zzsfVar.zzm != null) {
            zzsfVar.zzm.zzb();
        }
    }
}
