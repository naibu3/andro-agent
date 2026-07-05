package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzblo {
    public static final zzblp zza = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbkm
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            zzcik zzcikVar = (zzcik) obj;
            zzblp zzblpVar = zzblo.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcikVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbok) zzcikVar).zzd("openableURLs", map2);
        }
    };
    public static final zzblp zzb = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbko
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            zzcik zzcikVar = (zzcik) obj;
            zzblp zzblpVar = zzblo.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzio)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcikVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbok) zzcikVar).zzd("openableApp", map2);
        }
    };
    public static final zzblp zzc = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbkr
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) throws JSONException, URISyntaxException {
            zzblo.zzb((zzcik) obj, map);
        }
    };
    public static final zzblp zzd = new zzblg();
    public static final zzblp zze = new zzblh();
    public static final zzblp zzf = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbks
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) {
            zzcik zzcikVar = (zzcik) obj;
            zzblp zzblpVar = zzblo.zza;
            String str = (String) map.get("u");
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzca(zzcikVar.getContext(), ((zzcir) zzcikVar).zzn().afmaVersion, str).zzb();
            }
        }
    };
    public static final zzblp zzg = new zzbli();
    public static final zzblp zzh = new zzblj();
    public static final zzblp zzi = new zzblp() { // from class: com.google.android.gms.internal.ads.zzbkq
        @Override // com.google.android.gms.internal.ads.zzblp
        public final void zza(Object obj, Map map) throws NumberFormatException {
            zzciq zzciqVar = (zzciq) obj;
            zzblp zzblpVar = zzblo.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                zzaxd zzaxdVarZzI = zzciqVar.zzI();
                if (zzaxdVarZzI != null) {
                    zzaxdVarZzI.zzc().zzl(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzblp zzj = new zzblk();
    public static final zzblp zzk = new zzbll();
    public static final zzblp zzl = new zzcfd();
    public static final zzblp zzm = new zzcfe();
    public static final zzblp zzn = new zzbki();
    public static final zzbmf zzo = new zzbmf();
    public static final zzblp zzp = new zzblm();
    public static final zzblp zzq = new zzbln();
    public static final zzblp zzr = new zzbkt();
    public static final zzblp zzs = new zzbku();
    public static final zzblp zzt = new zzbkv();
    public static final zzblp zzu = new zzbkw();
    public static final zzblp zzv = new zzbkx();
    public static final zzblp zzw = new zzbky();
    public static final zzblp zzx = new zzbkz();
    public static final zzblp zzy = new zzbla();
    public static final zzblp zzz = new zzblb();
    public static final zzblp zzA = new zzblc();
    public static final zzblp zzB = new zzble();
    public static final zzblp zzC = new zzblf();

    public static ListenableFuture zza(zzchd zzchdVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzaxd zzaxdVarZzI = zzchdVar.zzI();
            zzfhs zzfhsVarZzS = zzchdVar.zzS();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() || zzfhsVarZzS == null) {
                if (zzaxdVarZzI != null && zzaxdVarZzI.zzf(uriZza)) {
                    uriZza = zzaxdVarZzI.zza(uriZza, zzchdVar.getContext(), zzchdVar.zzF(), zzchdVar.zzi());
                }
            } else if (zzaxdVarZzI != null && zzaxdVarZzI.zzf(uriZza)) {
                uriZza = zzfhsVarZzS.zza(uriZza, zzchdVar.getContext(), zzchdVar.zzF(), zzchdVar.zzi());
            }
        } catch (zzaxe unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map map = new HashMap();
        if (zzchdVar.zzD() != null) {
            map = zzchdVar.zzD().zzax;
        }
        final String strZzb = zzcaw.zzb(uriZza, zzchdVar.getContext(), map);
        long jLongValue = ((Long) zzbgj.zze.zze()).longValue();
        return (jLongValue <= 0 || jLongValue > 241806202) ? zzgft.zzh(strZzb) : zzgft.zze(zzgft.zzm(zzgft.zze(zzgfk.zzu(zzchdVar.zzT()), Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbkj
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzblp zzblpVar = zzblo.zza;
                if (!((Boolean) zzbgj.zzk.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        }, zzcci.zzf), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbkk
            /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
            @Override // com.google.android.gms.internal.ads.zzfxu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                String str2;
                String str3;
                String str4 = (String) obj;
                zzblp zzblpVar = zzblo.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbgj.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                str2 = (String) zzbgj.zza.zze();
                                str3 = (String) zzbgj.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                }
                            }
                        }
                    } else {
                        str2 = (String) zzbgj.zza.zze();
                        str3 = (String) zzbgj.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            Uri uri = Uri.parse(strReplace);
                            if (TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzcci.zzf), Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbkl
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzblp zzblpVar = zzblo.zza;
                if (((Boolean) zzbgj.zzk.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzcci.zzf);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zzb(zzcik zzcikVar, Map map) throws JSONException, URISyntaxException {
        Intent uri;
        Intent intent;
        PackageManager packageManager = zzcikVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                            if (uri == null) {
                            }
                            intent = uri;
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e);
                            }
                            if (uri == null) {
                                uri = new Intent();
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    uri.setData(Uri.parse(strOptString2));
                                }
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    uri.setAction(strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    uri.setType(strOptString4);
                                }
                                if (!TextUtils.isEmpty(strOptString5)) {
                                    uri.setPackage(strOptString5);
                                }
                                if (!TextUtils.isEmpty(strOptString6)) {
                                    String[] strArrSplit = strOptString6.split("/", 2);
                                    if (strArrSplit.length == 2) {
                                        uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                    }
                                }
                            }
                            intent = uri;
                            try {
                                resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                            } catch (NullPointerException e2) {
                                com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, intent.toString());
                            }
                            try {
                                jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                            } catch (JSONException e3) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error constructing openable urls response.", e3);
                            }
                        }
                    } catch (JSONException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the intent data.", e4);
                    }
                }
                ((zzbok) zzcikVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbok) zzcikVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbok) zzcikVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzdhi zzdhiVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkL)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdhiVar != null) {
            zzdhiVar.zzdG();
        }
    }
}
