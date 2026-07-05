package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgty extends zzhbo implements zzhdf {
    private static final zzgty zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzgub zze;

    static {
        zzgty zzgtyVar = new zzgty();
        zza = zzgtyVar;
        zzhbo.zzca(zzgty.class, zzgtyVar);
    }

    private zzgty() {
    }

    public static zzgtx zzc() {
        return (zzgtx) zza.zzaZ();
    }

    public static zzgty zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgty) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    static /* synthetic */ void zzh(zzgty zzgtyVar, zzgub zzgubVar) {
        zzgubVar.getClass();
        zzgtyVar.zze = zzgubVar;
        zzgtyVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgtw zzgtwVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgty();
            case NEW_BUILDER:
                return new zzgtx(zzgtwVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgty.class) {
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

    public final zzgub zzf() {
        zzgub zzgubVar = this.zze;
        return zzgubVar == null ? zzgub.zze() : zzgubVar;
    }
}
