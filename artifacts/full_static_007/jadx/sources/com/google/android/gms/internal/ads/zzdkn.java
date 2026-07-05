package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdkn implements zzblp {
    private final WeakReference zza;

    /* synthetic */ zzdkn(zzdkq zzdkqVar, zzdkm zzdkmVar) {
        this.zza = new WeakReference(zzdkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzdkq zzdkqVar = (zzdkq) this.zza.get();
        if (zzdkqVar == null) {
            return;
        }
        zzdkqVar.zzh.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkM)).booleanValue()) {
            zzdkqVar.zzi.zzdG();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdkqVar.zzi.zzdf();
        }
    }
}
