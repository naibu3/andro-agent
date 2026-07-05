package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfmb {
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfmc zza(Context context, zzfmu zzfmuVar) {
        boolean zBooleanValue;
        if (zzfmq.zza()) {
            zzfmu zzfmuVar2 = zzfmu.CUI_NAME_UNKNOWN;
            int iOrdinal = zzfmuVar.ordinal();
            if (iOrdinal == 4 || iOrdinal == 5) {
                zBooleanValue = ((Boolean) zzbgd.zzc.zze()).booleanValue();
                if (zBooleanValue) {
                    return new zzfme(context, zzfmuVar);
                }
            } else {
                if (iOrdinal != 6 && iOrdinal != 18 && iOrdinal != 20 && iOrdinal != 23 && iOrdinal != 31 && iOrdinal != 32) {
                    if (iOrdinal != 39 && iOrdinal != 40) {
                        switch (iOrdinal) {
                            case 13:
                                zBooleanValue = ((Boolean) zzbgd.zzb.zze()).booleanValue();
                                break;
                        }
                    } else {
                        zBooleanValue = ((Boolean) zzbgd.zze.zze()).booleanValue();
                    }
                } else {
                    zBooleanValue = ((Boolean) zzbgd.zzd.zze()).booleanValue();
                }
                if (zBooleanValue) {
                }
            }
        }
        return new zzfnr();
    }

    public static zzfmc zzb(Context context, zzfmu zzfmuVar, zzfmw zzfmwVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfmc zzfmcVarZza = zza(context, zzfmuVar);
        if (zzfmcVarZza instanceof zzfme) {
            zzfmcVarZza.zzj();
            zzfmcVarZza.zzd(zzfmwVar);
            zzfmcVarZza.zzg(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zza(zzlVar.zzm));
            if (zzfmm.zzf(zzlVar.zzp)) {
                zzfmcVarZza.zzf(zzlVar.zzp);
            }
        }
        return zzfmcVarZza;
    }
}
