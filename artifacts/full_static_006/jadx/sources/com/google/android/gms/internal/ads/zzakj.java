package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzakj implements zzadu, zzaet {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzakh
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            return new zzadu[]{new zzakj(zzalt.zza, 16)};
        }
    };
    private int zzA;
    private zzaie zzB;
    private final zzalt zzb;
    private final int zzc;
    private final zzfu zzd;
    private final zzfu zze;
    private final zzfu zzf;
    private final zzfu zzg;
    private final ArrayDeque zzh;
    private final zzakn zzi;
    private final List zzj;
    private zzgbc zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzfu zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private zzadx zzv;
    private zzaki[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzakj() {
        this(zzalt.zza, 16);
    }

    private static int zzi(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzj(zzaks zzaksVar, long j) {
        int iZza = zzaksVar.zza(j);
        return iZza == -1 ? zzaksVar.zzb(j) : iZza;
    }

    private static long zzk(zzaks zzaksVar, long j, long j2) {
        int iZzj = zzj(zzaksVar, j);
        return iZzj == -1 ? j2 : Math.min(zzaksVar.zzc[iZzj], j2);
    }

    private final void zzl() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private final void zzm(long j) throws zzch {
        zzcd zzcdVar;
        long j2;
        List list;
        zzcd zzcdVar2;
        int i;
        int i2;
        while (!this.zzh.isEmpty() && ((zzajm) this.zzh.peek()).zza == j) {
            zzajm zzajmVar = (zzajm) this.zzh.pop();
            if (zzajmVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i3 = this.zzA;
                zzaej zzaejVar = new zzaej();
                zzajn zzajnVarZzb = zzajmVar.zzb(1969517665);
                if (zzajnVarZzb != null) {
                    zzcd zzcdVarZzb = zzajw.zzb(zzajnVarZzb);
                    zzaejVar.zzb(zzcdVarZzb);
                    zzcdVar = zzcdVarZzb;
                } else {
                    zzcdVar = null;
                }
                zzajm zzajmVarZza = zzajmVar.zza(1835365473);
                zzcd zzcdVarZza = zzajmVarZza != null ? zzajw.zza(zzajmVarZza) : null;
                zzcc[] zzccVarArr = new zzcc[1];
                zzajn zzajnVarZzb2 = zzajmVar.zzb(1836476516);
                zzajnVarZzb2.getClass();
                boolean z = i3 == 1;
                zzccVarArr[0] = zzajw.zzc(zzajnVarZzb2.zza);
                zzcd zzcdVar3 = new zzcd(-9223372036854775807L, zzccVarArr);
                zzcd zzcdVar4 = zzcdVar;
                long j3 = -9223372036854775807L;
                List listZzd = zzajw.zzd(zzajmVar, zzaejVar, -9223372036854775807L, null, 1 == (this.zzc & 1), z, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzakg
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        return (zzakp) obj;
                    }
                });
                long j4 = -9223372036854775807L;
                int i4 = 0;
                int size = -1;
                int i5 = 0;
                while (true) {
                    j2 = 0;
                    if (i5 >= listZzd.size()) {
                        break;
                    }
                    zzaks zzaksVar = (zzaks) listZzd.get(i5);
                    if (zzaksVar.zzb == 0) {
                        list = listZzd;
                    } else {
                        zzakp zzakpVar = zzaksVar.zza;
                        list = listZzd;
                        long j5 = zzakpVar.zze;
                        if (j5 == j3) {
                            j5 = zzaksVar.zzh;
                        }
                        long jMax = Math.max(j4, j5);
                        int i6 = i4 + 1;
                        zzaki zzakiVar = new zzaki(zzakpVar, zzaksVar, this.zzv.zzw(i4, zzakpVar.zzb));
                        int i7 = "audio/true-hd".equals(zzakpVar.zzf.zzn) ? zzaksVar.zze * 16 : zzaksVar.zze + 30;
                        zzal zzalVarZzb = zzakpVar.zzf.zzb();
                        zzalVarZzb.zzP(i7);
                        if (zzakpVar.zzb == 2) {
                            if ((this.zzc & 8) != 0) {
                                zzalVarZzb.zzV(zzakpVar.zzf.zzg | (size == -1 ? 1 : 2));
                            }
                            if (j5 > 0 && (i2 = zzaksVar.zzb) > 0) {
                                zzalVarZzb.zzH(i2 / (j5 / 1000000.0f));
                            }
                        }
                        int i8 = zzakpVar.zzb;
                        int i9 = zzakf.zzb;
                        if (i8 == 1 && zzaejVar.zza()) {
                            zzalVarZzb.zzF(zzaejVar.zza);
                            zzalVarZzb.zzG(zzaejVar.zzb);
                        }
                        int i10 = zzakpVar.zzb;
                        zzcd[] zzcdVarArr = new zzcd[3];
                        if (this.zzj.isEmpty()) {
                            i = 0;
                            zzcdVar2 = null;
                        } else {
                            zzcdVar2 = new zzcd(this.zzj);
                            i = 0;
                        }
                        zzcdVarArr[i] = zzcdVar2;
                        zzcdVarArr[1] = zzcdVar4;
                        zzcdVarArr[2] = zzcdVar3;
                        int i11 = size;
                        zzcd zzcdVar5 = new zzcd(-9223372036854775807L, new zzcc[i]);
                        if (zzcdVarZza != null) {
                            for (int i12 = 0; i12 < zzcdVarZza.zza(); i12++) {
                                zzcc zzccVarZzb = zzcdVarZza.zzb(i12);
                                if (zzccVarZzb instanceof zzgh) {
                                    zzgh zzghVar = (zzgh) zzccVarZzb;
                                    if (!zzghVar.zza.equals("com.android.capture.fps")) {
                                        zzcdVar5 = zzcdVar5.zzc(zzghVar);
                                    } else if (i10 == 2) {
                                        zzcdVar5 = zzcdVar5.zzc(zzghVar);
                                    }
                                }
                            }
                        }
                        for (int i13 = 0; i13 < 3; i13++) {
                            zzcdVar5 = zzcdVar5.zzd(zzcdVarArr[i13]);
                        }
                        if (zzcdVar5.zza() > 0) {
                            zzalVarZzb.zzQ(zzcdVar5);
                        }
                        zzakiVar.zzc.zzl(zzalVarZzb.zzad());
                        size = (zzakpVar.zzb == 2 && i11 == -1) ? arrayList.size() : i11;
                        arrayList.add(zzakiVar);
                        i4 = i6;
                        j4 = jMax;
                    }
                    i5++;
                    listZzd = list;
                    j3 = -9223372036854775807L;
                }
                this.zzy = size;
                this.zzz = j4;
                zzaki[] zzakiVarArr = (zzaki[]) arrayList.toArray(new zzaki[0]);
                this.zzw = zzakiVarArr;
                int length = zzakiVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i14 = 0; i14 < zzakiVarArr.length; i14++) {
                    jArr[i14] = new long[zzakiVarArr[i14].zzb.zzb];
                    jArr2[i14] = zzakiVarArr[i14].zzb.zzf[0];
                }
                int i15 = 0;
                while (i15 < zzakiVarArr.length) {
                    int i16 = -1;
                    long j6 = Long.MAX_VALUE;
                    for (int i17 = 0; i17 < zzakiVarArr.length; i17++) {
                        if (!zArr[i17]) {
                            long j7 = jArr2[i17];
                            if (j7 <= j6) {
                                i16 = i17;
                                j6 = j7;
                            }
                        }
                    }
                    int i18 = iArr[i16];
                    long[] jArr3 = jArr[i16];
                    jArr3[i18] = j2;
                    zzaks zzaksVar2 = zzakiVarArr[i16].zzb;
                    j2 += zzaksVar2.zzd[i18];
                    int i19 = i18 + 1;
                    iArr[i16] = i19;
                    if (i19 < jArr3.length) {
                        jArr2[i16] = zzaksVar2.zzf[i19];
                    } else {
                        zArr[i16] = true;
                        i15++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzh.clear();
                this.zzl = 2;
            } else if (!this.zzh.isEmpty()) {
                ((zzajm) this.zzh.peek()).zzc(zzajmVar);
            }
        }
        if (this.zzl != 2) {
            zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        if ((this.zzc & 16) == 0) {
            zzadxVar = new zzalw(zzadxVar, this.zzb);
        }
        this.zzv = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        if (j == 0) {
            if (this.zzl != 3) {
                zzl();
                return;
            } else {
                this.zzi.zzb();
                this.zzj.clear();
                return;
            }
        }
        for (zzaki zzakiVar : this.zzw) {
            zzaks zzaksVar = zzakiVar.zzb;
            int iZza = zzaksVar.zza(j2);
            if (iZza == -1) {
                iZza = zzaksVar.zzb(j2);
            }
            zzakiVar.zze = iZza;
            zzafb zzafbVar = zzakiVar.zzd;
            if (zzafbVar != null) {
                zzafbVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzaex zzaexVarZzb = zzako.zzb(zzadvVar, (this.zzc & 2) != 0);
        this.zzk = zzaexVarZzb != null ? zzgbc.zzn(zzaexVarZzb) : zzgbc.zzm();
        return zzaexVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j) {
        long j2;
        long j3;
        int iZzb;
        zzaki[] zzakiVarArr = this.zzw;
        if (zzakiVarArr.length == 0) {
            zzaeu zzaeuVar = zzaeu.zza;
            return new zzaer(zzaeuVar, zzaeuVar);
        }
        int i = this.zzy;
        long jZzk = -1;
        if (i != -1) {
            zzaks zzaksVar = zzakiVarArr[i].zzb;
            int iZzj = zzj(zzaksVar, j);
            if (iZzj == -1) {
                zzaeu zzaeuVar2 = zzaeu.zza;
                return new zzaer(zzaeuVar2, zzaeuVar2);
            }
            long j4 = zzaksVar.zzf[iZzj];
            j2 = zzaksVar.zzc[iZzj];
            if (j4 >= j || iZzj >= zzaksVar.zzb - 1 || (iZzb = zzaksVar.zzb(j)) == -1 || iZzb == iZzj) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzaksVar.zzf[iZzb];
                jZzk = zzaksVar.zzc[iZzb];
            }
            j = j4;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaki[] zzakiVarArr2 = this.zzw;
            if (i2 >= zzakiVarArr2.length) {
                break;
            }
            if (i2 != this.zzy) {
                zzaks zzaksVar2 = zzakiVarArr2[i2].zzb;
                long jZzk2 = zzk(zzaksVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jZzk = zzk(zzaksVar2, j3, jZzk);
                }
                j2 = jZzk2;
            }
            i2++;
        }
        zzaeu zzaeuVar3 = new zzaeu(j, j2);
        return j3 == -9223372036854775807L ? new zzaer(zzaeuVar3, zzaeuVar3) : new zzaer(zzaeuVar3, new zzaeu(j3, jZzk));
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }

    public zzakj(zzalt zzaltVar, int i) {
        this.zzb = zzaltVar;
        this.zzc = i;
        this.zzk = zzgbc.zzm();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzakn();
        this.zzj = new ArrayList();
        this.zzg = new zzfu(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzfu(zzgr.zza);
        this.zze = new zzfu(4);
        this.zzf = new zzfu();
        this.zzq = -1;
        this.zzv = zzadx.zza;
        this.zzw = new zzaki[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzl;
            if (i == 0) {
                if (this.zzo == 0) {
                    if (!zzadvVar.zzn(this.zzg.zzM(), 0, 8, true)) {
                        if (this.zzA != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzafa zzafaVarZzw = this.zzv.zzw(0, 4);
                        zzaie zzaieVar = this.zzB;
                        zzcd zzcdVar = zzaieVar == null ? null : new zzcd(-9223372036854775807L, zzaieVar);
                        zzal zzalVar = new zzal();
                        zzalVar.zzQ(zzcdVar);
                        zzafaVarZzw.zzl(zzalVar.zzad());
                        this.zzv.zzD();
                        this.zzv.zzO(new zzaes(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    this.zzg.zzK(0);
                    this.zzn = this.zzg.zzu();
                    this.zzm = this.zzg.zzg();
                }
                long j = this.zzn;
                if (j == 1) {
                    zzadvVar.zzi(this.zzg.zzM(), 8, 8);
                    this.zzo += 8;
                    this.zzn = this.zzg.zzv();
                } else if (j == 0) {
                    long jZzd = zzadvVar.zzd();
                    if (jZzd == -1) {
                        zzajm zzajmVar = (zzajm) this.zzh.peek();
                        jZzd = zzajmVar != null ? zzajmVar.zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzn = (jZzd - zzadvVar.zzf()) + this.zzo;
                    }
                }
                long j2 = this.zzn;
                int i2 = this.zzo;
                if (j2 < i2) {
                    throw zzch.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.zzm;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                    long jZzf = zzadvVar.zzf();
                    long j3 = this.zzn;
                    long j4 = jZzf + j3;
                    long j5 = this.zzo;
                    if (j3 != j5 && this.zzm == 1835365473) {
                        this.zzf.zzH(8);
                        zzadvVar.zzh(this.zzf.zzM(), 0, 8);
                        zzajw.zze(this.zzf);
                        zzadvVar.zzk(this.zzf.zzd());
                        zzadvVar.zzj();
                    }
                    long j6 = j4 - j5;
                    this.zzh.push(new zzajm(this.zzm, j6));
                    if (this.zzn == this.zzo) {
                        zzm(j6);
                    } else {
                        zzl();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    zzeq.zzf(i2 == 8);
                    zzeq.zzf(this.zzn <= 2147483647L);
                    zzfu zzfuVar = new zzfu((int) this.zzn);
                    System.arraycopy(this.zzg.zzM(), 0, zzfuVar.zzM(), 0, 8);
                    this.zzp = zzfuVar;
                    this.zzl = 1;
                } else {
                    long jZzf2 = zzadvVar.zzf();
                    long j7 = this.zzo;
                    long j8 = jZzf2 - j7;
                    if (this.zzm == 1836086884) {
                        this.zzB = new zzaie(0L, j8, -9223372036854775807L, j8 + j7, this.zzn - j7);
                    }
                    this.zzp = null;
                    this.zzl = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        this.zzi.zza(zzadvVar, zzaeqVar, this.zzj);
                        if (zzaeqVar.zza == 0) {
                            zzl();
                        }
                        return 1;
                    }
                    long jZzf3 = zzadvVar.zzf();
                    int i4 = this.zzq;
                    if (i4 == -1) {
                        int i5 = -1;
                        int i6 = -1;
                        boolean z3 = true;
                        boolean z4 = true;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        int i7 = 0;
                        while (true) {
                            zzaki[] zzakiVarArr = this.zzw;
                            if (i7 >= zzakiVarArr.length) {
                                break;
                            }
                            zzaki zzakiVar = zzakiVarArr[i7];
                            int i8 = zzakiVar.zze;
                            zzaks zzaksVar = zzakiVar.zzb;
                            if (i8 != zzaksVar.zzb) {
                                long j12 = zzaksVar.zzc[i8];
                                long[][] jArr = this.zzx;
                                int i9 = zzgd.zza;
                                long j13 = jArr[i7][i8];
                                long j14 = j12 - jZzf3;
                                boolean z5 = j14 < 0 || j14 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z5) {
                                    z = z4;
                                } else {
                                    if (!z4) {
                                        z = false;
                                    }
                                    z4 = z5;
                                    i6 = i7;
                                    j11 = j14;
                                    j10 = j13;
                                    if (j13 >= j9) {
                                        z3 = z5;
                                        i5 = i7;
                                        j9 = j13;
                                    }
                                }
                                if (z5 != z || j14 >= j11) {
                                    z4 = z;
                                } else {
                                    z4 = z5;
                                    i6 = i7;
                                    j11 = j14;
                                    j10 = j13;
                                }
                                if (j13 >= j9) {
                                }
                            }
                            i7++;
                        }
                        i4 = (j9 == Long.MAX_VALUE || !z3 || j10 < j9 + 10485760) ? i6 : i5;
                        this.zzq = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    }
                    zzaki zzakiVar2 = this.zzw[i4];
                    zzafa zzafaVar = zzakiVar2.zzc;
                    int i10 = zzakiVar2.zze;
                    zzaks zzaksVar2 = zzakiVar2.zzb;
                    long j15 = zzaksVar2.zzc[i10];
                    int i11 = zzaksVar2.zzd[i10];
                    zzafb zzafbVar = zzakiVar2.zzd;
                    long j16 = (j15 - jZzf3) + this.zzr;
                    if (j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzaeqVar.zza = j15;
                        return 1;
                    }
                    if (zzakiVar2.zza.zzg == 1) {
                        j16 += 8;
                        i11 -= 8;
                    }
                    zzadvVar.zzk((int) j16);
                    zzakp zzakpVar = zzakiVar2.zza;
                    int i12 = zzakpVar.zzj;
                    if (i12 == 0) {
                        if ("audio/ac4".equals(zzakpVar.zzf.zzn)) {
                            if (this.zzs == 0) {
                                zzacw.zzb(i11, this.zzf);
                                zzafaVar.zzq(this.zzf, 7);
                                this.zzs += 7;
                            }
                            i11 += 7;
                        } else if (zzafbVar != null) {
                            zzafbVar.zzd(zzadvVar);
                        }
                        while (true) {
                            int i13 = this.zzs;
                            if (i13 >= i11) {
                                break;
                            }
                            int iZzf = zzafaVar.zzf(zzadvVar, i11 - i13, false);
                            this.zzr += iZzf;
                            this.zzs += iZzf;
                            this.zzt -= iZzf;
                        }
                    } else {
                        byte[] bArrZzM = this.zze.zzM();
                        bArrZzM[0] = 0;
                        bArrZzM[1] = 0;
                        bArrZzM[2] = 0;
                        int i14 = 4 - i12;
                        while (this.zzs < i11) {
                            int i15 = this.zzt;
                            if (i15 == 0) {
                                zzadvVar.zzi(bArrZzM, i14, i12);
                                this.zzr += i12;
                                this.zze.zzK(0);
                                int iZzg = this.zze.zzg();
                                if (iZzg < 0) {
                                    throw zzch.zza("Invalid NAL length", null);
                                }
                                this.zzt = iZzg;
                                this.zzd.zzK(0);
                                zzafaVar.zzq(this.zzd, 4);
                                this.zzs += 4;
                                i11 += i14;
                            } else {
                                int iZzf2 = zzafaVar.zzf(zzadvVar, i15, false);
                                this.zzr += iZzf2;
                                this.zzs += iZzf2;
                                this.zzt -= iZzf2;
                            }
                        }
                    }
                    zzaks zzaksVar3 = zzakiVar2.zzb;
                    long j17 = zzaksVar3.zzf[i10];
                    int i16 = zzaksVar3.zzg[i10];
                    if (zzafbVar != null) {
                        zzafbVar.zzc(zzafaVar, j17, i16, i11, 0, null);
                        if (i10 + 1 == zzakiVar2.zzb.zzb) {
                            zzafbVar.zza(zzafaVar, null);
                        }
                    } else {
                        zzafaVar.zzs(j17, i16, i11, 0, null);
                    }
                    zzakiVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    return 0;
                }
                long j18 = this.zzn - this.zzo;
                long jZzf4 = zzadvVar.zzf() + j18;
                zzfu zzfuVar2 = this.zzp;
                if (zzfuVar2 != null) {
                    zzadvVar.zzi(zzfuVar2.zzM(), this.zzo, (int) j18);
                    if (this.zzm == 1718909296) {
                        this.zzu = true;
                        zzfuVar2.zzK(8);
                        int iZzi = zzi(zzfuVar2.zzg());
                        if (iZzi == 0) {
                            zzfuVar2.zzL(4);
                            while (true) {
                                if (zzfuVar2.zzb() <= 0) {
                                    iZzi = 0;
                                    break;
                                }
                                iZzi = zzi(zzfuVar2.zzg());
                                if (iZzi != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzA = iZzi;
                    } else if (!this.zzh.isEmpty()) {
                        ((zzajm) this.zzh.peek()).zzd(new zzajn(this.zzm, zzfuVar2));
                    }
                } else {
                    if (!this.zzu && this.zzm == 1835295092) {
                        this.zzA = 1;
                    }
                    if (j18 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzadvVar.zzk((int) j18);
                    } else {
                        zzaeqVar.zza = zzadvVar.zzf() + j18;
                        z2 = true;
                        zzm(jZzf4);
                        if (z2 && this.zzl != 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                zzm(jZzf4);
                if (z2) {
                    continue;
                }
            }
        }
    }
}
