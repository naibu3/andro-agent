package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaok {
    private final zzafa zza;
    private final zzgs zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzaoj zzi = new zzaoj(null);
    private final zzaoj zzj = new zzaoj(null);
    private boolean zzk = false;

    public zzaok(zzafa zzafaVar, boolean z, boolean z2) {
        this.zza = zzafaVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzgs(bArr, 0, 0);
    }

    public final void zza(zzgp zzgpVar) {
        this.zzc.append(zzgpVar.zza, zzgpVar);
    }

    public final void zzb(zzgq zzgqVar) {
        this.zzb.append(zzgqVar.zzd, zzgqVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j, int i, long j2, boolean z) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
        this.zzo = z;
    }

    public final boolean zze(long j, int i, boolean z) {
        boolean z2 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                long j2 = this.zzg;
                int i2 = i + ((int) (j - j2));
                long j3 = this.zzm;
                if (j3 != -9223372036854775807L) {
                    this.zza.zzs(j3, this.zzn ? 1 : 0, (int) (j2 - this.zzl), i2, null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z3 = this.zzo;
        boolean z4 = this.zzn;
        int i3 = this.zzf;
        if (i3 == 5 || (z3 && i3 == 1)) {
            z2 = true;
        }
        boolean z5 = z4 | z2;
        this.zzn = z5;
        return z5;
    }
}
