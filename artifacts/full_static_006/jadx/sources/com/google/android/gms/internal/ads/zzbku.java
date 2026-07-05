package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbku implements zzblp {
    zzbku() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzchd zzchdVar = (zzchd) obj;
        zzbhj zzbhjVarZzK = zzchdVar.zzK();
        if (zzbhjVarZzK == null || (jSONObjectZza = zzbhjVarZzK.zza()) == null) {
            zzchdVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzchdVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
