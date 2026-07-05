package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfgq extends zzbyj {
    private final zzfgg zza;
    private final zzffw zzb;
    private final zzfhg zzc;
    private zzdrh zzd;
    private boolean zze = false;

    public zzfgq(zzfgg zzfggVar, zzffw zzffwVar, zzfhg zzfhgVar) {
        this.zza = zzfggVar;
        this.zzb = zzffwVar;
        this.zzc = zzfhgVar;
    }

    private final synchronized boolean zzy() {
        zzdrh zzdrhVar = this.zzd;
        if (zzdrhVar != null) {
            if (!zzdrhVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdrh zzdrhVar = this.zzd;
        return zzdrhVar != null ? zzdrhVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        zzdrh zzdrhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgW)).booleanValue() && (zzdrhVar = this.zzd) != null) {
            return zzdrhVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized String zzd() throws RemoteException {
        zzdrh zzdrhVar = this.zzd;
        if (zzdrhVar == null || zzdrhVar.zzl() == null) {
            return null;
        }
        return zzdrhVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzfz)).booleanValue() == false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzbyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzg(zzbyo zzbyoVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbyoVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfx);
        if (str2 != null && str != null) {
            try {
                if (!Pattern.matches(str2, str)) {
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "NonagonUtil.isPatternMatched");
            }
            return;
        }
        if (zzy()) {
        }
        zzffy zzffyVar = new zzffy(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbyoVar.zza, zzbyoVar.zzb, zzffyVar, new zzfgo(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfgp(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzo(zzbyn zzbynVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbynVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (objUnwrap instanceof Activity) {
                    activity = (Activity) objUnwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final boolean zzt() {
        zzdrh zzdrhVar = this.zzd;
        return zzdrhVar != null && zzdrhVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzu(zzbyi zzbyiVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbyiVar);
    }
}
