package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbdv;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdjq implements zzdaz, com.google.android.gms.ads.internal.overlay.zzp, zzdaf {
    zzehg zza;
    private final Context zzb;
    private final zzchd zzc;
    private final zzfgt zzd;
    private final VersionInfoParcel zze;
    private final zzbdv.zza.EnumC0014zza zzf;
    private final zzehe zzg;

    public zzdjq(Context context, zzchd zzchdVar, zzfgt zzfgtVar, VersionInfoParcel versionInfoParcel, zzbdv.zza.EnumC0014zza enumC0014zza, zzehe zzeheVar) {
        this.zzb = context;
        this.zzc = zzchdVar;
        this.zzd = zzfgtVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0014zza;
        this.zzg = zzeheVar;
    }

    private final boolean zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfh)).booleanValue() || this.zzc == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new ArrayMap());
            } else {
                this.zzg.zzb();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
            return;
        }
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfh)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        zzehd zzehdVar;
        zzehc zzehcVar;
        zzbdv.zza.EnumC0014zza enumC0014zza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfk)).booleanValue() || this.zzf == zzbdv.zza.EnumC0014zza.REWARD_BASED_VIDEO_AD || (enumC0014zza = this.zzf) == zzbdv.zza.EnumC0014zza.INTERSTITIAL || enumC0014zza == zzbdv.zza.EnumC0014zza.APP_OPEN) && this.zzd.zzU && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zzb)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                VersionInfoParcel versionInfoParcel = this.zze;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfhr zzfhrVar = this.zzd.zzW;
                String strZza = zzfhrVar.zza();
                if (zzfhrVar.zzc() == 1) {
                    zzehcVar = zzehc.VIDEO;
                    zzehdVar = zzehd.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzehdVar = this.zzd.zzZ == 2 ? zzehd.UNSPECIFIED : zzehd.BEGIN_TO_RENDER;
                    zzehcVar = zzehc.HTML_DISPLAY;
                }
                zzehg zzehgVarZza = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzc.zzG(), "", "javascript", strZza, zzehdVar, zzehcVar, this.zzd.zzam);
                this.zza = zzehgVarZza;
                Object obj = this.zzc;
                if (zzehgVarZza != null) {
                    zzfoj zzfojVarZza = zzehgVarZza.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfb)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzfojVarZza, this.zzc.zzG());
                        Iterator it = this.zzc.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzu.zzA().zzg(zzfojVarZza, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzfojVarZza, (View) obj);
                    }
                    this.zzc.zzat(this.zza);
                    com.google.android.gms.ads.internal.zzu.zzA().zzk(zzfojVarZza);
                    this.zzc.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }
}
