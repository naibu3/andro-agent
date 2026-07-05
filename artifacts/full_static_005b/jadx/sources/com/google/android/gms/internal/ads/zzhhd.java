package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhhd extends zzhbo implements zzhdf {
    private static final zzhhd zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private byte zzf = 2;
    private zzhac zzd = zzhac.zzb;
    private zzhac zze = zzhac.zzb;

    static {
        zzhhd zzhhdVar = new zzhhd();
        zza = zzhhdVar;
        zzhbo.zzca(zzhhd.class, zzhhdVar);
    }

    private zzhhd() {
    }

    public static zzhhc zzc() {
        return (zzhhc) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhhd zzhhdVar, zzhac zzhacVar) {
        zzhhdVar.zzc |= 1;
        zzhhdVar.zzd = zzhacVar;
    }

    static /* synthetic */ void zzg(zzhhd zzhhdVar, zzhac zzhacVar) {
        zzhhdVar.zzc |= 2;
        zzhhdVar.zze = zzhacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhd();
            case NEW_BUILDER:
                return new zzhhc(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzhhd.class) {
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
