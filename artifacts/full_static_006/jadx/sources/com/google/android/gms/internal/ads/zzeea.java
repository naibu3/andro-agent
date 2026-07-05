package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeea extends zzbxg {
    private final Context zza;
    private final zzezl zzb;
    private final zzezj zzc;
    private final zzeei zzd;
    private final zzgge zze;
    private final zzeef zzf;
    private final zzbyd zzg;

    zzeea(Context context, zzezl zzezlVar, zzezj zzezjVar, zzeef zzeefVar, zzeei zzeeiVar, zzgge zzggeVar, zzbyd zzbydVar) {
        this.zza = context;
        this.zzb = zzezlVar;
        this.zzc = zzezjVar;
        this.zzf = zzeefVar;
        this.zzd = zzeeiVar;
        this.zze = zzggeVar;
        this.zzg = zzbydVar;
    }

    private final void zzc(ListenableFuture listenableFuture, zzbxk zzbxkVar) {
        zzgft.zzr(zzgft.zzn(zzgfk.zzu(listenableFuture), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(zzfip.zza((InputStream) obj));
            }
        }, zzcci.zza), new zzedz(this, zzbxkVar), zzcci.zzf);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zzb(zzbwz zzbwzVar, int i) {
        ListenableFuture listenableFutureZzh;
        HashMap map = new HashMap();
        Bundle bundle = zzbwzVar.zzc;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        final zzeec zzeecVar = new zzeec(zzbwzVar.zza, zzbwzVar.zzb, map, zzbwzVar.zzd, "", zzbwzVar.zze);
        zzezj zzezjVar = this.zzc;
        zzezjVar.zza(new zzfar(zzbwzVar));
        boolean z = zzeecVar.zzf;
        zzezk zzezkVarZzb = zzezjVar.zzb();
        if (z) {
            String str2 = zzbwzVar.zza;
            String str3 = (String) zzbgr.zzb.zze();
            if (TextUtils.isEmpty(str3)) {
                listenableFutureZzh = zzgft.zzh(zzeecVar);
            } else {
                String host = Uri.parse(str2).getHost();
                if (!TextUtils.isEmpty(host)) {
                    Iterator it = zzfyt.zzc(zzfxr.zzc(';')).zzd(str3).iterator();
                    while (it.hasNext()) {
                        if (host.endsWith((String) it.next())) {
                            listenableFutureZzh = zzgft.zzm(zzezkVarZzb.zza().zza(new JSONObject(), new Bundle()), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeds
                                @Override // com.google.android.gms.internal.ads.zzfxu
                                public final Object apply(Object obj) {
                                    zzeec zzeecVar2 = zzeecVar;
                                    zzeei.zza(zzeecVar2.zzc, (JSONObject) obj);
                                    return zzeecVar2;
                                }
                            }, this.zze);
                            break;
                        }
                    }
                    listenableFutureZzh = zzgft.zzh(zzeecVar);
                }
            }
        }
        zzflt zzfltVarZzb = zzezkVarZzb.zzb();
        return zzgft.zzn(zzfltVarZzb.zzb(zzfln.HTTP, listenableFutureZzh).zze(new zzeee(this.zza, "", this.zzg, i)).zza(), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedt
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) throws JSONException {
                zzeed zzeedVar = (zzeed) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", zzeedVar.zza);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str4 : zzeedVar.zzb.keySet()) {
                        if (str4 != null) {
                            List<String> list = (List) zzeedVar.zzb.get(str4);
                            JSONArray jSONArray = new JSONArray();
                            for (String str5 : list) {
                                if (str5 != null) {
                                    jSONArray.put(str5);
                                }
                            }
                            jSONObject2.put(str4, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = zzeedVar.zzc;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", zzeedVar.zzd);
                    return zzgft.zzh(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(String.valueOf(e.getCause()))));
                }
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(zzbwz zzbwzVar, zzbxk zzbxkVar) {
        zzc(zzb(zzbwzVar, Binder.getCallingUid()), zzbxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(zzbwv zzbwvVar, zzbxk zzbxkVar) {
        zzeza zzezaVar = new zzeza(zzbwvVar, Binder.getCallingUid());
        zzezl zzezlVar = this.zzb;
        zzezlVar.zza(zzezaVar);
        final zzezm zzezmVarZzb = zzezlVar.zzb();
        zzflt zzfltVarZzb = zzezmVarZzb.zzb();
        zzfky zzfkyVarZza = zzfltVarZzb.zzb(zzfln.GMS_SIGNALS, zzgft.zzi()).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzezmVarZzb.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzedv
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgfa() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return zzgft.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zzfkyVarZza, zzbxkVar);
        if (((Boolean) zzbgk.zzf.zze()).booleanValue()) {
            final zzeei zzeeiVar = this.zzd;
            Objects.requireNonNull(zzeeiVar);
            zzfkyVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedy
                @Override // java.lang.Runnable
                public final void run() {
                    zzeeiVar.zzb();
                }
            }, this.zze);
        }
    }
}
