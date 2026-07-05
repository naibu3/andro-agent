package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbmh implements zzblp {
    private final zzbmg zza;

    public zzbmh(zzbmg zzbmgVar) {
        this.zza = zzbmgVar;
    }

    public static void zzb(zzchd zzchdVar, zzbmg zzbmgVar) {
        zzchdVar.zzag("/reward", new zzbmh(zzbmgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) throws NumberFormatException {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbyt zzbytVar = null;
        try {
            int i = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbytVar = new zzbyt(str2, i);
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbytVar);
    }
}
