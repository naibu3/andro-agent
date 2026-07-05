package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzmr {
    public static final zzmr zza;
    public static final zzmr zzb;
    public static final zzmr zzc;
    public static final zzmr zzd;
    public static final zzmr zze;
    public final long zzf;
    public final long zzg;

    static {
        zzmr zzmrVar = new zzmr(0L, 0L);
        zza = zzmrVar;
        zzb = new zzmr(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzmr(Long.MAX_VALUE, 0L);
        zzd = new zzmr(0L, Long.MAX_VALUE);
        zze = zzmrVar;
    }

    public zzmr(long j, long j2) {
        zzeq.zzd(j >= 0);
        zzeq.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmr zzmrVar = (zzmr) obj;
            if (this.zzf == zzmrVar.zzf && this.zzg == zzmrVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
