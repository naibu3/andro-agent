package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzerv implements zzexw {
    final zzcby zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgge zzd;
    private final Context zze;

    zzerv(Context context, zzcby zzcbyVar, ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcO)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcbyVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcK)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcP)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcL)).booleanValue()) {
                    return zzgft.zzm(zzfvk.zza(this.zzb.getAppSetIdInfo(), null), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzers
                        @Override // com.google.android.gms.internal.ads.zzfxu
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzerw(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzcci.zzf);
                }
                Task<AppSetIdInfo> taskZza = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcO)).booleanValue() ? zzfit.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzgft.zzh(new zzerw(null, -1));
                }
                ListenableFuture listenableFutureZzn = zzgft.zzn(zzfvk.zza(taskZza, null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzert
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final ListenableFuture zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgft.zzh(new zzerw(null, -1)) : zzgft.zzh(new zzerw(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzcci.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcM)).booleanValue()) {
                    listenableFutureZzn = zzgft.zzo(listenableFutureZzn, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcN)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgft.zze(listenableFutureZzn, Exception.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeru
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        this.zza.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzerw(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgft.zzh(new zzerw(null, -1));
    }
}
