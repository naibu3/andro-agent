package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzezt implements zzexw {
    private final zzcby zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgge zzd;
    private final zzbcp zze;

    zzezt(String str, zzbcp zzbcpVar, zzcby zzcbyVar, ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar) {
        this.zzb = str;
        this.zze = zzbcpVar;
        this.zza = zzcbyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcP)).booleanValue()) {
                ListenableFuture listenableFutureZzn = zzgft.zzn(zzfvk.zza(Tasks.forResult(null), null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzezr
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgft.zzh(new zzezu(null, -1)) : zzgft.zzh(new zzezu(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, this.zzd);
                if (((Boolean) zzbfy.zza.zze()).booleanValue()) {
                    listenableFutureZzn = zzgft.zzo(listenableFutureZzn, ((Long) zzbfy.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgft.zze(listenableFutureZzn, Exception.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzezs
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, this.zzd);
            }
        }
        return zzgft.zzh(new zzezu(null, -1));
    }

    final /* synthetic */ zzezu zzc(Exception exc) {
        this.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzezu(null, -1);
    }
}
