package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbqs implements zzbme {
    final /* synthetic */ zzbqt zza;
    private final zzccn zzb;

    public zzbqs(zzbqt zzbqtVar, zzccn zzccnVar) {
        this.zza = zzbqtVar;
        this.zzb = zzccnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zzd(new zzbpw());
            } else {
                this.zzb.zzd(new zzbpw(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zzd(e);
        }
    }
}
