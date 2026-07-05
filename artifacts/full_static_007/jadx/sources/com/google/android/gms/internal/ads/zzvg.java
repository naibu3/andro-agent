package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzvg implements zzvm, zzvl {
    public final zzvo zza;
    private final long zzb;
    private zzvq zzc;
    private zzvm zzd;
    private zzvl zze;
    private long zzf = -9223372036854775807L;
    private final zzzv zzg;

    public zzvg(zzvo zzvoVar, zzzv zzzvVar, long j) {
        this.zza = zzvoVar;
        this.zzg = zzzvVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j, zzmr zzmrVar) {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        return zzvmVar.zza(j, zzmrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        return zzvmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        return zzvmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        return zzvmVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zze(long j) {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        return zzvmVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzf;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzf = -9223372036854775807L;
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        return zzvmVar.zzf(zzzgVarArr, zArr, zzxfVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zze;
        int i = zzgd.zza;
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        return zzvmVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        zzvl zzvlVar = this.zze;
        int i = zzgd.zza;
        zzvlVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j, boolean z) {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        zzvmVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null) {
            zzvmVar.zzk();
            return;
        }
        zzvq zzvqVar = this.zzc;
        if (zzvqVar != null) {
            zzvqVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j) {
        this.zze = zzvlVar;
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null) {
            zzvmVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j) {
        zzvm zzvmVar = this.zzd;
        int i = zzgd.zza;
        zzvmVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        zzvm zzvmVar = this.zzd;
        return zzvmVar != null && zzvmVar.zzo(zzloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        zzvm zzvmVar = this.zzd;
        return zzvmVar != null && zzvmVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzvo zzvoVar) {
        long jZzv = zzv(this.zzb);
        zzvq zzvqVar = this.zzc;
        zzvqVar.getClass();
        zzvm zzvmVarZzI = zzvqVar.zzI(zzvoVar, this.zzg, jZzv);
        this.zzd = zzvmVarZzI;
        if (this.zze != null) {
            zzvmVarZzI.zzl(this, jZzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzvq zzvqVar) {
        zzeq.zzf(this.zzc == null);
        this.zzc = zzvqVar;
    }

    public final void zzt() {
        zzvm zzvmVar = this.zzd;
        if (zzvmVar != null) {
            zzvq zzvqVar = this.zzc;
            zzvqVar.getClass();
            zzvqVar.zzG(zzvmVar);
        }
    }
}
