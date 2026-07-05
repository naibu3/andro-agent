package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzxn implements zzvm, zzvl {
    private final zzvm zza;
    private final long zzb;
    private zzvl zzc;

    public zzxn(zzvm zzvmVar, long j) {
        this.zza = zzvmVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j, zzmr zzmrVar) {
        long j2 = this.zzb;
        return this.zza.zza(j - j2, zzmrVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        long jZzd = this.zza.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zze(long j) {
        long j2 = this.zzb;
        return this.zza.zze(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j) {
        zzxf[] zzxfVarArr2 = new zzxf[zzxfVarArr.length];
        int i = 0;
        while (true) {
            zzxf zzxfVarZzc = null;
            if (i >= zzxfVarArr.length) {
                break;
            }
            zzxm zzxmVar = (zzxm) zzxfVarArr[i];
            if (zzxmVar != null) {
                zzxfVarZzc = zzxmVar.zzc();
            }
            zzxfVarArr2[i] = zzxfVarZzc;
            i++;
        }
        long jZzf = this.zza.zzf(zzzgVarArr, zArr, zzxfVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzxfVarArr.length; i2++) {
            zzxf zzxfVar = zzxfVarArr2[i2];
            if (zzxfVar == null) {
                zzxfVarArr[i2] = null;
            } else {
                zzxf zzxfVar2 = zzxfVarArr[i2];
                if (zzxfVar2 == null || ((zzxm) zzxfVar2).zzc() != zzxfVar) {
                    zzxfVarArr[i2] = new zzxm(zzxfVar, this.zzb);
                }
            }
        }
        return jZzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j) {
        this.zzc = zzvlVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzvm zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        long j = zzloVar.zza;
        long j2 = this.zzb;
        zzlm zzlmVarZza = zzloVar.zza();
        zzlmVarZza.zze(j - j2);
        return this.zza.zzo(zzlmVarZza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        zzvl zzvlVar = this.zzc;
        zzvlVar.getClass();
        zzvlVar.zzi(this);
    }
}
