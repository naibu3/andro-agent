package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcnt extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdst zzc;
    private final zzehn zzd;
    private final zzeny zze;
    private final zzdxf zzf;
    private final zzcau zzg;
    private final zzdsy zzh;
    private final zzdya zzi;
    private final zzbhd zzj;
    private final zzfmq zzk;
    private final zzfik zzl;
    private final zzcxd zzm;
    private final zzdvc zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());

    zzcnt(Context context, VersionInfoParcel versionInfoParcel, zzdst zzdstVar, zzehn zzehnVar, zzeny zzenyVar, zzdxf zzdxfVar, zzcau zzcauVar, zzdsy zzdsyVar, zzdya zzdyaVar, zzbhd zzbhdVar, zzfmq zzfmqVar, zzfik zzfikVar, zzcxd zzcxdVar, zzdvc zzdvcVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdstVar;
        this.zzd = zzehnVar;
        this.zze = zzenyVar;
        this.zzf = zzdxfVar;
        this.zzg = zzcauVar;
        this.zzh = zzdsyVar;
        this.zzi = zzdyaVar;
        this.zzj = zzbhdVar;
        this.zzk = zzfmqVar;
        this.zzl = zzfikVar;
        this.zzm = zzcxdVar;
        this.zzn = zzdvcVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzR()) {
            String strZzl = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzl();
            if (com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, strZzl, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzC(false);
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzB("");
        }
    }

    final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZze = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzbqy zzbqyVar : ((zzbqz) it.next()).zza) {
                    String str = zzbqyVar.zzk;
                    for (String str2 : zzbqyVar.zzc) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzeho zzehoVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzehoVarZza != null) {
                        zzfim zzfimVar = (zzfim) zzehoVarZza.zzb;
                        if (!zzfimVar.zzC() && zzfimVar.zzB()) {
                            zzfimVar.zzj(this.zza, (zzeji) zzehoVarZza.zzc, (List) entry.getValue());
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfhv e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    final /* synthetic */ void zzd() {
        zzfit.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzu.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbep.zza(this.zza);
        com.google.android.gms.ads.internal.zzu.zzo().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzu.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdY)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcno
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkT)).booleanValue()) {
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcO)).booleanValue()) {
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws JSONException {
        String strZzp;
        Runnable runnable;
        zzbep.zza(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzec)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzu.zzp();
                strZzp = com.google.android.gms.ads.internal.util.zzt.zzp(this.zza);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strZzp = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzp) ? str : strZzp;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdW)).booleanValue() | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaR)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaR)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
                @Override // java.lang.Runnable
                public final void run() {
                    zzgge zzggeVar = zzcci.zze;
                    final zzcnt zzcntVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzggeVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcns
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcntVar.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdxz.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbrf zzbrfVar) throws RemoteException {
        this.zzl.zzf(zzbrfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzu.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzu.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbep.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdW)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbnu zzbnuVar) throws RemoteException {
        this.zzf.zzs(zzbnuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzju)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzu.zzr().zze();
    }

    final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbwo());
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfvh.zzi(this.zza).zzn(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }
}
