package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzewx implements zzexw {
    final String zza;
    private final zzgge zzb;
    private final ScheduledExecutorService zzc;
    private final zzeny zzd;
    private final Context zze;
    private final zzfho zzf;
    private final zzenu zzg;
    private final zzdst zzh;
    private final zzdxh zzi;

    zzewx(zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, String str, zzeny zzenyVar, Context context, zzfho zzfhoVar, zzenu zzenuVar, zzdst zzdstVar, zzdxh zzdxhVar) {
        this.zzb = zzggeVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzenyVar;
        this.zze = context;
        this.zzf = zzfhoVar;
        this.zzg = zzenuVar;
        this.zzh = zzdstVar;
        this.zzi = zzdxhVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzewx zzewxVar) {
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkR)).booleanValue() ? zzewxVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzewxVar.zzf.zzf;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbE)).booleanValue() ? zzewxVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbN)).booleanValue()) {
            zzewxVar.zzi(arrayList, zzewxVar.zzd.zza(zzewxVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzgbf) zzewxVar.zzd.zzb(zzewxVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzewxVar.zzg(str, (List) entry.getValue(), zzewxVar.zzf(str), true, true));
            }
            zzewxVar.zzi(arrayList, zzewxVar.zzd.zzc());
        }
        return zzgft.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzews
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzewy(jSONArray.toString(), bundleZzg);
            }
        }, zzewxVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgfk zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgfk zzgfkVarZzu = zzgfk.zzu(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzewu
            @Override // com.google.android.gms.internal.ads.zzgez
            public final ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbA)).booleanValue()) {
            zzgfkVarZzu = (zzgfk) zzgft.zzo(zzgfkVarZzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbt)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgfk) zzgft.zze(zzgfkVarZzu, Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbte zzbteVar, Bundle bundle, List list, zzeob zzeobVar) throws RemoteException {
        zzbteVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeobVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzeoc zzeocVar = (zzeoc) ((Map.Entry) it.next()).getValue();
            String str = zzeocVar.zza;
            list.add(zzg(str, Collections.singletonList(zzeocVar.zze), zzf(str), zzeocVar.zzb, zzeocVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        zzfho zzfhoVar = this.zzf;
        if (zzfhoVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbG)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(zzfhoVar.zzd)))) {
                return zzgft.zzh(new zzewy(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzewr
            @Override // com.google.android.gms.internal.ads.zzgez
            public final ListenableFuture zza() {
                return zzewx.zzc(this.zza);
            }
        }, this.zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbte zzbteVarZzb;
        final zzccn zzccnVar = new zzccn();
        if (z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbF)).booleanValue()) {
                try {
                    zzbteVarZzb = this.zzh.zzb(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
                    zzbteVarZzb = null;
                }
            } else {
                this.zzg.zzb(str);
                zzbteVarZzb = this.zzg.zza(str);
            }
        }
        if (zzbteVarZzb == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbv)).booleanValue()) {
                throw null;
            }
            zzeob.zzb(str, zzccnVar);
        } else {
            final zzeob zzeobVar = new zzeob(str, zzbteVarZzb, zzccnVar, com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbA)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = this.zzc;
                Objects.requireNonNull(zzeobVar);
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeww
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeobVar.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbt)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbH)).booleanValue()) {
                    final zzbte zzbteVar = zzbteVarZzb;
                    this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewt
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(zzbteVar, bundle, list, zzeobVar, zzccnVar);
                        }
                    });
                } else {
                    zzh(zzbteVarZzb, bundle, list, zzeobVar);
                }
            } else {
                zzeobVar.zzd();
            }
        }
        return zzccnVar;
    }

    final /* synthetic */ void zze(zzbte zzbteVar, Bundle bundle, List list, zzeob zzeobVar, zzccn zzccnVar) {
        try {
            zzh(zzbteVar, bundle, list, zzeobVar);
        } catch (RemoteException e) {
            zzccnVar.zzd(e);
        }
    }
}
