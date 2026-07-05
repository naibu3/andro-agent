package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdzi {
    private final zzgge zza;
    private final zzgge zzb;
    private final zzeap zzc;
    private final zzhkj zzd;

    public zzdzi(zzgge zzggeVar, zzgge zzggeVar2, zzeap zzeapVar, zzhkj zzhkjVar) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = zzeapVar;
        this.zzd = zzhkjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzebi zza(zzbxu zzbxuVar) throws Exception {
        return (zzebi) this.zzc.zza(zzbxuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfF)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ ListenableFuture zzb(final zzbxu zzbxuVar, int i, zzebh zzebhVar) throws Exception {
        return zzgft.zzn(((zzedq) this.zzd.zzb()).zzc(zzbxuVar, i), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(new zzebi((InputStream) obj, zzbxuVar));
            }
        }, this.zzb);
    }

    public final ListenableFuture zzc(final zzbxu zzbxuVar) {
        String str = zzbxuVar.zzd;
        com.google.android.gms.ads.internal.zzu.zzp();
        ListenableFuture listenableFutureZzg = com.google.android.gms.ads.internal.util.zzt.zzC(str) ? zzgft.zzg(new zzebh(1)) : zzgft.zzf(this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zza(zzbxuVar);
            }
        }), ExecutionException.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzg(((ExecutionException) obj).getCause());
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzgft.zzf(listenableFutureZzg, zzebh.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdzh
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbxuVar, callingUid, (zzebh) obj);
            }
        }, this.zzb);
    }
}
