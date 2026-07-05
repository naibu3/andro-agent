package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfmm {
    public static void zzb(ListenableFuture listenableFuture, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        zzg(listenableFuture, zzfmnVar, zzfmcVar, false);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        zzg(listenableFuture, zzfmnVar, zzfmcVar, true);
    }

    public static void zzd(ListenableFuture listenableFuture, zzfmn zzfmnVar, zzfmc zzfmcVar) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzgft.zzr(zzgfk.zzu(listenableFuture), new zzfml(zzfmnVar, zzfmcVar), zzcci.zzf);
        }
    }

    public static void zze(ListenableFuture listenableFuture, zzfmc zzfmcVar) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzgft.zzr(zzgfk.zzu(listenableFuture), new zzfmj(zzfmcVar), zzcci.zzf);
        }
    }

    public static boolean zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziO), str);
    }

    private static void zzg(ListenableFuture listenableFuture, zzfmn zzfmnVar, zzfmc zzfmcVar, boolean z) {
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzgft.zzr(zzgfk.zzu(listenableFuture), new zzfmk(zzfmnVar, zzfmcVar, z), zzcci.zzf);
        }
    }

    public static zzfmu zza(zzfho zzfhoVar) {
        int iZzf = com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzf(zzfhoVar) - 1;
        return (iZzf == 0 || iZzf == 1) ? zzfmu.CUI_NAME_ADREQUEST : zzfmu.CUI_NAME_SCAR_RENDERING;
    }
}
