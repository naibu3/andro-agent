package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgxf extends zzhbo implements zzhdf {
    private static final zzgxf zza;
    private static volatile zzhdm zzb;
    private String zzc = "";

    static {
        zzgxf zzgxfVar = new zzgxf();
        zza = zzgxfVar;
        zzhbo.zzca(zzgxf.class, zzgxfVar);
    }

    private zzgxf() {
    }

    public static zzgxe zza() {
        return (zzgxe) zza.zzaZ();
    }

    public static zzgxf zzd() {
        return zza;
    }

    public static zzgxf zze(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        return (zzgxf) zzhbo.zzbr(zza, zzhacVar, zzhayVar);
    }

    static /* synthetic */ void zzg(zzgxf zzgxfVar, String str) {
        str.getClass();
        zzgxfVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgxd zzgxdVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzgxf();
            case NEW_BUILDER:
                return new zzgxe(zzgxdVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzgxf.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
