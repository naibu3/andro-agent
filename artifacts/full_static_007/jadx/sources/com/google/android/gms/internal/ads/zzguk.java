package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzguk extends zzhbo implements zzhdf {
    private static final zzguk zza;
    private static volatile zzhdm zzb;
    private int zzc;
    private int zzd;
    private zzguq zze;
    private zzhac zzf = zzhac.zzb;

    static {
        zzguk zzgukVar = new zzguk();
        zza = zzgukVar;
        zzhbo.zzca(zzguk.class, zzgukVar);
    }

    private zzguk() {
    }

    public static zzguj zzc() {
        return (zzguj) zza.zzaZ();
    }

    public static zzguk zze() {
        return zza;
    }

    static /* synthetic */ void zzh(zzguk zzgukVar, zzguq zzguqVar) {
        zzguqVar.getClass();
        zzgukVar.zze = zzguqVar;
        zzgukVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhbo
    protected final Object zzde(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzhbn zzhbnVar2 = zzhbn.GET_MEMOIZED_IS_INITIALIZED;
        zzgui zzguiVar = null;
        switch (zzhbnVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbR(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzguk();
            case NEW_BUILDER:
                return new zzguj(zzguiVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhdm zzhbjVar = zzb;
                if (zzhbjVar == null) {
                    synchronized (zzguk.class) {
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
        zzguq zzguqVar = this.zze;
        return zzguqVar == null ? zzguq.zze() : zzguqVar;
    }

    public final zzhac zzg() {
        return this.zzf;
    }
}
