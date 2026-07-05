package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbkv implements zzblp {
    zzbkv() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzchd zzchdVar = (zzchd) obj;
        zzbhj zzbhjVarZzK = zzchdVar.zzK();
        if (zzbhjVarZzK == null || (jSONObjectZzb = zzbhjVarZzK.zzb()) == null) {
            zzchdVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzchdVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
