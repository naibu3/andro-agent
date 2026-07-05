package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
final class zzaf implements zzgfp {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcbk zzb;
    final /* synthetic */ zzcbd zzc;
    final /* synthetic */ zzfmc zzd;
    final /* synthetic */ zzaj zze;

    zzaf(zzaj zzajVar, ListenableFuture listenableFuture, zzcbk zzcbkVar, zzcbd zzcbdVar, zzfmc zzfmcVar) {
        this.zza = listenableFuture;
        this.zzb = zzcbkVar;
        this.zzc = zzcbdVar;
        this.zzd = zzfmcVar;
        this.zze = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfmn zzfmnVarZzr = zzaj.zzr(this.zza, this.zzb);
        if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzfmnVarZzr != null) {
            zzfmc zzfmcVar = this.zzd;
            zzfmcVar.zzi(th);
            zzfmcVar.zzh(false);
            zzfmnVarZzr.zza(zzfmcVar);
            zzfmnVarZzr.zzi();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzax zzaxVar = (zzax) obj;
        zzfmn zzfmnVarZzr = zzaj.zzr(this.zza, this.zzb);
        this.zze.zzG.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhK)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbgd.zze.zze()).booleanValue() || zzfmnVarZzr == null) {
                return;
            }
            zzfmc zzfmcVar = this.zzd;
            zzfmcVar.zzc("QueryInfo generation has been disabled.");
            zzfmcVar.zzh(false);
            zzfmnVarZzr.zza(zzfmcVar);
            zzfmnVarZzr.zzi();
            return;
        }
        try {
            try {
                if (zzaxVar == null) {
                    this.zzc.zzc(null, null, null);
                    this.zzd.zzh(true);
                    if (!((Boolean) zzbgd.zze.zze()).booleanValue() || zzfmnVarZzr == null) {
                        return;
                    }
                    zzfmnVarZzr.zza(this.zzd);
                    zzfmnVarZzr.zzi();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzaxVar.zzb).optString("request_id", ""))) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzfmc zzfmcVar2 = this.zzd;
                        zzfmcVar2.zzc("Request ID empty");
                        zzfmcVar2.zzh(false);
                        if (!((Boolean) zzbgd.zze.zze()).booleanValue() || zzfmnVarZzr == null) {
                            return;
                        }
                        zzfmnVarZzr.zza(this.zzd);
                        zzfmnVarZzr.zzi();
                        return;
                    }
                    Bundle bundle = zzaxVar.zzd;
                    zzaj zzajVar = this.zze;
                    if (zzajVar.zzu && bundle != null && bundle.getInt(zzajVar.zzw, -1) == -1) {
                        zzaj zzajVar2 = this.zze;
                        bundle.putInt(zzajVar2.zzw, zzajVar2.zzx.get());
                    }
                    zzaj zzajVar3 = this.zze;
                    if (zzajVar3.zzt && bundle != null && TextUtils.isEmpty(bundle.getString(zzajVar3.zzv))) {
                        if (TextUtils.isEmpty(this.zze.zzz)) {
                            zzaj zzajVar4 = this.zze;
                            com.google.android.gms.ads.internal.util.zzt zztVarZzp = com.google.android.gms.ads.internal.zzu.zzp();
                            zzaj zzajVar5 = this.zze;
                            zzajVar4.zzz = zztVarZzp.zzc(zzajVar5.zzg, zzajVar5.zzy.afmaVersion);
                        }
                        zzaj zzajVar6 = this.zze;
                        bundle.putString(zzajVar6.zzv, zzajVar6.zzz);
                    }
                    this.zzc.zzc(zzaxVar.zza, zzaxVar.zzb, bundle);
                    this.zzd.zzh(true);
                    if (!((Boolean) zzbgd.zze.zze()).booleanValue() || zzfmnVarZzr == null) {
                        return;
                    }
                    zzfmnVarZzr.zza(this.zzd);
                    zzfmnVarZzr.zzi();
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + e2.toString());
                    zzfmc zzfmcVar3 = this.zzd;
                    zzfmcVar3.zzi(e2);
                    zzfmcVar3.zzh(false);
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbgd.zze.zze()).booleanValue() || zzfmnVarZzr == null) {
                        return;
                    }
                    zzfmnVarZzr.zza(this.zzd);
                    zzfmnVarZzr.zzi();
                }
            } catch (RemoteException e3) {
                zzfmc zzfmcVar4 = this.zzd;
                zzfmcVar4.zzi(e3);
                zzfmcVar4.zzh(false);
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e3);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbgd.zze.zze()).booleanValue() || zzfmnVarZzr == null) {
                    return;
                }
                zzfmnVarZzr.zza(this.zzd);
                zzfmnVarZzr.zzi();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbgd.zze.zze()).booleanValue() && zzfmnVarZzr != null) {
                zzfmnVarZzr.zza(this.zzd);
                zzfmnVarZzr.zzi();
            }
            throw th;
        }
    }
}
