package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzapk implements zzadu {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaph
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzapk(1, 1, zzalt.zza, new zzgb(0L), new zzanz(0), 112800)};
        }
    };
    private final List zzb;
    private final zzfu zzc;
    private final SparseIntArray zzd;
    private final zzapn zze;
    private final zzalt zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapg zzj;
    private zzapf zzk;
    private zzadx zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzapk() {
        this(1, 1, zzalt.zza, new zzgb(0L), new zzanz(0), 112800);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long jZzd = zzadvVar.zzd();
        if (this.zzn) {
            if (jZzd != -1) {
                zzapg zzapgVar = this.zzj;
                if (!zzapgVar.zzd()) {
                    return zzapgVar.zza(zzadvVar, zzaeqVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzapg zzapgVar2 = this.zzj;
                if (zzapgVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzapf zzapfVar = new zzapf(zzapgVar2.zzc(), zzapgVar2.zzb(), jZzd, this.zzr, 112800);
                    this.zzk = zzapfVar;
                    this.zzl.zzO(zzapfVar.zzb());
                } else {
                    j = 0;
                    this.zzl.zzO(new zzaes(zzapgVar2.zzb(), 0L));
                }
            }
            if (this.zzp) {
                z = false;
                this.zzp = false;
                zze(j, j);
                if (zzadvVar.zzf() != j) {
                    zzaeqVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzapf zzapfVar2 = this.zzk;
            r3 = z;
            if (zzapfVar2 != null) {
                r3 = z;
                if (zzapfVar2.zze()) {
                    return zzapfVar2.zza(zzadvVar, zzaeqVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzfu zzfuVar = this.zzc;
        byte[] bArrZzM = zzfuVar.zzM();
        if (9400 - zzfuVar.zzd() < 188) {
            int iZzb = zzfuVar.zzb();
            if (iZzb > 0) {
                System.arraycopy(bArrZzM, zzfuVar.zzd(), bArrZzM, r3, iZzb);
            }
            this.zzc.zzI(bArrZzM, iZzb);
        }
        while (true) {
            zzfu zzfuVar2 = this.zzc;
            if (zzfuVar2.zzb() >= 188) {
                int iZzd = zzfuVar2.zzd();
                int iZze = zzfuVar2.zze();
                int iZza = zzapq.zza(zzfuVar2.zzM(), iZzd, iZze);
                this.zzc.zzK(iZza);
                int i = iZza + 188;
                if (i > iZze) {
                    this.zzq += iZza - iZzd;
                } else {
                    this.zzq = r3;
                }
                zzfu zzfuVar3 = this.zzc;
                int iZze2 = zzfuVar3.zze();
                if (i > iZze2) {
                    return r3;
                }
                int iZzg = zzfuVar3.zzg();
                if ((8388608 & iZzg) != 0) {
                    this.zzc.zzK(i);
                    return r3;
                }
                int i2 = (4194304 & iZzg) != 0 ? 1 : r3;
                int i3 = iZzg & 32;
                int i4 = (iZzg >> 8) & 8191;
                zzapp zzappVar = (iZzg & 16) != 0 ? (zzapp) this.zzg.get(i4) : null;
                if (zzappVar == null) {
                    this.zzc.zzK(i);
                    return r3;
                }
                int i5 = iZzg & 15;
                int i6 = this.zzd.get(i4, i5 - 1);
                this.zzd.put(i4, i5);
                if (i6 == i5) {
                    this.zzc.zzK(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzappVar.zzc();
                }
                if (i3 != 0) {
                    zzfu zzfuVar4 = this.zzc;
                    int iZzm = zzfuVar4.zzm();
                    i2 |= (zzfuVar4.zzm() & 64) != 0 ? 2 : r3;
                    this.zzc.zzL(iZzm - 1);
                }
                boolean z2 = this.zzn;
                if (z2 || !this.zzi.get(i4, r3)) {
                    this.zzc.zzJ(i);
                    zzappVar.zza(this.zzc, i2);
                    this.zzc.zzJ(iZze2);
                    if (!z2) {
                        if (this.zzn && jZzd != -1) {
                            this.zzp = true;
                        }
                    }
                }
                this.zzc.zzK(i);
                return r3;
            }
            int iZze3 = zzfuVar2.zze();
            int iZza2 = zzadvVar.zza(bArrZzM, iZze3, 9400 - iZze3);
            if (iZza2 == -1) {
                return -1;
            }
            this.zzc.zzJ(iZze3 + iZza2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzl = zzadxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(long j, long j2) {
        zzapf zzapfVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzgb zzgbVar = (zzgb) this.zzb.get(i);
            if (zzgbVar.zzf() != -9223372036854775807L) {
                long jZzd = zzgbVar.zzd();
                if (jZzd != -9223372036854775807L && jZzd != 0 && jZzd != j2) {
                    zzgbVar.zzi(j2);
                }
            }
        }
        if (j2 != 0 && (zzapfVar = this.zzk) != null) {
            zzapfVar.zzd(j2);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            ((zzapp) this.zzg.valueAt(i2)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        byte[] bArrZzM = this.zzc.zzM();
        zzadi zzadiVar = (zzadi) zzadvVar;
        zzadiVar.zzm(bArrZzM, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArrZzM[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzadiVar.zzo(i, false);
            return true;
        }
        return false;
    }

    public zzapk(int i, int i2, zzalt zzaltVar, zzgb zzgbVar, zzapn zzapnVar, int i3) {
        this.zze = zzapnVar;
        this.zzf = zzaltVar;
        this.zzb = Collections.singletonList(zzgbVar);
        this.zzc = new zzfu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzapg(112800);
        this.zzl = zzadx.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArray2.keyAt(i4), (zzapp) sparseArray2.valueAt(i4));
        }
        this.zzg.put(0, new zzapc(new zzapi(this)));
    }
}
