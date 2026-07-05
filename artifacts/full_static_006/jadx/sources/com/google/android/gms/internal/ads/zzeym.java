package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeym implements zzexw {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgge zzc;
    private final ScheduledExecutorService zzd;
    private final zzehj zze;
    private final zzfho zzf;
    private final VersionInfoParcel zzg;

    zzeym(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzehj zzehjVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzggeVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehjVar;
        this.zzf = zzfhoVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.zzexw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzg;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkt)).booleanValue() && this.zza.zzT()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkx)).booleanValue()) {
                if (this.zzf.zzd.zzy != RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) {
                    if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkr)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzks)).intValue()) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkp)).booleanValue()) {
                                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkq);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                listenableFutureZzg = zzgft.zzo(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkv)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                            } catch (Exception e) {
                                listenableFutureZzg = zzgft.zzg(e);
                            }
                            return zzgft.zzo(zzgft.zzf(zzgft.zzn(zzgfk.zzu(listenableFutureZzg), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeyk
                                @Override // com.google.android.gms.internal.ads.zzgfa
                                public final ListenableFuture zza(Object obj) {
                                    GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
                                    if (getTopicsResponse == null) {
                                        return zzgft.zzh(new zzeyo("", 1, null));
                                    }
                                    zzhfp zzhfpVarZzc = zzhfq.zzc();
                                    for (Topic topic : getTopicsResponse.getTopics()) {
                                        zzhfn zzhfnVarZzc = zzhfo.zzc();
                                        zzhfnVarZzc.zzc(topic.getTopicId());
                                        zzhfnVarZzc.zza(topic.getModelVersion());
                                        zzhfnVarZzc.zzb(topic.getTaxonomyVersion());
                                        zzhfpVarZzc.zza((zzhfo) zzhfnVarZzc.zzbr());
                                    }
                                    return zzgft.zzh(new zzeyo(Base64.encodeToString(((zzhfq) zzhfpVarZzc.zzbr()).zzaV(), 1), 1, null));
                                }
                            }, this.zzc), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeyl
                                @Override // com.google.android.gms.internal.ads.zzgfa
                                public final ListenableFuture zza(Object obj) {
                                    return this.zza.zzc((Throwable) obj);
                                }
                            }, this.zzc), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkv)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                        }
                    }
                }
            }
        }
        return zzgft.zzh(new zzeyo("", -1, null));
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th) throws Exception {
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzku)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgft.zzh(th instanceof SecurityException ? new zzeyo("", 2, null) : th instanceof IllegalStateException ? new zzeyo("", 3, null) : th instanceof IllegalArgumentException ? new zzeyo("", 4, null) : th instanceof TimeoutException ? new zzeyo("", 5, null) : new zzeyo("", 0, null));
    }
}
