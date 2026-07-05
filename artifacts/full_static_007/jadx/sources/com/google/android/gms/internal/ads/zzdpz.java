package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdpz implements zzbhj {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdqa zzb;

    zzdpz(zzdqa zzdqaVar, String str) {
        this.zzb = zzdqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zzc() {
        zzdqa zzdqaVar = this.zzb;
        if (zzdqaVar.zzd != null) {
            zzdqaVar.zzd.zzF(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhj
    public final void zzd(MotionEvent motionEvent) {
    }
}
