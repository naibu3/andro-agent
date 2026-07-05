package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfad implements zzexw {
    final zzgge zza;
    final Context zzb;
    final zzbdb zzc;

    public zzfad(zzbdb zzbdbVar, zzgge zzggeVar, Context context) {
        this.zzc = zzbdbVar;
        this.zza = zzggeVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfac
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzfae(new JSONObject());
            }
        });
    }
}
