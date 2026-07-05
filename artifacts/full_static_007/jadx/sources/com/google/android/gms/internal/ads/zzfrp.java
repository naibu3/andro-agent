package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfrp {
    private final Context zza;
    private final Looper zzb;

    public zzfrp(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfsf zzfsfVarZza = zzfsj.zza();
        zzfsfVarZza.zza(this.zza.getPackageName());
        zzfsfVarZza.zzc(zzfsi.BLOCKED_IMPRESSION);
        zzfsc zzfscVarZza = zzfsd.zza();
        zzfscVarZza.zzb(str);
        zzfscVarZza.zza(zzfsb.BLOCKED_REASON_BACKGROUND);
        zzfsfVarZza.zzb(zzfscVarZza);
        new zzfrq(this.zza, this.zzb, (zzfsj) zzfsfVarZza.zzbr()).zza();
    }
}
