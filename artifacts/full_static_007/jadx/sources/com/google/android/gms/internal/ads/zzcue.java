package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcue implements zzdaz, zzban {
    private final zzfgt zza;
    private final zzdad zzb;
    private final zzdbi zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcue(zzfgt zzfgtVar, zzdad zzdadVar, zzdbi zzdbiVar) {
        this.zza = zzfgtVar;
        this.zzb = zzdadVar;
        this.zzc = zzdbiVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        if (this.zza.zzf == 1 && zzbamVar.zzj) {
            zza();
        }
        if (zzbamVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final synchronized void zzs() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
