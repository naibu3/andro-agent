package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbdv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbdm {
    private final zzbdu zza;
    private final zzbdv.zzt.zza zzb;
    private final boolean zzc;

    private zzbdm() {
        this.zzb = zzbdv.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbdu();
    }

    public static zzbdm zza() {
        return new zzbdm();
    }

    private final synchronized String zzd(zzbdo zzbdoVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzah(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime()), Integer.valueOf(zzbdoVar.zza()), Base64.encodeToString(this.zzb.zzbr().zzaV(), 3));
    }

    private final synchronized void zze(zzbdo zzbdoVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzftv.zza(zzftu.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzd(zzbdoVar).getBytes());
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(zzbdo zzbdoVar) {
        zzbdv.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzt.zzd());
        zzbdt zzbdtVar = new zzbdt(this.zza, this.zzb.zzbr().zzaV(), null);
        zzbdtVar.zza(zzbdoVar.zza());
        zzbdtVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(zzbdoVar.zza(), 10))));
    }

    public final synchronized void zzb(zzbdo zzbdoVar) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeU)).booleanValue()) {
                zze(zzbdoVar);
            } else {
                zzf(zzbdoVar);
            }
        }
    }

    public final synchronized void zzc(zzbdl zzbdlVar) {
        if (this.zzc) {
            try {
                zzbdlVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public zzbdm(zzbdu zzbduVar) {
        this.zzb = zzbdv.zzt.zzj();
        this.zza = zzbduVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeT)).booleanValue();
    }
}
