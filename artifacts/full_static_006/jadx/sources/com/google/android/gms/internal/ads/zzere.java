package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzere implements zzexw {
    private final zzgge zza;
    private final zzdst zzb;
    private final zzdxf zzc;
    private final zzerg zzd;

    public zzere(zzgge zzggeVar, zzdst zzdstVar, zzdxf zzdxfVar, zzerg zzergVar) {
        this.zza = zzggeVar;
        this.zzb = zzdstVar;
        this.zzc = zzdxfVar;
        this.zzd = zzergVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlH)).booleanValue() && this.zzd.zza() != null) {
            zzerf zzerfVarZza = this.zzd.zza();
            zzerfVarZza.getClass();
            return zzgft.zzh(zzerfVarZza);
        }
        if (!zzfyv.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbs))) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlH)).booleanValue() || (!this.zzd.zzd() && this.zzc.zzt())) {
                this.zzd.zzc(true);
                return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzc();
                    }
                });
            }
        }
        return zzgft.zzh(new zzerf(new Bundle()));
    }

    final /* synthetic */ zzerf zzc() throws Exception {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbs)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfim zzfimVarZzc = this.zzb.zzc(str, new JSONObject());
                zzfimVarZzc.zzC();
                boolean zZzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlH)).booleanValue() || zZzt) {
                    try {
                        zzbtt zzbttVarZzf = zzfimVarZzc.zzf();
                        if (zzbttVarZzf != null) {
                            bundle2.putString("sdk_version", zzbttVarZzf.toString());
                        }
                    } catch (zzfhv unused) {
                    }
                }
                try {
                    zzbtt zzbttVarZze = zzfimVarZzc.zze();
                    if (zzbttVarZze != null) {
                        bundle2.putString("adapter_version", zzbttVarZze.toString());
                    }
                } catch (zzfhv unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfhv unused3) {
            }
        }
        zzerf zzerfVar = new zzerf(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlH)).booleanValue()) {
            this.zzd.zzb(zzerfVar);
        }
        return zzerfVar;
    }
}
