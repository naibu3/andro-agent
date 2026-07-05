package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzedq extends zzbxc {
    private final Context zza;
    private final zzgge zzb;
    private final zzeei zzc;
    private final zzcoq zzd;
    private final ArrayDeque zze;
    private final zzfmq zzf;
    private final zzbyd zzg;
    private final zzeef zzh;

    public zzedq(Context context, zzgge zzggeVar, zzbyd zzbydVar, zzcoq zzcoqVar, zzeei zzeeiVar, ArrayDeque arrayDeque, zzeef zzeefVar, zzfmq zzfmqVar) {
        zzbep.zza(context);
        this.zza = context;
        this.zzb = zzggeVar;
        this.zzg = zzbydVar;
        this.zzc = zzeeiVar;
        this.zzd = zzcoqVar;
        this.zze = arrayDeque;
        this.zzh = zzeefVar;
        this.zzf = zzfmqVar;
    }

    private final synchronized zzedn zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzedn zzednVar = (zzedn) it.next();
            if (zzednVar.zzc.equals(str)) {
                it.remove();
                return zzednVar;
            }
        }
        return null;
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, zzflt zzfltVar, zzbqh zzbqhVar, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        zzbpx zzbpxVarZza = zzbqhVar.zza("AFMA_getAdDictionary", zzbqe.zza, new zzbpz() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // com.google.android.gms.internal.ads.zzbpz
            public final Object zza(JSONObject jSONObject) {
                return new zzbxx(jSONObject);
            }
        });
        zzfmm.zze(listenableFuture, zzfmcVar);
        zzfky zzfkyVarZza = zzfltVar.zzb(zzfln.BUILD_URL, listenableFuture).zzf(zzbpxVarZza).zza();
        zzfmm.zzd(zzfkyVarZza, zzfmnVar, zzfmcVar);
        return zzfkyVarZza;
    }

    private static ListenableFuture zzm(final zzbxu zzbxuVar, zzflt zzfltVar, final zzeyv zzeyvVar) {
        zzgfa zzgfaVar = new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedc
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzeyvVar.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxuVar.zzm);
            }
        };
        return zzfltVar.zzb(zzfln.GMS_SIGNALS, zzgft.zzh(zzbxuVar.zza)).zzf(zzgfaVar).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzedn zzednVar) {
        zzo();
        this.zze.addLast(zzednVar);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) zzbgr.zzc.zze()).intValue();
        while (this.zze.size() >= iIntValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(ListenableFuture listenableFuture, zzbxn zzbxnVar, zzbxu zzbxuVar) {
        zzgft.zzr(zzgft.zzn(listenableFuture, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedj
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(zzfip.zza((InputStream) obj));
            }
        }, zzcci.zza), new zzedm(this, zzbxnVar, zzbxuVar), zzcci.zzf);
    }

    public final ListenableFuture zzb(final zzbxu zzbxuVar, int i) {
        if (!((Boolean) zzbgr.zza.zze()).booleanValue()) {
            return zzgft.zzg(new Exception("Split request is disabled."));
        }
        zzfjj zzfjjVar = zzbxuVar.zzi;
        if (zzfjjVar == null) {
            return zzgft.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfjjVar.zzc == 0 || zzfjjVar.zzd == 0) {
            return zzgft.zzg(new Exception("Caching is disabled."));
        }
        zzbqh zzbqhVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeyv zzeyvVarZzr = this.zzd.zzr(zzbxuVar, i);
        zzflt zzfltVarZzc = zzeyvVarZzr.zzc();
        final ListenableFuture listenableFutureZzm = zzm(zzbxuVar, zzfltVarZzc, zzeyvVarZzr);
        zzfmn zzfmnVarZzd = zzeyvVarZzr.zzd();
        final zzfmc zzfmcVarZza = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_BUILDURL);
        final ListenableFuture listenableFutureZzl = zzl(listenableFutureZzm, zzfltVarZzc, zzbqhVarZzb, zzfmnVarZzd, zzfmcVarZza);
        return zzfltVarZzc.zza(zzfln.GET_URL_AND_CACHE_KEY, listenableFutureZzm, listenableFutureZzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzj(listenableFutureZzl, listenableFutureZzm, zzbxuVar, zzfmcVarZza);
            }
        }).zza();
    }

    public final ListenableFuture zzc(final zzbxu zzbxuVar, int i) {
        zzedn zzednVarZzk;
        zzfky zzfkyVarZza;
        zzbqh zzbqhVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeyv zzeyvVarZzr = this.zzd.zzr(zzbxuVar, i);
        zzbpx zzbpxVarZza = zzbqhVarZzb.zza("google.afma.response.normalize", zzedp.zza, zzbqe.zzb);
        if (((Boolean) zzbgr.zza.zze()).booleanValue()) {
            zzednVarZzk = zzk(zzbxuVar.zzh);
            if (zzednVarZzk == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbxuVar.zzj;
            zzednVarZzk = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzfmc zzfmcVarZza = zzednVarZzk == null ? zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_BUILDURL) : zzednVarZzk.zze;
        zzfmn zzfmnVarZzd = zzeyvVarZzr.zzd();
        zzfmnVarZzd.zze(zzbxuVar.zza.getStringArrayList("ad_types"));
        zzeeh zzeehVar = new zzeeh(zzbxuVar.zzg, zzfmnVarZzd, zzfmcVarZza);
        zzeee zzeeeVar = new zzeee(this.zza, zzbxuVar.zzb.afmaVersion, this.zzg, i);
        zzflt zzfltVarZzc = zzeyvVarZzr.zzc();
        zzfmc zzfmcVarZza2 = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_PARSERESPONSE);
        if (zzednVarZzk == null) {
            final ListenableFuture listenableFutureZzm = zzm(zzbxuVar, zzfltVarZzc, zzeyvVarZzr);
            final ListenableFuture listenableFutureZzl = zzl(listenableFutureZzm, zzfltVarZzc, zzbqhVarZzb, zzfmnVarZzd, zzfmcVarZza);
            zzfmc zzfmcVarZza3 = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_REQUEST);
            final zzfky zzfkyVarZza2 = zzfltVarZzc.zza(zzfln.HTTP, listenableFutureZzl, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzede
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzbxu zzbxuVar2;
                    Bundle bundle;
                    zzbxx zzbxxVar = (zzbxx) listenableFutureZzl.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = (zzbxuVar2 = zzbxuVar).zzm) != null) {
                        bundle.putLong(zzdul.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbxxVar.zzc());
                        zzbxuVar2.zzm.putLong(zzdul.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbxxVar.zzb());
                    }
                    return new zzeeg((JSONObject) listenableFutureZzm.get(), zzbxxVar);
                }
            }).zze(zzeehVar).zze(new zzfmi(zzfmcVarZza3)).zze(zzeeeVar).zza();
            zzfmm.zzb(zzfkyVarZza2, zzfmnVarZzd, zzfmcVarZza3);
            zzfmm.zze(zzfkyVarZza2, zzfmcVarZza2);
            zzfkyVarZza = zzfltVarZzc.zza(zzfln.PRE_PROCESS, listenableFutureZzm, listenableFutureZzl, zzfkyVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = zzbxuVar.zzm) != null) {
                        bundle.putLong(zzdul.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                    }
                    return new zzedp((zzeed) zzfkyVarZza2.get(), (JSONObject) listenableFutureZzm.get(), (zzbxx) listenableFutureZzl.get());
                }
            }).zzf(zzbpxVarZza).zza();
        } else {
            zzeeg zzeegVar = new zzeeg(zzednVarZzk.zzb, zzednVarZzk.zza);
            zzfmc zzfmcVarZza4 = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_REQUEST);
            final zzfky zzfkyVarZza3 = zzfltVarZzc.zzb(zzfln.HTTP, zzgft.zzh(zzeegVar)).zze(zzeehVar).zze(new zzfmi(zzfmcVarZza4)).zze(zzeeeVar).zza();
            zzfmm.zzb(zzfkyVarZza3, zzfmnVarZzd, zzfmcVarZza4);
            final ListenableFuture listenableFutureZzh = zzgft.zzh(zzednVarZzk);
            zzfmm.zze(zzfkyVarZza3, zzfmcVarZza2);
            zzfkyVarZza = zzfltVarZzc.zza(zzfln.PRE_PROCESS, zzfkyVarZza3, listenableFutureZzh).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzeed zzeedVar = (zzeed) zzfkyVarZza3.get();
                    ListenableFuture listenableFuture = listenableFutureZzh;
                    return new zzedp(zzeedVar, ((zzedn) listenableFuture.get()).zzb, ((zzedn) listenableFuture.get()).zza);
                }
            }).zzf(zzbpxVarZza).zza();
        }
        zzfmm.zzb(zzfkyVarZza, zzfmnVarZzd, zzfmcVarZza2);
        return zzfkyVarZza;
    }

    public final ListenableFuture zzd(final zzbxu zzbxuVar, int i) {
        zzbqh zzbqhVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbgw.zza.zze()).booleanValue()) {
            return zzgft.zzg(new Exception("Signal collection disabled."));
        }
        zzeyv zzeyvVarZzr = this.zzd.zzr(zzbxuVar, i);
        final zzexz zzexzVarZza = zzeyvVarZzr.zza();
        zzbpx zzbpxVarZza = zzbqhVarZzb.zza("google.afma.request.getSignals", zzbqe.zza, zzbqe.zzb);
        zzfmc zzfmcVarZza = zzfmb.zza(this.zza, zzfmu.CUI_NAME_SCAR_SIGNALS);
        zzfky zzfkyVarZza = zzeyvVarZzr.zzc().zzb(zzfln.GET_SIGNALS, zzgft.zzh(zzbxuVar.zza)).zze(new zzfmi(zzfmcVarZza)).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) throws JSONException {
                return zzexzVarZza.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzi((Bundle) obj), zzbxuVar.zzm);
            }
        }).zzb(zzfln.JS_SIGNALS).zzf(zzbpxVarZza).zza();
        zzfmn zzfmnVarZzd = zzeyvVarZzr.zzd();
        zzfmnVarZzd.zze(zzbxuVar.zza.getStringArrayList("ad_types"));
        zzfmnVarZzd.zzg(zzbxuVar.zza.getBundle("extras"));
        zzfmm.zzc(zzfkyVarZza, zzfmnVarZzd, zzfmcVarZza);
        if (((Boolean) zzbgk.zzg.zze()).booleanValue()) {
            zzeei zzeeiVar = this.zzc;
            Objects.requireNonNull(zzeeiVar);
            zzfkyVarZza.addListener(new zzedh(zzeeiVar), this.zzb);
        }
        return zzfkyVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zze(zzbxu zzbxuVar, zzbxn zzbxnVar) {
        zzp(zzb(zzbxuVar, Binder.getCallingUid()), zzbxnVar, zzbxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzf(zzbxu zzbxuVar, zzbxn zzbxnVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = zzbxuVar.zzm) != null) {
            bundle.putLong(zzdul.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        zzp(zzd(zzbxuVar, Binder.getCallingUid()), zzbxnVar, zzbxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzg(zzbxu zzbxuVar, zzbxn zzbxnVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = zzbxuVar.zzm) != null) {
            bundle.putLong(zzdul.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzc = zzc(zzbxuVar, Binder.getCallingUid());
        zzp(listenableFutureZzc, zzbxnVar, zzbxuVar);
        if (((Boolean) zzbgk.zze.zze()).booleanValue()) {
            zzeei zzeeiVar = this.zzc;
            Objects.requireNonNull(zzeeiVar);
            listenableFutureZzc.addListener(new zzedh(zzeeiVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzh(String str, zzbxn zzbxnVar) {
        zzp(zzi(str), zzbxnVar, null);
    }

    public final ListenableFuture zzi(String str) {
        if (((Boolean) zzbgr.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzgft.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgft.zzh(new zzedl(this));
        }
        return zzgft.zzg(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream zzj(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbxu zzbxuVar, zzfmc zzfmcVar) throws Exception {
        String strZze = ((zzbxx) listenableFuture.get()).zze();
        zzn(new zzedn((zzbxx) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzbxuVar.zzh, strZze, zzfmcVar));
        return new ByteArrayInputStream(strZze.getBytes(zzfxs.zzc));
    }
}
