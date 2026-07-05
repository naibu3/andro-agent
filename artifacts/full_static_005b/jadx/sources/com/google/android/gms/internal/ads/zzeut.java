package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeut implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    zzeut(zzgge zzggeVar, Context context) {
        this.zzb = zzggeVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 57;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzeuu zzc() throws Exception {
        com.google.android.gms.ads.internal.zzu.zzp();
        return new zzeuu(com.google.android.gms.ads.internal.util.zzt.zzs(this.zza));
    }
}
