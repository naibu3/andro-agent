package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcgb implements zzlk {
    private final zzzv zzb = new zzzv(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    zzcgb() {
    }

    final void zza(boolean z) {
        this.zzg = 0;
        this.zzh = false;
        if (z) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final long zzb(zzpj zzpjVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzc(zzpj zzpjVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzd(zzpj zzpjVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zze(zzpj zzpjVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final void zzf(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, zzmn[] zzmnVarArr, zzxr zzxrVar, zzzg[] zzzgVarArr) {
        int i = 0;
        this.zzg = 0;
        while (true) {
            int length = zzmnVarArr.length;
            if (i >= 2) {
                this.zzb.zzf(this.zzg);
                return;
            } else {
                if (zzzgVarArr[i] != null) {
                    this.zzg += zzmnVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzg(zzpj zzpjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzh(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.zzd ? (char) 0 : j2 < this.zzc ? (char) 2 : (char) 1;
        int iZza = this.zzb.zza();
        int i = this.zzg;
        if (c != 2 && (c != 1 || !this.zzh || iZza >= i)) {
            z = false;
        }
        this.zzh = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final boolean zzi(zzpj zzpjVar, zzdc zzdcVar, zzvo zzvoVar, long j, float f, boolean z, long j2) {
        long j3 = z ? this.zzf : this.zze;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzlk
    public final zzzv zzj() {
        return this.zzb;
    }

    public final synchronized void zzk(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzf = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = i * 1000;
    }
}
