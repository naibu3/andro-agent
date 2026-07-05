package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzagk implements zzadu {
    private zzadx zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzaie zzg;
    private zzadv zzh;
    private zzagn zzi;
    private zzakj zzj;
    private final zzfu zza = new zzfu(6);
    private long zzf = -1;

    private final int zza(zzadv zzadvVar) throws IOException {
        this.zza.zzH(2);
        ((zzadi) zzadvVar).zzm(this.zza.zzM(), 0, 2, false);
        return this.zza.zzq();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        int i;
        String strZzx;
        zzagm zzagmVarZza;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzH(2);
            ((zzadi) zzadvVar).zzn(this.zza.zzM(), 0, 2, false);
            int iZzq = this.zza.zzq();
            this.zzd = iZzq;
            if (iZzq == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzg();
                return 0;
            }
            if ((iZzq >= 65488 && iZzq <= 65497) || iZzq == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zza.zzH(2);
            ((zzadi) zzadvVar).zzn(this.zza.zzM(), 0, 2, false);
            this.zze = this.zza.zzq() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzadvVar != this.zzh) {
                    this.zzh = zzadvVar;
                    this.zzi = new zzagn(zzadvVar, this.zzf);
                }
                zzakj zzakjVar = this.zzj;
                zzakjVar.getClass();
                int iZzb = zzakjVar.zzb(this.zzi, zzaeqVar);
                if (iZzb == 1) {
                    zzaeqVar.zza += this.zzf;
                }
                return iZzb;
            }
            long jZzf = zzadvVar.zzf();
            long j2 = this.zzf;
            if (jZzf != j2) {
                zzaeqVar.zza = j2;
                return 1;
            }
            if (zzadvVar.zzm(this.zza.zzM(), 0, 1, true)) {
                zzadvVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzakj(zzalt.zza, 8);
                }
                zzagn zzagnVar = new zzagn(zzadvVar, this.zzf);
                this.zzi = zzagnVar;
                if (this.zzj.zzf(zzagnVar)) {
                    zzakj zzakjVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzadx zzadxVar = this.zzb;
                    zzadxVar.getClass();
                    zzakjVar2.zzd(new zzagp(j3, zzadxVar));
                    zzaie zzaieVar = this.zzg;
                    zzaieVar.getClass();
                    zzadx zzadxVar2 = this.zzb;
                    zzadxVar2.getClass();
                    zzafa zzafaVarZzw = zzadxVar2.zzw(1024, 4);
                    zzal zzalVar = new zzal();
                    zzalVar.zzB("image/jpeg");
                    zzalVar.zzQ(new zzcd(-9223372036854775807L, zzaieVar));
                    zzafaVarZzw.zzl(zzalVar.zzad());
                    this.zzc = 5;
                } else {
                    zzg();
                }
            } else {
                zzg();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzfu zzfuVar = new zzfu(this.zze);
            ((zzadi) zzadvVar).zzn(zzfuVar.zzM(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzfuVar.zzx((char) 0)) && (strZzx = zzfuVar.zzx((char) 0)) != null) {
                long jZzd = zzadvVar.zzd();
                if (jZzd != -1 && (zzagmVarZza = zzagq.zza(strZzx)) != null && zzagmVarZza.zzb.size() >= 2) {
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean zEquals = false;
                    for (int size = zzagmVarZza.zzb.size() - 1; size >= 0; size--) {
                        zzagl zzaglVar = (zzagl) zzagmVarZza.zzb.get(size);
                        zEquals |= "video/mp4".equals(zzaglVar.zza);
                        if (size == 0) {
                            jZzd -= zzaglVar.zzd;
                            j = 0;
                        } else {
                            j = jZzd - zzaglVar.zzc;
                        }
                        long j8 = jZzd;
                        jZzd = j;
                        if (zEquals && jZzd != j8) {
                            j7 = j8 - jZzd;
                            j6 = jZzd;
                            zEquals = false;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = jZzd;
                        }
                    }
                    zzaie zzaieVar2 = (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) ? null : new zzaie(j4, j5, zzagmVarZza.zza, j6, j7);
                    this.zzg = zzaieVar2;
                    if (zzaieVar2 != null) {
                        this.zzf = zzaieVar2.zzd;
                    }
                    i = 0;
                }
            } else {
                i = 0;
            }
        } else {
            i = 0;
            ((zzadi) zzadvVar).zzo(this.zze, false);
        }
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        if (zza(zzadvVar) != 65496) {
            return false;
        }
        int iZza = zza(zzadvVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            this.zza.zzH(2);
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(this.zza.zzM(), 0, 2, false);
            zzadiVar.zzl(this.zza.zzq() - 2, false);
            iZza = zza(zzadvVar);
            this.zzd = iZza;
        }
        if (iZza == 65505) {
            zzadi zzadiVar2 = (zzadi) zzadvVar;
            zzadiVar2.zzl(2, false);
            this.zza.zzH(6);
            zzadiVar2.zzm(this.zza.zzM(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzakj zzakjVar = this.zzj;
            zzakjVar.getClass();
            zzakjVar.zze(j, j2);
        }
    }

    private final void zzg() {
        zzadx zzadxVar = this.zzb;
        zzadxVar.getClass();
        zzadxVar.zzD();
        this.zzb.zzO(new zzaes(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
