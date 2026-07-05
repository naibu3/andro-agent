package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzpm {
    public static zzpp zza(AudioManager audioManager, zzk zzkVar) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzkVar.zza().zza);
        HashMap map = new HashMap();
        map.put(2, new HashSet(zzgea.zzf(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (zzgd.zzK(format) || zzpp.zzb.containsKey(Integer.valueOf(format))) {
                    Integer numValueOf = Integer.valueOf(format);
                    if (map.containsKey(numValueOf)) {
                        Set set = (Set) map.get(numValueOf);
                        set.getClass();
                        set.addAll(zzgea.zzf(audioProfile.getChannelMasks()));
                    } else {
                        map.put(numValueOf, new HashSet(zzgea.zzf(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        zzgaz zzgazVar = new zzgaz();
        for (Map.Entry entry : map.entrySet()) {
            zzgazVar.zzf(new zzpn(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzpp(zzgazVar.zzi());
    }

    public static zzpx zzb(AudioManager audioManager, zzk zzkVar) {
        if (audioManager == null) {
            throw null;
        }
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzkVar.zza().zza);
        if (!audioDevicesForAttributes.isEmpty()) {
            return new zzpx(audioDevicesForAttributes.get(0));
        }
        return null;
    }
}
