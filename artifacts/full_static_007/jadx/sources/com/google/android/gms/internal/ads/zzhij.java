package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhij extends zzhbo implements zzhdf {
    private static final zzhij zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzhac zzf = zzhac.zzb;
    private zzhac zzg = zzhac.zzb;

    static {
        zzhij zzhijVar = new zzhij();
        zza = zzhijVar;
        zzhbo.zzca(zzhij.class, zzhijVar);
    }

    private zzhij() {
    }

    public static zzhif zzc() {
        return (zzhif) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhij zzhijVar, zzhii zzhiiVar) {
        zzhijVar.zzd = zzhiiVar.zza();
        zzhijVar.zzc |= 1;
    }

    static /* synthetic */ void zzg(zzhij zzhijVar, String str) {
        zzhijVar.zzc |= 2;
        zzhijVar.zze = "image/png";
    }

    static /* synthetic */ void zzh(zzhij zzhijVar, zzhac zzhacVar) {
        zzhacVar.getClass();
        zzhijVar.zzc |= 4;
        zzhijVar.zzf = zzhacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhih.zza, "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhij();
            case NEW_BUILDER:
                return new zzhif(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzhij.class) {
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
