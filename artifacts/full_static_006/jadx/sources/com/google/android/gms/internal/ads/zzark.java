package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzark {
    public final Object zza;
    public final zzaqn zzb;
    public final zzarn zzc;
    public boolean zzd;

    private zzark(zzarn zzarnVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzarnVar;
    }

    private zzark(Object obj, zzaqn zzaqnVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaqnVar;
        this.zzc = null;
    }

    public static zzark zza(zzarn zzarnVar) {
        return new zzark(zzarnVar);
    }

    public static zzark zzb(Object obj, zzaqn zzaqnVar) {
        return new zzark(obj, zzaqnVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
