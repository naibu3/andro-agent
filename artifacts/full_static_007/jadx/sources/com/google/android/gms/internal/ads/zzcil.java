package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzcil extends zzchl {
    public zzcil(zzchd zzchdVar, zzbdm zzbdmVar, boolean z, zzegk zzegkVar) {
        super(zzchdVar, zzbdmVar, z, new zzbui(zzchdVar, zzchdVar.zzE(), new zzbdx(zzchdVar.getContext())), null, zzegkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzS(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzchd)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzchd zzchdVar = (zzchd) webView;
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            zzcafVar.zzd(str, map, 1);
        }
        zzftu.zza();
        zzftz zzftzVar = zzftz.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzchdVar.zzN() != null) {
            zzchdVar.zzN().zzF();
        }
        if (zzchdVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzN);
        } else if (zzchdVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzM);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzL);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzx(zzchdVar.getContext(), zzchdVar.zzn().afmaVersion, str2);
    }
}
