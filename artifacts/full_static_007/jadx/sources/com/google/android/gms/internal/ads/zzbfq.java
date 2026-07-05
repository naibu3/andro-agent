package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.firebase.messaging.Constants;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbfq {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zze zzb;
    private Runnable zzc;
    private zzbfn zzd;
    private CustomTabsSession zze;
    private String zzf;
    private long zzg = 0;
    private long zzh;
    private JSONArray zzi;
    private Context zzj;

    public zzbfq(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zze zzeVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzjN)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj() {
        zzbfn zzbfnVar = this.zzd;
        if (zzbfnVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbfnVar.zza().booleanValue()) {
            return;
        }
        if (this.zzf != null && this.zze != null && this.zza != null) {
            if (this.zzg == 0 || com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() > this.zzg) {
            }
            this.zze.requestPostMessageChannel(Uri.parse(this.zzf));
            this.zza.schedule(this.zzc, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjO)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    private final void zzk(JSONObject jSONObject) throws JSONException {
        try {
            if (this.zzi == null) {
                this.zzi = new JSONArray((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjQ));
            }
            jSONObject.put("eids", this.zzi);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zze;
    }

    final JSONObject zzc(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str2);
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        zzk(jSONObject);
        return jSONObject;
    }

    final JSONObject zzd(String str, String str2) throws JSONException {
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject.put("sdk_ttl_ms", jLongValue);
        zzk(jSONObject);
        return jSONObject;
    }

    final void zzf() {
        this.zzg = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjM)).intValue();
        if (this.zzc == null) {
            this.zzc = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbfo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    final void zzh(String str) {
        try {
            CustomTabsSession customTabsSession = this.zze;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzh).toString());
            zzk(jSONObject);
            customTabsSession.postMessage(jSONObject.toString(), null);
            zzbfp zzbfpVar = new zzbfp(this, str);
            if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
                this.zzb.zzg(this.zze, zzbfpVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzj, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbfpVar);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j) {
        this.zzh = j;
    }

    public final void zzg(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzj = context;
        this.zzf = str;
        zzbfn zzbfnVar = new zzbfn(this, customTabsCallback);
        this.zzd = zzbfnVar;
        CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(zzbfnVar);
        this.zze = customTabsSessionNewSession;
        if (customTabsSessionNewSession == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("CustomTabsClient failed to create new session.");
        }
    }
}
