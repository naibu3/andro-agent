package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzexz {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfmn zzd;
    private final zzdvc zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzexz(Context context, Executor executor, Set set, zzfmn zzfmnVar, zzdvc zzdvcVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfmnVar;
        this.zze = zzdvcVar;
    }

    public final ListenableFuture zza(final Object obj, final Bundle bundle) {
        zzfmc zzfmcVarZza = zzfmb.zza(this.zza, zzfmu.CUI_NAME_ADREQUEST_SIGNALS);
        zzfmcVarZza.zzj();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        List arrayList2 = new ArrayList();
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlM)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlM)).split(","));
        }
        this.zzf = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong(zzdul.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(zzdul.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final zzexw zzexwVar : this.zzb) {
            if (!arrayList2.contains(String.valueOf(zzexwVar.zza()))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzge)).booleanValue() || zzexwVar.zza() != 44) {
                    final long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                    ListenableFuture listenableFutureZzb = zzexwVar.zzb();
                    listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexx
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(jElapsedRealtime, zzexwVar, bundle2);
                        }
                    }, zzcci.zzf);
                    arrayList.add(listenableFutureZzb);
                }
            }
        }
        ListenableFuture listenableFutureZza = zzgft.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzexy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj2;
                Bundle bundle3;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzexv zzexvVar = (zzexv) ((ListenableFuture) it.next()).get();
                    if (zzexvVar != null) {
                        zzexvVar.zzj(obj2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                    if (obj2 instanceof Bundle) {
                        bundle3.putLong(zzdul.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(zzdul.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfmq.zza()) {
            zzfmm.zzb(listenableFutureZza, this.zzd, zzfmcVarZza);
        }
        return listenableFutureZza;
    }

    public final void zzb(long j, zzexw zzexwVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - j;
        if (((Boolean) zzbgm.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzfyv.zzc(zzexwVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzce)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzexwVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcb)).booleanValue()) {
            zzdvb zzdvbVarZza = this.zze.zza();
            zzdvbVarZza.zzb("action", "lat_ms");
            zzdvbVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdvbVarZza.zzb("lat_id", String.valueOf(zzexwVar.zza()));
            zzdvbVarZza.zzb("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcc)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdvbVarZza.zzb("seq_num", com.google.android.gms.ads.internal.zzu.zzo().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        String strValueOf = String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzf);
                        if (zzexwVar.zza() <= 39 || zzexwVar.zza() >= 52) {
                            zzdvbVarZza.zzb("lat_clsg", strValueOf);
                        } else {
                            zzdvbVarZza.zzb("lat_gmssg", strValueOf);
                        }
                    }
                }
            }
            zzdvbVarZza.zzg();
        }
    }
}
