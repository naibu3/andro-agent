package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgwt extends zzhbo implements zzhdf {
    private static final zzgwt zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private zzgwh zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgwt zzgwtVar = new zzgwt();
        zza = zzgwtVar;
        zzhbo.zzca(zzgwt.class, zzgwtVar);
    }

    private zzgwt() {
    }

    public static zzgws zze() {
        return (zzgws) zza.zzaZ();
    }

    static /* synthetic */ void zzh(zzgwt zzgwtVar, zzgwh zzgwhVar) {
        zzgwhVar.getClass();
        zzgwtVar.zzd = zzgwhVar;
        zzgwtVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgwh zzc() {
        zzgwh zzgwhVar = this.zzd;
        return zzgwhVar == null ? zzgwh.zze() : zzgwhVar;
    }

    public final zzgwj zzd() {
        zzgwj zzgwjVarZzb = zzgwj.zzb(this.zze);
        return zzgwjVarZzb == null ? zzgwj.UNRECOGNIZED : zzgwjVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwq zzgwqVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwt();
            case NEW_BUILDER:
                return new zzgws(zzgwqVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgwt.class) {
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

    public final zzgxn zzg() {
        zzgxn zzgxnVarZzb = zzgxn.zzb(this.zzg);
        return zzgxnVarZzb == null ? zzgxn.UNRECOGNIZED : zzgxnVarZzb;
    }

    public final boolean zzl() {
        return (this.zzc & 1) != 0;
    }
}
