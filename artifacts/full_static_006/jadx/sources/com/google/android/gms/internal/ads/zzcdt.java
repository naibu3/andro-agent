package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcdt {
    private final Context zza;
    private final zzcee zzb;
    private final ViewGroup zzc;
    private zzcds zzd;

    public zzcdt(Context context, ViewGroup viewGroup, zzchd zzchdVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzchdVar;
        this.zzd = null;
    }

    public final zzcds zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            return zzcdsVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzced zzcedVar) {
        if (this.zzd != null) {
            return;
        }
        zzbew.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcee zzceeVar = this.zzb;
        zzcds zzcdsVar = new zzcds(context, zzceeVar, i5, z, zzceeVar.zzm().zza(), zzcedVar);
        this.zzd = zzcdsVar;
        this.zzc.addView(zzcdsVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzcds zzcdsVar = this.zzd;
        if (zzcdsVar != null) {
            zzcdsVar.zzC(i);
        }
    }
}
