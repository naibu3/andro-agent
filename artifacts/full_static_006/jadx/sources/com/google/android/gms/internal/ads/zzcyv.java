package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcyv {
    private final Context zza;
    private final zzfho zzb;
    private final Bundle zzc;
    private final zzfhg zzd;
    private final zzcyn zze;
    private final zzehq zzf;

    /* synthetic */ zzcyv(zzcyt zzcytVar, zzcyu zzcyuVar) {
        this.zza = zzcytVar.zza;
        this.zzb = zzcytVar.zzb;
        this.zzc = zzcytVar.zzc;
        this.zzd = zzcytVar.zzd;
        this.zze = zzcytVar.zze;
        this.zzf = zzcytVar.zzf;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzcyn zzc() {
        return this.zze;
    }

    final zzcyt zzd() {
        zzcyt zzcytVar = new zzcyt();
        zzcytVar.zze(this.zza);
        zzcytVar.zzi(this.zzb);
        zzcytVar.zzf(this.zzc);
        zzcytVar.zzg(this.zze);
        zzcytVar.zzd(this.zzf);
        return zzcytVar;
    }

    final zzehq zze(String str) {
        zzehq zzehqVar = this.zzf;
        return zzehqVar != null ? zzehqVar : new zzehq(str);
    }

    final zzfhg zzf() {
        return this.zzd;
    }

    final zzfho zzg() {
        return this.zzb;
    }
}
