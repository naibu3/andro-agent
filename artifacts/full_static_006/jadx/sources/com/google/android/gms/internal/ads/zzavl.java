package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzavl extends zzhbo implements zzhdf {
    private static final zzavl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhca zzd = zzbK();
    private zzhac zze = zzhac.zzb;
    private int zzf = 1;
    private int zzg = 1;

    static {
        zzavl zzavlVar = new zzavl();
        zza = zzavlVar;
        zzhbo.zzca(zzavl.class, zzavlVar);
    }

    private zzavl() {
    }

    public static zzavk zza() {
        return (zzavk) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzavl zzavlVar, zzhac zzhacVar) {
        zzhca zzhcaVar = zzavlVar.zzd;
        if (!zzhcaVar.zzc()) {
            zzavlVar.zzd = zzhbo.zzbL(zzhcaVar);
        }
        zzavlVar.zzd.add(zzhacVar);
    }

    static /* synthetic */ void zze(zzavl zzavlVar, zzhac zzhacVar) {
        zzavlVar.zzc |= 1;
        zzavlVar.zze = zzhacVar;
    }

    static /* synthetic */ void zzf(zzavl zzavlVar, zzauz zzauzVar) {
        zzavlVar.zzg = zzauzVar.zza();
        zzavlVar.zzc |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzato zzatoVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", zzave.zza, "zzg", zzauy.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzavl();
            case NEW_BUILDER:
                return new zzavk(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzavl.class) {
                        zzhbjVar = zzb;
                        if (zzhbjVar == null) {
                            zzhbjVar = new zzhbj(zza);
                            zzb = zzhbjVar;
                        }
                    }
                }
                return zzhbjVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
