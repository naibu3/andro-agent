package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajp {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfu zzf;
    private final zzfu zzg;
    private int zzh;
    private int zzi;

    public zzajp(zzfu zzfuVar, zzfu zzfuVar2, boolean z) throws zzch {
        this.zzg = zzfuVar;
        this.zzf = zzfuVar2;
        this.zze = z;
        zzfuVar2.zzK(12);
        this.zza = zzfuVar2.zzp();
        zzfuVar.zzK(12);
        this.zzi = zzfuVar.zzp();
        zzady.zzb(zzfuVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzv() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzL(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}
