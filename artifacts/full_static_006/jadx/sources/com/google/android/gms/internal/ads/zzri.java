package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzri {
    public static void zza(AudioTrack audioTrack, zzpx zzpxVar) {
        audioTrack.setPreferredDevice(zzpxVar == null ? null : zzpxVar.zza);
    }
}
