package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzamh implements zzalv {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzama zzg;
    private final zzalz zzh;
    private final zzamg zzi;
    private Bitmap zzj;

    public zzamh(List list) {
        zzfu zzfuVar = new zzfu((byte[]) list.get(0));
        int iZzq = zzfuVar.zzq();
        int iZzq2 = zzfuVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzama(719, 575, 0, 719, 0, 575);
        this.zzh = new zzalz(0, zzg(), zzh(), zzi());
        this.zzi = new zzamg(iZzq, iZzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzalz zzc(zzft zzftVar, int i) {
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i2 = 8;
        int iZzd5 = zzftVar.zzd(8);
        zzftVar.zzm(8);
        int[] iArrZzg = zzg();
        int[] iArrZzh = zzh();
        int[] iArrZzi = zzi();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzd6 = zzftVar.zzd(i2);
            int iZzd7 = zzftVar.zzd(i2);
            int[] iArr = (iZzd7 & 128) != 0 ? iArrZzg : (iZzd7 & 64) != 0 ? iArrZzh : iArrZzi;
            if ((iZzd7 & 1) != 0) {
                iZzd3 = zzftVar.zzd(i2);
                iZzd4 = zzftVar.zzd(i2);
                iZzd = zzftVar.zzd(i2);
                iZzd2 = zzftVar.zzd(i2);
                i3 -= 6;
            } else {
                int iZzd8 = zzftVar.zzd(6) << 2;
                int iZzd9 = zzftVar.zzd(4) << 4;
                i3 -= 4;
                iZzd = zzftVar.zzd(4) << 4;
                iZzd2 = zzftVar.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d = iZzd3;
            double d2 = iZzd4 - 128;
            double d3 = iZzd - 128;
            iArr[iZzd6] = zzb((byte) (255 - (iZzd2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            iZzd5 = iZzd5;
            i2 = 8;
        }
        return new zzalz(iZzd5, iArrZzg, iArrZzh, iArrZzi);
    }

    private static zzamb zzd(zzft zzftVar) {
        int iZzd = zzftVar.zzd(16);
        zzftVar.zzm(4);
        int iZzd2 = zzftVar.zzd(2);
        boolean zZzo = zzftVar.zzo();
        zzftVar.zzm(1);
        byte[] bArr = zzgd.zzf;
        byte[] bArr2 = zzgd.zzf;
        if (iZzd2 == 1) {
            zzftVar.zzm(zzftVar.zzd(8) * 16);
        } else if (iZzd2 == 0) {
            int iZzd3 = zzftVar.zzd(16);
            int iZzd4 = zzftVar.zzd(16);
            if (iZzd3 > 0) {
                bArr = new byte[iZzd3];
                zzftVar.zzh(bArr, 0, iZzd3);
            }
            if (iZzd4 > 0) {
                bArr2 = new byte[iZzd4];
                zzftVar.zzh(bArr2, 0, iZzd4);
            } else {
                bArr2 = bArr;
            }
        }
        return new zzamb(iZzd, zZzo, bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0228 A[LOOP:3: B:88:0x0172->B:119:0x0228, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zze(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        int iZzd;
        char c;
        char c2;
        int i5;
        int iZzd2;
        int i6;
        int i7;
        boolean z;
        int iZzd3;
        int iZzd4;
        int i8;
        int i9;
        int i10;
        int iZzd5;
        int i11;
        zzft zzftVar = new zzft(bArr, bArr.length);
        int i12 = i2;
        int i13 = i3;
        byte[] bArrZzf = null;
        byte[] bArrZzf2 = null;
        byte[] bArrZzf3 = null;
        while (zzftVar.zza() != 0) {
            int i14 = 8;
            int iZzd6 = zzftVar.zzd(8);
            if (iZzd6 != 240) {
                int i15 = 4;
                int i16 = 1;
                int i17 = 2;
                switch (iZzd6) {
                    case 16:
                        int i18 = 1;
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArrZzf3 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzf3;
                            }
                            int i19 = i12;
                            i4 = 0;
                            while (true) {
                                iZzd = zzftVar.zzd(2);
                                if (iZzd != 0) {
                                }
                                i5 = i4;
                                c = 4;
                                c2 = '\b';
                                if (iZzd2 == 0) {
                                }
                                i4 = i5;
                                i18 = 1;
                            }
                        } else if (bArrZzf == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            int i192 = i12;
                            i4 = 0;
                            while (true) {
                                iZzd = zzftVar.zzd(2);
                                if (iZzd != 0) {
                                    iZzd2 = i18;
                                } else if (zzftVar.zzo()) {
                                    iZzd2 = zzftVar.zzd(3) + 3;
                                    iZzd = zzftVar.zzd(2);
                                } else {
                                    if (zzftVar.zzo()) {
                                        iZzd2 = i18;
                                        i5 = i4;
                                        iZzd = 0;
                                    } else {
                                        int iZzd7 = zzftVar.zzd(2);
                                        if (iZzd7 == 0) {
                                            c = 4;
                                            c2 = '\b';
                                            i5 = i18;
                                            iZzd = 0;
                                            iZzd2 = 0;
                                        } else if (iZzd7 == i18) {
                                            c = 4;
                                            c2 = '\b';
                                            i5 = i4;
                                            iZzd2 = 2;
                                            iZzd = 0;
                                        } else if (iZzd7 == 2) {
                                            c = 4;
                                            c2 = '\b';
                                            iZzd2 = zzftVar.zzd(4) + 12;
                                            iZzd = zzftVar.zzd(2);
                                            i5 = i4;
                                        } else if (iZzd7 != 3) {
                                            i5 = i4;
                                            iZzd = 0;
                                            iZzd2 = 0;
                                        } else {
                                            c2 = '\b';
                                            iZzd2 = zzftVar.zzd(8) + 29;
                                            iZzd = zzftVar.zzd(2);
                                            i5 = i4;
                                            c = 4;
                                        }
                                        if (iZzd2 == 0 || paint == null) {
                                            i6 = i192;
                                        } else {
                                            int i20 = i13 + 1;
                                            float f = i13;
                                            if (bArr2 != 0) {
                                                iZzd = bArr2[iZzd];
                                            }
                                            paint.setColor(iArr[iZzd]);
                                            i6 = i192;
                                            canvas.drawRect(i192, f, i192 + iZzd2, i20, paint);
                                        }
                                        i192 = i6 + iZzd2;
                                        if (i5 == 0) {
                                            zzftVar.zze();
                                            i12 = i192;
                                            break;
                                        } else {
                                            i4 = i5;
                                            i18 = 1;
                                        }
                                    }
                                    c = 4;
                                    c2 = '\b';
                                    if (iZzd2 == 0) {
                                        i6 = i192;
                                        i192 = i6 + iZzd2;
                                        if (i5 == 0) {
                                        }
                                    }
                                }
                                i5 = i4;
                                c = 4;
                                c2 = '\b';
                                if (iZzd2 == 0) {
                                }
                            }
                        } else {
                            bArr2 = bArrZzf;
                            int i1922 = i12;
                            i4 = 0;
                            while (true) {
                                iZzd = zzftVar.zzd(2);
                                if (iZzd != 0) {
                                }
                                i5 = i4;
                                c = 4;
                                c2 = '\b';
                                if (iZzd2 == 0) {
                                }
                                i4 = i5;
                                i18 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrZzf2 == null ? zzc : bArrZzf2 : null;
                        int i21 = i12;
                        boolean z2 = false;
                        while (true) {
                            int iZzd8 = zzftVar.zzd(i15);
                            if (iZzd8 != 0) {
                                i7 = 1;
                                z = z2;
                            } else if (zzftVar.zzo()) {
                                if (zzftVar.zzo()) {
                                    int iZzd9 = zzftVar.zzd(i17);
                                    if (iZzd9 == 0) {
                                        i7 = 1;
                                        z = z2;
                                    } else if (iZzd9 == 1) {
                                        z = z2;
                                        i7 = i17;
                                    } else if (iZzd9 == i17) {
                                        iZzd3 = zzftVar.zzd(i15) + 9;
                                        iZzd4 = zzftVar.zzd(i15);
                                    } else if (iZzd9 != 3) {
                                        z = z2;
                                        iZzd8 = 0;
                                        i7 = 0;
                                    } else {
                                        iZzd3 = zzftVar.zzd(i14) + 25;
                                        iZzd4 = zzftVar.zzd(i15);
                                    }
                                    iZzd8 = 0;
                                } else {
                                    iZzd3 = zzftVar.zzd(i17) + i15;
                                    iZzd4 = zzftVar.zzd(i15);
                                }
                                z = z2;
                                i7 = iZzd3;
                                iZzd8 = iZzd4;
                            } else {
                                int iZzd10 = zzftVar.zzd(3);
                                if (iZzd10 != 0) {
                                    z = z2;
                                    i7 = iZzd10 + 2;
                                    iZzd8 = 0;
                                } else {
                                    z = true;
                                    iZzd8 = 0;
                                    i7 = 0;
                                }
                            }
                            if (i7 == 0 || paint == null) {
                                i8 = i17;
                                i9 = i21;
                            } else {
                                int i22 = i13 + 1;
                                float f2 = i13;
                                if (bArr4 != 0) {
                                    iZzd8 = bArr4[iZzd8];
                                }
                                paint.setColor(iArr[iZzd8]);
                                i8 = 2;
                                i9 = i21;
                                canvas.drawRect(i21, f2, i21 + i7, i22, paint);
                            }
                            i21 = i9 + i7;
                            if (z) {
                                zzftVar.zze();
                                i12 = i21;
                                break;
                            } else {
                                i17 = i8;
                                z2 = z;
                                i15 = 4;
                                i14 = 8;
                            }
                        }
                    case 18:
                        int i23 = i12;
                        int i24 = 0;
                        while (true) {
                            int iZzd11 = zzftVar.zzd(8);
                            if (iZzd11 != 0) {
                                i10 = i24;
                                iZzd5 = i16;
                            } else if (zzftVar.zzo()) {
                                i10 = i24;
                                iZzd5 = zzftVar.zzd(7);
                                iZzd11 = zzftVar.zzd(8);
                            } else {
                                int iZzd12 = zzftVar.zzd(7);
                                if (iZzd12 != 0) {
                                    i10 = i24;
                                    iZzd5 = iZzd12;
                                    iZzd11 = 0;
                                } else {
                                    i10 = i16;
                                    iZzd11 = 0;
                                    iZzd5 = 0;
                                }
                            }
                            if (iZzd5 == 0 || paint == null) {
                                i11 = i16;
                            } else {
                                paint.setColor(iArr[iZzd11]);
                                i11 = i16;
                                canvas.drawRect(i23, i13, i23 + iZzd5, i13 + 1, paint);
                            }
                            i23 += iZzd5;
                            if (i10 != 0) {
                                i12 = i23;
                                break;
                            } else {
                                i16 = i11;
                                i24 = i10;
                            }
                        }
                    default:
                        switch (iZzd6) {
                            case 32:
                                bArrZzf3 = zzf(4, 4, zzftVar);
                                break;
                            case 33:
                                bArrZzf = zzf(4, 8, zzftVar);
                                break;
                            case 34:
                                bArrZzf2 = zzf(16, 8, zzftVar);
                                break;
                        }
                }
            } else {
                i13 += 2;
                i12 = i2;
            }
        }
    }

    private static byte[] zzf(int i, int i2, zzft zzftVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzftVar.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = WorkQueueKt.MASK;
                int i6 = 1 != i4 ? 0 : 127;
                int i7 = i3 != 0 ? 127 : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzb(255, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzb(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzb(WorkQueueKt.MASK, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + WorkQueueKt.MASK + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + WorkQueueKt.MASK + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + WorkQueueKt.MASK + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(byte[] bArr, int i, int i2, zzalu zzaluVar, zzev zzevVar) {
        zzaln zzalnVar;
        char c;
        char c2;
        int i3;
        SparseArray sparseArray;
        int i4;
        SparseArray sparseArray2;
        zzame zzameVar;
        int i5;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i6;
        int iZzd5;
        zzft zzftVar = new zzft(bArr, i + i2);
        zzftVar.zzk(i);
        while (zzftVar.zza() >= 48 && zzftVar.zzd(8) == 15) {
            zzamg zzamgVar = this.zzi;
            int iZzd6 = zzftVar.zzd(8);
            int iZzd7 = zzftVar.zzd(16);
            int iZzd8 = zzftVar.zzd(16);
            int iZzb = zzftVar.zzb() + iZzd8;
            if (iZzd8 * 8 > zzftVar.zza()) {
                zzfk.zzf("DvbParser", "Data field length exceeds limit");
                zzftVar.zzm(zzftVar.zza());
            } else {
                switch (iZzd6) {
                    case 16:
                        if (iZzd7 == zzamgVar.zza) {
                            zzamc zzamcVar = zzamgVar.zzi;
                            int iZzd9 = zzftVar.zzd(8);
                            int iZzd10 = zzftVar.zzd(4);
                            int iZzd11 = zzftVar.zzd(2);
                            zzftVar.zzm(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i7 = iZzd8 - 2; i7 > 0; i7 -= 6) {
                                int iZzd12 = zzftVar.zzd(8);
                                zzftVar.zzm(8);
                                sparseArray3.put(iZzd12, new zzamd(zzftVar.zzd(16), zzftVar.zzd(16)));
                            }
                            zzamc zzamcVar2 = new zzamc(iZzd9, iZzd10, iZzd11, sparseArray3);
                            if (zzamcVar2.zzb != 0) {
                                zzamgVar.zzi = zzamcVar2;
                                zzamgVar.zzc.clear();
                                zzamgVar.zzd.clear();
                                zzamgVar.zze.clear();
                                break;
                            } else if (zzamcVar != null) {
                                if (zzamcVar.zza != zzamcVar2.zza) {
                                    zzamgVar.zzi = zzamcVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzamc zzamcVar3 = zzamgVar.zzi;
                        if (iZzd7 == zzamgVar.zza && zzamcVar3 != null) {
                            int iZzd13 = zzftVar.zzd(8);
                            zzftVar.zzm(4);
                            boolean zZzo = zzftVar.zzo();
                            zzftVar.zzm(3);
                            int iZzd14 = zzftVar.zzd(16);
                            int iZzd15 = zzftVar.zzd(16);
                            int iZzd16 = zzftVar.zzd(3);
                            int iZzd17 = zzftVar.zzd(3);
                            zzftVar.zzm(2);
                            int iZzd18 = zzftVar.zzd(8);
                            int iZzd19 = zzftVar.zzd(8);
                            int iZzd20 = zzftVar.zzd(4);
                            int iZzd21 = zzftVar.zzd(2);
                            zzftVar.zzm(2);
                            int i8 = iZzd8 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i8 > 0) {
                                int iZzd22 = zzftVar.zzd(16);
                                int iZzd23 = zzftVar.zzd(2);
                                int iZzd24 = zzftVar.zzd(2);
                                int iZzd25 = zzftVar.zzd(12);
                                zzftVar.zzm(4);
                                int iZzd26 = zzftVar.zzd(12);
                                int i9 = i8 - 6;
                                if (iZzd23 == 1) {
                                    i8 -= 8;
                                    i5 = iZzd23;
                                    iZzd = zzftVar.zzd(8);
                                    iZzd2 = zzftVar.zzd(8);
                                } else if (iZzd23 == 2) {
                                    iZzd23 = 2;
                                    i8 -= 8;
                                    i5 = iZzd23;
                                    iZzd = zzftVar.zzd(8);
                                    iZzd2 = zzftVar.zzd(8);
                                } else {
                                    i5 = iZzd23;
                                    i8 = i9;
                                    iZzd = 0;
                                    iZzd2 = 0;
                                }
                                sparseArray4.put(iZzd22, new zzamf(i5, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                            }
                            zzame zzameVar2 = new zzame(iZzd13, zZzo, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray4);
                            if (zzamcVar3.zzb == 0 && (zzameVar = (zzame) zzamgVar.zzc.get(zzameVar2.zza)) != null) {
                                int i10 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzameVar.zzj;
                                    if (i10 < sparseArray5.size()) {
                                        zzameVar2.zzj.put(sparseArray5.keyAt(i10), (zzamf) sparseArray5.valueAt(i10));
                                        i10++;
                                    }
                                }
                            }
                            zzamgVar.zzc.put(zzameVar2.zza, zzameVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (iZzd7 == zzamgVar.zza) {
                            zzalz zzalzVarZzc = zzc(zzftVar, iZzd8);
                            zzamgVar.zzd.put(zzalzVarZzc.zza, zzalzVarZzc);
                            break;
                        } else if (iZzd7 == zzamgVar.zzb) {
                            zzalz zzalzVarZzc2 = zzc(zzftVar, iZzd8);
                            zzamgVar.zzf.put(zzalzVarZzc2.zza, zzalzVarZzc2);
                            break;
                        }
                        break;
                    case 19:
                        if (iZzd7 == zzamgVar.zza) {
                            zzamb zzambVarZzd = zzd(zzftVar);
                            zzamgVar.zze.put(zzambVarZzd.zza, zzambVarZzd);
                            break;
                        } else if (iZzd7 == zzamgVar.zzb) {
                            zzamb zzambVarZzd2 = zzd(zzftVar);
                            zzamgVar.zzg.put(zzambVarZzd2.zza, zzambVarZzd2);
                            break;
                        }
                        break;
                    case 20:
                        if (iZzd7 == zzamgVar.zza) {
                            zzftVar.zzm(4);
                            boolean zZzo2 = zzftVar.zzo();
                            zzftVar.zzm(3);
                            int iZzd27 = zzftVar.zzd(16);
                            int iZzd28 = zzftVar.zzd(16);
                            if (zZzo2) {
                                int iZzd29 = zzftVar.zzd(16);
                                iZzd3 = zzftVar.zzd(16);
                                iZzd5 = zzftVar.zzd(16);
                                iZzd4 = zzftVar.zzd(16);
                                i6 = iZzd29;
                            } else {
                                iZzd3 = iZzd27;
                                iZzd4 = iZzd28;
                                i6 = 0;
                                iZzd5 = 0;
                            }
                            zzamgVar.zzh = new zzama(iZzd27, iZzd28, i6, iZzd3, iZzd5, iZzd4);
                            break;
                        }
                        break;
                }
                zzftVar.zzn(iZzb - zzftVar.zzb());
            }
        }
        zzamg zzamgVar2 = this.zzi;
        zzamc zzamcVar4 = zzamgVar2.zzi;
        if (zzamcVar4 == null) {
            zzalnVar = new zzaln(zzgbc.zzm(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzama zzamaVar = zzamgVar2.zzh;
            if (zzamaVar == null) {
                zzamaVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamaVar.zza + 1 != bitmap.getWidth() || zzamaVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzamaVar.zza + 1, zzamaVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzamcVar4.zzc;
            int i11 = 0;
            while (i11 < sparseArray6.size()) {
                this.zzf.save();
                zzamd zzamdVar = (zzamd) sparseArray6.valueAt(i11);
                zzame zzameVar3 = (zzame) this.zzi.zzc.get(sparseArray6.keyAt(i11));
                int i12 = zzamdVar.zza + zzamaVar.zzc;
                int i13 = zzamdVar.zzb + zzamaVar.zze;
                this.zzf.clipRect(i12, i13, Math.min(zzameVar3.zzc + i12, zzamaVar.zzd), Math.min(zzameVar3.zzd + i13, zzamaVar.zzf));
                zzalz zzalzVar = (zzalz) this.zzi.zzd.get(zzameVar3.zzf);
                if (zzalzVar == null) {
                    zzalzVar = (zzalz) this.zzi.zzf.get(zzameVar3.zzf);
                    if (zzalzVar == null) {
                        zzalzVar = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzameVar3.zzj;
                int i14 = 0;
                while (i14 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i14);
                    zzamf zzamfVar = (zzamf) sparseArray7.valueAt(i14);
                    zzamb zzambVar = (zzamb) this.zzi.zze.get(iKeyAt);
                    if (zzambVar == null) {
                        zzambVar = (zzamb) this.zzi.zzg.get(iKeyAt);
                    }
                    if (zzambVar != null) {
                        Paint paint = zzambVar.zzb ? null : this.zzd;
                        int i15 = zzameVar3.zze;
                        int i16 = zzamfVar.zza + i12;
                        int i17 = zzamfVar.zzb + i13;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray7;
                        i4 = i11;
                        int[] iArr = i15 == 3 ? zzalzVar.zzd : i15 == 2 ? zzalzVar.zzc : zzalzVar.zzb;
                        Paint paint2 = paint;
                        zze(zzambVar.zzc, iArr, i15, i16, i17, paint2, canvas);
                        zze(zzambVar.zzd, iArr, i15, i16, i17 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i4 = i11;
                        sparseArray2 = sparseArray7;
                    }
                    i14++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i11 = i4;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i18 = i11;
                float f = i13;
                float f2 = i12;
                if (zzameVar3.zzb) {
                    int i19 = zzameVar3.zze;
                    c = 3;
                    if (i19 == 3) {
                        i3 = zzalzVar.zzd[zzameVar3.zzg];
                        c2 = 2;
                    } else {
                        c2 = 2;
                        i3 = i19 == 2 ? zzalzVar.zzc[zzameVar3.zzh] : zzalzVar.zzb[zzameVar3.zzi];
                    }
                    this.zze.setColor(i3);
                    this.zzf.drawRect(f2, f, zzameVar3.zzc + i12, zzameVar3.zzd + i13, this.zze);
                } else {
                    c = 3;
                    c2 = 2;
                }
                zzeg zzegVar = new zzeg();
                zzegVar.zzc(Bitmap.createBitmap(this.zzj, i12, i13, zzameVar3.zzc, zzameVar3.zzd));
                zzegVar.zzh(f2 / zzamaVar.zza);
                zzegVar.zzi(0);
                zzegVar.zze(f / zzamaVar.zzb, 0);
                zzegVar.zzf(0);
                zzegVar.zzk(zzameVar3.zzc / zzamaVar.zza);
                zzegVar.zzd(zzameVar3.zzd / zzamaVar.zzb);
                arrayList.add(zzegVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i11 = i18 + 1;
                sparseArray6 = sparseArray8;
            }
            zzalnVar = new zzaln(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzevVar.zza(zzalnVar);
    }
}
