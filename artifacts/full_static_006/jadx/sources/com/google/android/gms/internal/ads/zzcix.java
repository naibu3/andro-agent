package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcix {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcix(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcix zza() {
        return new zzcix(0, 0, 0);
    }

    public static zzcix zzb(int i, int i2) {
        return new zzcix(1, i, i2);
    }

    public static zzcix zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzd ? new zzcix(3, 0, 0) : zzqVar.zzi ? new zzcix(2, 0, 0) : zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcix zzd() {
        return new zzcix(5, 0, 0);
    }

    public static zzcix zze() {
        return new zzcix(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
