package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzevt implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzevt(zzgge zzggeVar, zzfho zzfhoVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzggeVar;
        this.zzb = zzfhoVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzevu zzc(final zzevt zzevtVar) {
        final ArrayList arrayList = zzevtVar.zzb.zzg;
        return arrayList == null ? new zzevu() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
            }
        } : arrayList.isEmpty() ? new zzevu() { // from class: com.google.android.gms.internal.ads.zzevr
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzevu() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                this.zza.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevt.zzc(this.zza);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzd(ArrayList arrayList, Bundle bundle) {
        JSONArray jSONArrayOptJSONArray;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", this.zzb.zzh);
        String str = "landscape";
        if (this.zzb.zzi.zza > 3) {
            bundle.putBoolean("enable_native_media_orientation", true);
            int i = this.zzb.zzi.zzh;
            String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_media_orientation", str2);
            }
        }
        int i2 = this.zzb.zzi.zzc;
        if (i2 == 0) {
            str = "any";
        } else if (i2 == 1) {
            str = "portrait";
        } else if (i2 != 2) {
            str = "unknown";
        }
        if (!"unknown".equals(str)) {
            bundle.putString("native_image_orientation", str);
        }
        bundle.putBoolean("native_multiple_images", this.zzb.zzi.zzd);
        bundle.putBoolean("use_custom_mute", this.zzb.zzi.zzg);
        zzbhk zzbhkVar = this.zzb.zzi;
        if (zzbhkVar.zzi != 0) {
            bundle.putBoolean("sccg_tap", zzbhkVar.zzj);
            bundle.putInt("sccg_dir", this.zzb.zzi.zzi);
        }
        PackageInfo packageInfo = this.zzc;
        int i3 = packageInfo == null ? 0 : packageInfo.versionCode;
        if (i3 > this.zzd.zza()) {
            this.zzd.zzt();
            this.zzd.zzw(i3);
        }
        JSONObject jSONObjectZzq = this.zzd.zzq();
        String string = null;
        if (jSONObjectZzq != null && (jSONArrayOptJSONArray = jSONObjectZzq.optJSONArray(this.zzb.zzf)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i4 = this.zzb.zzk;
        if (i4 > 1) {
            bundle.putInt("max_num_ads", i4);
        }
        zzbnz zzbnzVar = this.zzb.zzb;
        if (zzbnzVar != null) {
            if (TextUtils.isEmpty(zzbnzVar.zzc)) {
                String str3 = "p";
                if (zzbnzVar.zza >= 2) {
                    int i5 = zzbnzVar.zzd;
                    if (i5 == 2 || i5 != 3) {
                        str3 = "l";
                    }
                    bundle.putString("ia_var", str3);
                } else {
                    int i6 = zzbnzVar.zzb;
                    if (i6 != 1) {
                        if (i6 != 2) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzg("Instream ad video aspect ratio " + i6 + " is wrong.");
                            str3 = "l";
                        }
                        bundle.putString("ia_var", str3);
                    }
                }
            } else {
                bundle.putString("ad_tag", zzbnzVar.zzc);
            }
            bundle.putBoolean("instr", true);
        }
        if (this.zzb.zza() != null) {
            bundle.putBoolean("has_delayed_banner_listener", true);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlO)).booleanValue()) {
            if (this.zzb.zzi.zzf != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("startMuted", this.zzb.zzi.zzf.zza);
                bundle2.putBoolean("clickToExpandRequested", this.zzb.zzi.zzf.zzc);
                bundle2.putBoolean("customControlsRequested", this.zzb.zzi.zzf.zzb);
                bundle.putBundle("video", bundle2);
            }
            bundle.putBoolean("disable_image_loading", this.zzb.zzi.zzb);
            bundle.putInt("preferred_ad_choices_position", this.zzb.zzi.zze);
        }
    }
}
