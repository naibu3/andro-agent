package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbkx implements zzblp {
    zzbkx() {
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzchd zzchdVar = (zzchd) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfwo zzfwoVarZzl = zzfwp.zzl();
        zzfwoVarZzl.zzb((String) map.get("appId"));
        zzfwoVarZzl.zzh(zzchdVar.getWidth());
        zzfwoVarZzl.zzg(zzchdVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzfwoVarZzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzfwoVarZzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzfwoVarZzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzfwoVarZzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzfwoVarZzl.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzu.zzj().zzj(zzchdVar, zzfwoVarZzl.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
