package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhit extends zzhbo implements zzhdf {
    private static final zzhit zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhit zzhitVar = new zzhit();
        zza = zzhitVar;
        zzhbo.zzca(zzhit.class, zzhitVar);
    }

    private zzhit() {
    }

    public static zzhis zzc() {
        return (zzhis) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhit zzhitVar, String str) {
        zzhitVar.zzc |= 1;
        zzhitVar.zzd = str;
    }

    static /* synthetic */ void zzg(zzhit zzhitVar, long j) {
        zzhitVar.zzc |= 2;
        zzhitVar.zze = j;
    }

    static /* synthetic */ void zzh(zzhit zzhitVar, boolean z) {
        zzhitVar.zzc |= 4;
        zzhitVar.zzf = z;
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
                return zzbR(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhiv.zza, "zzh", "zzi", "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhit();
            case NEW_BUILDER:
                return new zzhis(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzhit.class) {
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
