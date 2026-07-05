package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzajg implements zzadu {
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaje
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzajg(0)};
        }
    };
    private static final zzaho zzb = new zzaho() { // from class: com.google.android.gms.internal.ads.zzajf
    };
    private final zzfu zzc;
    private final zzaen zzd;
    private final zzaej zze;
    private final zzael zzf;
    private final zzafa zzg;
    private zzadx zzh;
    private zzafa zzi;
    private zzafa zzj;
    private int zzk;
    private zzcd zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaji zzq;
    private boolean zzr;

    public zzajg() {
        throw null;
    }

    public zzajg(int i) {
        this.zzc = new zzfu(10);
        this.zzd = new zzaen();
        this.zze = new zzaej();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzael();
        zzadt zzadtVar = new zzadt();
        this.zzg = zzadtVar;
        this.zzj = zzadtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0192  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzg(zzadv zzadvVar) throws IOException {
        int iZzf;
        long j;
        zzaji zzajiVarZzi;
        int i;
        int i2;
        zzcd zzcdVar;
        zzajd zzajdVarZzb;
        long jZzr;
        if (this.zzk == 0) {
            try {
                zzl(zzadvVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzfu zzfuVar = new zzfu(this.zzd.zzc);
            zzadi zzadiVar = (zzadi) zzadvVar;
            zzadiVar.zzm(zzfuVar.zzM(), 0, this.zzd.zzc, false);
            zzaen zzaenVar = this.zzd;
            int i3 = 21;
            if ((zzaenVar.zza & 1) != 0) {
                if (zzaenVar.zze != 1) {
                    i3 = 36;
                }
            } else if (zzaenVar.zze == 1) {
                i3 = 13;
            }
            if (zzfuVar.zze() >= i3 + 4) {
                zzfuVar.zzK(i3);
                int iZzg = zzfuVar.zzg();
                if (iZzg != 1483304551) {
                    if (iZzg == 1231971951) {
                        iZzg = 1231971951;
                    } else if (zzfuVar.zze() >= 40) {
                        zzfuVar.zzK(36);
                        iZzg = zzfuVar.zzg() == 1447187017 ? 1447187017 : 0;
                    }
                }
                if (iZzg == 1231971951) {
                    j = -1;
                    zzajk zzajkVarZza = zzajk.zza(this.zzd, zzfuVar);
                    zzaej zzaejVar = this.zze;
                    if (!zzaejVar.zza() && (i = zzajkVarZza.zzd) != -1 && (i2 = zzajkVarZza.zze) != -1) {
                        zzaejVar.zza = i;
                        zzaejVar.zzb = i2;
                    }
                    long jZzf = zzadvVar.zzf();
                    zzadiVar.zzo(this.zzd.zzc, false);
                    if (iZzg == 1483304551) {
                        zzajiVarZzi = zzajl.zzb(zzadvVar.zzd(), zzajkVarZza, jZzf);
                    } else {
                        long j2 = zzajkVarZza.zzc;
                        zzajiVarZzi = zzi(zzadvVar, j2 != -1 ? jZzf + j2 : -1L, false);
                    }
                    zzcdVar = this.zzl;
                    long jZzf2 = zzadvVar.zzf();
                    if (zzcdVar == null) {
                        int iZza = zzcdVar.zza();
                        for (int i4 = 0; i4 < iZza; i4++) {
                            zzcc zzccVarZzb = zzcdVar.zzb(i4);
                            if (zzccVarZzb instanceof zzahv) {
                                zzahv zzahvVar = (zzahv) zzccVarZzb;
                                int iZza2 = zzcdVar.zza();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= iZza2) {
                                        jZzr = -9223372036854775807L;
                                        break;
                                    }
                                    zzcc zzccVarZzb2 = zzcdVar.zzb(i5);
                                    if (zzccVarZzb2 instanceof zzahz) {
                                        zzahz zzahzVar = (zzahz) zzccVarZzb2;
                                        if (zzahzVar.zzf.equals("TLEN")) {
                                            jZzr = zzgd.zzr(Long.parseLong((String) zzahzVar.zzc.get(0)));
                                            break;
                                        }
                                    }
                                    i5++;
                                }
                                zzajdVarZzb = zzajd.zzb(jZzf2, zzahvVar, jZzr);
                                if (this.zzr) {
                                    zzajiVarZzi = new zzajh();
                                } else {
                                    if (zzajdVarZzb != null) {
                                        zzajiVarZzi = zzajdVarZzb;
                                    } else if (zzajiVarZzi == null) {
                                        zzajiVarZzi = null;
                                    }
                                    if (zzajiVarZzi != null) {
                                        zzajiVarZzi.zzh();
                                    } else {
                                        zzajiVarZzi = zzi(zzadvVar, j, false);
                                    }
                                }
                                this.zzq = zzajiVarZzi;
                                this.zzh.zzO(zzajiVarZzi);
                                zzal zzalVar = new zzal();
                                zzalVar.zzX(this.zzd.zzb);
                                zzalVar.zzP(4096);
                                zzalVar.zzy(this.zzd.zze);
                                zzalVar.zzY(this.zzd.zzd);
                                zzalVar.zzF(this.zze.zza);
                                zzalVar.zzG(this.zze.zzb);
                                zzalVar.zzQ(this.zzl);
                                if (this.zzq.zzc() != -2147483647) {
                                    zzalVar.zzx(this.zzq.zzc());
                                }
                                this.zzj.zzl(zzalVar.zzad());
                                this.zzo = zzadvVar.zzf();
                            }
                        }
                        zzajdVarZzb = null;
                        if (this.zzr) {
                        }
                        this.zzq = zzajiVarZzi;
                        this.zzh.zzO(zzajiVarZzi);
                        zzal zzalVar2 = new zzal();
                        zzalVar2.zzX(this.zzd.zzb);
                        zzalVar2.zzP(4096);
                        zzalVar2.zzy(this.zzd.zze);
                        zzalVar2.zzY(this.zzd.zzd);
                        zzalVar2.zzF(this.zze.zza);
                        zzalVar2.zzG(this.zze.zzb);
                        zzalVar2.zzQ(this.zzl);
                        if (this.zzq.zzc() != -2147483647) {
                        }
                        this.zzj.zzl(zzalVar2.zzad());
                        this.zzo = zzadvVar.zzf();
                    } else {
                        zzajdVarZzb = null;
                        if (this.zzr) {
                        }
                        this.zzq = zzajiVarZzi;
                        this.zzh.zzO(zzajiVarZzi);
                        zzal zzalVar22 = new zzal();
                        zzalVar22.zzX(this.zzd.zzb);
                        zzalVar22.zzP(4096);
                        zzalVar22.zzy(this.zzd.zze);
                        zzalVar22.zzY(this.zzd.zzd);
                        zzalVar22.zzF(this.zze.zza);
                        zzalVar22.zzG(this.zze.zzb);
                        zzalVar22.zzQ(this.zzl);
                        if (this.zzq.zzc() != -2147483647) {
                        }
                        this.zzj.zzl(zzalVar22.zzad());
                        this.zzo = zzadvVar.zzf();
                    }
                } else {
                    if (iZzg == 1447187017) {
                        j = -1;
                        zzajiVarZzi = zzajj.zzb(zzadvVar.zzd(), zzadvVar.zzf(), this.zzd, zzfuVar);
                        zzadiVar.zzo(this.zzd.zzc, false);
                    } else if (iZzg != 1483304551) {
                        zzadvVar.zzj();
                        j = -1;
                        zzajiVarZzi = null;
                    }
                    zzcdVar = this.zzl;
                    long jZzf22 = zzadvVar.zzf();
                    if (zzcdVar == null) {
                    }
                }
            }
        } else {
            long j3 = this.zzo;
            if (j3 != 0) {
                long jZzf3 = zzadvVar.zzf();
                if (jZzf3 < j3) {
                    ((zzadi) zzadvVar).zzo((int) (j3 - jZzf3), false);
                }
            }
        }
        int i6 = this.zzp;
        if (i6 == 0) {
            zzadvVar.zzj();
            if (zzk(zzadvVar)) {
                return -1;
            }
            this.zzc.zzK(0);
            int iZzg2 = this.zzc.zzg();
            if (!zzj(iZzg2, this.zzk) || zzaeo.zzb(iZzg2) == -1) {
                ((zzadi) zzadvVar).zzo(1, false);
                this.zzk = 0;
            } else {
                this.zzd.zza(iZzg2);
                if (this.zzm == -9223372036854775807L) {
                    this.zzm = this.zzq.zze(zzadvVar.zzf());
                }
                int i7 = this.zzd.zzc;
                this.zzp = i7;
                zzaji zzajiVar = this.zzq;
                if (zzajiVar instanceof zzajc) {
                    zzh(this.zzn + r2.zzg);
                    throw null;
                }
                i6 = i7;
                iZzf = this.zzj.zzf(zzadvVar, i6, true);
                if (iZzf != -1) {
                    return -1;
                }
                int i8 = this.zzp - iZzf;
                this.zzp = i8;
                if (i8 <= 0) {
                    this.zzj.zzs(zzh(this.zzn), 1, this.zzd.zzc, 0, null);
                    this.zzn += this.zzd.zzg;
                    this.zzp = 0;
                    return 0;
                }
            }
        } else {
            iZzf = this.zzj.zzf(zzadvVar, i6, true);
            if (iZzf != -1) {
            }
        }
        return 0;
    }

    private final long zzh(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final zzaji zzi(zzadv zzadvVar, long j, boolean z) throws IOException {
        ((zzadi) zzadvVar).zzm(this.zzc.zzM(), 0, 4, false);
        this.zzc.zzK(0);
        this.zzd.zza(this.zzc.zzg());
        if (zzadvVar.zzd() != -1) {
            j = zzadvVar.zzd();
        }
        return new zzajb(j, zzadvVar.zzf(), this.zzd, false);
    }

    private static boolean zzj(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzk(zzadv zzadvVar) throws IOException {
        zzaji zzajiVar = this.zzq;
        if (zzajiVar != null) {
            long jZzd = zzajiVar.zzd();
            if (jZzd != -1 && zzadvVar.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !zzadvVar.zzm(this.zzc.zzM(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzl(zzadv zzadvVar, boolean z) throws IOException {
        int iZze;
        int i;
        int iZzb;
        zzadvVar.zzj();
        if (zzadvVar.zzf() == 0) {
            zzcd zzcdVarZza = this.zzf.zza(zzadvVar, null);
            this.zzl = zzcdVarZza;
            if (zzcdVarZza != null) {
                this.zze.zzb(zzcdVarZza);
            }
            iZze = (int) zzadvVar.zze();
            if (!z) {
                ((zzadi) zzadvVar).zzo(iZze, false);
            }
            i = 0;
        } else {
            iZze = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (!zzk(zzadvVar)) {
                this.zzc.zzK(0);
                int iZzg = this.zzc.zzg();
                if ((i == 0 || zzj(iZzg, i)) && (iZzb = zzaeo.zzb(iZzg)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(iZzg);
                        i = iZzg;
                    }
                    ((zzadi) zzadvVar).zzl(iZzb - 4, false);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzch.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzadvVar.zzj();
                        ((zzadi) zzadvVar).zzl(iZze + i4, false);
                    } else {
                        ((zzadi) zzadvVar).zzo(1, false);
                    }
                    i = 0;
                    i3 = i4;
                    i2 = 0;
                }
            } else if (i2 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzadi) zzadvVar).zzo(iZze + i3, false);
        } else {
            zzadvVar.zzj();
        }
        this.zzk = i;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        zzeq.zzb(this.zzi);
        int i = zzgd.zza;
        int iZzg = zzg(zzadvVar);
        if (iZzg == -1 && (this.zzq instanceof zzajc)) {
            if (this.zzq.zza() != zzh(this.zzn)) {
                throw null;
            }
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzh = zzadxVar;
        zzafa zzafaVarZzw = zzadxVar.zzw(0, 1);
        this.zzi = zzafaVarZzw;
        this.zzj = zzafaVarZzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzaji zzajiVar = this.zzq;
        if (zzajiVar instanceof zzajc) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return zzl(zzadvVar, true);
    }
}
