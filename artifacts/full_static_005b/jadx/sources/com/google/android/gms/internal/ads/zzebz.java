package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzebz {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzecu zzc;
    private final zzhkj zzd;

    zzebz(zzgge zzggeVar, zzgge zzggeVar2, zzecu zzecuVar, zzhkj zzhkjVar) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = zzecuVar;
        this.zzd = zzhkjVar;
    }

    final /* synthetic */ ListenableFuture zza(zzbwz zzbwzVar) throws Exception {
        return this.zzc.zza(zzbwzVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlD)).longValue());
    }

    final /* synthetic */ ListenableFuture zzb(zzbwz zzbwzVar, int i, zzebh zzebhVar) throws Exception {
        return ((zzeea) this.zzd.zzb()).zzb(zzbwzVar, i);
    }

    public final ListenableFuture zzc(final zzbwz zzbwzVar) {
        String str = zzbwzVar.zzf;
        com.google.android.gms.ads.internal.zzu.zzp();
        ListenableFuture listenableFutureZzg = com.google.android.gms.ads.internal.util.zzt.zzC(str) ? zzgft.zzg(new zzebh(1, "Ads service proxy force local")) : zzgft.zzf(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzebw
            @Override // com.google.android.gms.internal.ads.zzgez
            public final ListenableFuture zza() {
                return this.zza.zza(zzbwzVar);
            }
        }, this.zza), ExecutionException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzgft.zzg(cause2);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgft.zzf(listenableFutureZzg, zzebh.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeby
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbwzVar, callingUid, (zzebh) obj);
            }
        }, this.zzb);
    }
}
