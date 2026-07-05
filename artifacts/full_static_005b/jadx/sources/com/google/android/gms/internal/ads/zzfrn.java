package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfrn implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfsp zza;
    private final String zzb;
    private final String zzc;
    private final zzazw zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfre zzg;
    private final long zzh;

    public zzfrn(Context context, int i, zzazw zzazwVar, String str, String str2, String str3, zzfre zzfreVar) {
        this.zzb = str;
        this.zzd = zzazwVar;
        this.zzc = str2;
        this.zzg = zzfreVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfsp zzfspVar = new zzfsp(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfspVar;
        this.zze = new LinkedBlockingQueue();
        zzfspVar.checkAvailabilityAndConnect();
    }

    static zzftb zza() {
        return new zzftb(null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzg.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfsu zzfsuVarZzd = zzd();
        if (zzfsuVarZzd != null) {
            try {
                zzftb zzftbVarZzf = zzfsuVarZzd.zzf(new zzfsz(1, this.zzd, this.zzb, this.zzc));
                zze(5011, this.zzh, null);
                this.zze.put(zzftbVarZzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            zze(4012, this.zzh, null);
            this.zze.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) throws InterruptedException {
        try {
            zze(4011, this.zzh, null);
            this.zze.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzftb zzb(int i) {
        zzftb zzftbVar;
        try {
            zzftbVar = (zzftb) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(2009, this.zzh, e);
            zzftbVar = null;
        }
        zze(3004, this.zzh, null);
        if (zzftbVar != null) {
            if (zzftbVar.zzc == 7) {
                zzfre.zzg(zzatc.DISABLED);
            } else {
                zzfre.zzg(zzatc.ENABLED);
            }
        }
        return zzftbVar == null ? zza() : zzftbVar;
    }

    public final void zzc() {
        zzfsp zzfspVar = this.zza;
        if (zzfspVar != null) {
            if (zzfspVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    protected final zzfsu zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
