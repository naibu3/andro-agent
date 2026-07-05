package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaoh implements zzaoc {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzapr zzb;
    private final zzfu zzc;
    private final boolean[] zzd;
    private final zzaof zze;
    private final zzaor zzf;
    private zzaog zzg;
    private long zzh;
    private String zzi;
    private zzafa zzj;
    private boolean zzk;
    private long zzl;

    public zzaoh() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
    @Override // com.google.android.gms.internal.ads.zzaoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfu zzfuVar) {
        int i;
        int i2;
        zzeq.zzb(this.zzg);
        zzeq.zzb(this.zzj);
        int iZzd = zzfuVar.zzd();
        int iZze = zzfuVar.zze();
        byte[] bArrZzM = zzfuVar.zzM();
        this.zzh += zzfuVar.zzb();
        this.zzj.zzq(zzfuVar, zzfuVar.zzb());
        while (true) {
            int iZza = zzgr.zza(bArrZzM, iZzd, iZze, this.zzd);
            if (iZza == iZze) {
                break;
            }
            int i3 = iZza + 3;
            int i4 = zzfuVar.zzM()[i3] & 255;
            int i5 = iZza - iZzd;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zza(bArrZzM, iZzd, iZza);
                }
                if (this.zze.zzc(i4, i5 < 0 ? -i5 : 0)) {
                    zzafa zzafaVar = this.zzj;
                    zzaof zzaofVar = this.zze;
                    int i6 = zzaofVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaofVar.zzc, zzaofVar.zza);
                    zzft zzftVar = new zzft(bArrCopyOf, bArrCopyOf.length);
                    zzftVar.zzn(i6);
                    zzftVar.zzn(4);
                    zzftVar.zzl();
                    zzftVar.zzm(8);
                    if (zzftVar.zzo()) {
                        zzftVar.zzm(4);
                        zzftVar.zzm(3);
                    }
                    int iZzd2 = zzftVar.zzd(4);
                    float f = 1.0f;
                    if (iZzd2 == 15) {
                        int iZzd3 = zzftVar.zzd(8);
                        int iZzd4 = zzftVar.zzd(8);
                        if (iZzd4 == 0) {
                            zzfk.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iZzd3 / iZzd4;
                        }
                    } else if (iZzd2 < 7) {
                        f = zza[iZzd2];
                    } else {
                        zzfk.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzftVar.zzo()) {
                        zzftVar.zzm(2);
                        zzftVar.zzm(1);
                        if (zzftVar.zzo()) {
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                            zzftVar.zzm(3);
                            zzftVar.zzm(11);
                            zzftVar.zzl();
                            zzftVar.zzm(15);
                            zzftVar.zzl();
                            i2 = 2;
                        } else {
                            i2 = 2;
                        }
                        if (zzftVar.zzd(i2) != 0) {
                            zzfk.zzf("H263Reader", "Unhandled video object layer shape");
                        }
                        zzftVar.zzl();
                        int iZzd5 = zzftVar.zzd(16);
                        zzftVar.zzl();
                        if (zzftVar.zzo()) {
                            if (iZzd5 == 0) {
                                zzfk.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                            } else {
                                int i7 = iZzd5 - 1;
                                int i8 = 0;
                                while (i7 > 0) {
                                    i7 >>= 1;
                                    i8++;
                                }
                                zzftVar.zzm(i8);
                            }
                        }
                        zzftVar.zzl();
                        int iZzd6 = zzftVar.zzd(13);
                        zzftVar.zzl();
                        int iZzd7 = zzftVar.zzd(13);
                        zzftVar.zzl();
                        zzftVar.zzl();
                        zzal zzalVar = new zzal();
                        zzalVar.zzK(str);
                        zzalVar.zzX("video/mp4v-es");
                        zzalVar.zzac(iZzd6);
                        zzalVar.zzI(iZzd7);
                        zzalVar.zzT(f2);
                        zzalVar.zzL(Collections.singletonList(bArrCopyOf));
                        zzafaVar.zzl(zzalVar.zzad());
                        this.zzk = true;
                    }
                }
            }
            this.zzg.zza(bArrZzM, iZzd, iZza);
            zzaor zzaorVar = this.zzf;
            if (zzaorVar != null) {
                if (i5 > 0) {
                    zzaorVar.zza(bArrZzM, iZzd, iZza);
                    i = 0;
                } else {
                    i = -i5;
                }
                if (this.zzf.zzd(i)) {
                    zzaor zzaorVar2 = this.zzf;
                    int iZzb = zzgr.zzb(zzaorVar2.zza, zzaorVar2.zzb);
                    zzfu zzfuVar2 = this.zzc;
                    int i9 = zzgd.zza;
                    zzfuVar2.zzI(this.zzf.zza, iZzb);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if (i4 == 178) {
                    if (zzfuVar.zzM()[iZza + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i4 = 178;
                }
            }
            int i10 = iZze - iZza;
            this.zzg.zzb(this.zzh - i10, i10, this.zzk);
            this.zzg.zzc(i4, this.zzl);
            iZzd = i3;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzM, iZzd, iZze);
        }
        this.zzg.zza(bArrZzM, iZzd, iZze);
        zzaor zzaorVar3 = this.zzf;
        if (zzaorVar3 != null) {
            zzaorVar3.zza(bArrZzM, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(zzadx zzadxVar, zzapo zzapoVar) {
        zzapoVar.zzc();
        this.zzi = zzapoVar.zzb();
        this.zzj = zzadxVar.zzw(zzapoVar.zza(), 2);
        this.zzg = new zzaog(this.zzj);
        zzapr zzaprVar = this.zzb;
        if (zzaprVar != null) {
            zzaprVar.zzb(zzadxVar, zzapoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zze() {
        zzgr.zzf(this.zzd);
        this.zze.zzb();
        zzaog zzaogVar = this.zzg;
        if (zzaogVar != null) {
            zzaogVar.zzd();
        }
        zzaor zzaorVar = this.zzf;
        if (zzaorVar != null) {
            zzaorVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzaoh(zzapr zzaprVar) {
        zzfu zzfuVar;
        this.zzb = zzaprVar;
        this.zzd = new boolean[4];
        this.zze = new zzaof(128);
        this.zzl = -9223372036854775807L;
        if (zzaprVar != null) {
            this.zzf = new zzaor(178, 128);
            zzfuVar = new zzfu();
        } else {
            zzfuVar = null;
            this.zzf = null;
        }
        this.zzc = zzfuVar;
    }
}
