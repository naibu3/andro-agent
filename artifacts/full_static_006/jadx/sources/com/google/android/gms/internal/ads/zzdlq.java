package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdlq {
    private zzbhs zza;

    public zzdlq(zzdlc zzdlcVar) {
        this.zza = zzdlcVar;
    }

    public final synchronized zzbhs zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbhs zzbhsVar) {
        this.zza = zzbhsVar;
    }
}
