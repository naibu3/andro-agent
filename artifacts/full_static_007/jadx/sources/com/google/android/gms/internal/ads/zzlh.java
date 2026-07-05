package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzlh implements Handler.Callback, zzvl, zzzl, zzme, zzje, zzmh {
    private boolean zzA;
    private boolean zzC;
    private boolean zzF;
    private int zzG;
    private zzlg zzH;
    private long zzI;
    private int zzJ;
    private boolean zzK;
    private zzjh zzL;
    private final zzjs zzN;
    private final zzja zzO;
    private final zzmn[] zza;
    private final Set zzb;
    private final zzmp[] zzc;
    private final zzzm zzd;
    private final zzzn zze;
    private final zzlk zzf;
    private final zzzu zzg;
    private final zzfb zzh;
    private final HandlerThread zzi;
    private final Looper zzj;
    private final zzdb zzk;
    private final zzcz zzl;
    private final long zzm;
    private final zzjf zzn;
    private final ArrayList zzo;
    private final zzer zzp;
    private final zzlt zzq;
    private final zzmf zzr;
    private final long zzs;
    private final zzpj zzt;
    private zzmr zzu;
    private zzmg zzv;
    private zzlf zzw;
    private boolean zzx;
    private boolean zzz;
    private int zzD = 0;
    private boolean zzE = false;
    private boolean zzy = false;
    private long zzM = -9223372036854775807L;
    private long zzB = -9223372036854775807L;

    public zzlh(zzmn[] zzmnVarArr, zzzm zzzmVar, zzzn zzznVar, zzlk zzlkVar, zzzu zzzuVar, int i, boolean z, zzmx zzmxVar, zzmr zzmrVar, zzja zzjaVar, long j, boolean z2, Looper looper, zzer zzerVar, zzjs zzjsVar, zzpj zzpjVar, Looper looper2) {
        this.zzN = zzjsVar;
        this.zza = zzmnVarArr;
        this.zzd = zzzmVar;
        this.zze = zzznVar;
        this.zzf = zzlkVar;
        this.zzg = zzzuVar;
        int i2 = 0;
        this.zzu = zzmrVar;
        this.zzO = zzjaVar;
        this.zzs = j;
        this.zzp = zzerVar;
        this.zzt = zzpjVar;
        this.zzm = zzlkVar.zzb(zzpjVar);
        zzlkVar.zzg(zzpjVar);
        this.zzv = zzmg.zzg(zzznVar);
        this.zzw = new zzlf(this.zzv);
        int length = zzmnVarArr.length;
        this.zzc = new zzmp[2];
        zzmo zzmoVarZze = zzzmVar.zze();
        while (true) {
            int length2 = zzmnVarArr.length;
            if (i2 >= 2) {
                this.zzn = new zzjf(this, zzerVar);
                this.zzo = new ArrayList();
                this.zzb = Collections.newSetFromMap(new IdentityHashMap());
                this.zzk = new zzdb();
                this.zzl = new zzcz();
                zzzmVar.zzs(this, zzzuVar);
                this.zzK = true;
                zzfb zzfbVarZzb = zzerVar.zzb(looper, null);
                this.zzq = new zzlt(zzmxVar, zzfbVarZzb, new zzkz(this));
                this.zzr = new zzmf(this, zzmxVar, zzfbVarZzb, zzpjVar);
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                this.zzi = handlerThread;
                handlerThread.start();
                Looper looper3 = handlerThread.getLooper();
                this.zzj = looper3;
                this.zzh = zzerVar.zzb(looper3, this);
                return;
            }
            zzmnVarArr[i2].zzu(i2, zzpjVar, zzerVar);
            this.zzc[i2] = zzmnVarArr[i2].zzl();
            this.zzc[i2].zzL(zzmoVarZze);
            i2++;
        }
    }

    private final void zzA(zzmn zzmnVar) throws zzjh {
        if (zzaf(zzmnVar)) {
            this.zzn.zzd(zzmnVar);
            zzam(zzmnVar);
            zzmnVar.zzq();
            this.zzG--;
        }
    }

    private final void zzB() throws zzjh {
        int length = this.zza.length;
        zzC(new boolean[2], this.zzq.zzf().zzf());
    }

    private final void zzC(boolean[] zArr, long j) throws zzjh {
        zzlq zzlqVarZzf = this.zzq.zzf();
        zzzn zzznVarZzi = zzlqVarZzf.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                break;
            }
            if (!zzznVarZzi.zzb(i) && this.zzb.remove(this.zza[i])) {
                this.zza[i].zzI();
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            int length2 = this.zza.length;
            if (i2 >= 2) {
                zzlqVarZzf.zzg = true;
                return;
            }
            if (zzznVarZzi.zzb(i2)) {
                boolean z = zArr[i2];
                zzmn zzmnVar = this.zza[i2];
                if (!zzaf(zzmnVar)) {
                    zzlt zzltVar = this.zzq;
                    zzlq zzlqVarZzf2 = zzltVar.zzf();
                    boolean z2 = zzlqVarZzf2 == zzltVar.zze();
                    zzzn zzznVarZzi2 = zzlqVarZzf2.zzi();
                    zzmq zzmqVar = zzznVarZzi2.zzb[i2];
                    zzan[] zzanVarArrZzak = zzak(zzznVarZzi2.zzc[i2]);
                    boolean z3 = zzai() && this.zzv.zze == 3;
                    boolean z4 = !z && z3;
                    this.zzG++;
                    this.zzb.add(zzmnVar);
                    zzmnVar.zzr(zzmqVar, zzanVarArrZzak, zzlqVarZzf2.zzc[i2], this.zzI, z4, z2, j, zzlqVarZzf2.zze(), zzlqVarZzf2.zzf.zza);
                    zzmnVar.zzt(11, new zzla(this));
                    this.zzn.zze(zzmnVar);
                    if (z3 && z2) {
                        zzmnVar.zzO();
                    }
                }
            }
            i2++;
        }
    }

    private final void zzD(IOException iOException, int i) {
        zzlt zzltVar = this.zzq;
        zzjh zzjhVarZzc = zzjh.zzc(iOException, i);
        zzlq zzlqVarZze = zzltVar.zze();
        if (zzlqVarZze != null) {
            zzjhVarZzc = zzjhVarZzc.zza(zzlqVarZze.zzf.zza);
        }
        zzfk.zzd("ExoPlayerImplInternal", "Playback error", zzjhVarZzc);
        zzW(false, false);
        this.zzv = this.zzv.zzd(zzjhVarZzc);
    }

    private final void zzE(boolean z) {
        zzlq zzlqVarZzd = this.zzq.zzd();
        zzvo zzvoVar = zzlqVarZzd == null ? this.zzv.zzb : zzlqVarZzd.zzf.zza;
        boolean zEquals = this.zzv.zzk.equals(zzvoVar);
        if (!zEquals) {
            this.zzv = this.zzv.zza(zzvoVar);
        }
        zzmg zzmgVar = this.zzv;
        zzmgVar.zzp = zzlqVarZzd == null ? zzmgVar.zzr : zzlqVarZzd.zzc();
        this.zzv.zzq = zzt();
        if ((!zEquals || z) && zzlqVarZzd != null && zzlqVarZzd.zzd) {
            zzZ(zzlqVarZzd.zzf.zza, zzlqVarZzd.zzh(), zzlqVarZzd.zzi());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041f  */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80, types: [int] */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r21v0, types: [long] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.internal.ads.zzdc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzF(zzdc zzdcVar, boolean z) throws Throwable {
        ?? r21;
        zzvo zzvoVar;
        zzcz zzczVar;
        int i;
        zzdb zzdbVar;
        long j;
        Object obj;
        int iZzg;
        long jLongValue;
        boolean z2;
        boolean z3;
        boolean z4;
        int iZzg2;
        boolean z5;
        long j2;
        boolean z6;
        long jZzv;
        boolean z7;
        boolean z8;
        boolean z9;
        zzvo zzvoVarZzh;
        long j3;
        int i2;
        boolean z10;
        int iZzg3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
        int i4;
        boolean z15;
        int i5;
        zzlg zzlgVar;
        zzlg zzlgVar2;
        int i6;
        boolean z16;
        boolean z17;
        long j4;
        int i7;
        boolean z18;
        int i8;
        boolean z19;
        zzmg zzmgVar = this.zzv;
        zzlg zzlgVar3 = this.zzH;
        int i9 = this.zzD;
        boolean z20 = this.zzE;
        if (zzdcVar.zzo()) {
            zzvoVarZzh = zzmg.zzh();
            j3 = -9223372036854775807L;
            z7 = false;
            z8 = true;
            z9 = false;
            z6 = true;
            jZzv = 0;
            j = 0;
        } else {
            zzcz zzczVar2 = this.zzl;
            zzvo zzvoVar2 = zzmgVar.zzb;
            Object obj2 = zzvoVar2.zza;
            boolean zZzah = zzah(zzmgVar, zzczVar2);
            r21 = (zzmgVar.zzb.zzb() || zZzah) ? zzmgVar.zzc : zzmgVar.zzr;
            zzdb zzdbVar2 = this.zzk;
            if (zzlgVar3 != null) {
                zzvoVar = zzvoVar2;
                zzczVar = zzczVar2;
                Pair pairZzy = zzy(zzdcVar, zzlgVar3, true, i9, z20, zzdbVar2, zzczVar);
                if (pairZzy == null) {
                    iZzg3 = zzdcVar.zzg(z20);
                    jLongValue = r21;
                    obj = obj2;
                    z12 = false;
                    z11 = false;
                    z13 = true;
                } else {
                    if (zzlgVar3.zzc == -9223372036854775807L) {
                        iZzg3 = zzdcVar.zzn(pairZzy.first, zzczVar).zzd;
                        jLongValue = r21;
                        obj = obj2;
                        z10 = false;
                    } else {
                        Object obj3 = pairZzy.first;
                        jLongValue = ((Long) pairZzy.second).longValue();
                        obj = obj3;
                        z10 = true;
                        iZzg3 = -1;
                    }
                    z11 = zzmgVar.zze == 4;
                    z12 = z10;
                    z13 = false;
                }
                z2 = z11;
                z3 = z13;
                iZzg = iZzg3;
                zzdbVar = zzdbVar2;
                i = -1;
                j = 0;
                z4 = z12;
            } else {
                zzvoVar = zzvoVar2;
                zzczVar = zzczVar2;
                if (zzmgVar.zza.zzo()) {
                    iZzg = zzdcVar.zzg(z20);
                    zzdbVar = zzdbVar2;
                    jLongValue = r21;
                    obj = obj2;
                    z2 = false;
                    z3 = false;
                    i = -1;
                } else if (zzdcVar.zza(obj2) == -1) {
                    i = -1;
                    Object objZzf = zzf(zzdbVar2, zzczVar, i9, z20, obj2, zzmgVar.zza, zzdcVar);
                    if (objZzf == null) {
                        iZzg2 = zzdcVar.zzg(z20);
                        z5 = true;
                    } else {
                        iZzg2 = zzdcVar.zzn(objZzf, zzczVar).zzd;
                        z5 = false;
                    }
                    iZzg = iZzg2;
                    z3 = z5;
                    obj = obj2;
                    zzdbVar = zzdbVar2;
                    jLongValue = r21;
                    z2 = false;
                } else {
                    i = -1;
                    if (r21 == -9223372036854775807L) {
                        iZzg = zzdcVar.zzn(obj2, zzczVar).zzd;
                        obj = obj2;
                        zzdbVar = zzdbVar2;
                        jLongValue = r21;
                        z2 = false;
                        z3 = false;
                    } else if (zZzah) {
                        zzmgVar.zza.zzn(zzvoVar.zza, zzczVar);
                        zzdbVar = zzdbVar2;
                        if (zzmgVar.zza.zze(zzczVar.zzd, zzdbVar, 0L).zzp == zzmgVar.zza.zza(zzvoVar.zza)) {
                            j = 0;
                            Pair pairZzl = zzdcVar.zzl(zzdbVar, zzczVar, zzdcVar.zzn(obj2, zzczVar).zzd, r21);
                            Object obj4 = pairZzl.first;
                            jLongValue = ((Long) pairZzl.second).longValue();
                            obj = obj4;
                        } else {
                            j = 0;
                            obj = obj2;
                            jLongValue = r21;
                        }
                        iZzg = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        zzdbVar = zzdbVar2;
                        j = 0;
                        obj = obj2;
                        iZzg = -1;
                        jLongValue = r21;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                z4 = false;
                j = 0;
            }
            if (iZzg != i) {
                Pair pairZzl2 = zzdcVar.zzl(zzdbVar, zzczVar, iZzg, -9223372036854775807L);
                Object obj5 = pairZzl2.first;
                long jLongValue2 = ((Long) pairZzl2.second).longValue();
                obj = obj5;
                j2 = jLongValue2;
                jLongValue = -9223372036854775807L;
            } else {
                j2 = jLongValue;
            }
            zzvo zzvoVarZzi = this.zzq.zzi(zzdcVar, obj, j2);
            int i10 = zzvoVarZzi.zze;
            boolean z21 = zzvoVar.zza.equals(obj) && !zzvoVar.zzb() && !zzvoVarZzi.zzb() && (i10 == i || ((i2 = zzvoVar.zze) != i && i10 >= i2));
            zzcz zzczVarZzn = zzdcVar.zzn(obj, zzczVar);
            if (!zZzah && r21 == jLongValue && zzvoVar.zza.equals(zzvoVarZzi.zza)) {
                if (zzvoVar.zzb()) {
                    zzczVarZzn.zzn(zzvoVar.zzb);
                }
                if (zzvoVarZzi.zzb()) {
                    zzczVarZzn.zzn(zzvoVarZzi.zzb);
                }
            }
            z6 = true;
            if (true == z21) {
                zzvoVarZzi = zzvoVar;
            }
            if (zzvoVarZzi.zzb()) {
                if (zzvoVarZzi.equals(zzvoVar)) {
                    j2 = zzmgVar.zzr;
                } else {
                    zzdcVar.zzn(zzvoVarZzi.zza, zzczVar);
                    if (zzvoVarZzi.zzc == zzczVar.zze(zzvoVarZzi.zzb)) {
                        zzczVar.zzj();
                    }
                    j2 = j;
                }
            }
            jZzv = j2;
            z7 = z2;
            z8 = z3;
            z9 = z4;
            zzvoVarZzh = zzvoVarZzi;
            j3 = jLongValue;
        }
        boolean z22 = (this.zzv.zzb.equals(zzvoVarZzh) && jZzv == this.zzv.zzr) ? false : z6;
        if (z8) {
            try {
                if (this.zzv.zze != z6) {
                    i3 = 4;
                    try {
                        zzU(4);
                    } catch (Throwable th) {
                        th = th;
                        i4 = 4;
                        z15 = z9;
                        zzlgVar = null;
                        i5 = i4;
                        zzmg zzmgVar2 = this.zzv;
                        zzab(zzdcVar, zzvoVarZzh, zzmgVar2.zza, zzmgVar2.zzb, true != z15 ? -9223372036854775807L : jZzv, false);
                        if (z22) {
                        }
                        zzN();
                        zzP(zzdcVar, this.zzv.zza);
                        this.zzv = this.zzv.zzf(zzdcVar);
                        if (!zzdcVar.zzo()) {
                        }
                        zzE(false);
                        throw th;
                    }
                } else {
                    i3 = 4;
                }
                z14 = false;
                try {
                    zzM(false, false, false, z6);
                } catch (Throwable th2) {
                    th = th2;
                    i4 = i3;
                    z15 = z9;
                    zzlgVar = null;
                    i5 = i4;
                    zzmg zzmgVar22 = this.zzv;
                    zzab(zzdcVar, zzvoVarZzh, zzmgVar22.zza, zzmgVar22.zzb, true != z15 ? -9223372036854775807L : jZzv, false);
                    if (z22 || j3 != this.zzv.zzc) {
                        zzmg zzmgVar3 = this.zzv;
                        Object obj6 = zzmgVar3.zzb.zza;
                        zzdc zzdcVar2 = zzmgVar3.zza;
                        zzlgVar2 = zzlgVar;
                        this.zzv = zzz(zzvoVarZzh, jZzv, j3, this.zzv.zzd, (z22 || !z || zzdcVar2.zzo() || zzdcVar2.zzn(obj6, this.zzl).zzg) ? false : true, zzdcVar.zza(obj6) == -1 ? i5 : 3);
                    } else {
                        zzlgVar2 = zzlgVar;
                    }
                    zzN();
                    zzP(zzdcVar, this.zzv.zza);
                    this.zzv = this.zzv.zzf(zzdcVar);
                    if (!zzdcVar.zzo()) {
                        this.zzH = zzlgVar2;
                    }
                    zzE(false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z14 = false;
                i3 = 4;
                i4 = i3;
                z15 = z9;
                zzlgVar = null;
                i5 = i4;
                zzmg zzmgVar222 = this.zzv;
                zzab(zzdcVar, zzvoVarZzh, zzmgVar222.zza, zzmgVar222.zzb, true != z15 ? -9223372036854775807L : jZzv, false);
                if (z22) {
                }
                zzN();
                zzP(zzdcVar, this.zzv.zza);
                this.zzv = this.zzv.zzf(zzdcVar);
                if (!zzdcVar.zzo()) {
                }
                zzE(false);
                throw th;
            }
        } else {
            z14 = false;
            i3 = 4;
        }
        zzmn[] zzmnVarArr = this.zza;
        int length = zzmnVarArr.length;
        ?? r1 = z14;
        while (true) {
            i6 = 2;
            if (r1 < 2) {
                zzmnVarArr[r1].zzN(zzdcVar);
                r1++;
            } else {
                try {
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        if (z22) {
            z18 = z14;
            i8 = i3;
            z17 = z9;
            if (!zzdcVar.zzo()) {
                for (zzlq zzlqVarZze = this.zzq.zze(); zzlqVarZze != null; zzlqVarZze = zzlqVarZze.zzg()) {
                    if (zzlqVarZze.zzf.zza.equals(zzvoVarZzh)) {
                        zzlqVarZze.zzf = this.zzq.zzh(zzdcVar, zzlqVarZze.zzf);
                        zzlqVarZze.zzq();
                    }
                }
                jZzv = zzv(zzvoVarZzh, jZzv, z7);
            }
        } else {
            try {
                zzlt zzltVar = this.zzq;
                long j5 = this.zzI;
                zzlq zzlqVarZzf = zzltVar.zzf();
                if (zzlqVarZzf == null) {
                    z17 = z9;
                    j4 = j;
                } else {
                    long jZze = zzlqVarZzf.zze();
                    try {
                        z17 = z9;
                        if (zzlqVarZzf.zzd) {
                            long jMax = jZze;
                            int i11 = 0;
                            while (true) {
                                try {
                                    zzmn[] zzmnVarArr2 = this.zza;
                                    int length2 = zzmnVarArr2.length;
                                    if (i11 >= i6) {
                                        j4 = jMax;
                                        break;
                                    }
                                    if (zzaf(zzmnVarArr2[i11]) && this.zza[i11].zzo() == zzlqVarZzf.zzc[i11]) {
                                        i7 = i11;
                                        long jZzcW = this.zza[i11].zzcW();
                                        j4 = Long.MIN_VALUE;
                                        if (jZzcW == Long.MIN_VALUE) {
                                            break;
                                        } else {
                                            jMax = Math.max(jZzcW, jMax);
                                        }
                                    } else {
                                        i7 = i11;
                                    }
                                    i11 = i7 + 1;
                                    i6 = 2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    z15 = z17;
                                    zzlgVar = null;
                                    i5 = 4;
                                    zzmg zzmgVar2222 = this.zzv;
                                    zzab(zzdcVar, zzvoVarZzh, zzmgVar2222.zza, zzmgVar2222.zzb, true != z15 ? -9223372036854775807L : jZzv, false);
                                    if (z22) {
                                    }
                                    zzN();
                                    zzP(zzdcVar, this.zzv.zza);
                                    this.zzv = this.zzv.zzf(zzdcVar);
                                    if (!zzdcVar.zzo()) {
                                    }
                                    zzE(false);
                                    throw th;
                                }
                            }
                        } else {
                            j4 = jZze;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r21 = i3;
                        z16 = z9;
                        z6 = false;
                        z15 = z16;
                        i4 = r21;
                        zzlgVar = null;
                        i5 = i4;
                        zzmg zzmgVar22222 = this.zzv;
                        zzab(zzdcVar, zzvoVarZzh, zzmgVar22222.zza, zzmgVar22222.zzb, true != z15 ? -9223372036854775807L : jZzv, false);
                        if (z22) {
                            zzmg zzmgVar32 = this.zzv;
                            Object obj62 = zzmgVar32.zzb.zza;
                            zzdc zzdcVar22 = zzmgVar32.zza;
                            if (z22) {
                                zzlgVar2 = zzlgVar;
                                this.zzv = zzz(zzvoVarZzh, jZzv, j3, this.zzv.zzd, (z22 || !z || zzdcVar22.zzo() || zzdcVar22.zzn(obj62, this.zzl).zzg) ? false : true, zzdcVar.zza(obj62) == -1 ? i5 : 3);
                            }
                        }
                        zzN();
                        zzP(zzdcVar, this.zzv.zza);
                        this.zzv = this.zzv.zzf(zzdcVar);
                        if (!zzdcVar.zzo()) {
                        }
                        zzE(false);
                        throw th;
                    }
                }
                z18 = false;
                i8 = 4;
                if (!zzltVar.zzp(zzdcVar, j5, j4)) {
                    zzR(false);
                }
            } catch (Throwable th7) {
                th = th7;
                z6 = z14;
                r21 = i3;
                z16 = z9;
            }
        }
        zzmg zzmgVar4 = this.zzv;
        zzab(zzdcVar, zzvoVarZzh, zzmgVar4.zza, zzmgVar4.zzb, true != z17 ? -9223372036854775807L : jZzv, false);
        if (z22 || j3 != this.zzv.zzc) {
            zzmg zzmgVar5 = this.zzv;
            Object obj7 = zzmgVar5.zzb.zza;
            zzdc zzdcVar3 = zzmgVar5.zza;
            z19 = z18;
            this.zzv = zzz(zzvoVarZzh, jZzv, j3, this.zzv.zzd, (!z22 || !z || zzdcVar3.zzo() || zzdcVar3.zzn(obj7, this.zzl).zzg) ? z18 : true, zzdcVar.zza(obj7) == -1 ? i8 : 3);
        } else {
            z19 = z18;
        }
        zzN();
        zzP(zzdcVar, this.zzv.zza);
        this.zzv = this.zzv.zzf(zzdcVar);
        if (!zzdcVar.zzo()) {
            this.zzH = null;
        }
        zzE(z19);
    }

    private final void zzG(zzcl zzclVar, boolean z) throws zzjh {
        zzH(zzclVar, zzclVar.zzc, true, z);
    }

    private final void zzH(zzcl zzclVar, float f, boolean z, boolean z2) throws zzjh {
        int i;
        zzlh zzlhVar = this;
        if (z) {
            if (z2) {
                zzlhVar.zzw.zza(1);
            }
            zzmg zzmgVar = zzlhVar.zzv;
            zzdc zzdcVar = zzmgVar.zza;
            zzvo zzvoVar = zzmgVar.zzb;
            long j = zzmgVar.zzc;
            long j2 = zzmgVar.zzd;
            int i2 = zzmgVar.zze;
            zzjh zzjhVar = zzmgVar.zzf;
            boolean z3 = zzmgVar.zzg;
            zzxr zzxrVar = zzmgVar.zzh;
            zzzn zzznVar = zzmgVar.zzi;
            List list = zzmgVar.zzj;
            zzvo zzvoVar2 = zzmgVar.zzk;
            boolean z4 = zzmgVar.zzl;
            int i3 = zzmgVar.zzm;
            long j3 = zzmgVar.zzp;
            long j4 = zzmgVar.zzq;
            long j5 = zzmgVar.zzr;
            long j6 = zzmgVar.zzs;
            boolean z5 = zzmgVar.zzo;
            zzlhVar = this;
            zzlhVar.zzv = new zzmg(zzdcVar, zzvoVar, j, j2, i2, zzjhVar, z3, zzxrVar, zzznVar, list, zzvoVar2, z4, i3, zzclVar, j3, j4, j5, j6, false);
        }
        float f2 = zzclVar.zzc;
        zzlq zzlqVarZze = zzlhVar.zzq.zze();
        while (true) {
            i = 0;
            if (zzlqVarZze == null) {
                break;
            }
            zzzg[] zzzgVarArr = zzlqVarZze.zzi().zzc;
            int length = zzzgVarArr.length;
            while (i < length) {
                zzzg zzzgVar = zzzgVarArr[i];
                i++;
            }
            zzlqVarZze = zzlqVarZze.zzg();
        }
        zzmn[] zzmnVarArr = zzlhVar.zza;
        int length2 = zzmnVarArr.length;
        while (i < 2) {
            zzmn zzmnVar = zzmnVarArr[i];
            if (zzmnVar != null) {
                zzmnVar.zzM(f, zzclVar.zzc);
            }
            i++;
        }
    }

    private final void zzI() {
        long jZze;
        long jZze2;
        boolean zZzh = false;
        if (zzae()) {
            zzlq zzlqVarZzd = this.zzq.zzd();
            long jZzu = zzu(zzlqVarZzd.zzd());
            if (zzlqVarZzd == this.zzq.zze()) {
                jZze = this.zzI;
                jZze2 = zzlqVarZzd.zze();
            } else {
                jZze = this.zzI - zzlqVarZzd.zze();
                jZze2 = zzlqVarZzd.zzf.zzb;
            }
            long j = jZze - jZze2;
            boolean zZzh2 = this.zzf.zzh(this.zzt, this.zzv.zza, zzlqVarZzd.zzf.zza, j, jZzu, this.zzn.zzc().zzc);
            if (zZzh2 || jZzu >= 500000 || this.zzm <= 0) {
                zZzh = zZzh2;
            } else {
                this.zzq.zze().zza.zzj(this.zzv.zzr, false);
                zZzh = this.zzf.zzh(this.zzt, this.zzv.zza, zzlqVarZzd.zzf.zza, j, jZzu, this.zzn.zzc().zzc);
            }
        }
        this.zzC = zZzh;
        if (zZzh) {
            this.zzq.zzd().zzk(this.zzI, this.zzn.zzc().zzc, this.zzB);
        }
        zzY();
    }

    private final void zzJ() {
        this.zzw.zzc(this.zzv);
        if (this.zzw.zzg) {
            zzjs zzjsVar = this.zzN;
            zzjsVar.zza.zzT(this.zzw);
            this.zzw = new zzlf(this.zzv);
        }
    }

    private final void zzK() throws zzjh {
        int i;
        float f = this.zzn.zzc().zzc;
        zzlt zzltVar = this.zzq;
        zzlq zzlqVarZze = zzltVar.zze();
        zzlq zzlqVarZzf = zzltVar.zzf();
        zzzn zzznVar = null;
        boolean z = true;
        while (zzlqVarZze != null && zzlqVarZze.zzd) {
            zzzn zzznVarZzj = zzlqVarZze.zzj(f, this.zzv.zza);
            zzzn zzznVar2 = zzlqVarZze == this.zzq.zze() ? zzznVarZzj : zzznVar;
            zzzn zzznVarZzi = zzlqVarZze.zzi();
            boolean z2 = false;
            if (zzznVarZzi != null) {
                if (zzznVarZzi.zzc.length == zzznVarZzj.zzc.length) {
                    for (int i2 = 0; i2 < zzznVarZzj.zzc.length; i2++) {
                        if (zzznVarZzj.zza(zzznVarZzi, i2)) {
                        }
                    }
                    if (zzlqVarZze != zzlqVarZzf) {
                        z2 = true;
                    }
                    z &= z2;
                    zzlqVarZze = zzlqVarZze.zzg();
                    zzznVar = zzznVar2;
                }
            }
            if (z) {
                zzlt zzltVar2 = this.zzq;
                zzlq zzlqVarZze2 = zzltVar2.zze();
                boolean zZzn = zzltVar2.zzn(zzlqVarZze2);
                int length = this.zza.length;
                boolean[] zArr = new boolean[2];
                zzznVar2.getClass();
                long jZzb = zzlqVarZze2.zzb(zzznVar2, this.zzv.zzr, zZzn, zArr);
                zzmg zzmgVar = this.zzv;
                boolean z3 = (zzmgVar.zze == 4 || jZzb == zzmgVar.zzr) ? false : true;
                zzmg zzmgVar2 = this.zzv;
                i = 2;
                this.zzv = zzz(zzmgVar2.zzb, jZzb, zzmgVar2.zzc, zzmgVar2.zzd, z3, 5);
                if (z3) {
                    zzO(jZzb);
                }
                int length2 = this.zza.length;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (true) {
                    zzmn[] zzmnVarArr = this.zza;
                    int length3 = zzmnVarArr.length;
                    if (i3 >= 2) {
                        break;
                    }
                    zzmn zzmnVar = zzmnVarArr[i3];
                    boolean zZzaf = zzaf(zzmnVar);
                    zArr2[i3] = zZzaf;
                    zzxf zzxfVar = zzlqVarZze2.zzc[i3];
                    if (zZzaf) {
                        if (zzxfVar != zzmnVar.zzo()) {
                            zzA(zzmnVar);
                        } else if (zArr[i3]) {
                            zzmnVar.zzJ(this.zzI);
                        }
                    }
                    i3++;
                }
                zzC(zArr2, this.zzI);
            } else {
                i = 2;
                this.zzq.zzn(zzlqVarZze);
                if (zzlqVarZze.zzd) {
                    zzlqVarZze.zza(zzznVarZzj, Math.max(zzlqVarZze.zzf.zzb, this.zzI - zzlqVarZze.zze()), false);
                }
            }
            zzE(true);
            if (this.zzv.zze != 4) {
                zzI();
                zzaa();
                this.zzh.zzi(i);
                return;
            }
            return;
        }
    }

    private final void zzL() throws zzjh {
        zzK();
        zzR(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[PHI: r2 r6 r8
      0x00a3: PHI (r2v2 com.google.android.gms.internal.ads.zzvo) = (r2v1 com.google.android.gms.internal.ads.zzvo), (r2v19 com.google.android.gms.internal.ads.zzvo) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r8v3 long) = (r8v2 long), (r8v6 long) binds: [B:30:0x007b, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[PHI: r0
      0x00ee: PHI (r0v11 com.google.android.gms.internal.ads.zzdc) = 
      (r0v10 com.google.android.gms.internal.ads.zzdc)
      (r0v10 com.google.android.gms.internal.ads.zzdc)
      (r0v15 com.google.android.gms.internal.ads.zzdc)
      (r0v15 com.google.android.gms.internal.ads.zzdc)
     binds: [B:36:0x00b2, B:38:0x00b6, B:40:0x00c7, B:42:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzM(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        zzdc zzdcVar;
        zzvo zzvoVar;
        this.zzh.zzf(2);
        this.zzL = null;
        zzac(false, true);
        this.zzn.zzi();
        this.zzI = 1000000000000L;
        zzmn[] zzmnVarArr = this.zza;
        int length = zzmnVarArr.length;
        for (int i = 0; i < 2; i++) {
            try {
                zzA(zzmnVarArr[i]);
            } catch (zzjh | RuntimeException e) {
                zzfk.zzd("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            zzmn[] zzmnVarArr2 = this.zza;
            int length2 = zzmnVarArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                zzmn zzmnVar = zzmnVarArr2[i2];
                if (this.zzb.remove(zzmnVar)) {
                    try {
                        zzmnVar.zzI();
                    } catch (RuntimeException e2) {
                        zzfk.zzd("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.zzG = 0;
        zzmg zzmgVar = this.zzv;
        zzvo zzvoVar2 = zzmgVar.zzb;
        long jLongValue = zzmgVar.zzr;
        long j = (this.zzv.zzb.zzb() || zzah(this.zzv, this.zzl)) ? this.zzv.zzc : this.zzv.zzr;
        if (z2) {
            this.zzH = null;
            Pair pairZzx = zzx(this.zzv.zza);
            zzvoVar2 = (zzvo) pairZzx.first;
            jLongValue = ((Long) pairZzx.second).longValue();
            j = -9223372036854775807L;
            z5 = zzvoVar2.equals(this.zzv.zzb) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.zzq.zzj();
        this.zzC = false;
        zzdc zzdcVarZzx = this.zzv.zza;
        if (z3 && (zzdcVarZzx instanceof zzml)) {
            zzdcVarZzx = ((zzml) zzdcVarZzx).zzx(this.zzr.zzq());
            if (zzvoVar2.zzb != -1) {
                zzdcVarZzx.zzn(zzvoVar2.zza, this.zzl);
                zzcz zzczVar = this.zzl;
                zzdb zzdbVar = this.zzk;
                zzdcVarZzx.zze(zzczVar.zzd, zzdbVar, 0L);
                if (zzdbVar.zzb()) {
                    zzdcVar = zzdcVarZzx;
                    zzvoVar = new zzvo(zzvoVar2.zza, zzvoVar2.zzd);
                }
            }
        } else {
            zzdcVar = zzdcVarZzx;
            zzvoVar = zzvoVar2;
        }
        zzmg zzmgVar2 = this.zzv;
        int i3 = zzmgVar2.zze;
        zzjh zzjhVar = z4 ? null : zzmgVar2.zzf;
        zzxr zzxrVar = z5 ? zzxr.zza : zzmgVar2.zzh;
        zzzn zzznVar = z5 ? this.zze : this.zzv.zzi;
        List listZzm = z5 ? zzgbc.zzm() : this.zzv.zzj;
        zzmg zzmgVar3 = this.zzv;
        this.zzv = new zzmg(zzdcVar, zzvoVar, j3, j2, i3, zzjhVar, false, zzxrVar, zzznVar, listZzm, zzvoVar, zzmgVar3.zzl, zzmgVar3.zzm, zzmgVar3.zzn, j2, 0L, j2, 0L, false);
        if (z3) {
            this.zzr.zzh();
        }
    }

    private final void zzN() {
        zzlq zzlqVarZze = this.zzq.zze();
        boolean z = false;
        if (zzlqVarZze != null && zzlqVarZze.zzf.zzh && this.zzy) {
            z = true;
        }
        this.zzz = z;
    }

    private final void zzO(long j) throws zzjh {
        zzlq zzlqVarZze = this.zzq.zze();
        long jZze = j + (zzlqVarZze == null ? 1000000000000L : zzlqVarZze.zze());
        this.zzI = jZze;
        this.zzn.zzf(jZze);
        zzmn[] zzmnVarArr = this.zza;
        int length = zzmnVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzmn zzmnVar = zzmnVarArr[i];
            if (zzaf(zzmnVar)) {
                zzmnVar.zzJ(this.zzI);
            }
        }
        for (zzlq zzlqVarZze2 = this.zzq.zze(); zzlqVarZze2 != null; zzlqVarZze2 = zzlqVarZze2.zzg()) {
            for (zzzg zzzgVar : zzlqVarZze2.zzi().zzc) {
            }
        }
    }

    private final void zzP(zzdc zzdcVar, zzdc zzdcVar2) {
        if (zzdcVar.zzo() && zzdcVar2.zzo()) {
            return;
        }
        int size = this.zzo.size() - 1;
        if (size < 0) {
            Collections.sort(this.zzo);
            return;
        }
        zzle zzleVar = (zzle) this.zzo.get(size);
        Object obj = zzleVar.zzb;
        zzmj zzmjVar = zzleVar.zza;
        int i = zzgd.zza;
        zzmj zzmjVar2 = zzleVar.zza;
        throw null;
    }

    private final void zzQ(long j, long j2) {
        this.zzh.zzj(2, j + j2);
    }

    private final void zzR(boolean z) throws zzjh {
        zzvo zzvoVar = this.zzq.zze().zzf.zza;
        long jZzw = zzw(zzvoVar, this.zzv.zzr, true, false);
        if (jZzw != this.zzv.zzr) {
            zzmg zzmgVar = this.zzv;
            this.zzv = zzz(zzvoVar, jZzw, zzmgVar.zzc, zzmgVar.zzd, z, 5);
        }
    }

    private final void zzS(zzcl zzclVar) {
        this.zzh.zzf(16);
        this.zzn.zzg(zzclVar);
    }

    private final void zzT(boolean z, int i, boolean z2, int i2) throws zzjh {
        this.zzw.zza(z2 ? 1 : 0);
        this.zzw.zzb(i2);
        this.zzv = this.zzv.zzc(z, i);
        zzac(false, false);
        for (zzlq zzlqVarZze = this.zzq.zze(); zzlqVarZze != null; zzlqVarZze = zzlqVarZze.zzg()) {
            for (zzzg zzzgVar : zzlqVarZze.zzi().zzc) {
            }
        }
        if (!zzai()) {
            zzX();
            zzaa();
            return;
        }
        int i3 = this.zzv.zze;
        if (i3 != 3) {
            if (i3 == 2) {
                this.zzh.zzi(2);
            }
        } else {
            zzac(false, false);
            this.zzn.zzh();
            zzV();
            this.zzh.zzi(2);
        }
    }

    private final void zzU(int i) {
        zzmg zzmgVar = this.zzv;
        if (zzmgVar.zze != i) {
            if (i != 2) {
                this.zzM = -9223372036854775807L;
            }
            this.zzv = zzmgVar.zze(i);
        }
    }

    private final void zzV() throws zzjh {
        zzlq zzlqVarZze = this.zzq.zze();
        if (zzlqVarZze == null) {
            return;
        }
        zzzn zzznVarZzi = zzlqVarZze.zzi();
        int i = 0;
        while (true) {
            int length = this.zza.length;
            if (i >= 2) {
                return;
            }
            if (zzznVarZzi.zzb(i) && this.zza[i].zzcU() == 1) {
                this.zza[i].zzO();
            }
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzM(z || !this.zzF, false, true, false);
        this.zzw.zza(z2 ? 1 : 0);
        this.zzf.zze(this.zzt);
        zzU(1);
    }

    private final void zzX() throws zzjh {
        this.zzn.zzi();
        zzmn[] zzmnVarArr = this.zza;
        int length = zzmnVarArr.length;
        for (int i = 0; i < 2; i++) {
            zzmn zzmnVar = zzmnVarArr[i];
            if (zzaf(zzmnVar)) {
                zzam(zzmnVar);
            }
        }
    }

    private final void zzY() {
        zzlq zzlqVarZzd = this.zzq.zzd();
        boolean z = this.zzC || (zzlqVarZzd != null && zzlqVarZzd.zza.zzp());
        zzmg zzmgVar = this.zzv;
        if (z != zzmgVar.zzg) {
            zzdc zzdcVar = zzmgVar.zza;
            zzvo zzvoVar = zzmgVar.zzb;
            long j = zzmgVar.zzc;
            long j2 = zzmgVar.zzd;
            int i = zzmgVar.zze;
            zzjh zzjhVar = zzmgVar.zzf;
            zzxr zzxrVar = zzmgVar.zzh;
            zzzn zzznVar = zzmgVar.zzi;
            List list = zzmgVar.zzj;
            zzvo zzvoVar2 = zzmgVar.zzk;
            boolean z2 = zzmgVar.zzl;
            int i2 = zzmgVar.zzm;
            zzcl zzclVar = zzmgVar.zzn;
            long j3 = zzmgVar.zzp;
            long j4 = zzmgVar.zzq;
            long j5 = zzmgVar.zzr;
            long j6 = zzmgVar.zzs;
            boolean z3 = zzmgVar.zzo;
            this.zzv = new zzmg(zzdcVar, zzvoVar, j, j2, i, zzjhVar, z, zzxrVar, zzznVar, list, zzvoVar2, z2, i2, zzclVar, j3, j4, j5, j6, false);
        }
    }

    private final void zzZ(zzvo zzvoVar, zzxr zzxrVar, zzzn zzznVar) {
        zzdc zzdcVar = this.zzv.zza;
        zzzg[] zzzgVarArr = zzznVar.zzc;
        this.zzf.zzf(this.zzt, zzdcVar, zzvoVar, this.zza, zzxrVar, zzzgVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ad, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaa() throws zzjh {
        zzle zzleVar;
        zzlq zzlqVarZze = this.zzq.zze();
        if (zzlqVarZze == null) {
            return;
        }
        long jZzd = zzlqVarZze.zzd ? zzlqVarZze.zza.zzd() : -9223372036854775807L;
        if (jZzd != -9223372036854775807L) {
            if (!zzlqVarZze.zzr()) {
                this.zzq.zzn(zzlqVarZze);
                zzE(false);
                zzI();
            }
            zzO(jZzd);
            if (jZzd != this.zzv.zzr) {
                zzmg zzmgVar = this.zzv;
                this.zzv = zzz(zzmgVar.zzb, jZzd, zzmgVar.zzc, jZzd, true, 5);
            }
        } else {
            long jZzb = this.zzn.zzb(zzlqVarZze != this.zzq.zzf());
            this.zzI = jZzb;
            long jZze = jZzb - zzlqVarZze.zze();
            long j = this.zzv.zzr;
            if (!this.zzo.isEmpty() && !this.zzv.zzb.zzb()) {
                if (this.zzK) {
                    j--;
                    this.zzK = false;
                }
                zzmg zzmgVar2 = this.zzv;
                int iZza = zzmgVar2.zza.zza(zzmgVar2.zzb.zza);
                int iMin = Math.min(this.zzJ, this.zzo.size());
                if (iMin > 0) {
                    zzleVar = (zzle) this.zzo.get(iMin - 1);
                    while (zzleVar != null && (iZza < 0 || (iZza == 0 && j < 0))) {
                        int i = iMin - 1;
                        if (i > 0) {
                            zzleVar = (zzle) this.zzo.get(iMin - 2);
                            iMin = i;
                        } else {
                            iMin = i;
                        }
                    }
                    if (iMin < this.zzo.size()) {
                    }
                    this.zzJ = iMin;
                }
                zzleVar = null;
            }
            if (this.zzn.zzj()) {
                zzmg zzmgVar3 = this.zzv;
                this.zzv = zzz(zzmgVar3.zzb, jZze, zzmgVar3.zzc, jZze, true, 6);
            } else {
                zzmg zzmgVar4 = this.zzv;
                zzmgVar4.zzr = jZze;
                zzmgVar4.zzs = SystemClock.elapsedRealtime();
            }
        }
        this.zzv.zzp = this.zzq.zzd().zzc();
        this.zzv.zzq = zzt();
        zzmg zzmgVar5 = this.zzv;
        if (zzmgVar5.zzl && zzmgVar5.zze == 3 && zzaj(zzmgVar5.zza, zzmgVar5.zzb)) {
            zzmg zzmgVar6 = this.zzv;
            if (zzmgVar6.zzn.zzc == 1.0f) {
                float fZza = this.zzO.zza(zzs(zzmgVar6.zza, zzmgVar6.zzb.zza, zzmgVar6.zzr), zzt());
                if (this.zzn.zzc().zzc != fZza) {
                    zzS(new zzcl(fZza, this.zzv.zzn.zzd));
                    zzH(this.zzv.zzn, this.zzn.zzc().zzc, false, false);
                }
            }
        }
    }

    private final void zzab(zzdc zzdcVar, zzvo zzvoVar, zzdc zzdcVar2, zzvo zzvoVar2, long j, boolean z) throws zzjh {
        if (!zzaj(zzdcVar, zzvoVar)) {
            zzcl zzclVar = zzvoVar.zzb() ? zzcl.zza : this.zzv.zzn;
            if (this.zzn.zzc().equals(zzclVar)) {
                return;
            }
            zzS(zzclVar);
            zzH(this.zzv.zzn, zzclVar.zzc, false, false);
            return;
        }
        zzdcVar.zze(zzdcVar.zzn(zzvoVar.zza, this.zzl).zzd, this.zzk, 0L);
        zzja zzjaVar = this.zzO;
        zzbk zzbkVar = this.zzk.zzl;
        int i = zzgd.zza;
        zzjaVar.zzd(zzbkVar);
        if (j != -9223372036854775807L) {
            this.zzO.zze(zzs(zzdcVar, zzvoVar.zza, j));
            return;
        }
        if (!zzgd.zzG(!zzdcVar2.zzo() ? zzdcVar2.zze(zzdcVar2.zzn(zzvoVar2.zza, this.zzl).zzd, this.zzk, 0L).zzc : null, this.zzk.zzc) || z) {
            this.zzO.zze(-9223372036854775807L);
        }
    }

    private final void zzac(boolean z, boolean z2) {
        this.zzA = z;
        this.zzB = z2 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void zzad(zzfyw zzfywVar, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((zzkx) zzfywVar).zza.zzx).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean zzae() {
        zzlq zzlqVarZzd = this.zzq.zzd();
        return (zzlqVarZzd == null || zzlqVarZzd.zzd() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean zzaf(zzmn zzmnVar) {
        return zzmnVar.zzcU() != 0;
    }

    private final boolean zzag() {
        zzlq zzlqVarZze = this.zzq.zze();
        long j = zzlqVarZze.zzf.zze;
        if (!zzlqVarZze.zzd) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzv.zzr < j) {
            return true;
        }
        return !zzai();
    }

    private static boolean zzah(zzmg zzmgVar, zzcz zzczVar) {
        zzvo zzvoVar = zzmgVar.zzb;
        zzdc zzdcVar = zzmgVar.zza;
        return zzdcVar.zzo() || zzdcVar.zzn(zzvoVar.zza, zzczVar).zzg;
    }

    private final boolean zzai() {
        zzmg zzmgVar = this.zzv;
        return zzmgVar.zzl && zzmgVar.zzm == 0;
    }

    private final boolean zzaj(zzdc zzdcVar, zzvo zzvoVar) {
        if (!zzvoVar.zzb() && !zzdcVar.zzo()) {
            zzdcVar.zze(zzdcVar.zzn(zzvoVar.zza, this.zzl).zzd, this.zzk, 0L);
            if (this.zzk.zzb()) {
                zzdb zzdbVar = this.zzk;
                if (zzdbVar.zzj && zzdbVar.zzg != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static zzan[] zzak(zzzg zzzgVar) {
        int iZzc = zzzgVar != null ? zzzgVar.zzc() : 0;
        zzan[] zzanVarArr = new zzan[iZzc];
        for (int i = 0; i < iZzc; i++) {
            zzanVarArr[i] = zzzgVar.zzd(i);
        }
        return zzanVarArr;
    }

    private static final void zzal(zzmj zzmjVar) throws zzjh {
        zzmjVar.zzj();
        try {
            zzmjVar.zzc().zzt(zzmjVar.zza(), zzmjVar.zzg());
        } finally {
            zzmjVar.zzh(true);
        }
    }

    private static final void zzam(zzmn zzmnVar) {
        if (zzmnVar.zzcU() == 2) {
            zzmnVar.zzP();
        }
    }

    private static final void zzan(zzmn zzmnVar, long j) {
        zzmnVar.zzK();
        if (zzmnVar instanceof zzxv) {
            throw null;
        }
    }

    public static /* synthetic */ zzlq zzd(zzlh zzlhVar, zzlr zzlrVar, long j) {
        zzlk zzlkVar = zzlhVar.zzf;
        zzzm zzzmVar = zzlhVar.zzd;
        zzzv zzzvVarZzj = zzlkVar.zzj();
        zzzn zzznVar = zzlhVar.zze;
        return new zzlq(zzlhVar.zzc, j, zzzmVar, zzzvVarZzj, zzlhVar.zzr, zzlrVar, zzznVar);
    }

    static Object zzf(zzdb zzdbVar, zzcz zzczVar, int i, boolean z, Object obj, zzdc zzdcVar, zzdc zzdcVar2) {
        int iZza = zzdcVar.zza(obj);
        int iZzb = zzdcVar.zzb();
        int i2 = 0;
        int iZzi = iZza;
        int iZza2 = -1;
        while (true) {
            if (i2 >= iZzb || iZza2 != -1) {
                break;
            }
            iZzi = zzdcVar.zzi(iZzi, zzczVar, zzdbVar, i, z);
            if (iZzi == -1) {
                iZza2 = -1;
                break;
            }
            iZza2 = zzdcVar2.zza(zzdcVar.zzf(iZzi));
            i2++;
        }
        if (iZza2 == -1) {
            return null;
        }
        return zzdcVar2.zzf(iZza2);
    }

    static final /* synthetic */ void zzr(zzmj zzmjVar) {
        try {
            zzal(zzmjVar);
        } catch (zzjh e) {
            zzfk.zzd("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    private final long zzs(zzdc zzdcVar, Object obj, long j) {
        zzdcVar.zze(zzdcVar.zzn(obj, this.zzl).zzd, this.zzk, 0L);
        zzdb zzdbVar = this.zzk;
        if (zzdbVar.zzg != -9223372036854775807L && zzdbVar.zzb()) {
            zzdb zzdbVar2 = this.zzk;
            if (zzdbVar2.zzj) {
                long j2 = zzdbVar2.zzh;
                return zzgd.zzr((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - this.zzk.zzg) - j;
            }
        }
        return -9223372036854775807L;
    }

    private final long zzt() {
        return zzu(this.zzv.zzp);
    }

    private final long zzu(long j) {
        zzlq zzlqVarZzd = this.zzq.zzd();
        if (zzlqVarZzd == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzI - zzlqVarZzd.zze()));
    }

    private final long zzv(zzvo zzvoVar, long j, boolean z) throws zzjh {
        zzlt zzltVar = this.zzq;
        return zzw(zzvoVar, j, zzltVar.zze() != zzltVar.zzf(), z);
    }

    private final long zzw(zzvo zzvoVar, long j, boolean z, boolean z2) throws zzjh {
        zzX();
        zzac(false, true);
        if (z2 || this.zzv.zze == 3) {
            zzU(2);
        }
        zzlq zzlqVarZze = this.zzq.zze();
        zzlq zzlqVarZzg = zzlqVarZze;
        while (zzlqVarZzg != null && !zzvoVar.equals(zzlqVarZzg.zzf.zza)) {
            zzlqVarZzg = zzlqVarZzg.zzg();
        }
        if (z || zzlqVarZze != zzlqVarZzg || (zzlqVarZzg != null && zzlqVarZzg.zze() + j < 0)) {
            zzmn[] zzmnVarArr = this.zza;
            int length = zzmnVarArr.length;
            for (int i = 0; i < 2; i++) {
                zzA(zzmnVarArr[i]);
            }
            if (zzlqVarZzg != null) {
                while (this.zzq.zze() != zzlqVarZzg) {
                    this.zzq.zza();
                }
                this.zzq.zzn(zzlqVarZzg);
                zzlqVarZzg.zzp(1000000000000L);
                zzB();
            }
        }
        if (zzlqVarZzg != null) {
            this.zzq.zzn(zzlqVarZzg);
            if (!zzlqVarZzg.zzd) {
                zzlqVarZzg.zzf = zzlqVarZzg.zzf.zzb(j);
            } else if (zzlqVarZzg.zze) {
                j = zzlqVarZzg.zza.zze(j);
                zzlqVarZzg.zza.zzj(j - this.zzm, false);
            }
            zzO(j);
            zzI();
        } else {
            this.zzq.zzj();
            zzO(j);
        }
        zzE(false);
        this.zzh.zzi(2);
        return j;
    }

    private final Pair zzx(zzdc zzdcVar) {
        long j = 0;
        if (zzdcVar.zzo()) {
            return Pair.create(zzmg.zzh(), 0L);
        }
        Pair pairZzl = zzdcVar.zzl(this.zzk, this.zzl, zzdcVar.zzg(this.zzE), -9223372036854775807L);
        zzvo zzvoVarZzi = this.zzq.zzi(zzdcVar, pairZzl.first, 0L);
        long jLongValue = ((Long) pairZzl.second).longValue();
        if (zzvoVarZzi.zzb()) {
            zzdcVar.zzn(zzvoVarZzi.zza, this.zzl);
            if (zzvoVarZzi.zzc == this.zzl.zze(zzvoVarZzi.zzb)) {
                this.zzl.zzj();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzvoVarZzi, Long.valueOf(j));
    }

    private static Pair zzy(zzdc zzdcVar, zzlg zzlgVar, boolean z, int i, boolean z2, zzdb zzdbVar, zzcz zzczVar) {
        Pair pairZzl;
        zzdc zzdcVar2 = zzlgVar.zza;
        if (zzdcVar.zzo()) {
            return null;
        }
        zzdc zzdcVar3 = true == zzdcVar2.zzo() ? zzdcVar : zzdcVar2;
        try {
            pairZzl = zzdcVar3.zzl(zzdbVar, zzczVar, zzlgVar.zzb, zzlgVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzdcVar.equals(zzdcVar3)) {
            return pairZzl;
        }
        if (zzdcVar.zza(pairZzl.first) != -1) {
            return (zzdcVar3.zzn(pairZzl.first, zzczVar).zzg && zzdcVar3.zze(zzczVar.zzd, zzdbVar, 0L).zzp == zzdcVar3.zza(pairZzl.first)) ? zzdcVar.zzl(zzdbVar, zzczVar, zzdcVar.zzn(pairZzl.first, zzczVar).zzd, zzlgVar.zzc) : pairZzl;
        }
        Object objZzf = zzf(zzdbVar, zzczVar, i, z2, pairZzl.first, zzdcVar3, zzdcVar);
        if (objZzf != null) {
            return zzdcVar.zzl(zzdbVar, zzczVar, zzdcVar.zzn(objZzf, zzczVar).zzd, -9223372036854775807L);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmg zzz(zzvo zzvoVar, long j, long j2, long j3, boolean z, int i) {
        List listZzm;
        zzzn zzznVar;
        zzxr zzxrVar;
        int i2 = 0;
        this.zzK = (!this.zzK && j == this.zzv.zzr && zzvoVar.equals(this.zzv.zzb)) ? false : true;
        zzN();
        zzmg zzmgVar = this.zzv;
        zzxr zzxrVarZzh = zzmgVar.zzh;
        zzzn zzznVarZzi = zzmgVar.zzi;
        List list = zzmgVar.zzj;
        if (this.zzr.zzj()) {
            zzlq zzlqVarZze = this.zzq.zze();
            zzxrVarZzh = zzlqVarZze == null ? zzxr.zza : zzlqVarZze.zzh();
            zzznVarZzi = zzlqVarZze == null ? this.zze : zzlqVarZze.zzi();
            zzzg[] zzzgVarArr = zzznVarZzi.zzc;
            zzgaz zzgazVar = new zzgaz();
            boolean z2 = false;
            for (zzzg zzzgVar : zzzgVarArr) {
                if (zzzgVar != null) {
                    zzcd zzcdVar = zzzgVar.zzd(0).zzl;
                    if (zzcdVar == null) {
                        zzgazVar.zzf(new zzcd(-9223372036854775807L, new zzcc[0]));
                    } else {
                        zzgazVar.zzf(zzcdVar);
                        z2 = true;
                    }
                }
            }
            zzgbc zzgbcVarZzi = z2 ? zzgazVar.zzi() : zzgbc.zzm();
            if (zzlqVarZze != null) {
                zzlr zzlrVar = zzlqVarZze.zzf;
                if (zzlrVar.zzc != j2) {
                    zzlqVarZze.zzf = zzlrVar.zza(j2);
                }
            }
            zzlq zzlqVarZze2 = this.zzq.zze();
            if (zzlqVarZze2 != null) {
                zzzn zzznVarZzi2 = zzlqVarZze2.zzi();
                while (true) {
                    int length = this.zza.length;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzznVarZzi2.zzb(i2)) {
                        if (this.zza[i2].zzb() != 1) {
                            break;
                        }
                        int i3 = zzznVarZzi2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            listZzm = zzgbcVarZzi;
        } else {
            if (!zzvoVar.equals(this.zzv.zzb)) {
                zzznVar = this.zze;
                zzxrVar = zzxr.zza;
                listZzm = zzgbc.zzm();
                if (z) {
                    this.zzw.zzd(i);
                }
                return this.zzv.zzb(zzvoVar, j, j2, j3, zzt(), zzxrVar, zzznVar, listZzm);
            }
            listZzm = list;
        }
        zzxrVar = zzxrVarZzh;
        zzznVar = zzznVarZzi;
        if (z) {
        }
        return this.zzv.zzb(zzvoVar, j, j2, j3, zzt(), zzxrVar, zzznVar, listZzm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06ee A[Catch: RuntimeException -> 0x09d5, IOException -> 0x09ff, zzup -> 0x0a07, zzhc -> 0x0a0f, zzch -> 0x0a17, zzsm -> 0x0a2e, zzjh -> 0x0a38, TryCatch #10 {zzch -> 0x0a17, zzhc -> 0x0a0f, zzjh -> 0x0a38, zzsm -> 0x0a2e, zzup -> 0x0a07, IOException -> 0x09ff, RuntimeException -> 0x09d5, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x0699, B:335:0x06ab, B:337:0x06b4, B:339:0x06bc, B:344:0x06c6, B:346:0x06ee, B:347:0x06f1, B:348:0x06fc, B:350:0x0702, B:352:0x0708, B:353:0x070f, B:356:0x071b, B:359:0x0720, B:363:0x072b, B:365:0x0735, B:366:0x073a, B:368:0x0746, B:369:0x075e, B:371:0x0764, B:373:0x076c, B:375:0x0773, B:379:0x077c, B:384:0x078b, B:390:0x0798, B:392:0x079e, B:402:0x07b1, B:403:0x07b4, B:405:0x07be, B:407:0x07c4, B:411:0x07d1, B:413:0x07d9, B:415:0x07dd, B:416:0x07e8, B:418:0x07ee, B:471:0x08e9, B:474:0x08f1, B:476:0x08f6, B:478:0x08fe, B:480:0x090c, B:481:0x0913, B:482:0x0917, B:484:0x091d, B:486:0x0926, B:488:0x092c, B:490:0x0937, B:497:0x095b, B:499:0x0961, B:503:0x096a, B:515:0x098c, B:511:0x097d, B:513:0x0981, B:514:0x0987, B:491:0x093e, B:494:0x094c, B:495:0x0953, B:496:0x0954, B:419:0x07f6, B:421:0x07fd, B:423:0x0801, B:450:0x0889, B:452:0x0895, B:428:0x080d, B:430:0x0811, B:432:0x0825, B:434:0x0833, B:436:0x083f, B:440:0x0848, B:442:0x0852, B:448:0x085d, B:453:0x08a2, B:455:0x08a8, B:457:0x08ac, B:461:0x08b5, B:463:0x08c5, B:465:0x08cd, B:467:0x08d7, B:468:0x08dc, B:469:0x08e1, B:470:0x08e6, B:404:0x07b7, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:517:0x0994, B:521:0x099b, B:522:0x09a3, B:526:0x09c3, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:604:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0702 A[Catch: RuntimeException -> 0x09d5, IOException -> 0x09ff, zzup -> 0x0a07, zzhc -> 0x0a0f, zzch -> 0x0a17, zzsm -> 0x0a2e, zzjh -> 0x0a38, TryCatch #10 {zzch -> 0x0a17, zzhc -> 0x0a0f, zzjh -> 0x0a38, zzsm -> 0x0a2e, zzup -> 0x0a07, IOException -> 0x09ff, RuntimeException -> 0x09d5, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x0699, B:335:0x06ab, B:337:0x06b4, B:339:0x06bc, B:344:0x06c6, B:346:0x06ee, B:347:0x06f1, B:348:0x06fc, B:350:0x0702, B:352:0x0708, B:353:0x070f, B:356:0x071b, B:359:0x0720, B:363:0x072b, B:365:0x0735, B:366:0x073a, B:368:0x0746, B:369:0x075e, B:371:0x0764, B:373:0x076c, B:375:0x0773, B:379:0x077c, B:384:0x078b, B:390:0x0798, B:392:0x079e, B:402:0x07b1, B:403:0x07b4, B:405:0x07be, B:407:0x07c4, B:411:0x07d1, B:413:0x07d9, B:415:0x07dd, B:416:0x07e8, B:418:0x07ee, B:471:0x08e9, B:474:0x08f1, B:476:0x08f6, B:478:0x08fe, B:480:0x090c, B:481:0x0913, B:482:0x0917, B:484:0x091d, B:486:0x0926, B:488:0x092c, B:490:0x0937, B:497:0x095b, B:499:0x0961, B:503:0x096a, B:515:0x098c, B:511:0x097d, B:513:0x0981, B:514:0x0987, B:491:0x093e, B:494:0x094c, B:495:0x0953, B:496:0x0954, B:419:0x07f6, B:421:0x07fd, B:423:0x0801, B:450:0x0889, B:452:0x0895, B:428:0x080d, B:430:0x0811, B:432:0x0825, B:434:0x0833, B:436:0x083f, B:440:0x0848, B:442:0x0852, B:448:0x085d, B:453:0x08a2, B:455:0x08a8, B:457:0x08ac, B:461:0x08b5, B:463:0x08c5, B:465:0x08cd, B:467:0x08d7, B:468:0x08dc, B:469:0x08e1, B:470:0x08e6, B:404:0x07b7, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:517:0x0994, B:521:0x099b, B:522:0x09a3, B:526:0x09c3, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:604:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x07f6 A[Catch: RuntimeException -> 0x09d5, IOException -> 0x09ff, zzup -> 0x0a07, zzhc -> 0x0a0f, zzch -> 0x0a17, zzsm -> 0x0a2e, zzjh -> 0x0a38, TryCatch #10 {zzch -> 0x0a17, zzhc -> 0x0a0f, zzjh -> 0x0a38, zzsm -> 0x0a2e, zzup -> 0x0a07, IOException -> 0x09ff, RuntimeException -> 0x09d5, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x0699, B:335:0x06ab, B:337:0x06b4, B:339:0x06bc, B:344:0x06c6, B:346:0x06ee, B:347:0x06f1, B:348:0x06fc, B:350:0x0702, B:352:0x0708, B:353:0x070f, B:356:0x071b, B:359:0x0720, B:363:0x072b, B:365:0x0735, B:366:0x073a, B:368:0x0746, B:369:0x075e, B:371:0x0764, B:373:0x076c, B:375:0x0773, B:379:0x077c, B:384:0x078b, B:390:0x0798, B:392:0x079e, B:402:0x07b1, B:403:0x07b4, B:405:0x07be, B:407:0x07c4, B:411:0x07d1, B:413:0x07d9, B:415:0x07dd, B:416:0x07e8, B:418:0x07ee, B:471:0x08e9, B:474:0x08f1, B:476:0x08f6, B:478:0x08fe, B:480:0x090c, B:481:0x0913, B:482:0x0917, B:484:0x091d, B:486:0x0926, B:488:0x092c, B:490:0x0937, B:497:0x095b, B:499:0x0961, B:503:0x096a, B:515:0x098c, B:511:0x097d, B:513:0x0981, B:514:0x0987, B:491:0x093e, B:494:0x094c, B:495:0x0953, B:496:0x0954, B:419:0x07f6, B:421:0x07fd, B:423:0x0801, B:450:0x0889, B:452:0x0895, B:428:0x080d, B:430:0x0811, B:432:0x0825, B:434:0x0833, B:436:0x083f, B:440:0x0848, B:442:0x0852, B:448:0x085d, B:453:0x08a2, B:455:0x08a8, B:457:0x08ac, B:461:0x08b5, B:463:0x08c5, B:465:0x08cd, B:467:0x08d7, B:468:0x08dc, B:469:0x08e1, B:470:0x08e6, B:404:0x07b7, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:517:0x0994, B:521:0x099b, B:522:0x09a3, B:526:0x09c3, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:604:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0895 A[Catch: RuntimeException -> 0x09d5, IOException -> 0x09ff, zzup -> 0x0a07, zzhc -> 0x0a0f, zzch -> 0x0a17, zzsm -> 0x0a2e, zzjh -> 0x0a38, TryCatch #10 {zzch -> 0x0a17, zzhc -> 0x0a0f, zzjh -> 0x0a38, zzsm -> 0x0a2e, zzup -> 0x0a07, IOException -> 0x09ff, RuntimeException -> 0x09d5, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x0699, B:335:0x06ab, B:337:0x06b4, B:339:0x06bc, B:344:0x06c6, B:346:0x06ee, B:347:0x06f1, B:348:0x06fc, B:350:0x0702, B:352:0x0708, B:353:0x070f, B:356:0x071b, B:359:0x0720, B:363:0x072b, B:365:0x0735, B:366:0x073a, B:368:0x0746, B:369:0x075e, B:371:0x0764, B:373:0x076c, B:375:0x0773, B:379:0x077c, B:384:0x078b, B:390:0x0798, B:392:0x079e, B:402:0x07b1, B:403:0x07b4, B:405:0x07be, B:407:0x07c4, B:411:0x07d1, B:413:0x07d9, B:415:0x07dd, B:416:0x07e8, B:418:0x07ee, B:471:0x08e9, B:474:0x08f1, B:476:0x08f6, B:478:0x08fe, B:480:0x090c, B:481:0x0913, B:482:0x0917, B:484:0x091d, B:486:0x0926, B:488:0x092c, B:490:0x0937, B:497:0x095b, B:499:0x0961, B:503:0x096a, B:515:0x098c, B:511:0x097d, B:513:0x0981, B:514:0x0987, B:491:0x093e, B:494:0x094c, B:495:0x0953, B:496:0x0954, B:419:0x07f6, B:421:0x07fd, B:423:0x0801, B:450:0x0889, B:452:0x0895, B:428:0x080d, B:430:0x0811, B:432:0x0825, B:434:0x0833, B:436:0x083f, B:440:0x0848, B:442:0x0852, B:448:0x085d, B:453:0x08a2, B:455:0x08a8, B:457:0x08ac, B:461:0x08b5, B:463:0x08c5, B:465:0x08cd, B:467:0x08d7, B:468:0x08dc, B:469:0x08e1, B:470:0x08e6, B:404:0x07b7, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:517:0x0994, B:521:0x099b, B:522:0x09a3, B:526:0x09c3, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:604:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08a8 A[Catch: RuntimeException -> 0x09d5, IOException -> 0x09ff, zzup -> 0x0a07, zzhc -> 0x0a0f, zzch -> 0x0a17, zzsm -> 0x0a2e, zzjh -> 0x0a38, TryCatch #10 {zzch -> 0x0a17, zzhc -> 0x0a0f, zzjh -> 0x0a38, zzsm -> 0x0a2e, zzup -> 0x0a07, IOException -> 0x09ff, RuntimeException -> 0x09d5, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x0699, B:335:0x06ab, B:337:0x06b4, B:339:0x06bc, B:344:0x06c6, B:346:0x06ee, B:347:0x06f1, B:348:0x06fc, B:350:0x0702, B:352:0x0708, B:353:0x070f, B:356:0x071b, B:359:0x0720, B:363:0x072b, B:365:0x0735, B:366:0x073a, B:368:0x0746, B:369:0x075e, B:371:0x0764, B:373:0x076c, B:375:0x0773, B:379:0x077c, B:384:0x078b, B:390:0x0798, B:392:0x079e, B:402:0x07b1, B:403:0x07b4, B:405:0x07be, B:407:0x07c4, B:411:0x07d1, B:413:0x07d9, B:415:0x07dd, B:416:0x07e8, B:418:0x07ee, B:471:0x08e9, B:474:0x08f1, B:476:0x08f6, B:478:0x08fe, B:480:0x090c, B:481:0x0913, B:482:0x0917, B:484:0x091d, B:486:0x0926, B:488:0x092c, B:490:0x0937, B:497:0x095b, B:499:0x0961, B:503:0x096a, B:515:0x098c, B:511:0x097d, B:513:0x0981, B:514:0x0987, B:491:0x093e, B:494:0x094c, B:495:0x0953, B:496:0x0954, B:419:0x07f6, B:421:0x07fd, B:423:0x0801, B:450:0x0889, B:452:0x0895, B:428:0x080d, B:430:0x0811, B:432:0x0825, B:434:0x0833, B:436:0x083f, B:440:0x0848, B:442:0x0852, B:448:0x085d, B:453:0x08a2, B:455:0x08a8, B:457:0x08ac, B:461:0x08b5, B:463:0x08c5, B:465:0x08cd, B:467:0x08d7, B:468:0x08dc, B:469:0x08e1, B:470:0x08e6, B:404:0x07b7, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:517:0x0994, B:521:0x099b, B:522:0x09a3, B:526:0x09c3, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:604:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x08c5 A[Catch: RuntimeException -> 0x09d5, IOException -> 0x09ff, zzup -> 0x0a07, zzhc -> 0x0a0f, zzch -> 0x0a17, zzsm -> 0x0a2e, zzjh -> 0x0a38, TryCatch #10 {zzch -> 0x0a17, zzhc -> 0x0a0f, zzjh -> 0x0a38, zzsm -> 0x0a2e, zzup -> 0x0a07, IOException -> 0x09ff, RuntimeException -> 0x09d5, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x0699, B:335:0x06ab, B:337:0x06b4, B:339:0x06bc, B:344:0x06c6, B:346:0x06ee, B:347:0x06f1, B:348:0x06fc, B:350:0x0702, B:352:0x0708, B:353:0x070f, B:356:0x071b, B:359:0x0720, B:363:0x072b, B:365:0x0735, B:366:0x073a, B:368:0x0746, B:369:0x075e, B:371:0x0764, B:373:0x076c, B:375:0x0773, B:379:0x077c, B:384:0x078b, B:390:0x0798, B:392:0x079e, B:402:0x07b1, B:403:0x07b4, B:405:0x07be, B:407:0x07c4, B:411:0x07d1, B:413:0x07d9, B:415:0x07dd, B:416:0x07e8, B:418:0x07ee, B:471:0x08e9, B:474:0x08f1, B:476:0x08f6, B:478:0x08fe, B:480:0x090c, B:481:0x0913, B:482:0x0917, B:484:0x091d, B:486:0x0926, B:488:0x092c, B:490:0x0937, B:497:0x095b, B:499:0x0961, B:503:0x096a, B:515:0x098c, B:511:0x097d, B:513:0x0981, B:514:0x0987, B:491:0x093e, B:494:0x094c, B:495:0x0953, B:496:0x0954, B:419:0x07f6, B:421:0x07fd, B:423:0x0801, B:450:0x0889, B:452:0x0895, B:428:0x080d, B:430:0x0811, B:432:0x0825, B:434:0x0833, B:436:0x083f, B:440:0x0848, B:442:0x0852, B:448:0x085d, B:453:0x08a2, B:455:0x08a8, B:457:0x08ac, B:461:0x08b5, B:463:0x08c5, B:465:0x08cd, B:467:0x08d7, B:468:0x08dc, B:469:0x08e1, B:470:0x08e6, B:404:0x07b7, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:517:0x0994, B:521:0x099b, B:522:0x09a3, B:526:0x09c3, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:604:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0954 A[Catch: RuntimeException -> 0x09d5, IOException -> 0x09ff, zzup -> 0x0a07, zzhc -> 0x0a0f, zzch -> 0x0a17, zzsm -> 0x0a2e, zzjh -> 0x0a38, TryCatch #10 {zzch -> 0x0a17, zzhc -> 0x0a0f, zzjh -> 0x0a38, zzsm -> 0x0a2e, zzup -> 0x0a07, IOException -> 0x09ff, RuntimeException -> 0x09d5, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x002e, B:9:0x0033, B:10:0x0038, B:14:0x003f, B:16:0x0048, B:18:0x0056, B:19:0x005e, B:20:0x0069, B:21:0x007d, B:22:0x0095, B:23:0x00b1, B:25:0x00c0, B:26:0x00c4, B:27:0x00d5, B:29:0x00e4, B:30:0x0100, B:31:0x0113, B:32:0x011c, B:34:0x012e, B:35:0x013a, B:36:0x014a, B:38:0x0156, B:41:0x0161, B:42:0x0168, B:43:0x0175, B:47:0x017c, B:49:0x0184, B:51:0x0188, B:53:0x018e, B:55:0x0196, B:57:0x019e, B:58:0x01a1, B:60:0x01a6, B:67:0x01b3, B:68:0x01b4, B:72:0x01bb, B:74:0x01c9, B:75:0x01cc, B:76:0x01d1, B:78:0x01e1, B:79:0x01e4, B:80:0x01e9, B:81:0x01ee, B:83:0x01fa, B:84:0x0206, B:86:0x0212, B:88:0x023e, B:89:0x025e, B:96:0x0286, B:98:0x028a, B:99:0x028d, B:106:0x0298, B:119:0x02ae, B:121:0x02b4, B:122:0x02bb, B:123:0x02cc, B:125:0x02f3, B:191:0x040a, B:175:0x03d7, B:174:0x03d3, B:200:0x041b, B:201:0x0428, B:126:0x0315, B:130:0x0328, B:132:0x0338, B:134:0x034f, B:136:0x0359, B:202:0x0429, B:204:0x043d, B:207:0x0447, B:209:0x0456, B:211:0x0462, B:213:0x0477, B:214:0x047c, B:215:0x0480, B:217:0x0484, B:219:0x0491, B:291:0x05ed, B:293:0x05f5, B:295:0x05fd, B:298:0x0602, B:299:0x060e, B:301:0x0614, B:303:0x061c, B:306:0x062c, B:308:0x0632, B:309:0x0652, B:311:0x0658, B:313:0x065d, B:315:0x0662, B:317:0x0666, B:319:0x066c, B:321:0x0670, B:323:0x0678, B:325:0x067e, B:327:0x0688, B:330:0x068e, B:331:0x0691, B:333:0x0699, B:335:0x06ab, B:337:0x06b4, B:339:0x06bc, B:344:0x06c6, B:346:0x06ee, B:347:0x06f1, B:348:0x06fc, B:350:0x0702, B:352:0x0708, B:353:0x070f, B:356:0x071b, B:359:0x0720, B:363:0x072b, B:365:0x0735, B:366:0x073a, B:368:0x0746, B:369:0x075e, B:371:0x0764, B:373:0x076c, B:375:0x0773, B:379:0x077c, B:384:0x078b, B:390:0x0798, B:392:0x079e, B:402:0x07b1, B:403:0x07b4, B:405:0x07be, B:407:0x07c4, B:411:0x07d1, B:413:0x07d9, B:415:0x07dd, B:416:0x07e8, B:418:0x07ee, B:471:0x08e9, B:474:0x08f1, B:476:0x08f6, B:478:0x08fe, B:480:0x090c, B:481:0x0913, B:482:0x0917, B:484:0x091d, B:486:0x0926, B:488:0x092c, B:490:0x0937, B:497:0x095b, B:499:0x0961, B:503:0x096a, B:515:0x098c, B:511:0x097d, B:513:0x0981, B:514:0x0987, B:491:0x093e, B:494:0x094c, B:495:0x0953, B:496:0x0954, B:419:0x07f6, B:421:0x07fd, B:423:0x0801, B:450:0x0889, B:452:0x0895, B:428:0x080d, B:430:0x0811, B:432:0x0825, B:434:0x0833, B:436:0x083f, B:440:0x0848, B:442:0x0852, B:448:0x085d, B:453:0x08a2, B:455:0x08a8, B:457:0x08ac, B:461:0x08b5, B:463:0x08c5, B:465:0x08cd, B:467:0x08d7, B:468:0x08dc, B:469:0x08e1, B:470:0x08e6, B:404:0x07b7, B:222:0x04a0, B:224:0x04a6, B:227:0x04ac, B:230:0x04b7, B:232:0x04bc, B:235:0x04ca, B:237:0x04d0, B:238:0x04d8, B:239:0x04db, B:241:0x04e3, B:243:0x04f1, B:245:0x052d, B:247:0x0537, B:250:0x0542, B:252:0x054a, B:253:0x054d, B:254:0x0550, B:256:0x0556, B:258:0x0565, B:260:0x056b, B:262:0x0577, B:264:0x0581, B:266:0x0592, B:268:0x0598, B:269:0x05a3, B:270:0x05a8, B:272:0x05b3, B:275:0x05b8, B:277:0x05be, B:279:0x05c6, B:281:0x05cc, B:283:0x05d2, B:287:0x05e0, B:289:0x05e7, B:290:0x05ea, B:218:0x048e, B:517:0x0994, B:521:0x099b, B:522:0x09a3, B:526:0x09c3, B:108:0x029a, B:110:0x029f, B:111:0x02a2, B:114:0x02a9, B:118:0x02ad), top: B:604:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.zzie, com.google.android.gms.internal.ads.zzzu] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z;
        boolean z2;
        int i;
        zzlq zzlqVarZzf;
        int i2;
        boolean z3;
        boolean z4;
        zzlq zzlqVarZze;
        zzlq zzlqVarZzg;
        char c;
        boolean z5;
        int i3;
        zzlr zzlrVarZzg;
        long jLongValue;
        long j;
        boolean z6;
        zzvo zzvoVar;
        zzvo zzvoVar2;
        Throwable th;
        Throwable th2;
        long j2;
        long jZza;
        long jZzv;
        long j3;
        zzmg zzmgVar;
        int i4;
        zzmg zzmgVarZzz;
        try {
        } catch (zzch e) {
            zzD(e, e.zzb == 1 ? true != e.zza ? 3003 : 3001 : 1000);
        } catch (zzhc e2) {
            zzD(e2, e2.zza);
        } catch (zzjh e3) {
            zzjh zzjhVarZza = e3;
            if (zzjhVarZza.zze == 1 && (zzlqVarZzf = this.zzq.zzf()) != null) {
                zzjhVarZza = zzjhVarZza.zza(zzlqVarZzf.zzf.zza);
            }
            if (zzjhVarZza.zzk && (this.zzL == null || (i = zzjhVarZza.zzb) == 5004 || i == 5003)) {
                zzfk.zzg("ExoPlayerImplInternal", "Recoverable renderer error", zzjhVarZza);
                zzjh zzjhVar = this.zzL;
                if (zzjhVar != null) {
                    zzjhVar.addSuppressed(zzjhVarZza);
                    zzjhVarZza = this.zzL;
                } else {
                    this.zzL = zzjhVarZza;
                }
                zzfb zzfbVar = this.zzh;
                zzfbVar.zzk(zzfbVar.zzc(25, zzjhVarZza));
            } else {
                zzjh zzjhVar2 = this.zzL;
                if (zzjhVar2 != null) {
                    zzjhVar2.addSuppressed(zzjhVarZza);
                    zzjhVarZza = this.zzL;
                }
                zzjh zzjhVar3 = zzjhVarZza;
                zzfk.zzd("ExoPlayerImplInternal", "Playback error", zzjhVar3);
                z = true;
                if (zzjhVar3.zze == 1) {
                    zzlt zzltVar = this.zzq;
                    if (zzltVar.zze() != zzltVar.zzf()) {
                        while (true) {
                            zzlt zzltVar2 = this.zzq;
                            if (zzltVar2.zze() == zzltVar2.zzf()) {
                                break;
                            }
                            this.zzq.zza();
                        }
                        zzlq zzlqVarZze2 = this.zzq.zze();
                        zzlqVarZze2.getClass();
                        zzlr zzlrVar = zzlqVarZze2.zzf;
                        zzvo zzvoVar3 = zzlrVar.zza;
                        long j4 = zzlrVar.zzb;
                        this.zzv = zzz(zzvoVar3, j4, zzlrVar.zzc, j4, true, 0);
                    }
                    z2 = false;
                    z = true;
                } else {
                    z2 = false;
                }
                zzW(z, z2);
                this.zzv = this.zzv.zzd(zzjhVar3);
            }
        } catch (zzsm e4) {
            zzD(e4, e4.zza);
        } catch (zzup e5) {
            zzD(e5, 1002);
        } catch (IOException e6) {
            zzD(e6, 2000);
        } catch (RuntimeException e7) {
            zzjh zzjhVarZzd = zzjh.zzd(e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            zzfk.zzd("ExoPlayerImplInternal", "Playback error", zzjhVarZzd);
            zzW(true, false);
            this.zzv = this.zzv.zzd(zzjhVarZzd);
        }
        switch (message.what) {
            case 0:
                this.zzw.zza(1);
                zzM(false, false, false, true);
                this.zzf.zzc(this.zzt);
                zzU(true != this.zzv.zza.zzo() ? 2 : 4);
                this.zzr.zzg(this.zzg);
                this.zzh.zzi(2);
                z = true;
                zzJ();
                return z;
            case 1:
                zzT(message.arg1 != 0, message.arg2, true, 1);
                z = true;
                zzJ();
                return z;
            case 2:
                int i5 = 4;
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.zzh.zzf(2);
                if (!this.zzv.zza.zzo() && this.zzr.zzj()) {
                    this.zzq.zzl(this.zzI);
                    if (this.zzq.zzo() && (zzlrVarZzg = this.zzq.zzg(this.zzI, this.zzv)) != null) {
                        zzlq zzlqVarZzc = this.zzq.zzc(zzlrVarZzg);
                        zzlqVarZzc.zza.zzl(this, zzlrVarZzg.zzb);
                        if (this.zzq.zze() == zzlqVarZzc) {
                            zzO(zzlrVarZzg.zzb);
                        }
                        zzE(false);
                    }
                    if (this.zzC) {
                        this.zzC = zzae();
                        zzY();
                    } else {
                        zzI();
                    }
                    zzlq zzlqVarZzf2 = this.zzq.zzf();
                    if (zzlqVarZzf2 != null) {
                        if (zzlqVarZzf2.zzg() != null && !this.zzz) {
                            zzlq zzlqVarZzf3 = this.zzq.zzf();
                            if (zzlqVarZzf3.zzd) {
                                int i6 = 0;
                                while (true) {
                                    zzmn[] zzmnVarArr = this.zza;
                                    int length = zzmnVarArr.length;
                                    if (i6 < 2) {
                                        zzmn zzmnVar = zzmnVarArr[i6];
                                        zzxf zzxfVar = zzlqVarZzf3.zzc[i6];
                                        if (zzmnVar.zzo() == zzxfVar) {
                                            if (zzxfVar == null || zzmnVar.zzQ()) {
                                                i6++;
                                            } else {
                                                zzlqVarZzf3.zzg();
                                                boolean z7 = zzlqVarZzf3.zzf.zzf;
                                            }
                                        }
                                    } else if (zzlqVarZzf2.zzg().zzd || this.zzI >= zzlqVarZzf2.zzg().zzf()) {
                                        zzzn zzznVarZzi = zzlqVarZzf2.zzi();
                                        zzlq zzlqVarZzb = this.zzq.zzb();
                                        zzzn zzznVarZzi2 = zzlqVarZzb.zzi();
                                        zzdc zzdcVar = this.zzv.zza;
                                        zzzn zzznVar = zzznVarZzi2;
                                        zzab(zzdcVar, zzlqVarZzb.zzf.zza, zzdcVar, zzlqVarZzf2.zzf.zza, -9223372036854775807L, false);
                                        if (!zzlqVarZzb.zzd || zzlqVarZzb.zza.zzd() == -9223372036854775807L) {
                                            int i7 = 0;
                                            while (true) {
                                                int length2 = this.zza.length;
                                                if (i7 < 2) {
                                                    boolean zZzb = zzznVarZzi.zzb(i7);
                                                    zzzn zzznVar2 = zzznVar;
                                                    boolean zZzb2 = zzznVar2.zzb(i7);
                                                    if (zZzb && !this.zza[i7].zzR()) {
                                                        this.zzc[i7].zzb();
                                                        zzmq zzmqVar = zzznVarZzi.zzb[i7];
                                                        zzmq zzmqVar2 = zzznVar2.zzb[i7];
                                                        if (!zZzb2 || !zzmqVar2.equals(zzmqVar)) {
                                                            zzan(this.zza[i7], zzlqVarZzb.zzf());
                                                        }
                                                    }
                                                    i7++;
                                                    zzznVar = zzznVar2;
                                                }
                                            }
                                        } else {
                                            long jZzf = zzlqVarZzb.zzf();
                                            zzmn[] zzmnVarArr2 = this.zza;
                                            int length3 = zzmnVarArr2.length;
                                            for (int i8 = 0; i8 < 2; i8++) {
                                                zzmn zzmnVar2 = zzmnVarArr2[i8];
                                                if (zzmnVar2.zzo() != null) {
                                                    zzan(zzmnVar2, jZzf);
                                                }
                                            }
                                            if (!zzlqVarZzb.zzr()) {
                                                this.zzq.zzn(zzlqVarZzb);
                                                zzE(false);
                                                zzI();
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (zzlqVarZzf2.zzf.zzi || this.zzz) {
                            int i9 = 0;
                            while (true) {
                                zzmn[] zzmnVarArr3 = this.zza;
                                int length4 = zzmnVarArr3.length;
                                if (i9 < 2) {
                                    zzmn zzmnVar3 = zzmnVarArr3[i9];
                                    zzxf zzxfVar2 = zzlqVarZzf2.zzc[i9];
                                    if (zzxfVar2 != null && zzmnVar3.zzo() == zzxfVar2 && zzmnVar3.zzQ()) {
                                        long j5 = zzlqVarZzf2.zzf.zze;
                                        zzan(zzmnVar3, (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? -9223372036854775807L : zzlqVarZzf2.zze() + j5);
                                    }
                                    i9++;
                                }
                            }
                        }
                        zzlq zzlqVarZzf4 = this.zzq.zzf();
                        if (zzlqVarZzf4 != null && this.zzq.zze() != zzlqVarZzf4 && !zzlqVarZzf4.zzg) {
                            zzlq zzlqVarZzf5 = this.zzq.zzf();
                            zzzn zzznVarZzi3 = zzlqVarZzf5.zzi();
                            int i10 = 0;
                            boolean z8 = false;
                            while (true) {
                                zzmn[] zzmnVarArr4 = this.zza;
                                int length5 = zzmnVarArr4.length;
                                if (i10 < 2) {
                                    zzmn zzmnVar4 = zzmnVarArr4[i10];
                                    if (zzaf(zzmnVar4)) {
                                        zzxf zzxfVarZzo = zzmnVar4.zzo();
                                        zzxf zzxfVar3 = zzlqVarZzf5.zzc[i10];
                                        if (!zzznVarZzi3.zzb(i10) || zzxfVarZzo != zzxfVar3) {
                                            if (!zzmnVar4.zzR()) {
                                                zzmnVar4.zzH(zzak(zzznVarZzi3.zzc[i10]), zzlqVarZzf5.zzc[i10], zzlqVarZzf5.zzf(), zzlqVarZzf5.zze(), zzlqVarZzf5.zzf.zza);
                                            } else if (zzmnVar4.zzW()) {
                                                zzA(zzmnVar4);
                                            } else {
                                                z8 = true;
                                            }
                                        }
                                    }
                                    i10++;
                                } else if (!z8) {
                                    zzB();
                                }
                            }
                        }
                        boolean z9 = false;
                        while (zzai() && !this.zzz && (zzlqVarZze = this.zzq.zze()) != null && (zzlqVarZzg = zzlqVarZze.zzg()) != null && this.zzI >= zzlqVarZzg.zzf() && zzlqVarZzg.zzg) {
                            if (z9) {
                                zzJ();
                            }
                            zzlq zzlqVarZza = this.zzq.zza();
                            if (zzlqVarZza == null) {
                                throw null;
                            }
                            if (this.zzv.zzb.zza.equals(zzlqVarZza.zzf.zza.zza)) {
                                zzvo zzvoVar4 = this.zzv.zzb;
                                c = 65535;
                                if (zzvoVar4.zzb == -1) {
                                    zzvo zzvoVar5 = zzlqVarZza.zzf.zza;
                                    if (zzvoVar5.zzb == -1 && zzvoVar4.zze != zzvoVar5.zze) {
                                        z5 = true;
                                    }
                                }
                                zzlr zzlrVar2 = zzlqVarZza.zzf;
                                zzvo zzvoVar6 = zzlrVar2.zza;
                                long j6 = zzlrVar2.zzb;
                                this.zzv = zzz(zzvoVar6, j6, zzlrVar2.zzc, j6, !z5, 0);
                                zzN();
                                zzaa();
                                if (this.zzv.zze == 3) {
                                    zzV();
                                }
                                zzzn zzznVarZzi4 = this.zzq.zze().zzi();
                                i3 = 0;
                                while (true) {
                                    int length6 = this.zza.length;
                                    if (i3 >= 2) {
                                        if (zzznVarZzi4.zzb(i3)) {
                                            this.zza[i3].zzs();
                                        }
                                        i3++;
                                    }
                                }
                                z9 = true;
                            } else {
                                c = 65535;
                            }
                            z5 = false;
                            zzlr zzlrVar22 = zzlqVarZza.zzf;
                            zzvo zzvoVar62 = zzlrVar22.zza;
                            long j62 = zzlrVar22.zzb;
                            this.zzv = zzz(zzvoVar62, j62, zzlrVar22.zzc, j62, !z5, 0);
                            zzN();
                            zzaa();
                            if (this.zzv.zze == 3) {
                            }
                            zzzn zzznVarZzi42 = this.zzq.zze().zzi();
                            i3 = 0;
                            while (true) {
                                int length62 = this.zza.length;
                                if (i3 >= 2) {
                                    break;
                                }
                                i3++;
                            }
                            z9 = true;
                        }
                        i2 = 3;
                        i5 = 4;
                    }
                    zzJ();
                    return z;
                }
                i2 = 3;
                int i11 = this.zzv.zze;
                if (i11 == 1) {
                    z = true;
                    zzJ();
                    return z;
                }
                if (i11 != i5) {
                    zzlq zzlqVarZze3 = this.zzq.zze();
                    if (zzlqVarZze3 != null) {
                        Trace.beginSection("doSomeWork");
                        zzaa();
                        if (zzlqVarZze3.zzd) {
                            long jZzr = zzgd.zzr(SystemClock.elapsedRealtime());
                            zzlqVarZze3.zza.zzj(this.zzv.zzr - this.zzm, false);
                            z3 = true;
                            z4 = true;
                            int i12 = 0;
                            while (true) {
                                zzmn[] zzmnVarArr5 = this.zza;
                                int length7 = zzmnVarArr5.length;
                                if (i12 < 2) {
                                    zzmn zzmnVar5 = zzmnVarArr5[i12];
                                    if (zzaf(zzmnVar5)) {
                                        zzmnVar5.zzV(this.zzI, jZzr);
                                        z3 = z3 && zzmnVar5.zzW();
                                        boolean z10 = zzlqVarZze3.zzc[i12] != zzmnVar5.zzo();
                                        boolean z11 = z10 || (!z10 && zzmnVar5.zzQ()) || zzmnVar5.zzX() || zzmnVar5.zzW();
                                        z4 = z4 && z11;
                                        if (!z11) {
                                            zzmnVar5.zzv();
                                        }
                                    }
                                    i12++;
                                }
                            }
                        } else {
                            zzlqVarZze3.zza.zzk();
                            z3 = true;
                            z4 = true;
                        }
                        long j7 = zzlqVarZze3.zzf.zze;
                        if (z3 && zzlqVarZze3.zzd && (j7 == -9223372036854775807L || j7 <= this.zzv.zzr)) {
                            if (this.zzz) {
                                this.zzz = false;
                                zzT(false, this.zzv.zzm, false, 5);
                            }
                            if (zzlqVarZze3.zzf.zzi) {
                                zzU(i5);
                                zzX();
                            }
                            int i13 = 2;
                            if (this.zzv.zze == 2) {
                            }
                        } else {
                            zzmg zzmgVar2 = this.zzv;
                            if (zzmgVar2.zze != 2) {
                                if (this.zzv.zze == i2) {
                                    if (this.zzG == 0) {
                                        if (!zzag()) {
                                            zzac(zzai(), false);
                                            zzU(2);
                                            if (this.zzA) {
                                                for (zzlq zzlqVarZze4 = this.zzq.zze(); zzlqVarZze4 != null; zzlqVarZze4 = zzlqVarZze4.zzg()) {
                                                    for (zzzg zzzgVar : zzlqVarZze4.zzi().zzc) {
                                                    }
                                                }
                                                this.zzO.zzc();
                                            }
                                            zzX();
                                        }
                                    } else if (!z4) {
                                        zzac(zzai(), false);
                                        zzU(2);
                                        if (this.zzA) {
                                        }
                                        zzX();
                                    }
                                }
                                int i132 = 2;
                                if (this.zzv.zze == 2) {
                                    int i14 = 0;
                                    while (true) {
                                        zzmn[] zzmnVarArr6 = this.zza;
                                        int length8 = zzmnVarArr6.length;
                                        if (i14 < i132) {
                                            if (zzaf(zzmnVarArr6[i14]) && this.zza[i14].zzo() == zzlqVarZze3.zzc[i14]) {
                                                this.zza[i14].zzv();
                                            }
                                            i14++;
                                            i132 = 2;
                                        } else {
                                            zzmg zzmgVar3 = this.zzv;
                                            if (zzmgVar3.zzg || zzmgVar3.zzq >= 500000 || !zzae()) {
                                                this.zzM = -9223372036854775807L;
                                            } else if (this.zzM == -9223372036854775807L) {
                                                this.zzM = SystemClock.elapsedRealtime();
                                            } else if (SystemClock.elapsedRealtime() - this.zzM >= 4000) {
                                                throw new IllegalStateException("Playback stuck buffering and not loading");
                                            }
                                            boolean z12 = zzai() && this.zzv.zze == i2;
                                            boolean z13 = this.zzv.zzo;
                                            int i15 = this.zzv.zze;
                                            if (i15 != i5) {
                                                if (z12 || i15 == 2) {
                                                    zzQ(jUptimeMillis, 10L);
                                                } else if (i15 == i2 && this.zzG != 0) {
                                                    zzQ(jUptimeMillis, 1000L);
                                                }
                                            }
                                            Trace.endSection();
                                        }
                                    }
                                }
                            } else {
                                if (this.zzG == 0) {
                                    if (zzag()) {
                                        zzU(i2);
                                        this.zzL = null;
                                        if (zzai()) {
                                            zzac(false, false);
                                            this.zzn.zzh();
                                            zzV();
                                        }
                                    }
                                    if (this.zzv.zze == i2) {
                                    }
                                } else {
                                    if (z4) {
                                        if (zzmgVar2.zzg) {
                                            zzlq zzlqVarZze5 = this.zzq.zze();
                                            long jZzb = zzaj(this.zzv.zza, zzlqVarZze5.zzf.zza) ? this.zzO.zzb() : -9223372036854775807L;
                                            zzlq zzlqVarZzd = this.zzq.zzd();
                                            boolean z14 = zzlqVarZzd.zzr() && zzlqVarZzd.zzf.zzi;
                                            boolean z15 = zzlqVarZzd.zzf.zza.zzb() && !zzlqVarZzd.zzd;
                                            if (z14 || z15 || this.zzf.zzi(this.zzt, this.zzv.zza, zzlqVarZze5.zzf.zza, zzt(), this.zzn.zzc().zzc, this.zzA, jZzb)) {
                                            }
                                        }
                                        zzU(i2);
                                        this.zzL = null;
                                        if (zzai()) {
                                        }
                                    }
                                    if (this.zzv.zze == i2) {
                                    }
                                }
                                int i1322 = 2;
                                if (this.zzv.zze == 2) {
                                }
                            }
                        }
                        zzJ();
                        return z;
                    }
                    zzQ(jUptimeMillis, 10L);
                }
                z = true;
                zzJ();
                return z;
            case 3:
                zzlg zzlgVar = (zzlg) message.obj;
                this.zzw.zza(1);
                Pair pairZzy = zzy(this.zzv.zza, zzlgVar, true, this.zzD, this.zzE, this.zzk, this.zzl);
                if (pairZzy == null) {
                    Pair pairZzx = zzx(this.zzv.zza);
                    zzvoVar = (zzvo) pairZzx.first;
                    long jLongValue2 = ((Long) pairZzx.second).longValue();
                    j = -9223372036854775807L;
                    z6 = !this.zzv.zza.zzo();
                    jLongValue = jLongValue2;
                } else {
                    Object obj = pairZzy.first;
                    jLongValue = ((Long) pairZzy.second).longValue();
                    j = zzlgVar.zzc == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                    zzvo zzvoVarZzi = this.zzq.zzi(this.zzv.zza, obj, jLongValue);
                    if (zzvoVarZzi.zzb()) {
                        this.zzv.zza.zzn(zzvoVarZzi.zza, this.zzl);
                        if (this.zzl.zze(zzvoVarZzi.zzb) == zzvoVarZzi.zzc) {
                            this.zzl.zzj();
                        }
                        zzvoVar = zzvoVarZzi;
                        z6 = true;
                        jLongValue = 0;
                    } else {
                        z6 = zzlgVar.zzc == -9223372036854775807L;
                        zzvoVar = zzvoVarZzi;
                    }
                }
                try {
                    try {
                        if (this.zzv.zza.zzo()) {
                            this.zzH = zzlgVar;
                        } else if (pairZzy == null) {
                            if (this.zzv.zze != 1) {
                                zzU(4);
                            }
                            zzM(false, true, false, true);
                        } else {
                            try {
                                if (zzvoVar.equals(this.zzv.zzb)) {
                                    zzlq zzlqVarZze6 = this.zzq.zze();
                                    jZza = (zzlqVarZze6 == null || !zzlqVarZze6.zzd || jLongValue == 0) ? jLongValue : zzlqVarZze6.zza.zza(jLongValue, this.zzu);
                                    zzvoVar2 = zzvoVar;
                                    try {
                                        if (zzgd.zzu(jZza) == zzgd.zzu(this.zzv.zzr) && ((i4 = (zzmgVar = this.zzv).zze) == 2 || i4 == 3)) {
                                            long j8 = zzmgVar.zzr;
                                            zzmgVarZzz = zzz(zzvoVar2, j8, j, j8, z6, 2);
                                            this.zzv = zzmgVarZzz;
                                            z = true;
                                            zzJ();
                                            return z;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = th;
                                        th2 = th;
                                        j2 = jLongValue;
                                        this.zzv = zzz(zzvoVar2, j2, j, j2, z6, 2);
                                        throw th2;
                                    }
                                } else {
                                    zzvoVar2 = zzvoVar;
                                    jZza = jLongValue;
                                }
                                zzmg zzmgVar4 = this.zzv;
                                zzdc zzdcVar2 = zzmgVar4.zza;
                                zzab(zzdcVar2, zzvoVar2, zzdcVar2, zzmgVar4.zzb, j, true);
                                j3 = jZzv;
                                zzmgVarZzz = zzz(zzvoVar2, j3, j, j3, z6, 2);
                                this.zzv = zzmgVarZzz;
                                z = true;
                                zzJ();
                                return z;
                            } catch (Throwable th4) {
                                j2 = jZzv;
                                th2 = th4;
                                this.zzv = zzz(zzvoVar2, j2, j, j2, z6, 2);
                                throw th2;
                            }
                            jZzv = zzv(zzvoVar2, jZza, this.zzv.zze == 4);
                            z6 |= jLongValue != jZzv;
                        }
                        j3 = jLongValue;
                        zzvoVar2 = zzvoVar;
                        zzmgVarZzz = zzz(zzvoVar2, j3, j, j3, z6, 2);
                        this.zzv = zzmgVarZzz;
                        z = true;
                        zzJ();
                        return z;
                    } catch (Throwable th5) {
                        th = th5;
                        zzvoVar2 = zzvoVar;
                        th2 = th;
                        j2 = jLongValue;
                        this.zzv = zzz(zzvoVar2, j2, j, j2, z6, 2);
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    zzvoVar2 = zzvoVar;
                }
                break;
            case 4:
                zzS((zzcl) message.obj);
                zzG(this.zzn.zzc(), true);
                z = true;
                zzJ();
                return z;
            case 5:
                this.zzu = (zzmr) message.obj;
                z = true;
                zzJ();
                return z;
            case 6:
                zzW(false, true);
                z = true;
                zzJ();
                return z;
            case 7:
                try {
                    zzM(true, false, true, false);
                    int i16 = 0;
                    while (true) {
                        int length9 = this.zza.length;
                        if (i16 >= 2) {
                            this.zzf.zzd(this.zzt);
                            zzU(1);
                            HandlerThread handlerThread = this.zzi;
                            if (handlerThread != null) {
                                handlerThread.quit();
                            }
                            synchronized (this) {
                                this.zzx = true;
                                notifyAll();
                            }
                            return true;
                        }
                        this.zzc[i16].zzp();
                        this.zza[i16].zzG();
                        i16++;
                    }
                } catch (Throwable th7) {
                    HandlerThread handlerThread2 = this.zzi;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                    }
                    synchronized (this) {
                        this.zzx = true;
                        notifyAll();
                        throw th7;
                    }
                }
            case 8:
                if (this.zzq.zzm((zzvm) message.obj)) {
                    zzlq zzlqVarZzd2 = this.zzq.zzd();
                    zzlqVarZzd2.zzl(this.zzn.zzc().zzc, this.zzv.zza);
                    zzZ(zzlqVarZzd2.zzf.zza, zzlqVarZzd2.zzh(), zzlqVarZzd2.zzi());
                    if (zzlqVarZzd2 == this.zzq.zze()) {
                        zzO(zzlqVarZzd2.zzf.zzb);
                        zzB();
                        zzmg zzmgVar5 = this.zzv;
                        zzvo zzvoVar7 = zzmgVar5.zzb;
                        long j9 = zzlqVarZzd2.zzf.zzb;
                        this.zzv = zzz(zzvoVar7, j9, zzmgVar5.zzc, j9, false, 5);
                    }
                    zzI();
                }
                z = true;
                zzJ();
                return z;
            case 9:
                if (this.zzq.zzm((zzvm) message.obj)) {
                    this.zzq.zzl(this.zzI);
                    zzI();
                }
                z = true;
                zzJ();
                return z;
            case 10:
                zzK();
                z = true;
                zzJ();
                return z;
            case 11:
                int i17 = message.arg1;
                this.zzD = i17;
                if (!this.zzq.zzq(this.zzv.zza, i17)) {
                    zzR(true);
                }
                zzE(false);
                z = true;
                zzJ();
                return z;
            case 12:
                boolean z16 = message.arg1 != 0;
                this.zzE = z16;
                if (!this.zzq.zzr(this.zzv.zza, z16)) {
                    zzR(true);
                }
                zzE(false);
                z = true;
                zzJ();
                return z;
            case 13:
                boolean z17 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (this.zzF != z17) {
                    this.zzF = z17;
                    if (!z17) {
                        zzmn[] zzmnVarArr7 = this.zza;
                        int length10 = zzmnVarArr7.length;
                        for (int i18 = 0; i18 < 2; i18++) {
                            zzmn zzmnVar6 = zzmnVarArr7[i18];
                            if (!zzaf(zzmnVar6) && this.zzb.remove(zzmnVar6)) {
                                zzmnVar6.zzI();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        notifyAll();
                    }
                }
                z = true;
                zzJ();
                return z;
            case 14:
                zzmj zzmjVar = (zzmj) message.obj;
                if (zzmjVar.zzb() == this.zzj) {
                    zzal(zzmjVar);
                    int i19 = this.zzv.zze;
                    if (i19 == 3 || i19 == 2) {
                        this.zzh.zzi(2);
                    }
                } else {
                    this.zzh.zzc(15, zzmjVar).zza();
                }
                z = true;
                zzJ();
                return z;
            case 15:
                final zzmj zzmjVar2 = (zzmj) message.obj;
                Looper looperZzb = zzmjVar2.zzb();
                if (looperZzb.getThread().isAlive()) {
                    this.zzp.zzb(looperZzb, null).zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzky
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzlh.zzr(zzmjVar2);
                        }
                    });
                } else {
                    zzfk.zzf("TAG", "Trying to send message on a dead thread.");
                    zzmjVar2.zzh(false);
                }
                z = true;
                zzJ();
                return z;
            case 16:
                zzG((zzcl) message.obj, false);
                z = true;
                zzJ();
                return z;
            case 17:
                zzlc zzlcVar = (zzlc) message.obj;
                this.zzw.zza(1);
                if (zzlcVar.zzb != -1) {
                    this.zzH = new zzlg(new zzml(zzlcVar.zza, zzlcVar.zzd), zzlcVar.zzb, zzlcVar.zzc);
                }
                zzF(this.zzr.zzn(zzlcVar.zza, zzlcVar.zzd), false);
                z = true;
                zzJ();
                return z;
            case 18:
                zzlc zzlcVar2 = (zzlc) message.obj;
                int iZza = message.arg1;
                this.zzw.zza(1);
                zzmf zzmfVar = this.zzr;
                if (iZza == -1) {
                    iZza = zzmfVar.zza();
                }
                zzF(zzmfVar.zzk(iZza, zzlcVar2.zza, zzlcVar2.zzd), false);
                z = true;
                zzJ();
                return z;
            case 19:
                zzld zzldVar = (zzld) message.obj;
                this.zzw.zza(1);
                zzmf zzmfVar2 = this.zzr;
                int i20 = zzldVar.zza;
                int i21 = zzldVar.zzb;
                int i22 = zzldVar.zzc;
                zzxi zzxiVar = zzldVar.zzd;
                zzF(zzmfVar2.zzl(0, 0, 0, null), false);
                z = true;
                zzJ();
                return z;
            case 20:
                int i23 = message.arg1;
                int i24 = message.arg2;
                zzxi zzxiVar2 = (zzxi) message.obj;
                this.zzw.zza(1);
                zzF(this.zzr.zzm(i23, i24, zzxiVar2), false);
                z = true;
                zzJ();
                return z;
            case 21:
                zzxi zzxiVar3 = (zzxi) message.obj;
                this.zzw.zza(1);
                zzF(this.zzr.zzo(zzxiVar3), false);
                z = true;
                zzJ();
                return z;
            case 22:
                zzF(this.zzr.zzb(), true);
                z = true;
                zzJ();
                return z;
            case 23:
                this.zzy = message.arg1 != 0;
                zzN();
                if (this.zzz && this.zzq.zzf() != this.zzq.zze()) {
                    zzR(true);
                    zzE(false);
                }
                z = true;
                zzJ();
                return z;
            case 24:
            default:
                return false;
            case 25:
                zzL();
                z = true;
                zzJ();
                return z;
            case 26:
                zzL();
                z = true;
                zzJ();
                return z;
            case 27:
                int i25 = message.arg1;
                int i26 = message.arg2;
                List list = (List) message.obj;
                this.zzw.zza(1);
                zzF(this.zzr.zzc(i25, i26, list), false);
                z = true;
                zzJ();
                return z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zza(zzcl zzclVar) {
        this.zzh.zzc(16, zzclVar).zza();
    }

    public final Looper zzb() {
        return this.zzj;
    }

    final /* synthetic */ Boolean zze() {
        return Boolean.valueOf(this.zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final /* bridge */ /* synthetic */ void zzg(zzxh zzxhVar) {
        this.zzh.zzc(9, (zzvm) zzxhVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzme
    public final void zzh() {
        this.zzh.zzi(22);
    }

    @Override // com.google.android.gms.internal.ads.zzvl
    public final void zzi(zzvm zzvmVar) {
        this.zzh.zzc(8, zzvmVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzl
    public final void zzj() {
        this.zzh.zzi(10);
    }

    public final void zzk() {
        this.zzh.zzb(0).zza();
    }

    public final void zzl(zzdc zzdcVar, int i, long j) {
        this.zzh.zzc(3, new zzlg(zzdcVar, i, j)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final synchronized void zzm(zzmj zzmjVar) {
        if (!this.zzx && this.zzj.getThread().isAlive()) {
            this.zzh.zzc(14, zzmjVar).zza();
            return;
        }
        zzfk.zzf("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        zzmjVar.zzh(false);
    }

    public final void zzn(boolean z, int i) {
        this.zzh.zzd(1, z ? 1 : 0, i).zza();
    }

    public final void zzo() {
        this.zzh.zzb(6).zza();
    }

    public final synchronized boolean zzp() {
        if (!this.zzx && this.zzj.getThread().isAlive()) {
            this.zzh.zzi(7);
            zzad(new zzkx(this), this.zzs);
            return this.zzx;
        }
        return true;
    }

    public final void zzq(List list, int i, long j, zzxi zzxiVar) {
        this.zzh.zzc(17, new zzlc(list, zzxiVar, i, j, null)).zza();
    }
}
