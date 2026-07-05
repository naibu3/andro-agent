package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzit implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zziv zza;
    private final Handler zzb;

    public zzit(zziv zzivVar, Handler handler) {
        this.zza = zzivVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // java.lang.Runnable
            public final void run() {
                zziv.zzc(this.zza.zza, i);
            }
        });
    }
}
