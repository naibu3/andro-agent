package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public class zzfps {
    private final String zza;
    private zzfqw zzb;
    private long zzc;
    private int zzd;

    public zzfps(String str) {
        zzb();
        this.zza = str;
        this.zzb = new zzfqw(null);
    }

    public final WebView zza() {
        return (WebView) this.zzb.get();
    }

    public final void zzb() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfpl.zza().zzg(zza(), this.zza, str);
    }

    public final void zze() {
        zzfpl.zza().zzc(zza(), this.zza);
    }

    public final void zzf(zzfok zzfokVar) {
        zzfpl.zza().zzd(zza(), this.zza, zzfokVar.zzb());
    }

    public final void zzg(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfpy.zze(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfpl.zza().zzf(zza(), jSONObject);
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfpl.zza().zzg(zza(), this.zza, str);
        }
    }

    public void zzi(zzfon zzfonVar, zzfol zzfolVar) {
        zzj(zzfonVar, zzfolVar, null);
    }

    protected final void zzj(zzfon zzfonVar, zzfol zzfolVar, JSONObject jSONObject) throws JSONException {
        String strZzh = zzfonVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfpy.zze(jSONObject2, "environment", "app");
        zzfpy.zze(jSONObject2, "adSessionType", zzfolVar.zzd());
        JSONObject jSONObject3 = new JSONObject();
        zzfpy.zze(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfpy.zze(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfpy.zze(jSONObject3, "os", "Android");
        zzfpy.zze(jSONObject2, "deviceInfo", jSONObject3);
        zzfpy.zze(jSONObject2, "deviceCategory", zzfpx.zza().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfpy.zze(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfpy.zze(jSONObject4, "partnerName", zzfolVar.zze().zzb());
        zzfpy.zze(jSONObject4, "partnerVersion", zzfolVar.zze().zzc());
        zzfpy.zze(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfpy.zze(jSONObject5, "libraryVersion", "1.4.10-google_20240110");
        zzfpy.zze(jSONObject5, "appId", zzfpj.zzb().zza().getApplicationContext().getPackageName());
        zzfpy.zze(jSONObject2, "app", jSONObject5);
        if (zzfolVar.zzf() != null) {
            zzfpy.zze(jSONObject2, "contentUrl", zzfolVar.zzf());
        }
        if (zzfolVar.zzg() != null) {
            zzfpy.zze(jSONObject2, "customReferenceData", zzfolVar.zzg());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfolVar.zzh().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfpl.zza().zzi(zza(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzk(boolean z) {
        if (this.zzb.get() != null) {
            zzfpl.zza().zzh(zza(), this.zza, true != z ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzl(float f) {
        zzfpl.zza().zze(zza(), this.zza, f);
    }

    final void zzm(WebView webView) {
        this.zzb = new zzfqw(webView);
    }

    public void zzn() {
    }
}
