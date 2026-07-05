package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeyy implements zzexw {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcbp zzd;

    public zzeyy(zzcbp zzcbpVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zzd = zzcbpVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return zzgft.zzf(zzgft.zzm(zzgft.zzh(this.zzb), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeyw
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzeyz((String) obj);
            }
        }, this.zza), Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeyx
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        return zzgft.zzh(new zzeyz(this.zzb));
    }
}
