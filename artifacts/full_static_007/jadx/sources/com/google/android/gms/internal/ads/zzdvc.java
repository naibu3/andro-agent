package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdvc {
    private final zzdvh zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdvc(zzdvh zzdvhVar, Executor executor) {
        this.zza = zzdvhVar;
        this.zzc = zzdvhVar.zza();
        this.zzb = executor;
    }

    public final zzdvb zza() {
        zzdvb zzdvbVar = new zzdvb(this);
        zzdvb.zza(zzdvbVar);
        return zzdvbVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlG)).booleanValue()) {
            zzdvb zzdvbVarZza = zza();
            zzdvbVarZza.zzb("action", "pecr");
            zzdvbVarZza.zzf();
        }
    }
}
