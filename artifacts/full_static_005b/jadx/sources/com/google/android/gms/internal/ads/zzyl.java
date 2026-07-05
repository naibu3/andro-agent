package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzyl extends zzza implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzys zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    /* JADX WARN: Multi-variable type inference failed */
    public zzyl(int i, zzde zzdeVar, int i2, zzys zzysVar, int i3, boolean z, zzfyh zzfyhVar, int i4) {
        int i5;
        int iZzc;
        int iZzc2;
        boolean z2;
        super(i, zzdeVar, i2);
        this.zzh = zzysVar;
        int i6 = 1;
        int i7 = true != zzysVar.zzR ? 16 : 24;
        boolean z3 = zzysVar.zzN;
        this.zzg = zzze.zzh(this.zzd.zze);
        this.zzi = zzze.zzo(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= zzysVar.zzq.size()) {
                iZzc = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc = zzze.zzc(this.zzd, (String) zzysVar.zzq.get(i8), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzk = i8;
        this.zzj = iZzc;
        int i9 = this.zzd.zzg;
        int i10 = zzysVar.zzr;
        this.zzl = zzze.zzb(i9, 0);
        zzan zzanVar = this.zzd;
        int i11 = zzanVar.zzg;
        this.zzm = i11 == 0 || (i11 & 1) != 0;
        this.zzp = 1 == (zzanVar.zzf & 1);
        this.zzq = zzanVar.zzA;
        this.zzr = zzanVar.zzB;
        this.zzs = zzanVar.zzj;
        if (zzanVar.zzj != -1) {
            int i12 = zzysVar.zzt;
        }
        if (zzanVar.zzA != -1) {
            int i13 = zzysVar.zzs;
        }
        this.zzf = zzfyhVar.zza(zzanVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = zzgd.zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            strArrSplit[i14] = zzgd.zzD(strArrSplit[i14]);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= strArrSplit.length) {
                iZzc2 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iZzc2 = zzze.zzc(this.zzd, strArrSplit[i15], false);
                if (iZzc2 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.zzn = i15;
        this.zzo = iZzc2;
        int i16 = 0;
        while (true) {
            if (i16 >= zzysVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzn;
            if (str != null && str.equals(zzysVar.zzu.get(i16))) {
                i5 = i16;
                break;
            }
            i16++;
        }
        this.zzt = i5;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzys zzysVar2 = this.zzh;
        if (zzze.zzo(i3, zzysVar2.zzT) && ((z2 = this.zzf) || zzysVar2.zzM)) {
            zzdj zzdjVar = zzysVar2.zzv;
            if (zzze.zzo(i3, false) && z2 && this.zzd.zzj != -1) {
                boolean z4 = zzysVar2.zzC;
                boolean z5 = zzysVar2.zzB;
                if ((zzysVar2.zzV || !z) && (i7 & i3) != 0) {
                    i6 = 2;
                }
            }
        } else {
            i6 = 0;
        }
        this.zze = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzyl zzylVar) {
        zzgcn zzgcnVarZza = (this.zzf && this.zzi) ? zzze.zzb : zzze.zzb.zza();
        zzgar zzgarVarZzd = zzgar.zzk().zze(this.zzi, zzylVar.zzi).zzd(Integer.valueOf(this.zzk), Integer.valueOf(zzylVar.zzk), zzgcn.zzc().zza()).zzb(this.zzj, zzylVar.zzj).zzb(this.zzl, zzylVar.zzl).zze(this.zzp, zzylVar.zzp).zze(this.zzm, zzylVar.zzm).zzd(Integer.valueOf(this.zzn), Integer.valueOf(zzylVar.zzn), zzgcn.zzc().zza()).zzb(this.zzo, zzylVar.zzo).zze(this.zzf, zzylVar.zzf).zzd(Integer.valueOf(this.zzt), Integer.valueOf(zzylVar.zzt), zzgcn.zzc().zza());
        boolean z = this.zzh.zzB;
        zzgar zzgarVarZzd2 = zzgarVarZzd.zze(this.zzu, zzylVar.zzu).zze(this.zzv, zzylVar.zzv).zzd(Integer.valueOf(this.zzq), Integer.valueOf(zzylVar.zzq), zzgcnVarZza).zzd(Integer.valueOf(this.zzr), Integer.valueOf(zzylVar.zzr), zzgcnVarZza);
        if (zzgd.zzG(this.zzg, zzylVar.zzg)) {
            zzgarVarZzd2 = zzgarVarZzd2.zzd(Integer.valueOf(this.zzs), Integer.valueOf(zzylVar.zzs), zzgcnVarZza);
        }
        return zzgarVarZzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final /* bridge */ /* synthetic */ boolean zzc(zzza zzzaVar) {
        String str;
        zzyl zzylVar = (zzyl) zzzaVar;
        boolean z = this.zzh.zzP;
        zzan zzanVar = this.zzd;
        int i = zzanVar.zzA;
        if (i == -1) {
            return false;
        }
        zzan zzanVar2 = zzylVar.zzd;
        if (i != zzanVar2.zzA || (str = zzanVar.zzn) == null || !TextUtils.equals(str, zzanVar2.zzn)) {
            return false;
        }
        zzys zzysVar = this.zzh;
        boolean z2 = zzysVar.zzO;
        int i2 = this.zzd.zzB;
        if (i2 == -1 || i2 != zzylVar.zzd.zzB) {
            return false;
        }
        boolean z3 = zzysVar.zzQ;
        return this.zzu == zzylVar.zzu && this.zzv == zzylVar.zzv;
    }
}
