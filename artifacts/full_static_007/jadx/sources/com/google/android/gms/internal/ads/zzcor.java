package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcor {
    private final Map zza;
    private final Map zzb;

    zzcor(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfhf zzfhfVar) throws Exception {
        for (zzfhd zzfhdVar : zzfhfVar.zzb.zzc) {
            if (this.zza.containsKey(zzfhdVar.zza)) {
                ((zzcou) this.zza.get(zzfhdVar.zza)).zza(zzfhdVar.zzb);
            } else if (this.zzb.containsKey(zzfhdVar.zza)) {
                zzcot zzcotVar = (zzcot) this.zzb.get(zzfhdVar.zza);
                JSONObject jSONObject = zzfhdVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzcotVar.zza(map);
            }
        }
    }
}
