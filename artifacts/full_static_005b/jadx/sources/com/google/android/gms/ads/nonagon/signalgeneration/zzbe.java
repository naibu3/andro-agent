package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgp;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
final class zzbe extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    zzbe(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        long jLongValue;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        Locale locale = Locale.getDefault();
        String str2 = this.zza;
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
        } else {
            jLongValue = 0;
        }
        final String str3 = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'error': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", str2, str, Long.valueOf(jLongValue));
        if (!((Boolean) zzbgp.zza.zze()).booleanValue()) {
            this.zzb.zzb.evaluateJavascript(str3, null);
            return;
        }
        try {
            this.zzb.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb.zzb.evaluateJavascript(str3, null);
                }
            });
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) throws JSONException {
        final String str;
        long jLongValue;
        String query = queryInfo.getQuery();
        long jLongValue2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
                jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("sdk_ttl_ms", jLongValue);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String str2 = this.zza;
            Locale locale = Locale.getDefault();
            String query2 = queryInfo.getQuery();
            if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
                jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
            }
            str = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'signal': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", str2, query2, Long.valueOf(jLongValue2));
        }
        if (!((Boolean) zzbgp.zza.zze()).booleanValue()) {
            this.zzb.zzb.evaluateJavascript(str, null);
            return;
        }
        try {
            this.zzb.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb.zzb.evaluateJavascript(str, null);
                }
            });
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
        }
    }
}
