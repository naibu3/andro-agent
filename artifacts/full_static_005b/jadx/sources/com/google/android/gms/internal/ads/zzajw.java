package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzajw {
    private static final byte[] zza;

    static {
        int i = zzgd.zza;
        zza = "OpusHead".getBytes(zzfxs.zzc);
    }

    public static zzcd zza(zzajm zzajmVar) {
        zzgh zzghVar;
        zzajn zzajnVarZzb = zzajmVar.zzb(1751411826);
        zzajn zzajnVarZzb2 = zzajmVar.zzb(1801812339);
        zzajn zzajnVarZzb3 = zzajmVar.zzb(1768715124);
        if (zzajnVarZzb != null && zzajnVarZzb2 != null && zzajnVarZzb3 != null && zzg(zzajnVarZzb.zza) == 1835299937) {
            zzfu zzfuVar = zzajnVarZzb2.zza;
            zzfuVar.zzK(12);
            int iZzg = zzfuVar.zzg();
            String[] strArr = new String[iZzg];
            for (int i = 0; i < iZzg; i++) {
                int iZzg2 = zzfuVar.zzg();
                zzfuVar.zzL(4);
                strArr[i] = zzfuVar.zzA(iZzg2 - 8, zzfxs.zzc);
            }
            zzfu zzfuVar2 = zzajnVarZzb3.zza;
            zzfuVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzfuVar2.zzb() > 8) {
                int iZzd = zzfuVar2.zzd() + zzfuVar2.zzg();
                int iZzg3 = zzfuVar2.zzg() - 1;
                if (iZzg3 < 0 || iZzg3 >= iZzg) {
                    zzfk.zzf("AtomParsers", "Skipped metadata with unknown key index: " + iZzg3);
                } else {
                    String str = strArr[iZzg3];
                    int i2 = zzakf.zzb;
                    while (true) {
                        int iZzd2 = zzfuVar2.zzd();
                        if (iZzd2 >= iZzd) {
                            zzghVar = null;
                            break;
                        }
                        int iZzg4 = zzfuVar2.zzg();
                        if (zzfuVar2.zzg() == 1684108385) {
                            int iZzg5 = zzfuVar2.zzg();
                            int iZzg6 = zzfuVar2.zzg();
                            int i3 = iZzg4 - 16;
                            byte[] bArr = new byte[i3];
                            zzfuVar2.zzG(bArr, 0, i3);
                            zzghVar = new zzgh(str, bArr, iZzg6, iZzg5);
                            break;
                        }
                        zzfuVar2.zzK(iZzd2 + iZzg4);
                    }
                    if (zzghVar != null) {
                        arrayList.add(zzghVar);
                    }
                }
                zzfuVar2.zzK(iZzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzcd(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzcd zzb(zzajn zzajnVar) {
        int iZzn;
        zzfu zzfuVar = zzajnVar.zza;
        zzfuVar.zzK(8);
        zzcd zzcdVar = new zzcd(-9223372036854775807L, new zzcc[0]);
        while (zzfuVar.zzb() >= 8) {
            int iZzd = zzfuVar.zzd();
            int iZzg = zzfuVar.zzg() + iZzd;
            int iZzg2 = zzfuVar.zzg();
            zzcd zzcdVar2 = null;
            if (iZzg2 == 1835365473) {
                zzfuVar.zzK(iZzd);
                zzfuVar.zzL(8);
                zze(zzfuVar);
                while (true) {
                    if (zzfuVar.zzd() >= iZzg) {
                        break;
                    }
                    int iZzd2 = zzfuVar.zzd();
                    int iZzg3 = zzfuVar.zzg() + iZzd2;
                    if (zzfuVar.zzg() == 1768715124) {
                        zzfuVar.zzK(iZzd2);
                        zzfuVar.zzL(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzfuVar.zzd() < iZzg3) {
                            zzcc zzccVarZza = zzakf.zza(zzfuVar);
                            if (zzccVarZza != null) {
                                arrayList.add(zzccVarZza);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzcdVar2 = new zzcd(arrayList);
                        }
                    } else {
                        zzfuVar.zzK(iZzg3);
                    }
                }
                zzcdVar = zzcdVar.zzd(zzcdVar2);
            } else if (iZzg2 == 1936553057) {
                zzfuVar.zzK(iZzd);
                zzfuVar.zzL(12);
                while (true) {
                    if (zzfuVar.zzd() >= iZzg) {
                        break;
                    }
                    int iZzd3 = zzfuVar.zzd();
                    int iZzg4 = zzfuVar.zzg();
                    if (zzfuVar.zzg() != 1935766900) {
                        zzfuVar.zzK(iZzd3 + iZzg4);
                    } else if (iZzg4 >= 16) {
                        zzfuVar.zzL(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int iZzm = zzfuVar.zzm();
                            int iZzm2 = zzfuVar.zzm();
                            if (iZzm == 0) {
                                i = iZzm2;
                            } else if (iZzm == 1) {
                                i2 = iZzm2;
                            }
                        }
                        if (i == 12) {
                            iZzn = 240;
                        } else if (i == 13) {
                            iZzn = 120;
                        } else if (i == 21 && zzfuVar.zzb() >= 8 && zzfuVar.zzd() + 8 <= iZzg) {
                            iZzn = (zzfuVar.zzg() < 12 || zzfuVar.zzg() != 1936877170) ? -2147483647 : zzfuVar.zzn();
                        }
                        if (iZzn != -2147483647) {
                            zzcdVar2 = new zzcd(-9223372036854775807L, new zzaim(iZzn, i2));
                        }
                    }
                }
                zzcdVar = zzcdVar.zzd(zzcdVar2);
            } else if (iZzg2 == -1451722374) {
                zzcdVar = zzcdVar.zzd(zzi(zzfuVar));
            }
            zzfuVar.zzK(iZzg);
        }
        return zzcdVar;
    }

    public static zzgn zzc(zzfu zzfuVar) {
        long jZzt;
        long jZzt2;
        zzfuVar.zzK(8);
        if (zzajo.zze(zzfuVar.zzg()) == 0) {
            jZzt = zzfuVar.zzu();
            jZzt2 = zzfuVar.zzu();
        } else {
            jZzt = zzfuVar.zzt();
            jZzt2 = zzfuVar.zzt();
        }
        return new zzgn(jZzt, jZzt2, zzfuVar.zzu());
    }

    /* JADX WARN: Removed duplicated region for block: B:310:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0b67 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzd(zzajm zzajmVar, zzaej zzaejVar, long j, zzae zzaeVar, boolean z, boolean z2, zzfxu zzfxuVar) throws zzch {
        long j2;
        int i;
        zzajn zzajnVarZzb;
        int i2;
        ArrayList arrayList;
        zzajm zzajmVar2;
        long[] jArr;
        long[] jArr2;
        zzakp zzakpVar;
        zzfxu zzfxuVar2;
        Pair pairCreate;
        String str;
        int i3;
        Pair pair;
        long j3;
        int i4;
        zzae zzaeVarZzb;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        float f;
        String str3;
        byte[] bArrCopyOfRange;
        int i9;
        int i10;
        int i11;
        int i12;
        zzajs zzajsVar;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        float f2;
        String str4;
        zzajs zzajsVar2;
        boolean z4;
        int i19;
        int iZzd;
        int i20;
        int i21;
        boolean z5;
        zzt zztVarZzg;
        int i22;
        int iZzd2;
        int i23;
        List list;
        float f3;
        boolean z6;
        String str5;
        int i24;
        int i25;
        int i26;
        int i27;
        String str6;
        boolean z7;
        String str7;
        String str8;
        zzgbc zzgbcVarZzn;
        long j4;
        ArrayList arrayList2;
        zzajm zzajmVar3 = zzajmVar;
        zzae zzaeVar2 = zzaeVar;
        ArrayList arrayList3 = new ArrayList();
        int i28 = 0;
        while (i28 < zzajmVar3.zzc.size()) {
            zzajm zzajmVar4 = (zzajm) zzajmVar3.zzc.get(i28);
            if (zzajmVar4.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i2 = i28;
            } else {
                zzajn zzajnVarZzb2 = zzajmVar3.zzb(1836476516);
                zzajnVarZzb2.getClass();
                zzajm zzajmVarZza = zzajmVar4.zza(1835297121);
                zzajmVarZza.getClass();
                zzajn zzajnVarZzb3 = zzajmVarZza.zzb(1751411826);
                zzajnVarZzb3.getClass();
                int iZzg = zzg(zzajnVarZzb3.zza);
                int i29 = iZzg == 1936684398 ? 1 : iZzg == 1986618469 ? 2 : (iZzg == 1952807028 || iZzg == 1935832172 || iZzg == 1937072756 || iZzg == 1668047728) ? 3 : iZzg == 1835365473 ? 5 : -1;
                if (i29 == -1) {
                    zzfxuVar2 = zzfxuVar;
                    arrayList = arrayList3;
                    i2 = i28;
                    zzajmVar2 = zzajmVar4;
                    zzakpVar = null;
                } else {
                    zzajn zzajnVarZzb4 = zzajmVar4.zzb(1953196132);
                    zzajnVarZzb4.getClass();
                    zzfu zzfuVar = zzajnVarZzb4.zza;
                    zzfuVar.zzK(8);
                    int iZze = zzajo.zze(zzfuVar.zzg());
                    zzfuVar.zzL(iZze == 0 ? 8 : 16);
                    int iZzg2 = zzfuVar.zzg();
                    zzfuVar.zzL(4);
                    int iZzd3 = zzfuVar.zzd();
                    int i30 = 0;
                    while (true) {
                        int i31 = iZze == 0 ? 4 : 8;
                        if (i30 >= i31) {
                            zzfuVar.zzL(i31);
                            break;
                        }
                        if (zzfuVar.zzM()[iZzd3 + i30] != -1) {
                            long jZzu = iZze == 0 ? zzfuVar.zzu() : zzfuVar.zzv();
                            if (jZzu == 0) {
                                break;
                            }
                            j2 = jZzu;
                        } else {
                            i30++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzfuVar.zzL(16);
                    int iZzg3 = zzfuVar.zzg();
                    int iZzg4 = zzfuVar.zzg();
                    zzfuVar.zzL(4);
                    int iZzg5 = zzfuVar.zzg();
                    int iZzg6 = zzfuVar.zzg();
                    int i32 = 65536;
                    if (iZzg3 != 0) {
                        if (iZzg3 == 0) {
                            i32 = iZzg5;
                        } else if (iZzg4 != -65536) {
                            i32 = iZzg5;
                            iZzg3 = 0;
                        } else if (iZzg5 != 65536) {
                            iZzg4 = -65536;
                            i32 = iZzg5;
                            iZzg3 = 0;
                        } else if (iZzg6 == 0) {
                            i = 270;
                            zzajv zzajvVar = new zzajv(iZzg2, j2, i);
                            long j5 = j != -9223372036854775807L ? zzajvVar.zzb : j;
                            long j6 = zzc(zzajnVarZzb2.zza).zzc;
                            long jZzt = j5 != -9223372036854775807L ? zzgd.zzt(j5, 1000000L, j6, RoundingMode.FLOOR) : -9223372036854775807L;
                            zzajm zzajmVarZza2 = zzajmVarZza.zza(1835626086);
                            zzajmVarZza2.getClass();
                            zzajm zzajmVarZza3 = zzajmVarZza2.zza(1937007212);
                            zzajmVarZza3.getClass();
                            zzajn zzajnVarZzb5 = zzajmVarZza.zzb(1835296868);
                            zzajnVarZzb5.getClass();
                            zzfu zzfuVar2 = zzajnVarZzb5.zza;
                            zzfuVar2.zzK(8);
                            int iZze2 = zzajo.zze(zzfuVar2.zzg());
                            zzfuVar2.zzL(iZze2 != 0 ? 8 : 16);
                            int i33 = iZze2 != 0 ? 4 : 8;
                            long jZzu2 = zzfuVar2.zzu();
                            zzfuVar2.zzL(i33);
                            int iZzq = zzfuVar2.zzq();
                            StringBuilder sb = new StringBuilder();
                            sb.append((char) (((iZzq >> 10) & 31) + 96));
                            sb.append((char) (((iZzq >> 5) & 31) + 96));
                            sb.append((char) ((iZzq & 31) + 96));
                            Pair pairCreate2 = Pair.create(Long.valueOf(jZzu2), sb.toString());
                            zzajnVarZzb = zzajmVarZza3.zzb(1937011556);
                            if (zzajnVarZzb != null) {
                                throw zzch.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                            }
                            int i34 = zzajvVar.zza;
                            int i35 = zzajvVar.zzc;
                            String str9 = (String) pairCreate2.second;
                            zzfu zzfuVar3 = zzajnVarZzb.zza;
                            zzfuVar3.zzK(12);
                            int iZzg7 = zzfuVar3.zzg();
                            i2 = i28;
                            zzajs zzajsVar3 = new zzajs(iZzg7);
                            arrayList = arrayList3;
                            int i36 = 0;
                            while (i36 < iZzg7) {
                                zzajv zzajvVar2 = zzajvVar;
                                int iZzd4 = zzfuVar3.zzd();
                                zzajm zzajmVar5 = zzajmVar4;
                                int iZzg8 = zzfuVar3.zzg();
                                zzady.zzb(iZzg8 > 0, "childAtomSize must be positive");
                                int iZzg9 = zzfuVar3.zzg();
                                int i37 = iZzg7;
                                if (iZzg9 == 1635148593 || iZzg9 == 1635148595 || iZzg9 == 1701733238 || iZzg9 == 1831958048 || iZzg9 == 1836070006 || iZzg9 == 1752589105 || iZzg9 == 1751479857 || iZzg9 == 1932670515 || iZzg9 == 1211250227 || iZzg9 == 1987063864 || iZzg9 == 1987063865 || iZzg9 == 1635135537 || iZzg9 == 1685479798 || iZzg9 == 1685479729 || iZzg9 == 1685481573 || iZzg9 == 1685481521) {
                                    str = str9;
                                    int i38 = i35;
                                    i3 = i29;
                                    int i39 = i34;
                                    pair = pairCreate2;
                                    j3 = j6;
                                    i4 = i37;
                                    zzfuVar3.zzK(iZzd4 + 16);
                                    zzfuVar3.zzL(16);
                                    int iZzq2 = zzfuVar3.zzq();
                                    int iZzq3 = zzfuVar3.zzq();
                                    zzfuVar3.zzL(50);
                                    int iZzd5 = zzfuVar3.zzd();
                                    if (iZzg9 == 1701733238) {
                                        Pair pairZzh = zzh(zzfuVar3, iZzd4, iZzg8);
                                        if (pairZzh != null) {
                                            int iIntValue = ((Integer) pairZzh.first).intValue();
                                            zzaeVarZzb = zzaeVar2 == null ? null : zzaeVar2.zzb(((zzakq) pairZzh.second).zzb);
                                            zzajsVar3.zza[i36] = (zzakq) pairZzh.second;
                                            iZzg9 = iIntValue;
                                        } else {
                                            iZzg9 = 1701733238;
                                            zzaeVarZzb = zzaeVar2;
                                        }
                                        zzfuVar3.zzK(iZzd5);
                                    } else {
                                        zzaeVarZzb = zzaeVar2;
                                    }
                                    if (iZzg9 == 1831958048) {
                                        int i40 = iZzg9;
                                        str2 = "video/mpeg";
                                        i5 = i40;
                                    } else {
                                        i5 = 1211250227;
                                        if (iZzg9 == 1211250227) {
                                            str2 = "video/3gpp";
                                        } else {
                                            i5 = iZzg9;
                                            str2 = null;
                                        }
                                    }
                                    int i41 = iZzd5;
                                    zzae zzaeVar3 = zzaeVarZzb;
                                    float fZzp = 1.0f;
                                    i6 = i36;
                                    boolean z8 = false;
                                    ByteBuffer byteBufferZzl = null;
                                    String str10 = null;
                                    byte[] bArr = null;
                                    int iZzb = -1;
                                    int iZza = -1;
                                    zzajq zzajqVar = null;
                                    int i42 = 8;
                                    int i43 = 8;
                                    int i44 = -1;
                                    List listZzn = null;
                                    int i45 = -1;
                                    while (true) {
                                        if (i41 - iZzd4 >= iZzg8) {
                                            i7 = iZzq2;
                                            i8 = iZzq3;
                                            f = fZzp;
                                            str3 = str10;
                                            bArrCopyOfRange = bArr;
                                            break;
                                        }
                                        zzfuVar3.zzK(i41);
                                        int iZzd6 = zzfuVar3.zzd();
                                        int iZzg10 = zzfuVar3.zzg();
                                        if (iZzg10 == 0) {
                                            bArrCopyOfRange = bArr;
                                            if (zzfuVar3.zzd() - iZzd4 == iZzg8) {
                                                i7 = iZzq2;
                                                i8 = iZzq3;
                                                f = fZzp;
                                                str3 = str10;
                                                break;
                                            }
                                            i13 = 0;
                                        } else {
                                            bArrCopyOfRange = bArr;
                                            i13 = iZzg10;
                                        }
                                        if (i13 > 0) {
                                            i14 = iZzd4;
                                            i15 = iZzg8;
                                            z3 = true;
                                        } else {
                                            i14 = iZzd4;
                                            i15 = iZzg8;
                                            z3 = false;
                                        }
                                        zzady.zzb(z3, "childAtomSize must be positive");
                                        int iZzg11 = zzfuVar3.zzg();
                                        if (iZzg11 == 1635148611) {
                                            int i46 = iZzd6 + 8;
                                            zzady.zzb(str2 == null, null);
                                            zzfuVar3.zzK(i46);
                                            zzacx zzacxVarZza = zzacx.zza(zzfuVar3);
                                            list = zzacxVarZza.zza;
                                            zzajsVar3.zzc = zzacxVarZza.zzb;
                                            if (z8) {
                                                f3 = fZzp;
                                                z7 = true;
                                            } else {
                                                f3 = zzacxVarZza.zzj;
                                                z7 = false;
                                            }
                                            str5 = zzacxVarZza.zzk;
                                            iZza = zzacxVarZza.zzg;
                                            i24 = zzacxVarZza.zzh;
                                            i25 = zzacxVarZza.zzi;
                                            z8 = z7;
                                            i26 = zzacxVarZza.zze;
                                            i27 = zzacxVarZza.zzf;
                                            str6 = "video/avc";
                                        } else if (iZzg11 == 1752589123) {
                                            int i47 = iZzd6 + 8;
                                            zzady.zzb(str2 == null, null);
                                            zzfuVar3.zzK(i47);
                                            zzaek zzaekVarZza = zzaek.zza(zzfuVar3);
                                            list = zzaekVarZza.zza;
                                            zzajsVar3.zzc = zzaekVarZza.zzb;
                                            if (z8) {
                                                f3 = fZzp;
                                                z6 = true;
                                            } else {
                                                f3 = zzaekVarZza.zzh;
                                                z6 = false;
                                            }
                                            str5 = zzaekVarZza.zzi;
                                            iZza = zzaekVarZza.zze;
                                            i24 = zzaekVarZza.zzf;
                                            i25 = zzaekVarZza.zzg;
                                            z8 = z6;
                                            i26 = zzaekVarZza.zzc;
                                            i27 = zzaekVarZza.zzd;
                                            str6 = "video/hevc";
                                        } else {
                                            if (iZzg11 == 1685480259 || iZzg11 == 1685485123) {
                                                i16 = i5;
                                                i17 = iZzq2;
                                                i18 = iZzq3;
                                                f2 = fZzp;
                                                str4 = str10;
                                                zzajsVar2 = zzajsVar3;
                                                zzado zzadoVarZza = zzado.zza(zzfuVar3);
                                                if (zzadoVarZza != null) {
                                                    str2 = "video/dolby-vision";
                                                    str10 = zzadoVarZza.zza;
                                                    fZzp = f2;
                                                } else {
                                                    fZzp = f2;
                                                    str10 = str4;
                                                }
                                            } else if (iZzg11 != 1987076931) {
                                                i16 = i5;
                                                if (iZzg11 != 1635135811) {
                                                    if (iZzg11 == 1668050025) {
                                                        if (byteBufferZzl == null) {
                                                            byteBufferZzl = zzl();
                                                        }
                                                        byteBufferZzl.position(21);
                                                        byteBufferZzl.putShort(zzfuVar3.zzD());
                                                        byteBufferZzl.putShort(zzfuVar3.zzD());
                                                        i17 = iZzq2;
                                                        i18 = iZzq3;
                                                        zzajsVar2 = zzajsVar3;
                                                    } else {
                                                        if (iZzg11 == 1835295606) {
                                                            if (byteBufferZzl == null) {
                                                                byteBufferZzl = zzl();
                                                            }
                                                            short sZzD = zzfuVar3.zzD();
                                                            short sZzD2 = zzfuVar3.zzD();
                                                            short sZzD3 = zzfuVar3.zzD();
                                                            short sZzD4 = zzfuVar3.zzD();
                                                            zzajsVar2 = zzajsVar3;
                                                            short sZzD5 = zzfuVar3.zzD();
                                                            f2 = fZzp;
                                                            short sZzD6 = zzfuVar3.zzD();
                                                            i18 = iZzq3;
                                                            short sZzD7 = zzfuVar3.zzD();
                                                            i17 = iZzq2;
                                                            short sZzD8 = zzfuVar3.zzD();
                                                            long jZzu3 = zzfuVar3.zzu();
                                                            long jZzu4 = zzfuVar3.zzu();
                                                            str4 = str10;
                                                            byteBufferZzl.position(1);
                                                            byteBufferZzl.putShort(sZzD5);
                                                            byteBufferZzl.putShort(sZzD6);
                                                            byteBufferZzl.putShort(sZzD);
                                                            byteBufferZzl.putShort(sZzD2);
                                                            byteBufferZzl.putShort(sZzD3);
                                                            byteBufferZzl.putShort(sZzD4);
                                                            byteBufferZzl.putShort(sZzD7);
                                                            byteBufferZzl.putShort(sZzD8);
                                                            byteBufferZzl.putShort((short) (jZzu3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                            byteBufferZzl.putShort((short) (jZzu4 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                        } else {
                                                            i17 = iZzq2;
                                                            i18 = iZzq3;
                                                            f2 = fZzp;
                                                            str4 = str10;
                                                            zzajsVar2 = zzajsVar3;
                                                            if (iZzg11 == 1681012275) {
                                                                zzady.zzb(str2 == null, null);
                                                                str2 = "video/3gpp";
                                                            } else if (iZzg11 == 1702061171) {
                                                                zzady.zzb(str2 == null, null);
                                                                zzajq zzajqVarZzj = zzj(zzfuVar3, iZzd6);
                                                                str2 = zzajqVarZzj.zza;
                                                                byte[] bArr2 = zzajqVarZzj.zzb;
                                                                if (bArr2 != null) {
                                                                    zzajqVar = zzajqVarZzj;
                                                                    listZzn = zzgbc.zzn(bArr2);
                                                                } else {
                                                                    zzajqVar = zzajqVarZzj;
                                                                }
                                                            } else if (iZzg11 == 1885434736) {
                                                                zzfuVar3.zzK(iZzd6 + 8);
                                                                fZzp = zzfuVar3.zzp() / zzfuVar3.zzp();
                                                                str10 = str4;
                                                                z8 = true;
                                                            } else if (iZzg11 == 1937126244) {
                                                                int i48 = iZzd6 + 8;
                                                                while (i48 - iZzd6 < i13) {
                                                                    zzfuVar3.zzK(i48);
                                                                    int iZzg12 = zzfuVar3.zzg() + i48;
                                                                    if (zzfuVar3.zzg() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(zzfuVar3.zzM(), i48, iZzg12);
                                                                    } else {
                                                                        i48 = iZzg12;
                                                                    }
                                                                }
                                                                fZzp = f2;
                                                                str10 = str4;
                                                                bArrCopyOfRange = null;
                                                            } else {
                                                                if (iZzg11 == 1936995172) {
                                                                    int iZzm = zzfuVar3.zzm();
                                                                    zzfuVar3.zzL(3);
                                                                    if (iZzm == 0) {
                                                                        int iZzm2 = zzfuVar3.zzm();
                                                                        if (iZzm2 == 0) {
                                                                            i45 = 0;
                                                                        } else if (iZzm2 == 1) {
                                                                            fZzp = f2;
                                                                            str10 = str4;
                                                                            i45 = 1;
                                                                        } else if (iZzm2 == 2) {
                                                                            fZzp = f2;
                                                                            str10 = str4;
                                                                            i45 = 2;
                                                                        } else if (iZzm2 == 3) {
                                                                            i45 = 3;
                                                                        }
                                                                        fZzp = f2;
                                                                        str10 = str4;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    if (iZzg11 == 1668246642) {
                                                                        if (iZza == -1) {
                                                                            if (iZzb == -1) {
                                                                                int iZzg13 = zzfuVar3.zzg();
                                                                                if (iZzg13 == 1852009592 || iZzg13 == 1852009571) {
                                                                                    int iZzq4 = zzfuVar3.zzq();
                                                                                    int iZzq5 = zzfuVar3.zzq();
                                                                                    zzfuVar3.zzL(2);
                                                                                    if (i13 != 19) {
                                                                                        z4 = false;
                                                                                        int iZza2 = zzt.zza(iZzq4);
                                                                                        int i49 = true != z4 ? 2 : 1;
                                                                                        iZza = iZza2;
                                                                                        iZzb = zzt.zzb(iZzq5);
                                                                                        i44 = i49;
                                                                                    } else if ((zzfuVar3.zzm() & 128) != 0) {
                                                                                        i13 = 19;
                                                                                        z4 = true;
                                                                                        int iZza22 = zzt.zza(iZzq4);
                                                                                        if (true != z4) {
                                                                                        }
                                                                                        iZza = iZza22;
                                                                                        iZzb = zzt.zzb(iZzq5);
                                                                                        i44 = i49;
                                                                                    } else {
                                                                                        i13 = 19;
                                                                                        z4 = false;
                                                                                        int iZza222 = zzt.zza(iZzq4);
                                                                                        if (true != z4) {
                                                                                        }
                                                                                        iZza = iZza222;
                                                                                        iZzb = zzt.zzb(iZzq5);
                                                                                        i44 = i49;
                                                                                    }
                                                                                } else {
                                                                                    zzfk.zzf("AtomParsers", "Unsupported color type: ".concat(zzajo.zzf(iZzg13)));
                                                                                    iZzb = -1;
                                                                                    iZza = -1;
                                                                                }
                                                                            } else {
                                                                                iZza = -1;
                                                                            }
                                                                        }
                                                                    }
                                                                    fZzp = f2;
                                                                    str10 = str4;
                                                                }
                                                                fZzp = f2;
                                                                str10 = str4;
                                                            }
                                                        }
                                                        fZzp = f2;
                                                        str10 = str4;
                                                    }
                                                    break;
                                                    break;
                                                }
                                                zzfuVar3.zzK(iZzd6 + 8);
                                                zzr zzrVar = new zzr();
                                                byte[] bArrZzM = zzfuVar3.zzM();
                                                zzft zzftVar = new zzft(bArrZzM, bArrZzM.length);
                                                zzftVar.zzk(zzfuVar3.zzd() * 8);
                                                zzftVar.zzn(1);
                                                int iZzd7 = zzftVar.zzd(3);
                                                zzftVar.zzm(6);
                                                boolean zZzo = zzftVar.zzo();
                                                boolean zZzo2 = zzftVar.zzo();
                                                if (iZzd7 != 2) {
                                                    i19 = 1;
                                                    if (iZzd7 <= 2) {
                                                        int i50 = true != zZzo ? 8 : 10;
                                                        zzrVar.zzf(i50);
                                                        zzrVar.zza(i50);
                                                    }
                                                    zzftVar.zzm(13);
                                                    zzftVar.zzl();
                                                    int i51 = 4;
                                                    iZzd = zzftVar.zzd(4);
                                                    if (iZzd != i19) {
                                                        zzfk.zze("AtomParsers", "Unsupported obu_type: " + iZzd);
                                                        zztVarZzg = zzrVar.zzg();
                                                    } else if (zzftVar.zzo()) {
                                                        zzfk.zze("AtomParsers", "Unsupported obu_extension_flag");
                                                        zztVarZzg = zzrVar.zzg();
                                                    } else {
                                                        boolean zZzo3 = zzftVar.zzo();
                                                        zzftVar.zzl();
                                                        if (!zZzo3 || zzftVar.zzd(8) <= 127) {
                                                            int iZzd8 = zzftVar.zzd(3);
                                                            zzftVar.zzl();
                                                            if (zzftVar.zzo()) {
                                                                zzfk.zze("AtomParsers", "Unsupported reduced_still_picture_header");
                                                                zztVarZzg = zzrVar.zzg();
                                                            } else if (zzftVar.zzo()) {
                                                                zzfk.zze("AtomParsers", "Unsupported timing_info_present_flag");
                                                                zztVarZzg = zzrVar.zzg();
                                                            } else if (zzftVar.zzo()) {
                                                                zzfk.zze("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                                                zztVarZzg = zzrVar.zzg();
                                                            } else {
                                                                int i52 = 5;
                                                                int iZzd9 = zzftVar.zzd(5);
                                                                int i53 = 0;
                                                                while (i53 <= iZzd9) {
                                                                    zzftVar.zzm(12);
                                                                    if (zzftVar.zzd(i52) > 7) {
                                                                        zzftVar.zzl();
                                                                    }
                                                                    i53++;
                                                                    i52 = 5;
                                                                    i51 = 4;
                                                                }
                                                                int i54 = i51;
                                                                int iZzd10 = zzftVar.zzd(i54);
                                                                int iZzd11 = zzftVar.zzd(i54);
                                                                zzftVar.zzm(iZzd10 + 1);
                                                                zzftVar.zzm(iZzd11 + 1);
                                                                if (zzftVar.zzo()) {
                                                                    zzftVar.zzm(7);
                                                                }
                                                                zzftVar.zzm(7);
                                                                boolean zZzo4 = zzftVar.zzo();
                                                                if (zZzo4) {
                                                                    zzftVar.zzm(2);
                                                                }
                                                                if (zzftVar.zzo()) {
                                                                    i20 = 1;
                                                                } else {
                                                                    i20 = 1;
                                                                    if (zzftVar.zzd(1) > 0) {
                                                                    }
                                                                    if (zZzo4) {
                                                                        i21 = 3;
                                                                    } else {
                                                                        i21 = 3;
                                                                        zzftVar.zzm(3);
                                                                    }
                                                                    zzftVar.zzm(i21);
                                                                    boolean zZzo5 = zzftVar.zzo();
                                                                    if (iZzd8 != 2) {
                                                                        if (zZzo5) {
                                                                            zzftVar.zzl();
                                                                        }
                                                                    } else if (iZzd8 == 1) {
                                                                        z5 = false;
                                                                        if (zzftVar.zzo()) {
                                                                            int iZzd12 = zzftVar.zzd(8);
                                                                            int iZzd13 = zzftVar.zzd(8);
                                                                            int iZzd14 = zzftVar.zzd(8);
                                                                            if (z5) {
                                                                                i22 = 1;
                                                                            } else {
                                                                                i22 = 1;
                                                                                if (iZzd12 == 1) {
                                                                                    i23 = 13;
                                                                                    if (iZzd13 != 13) {
                                                                                        iZzd12 = 1;
                                                                                    } else if (iZzd14 == 0) {
                                                                                        iZzd2 = 1;
                                                                                        iZzd12 = 1;
                                                                                        zzrVar.zzc(zzt.zza(iZzd12));
                                                                                        zzrVar.zzb(iZzd2 != i22 ? 1 : 2);
                                                                                        zzrVar.zzd(zzt.zzb(i23));
                                                                                    } else {
                                                                                        iZzd12 = 1;
                                                                                        iZzd13 = 13;
                                                                                    }
                                                                                }
                                                                            }
                                                                            iZzd2 = zzftVar.zzd(i22);
                                                                            i23 = iZzd13;
                                                                            zzrVar.zzc(zzt.zza(iZzd12));
                                                                            zzrVar.zzb(iZzd2 != i22 ? 1 : 2);
                                                                            zzrVar.zzd(zzt.zzb(i23));
                                                                        }
                                                                        zztVarZzg = zzrVar.zzg();
                                                                        int i55 = zztVarZzg.zzf;
                                                                        int i56 = zztVarZzg.zze;
                                                                        iZza = zztVarZzg.zzd;
                                                                        int i57 = zztVarZzg.zzi;
                                                                        i43 = zztVarZzg.zzh;
                                                                        i17 = iZzq2;
                                                                        i18 = iZzq3;
                                                                        i44 = i56;
                                                                        i42 = i57;
                                                                        zzajsVar2 = zzajsVar3;
                                                                        iZzb = i55;
                                                                        str2 = "video/av01";
                                                                    }
                                                                    if (!zzftVar.zzo()) {
                                                                        z5 = true;
                                                                    }
                                                                    if (zzftVar.zzo()) {
                                                                    }
                                                                    zztVarZzg = zzrVar.zzg();
                                                                    int i552 = zztVarZzg.zzf;
                                                                    int i562 = zztVarZzg.zze;
                                                                    iZza = zztVarZzg.zzd;
                                                                    int i572 = zztVarZzg.zzi;
                                                                    i43 = zztVarZzg.zzh;
                                                                    i17 = iZzq2;
                                                                    i18 = iZzq3;
                                                                    i44 = i562;
                                                                    i42 = i572;
                                                                    zzajsVar2 = zzajsVar3;
                                                                    iZzb = i552;
                                                                    str2 = "video/av01";
                                                                }
                                                                if (!zzftVar.zzo()) {
                                                                    zzftVar.zzm(i20);
                                                                }
                                                                if (zZzo4) {
                                                                }
                                                                zzftVar.zzm(i21);
                                                                boolean zZzo52 = zzftVar.zzo();
                                                                if (iZzd8 != 2) {
                                                                }
                                                                if (!zzftVar.zzo()) {
                                                                }
                                                                if (zzftVar.zzo()) {
                                                                }
                                                                zztVarZzg = zzrVar.zzg();
                                                                int i5522 = zztVarZzg.zzf;
                                                                int i5622 = zztVarZzg.zze;
                                                                iZza = zztVarZzg.zzd;
                                                                int i5722 = zztVarZzg.zzi;
                                                                i43 = zztVarZzg.zzh;
                                                                i17 = iZzq2;
                                                                i18 = iZzq3;
                                                                i44 = i5622;
                                                                i42 = i5722;
                                                                zzajsVar2 = zzajsVar3;
                                                                iZzb = i5522;
                                                                str2 = "video/av01";
                                                            }
                                                        } else {
                                                            zzfk.zze("AtomParsers", "Excessive obu_size");
                                                            zztVarZzg = zzrVar.zzg();
                                                        }
                                                    }
                                                    i21 = 3;
                                                    int i55222 = zztVarZzg.zzf;
                                                    int i56222 = zztVarZzg.zze;
                                                    iZza = zztVarZzg.zzd;
                                                    int i57222 = zztVarZzg.zzi;
                                                    i43 = zztVarZzg.zzh;
                                                    i17 = iZzq2;
                                                    i18 = iZzq3;
                                                    i44 = i56222;
                                                    i42 = i57222;
                                                    zzajsVar2 = zzajsVar3;
                                                    iZzb = i55222;
                                                    str2 = "video/av01";
                                                } else if (zZzo) {
                                                    int i58 = true != zZzo2 ? 10 : 12;
                                                    zzrVar.zzf(i58);
                                                    zzrVar.zza(i58);
                                                    i19 = 1;
                                                    zzftVar.zzm(13);
                                                    zzftVar.zzl();
                                                    int i512 = 4;
                                                    iZzd = zzftVar.zzd(4);
                                                    if (iZzd != i19) {
                                                    }
                                                    i21 = 3;
                                                    int i552222 = zztVarZzg.zzf;
                                                    int i562222 = zztVarZzg.zze;
                                                    iZza = zztVarZzg.zzd;
                                                    int i572222 = zztVarZzg.zzi;
                                                    i43 = zztVarZzg.zzh;
                                                    i17 = iZzq2;
                                                    i18 = iZzq3;
                                                    i44 = i562222;
                                                    i42 = i572222;
                                                    zzajsVar2 = zzajsVar3;
                                                    iZzb = i552222;
                                                    str2 = "video/av01";
                                                } else {
                                                    iZzd7 = 2;
                                                    zZzo = false;
                                                    i19 = 1;
                                                    if (iZzd7 <= 2) {
                                                    }
                                                    zzftVar.zzm(13);
                                                    zzftVar.zzl();
                                                    int i5122 = 4;
                                                    iZzd = zzftVar.zzd(4);
                                                    if (iZzd != i19) {
                                                    }
                                                    i21 = 3;
                                                    int i5522222 = zztVarZzg.zzf;
                                                    int i5622222 = zztVarZzg.zze;
                                                    iZza = zztVarZzg.zzd;
                                                    int i5722222 = zztVarZzg.zzi;
                                                    i43 = zztVarZzg.zzh;
                                                    i17 = iZzq2;
                                                    i18 = iZzq3;
                                                    i44 = i5622222;
                                                    i42 = i5722222;
                                                    zzajsVar2 = zzajsVar3;
                                                    iZzb = i5522222;
                                                    str2 = "video/av01";
                                                }
                                            } else {
                                                zzady.zzb(str2 == null, null);
                                                zzfuVar3.zzK(iZzd6 + 12);
                                                zzfuVar3.zzL(2);
                                                int iZzm3 = zzfuVar3.zzm();
                                                int i59 = iZzm3 >> 4;
                                                int i60 = iZzm3 & 1;
                                                int iZzm4 = zzfuVar3.zzm();
                                                int iZzm5 = zzfuVar3.zzm();
                                                iZza = zzt.zza(iZzm4);
                                                int i61 = 1 != i60 ? 2 : 1;
                                                int iZzb2 = zzt.zzb(iZzm5);
                                                i16 = i5;
                                                i44 = i61;
                                                i17 = iZzq2;
                                                i18 = iZzq3;
                                                i42 = i59;
                                                i43 = i42;
                                                str2 = i5 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                iZzb = iZzb2;
                                                zzajsVar2 = zzajsVar3;
                                            }
                                            i41 += i13;
                                            iZzd4 = i14;
                                            bArr = bArrCopyOfRange;
                                            iZzg8 = i15;
                                            i5 = i16;
                                            zzajsVar3 = zzajsVar2;
                                            iZzq3 = i18;
                                            iZzq2 = i17;
                                        }
                                        i16 = i5;
                                        i17 = iZzq2;
                                        i18 = iZzq3;
                                        i43 = i26;
                                        listZzn = list;
                                        fZzp = f3;
                                        str10 = str5;
                                        i44 = i24;
                                        zzajsVar2 = zzajsVar3;
                                        iZzb = i25;
                                        String str11 = str6;
                                        i42 = i27;
                                        str2 = str11;
                                        i41 += i13;
                                        iZzd4 = i14;
                                        bArr = bArrCopyOfRange;
                                        iZzg8 = i15;
                                        i5 = i16;
                                        zzajsVar3 = zzajsVar2;
                                        iZzq3 = i18;
                                        iZzq2 = i17;
                                    }
                                    i9 = iZzd4;
                                    zzajs zzajsVar4 = zzajsVar3;
                                    i10 = iZzg8;
                                    if (str2 == null) {
                                        i12 = i38;
                                        i11 = i39;
                                        zzajsVar = zzajsVar4;
                                    } else {
                                        zzal zzalVar = new zzal();
                                        i11 = i39;
                                        zzalVar.zzJ(i11);
                                        zzalVar.zzX(str2);
                                        zzalVar.zzz(str3);
                                        zzalVar.zzac(i7);
                                        zzalVar.zzI(i8);
                                        zzalVar.zzT(f);
                                        i12 = i38;
                                        zzalVar.zzW(i12);
                                        zzalVar.zzU(bArrCopyOfRange);
                                        zzalVar.zzaa(i45);
                                        zzalVar.zzL(listZzn);
                                        zzalVar.zzE(zzaeVar3);
                                        zzr zzrVar2 = new zzr();
                                        zzrVar2.zzc(iZza);
                                        zzrVar2.zzb(i44);
                                        zzrVar2.zzd(iZzb);
                                        zzrVar2.zze(byteBufferZzl != null ? byteBufferZzl.array() : null);
                                        zzrVar2.zzf(i43);
                                        zzrVar2.zza(i42);
                                        zzalVar.zzA(zzrVar2.zzg());
                                        if (zzajqVar != null) {
                                            zzalVar.zzx(zzgea.zze(zzajqVar.zzc));
                                            zzalVar.zzS(zzgea.zze(zzajqVar.zzd));
                                        }
                                        zzajsVar = zzajsVar4;
                                        zzajsVar.zzb = zzalVar.zzad();
                                    }
                                } else if (iZzg9 == 1836069985 || iZzg9 == 1701733217 || iZzg9 == 1633889587 || iZzg9 == 1700998451 || iZzg9 == 1633889588 || iZzg9 == 1835823201 || iZzg9 == 1685353315 || iZzg9 == 1685353317 || iZzg9 == 1685353320 || iZzg9 == 1685353324 || iZzg9 == 1685353336 || iZzg9 == 1935764850 || iZzg9 == 1935767394 || iZzg9 == 1819304813 || iZzg9 == 1936684916 || iZzg9 == 1953984371 || iZzg9 == 778924082 || iZzg9 == 778924083 || iZzg9 == 1835557169 || iZzg9 == 1835560241 || iZzg9 == 1634492771 || iZzg9 == 1634492791 || iZzg9 == 1970037111 || iZzg9 == 1332770163 || iZzg9 == 1716281667) {
                                    i4 = i37;
                                    str = str9;
                                    i3 = i29;
                                    pair = pairCreate2;
                                    j3 = j6;
                                    zzm(zzfuVar3, iZzg9, iZzd4, iZzg8, i34, str, z2, zzaeVar, zzajsVar3, i36);
                                    i6 = i36;
                                    i9 = iZzd4;
                                    zzajsVar = zzajsVar3;
                                    i10 = iZzg8;
                                    i12 = i35;
                                    i11 = i34;
                                } else if (iZzg9 == 1414810956 || iZzg9 == 1954034535 || iZzg9 == 2004251764 || iZzg9 == 1937010800 || iZzg9 == 1664495672) {
                                    zzfuVar3.zzK(iZzd4 + 16);
                                    long j7 = Long.MAX_VALUE;
                                    if (iZzg9 == 1414810956) {
                                        str8 = "application/ttml+xml";
                                    } else if (iZzg9 == 1954034535) {
                                        int i62 = iZzg8 - 16;
                                        byte[] bArr3 = new byte[i62];
                                        zzfuVar3.zzG(bArr3, 0, i62);
                                        zzgbcVarZzn = zzgbc.zzn(bArr3);
                                        str7 = "application/x-quicktime-tx3g";
                                        j4 = Long.MAX_VALUE;
                                        zzal zzalVar2 = new zzal();
                                        zzalVar2.zzJ(i34);
                                        zzalVar2.zzX(str7);
                                        zzalVar2.zzO(str9);
                                        String str12 = str9;
                                        zzalVar2.zzab(j4);
                                        zzalVar2.zzL(zzgbcVarZzn);
                                        zzajsVar3.zzb = zzalVar2.zzad();
                                        i12 = i35;
                                        i3 = i29;
                                        i11 = i34;
                                        pair = pairCreate2;
                                        j3 = j6;
                                        i6 = i36;
                                        i9 = iZzd4;
                                        zzajsVar = zzajsVar3;
                                        i10 = iZzg8;
                                        i4 = i37;
                                        str = str12;
                                    } else if (iZzg9 == 2004251764) {
                                        str8 = "application/x-mp4-vtt";
                                    } else if (iZzg9 == 1937010800) {
                                        j7 = 0;
                                        str8 = "application/ttml+xml";
                                    } else {
                                        zzajsVar3.zzd = 1;
                                        str7 = "application/x-mp4-cea-608";
                                        j4 = j7;
                                        zzgbcVarZzn = null;
                                        zzal zzalVar22 = new zzal();
                                        zzalVar22.zzJ(i34);
                                        zzalVar22.zzX(str7);
                                        zzalVar22.zzO(str9);
                                        String str122 = str9;
                                        zzalVar22.zzab(j4);
                                        zzalVar22.zzL(zzgbcVarZzn);
                                        zzajsVar3.zzb = zzalVar22.zzad();
                                        i12 = i35;
                                        i3 = i29;
                                        i11 = i34;
                                        pair = pairCreate2;
                                        j3 = j6;
                                        i6 = i36;
                                        i9 = iZzd4;
                                        zzajsVar = zzajsVar3;
                                        i10 = iZzg8;
                                        i4 = i37;
                                        str = str122;
                                    }
                                    str7 = str8;
                                    j4 = j7;
                                    zzgbcVarZzn = null;
                                    zzal zzalVar222 = new zzal();
                                    zzalVar222.zzJ(i34);
                                    zzalVar222.zzX(str7);
                                    zzalVar222.zzO(str9);
                                    String str1222 = str9;
                                    zzalVar222.zzab(j4);
                                    zzalVar222.zzL(zzgbcVarZzn);
                                    zzajsVar3.zzb = zzalVar222.zzad();
                                    i12 = i35;
                                    i3 = i29;
                                    i11 = i34;
                                    pair = pairCreate2;
                                    j3 = j6;
                                    i6 = i36;
                                    i9 = iZzd4;
                                    zzajsVar = zzajsVar3;
                                    i10 = iZzg8;
                                    i4 = i37;
                                    str = str1222;
                                } else {
                                    if (iZzg9 == 1835365492) {
                                        zzfuVar3.zzK(iZzd4 + 16);
                                        zzfuVar3.zzx((char) 0);
                                        String strZzx = zzfuVar3.zzx((char) 0);
                                        if (strZzx != null) {
                                            zzal zzalVar3 = new zzal();
                                            zzalVar3.zzJ(i34);
                                            zzalVar3.zzX(strZzx);
                                            zzajsVar3.zzb = zzalVar3.zzad();
                                        }
                                    } else if (iZzg9 == 1667329389) {
                                        zzal zzalVar4 = new zzal();
                                        zzalVar4.zzJ(i34);
                                        zzalVar4.zzX("application/x-camera-motion");
                                        zzajsVar3.zzb = zzalVar4.zzad();
                                    }
                                    str = str9;
                                    i12 = i35;
                                    i3 = i29;
                                    i11 = i34;
                                    pair = pairCreate2;
                                    j3 = j6;
                                    i6 = i36;
                                    i9 = iZzd4;
                                    zzajsVar = zzajsVar3;
                                    i10 = iZzg8;
                                    i4 = i37;
                                }
                                zzfuVar3.zzK(i9 + i10);
                                i36 = i6 + 1;
                                zzaeVar2 = zzaeVar;
                                i35 = i12;
                                i34 = i11;
                                zzajsVar3 = zzajsVar;
                                iZzg7 = i4;
                                i29 = i3;
                                zzajvVar = zzajvVar2;
                                j6 = j3;
                                str9 = str;
                                zzajmVar4 = zzajmVar5;
                                pairCreate2 = pair;
                            }
                            int i63 = i29;
                            Pair pair2 = pairCreate2;
                            long j8 = j6;
                            zzajv zzajvVar3 = zzajvVar;
                            zzajs zzajsVar5 = zzajsVar3;
                            zzajm zzajmVar6 = zzajmVar4;
                            if (z) {
                                zzajmVar2 = zzajmVar6;
                            } else {
                                zzajmVar2 = zzajmVar6;
                                zzajm zzajmVarZza4 = zzajmVar2.zza(1701082227);
                                if (zzajmVarZza4 != null) {
                                    zzajn zzajnVarZzb6 = zzajmVarZza4.zzb(1701606260);
                                    if (zzajnVarZzb6 == null) {
                                        pairCreate = null;
                                    } else {
                                        zzfu zzfuVar4 = zzajnVarZzb6.zza;
                                        zzfuVar4.zzK(8);
                                        int iZze3 = zzajo.zze(zzfuVar4.zzg());
                                        int iZzp = zzfuVar4.zzp();
                                        long[] jArr3 = new long[iZzp];
                                        long[] jArr4 = new long[iZzp];
                                        for (int i64 = 0; i64 < iZzp; i64++) {
                                            jArr3[i64] = iZze3 == 1 ? zzfuVar4.zzv() : zzfuVar4.zzu();
                                            jArr4[i64] = iZze3 == 1 ? zzfuVar4.zzt() : zzfuVar4.zzg();
                                            if (zzfuVar4.zzD() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            zzfuVar4.zzL(2);
                                        }
                                        pairCreate = Pair.create(jArr3, jArr4);
                                    }
                                    if (pairCreate != null) {
                                        jArr = (long[]) pairCreate.first;
                                        jArr2 = (long[]) pairCreate.second;
                                    }
                                    if (zzajsVar5.zzb != null) {
                                        zzfxuVar2 = zzfxuVar;
                                        zzakpVar = null;
                                    } else {
                                        zzakpVar = new zzakp(zzajvVar3.zza, i63, ((Long) pair2.first).longValue(), j8, jZzt, zzajsVar5.zzb, zzajsVar5.zzd, zzajsVar5.zza, zzajsVar5.zzc, jArr, jArr2);
                                        zzfxuVar2 = zzfxuVar;
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (zzajsVar5.zzb != null) {
                            }
                        } else {
                            iZzg4 = -65536;
                            iZzg3 = 0;
                        }
                        i = (iZzg3 != -65536 && iZzg4 == 0 && i32 == 0 && iZzg6 == -65536) ? 180 : 0;
                        zzajv zzajvVar4 = new zzajv(iZzg2, j2, i);
                        if (j != -9223372036854775807L) {
                        }
                        long j62 = zzc(zzajnVarZzb2.zza).zzc;
                        if (j5 != -9223372036854775807L) {
                        }
                        zzajm zzajmVarZza22 = zzajmVarZza.zza(1835626086);
                        zzajmVarZza22.getClass();
                        zzajm zzajmVarZza32 = zzajmVarZza22.zza(1937007212);
                        zzajmVarZza32.getClass();
                        zzajn zzajnVarZzb52 = zzajmVarZza.zzb(1835296868);
                        zzajnVarZzb52.getClass();
                        zzfu zzfuVar22 = zzajnVarZzb52.zza;
                        zzfuVar22.zzK(8);
                        int iZze22 = zzajo.zze(zzfuVar22.zzg());
                        zzfuVar22.zzL(iZze22 != 0 ? 8 : 16);
                        if (iZze22 != 0) {
                        }
                        long jZzu22 = zzfuVar22.zzu();
                        zzfuVar22.zzL(i33);
                        int iZzq6 = zzfuVar22.zzq();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((char) (((iZzq6 >> 10) & 31) + 96));
                        sb2.append((char) (((iZzq6 >> 5) & 31) + 96));
                        sb2.append((char) ((iZzq6 & 31) + 96));
                        Pair pairCreate22 = Pair.create(Long.valueOf(jZzu22), sb2.toString());
                        zzajnVarZzb = zzajmVarZza32.zzb(1937011556);
                        if (zzajnVarZzb != null) {
                        }
                    } else {
                        if (iZzg4 == 65536) {
                            if (iZzg5 == -65536) {
                                if (iZzg6 == 0) {
                                    i = 90;
                                    zzajv zzajvVar42 = new zzajv(iZzg2, j2, i);
                                    if (j != -9223372036854775807L) {
                                    }
                                    long j622 = zzc(zzajnVarZzb2.zza).zzc;
                                    if (j5 != -9223372036854775807L) {
                                    }
                                    zzajm zzajmVarZza222 = zzajmVarZza.zza(1835626086);
                                    zzajmVarZza222.getClass();
                                    zzajm zzajmVarZza322 = zzajmVarZza222.zza(1937007212);
                                    zzajmVarZza322.getClass();
                                    zzajn zzajnVarZzb522 = zzajmVarZza.zzb(1835296868);
                                    zzajnVarZzb522.getClass();
                                    zzfu zzfuVar222 = zzajnVarZzb522.zza;
                                    zzfuVar222.zzK(8);
                                    int iZze222 = zzajo.zze(zzfuVar222.zzg());
                                    zzfuVar222.zzL(iZze222 != 0 ? 8 : 16);
                                    if (iZze222 != 0) {
                                    }
                                    long jZzu222 = zzfuVar222.zzu();
                                    zzfuVar222.zzL(i33);
                                    int iZzq62 = zzfuVar222.zzq();
                                    StringBuilder sb22 = new StringBuilder();
                                    sb22.append((char) (((iZzq62 >> 10) & 31) + 96));
                                    sb22.append((char) (((iZzq62 >> 5) & 31) + 96));
                                    sb22.append((char) ((iZzq62 & 31) + 96));
                                    Pair pairCreate222 = Pair.create(Long.valueOf(jZzu222), sb22.toString());
                                    zzajnVarZzb = zzajmVarZza322.zzb(1937011556);
                                    if (zzajnVarZzb != null) {
                                    }
                                } else {
                                    iZzg5 = -65536;
                                }
                            }
                            iZzg4 = 65536;
                        }
                        iZzg3 = 0;
                        if (iZzg3 == 0) {
                        }
                        if (iZzg3 != -65536) {
                            zzajv zzajvVar422 = new zzajv(iZzg2, j2, i);
                            if (j != -9223372036854775807L) {
                            }
                            long j6222 = zzc(zzajnVarZzb2.zza).zzc;
                            if (j5 != -9223372036854775807L) {
                            }
                            zzajm zzajmVarZza2222 = zzajmVarZza.zza(1835626086);
                            zzajmVarZza2222.getClass();
                            zzajm zzajmVarZza3222 = zzajmVarZza2222.zza(1937007212);
                            zzajmVarZza3222.getClass();
                            zzajn zzajnVarZzb5222 = zzajmVarZza.zzb(1835296868);
                            zzajnVarZzb5222.getClass();
                            zzfu zzfuVar2222 = zzajnVarZzb5222.zza;
                            zzfuVar2222.zzK(8);
                            int iZze2222 = zzajo.zze(zzfuVar2222.zzg());
                            zzfuVar2222.zzL(iZze2222 != 0 ? 8 : 16);
                            if (iZze2222 != 0) {
                            }
                            long jZzu2222 = zzfuVar2222.zzu();
                            zzfuVar2222.zzL(i33);
                            int iZzq622 = zzfuVar2222.zzq();
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append((char) (((iZzq622 >> 10) & 31) + 96));
                            sb222.append((char) (((iZzq622 >> 5) & 31) + 96));
                            sb222.append((char) ((iZzq622 & 31) + 96));
                            Pair pairCreate2222 = Pair.create(Long.valueOf(jZzu2222), sb222.toString());
                            zzajnVarZzb = zzajmVarZza3222.zzb(1937011556);
                            if (zzajnVarZzb != null) {
                            }
                        }
                    }
                }
                zzakp zzakpVar2 = (zzakp) zzfxuVar2.apply(zzakpVar);
                if (zzakpVar2 != null) {
                    zzajm zzajmVarZza5 = zzajmVar2.zza(1835297121);
                    zzajmVarZza5.getClass();
                    zzajm zzajmVarZza6 = zzajmVarZza5.zza(1835626086);
                    zzajmVarZza6.getClass();
                    zzajm zzajmVarZza7 = zzajmVarZza6.zza(1937007212);
                    zzajmVarZza7.getClass();
                    zzaks zzaksVarZzk = zzk(zzakpVar2, zzajmVarZza7, zzaejVar);
                    arrayList2 = arrayList;
                    arrayList2.add(zzaksVarZzk);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i28 = i2 + 1;
            zzajmVar3 = zzajmVar;
            zzaeVar2 = zzaeVar;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zze(zzfu zzfuVar) {
        int iZzd = zzfuVar.zzd();
        zzfuVar.zzL(4);
        if (zzfuVar.zzg() != 1751411826) {
            iZzd += 4;
        }
        zzfuVar.zzK(iZzd);
    }

    private static int zzf(zzfu zzfuVar) {
        int iZzm = zzfuVar.zzm();
        int i = iZzm & WorkQueueKt.MASK;
        while ((iZzm & 128) == 128) {
            iZzm = zzfuVar.zzm();
            i = (i << 7) | (iZzm & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzg(zzfu zzfuVar) {
        zzfuVar.zzK(16);
        return zzfuVar.zzg();
    }

    private static Pair zzh(zzfu zzfuVar, int i, int i2) throws zzch {
        Integer num;
        zzakq zzakqVar;
        Pair pairCreate;
        int i3;
        int i4;
        byte[] bArr;
        int iZzd = zzfuVar.zzd();
        while (iZzd - i < i2) {
            zzfuVar.zzK(iZzd);
            int iZzg = zzfuVar.zzg();
            zzady.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzfuVar.zzg() == 1936289382) {
                int i5 = iZzd + 8;
                int i6 = 0;
                int i7 = -1;
                String strZzA = null;
                Integer numValueOf = null;
                while (i5 - iZzd < iZzg) {
                    zzfuVar.zzK(i5);
                    int iZzg2 = zzfuVar.zzg();
                    int iZzg3 = zzfuVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzfuVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzfuVar.zzL(4);
                        strZzA = zzfuVar.zzA(4, zzfxs.zzc);
                    } else if (iZzg3 == 1935894633) {
                        i7 = i5;
                        i6 = iZzg2;
                    }
                    i5 += iZzg2;
                }
                if ("cenc".equals(strZzA) || "cbc1".equals(strZzA) || "cens".equals(strZzA) || "cbcs".equals(strZzA)) {
                    zzady.zzb(numValueOf != null, "frma atom is mandatory");
                    zzady.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = numValueOf;
                            zzakqVar = null;
                            break;
                        }
                        zzfuVar.zzK(i8);
                        int iZzg4 = zzfuVar.zzg();
                        if (zzfuVar.zzg() == 1952804451) {
                            int iZze = zzajo.zze(zzfuVar.zzg());
                            zzfuVar.zzL(1);
                            if (iZze == 0) {
                                zzfuVar.zzL(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int iZzm = zzfuVar.zzm();
                                int i9 = (iZzm & 240) >> 4;
                                i3 = iZzm & 15;
                                i4 = i9;
                            }
                            boolean z = zzfuVar.zzm() == 1;
                            int iZzm2 = zzfuVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzfuVar.zzG(bArr2, 0, 16);
                            if (z && iZzm2 == 0) {
                                int iZzm3 = zzfuVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzfuVar.zzG(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            zzakqVar = new zzakq(z, strZzA, iZzm2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += iZzg4;
                        }
                    }
                    zzady.zzb(zzakqVar != null, "tenc atom is mandatory");
                    int i10 = zzgd.zza;
                    pairCreate = Pair.create(num, zzakqVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzd += iZzg;
        }
        return null;
    }

    private static zzcd zzi(zzfu zzfuVar) {
        short sZzD = zzfuVar.zzD();
        zzfuVar.zzL(2);
        String strZzA = zzfuVar.zzA(sZzD, zzfxs.zzc);
        int iMax = Math.max(strZzA.lastIndexOf(43), strZzA.lastIndexOf(45));
        try {
            return new zzcd(-9223372036854775807L, new zzgk(Float.parseFloat(strZzA.substring(0, iMax)), Float.parseFloat(strZzA.substring(iMax, strZzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzajq zzj(zzfu zzfuVar, int i) {
        zzfuVar.zzK(i + 12);
        zzfuVar.zzL(1);
        zzf(zzfuVar);
        zzfuVar.zzL(2);
        int iZzm = zzfuVar.zzm();
        if ((iZzm & 128) != 0) {
            zzfuVar.zzL(2);
        }
        if ((iZzm & 64) != 0) {
            zzfuVar.zzL(zzfuVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzfuVar.zzL(2);
        }
        zzfuVar.zzL(1);
        zzf(zzfuVar);
        String strZzd = zzcg.zzd(zzfuVar.zzm());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzajq(strZzd, null, -1L, -1L);
        }
        zzfuVar.zzL(4);
        long jZzu = zzfuVar.zzu();
        long jZzu2 = zzfuVar.zzu();
        zzfuVar.zzL(1);
        int iZzf = zzf(zzfuVar);
        byte[] bArr = new byte[iZzf];
        zzfuVar.zzG(bArr, 0, iZzf);
        return new zzajq(strZzd, bArr, jZzu2 <= 0 ? -1L : jZzu2, jZzu > 0 ? jZzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0271 A[ADDED_TO_REGION, LOOP:12: B:103:0x0271->B:107:0x027b, LOOP_START, PHI: r16
      0x0271: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:102:0x026f, B:107:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0173 A[PHI: r9
      0x0173: PHI (r9v4 int) = (r9v3 int), (r9v3 int), (r9v35 int), (r9v3 int) binds: [B:36:0x00cf, B:43:0x00e9, B:60:0x0172, B:42:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzaks zzk(zzakp zzakpVar, zzajm zzajmVar, zzaej zzaejVar) throws zzch {
        zzajr zzajuVar;
        boolean z;
        int iZzp;
        int iZzp2;
        int iZzp3;
        int iZza;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int i;
        int i2;
        int iZzg;
        long j;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        long[] jArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zzakp zzakpVar2;
        int i11;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i12;
        int[] iArr3;
        int i13;
        long j2;
        int i14;
        int i15;
        int i16;
        long[] jArr3;
        int i17;
        int i18;
        long[] jArr4;
        int[] iArr4;
        int[] iArr5;
        boolean z4;
        int i19;
        int i20;
        int i21;
        int i22;
        int length;
        zzajn zzajnVarZzb = zzajmVar.zzb(1937011578);
        if (zzajnVarZzb != null) {
            zzajuVar = new zzajt(zzajnVarZzb, zzakpVar.zzf);
        } else {
            zzajn zzajnVarZzb2 = zzajmVar.zzb(1937013298);
            if (zzajnVarZzb2 == null) {
                throw zzch.zza("Track has no sample table size information", null);
            }
            zzajuVar = new zzaju(zzajnVarZzb2);
        }
        int iZzb = zzajuVar.zzb();
        if (iZzb == 0) {
            return new zzaks(zzakpVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        zzajn zzajnVarZzb3 = zzajmVar.zzb(1937007471);
        if (zzajnVarZzb3 == null) {
            zzajnVarZzb3 = zzajmVar.zzb(1668232756);
            zzajnVarZzb3.getClass();
            z = true;
        } else {
            z = false;
        }
        zzajn zzajnVarZzb4 = zzajmVar.zzb(1937011555);
        zzajnVarZzb4.getClass();
        zzajn zzajnVarZzb5 = zzajmVar.zzb(1937011827);
        zzajnVarZzb5.getClass();
        zzajn zzajnVarZzb6 = zzajmVar.zzb(1937011571);
        zzfu zzfuVar = zzajnVarZzb6 != null ? zzajnVarZzb6.zza : null;
        zzajn zzajnVarZzb7 = zzajmVar.zzb(1668576371);
        zzfu zzfuVar2 = zzajnVarZzb7 != null ? zzajnVarZzb7.zza : null;
        zzfu zzfuVar3 = zzajnVarZzb5.zza;
        zzajp zzajpVar = new zzajp(zzajnVarZzb4.zza, zzajnVarZzb3.zza, z);
        zzfuVar3.zzK(12);
        int iZzp4 = zzfuVar3.zzp() - 1;
        int iZzp5 = zzfuVar3.zzp();
        int iZzp6 = zzfuVar3.zzp();
        if (zzfuVar2 != null) {
            zzfuVar2.zzK(12);
            iZzp = zzfuVar2.zzp();
        } else {
            iZzp = 0;
        }
        if (zzfuVar != null) {
            zzfuVar.zzK(12);
            iZzp2 = zzfuVar.zzp();
            if (iZzp2 > 0) {
                iZzp3 = zzfuVar.zzp() - 1;
                iZza = zzajuVar.zza();
                String str = zzakpVar.zzf.zzn;
                if (iZza != -1 || ((!"audio/raw".equals(str) && !"audio/g711-mlaw".equals(str) && !"audio/g711-alaw".equals(str)) || iZzp4 != 0)) {
                    jArrCopyOf = new long[iZzb];
                    iArrCopyOf = new int[iZzb];
                    jArrCopyOf2 = new long[iZzb];
                    int[] iArrCopyOf2 = new int[iZzb];
                    int i23 = iZzp4;
                    i = 0;
                    i2 = 0;
                    int iZzp7 = 0;
                    iZzg = 0;
                    int i24 = 0;
                    j = 0;
                    long j3 = 0;
                    while (true) {
                        if (i >= iZzb) {
                            i3 = iZzp5;
                            i4 = i24;
                            i5 = iZzg;
                            break;
                        }
                        boolean zZza = true;
                        while (true) {
                            if (i2 != 0) {
                                i14 = iZzb;
                                i3 = iZzp5;
                                i15 = iZzp6;
                                i16 = i2;
                                break;
                            }
                            zZza = zzajpVar.zza();
                            if (!zZza) {
                                i14 = iZzb;
                                i3 = iZzp5;
                                i15 = iZzp6;
                                i16 = 0;
                                break;
                            }
                            int i25 = iZzp5;
                            long j4 = zzajpVar.zzd;
                            i2 = zzajpVar.zzc;
                            j = j4;
                            iZzp5 = i25;
                            iZzp6 = iZzp6;
                            iZzb = iZzb;
                        }
                        if (!zZza) {
                            zzfk.zzf("AtomParsers", "Unexpected end of chunk data");
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i);
                            iZzb = i;
                            i5 = iZzg;
                            i4 = i24;
                            break;
                        }
                        if (zzfuVar2 != null) {
                            while (true) {
                                if (iZzp7 != 0) {
                                    break;
                                }
                                if (iZzp <= 0) {
                                    iZzp7 = 0;
                                    break;
                                }
                                iZzp--;
                                iZzp7 = zzfuVar2.zzp();
                                iZzg = zzfuVar2.zzg();
                            }
                            iZzp7--;
                        }
                        int i26 = iZzg;
                        jArrCopyOf[i] = j;
                        int iZzc = zzajuVar.zzc();
                        iArrCopyOf[i] = iZzc;
                        int i27 = i24;
                        i24 = iZzc > i27 ? iZzc : i27;
                        jArrCopyOf2[i] = j3 + i26;
                        iArrCopyOf2[i] = zzfuVar == null ? 1 : 0;
                        if (i == iZzp3) {
                            iArrCopyOf2[i] = 1;
                            iZzp2--;
                            if (iZzp2 > 0) {
                                zzfuVar.getClass();
                                iZzp3 = zzfuVar.zzp() - 1;
                            }
                        }
                        int i28 = iZzp3;
                        long[] jArr5 = jArrCopyOf2;
                        iZzp6 = i15;
                        j3 += iZzp6;
                        int iZzp8 = i3 - 1;
                        if (iZzp8 == 0) {
                            if (i23 > 0) {
                                iZzp8 = zzfuVar3.zzp();
                                i23--;
                                iZzp6 = zzfuVar3.zzg();
                            } else {
                                iZzp8 = 0;
                            }
                        }
                        int[] iArr6 = iArrCopyOf;
                        j += iArrCopyOf[i];
                        int i29 = i16 - 1;
                        i++;
                        iZzg = i26;
                        jArrCopyOf2 = jArr5;
                        jArrCopyOf = jArrCopyOf;
                        iZzb = i14;
                        iZzp5 = iZzp8;
                        iZzp3 = i28;
                        i2 = i29;
                        iArrCopyOf = iArr6;
                    }
                    long j5 = j3 + i5;
                    if (zzfuVar2 != null) {
                        while (iZzp > 0) {
                            if (zzfuVar2.zzp() != 0) {
                                z2 = false;
                                break;
                            }
                            zzfuVar2.zzg();
                            iZzp--;
                        }
                        z2 = true;
                        if (iZzp2 != 0) {
                            if (i3 == 0) {
                                if (i2 != 0) {
                                    i10 = 0;
                                    zzakpVar2 = zzakpVar;
                                    z3 = z2;
                                    jArr = jArrCopyOf;
                                    i7 = i2;
                                } else if (i23 != 0) {
                                    i10 = 0;
                                    i7 = 0;
                                    zzakpVar2 = zzakpVar;
                                    z3 = z2;
                                    jArr = jArrCopyOf;
                                } else if (iZzp7 != 0) {
                                    i10 = 0;
                                    i7 = 0;
                                    i8 = 0;
                                    zzakpVar2 = zzakpVar;
                                    z3 = z2;
                                    jArr = jArrCopyOf;
                                    i9 = iZzp7;
                                } else if (z2) {
                                    zzakpVar2 = zzakpVar;
                                    jArr = jArrCopyOf;
                                    iArr = iArrCopyOf;
                                    i11 = iZzb;
                                    jArr2 = jArr;
                                    iArr2 = iArrCopyOf2;
                                    i12 = i4;
                                    iArr3 = iArr;
                                    i13 = i11;
                                    j2 = j5;
                                } else {
                                    i6 = 0;
                                    i10 = 0;
                                    z3 = false;
                                    i7 = 0;
                                    i8 = 0;
                                    i9 = 0;
                                    zzakpVar2 = zzakpVar;
                                    jArr = jArrCopyOf;
                                }
                                i8 = i23;
                                i9 = iZzp7;
                            } else {
                                zzakpVar2 = zzakpVar;
                                z3 = z2;
                                jArr = jArrCopyOf;
                                i7 = i2;
                                i8 = i23;
                                i9 = iZzp7;
                                i10 = i3;
                            }
                            i6 = 0;
                        } else {
                            z3 = z2;
                            jArr = jArrCopyOf;
                            i6 = iZzp2;
                            i7 = i2;
                            i8 = i23;
                            i9 = iZzp7;
                            i10 = i3;
                            zzakpVar2 = zzakpVar;
                        }
                        int i30 = zzakpVar2.zza;
                        iArr = iArrCopyOf;
                        i11 = iZzb;
                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                        sb.append(i30);
                        sb.append(": remainingSynchronizationSamples ");
                        sb.append(i6);
                        sb.append(", remainingSamplesAtTimestampDelta ");
                        sb.append(i10);
                        sb.append(", remainingSamplesInChunk ");
                        sb.append(i7);
                        sb.append(", remainingTimestampDeltaChanges ");
                        sb.append(i8);
                        sb.append(", remainingSamplesAtTimestampOffset ");
                        sb.append(i9);
                        sb.append(true == z3 ? ", ctts invalid" : "");
                        zzfk.zzf("AtomParsers", sb.toString());
                        jArr2 = jArr;
                        iArr2 = iArrCopyOf2;
                        i12 = i4;
                        iArr3 = iArr;
                        i13 = i11;
                        j2 = j5;
                    } else {
                        z2 = true;
                        if (iZzp2 != 0) {
                        }
                        int i302 = zzakpVar2.zza;
                        iArr = iArrCopyOf;
                        i11 = iZzb;
                        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                        sb2.append(i302);
                        sb2.append(": remainingSynchronizationSamples ");
                        sb2.append(i6);
                        sb2.append(", remainingSamplesAtTimestampDelta ");
                        sb2.append(i10);
                        sb2.append(", remainingSamplesInChunk ");
                        sb2.append(i7);
                        sb2.append(", remainingTimestampDeltaChanges ");
                        sb2.append(i8);
                        sb2.append(", remainingSamplesAtTimestampOffset ");
                        sb2.append(i9);
                        sb2.append(true == z3 ? ", ctts invalid" : "");
                        zzfk.zzf("AtomParsers", sb2.toString());
                        jArr2 = jArr;
                        iArr2 = iArrCopyOf2;
                        i12 = i4;
                        iArr3 = iArr;
                        i13 = i11;
                        j2 = j5;
                    }
                } else if (iZzp == 0 && iZzp2 == 0) {
                    int i31 = zzajpVar.zza;
                    long[] jArr6 = new long[i31];
                    int[] iArr7 = new int[i31];
                    while (zzajpVar.zza()) {
                        int i32 = zzajpVar.zzb;
                        jArr6[i32] = zzajpVar.zzd;
                        iArr7[i32] = zzajpVar.zzc;
                    }
                    long j6 = iZzp6;
                    int i33 = 8192 / iZza;
                    int i34 = 0;
                    for (int i35 = 0; i35 < i31; i35++) {
                        int i36 = iArr7[i35];
                        int i37 = zzgd.zza;
                        i34 += ((i36 + i33) - 1) / i33;
                    }
                    long[] jArr7 = new long[i34];
                    int[] iArr8 = new int[i34];
                    long[] jArr8 = new long[i34];
                    int[] iArr9 = new int[i34];
                    int i38 = 0;
                    int i39 = 0;
                    int iMax = 0;
                    int i40 = 0;
                    while (i38 < i31) {
                        int i41 = iArr7[i38];
                        long j7 = jArr6[i38];
                        int i42 = i31;
                        int i43 = i41;
                        while (i43 > 0) {
                            int iMin = Math.min(i33, i43);
                            jArr7[i40] = j7;
                            long[] jArr9 = jArr6;
                            int i44 = iZza * iMin;
                            iArr8[i40] = i44;
                            iMax = Math.max(iMax, i44);
                            jArr8[i40] = i39 * j6;
                            iArr9[i40] = 1;
                            j7 += iArr8[i40];
                            i39 += iMin;
                            i43 -= iMin;
                            i40++;
                            jArr6 = jArr9;
                            iArr7 = iArr7;
                        }
                        i38++;
                        i31 = i42;
                    }
                    i13 = iZzb;
                    j2 = j6 * i39;
                    jArr2 = jArr7;
                    iArr2 = iArr9;
                    iArr3 = iArr8;
                    jArrCopyOf2 = jArr8;
                    i12 = iMax;
                    zzakpVar2 = zzakpVar;
                } else {
                    iZzp4 = 0;
                    jArrCopyOf = new long[iZzb];
                    iArrCopyOf = new int[iZzb];
                    jArrCopyOf2 = new long[iZzb];
                    int[] iArrCopyOf22 = new int[iZzb];
                    int i232 = iZzp4;
                    i = 0;
                    i2 = 0;
                    int iZzp72 = 0;
                    iZzg = 0;
                    int i242 = 0;
                    j = 0;
                    long j32 = 0;
                    while (true) {
                        if (i >= iZzb) {
                        }
                        int[] iArr62 = iArrCopyOf;
                        j += iArrCopyOf[i];
                        int i292 = i16 - 1;
                        i++;
                        iZzg = i26;
                        jArrCopyOf2 = jArr5;
                        jArrCopyOf = jArrCopyOf;
                        iZzb = i14;
                        iZzp5 = iZzp8;
                        iZzp3 = i28;
                        i2 = i292;
                        iArrCopyOf = iArr62;
                    }
                    long j52 = j32 + i5;
                    if (zzfuVar2 != null) {
                    }
                }
                long jZzt = zzgd.zzt(j2, 1000000L, zzakpVar2.zzc, RoundingMode.FLOOR);
                jArr3 = zzakpVar2.zzh;
                if (jArr3 != null) {
                    zzgd.zzF(jArrCopyOf2, 1000000L, zzakpVar2.zzc);
                    return new zzaks(zzakpVar, jArr2, iArr3, i12, jArrCopyOf2, iArr2, jZzt);
                }
                if (jArr3.length == 1 && zzakpVar2.zzb == 1 && (length = jArrCopyOf2.length) >= 2) {
                    long[] jArr10 = zzakpVar2.zzi;
                    jArr10.getClass();
                    long j8 = jArr10[0];
                    int i45 = i13;
                    long jZzt2 = zzgd.zzt(jArr3[0], zzakpVar2.zzc, zzakpVar2.zzd, RoundingMode.FLOOR) + j8;
                    int i46 = length - 1;
                    int iMax2 = Math.max(0, Math.min(4, i46));
                    int iMax3 = Math.max(0, Math.min(length - 4, i46));
                    long j9 = jArrCopyOf2[0];
                    if (j9 > j8 || j8 >= jArrCopyOf2[iMax2] || jArrCopyOf2[iMax3] >= jZzt2 || jZzt2 > j2) {
                        i17 = i45;
                    } else {
                        long jZzt3 = zzgd.zzt(j8 - j9, zzakpVar2.zzf.zzB, zzakpVar2.zzc, RoundingMode.FLOOR);
                        i17 = i45;
                        long jZzt4 = zzgd.zzt(j2 - jZzt2, zzakpVar2.zzf.zzB, zzakpVar2.zzc, RoundingMode.FLOOR);
                        if (jZzt3 != 0) {
                            if (jZzt3 <= 2147483647L && jZzt4 <= 2147483647L) {
                                zzaejVar.zza = (int) jZzt3;
                                zzaejVar.zzb = (int) jZzt4;
                                zzgd.zzF(jArrCopyOf2, 1000000L, zzakpVar2.zzc);
                                return new zzaks(zzakpVar, jArr2, iArr3, i12, jArrCopyOf2, iArr2, zzgd.zzt(zzakpVar2.zzh[0], 1000000L, zzakpVar2.zzd, RoundingMode.FLOOR));
                            }
                        } else if (jZzt4 != 0) {
                            jZzt3 = 0;
                            if (jZzt3 <= 2147483647L) {
                                zzaejVar.zza = (int) jZzt3;
                                zzaejVar.zzb = (int) jZzt4;
                                zzgd.zzF(jArrCopyOf2, 1000000L, zzakpVar2.zzc);
                                return new zzaks(zzakpVar, jArr2, iArr3, i12, jArrCopyOf2, iArr2, zzgd.zzt(zzakpVar2.zzh[0], 1000000L, zzakpVar2.zzd, RoundingMode.FLOOR));
                            }
                        }
                    }
                } else {
                    i17 = i13;
                }
                long[] jArr11 = zzakpVar2.zzh;
                int length2 = jArr11.length;
                if (length2 == 1) {
                    if (jArr11[0] == 0) {
                        long[] jArr12 = zzakpVar2.zzi;
                        jArr12.getClass();
                        long j10 = jArr12[0];
                        for (int i47 = 0; i47 < jArrCopyOf2.length; i47++) {
                            jArrCopyOf2[i47] = zzgd.zzt(jArrCopyOf2[i47] - j10, 1000000L, zzakpVar2.zzc, RoundingMode.FLOOR);
                        }
                        return new zzaks(zzakpVar, jArr2, iArr3, i12, jArrCopyOf2, iArr2, zzgd.zzt(j2 - j10, 1000000L, zzakpVar2.zzc, RoundingMode.FLOOR));
                    }
                    length2 = 1;
                }
                boolean z5 = zzakpVar2.zzb == 1;
                long[] jArr13 = zzakpVar2.zzi;
                int[] iArr10 = new int[length2];
                int[] iArr11 = new int[length2];
                jArr13.getClass();
                int i48 = 0;
                boolean z6 = false;
                int i49 = 0;
                int i50 = 0;
                while (true) {
                    long[] jArr14 = zzakpVar2.zzh;
                    i18 = i12;
                    if (i49 >= jArr14.length) {
                        break;
                    }
                    int[] iArr12 = iArr3;
                    long j11 = jArr13[i49];
                    if (j11 != -1) {
                        i19 = i17;
                        int i51 = i48;
                        boolean z7 = z6;
                        long jZzt5 = zzgd.zzt(jArr14[i49], zzakpVar2.zzc, zzakpVar2.zzd, RoundingMode.FLOOR);
                        int i52 = 1;
                        iArr10[i49] = zzgd.zzc(jArrCopyOf2, j11, true, true);
                        iArr11[i49] = zzgd.zza(jArrCopyOf2, j11 + jZzt5, z5, false);
                        while (true) {
                            i21 = iArr10[i49];
                            i22 = iArr11[i49];
                            if (i21 >= i22 || (iArr2[i21] & i52) != 0) {
                                break;
                            }
                            iArr10[i49] = i21 + 1;
                            i52 = 1;
                        }
                        i20 = i51 + (i22 - i21);
                        z4 = z7 | (i50 != i21);
                        i50 = i22;
                    } else {
                        z4 = z6;
                        i19 = i17;
                        i20 = i48;
                    }
                    i49++;
                    i12 = i18;
                    i48 = i20;
                    iArr3 = iArr12;
                    i17 = i19;
                    z6 = z4;
                }
                int[] iArr13 = iArr3;
                boolean z8 = z6;
                int i53 = i48;
                int i54 = 0;
                boolean z9 = z8 | (i53 != i17);
                long[] jArr15 = z9 ? new long[i53] : jArr2;
                int[] iArr14 = z9 ? new int[i53] : iArr13;
                int i55 = true == z9 ? 0 : i18;
                int[] iArr15 = z9 ? new int[i53] : iArr2;
                long[] jArr16 = new long[i53];
                int i56 = i55;
                int i57 = 0;
                long j12 = 0;
                while (i54 < zzakpVar2.zzh.length) {
                    long j13 = zzakpVar2.zzi[i54];
                    int i58 = iArr10[i54];
                    int[] iArr16 = iArr10;
                    int i59 = iArr11[i54];
                    int[] iArr17 = iArr11;
                    if (z9) {
                        int i60 = i59 - i58;
                        System.arraycopy(jArr2, i58, jArr15, i57, i60);
                        jArr4 = jArr2;
                        iArr4 = iArr13;
                        System.arraycopy(iArr4, i58, iArr14, i57, i60);
                        System.arraycopy(iArr2, i58, iArr15, i57, i60);
                    } else {
                        jArr4 = jArr2;
                        iArr4 = iArr13;
                    }
                    int i61 = i56;
                    while (i58 < i59) {
                        int i62 = i59;
                        int i63 = i54;
                        long jZzt6 = zzgd.zzt(j12, 1000000L, zzakpVar2.zzd, RoundingMode.FLOOR);
                        long[] jArr17 = jArrCopyOf2;
                        int[] iArr18 = iArr2;
                        long jZzt7 = zzgd.zzt(jArrCopyOf2[i58] - j13, 1000000L, zzakpVar2.zzc, RoundingMode.FLOOR);
                        int[] iArr19 = iArr15;
                        long[] jArr18 = jArr15;
                        if (zzakpVar2.zzb != 1) {
                            iArr5 = iArr14;
                            jZzt7 = Math.max(0L, jZzt7);
                        } else {
                            iArr5 = iArr14;
                        }
                        jArr16[i57] = jZzt6 + jZzt7;
                        if (z9 && iArr5[i57] > i61) {
                            i61 = iArr4[i58];
                        }
                        i57++;
                        i58++;
                        i59 = i62;
                        iArr14 = iArr5;
                        i54 = i63;
                        jArrCopyOf2 = jArr17;
                        iArr2 = iArr18;
                        iArr15 = iArr19;
                        jArr15 = jArr18;
                    }
                    int i64 = i54;
                    j12 += zzakpVar2.zzh[i64];
                    i54 = i64 + 1;
                    i56 = i61;
                    iArr13 = iArr4;
                    iArr14 = iArr14;
                    iArr10 = iArr16;
                    jArrCopyOf2 = jArrCopyOf2;
                    iArr11 = iArr17;
                    jArr2 = jArr4;
                    iArr15 = iArr15;
                    jArr15 = jArr15;
                }
                return new zzaks(zzakpVar, jArr15, iArr14, i56, jArr16, iArr15, zzgd.zzt(j12, 1000000L, zzakpVar2.zzd, RoundingMode.FLOOR));
            }
            zzfuVar = null;
        } else {
            iZzp2 = 0;
        }
        iZzp3 = -1;
        iZza = zzajuVar.zza();
        String str2 = zzakpVar.zzf.zzn;
        if (iZza != -1) {
            jArrCopyOf = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArrCopyOf2 = new long[iZzb];
            int[] iArrCopyOf222 = new int[iZzb];
            int i2322 = iZzp4;
            i = 0;
            i2 = 0;
            int iZzp722 = 0;
            iZzg = 0;
            int i2422 = 0;
            j = 0;
            long j322 = 0;
            while (true) {
                if (i >= iZzb) {
                }
                int[] iArr622 = iArrCopyOf;
                j += iArrCopyOf[i];
                int i2922 = i16 - 1;
                i++;
                iZzg = i26;
                jArrCopyOf2 = jArr5;
                jArrCopyOf = jArrCopyOf;
                iZzb = i14;
                iZzp5 = iZzp8;
                iZzp3 = i28;
                i2 = i2922;
                iArrCopyOf = iArr622;
            }
            long j522 = j322 + i5;
            if (zzfuVar2 != null) {
            }
        }
        long jZzt8 = zzgd.zzt(j2, 1000000L, zzakpVar2.zzc, RoundingMode.FLOOR);
        jArr3 = zzakpVar2.zzh;
        if (jArr3 != null) {
        }
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzm(zzfu zzfuVar, int i, int i2, int i3, int i4, String str, boolean z, zzae zzaeVar, zzajs zzajsVar, int i5) throws zzch {
        int iZzq;
        int iZzn;
        int iZzg;
        int iZzp;
        int i6;
        zzae zzaeVarZzb;
        String str2;
        int i7;
        int i8;
        String str3;
        int i9;
        int i10;
        int i11;
        String str4;
        int i12;
        String str5;
        boolean z2;
        boolean z3;
        zzfu zzfuVar2 = zzfuVar;
        int i13 = i2;
        int i14 = i3;
        zzfuVar2.zzK(i13 + 16);
        if (z) {
            iZzq = zzfuVar.zzq();
            zzfuVar2.zzL(6);
        } else {
            zzfuVar2.zzL(8);
            iZzq = 0;
        }
        if (iZzq == 0 || iZzq == 1) {
            int iZzq2 = zzfuVar.zzq();
            zzfuVar2.zzL(6);
            iZzn = zzfuVar.zzn();
            zzfuVar2.zzK(zzfuVar.zzd() - 4);
            iZzg = zzfuVar.zzg();
            if (iZzq == 1) {
                zzfuVar2.zzL(16);
            }
            iZzp = iZzq2;
            i6 = -1;
        } else {
            if (iZzq != 2) {
                return;
            }
            zzfuVar2.zzL(16);
            iZzn = (int) Math.round(Double.longBitsToDouble(zzfuVar.zzt()));
            iZzp = zzfuVar.zzp();
            zzfuVar2.zzL(4);
            int iZzp2 = zzfuVar.zzp();
            int iZzp3 = zzfuVar.zzp();
            int i15 = iZzp3 & 1;
            int i16 = iZzp3 & 2;
            if (i15 == 0) {
                if (iZzp2 == 8) {
                    i6 = 3;
                } else if (iZzp2 == 16) {
                    i6 = i16 != 0 ? 268435456 : 2;
                } else if (iZzp2 == 24) {
                    i6 = i16 != 0 ? 1342177280 : 21;
                } else if (iZzp2 == 32) {
                    i6 = i16 != 0 ? 1610612736 : 22;
                } else {
                    i6 = -1;
                }
                zzfuVar2.zzL(8);
                iZzg = 0;
            } else {
                if (iZzp2 == 32) {
                    i6 = 4;
                }
                zzfuVar2.zzL(8);
                iZzg = 0;
            }
        }
        int iZzd = zzfuVar.zzd();
        int iIntValue = 1701733217;
        int i17 = i;
        if (i17 == 1701733217) {
            Pair pairZzh = zzh(zzfuVar2, i13, i14);
            if (pairZzh != null) {
                iIntValue = ((Integer) pairZzh.first).intValue();
                zzaeVarZzb = zzaeVar == null ? null : zzaeVar.zzb(((zzakq) pairZzh.second).zzb);
                zzajsVar.zza[i5] = (zzakq) pairZzh.second;
            } else {
                zzaeVarZzb = zzaeVar;
            }
            zzfuVar2.zzK(iZzd);
            i17 = iIntValue;
        } else {
            zzaeVarZzb = zzaeVar;
        }
        String str6 = "audio/mhm1";
        if (i17 == 1633889587) {
            str2 = "audio/ac3";
        } else {
            if (i17 != 1700998451) {
                if (i17 == 1633889588) {
                    i7 = i6;
                    str2 = "audio/ac4";
                } else if (i17 == 1685353315) {
                    str2 = "audio/vnd.dts";
                } else if (i17 == 1685353320 || i17 == 1685353324) {
                    str2 = "audio/vnd.dts.hd";
                } else if (i17 == 1685353317) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                } else if (i17 == 1685353336) {
                    str2 = "audio/vnd.dts.uhd;profile=p2";
                } else if (i17 == 1935764850) {
                    str2 = "audio/3gpp";
                } else if (i17 == 1935767394) {
                    str2 = "audio/amr-wb";
                } else if (i17 != 1936684916) {
                    if (i17 == 1953984371) {
                        str2 = "audio/raw";
                        i7 = 268435456;
                    } else if (i17 == 1819304813) {
                        if (i6 == -1) {
                            str2 = "audio/raw";
                            i7 = 2;
                        } else {
                            i7 = i6;
                            str2 = "audio/raw";
                        }
                    } else if (i17 == 778924082 || i17 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i17 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i17 == 1835560241) {
                        i7 = i6;
                        str2 = "audio/mhm1";
                    } else if (i17 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i17 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i17 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i17 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i17 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i17 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else {
                        i7 = i6;
                        str2 = null;
                    }
                }
                int i18 = i7;
                String str7 = null;
                List listZzn = null;
                zzajq zzajqVarZzj = null;
                while (iZzd - i13 < i14) {
                    zzfuVar2.zzK(iZzd);
                    int iZzg2 = zzfuVar.zzg();
                    String str8 = "childAtomSize must be positive";
                    zzady.zzb(iZzg2 > 0, "childAtomSize must be positive");
                    int iZzg3 = zzfuVar.zzg();
                    int i19 = iZzn;
                    if (iZzg3 == 1835557187) {
                        zzfuVar2.zzK(iZzd + 8);
                        zzfuVar2.zzL(1);
                        int iZzm = zzfuVar.zzm();
                        zzfuVar2.zzL(1);
                        String str9 = Objects.equals(str2, str6) ? String.format("mhm1.%02X", Integer.valueOf(iZzm)) : String.format("mha1.%02X", Integer.valueOf(iZzm));
                        int iZzq3 = zzfuVar.zzq();
                        byte[] bArr = new byte[iZzq3];
                        str7 = str9;
                        zzfuVar2.zzG(bArr, 0, iZzq3);
                        if (listZzn == null) {
                            listZzn = zzgbc.zzn(bArr);
                            str4 = str7;
                            iZzn = i19;
                            i11 = iZzg;
                            str3 = str6;
                            iZzd += iZzg2;
                            i13 = i2;
                            i14 = i3;
                            str7 = str4;
                            iZzg = i11;
                            str6 = str3;
                            zzfuVar2 = zzfuVar;
                        } else {
                            listZzn = zzgbc.zzo(bArr, (byte[]) listZzn.get(0));
                            str4 = str7;
                            iZzn = i19;
                            i11 = iZzg;
                            str3 = str6;
                        }
                    } else {
                        if (iZzg3 == 1835557200) {
                            zzfuVar2.zzK(iZzd + 8);
                            int iZzm2 = zzfuVar.zzm();
                            if (iZzm2 > 0) {
                                byte[] bArr2 = new byte[iZzm2];
                                zzfuVar2.zzG(bArr2, 0, iZzm2);
                                if (listZzn == null) {
                                    listZzn = zzgbc.zzn(bArr2);
                                    str4 = str7;
                                    i11 = iZzg;
                                    str3 = str6;
                                    iZzn = i19;
                                    iZzd += iZzg2;
                                    i13 = i2;
                                    i14 = i3;
                                    str7 = str4;
                                    iZzg = i11;
                                    str6 = str3;
                                    zzfuVar2 = zzfuVar;
                                } else {
                                    listZzn = zzgbc.zzo((byte[]) listZzn.get(0), bArr2);
                                    str4 = str7;
                                    iZzn = i19;
                                    i11 = iZzg;
                                    str3 = str6;
                                }
                            } else {
                                i8 = i19;
                                i11 = iZzg;
                                str3 = str6;
                            }
                        } else {
                            if (iZzg3 == 1702061171) {
                                i8 = i19;
                                str3 = str6;
                                i9 = iZzd;
                                i10 = -1;
                            } else if (z && iZzg3 == 2002876005) {
                                int iZzd2 = zzfuVar.zzd();
                                if (iZzd2 >= iZzd) {
                                    i12 = iZzd2;
                                    str5 = null;
                                    z2 = true;
                                } else {
                                    i12 = iZzd2;
                                    str5 = null;
                                    z2 = false;
                                }
                                zzady.zzb(z2, str5);
                                i9 = i12;
                                while (true) {
                                    if (i9 - iZzd >= iZzg2) {
                                        str3 = str6;
                                        i8 = i19;
                                        i9 = -1;
                                        break;
                                    }
                                    zzfuVar2.zzK(i9);
                                    int iZzg4 = zzfuVar.zzg();
                                    if (iZzg4 > 0) {
                                        str3 = str6;
                                        z3 = true;
                                    } else {
                                        str3 = str6;
                                        z3 = false;
                                    }
                                    zzady.zzb(z3, str8);
                                    String str10 = str8;
                                    if (zzfuVar.zzg() == 1702061171) {
                                        i8 = i19;
                                        break;
                                    } else {
                                        i9 += iZzg4;
                                        str6 = str3;
                                        str8 = str10;
                                    }
                                }
                                i10 = -1;
                            } else {
                                str3 = str6;
                                if (iZzg3 == 1684103987) {
                                    zzfuVar2.zzK(iZzd + 8);
                                    zzajsVar.zzb = zzact.zzc(zzfuVar2, Integer.toString(i4), str, zzaeVarZzb);
                                } else if (iZzg3 == 1684366131) {
                                    zzfuVar2.zzK(iZzd + 8);
                                    zzajsVar.zzb = zzact.zzd(zzfuVar2, Integer.toString(i4), str, zzaeVarZzb);
                                } else if (iZzg3 == 1684103988) {
                                    zzfuVar2.zzK(iZzd + 8);
                                    String string = Integer.toString(i4);
                                    int i20 = zzacw.zza;
                                    zzfuVar2.zzL(1);
                                    int iZzm3 = zzfuVar.zzm() & 32;
                                    zzal zzalVar = new zzal();
                                    zzalVar.zzK(string);
                                    zzalVar.zzX("audio/ac4");
                                    zzalVar.zzy(2);
                                    zzalVar.zzY(1 != (iZzm3 >> 5) ? 44100 : 48000);
                                    zzalVar.zzE(zzaeVarZzb);
                                    zzalVar.zzO(str);
                                    zzajsVar.zzb = zzalVar.zzad();
                                } else if (iZzg3 != 1684892784) {
                                    if (iZzg3 == 1684305011 || iZzg3 == 1969517683) {
                                        zzal zzalVar2 = new zzal();
                                        zzalVar2.zzJ(i4);
                                        zzalVar2.zzX(str2);
                                        zzalVar2.zzy(iZzp);
                                        i8 = i19;
                                        zzalVar2.zzY(i8);
                                        zzalVar2.zzE(zzaeVarZzb);
                                        zzalVar2.zzO(str);
                                        zzajsVar.zzb = zzalVar2.zzad();
                                    } else if (iZzg3 == 1682927731) {
                                        int i21 = iZzg2 - 8;
                                        byte[] bArr3 = zza;
                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i21);
                                        zzfuVar2.zzK(iZzd + 8);
                                        zzfuVar2.zzG(bArrCopyOf, bArr3.length, i21);
                                        listZzn = zzaep.zze(bArrCopyOf);
                                        str4 = str7;
                                        iZzn = i19;
                                        i11 = iZzg;
                                    } else {
                                        if (iZzg3 == 1684425825) {
                                            byte[] bArr4 = new byte[iZzg2 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            zzfuVar2.zzK(iZzd + 12);
                                            zzfuVar2.zzG(bArr4, 4, iZzg2 - 12);
                                            listZzn = zzgbc.zzn(bArr4);
                                            str4 = str7;
                                            iZzn = i19;
                                        } else if (iZzg3 == 1634492771) {
                                            int i22 = iZzg2 - 12;
                                            byte[] bArr5 = new byte[i22];
                                            zzfuVar2.zzK(iZzd + 12);
                                            zzfuVar2.zzG(bArr5, 0, i22);
                                            int i23 = zzes.zza;
                                            zzfu zzfuVar3 = new zzfu(bArr5);
                                            zzfuVar3.zzK(9);
                                            int iZzm4 = zzfuVar3.zzm();
                                            zzfuVar3.zzK(20);
                                            Pair pairCreate = Pair.create(Integer.valueOf(zzfuVar3.zzp()), Integer.valueOf(iZzm4));
                                            int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                            int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                            listZzn = zzgbc.zzn(bArr5);
                                            str4 = str7;
                                            iZzp = iIntValue3;
                                            iZzn = iIntValue2;
                                        } else {
                                            i8 = i19;
                                        }
                                        i11 = iZzg;
                                        iZzd += iZzg2;
                                        i13 = i2;
                                        i14 = i3;
                                        str7 = str4;
                                        iZzg = i11;
                                        str6 = str3;
                                        zzfuVar2 = zzfuVar;
                                    }
                                    i11 = iZzg;
                                } else {
                                    if (iZzg <= 0) {
                                        throw zzch.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzg, null);
                                    }
                                    str4 = str7;
                                    iZzn = iZzg;
                                    i11 = iZzn;
                                    iZzp = 2;
                                }
                                i8 = i19;
                                i11 = iZzg;
                            }
                            if (i9 != i10) {
                                zzajqVarZzj = zzj(zzfuVar2, i9);
                                String str11 = zzajqVarZzj.zza;
                                byte[] bArr6 = zzajqVarZzj.zzb;
                                if (bArr6 == null) {
                                    i11 = iZzg;
                                } else if ("audio/vorbis".equals(str11)) {
                                    zzfu zzfuVar4 = new zzfu(bArr6);
                                    zzfuVar4.zzL(1);
                                    int i24 = 0;
                                    while (zzfuVar4.zzb() > 0 && zzfuVar4.zzf() == 255) {
                                        zzfuVar4.zzL(1);
                                        i24 += 255;
                                    }
                                    int iZzm5 = i24 + zzfuVar4.zzm();
                                    int i25 = 0;
                                    while (true) {
                                        if (zzfuVar4.zzb() <= 0) {
                                            i11 = iZzg;
                                            break;
                                        }
                                        i11 = iZzg;
                                        if (zzfuVar4.zzf() != 255) {
                                            break;
                                        }
                                        zzfuVar4.zzL(1);
                                        i25 += 255;
                                        iZzg = i11;
                                    }
                                    int iZzm6 = i25 + zzfuVar4.zzm();
                                    byte[] bArr7 = new byte[iZzm5];
                                    int iZzd3 = zzfuVar4.zzd();
                                    System.arraycopy(bArr6, iZzd3, bArr7, 0, iZzm5);
                                    int i26 = iZzd3 + iZzm5 + iZzm6;
                                    int length = bArr6.length - i26;
                                    byte[] bArr8 = new byte[length];
                                    System.arraycopy(bArr6, i26, bArr8, 0, length);
                                    listZzn = zzgbc.zzo(bArr7, bArr8);
                                } else {
                                    i11 = iZzg;
                                    if ("audio/mp4a-latm".equals(str11)) {
                                        zzacp zzacpVarZza = zzacq.zza(bArr6);
                                        iZzn = zzacpVarZza.zza;
                                        iZzp = zzacpVarZza.zzb;
                                        str4 = zzacpVarZza.zzc;
                                    } else {
                                        str4 = str7;
                                        iZzn = i8;
                                    }
                                    listZzn = zzgbc.zzn(bArr6);
                                    str2 = str11;
                                    iZzd += iZzg2;
                                    i13 = i2;
                                    i14 = i3;
                                    str7 = str4;
                                    iZzg = i11;
                                    str6 = str3;
                                    zzfuVar2 = zzfuVar;
                                }
                                str4 = str7;
                                str2 = str11;
                                iZzn = i8;
                                iZzd += iZzg2;
                                i13 = i2;
                                i14 = i3;
                                str7 = str4;
                                iZzg = i11;
                                str6 = str3;
                                zzfuVar2 = zzfuVar;
                            }
                            i11 = iZzg;
                        }
                        str4 = str7;
                        iZzn = i8;
                        iZzd += iZzg2;
                        i13 = i2;
                        i14 = i3;
                        str7 = str4;
                        iZzg = i11;
                        str6 = str3;
                        zzfuVar2 = zzfuVar;
                    }
                    iZzd += iZzg2;
                    i13 = i2;
                    i14 = i3;
                    str7 = str4;
                    iZzg = i11;
                    str6 = str3;
                    zzfuVar2 = zzfuVar;
                }
                int i27 = iZzn;
                if (zzajsVar.zzb == null || str2 == null) {
                }
                zzal zzalVar3 = new zzal();
                zzalVar3.zzJ(i4);
                zzalVar3.zzX(str2);
                zzalVar3.zzz(str7);
                zzalVar3.zzy(iZzp);
                zzalVar3.zzY(i27);
                zzalVar3.zzR(i18);
                zzalVar3.zzL(listZzn);
                zzalVar3.zzE(zzaeVarZzb);
                zzalVar3.zzO(str);
                if (zzajqVarZzj != null) {
                    zzalVar3.zzx(zzgea.zze(zzajqVarZzj.zzc));
                    zzalVar3.zzS(zzgea.zze(zzajqVarZzj.zzd));
                }
                zzajsVar.zzb = zzalVar3.zzad();
                return;
            }
            str2 = "audio/eac3";
        }
        i7 = i6;
        int i182 = i7;
        String str72 = null;
        List listZzn2 = null;
        zzajq zzajqVarZzj2 = null;
        while (iZzd - i13 < i14) {
        }
        int i272 = iZzn;
        if (zzajsVar.zzb == null) {
        }
    }
}
