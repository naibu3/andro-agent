package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgvl extends zzhbo implements zzhdf {
    private static final zzgvl zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzgvl zzgvlVar = new zzgvl();
        zza = zzgvlVar;
        zzhbo.zzca(zzgvl.class, zzgvlVar);
    }

    private zzgvl() {
    }

    public static zzgvk zzd() {
        return (zzgvk) zza.zzaZ();
    }

    public static zzgvl zzf(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvl) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgvj zzgvjVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvl();
            case NEW_BUILDER:
                return new zzgvk(zzgvjVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgvl.class) {
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
