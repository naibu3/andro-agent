package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdst {
    private final zzfik zza;
    private final zzdsq zzb;

    zzdst(zzfik zzfikVar, zzdsq zzdsqVar) {
        this.zza = zzfikVar;
        this.zzb = zzdsqVar;
    }

    final zzbrf zza() throws RemoteException {
        zzbrf zzbrfVarZzb = this.zza.zzb();
        if (zzbrfVarZzb != null) {
            return zzbrfVarZzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbte zzb(String str) throws RemoteException {
        zzbte zzbteVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbteVarZzc);
        return zzbteVarZzc;
    }

    public final zzfim zzc(String str, JSONObject jSONObject) throws zzfhv {
        zzbri zzbriVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbriVarZzb = new zzbsg(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbriVarZzb = new zzbsg(new zzbtx());
            } else {
                zzbrf zzbrfVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbriVarZzb = zzbrfVarZza.zze(string) ? zzbrfVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbrfVarZza.zzd(string) ? zzbrfVarZza.zzb(string) : zzbrfVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid custom event.", e);
                    }
                } else {
                    zzbriVarZzb = zzbrfVarZza.zzb(str);
                }
            }
            zzfim zzfimVar = new zzfim(zzbriVarZzb);
            this.zzb.zzc(str, zzfimVar);
            return zzfimVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjr)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfhv(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
