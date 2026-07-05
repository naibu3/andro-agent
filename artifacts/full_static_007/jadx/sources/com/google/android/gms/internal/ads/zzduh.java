package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzduh implements zzded, com.google.android.gms.ads.internal.client.zza, zzdaf, zzczp {
    private final Context zza;
    private final zzfig zzb;
    private final zzdvc zzc;
    private final zzfhf zzd;
    private final zzfgt zze;
    private final zzefz zzf;
    private final String zzg;
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzha)).booleanValue();

    public zzduh(Context context, zzfig zzfigVar, zzdvc zzdvcVar, zzfhf zzfhfVar, zzfgt zzfgtVar, zzefz zzefzVar, String str) {
        this.zza = context;
        this.zzb = zzfigVar;
        this.zzc = zzdvcVar;
        this.zzd = zzfhfVar;
        this.zze = zzfgtVar;
        this.zzf = zzefzVar;
        this.zzg = str;
    }

    private final zzdvb zzd(String str) {
        zzdvb zzdvbVarZza = this.zzc.zza();
        zzdvbVarZza.zzd(this.zzd.zzb.zzb);
        zzdvbVarZza.zzc(this.zze);
        zzdvbVarZza.zzb("action", str);
        zzdvbVarZza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzu.isEmpty()) {
            zzdvbVarZza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zzdvbVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdvbVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            zzdvbVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhj)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzf(this.zzd.zza.zza) != 1;
            zzdvbVarZza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zzdvbVarZza.zzb("ragent", zzlVar.zzp);
                zzdvbVarZza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzp.zzc(zzlVar)));
            }
        }
        return zzdvbVarZza;
    }

    private final void zze(zzdvb zzdvbVar) {
        if (!this.zze.zzaj) {
            zzdvbVar.zzf();
            return;
        }
        this.zzf.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdvbVar.zze(), 2));
    }

    private final boolean zzf() {
        String strZzp;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbu);
                    com.google.android.gms.ads.internal.zzu.zzp();
                    try {
                        strZzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
                    } catch (RemoteException unused) {
                        strZzp = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzp != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzp);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zze(zzd("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            zzdvb zzdvbVarZzd = zzd("ifts");
            zzdvbVarZzd.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdvbVarZzd.zzb("arec", String.valueOf(i));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdvbVarZzd.zzb("areec", strZza);
            }
            zzdvbVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzb() {
        if (this.zzi) {
            zzdvb zzdvbVarZzd = zzd("ifts");
            zzdvbVarZzd.zzb("reason", "blocked");
            zzdvbVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczp
    public final void zzc(zzdjo zzdjoVar) {
        if (this.zzi) {
            zzdvb zzdvbVarZzd = zzd("ifts");
            zzdvbVarZzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdjoVar.getMessage())) {
                zzdvbVarZzd.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdjoVar.getMessage());
            }
            zzdvbVarZzd.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaf
    public final void zzr() {
        if (zzf() || this.zze.zzaj) {
            zze(zzd("impression"));
        }
    }
}
