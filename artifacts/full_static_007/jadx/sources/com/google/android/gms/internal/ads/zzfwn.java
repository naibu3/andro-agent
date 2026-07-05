package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfwn {
    private static final zzfwv zzb = new zzfwv("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfxg zza;
    private final String zzd;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzfwi] */
    zzfwn(Context context) {
        if (zzfxj.zza(context)) {
            this.zza = new zzfxg(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, new Object() { // from class: com.google.android.gms.internal.ads.zzfwi
            }, null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    final void zzc() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzu();
    }

    final void zzd(zzfwe zzfweVar, zzfws zzfwsVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfwk(this, taskCompletionSource, zzfweVar, zzfwsVar, taskCompletionSource), taskCompletionSource);
        }
    }

    final void zze(zzfwp zzfwpVar, zzfws zzfwsVar) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
            return;
        }
        if (zzfwpVar.zzh() != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfwj(this, taskCompletionSource, zzfwpVar, zzfwsVar, taskCompletionSource), taskCompletionSource);
        } else {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfwq zzfwqVarZzc = zzfwr.zzc();
            zzfwqVarZzc.zzb(8160);
            zzfwsVar.zza(zzfwqVarZzc.zzc());
        }
    }

    final void zzf(zzfwu zzfwuVar, zzfws zzfwsVar, int i) {
        if (this.zza == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzs(new zzfwl(this, taskCompletionSource, zzfwuVar, i, zzfwsVar, taskCompletionSource), taskCompletionSource);
        }
    }
}
