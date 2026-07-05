package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
final class zzo implements View.OnTouchListener {
    final /* synthetic */ zzt zza;

    zzo(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzt zztVar = this.zza;
        if (zztVar.zzh == null) {
            return false;
        }
        zztVar.zzh.zzd(motionEvent);
        return false;
    }
}
