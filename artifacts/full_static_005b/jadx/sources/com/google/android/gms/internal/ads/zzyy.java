package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzyy extends zzza implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzyy(int i, zzde zzdeVar, int i2, zzys zzysVar, int i3, String str) {
        int iZzc;
        super(i, zzdeVar, i2);
        int i4 = 0;
        this.zzf = zzze.zzo(i3, false);
        int i5 = this.zzd.zzf;
        int i6 = zzysVar.zzy;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        zzgbc zzgbcVarZzn = zzysVar.zzw.isEmpty() ? zzgbc.zzn("") : zzysVar.zzw;
        int i7 = 0;
        while (true) {
            if (i7 >= zzgbcVarZzn.size()) {
                i7 = Integer.MAX_VALUE;
                iZzc = 0;
                break;
            }
            zzan zzanVar = this.zzd;
            String str2 = (String) zzgbcVarZzn.get(i7);
            boolean z = zzysVar.zzz;
            iZzc = zzze.zzc(zzanVar, str2, false);
            if (iZzc > 0) {
                break;
            } else {
                i7++;
            }
        }
        this.zzi = i7;
        this.zzj = iZzc;
        int iZzb = zzze.zzb(this.zzd.zzg, zzysVar.zzx);
        this.zzk = iZzb;
        this.zzm = (this.zzd.zzg & 1088) != 0;
        int iZzc2 = zzze.zzc(this.zzd, str, zzze.zzh(str) == null);
        this.zzl = iZzc2;
        boolean z2 = iZzc > 0 || (zzysVar.zzw.isEmpty() && iZzb > 0) || this.zzg || (this.zzh && iZzc2 > 0);
        if (zzze.zzo(i3, zzysVar.zzT) && z2) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyy zzyyVar) {
        zzgar zzgarVarZzb = zzgar.zzk().zze(this.zzf, zzyyVar.zzf).zzd(Integer.valueOf(this.zzi), Integer.valueOf(zzyyVar.zzi), zzgcn.zzc().zza()).zzb(this.zzj, zzyyVar.zzj).zzb(this.zzk, zzyyVar.zzk).zze(this.zzg, zzyyVar.zzg).zzd(Boolean.valueOf(this.zzh), Boolean.valueOf(zzyyVar.zzh), this.zzj == 0 ? zzgcn.zzc() : zzgcn.zzc().zza()).zzb(this.zzl, zzyyVar.zzl);
        if (this.zzk == 0) {
            zzgarVarZzb = zzgarVarZzb.zzf(this.zzm, zzyyVar.zzm);
        }
        return zzgarVarZzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final /* bridge */ /* synthetic */ boolean zzc(zzza zzzaVar) {
        return false;
    }
}
