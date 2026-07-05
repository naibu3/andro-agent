package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbwd {

    @Nonnull
    private final View zza;
    private final Map zzb;
    private final zzcbg zzc;

    public zzbwd(zzbwc zzbwcVar) {
        View view = zzbwcVar.zza;
        this.zza = view;
        Map map = zzbwcVar.zzb;
        this.zzb = map;
        zzcbg zzcbgVarZza = zzbvx.zza(zzbwcVar.zza.getContext());
        this.zzc = zzcbgVarZza;
        if (zzcbgVarZza == null || map.isEmpty()) {
            return;
        }
        try {
            zzcbgVarZza.zzg(new zzbwe(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call remote method.");
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzh(list, ObjectWrapper.wrap(this.zza), new zzbwb(this, list));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzcbg zzcbgVar = this.zzc;
        if (zzcbgVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zzcbgVar.zzi(list, ObjectWrapper.wrap(this.zza), new zzbwa(this, list));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcbg zzcbgVar = this.zzc;
        if (zzcbgVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zzcbgVar.zzk(ObjectWrapper.wrap(motionEvent));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to call remote method.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbvz(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, ObjectWrapper.wrap(this.zza), new zzbvy(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
