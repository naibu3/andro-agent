package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzema implements zzehn {
    private final Map zza = new HashMap();
    private final zzdst zzb;

    public zzema(zzdst zzdstVar) {
        this.zzb = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehn
    public final zzeho zza(String str, JSONObject jSONObject) throws zzfhv {
        zzeho zzehoVar;
        synchronized (this) {
            zzehoVar = (zzeho) this.zza.get(str);
            if (zzehoVar == null) {
                zzehoVar = new zzeho(this.zzb.zzc(str, jSONObject), new zzeji(), str);
                this.zza.put(str, zzehoVar);
            }
        }
        return zzehoVar;
    }
}
