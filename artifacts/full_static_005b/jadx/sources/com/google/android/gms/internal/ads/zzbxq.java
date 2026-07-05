package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbxq extends zzbxo {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbpx zzd;
    private final VersionInfoParcel zze;

    public zzbxq(Context context, zzbpx zzbpxVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbpxVar;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbgk.zzb.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbgk.zzc.zze());
            jSONObject.put("cl", "636244245");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final ListenableFuture zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbgk.zzd.zze()).longValue()) {
            return zzgft.zzh(null);
        }
        return zzgft.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbxp
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                this.zza.zzb((JSONObject) obj);
                return null;
            }
        }, zzcci.zzf);
    }

    final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbeg zzbegVar = zzbep.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb();
        SharedPreferences sharedPreferencesZza = zzbei.zza(this.zzb);
        if (sharedPreferencesZza == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        com.google.android.gms.ads.internal.client.zzba.zza();
        zzbfv zzbfvVar = zzbga.zza;
        com.google.android.gms.ads.internal.client.zzba.zza().zze(editorEdit, 1, jSONObject);
        com.google.android.gms.ads.internal.client.zzba.zzb();
        editorEdit.commit();
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()).apply();
        return null;
    }
}
