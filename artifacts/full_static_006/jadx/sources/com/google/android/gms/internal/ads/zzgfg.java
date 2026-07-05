package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgfg extends zzges {

    @CheckForNull
    private zzgff zza;

    zzgfg(zzgax zzgaxVar, boolean z, Executor executor, Callable callable) {
        super(zzgaxVar, z, false);
        this.zza = new zzgfe(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzges
    final void zzf(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    protected final void zzq() {
        zzgff zzgffVar = this.zza;
        if (zzgffVar != null) {
            zzgffVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    final void zzu() {
        zzgff zzgffVar = this.zza;
        if (zzgffVar != null) {
            zzgffVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
