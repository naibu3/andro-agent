package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzerl implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;
    private final VersionInfoParcel zzc;
    private final zzccc zzd;

    public zzerl(zzgge zzggeVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel, zzccc zzcccVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzcccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzerm zzc() throws Exception {
        return new zzerm(this.zzb.zzj, this.zzc, this.zzd.zzm());
    }
}
