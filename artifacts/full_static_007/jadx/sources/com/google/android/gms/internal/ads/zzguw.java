package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzguw extends zzhbo implements zzhdf {
    private static final zzguw zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzguz zzd;
    private int zze;

    static {
        zzguw zzguwVar = new zzguw();
        zza = zzguwVar;
        zzhbo.zzca(zzguw.class, zzguwVar);
    }

    private zzguw() {
    }

    public static zzguv zzc() {
        return (zzguv) zza.zzaZ();
    }

    public static zzguw zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzguw) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    static /* synthetic */ void zzg(zzguw zzguwVar, zzguz zzguzVar) {
        zzguzVar.getClass();
        zzguwVar.zzd = zzguzVar;
        zzguwVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzguu zzguuVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguw();
            case NEW_BUILDER:
                return new zzguv(zzguuVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzguw.class) {
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
        zzguz zzguzVar = this.zzd;
        return zzguzVar == null ? zzguz.zze() : zzguzVar;
    }
}
