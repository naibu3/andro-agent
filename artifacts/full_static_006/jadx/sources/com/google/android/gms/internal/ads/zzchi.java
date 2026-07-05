package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzchi implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcaf zza;
    final /* synthetic */ zzchl zzb;

    zzchi(zzchl zzchlVar, zzcaf zzcafVar) {
        this.zza = zzcafVar;
        this.zzb = zzchlVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzW(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
