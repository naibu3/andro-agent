package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbmd implements zzbme {
    final /* synthetic */ zzccn zza;

    zzbmd(zzbmf zzbmfVar, zzccn zzccnVar) {
        this.zza = zzccnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(String str) {
        this.zza.zzd(new zzbpw(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
