package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzewl implements zzexw {
    private final Context zza;
    private final zzgge zzb;
    private final zzfho zzc;
    private final VersionInfoParcel zzd;

    zzewl(Context context, zzgge zzggeVar, zzfho zzfhoVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzggeVar;
        this.zzc = zzfhoVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00eb, B:28:0x010f, B:30:0x011a, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1 A[Catch: IOException -> 0x0122, TryCatch #0 {IOException -> 0x0122, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00eb, B:28:0x010f, B:30:0x011a, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzewm zzc() throws Exception {
        zzfvd zzfvdVar;
        boolean z;
        boolean zZzp;
        try {
            Context context = this.zza;
            boolean zZzb = this.zzc.zzb();
            zzfvd zzfvdVar2 = new zzfvd();
            zzfvd zzfvdVar3 = new zzfvd();
            boolean zZzo = true;
            if (zZzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcW)).booleanValue()) {
                    return new zzewm(true);
                }
            }
            if (!zZzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcS)).booleanValue()) {
                    if (zZzb) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcU)).booleanValue()) {
                            zzfvdVar2 = zzfvg.zzj(context).zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdg)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
                        }
                    }
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdd)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdc)).intValue()) {
                    zzfvh.zzi(context).zzj();
                }
            }
            if (!zZzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcT)).booleanValue()) {
                    if (zZzb) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcV)).booleanValue()) {
                            zzfvh zzfvhVarZzi = zzfvh.zzi(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdc)).intValue()) {
                                zzfvdVar3 = zzfvhVarZzi.zzh(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdh)).longValue(), com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
                                zZzo = zzfvhVarZzi.zzo();
                            }
                            zZzp = zzfvhVarZzi.zzp();
                            zzfvdVar = zzfvdVar3;
                            z = zZzo;
                        }
                    }
                    zzfvdVar = zzfvdVar3;
                    z = true;
                    zZzp = true;
                }
            }
            return new zzewm(zzfvdVar2, zzfvdVar, z, zZzp, zZzb);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "PerAppIdSignal");
            return new zzewm(this.zzc.zzb());
        }
    }
}
