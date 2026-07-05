package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzcyt;
import com.google.android.gms.internal.ads.zzdfa;
import com.google.android.gms.internal.ads.zzdqs;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfin;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzaj extends zzcbf {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbfq zzI;
    private final zze zzJ;
    private final zzcjd zzf;
    private Context zzg;
    private final zzaxd zzh;
    private final zzfhs zzi;
    private final zzfin zzj;
    private final zzgge zzk;
    private final ScheduledExecutorService zzl;
    private zzbwe zzm;
    private final zzdvh zzp;
    private final zzfoe zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhu)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzht)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhw)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhy)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhx);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhz);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhA);

    public zzaj(zzcjd zzcjdVar, Context context, zzaxd zzaxdVar, zzfin zzfinVar, zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzdvh zzdvhVar, zzfoe zzfoeVar, VersionInfoParcel versionInfoParcel, zzbfq zzbfqVar, zzfhs zzfhsVar, zze zzeVar) {
        List listZzaa;
        this.zzf = zzcjdVar;
        this.zzg = context;
        this.zzh = zzaxdVar;
        this.zzi = zzfhsVar;
        this.zzj = zzfinVar;
        this.zzk = zzggeVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdvhVar;
        this.zzq = zzfoeVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbfqVar;
        this.zzJ = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhB)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhC));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhD));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhE));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhF));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    static /* bridge */ /* synthetic */ void zzH(zzaj zzajVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzajVar.zzO((Uri) it.next())) {
                zzajVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzr zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, Bundle bundle) {
        char c;
        zzfhm zzfhmVar = new zzfhm();
        if ("REWARDED".equals(str2)) {
            zzfhmVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfhmVar.zzp().zza(3);
        }
        zzq zzqVarZzp = this.zzf.zzp();
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfhmVar.zzt(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfhmVar.zzH(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (!str2.equals("NATIVE")) {
                        c = 65535;
                        break;
                    } else {
                        c = 3;
                        break;
                    }
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
                        break;
                    }
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            zzqVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzq.zzd() : c != 3 ? c != 4 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzb() : com.google.android.gms.ads.internal.client.zzq.zzc() : new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
        }
        zzfhmVar.zzs(zzqVar);
        zzfhmVar.zzz(true);
        zzfhmVar.zzA(bundle);
        zzcytVar.zzi(zzfhmVar.zzJ());
        zzqVarZzp.zza(zzcytVar.zzj());
        zzam zzamVar = new zzam();
        zzamVar.zza(str2);
        zzqVarZzp.zzb(new zzao(zzamVar, null));
        new zzdfa();
        return zzqVarZzp.zzc();
    }

    private final ListenableFuture zzS(final String str) {
        final zzdqs[] zzdqsVarArr = new zzdqs[1];
        ListenableFuture listenableFutureZzn = zzgft.zzn(this.zzj.zza(), new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzv(zzdqsVarArr, str, (zzdqs) obj);
            }
        }, this.zzk);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ(zzdqsVarArr);
            }
        }, this.zzk);
        return zzgft.zze(zzgft.zzm((zzgfk) zzgft.zzo(zzgfk.zzu(listenableFutureZzn), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhL)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzab
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                int i = zzaj.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                int i = zzaj.zze;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            this.zzJ.zzb();
        } else {
            zzgft.zzr(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlb)).booleanValue() ? zzgft.zzk(new zzgez() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // com.google.android.gms.internal.ads.zzgez
                public final ListenableFuture zza() {
                    return this.zza.zzu();
                }
            }, zzcci.zza) : zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb(), new zzai(this), this.zzf.zzB());
        }
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjB)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjE)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjI)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbvv zzbvvVar, boolean z) {
        ListenableFuture listenableFutureZzb;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                zzbvvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzO(uri)) {
                listenableFutureZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    listenableFutureZzb = zzgft.zzn(listenableFutureZzb, new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzx
                        @Override // com.google.android.gms.internal.ads.zzgfa
                        public final ListenableFuture zza(Object obj) {
                            zzaj zzajVar = this.zza;
                            return zzgft.zzm(zzajVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
                                @Override // com.google.android.gms.internal.ads.zzfxu
                                public final Object apply(Object obj2) {
                                    return zzaj.zzQ(uri, (String) obj2);
                                }
                            }, zzajVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                listenableFutureZzb = zzgft.zzh(uri);
            }
            arrayList.add(listenableFutureZzb);
        }
        zzgft.zzr(zzgft.zzd(arrayList), new zzah(this, zzbvvVar, z), this.zzf.zzB());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbvv zzbvvVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            try {
                zzbvvVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        ListenableFuture listenableFutureZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            listenableFutureZzb = zzgft.zzn(listenableFutureZzb, new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    return this.zza.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        }
        zzgft.zzr(listenableFutureZzb, new zzag(this, zzbvvVar, z), this.zzf.zzB());
    }

    private static boolean zzX(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        Map map;
        zzbwe zzbweVar = this.zzm;
        return (zzbweVar == null || (map = zzbweVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(string.substring(0, i) + str + "=" + str2 + "&" + string.substring(i));
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfyv.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfmn zzr(ListenableFuture listenableFuture, zzcbk zzcbkVar) {
        if (!zzfmq.zza() || !((Boolean) zzbgd.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfmn zzfmnVarZza = ((zzr) zzgft.zzp(listenableFuture)).zza();
            zzfmnVarZza.zze(new ArrayList(Collections.singletonList(zzcbkVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzcbkVar.zzd;
            zzfmnVarZza.zzb(zzlVar == null ? "" : zzlVar.zzp);
            zzfmnVarZza.zzg(zzcbkVar.zzd.zzm);
            return zzfmnVarZza;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String strZzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzP(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzh));
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void zzJ(zzdqs[] zzdqsVarArr) {
        zzdqs zzdqsVar = zzdqsVarArr[0];
        if (zzdqsVar != null) {
            this.zzj.zzb(zzgft.zzh(zzdqsVar));
        }
    }

    final boolean zzO(Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    final boolean zzP(Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjL)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    @Override // com.google.android.gms.internal.ads.zzcbg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(IObjectWrapper iObjectWrapper, final zzcbk zzcbkVar, zzcbd zzcbdVar) {
        ListenableFuture listenableFutureZzb;
        ListenableFuture listenableFuture;
        ListenableFuture listenableFutureZzb2;
        ListenableFuture listenableFutureZzn;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            bundle.putLong(zzdul.PUBLIC_API_CALL.zza(), zzcbkVar.zzd.zzz);
            bundle.putLong(zzdul.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfmc zzfmcVarZza = zzfmb.zza(context, zzfmu.CUI_NAME_SCAR_SIGNALS);
        zzfmcVarZza.zzj();
        if ("UNKNOWN".equals(zzcbkVar.zzb)) {
            List arrayList = new ArrayList();
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhJ)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhJ)).split(","));
            }
            if (arrayList.contains(zzp.zzc(zzcbkVar.zzd))) {
                listenableFutureZzb2 = zzgft.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFutureZzn = zzgft.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlb)).booleanValue()) {
                    listenableFutureZzb2 = zzcci.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzq(zzcbkVar, bundle);
                        }
                    });
                    listenableFutureZzn = zzgft.zzn(listenableFutureZzb2, new zzgfa() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaa
                        @Override // com.google.android.gms.internal.ads.zzgfa
                        public final ListenableFuture zza(Object obj) {
                            return ((zzr) obj).zzb();
                        }
                    }, zzcci.zza);
                } else {
                    zzr zzrVarZzR = zzR(this.zzg, zzcbkVar.zza, zzcbkVar.zzb, zzcbkVar.zzc, zzcbkVar.zzd, bundle);
                    ListenableFuture listenableFutureZzh = zzgft.zzh(zzrVarZzR);
                    listenableFutureZzb = zzrVarZzR.zzb();
                    listenableFuture = listenableFutureZzh;
                }
            }
            listenableFuture = listenableFutureZzb2;
            listenableFutureZzb = listenableFutureZzn;
        }
        zzgft.zzr(listenableFutureZzb, new zzaf(this, listenableFuture, zzcbkVar, zzcbdVar, zzfmcVarZza), this.zzf.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(zzbwe zzbweVar) {
        this.zzm = zzbweVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzV(list, iObjectWrapper, zzbvvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzW(list, iObjectWrapper, zzbvvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjA)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhI)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjK)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzs();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhI)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbwe zzbweVar = this.zzm;
            this.zzn = zzbz.zza(motionEvent, zzbweVar == null ? null : zzbweVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzV(list, iObjectWrapper, zzbvvVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) {
        zzW(list, iObjectWrapper, zzbvvVar, false);
    }

    final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfhs zzfhsVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() || (zzfhsVar = this.zzi) == null) ? this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfhsVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaxe e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ zzr zzq(zzcbk zzcbkVar, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzcbkVar.zza, zzcbkVar.zzb, zzcbkVar.zzc, zzcbkVar.zzd, bundle);
    }

    final /* synthetic */ ListenableFuture zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
    }

    final /* synthetic */ ListenableFuture zzv(zzdqs[] zzdqsVarArr, String str, zzdqs zzdqsVar) throws Exception {
        zzdqsVarArr[0] = zzdqsVar;
        Context context = this.zzg;
        zzbwe zzbweVar = this.zzm;
        Map map = zzbweVar.zzb;
        JSONObject jSONObjectZzd = zzbz.zzd(context, map, map, zzbweVar.zza, null);
        JSONObject jSONObjectZzg = zzbz.zzg(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzf = zzbz.zzf(this.zzm.zza);
        JSONObject jSONObjectZze = zzbz.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbz.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdqsVar.zzg(str, jSONObject);
    }

    final /* synthetic */ ListenableFuture zzw(final ArrayList arrayList) throws Exception {
        return zzgft.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfxu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return this.zza.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
