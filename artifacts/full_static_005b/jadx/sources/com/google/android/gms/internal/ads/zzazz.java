package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzazz extends zzhbo implements zzhdf {
    private static final zzazz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzbac zzd;
    private zzhac zze = zzhac.zzb;
    private zzhac zzf = zzhac.zzb;

    static {
        zzazz zzazzVar = new zzazz();
        zza = zzazzVar;
        zzhbo.zzca(zzazz.class, zzazzVar);
    }

    private zzazz() {
    }

    public static zzazz zzc(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzazz) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public final zzbac zzd() {
        zzbac zzbacVar = this.zzd;
        return zzbacVar == null ? zzbac.zzg() : zzbacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzazx zzazxVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzazz();
            case NEW_BUILDER:
                return new zzazy(zzazxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzazz.class) {
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

    public final zzhac zze() {
        return this.zzf;
    }

    public final zzhac zzf() {
        return this.zze;
    }
}
