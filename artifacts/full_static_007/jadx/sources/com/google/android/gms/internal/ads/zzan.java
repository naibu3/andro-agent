package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzan {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    private int zzaq;
    public final String zzb;
    public final String zzc;
    public final List zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzcd zzl;
    public final String zzm;
    public final String zzn;
    public final int zzo;
    public final List zzp;
    public final zzae zzq;
    public final long zzr;
    public final int zzs;
    public final int zzt;
    public final float zzu;
    public final int zzv;
    public final float zzw;
    public final byte[] zzx;
    public final int zzy;
    public final zzt zzz;
    private static final zzan zzI = new zzan(new zzal());
    private static final String zzJ = Integer.toString(0, 36);
    private static final String zzK = Integer.toString(1, 36);
    private static final String zzL = Integer.toString(2, 36);
    private static final String zzM = Integer.toString(3, 36);
    private static final String zzN = Integer.toString(4, 36);
    private static final String zzO = Integer.toString(5, 36);
    private static final String zzP = Integer.toString(6, 36);
    private static final String zzQ = Integer.toString(7, 36);
    private static final String zzR = Integer.toString(8, 36);
    private static final String zzS = Integer.toString(9, 36);
    private static final String zzT = Integer.toString(10, 36);
    private static final String zzU = Integer.toString(11, 36);
    private static final String zzV = Integer.toString(12, 36);
    private static final String zzW = Integer.toString(13, 36);
    private static final String zzX = Integer.toString(14, 36);
    private static final String zzY = Integer.toString(15, 36);
    private static final String zzZ = Integer.toString(16, 36);
    private static final String zzaa = Integer.toString(17, 36);
    private static final String zzab = Integer.toString(18, 36);
    private static final String zzac = Integer.toString(19, 36);
    private static final String zzad = Integer.toString(20, 36);
    private static final String zzae = Integer.toString(21, 36);
    private static final String zzaf = Integer.toString(22, 36);
    private static final String zzag = Integer.toString(23, 36);
    private static final String zzah = Integer.toString(24, 36);
    private static final String zzai = Integer.toString(25, 36);
    private static final String zzaj = Integer.toString(26, 36);
    private static final String zzak = Integer.toString(27, 36);
    private static final String zzal = Integer.toString(28, 36);
    private static final String zzam = Integer.toString(29, 36);
    private static final String zzan = Integer.toString(30, 36);
    private static final String zzao = Integer.toString(31, 36);
    private static final String zzap = Integer.toString(32, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzai
    };

    private zzan(final zzal zzalVar) {
        String str;
        this.zzb = zzalVar.zza;
        String strZzD = zzgd.zzD(zzalVar.zzd);
        this.zze = strZzD;
        if (zzalVar.zzc.isEmpty() && zzalVar.zzb != null) {
            this.zzd = zzgbc.zzn(new zzas(strZzD, zzalVar.zzb));
            this.zzc = zzalVar.zzb;
        } else if (zzalVar.zzc.isEmpty() || zzalVar.zzb != null) {
            zzeq.zzf((zzalVar.zzc.isEmpty() && zzalVar.zzb == null) || zzalVar.zzc.stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.ads.zzaj
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    zzn zznVar = zzan.zza;
                    return ((zzas) obj).zzb.equals(zzalVar.zzb);
                }
            }));
            this.zzd = zzalVar.zzc;
            this.zzc = zzalVar.zzb;
        } else {
            this.zzd = zzalVar.zzc;
            List list = zzalVar.zzc;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzas) list.get(0)).zzb;
                    break;
                }
                zzas zzasVar = (zzas) it.next();
                if (TextUtils.equals(zzasVar.zza, strZzD)) {
                    str = zzasVar.zzb;
                    break;
                }
            }
            this.zzc = str;
        }
        this.zzf = zzalVar.zze;
        this.zzg = zzalVar.zzf;
        int i = zzalVar.zzg;
        this.zzh = i;
        int i2 = zzalVar.zzh;
        this.zzi = i2;
        this.zzj = i2 != -1 ? i2 : i;
        this.zzk = zzalVar.zzi;
        this.zzl = zzalVar.zzj;
        this.zzm = zzalVar.zzk;
        this.zzn = zzalVar.zzl;
        this.zzo = zzalVar.zzm;
        this.zzp = zzalVar.zzn == null ? Collections.emptyList() : zzalVar.zzn;
        zzae zzaeVar = zzalVar.zzo;
        this.zzq = zzaeVar;
        this.zzr = zzalVar.zzp;
        this.zzs = zzalVar.zzq;
        this.zzt = zzalVar.zzr;
        this.zzu = zzalVar.zzs;
        this.zzv = zzalVar.zzt == -1 ? 0 : zzalVar.zzt;
        this.zzw = zzalVar.zzu == -1.0f ? 1.0f : zzalVar.zzu;
        this.zzx = zzalVar.zzv;
        this.zzy = zzalVar.zzw;
        this.zzz = zzalVar.zzx;
        this.zzA = zzalVar.zzy;
        this.zzB = zzalVar.zzz;
        this.zzC = zzalVar.zzA;
        this.zzD = zzalVar.zzB == -1 ? 0 : zzalVar.zzB;
        this.zzE = zzalVar.zzC != -1 ? zzalVar.zzC : 0;
        this.zzF = zzalVar.zzD;
        this.zzG = zzalVar.zzE;
        if (zzalVar.zzF != 0 || zzaeVar == null) {
            this.zzH = zzalVar.zzF;
        } else {
            this.zzH = 1;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzan zzanVar = (zzan) obj;
            int i2 = this.zzaq;
            if ((i2 == 0 || (i = zzanVar.zzaq) == 0 || i2 == i) && this.zzf == zzanVar.zzf && this.zzg == zzanVar.zzg && this.zzh == zzanVar.zzh && this.zzi == zzanVar.zzi && this.zzo == zzanVar.zzo && this.zzr == zzanVar.zzr && this.zzs == zzanVar.zzs && this.zzt == zzanVar.zzt && this.zzv == zzanVar.zzv && this.zzy == zzanVar.zzy && this.zzA == zzanVar.zzA && this.zzB == zzanVar.zzB && this.zzC == zzanVar.zzC && this.zzD == zzanVar.zzD && this.zzE == zzanVar.zzE && this.zzF == zzanVar.zzF && this.zzH == zzanVar.zzH && Float.compare(this.zzu, zzanVar.zzu) == 0 && Float.compare(this.zzw, zzanVar.zzw) == 0 && zzgd.zzG(this.zzb, zzanVar.zzb) && zzgd.zzG(this.zzc, zzanVar.zzc) && this.zzd.equals(zzanVar.zzd) && zzgd.zzG(this.zzk, zzanVar.zzk) && zzgd.zzG(this.zzm, zzanVar.zzm) && zzgd.zzG(this.zzn, zzanVar.zzn) && zzgd.zzG(this.zze, zzanVar.zze) && Arrays.equals(this.zzx, zzanVar.zzx) && zzgd.zzG(this.zzl, zzanVar.zzl) && zzgd.zzG(this.zzz, zzanVar.zzz) && zzgd.zzG(this.zzq, zzanVar.zzq) && zzd(zzanVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzm + ", " + this.zzn + ", " + this.zzk + ", " + this.zzj + ", " + this.zze + ", [" + this.zzs + ", " + this.zzt + ", " + this.zzu + ", " + String.valueOf(this.zzz) + "], [" + this.zzA + ", " + this.zzB + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzs;
        if (i2 == -1 || (i = this.zzt) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzal zzb() {
        return new zzal(this, null);
    }

    public final zzan zzc(int i) {
        zzal zzalVar = new zzal(this, null);
        zzalVar.zzC(i);
        return new zzan(zzalVar);
    }

    public final boolean zzd(zzan zzanVar) {
        if (this.zzp.size() != zzanVar.zzp.size()) {
            return false;
        }
        for (int i = 0; i < this.zzp.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzp.get(i), (byte[]) zzanVar.zzp.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzaq;
        if (i != 0) {
            return i;
        }
        String str = this.zzb;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzc;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.zzd.hashCode();
        String str3 = this.zze;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzcd zzcdVar = this.zzl;
        int iHashCode5 = (iHashCode4 + (zzcdVar == null ? 0 : zzcdVar.hashCode())) * 31;
        String str5 = this.zzm;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iHashCode7 = ((((((((((((((((((((((((((((((((((iHashCode6 + (this.zzn != null ? r2.hashCode() : 0)) * 31) + this.zzo) * 31) + ((int) this.zzr)) * 31) + this.zzs) * 31) + this.zzt) * 31) + Float.floatToIntBits(this.zzu)) * 31) + this.zzv) * 31) + Float.floatToIntBits(this.zzw)) * 31) + this.zzy) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) - 1) * 31) - 1) * 31) + this.zzH;
        this.zzaq = iHashCode7;
        return iHashCode7;
    }
}
