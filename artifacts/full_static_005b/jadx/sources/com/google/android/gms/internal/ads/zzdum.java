package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdum {
    public static final zzgbc zza;
    public static final zzgbc zzb;
    private final String zzc;
    private final zzdul zzd;
    private final zzdul zze;

    static {
        zzdul zzdulVar = zzdul.PUBLIC_API_CALL;
        zzdul zzdulVar2 = zzdul.PUBLIC_API_CALLBACK;
        zzdum zzdumVar = new zzdum("tqgt", zzdulVar, zzdulVar2);
        zzdul zzdulVar3 = zzdul.PUBLIC_API_CALL;
        zzdul zzdulVar4 = zzdul.DYNAMITE_ENTER;
        zzdum zzdumVar2 = new zzdum("l.dl", zzdulVar3, zzdulVar4);
        zzdul zzdulVar5 = zzdul.CLIENT_SIGNALS_START;
        zzdum zzdumVar3 = new zzdum("l.rcc", zzdulVar4, zzdulVar5);
        zzdul zzdulVar6 = zzdul.CLIENT_SIGNALS_END;
        zzdum zzdumVar4 = new zzdum("l.cs", zzdulVar5, zzdulVar6);
        zzdum zzdumVar5 = new zzdum("l.cts", zzdulVar6, zzdul.SERVICE_CONNECTED);
        zzdul zzdulVar7 = zzdul.GMS_SIGNALS_START;
        zzdul zzdulVar8 = zzdul.GMS_SIGNALS_END;
        zzdum zzdumVar6 = new zzdum("l.gs", zzdulVar7, zzdulVar8);
        zzdul zzdulVar9 = zzdul.GET_SIGNALS_SDKCORE_START;
        zzdum zzdumVar7 = new zzdum("l.jse", zzdulVar8, zzdulVar9);
        zzdul zzdulVar10 = zzdul.GET_SIGNALS_SDKCORE_END;
        zza = zzgbc.zzs(zzdumVar, zzdumVar2, zzdumVar3, zzdumVar4, zzdumVar5, zzdumVar6, zzdumVar7, new zzdum("l.gs-sdkcore", zzdulVar9, zzdulVar10), new zzdum("l.gs-pp", zzdulVar10, zzdulVar2));
        zzdul zzdulVar11 = zzdul.PUBLIC_API_CALL;
        zzdum zzdumVar8 = new zzdum("l.al", zzdulVar11, zzdul.PUBLIC_API_CALLBACK);
        zzdul zzdulVar12 = zzdul.DYNAMITE_ENTER;
        zzdum zzdumVar9 = new zzdum("l.dl", zzdulVar11, zzdulVar12);
        zzdul zzdulVar13 = zzdul.CLIENT_SIGNALS_START;
        zzdum zzdumVar10 = new zzdum("l.rcc", zzdulVar12, zzdulVar13);
        zzdul zzdulVar14 = zzdul.CLIENT_SIGNALS_END;
        zzdum zzdumVar11 = new zzdum("l.cs", zzdulVar13, zzdulVar14);
        zzdum zzdumVar12 = new zzdum("l.cts", zzdulVar14, zzdul.SERVICE_CONNECTED);
        zzdul zzdulVar15 = zzdul.GMS_SIGNALS_START;
        zzdul zzdulVar16 = zzdul.GMS_SIGNALS_END;
        zzdum zzdumVar13 = new zzdum("l.gs", zzdulVar15, zzdulVar16);
        zzdul zzdulVar17 = zzdul.GET_AD_DICTIONARY_SDKCORE_START;
        zzdum zzdumVar14 = new zzdum("l.jse", zzdulVar16, zzdulVar17);
        zzdul zzdulVar18 = zzdul.GET_AD_DICTIONARY_SDKCORE_END;
        zzdum zzdumVar15 = new zzdum("l.gad-js", zzdulVar17, zzdulVar18);
        zzdul zzdulVar19 = zzdul.HTTP_RESPONSE_READY;
        zzb = zzgbc.zzt(zzdumVar8, zzdumVar9, zzdumVar10, zzdumVar11, zzdumVar12, zzdumVar13, zzdumVar14, zzdumVar15, new zzdum("l.http", zzdulVar18, zzdulVar19), new zzdum("l.nml-js", zzdulVar19, zzdul.SERVER_RESPONSE_PARSE_START));
    }

    public zzdum(String str, zzdul zzdulVar, zzdul zzdulVar2) {
        this.zzc = str;
        this.zzd = zzdulVar;
        this.zze = zzdulVar2;
    }

    public final zzdul zza() {
        return this.zzd;
    }

    public final zzdul zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
