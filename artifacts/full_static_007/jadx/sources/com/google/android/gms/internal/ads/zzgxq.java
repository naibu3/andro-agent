package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgxq extends zzhbo implements zzhdf {
    private static final zzgxq zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private zzhca zzd = zzbK();

    static {
        zzgxq zzgxqVar = new zzgxq();
        zza = zzgxqVar;
        zzhbo.zzca(zzgxq.class, zzgxqVar);
    }

    private zzgxq() {
    }

    public static zzgxq zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgxo zzgxoVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzc", "zzd", zzgwp.class});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxq();
            case NEW_BUILDER:
                return new zzgxp(zzgxoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgxq.class) {
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
