package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzvh extends zzvc {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzvh(zzdc zzdcVar, Object obj, Object obj2) {
        super(zzdcVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzvh zzq(zzbu zzbuVar) {
        return new zzvh(new zzvi(zzbuVar), zzdb.zza, zzd);
    }

    public static zzvh zzr(zzdc zzdcVar, Object obj, Object obj2) {
        return new zzvh(zzdcVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        Object obj2;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return this.zzc.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i, zzcz zzczVar, boolean z) {
        this.zzc.zzd(i, zzczVar, z);
        if (zzgd.zzG(zzczVar.zzc, this.zzf) && z) {
            zzczVar.zzc = zzd;
        }
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i, zzdb zzdbVar, long j) {
        this.zzc.zze(i, zzdbVar, j);
        if (zzgd.zzG(zzdbVar.zzc, this.zze)) {
            zzdbVar.zzc = zzdb.zza;
        }
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvc, com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i) {
        Object objZzf = this.zzc.zzf(i);
        return zzgd.zzG(objZzf, this.zzf) ? zzd : objZzf;
    }

    public final zzvh zzp(zzdc zzdcVar) {
        return new zzvh(zzdcVar, this.zze, this.zzf);
    }
}
