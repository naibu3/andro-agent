package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdmt {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfho zzc;
    private final zzdly zzd;
    private final zzdlt zze;
    private final zzdnf zzf;
    private final zzdnn zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbhk zzj;
    private final zzdlq zzk;

    public zzdmt(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfho zzfhoVar, zzdly zzdlyVar, zzdlt zzdltVar, zzdnf zzdnfVar, zzdnn zzdnnVar, Executor executor, Executor executor2, zzdlq zzdlqVar) {
        this.zzb = zzgVar;
        this.zzc = zzfhoVar;
        this.zzj = zzfhoVar.zzi;
        this.zzd = zzdlyVar;
        this.zze = zzdltVar;
        this.zzf = zzdnfVar;
        this.zzg = zzdnnVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdlqVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View viewZzf = z ? this.zze.zzf() : this.zze.zzg();
        if (viewZzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzf.getParent()).removeView(viewZzf);
        }
        viewGroup.addView(viewZzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdQ)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdlt zzdltVar = this.zze;
        if (zzdltVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdltVar.zzc() == 2 || zzdltVar.zzc() == 1) {
                this.zzb.zzK(this.zzc.zzf, String.valueOf(zzdltVar.zzc()), z);
            } else if (zzdltVar.zzc() == 6) {
                this.zzb.zzK(this.zzc.zzf, "2", z);
                this.zzb.zzK(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzb(zzdnp zzdnpVar) {
        ViewGroup viewGroup;
        View viewZze;
        final ViewGroup viewGroup2;
        zzbhs zzbhsVarZza;
        Drawable drawable;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View viewZzg = zzdnpVar.zzg(strArr[i]);
                if (viewZzg != null && (viewZzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) viewZzg;
                    break;
                }
            }
            viewGroup = null;
        } else {
            viewGroup = null;
        }
        Context context = zzdnpVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdlt zzdltVar = this.zze;
        if (zzdltVar.zze() != null) {
            zzbhk zzbhkVar = this.zzj;
            viewZze = zzdltVar.zze();
            if (zzbhkVar != null && viewGroup == null) {
                zzh(layoutParams, zzbhkVar.zze);
                viewZze.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdltVar.zzl() instanceof zzbhf) {
            zzbhf zzbhfVar = (zzbhf) zzdltVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbhfVar.zzc());
                viewGroup = null;
            }
            View zzbhgVar = new zzbhg(context, zzbhfVar, layoutParams);
            zzbhgVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdO));
            viewZze = zzbhgVar;
        } else {
            viewZze = null;
        }
        if (viewZze != null) {
            if (viewZze.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewZze.getParent()).removeView(viewZze);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewZze);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdnpVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(viewZze);
                FrameLayout frameLayoutZzh = zzdnpVar.zzh();
                if (frameLayoutZzh != null) {
                    frameLayoutZzh.addView(zzaVar);
                }
            }
            zzdnpVar.zzq(zzdnpVar.zzk(), viewZze, true);
        }
        zzgbc zzgbcVar = zzdmp.zza;
        int size = zzgbcVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View viewZzg2 = zzdnpVar.zzg((String) zzgbcVar.get(i2));
            i2++;
            if (viewZzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewZzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdlt zzdltVar2 = this.zze;
            if (zzdltVar2.zzs() != null) {
                zzdltVar2.zzs().zzar(new zzdms(zzdnpVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjZ)).booleanValue() && zzi(viewGroup2, false)) {
            zzdlt zzdltVar3 = this.zze;
            if (zzdltVar3.zzq() != null) {
                zzdltVar3.zzq().zzar(new zzdms(zzdnpVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewZzf = zzdnpVar.zzf();
        Context context2 = viewZzf != null ? viewZzf.getContext() : null;
        if (context2 == null || (zzbhsVarZza = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper iObjectWrapperZzi = zzbhsVarZza.zzi();
            if (iObjectWrapperZzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper iObjectWrapperZzj = zzdnpVar.zzj();
            if (iObjectWrapperZzj == null || !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgr)).booleanValue()) {
                imageView.setScaleType(zza);
            } else {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj));
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(zzdnp zzdnpVar) {
        if (zzdnpVar == null || this.zzf == null || zzdnpVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdnpVar.zzh().addView(this.zzf.zza());
        } catch (zzchp e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdnp zzdnpVar) {
        if (zzdnpVar == null) {
            return;
        }
        Context context = zzdnpVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbz.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdnpVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdnpVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbz.zzb());
            } catch (zzchp e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdnp zzdnpVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(zzdnpVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
