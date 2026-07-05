package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaup extends zzhbo implements zzhdf {
    private static final zzaup zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = 1000;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = 1000;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        zzaup zzaupVar = new zzaup();
        zza = zzaupVar;
        zzhbo.zzca(zzaup.class, zzaupVar);
    }

    private zzaup() {
    }

    public static zzauo zza() {
        return (zzauo) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 1;
        zzaupVar.zzd = j;
    }

    static /* synthetic */ void zze(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 2;
        zzaupVar.zze = j;
    }

    static /* synthetic */ void zzf(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 4;
        zzaupVar.zzf = j;
    }

    static /* synthetic */ void zzg(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 8;
        zzaupVar.zzg = j;
    }

    static /* synthetic */ void zzh(zzaup zzaupVar) {
        zzaupVar.zzc &= -9;
        zzaupVar.zzg = -1L;
    }

    static /* synthetic */ void zzi(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 16;
        zzaupVar.zzh = j;
    }

    static /* synthetic */ void zzj(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 32;
        zzaupVar.zzi = j;
    }

    static /* synthetic */ void zzk(zzaup zzaupVar, zzavc zzavcVar) {
        zzaupVar.zzj = zzavcVar.zza();
        zzaupVar.zzc |= 64;
    }

    static /* synthetic */ void zzl(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 128;
        zzaupVar.zzk = j;
    }

    static /* synthetic */ void zzm(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 256;
        zzaupVar.zzl = j;
    }

    static /* synthetic */ void zzn(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 512;
        zzaupVar.zzm = j;
    }

    static /* synthetic */ void zzo(zzaup zzaupVar, zzavc zzavcVar) {
        zzaupVar.zzn = zzavcVar.zza();
        zzaupVar.zzc |= 1024;
    }

    static /* synthetic */ void zzp(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 2048;
        zzaupVar.zzo = j;
    }

    static /* synthetic */ void zzq(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 4096;
        zzaupVar.zzp = j;
    }

    static /* synthetic */ void zzr(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 8192;
        zzaupVar.zzu = j;
    }

    static /* synthetic */ void zzs(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 16384;
        zzaupVar.zzv = j;
    }

    static /* synthetic */ void zzt(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 32768;
        zzaupVar.zzw = j;
    }

    static /* synthetic */ void zzu(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 65536;
        zzaupVar.zzx = j;
    }

    static /* synthetic */ void zzv(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 131072;
        zzaupVar.zzy = j;
    }

    static /* synthetic */ void zzw(zzaup zzaupVar, long j) {
        zzaupVar.zzc |= 262144;
        zzaupVar.zzz = j;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzato zzatoVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzavb.zza, "zzk", "zzl", "zzm", "zzn", zzavb.zza, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
            case NEW_MUTABLE_INSTANCE:
                return new zzaup();
            case NEW_BUILDER:
                return new zzauo(zzatoVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzaup.class) {
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
