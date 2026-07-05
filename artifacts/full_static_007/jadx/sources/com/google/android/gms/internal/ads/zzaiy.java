package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaiy implements zzadu {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzaiu
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            zzaea zzaeaVar = zzaiy.zza;
            return new zzadu[]{new zzaiy(zzalt.zza, 2)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private zzaix zzC;
    private boolean zzD;
    private int zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private long zzJ;
    private zzfl zzK;
    private zzfl zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private long zzP;
    private long zzQ;
    private int zzR;
    private int zzS;
    private int[] zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private boolean zzY;
    private long zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private int zzag;
    private byte zzah;
    private boolean zzai;
    private zzadx zzaj;
    private final zzait zzh;
    private final zzaja zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzalt zzl;
    private final zzfu zzm;
    private final zzfu zzn;
    private final zzfu zzo;
    private final zzfu zzp;
    private final zzfu zzq;
    private final zzfu zzr;
    private final zzfu zzs;
    private final zzfu zzt;
    private final zzfu zzu;
    private final zzfu zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzgd.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfxs.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzaiy() {
        this(new zzair(), 2, zzalt.zza);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzo(zzadv zzadvVar, zzaix zzaixVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaixVar.zzb)) {
            zzw(zzadvVar, zzb, i);
            int i3 = this.zzab;
            zzv();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzaixVar.zzb)) {
            zzw(zzadvVar, zzd, i);
            int i4 = this.zzab;
            zzv();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzaixVar.zzb)) {
            zzw(zzadvVar, zze, i);
            int i5 = this.zzab;
            zzv();
            return i5;
        }
        zzafa zzafaVar = zzaixVar.zzW;
        if (!this.zzad) {
            if (zzaixVar.zzg) {
                this.zzW &= -1073741825;
                if (!this.zzae) {
                    ((zzadi) zzadvVar).zzn(this.zzo.zzM(), 0, 1, false);
                    this.zzaa++;
                    if ((this.zzo.zzM()[0] & 128) == 128) {
                        throw zzch.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzah = this.zzo.zzM()[0];
                    this.zzae = true;
                }
                byte b = this.zzah;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzW |= 1073741824;
                    if (!this.zzai) {
                        ((zzadi) zzadvVar).zzn(this.zzt.zzM(), 0, 8, false);
                        this.zzaa += 8;
                        this.zzai = true;
                        this.zzo.zzM()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzo.zzK(0);
                        zzafaVar.zzr(this.zzo, 1, 1);
                        this.zzab++;
                        this.zzt.zzK(0);
                        zzafaVar.zzr(this.zzt, 8, 1);
                        this.zzab += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzaf) {
                            ((zzadi) zzadvVar).zzn(this.zzo.zzM(), 0, 1, false);
                            this.zzaa++;
                            this.zzo.zzK(0);
                            this.zzag = this.zzo.zzm();
                            this.zzaf = true;
                        }
                        int i7 = this.zzag * 4;
                        this.zzo.zzH(i7);
                        ((zzadi) zzadvVar).zzn(this.zzo.zzM(), 0, i7, false);
                        this.zzaa += i7;
                        int i8 = (this.zzag >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzw = ByteBuffer.allocate(i9);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzag;
                            if (i10 >= i2) {
                                break;
                            }
                            int iZzp = this.zzo.zzp();
                            int i12 = iZzp - i11;
                            if (i10 % 2 == 0) {
                                this.zzw.putShort((short) i12);
                            } else {
                                this.zzw.putInt(i12);
                            }
                            i10++;
                            i11 = iZzp;
                        }
                        int i13 = (i - this.zzaa) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzw.putInt(i13);
                        } else {
                            this.zzw.putShort((short) i13);
                            this.zzw.putInt(0);
                        }
                        this.zzu.zzI(this.zzw.array(), i9);
                        zzafaVar.zzr(this.zzu, i9, 1);
                        this.zzab += i9;
                    }
                }
            } else {
                byte[] bArr = zzaixVar.zzh;
                if (bArr != null) {
                    this.zzr.zzI(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzaixVar.zzb) ? zzaixVar.zzf > 0 : z) {
                this.zzW |= 268435456;
                this.zzv.zzH(0);
                int iZze = (this.zzr.zze() + i) - this.zzaa;
                this.zzo.zzH(4);
                this.zzo.zzM()[0] = (byte) ((iZze >> 24) & 255);
                this.zzo.zzM()[1] = (byte) ((iZze >> 16) & 255);
                this.zzo.zzM()[2] = (byte) ((iZze >> 8) & 255);
                this.zzo.zzM()[3] = (byte) (iZze & 255);
                zzafaVar.zzr(this.zzo, 4, 2);
                this.zzab += 4;
            }
            this.zzad = true;
        }
        int iZze2 = i + this.zzr.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzaixVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzaixVar.zzb)) {
            if (zzaixVar.zzT != null) {
                zzeq.zzf(this.zzr.zze() == 0);
                zzaixVar.zzT.zzd(zzadvVar);
            }
            while (true) {
                int i14 = this.zzaa;
                if (i14 >= iZze2) {
                    break;
                }
                int iZzp2 = zzp(zzadvVar, zzafaVar, iZze2 - i14);
                this.zzaa += iZzp2;
                this.zzab += iZzp2;
            }
        } else {
            byte[] bArrZzM = this.zzn.zzM();
            bArrZzM[0] = 0;
            bArrZzM[1] = 0;
            bArrZzM[2] = 0;
            int i15 = zzaixVar.zzX;
            int i16 = 4 - i15;
            while (this.zzaa < iZze2) {
                int i17 = this.zzac;
                if (i17 == 0) {
                    int iMin = Math.min(i15, this.zzr.zzb());
                    ((zzadi) zzadvVar).zzn(bArrZzM, i16 + iMin, i15 - iMin, false);
                    if (iMin > 0) {
                        this.zzr.zzG(bArrZzM, i16, iMin);
                    }
                    this.zzaa += i15;
                    this.zzn.zzK(0);
                    this.zzac = this.zzn.zzp();
                    this.zzm.zzK(0);
                    zzaey.zzb(zzafaVar, this.zzm, 4);
                    this.zzab += 4;
                } else {
                    int iZzp3 = zzp(zzadvVar, zzafaVar, i17);
                    this.zzaa += iZzp3;
                    this.zzab += iZzp3;
                    this.zzac -= iZzp3;
                }
            }
        }
        if ("A_VORBIS".equals(zzaixVar.zzb)) {
            this.zzp.zzK(0);
            zzaey.zzb(zzafaVar, this.zzp, 4);
            this.zzab += 4;
        }
        int i18 = this.zzab;
        zzv();
        return i18;
    }

    private final int zzp(zzadv zzadvVar, zzafa zzafaVar, int i) throws IOException {
        int iZzb = this.zzr.zzb();
        if (iZzb <= 0) {
            return zzaey.zza(zzafaVar, zzadvVar, i, false);
        }
        int iMin = Math.min(i, iZzb);
        zzaey.zzb(zzafaVar, this.zzr, iMin);
        return iMin;
    }

    private final long zzq(long j) throws zzch {
        long j2 = this.zzz;
        if (j2 != -9223372036854775807L) {
            return zzgd.zzt(j, j2, 1000L, RoundingMode.FLOOR);
        }
        throw zzch.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzr(int i) throws zzch {
        if (this.zzK == null || this.zzL == null) {
            throw zzch.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzs(int i) throws zzch {
        if (this.zzC != null) {
            return;
        }
        throw zzch.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 BREAK  A[LOOP:0: B:45:0x00c5->B:50:0x00dd], SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzt(zzaix zzaixVar, long j, int i, int i2, int i3) {
        char c;
        byte[] bArrZzx;
        int i4;
        int iZzd;
        int iZze;
        zzafb zzafbVar = zzaixVar.zzT;
        if (zzafbVar != null) {
            zzafbVar.zzc(zzaixVar.zzW, j, i, i2, i3, zzaixVar.zzi);
        } else if ("S_TEXT/UTF8".equals(zzaixVar.zzb) || "S_TEXT/ASS".equals(zzaixVar.zzb) || "S_TEXT/WEBVTT".equals(zzaixVar.zzb)) {
            if (this.zzS > 1) {
                zzfk.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
            } else {
                long j2 = this.zzQ;
                if (j2 == -9223372036854775807L) {
                    zzfk.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                } else {
                    String str = zzaixVar.zzb;
                    byte[] bArrZzM = this.zzs.zzM();
                    int iHashCode = str.hashCode();
                    if (iHashCode == 738597099) {
                        if (str.equals("S_TEXT/ASS")) {
                            c = 1;
                        }
                        if (c == 0) {
                        }
                        System.arraycopy(bArrZzx, 0, bArrZzM, i4, bArrZzx.length);
                        iZzd = this.zzs.zzd();
                        while (true) {
                            if (iZzd >= this.zzs.zze()) {
                            }
                            iZzd++;
                        }
                        zzafa zzafaVar = zzaixVar.zzW;
                        zzfu zzfuVar = this.zzs;
                        zzaey.zzb(zzafaVar, zzfuVar, zzfuVar.zze());
                        iZze = i2 + this.zzs.zze();
                        if ((i & 268435456) != 0) {
                        }
                        zzaixVar.zzW.zzs(j, i, iZze, i3, zzaixVar.zzi);
                    } else if (iHashCode != 1045209816) {
                        c = (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) ? (char) 0 : (char) 65535;
                        if (c == 0) {
                            bArrZzx = zzx(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        } else if (c == 1) {
                            bArrZzx = zzx(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                            i4 = 21;
                        } else {
                            if (c != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrZzx = zzx(j2, "%02d:%02d:%02d.%03d", 1000L);
                            i4 = 25;
                        }
                        System.arraycopy(bArrZzx, 0, bArrZzM, i4, bArrZzx.length);
                        iZzd = this.zzs.zzd();
                        while (true) {
                            if (iZzd >= this.zzs.zze()) {
                                break;
                            }
                            if (this.zzs.zzM()[iZzd] == 0) {
                                this.zzs.zzJ(iZzd);
                                break;
                            }
                            iZzd++;
                        }
                        zzafa zzafaVar2 = zzaixVar.zzW;
                        zzfu zzfuVar2 = this.zzs;
                        zzaey.zzb(zzafaVar2, zzfuVar2, zzfuVar2.zze());
                        iZze = i2 + this.zzs.zze();
                        if ((i & 268435456) != 0) {
                            if (this.zzS > 1) {
                                this.zzv.zzH(0);
                            } else {
                                int iZze2 = this.zzv.zze();
                                zzaixVar.zzW.zzr(this.zzv, iZze2, 2);
                                iZze += iZze2;
                            }
                        }
                        zzaixVar.zzW.zzs(j, i, iZze, i3, zzaixVar.zzi);
                    } else {
                        if (str.equals("S_TEXT/WEBVTT")) {
                            c = 2;
                        }
                        if (c == 0) {
                        }
                        System.arraycopy(bArrZzx, 0, bArrZzM, i4, bArrZzx.length);
                        iZzd = this.zzs.zzd();
                        while (true) {
                            if (iZzd >= this.zzs.zze()) {
                            }
                            iZzd++;
                        }
                        zzafa zzafaVar22 = zzaixVar.zzW;
                        zzfu zzfuVar22 = this.zzs;
                        zzaey.zzb(zzafaVar22, zzfuVar22, zzfuVar22.zze());
                        iZze = i2 + this.zzs.zze();
                        if ((i & 268435456) != 0) {
                        }
                        zzaixVar.zzW.zzs(j, i, iZze, i3, zzaixVar.zzi);
                    }
                }
            }
            iZze = i2;
            if ((i & 268435456) != 0) {
            }
            zzaixVar.zzW.zzs(j, i, iZze, i3, zzaixVar.zzi);
        } else {
            iZze = i2;
            if ((i & 268435456) != 0) {
            }
            zzaixVar.zzW.zzs(j, i, iZze, i3, zzaixVar.zzi);
        }
        this.zzN = true;
    }

    private final void zzu(zzadv zzadvVar, int i) throws IOException {
        if (this.zzo.zze() >= i) {
            return;
        }
        if (this.zzo.zzc() < i) {
            zzfu zzfuVar = this.zzo;
            int iZzc = zzfuVar.zzc();
            zzfuVar.zzE(Math.max(iZzc + iZzc, i));
        }
        zzfu zzfuVar2 = this.zzo;
        ((zzadi) zzadvVar).zzn(zzfuVar2.zzM(), zzfuVar2.zze(), i - zzfuVar2.zze(), false);
        this.zzo.zzJ(i);
    }

    private final void zzv() {
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = 0;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = false;
        this.zzag = 0;
        this.zzah = (byte) 0;
        this.zzai = false;
        this.zzr.zzH(0);
    }

    private final void zzw(zzadv zzadvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzs.zzc() < i2) {
            zzfu zzfuVar = this.zzs;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            zzfuVar.zzI(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzs.zzM(), 0, length);
        }
        ((zzadi) zzadvVar).zzn(this.zzs.zzM(), length, i, false);
        this.zzs.zzK(0);
        this.zzs.zzJ(i2);
    }

    private static byte[] zzx(long j, String str, long j2) {
        zzeq.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zzgd.zza;
        return str2.getBytes(zzfxs.zzc);
    }

    private static int[] zzy(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        this.zzN = false;
        while (!this.zzN) {
            if (!this.zzh.zzc(zzadvVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzaix zzaixVar = (zzaix) this.zzj.valueAt(i);
                    zzaixVar.zzW.getClass();
                    zzafb zzafbVar = zzaixVar.zzT;
                    if (zzafbVar != null) {
                        zzafbVar.zza(zzaixVar.zzW, zzaixVar.zzi);
                    }
                }
                return -1;
            }
            long jZzf = zzadvVar.zzf();
            if (this.zzG) {
                this.zzI = jZzf;
                zzaeqVar.zza = this.zzH;
                this.zzG = false;
                return 1;
            }
            if (this.zzD) {
                long j = this.zzI;
                if (j != -1) {
                    zzaeqVar.zza = j;
                    this.zzI = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return zzgbc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzaj = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        this.zzJ = -9223372036854775807L;
        this.zzO = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzv();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzafb zzafbVar = ((zzaix) this.zzj.valueAt(i)).zzT;
            if (zzafbVar != null) {
                zzafbVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        return new zzaiz().zza(zzadvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzi(int i) throws zzch {
        int i2;
        int i3;
        zzaet zzaesVar;
        int i4;
        zzeq.zzb(this.zzaj);
        char c = '\b';
        if (i == 160) {
            if (this.zzO == 2) {
                zzaix zzaixVar = (zzaix) this.zzj.get(this.zzU);
                zzaixVar.zzW.getClass();
                if (this.zzZ > 0 && "A_OPUS".equals(zzaixVar.zzb)) {
                    zzfu zzfuVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzZ).array();
                    zzfuVar.zzI(bArrArray, bArrArray.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzS; i6++) {
                    i5 += this.zzT[i6];
                }
                int i7 = 0;
                while (i7 < this.zzS) {
                    long j = this.zzP + ((zzaixVar.zze * i7) / 1000);
                    int i8 = this.zzW;
                    if (i7 == 0) {
                        if (!this.zzY) {
                            i8 |= 1;
                        }
                        i3 = i8;
                        i2 = 0;
                    } else {
                        i2 = i7;
                        i3 = i8;
                    }
                    int i9 = this.zzT[i2];
                    int i10 = i5 - i9;
                    zzt(zzaixVar, j, i3, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzO = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzE;
                if (i11 != -1) {
                    long j2 = this.zzF;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzH = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzch.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzs(i);
                zzaix zzaixVar2 = this.zzC;
                if (zzaixVar2.zzg) {
                    if (zzaixVar2.zzi == null) {
                        throw zzch.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzaixVar2.zzk = new zzae(null, new zzad(zzo.zza, null, "video/webm", this.zzC.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzs(i);
                zzaix zzaixVar3 = this.zzC;
                if (zzaixVar3.zzg && zzaixVar3.zzh != null) {
                    throw zzch.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzz == -9223372036854775807L) {
                    this.zzz = 1000000L;
                }
                long j3 = this.zzA;
                if (j3 != -9223372036854775807L) {
                    this.zzB = zzq(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzj.size() == 0) {
                    throw zzch.zza("No valid tracks were found", null);
                }
                this.zzaj.zzD();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzD) {
                zzadx zzadxVar = this.zzaj;
                zzfl zzflVar = this.zzK;
                zzfl zzflVar2 = this.zzL;
                if (this.zzy == -1 || this.zzB == -9223372036854775807L || zzflVar == null || zzflVar.zza() == 0 || zzflVar2 == null || zzflVar2.zza() != zzflVar.zza()) {
                    zzaesVar = new zzaes(this.zzB, 0L);
                } else {
                    int iZza = zzflVar.zza();
                    int[] iArrCopyOf = new int[iZza];
                    long[] jArrCopyOf = new long[iZza];
                    long[] jArrCopyOf2 = new long[iZza];
                    long[] jArrCopyOf3 = new long[iZza];
                    for (int i12 = 0; i12 < iZza; i12++) {
                        jArrCopyOf3[i12] = zzflVar.zzb(i12);
                        jArrCopyOf[i12] = this.zzy + zzflVar2.zzb(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = iZza - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArrCopyOf[i13] = (int) (jArrCopyOf[i14] - jArrCopyOf[i13]);
                        jArrCopyOf2[i13] = jArrCopyOf3[i14] - jArrCopyOf3[i13];
                        i13 = i14;
                    }
                    iArrCopyOf[i4] = (int) ((this.zzy + this.zzx) - jArrCopyOf[i4]);
                    long j4 = this.zzB - jArrCopyOf3[i4];
                    jArrCopyOf2[i4] = j4;
                    if (j4 <= 0) {
                        zzfk.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i4);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i4);
                    }
                    zzaesVar = new zzadg(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                zzadxVar.zzO(zzaesVar);
                this.zzD = true;
            }
            this.zzK = null;
            this.zzL = null;
            return;
        }
        zzaix zzaixVar4 = this.zzC;
        zzeq.zzb(zzaixVar4);
        String str = zzaixVar4.zzb;
        if (str == null) {
            throw zzch.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                } else {
                    c = 65535;
                    break;
                }
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = '\f';
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                break;
            case 855502857:
                if (!str.equals("V_MPEGH/ISO/HEVC")) {
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 30:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
            case ' ':
                zzaixVar4.zze(this.zzaj, zzaixVar4.zzc);
                this.zzj.put(zzaixVar4.zzc, zzaixVar4);
                break;
        }
        this.zzC = null;
    }

    protected final void zzl(int i, long j, long j2) throws zzch {
        zzeq.zzb(this.zzaj);
        if (i == 160) {
            this.zzY = false;
            this.zzZ = 0L;
            return;
        }
        if (i == 174) {
            this.zzC = new zzaix();
            return;
        }
        if (i == 187) {
            this.zzM = false;
            return;
        }
        if (i == 19899) {
            this.zzE = -1;
            this.zzF = -1L;
            return;
        }
        if (i == 20533) {
            zzs(i);
            this.zzC.zzg = true;
            return;
        }
        if (i == 21968) {
            zzs(i);
            this.zzC.zzx = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzy;
            if (j3 != -1 && j3 != j) {
                throw zzch.zza("Multiple Segment elements not supported", null);
            }
            this.zzy = j;
            this.zzx = j2;
            return;
        }
        if (i == 475249515) {
            this.zzK = new zzfl(32);
            this.zzL = new zzfl(32);
        } else if (i == 524531317 && !this.zzD) {
            if (this.zzk && this.zzH != -1) {
                this.zzG = true;
            } else {
                this.zzaj.zzO(new zzaes(this.zzB, 0L));
                this.zzD = true;
            }
        }
    }

    zzaiy(zzait zzaitVar, int i, zzalt zzaltVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzH = -1L;
        this.zzI = -1L;
        this.zzJ = -9223372036854775807L;
        this.zzh = zzaitVar;
        zzaitVar.zza(new zzaiw(this, null));
        this.zzl = zzaltVar;
        this.zzk = true;
        this.zzi = new zzaja();
        this.zzj = new SparseArray();
        this.zzo = new zzfu(4);
        this.zzp = new zzfu(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzfu(4);
        this.zzm = new zzfu(zzgr.zza);
        this.zzn = new zzfu(4);
        this.zzr = new zzfu();
        this.zzs = new zzfu();
        this.zzt = new zzfu(8);
        this.zzu = new zzfu();
        this.zzv = new zzfu();
        this.zzT = new int[1];
    }

    protected final void zzm(int i, String str) throws zzch {
        if (i == 134) {
            zzs(i);
            this.zzC.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzch.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzs(i);
            this.zzC.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzs(i);
            this.zzC.zzZ = str;
        }
    }

    protected final void zzh(int i, int i2, zzadv zzadvVar) throws IOException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        Throwable th = null;
        int i10 = 1;
        if (i9 != 161 && i9 != 163) {
            if (i9 == 165) {
                if (this.zzO != 2) {
                    return;
                }
                zzaix zzaixVar = (zzaix) this.zzj.get(this.zzU);
                if (this.zzX != 4 || !"V_VP9".equals(zzaixVar.zzb)) {
                    ((zzadi) zzadvVar).zzo(i2, false);
                    return;
                }
                this.zzv.zzH(i2);
                ((zzadi) zzadvVar).zzn(this.zzv.zzM(), 0, i2, false);
                return;
            }
            if (i9 == 16877) {
                zzs(i);
                zzaix zzaixVar2 = this.zzC;
                if (zzaixVar2.zzY != 1685485123 && zzaixVar2.zzY != 1685480259) {
                    ((zzadi) zzadvVar).zzo(i2, false);
                    return;
                }
                zzaixVar2.zzN = new byte[i2];
                ((zzadi) zzadvVar).zzn(zzaixVar2.zzN, 0, i2, false);
                return;
            }
            if (i9 == 16981) {
                zzs(i);
                zzaix zzaixVar3 = this.zzC;
                zzaixVar3.zzh = new byte[i2];
                ((zzadi) zzadvVar).zzn(zzaixVar3.zzh, 0, i2, false);
                return;
            }
            if (i9 == 18402) {
                byte[] bArr = new byte[i2];
                ((zzadi) zzadvVar).zzn(bArr, 0, i2, false);
                zzs(i);
                this.zzC.zzi = new zzaez(1, bArr, 0, 0);
                return;
            }
            if (i9 == 21419) {
                Arrays.fill(this.zzq.zzM(), (byte) 0);
                ((zzadi) zzadvVar).zzn(this.zzq.zzM(), 4 - i2, i2, false);
                this.zzq.zzK(0);
                this.zzE = (int) this.zzq.zzu();
                return;
            }
            if (i9 == 25506) {
                zzs(i);
                zzaix zzaixVar4 = this.zzC;
                zzaixVar4.zzj = new byte[i2];
                ((zzadi) zzadvVar).zzn(zzaixVar4.zzj, 0, i2, false);
                return;
            }
            if (i9 != 30322) {
                throw zzch.zza("Unexpected id: " + i9, null);
            }
            zzs(i);
            zzaix zzaixVar5 = this.zzC;
            zzaixVar5.zzv = new byte[i2];
            ((zzadi) zzadvVar).zzn(zzaixVar5.zzv, 0, i2, false);
            return;
        }
        if (this.zzO == 0) {
            this.zzU = (int) this.zzi.zzd(zzadvVar, false, true, 8);
            this.zzV = this.zzi.zza();
            this.zzQ = -9223372036854775807L;
            this.zzO = 1;
            this.zzo.zzH(0);
        }
        zzaix zzaixVar6 = (zzaix) this.zzj.get(this.zzU);
        if (zzaixVar6 == null) {
            ((zzadi) zzadvVar).zzo(i2 - this.zzV, false);
            this.zzO = 0;
            return;
        }
        zzaixVar6.zzW.getClass();
        if (this.zzO == 1) {
            zzu(zzadvVar, 3);
            int i11 = (this.zzo.zzM()[2] & 6) >> 1;
            byte b = 255;
            if (i11 == 0) {
                this.zzS = 1;
                int[] iArrZzy = zzy(this.zzT, 1);
                this.zzT = iArrZzy;
                iArrZzy[0] = (i2 - this.zzV) - 3;
            } else {
                zzu(zzadvVar, 4);
                int i12 = (this.zzo.zzM()[3] & 255) + 1;
                this.zzS = i12;
                int[] iArrZzy2 = zzy(this.zzT, i12);
                this.zzT = iArrZzy2;
                if (i11 == 2) {
                    int i13 = (i2 - this.zzV) - 4;
                    int i14 = this.zzS;
                    Arrays.fill(iArrZzy2, 0, i14, i13 / i14);
                } else {
                    if (i11 != 1) {
                        if (i11 != 3) {
                            throw zzch.zza("Unexpected lacing value: 2", null);
                        }
                        int i15 = 0;
                        int i16 = 0;
                        int i17 = 4;
                        while (true) {
                            int i18 = this.zzS - 1;
                            if (i15 >= i18) {
                                this.zzT[i18] = ((i2 - this.zzV) - i17) - i16;
                                break;
                            }
                            this.zzT[i15] = 0;
                            int i19 = i17 + 1;
                            zzu(zzadvVar, i19);
                            if (this.zzo.zzM()[i17] == 0) {
                                throw zzch.zza("No valid varint length mask found", th);
                            }
                            int i20 = 0;
                            while (true) {
                                if (i20 >= 8) {
                                    j = 0;
                                    i4 = i19;
                                    break;
                                }
                                int i21 = i10 << (7 - i20);
                                if ((this.zzo.zzM()[i17] & i21) != 0) {
                                    int i22 = i19 + i20;
                                    zzu(zzadvVar, i22);
                                    j = this.zzo.zzM()[i17] & b & (~i21);
                                    int i23 = i17 + 1;
                                    while (i23 < i22) {
                                        j = (j << 8) | (this.zzo.zzM()[i23] & b);
                                        i23++;
                                        i22 = i22;
                                        b = 255;
                                    }
                                    i4 = i22;
                                    if (i15 > 0) {
                                        j -= (1 << ((i20 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i20++;
                                    i10 = 1;
                                    b = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int[] iArr = this.zzT;
                            int i24 = (int) j;
                            if (i15 != 0) {
                                i24 += iArr[i15 - 1];
                            }
                            iArr[i15] = i24;
                            i16 += i24;
                            i15++;
                            i17 = i4;
                            th = null;
                            i10 = 1;
                            b = 255;
                        }
                        throw zzch.zza("EBML lacing sample size out of range.", null);
                    }
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 4;
                    while (true) {
                        i5 = this.zzS - 1;
                        if (i25 >= i5) {
                            break;
                        }
                        this.zzT[i25] = 0;
                        while (true) {
                            i6 = i27 + 1;
                            zzu(zzadvVar, i6);
                            int i28 = this.zzo.zzM()[i27] & 255;
                            int[] iArr2 = this.zzT;
                            i7 = iArr2[i25] + i28;
                            iArr2[i25] = i7;
                            if (i28 != 255) {
                                break;
                            } else {
                                i27 = i6;
                            }
                        }
                        i26 += i7;
                        i25++;
                        i27 = i6;
                    }
                    this.zzT[i5] = ((i2 - this.zzV) - i27) - i26;
                }
            }
            this.zzP = this.zzJ + zzq((this.zzo.zzM()[0] << 8) | (this.zzo.zzM()[1] & 255));
            if (zzaixVar6.zzd == 2) {
                i8 = 1;
                this.zzW = i8;
                this.zzO = 2;
                this.zzR = 0;
                i3 = 163;
            } else {
                if (i9 != 163) {
                    i8 = 0;
                } else if ((this.zzo.zzM()[2] & 128) == 128) {
                    i9 = 163;
                    i8 = 1;
                } else {
                    i8 = 0;
                    i9 = 163;
                }
                this.zzW = i8;
                this.zzO = 2;
                this.zzR = 0;
                i3 = 163;
            }
        } else {
            i3 = 163;
        }
        if (i9 == i3) {
            while (true) {
                int i29 = this.zzR;
                if (i29 >= this.zzS) {
                    this.zzO = 0;
                    return;
                }
                zzt(zzaixVar6, ((this.zzR * zzaixVar6.zze) / 1000) + this.zzP, this.zzW, zzo(zzadvVar, zzaixVar6, this.zzT[i29], false), 0);
                this.zzR++;
            }
        } else {
            while (true) {
                int i30 = this.zzR;
                if (i30 >= this.zzS) {
                    return;
                }
                int[] iArr3 = this.zzT;
                iArr3[i30] = zzo(zzadvVar, zzaixVar6, iArr3[i30], true);
                this.zzR++;
            }
        }
    }

    public zzaiy(zzalt zzaltVar, int i) {
        this(new zzair(), 2, zzaltVar);
    }

    protected final void zzj(int i, double d) throws zzch {
        if (i == 181) {
            zzs(i);
            this.zzC.zzQ = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzA = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzs(i);
                this.zzC.zzD = (float) d;
                break;
            case 21970:
                zzs(i);
                this.zzC.zzE = (float) d;
                break;
            case 21971:
                zzs(i);
                this.zzC.zzF = (float) d;
                break;
            case 21972:
                zzs(i);
                this.zzC.zzG = (float) d;
                break;
            case 21973:
                zzs(i);
                this.zzC.zzH = (float) d;
                break;
            case 21974:
                zzs(i);
                this.zzC.zzI = (float) d;
                break;
            case 21975:
                zzs(i);
                this.zzC.zzJ = (float) d;
                break;
            case 21976:
                zzs(i);
                this.zzC.zzK = (float) d;
                break;
            case 21977:
                zzs(i);
                this.zzC.zzL = (float) d;
                break;
            case 21978:
                zzs(i);
                this.zzC.zzM = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzs(i);
                        this.zzC.zzs = (float) d;
                        break;
                    case 30324:
                        zzs(i);
                        this.zzC.zzt = (float) d;
                        break;
                    case 30325:
                        zzs(i);
                        this.zzC.zzu = (float) d;
                        break;
                }
        }
    }

    protected final void zzk(int i, long j) throws zzch {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzch.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzch.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                zzs(i);
                this.zzC.zzd = (int) j;
                return;
            case 136:
                z = j == 1;
                zzs(i);
                this.zzC.zzV = z;
                return;
            case 155:
                this.zzQ = zzq(j);
                return;
            case 159:
                zzs(i);
                this.zzC.zzO = (int) j;
                return;
            case 176:
                zzs(i);
                this.zzC.zzl = (int) j;
                return;
            case 179:
                zzr(i);
                this.zzK.zzc(zzq(j));
                return;
            case 186:
                zzs(i);
                this.zzC.zzm = (int) j;
                return;
            case 215:
                zzs(i);
                this.zzC.zzc = (int) j;
                return;
            case 231:
                this.zzJ = zzq(j);
                return;
            case 238:
                this.zzX = (int) j;
                return;
            case 241:
                if (this.zzM) {
                    return;
                }
                zzr(i);
                this.zzL.zzc(j);
                this.zzM = true;
                return;
            case 251:
                this.zzY = true;
                return;
            case 16871:
                zzs(i);
                this.zzC.zzY = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzch.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzch.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzch.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzch.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzch.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzF = j + this.zzy;
                return;
            case 21432:
                int i2 = (int) j;
                zzs(i);
                if (i2 == 0) {
                    this.zzC.zzw = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzC.zzw = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzC.zzw = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzC.zzw = 3;
                    return;
                }
            case 21680:
                zzs(i);
                this.zzC.zzo = (int) j;
                return;
            case 21682:
                zzs(i);
                this.zzC.zzq = (int) j;
                return;
            case 21690:
                zzs(i);
                this.zzC.zzp = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzs(i);
                this.zzC.zzU = z;
                return;
            case 21938:
                zzs(i);
                zzaix zzaixVar = this.zzC;
                zzaixVar.zzx = true;
                zzaixVar.zzn = (int) j;
                return;
            case 21998:
                zzs(i);
                this.zzC.zzf = (int) j;
                return;
            case 22186:
                zzs(i);
                this.zzC.zzR = j;
                return;
            case 22203:
                zzs(i);
                this.zzC.zzS = j;
                return;
            case 25188:
                zzs(i);
                this.zzC.zzP = (int) j;
                return;
            case 30114:
                this.zzZ = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzs(i);
                if (i3 == 0) {
                    this.zzC.zzr = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzC.zzr = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzC.zzr = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzC.zzr = 3;
                    return;
                }
            case 2352003:
                zzs(i);
                this.zzC.zze = (int) j;
                return;
            case 2807729:
                this.zzz = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzs(i);
                        if (i4 == 1) {
                            this.zzC.zzA = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzC.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzs(i);
                        int iZzb = zzt.zzb((int) j);
                        if (iZzb != -1) {
                            this.zzC.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21947:
                        zzs(i);
                        this.zzC.zzx = true;
                        int iZza = zzt.zza((int) j);
                        if (iZza != -1) {
                            this.zzC.zzy = iZza;
                            return;
                        }
                        return;
                    case 21948:
                        zzs(i);
                        this.zzC.zzB = (int) j;
                        return;
                    case 21949:
                        zzs(i);
                        this.zzC.zzC = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }
}
