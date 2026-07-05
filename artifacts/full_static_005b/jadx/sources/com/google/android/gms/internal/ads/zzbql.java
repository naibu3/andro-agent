package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbql implements zzbpx {
    private final zzbpz zza;
    private final zzbqa zzb;
    private final zzbpt zzc;
    private final String zzd;

    zzbql(zzbpt zzbptVar, String str, zzbqa zzbqaVar, zzbpz zzbpzVar) {
        this.zzc = zzbptVar;
        this.zzd = str;
        this.zzb = zzbqaVar;
        this.zza = zzbpzVar;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbql zzbqlVar, zzbpn zzbpnVar, zzbpu zzbpuVar, Object obj, zzccn zzccnVar) throws JSONException {
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            String string = UUID.randomUUID().toString();
            zzblo.zzo.zzc(string, new zzbqk(zzbqlVar, zzbpnVar, zzccnVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbqlVar.zzb.zzb(obj));
            zzbpuVar.zzl(zzbqlVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzccnVar.zzd(e);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbpnVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final ListenableFuture zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final ListenableFuture zzb(Object obj) {
        zzccn zzccnVar = new zzccn();
        zzbpn zzbpnVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbpnVarZzb.zzj(new zzbqi(this, zzbpnVarZzb, obj, zzccnVar), new zzbqj(this, zzccnVar, zzbpnVarZzb));
        return zzccnVar;
    }
}
