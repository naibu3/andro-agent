package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdxf {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdst zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdvm zzl;
    private final VersionInfoParcel zzm;
    private final zzdgh zzo;
    private final zzfmq zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzccn zze = new zzccn();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();

    public zzdxf(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdst zzdstVar, ScheduledExecutorService scheduledExecutorService, zzdvm zzdvmVar, VersionInfoParcel versionInfoParcel, zzdgh zzdghVar, zzfmq zzfmqVar) {
        this.zzh = zzdstVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdvmVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdghVar;
        this.zzp = zzfmqVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    static /* bridge */ /* synthetic */ void zzj(final zzdxf zzdxfVar, String str) throws JSONException {
        final zzfmc zzfmcVarZza = zzfmb.zza(zzdxfVar.zzf, zzfmu.CUI_NAME_SDKINIT_ADAPTERINIT);
        zzfmcVarZza.zzj();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfmc zzfmcVarZza2 = zzfmb.zza(zzdxfVar.zzf, zzfmu.CUI_NAME_SDKINIT_ADAPTERINIT);
                zzfmcVarZza2.zzj();
                zzfmcVarZza2.zze(next);
                final Object obj = new Object();
                final zzccn zzccnVar = new zzccn();
                ListenableFuture listenableFutureZzo = zzgft.zzo(zzccnVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbP)).longValue(), TimeUnit.SECONDS, zzdxfVar.zzk);
                zzdxfVar.zzl.zzc(next);
                zzdxfVar.zzo.zzc(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                Iterator<String> it = itKeys;
                listenableFutureZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdww
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzq(obj, zzccnVar, next, jElapsedRealtime, zzfmcVarZza2);
                    }
                }, zzdxfVar.zzi);
                arrayList.add(listenableFutureZzo);
                final zzdxe zzdxeVar = new zzdxe(zzdxfVar, obj, next, jElapsedRealtime, zzfmcVarZza2, zzccnVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        int i = 0;
                        while (i < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbnx(strOptString, bundle));
                            i++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdxfVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfim zzfimVarZzc = zzdxfVar.zzh.zzc(next, new JSONObject());
                        zzdxfVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxa
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzn(next, zzdxeVar, zzfimVarZzc, arrayList2);
                            }
                        });
                    } catch (zzfhv unused2) {
                        zzdxeVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                }
                itKeys = it;
            }
            zzgft.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwx
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzf(zzfmcVarZza);
                    return null;
                }
            }, zzdxfVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdxfVar.zzo.zza("MalformedJson");
            zzdxfVar.zzl.zza("MalformedJson");
            zzdxfVar.zze.zzd(e2);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "AdapterInitializer.updateAdapterStatus");
            zzfmq zzfmqVar = zzdxfVar.zzp;
            zzfmcVarZza.zzi(e2);
            zzfmcVarZza.zzh(false);
            zzfmqVar.zzb(zzfmcVarZza.zzn());
        }
    }

    private final synchronized ListenableFuture zzu() {
        String strZzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzgft.zzh(strZzc);
        }
        final zzccn zzccnVar = new zzccn();
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(zzccnVar);
            }
        });
        return zzccnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbnn(str, z, i, str2));
    }

    final /* synthetic */ Object zzf(zzfmc zzfmcVar) throws Exception {
        this.zze.zzc(true);
        zzfmcVar.zzh(true);
        this.zzp.zzb(zzfmcVar.zzn());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbnn zzbnnVar = (zzbnn) this.zzn.get(str);
            arrayList.add(new zzbnn(str, zzbnnVar.zzb, zzbnnVar.zzc, zzbnnVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zzd(new Exception());
        }
    }

    final /* synthetic */ void zzn(String str, zzbnr zzbnrVar, zzfim zzfimVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbnrVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfimVar.zzi(context, zzbnrVar, list);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
            }
        } catch (RemoteException e2) {
            throw new zzfzb(e2);
        } catch (zzfhv unused) {
            zzbnrVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    final /* synthetic */ void zzo(final zzccn zzccnVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwv
            @Override // java.lang.Runnable
            public final void run() {
                String strZzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
                boolean zIsEmpty = TextUtils.isEmpty(strZzc);
                zzccn zzccnVar2 = zzccnVar;
                if (zIsEmpty) {
                    zzccnVar2.zzd(new Exception());
                } else {
                    zzccnVar2.zzc(strZzc);
                }
            }
        });
    }

    final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    final /* synthetic */ void zzq(Object obj, zzccn zzccnVar, String str, long j, zzfmc zzfmcVar) {
        synchronized (obj) {
            if (!zzccnVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfmq zzfmqVar = this.zzp;
                zzfmcVar.zzc("Timeout");
                zzfmcVar.zzh(false);
                zzfmqVar.zzb(zzfmcVar.zzn());
                zzccnVar.zzc(false);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbgq.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbO)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    ListenableFuture listenableFutureZzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwu
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbQ)).longValue(), TimeUnit.SECONDS);
                    zzgft.zzr(listenableFutureZzu, new zzdxd(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(false);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbnu zzbnuVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwz
            @Override // java.lang.Runnable
            public final void run() {
                zzdxf zzdxfVar = this.zza;
                try {
                    zzbnuVar.zzb(zzdxfVar.zzg());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
