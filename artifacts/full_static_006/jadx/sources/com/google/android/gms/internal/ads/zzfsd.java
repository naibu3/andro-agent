package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfsd extends zzhbo implements zzhdf {
    private static final zzhbx zza = new zzfry();
    private static final zzfsd zzb;
    private static volatile zzhdm zzc;
    private int zzd;
    private zzhbw zze = zzbG();
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzfsd zzfsdVar = new zzfsd();
        zzb = zzfsdVar;
        zzhbo.zzca(zzfsd.class, zzfsdVar);
    }

    private zzfsd() {
    }

    public static zzfsc zza() {
        return (zzfsc) zzb.zzaZ();
    }

    static /* synthetic */ void zzd(zzfsd zzfsdVar, zzfsb zzfsbVar) {
        zzfsbVar.getClass();
        zzhbw zzhbwVar = zzfsdVar.zze;
        if (!zzhbwVar.zzc()) {
            zzfsdVar.zze = zzhbo.zzbH(zzhbwVar);
        }
        zzfsdVar.zze.zzi(zzfsbVar.zza());
    }

    static /* synthetic */ void zze(zzfsd zzfsdVar, String str) {
        str.getClass();
        zzfsdVar.zzd |= 1;
        zzfsdVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzfry zzfryVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzd", "zze", zzfsa.zza, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzfsd();
            case NEW_BUILDER:
                return new zzfsc(zzfryVar);
            case GET_DEFAULT_INSTANCE:
                return zzb;
            case GET_PARSER:
                zzhdm zzhbjVar = zzc;
                if (zzhbjVar == null) {
                    synchronized (zzfsd.class) {
                        zzhbjVar = zzc;
                        if (zzhbjVar == null) {
                            zzhbjVar = new zzhbj(zzb);
                            zzc = zzhbjVar;
                        }
                    }
                }
                return zzhbjVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
