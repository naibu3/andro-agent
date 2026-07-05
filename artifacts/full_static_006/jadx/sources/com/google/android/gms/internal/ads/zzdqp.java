package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdqp implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzchq zzb;
    private final Context zzc;
    private final zzdvc zzd;
    private final zzefz zze;
    private final Executor zzf;
    private final zzaxd zzg;
    private final VersionInfoParcel zzh;
    private final zzfoe zzi;
    private final zzegk zzj;
    private final zzfhs zzk;

    public zzdqp(Context context, Executor executor, zzaxd zzaxdVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzchq zzchqVar, zzefz zzefzVar, zzfoe zzfoeVar, zzdvc zzdvcVar, zzegk zzegkVar, zzfhs zzfhsVar) {
        this.zzc = context;
        this.zzf = executor;
        this.zzg = zzaxdVar;
        this.zzh = versionInfoParcel;
        this.zza = zzaVar;
        this.zzb = zzchqVar;
        this.zze = zzefzVar;
        this.zzi = zzfoeVar;
        this.zzd = zzdvcVar;
        this.zzj = zzegkVar;
        this.zzk = zzfhsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdqs zzdqsVar = new zzdqs(this);
        zzdqsVar.zzk();
        return zzdqsVar;
    }
}
