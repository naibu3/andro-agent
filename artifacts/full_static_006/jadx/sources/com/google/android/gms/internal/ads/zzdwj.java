package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdwj extends zzbmq {
    private final zzdwm zza;
    private final zzdwh zzb;
    private final Map zzc = new HashMap();

    zzdwj(zzdwm zzdwmVar, zzdwh zzdwhVar) {
        this.zza = zzdwmVar;
        this.zzb = zzdwhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.gms.ads.internal.client.zzl zzc(Map map) throws IOException {
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zzmVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzmVar.zzb(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzmVar.zze(arrayList);
                        break;
                    case "isTestDevice":
                        zzmVar.zzd(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zzmVar.zzh(0);
                            break;
                        } else {
                            zzmVar.zzh(1);
                            break;
                        }
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zzmVar.zzi(0);
                            break;
                        } else {
                            zzmVar.zzi(1);
                            break;
                        }
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(strNextString)) {
                            break;
                        } else {
                            zzmVar.zzf(strNextString);
                            break;
                        }
                    case "httpTimeoutMillis":
                        zzmVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzl zzlVarZza = zzmVar.zza();
        Bundle bundle2 = zzlVarZza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzlVarZza.zzc;
            zzlVarZza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new com.google.android.gms.ads.internal.client.zzl(zzlVarZza.zza, zzlVarZza.zzb, bundle2, zzlVarZza.zzd, zzlVarZza.zze, zzlVarZza.zzf, zzlVarZza.zzg, zzlVarZza.zzh, zzlVarZza.zzi, zzlVarZza.zzj, zzlVarZza.zzk, zzlVarZza.zzl, zzlVarZza.zzm, zzlVarZza.zzn, zzlVarZza.zzo, zzlVarZza.zzp, zzlVarZza.zzq, zzlVarZza.zzr, zzlVarZza.zzs, zzlVarZza.zzt, zzlVarZza.zzu, zzlVarZza.zzv, zzlVarZza.zzw, zzlVarZza.zzx, zzlVarZza.zzy, zzlVarZza.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    @Override // com.google.android.gms.internal.ads.zzbmr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(String str) throws NumberFormatException, RemoteException {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjU)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzu.zzp();
            Map mapZzP = com.google.android.gms.ads.internal.util.zzt.zzP(uri);
            String str2 = (String) mapZzP.get("action");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            char c = 0;
            if (iHashCode != 579053441) {
                z = (iHashCode == 871091088 && str2.equals("initialize")) ? false : -1;
            } else if (str2.equals("dispose_all")) {
                z = true;
            }
            if (!z) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (z) {
                Iterator it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    ((zzdwc) it.next()).zza();
                }
                this.zzc.clear();
                return;
            }
            String str3 = (String) mapZzP.get("obj_id");
            try {
                long j = Long.parseLong((String) Objects.requireNonNull(str3));
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (!str2.equals("show_interstitial_ad")) {
                            c = 65535;
                            break;
                        } else {
                            c = 2;
                            break;
                        }
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 393881811:
                        if (!str2.equals("create_interstitial_ad")) {
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (this.zzc.size() < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjV)).intValue()) {
                            Map map = this.zzc;
                            Long lValueOf = Long.valueOf(j);
                            if (!map.containsKey(lValueOf)) {
                                String str4 = (String) mapZzP.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdwd zzdwdVarZzb = this.zza.zzb();
                                    zzdwdVarZzb.zzb(j);
                                    zzdwdVarZzb.zza(str4);
                                    this.zzc.put(lValueOf, zzdwdVarZzb.zzc().zza());
                                    this.zzb.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + j + " with ad unit " + str4);
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                            break;
                        }
                    case 1:
                        zzdwc zzdwcVar = (zzdwc) this.zzc.get(Long.valueOf(j));
                        if (zzdwcVar != null) {
                            zzdwcVar.zzb(zzc(mapZzP));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                            break;
                        }
                    case 2:
                        zzdwc zzdwcVar2 = (zzdwc) this.zzc.get(Long.valueOf(j));
                        if (zzdwcVar2 != null) {
                            zzdwcVar2.zzc();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                            break;
                        }
                    case 3:
                        if (this.zzc.size() < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjV)).intValue()) {
                            Map map2 = this.zzc;
                            Long lValueOf2 = Long.valueOf(j);
                            if (!map2.containsKey(lValueOf2)) {
                                String str5 = (String) mapZzP.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdwd zzdwdVarZzb2 = this.zza.zzb();
                                    zzdwdVarZzb2.zzb(j);
                                    zzdwdVarZzb2.zza(str5);
                                    this.zzc.put(lValueOf2, zzdwdVarZzb2.zzc().zzb());
                                    this.zzb.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + j + " with ad unit " + str5);
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                            break;
                        }
                    case 4:
                        zzdwc zzdwcVar3 = (zzdwc) this.zzc.get(Long.valueOf(j));
                        if (zzdwcVar3 != null) {
                            zzdwcVar3.zzb(zzc(mapZzP));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                            break;
                        }
                    case 5:
                        zzdwc zzdwcVar4 = (zzdwc) this.zzc.get(Long.valueOf(j));
                        if (zzdwcVar4 != null) {
                            zzdwcVar4.zzc();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                            break;
                        }
                    case 6:
                        Map map3 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j);
                        zzdwc zzdwcVar5 = (zzdwc) map3.get(lValueOf3);
                        if (zzdwcVar5 != null) {
                            zzdwcVar5.zza();
                            this.zzc.remove(lValueOf3);
                            com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + j);
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Could not dispose H5 ad, object ID does not exist");
                            break;
                        }
                    default:
                        com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg contained invalid action: ".concat(String.valueOf(str2)));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
