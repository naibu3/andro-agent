package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzrc {
    public static zzqa zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzqa.zza;
        }
        zzpy zzpyVar = new zzpy();
        boolean z2 = false;
        if (zzgd.zza > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        zzpyVar.zza(true);
        zzpyVar.zzb(z2);
        zzpyVar.zzc(z);
        return zzpyVar.zzd();
    }
}
