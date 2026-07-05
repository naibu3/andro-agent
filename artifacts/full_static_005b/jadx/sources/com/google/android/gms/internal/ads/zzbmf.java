package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbmf implements zzblp {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbme zzbmeVar = (zzbme) this.zzb.remove(str);
            if (zzbmeVar == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbmeVar.zza(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                zzbmeVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbmeVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbmeVar.zza(e.getMessage());
            }
        }
    }

    public final ListenableFuture zzb(zzbox zzboxVar, String str, JSONObject jSONObject) throws JSONException {
        zzccn zzccnVar = new zzccn();
        com.google.android.gms.ads.internal.zzu.zzp();
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbmd(this, zzccnVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzboxVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzccnVar.zzd(e);
        }
        return zzccnVar;
    }

    public final void zzc(String str, zzbme zzbmeVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbmeVar);
        }
    }
}
