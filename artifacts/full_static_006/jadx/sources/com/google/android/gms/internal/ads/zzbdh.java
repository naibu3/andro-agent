package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbdh implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzccn zza;
    final /* synthetic */ zzbdi zzb;

    zzbdh(zzbdi zzbdiVar, zzccn zzccnVar) {
        this.zza = zzccnVar;
        this.zzb = zzbdiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
