package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgvz extends zzhbo implements zzhdf {
    private static final zzgvz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzgwc zzd;
    private int zze;
    private int zzf;

    static {
        zzgvz zzgvzVar = new zzgvz();
        zza = zzgvzVar;
        zzhbo.zzca(zzgvz.class, zzgvzVar);
    }

    private zzgvz() {
    }

    public static zzgvy zzd() {
        return (zzgvy) zza.zzaZ();
    }

    public static zzgvz zzf() {
        return zza;
    }

    public static zzgvz zzg(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvz) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    static /* synthetic */ void zzi(zzgvz zzgvzVar, zzgwc zzgwcVar) {
        zzgwcVar.getClass();
        zzgvzVar.zzd = zzgwcVar;
        zzgvzVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgvx zzgvxVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgvz();
            case NEW_BUILDER:
                return new zzgvy(zzgvxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgvz.class) {
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

    public final zzgwc zzh() {
        zzgwc zzgwcVar = this.zzd;
        return zzgwcVar == null ? zzgwc.zzf() : zzgwcVar;
    }
}
