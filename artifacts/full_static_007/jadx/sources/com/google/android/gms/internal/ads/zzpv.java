package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzpv extends BroadcastReceiver {
    final /* synthetic */ zzpw zza;

    /* synthetic */ zzpv(zzpw zzpwVar, zzpu zzpuVar) {
        this.zza = zzpwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpw zzpwVar = this.zza;
        zzpwVar.zzj(zzpp.zzd(context, intent, zzpwVar.zzh, zzpwVar.zzg));
    }
}
