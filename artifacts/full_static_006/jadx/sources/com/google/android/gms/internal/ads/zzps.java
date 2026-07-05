package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzps extends AudioDeviceCallback {
    final /* synthetic */ zzpw zza;

    /* synthetic */ zzps(zzpw zzpwVar, zzpr zzprVar) {
        this.zza = zzpwVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpw zzpwVar = this.zza;
        this.zza.zzj(zzpp.zzc(zzpwVar.zza, zzpwVar.zzh, zzpwVar.zzg));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzpx zzpxVar = this.zza.zzg;
        int i = zzgd.zza;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (zzgd.zzG(audioDeviceInfoArr[i2], zzpxVar)) {
                this.zza.zzg = null;
                break;
            }
            i2++;
        }
        zzpw zzpwVar = this.zza;
        zzpwVar.zzj(zzpp.zzc(zzpwVar.zza, zzpwVar.zzh, zzpwVar.zzg));
    }
}
