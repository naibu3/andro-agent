package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzami {
    private final zzfu zza = new zzfu();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static /* bridge */ /* synthetic */ void zzb(zzami zzamiVar, zzfu zzfuVar, int i) {
        int iZzo;
        if (i < 4) {
            return;
        }
        zzfuVar.zzL(3);
        int i2 = i - 4;
        if ((zzfuVar.zzm() & 128) != 0) {
            if (i2 < 7 || (iZzo = zzfuVar.zzo()) < 4) {
                return;
            }
            zzamiVar.zzh = zzfuVar.zzq();
            zzamiVar.zzi = zzfuVar.zzq();
            zzamiVar.zza.zzH(iZzo - 4);
            i2 = i - 11;
        }
        zzfu zzfuVar2 = zzamiVar.zza;
        int iZzd = zzfuVar2.zzd();
        int iZze = zzfuVar2.zze();
        if (iZzd >= iZze || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iZze - iZzd);
        zzfuVar.zzG(zzfuVar2.zzM(), iZzd, iMin);
        zzamiVar.zza.zzK(iZzd + iMin);
    }

    static /* bridge */ /* synthetic */ void zzc(zzami zzamiVar, zzfu zzfuVar, int i) {
        if (i < 19) {
            return;
        }
        zzamiVar.zzd = zzfuVar.zzq();
        zzamiVar.zze = zzfuVar.zzq();
        zzfuVar.zzL(11);
        zzamiVar.zzf = zzfuVar.zzq();
        zzamiVar.zzg = zzfuVar.zzq();
    }

    static /* bridge */ /* synthetic */ void zzd(zzami zzamiVar, zzfu zzfuVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzfuVar.zzL(2);
        int i2 = 0;
        Arrays.fill(zzamiVar.zzb, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int iZzm = zzfuVar.zzm();
            int iZzm2 = zzfuVar.zzm();
            int iZzm3 = zzfuVar.zzm();
            int iZzm4 = zzfuVar.zzm();
            int iZzm5 = zzfuVar.zzm();
            double d = iZzm2;
            int[] iArr = zzamiVar.zzb;
            double d2 = iZzm3 - 128;
            int iMax = Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16;
            double d3 = iZzm4 - 128;
            iArr[iZzm] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (iZzm5 << 24) | iMax | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        zzamiVar.zzc = true;
    }

    public final zzei zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzfu zzfuVar = this.zza;
        if (zzfuVar.zze() == 0 || zzfuVar.zzd() != zzfuVar.zze() || !this.zzc) {
            return null;
        }
        zzfuVar.zzK(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int iZzm = this.zza.zzm();
            if (iZzm != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[iZzm];
            } else {
                int iZzm2 = this.zza.zzm();
                if (iZzm2 != 0) {
                    int iZzm3 = iZzm2 & 63;
                    if ((iZzm2 & 64) != 0) {
                        iZzm3 = (iZzm3 << 8) | this.zza.zzm();
                    }
                    i = iZzm3 + i3;
                    Arrays.fill(iArr, i3, i, (iZzm2 & 128) == 0 ? 0 : this.zzb[this.zza.zzm()]);
                }
            }
            i3 = i;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzeg zzegVar = new zzeg();
        zzegVar.zzc(bitmapCreateBitmap);
        zzegVar.zzh(this.zzf / this.zzd);
        zzegVar.zzi(0);
        zzegVar.zze(this.zzg / this.zze, 0);
        zzegVar.zzf(0);
        zzegVar.zzk(this.zzh / this.zzd);
        zzegVar.zzd(this.zzi / this.zze);
        return zzegVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}
