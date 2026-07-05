package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzesr implements zzexw {
    private final zzfdr zza;

    zzesr(zzfdr zzfdrVar) {
        this.zza = zzfdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        zzfdr zzfdrVar = this.zza;
        zzexv zzexvVar = null;
        if (zzfdrVar != null && zzfdrVar.zza() != null && !zzfdrVar.zza().isEmpty()) {
            zzexvVar = new zzexv() { // from class: com.google.android.gms.internal.ads.zzesq
                @Override // com.google.android.gms.internal.ads.zzexv
                public final void zzj(Object obj) {
                    this.zza.zzc((Bundle) obj);
                }
            };
        }
        return zzgft.zzh(zzexvVar);
    }

    final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
