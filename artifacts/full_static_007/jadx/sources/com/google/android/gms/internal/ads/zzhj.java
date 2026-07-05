package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhj implements zzhb {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhb zzc;
    private zzhb zzd;
    private zzhb zze;
    private zzhb zzf;
    private zzhb zzg;
    private zzhb zzh;
    private zzhb zzi;
    private zzhb zzj;
    private zzhb zzk;

    public zzhj(Context context, zzhb zzhbVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhbVar;
    }

    private final zzhb zzg() {
        if (this.zze == null) {
            zzgu zzguVar = new zzgu(this.zza);
            this.zze = zzguVar;
            zzh(zzguVar);
        }
        return this.zze;
    }

    private final void zzh(zzhb zzhbVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzhbVar.zzf((zzie) this.zzb.get(i));
        }
    }

    private static final void zzi(zzhb zzhbVar, zzie zzieVar) {
        if (zzhbVar != null) {
            zzhbVar.zzf(zzieVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        zzhb zzhbVar;
        zzeq.zzf(this.zzk == null);
        String scheme = zzhhVar.zza.getScheme();
        Uri uri = zzhhVar.zza;
        int i = zzgd.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = zzhhVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzhs zzhsVar = new zzhs();
                    this.zzd = zzhsVar;
                    zzh(zzhsVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzgy zzgyVar = new zzgy(this.zza);
                this.zzf = zzgyVar;
                zzh(zzgyVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzhb zzhbVar2 = (zzhb) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzhbVar2;
                    zzh(zzhbVar2);
                } catch (ClassNotFoundException unused) {
                    zzfk.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzig zzigVar = new zzig(2000);
                this.zzh = zzigVar;
                zzh(zzigVar);
            }
            this.zzk = this.zzh;
        } else if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme)) {
            if (this.zzi == null) {
                zzgz zzgzVar = new zzgz();
                this.zzi = zzgzVar;
                zzh(zzgzVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzic zzicVar = new zzic(this.zza);
                    this.zzj = zzicVar;
                    zzh(zzicVar);
                }
                zzhbVar = this.zzj;
            } else {
                zzhbVar = this.zzc;
            }
            this.zzk = zzhbVar;
        }
        return this.zzk.zzb(zzhhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar == null) {
            return null;
        }
        return zzhbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar != null) {
            try {
                zzhbVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        zzhb zzhbVar = this.zzk;
        return zzhbVar == null ? Collections.emptyMap() : zzhbVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzhb zzhbVar = this.zzk;
        zzhbVar.getClass();
        return zzhbVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
        zzieVar.getClass();
        this.zzc.zzf(zzieVar);
        this.zzb.add(zzieVar);
        zzi(this.zzd, zzieVar);
        zzi(this.zze, zzieVar);
        zzi(this.zzf, zzieVar);
        zzi(this.zzg, zzieVar);
        zzi(this.zzh, zzieVar);
        zzi(this.zzi, zzieVar);
        zzi(this.zzj, zzieVar);
    }
}
