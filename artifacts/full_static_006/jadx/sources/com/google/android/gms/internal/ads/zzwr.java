package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzwr implements zzvm, zzadx, zzaaa, zzaaf, zzxd {
    private static final Map zzb;
    private static final zzan zzc;
    private long zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private int zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private boolean zzJ;
    private int zzK;
    private boolean zzL;
    private boolean zzM;
    private final zzzz zzN;
    private final zzzv zzO;
    private final Uri zzd;
    private final zzhb zze;
    private final zzst zzf;
    private final zzvx zzg;
    private final zzso zzh;
    private final zzwn zzi;
    private final long zzj;
    private final zzaai zzk = new zzaai("ProgressiveMediaPeriod");
    private final zzwg zzl;
    private final zzeu zzm;
    private final Runnable zzn;
    private final Runnable zzo;
    private final Handler zzp;
    private final boolean zzq;
    private zzvl zzr;
    private zzaha zzs;
    private zzxe[] zzt;
    private zzwp[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private zzwq zzy;
    private zzaet zzz;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzal zzalVar = new zzal();
        zzalVar.zzK("icy");
        zzalVar.zzX("application/x-icy");
        zzc = zzalVar.zzad();
    }

    public zzwr(Uri uri, zzhb zzhbVar, zzwg zzwgVar, zzst zzstVar, zzso zzsoVar, zzzz zzzzVar, zzvx zzvxVar, zzwn zzwnVar, zzzv zzzvVar, String str, int i, long j) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zzstVar;
        this.zzh = zzsoVar;
        this.zzN = zzzzVar;
        this.zzg = zzvxVar;
        this.zzi = zzwnVar;
        this.zzO = zzzvVar;
        this.zzj = i;
        this.zzl = zzwgVar;
        this.zzA = j;
        this.zzq = j != -9223372036854775807L;
        this.zzm = new zzeu(zzer.zza);
        this.zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzU();
            }
        };
        this.zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzE();
            }
        };
        this.zzp = zzgd.zzx(null);
        this.zzu = new zzwp[0];
        this.zzt = new zzxe[0];
        this.zzI = -9223372036854775807L;
        this.zzC = 1;
    }

    static /* bridge */ /* synthetic */ void zzC(final zzwr zzwrVar) {
        zzwrVar.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF();
            }
        });
    }

    private final int zzQ() {
        int iZzd = 0;
        for (zzxe zzxeVar : this.zzt) {
            iZzd += zzxeVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzR(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzxe[] zzxeVarArr = this.zzt;
            if (i >= zzxeVarArr.length) {
                return jMax;
            }
            if (!z) {
                zzwq zzwqVar = this.zzy;
                zzwqVar.getClass();
                if (zzwqVar.zzc[i]) {
                    jMax = Math.max(jMax, zzxeVarArr[i].zzh());
                }
            }
            i++;
        }
    }

    private final zzafa zzS(zzwp zzwpVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzwpVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        zzxe zzxeVar = new zzxe(this.zzO, this.zzf, this.zzh);
        zzxeVar.zzu(this);
        int i2 = length + 1;
        zzwp[] zzwpVarArr = (zzwp[]) Arrays.copyOf(this.zzu, i2);
        zzwpVarArr[length] = zzwpVar;
        int i3 = zzgd.zza;
        this.zzu = zzwpVarArr;
        zzxe[] zzxeVarArr = (zzxe[]) Arrays.copyOf(this.zzt, i2);
        zzxeVarArr[length] = zzxeVar;
        this.zzt = zzxeVarArr;
        return zzxeVar;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzT() {
        zzeq.zzf(this.zzw);
        this.zzy.getClass();
        this.zzz.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        int i;
        if (this.zzM || this.zzw || !this.zzv || this.zzz == null) {
            return;
        }
        for (zzxe zzxeVar : this.zzt) {
            if (zzxeVar.zzi() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzt.length;
        zzde[] zzdeVarArr = new zzde[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzan zzanVarZzi = this.zzt[i2].zzi();
            zzanVarZzi.getClass();
            String str = zzanVarZzi.zzn;
            boolean zZzg = zzcg.zzg(str);
            boolean z = zZzg || zzcg.zzh(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            zzaha zzahaVar = this.zzs;
            if (zzahaVar != null) {
                if (zZzg || this.zzu[i2].zzb) {
                    zzcd zzcdVar = zzanVarZzi.zzl;
                    zzcd zzcdVar2 = zzcdVar == null ? new zzcd(-9223372036854775807L, zzahaVar) : zzcdVar.zzc(zzahaVar);
                    zzal zzalVarZzb = zzanVarZzi.zzb();
                    zzalVarZzb.zzQ(zzcdVar2);
                    zzanVarZzi = zzalVarZzb.zzad();
                }
                if (zZzg && zzanVarZzi.zzh == -1 && zzanVarZzi.zzi == -1 && (i = zzahaVar.zza) != -1) {
                    zzal zzalVarZzb2 = zzanVarZzi.zzb();
                    zzalVarZzb2.zzx(i);
                    zzanVarZzi = zzalVarZzb2.zzad();
                }
            }
            zzdeVarArr[i2] = new zzde(Integer.toString(i2), zzanVarZzi.zzc(this.zzf.zza(zzanVarZzi)));
        }
        this.zzy = new zzwq(new zzxr(zzdeVarArr), zArr);
        this.zzw = true;
        zzvl zzvlVar = this.zzr;
        zzvlVar.getClass();
        zzvlVar.zzi(this);
    }

    private final void zzV(int i) {
        zzT();
        zzwq zzwqVar = this.zzy;
        boolean[] zArr = zzwqVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzan zzanVarZzb = zzwqVar.zza.zzb(i).zzb(0);
        this.zzg.zzc(new zzvk(1, zzcg.zzb(zzanVarZzb.zzn), zzanVarZzb, 0, null, zzgd.zzu(this.zzH), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (this.zzJ && zArr[i] && !this.zzt[i].zzx(false)) {
            this.zzI = 0L;
            this.zzJ = false;
            this.zzE = true;
            this.zzH = 0L;
            this.zzK = 0;
            for (zzxe zzxeVar : this.zzt) {
                zzxeVar.zzp(false);
            }
            zzvl zzvlVar = this.zzr;
            zzvlVar.getClass();
            zzvlVar.zzg(this);
        }
    }

    private final void zzX() {
        zzwm zzwmVar = new zzwm(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzw) {
            zzeq.zzf(zzY());
            long j = this.zzA;
            if (j != -9223372036854775807L && this.zzI > j) {
                this.zzL = true;
                this.zzI = -9223372036854775807L;
                return;
            }
            zzaet zzaetVar = this.zzz;
            zzaetVar.getClass();
            zzwm.zzf(zzwmVar, zzaetVar.zzg(this.zzI).zza.zzc, this.zzI);
            for (zzxe zzxeVar : this.zzt) {
                zzxeVar.zzt(this.zzI);
            }
            this.zzI = -9223372036854775807L;
        }
        this.zzK = zzQ();
        long jZza = this.zzk.zza(zzwmVar, this, zzzz.zza(this.zzC));
        zzhh zzhhVar = zzwmVar.zzl;
        this.zzg.zzg(new zzvf(zzwmVar.zzb, zzhhVar, zzhhVar.zza, Collections.emptyMap(), jZza, 0L, 0L), new zzvk(1, -1, null, 0, null, zzgd.zzu(zzwmVar.zzk), zzgd.zzu(this.zzA)));
    }

    private final boolean zzY() {
        return this.zzI != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzE || zzY();
    }

    static /* bridge */ /* synthetic */ long zzr(zzwr zzwrVar, boolean z) {
        return zzwrVar.zzR(true);
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzD() {
        this.zzv = true;
        this.zzp.post(this.zzn);
    }

    final /* synthetic */ void zzF() {
        this.zzG = true;
    }

    final void zzH() throws IOException {
        this.zzk.zzi(zzzz.zza(this.zzC));
    }

    final void zzI(int i) throws IOException {
        this.zzt[i].zzm();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final /* bridge */ /* synthetic */ void zzJ(zzaae zzaaeVar, long j, long j2, boolean z) {
        zzwm zzwmVar = (zzwm) zzaaeVar;
        zzid zzidVar = zzwmVar.zzd;
        zzvf zzvfVar = new zzvf(zzwmVar.zzb, zzwmVar.zzl, zzidVar.zzh(), zzidVar.zzi(), j, j2, zzidVar.zzg());
        long unused = zzwmVar.zzb;
        this.zzg.zzd(zzvfVar, new zzvk(1, -1, null, 0, null, zzgd.zzu(zzwmVar.zzk), zzgd.zzu(this.zzA)));
        if (z) {
            return;
        }
        for (zzxe zzxeVar : this.zzt) {
            zzxeVar.zzp(false);
        }
        if (this.zzF > 0) {
            zzvl zzvlVar = this.zzr;
            zzvlVar.getClass();
            zzvlVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final /* bridge */ /* synthetic */ void zzK(zzaae zzaaeVar, long j, long j2) {
        zzaet zzaetVar;
        if (this.zzA == -9223372036854775807L && (zzaetVar = this.zzz) != null) {
            boolean zZzh = zzaetVar.zzh();
            long jZzR = zzR(true);
            long j3 = jZzR == Long.MIN_VALUE ? 0L : jZzR + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzA = j3;
            this.zzi.zza(j3, zZzh, this.zzB);
        }
        zzwm zzwmVar = (zzwm) zzaaeVar;
        zzid zzidVar = zzwmVar.zzd;
        zzvf zzvfVar = new zzvf(zzwmVar.zzb, zzwmVar.zzl, zzidVar.zzh(), zzidVar.zzi(), j, j2, zzidVar.zzg());
        long unused = zzwmVar.zzb;
        this.zzg.zze(zzvfVar, new zzvk(1, -1, null, 0, null, zzgd.zzu(zzwmVar.zzk), zzgd.zzu(this.zzA)));
        this.zzL = true;
        zzvl zzvlVar = this.zzr;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaaf
    public final void zzL() {
        for (zzxe zzxeVar : this.zzt) {
            zzxeVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzM(zzan zzanVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzxe zzxeVar : this.zzt) {
                zzxeVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzM = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zzO(final zzaet zzaetVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(zzaetVar);
            }
        });
    }

    final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzx(this.zzL);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zza(long j, zzmr zzmrVar) {
        zzT();
        if (!this.zzz.zzh()) {
            return 0L;
        }
        zzaer zzaerVarZzg = this.zzz.zzg(j);
        zzaeu zzaeuVar = zzaerVarZzg.zza;
        zzaeu zzaeuVar2 = zzaerVarZzg.zzb;
        long j2 = zzmrVar.zzf;
        if (j2 == 0) {
            if (zzmrVar.zzg == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzaeuVar.zzb;
        int i = zzgd.zza;
        long j4 = j - j2;
        long j5 = zzmrVar.zzg;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = zzaeuVar2.zzb;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            return z2 ? j9 : j4;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzb() {
        long jZzR;
        zzT();
        if (this.zzL || this.zzF == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzI;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzR = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzwq zzwqVar = this.zzy;
                if (zzwqVar.zzb[i] && zzwqVar.zzc[i] && !this.zzt[i].zzw()) {
                    jZzR = Math.min(jZzR, this.zzt[i].zzh());
                }
            }
        } else {
            jZzR = Long.MAX_VALUE;
        }
        if (jZzR == Long.MAX_VALUE) {
            jZzR = zzR(false);
        }
        return jZzR == Long.MIN_VALUE ? this.zzH : jZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final long zzd() {
        if (!this.zzE) {
            return -9223372036854775807L;
        }
        if (!this.zzL && zzQ() <= this.zzK) {
            return -9223372036854775807L;
        }
        this.zzE = false;
        return this.zzH;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        zzaai zzaaiVar;
        zzT();
        boolean[] zArr = this.zzy.zzb;
        if (true != this.zzz.zzh()) {
            j = 0;
        }
        this.zzE = false;
        this.zzH = j;
        if (zzY()) {
            this.zzI = j;
            return j;
        }
        if (this.zzC != 7) {
            int length = this.zzt.length;
            for (int i = 0; i < length; i++) {
                zzxe zzxeVar = this.zzt[i];
                if (!(this.zzq ? zzxeVar.zzy(zzxeVar.zza()) : zzxeVar.zzz(j, false)) && (zArr[i] || !this.zzx)) {
                    this.zzJ = false;
                    this.zzI = j;
                    this.zzL = false;
                    zzaaiVar = this.zzk;
                    if (zzaaiVar.zzl()) {
                        zzaaiVar.zzh();
                        for (zzxe zzxeVar2 : this.zzt) {
                            zzxeVar2.zzp(false);
                        }
                    } else {
                        for (zzxe zzxeVar3 : this.zzt) {
                            zzxeVar3.zzk();
                        }
                        this.zzk.zzg();
                    }
                }
            }
        } else {
            this.zzJ = false;
            this.zzI = j;
            this.zzL = false;
            zzaaiVar = this.zzk;
            if (zzaaiVar.zzl()) {
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // com.google.android.gms.internal.ads.zzvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzzg[] zzzgVarArr, boolean[] zArr, zzxf[] zzxfVarArr, boolean[] zArr2, long j) {
        boolean z;
        zzzg zzzgVar;
        zzT();
        zzwq zzwqVar = this.zzy;
        zzxr zzxrVar = zzwqVar.zza;
        boolean[] zArr3 = zzwqVar.zzc;
        int i = this.zzF;
        int i2 = 0;
        for (int i3 = 0; i3 < zzzgVarArr.length; i3++) {
            zzxf zzxfVar = zzxfVarArr[i3];
            if (zzxfVar != null && (zzzgVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((zzwo) zzxfVar).zzb;
                zzeq.zzf(zArr3[i4]);
                this.zzF--;
                zArr3[i4] = false;
                zzxfVarArr[i3] = null;
            }
        }
        if (this.zzq) {
            z = false;
        } else {
            if (this.zzD) {
                if (i == 0) {
                }
            } else if (j == 0) {
                z = false;
                j = 0;
            }
            z = true;
        }
        for (int i5 = 0; i5 < zzzgVarArr.length; i5++) {
            if (zzxfVarArr[i5] == null && (zzzgVar = zzzgVarArr[i5]) != null) {
                zzeq.zzf(zzzgVar.zzc() == 1);
                zzeq.zzf(zzzgVar.zza(0) == 0);
                int iZza = zzxrVar.zza(zzzgVar.zze());
                zzeq.zzf(!zArr3[iZza]);
                this.zzF++;
                zArr3[iZza] = true;
                zzxfVarArr[i5] = new zzwo(this, iZza);
                zArr2[i5] = true;
                if (!z) {
                    zzxe zzxeVar = this.zzt[iZza];
                    z = (zzxeVar.zzb() == 0 || zzxeVar.zzz(j, true)) ? false : true;
                }
            }
        }
        if (this.zzF == 0) {
            this.zzJ = false;
            this.zzE = false;
            if (this.zzk.zzl()) {
                zzxe[] zzxeVarArr = this.zzt;
                int length = zzxeVarArr.length;
                while (i2 < length) {
                    zzxeVarArr[i2].zzk();
                    i2++;
                }
                this.zzk.zzg();
            } else {
                for (zzxe zzxeVar2 : this.zzt) {
                    zzxeVar2.zzp(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zzxfVarArr.length) {
                if (zzxfVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzD = true;
        return j;
    }

    final int zzg(int i, zzlj zzljVar, zzin zzinVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int iZze = this.zzt[i].zze(zzljVar, zzinVar, i2, this.zzL);
        if (iZze == -3) {
            zzW(i);
        }
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzxr zzh() {
        zzT();
        return this.zzy.zza;
    }

    final int zzi(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzxe zzxeVar = this.zzt[i];
        int iZzc = zzxeVar.zzc(j, this.zzL);
        zzxeVar.zzv(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        zzW(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzj(long j, boolean z) {
        if (this.zzq) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzy.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() throws IOException {
        zzH();
        if (this.zzL && !this.zzw) {
            throw zzch.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl(zzvl zzvlVar, long j) {
        this.zzr = zzvlVar;
        this.zzm.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzo(zzlo zzloVar) {
        if (this.zzL) {
            return false;
        }
        zzaai zzaaiVar = this.zzk;
        if (zzaaiVar.zzk() || this.zzJ) {
            return false;
        }
        if (this.zzw && this.zzF == 0) {
            return false;
        }
        boolean zZze = this.zzm.zze();
        if (zzaaiVar.zzl()) {
            return zZze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzxh
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzaaa
    public final /* bridge */ /* synthetic */ zzaac zzu(zzaae zzaaeVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzaac zzaacVarZzb;
        zzaet zzaetVar;
        zzwm zzwmVar = (zzwm) zzaaeVar;
        zzid zzidVar = zzwmVar.zzd;
        zzvf zzvfVar = new zzvf(zzwmVar.zzb, zzwmVar.zzl, zzidVar.zzh(), zzidVar.zzi(), j, j2, zzidVar.zzg());
        long unused = zzwmVar.zzk;
        int i2 = zzgd.zza;
        if ((iOException instanceof zzch) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzhu) || (iOException instanceof zzaah)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzhc) && ((zzhc) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzaacVarZzb = zzaai.zzd;
        } else {
            int iZzQ = zzQ();
            boolean z = iZzQ > this.zzK;
            if (this.zzG || !((zzaetVar = this.zzz) == null || zzaetVar.zza() == -9223372036854775807L)) {
                this.zzK = iZzQ;
            } else {
                boolean z2 = this.zzw;
                if (!z2 || zzZ()) {
                    this.zzE = z2;
                    this.zzH = 0L;
                    this.zzK = 0;
                    for (zzxe zzxeVar : this.zzt) {
                        zzxeVar.zzp(false);
                    }
                    zzwm.zzf(zzwmVar, 0L, 0L);
                } else {
                    this.zzJ = true;
                    zzaacVarZzb = zzaai.zzc;
                }
            }
            zzaacVarZzb = zzaai.zzb(z, jMin);
        }
        boolean zZzc = zzaacVarZzb.zzc();
        this.zzg.zzf(zzvfVar, new zzvk(1, -1, null, 0, null, zzgd.zzu(zzwmVar.zzk), zzgd.zzu(this.zzA)), iOException, !zZzc);
        if (!zZzc) {
            long unused2 = zzwmVar.zzb;
        }
        return zzaacVarZzb;
    }

    final zzafa zzv() {
        return zzS(new zzwp(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final zzafa zzw(int i, int i2) {
        return zzS(new zzwp(i, false));
    }

    final /* synthetic */ void zzE() {
        if (this.zzM) {
            return;
        }
        zzvl zzvlVar = this.zzr;
        zzvlVar.getClass();
        zzvlVar.zzg(this);
    }

    final /* synthetic */ void zzG(zzaet zzaetVar) {
        this.zzz = this.zzs == null ? zzaetVar : new zzaes(-9223372036854775807L, 0L);
        if (zzaetVar.zza() == -9223372036854775807L && this.zzA != -9223372036854775807L) {
            this.zzz = new zzwl(this, this.zzz);
        }
        this.zzA = this.zzz.zza();
        boolean z = false;
        if (!this.zzG && zzaetVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzB = z;
        this.zzC = true == z ? 7 : 1;
        this.zzi.zza(this.zzA, zzaetVar.zzh(), this.zzB);
        if (this.zzw) {
            return;
        }
        zzU();
    }
}
