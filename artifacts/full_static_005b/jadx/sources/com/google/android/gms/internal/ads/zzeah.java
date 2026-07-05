package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeah implements zzebg {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdzi zzb;
    private final zzgge zzc;
    private final zzfho zzd;
    private final ScheduledExecutorService zze;
    private final zzeev zzf;
    private final zzfmn zzg;
    private final Context zzh;

    zzeah(Context context, zzfho zzfhoVar, zzdzi zzdziVar, zzgge zzggeVar, ScheduledExecutorService scheduledExecutorService, zzeev zzeevVar, zzfmn zzfmnVar) {
        this.zzh = context;
        this.zzd = zzfhoVar;
        this.zzb = zzdziVar;
        this.zzc = zzggeVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeevVar;
        this.zzg = zzfmnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final ListenableFuture zzb(zzbxu zzbxuVar) {
        Context context = this.zzh;
        ListenableFuture listenableFutureZzc = this.zzb.zzc(zzbxuVar);
        zzfmc zzfmcVarZza = zzfmb.zza(context, zzfmu.CUI_NAME_ADREQUEST_PARSERESPONSE);
        zzfmm.zze(listenableFutureZzc, zzfmcVarZza);
        ListenableFuture listenableFutureZzn = zzgft.zzn(listenableFutureZzc, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeae
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((zzebi) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfD)).booleanValue()) {
            listenableFutureZzn = zzgft.zzf(zzgft.zzo(listenableFutureZzn, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeaf
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    return zzgft.zzg(new zzdzd(5));
                }
            }, zzcci.zzf);
        }
        zzfmm.zzb(listenableFutureZzn, this.zzg, zzfmcVarZza);
        zzgft.zzr(listenableFutureZzn, new zzeag(this), zzcci.zzf);
        return listenableFutureZzn;
    }

    final /* synthetic */ ListenableFuture zzc(zzebi zzebiVar) throws Exception {
        return zzgft.zzh(new zzfhf(new zzfhc(this.zzd), zzfhe.zza(new InputStreamReader(zzebiVar.zzb()), zzebiVar.zza())));
    }
}
