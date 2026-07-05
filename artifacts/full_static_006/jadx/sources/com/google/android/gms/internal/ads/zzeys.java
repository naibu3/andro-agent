package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeys implements zzexw {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcbp zzg;

    zzeys(zzcbp zzcbpVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcbpVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaV)).booleanValue()) {
            return zzgft.zzg(new Exception("Did not ad Ad ID into query param."));
        }
        return zzgft.zze((zzgfk) zzgft.zzo(zzgft.zzm(zzgfk.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeyq
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaW)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeyr
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzeyt zzc(AdvertisingIdClient.Info info) {
        zzfvd zzfvdVar = new zzfvd();
        if (!this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcZ)).booleanValue()) {
                if (this.zze) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzda)).booleanValue()) {
                        try {
                            zzfvdVar = zzfvg.zzj(this.zza).zzi((String) Objects.requireNonNull(((AdvertisingIdClient.Info) Objects.requireNonNull(info)).getId()), this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdg)).longValue(), this.zzf);
                        } catch (IOException | IllegalArgumentException e) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdIdInfoSignalSource.getPaidV1");
                            zzfvdVar = new zzfvd();
                        }
                    }
                }
            }
        }
        return new zzeyt(info, null, zzfvdVar);
    }

    final /* synthetic */ zzeyt zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzeyt(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfvd());
    }
}
