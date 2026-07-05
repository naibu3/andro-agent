package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzrb {
    public static zzqa zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return zzqa.zza;
        }
        zzpy zzpyVar = new zzpy();
        zzpyVar.zza(true);
        zzpyVar.zzc(z);
        return zzpyVar.zzd();
    }
}
