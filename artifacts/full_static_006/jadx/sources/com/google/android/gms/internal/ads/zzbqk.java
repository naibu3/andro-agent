package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbqk implements zzbme {
    final /* synthetic */ zzbql zza;
    private final zzbpn zzb;
    private final zzccn zzc;

    public zzbqk(zzbql zzbqlVar, zzbpn zzbpnVar, zzccn zzccnVar) {
        this.zza = zzbqlVar;
        this.zzb = zzbpnVar;
        this.zzc = zzccnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbpw());
            } else {
                this.zzc.zzd(new zzbpw(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
