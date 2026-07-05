package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdoj {
    private final zzgge zza;
    private final zzdow zzb;
    private final zzdpb zzc;

    public zzdoj(zzgge zzggeVar, zzdow zzdowVar, zzdpb zzdpbVar) {
        this.zza = zzggeVar;
        this.zzb = zzdowVar;
        this.zzc = zzdpbVar;
    }

    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        ListenableFuture listenableFutureZzn;
        final ListenableFuture listenableFutureZzb = this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdoh
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzelj {
                zzdlt zzdltVar = new zzdlt();
                JSONObject jSONObject2 = jSONObject;
                zzdltVar.zzaa(jSONObject2.optInt("template_id", -1));
                zzdltVar.zzK(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null;
                zzfhf zzfhfVar2 = zzfhfVar;
                zzdltVar.zzV(strOptString);
                zzfho zzfhoVar = zzfhfVar2.zza.zza;
                if (!zzfhoVar.zzg.contains(Integer.toString(zzdltVar.zzc()))) {
                    throw new zzelj(1, "Invalid template ID: " + zzdltVar.zzc());
                }
                if (zzdltVar.zzc() == 3) {
                    if (zzdltVar.zzA() == null) {
                        throw new zzelj(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfhoVar.zzh.contains(zzdltVar.zzA())) {
                        throw new zzelj(1, "Unexpected custom template id in the response.");
                    }
                }
                zzfgt zzfgtVar2 = zzfgtVar;
                zzdltVar.zzY(jSONObject2.optDouble("rating", -1.0d));
                String strOptString2 = jSONObject2.optString("headline", null);
                if (zzfgtVar2.zzN) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    strOptString2 = com.google.android.gms.ads.internal.util.zzt.zzy() + " : " + strOptString2;
                }
                zzdltVar.zzZ("headline", strOptString2);
                zzdltVar.zzZ("body", jSONObject2.optString("body", null));
                zzdltVar.zzZ("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdltVar.zzZ("store", jSONObject2.optString("store", null));
                zzdltVar.zzZ("price", jSONObject2.optString("price", null));
                zzdltVar.zzZ("advertiser", jSONObject2.optString("advertiser", null));
                return zzdltVar;
            }
        });
        final ListenableFuture listenableFutureZzf = this.zzb.zzf(jSONObject, "images");
        zzfgw zzfgwVar = zzfhfVar.zzb.zzb;
        zzdow zzdowVar = this.zzb;
        final ListenableFuture listenableFutureZzg = zzdowVar.zzg(jSONObject, "images", zzfgtVar, zzfgwVar);
        final ListenableFuture listenableFutureZze = zzdowVar.zze(jSONObject, "secondary_image");
        final ListenableFuture listenableFutureZze2 = zzdowVar.zze(jSONObject, "app_icon");
        final ListenableFuture listenableFutureZzd = zzdowVar.zzd(jSONObject, "attribution");
        final ListenableFuture listenableFutureZzh = this.zzb.zzh(jSONObject, zzfgtVar, zzfhfVar.zzb.zzb);
        final ListenableFuture listenableFutureZza = this.zzc.zza(jSONObject, "custom_assets");
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            if (TextUtils.isEmpty(strOptString)) {
                listenableFutureZzn = zzgft.zzh(null);
            } else {
                final zzdow zzdowVar2 = this.zzb;
                listenableFutureZzn = zzgft.zzn(zzgft.zzh(null), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdol
                    @Override // com.google.android.gms.internal.ads.zzgfa
                    public final ListenableFuture zza(Object obj) {
                        return zzdowVar2.zzc(strOptString, obj);
                    }
                }, zzcci.zze);
            }
        } else {
            listenableFutureZzn = zzgft.zzh(null);
        }
        final ListenableFuture listenableFuture = listenableFutureZzn;
        ArrayList arrayList = new ArrayList();
        arrayList.add(listenableFutureZzb);
        arrayList.add(listenableFutureZzf);
        arrayList.add(listenableFutureZzg);
        arrayList.add(listenableFutureZze);
        arrayList.add(listenableFutureZze2);
        arrayList.add(listenableFutureZzd);
        arrayList.add(listenableFutureZzh);
        arrayList.add(listenableFutureZza);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
            arrayList.add(listenableFuture);
        }
        return zzgft.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdoi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdlt zzdltVar = (zzdlt) listenableFutureZzb.get();
                zzdltVar.zzP((List) listenableFutureZzf.get());
                zzdltVar.zzM((zzbhv) listenableFutureZze2.get());
                zzdltVar.zzQ((zzbhv) listenableFutureZze.get());
                zzdltVar.zzJ((zzbho) listenableFutureZzd.get());
                JSONObject jSONObject2 = jSONObject;
                zzdltVar.zzS(zzdow.zzj(jSONObject2));
                zzdltVar.zzL(zzdow.zzi(jSONObject2));
                zzchd zzchdVar = (zzchd) listenableFutureZzh.get();
                if (zzchdVar != null) {
                    zzdltVar.zzad(zzchdVar);
                    zzdltVar.zzac(zzchdVar.zzF());
                    zzdltVar.zzab(zzchdVar.zzq());
                }
                zzchd zzchdVar2 = (zzchd) listenableFutureZzg.get();
                if (zzchdVar2 != null) {
                    zzdltVar.zzO(zzchdVar2);
                    zzdltVar.zzae(zzchdVar2.zzF());
                }
                ListenableFuture listenableFuture2 = listenableFuture;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfi)).booleanValue()) {
                    zzdltVar.zzU(listenableFuture2);
                    zzdltVar.zzX(new zzccn());
                } else {
                    zzchd zzchdVar3 = (zzchd) listenableFuture2.get();
                    if (zzchdVar3 != null) {
                        zzdltVar.zzT(zzchdVar3);
                    }
                }
                for (zzdpa zzdpaVar : (List) listenableFutureZza.get()) {
                    if (zzdpaVar.zza != 1) {
                        zzdltVar.zzN(zzdpaVar.zzb, zzdpaVar.zzd);
                    } else {
                        zzdltVar.zzZ(zzdpaVar.zzb, zzdpaVar.zzc);
                    }
                }
                return zzdltVar;
            }
        }, this.zza);
    }
}
