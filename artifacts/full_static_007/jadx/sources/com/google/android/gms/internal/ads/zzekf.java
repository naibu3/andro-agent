package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzekf implements zzejz {
    private final zzdkd zza;
    private final zzgge zzb;
    private final zzdoj zzc;
    private final zzfin zzd;
    private final zzdqy zze;

    public zzekf(zzdkd zzdkdVar, zzgge zzggeVar, zzdoj zzdojVar, zzfin zzfinVar, zzdqy zzdqyVar) {
        this.zza = zzdkdVar;
        this.zzb = zzggeVar;
        this.zzc = zzdojVar;
        this.zzd = zzfinVar;
        this.zze = zzdqyVar;
    }

    private final ListenableFuture zzg(final zzfhf zzfhfVar, final zzfgt zzfgtVar, final JSONObject jSONObject) {
        zzdoj zzdojVar = this.zzc;
        final ListenableFuture listenableFutureZza = this.zzd.zza();
        final ListenableFuture listenableFutureZza2 = zzdojVar.zza(zzfhfVar, zzfgtVar, jSONObject);
        return zzgft.zzc(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(listenableFutureZza2, listenableFutureZza, zzfhfVar, zzfgtVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final ListenableFuture zza(final zzfhf zzfhfVar, final zzfgt zzfgtVar) {
        return zzgft.zzn(zzgft.zzn(this.zzd.zza(), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzekc
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zze(zzfgtVar, (zzdqs) obj);
            }
        }, this.zzb), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzekd
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzf(zzfhfVar, zzfgtVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehl
    public final boolean zzb(zzfhf zzfhfVar, zzfgt zzfgtVar) {
        zzfgy zzfgyVar = zzfgtVar.zzt;
        return (zzfgyVar == null || zzfgyVar.zzc == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzdlo zzc(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfhf zzfhfVar, zzfgt zzfgtVar, JSONObject jSONObject) throws Exception {
        zzdlt zzdltVar = (zzdlt) listenableFuture.get();
        zzdqs zzdqsVar = (zzdqs) listenableFuture2.get();
        zzdlu zzdluVarZzd = this.zza.zzd(new zzcvf(zzfhfVar, zzfgtVar, null), new zzdmf(zzdltVar), new zzdks(jSONObject, zzdqsVar));
        zzdluVarZzd.zzh().zzb();
        zzdluVarZzd.zzi().zza(zzdqsVar);
        zzdluVarZzd.zzg().zza(zzdltVar.zzs());
        zzdluVarZzd.zzl().zza(this.zze, zzdltVar.zzq());
        return zzdluVarZzd.zza();
    }

    final /* synthetic */ ListenableFuture zzd(zzdqs zzdqsVar, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzgft.zzh(zzdqsVar));
        if (jSONObject.optBoolean("success")) {
            return zzgft.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbpw("process json failed");
    }

    final /* synthetic */ ListenableFuture zze(zzfgt zzfgtVar, final zzdqs zzdqsVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziH)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfgtVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgft.zzn(zzdqsVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgfa() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzdqsVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzf(zzfhf zzfhfVar, zzfgt zzfgtVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzgft.zzg(new zzdzd(3));
        }
        if (zzfhfVar.zza.zza.zzk <= 1) {
            return zzgft.zzm(zzg(zzfhfVar, zzfgtVar, jSONArray.getJSONObject(0)), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeke
                @Override // com.google.android.gms.internal.ads.zzfxu
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgft.zzh((zzdlo) obj));
                }
            }, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfhfVar.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfhfVar.zza.zza.zzk);
        for (int i = 0; i < zzfhfVar.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfhfVar, zzfgtVar, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzgft.zzg(new zzdzd(3)));
            }
        }
        return zzgft.zzh(arrayList);
    }
}
