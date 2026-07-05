package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzalk extends zzali {
    private zzalj zza;
    private int zzb;
    private boolean zzc;
    private zzaff zzd;
    private zzafd zze;

    zzalk() {
    }

    @Override // com.google.android.gms.internal.ads.zzali
    protected final long zza(zzfu zzfuVar) {
        if ((zzfuVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfuVar.zzM()[0];
        zzalj zzaljVar = this.zza;
        zzeq.zzb(zzaljVar);
        int i = !zzaljVar.zzd[(b >> 1) & (255 >>> (8 - zzaljVar.zze))].zza ? zzaljVar.zza.zze : zzaljVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzfuVar.zzc() < zzfuVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfuVar.zzM(), zzfuVar.zze() + 4);
            zzfuVar.zzI(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzfuVar.zzJ(zzfuVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzM = zzfuVar.zzM();
        bArrZzM[zzfuVar.zze() - 4] = (byte) (j & 255);
        bArrZzM[zzfuVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzM[zzfuVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzM[zzfuVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaff zzaffVar = this.zzd;
        this.zzb = zzaffVar != null ? zzaffVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfu zzfuVar, long j, zzalf zzalfVar) throws IOException {
        zzalj zzaljVar;
        int i;
        int iZzb;
        int i2;
        int i3;
        zzaff zzaffVar;
        long jFloor;
        if (this.zza != null) {
            zzalfVar.zza.getClass();
            return false;
        }
        zzaff zzaffVar2 = this.zzd;
        int i4 = 4;
        if (zzaffVar2 == null) {
            zzafg.zzd(1, zzfuVar, false);
            int iZzj = zzfuVar.zzj();
            int iZzm = zzfuVar.zzm();
            int iZzj2 = zzfuVar.zzj();
            int iZzi = zzfuVar.zzi();
            int i5 = iZzi <= 0 ? -1 : iZzi;
            int iZzi2 = zzfuVar.zzi();
            int i6 = iZzi2 <= 0 ? -1 : iZzi2;
            int iZzi3 = zzfuVar.zzi();
            int i7 = iZzi3 <= 0 ? -1 : iZzi3;
            int iZzm2 = zzfuVar.zzm();
            this.zzd = new zzaff(iZzj, iZzm, iZzj2, i5, i6, i7, (int) Math.pow(2.0d, iZzm2 & 15), (int) Math.pow(2.0d, (iZzm2 & 240) >> 4), 1 == (zzfuVar.zzm() & 1), Arrays.copyOf(zzfuVar.zzM(), zzfuVar.zze()));
        } else {
            zzafd zzafdVar = this.zze;
            if (zzafdVar == null) {
                this.zze = zzafg.zzc(zzfuVar, true, true);
            } else {
                byte[] bArr = new byte[zzfuVar.zze()];
                System.arraycopy(zzfuVar.zzM(), 0, bArr, 0, zzfuVar.zze());
                int i8 = zzaffVar2.zza;
                int i9 = 5;
                zzafg.zzd(5, zzfuVar, false);
                int iZzm3 = zzfuVar.zzm() + 1;
                zzafc zzafcVar = new zzafc(zzfuVar.zzM());
                zzafcVar.zzc(zzfuVar.zzd() * 8);
                int i10 = 0;
                while (true) {
                    int i11 = 2;
                    int i12 = 16;
                    if (i10 >= iZzm3) {
                        zzaff zzaffVar3 = zzaffVar2;
                        int i13 = 6;
                        int iZzb2 = zzafcVar.zzb(6) + 1;
                        for (int i14 = 0; i14 < iZzb2; i14++) {
                            if (zzafcVar.zzb(16) != 0) {
                                throw zzch.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i15 = 1;
                        int iZzb3 = zzafcVar.zzb(6) + 1;
                        int i16 = 0;
                        while (true) {
                            int i17 = 3;
                            if (i16 < iZzb3) {
                                int iZzb4 = zzafcVar.zzb(i12);
                                if (iZzb4 == 0) {
                                    i2 = iZzb3;
                                    int i18 = 8;
                                    zzafcVar.zzc(8);
                                    zzafcVar.zzc(16);
                                    zzafcVar.zzc(16);
                                    zzafcVar.zzc(6);
                                    zzafcVar.zzc(8);
                                    int iZzb5 = zzafcVar.zzb(4) + 1;
                                    int i19 = 0;
                                    while (i19 < iZzb5) {
                                        zzafcVar.zzc(i18);
                                        i19++;
                                        i18 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i15) {
                                        throw zzch.zza("floor type greater than 1 not decodable: " + iZzb4, null);
                                    }
                                    int iZzb6 = zzafcVar.zzb(i9);
                                    int[] iArr = new int[iZzb6];
                                    int i20 = -1;
                                    for (int i21 = 0; i21 < iZzb6; i21++) {
                                        int iZzb7 = zzafcVar.zzb(4);
                                        iArr[i21] = iZzb7;
                                        if (iZzb7 > i20) {
                                            i20 = iZzb7;
                                        }
                                    }
                                    int i22 = i20 + 1;
                                    int[] iArr2 = new int[i22];
                                    int i23 = 0;
                                    while (i23 < i22) {
                                        iArr2[i23] = zzafcVar.zzb(i17) + 1;
                                        int iZzb8 = zzafcVar.zzb(i11);
                                        if (iZzb8 > 0) {
                                            i3 = 8;
                                            zzafcVar.zzc(8);
                                        } else {
                                            i3 = 8;
                                        }
                                        int i24 = iZzb3;
                                        int i25 = 0;
                                        for (int i26 = 1; i25 < (i26 << iZzb8); i26 = 1) {
                                            zzafcVar.zzc(i3);
                                            i25++;
                                            i3 = 8;
                                        }
                                        i23++;
                                        iZzb3 = i24;
                                        i11 = 2;
                                        i17 = 3;
                                    }
                                    i2 = iZzb3;
                                    zzafcVar.zzc(i11);
                                    int iZzb9 = zzafcVar.zzb(4);
                                    int i27 = 0;
                                    int i28 = 0;
                                    for (int i29 = 0; i29 < iZzb6; i29++) {
                                        i27 += iArr2[iArr[i29]];
                                        while (i28 < i27) {
                                            zzafcVar.zzc(iZzb9);
                                            i28++;
                                        }
                                    }
                                }
                                i16++;
                                iZzb3 = i2;
                                i13 = 6;
                                i11 = 2;
                                i12 = 16;
                                i15 = 1;
                                i9 = 5;
                            } else {
                                int i30 = 1;
                                int iZzb10 = zzafcVar.zzb(i13) + 1;
                                int i31 = 0;
                                while (i31 < iZzb10) {
                                    if (zzafcVar.zzb(16) > 2) {
                                        throw zzch.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzafcVar.zzc(24);
                                    zzafcVar.zzc(24);
                                    zzafcVar.zzc(24);
                                    int iZzb11 = zzafcVar.zzb(i13) + i30;
                                    int i32 = 8;
                                    zzafcVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i33 = 0; i33 < iZzb11; i33++) {
                                        iArr3[i33] = ((zzafcVar.zzd() ? zzafcVar.zzb(5) : 0) * 8) + zzafcVar.zzb(3);
                                    }
                                    int i34 = 0;
                                    while (i34 < iZzb11) {
                                        int i35 = 0;
                                        while (i35 < i32) {
                                            if ((iArr3[i34] & (1 << i35)) != 0) {
                                                zzafcVar.zzc(i32);
                                            }
                                            i35++;
                                            i32 = 8;
                                        }
                                        i34++;
                                        i32 = 8;
                                    }
                                    i31++;
                                    i13 = 6;
                                    i30 = 1;
                                }
                                int iZzb12 = zzafcVar.zzb(i13) + 1;
                                for (int i36 = 0; i36 < iZzb12; i36++) {
                                    int iZzb13 = zzafcVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        zzfk.zzc("VorbisUtil", "mapping type other than 0 not supported: " + iZzb13);
                                    } else {
                                        if (zzafcVar.zzd()) {
                                            i = 1;
                                            iZzb = zzafcVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzafcVar.zzd()) {
                                            int iZzb14 = zzafcVar.zzb(8) + i;
                                            for (int i37 = 0; i37 < iZzb14; i37++) {
                                                int i38 = i8 - 1;
                                                zzafcVar.zzc(zzafg.zza(i38));
                                                zzafcVar.zzc(zzafg.zza(i38));
                                            }
                                        }
                                        if (zzafcVar.zzb(2) != 0) {
                                            throw zzch.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i39 = 0; i39 < i8; i39++) {
                                                zzafcVar.zzc(4);
                                            }
                                        }
                                        for (int i40 = 0; i40 < iZzb; i40++) {
                                            zzafcVar.zzc(8);
                                            zzafcVar.zzc(8);
                                            zzafcVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzafcVar.zzb(6);
                                int i41 = iZzb15 + 1;
                                zzafe[] zzafeVarArr = new zzafe[i41];
                                for (int i42 = 0; i42 < i41; i42++) {
                                    zzafeVarArr[i42] = new zzafe(zzafcVar.zzd(), zzafcVar.zzb(16), zzafcVar.zzb(16), zzafcVar.zzb(8));
                                }
                                if (!zzafcVar.zzd()) {
                                    throw zzch.zza("framing bit after modes not set as expected", null);
                                }
                                zzaljVar = new zzalj(zzaffVar3, zzafdVar, bArr, zzafeVarArr, zzafg.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzafcVar.zzb(24) != 5653314) {
                            throw zzch.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzafcVar.zza(), null);
                        }
                        int iZzb16 = zzafcVar.zzb(16);
                        int iZzb17 = zzafcVar.zzb(24);
                        if (zzafcVar.zzd()) {
                            zzafcVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzafcVar.zzb(zzafg.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZzd = zzafcVar.zzd();
                            for (int i43 = 0; i43 < iZzb17; i43++) {
                                if (!zZzd) {
                                    zzafcVar.zzc(5);
                                } else if (zzafcVar.zzd()) {
                                    zzafcVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzafcVar.zzb(i4);
                        if (iZzb19 > 2) {
                            throw zzch.zza("lookup type greater than 2 not decodable: " + iZzb19, null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzaffVar = zzaffVar2;
                            }
                            i10++;
                            zzaffVar2 = zzaffVar;
                            i4 = 4;
                        } else {
                            i11 = iZzb19;
                        }
                        zzafcVar.zzc(32);
                        zzafcVar.zzc(32);
                        int iZzb20 = zzafcVar.zzb(i4) + 1;
                        zzafcVar.zzc(1);
                        if (i11 != 1) {
                            zzaffVar = zzaffVar2;
                            jFloor = iZzb16 * iZzb17;
                        } else if (iZzb16 != 0) {
                            zzaffVar = zzaffVar2;
                            jFloor = (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16));
                        } else {
                            zzaffVar = zzaffVar2;
                            jFloor = 0;
                        }
                        zzafcVar.zzc((int) (jFloor * iZzb20));
                        i10++;
                        zzaffVar2 = zzaffVar;
                        i4 = 4;
                    }
                }
            }
        }
        zzaljVar = null;
        this.zza = zzaljVar;
        if (zzaljVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaff zzaffVar4 = zzaljVar.zza;
        arrayList.add(zzaffVar4.zzg);
        arrayList.add(zzaljVar.zzc);
        zzcd zzcdVarZzb = zzafg.zzb(zzgbc.zzl(zzaljVar.zzb.zzb));
        zzal zzalVar = new zzal();
        zzalVar.zzX("audio/vorbis");
        zzalVar.zzx(zzaffVar4.zzd);
        zzalVar.zzS(zzaffVar4.zzc);
        zzalVar.zzy(zzaffVar4.zza);
        zzalVar.zzY(zzaffVar4.zzb);
        zzalVar.zzL(arrayList);
        zzalVar.zzQ(zzcdVarZzb);
        zzalfVar.zza = zzalVar.zzad();
        return true;
    }
}
