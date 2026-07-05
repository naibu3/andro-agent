package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcij {
    private final zzcik zza;
    private final zzcii zzb;

    public zzcij(zzcik zzcikVar, zzcii zzciiVar) {
        this.zzb = zzciiVar;
        this.zza = zzcikVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzciq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzaxd zzaxdVarZzI = r0.zzI();
        if (zzaxdVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzawz zzawzVarZzc = zzaxdVarZzI.zzc();
        if (zzawzVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzcik zzcikVar = this.zza;
        return zzawzVarZzc.zzf(zzcikVar.getContext(), str, (View) zzcikVar, zzcikVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzciq] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzaxd zzaxdVarZzI = r0.zzI();
        if (zzaxdVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzawz zzawzVarZzc = zzaxdVarZzI.zzc();
        if (zzawzVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzcik zzcikVar = this.zza;
        return zzawzVarZzc.zzh(zzcikVar.getContext(), (View) zzcikVar, zzcikVar.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcih
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    final /* synthetic */ void zza(String str) {
        Uri uri = Uri.parse(str);
        zzchl zzchlVarZzaO = ((zzcic) this.zzb.zza).zzaO();
        if (zzchlVarZzaO == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzchlVarZzaO.zzj(uri);
        }
    }
}
