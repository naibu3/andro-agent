package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzafn implements zzadu {
    private final zzfu zza;
    private final zzafm zzb;
    private final zzalt zzc;
    private int zzd;
    private zzadx zze;
    private zzafo zzf;
    private long zzg;
    private zzafq[] zzh;
    private long zzi;
    private zzafq zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private boolean zzo;

    @Deprecated
    public zzafn() {
        this(1, zzalt.zza);
    }

    private final zzafq zzg(int i) {
        for (zzafq zzafqVar : this.zzh) {
            if (zzafqVar.zzg(i)) {
                return zzafqVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzd = 0;
        this.zze = zzadxVar;
        this.zzi = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzi = -1L;
        this.zzj = null;
        for (zzafq zzafqVar : this.zzh) {
            zzafqVar.zzf(j);
        }
        if (j == 0) {
            this.zzd = this.zzh.length != 0 ? 3 : 0;
        } else {
            this.zzd = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        ((zzadi) zzadvVar).zzm(this.zza.zzM(), 0, 12, false);
        this.zza.zzK(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzL(4);
        return this.zza.zzi() == 541677121;
    }

    public zzafn(int i, zzalt zzaltVar) {
        this.zzc = zzaltVar;
        this.zza = new zzfu(12);
        this.zzb = new zzafm(null);
        this.zze = new zzads();
        this.zzh = new zzafq[0];
        this.zzl = -1L;
        this.zzm = -1L;
        this.zzk = -1;
        this.zzg = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x030b  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        boolean z;
        int i;
        int i2;
        zzafq zzafqVar;
        long j;
        long j2 = this.zzi;
        int i3 = 0;
        if (j2 != -1) {
            long jZzf = zzadvVar.zzf();
            if (j2 < jZzf || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + jZzf) {
                zzaeqVar.zza = j2;
                z = true;
            } else {
                ((zzadi) zzadvVar).zzo((int) (j2 - jZzf), false);
                z = false;
            }
        } else {
            z = false;
        }
        this.zzi = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.zzd;
        zzafq zzafqVar2 = null;
        if (i4 == 0) {
            if (!zzf(zzadvVar)) {
                throw zzch.zza("AVI Header List not found", null);
            }
            ((zzadi) zzadvVar).zzo(12, false);
            this.zzd = 1;
            return 0;
        }
        if (i4 == 1) {
            ((zzadi) zzadvVar).zzn(this.zza.zzM(), 0, 12, false);
            this.zza.zzK(0);
            zzafm zzafmVar = this.zzb;
            zzfu zzfuVar = this.zza;
            zzafmVar.zza(zzfuVar);
            int i5 = zzafmVar.zza;
            if (i5 != 1414744396) {
                throw zzch.zza("LIST expected, found: " + i5, null);
            }
            zzafmVar.zzc = zzfuVar.zzi();
            zzafm zzafmVar2 = this.zzb;
            int i6 = zzafmVar2.zzc;
            if (i6 == 1819436136) {
                this.zzk = zzafmVar2.zzb;
                this.zzd = 2;
                return 0;
            }
            throw zzch.zza("hdrl expected, found: " + i6, null);
        }
        if (i4 == 2) {
            int i7 = this.zzk - 4;
            zzfu zzfuVar2 = new zzfu(i7);
            ((zzadi) zzadvVar).zzn(zzfuVar2.zzM(), 0, i7, false);
            zzafr zzafrVarZzc = zzafr.zzc(1819436136, zzfuVar2);
            if (zzafrVarZzc.zza() != 1819436136) {
                throw zzch.zza("Unexpected header list type " + zzafrVarZzc.zza(), null);
            }
            zzafo zzafoVar = (zzafo) zzafrVarZzc.zzb(zzafo.class);
            if (zzafoVar == null) {
                throw zzch.zza("AviHeader not found", null);
            }
            this.zzf = zzafoVar;
            this.zzg = zzafoVar.zzc * zzafoVar.zza;
            ArrayList arrayList = new ArrayList();
            zzgbc zzgbcVar = zzafrVarZzc.zza;
            int size = zzgbcVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                zzafj zzafjVar = (zzafj) zzgbcVar.get(i8);
                if (zzafjVar.zza() == 1819440243) {
                    zzafr zzafrVar = (zzafr) zzafjVar;
                    int i10 = i9 + 1;
                    zzafp zzafpVar = (zzafp) zzafrVar.zzb(zzafp.class);
                    zzafs zzafsVar = (zzafs) zzafrVar.zzb(zzafs.class);
                    if (zzafpVar == null) {
                        zzfk.zzf("AviExtractor", "Missing Stream Header");
                    } else if (zzafsVar == null) {
                        zzfk.zzf("AviExtractor", "Missing Stream Format");
                    } else {
                        i = i10;
                        long jZzt = zzgd.zzt(zzafpVar.zzd, zzafpVar.zzb * 1000000, zzafpVar.zzc, RoundingMode.FLOOR);
                        zzan zzanVar = zzafsVar.zza;
                        zzal zzalVarZzb = zzanVar.zzb();
                        zzalVarZzb.zzJ(i9);
                        int i11 = zzafpVar.zze;
                        if (i11 != 0) {
                            zzalVarZzb.zzP(i11);
                        }
                        zzaft zzaftVar = (zzaft) zzafrVar.zzb(zzaft.class);
                        if (zzaftVar != null) {
                            zzalVarZzb.zzM(zzaftVar.zza);
                        }
                        int iZzb = zzcg.zzb(zzanVar.zzn);
                        if (iZzb == 1) {
                            i2 = iZzb;
                        } else if (iZzb == 2) {
                            i2 = 2;
                        } else {
                            zzafqVar = null;
                            if (zzafqVar != null) {
                                arrayList.add(zzafqVar);
                            }
                            i9 = i;
                        }
                        zzafa zzafaVarZzw = this.zze.zzw(i9, i2);
                        zzafaVarZzw.zzl(zzalVarZzb.zzad());
                        zzafqVar = new zzafq(i9, i2, jZzt, zzafpVar.zzd, zzafaVarZzw);
                        this.zzg = jZzt;
                        if (zzafqVar != null) {
                        }
                        i9 = i;
                    }
                    zzafqVar = zzafqVar2;
                    i = i10;
                    if (zzafqVar != null) {
                    }
                    i9 = i;
                }
                i8++;
                zzafqVar2 = null;
                i3 = 0;
            }
            int i12 = i3;
            this.zzh = (zzafq[]) arrayList.toArray(new zzafq[i12]);
            this.zze.zzD();
            this.zzd = 3;
            return i12;
        }
        if (i4 == 3) {
            long j3 = this.zzl;
            if (j3 != -1 && zzadvVar.zzf() != j3) {
                this.zzi = j3;
                return 0;
            }
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(this.zza.zzM(), 0, 12, false);
            zzadvVar.zzj();
            this.zza.zzK(0);
            this.zzb.zza(this.zza);
            zzfu zzfuVar3 = this.zza;
            zzafm zzafmVar3 = this.zzb;
            int iZzi = zzfuVar3.zzi();
            int i13 = zzafmVar3.zza;
            if (i13 == 1179011410) {
                zzadiVar.zzo(12, false);
                return 0;
            }
            if (i13 != 1414744396 || iZzi != 1769369453) {
                this.zzi = zzadvVar.zzf() + zzafmVar3.zzb + 8;
                return 0;
            }
            long jZzf2 = zzadvVar.zzf();
            this.zzl = jZzf2;
            long j4 = jZzf2 + zzafmVar3.zzb + 8;
            this.zzm = j4;
            if (!this.zzo) {
                zzafo zzafoVar2 = this.zzf;
                zzafoVar2.getClass();
                if ((zzafoVar2.zzb & 16) == 16) {
                    this.zzd = 4;
                    this.zzi = j4;
                    return 0;
                }
                this.zze.zzO(new zzaes(this.zzg, 0L));
                this.zzo = true;
            }
            this.zzi = zzadvVar.zzf() + 12;
            this.zzd = 6;
            return 0;
        }
        if (i4 == 4) {
            ((zzadi) zzadvVar).zzn(this.zza.zzM(), 0, 8, false);
            this.zza.zzK(0);
            zzfu zzfuVar4 = this.zza;
            int iZzi2 = zzfuVar4.zzi();
            int iZzi3 = zzfuVar4.zzi();
            if (iZzi2 == 829973609) {
                this.zzd = 5;
                this.zzn = iZzi3;
            } else {
                this.zzi = zzadvVar.zzf() + iZzi3;
            }
            return 0;
        }
        if (i4 == 5) {
            zzfu zzfuVar5 = new zzfu(this.zzn);
            ((zzadi) zzadvVar).zzn(zzfuVar5.zzM(), 0, this.zzn, false);
            if (zzfuVar5.zzb() < 16) {
                j = 0;
            } else {
                int iZzd = zzfuVar5.zzd();
                zzfuVar5.zzL(8);
                long jZzi = zzfuVar5.zzi();
                long j5 = this.zzl;
                j = jZzi > j5 ? 0L : j5 + 8;
                zzfuVar5.zzK(iZzd);
            }
            while (zzfuVar5.zzb() >= 16) {
                int iZzi4 = zzfuVar5.zzi();
                int iZzi5 = zzfuVar5.zzi();
                long jZzi2 = zzfuVar5.zzi() + j;
                zzfuVar5.zzi();
                zzafq zzafqVarZzg = zzg(iZzi4);
                if (zzafqVarZzg != null) {
                    if ((iZzi5 & 16) == 16) {
                        zzafqVarZzg.zzb(jZzi2);
                    }
                    zzafqVarZzg.zzd();
                }
            }
            for (zzafq zzafqVar3 : this.zzh) {
                zzafqVar3.zzc();
            }
            this.zzo = true;
            this.zze.zzO(new zzafk(this, this.zzg));
            this.zzd = 6;
            this.zzi = this.zzl;
            return 0;
        }
        if (zzadvVar.zzf() >= this.zzm) {
            return -1;
        }
        zzafq zzafqVar4 = this.zzj;
        if (zzafqVar4 != null) {
            if (!zzafqVar4.zzh(zzadvVar)) {
                return 0;
            }
            this.zzj = null;
            return 0;
        }
        if ((zzadvVar.zzf() & 1) == 1) {
            ((zzadi) zzadvVar).zzo(1, false);
        }
        zzadi zzadiVar2 = (zzadi) zzadvVar;
        zzadiVar2.zzm(this.zza.zzM(), 0, 12, false);
        this.zza.zzK(0);
        int iZzi6 = this.zza.zzi();
        if (iZzi6 == 1414744396) {
            this.zza.zzK(8);
            zzadiVar2.zzo(this.zza.zzi() != 1769369453 ? 8 : 12, false);
            zzadvVar.zzj();
            return 0;
        }
        int iZzi7 = this.zza.zzi();
        if (iZzi6 == 1263424842) {
            this.zzi = zzadvVar.zzf() + iZzi7 + 8;
            return 0;
        }
        zzadiVar2.zzo(8, false);
        zzadvVar.zzj();
        zzafq zzafqVarZzg2 = zzg(iZzi6);
        if (zzafqVarZzg2 == null) {
            this.zzi = zzadvVar.zzf() + iZzi7;
            return 0;
        }
        zzafqVarZzg2.zze(iZzi7);
        this.zzj = zzafqVarZzg2;
        return 0;
    }
}
