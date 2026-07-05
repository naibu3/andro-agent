package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhau implements zzhfi {
    private final zzhat zza;

    private zzhau(zzhat zzhatVar) {
        zzhcb.zzc(zzhatVar, "output");
        this.zza = zzhatVar;
        zzhatVar.zze = this;
    }

    public static zzhau zza(zzhat zzhatVar) {
        zzhau zzhauVar = zzhatVar.zze;
        return zzhauVar != null ? zzhauVar : new zzhau(zzhatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzD(int i, long j) throws IOException {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzt(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzN(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzd(int i, zzhac zzhacVar) throws IOException {
        this.zza.zzO(i, zzhacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzO(i, (zzhac) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzq(int i, Object obj, zzhdz zzhdzVar) throws IOException {
        zzhat zzhatVar = this.zza;
        zzhatVar.zzs(i, 3);
        zzhdzVar.zzj((zzhde) obj, zzhatVar.zze);
        zzhatVar.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzv(int i, Object obj, zzhdz zzhdzVar) throws IOException {
        this.zza.zzn(i, (zzhde) obj, zzhdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzhac) {
            this.zza.zzp(i, (zzhac) obj);
        } else {
            this.zza.zzo(i, (zzhde) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhcm)) {
            while (i2 < list.size()) {
                this.zza.zzq(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzhcm zzhcmVar = (zzhcm) list;
        while (i2 < list.size()) {
            Object objZze = zzhcmVar.zze(i2);
            if (objZze instanceof String) {
                this.zza.zzq(i, (String) objZze);
            } else {
                this.zza.zzO(i, (zzhac) objZze);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzE += zzhat.zzE(((Integer) list.get(i3)).intValue());
        }
        this.zza.zzu(iZzE);
        while (i2 < list.size()) {
            this.zza.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhbp)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzD += zzhat.zzD(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzD);
            while (i2 < list.size()) {
                this.zza.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhbp zzhbpVar = (zzhbp) list;
        if (!z) {
            while (i2 < zzhbpVar.size()) {
                this.zza.zzt(i, zzhbpVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzhbpVar.size(); i4++) {
            iZzD2 += zzhat.zzD(zzhbpVar.zzd(i4));
        }
        this.zza.zzu(iZzD2);
        while (i2 < zzhbpVar.size()) {
            this.zza.zzu(zzhbpVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += zzhat.zzE(((Long) list.get(i3)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhct zzhctVar = (zzhct) list;
        if (!z) {
            while (i2 < zzhctVar.size()) {
                this.zza.zzv(i, zzhctVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzhctVar.size(); i4++) {
            iZzE2 += zzhat.zzE(zzhctVar.zza(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzhctVar.size()) {
            this.zza.zzw(zzhctVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhbp)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhbp zzhbpVar = (zzhbp) list;
        if (!z) {
            while (i2 < zzhbpVar.size()) {
                this.zza.zzh(i, zzhbpVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhbpVar.size(); i6++) {
            zzhbpVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzhbpVar.size()) {
            this.zza.zzi(zzhbpVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhct zzhctVar = (zzhct) list;
        if (!z) {
            while (i2 < zzhctVar.size()) {
                this.zza.zzj(i, zzhctVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhctVar.size(); i6++) {
            zzhctVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzhctVar.size()) {
            this.zza.zzk(zzhctVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgzp)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzN(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzM(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzgzp zzgzpVar = (zzgzp) list;
        if (!z) {
            while (i2 < zzgzpVar.size()) {
                this.zza.zzN(i, zzgzpVar.zzh(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgzpVar.size(); i6++) {
            zzgzpVar.zzh(i6);
            i5++;
        }
        this.zza.zzu(i5);
        while (i2 < zzgzpVar.size()) {
            this.zza.zzM(zzgzpVar.zzh(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhbp)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += zzhat.zzE(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhbp zzhbpVar = (zzhbp) list;
        if (!z) {
            while (i2 < zzhbpVar.size()) {
                this.zza.zzl(i, zzhbpVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzhbpVar.size(); i4++) {
            iZzE2 += zzhat.zzE(zzhbpVar.zzd(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzhbpVar.size()) {
            this.zza.zzm(zzhbpVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhct zzhctVar = (zzhct) list;
        if (!z) {
            while (i2 < zzhctVar.size()) {
                this.zza.zzj(i, zzhctVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhctVar.size(); i6++) {
            zzhctVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzhctVar.size()) {
            this.zza.zzk(zzhctVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhav)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzhav zzhavVar = (zzhav) list;
        if (!z) {
            while (i2 < zzhavVar.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(zzhavVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhavVar.size(); i6++) {
            zzhavVar.zzd(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzhavVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzhavVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhbf)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzhbf zzhbfVar = (zzhbf) list;
        if (!z) {
            while (i2 < zzhbfVar.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(zzhbfVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhbfVar.size(); i6++) {
            zzhbfVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzhbfVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzhbfVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhbp)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzhbp zzhbpVar = (zzhbp) list;
        if (!z) {
            while (i2 < zzhbpVar.size()) {
                this.zza.zzh(i, zzhbpVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzhbpVar.size(); i6++) {
            zzhbpVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzhbpVar.size()) {
            this.zza.zzi(zzhbpVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhbp)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzhat zzhatVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzhatVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzD += zzhat.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzu(iZzD);
            while (i2 < list.size()) {
                zzhat zzhatVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzhatVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzhbp zzhbpVar = (zzhbp) list;
        if (!z) {
            while (i2 < zzhbpVar.size()) {
                zzhat zzhatVar3 = this.zza;
                int iZzd = zzhbpVar.zzd(i2);
                zzhatVar3.zzt(i, (iZzd >> 31) ^ (iZzd + iZzd));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzhbpVar.size(); i4++) {
            int iZzd2 = zzhbpVar.zzd(i4);
            iZzD2 += zzhat.zzD((iZzd2 >> 31) ^ (iZzd2 + iZzd2));
        }
        this.zza.zzu(iZzD2);
        while (i2 < zzhbpVar.size()) {
            zzhat zzhatVar4 = this.zza;
            int iZzd3 = zzhbpVar.zzd(i2);
            zzhatVar4.zzu((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhct)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzhat zzhatVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzhatVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzE += zzhat.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                zzhat zzhatVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzhatVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzhct zzhctVar = (zzhct) list;
        if (!z) {
            while (i2 < zzhctVar.size()) {
                zzhat zzhatVar3 = this.zza;
                long jZza = zzhctVar.zza(i2);
                zzhatVar3.zzv(i, (jZza >> 63) ^ (jZza + jZza));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzhctVar.size(); i4++) {
            long jZza2 = zzhctVar.zza(i4);
            iZzE2 += zzhat.zzE((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzhctVar.size()) {
            zzhat zzhatVar4 = this.zza;
            long jZza3 = zzhctVar.zza(i2);
            zzhatVar4.zzw((jZza3 >> 63) ^ (jZza3 + jZza3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhfi
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzhct)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += zzhat.zzE(((Long) list.get(i3)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzhct zzhctVar = (zzhct) list;
        if (!z) {
            while (i2 < zzhctVar.size()) {
                this.zza.zzv(i, zzhctVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzhctVar.size(); i4++) {
            iZzE2 += zzhat.zzE(zzhctVar.zza(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzhctVar.size()) {
            this.zza.zzw(zzhctVar.zza(i2));
            i2++;
        }
    }
}
