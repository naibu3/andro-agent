package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfou {
    private static final zzfqf zza = new zzfqf();
    private final zzfow zzb;
    private final WebView zzc;
    private final HashMap zzd = new HashMap();
    private final zzfpi zze = new zzfpi();

    private zzfou(zzfow zzfowVar, WebView webView, boolean z) {
        zzfqd.zza();
        this.zzb = zzfowVar;
        this.zzc = webView;
        if (!WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zzg();
        WebViewCompat.addWebMessageListener(webView, "omidJsSessionService", new HashSet(Arrays.asList(ProxyConfig.MATCH_ALL_SCHEMES)), new zzfot(this));
    }

    public static zzfou zza(zzfow zzfowVar, WebView webView, boolean z) {
        return new zzfou(zzfowVar, webView, true);
    }

    static /* bridge */ /* synthetic */ void zzb(zzfou zzfouVar, String str) {
        zzfoj zzfojVar = (zzfoj) zzfouVar.zzd.get(str);
        if (zzfojVar != null) {
            zzfojVar.zzc();
            zzfouVar.zzd.remove(str);
        }
    }

    static /* bridge */ /* synthetic */ void zzd(zzfou zzfouVar, String str) {
        zzfon zzfonVar = new zzfon(zzfok.zza(zzfoo.DEFINED_BY_JAVASCRIPT, zzfor.DEFINED_BY_JAVASCRIPT, zzfov.JAVASCRIPT, zzfov.JAVASCRIPT, false), zzfol.zzb(zzfouVar.zzb, zzfouVar.zzc, null, null), str);
        zzfouVar.zzd.put(str, zzfonVar);
        zzfonVar.zzd(zzfouVar.zzc);
        for (zzfph zzfphVar : zzfouVar.zze.zza()) {
            zzfonVar.zzb((View) zzfphVar.zzb().get(), zzfphVar.zza(), zzfphVar.zzc());
        }
        zzfonVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        WebViewCompat.removeWebMessageListener(this.zzc, "omidJsSessionService");
    }

    public final void zze(View view, zzfoq zzfoqVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfoj) it.next()).zzb(view, zzfoqVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfoqVar, "Ad overlay");
    }

    public final void zzf(zzchs zzchsVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfoj) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfos(this, zzchsVar, timer), 1000L);
    }
}
