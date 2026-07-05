package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcuc implements zzdaz, zzdaf {
    private final Context zza;
    private final zzchd zzb;
    private final zzfgt zzc;
    private final VersionInfoParcel zzd;
    private zzehg zze;
    private boolean zzf;
    private final zzehe zzg;

    public zzcuc(Context context, zzchd zzchdVar, zzfgt zzfgtVar, VersionInfoParcel versionInfoParcel, zzehe zzeheVar) {
        this.zza = context;
        this.zzb = zzchdVar;
        this.zzc = zzfgtVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzeheVar;
    }

    private final synchronized void zza() {
        zzehd zzehdVar;
        zzehc zzehcVar;
        if (this.zzc.zzU && this.zzb != null) {
            if (com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zza)) {
                VersionInfoParcel versionInfoParcel = this.zzd;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfhr zzfhrVar = this.zzc.zzW;
                String strZza = zzfhrVar.zza();
                if (zzfhrVar.zzc() == 1) {
                    zzehcVar = zzehc.VIDEO;
                    zzehdVar = zzehd.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzfgt zzfgtVar = this.zzc;
                    zzehc zzehcVar2 = zzehc.HTML_DISPLAY;
                    zzehdVar = zzfgtVar.zzf == 1 ? zzehd.ONE_PIXEL : zzehd.BEGIN_TO_RENDER;
                    zzehcVar = zzehcVar2;
                }
                zzehg zzehgVarZza = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzb.zzG(), "", "javascript", strZza, zzehdVar, zzehcVar, this.zzc.zzam);
                this.zze = zzehgVarZza;
                Object obj = this.zzb;
                if (zzehgVarZza != null) {
                    zzfoj zzfojVarZza = zzehgVarZza.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfb)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzfojVarZza, this.zzb.zzG());
                        Iterator it = this.zzb.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzu.zzA().zzg(zzfojVarZza, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzu.zzA().zzj(zzfojVarZza, (View) obj);
                    }
                    this.zzb.zzat(this.zze);
                    com.google.android.gms.ads.internal.zzu.zzA().zzk(zzfojVarZza);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfc)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final synchronized void zzr() {
        zzchd zzchdVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzchdVar = this.zzb) == null) {
            return;
        }
        zzchdVar.zzd("onSdkImpression", new ArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
