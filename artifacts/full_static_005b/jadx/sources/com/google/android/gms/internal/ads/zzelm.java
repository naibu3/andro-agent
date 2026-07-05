package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzelm implements zzgfa {
    private final zzflt zza;
    private final zzczn zzb;
    private final zzfoa zzc;
    private final zzfoe zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcus zzg;
    private final zzelf zzh;
    private final zzehq zzi;
    private final Context zzj;
    private final zzfmn zzk;
    private final zzekp zzl;
    private final zzdux zzm;

    zzelm(Context context, zzflt zzfltVar, zzelf zzelfVar, zzczn zzcznVar, zzfoa zzfoaVar, zzfoe zzfoeVar, zzcus zzcusVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzehq zzehqVar, zzfmn zzfmnVar, zzekp zzekpVar, zzdux zzduxVar) {
        this.zzj = context;
        this.zza = zzfltVar;
        this.zzh = zzelfVar;
        this.zzb = zzcznVar;
        this.zzc = zzfoaVar;
        this.zzd = zzfoeVar;
        this.zzg = zzcusVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzehqVar;
        this.zzk = zzfmnVar;
        this.zzl = zzekpVar;
        this.zzm = zzduxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzc(zzfhf zzfhfVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfC)).booleanValue() ? "No ad config." : "No fill.";
        int i = zzfhfVar.zzb.zzb.zze;
        if (i == 0) {
            str = str2;
        } else if (i >= 200 && i < 300) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfB)).booleanValue()) {
            }
        } else if (i < 300 || i >= 400) {
            str = "Received error HTTP response code: " + i;
        } else {
            str = "No location header to follow redirect or too many redirects.";
        }
        zzfgv zzfgvVar = zzfhfVar.zzb.zzb.zzi;
        return zzfgvVar != null ? zzfgvVar.zza() : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzgfa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        zzbxu zzbxuVar;
        Bundle bundle;
        final zzfhf zzfhfVar = (zzfhf) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (zzbxuVar = zzfhfVar.zzb.zzd) != null && (bundle = zzbxuVar.zzm) != null) {
            this.zzm.zza().putAll(bundle);
        }
        String strZzc = zzc(zzfhfVar);
        this.zzi.zzi(zzfhfVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzis)).booleanValue() && (i = zzfhfVar.zzb.zzb.zze) != 0 && (i < 200 || i >= 300)) {
            return zzgft.zzg(new zzelj(3, strZzc));
        }
        zzfgw zzfgwVar = zzfhfVar.zzb.zzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            String str = zzfgwVar.zzp;
            if (TextUtils.isEmpty(str)) {
                for (zzfgt zzfgtVar : zzfhfVar.zzb.zza) {
                    this.zzi.zzd(zzfgtVar);
                    Iterator it = zzfgtVar.zza.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            this.zzi.zzf(zzfgtVar, 0L, zzfiq.zzd(1, null, null));
                            break;
                        }
                        zzehl zzehlVarZza = this.zzg.zza(zzfgtVar.zzb, (String) it.next());
                        if (zzehlVarZza == null || !zzehlVarZza.zzb(zzfhfVar, zzfgtVar)) {
                        }
                    }
                }
            } else {
                this.zzi.zzh(str, zzfhfVar.zzb.zza);
            }
        }
        this.zzb.zzo(new zzcqh(zzfhfVar, this.zzd, this.zzc), this.zze);
        if (zzfhfVar.zzb.zzb.zzq > 1) {
            return this.zzl.zzb(zzfhfVar);
        }
        zzfky zzfkyVarZza = zzfld.zzc(zzgft.zzg(new zzelj(3, zzc(zzfhfVar))), zzfln.RENDER_CONFIG_INIT, this.zza).zza();
        this.zzh.zzl();
        int i2 = 0;
        for (final zzfgt zzfgtVar2 : zzfhfVar.zzb.zza) {
            Iterator it2 = zzfgtVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzehl zzehlVarZza2 = this.zzg.zza(zzfgtVar2.zzb, str2);
                if (zzehlVarZza2 != null && zzehlVarZza2.zzb(zzfhfVar, zzfgtVar2)) {
                    zzfkyVarZza = this.zza.zzb(zzfln.RENDER_CONFIG_WATERFALL, zzfkyVarZza).zzh("render-config-" + i2 + "-" + str2).zzc(Throwable.class, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzelk
                        @Override // com.google.android.gms.internal.ads.zzgfa
                        public final ListenableFuture zza(Object obj2) {
                            return this.zza.zzb(zzfgtVar2, zzfhfVar, zzehlVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i2++;
        }
        final zzelf zzelfVar = this.zzh;
        Objects.requireNonNull(zzelfVar);
        zzfkyVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // java.lang.Runnable
            public final void run() {
                zzelfVar.zzj();
            }
        }, this.zze);
        return zzfkyVarZza;
    }

    final /* synthetic */ ListenableFuture zzb(zzfgt zzfgtVar, zzfhf zzfhfVar, zzehl zzehlVar, Throwable th) throws Exception {
        zzfmc zzfmcVarZza = zzfmb.zza(this.zzj, zzfmu.CUI_NAME_ADREQUEST_MEDIATION_ADAPTER);
        zzfmcVarZza.zze(zzfgtVar.zzF);
        zzfmcVarZza.zzj();
        ListenableFuture listenableFutureZzo = zzgft.zzo(zzehlVar.zza(zzfhfVar, zzfgtVar), zzfgtVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfhfVar, zzfgtVar, listenableFutureZzo, this.zzc);
        zzfmm.zzb(listenableFutureZzo, this.zzk, zzfmcVarZza);
        return listenableFutureZzo;
    }
}
