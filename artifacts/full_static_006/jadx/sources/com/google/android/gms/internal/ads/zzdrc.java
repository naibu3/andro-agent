package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdrc extends VideoController.VideoLifecycleCallbacks {
    private final zzdlt zza;

    public zzdrc(zzdlt zzdltVar) {
        this.zza = zzdltVar;
    }

    private static com.google.android.gms.ads.internal.client.zzdt zza(zzdlt zzdltVar) {
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzj = zzdltVar.zzj();
        if (zzdqVarZzj == null) {
            return null;
        }
        try {
            return zzdqVarZzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzdt zzdtVarZza = zza(this.zza);
        if (zzdtVarZza == null) {
            return;
        }
        try {
            zzdtVarZza.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
