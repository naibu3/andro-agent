package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhir extends zzhbo implements zzhdf {
    private static final zzhir zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzhhh zzf;
    private zzhhl zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = "";
    private zzhbw zzi = zzbG();
    private String zzj = "";
    private zzhca zzl = zzhbo.zzbK();

    static {
        zzhir zzhirVar = new zzhir();
        zza = zzhirVar;
        zzhbo.zzca(zzhir.class, zzhirVar);
    }

    private zzhir() {
    }

    public static zzhiq zze() {
        return (zzhiq) zza.zzaZ();
    }

    static /* synthetic */ void zzh(zzhir zzhirVar, int i) {
        zzhirVar.zzc |= 1;
        zzhirVar.zzd = i;
    }

    static /* synthetic */ void zzi(zzhir zzhirVar, String str) {
        str.getClass();
        zzhirVar.zzc |= 2;
        zzhirVar.zze = str;
    }

    static /* synthetic */ void zzj(zzhir zzhirVar, zzhhh zzhhhVar) {
        zzhhhVar.getClass();
        zzhirVar.zzf = zzhhhVar;
        zzhirVar.zzc |= 4;
    }

    static /* synthetic */ void zzk(zzhir zzhirVar, zzhip zzhipVar) {
        zzhirVar.zzk = zzhipVar.zza();
        zzhirVar.zzc |= 64;
    }

    static /* synthetic */ void zzl(zzhir zzhirVar, String str) {
        str.getClass();
        zzhca zzhcaVar = zzhirVar.zzl;
        if (!zzhcaVar.zzc()) {
            zzhirVar.zzl = zzhbo.zzbL(zzhcaVar);
        }
        zzhirVar.zzl.add(str);
    }

    public final int zzc() {
        return this.zzl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzhfr zzhfrVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzm);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzm = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzhio.zza, "zzl"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhir();
            case NEW_BUILDER:
                return new zzhiq(zzhfrVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzhir.class) {
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

    public final String zzg() {
        return this.zze;
    }
}
