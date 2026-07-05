package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzerz implements zzexw {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final long zze;
    private final zzcwj zzf;
    private final zzfiw zzg;
    private final zzfho zzh;
    private final com.google.android.gms.ads.internal.util.zzg zzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
    private final zzdux zzj;
    private final zzcww zzk;

    public zzerz(Context context, String str, String str2, zzcwj zzcwjVar, zzfiw zzfiwVar, zzfho zzfhoVar, zzdux zzduxVar, zzcww zzcwwVar, long j) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = zzcwjVar;
        this.zzg = zzfiwVar;
        this.zzh = zzfhoVar;
        this.zzj = zzduxVar;
        this.zzk = zzcwwVar;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        this.zzj.zzb().put("seq_num", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue()) {
            this.zzj.zzc("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - this.zze));
            zzdux zzduxVar = this.zzj;
            com.google.android.gms.ads.internal.zzu.zzp();
            zzduxVar.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzt.zzG(this.zza) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfI)).booleanValue()) {
            this.zzf.zzk(this.zzh.zzd);
            bundle.putAll(this.zzg.zzb());
        }
        return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzery
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                this.zza.zzc(bundle, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfI)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfH)).booleanValue()) {
                synchronized (zzb) {
                    this.zzf.zzk(this.zzh.zzd);
                    bundle2.putBundle("quality_signals", this.zzg.zzb());
                }
            } else {
                this.zzf.zzk(this.zzh.zzd);
                bundle2.putBundle("quality_signals", this.zzg.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!this.zzi.zzS()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzi.zzS());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfJ)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzu.zzp();
                bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzt.zzp(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AppStatsSignal_AppId");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfK)).booleanValue() && this.zzh.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzk.zzb(this.zzh.zzf));
            bundle3.putInt("pcc", this.zzk.zza(this.zzh.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjK)).booleanValue() || com.google.android.gms.ads.internal.zzu.zzo().zza() <= 0) {
            return;
        }
        bundle2.putInt("nrwv", com.google.android.gms.ads.internal.zzu.zzo().zza());
    }
}
