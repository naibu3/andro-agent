package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcxd implements zzdcg, zzdhu {
    private zzbxo zza;
    private final Context zzc;
    private final zzfmq zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzcxd(Context context, zzfmq zzfmqVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfmqVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    final /* synthetic */ void zzc() {
        zzbdz.zze(this.zzc);
        this.zzh = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd() {
        zzbxo zzbxoVar;
        int i;
        int i2;
        zzbqh zzbqhVarZza;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbgk.zzk.zze()).booleanValue()) {
                i = 2;
                i2 = i - 1;
                if (i2 != 1) {
                    zzbqhVarZza = com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                } else if (i2 == 2) {
                    zzbqhVarZza = com.google.android.gms.ads.internal.zzu.zzf().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
                }
                this.zza = new zzbxq(this.zzc, zzbqhVarZza.zza("google.afma.sdkConstants.getSdkConstants", zzbqe.zza, zzbqe.zza), this.zze);
                this.zzg = true;
            } else {
                i = 3;
                if (!((Boolean) zzbgk.zzl.zze()).booleanValue()) {
                    if (((Boolean) zzbgk.zzj.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zzc()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i = 2;
                            } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i = 1;
                    }
                }
                i2 = i - 1;
                if (i2 != 1) {
                }
                this.zza = new zzbxq(this.zzc, zzbqhVarZza.zza("google.afma.sdkConstants.getSdkConstants", zzbqe.zza, zzbqe.zza), this.zze);
                this.zzg = true;
            }
        }
        if (this.zzg && (zzbxoVar = this.zza) != null) {
            ListenableFuture listenableFutureZza = zzbxoVar.zza();
            if (!this.zzh && ((Boolean) zzbgc.zzi.zze()).booleanValue()) {
                listenableFutureZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                }, this.zzf);
            }
            zzccl.zza(listenableFutureZza, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzax zzaxVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdhu
    public final void zzf(String str) {
        zzd();
    }
}
