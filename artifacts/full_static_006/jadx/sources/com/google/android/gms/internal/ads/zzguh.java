package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzguh extends zzhbo implements zzhdf {
    private static final zzguh zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzgun zzd;
    private zzgvz zze;

    static {
        zzguh zzguhVar = new zzguh();
        zza = zzguhVar;
        zzhbo.zzca(zzguh.class, zzguhVar);
    }

    private zzguh() {
    }

    public static zzgug zza() {
        return (zzgug) zza.zzaZ();
    }

    public static zzguh zzd(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzguh) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    static /* synthetic */ void zzg(zzguh zzguhVar, zzgun zzgunVar) {
        zzgunVar.getClass();
        zzguhVar.zzd = zzgunVar;
        zzguhVar.zzc |= 1;
    }

    static /* synthetic */ void zzh(zzguh zzguhVar, zzgvz zzgvzVar) {
        zzgvzVar.getClass();
        zzguhVar.zze = zzgvzVar;
        zzguhVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzguf zzgufVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguh();
            case NEW_BUILDER:
                return new zzgug(zzgufVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzguh.class) {
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

    public final zzgun zze() {
        zzgun zzgunVar = this.zzd;
        return zzgunVar == null ? zzgun.zze() : zzgunVar;
    }

    public final zzgvz zzf() {
        zzgvz zzgvzVar = this.zze;
        return zzgvzVar == null ? zzgvz.zzf() : zzgvzVar;
    }
}
