package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbct implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbcu zza;

    zzbct(zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzbcu zzbcuVar = this.zza;
            if (zzbcuVar.zzd != null) {
                zzbcuVar.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
