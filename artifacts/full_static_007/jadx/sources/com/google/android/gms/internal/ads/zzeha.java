package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeha implements zzehb {
    static /* synthetic */ zzehg zzc(String str, String str2, String str3, zzehc zzehcVar, String str4, WebView webView, String str5, String str6, zzehd zzehdVar) {
        zzfow zzfowVarZza = zzfow.zza("Google", str2);
        zzfov zzfovVarZzp = zzp("javascript");
        zzfoo zzfooVarZzn = zzn(zzehcVar.toString());
        if (zzfovVarZzp == zzfov.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfooVarZzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzehcVar))));
            return null;
        }
        zzfov zzfovVarZzp2 = zzp(str4);
        if (zzfooVarZzn == zzfoo.VIDEO && zzfovVarZzp2 == zzfov.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfol zzfolVarZzb = zzfol.zzb(zzfowVarZza, webView, str5, "");
        return new zzehg(zzfoj.zza(zzfok.zza(zzfooVarZzn, zzo(zzehdVar.toString()), zzfovVarZzp, zzfovVarZzp2, true), zzfolVarZzb), zzfolVarZzb);
    }

    static /* synthetic */ zzehg zzd(String str, String str2, String str3, String str4, zzehc zzehcVar, WebView webView, String str5, String str6, zzehd zzehdVar) {
        zzfow zzfowVarZza = zzfow.zza(str, str2);
        zzfov zzfovVarZzp = zzp("javascript");
        zzfov zzfovVarZzp2 = zzp(str4);
        zzfoo zzfooVarZzn = zzn(zzehcVar.toString());
        if (zzfovVarZzp == zzfov.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfooVarZzn == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzehcVar))));
            return null;
        }
        if (zzfooVarZzn == zzfoo.VIDEO && zzfovVarZzp2 == zzfov.NONE) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfol zzfolVarZzc = zzfol.zzc(zzfowVarZza, webView, str5, "");
        return new zzehg(zzfoj.zza(zzfok.zza(zzfooVarZzn, zzo(zzehdVar.toString()), zzfovVarZzp, zzfovVarZzp2, true), zzfolVarZzc), zzfolVarZzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzfoo zzn(String str) {
        char c;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                c = (iHashCode == 714893483 && str.equals("nativeDisplay")) ? (char) 1 : (char) 65535;
            } else if (str.equals("video")) {
                c = 2;
            }
        } else if (str.equals("htmlDisplay")) {
            c = 0;
        }
        if (c == 0) {
            return zzfoo.HTML_DISPLAY;
        }
        if (c == 1) {
            return zzfoo.NATIVE_DISPLAY;
        }
        if (c != 2) {
            return null;
        }
        return zzfoo.VIDEO;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzfor zzo(String str) {
        char c;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                c = (iHashCode == 1988248512 && str.equals("onePixel")) ? (char) 2 : (char) 65535;
            } else if (str.equals("definedByJavascript")) {
                c = 1;
            }
        } else if (str.equals("beginToRender")) {
            c = 0;
        }
        return c != 0 ? c != 1 ? c != 2 ? zzfor.UNSPECIFIED : zzfor.ONE_PIXEL : zzfor.DEFINED_BY_JAVASCRIPT : zzfor.BEGIN_TO_RENDER;
    }

    private static zzfov zzp(String str) {
        return "native".equals(str) ? zzfov.NATIVE : "javascript".equals(str) ? zzfov.JAVASCRIPT : zzfov.NONE;
    }

    private static final Object zzq(zzegz zzegzVar) {
        try {
            return zzegzVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final zzehg zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzehd zzehdVar, final zzehc zzehcVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() || !zzfoh.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzehg) zzq(new zzegz(str7, str, str6, zzehcVar, str4, webView, str5, str8, zzehdVar) { // from class: com.google.android.gms.internal.ads.zzegp
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzehc zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzehd zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzehcVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzehdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzegz
            public final Object zza() {
                return zzeha.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final zzehg zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzehd zzehdVar, final zzehc zzehcVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() || !zzfoh.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzehg) zzq(new zzegz(str5, str, str8, str4, zzehcVar, webView, str6, str7, zzehdVar) { // from class: com.google.android.gms.internal.ads.zzegs
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzehc zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzehd zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzehcVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzehdVar;
            }

            @Override // com.google.android.gms.internal.ads.zzegz
            public final Object zza() {
                return zzeha.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final zzfou zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfou) zzq(new zzegz(webView, z2) { // from class: com.google.android.gms.internal.ads.zzegx
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzegz
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                return zzfou.zza(zzfow.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final String zzf(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue()) {
            return (String) zzq(new zzegz() { // from class: com.google.android.gms.internal.ads.zzegv
                @Override // com.google.android.gms.internal.ads.zzegz
                public final Object zza() {
                    return "a.1.4.10-google_20240110";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzg(final zzfoj zzfojVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzego
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
                    zzfojVar.zzb(view, zzfoq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzh(final zzfou zzfouVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // java.lang.Runnable
            public final void run() {
                zzfouVar.zze(view, zzfoq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzi(final zzfoj zzfojVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegy
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
                    zzfojVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzj(final zzfoj zzfojVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegq
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
                    zzfojVar.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzk(final zzfoj zzfojVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue() && zzfoh.zzb()) {
            Objects.requireNonNull(zzfojVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfojVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final boolean zzl(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeZ)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzegz() { // from class: com.google.android.gms.internal.ads.zzegt
                @Override // com.google.android.gms.internal.ads.zzegz
                public final Object zza() {
                    if (zzfoh.zzb()) {
                        return true;
                    }
                    zzfoh.zza(context);
                    return Boolean.valueOf(zzfoh.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzehb
    public final void zzm(final zzfou zzfouVar, final zzchs zzchsVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // java.lang.Runnable
            public final void run() {
                zzfouVar.zzf(zzchsVar);
            }
        });
    }
}
