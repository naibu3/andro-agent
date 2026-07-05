package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhko implements zzhky, zzhkj {
    private static final Object zza = new Object();
    private volatile zzhky zzb;
    private volatile Object zzc = zza;

    private zzhko(zzhky zzhkyVar) {
        this.zzb = zzhkyVar;
    }

    public static zzhkj zza(zzhky zzhkyVar) {
        return zzhkyVar instanceof zzhkj ? (zzhkj) zzhkyVar : new zzhko(zzhkyVar);
    }

    public static zzhky zzc(zzhky zzhkyVar) {
        return zzhkyVar instanceof zzhko ? zzhkyVar : new zzhko(zzhkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final Object zzb() {
        Object objZzb = this.zzc;
        Object obj = zza;
        if (objZzb == obj) {
            synchronized (this) {
                objZzb = this.zzc;
                if (objZzb == obj) {
                    objZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = objZzb;
                    this.zzb = null;
                }
            }
        }
        return objZzb;
    }
}
