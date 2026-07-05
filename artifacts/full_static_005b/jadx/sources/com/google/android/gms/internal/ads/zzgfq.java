package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgfq implements Runnable {
    final Future zza;
    final zzgfp zzb;

    zzgfq(Future future, zzgfp zzgfpVar) {
        this.zza = future;
        this.zzb = zzgfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.zza;
        if ((obj instanceof zzggw) && (thZza = zzggx.zza((zzggw) obj)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgft.zzp(this.zza));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzfxy zzfxyVarZza = zzfxz.zza(this);
        zzfxyVarZza.zza(this.zzb);
        return zzfxyVarZza.toString();
    }
}
