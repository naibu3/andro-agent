package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaym implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzayn zza;

    zzaym(zzayn zzaynVar) {
        this.zza = zzaynVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzayn zzaynVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzaynVar.zzc > 0) {
            zzayn zzaynVar2 = this.zza;
            if (jCurrentTimeMillis >= zzaynVar2.zzc) {
                zzaynVar2.zzd = jCurrentTimeMillis - zzaynVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
