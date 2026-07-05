package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzmg {
    private static final zzvo zzt = new zzvo(new Object(), -1);
    public final zzdc zza;
    public final zzvo zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzjh zzf;
    public final boolean zzg;
    public final zzxr zzh;
    public final zzzn zzi;
    public final List zzj;
    public final zzvo zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcl zzn;
    public final boolean zzo = false;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzmg(zzdc zzdcVar, zzvo zzvoVar, long j, long j2, int i, zzjh zzjhVar, boolean z, zzxr zzxrVar, zzzn zzznVar, List list, zzvo zzvoVar2, boolean z2, int i2, zzcl zzclVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzdcVar;
        this.zzb = zzvoVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzjhVar;
        this.zzg = z;
        this.zzh = zzxrVar;
        this.zzi = zzznVar;
        this.zzj = list;
        this.zzk = zzvoVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzclVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
    }

    public static zzmg zzg(zzzn zzznVar) {
        zzdc zzdcVar = zzdc.zza;
        zzvo zzvoVar = zzt;
        return new zzmg(zzdcVar, zzvoVar, -9223372036854775807L, 0L, 1, null, false, zzxr.zza, zzznVar, zzgbc.zzm(), zzvoVar, false, 0, zzcl.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzvo zzh() {
        return zzt;
    }

    public final zzmg zza(zzvo zzvoVar) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzvoVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzmg zzb(zzvo zzvoVar, long j, long j2, long j3, long j4, zzxr zzxrVar, zzzn zzznVar, List list) {
        zzvo zzvoVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        zzcl zzclVar = this.zzn;
        long j5 = this.zzp;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmg(this.zza, zzvoVar, j2, j3, this.zze, this.zzf, this.zzg, zzxrVar, zzznVar, list, zzvoVar2, z, i, zzclVar, j5, j4, j, jElapsedRealtime, false);
    }

    public final zzmg zzc(boolean z, int i) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzmg zzd(zzjh zzjhVar) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzjhVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzmg zze(int i) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzmg zzf(zzdc zzdcVar) {
        return new zzmg(zzdcVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
