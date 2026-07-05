package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgut extends zzhbo implements zzhdf {
    private static final zzgut zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzguz zze;
    private zzhac zzf = zzhac.zzb;

    static {
        zzgut zzgutVar = new zzgut();
        zza = zzgutVar;
        zzhbo.zzca(zzgut.class, zzgutVar);
    }

    private zzgut() {
    }

    public static zzgus zzc() {
        return (zzgus) zza.zzaZ();
    }

    public static zzgut zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgut) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzh() {
        return zza.zzbM();
    }

    static /* synthetic */ void zzi(zzgut zzgutVar, zzguz zzguzVar) {
        zzguzVar.getClass();
        zzgutVar.zze = zzguzVar;
        zzgutVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgur zzgurVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgut();
            case NEW_BUILDER:
                return new zzgus(zzgurVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgut.class) {
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

    public final zzguz zzf() {
        zzguz zzguzVar = this.zze;
        return zzguzVar == null ? zzguz.zze() : zzguzVar;
    }

    public final zzhac zzg() {
        return this.zzf;
    }
}
