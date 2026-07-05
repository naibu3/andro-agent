package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzezo implements zzexw {
    private final Context zza;
    private final String zzb;
    private final zzgge zzc;

    public zzezo(zzbxw zzbxwVar, Context context, String str, zzgge zzggeVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzezn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzezp(new JSONObject());
            }
        });
    }
}
