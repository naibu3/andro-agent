package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzww extends zzuo implements zzwn {
    private final zzha zza;
    private final zzst zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzie zzh;
    private zzbu zzi;
    private final zzwt zzj;
    private final zzzz zzk;

    /* synthetic */ zzww(zzbu zzbuVar, zzha zzhaVar, zzwt zzwtVar, zzst zzstVar, zzzz zzzzVar, int i, zzwv zzwvVar) {
        this.zzi = zzbuVar;
        this.zza = zzhaVar;
        this.zzj = zzwtVar;
        this.zzb = zzstVar;
        this.zzk = zzzzVar;
        this.zzc = i;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzbu zzbuVarZzJ = zzJ();
        zzxj zzxjVar = new zzxj(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbuVarZzJ, z2 ? zzbuVarZzJ.zzf : null);
        zzo(this.zzd ? new zzws(this, zzxjVar) : zzxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzG(zzvm zzvmVar) {
        ((zzwr) zzvmVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final zzvm zzI(zzvo zzvoVar, zzzv zzzvVar, long j) {
        zzhb zzhbVarZza = this.zza.zza();
        zzie zzieVar = this.zzh;
        if (zzieVar != null) {
            zzhbVarZza.zzf(zzieVar);
        }
        zzbn zzbnVar = zzJ().zzd;
        zzbnVar.getClass();
        zzwt zzwtVar = this.zzj;
        zzb();
        return new zzwr(zzbnVar.zzb, zzhbVarZza, new zzuq(zzwtVar.zza), this.zzb, zzc(zzvoVar), this.zzk, zze(zzvoVar), this, zzzvVar, null, this.zzc, zzgd.zzr(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final synchronized zzbu zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzwn
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        if (!this.zzd && this.zze == j && this.zzf == z && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = z;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    protected final void zzn(zzie zzieVar) {
        this.zzh = zzieVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzuo, com.google.android.gms.internal.ads.zzvq
    public final synchronized void zzt(zzbu zzbuVar) {
        this.zzi = zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvq
    public final void zzz() {
    }
}
