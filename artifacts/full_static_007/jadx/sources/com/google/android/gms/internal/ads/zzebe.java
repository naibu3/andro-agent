package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzebe implements zzebg {
    private final Map zza;
    private final zzgge zzb;
    private final zzdce zzc;

    public zzebe(Map map, zzgge zzggeVar, zzdce zzdceVar) {
        this.zza = map;
        this.zzb = zzggeVar;
        this.zzc = zzdceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebg
    public final ListenableFuture zzb(final zzbxu zzbxuVar) {
        this.zzc.zzdn(zzbxuVar);
        ListenableFuture listenableFutureZzg = zzgft.zzg(new zzdzd(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzin)).split(",")) {
            final zzhlg zzhlgVar = (zzhlg) this.zza.get(str.trim());
            if (zzhlgVar != null) {
                listenableFutureZzg = zzgft.zzf(listenableFutureZzg, zzdzd.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebc
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final ListenableFuture zza(Object obj) {
                        return ((zzebg) zzhlgVar.zzb()).zzb(zzbxuVar);
                    }
                }, this.zzb);
            }
        }
        zzgft.zzr(listenableFutureZzg, new zzebd(this), zzcci.zzf);
        return listenableFutureZzg;
    }
}
