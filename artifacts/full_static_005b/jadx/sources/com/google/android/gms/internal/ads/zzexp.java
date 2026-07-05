package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzexp implements zzexw {
    private final boolean zza;

    zzexp(zzfeo zzfeoVar) {
        this.zza = zzfeoVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return zzgft.zzh(this.zza ? new zzexv() { // from class: com.google.android.gms.internal.ads.zzexo
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
