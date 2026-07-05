package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgtv extends zzhbo implements zzhdf {
    private static final zzgtv zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzhac zze = zzhac.zzb;
    private zzgub zzf;

    static {
        zzgtv zzgtvVar = new zzgtv();
        zza = zzgtvVar;
        zzhbo.zzca(zzgtv.class, zzgtvVar);
    }

    private zzgtv() {
    }

    public static zzgtu zzc() {
        return (zzgtu) zza.zzaZ();
    }

    public static zzgtv zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgtv) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    public static zzhdm zzh() {
        return zza.zzbM();
    }

    static /* synthetic */ void zzj(zzgtv zzgtvVar, zzgub zzgubVar) {
        zzgubVar.getClass();
        zzgtvVar.zzf = zzgubVar;
        zzgtvVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgtt zzgttVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgtv();
            case NEW_BUILDER:
                return new zzgtu(zzgttVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgtv.class) {
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
        zzgub zzgubVar = this.zzf;
        return zzgubVar == null ? zzgub.zze() : zzgubVar;
    }

    public final zzhac zzg() {
        return this.zze;
    }
}
