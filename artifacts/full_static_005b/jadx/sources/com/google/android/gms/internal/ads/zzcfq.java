package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcfq implements zzblp {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfp zzcfsVar;
        zzcfh zzcfhVarZza;
        zzcee zzceeVar = (zzcee) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzm.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcfi zzcfiVarZzy = com.google.android.gms.ads.internal.zzu.zzy();
        if (map.containsKey("abort")) {
            if (zzcfiVarZzy.zzd(zzceeVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzced zzcedVar = new zzced((String) map.get("flags"));
        boolean z = zzcedVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = zzcfiVarZzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzcfhVarZza = null;
                        break;
                    }
                    zzcfh zzcfhVar = (zzcfh) it.next();
                    if (zzcfhVar.zza == zzceeVar && str.equals(zzcfhVar.zze())) {
                        zzcfhVarZza = zzcfhVar;
                        break;
                    }
                }
            } else {
                zzcfhVarZza = zzcfiVarZzy.zza(zzceeVar);
            }
            if (zzcfhVarZza != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache task is already running.");
                return;
            }
            if (zzceeVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzceeVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzceeVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzceeVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcfb zzcfbVar = zzceeVar.zzj().zzb;
            if (iIntValue > 0) {
                int i2 = zzcedVar.zzh;
                int iZzu = zzcdv.zzu();
                zzcfsVar = iZzu < i2 ? new zzcfy(zzceeVar, zzcedVar) : iZzu < zzcedVar.zzb ? new zzcfv(zzceeVar, zzcedVar) : new zzcft(zzceeVar);
            } else {
                zzcfsVar = new zzcfs(zzceeVar);
            }
            new zzcfh(zzceeVar, zzcfsVar, str, strArr).zzb();
        } else {
            zzcfh zzcfhVarZza2 = zzcfiVarZzy.zza(zzceeVar);
            if (zzcfhVarZza2 == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Precache must specify a source.");
                return;
            }
            zzcfsVar = zzcfhVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcfsVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcfsVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcfsVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcfsVar.zzq(numZzb8.intValue());
        }
    }
}
