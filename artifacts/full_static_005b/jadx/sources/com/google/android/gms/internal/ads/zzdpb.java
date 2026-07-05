package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdpb {
    private final Executor zza;
    private final zzdow zzb;

    public zzdpb(Executor executor, zzdow zzdowVar) {
        this.zza = executor;
        this.zzb = zzdowVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFutureZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgft.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZzh = zzgft.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (strOptString == null) {
                    listenableFutureZzh = zzgft.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    listenableFutureZzh = TypedValues.Custom.S_STRING.equals(strOptString2) ? zzgft.zzh(new zzdpa(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgft.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdoy
                        @Override // com.google.android.gms.internal.ads.zzfxu
                        public final Object apply(Object obj) {
                            return new zzdpa(strOptString, (zzbhi) obj);
                        }
                    }, this.zza) : zzgft.zzh(null);
                }
            }
            arrayList.add(listenableFutureZzh);
        }
        return zzgft.zzm(zzgft.zzd(arrayList), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdoz
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdpa zzdpaVar : (List) obj) {
                    if (zzdpaVar != null) {
                        arrayList2.add(zzdpaVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
