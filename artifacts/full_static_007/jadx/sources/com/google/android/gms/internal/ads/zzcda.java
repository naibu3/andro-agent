package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcda implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcdi zzb;

    zzcda(zzcdi zzcdiVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzcdi.zzl(this.zzb, this.zza);
        zzcdi zzcdiVar = this.zzb;
        if (zzcdiVar.zzq != null) {
            zzcdiVar.zzq.zzf();
        }
    }
}
