package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzpk {
    private static zzgbh<Integer> zzb() {
        zzgbg zzgbgVar = new zzgbg();
        zzgbgVar.zzg(8, 7);
        if (zzgd.zza >= 31) {
            zzgbgVar.zzg(26, 27);
        }
        if (zzgd.zza >= 33) {
            zzgbgVar.zzf((Object) 30);
        }
        return zzgbgVar.zzi();
    }

    public static boolean zza(AudioManager audioManager, zzpx zzpxVar) {
        AudioDeviceInfo[] devices;
        if (zzpxVar == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{zzpxVar.zza};
        }
        zzgbh<Integer> zzgbhVarZzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzgbhVarZzb.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
