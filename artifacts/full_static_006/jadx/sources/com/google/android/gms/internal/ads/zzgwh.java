package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgwh extends zzhbo implements zzhdf {
    private static final zzgwh zza;
    private static volatile zzhdm zzb;
    private String zzc = "";
    private zzhac zzd = zzhac.zzb;
    private int zze;

    static {
        zzgwh zzgwhVar = new zzgwh();
        zza = zzgwhVar;
        zzhbo.zzca(zzgwh.class, zzgwhVar);
    }

    private zzgwh() {
    }

    public static zzgwe zza() {
        return (zzgwe) zza.zzaZ();
    }

    public static zzgwh zze() {
        return zza;
    }

    static /* synthetic */ void zzh(zzgwh zzgwhVar, String str) {
        str.getClass();
        zzgwhVar.zzc = str;
    }

    static /* synthetic */ void zzi(zzgwh zzgwhVar, zzhac zzhacVar) {
        zzhacVar.getClass();
        zzgwhVar.zzd = zzhacVar;
    }

    public final zzgwg zzc() {
        zzgwg zzgwgVarZzb = zzgwg.zzb(this.zze);
        return zzgwgVarZzb == null ? zzgwg.UNRECOGNIZED : zzgwgVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgwd zzgwdVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgwh();
            case NEW_BUILDER:
                return new zzgwe(zzgwdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgwh.class) {
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

    public final zzhac zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
