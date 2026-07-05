package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcpp implements zzcot {
    private final CookieManager zza;

    public zzcpp(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzu.zzq().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcot
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaO), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaO);
        String cookie = this.zza.getCookie(str2);
        if (cookie != null) {
            List listZzf = zzfyt.zzc(zzfxr.zzc(';')).zzf(cookie);
            for (int i = 0; i < listZzf.size(); i++) {
                CookieManager cookieManager = this.zza;
                Iterator it = zzfyt.zzc(zzfxr.zzc('=')).zzd((String) listZzf.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                }
                cookieManager.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzay))));
            }
        }
    }
}
