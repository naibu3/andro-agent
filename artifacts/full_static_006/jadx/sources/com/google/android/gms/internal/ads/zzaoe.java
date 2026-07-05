package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaoe implements zzaoc {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzafa zzc;
    private final zzapr zzd;
    private final zzfu zze;
    private final zzaor zzf;
    private final boolean[] zzg;
    private final zzaod zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzaoe() {
        throw null;
    }

    zzaoe(zzapr zzaprVar) {
        zzfu zzfuVar;
        this.zzd = zzaprVar;
        this.zzg = new boolean[4];
        this.zzh = new zzaod(128);
        if (zzaprVar != null) {
            this.zzf = new zzaor(178, 128);
            zzfuVar = new zzfu();
        } else {
            zzfuVar = null;
            this.zzf = null;
        }
        this.zze = zzfuVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfu zzfuVar) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j;
        byte b;
        int i6;
        zzeq.zzb(this.zzc);
        int iZzd = zzfuVar.zzd();
        int iZze = zzfuVar.zze();
        byte[] bArrZzM = zzfuVar.zzM();
        this.zzi += zzfuVar.zzb();
        this.zzc.zzq(zzfuVar, zzfuVar.zzb());
        while (true) {
            int iZza = zzgr.zza(bArrZzM, iZzd, iZze, this.zzg);
            if (iZza == iZze) {
                break;
            }
            int i7 = iZza + 3;
            int i8 = zzfuVar.zzM()[i7] & 255;
            int i9 = iZza - iZzd;
            if (this.zzk) {
                i = i7;
            } else {
                if (i9 > 0) {
                    this.zzh.zza(bArrZzM, iZzd, iZza);
                }
                if (this.zzh.zzc(i8, i9 < 0 ? -i9 : 0)) {
                    zzaod zzaodVar = this.zzh;
                    String str = this.zzb;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaodVar.zzc, zzaodVar.zza);
                    int i10 = bArrCopyOf[4] & 255;
                    byte b2 = bArrCopyOf[5];
                    int i11 = bArrCopyOf[6] & 255;
                    i = i7;
                    int i12 = ((b2 & 255) >> 4) | (i10 << 4);
                    int i13 = (bArrCopyOf[7] & 240) >> 4;
                    int i14 = ((b2 & Ascii.SI) << 8) | i11;
                    if (i13 == 2) {
                        i3 = i14 * 4;
                        i4 = i12 * 3;
                    } else if (i13 == 3) {
                        i3 = i14 * 16;
                        i4 = i12 * 9;
                    } else if (i13 != 4) {
                        f = 1.0f;
                        zzal zzalVar = new zzal();
                        zzalVar.zzK(str);
                        zzalVar.zzX("video/mpeg2");
                        zzalVar.zzac(i12);
                        zzalVar.zzI(i14);
                        zzalVar.zzT(f);
                        zzalVar.zzL(Collections.singletonList(bArrCopyOf));
                        zzan zzanVarZzad = zzalVar.zzad();
                        i5 = (bArrCopyOf[7] & Ascii.SI) - 1;
                        j = 0;
                        if (i5 >= 0 && i5 < 8) {
                            double d = zza[i5];
                            b = bArrCopyOf[zzaodVar.zzb + 9];
                            i6 = (b & 96) >> 5;
                            if (i6 != (b & Ascii.US)) {
                                d *= (i6 + 1.0d) / (r7 + 1);
                            }
                            j = (long) (1000000.0d / d);
                        }
                        Pair pairCreate = Pair.create(zzanVarZzad, Long.valueOf(j));
                        this.zzc.zzl((zzan) pairCreate.first);
                        this.zzl = ((Long) pairCreate.second).longValue();
                        this.zzk = true;
                    } else {
                        i3 = i14 * 121;
                        i4 = i12 * 100;
                    }
                    f = i3 / i4;
                    zzal zzalVar2 = new zzal();
                    zzalVar2.zzK(str);
                    zzalVar2.zzX("video/mpeg2");
                    zzalVar2.zzac(i12);
                    zzalVar2.zzI(i14);
                    zzalVar2.zzT(f);
                    zzalVar2.zzL(Collections.singletonList(bArrCopyOf));
                    zzan zzanVarZzad2 = zzalVar2.zzad();
                    i5 = (bArrCopyOf[7] & Ascii.SI) - 1;
                    j = 0;
                    if (i5 >= 0) {
                        double d2 = zza[i5];
                        b = bArrCopyOf[zzaodVar.zzb + 9];
                        i6 = (b & 96) >> 5;
                        if (i6 != (b & Ascii.US)) {
                        }
                        j = (long) (1000000.0d / d2);
                    }
                    Pair pairCreate2 = Pair.create(zzanVarZzad2, Long.valueOf(j));
                    this.zzc.zzl((zzan) pairCreate2.first);
                    this.zzl = ((Long) pairCreate2.second).longValue();
                    this.zzk = true;
                }
            }
            zzaor zzaorVar = this.zzf;
            if (zzaorVar != null) {
                if (i9 > 0) {
                    zzaorVar.zza(bArrZzM, iZzd, iZza);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (this.zzf.zzd(i2)) {
                    zzaor zzaorVar2 = this.zzf;
                    int iZzb = zzgr.zzb(zzaorVar2.zza, zzaorVar2.zzb);
                    zzfu zzfuVar2 = this.zze;
                    int i15 = zzgd.zza;
                    zzfuVar2.zzI(this.zzf.zza, iZzb);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if (i8 == 178) {
                    if (zzfuVar.zzM()[iZza + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i16 = iZze - iZza;
                if (this.zzq && this.zzk) {
                    long j2 = this.zzo;
                    if (j2 != -9223372036854775807L) {
                        this.zzc.zzs(j2, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i16, i16, null);
                    }
                }
                if (!this.zzj || this.zzq) {
                    this.zzn = this.zzi - i16;
                    long j3 = this.zzm;
                    if (j3 == -9223372036854775807L) {
                        long j4 = this.zzo;
                        j3 = j4 != -9223372036854775807L ? j4 + this.zzl : -9223372036854775807L;
                    }
                    this.zzo = j3;
                    z = false;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    z2 = true;
                    this.zzj = true;
                } else {
                    z = false;
                    z2 = true;
                }
                this.zzq = i8 == 0 ? z2 : z;
            } else if (i8 == 184) {
                this.zzp = true;
            }
            iZzd = i;
        }
        if (!this.zzk) {
            this.zzh.zza(bArrZzM, iZzd, iZze);
        }
        zzaor zzaorVar3 = this.zzf;
        if (zzaorVar3 != null) {
            zzaorVar3.zza(bArrZzM, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzb = zzapoVar.zzb();
        this.zzc = zzadxVar.zzw(zzapoVar.zza(), 2);
        zzapr zzaprVar = this.zzd;
        if (zzaprVar != null) {
            zzaprVar.zzb(zzadxVar, zzapoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        zzgr.zzf(this.zzg);
        this.zzh.zzb();
        zzaor zzaorVar = this.zzf;
        if (zzaorVar != null) {
            zzaorVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
