package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgwc extends zzhbo implements zzhdf {
    private static final zzgwc zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;

    static {
        zzgwc zzgwcVar = new zzgwc();
        zza = zzgwcVar;
        zzhbo.zzca(zzgwc.class, zzgwcVar);
    }

    private zzgwc() {
    }

    public static zzgwb zzd() {
        return (zzgwb) zza.zzaZ();
    }

    public static zzgwc zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgvt zzc() {
        zzgvt zzgvtVarZzb = zzgvt.zzb(this.zzc);
        return zzgvtVarZzb == null ? zzgvt.UNRECOGNIZED : zzgvtVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwa zzgwaVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwc();
            case NEW_BUILDER:
                return new zzgwb(zzgwaVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgwc.class) {
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
