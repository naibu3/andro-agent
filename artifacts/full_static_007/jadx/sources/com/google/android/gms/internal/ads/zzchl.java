package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class zzchl extends WebViewClient implements zzciv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzegk zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzcaf zza;
    private final zzchd zzc;
    private final zzbdm zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzp zzh;
    private zzcit zzi;
    private zzciu zzj;
    private zzbkf zzk;
    private zzbkh zzl;
    private zzdhi zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzaa zzv;
    private zzbui zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbud zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfM)).split(",")));

    public zzchl(zzchd zzchdVar, zzbdm zzbdmVar, boolean z, zzbui zzbuiVar, zzbud zzbudVar, zzegk zzegkVar) {
        this.zzd = zzbdmVar;
        this.zzc = zzchdVar;
        this.zzs = z;
        this.zzw = zzbuiVar;
        this.zzE = zzegkVar;
    }

    private static WebResourceResponse zzS() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaK)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.zzu.zzp();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzp();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011f, code lost:
    
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
    
        if (r14.length != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        if (r0 >= r14.length) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (r14[r0].trim().startsWith("charset") == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
    
        r1 = r14[r0].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0146, code lost:
    
        if (r1.length <= 1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014f, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0152, code lost:
    
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if (r14.hasNext() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016d, code lost:
    
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
    
        if (r0.getKey() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
    
        if (r0.getValue() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018b, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        r5 = com.google.android.gms.ads.internal.zzu.zzq().zzb(r6, r7, r3.getResponseCode(), r3.getResponseMessage(), r10, r3.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WebResourceResponse zzT(String str, Map map) throws IOException {
        WebResourceResponse webResourceResponseZzb;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.zzu.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, 60000);
                webResourceResponseZzb = null;
                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    break;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Protocol is null");
                    webResourceResponseZzb = zzS();
                    break;
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unsupported scheme: " + protocol);
                    webResourceResponseZzb = zzS();
                    break;
                }
                com.google.android.gms.ads.internal.util.client.zzm.zze("Redirecting to " + headerField);
                httpURLConnection.disconnect();
                url = url2;
            }
            return webResourceResponseZzb;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzblp) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzV() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzW(final View view, final zzcaf zzcafVar, final int i) {
        if (!zzcafVar.zzi() || i <= 0) {
            return;
        }
        zzcafVar.zzg(view);
        if (zzcafVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzche
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(view, zzcafVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzX(zzchd zzchdVar) {
        if (zzchdVar.zzD() != null) {
            return zzchdVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzY(boolean z, zzchd zzchdVar) {
        return (!z || zzchdVar.zzO().zzi() || zzchdVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaE()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzX();
                return;
            }
            this.zzz = true;
            zzciu zzciuVar = this.zzj;
            if (zzciuVar != null) {
                zzciuVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlR)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case WorkQueueKt.MASK /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzj(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcaf zzcafVar = this.zza;
                        if (zzcafVar != null) {
                            zzcafVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdhi zzdhiVar = this.zzm;
                    if (zzdhiVar != null) {
                        zzdhiVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzaxd zzaxdVarZzI = this.zzc.zzI();
                    zzfhs zzfhsVarZzS = this.zzc.zzS();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() || zzfhsVarZzS == null) {
                        if (zzaxdVarZzI != null && zzaxdVarZzI.zzf(uriZza)) {
                            Context context = this.zzc.getContext();
                            zzchd zzchdVar = this.zzc;
                            uriZza = zzaxdVarZzI.zza(uriZza, context, (View) zzchdVar, zzchdVar.zzi());
                        }
                    } else if (zzaxdVarZzI != null && zzaxdVarZzI.zzf(uriZza)) {
                        Context context2 = this.zzc.getContext();
                        zzchd zzchdVar2 = this.zzc;
                        uriZza = zzfhsVarZzS.zza(uriZza, context2, (View) zzchdVar2, zzchdVar2.zzi());
                    }
                } catch (zzaxe unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzu(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true, false);
                } else {
                    this.zzx.zzb(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, zzblp zzblpVar) {
        synchronized (this.zzf) {
            List copyOnWriteArrayList = (List) this.zze.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.zze.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzblpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzB(zzcit zzcitVar) {
        this.zzi = zzcitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzC(int i, int i2) {
        zzbud zzbudVar = this.zzy;
        if (zzbudVar != null) {
            zzbudVar.zze(i, i2);
        }
    }

    public final void zzD(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchf
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzH(zzciu zzciuVar) {
        this.zzj = zzciuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzI(zzcqd zzcqdVar, zzefz zzefzVar, zzfoe zzfoeVar) {
        zzL("/click");
        if (zzefzVar == null || zzfoeVar == null) {
            zzA("/click", new zzbkn(this.zzm, zzcqdVar));
        } else {
            zzA("/click", new zzfhw(this.zzm, zzcqdVar, zzfoeVar, zzefzVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzJ(zzcqd zzcqdVar) {
        zzL("/click");
        zzA("/click", new zzbkn(this.zzm, zzcqdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzK(zzcqd zzcqdVar, zzefz zzefzVar, zzdvc zzdvcVar) {
        zzL("/open");
        zzA("/open", new zzbmb(this.zzx, this.zzy, zzefzVar, zzdvcVar, zzcqdVar));
    }

    public final void zzL(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzM(String str, zzblp zzblpVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzblpVar);
        }
    }

    public final void zzN(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzblp> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzblp zzblpVar : list) {
                if (predicate.apply(zzblpVar)) {
                    arrayList.add(zzblpVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzO() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final boolean zzP() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzQ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzR(com.google.android.gms.ads.internal.client.zza zzaVar, zzbkf zzbkfVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbkh zzbkhVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, boolean z, zzbls zzblsVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbuk zzbukVar, zzcaf zzcafVar, final zzefz zzefzVar, final zzfoe zzfoeVar, zzdvc zzdvcVar, zzbmj zzbmjVar, zzdhi zzdhiVar, zzbmi zzbmiVar, zzbmc zzbmcVar, zzblq zzblqVar, zzcqd zzcqdVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzcafVar, null) : zzbVar;
        this.zzy = new zzbud(this.zzc, zzbukVar);
        this.zza = zzcafVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaS)).booleanValue()) {
            zzA("/adMetadata", new zzbke(zzbkfVar));
        }
        if (zzbkhVar != null) {
            zzA("/appEvent", new zzbkg(zzbkhVar));
        }
        zzA("/backButton", zzblo.zzj);
        zzA("/refresh", zzblo.zzk);
        zzA("/canOpenApp", zzblo.zzb);
        zzA("/canOpenURLs", zzblo.zza);
        zzA("/canOpenIntents", zzblo.zzc);
        zzA("/close", zzblo.zzd);
        zzA("/customClose", zzblo.zze);
        zzA("/instrument", zzblo.zzn);
        zzA("/delayPageLoaded", zzblo.zzp);
        zzA("/delayPageClosed", zzblo.zzq);
        zzA("/getLocationInfo", zzblo.zzr);
        zzA("/log", zzblo.zzg);
        zzA("/mraid", new zzblw(zzbVar2, this.zzy, zzbukVar));
        zzbui zzbuiVar = this.zzw;
        if (zzbuiVar != null) {
            zzA("/mraidLoaded", zzbuiVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzA("/open", new zzbmb(zzbVar2, this.zzy, zzefzVar, zzdvcVar, zzcqdVar));
        zzA("/precache", new zzcfq());
        zzA("/touch", zzblo.zzi);
        zzA("/video", zzblo.zzl);
        zzA("/videoMeta", zzblo.zzm);
        if (zzefzVar == null || zzfoeVar == null) {
            zzA("/click", new zzbkn(zzdhiVar, zzcqdVar));
            zzA("/httpTrack", zzblo.zzf);
        } else {
            zzA("/click", new zzfhw(zzdhiVar, zzcqdVar, zzfoeVar, zzefzVar));
            zzA("/httpTrack", new zzblp() { // from class: com.google.android.gms.internal.ads.zzfhx
                @Override // com.google.android.gms.internal.ads.zzblp
                public final void zza(Object obj, Map map) {
                    zzcgu zzcguVar = (zzcgu) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcguVar.zzD().zzaj) {
                        zzefzVar.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), ((zzcig) zzcguVar).zzR().zzb, str, 2));
                    } else {
                        zzfoeVar.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zzc.getContext())) {
            Map map = new HashMap();
            if (this.zzc.zzD() != null) {
                map = this.zzc.zzD().zzax;
            }
            zzA("/logScionEvent", new zzblv(this.zzc.getContext(), map));
        }
        if (zzblsVar != null) {
            zzA("/setInterstitialProperties", new zzblr(zzblsVar));
        }
        if (zzbmjVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
                zzA("/inspectorNetworkExtras", zzbmjVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjn)).booleanValue() && zzbmiVar != null) {
            zzA("/shareSheet", zzbmiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue() && zzbmcVar != null) {
            zzA("/inspectorOutOfContextTest", zzbmcVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjw)).booleanValue() && zzblqVar != null) {
            zzA("/inspectorStorage", zzblqVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlz)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzblo.zzu);
            zzA("/presentPlayStoreOverlay", zzblo.zzv);
            zzA("/expandPlayStoreOverlay", zzblo.zzw);
            zzA("/collapsePlayStoreOverlay", zzblo.zzx);
            zzA("/closePlayStoreOverlay", zzblo.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdi)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzblo.zzA);
            zzA("/resetPAID", zzblo.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlQ)).booleanValue()) {
            zzchd zzchdVar = this.zzc;
            if (zzchdVar.zzD() != null && zzchdVar.zzD().zzas) {
                zzA("/writeToLocalStorage", zzblo.zzB);
                zzA("/clearLocalStorageKeys", zzblo.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzpVar;
        this.zzk = zzbkfVar;
        this.zzl = zzbkhVar;
        this.zzv = zzaaVar;
        this.zzx = zzbVar3;
        this.zzm = zzdhiVar;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x024b A[Catch: Exception | NoClassDefFoundError -> 0x0275, Exception -> 0x0277, TryCatch #9 {Exception | NoClassDefFoundError -> 0x0275, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x001f, B:8:0x0031, B:10:0x0038, B:12:0x0044, B:14:0x0061, B:16:0x007a, B:18:0x0091, B:19:0x0094, B:21:0x0097, B:24:0x00b1, B:26:0x00c9, B:28:0x00e2, B:49:0x0180, B:50:0x01a3, B:70:0x024b, B:58:0x01d6, B:59:0x01fc, B:56:0x01af, B:37:0x013f, B:27:0x00d6, B:60:0x01fd, B:62:0x0207, B:64:0x020d, B:66:0x023f, B:72:0x025a, B:74:0x0260, B:76:0x026e), top: B:91:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0260 A[Catch: Exception | NoClassDefFoundError -> 0x0275, Exception -> 0x0277, TryCatch #9 {Exception | NoClassDefFoundError -> 0x0275, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x001f, B:8:0x0031, B:10:0x0038, B:12:0x0044, B:14:0x0061, B:16:0x007a, B:18:0x0091, B:19:0x0094, B:21:0x0097, B:24:0x00b1, B:26:0x00c9, B:28:0x00e2, B:49:0x0180, B:50:0x01a3, B:70:0x024b, B:58:0x01d6, B:59:0x01fc, B:56:0x01af, B:37:0x013f, B:27:0x00d6, B:60:0x01fd, B:62:0x0207, B:64:0x020d, B:66:0x023f, B:72:0x025a, B:74:0x0260, B:76:0x026e), top: B:91:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0273 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final WebResourceResponse zzc(String str, Map map) throws Throwable {
        int i;
        InputStream inputStreamZza;
        boolean z;
        InputStream inputStreamZzc;
        final boolean z2;
        boolean z3;
        final boolean z4;
        String str2;
        try {
            Map map2 = new HashMap();
            if (this.zzc.zzD() != null) {
                map2 = this.zzc.zzD().zzax;
            }
            String strZzc = zzcaw.zzc(str, this.zzc.getContext(), this.zzC, map2);
            if (!strZzc.equals(str)) {
                return zzT(strZzc, map);
            }
            zzbcy zzbcyVarZza = zzbcy.zza(Uri.parse(str));
            if (zzbcyVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZzf = zzfyt.zzc(zzfxr.zzc('-')).zzf(uri.getQueryParameter("range"));
                    if (listZzf.size() == 2) {
                        int i2 = Integer.parseInt((String) listZzf.get(0));
                        int i3 = Integer.parseInt((String) listZzf.get(1)) + 1;
                        if (i2 > 0) {
                            zzbcyVarZza.zzh = i2;
                        }
                        i = i3 - i2;
                    } else {
                        i = -1;
                    }
                    final ?? r10 = "X-Afma-Gcache-HasAdditionalMetadataFromReadV2";
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeo)).booleanValue()) {
                        zzbcyVarZza.zzi = zzfyv.zzc(this.zzc.zzr());
                        zzbcyVarZza.zzj = this.zzc.zzf();
                        try {
                            long jLongValue = (zzbcyVarZza.zzg ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeq) : (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzep)).longValue();
                            long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                            com.google.android.gms.ads.internal.zzu.zzd();
                            Future futureZza = zzbdj.zza(this.zzc.getContext(), zzbcyVarZza);
                            try {
                                zzbdk zzbdkVar = (zzbdk) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                                try {
                                    try {
                                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbdkVar.zzd()));
                                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbdkVar.zzf()));
                                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbdkVar.zze()));
                                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbdkVar.zza()));
                                        inputStreamZzc = zzbdkVar.zzc();
                                        if (i != -1) {
                                            try {
                                                inputStreamZzc = zzgdm.zza(inputStreamZzc, i);
                                            } catch (InterruptedException unused) {
                                                z3 = true;
                                                z4 = true;
                                                futureZza.cancel(z3);
                                                Thread.currentThread().interrupt();
                                                final long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime;
                                                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        this.zza.zzo(z4, jElapsedRealtime2);
                                                    }
                                                });
                                                str2 = "Cache connection took " + jElapsedRealtime2 + "ms";
                                                r10 = z4;
                                                com.google.android.gms.ads.internal.util.zze.zza(str2);
                                                inputStreamZza = inputStreamZzc;
                                                if (inputStreamZza != null) {
                                                }
                                                return com.google.android.gms.ads.internal.util.client.zzl.zzk() ? null : null;
                                            } catch (ExecutionException | TimeoutException unused2) {
                                                z = true;
                                                z2 = true;
                                                futureZza.cancel(z);
                                                final long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime;
                                                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        this.zza.zzo(z2, jElapsedRealtime3);
                                                    }
                                                });
                                                str2 = "Cache connection took " + jElapsedRealtime3 + "ms";
                                                r10 = z2;
                                                com.google.android.gms.ads.internal.util.zze.zza(str2);
                                                inputStreamZza = inputStreamZzc;
                                                if (inputStreamZza != null) {
                                                }
                                                if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                                }
                                            }
                                        }
                                        final long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime;
                                        final boolean z5 = true;
                                        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.zza.zzo(z5, jElapsedRealtime4);
                                            }
                                        });
                                        str2 = "Cache connection took " + jElapsedRealtime4 + "ms";
                                    } catch (Throwable th) {
                                        th = th;
                                        r10 = 1;
                                        final long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.zza.zzo(r10, jElapsedRealtime5);
                                            }
                                        });
                                        com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime5 + "ms");
                                        throw th;
                                    }
                                } catch (InterruptedException unused3) {
                                    z3 = true;
                                    inputStreamZzc = null;
                                } catch (ExecutionException | TimeoutException unused4) {
                                    z = true;
                                    inputStreamZzc = null;
                                }
                            } catch (InterruptedException unused5) {
                                z3 = true;
                                inputStreamZzc = null;
                                z4 = false;
                            } catch (ExecutionException | TimeoutException unused6) {
                                z = true;
                                inputStreamZzc = null;
                                z2 = false;
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = 0;
                            }
                            com.google.android.gms.ads.internal.util.zze.zza(str2);
                            inputStreamZza = inputStreamZzc;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        zzbcv zzbcvVarZzb = com.google.android.gms.ads.internal.zzu.zzc().zzb(zzbcyVarZza);
                        if (zzbcvVarZzb == null || !zzbcvVarZzb.zze()) {
                            inputStreamZza = null;
                        } else {
                            map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbcvVarZzb.zzd()));
                            map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbcvVarZzb.zzg()));
                            map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbcvVarZzb.zzf()));
                            map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbcvVarZzb.zza()));
                            InputStream inputStreamZzc2 = zzbcvVarZzb.zzc();
                            inputStreamZza = i != -1 ? zzgdm.zza(inputStreamZzc2, i) : inputStreamZzc2;
                        }
                    }
                    if (inputStreamZza != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                    }
                }
            }
            if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && ((Boolean) zzbgg.zzb.zze()).booleanValue()) {
                return zzT(str, map);
            }
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewClient.interceptRequest");
            return zzS();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        zzdhi zzdhiVar = this.zzm;
        if (zzdhiVar != null) {
            zzdhiVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
        zzdhi zzdhiVar = this.zzm;
        if (zzdhiVar != null) {
            zzdhiVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() && this.zzc.zzm() != null) {
                zzbew.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            this.zzi.zza((this.zzA || this.zzo) ? false : true, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzh() {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            zzcafVar.zze();
            this.zza = null;
        }
        zzV();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbud zzbudVar = this.zzy;
            if (zzbudVar != null) {
                zzbudVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzj(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(String.valueOf(uri))));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgV)).booleanValue() || com.google.android.gms.ads.internal.zzu.zzo().zzg() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = zzchl.zzb;
                    com.google.android.gms.ads.internal.zzu.zzo().zzg().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfL)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfN)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgft.zzr(com.google.android.gms.ads.internal.zzu.zzp().zzb(uri), new zzchj(this, list, path, uri), zzcci.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        zzU(com.google.android.gms.ads.internal.util.zzt.zzP(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzk() {
        zzbdm zzbdmVar = this.zzd;
        if (zzbdmVar != null) {
            zzbdmVar.zzb(zzbdo.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzA = true;
        this.zzp = zzbdo.DELAY_PAGE_LOAD_CANCELLED_AD.zza();
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    final /* synthetic */ void zzn() throws JSONException {
        this.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zzc.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzz();
        }
    }

    final /* synthetic */ void zzo(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    final /* synthetic */ void zzp(View view, zzcaf zzcafVar, int i) {
        zzW(view, zzcafVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzq(int i, int i2, boolean z) {
        zzbui zzbuiVar = this.zzw;
        if (zzbuiVar != null) {
            zzbuiVar.zzb(i, i2);
        }
        zzbud zzbudVar = this.zzy;
        if (zzbudVar != null) {
            zzbudVar.zzd(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzr() {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            WebView webViewZzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(webViewZzG)) {
                zzW(webViewZzG, zzcafVar, 10);
                return;
            }
            zzV();
            zzchi zzchiVar = new zzchi(this, zzcafVar);
            this.zzF = zzchiVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzchiVar);
        }
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2) throws NumberFormatException {
        zzchd zzchdVar = this.zzc;
        boolean zZzaF = zzchdVar.zzaF();
        boolean z3 = zzY(zZzaF, zzchdVar) || z2;
        boolean z4 = z3 || !z;
        com.google.android.gms.ads.internal.client.zza zzaVar = z3 ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = zZzaF ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcVar, zzaVar, zzpVar, zzaaVar, zzchdVar2.zzn(), zzchdVar2, z4 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i) throws NumberFormatException {
        zzegk zzegkVar = this.zzE;
        zzchd zzchdVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzchdVar, zzchdVar.zzn(), str, str2, 14, zzegkVar));
    }

    public final void zzw(boolean z, int i, boolean z2) throws NumberFormatException {
        zzchd zzchdVar = this.zzc;
        boolean zZzY = zzY(zzchdVar.zzaF(), zzchdVar);
        boolean z3 = true;
        if (!zZzY && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzY ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzpVar, zzaaVar, zzchdVar2, z, i, zzchdVar2.zzn(), z3 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbud zzbudVar = this.zzy;
        boolean zZzf = zzbudVar != null ? zzbudVar.zzf() : false;
        com.google.android.gms.ads.internal.zzu.zzi();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZzf);
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcafVar.zzh(str);
        }
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) throws NumberFormatException {
        zzchd zzchdVar = this.zzc;
        boolean zZzaF = zzchdVar.zzaF();
        boolean zZzY = zzY(zZzaF, zzchdVar);
        boolean z3 = true;
        if (!zZzY && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzY ? null : this.zzg;
        zzchk zzchkVar = zZzaF ? null : new zzchk(this.zzc, this.zzh);
        zzbkf zzbkfVar = this.zzk;
        zzbkh zzbkhVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzchkVar, zzbkfVar, zzbkhVar, zzaaVar, zzchdVar2, z, i, str, str2, zzchdVar2.zzn(), z3 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null));
    }

    public final void zzz(boolean z, int i, String str, boolean z2, boolean z3) throws NumberFormatException {
        zzchd zzchdVar = this.zzc;
        boolean zZzaF = zzchdVar.zzaF();
        boolean zZzY = zzY(zZzaF, zzchdVar);
        boolean z4 = true;
        if (!zZzY && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzY ? null : this.zzg;
        zzchk zzchkVar = zZzaF ? null : new zzchk(this.zzc, this.zzh);
        zzbkf zzbkfVar = this.zzk;
        zzbkh zzbkhVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzchkVar, zzbkfVar, zzbkhVar, zzaaVar, zzchdVar2, z, i, str, zzchdVar2.zzn(), z4 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null, z3));
    }
}
