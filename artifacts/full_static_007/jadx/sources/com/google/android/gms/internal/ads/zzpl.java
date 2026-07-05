package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzpl {
    public static int zza(int i, int i2, zzk zzkVar) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iZzh = zzgd.zzh(i3);
            if (iZzh != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iZzh).build(), zzkVar.zza().zza)) {
                return i3;
            }
        }
        return 0;
    }

    public static zzgbc<Integer> zzb(zzk zzkVar) {
        zzgaz zzgazVar = new zzgaz();
        zzgdi it = zzpp.zzb.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (zzgd.zza >= zzgd.zzg(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzkVar.zza().zza)) {
                zzgazVar.zzf(Integer.valueOf(iIntValue));
            }
        }
        zzgazVar.zzf((Object) 2);
        return zzgazVar.zzi();
    }
}
