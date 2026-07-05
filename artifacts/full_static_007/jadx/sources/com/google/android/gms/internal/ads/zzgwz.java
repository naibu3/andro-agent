package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgwz extends zzhbo implements zzhdf {
    private static final zzgwz zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhca zzd = zzbK();

    static {
        zzgwz zzgwzVar = new zzgwz();
        zza = zzgwzVar;
        zzhbo.zzca(zzgwz.class, zzgwzVar);
    }

    private zzgwz() {
    }

    public static zzgww zza() {
        return (zzgww) zza.zzaZ();
    }

    static /* synthetic */ void zze(zzgwz zzgwzVar, zzgwy zzgwyVar) {
        zzgwyVar.getClass();
        zzhca zzhcaVar = zzgwzVar.zzd;
        if (!zzhcaVar.zzc()) {
            zzgwzVar.zzd = zzhbo.zzbL(zzhcaVar);
        }
        zzgwzVar.zzd.add(zzgwyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwv zzgwvVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgwy.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwz();
            case NEW_BUILDER:
                return new zzgww(zzgwvVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgwz.class) {
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
