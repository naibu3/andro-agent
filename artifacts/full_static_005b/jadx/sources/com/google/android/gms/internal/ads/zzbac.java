package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbac extends zzhbo implements zzhdf {
    private static final zzbac zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzbac zzbacVar = new zzbac();
        zza = zzbacVar;
        zzhbo.zzca(zzbac.class, zzbacVar);
    }

    private zzbac() {
    }

    public static zzbab zze() {
        return (zzbab) zza.zzaZ();
    }

    public static zzbac zzg() {
        return zza;
    }

    public static zzbac zzh(zzhac zzhacVar) throws zzhcd {
        return (zzbac) zzhbo.zzbm(zza, zzhacVar);
    }

    public static zzbac zzi(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzbac) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    static /* synthetic */ void zzl(zzbac zzbacVar, String str) {
        str.getClass();
        zzbacVar.zzc |= 1;
        zzbacVar.zzd = str;
    }

    static /* synthetic */ void zzm(zzbac zzbacVar, long j) {
        zzbacVar.zzc |= 16;
        zzbacVar.zzh = j;
    }

    static /* synthetic */ void zzn(zzbac zzbacVar, String str) {
        str.getClass();
        zzbacVar.zzc |= 2;
        zzbacVar.zze = str;
    }

    static /* synthetic */ void zzo(zzbac zzbacVar, long j) {
        zzbacVar.zzc |= 4;
        zzbacVar.zzf = j;
    }

    static /* synthetic */ void zzp(zzbac zzbacVar, long j) {
        zzbacVar.zzc |= 8;
        zzbacVar.zzg = j;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzbaa zzbaaVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzbac();
            case NEW_BUILDER:
                return new zzbab(zzbaaVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzbac.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
