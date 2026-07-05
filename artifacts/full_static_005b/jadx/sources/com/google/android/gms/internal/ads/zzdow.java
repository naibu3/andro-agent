package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdow {
    private final Context zza;
    private final zzdof zzb;
    private final zzaxd zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbdm zzf;
    private final Executor zzg;
    private final zzbhk zzh;
    private final zzdpo zzi;
    private final zzdsd zzj;
    private final ScheduledExecutorService zzk;
    private final zzdqy zzl;
    private final zzdvc zzm;
    private final zzfoe zzn;
    private final zzefz zzo;
    private final zzegk zzp;
    private final zzfhs zzq;

    public zzdow(Context context, zzdof zzdofVar, zzaxd zzaxdVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbdm zzbdmVar, Executor executor, zzfho zzfhoVar, zzdpo zzdpoVar, zzdsd zzdsdVar, ScheduledExecutorService scheduledExecutorService, zzdvc zzdvcVar, zzfoe zzfoeVar, zzefz zzefzVar, zzdqy zzdqyVar, zzegk zzegkVar, zzfhs zzfhsVar) {
        this.zza = context;
        this.zzb = zzdofVar;
        this.zzc = zzaxdVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbdmVar;
        this.zzg = executor;
        this.zzh = zzfhoVar.zzi;
        this.zzi = zzdpoVar;
        this.zzj = zzdsdVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdvcVar;
        this.zzn = zzfoeVar;
        this.zzo = zzefzVar;
        this.zzl = zzdqyVar;
        this.zzp = zzegkVar;
        this.zzq = zzfhsVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzel zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzgbc.zzm();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgbc.zzm();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzel zzelVarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzelVarZzr != null) {
                arrayList.add(zzelVarZzr);
            }
        }
        return zzgbc.zzk(arrayList);
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        final Object obj2 = null;
        return zzgft.zzf(listenableFuture, Exception.class, new zzgfa(obj2) { // from class: com.google.android.gms.internal.ads.zzdou
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgft.zzh(null);
            }
        }, zzcci.zzf);
    }

    private static ListenableFuture zzm(boolean z, final ListenableFuture listenableFuture, Object obj) {
        return z ? zzgft.zzn(listenableFuture, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdov
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj2) {
                return obj2 != null ? listenableFuture : zzgft.zzg(new zzelj(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcci.zzf) : zzl(listenableFuture, null);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzgft.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgft.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgft.zzh(new zzbhi(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgft.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return new zzbhi(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final ListenableFuture zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgft.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzgft.zzm(zzgft.zzd(arrayList), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdor
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbhi zzbhiVar : (List) obj) {
                    if (zzbhiVar != null) {
                        arrayList2.add(zzbhiVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfgt zzfgtVar, zzfgw zzfgwVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfgtVar, zzfgwVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgft.zzn(listenableFutureZzb, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) throws zzelj {
                zzchd zzchdVar = (zzchd) obj;
                if (zzchdVar == null || zzchdVar.zzq() == null) {
                    throw new zzelj(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, zzcci.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzel zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzel(strOptString, strOptString2);
    }

    final /* synthetic */ zzbhf zza(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbhf(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ ListenableFuture zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfgt zzfgtVar, zzfgw zzfgwVar, String str, String str2, Object obj) throws Exception {
        zzchd zzchdVarZza = this.zzj.zza(zzqVar, zzfgtVar, zzfgwVar);
        final zzccm zzccmVarZza = zzccm.zza(zzchdVarZza);
        zzdqv zzdqvVarZzb = this.zzl.zzb();
        zzchdVarZza.zzN().zzR(zzdqvVarZzb, zzdqvVarZzb, zzdqvVarZzb, zzdqvVarZzb, zzdqvVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzdqvVarZzb, null, null, null, null);
        zzchdVarZza.zzag("/getNativeAdViewSignals", zzblo.zzs);
        zzchdVarZza.zzag("/getNativeClickMeta", zzblo.zzt);
        zzchdVarZza.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z, int i, String str3, String str4) {
                zzccm zzccmVar = zzccmVarZza;
                if (z) {
                    zzccmVar.zzb();
                    return;
                }
                zzccmVar.zzd(new zzelj(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzchdVarZza.zzae(str, str2, null);
        return zzccmVarZza;
    }

    final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzu.zzz();
        zzchd zzchdVarZza = zzchq.zza(this.zza, zzcix.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzccm zzccmVarZza = zzccm.zza(zzchdVarZza);
        zzchdVarZza.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzdos
            @Override // com.google.android.gms.internal.ads.zzcit
            public final void zza(boolean z, int i, String str2, String str3) {
                zzccmVarZza.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzff)).booleanValue()) {
            zzchdVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zzchdVarZza.loadData(str, "text/html", "UTF-8");
        }
        return zzccmVarZza;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgft.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzgft.zzm(zzo(jSONArrayOptJSONArray, false, true), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdot
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        zzbhk zzbhkVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbhkVar.zzb, zzbhkVar.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, final zzfgt zzfgtVar, final zzfgw zzfgwVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjZ)).booleanValue()) {
            return zzgft.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgft.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgft.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzq zzqVarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgft.zzh(null);
        }
        final ListenableFuture listenableFutureZzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzqVarZzk, zzfgtVar, zzfgwVar, strOptString, strOptString2, obj);
            }
        }, zzcci.zze);
        return zzgft.zzn(listenableFutureZzn, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) throws zzelj {
                if (((zzchd) obj) != null) {
                    return listenableFutureZzn;
                }
                throw new zzelj(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcci.zzf);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzfgt zzfgtVar, zzfgw zzfgwVar) {
        ListenableFuture listenableFutureZza;
        boolean z = false;
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbw.zzh(jSONObject, "html_containers", "instream");
        if (jSONObjectZzh != null) {
            return zzp(jSONObjectZzh, zzfgtVar, zzfgwVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgft.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjY)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                listenableFutureZza = this.zzi.zza(jSONObjectOptJSONObject);
            }
            return zzl(zzgft.zzo(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdN)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Required field 'vast_xml' or 'html' is missing");
            return zzgft.zzh(null);
        }
        listenableFutureZza = zzp(jSONObjectOptJSONObject, zzfgtVar, zzfgwVar);
        return zzl(zzgft.zzo(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdN)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i, i2));
    }
}
