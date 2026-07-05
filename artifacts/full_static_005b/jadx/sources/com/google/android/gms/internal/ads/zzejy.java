package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzejy implements zzehn {
    private final zzdst zza;

    public zzejy(zzdst zzdstVar) {
        this.zza = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehn
    public final zzeho zza(String str, JSONObject jSONObject) throws zzfhv {
        return new zzeho(this.zza.zzc(str, jSONObject), new zzejh(), str);
    }
}
