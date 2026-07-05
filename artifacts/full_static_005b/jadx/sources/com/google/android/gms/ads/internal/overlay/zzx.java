package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzfwe;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwt;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfxj;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class zzx {
    private zzfws zzf;
    private zzchd zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzfwf zzd = null;
    private String zzb = null;

    private final zzfwu zzl() {
        zzfwt zzfwtVarZzc = zzfwu.zzc();
        if (!((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfwtVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfwtVarZzc.zza(this.zzb);
        }
        return zzfwtVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzw(this);
        }
    }

    public final synchronized void zza(zzchd zzchdVar, Context context) {
        this.zzc = zzchdVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        zzfwf zzfwfVar;
        if (!this.zze || (zzfwfVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfwfVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzfwf zzfwfVar;
        if (!this.zze || (zzfwfVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfwd zzfwdVarZzc = zzfwe.zzc();
        if (!((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfwdVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfwdVarZzc.zza(this.zzb);
        }
        zzfwfVar.zzb(zzfwdVarZzc.zzc(), this.zzf);
    }

    final void zzd(String str) {
        zze(str, new HashMap());
    }

    final void zze(final String str, final Map map) {
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        zzfwf zzfwfVar;
        if (!this.zze || (zzfwfVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfwfVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void zzh(String str, Map map) {
        zzchd zzchdVar = this.zzc;
        if (zzchdVar != null) {
            zzchdVar.zzd(str, map);
        }
    }

    final void zzi(zzfwr zzfwrVar) {
        if (!TextUtils.isEmpty(zzfwrVar.zzb())) {
            if (!((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue()) {
                this.zza = zzfwrVar.zzb();
            }
        }
        switch (zzfwrVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, String.valueOf(zzfwrVar.zza()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(zzchd zzchdVar, zzfwp zzfwpVar) {
        if (zzchdVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzchdVar;
        if (!this.zze && !zzk(zzchdVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zzlx)).booleanValue()) {
            this.zzb = zzfwpVar.zzh();
        }
        zzm();
        zzfwf zzfwfVar = this.zzd;
        if (zzfwfVar != null) {
            zzfwfVar.zzd(zzfwpVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfxj.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfwg.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
