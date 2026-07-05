package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbnm implements zzaqx {
    private volatile zzbmz zza;
    private final Context zzb;

    public zzbnm(Context context) {
        this.zzb = context;
    }

    static /* bridge */ /* synthetic */ void zzc(zzbnm zzbnmVar) {
        if (zzbnmVar.zza == null) {
            return;
        }
        zzbnmVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaqx
    public final zzara zza(zzare zzareVar) throws zzarn {
        Parcelable.Creator<zzbna> creator = zzbna.CREATOR;
        Map mapZzl = zzareVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbna zzbnaVar = new zzbna(zzareVar.zzk(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        try {
            zzccn zzccnVar = new zzccn();
            this.zza = new zzbmz(this.zzb, com.google.android.gms.ads.internal.zzu.zzt().zzb(), new zzbnk(this, zzccnVar), new zzbnl(this, zzccnVar));
            this.zza.checkAvailabilityAndConnect();
            ListenableFuture listenableFutureZzo = zzgft.zzo(zzgft.zzn(zzccnVar, new zzbni(this, zzbnaVar), zzcci.zza), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzey)).intValue(), TimeUnit.MILLISECONDS, zzcci.zzd);
            listenableFutureZzo.addListener(new zzbnj(this), zzcci.zza);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureZzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            zzbnc zzbncVar = (zzbnc) new zzbxs(parcelFileDescriptor).zza(zzbnc.CREATOR);
            if (zzbncVar == null) {
                return null;
            }
            if (zzbncVar.zza) {
                throw new zzarn(zzbncVar.zzb);
            }
            if (zzbncVar.zze.length != zzbncVar.zzf.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = zzbncVar.zze;
                if (i >= strArr3.length) {
                    return new zzara(zzbncVar.zzc, zzbncVar.zzd, map, zzbncVar.zzg, zzbncVar.zzh);
                }
                map.put(strArr3[i], zzbncVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
