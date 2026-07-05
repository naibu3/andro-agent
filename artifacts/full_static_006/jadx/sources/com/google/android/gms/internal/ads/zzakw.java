package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzakw implements zzald {
    private final zzalc zza;
    private final long zzb;
    private final long zzc;
    private final zzali zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzakw(zzali zzaliVar, long j, long j2, long j3, long j4, boolean z) {
        zzeq.zzd(j >= 0 && j2 > j);
        this.zzd = zzaliVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzalc();
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final /* bridge */ /* synthetic */ zzaet zze() {
        zzaku zzakuVar = null;
        if (this.zzf != 0) {
            return new zzakv(this, zzakuVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzald
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzd(zzadv zzadvVar) throws IOException {
        long jMax;
        int i = this.zze;
        if (i == 0) {
            long jZzf = zzadvVar.zzf();
            this.zzg = jZzf;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > jZzf) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.zzi;
                long j3 = this.zzj;
                if (j2 == j3) {
                    jMax = -1;
                    if (jMax == -1) {
                        return jMax;
                    }
                    this.zze = 3;
                } else {
                    long jZzf2 = zzadvVar.zzf();
                    if (this.zza.zzc(zzadvVar, j3)) {
                        this.zza.zzb(zzadvVar, false);
                        zzadvVar.zzj();
                        long j4 = this.zzh;
                        zzalc zzalcVar = this.zza;
                        long j5 = zzalcVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzalcVar.zzd + zzalcVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = jZzf2;
                                this.zzl = j5;
                            } else {
                                this.zzi = zzadvVar.zzf() + i2;
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < 100000) {
                                this.zzj = j8;
                                jMax = j8;
                            } else {
                                jMax = Math.max(j8, Math.min((zzadvVar.zzf() - (i2 * (j6 <= 0 ? 2L : 1L))) + ((j6 * j9) / (this.zzl - this.zzk)), j7 - 1));
                            }
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (jMax == -1) {
                    }
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzadvVar, -1L);
                this.zza.zzb(zzadvVar, false);
                zzalc zzalcVar2 = this.zza;
                if (zzalcVar2.zzb > this.zzh) {
                    zzadvVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zzadi) zzadvVar).zzo(zzalcVar2.zzd + zzalcVar2.zze, false);
                this.zzi = zzadvVar.zzf();
                this.zzk = this.zza.zzb;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzadvVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzadvVar, false);
        zzalc zzalcVar3 = this.zza;
        ((zzadi) zzadvVar).zzo(zzalcVar3.zzd + zzalcVar3.zze, false);
        long j10 = this.zza.zzb;
        while (true) {
            zzalc zzalcVar4 = this.zza;
            if ((zzalcVar4.zza & 4) == 4 || !zzalcVar4.zzc(zzadvVar, -1L) || zzadvVar.zzf() >= this.zzc || !this.zza.zzb(zzadvVar, true)) {
                break;
            }
            zzalc zzalcVar5 = this.zza;
            if (!zzady.zze(zzadvVar, zzalcVar5.zzd + zzalcVar5.zze)) {
                break;
            }
            j10 = this.zza.zzb;
        }
        this.zzf = j10;
        this.zze = 4;
        return this.zzg;
    }
}
