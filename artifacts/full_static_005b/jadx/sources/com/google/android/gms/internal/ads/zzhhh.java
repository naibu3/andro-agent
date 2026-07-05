package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhhh extends zzhbo implements zzhdf {
    private static final zzhhh zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzhhg zzd;
    private int zzh;
    private byte zzi = 2;
    private zzhca zze = zzbK();
    private zzhac zzf = zzhac.zzb;
    private zzhac zzg = zzhac.zzb;

    static {
        zzhhh zzhhhVar = new zzhhh();
        zza = zzhhhVar;
        zzhbo.zzca(zzhhh.class, zzhhhVar);
    }

    private zzhhh() {
    }

    public static zzhhe zzc() {
        return (zzhhe) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhhh zzhhhVar, zzhhd zzhhdVar) {
        zzhhdVar.getClass();
        zzhca zzhcaVar = zzhhhVar.zze;
        if (!zzhcaVar.zzc()) {
            zzhhhVar.zze = zzhbo.zzbL(zzhcaVar);
        }
        zzhhhVar.zze.add(zzhhdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhhd.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhhh();
            case NEW_BUILDER:
                return new zzhhe(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzhhh.class) {
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
