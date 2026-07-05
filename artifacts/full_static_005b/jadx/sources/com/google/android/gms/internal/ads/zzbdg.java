package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbdg implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbcy zza;
    final /* synthetic */ zzccn zzb;
    final /* synthetic */ zzbdi zzc;

    zzbdg(zzbdi zzbdiVar, zzbcy zzbcyVar, zzccn zzccnVar) {
        this.zza = zzbcyVar;
        this.zzb = zzccnVar;
        this.zzc = zzbdiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzbdi zzbdiVar = this.zzc;
            if (zzbdiVar.zzb) {
                return;
            }
            zzbdiVar.zzb = true;
            final zzbcx zzbcxVar = this.zzc.zza;
            if (zzbcxVar == null) {
                return;
            }
            zzgge zzggeVar = zzcci.zza;
            final zzbcy zzbcyVar = this.zza;
            final zzccn zzccnVar = this.zzb;
            final ListenableFuture listenableFutureZza = zzggeVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdd
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    zzbdg zzbdgVar = this.zza;
                    zzbcx zzbcxVar2 = zzbcxVar;
                    zzccn zzccnVar2 = zzccnVar;
                    try {
                        zzbda zzbdaVarZzq = zzbcxVar2.zzq();
                        boolean zZzp = zzbcxVar2.zzp();
                        zzbcy zzbcyVar2 = zzbcyVar;
                        zzbcv zzbcvVarZzg = zZzp ? zzbdaVarZzq.zzg(zzbcyVar2) : zzbdaVarZzq.zzf(zzbcyVar2);
                        if (!zzbcvVarZzg.zze()) {
                            zzccnVar2.zzd(new RuntimeException("No entry contents."));
                            zzbdi.zze(zzbdgVar.zzc);
                            return;
                        }
                        zzbdf zzbdfVar = new zzbdf(zzbdgVar, zzbcvVarZzg.zzc(), 1);
                        int i = zzbdfVar.read();
                        if (i == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbdfVar.unread(i);
                        zzccnVar2.zzc(zzbdk.zzb(zzbdfVar, zzbcvVarZzg.zzd(), zzbcvVarZzg.zzg(), zzbcvVarZzg.zza(), zzbcvVarZzg.zzf()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                        zzccnVar2.zzd(e);
                        zzbdi.zze(zzbdgVar.zzc);
                    }
                }
            });
            final zzccn zzccnVar2 = this.zzb;
            zzccnVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbde
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzbdg.zzd;
                    if (zzccnVar2.isCancelled()) {
                        listenableFutureZza.cancel(true);
                    }
                }
            }, zzcci.zzf);
        }
    }
}
