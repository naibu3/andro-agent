package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeck {
    private final zzgge zza;
    private final zzecf zzb;
    private final zzflt zzc;

    zzeck(zzgge zzggeVar, zzecf zzecfVar, zzflt zzfltVar) {
        this.zza = zzggeVar;
        this.zzb = zzecfVar;
        this.zzc = zzfltVar;
    }

    public final ListenableFuture zza(final zzbxu zzbxuVar) {
        zzflk zzflkVarZzb = this.zzc.zzb(zzfln.GMS_SIGNALS, zzgft.zzm(zzgft.zzh(null), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzbxu zzbxuVar2 = zzbxuVar;
                String strZzc = zzfyv.zzc(zzbxuVar2.zza.getString("ms"));
                ApplicationInfo applicationInfo = zzbxuVar2.zzc;
                String str = zzbxuVar2.zzh;
                return new zzbwv(applicationInfo, zzbxuVar2.zzd, zzbxuVar2.zzf, strZzc, -1, str, zzbxuVar2.zze, zzbxuVar2.zzk, zzbxuVar2.zzl);
            }
        }, this.zza));
        final zzecf zzecfVar = this.zzb;
        Objects.requireNonNull(zzecfVar);
        return zzgft.zzm(zzflkVarZzb.zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzecfVar.zzb((zzbwv) obj);
            }
        }).zza(), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = zzbxuVar.zza;
                if (bundle == null) {
                    return jSONObject;
                }
                try {
                    JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(bundle);
                    try {
                        com.google.android.gms.ads.internal.client.zzay.zzb().zzl(jSONObject, jSONObjectZzi);
                        return jSONObject;
                    } catch (JSONException unused) {
                        return jSONObjectZzi;
                    }
                } catch (JSONException unused2) {
                    return jSONObject;
                }
            }
        }, this.zza);
    }
}
