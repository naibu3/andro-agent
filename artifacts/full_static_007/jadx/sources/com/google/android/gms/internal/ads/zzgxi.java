package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgxi extends zzhbo implements zzhdf {
    private static final zzgxi zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzgxl zze;

    static {
        zzgxi zzgxiVar = new zzgxi();
        zza = zzgxiVar;
        zzhbo.zzca(zzgxi.class, zzgxiVar);
    }

    private zzgxi() {
    }

    public static zzgxh zzc() {
        return (zzgxh) zza.zzaZ();
    }

    public static zzgxi zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgxi) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzg() {
        return zza.zzbM();
    }

    static /* synthetic */ void zzh(zzgxi zzgxiVar, zzgxl zzgxlVar) {
        zzgxlVar.getClass();
        zzgxiVar.zze = zzgxlVar;
        zzgxiVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgxg zzgxgVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxi();
            case NEW_BUILDER:
                return new zzgxh(zzgxgVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgxi.class) {
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

    public final zzgxl zzf() {
        zzgxl zzgxlVar = this.zze;
        return zzgxlVar == null ? zzgxl.zze() : zzgxlVar;
    }
}
