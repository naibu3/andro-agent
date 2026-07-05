package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgun extends zzhbo implements zzhdf {
    private static final zzgun zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzguq zzd;
    private int zze;

    static {
        zzgun zzgunVar = new zzgun();
        zza = zzgunVar;
        zzhbo.zzca(zzgun.class, zzgunVar);
    }

    private zzgun() {
    }

    public static zzgum zzc() {
        return (zzgum) zza.zzaZ();
    }

    public static zzgun zze() {
        return zza;
    }

    static /* synthetic */ void zzg(zzgun zzgunVar, zzguq zzguqVar) {
        zzguqVar.getClass();
        zzgunVar.zzd = zzguqVar;
        zzgunVar.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgul zzgulVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgun();
            case NEW_BUILDER:
                return new zzgum(zzgulVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgun.class) {
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

    public final zzguq zzf() {
        zzguq zzguqVar = this.zzd;
        return zzguqVar == null ? zzguq.zze() : zzguqVar;
    }
}
