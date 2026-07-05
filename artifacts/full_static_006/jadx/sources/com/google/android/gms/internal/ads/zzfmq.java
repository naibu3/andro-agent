package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfmq implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdsq zzj;
    private final List zzk;
    private final zzeef zzm;
    private final zzbyd zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfnh zzg = zzfnk.zzc();
    private String zzh = "";
    private boolean zzl = false;

    public zzfmq(Context context, VersionInfoParcel versionInfoParcel, zzdsq zzdsqVar, zzeef zzeefVar, zzbyd zzbydVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdsqVar;
        this.zzm = zzeefVar;
        this.zzn = zzbydVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziQ)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzt.zzd();
        } else {
            this.zzk = zzgbc.zzm();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbgd.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbgd.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            zBooleanValue = zzb.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        bArrZzaV = ((zzfnk) this.zzg.zzbr()).zzaV();
                        this.zzg.zzc();
                    }
                    new zzeee(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid()).zza(new zzeec((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziK), 60000, new HashMap(), bArrZzaV, "application/x-protobuf", false));
                } catch (Exception e) {
                    if ((e instanceof zzdzd) && ((zzdzd) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfmg zzfmgVar) {
        zzcci.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzfmgVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfmg zzfmgVar) {
        synchronized (zzd) {
            if (!this.zzl) {
                this.zzl = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzu.zzp();
                        this.zzh = com.google.android.gms.ads.internal.util.zzt.zzp(this.zze);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziL)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlP)).booleanValue()) {
                        long j = iIntValue;
                        zzcci.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = iIntValue;
                        zzcci.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (zza() && zzfmgVar != null) {
            synchronized (zzc) {
                if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziM)).intValue()) {
                    return;
                }
                zzfms zzfmsVarZza = zzfnf.zza();
                zzfmsVarZza.zzk(zzfmgVar.zzd());
                zzfmsVarZza.zzu(zzfmgVar.zzo());
                zzfmsVarZza.zzh(zzfmgVar.zzb());
                zzfmsVarZza.zzn(zzfna.OS_ANDROID);
                zzfmsVarZza.zzr(this.zzf.afmaVersion);
                zzfmsVarZza.zzb(this.zzh);
                zzfmsVarZza.zzo(Build.VERSION.RELEASE);
                zzfmsVarZza.zzv(Build.VERSION.SDK_INT);
                zzfmsVarZza.zzm(zzfmgVar.zzf());
                zzfmsVarZza.zzl(zzfmgVar.zza());
                zzfmsVarZza.zzf(this.zzi);
                zzfmsVarZza.zze(zzfmgVar.zze());
                zzfmsVarZza.zzc(zzfmgVar.zzh());
                zzfmsVarZza.zzg(zzfmgVar.zzj());
                zzfmsVarZza.zzi(zzfmgVar.zzk());
                zzfmsVarZza.zzj(this.zzj.zzb(zzfmgVar.zzk()));
                zzfmsVarZza.zzp(zzfmgVar.zzl());
                zzfmsVarZza.zzq(zzfmgVar.zzg());
                zzfmsVarZza.zzd(zzfmgVar.zzi());
                zzfmsVarZza.zzw(zzfmgVar.zzn());
                zzfmsVarZza.zzs(zzfmgVar.zzm());
                zzfmsVarZza.zzt(zzfmgVar.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziQ)).booleanValue()) {
                    zzfmsVarZza.zza(this.zzk);
                }
                zzfnh zzfnhVar = this.zzg;
                zzfni zzfniVarZza = zzfnj.zza();
                zzfniVarZza.zza(zzfmsVarZza);
                zzfnhVar.zzb(zzfniVarZza);
            }
        }
    }
}
