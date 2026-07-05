package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdya implements zzdzb, zzdxl {
    private final zzdyl zza;
    private final zzdzc zzb;
    private final zzdxm zzc;
    private final zzdxv zzd;
    private final zzdxk zze;
    private final zzdyx zzf;
    private final zzdyh zzg;
    private final zzdyh zzh;
    private final String zzi;
    private final Context zzj;

    @Nullable
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdxw zzr = zzdxw.NONE;
    private zzdxz zzv = zzdxz.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    zzdya(zzdyl zzdylVar, zzdzc zzdzcVar, zzdxm zzdxmVar, Context context, VersionInfoParcel versionInfoParcel, zzdxv zzdxvVar, zzdyx zzdyxVar, zzdyh zzdyhVar, zzdyh zzdyhVar2, @Nullable String str) {
        this.zza = zzdylVar;
        this.zzb = zzdzcVar;
        this.zzc = zzdxmVar;
        this.zze = new zzdxk(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzdxvVar;
        this.zzf = zzdyxVar;
        this.zzg = zzdyhVar;
        this.zzh = zzdyhVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzu.zzs().zzg(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdxw) Enum.valueOf(zzdxw.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzl.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdxo zzdxoVar : (List) entry.getValue()) {
                if (zzdxoVar.zzg()) {
                    jSONArray.put(zzdxoVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzu() throws JSONException {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjx))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjx)).split(",")));
        }
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjy))) {
            this.zzh.zzb(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjy)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzn());
        this.zzx = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzo();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzG(zzd());
    }

    private final synchronized void zzw(zzdxw zzdxwVar, boolean z) {
        if (this.zzr != zzdxwVar) {
            if (zzq()) {
                zzy();
            }
            this.zzr = zzdxwVar;
            if (zzq()) {
                zzz();
            }
            if (z) {
                zzv();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:12:0x0026, B:17:0x0035, B:13:0x002a, B:15:0x0030), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzx(boolean z, boolean z2) {
        if (this.zzs != z) {
            this.zzs = z;
            if (z) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue() || !com.google.android.gms.ads.internal.zzu.zzs().zzl()) {
                    zzz();
                }
                if (z2) {
                    zzv();
                    return;
                }
            }
            if (!zzq()) {
                zzy();
            }
            if (z2) {
            }
        }
    }

    private final synchronized void zzy() {
        zzdxw zzdxwVar = zzdxw.NONE;
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        zzdxw zzdxwVar = zzdxw.NONE;
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    public final zzdxw zza() {
        return this.zzr;
    }

    public final synchronized ListenableFuture zzb(String str) {
        zzccn zzccnVar;
        zzccnVar = new zzccn();
        if (this.zzm.containsKey(str)) {
            zzccnVar.zzc((zzdxo) this.zzm.get(str));
        } else {
            if (!this.zzn.containsKey(str)) {
                this.zzn.put(str, new ArrayList());
            }
            ((List) this.zzn.get(str)).add(zzccnVar);
        }
        return zzccnVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzk)) {
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzju)).booleanValue()) {
                String strZzn = com.google.android.gms.ads.internal.zzu.zzo().zzn();
                if (!TextUtils.isEmpty(strZzn)) {
                    jSONObject.put("plugin", strZzn);
                }
            }
            if (this.zzq < com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() / 1000) {
                this.zzo = "{}";
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzt());
            jSONObject.put("appInfo", this.zze.zza());
            String strZzc = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc();
            if (!TextUtils.isEmpty(strZzc)) {
                jSONObject.put("cld", new JSONObject(strZzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjk)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Server data: " + jSONObject2.toString());
                jSONObject.put("serverData", this.zzp);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzu.zzs().zzl());
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.client.zzay.zzb();
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzs());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjw)).booleanValue()) {
                jSONObject.put("uiStorage", new JSONObject(this.zzx));
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjy))) {
                jSONObject.put("gmaDisk", this.zzh.zza());
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjx))) {
                jSONObject.put("userDisk", this.zzg.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdxo zzdxoVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziW)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzdxoVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue()) {
                String strZzc = zzdxoVar.zzc();
                this.zzm.put(strZzc, zzdxoVar);
                if (this.zzn.containsKey(strZzc)) {
                    List list = (List) this.zzn.get(strZzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzccn) it.next()).zzc(zzdxoVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue() && com.google.android.gms.ads.internal.zzu.zzo().zzi().zzR()) {
                zzu();
                return;
            }
            String strZzn = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzn();
            if (TextUtils.isEmpty(strZzn)) {
                return;
            }
            try {
                if (new JSONObject(strZzn).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzdxz zzdxzVar) {
        if (!zzq()) {
            try {
                zzdaVar.zze(zzfiq.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
            this.zzv = zzdxzVar;
            this.zza.zzj(zzdaVar, new zzbmj(this), new zzbmc(this.zzf), new zzblq(this));
            return;
        } else {
            try {
                zzdaVar.zze(zzfiq.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzu.zzo().zzi().zzH(this.zzx);
    }

    public final synchronized void zzk(long j) {
        this.zzw += j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzl(boolean z) throws JSONException {
        if (this.zzu) {
            if (z) {
                if (!this.zzs) {
                }
            }
        } else if (z) {
            zzu();
            if (!this.zzs) {
                zzz();
                return;
            }
        }
        if (zzq()) {
            return;
        }
        zzy();
    }

    public final void zzm(zzdxw zzdxwVar) {
        zzw(zzdxwVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z) throws JSONException {
        if (!this.zzu && z) {
            zzu();
        }
        zzx(z, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzu.zzs().zzl();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjp)).longValue();
    }
}
