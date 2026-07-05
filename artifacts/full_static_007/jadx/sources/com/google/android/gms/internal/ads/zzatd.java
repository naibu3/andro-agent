package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzatd extends zzhbo implements zzhdf {
    private static final zzatd zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzk = "";
    private String zzm = "";
    private String zzn = "";
    private zzhca zzo = zzbK();

    static {
        zzatd zzatdVar = new zzatd();
        zza = zzatdVar;
        zzhbo.zzca(zzatd.class, zzatdVar);
    }

    private zzatd() {
    }

    public static zzasx zza() {
        return (zzasx) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzatd zzatdVar, long j) {
        zzatdVar.zzc |= 2;
        zzatdVar.zze = j;
    }

    static /* synthetic */ void zze(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzc |= 4;
        zzatdVar.zzf = str;
    }

    static /* synthetic */ void zzf(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzc |= 8;
        zzatdVar.zzg = str;
    }

    static /* synthetic */ void zzg(zzatd zzatdVar, String str) {
        zzatdVar.zzc |= 16;
        zzatdVar.zzh = str;
    }

    static /* synthetic */ void zzh(zzatd zzatdVar, String str) {
        zzatdVar.zzc |= 1024;
        zzatdVar.zzn = str;
    }

    static /* synthetic */ void zzi(zzatd zzatdVar, zzatc zzatcVar) {
        zzatdVar.zzp = zzatcVar.zza();
        zzatdVar.zzc |= 2048;
    }

    static /* synthetic */ void zzj(zzatd zzatdVar, String str) {
        str.getClass();
        zzatdVar.zzc |= 1;
        zzatdVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzasw zzaswVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzasz.class, "zzp", zzatb.zza});
            case NEW_MUTABLE_INSTANCE:
                return new zzatd();
            case NEW_BUILDER:
                return new zzasx(zzaswVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzatd.class) {
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
