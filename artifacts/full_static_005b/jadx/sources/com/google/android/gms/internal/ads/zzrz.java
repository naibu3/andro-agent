package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzrz implements zzqv {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private zzrp zzA;
    private zzcl zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private int zzT;
    private zzl zzU;
    private zzpx zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;
    private Looper zzZ;
    private long zzaa;
    private long zzab;
    private Handler zzac;
    private final zzrn zzad;
    private final zzrd zzae;
    private final Context zzd;
    private final zzra zze;
    private final zzsj zzf;
    private final zzgbc zzg;
    private final zzgbc zzh;
    private final zzeu zzi;
    private final zzqz zzj;
    private final ArrayDeque zzk;
    private zzrx zzl;
    private final zzrs zzm;
    private final zzrs zzn;
    private final zzrk zzo;
    private zzpj zzp;
    private zzqs zzq;
    private zzrm zzr;
    private zzrm zzs;
    private zzdw zzt;
    private AudioTrack zzu;
    private zzpp zzv;
    private zzpw zzw;
    private zzrr zzx;
    private zzk zzy;
    private zzrp zzz;

    /* synthetic */ zzrz(zzrl zzrlVar, zzry zzryVar) {
        zzpp zzppVarZzc;
        Context context = zzrlVar.zza;
        this.zzd = context;
        zzk zzkVar = zzk.zza;
        this.zzy = zzkVar;
        if (context != null) {
            zzpp zzppVar = zzpp.zza;
            int i = zzgd.zza;
            zzppVarZzc = zzpp.zzc(context, zzkVar, null);
        } else {
            zzppVarZzc = zzrlVar.zzb;
        }
        this.zzv = zzppVarZzc;
        this.zzad = zzrlVar.zze;
        int i2 = zzgd.zza;
        this.zzo = zzrlVar.zzd;
        zzrd zzrdVar = zzrlVar.zzf;
        zzrdVar.getClass();
        this.zzae = zzrdVar;
        zzeu zzeuVar = new zzeu(zzer.zza);
        this.zzi = zzeuVar;
        zzeuVar.zze();
        this.zzj = new zzqz(new zzru(this, null));
        zzra zzraVar = new zzra();
        this.zze = zzraVar;
        zzsj zzsjVar = new zzsj();
        this.zzf = zzsjVar;
        this.zzg = zzgbc.zzp(new zzed(), zzraVar, zzsjVar);
        this.zzh = zzgbc.zzn(new zzsi());
        this.zzL = 1.0f;
        this.zzT = 0;
        this.zzU = new zzl(0, 0.0f);
        this.zzA = new zzrp(zzcl.zza, 0L, 0L, null);
        this.zzB = zzcl.zza;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzrs(100L);
        this.zzn = new zzrs(100L);
    }

    public static /* synthetic */ void zzG(zzrz zzrzVar) {
        if (zzrzVar.zzab >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zzse) zzrzVar.zzq).zza.zzn = true;
            zzrzVar.zzab = 0L;
        }
    }

    static /* synthetic */ void zzI(AudioTrack audioTrack, final zzqs zzqsVar, Handler handler, final zzqp zzqpVar, zzeu zzeuVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqsVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzse) zzqsVar).zza.zzc.zzd(zzqpVar);
                    }
                });
            }
            zzeuVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzqsVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzse) zzqsVar).zza.zzc.zzd(zzqpVar);
                    }
                });
            }
            zzeuVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        return this.zzs.zzc == 0 ? this.zzD / r0.zzb : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzM() {
        zzrm zzrmVar = this.zzs;
        if (zzrmVar.zzc != 0) {
            return this.zzG;
        }
        long j = this.zzF;
        long j2 = zzrmVar.zzd;
        int i = zzgd.zza;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack zzN(zzrm zzrmVar) throws zzqr {
        try {
            return zzrmVar.zza(this.zzy, this.zzT);
        } catch (zzqr e) {
            zzqs zzqsVar = this.zzq;
            if (zzqsVar != null) {
                zzqsVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzO(long j) {
        zzcl zzclVar;
        boolean z;
        if (zzaa()) {
            zzrn zzrnVar = this.zzad;
            zzclVar = this.zzB;
            zzrnVar.zzc(zzclVar);
        } else {
            zzclVar = zzcl.zza;
        }
        zzcl zzclVar2 = zzclVar;
        this.zzB = zzclVar2;
        if (zzaa()) {
            zzrn zzrnVar2 = this.zzad;
            z = this.zzC;
            zzrnVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzC = z;
        this.zzk.add(new zzrp(zzclVar2, Math.max(0L, j), zzgd.zzs(zzM(), this.zzs.zze), null));
        zzV();
        zzqs zzqsVar = this.zzq;
        if (zzqsVar != null) {
            ((zzse) zzqsVar).zza.zzc.zzw(this.zzC);
        }
    }

    private final void zzP() {
        if (this.zzs.zzc()) {
            this.zzX = true;
        }
    }

    private final void zzQ() {
        if (this.zzw != null || this.zzd == null) {
            return;
        }
        this.zzZ = Looper.myLooper();
        zzpw zzpwVar = new zzpw(this.zzd, new zzrh(this), this.zzy, this.zzV);
        this.zzw = zzpwVar;
        this.zzv = zzpwVar.zzc();
    }

    private final void zzR() throws IllegalStateException {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzb(zzM());
        this.zzu.stop();
    }

    private final void zzS(long j) throws Exception {
        ByteBuffer byteBufferZzb;
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer == null) {
                byteBuffer = zzdz.zza;
            }
            zzW(byteBuffer, j);
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                byteBufferZzb = this.zzt.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzW(byteBufferZzb, j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzM;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zze(this.zzM);
                    }
                }
            } while (!byteBufferZzb.hasRemaining());
            return;
        }
    }

    private final void zzT(zzcl zzclVar) {
        zzrp zzrpVar = new zzrp(zzclVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzY()) {
            this.zzz = zzrpVar;
        } else {
            this.zzA = zzrpVar;
        }
    }

    private final void zzU() {
        if (zzY()) {
            int i = zzgd.zza;
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzV() {
        zzdw zzdwVar = this.zzs.zzi;
        this.zzt = zzdwVar;
        zzdwVar.zzc();
    }

    private final void zzW(ByteBuffer byteBuffer, long j) throws Exception {
        zzqs zzqsVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzO;
            if (byteBuffer2 != null) {
                zzeq.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzO = byteBuffer;
                int i = zzgd.zza;
            }
            int iRemaining = byteBuffer.remaining();
            int i2 = zzgd.zza;
            int iWrite = this.zzu.write(byteBuffer, iRemaining, 1);
            this.zzW = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if ((zzgd.zza >= 24 && iWrite == -6) || iWrite == -32) {
                    if (zzM() > 0) {
                        z = true;
                    } else if (zzZ(this.zzu)) {
                        zzP();
                        z = true;
                    }
                }
                zzqu zzquVar = new zzqu(iWrite, this.zzs.zza, z);
                zzqs zzqsVar2 = this.zzq;
                if (zzqsVar2 != null) {
                    zzqsVar2.zza(zzquVar);
                }
                if (zzquVar.zzb) {
                    this.zzv = zzpp.zza;
                    throw zzquVar;
                }
                this.zzn.zzb(zzquVar);
                return;
            }
            this.zzn.zza();
            if (zzZ(this.zzu)) {
                if (this.zzG > 0) {
                    this.zzY = false;
                }
                if (this.zzS && (zzqsVar = this.zzq) != null && iWrite < iRemaining) {
                    zzsf zzsfVar = ((zzse) zzqsVar).zza;
                    if (zzsfVar.zzm != null) {
                        zzsfVar.zzm.zza();
                    }
                }
            }
            int i3 = this.zzs.zzc;
            if (i3 == 0) {
                this.zzF += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i3 != 0) {
                    zzeq.zzf(byteBuffer == this.zzM);
                    this.zzG += this.zzH * this.zzN;
                }
                this.zzO = null;
            }
        }
    }

    private final boolean zzX() throws Exception {
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzO;
            if (byteBuffer == null) {
                return true;
            }
            zzW(byteBuffer, Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzd();
        zzS(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzO;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzY() {
        return this.zzu != null;
    }

    private static boolean zzZ(AudioTrack audioTrack) {
        return zzgd.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzaa() {
        zzrm zzrmVar = this.zzs;
        if (zzrmVar.zzc != 0) {
            return false;
        }
        int i = zzrmVar.zza.zzC;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzA(zzan zzanVar) {
        return zza(zzanVar) != 0;
    }

    public final void zzJ(zzpp zzppVar) {
        zzeq.zzf(this.zzZ == Looper.myLooper());
        if (zzppVar.equals(this.zzv)) {
            return;
        }
        this.zzv = zzppVar;
        zzqs zzqsVar = this.zzq;
        if (zzqsVar != null) {
            ((zzse) zzqsVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final int zza(zzan zzanVar) {
        zzQ();
        if (!"audio/raw".equals(zzanVar.zzn)) {
            return this.zzv.zzb(zzanVar, this.zzy) != null ? 2 : 0;
        }
        if (zzgd.zzK(zzanVar.zzC)) {
            return zzanVar.zzC != 2 ? 1 : 2;
        }
        zzfk.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzanVar.zzC);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final long zzb(boolean z) {
        long jZzp;
        if (!zzY() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzj.zza(z), zzgd.zzs(zzM(), this.zzs.zze));
        while (!this.zzk.isEmpty() && jMin >= ((zzrp) this.zzk.getFirst()).zzc) {
            this.zzA = (zzrp) this.zzk.remove();
        }
        zzrp zzrpVar = this.zzA;
        long j = jMin - zzrpVar.zzc;
        if (zzrpVar.zza.equals(zzcl.zza)) {
            jZzp = this.zzA.zzb + j;
        } else if (this.zzk.isEmpty()) {
            jZzp = this.zzad.zza(j) + this.zzA.zzb;
        } else {
            zzrp zzrpVar2 = (zzrp) this.zzk.getFirst();
            jZzp = zzrpVar2.zzb - zzgd.zzp(zzrpVar2.zzc - jMin, this.zzA.zza.zzc);
        }
        long jZzb = this.zzad.zzb();
        long jZzs = jZzp + zzgd.zzs(jZzb, this.zzs.zze);
        long j2 = this.zzaa;
        if (jZzb > j2) {
            long jZzs2 = zzgd.zzs(jZzb - j2, this.zzs.zze);
            this.zzaa = jZzb;
            this.zzab += jZzs2;
            if (this.zzac == null) {
                this.zzac = new Handler(Looper.myLooper());
            }
            this.zzac.removeCallbacksAndMessages(null);
            this.zzac.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrg
                @Override // java.lang.Runnable
                public final void run() {
                    zzrz.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzs;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final zzcl zzc() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final zzqa zzd(zzan zzanVar) {
        return this.zzX ? zzqa.zza : this.zzae.zza(zzanVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zze(zzan zzanVar, int i, int[] iArr) throws zzqq {
        int iIntValue;
        zzdw zzdwVar;
        int iZzm;
        int iIntValue2;
        int iZzm2;
        int i2;
        int i3;
        int i4;
        int iMax;
        zzQ();
        if ("audio/raw".equals(zzanVar.zzn)) {
            zzeq.zzd(zzgd.zzK(zzanVar.zzC));
            iZzm = zzgd.zzm(zzanVar.zzC, zzanVar.zzA);
            zzgaz zzgazVar = new zzgaz();
            int i5 = zzanVar.zzC;
            zzgazVar.zzh(this.zzg);
            zzgazVar.zzg(this.zzad.zze());
            zzdw zzdwVar2 = new zzdw(zzgazVar.zzi());
            if (zzdwVar2.equals(this.zzt)) {
                zzdwVar2 = this.zzt;
            }
            this.zzf.zzq(zzanVar.zzD, zzanVar.zzE);
            this.zze.zzo(iArr);
            try {
                zzdx zzdxVarZza = zzdwVar2.zza(new zzdx(zzanVar.zzB, zzanVar.zzA, zzanVar.zzC));
                iIntValue = zzdxVarZza.zzd;
                i2 = zzdxVarZza.zzb;
                int i6 = zzdxVarZza.zzc;
                iIntValue2 = zzgd.zzh(i6);
                zzdwVar = zzdwVar2;
                iZzm2 = zzgd.zzm(iIntValue, i6);
                i3 = 0;
            } catch (zzdy e) {
                throw new zzqq(e, zzanVar);
            }
        } else {
            zzdw zzdwVar3 = new zzdw(zzgbc.zzm());
            int i7 = zzanVar.zzB;
            zzqa zzqaVar = zzqa.zza;
            Pair pairZzb = this.zzv.zzb(zzanVar, this.zzy);
            if (pairZzb == null) {
                throw new zzqq("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzanVar))), zzanVar);
            }
            iIntValue = ((Integer) pairZzb.first).intValue();
            zzdwVar = zzdwVar3;
            iZzm = -1;
            iIntValue2 = ((Integer) pairZzb.second).intValue();
            iZzm2 = -1;
            i2 = i7;
            i3 = 2;
        }
        if (iIntValue == 0) {
            throw new zzqq("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(zzanVar), zzanVar);
        }
        if (iIntValue2 == 0) {
            throw new zzqq("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(zzanVar), zzanVar);
        }
        int i8 = zzanVar.zzj;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzanVar.zzn) && i8 == -1) {
            i8 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue2, iIntValue);
        zzeq.zzf(minBufferSize != -2);
        int i9 = iZzm2 != -1 ? iZzm2 : 1;
        int i10 = 250000;
        if (i3 == 0) {
            i4 = i3;
            iMax = Math.max(zzsb.zza(250000, i2, i9), Math.min(minBufferSize * 4, zzsb.zza(750000, i2, i9)));
        } else if (i3 != 1) {
            if (iIntValue == 5) {
                i10 = 500000;
            } else if (iIntValue == 8) {
                i10 = DurationKt.NANOS_IN_MILLIS;
                iIntValue = 8;
            }
            i4 = i3;
            iMax = zzgea.zzb((i10 * (i8 != -1 ? zzgds.zza(i8, 8, RoundingMode.CEILING) : zzsb.zzb(iIntValue))) / 1000000);
        } else {
            i4 = i3;
            iMax = zzgea.zzb((zzsb.zzb(iIntValue) * 50000000) / 1000000);
        }
        this.zzX = false;
        zzrm zzrmVar = new zzrm(zzanVar, iZzm, i4, iZzm2, i2, iIntValue2, iIntValue, (((Math.max(minBufferSize, iMax) + i9) - 1) / i9) * i9, zzdwVar, false, false, false);
        if (zzY()) {
            this.zzr = zzrmVar;
        } else {
            this.zzs = zzrmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzf() throws IllegalStateException {
        zzrr zzrrVar;
        if (zzY()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzY = false;
            this.zzH = 0;
            this.zzA = new zzrp(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzR = false;
            this.zzf.zzp();
            zzV();
            if (this.zzj.zzh()) {
                this.zzu.pause();
            }
            if (zzZ(this.zzu)) {
                zzrx zzrxVar = this.zzl;
                zzrxVar.getClass();
                zzrxVar.zzb(this.zzu);
            }
            int i = zzgd.zza;
            final zzqp zzqpVarZzb = this.zzs.zzb();
            zzrm zzrmVar = this.zzr;
            if (zzrmVar != null) {
                this.zzs = zzrmVar;
                this.zzr = null;
            }
            this.zzj.zzc();
            if (zzgd.zza >= 24 && (zzrrVar = this.zzx) != null) {
                zzrrVar.zzb();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzeu zzeuVar = this.zzi;
            final zzqs zzqsVar = this.zzq;
            zzeuVar.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzgd.zzE("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzre
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrz.zzI(audioTrack, zzqsVar, handler, zzqpVarZzb, zzeuVar);
                    }
                });
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzaa = 0L;
        this.zzab = 0L;
        Handler handler2 = this.zzac;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzg() {
        this.zzI = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzh() throws IllegalStateException {
        this.zzS = false;
        if (zzY()) {
            if (this.zzj.zzk() || zzZ(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzi() throws IllegalStateException {
        this.zzS = true;
        if (zzY()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzj() throws IllegalStateException, zzqu {
        if (!this.zzP && zzY() && zzX()) {
            zzR();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzk() {
        zzpw zzpwVar = this.zzw;
        if (zzpwVar != null) {
            zzpwVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzl() throws IllegalStateException {
        zzf();
        zzgbc zzgbcVar = this.zzg;
        int size = zzgbcVar.size();
        for (int i = 0; i < size; i++) {
            ((zzdz) zzgbcVar.get(i)).zzf();
        }
        zzgbc zzgbcVar2 = this.zzh;
        int size2 = zzgbcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzdz) zzgbcVar2.get(i2)).zzf();
        }
        zzdw zzdwVar = this.zzt;
        if (zzdwVar != null) {
            zzdwVar.zzf();
        }
        this.zzS = false;
        this.zzX = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzm(zzk zzkVar) throws IllegalStateException {
        if (this.zzy.equals(zzkVar)) {
            return;
        }
        this.zzy = zzkVar;
        zzpw zzpwVar = this.zzw;
        if (zzpwVar != null) {
            zzpwVar.zzg(zzkVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzn(int i) throws IllegalStateException {
        if (this.zzT != i) {
            this.zzT = i;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzo(zzl zzlVar) {
        if (this.zzU.equals(zzlVar)) {
            return;
        }
        if (this.zzu != null) {
            int i = this.zzU.zza;
        }
        this.zzU = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzp(zzer zzerVar) {
        this.zzj.zze(zzerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzq(zzqs zzqsVar) {
        this.zzq = zzqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzr(int i, int i2) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzZ(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzs(zzcl zzclVar) {
        this.zzB = new zzcl(Math.max(0.1f, Math.min(zzclVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzclVar.zzd, 8.0f)));
        zzT(zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzt(zzpj zzpjVar) {
        this.zzp = zzpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzv(boolean z) {
        this.zzC = z;
        zzT(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzw(float f) {
        if (this.zzL != f) {
            this.zzL = f;
            zzU();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ff A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzx(ByteBuffer byteBuffer, long j, int i) throws Exception {
        AudioTrack audioTrackZzN;
        zzpw zzpwVar;
        zzpj zzpjVar;
        zzrm zzrmVar;
        boolean z;
        int iZza;
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        ByteBuffer byteBuffer2 = this.zzM;
        zzeq.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzr != null) {
            if (!zzX()) {
                return false;
            }
            zzrm zzrmVar2 = this.zzr;
            zzrm zzrmVar3 = this.zzs;
            if (zzrmVar3.zzc == zzrmVar2.zzc && zzrmVar3.zzg == zzrmVar2.zzg && zzrmVar3.zze == zzrmVar2.zze && zzrmVar3.zzf == zzrmVar2.zzf && zzrmVar3.zzd == zzrmVar2.zzd) {
                boolean z2 = zzrmVar3.zzj;
                boolean z3 = zzrmVar2.zzj;
                boolean z4 = zzrmVar3.zzk;
                boolean z5 = zzrmVar2.zzk;
                this.zzs = zzrmVar2;
                this.zzr = null;
                AudioTrack audioTrack = this.zzu;
                if (audioTrack != null && zzZ(audioTrack)) {
                    boolean z6 = this.zzs.zzk;
                }
            } else {
                zzR();
                if (zzy()) {
                    return false;
                }
                zzf();
            }
            zzO(j);
        }
        if (!zzY()) {
            try {
                if (!this.zzi.zzd()) {
                    return false;
                }
                try {
                    zzrmVar = this.zzs;
                } catch (zzqr e) {
                    zzrm zzrmVar4 = this.zzs;
                    if (zzrmVar4.zzh > 1000000) {
                        zzan zzanVar = zzrmVar4.zza;
                        int i7 = zzrmVar4.zzb;
                        int i8 = zzrmVar4.zzc;
                        int i9 = zzrmVar4.zzd;
                        int i10 = zzrmVar4.zze;
                        int i11 = zzrmVar4.zzf;
                        int i12 = zzrmVar4.zzg;
                        zzdw zzdwVar = zzrmVar4.zzi;
                        boolean z7 = zzrmVar4.zzj;
                        boolean z8 = zzrmVar4.zzk;
                        boolean z9 = zzrmVar4.zzl;
                        zzrm zzrmVar5 = new zzrm(zzanVar, i7, i8, i9, i10, i11, i12, DurationKt.NANOS_IN_MILLIS, zzdwVar, false, false, false);
                        try {
                            audioTrackZzN = zzN(zzrmVar5);
                            this.zzs = zzrmVar5;
                        } catch (zzqr e2) {
                            e.addSuppressed(e2);
                            zzP();
                            throw e;
                        }
                    }
                    zzP();
                    throw e;
                }
                if (zzrmVar == null) {
                    throw null;
                }
                audioTrackZzN = zzN(zzrmVar);
                this.zzu = audioTrackZzN;
                if (zzZ(audioTrackZzN)) {
                    AudioTrack audioTrack2 = this.zzu;
                    if (this.zzl == null) {
                        this.zzl = new zzrx(this);
                    }
                    this.zzl.zza(audioTrack2);
                    boolean z10 = this.zzs.zzk;
                }
                if (zzgd.zza >= 31 && (zzpjVar = this.zzp) != null) {
                    zzrj.zza(this.zzu, zzpjVar);
                }
                this.zzT = this.zzu.getAudioSessionId();
                zzqz zzqzVar = this.zzj;
                AudioTrack audioTrack3 = this.zzu;
                zzrm zzrmVar6 = this.zzs;
                zzqzVar.zzd(audioTrack3, zzrmVar6.zzc == 2, zzrmVar6.zzg, zzrmVar6.zzd, zzrmVar6.zzh);
                zzU();
                int i13 = this.zzU.zza;
                zzpx zzpxVar = this.zzV;
                if (zzpxVar != null && zzgd.zza >= 23) {
                    zzri.zza(this.zzu, zzpxVar);
                    zzpw zzpwVar2 = this.zzw;
                    if (zzpwVar2 != null) {
                        zzpwVar2.zzh(this.zzV.zza);
                    }
                }
                if (zzgd.zza >= 24 && (zzpwVar = this.zzw) != null) {
                    this.zzx = new zzrr(this.zzu, zzpwVar);
                }
                this.zzJ = true;
                zzqs zzqsVar = this.zzq;
                if (zzqsVar != null) {
                    ((zzse) zzqsVar).zza.zzc.zzc(this.zzs.zzb());
                }
            } catch (zzqr e3) {
                if (e3.zzb) {
                    throw e3;
                }
                this.zzm.zzb(e3);
                return false;
            }
        }
        this.zzm.zza();
        if (this.zzJ) {
            this.zzK = Math.max(0L, j);
            this.zzI = false;
            this.zzJ = false;
            zzO(j);
            if (this.zzS) {
                zzi();
            }
        }
        if (!this.zzj.zzj(zzM())) {
            return false;
        }
        if (this.zzM == null) {
            zzeq.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            zzrm zzrmVar7 = this.zzs;
            if (zzrmVar7.zzc != 0 && this.zzH == 0) {
                int i14 = zzrmVar7.zzg;
                switch (i14) {
                    case 5:
                    case 6:
                    case 18:
                        z = true;
                        iZza = zzact.zza(byteBuffer);
                        this.zzH = iZza;
                        if (iZza == 0) {
                            return z;
                        }
                        break;
                    case 7:
                    case 8:
                        int i15 = zzadr.zza;
                        if (byteBuffer.getInt(0) != -233094848) {
                            if (byteBuffer.getInt(0) == -398277519) {
                                iZza = 1024;
                            } else if (byteBuffer.getInt(0) == 622876772) {
                                iZza = 4096;
                            } else {
                                int iPosition = byteBuffer.position();
                                byte b2 = byteBuffer.get(iPosition);
                                if (b2 != -2) {
                                    if (b2 == -1) {
                                        i3 = 2;
                                        i4 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                        b = byteBuffer.get(iPosition + 7);
                                    } else if (b2 != 31) {
                                        i4 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                        i5 = byteBuffer.get(iPosition + 5) & 252;
                                        i3 = 2;
                                        i2 = (i5 >> i3) | i4;
                                        z = true;
                                    } else {
                                        i3 = 2;
                                        i4 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                        b = byteBuffer.get(iPosition + 6);
                                    }
                                    i5 = b & 60;
                                    i2 = (i5 >> i3) | i4;
                                    z = true;
                                } else {
                                    z = true;
                                    i2 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                }
                                iZza = (i2 + (z ? 1 : 0)) * 32;
                            }
                            z = true;
                        } else {
                            z = true;
                            iZza = 1024;
                        }
                        this.zzH = iZza;
                        if (iZza == 0) {
                        }
                        break;
                    case 9:
                        iZza = zzaeo.zzc(zzgd.zzi(byteBuffer, byteBuffer.position()));
                        if (iZza == -1) {
                            throw new IllegalArgumentException();
                        }
                        z = true;
                        this.zzH = iZza;
                        if (iZza == 0) {
                        }
                        break;
                    case 10:
                    case 16:
                        break;
                    case 11:
                    case 12:
                        iZza = 2048;
                        z = true;
                        this.zzH = iZza;
                        if (iZza == 0) {
                        }
                        break;
                    case 13:
                    case 19:
                    default:
                        throw new IllegalStateException("Unexpected audio encoding: " + i14);
                    case 14:
                        int i16 = zzact.zza;
                        int iPosition2 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i17 = iPosition2;
                        while (true) {
                            if (i17 > iLimit) {
                                i6 = -1;
                            } else if ((zzgd.zzi(byteBuffer, i17 + 4) & (-2)) == -126718022) {
                                i6 = i17 - iPosition2;
                            } else {
                                i17++;
                            }
                        }
                        if (i6 == -1) {
                            iZza = 0;
                        } else {
                            iZza = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z = true;
                        this.zzH = iZza;
                        if (iZza == 0) {
                        }
                        break;
                    case 15:
                        iZza = 512;
                        z = true;
                        this.zzH = iZza;
                        if (iZza == 0) {
                        }
                        break;
                    case 17:
                        int i18 = zzacw.zza;
                        byte[] bArr = new byte[16];
                        int iPosition3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition3);
                        iZza = zzacw.zza(new zzft(bArr, 16)).zzc;
                        z = true;
                        this.zzH = iZza;
                        if (iZza == 0) {
                        }
                        break;
                    case 20:
                        iZza = zzaep.zzb(byteBuffer);
                        z = true;
                        this.zzH = iZza;
                        if (iZza == 0) {
                        }
                        break;
                }
            }
            if (this.zzz != null) {
                if (!zzX()) {
                    return false;
                }
                zzO(j);
                this.zzz = null;
            }
            long jZzs = this.zzK + zzgd.zzs(zzL() - this.zzf.zzo(), this.zzs.zza.zzB);
            if (!this.zzI && Math.abs(jZzs - j) > 200000) {
                zzqs zzqsVar2 = this.zzq;
                if (zzqsVar2 != null) {
                    zzqsVar2.zza(new zzqt(j, jZzs));
                }
                this.zzI = true;
            }
            if (this.zzI) {
                if (!zzX()) {
                    return false;
                }
                long j2 = j - jZzs;
                this.zzK += j2;
                this.zzI = false;
                zzO(j);
                zzqs zzqsVar3 = this.zzq;
                if (zzqsVar3 != null && j2 != 0) {
                    ((zzse) zzqsVar3).zza.zzao();
                }
            }
            if (this.zzs.zzc == 0) {
                this.zzD += byteBuffer.remaining();
            } else {
                this.zzE += this.zzH * i;
            }
            this.zzM = byteBuffer;
            this.zzN = i;
        }
        zzS(j);
        if (!this.zzM.hasRemaining()) {
            this.zzM = null;
            this.zzN = 0;
            return true;
        }
        if (!this.zzj.zzi(zzM())) {
            return false;
        }
        zzfk.zzf("DefaultAudioSink", "Resetting stalled audio track");
        zzf();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzy() {
        if (zzY()) {
            return !(zzgd.zza >= 29 && this.zzu.isOffloadedPlayback() && this.zzR) && this.zzj.zzg(zzM());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final boolean zzz() {
        if (zzY()) {
            return this.zzP && !zzy();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzV = audioDeviceInfo == null ? null : new zzpx(audioDeviceInfo);
        zzpw zzpwVar = this.zzw;
        if (zzpwVar != null) {
            zzpwVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzri.zza(audioTrack, this.zzV);
        }
    }
}
