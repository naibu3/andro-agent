package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgvr extends zzhbo implements zzhdf {
    private static final zzgvr zza;
    private static volatile zzhdm zzb;

    static {
        zzgvr zzgvrVar = new zzgvr();
        zza = zzgvrVar;
        zzhbo.zzca(zzgvr.class, zzgvrVar);
    }

    private zzgvr() {
    }

    public static zzgvr zzc() {
        return zza;
    }

    public static zzgvr zzd(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgvr) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgvp zzgvpVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new zzgvr();
            case NEW_BUILDER:
                return new zzgvq(zzgvpVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgvr.class) {
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
