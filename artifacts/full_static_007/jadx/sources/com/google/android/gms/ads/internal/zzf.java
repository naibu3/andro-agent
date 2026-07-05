package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdvc zzdvcVar, zzfmq zzfmqVar, zzfmc zzfmcVar, JSONObject jSONObject) throws Exception {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzu.zzo().zzi().zzv(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdvcVar, "cld_s", zzu.zzB().elapsedRealtime() - l.longValue());
            }
        }
        zzfmcVar.zzh(zOptBoolean);
        zzfmqVar.zzb(zzfmcVar.zzn());
        return zzgft.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdvc zzdvcVar, String str, long j) {
        if (zzdvcVar != null) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzmD)).booleanValue()) {
                zzdvb zzdvbVarZza = zzdvcVar.zza();
                zzdvbVarZza.zzb("action", "lat_init");
                zzdvbVarZza.zzb(str, Long.toString(j));
                zzdvbVarZza.zzf();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfmq zzfmqVar, zzdvc zzdvcVar, Long l) throws JSONException {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzfmqVar, zzdvcVar, l);
    }

    final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcbs zzcbsVar, String str, String str2, Runnable runnable, final zzfmq zzfmqVar, final zzdvc zzdvcVar, final Long l) throws JSONException {
        PackageInfo packageInfo;
        if (zzu.zzB().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzu.zzB().elapsedRealtime();
        if (zzcbsVar != null && !TextUtils.isEmpty(zzcbsVar.zzc())) {
            if (zzu.zzB().currentTimeMillis() - zzcbsVar.zza() <= ((Long) zzba.zzc().zza(zzbep.zzed)).longValue() && zzcbsVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfmc zzfmcVarZza = zzfmb.zza(context, zzfmu.CUI_NAME_SDKINIT_CLD);
        zzfmcVarZza.zzj();
        zzbpx zzbpxVarZza = zzu.zzf().zza(this.zza, versionInfoParcel, zzfmqVar).zza("google.afma.config.fetchAppSettings", zzbqe.zza, zzbqe.zza);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbeg zzbegVar = zzbep.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture listenableFutureZzb = zzbpxVarZza.zzb(jSONObject);
            ListenableFuture listenableFutureZzn = zzgft.zzn(listenableFutureZzb, new zzgfa() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final ListenableFuture zza(Object obj) {
                    return zzf.zzd(l, zzdvcVar, zzfmqVar, zzfmcVarZza, (JSONObject) obj);
                }
            }, zzcci.zzf);
            if (runnable != null) {
                listenableFutureZzb.addListener(runnable, zzcci.zzf);
            }
            if (l != null) {
                listenableFutureZzb.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzf.zzf(zzdvcVar, "cld_r", zzu.zzB().elapsedRealtime() - l.longValue());
                    }
                }, zzcci.zzf);
            }
            if (((Boolean) zzba.zzc().zza(zzbep.zzhP)).booleanValue()) {
                zzccl.zzb(listenableFutureZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzccl.zza(listenableFutureZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error requesting application settings", e);
            zzfmcVarZza.zzi(e);
            zzfmcVarZza.zzh(false);
            zzfmqVar.zzb(zzfmcVarZza.zzn());
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzcbs zzcbsVar, zzfmq zzfmqVar) throws JSONException {
        zzb(context, versionInfoParcel, false, zzcbsVar, zzcbsVar != null ? zzcbsVar.zzb() : null, str, null, zzfmqVar, null, null);
    }
}
