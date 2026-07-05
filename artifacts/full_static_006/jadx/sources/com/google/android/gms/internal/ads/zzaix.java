package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzaix {
    public byte[] zzN;
    public zzafb zzT;
    public boolean zzU;
    public zzafa zzW;
    public int zzX;
    private int zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzaez zzi;
    public byte[] zzj;
    public zzae zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private String zzZ = "eng";

    protected zzaix() {
    }

    private static Pair zzf(zzfu zzfuVar) throws zzch {
        try {
            zzfuVar.zzL(16);
            long jZzs = zzfuVar.zzs();
            if (jZzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jZzs != 826496599) {
                zzfk.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iZzd = zzfuVar.zzd() + 20;
            byte[] bArrZzM = zzfuVar.zzM();
            while (true) {
                int length = bArrZzM.length;
                if (iZzd >= length - 4) {
                    throw zzch.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iZzd + 1;
                if (bArrZzM[iZzd] == 0 && bArrZzM[i] == 0 && bArrZzM[iZzd + 2] == 1 && bArrZzM[iZzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrZzM, iZzd, length)));
                }
                iZzd = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzch.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzch {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzch.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzch.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzch.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzch.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzch.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfu zzfuVar) throws zzch {
        try {
            int iZzk = zzfuVar.zzk();
            if (iZzk == 1) {
                return true;
            }
            if (iZzk == 65534) {
                zzfuVar.zzK(24);
                if (zzfuVar.zzt() == zzaiy.zzf.getMostSignificantBits()) {
                    if (zzfuVar.zzt() == zzaiy.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzch.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzch {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzch.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05be  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzadx zzadxVar, int i) throws zzch {
        char c;
        List listSingletonList;
        List listZzo;
        String str;
        String str2;
        int i2;
        List listZzg;
        int i3;
        String str3;
        zzal zzalVar;
        zzt zztVarZzg;
        byte[] bArr;
        int i4;
        zzado zzadoVarZza;
        String str4 = this.zzb;
        int i5 = 1;
        int iZzl = 4;
        int i6 = 0;
        int iIntValue = -1;
        switch (str4.hashCode()) {
            case -2095576542:
                if (!str4.equals("V_MPEG4/ISO/AP")) {
                    c = 65535;
                    break;
                } else {
                    c = 6;
                    break;
                }
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                break;
        }
        String str5 = "audio/raw";
        switch (c) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null && (zzadoVarZza = zzado.zza(new zzfu(this.zzN))) != null) {
                    str2 = zzadoVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                int i7 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                    zzalVar.zzy(this.zzO);
                    zzalVar.zzY(this.zzQ);
                    zzalVar.zzR(iZzl);
                } else if (zzcg.zzh(str3)) {
                    if (this.zzq == 0) {
                        int i8 = this.zzo;
                        if (i8 == -1) {
                            i8 = this.zzl;
                        }
                        this.zzo = i8;
                        int i9 = this.zzp;
                        if (i9 == -1) {
                            i9 = this.zzm;
                        }
                        this.zzp = i9;
                    }
                    float f = (this.zzo == -1 || (i4 = this.zzp) == -1) ? -1.0f : (this.zzm * r6) / (this.zzl * i4);
                    if (this.zzx) {
                        if (this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) this.zzB);
                            byteBufferOrder.putShort((short) this.zzC);
                        }
                        zzr zzrVar = new zzr();
                        zzrVar.zzc(this.zzy);
                        zzrVar.zzb(this.zzA);
                        zzrVar.zzd(this.zzz);
                        zzrVar.zze(bArr);
                        zzrVar.zzf(this.zzn);
                        zzrVar.zza(this.zzn);
                        zztVarZzg = zzrVar.zzg();
                    } else {
                        zztVarZzg = null;
                    }
                    if (this.zza != null && zzaiy.zzg.containsKey(this.zza)) {
                        iIntValue = ((Integer) zzaiy.zzg.get(this.zza)).intValue();
                    }
                    if (this.zzr == 0 && Float.compare(this.zzs, 0.0f) == 0 && Float.compare(this.zzt, 0.0f) == 0) {
                        if (Float.compare(this.zzu, 0.0f) != 0) {
                            if (Float.compare(this.zzu, 90.0f) == 0) {
                                i6 = 90;
                            } else if (Float.compare(this.zzu, -180.0f) == 0 || Float.compare(this.zzu, 180.0f) == 0) {
                                i6 = 180;
                            } else if (Float.compare(this.zzu, -90.0f) == 0) {
                                i6 = 270;
                            }
                        }
                        zzalVar.zzac(this.zzl);
                        zzalVar.zzI(this.zzm);
                        zzalVar.zzT(f);
                        zzalVar.zzW(i6);
                        zzalVar.zzU(this.zzv);
                        zzalVar.zzaa(this.zzw);
                        zzalVar.zzA(zztVarZzg);
                        i5 = 2;
                    } else {
                        i6 = iIntValue;
                        zzalVar.zzac(this.zzl);
                        zzalVar.zzI(this.zzm);
                        zzalVar.zzT(f);
                        zzalVar.zzW(i6);
                        zzalVar.zzU(this.zzv);
                        zzalVar.zzaa(this.zzw);
                        zzalVar.zzA(zztVarZzg);
                        i5 = 2;
                    }
                } else {
                    if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzch.zza("Unexpected MIME type.", null);
                    }
                    i5 = 3;
                }
                if (this.zza != null && !zzaiy.zzg.containsKey(this.zza)) {
                    zzalVar.zzM(this.zza);
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad = zzalVar.zzad();
                zzafa zzafaVarZzw = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw;
                zzafaVarZzw.zzl(zzanVarZzad);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zzadoVarZza.zza;
                    str5 = "video/dolby-vision";
                    break;
                }
                str3 = str5;
                int i72 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                    zzalVar.zzM(this.zza);
                    break;
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2 = zzalVar.zzad();
                zzafa zzafaVarZzw2 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2;
                zzafaVarZzw2.zzl(zzanVarZzad2);
                return;
            case 2:
                str5 = "video/av01";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22 = zzalVar.zzad();
                zzafa zzafaVarZzw22 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22;
                zzafaVarZzw22.zzl(zzanVarZzad22);
                return;
            case 3:
                str5 = "video/mpeg2";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222 = zzalVar.zzad();
                zzafa zzafaVarZzw222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222;
                zzafaVarZzw222.zzl(zzanVarZzad222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str5 = "video/mp4v-es";
                listZzo = listSingletonList;
                i2 = -1;
                iZzl = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222;
                zzafaVarZzw2222.zzl(zzanVarZzad2222);
                return;
            case 7:
                zzacx zzacxVarZza = zzacx.zza(new zzfu(zzi(this.zzb)));
                listZzo = zzacxVarZza.zza;
                this.zzX = zzacxVarZza.zzb;
                str = zzacxVarZza.zzk;
                str5 = "video/avc";
                str2 = str;
                i2 = -1;
                iZzl = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222;
                zzafaVarZzw22222.zzl(zzanVarZzad22222);
                return;
            case '\b':
                zzaek zzaekVarZza = zzaek.zza(new zzfu(zzi(this.zzb)));
                listZzo = zzaekVarZza.zza;
                this.zzX = zzaekVarZza.zzb;
                str = zzaekVarZza.zzi;
                str5 = "video/hevc";
                str2 = str;
                i2 = -1;
                iZzl = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222;
                zzafaVarZzw222222.zzl(zzanVarZzad222222);
                return;
            case '\t':
                Pair pairZzf = zzf(new zzfu(zzi(this.zzb)));
                str5 = (String) pairZzf.first;
                listSingletonList = (List) pairZzf.second;
                listZzo = listSingletonList;
                i2 = -1;
                iZzl = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222;
                zzafaVarZzw2222222.zzl(zzanVarZzad2222222);
                return;
            case '\n':
                str5 = "video/x-unknown";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222222;
                zzafaVarZzw22222222.zzl(zzanVarZzad22222222);
                return;
            case 11:
                listZzg = zzg(zzi(str4));
                i3 = 8192;
                str5 = "audio/vorbis";
                listZzo = listZzg;
                iZzl = -1;
                i2 = i3;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222;
                zzafaVarZzw222222222.zzl(zzanVarZzad222222222);
                return;
            case '\f':
                listZzg = new ArrayList(3);
                listZzg.add(zzi(this.zzb));
                listZzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                listZzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                i3 = 5760;
                str5 = "audio/opus";
                listZzo = listZzg;
                iZzl = -1;
                i2 = i3;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222222;
                zzafaVarZzw2222222222.zzl(zzanVarZzad2222222222);
                return;
            case '\r':
                List listSingletonList2 = Collections.singletonList(zzi(str4));
                zzacp zzacpVarZza = zzacq.zza(this.zzj);
                this.zzQ = zzacpVarZza.zza;
                this.zzO = zzacpVarZza.zzb;
                str5 = "audio/mp4a-latm";
                str2 = zzacpVarZza.zzc;
                iZzl = -1;
                listZzo = listSingletonList2;
                i2 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222222222;
                zzafaVarZzw22222222222.zzl(zzanVarZzad22222222222);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                iZzl = -1;
                i2 = 4096;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222222;
                zzafaVarZzw222222222222.zzl(zzanVarZzad222222222222);
                return;
            case 15:
                str5 = "audio/mpeg";
                iZzl = -1;
                i2 = 4096;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222222222;
                zzafaVarZzw2222222222222.zzl(zzanVarZzad2222222222222);
                return;
            case 16:
                str5 = "audio/ac3";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222222222222;
                zzafaVarZzw22222222222222.zzl(zzanVarZzad22222222222222);
                return;
            case 17:
                str5 = "audio/eac3";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222222222;
                zzafaVarZzw222222222222222.zzl(zzanVarZzad222222222222222);
                return;
            case 18:
                this.zzT = new zzafb();
                str5 = "audio/true-hd";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222222222222;
                zzafaVarZzw2222222222222222.zzl(zzanVarZzad2222222222222222);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222222222222222;
                zzafaVarZzw22222222222222222.zzl(zzanVarZzad22222222222222222);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222222222222;
                zzafaVarZzw222222222222222222.zzl(zzanVarZzad222222222222222222);
                return;
            case 22:
                listSingletonList = Collections.singletonList(zzi(str4));
                str5 = "audio/flac";
                listZzo = listSingletonList;
                i2 = -1;
                iZzl = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222222222222222;
                zzafaVarZzw2222222222222222222.zzl(zzanVarZzad2222222222222222222);
                return;
            case 23:
                if (zzh(new zzfu(zzi(this.zzb)))) {
                    iZzl = zzgd.zzl(this.zzP);
                    if (iZzl == 0) {
                        zzfk.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    }
                    i2 = -1;
                    listZzo = null;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                    zzalVar = new zzal();
                    if (!zzcg.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzalVar.zzJ(i);
                    zzalVar.zzX(str3);
                    zzalVar.zzP(i2);
                    zzalVar.zzO(this.zzZ);
                    zzalVar.zzZ(i722222222222222222222);
                    zzalVar.zzL(listZzo);
                    zzalVar.zzz(str2);
                    zzalVar.zzE(this.zzk);
                    zzan zzanVarZzad22222222222222222222 = zzalVar.zzad();
                    zzafa zzafaVarZzw22222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                    this.zzW = zzafaVarZzw22222222222222222222;
                    zzafaVarZzw22222222222222222222.zzl(zzanVarZzad22222222222222222222);
                    return;
                }
                zzfk.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                i2 = -1;
                iZzl = -1;
                str5 = "audio/x-unknown";
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222222222222222;
                zzafaVarZzw222222222222222222222.zzl(zzanVarZzad222222222222222222222);
                return;
            case 24:
                iZzl = zzgd.zzl(this.zzP);
                if (iZzl == 0) {
                    zzfk.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    iZzl = -1;
                    str5 = "audio/x-unknown";
                    listZzo = null;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i72222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                    zzalVar = new zzal();
                    if (!zzcg.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzalVar.zzJ(i);
                    zzalVar.zzX(str3);
                    zzalVar.zzP(i2);
                    zzalVar.zzO(this.zzZ);
                    zzalVar.zzZ(i72222222222222222222222);
                    zzalVar.zzL(listZzo);
                    zzalVar.zzz(str2);
                    zzalVar.zzE(this.zzk);
                    zzan zzanVarZzad2222222222222222222222 = zzalVar.zzad();
                    zzafa zzafaVarZzw2222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                    this.zzW = zzafaVarZzw2222222222222222222222;
                    zzafaVarZzw2222222222222222222222.zzl(zzanVarZzad2222222222222222222222);
                    return;
                }
                i2 = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222222222222222222222;
                zzafaVarZzw22222222222222222222222.zzl(zzanVarZzad22222222222222222222222);
                return;
            case 25:
                int i10 = this.zzP;
                if (i10 == 8) {
                    iZzl = 3;
                } else if (i10 == 16) {
                    iZzl = 268435456;
                } else if (i10 == 24) {
                    iZzl = 1342177280;
                } else {
                    if (i10 != 32) {
                        zzfk.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i10 + ". Setting mimeType to audio/x-unknown");
                        i2 = -1;
                        iZzl = -1;
                        str5 = "audio/x-unknown";
                        listZzo = null;
                        str2 = null;
                        if (this.zzN != null) {
                        }
                        str3 = str5;
                        int i7222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                        zzalVar = new zzal();
                        if (!zzcg.zzg(str3)) {
                        }
                        if (this.zza != null) {
                        }
                        zzalVar.zzJ(i);
                        zzalVar.zzX(str3);
                        zzalVar.zzP(i2);
                        zzalVar.zzO(this.zzZ);
                        zzalVar.zzZ(i7222222222222222222222222);
                        zzalVar.zzL(listZzo);
                        zzalVar.zzz(str2);
                        zzalVar.zzE(this.zzk);
                        zzan zzanVarZzad222222222222222222222222 = zzalVar.zzad();
                        zzafa zzafaVarZzw222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                        this.zzW = zzafaVarZzw222222222222222222222222;
                        zzafaVarZzw222222222222222222222222.zzl(zzanVarZzad222222222222222222222222);
                        return;
                    }
                    iZzl = 1610612736;
                }
                i2 = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222222222222222222222;
                zzafaVarZzw2222222222222222222222222.zzl(zzanVarZzad2222222222222222222222222);
                return;
            case 26:
                int i11 = this.zzP;
                if (i11 != 32) {
                    zzfk.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i11 + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    iZzl = -1;
                    str5 = "audio/x-unknown";
                    listZzo = null;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i722222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                    zzalVar = new zzal();
                    if (!zzcg.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzalVar.zzJ(i);
                    zzalVar.zzX(str3);
                    zzalVar.zzP(i2);
                    zzalVar.zzO(this.zzZ);
                    zzalVar.zzZ(i722222222222222222222222222);
                    zzalVar.zzL(listZzo);
                    zzalVar.zzz(str2);
                    zzalVar.zzE(this.zzk);
                    zzan zzanVarZzad22222222222222222222222222 = zzalVar.zzad();
                    zzafa zzafaVarZzw22222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                    this.zzW = zzafaVarZzw22222222222222222222222222;
                    zzafaVarZzw22222222222222222222222222.zzl(zzanVarZzad22222222222222222222222222);
                    return;
                }
                i2 = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222222222222222222222;
                zzafaVarZzw222222222222222222222222222.zzl(zzanVarZzad222222222222222222222222222);
                return;
            case 27:
                i2 = -1;
                iZzl = -1;
                str5 = "application/x-subrip";
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222222222222222222222222;
                zzafaVarZzw2222222222222222222222222222.zzl(zzanVarZzad2222222222222222222222222222);
                return;
            case 28:
                listZzo = zzgbc.zzo(zzaiy.zzc, zzi(this.zzb));
                i2 = -1;
                iZzl = -1;
                str5 = "text/x-ssa";
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222222222222222222222222222;
                zzafaVarZzw22222222222222222222222222222.zzl(zzanVarZzad22222222222222222222222222222);
                return;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                str5 = "text/vtt";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222222222222222222222222;
                zzafaVarZzw222222222222222222222222222222.zzl(zzanVarZzad222222222222222222222222222222);
                return;
            case 30:
                listSingletonList = zzgbc.zzn(zzi(str4));
                str5 = "application/vobsub";
                listZzo = listSingletonList;
                i2 = -1;
                iZzl = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i72222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i72222222222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad2222222222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw2222222222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw2222222222222222222222222222222;
                zzafaVarZzw2222222222222222222222222222222.zzl(zzanVarZzad2222222222222222222222222222222);
                return;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                str5 = "application/pgs";
                i2 = -1;
                iZzl = -1;
                listZzo = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i722222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i722222222222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad22222222222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw22222222222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw22222222222222222222222222222222;
                zzafaVarZzw22222222222222222222222222222222.zzl(zzanVarZzad22222222222222222222222222222222);
                return;
            case ' ':
                byte[] bArr3 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr3, 0, 4);
                listSingletonList = zzgbc.zzn(bArr3);
                str5 = "application/dvbsubs";
                listZzo = listSingletonList;
                i2 = -1;
                iZzl = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i7222222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzalVar = new zzal();
                if (!zzcg.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzalVar.zzJ(i);
                zzalVar.zzX(str3);
                zzalVar.zzP(i2);
                zzalVar.zzO(this.zzZ);
                zzalVar.zzZ(i7222222222222222222222222222222222);
                zzalVar.zzL(listZzo);
                zzalVar.zzz(str2);
                zzalVar.zzE(this.zzk);
                zzan zzanVarZzad222222222222222222222222222222222 = zzalVar.zzad();
                zzafa zzafaVarZzw222222222222222222222222222222222 = zzadxVar.zzw(this.zzc, i5);
                this.zzW = zzafaVarZzw222222222222222222222222222222222;
                zzafaVarZzw222222222222222222222222222222222.zzl(zzanVarZzad222222222222222222222222222222222);
                return;
            default:
                throw zzch.zza("Unrecognized codec identifier.", null);
        }
    }
}
