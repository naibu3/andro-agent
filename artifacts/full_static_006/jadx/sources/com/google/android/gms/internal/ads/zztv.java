package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zztv extends zziw {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private int zzG;
    private int zzH;
    private ByteBuffer zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private long zzV;
    private long zzW;
    private boolean zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzix zza;
    private zztu zzaa;
    private long zzab;
    private boolean zzac;
    private zzsu zzad;
    private zzsu zzae;
    private final zztl zzc;
    private final zztx zzd;
    private final float zze;
    private final zzin zzf;
    private final zzin zzg;
    private final zzin zzh;
    private final zzti zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzsg zzl;
    private zzan zzm;
    private zzan zzn;
    private MediaCrypto zzo;
    private float zzp;
    private zztm zzq;
    private zzan zzr;
    private MediaFormat zzs;
    private boolean zzt;
    private float zzu;
    private ArrayDeque zzv;
    private zztt zzw;
    private zztp zzx;
    private int zzy;
    private boolean zzz;

    public zztv(int i, zztl zztlVar, zztx zztxVar, boolean z, float f) {
        super(i);
        this.zzc = zztlVar;
        this.zzd = zztxVar;
        this.zze = f;
        this.zzf = new zzin(0, 0);
        this.zzg = new zzin(0, 0);
        this.zzh = new zzin(2, 0);
        zzti zztiVar = new zzti();
        this.zzi = zztiVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzp = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzaa = zztu.zza;
        zztiVar.zzi(0);
        zztiVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzsg();
        this.zzu = -1.0f;
        this.zzy = 0;
        this.zzP = 0;
        this.zzG = -1;
        this.zzH = -1;
        this.zzF = -9223372036854775807L;
        this.zzV = -9223372036854775807L;
        this.zzW = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzQ = 0;
        this.zzR = 0;
        this.zza = new zzix();
    }

    protected static boolean zzaL(zzan zzanVar) {
        return zzanVar.zzH == 0;
    }

    private final void zzaM() {
        this.zzG = -1;
        this.zzg.zzc = null;
    }

    private final void zzaN() {
        this.zzH = -1;
        this.zzI = null;
    }

    private final void zzaO(zztu zztuVar) {
        this.zzaa = zztuVar;
        if (zztuVar.zzd != -9223372036854775807L) {
            this.zzac = true;
        }
    }

    private final void zzaP() throws zzjh {
        zzsu zzsuVar = this.zzae;
        zzsuVar.getClass();
        this.zzad = zzsuVar;
        this.zzQ = 0;
        this.zzR = 0;
    }

    private final boolean zzaQ() throws zzjh {
        if (this.zzS) {
            this.zzQ = 1;
            if (this.zzA) {
                this.zzR = 3;
                return false;
            }
            this.zzR = 2;
        } else {
            zzaP();
        }
        return true;
    }

    private final boolean zzaR() throws zzjh {
        zztm zztmVar = this.zzq;
        if (zztmVar == null || this.zzQ == 2 || this.zzX) {
            return false;
        }
        if (this.zzG < 0) {
            int iZza = zztmVar.zza();
            this.zzG = iZza;
            if (iZza < 0) {
                return false;
            }
            this.zzg.zzc = zztmVar.zzf(iZza);
            this.zzg.zzb();
        }
        if (this.zzQ == 1) {
            if (!this.zzE) {
                this.zzT = true;
                zztmVar.zzj(this.zzG, 0, 0, 0L, 4);
                zzaM();
            }
            this.zzQ = 2;
            return false;
        }
        if (this.zzC) {
            this.zzC = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            byteBuffer.getClass();
            byteBuffer.put(zzb);
            zztmVar.zzj(this.zzG, 0, 38, 0L, 0);
            zzaM();
            this.zzS = true;
            return true;
        }
        if (this.zzP == 1) {
            int i = 0;
            while (true) {
                zzan zzanVar = this.zzr;
                zzanVar.getClass();
                if (i >= zzanVar.zzp.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.zzr.zzp.get(i);
                ByteBuffer byteBuffer2 = this.zzg.zzc;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i++;
            }
            this.zzP = 2;
        }
        ByteBuffer byteBuffer3 = this.zzg.zzc;
        byteBuffer3.getClass();
        int iPosition = byteBuffer3.position();
        zzlj zzljVarZzcX = zzcX();
        try {
            int iZzcV = zzcV(zzljVarZzcX, this.zzg, 0);
            if (iZzcV == -3) {
                if (zzQ()) {
                    this.zzW = this.zzV;
                }
                return false;
            }
            if (iZzcV == -5) {
                if (this.zzP == 2) {
                    this.zzg.zzb();
                    this.zzP = 1;
                }
                zzac(zzljVarZzcX);
                return true;
            }
            zzin zzinVar = this.zzg;
            if (zzinVar.zzf()) {
                this.zzW = this.zzV;
                if (this.zzP == 2) {
                    zzinVar.zzb();
                    this.zzP = 1;
                }
                this.zzX = true;
                if (!this.zzS) {
                    zzao();
                    return false;
                }
                try {
                    if (!this.zzE) {
                        this.zzT = true;
                        zztmVar.zzj(this.zzG, 0, 0, 0L, 4);
                        zzaM();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzi(e, this.zzm, false, zzgd.zzj(e.getErrorCode()));
                }
            }
            if (!this.zzS && !zzinVar.zzg()) {
                zzinVar.zzb();
                if (this.zzP == 2) {
                    this.zzP = 1;
                }
                return true;
            }
            boolean zZzk = zzinVar.zzk();
            if (zZzk) {
                zzinVar.zzb.zzb(iPosition);
            }
            long j = this.zzg.zze;
            if (this.zzZ) {
                if (this.zzk.isEmpty()) {
                    zzga zzgaVar = this.zzaa.zze;
                    zzan zzanVar2 = this.zzm;
                    zzanVar2.getClass();
                    zzgaVar.zzd(j, zzanVar2);
                } else {
                    zzga zzgaVar2 = ((zztu) this.zzk.peekLast()).zze;
                    zzan zzanVar3 = this.zzm;
                    zzanVar3.getClass();
                    zzgaVar2.zzd(j, zzanVar3);
                }
                this.zzZ = false;
            }
            long jMax = Math.max(this.zzV, j);
            this.zzV = jMax;
            if (zzQ() || this.zzg.zzh()) {
                this.zzW = jMax;
            }
            this.zzg.zzj();
            zzin zzinVar2 = this.zzg;
            if (zzinVar2.zze()) {
                zzaj(zzinVar2);
            }
            zzaB(this.zzg);
            zzat(this.zzg);
            try {
                if (zZzk) {
                    zztmVar.zzk(this.zzG, 0, this.zzg.zzb, j, 0);
                } else {
                    int i2 = this.zzG;
                    ByteBuffer byteBuffer4 = this.zzg.zzc;
                    if (byteBuffer4 == null) {
                        throw null;
                    }
                    zztmVar.zzj(i2, 0, byteBuffer4.limit(), j, 0);
                }
                zzaM();
                this.zzS = true;
                this.zzP = 0;
                this.zza.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzi(e2, this.zzm, false, zzgd.zzj(e2.getErrorCode()));
            }
        } catch (zzim e3) {
            zzak(e3);
            zzaU(0);
            zzah();
            return true;
        }
    }

    private final boolean zzaS() {
        return this.zzH >= 0;
    }

    private final boolean zzaT(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzan zzanVar = this.zzn;
        if (zzanVar == null || !Objects.equals(zzanVar.zzn, "audio/opus")) {
            return true;
        }
        return !zzaep.zzf(j, j2);
    }

    private final boolean zzaU(int i) throws zzjh {
        zzin zzinVar = this.zzf;
        zzlj zzljVarZzcX = zzcX();
        zzinVar.zzb();
        int iZzcV = zzcV(zzljVarZzcX, this.zzf, i | 4);
        if (iZzcV == -5) {
            zzac(zzljVarZzcX);
            return true;
        }
        if (iZzcV != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzX = true;
        zzao();
        return false;
    }

    private final boolean zzaV(zzan zzanVar) throws zzjh {
        if (zzgd.zza >= 23 && this.zzq != null && this.zzR != 3 && zzcU() != 0) {
            float f = this.zzp;
            zzanVar.getClass();
            float fZzZ = zzZ(f, zzanVar, zzT());
            float f2 = this.zzu;
            if (f2 != fZzZ) {
                if (fZzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f2 != -1.0f || fZzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzZ);
                    zztm zztmVar = this.zzq;
                    zztmVar.getClass();
                    zztmVar.zzp(bundle);
                    this.zzu = fZzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzN = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzM = false;
        this.zzL = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzjh {
        if (this.zzS) {
            this.zzQ = 1;
            this.zzR = 3;
        } else {
            zzaD();
            zzaz();
        }
    }

    private final void zzah() {
        try {
            zztm zztmVar = this.zzq;
            zzeq.zzb(zztmVar);
            zztmVar.zzi();
        } finally {
            zzaE();
        }
    }

    private final void zzai(zztp zztpVar, MediaCrypto mediaCrypto) throws Exception {
        zztk zztkVar;
        zztk zztkVar2;
        zzan zzanVar = this.zzm;
        zzanVar.getClass();
        String str = zztpVar.zza;
        float fZzZ = zzgd.zza < 23 ? -1.0f : zzZ(this.zzp, zzanVar, zzT());
        if (fZzZ <= this.zze) {
            fZzZ = -1.0f;
        }
        zzaC(zzanVar);
        zzh();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zztk zztkVarZzaf = zzaf(zztpVar, zzanVar, null, fZzZ);
        if (zzgd.zza >= 31) {
            zzts.zza(zztkVarZzaf, zzn());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            this.zzq = this.zzc.zzd(zztkVarZzaf);
            Trace.endSection();
            zzh();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zztpVar.zze(zzanVar)) {
                zztkVar = zztkVarZzaf;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("id=");
                sb.append(zzanVar.zzb);
                sb.append(", mimeType=");
                sb.append(zzanVar.zzn);
                if (zzanVar.zzm != null) {
                    sb.append(", container=");
                    sb.append(zzanVar.zzm);
                }
                if (zzanVar.zzj != -1) {
                    sb.append(", bitrate=");
                    sb.append(zzanVar.zzj);
                }
                if (zzanVar.zzk != null) {
                    sb.append(", codecs=");
                    sb.append(zzanVar.zzk);
                }
                if (zzanVar.zzq != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i = 0;
                    while (true) {
                        zzae zzaeVar = zzanVar.zzq;
                        if (i >= zzaeVar.zzb) {
                            break;
                        }
                        UUID uuid = zzaeVar.zza(i).zza;
                        if (uuid.equals(zzo.zzb)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(zzo.zzc)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(zzo.zze)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(zzo.zzd)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(zzo.zza)) {
                            linkedHashSet.add("universal");
                        } else {
                            zztkVar2 = zztkVarZzaf;
                            linkedHashSet.add("unknown (" + uuid.toString() + ")");
                            i++;
                            zztkVarZzaf = zztkVar2;
                        }
                        zztkVar2 = zztkVarZzaf;
                        i++;
                        zztkVarZzaf = zztkVar2;
                    }
                    zztkVar = zztkVarZzaf;
                    sb.append(", drm=[");
                    zzfxv.zzb(sb, linkedHashSet, ",");
                    sb.append(']');
                } else {
                    zztkVar = zztkVarZzaf;
                }
                if (zzanVar.zzs != -1 && zzanVar.zzt != -1) {
                    sb.append(", res=");
                    sb.append(zzanVar.zzs);
                    sb.append("x");
                    sb.append(zzanVar.zzt);
                }
                zzt zztVar = zzanVar.zzz;
                if (zztVar != null && (zztVar.zze() || zztVar.zzf())) {
                    sb.append(", color=");
                    sb.append(zzanVar.zzz.zzd());
                }
                if (zzanVar.zzu != -1.0f) {
                    sb.append(", fps=");
                    sb.append(zzanVar.zzu);
                }
                if (zzanVar.zzA != -1) {
                    sb.append(", channels=");
                    sb.append(zzanVar.zzA);
                }
                if (zzanVar.zzB != -1) {
                    sb.append(", sample_rate=");
                    sb.append(zzanVar.zzB);
                }
                if (zzanVar.zze != null) {
                    sb.append(", language=");
                    sb.append(zzanVar.zze);
                }
                if (!zzanVar.zzd.isEmpty()) {
                    sb.append(", labels=[");
                    zzfxv.zzb(sb, zzanVar.zzd, ",");
                    sb.append("]");
                }
                if (zzanVar.zzf != 0) {
                    sb.append(", selectionFlags=[");
                    int i2 = zzanVar.zzf;
                    ArrayList arrayList = new ArrayList();
                    if ((i2 & 1) != 0) {
                        arrayList.add("default");
                    }
                    if ((i2 & 2) != 0) {
                        arrayList.add("forced");
                    }
                    zzfxv.zzb(sb, arrayList, ",");
                    sb.append("]");
                }
                if (zzanVar.zzg != 0) {
                    sb.append(", roleFlags=[");
                    int i3 = zzanVar.zzg;
                    ArrayList arrayList2 = new ArrayList();
                    if ((i3 & 1) != 0) {
                        arrayList2.add("main");
                    }
                    if ((i3 & 2) != 0) {
                        arrayList2.add("alt");
                    }
                    if ((i3 & 4) != 0) {
                        arrayList2.add("supplementary");
                    }
                    if ((i3 & 8) != 0) {
                        arrayList2.add("commentary");
                    }
                    if ((i3 & 16) != 0) {
                        arrayList2.add("dub");
                    }
                    if ((i3 & 32) != 0) {
                        arrayList2.add("emergency");
                    }
                    if ((i3 & 64) != 0) {
                        arrayList2.add("caption");
                    }
                    if ((i3 & 128) != 0) {
                        arrayList2.add("subtitle");
                    }
                    if ((i3 & 256) != 0) {
                        arrayList2.add("sign");
                    }
                    if ((i3 & 512) != 0) {
                        arrayList2.add("describes-video");
                    }
                    if ((i3 & 1024) != 0) {
                        arrayList2.add("describes-music");
                    }
                    if ((i3 & 2048) != 0) {
                        arrayList2.add("enhanced-intelligibility");
                    }
                    if ((i3 & 4096) != 0) {
                        arrayList2.add("transcribes-dialog");
                    }
                    if ((i3 & 8192) != 0) {
                        arrayList2.add("easy-read");
                    }
                    if ((i3 & 16384) != 0) {
                        arrayList2.add("trick-play");
                    }
                    zzfxv.zzb(sb, arrayList2, ",");
                    sb.append("]");
                }
                zzfk.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", sb.toString(), str));
            }
            this.zzx = zztpVar;
            this.zzu = fZzZ;
            this.zzr = zzanVar;
            this.zzy = (zzgd.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzgd.zzd.startsWith("SM-T585") || zzgd.zzd.startsWith("SM-A510") || zzgd.zzd.startsWith("SM-A520") || zzgd.zzd.startsWith("SM-J700"))) ? 2 : (zzgd.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzgd.zzb) || "flounder_lte".equals(zzgd.zzb) || "grouper".equals(zzgd.zzb) || "tilapia".equals(zzgd.zzb)))) ? 0 : 1;
            this.zzr.getClass();
            this.zzz = zzgd.zza == 29 && "c2.android.aac.decoder".equals(str);
            this.zzA = zzgd.zza <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.zzB = zzgd.zza == 21 && "OMX.google.aac.decoder".equals(str);
            String str2 = zztpVar.zza;
            this.zzE = (zzgd.zza <= 25 && "OMX.rk.video_decoder.avc".equals(str2)) || (zzgd.zza <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(zzgd.zzc) && "AFTS".equals(zzgd.zzd) && zztpVar.zzf);
            this.zzq.getClass();
            if (zzcU() == 2) {
                zzh();
                this.zzF = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzal(str, zztkVar, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected void zzC() {
        try {
            zzad();
            zzaD();
        } finally {
            this.zzae = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzF(zzan[] zzanVarArr, long j, long j2, zzvo zzvoVar) throws zzjh {
        if (this.zzaa.zzd == -9223372036854775807L) {
            zzaO(new zztu(-9223372036854775807L, j, j2));
            return;
        }
        if (this.zzk.isEmpty()) {
            long j3 = this.zzV;
            if (j3 != -9223372036854775807L) {
                long j4 = this.zzab;
                if (j4 != -9223372036854775807L) {
                }
            }
            zzaO(new zztu(-9223372036854775807L, j, j2));
            if (this.zzaa.zzd != -9223372036854775807L) {
                zzap();
                return;
            }
            return;
        }
        this.zzk.add(new zztu(this.zzV, j, j2));
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmn
    public void zzM(float f, float f2) throws zzjh {
        this.zzp = f2;
        zzaV(this.zzr);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzmn
    public void zzV(long r23, long r25) throws com.google.android.gms.internal.ads.zzjh {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztv.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public boolean zzW() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzmn
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaS()) {
            return true;
        }
        if (this.zzF == -9223372036854775807L) {
            return false;
        }
        zzh();
        return SystemClock.elapsedRealtime() < this.zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzmp
    public final int zzY(zzan zzanVar) throws zzjh {
        try {
            return zzaa(this.zzd, zzanVar);
        } catch (zzud e) {
            throw zzi(e, zzanVar, false, 4002);
        }
    }

    protected float zzZ(float f, zzan zzanVar, zzan[] zzanVarArr) {
        throw null;
    }

    protected void zzaA(long j) {
        this.zzab = j;
        while (!this.zzk.isEmpty() && j >= ((zztu) this.zzk.peek()).zzb) {
            zztu zztuVar = (zztu) this.zzk.poll();
            zztuVar.getClass();
            zzaO(zztuVar);
            zzap();
        }
    }

    protected void zzaB(zzin zzinVar) throws zzjh {
    }

    protected void zzaC(zzan zzanVar) throws zzjh {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaD() {
        try {
            zztm zztmVar = this.zzq;
            if (zztmVar != null) {
                zztmVar.zzl();
                this.zza.zzb++;
                zztp zztpVar = this.zzx;
                if (zztpVar == null) {
                    throw null;
                }
                zzam(zztpVar.zza);
            }
        } finally {
            this.zzq = null;
            this.zzo = null;
            this.zzad = null;
            zzaF();
        }
    }

    protected void zzaE() {
        zzaM();
        zzaN();
        this.zzF = -9223372036854775807L;
        this.zzT = false;
        this.zzS = false;
        this.zzC = false;
        this.zzD = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzV = -9223372036854775807L;
        this.zzW = -9223372036854775807L;
        this.zzab = -9223372036854775807L;
        this.zzQ = 0;
        this.zzR = 0;
        this.zzP = this.zzO ? 1 : 0;
    }

    protected final void zzaF() {
        zzaE();
        this.zzv = null;
        this.zzx = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = false;
        this.zzU = false;
        this.zzu = -1.0f;
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        this.zzE = false;
        this.zzO = false;
        this.zzP = 0;
    }

    protected final boolean zzaG() throws zzjh {
        boolean zZzaH = zzaH();
        if (zZzaH) {
            zzaz();
        }
        return zZzaH;
    }

    protected final boolean zzaH() {
        if (this.zzq == null) {
            return false;
        }
        int i = this.zzR;
        if (i == 3 || ((this.zzz && !this.zzU) || (this.zzA && this.zzT))) {
            zzaD();
            return true;
        }
        if (i == 2) {
            zzeq.zzf(zzgd.zza >= 23);
            if (zzgd.zza >= 23) {
                try {
                    zzaP();
                } catch (zzjh e) {
                    zzfk.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaD();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    protected final boolean zzaI() {
        return this.zzL;
    }

    protected final boolean zzaJ(zzan zzanVar) {
        return this.zzae == null && zzas(zzanVar);
    }

    protected boolean zzaK(zztp zztpVar) {
        return true;
    }

    protected abstract int zzaa(zztx zztxVar, zzan zzanVar) throws zzud;

    protected zziy zzab(zztp zztpVar, zzan zzanVar, zzan zzanVar2) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zziy zzac(zzlj zzljVar) throws zzjh {
        int i;
        boolean z = true;
        this.zzZ = true;
        zzan zzanVar = zzljVar.zza;
        zzanVar.getClass();
        if (zzanVar.zzn == null) {
            throw zzi(new IllegalArgumentException("Sample MIME type is null."), zzanVar, false, 4005);
        }
        this.zzae = zzljVar.zzb;
        this.zzm = zzanVar;
        if (this.zzL) {
            this.zzN = true;
            return null;
        }
        zztm zztmVar = this.zzq;
        if (zztmVar == null) {
            this.zzv = null;
            zzaz();
            return null;
        }
        zztp zztpVar = this.zzx;
        zztpVar.getClass();
        zzan zzanVar2 = this.zzr;
        zzanVar2.getClass();
        zzsu zzsuVar = this.zzad;
        zzsu zzsuVar2 = this.zzae;
        if (zzsuVar != zzsuVar2) {
            zzae();
            return new zziy(zztpVar.zza, zzanVar2, zzanVar, 0, 128);
        }
        boolean z2 = zzsuVar2 != zzsuVar;
        zzeq.zzf(!z2 || zzgd.zza >= 23);
        zziy zziyVarZzab = zzab(zztpVar, zzanVar2, zzanVar);
        int i2 = zziyVarZzab.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (zzaV(zzanVar)) {
                        this.zzr = zzanVar;
                        if (!z2 || zzaQ()) {
                        }
                    } else {
                        i = 16;
                    }
                } else if (zzaV(zzanVar)) {
                    this.zzO = true;
                    this.zzP = 1;
                    int i3 = this.zzy;
                    if (i3 != 2 && (i3 != 1 || zzanVar.zzs != zzanVar2.zzs || zzanVar.zzt != zzanVar2.zzt)) {
                        z = false;
                    }
                    this.zzC = z;
                    this.zzr = zzanVar;
                    if (!z2 || zzaQ()) {
                    }
                }
            } else if (zzaV(zzanVar)) {
                this.zzr = zzanVar;
                if (z2) {
                    if (zzaQ()) {
                    }
                } else if (this.zzS) {
                    this.zzQ = 1;
                    if (this.zzA) {
                        this.zzR = 3;
                    } else {
                        this.zzR = 1;
                    }
                }
            }
            return (zziyVarZzab.zzd != 0 || (this.zzq == zztmVar && this.zzR != 3)) ? zziyVarZzab : new zziy(zztpVar.zza, zzanVar2, zzanVar, 0, i);
        }
        zzae();
        i = 0;
        if (zziyVarZzab.zzd != 0) {
        }
    }

    protected abstract zztk zzaf(zztp zztpVar, zzan zzanVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzag(zztx zztxVar, zzan zzanVar, boolean z) throws zzud;

    protected void zzaj(zzin zzinVar) throws zzjh {
        throw null;
    }

    protected void zzak(Exception exc) {
        throw null;
    }

    protected void zzal(String str, zztk zztkVar, long j, long j2) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(zzan zzanVar, MediaFormat mediaFormat) throws zzjh {
        throw null;
    }

    protected void zzap() {
    }

    protected void zzaq() throws zzjh {
    }

    protected abstract boolean zzar(long j, long j2, zztm zztmVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzan zzanVar) throws zzjh;

    protected boolean zzas(zzan zzanVar) {
        return false;
    }

    protected int zzat(zzin zzinVar) {
        return 0;
    }

    protected final long zzau() {
        return this.zzaa.zzd;
    }

    protected final long zzav() {
        return this.zzaa.zzc;
    }

    protected final zztm zzaw() {
        return this.zzq;
    }

    protected zzto zzax(Throwable th, zztp zztpVar) {
        return new zzto(th, zztpVar);
    }

    protected final zztp zzay() {
        return this.zzx;
    }

    protected final void zzaz() throws zzjh {
        zzan zzanVar;
        if (this.zzq != null || this.zzL || (zzanVar = this.zzm) == null) {
            return;
        }
        if (zzaJ(zzanVar)) {
            zzad();
            String str = zzanVar.zzn;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzn(32);
            } else {
                this.zzi.zzn(1);
            }
            this.zzL = true;
            return;
        }
        zzsu zzsuVar = this.zzae;
        this.zzad = zzsuVar;
        if (zzsuVar != null) {
            zzeq.zzf(true);
            zzsu zzsuVar2 = this.zzad;
            boolean z = zzsv.zza;
            zzsuVar2.zza();
        }
        try {
            if (this.zzad != null) {
                zzeq.zzb(zzanVar.zzn);
            }
            zzan zzanVar2 = this.zzm;
            if (zzanVar2 == null) {
                throw null;
            }
            if (this.zzv == null) {
                try {
                    List listZzag = zzag(this.zzd, zzanVar2, false);
                    listZzag.isEmpty();
                    this.zzv = new ArrayDeque();
                    if (!listZzag.isEmpty()) {
                        this.zzv.add((zztp) listZzag.get(0));
                    }
                    this.zzw = null;
                } catch (zzud e) {
                    throw new zztt(zzanVar2, (Throwable) e, false, -49998);
                }
            }
            if (this.zzv.isEmpty()) {
                throw new zztt(zzanVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzv;
            if (arrayDeque == null) {
                throw null;
            }
            zztp zztpVar = (zztp) arrayDeque.peekFirst();
            while (this.zzq == null) {
                zztp zztpVar2 = (zztp) arrayDeque.peekFirst();
                if (zztpVar2 == null) {
                    throw null;
                }
                if (!zzaK(zztpVar2)) {
                    return;
                }
                try {
                    zzai(zztpVar2, null);
                } catch (Exception e2) {
                    if (zztpVar2 != zztpVar) {
                        throw e2;
                    }
                    try {
                        zzfk.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzai(zztpVar2, null);
                    } catch (Exception e3) {
                        zzfk.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zztpVar2.zza), e3);
                        arrayDeque.removeFirst();
                        zztt zzttVar = new zztt(zzanVar2, (Throwable) e3, false, zztpVar2);
                        zzak(zzttVar);
                        zztt zzttVar2 = this.zzw;
                        if (zzttVar2 == null) {
                            this.zzw = zzttVar;
                        } else {
                            this.zzw = zztt.zza(zzttVar2, zzttVar);
                        }
                        if (arrayDeque.isEmpty()) {
                            throw this.zzw;
                        }
                    }
                }
            }
            this.zzv = null;
        } catch (zztt e4) {
            throw zzi(e4, zzanVar, false, 4001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziw, com.google.android.gms.internal.ads.zzmp
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected void zzw() {
        this.zzm = null;
        zzaO(zztu.zza);
        this.zzk.clear();
        zzaH();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected void zzx(boolean z, boolean z2) throws zzjh {
        this.zza = new zzix();
    }

    @Override // com.google.android.gms.internal.ads.zziw
    protected void zzz(long j, boolean z) throws zzjh {
        this.zzX = false;
        this.zzY = false;
        if (this.zzL) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzM = false;
            this.zzl.zzb();
        } else {
            zzaG();
        }
        zzga zzgaVar = this.zzaa.zze;
        if (zzgaVar.zza() > 0) {
            this.zzZ = true;
        }
        zzgaVar.zze();
        this.zzk.clear();
    }

    private final void zzao() throws zzjh {
        int i = this.zzR;
        if (i == 1) {
            zzah();
            return;
        }
        if (i == 2) {
            zzah();
            zzaP();
        } else if (i != 3) {
            this.zzY = true;
            zzaq();
        } else {
            zzaD();
            zzaz();
        }
    }
}
