package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcpc implements zzcot {
    ListenableFuture zza;
    private final zzehj zzb;

    zzcpc(zzehj zzehjVar) {
        this.zzb = zzehjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkt)).booleanValue()) {
            this.zza = zzgft.zzf(zzgfk.zzu(this.zzb.zza(true)), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzcpb
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    Throwable th = (Throwable) obj;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzku)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzx(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
                    } else {
                        com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "GetTopicsApiWithRecordObservationActionHandler");
                    }
                    return zzgft.zzh(new GetTopicsResponse(zzgbc.zzm()));
                }
            }, zzcci.zza);
        }
    }
}
