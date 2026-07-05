package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzrl {
    private final Context zza;
    private final zzpp zzb;
    private boolean zzc;
    private final zzrk zzd;
    private zzrn zze;
    private zzrd zzf;

    @Deprecated
    public zzrl() {
        this.zza = null;
        this.zzb = zzpp.zza;
        this.zzd = zzrk.zza;
    }

    public final zzrz zzd() {
        zzeq.zzf(!this.zzc);
        this.zzc = true;
        if (this.zze == null) {
            this.zze = new zzrn(new zzdz[0]);
        }
        if (this.zzf == null) {
            this.zzf = new zzrd(this.zza);
        }
        return new zzrz(this, null);
    }

    public zzrl(Context context) {
        this.zza = context;
        this.zzb = zzpp.zza;
        this.zzd = zzrk.zza;
    }
}
