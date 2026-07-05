package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzerq implements zzexw {
    private final Executor zza;
    private final zzcby zzb;

    zzerq(Executor executor, zzcby zzcbyVar) {
        this.zza = executor;
        this.zzb = zzcbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcJ)).booleanValue() ? zzgft.zzh(null) : zzgft.zzm(this.zzb.zzk(), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzerp
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzexv() { // from class: com.google.android.gms.internal.ads.zzero
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final void zzj(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
