package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzca {
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final CharSequence zzg;
    public final byte[] zzh;
    public final Integer zzi;
    public final Integer zzj;
    public final Integer zzk;

    @Deprecated
    public final Integer zzl;
    public final Boolean zzm;

    @Deprecated
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final Integer zzs;
    public final Integer zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;
    public final CharSequence zzx;
    public final CharSequence zzy;
    public final Integer zzz;
    public static final zzca zza = new zzca(new zzby());
    private static final String zzA = Integer.toString(0, 36);
    private static final String zzB = Integer.toString(1, 36);
    private static final String zzC = Integer.toString(2, 36);
    private static final String zzD = Integer.toString(3, 36);
    private static final String zzE = Integer.toString(4, 36);
    private static final String zzF = Integer.toString(5, 36);
    private static final String zzG = Integer.toString(6, 36);
    private static final String zzH = Integer.toString(8, 36);
    private static final String zzI = Integer.toString(9, 36);
    private static final String zzJ = Integer.toString(10, 36);
    private static final String zzK = Integer.toString(11, 36);
    private static final String zzL = Integer.toString(12, 36);
    private static final String zzM = Integer.toString(13, 36);
    private static final String zzN = Integer.toString(14, 36);
    private static final String zzO = Integer.toString(15, 36);
    private static final String zzP = Integer.toString(16, 36);
    private static final String zzQ = Integer.toString(17, 36);
    private static final String zzR = Integer.toString(18, 36);
    private static final String zzS = Integer.toString(19, 36);
    private static final String zzT = Integer.toString(20, 36);
    private static final String zzU = Integer.toString(21, 36);
    private static final String zzV = Integer.toString(22, 36);
    private static final String zzW = Integer.toString(23, 36);
    private static final String zzX = Integer.toString(24, 36);
    private static final String zzY = Integer.toString(25, 36);
    private static final String zzZ = Integer.toString(26, 36);
    private static final String zzaa = Integer.toString(27, 36);
    private static final String zzab = Integer.toString(28, 36);
    private static final String zzac = Integer.toString(29, 36);
    private static final String zzad = Integer.toString(30, 36);
    private static final String zzae = Integer.toString(31, 36);
    private static final String zzaf = Integer.toString(32, 36);
    private static final String zzag = Integer.toString(33, 36);
    private static final String zzah = Integer.toString(1000, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbw
    };

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzca(zzby zzbyVar) {
        Boolean boolValueOf = zzbyVar.zzk;
        Integer numValueOf = zzbyVar.zzj;
        Integer numValueOf2 = zzbyVar.zzw;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 20:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    numValueOf = Integer.valueOf(i);
                }
            }
        } else if (numValueOf != null) {
            boolValueOf = Boolean.valueOf(numValueOf.intValue() != -1);
            if (boolValueOf.booleanValue() && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        } else {
            numValueOf = null;
        }
        this.zzc = zzbyVar.zza;
        this.zzd = zzbyVar.zzb;
        this.zze = zzbyVar.zzc;
        this.zzf = zzbyVar.zzd;
        this.zzg = zzbyVar.zze;
        this.zzh = zzbyVar.zzf;
        this.zzi = zzbyVar.zzg;
        this.zzj = zzbyVar.zzh;
        this.zzk = zzbyVar.zzi;
        this.zzl = numValueOf;
        this.zzm = boolValueOf;
        this.zzn = zzbyVar.zzl;
        this.zzo = zzbyVar.zzl;
        this.zzp = zzbyVar.zzm;
        this.zzq = zzbyVar.zzn;
        this.zzr = zzbyVar.zzo;
        this.zzs = zzbyVar.zzp;
        this.zzt = zzbyVar.zzq;
        this.zzu = zzbyVar.zzr;
        this.zzv = zzbyVar.zzs;
        this.zzw = zzbyVar.zzt;
        this.zzx = zzbyVar.zzu;
        this.zzy = zzbyVar.zzv;
        this.zzz = numValueOf2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzca zzcaVar = (zzca) obj;
            if (zzgd.zzG(this.zzc, zzcaVar.zzc) && zzgd.zzG(this.zzd, zzcaVar.zzd) && zzgd.zzG(this.zze, zzcaVar.zze) && zzgd.zzG(this.zzf, zzcaVar.zzf) && zzgd.zzG(null, null) && zzgd.zzG(null, null) && zzgd.zzG(this.zzg, zzcaVar.zzg) && zzgd.zzG(null, null) && zzgd.zzG(null, null) && zzgd.zzG(null, null) && Arrays.equals(this.zzh, zzcaVar.zzh) && zzgd.zzG(this.zzi, zzcaVar.zzi) && zzgd.zzG(null, null) && zzgd.zzG(this.zzj, zzcaVar.zzj) && zzgd.zzG(this.zzk, zzcaVar.zzk) && zzgd.zzG(this.zzl, zzcaVar.zzl) && zzgd.zzG(this.zzm, zzcaVar.zzm) && zzgd.zzG(null, null) && zzgd.zzG(this.zzo, zzcaVar.zzo) && zzgd.zzG(this.zzp, zzcaVar.zzp) && zzgd.zzG(this.zzq, zzcaVar.zzq) && zzgd.zzG(this.zzr, zzcaVar.zzr) && zzgd.zzG(this.zzs, zzcaVar.zzs) && zzgd.zzG(this.zzt, zzcaVar.zzt) && zzgd.zzG(this.zzu, zzcaVar.zzu) && zzgd.zzG(this.zzv, zzcaVar.zzv) && zzgd.zzG(this.zzw, zzcaVar.zzw) && zzgd.zzG(null, null) && zzgd.zzG(null, null) && zzgd.zzG(this.zzx, zzcaVar.zzx) && zzgd.zzG(null, null) && zzgd.zzG(this.zzy, zzcaVar.zzy) && zzgd.zzG(this.zzz, zzcaVar.zzz)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, null, this.zzj, this.zzk, this.zzl, this.zzm, null, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, null, null, this.zzx, null, this.zzy, this.zzz, true});
    }

    public final zzby zza() {
        return new zzby(this, null);
    }
}
