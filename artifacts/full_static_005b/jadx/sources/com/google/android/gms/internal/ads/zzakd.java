package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzakd implements zzadu {

    @Deprecated
    public static final zzaea zza = new zzaea() { // from class: com.google.android.gms.internal.ads.zzajz
        @Override // com.google.android.gms.internal.ads.zzaea
        public final /* synthetic */ zzadu[] zza(Uri uri, Map map) {
            zzaea zzaeaVar = zzakd.zza;
            return new zzadu[]{new zzakd(zzalt.zza, 32)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzan zzc;
    private zzakc zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private zzadx zzF;
    private zzafa[] zzG;
    private zzafa[] zzH;
    private boolean zzI;
    private final zzalt zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzfu zzg;
    private final zzfu zzh;
    private final zzfu zzi;
    private final byte[] zzj;
    private final zzfu zzk;
    private final zzagu zzl;
    private final zzfu zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private zzgbc zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private zzfu zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzal zzalVar = new zzal();
        zzalVar.zzX("application/x-emsg");
        zzc = zzalVar.zzad();
    }

    @Deprecated
    public zzakd() {
        this(zzalt.zza, 32, null, null, zzgbc.zzm(), null);
    }

    private static int zza(int i) throws zzch {
        if (i >= 0) {
            return i;
        }
        throw zzch.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzae zzg(List list) {
        int i;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzakl zzaklVar;
        UUID uuid;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            zzajn zzajnVar = (zzajn) list.get(i2);
            if (zzajnVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArrZzM = zzajnVar.zza.zzM();
                zzfu zzfuVar = new zzfu(bArrZzM);
                if (zzfuVar.zze() < 32) {
                    i = i2;
                    arrayList = arrayList2;
                    zzaklVar = null;
                    uuid = zzaklVar != null ? null : zzaklVar.zza;
                    if (uuid != null) {
                        zzfk.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                        arrayList2 = arrayList;
                    } else {
                        arrayList2 = arrayList;
                        arrayList2.add(new zzad(uuid, null, "video/mp4", bArrZzM));
                    }
                } else {
                    zzfuVar.zzK(0);
                    int iZzb = zzfuVar.zzb();
                    int iZzg = zzfuVar.zzg();
                    if (iZzg != iZzb) {
                        zzfk.zzf("PsshAtomUtil", "Advertised atom size (" + iZzg + ") does not match buffer size: " + iZzb);
                    } else {
                        int iZzg2 = zzfuVar.zzg();
                        if (iZzg2 != 1886614376) {
                            zzfk.zzf("PsshAtomUtil", "Atom type is not pssh: " + iZzg2);
                        } else {
                            int iZze = zzajo.zze(zzfuVar.zzg());
                            if (iZze > 1) {
                                zzfk.zzf("PsshAtomUtil", "Unsupported pssh version: " + iZze);
                            } else {
                                UUID uuid2 = new UUID(zzfuVar.zzt(), zzfuVar.zzt());
                                if (iZze == 1) {
                                    int iZzp = zzfuVar.zzp();
                                    uuidArr = new UUID[iZzp];
                                    int i3 = 0;
                                    while (i3 < iZzp) {
                                        uuidArr[i3] = new UUID(zzfuVar.zzt(), zzfuVar.zzt());
                                        i3++;
                                        i2 = i2;
                                        arrayList2 = arrayList2;
                                    }
                                    i = i2;
                                    arrayList = arrayList2;
                                } else {
                                    i = i2;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int iZzp2 = zzfuVar.zzp();
                                int iZzb2 = zzfuVar.zzb();
                                if (iZzp2 != iZzb2) {
                                    zzfk.zzf("PsshAtomUtil", "Atom data size (" + iZzp2 + ") does not match the bytes left: " + iZzb2);
                                    zzaklVar = null;
                                    if (zzaklVar != null) {
                                    }
                                    if (uuid != null) {
                                    }
                                } else {
                                    byte[] bArr = new byte[iZzp2];
                                    zzfuVar.zzG(bArr, 0, iZzp2);
                                    zzaklVar = new zzakl(uuid2, iZze, bArr, uuidArr);
                                    if (zzaklVar != null) {
                                    }
                                    if (uuid != null) {
                                    }
                                }
                            }
                        }
                    }
                    i = i2;
                    arrayList = arrayList2;
                    zzaklVar = null;
                    if (zzaklVar != null) {
                    }
                    if (uuid != null) {
                    }
                }
                i2 = i + 1;
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzae(arrayList2);
    }

    private final void zzh() {
        this.zzq = 0;
        this.zzt = 0;
    }

    private static void zzi(zzfu zzfuVar, int i, zzakr zzakrVar) throws zzch {
        zzfuVar.zzK(i + 8);
        int iZzg = zzfuVar.zzg();
        if ((iZzg & 1) != 0) {
            throw zzch.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzg & 2) != 0;
        int iZzp = zzfuVar.zzp();
        if (iZzp == 0) {
            Arrays.fill(zzakrVar.zzl, 0, zzakrVar.zze, false);
            return;
        }
        int i2 = zzakrVar.zze;
        if (iZzp != i2) {
            throw zzch.zza("Senc sample count " + iZzp + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzakrVar.zzl, 0, iZzp, z);
        zzakrVar.zza(zzfuVar.zzb());
        zzfu zzfuVar2 = zzakrVar.zzn;
        zzfuVar.zzG(zzfuVar2.zzM(), 0, zzfuVar2.zze());
        zzakrVar.zzn.zzK(0);
        zzakrVar.zzo = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0623  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(long j) throws zzch {
        zzakd zzakdVar;
        SparseArray sparseArray;
        zzajm zzajmVar;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        zzajm zzajmVar2;
        byte[] bArr4;
        zzakr zzakrVar;
        List list;
        int i7;
        int i8;
        zzajm zzajmVar3;
        int i9;
        int i10;
        boolean z2;
        long j2;
        int i11;
        int i12;
        int iZzg;
        int i13;
        int iZzg2;
        int i14;
        int iZzg3;
        boolean z3;
        zzajy zzajyVar;
        int iZzg4;
        long[] jArr;
        final zzakd zzakdVar2 = this;
        while (!zzakdVar2.zzn.isEmpty() && ((zzajm) zzakdVar2.zzn.peek()).zza == j) {
            zzajm zzajmVar4 = (zzajm) zzakdVar2.zzn.pop();
            int i15 = zzajmVar4.zzd;
            int i16 = 12;
            int i17 = 8;
            if (i15 == 1836019574) {
                zzae zzaeVarZzg = zzg(zzajmVar4.zzb);
                zzajm zzajmVarZza = zzajmVar4.zza(1836475768);
                zzajmVarZza.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zzajmVarZza.zzb.size();
                long jZzu = -9223372036854775807L;
                int i18 = 0;
                while (i18 < size) {
                    zzajn zzajnVar = (zzajn) zzajmVarZza.zzb.get(i18);
                    int i19 = zzajnVar.zzd;
                    if (i19 == 1953654136) {
                        zzfu zzfuVar = zzajnVar.zza;
                        zzfuVar.zzK(i16);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzfuVar.zzg()), new zzajy(zzfuVar.zzg() - 1, zzfuVar.zzg(), zzfuVar.zzg(), zzfuVar.zzg()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (zzajy) pairCreate.second);
                    } else if (i19 == 1835362404) {
                        zzfu zzfuVar2 = zzajnVar.zza;
                        zzfuVar2.zzK(8);
                        jZzu = zzajo.zze(zzfuVar2.zzg()) == 0 ? zzfuVar2.zzu() : zzfuVar2.zzv();
                    }
                    i18++;
                    i16 = 12;
                }
                List listZzd = zzajw.zzd(zzajmVar4, new zzaej(), jZzu, zzaeVarZzg, false, false, new zzfxu() { // from class: com.google.android.gms.internal.ads.zzaka
                    @Override // com.google.android.gms.internal.ads.zzfxu
                    public final Object apply(Object obj) {
                        return (zzakp) obj;
                    }
                });
                int size2 = listZzd.size();
                if (zzakdVar2.zzf.size() == 0) {
                    for (int i20 = 0; i20 < size2; i20++) {
                        zzaks zzaksVar = (zzaks) listZzd.get(i20);
                        zzakp zzakpVar = zzaksVar.zza;
                        zzakdVar2.zzf.put(zzakpVar.zza, new zzakc(zzakdVar2.zzF.zzw(i20, zzakpVar.zzb), zzaksVar, zzk(sparseArray2, zzakpVar.zza)));
                        zzakdVar2.zzy = Math.max(zzakdVar2.zzy, zzakpVar.zze);
                    }
                    zzakdVar2.zzF.zzD();
                } else {
                    zzeq.zzf(zzakdVar2.zzf.size() == size2);
                    for (int i21 = 0; i21 < size2; i21++) {
                        zzaks zzaksVar2 = (zzaks) listZzd.get(i21);
                        zzakp zzakpVar2 = zzaksVar2.zza;
                        ((zzakc) zzakdVar2.zzf.get(zzakpVar2.zza)).zzh(zzaksVar2, zzk(sparseArray2, zzakpVar2.zza));
                    }
                }
            } else {
                if (i15 == 1836019558) {
                    SparseArray sparseArray3 = zzakdVar2.zzf;
                    byte[] bArr5 = zzakdVar2.zzj;
                    int size3 = zzajmVar4.zzc.size();
                    int i22 = 0;
                    while (i22 < size3) {
                        zzajm zzajmVar5 = (zzajm) zzajmVar4.zzc.get(i22);
                        if (zzajmVar5.zzd == 1953653094) {
                            zzajn zzajnVarZzb = zzajmVar5.zzb(1952868452);
                            zzajnVarZzb.getClass();
                            zzfu zzfuVar3 = zzajnVarZzb.zza;
                            zzfuVar3.zzK(i17);
                            int iZzg5 = zzfuVar3.zzg();
                            zzakc zzakcVar = (zzakc) sparseArray3.get(zzfuVar3.zzg());
                            if (zzakcVar == null) {
                                zzakcVar = null;
                            } else {
                                if ((iZzg5 & 1) != 0) {
                                    long jZzv = zzfuVar3.zzv();
                                    zzakr zzakrVar2 = zzakcVar.zzb;
                                    zzakrVar2.zzb = jZzv;
                                    zzakrVar2.zzc = jZzv;
                                }
                                zzajy zzajyVar2 = zzakcVar.zze;
                                zzakcVar.zzb.zza = new zzajy((iZzg5 & 2) != 0 ? zzfuVar3.zzg() - 1 : zzajyVar2.zza, (iZzg5 & 8) != 0 ? zzfuVar3.zzg() : zzajyVar2.zzb, (iZzg5 & 16) != 0 ? zzfuVar3.zzg() : zzajyVar2.zzc, (iZzg5 & 32) != 0 ? zzfuVar3.zzg() : zzajyVar2.zzd);
                            }
                            if (zzakcVar == null) {
                                sparseArray = sparseArray3;
                                zzajmVar = zzajmVar4;
                                i = size3;
                                i2 = i17;
                                i3 = i22;
                                bArr = bArr5;
                            } else {
                                zzakr zzakrVar3 = zzakcVar.zzb;
                                long j3 = zzakrVar3.zzp;
                                boolean z4 = zzakrVar3.zzq;
                                zzakcVar.zzi();
                                zzakcVar.zzl = true;
                                zzajn zzajnVarZzb2 = zzajmVar5.zzb(1952867444);
                                if (zzajnVarZzb2 != null) {
                                    zzfu zzfuVar4 = zzajnVarZzb2.zza;
                                    zzfuVar4.zzK(i17);
                                    zzakrVar3.zzp = zzajo.zze(zzfuVar4.zzg()) == 1 ? zzfuVar4.zzv() : zzfuVar4.zzu();
                                    zzakrVar3.zzq = true;
                                } else {
                                    zzakrVar3.zzp = j3;
                                    zzakrVar3.zzq = z4;
                                }
                                List list2 = zzajmVar5.zzb;
                                int size4 = list2.size();
                                int i23 = 0;
                                int i24 = 0;
                                int i25 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i23 >= size4) {
                                        break;
                                    }
                                    zzajn zzajnVar2 = (zzajn) list2.get(i23);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzajnVar2.zzd == 1953658222) {
                                        zzfu zzfuVar5 = zzajnVar2.zza;
                                        zzfuVar5.zzK(12);
                                        int iZzp = zzfuVar5.zzp();
                                        if (iZzp > 0) {
                                            i25 += iZzp;
                                            i24++;
                                        }
                                    }
                                    i23++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzakcVar.zzh = 0;
                                zzakcVar.zzg = 0;
                                zzakcVar.zzf = 0;
                                zzakr zzakrVar4 = zzakcVar.zzb;
                                zzakrVar4.zzd = i24;
                                zzakrVar4.zze = i25;
                                if (zzakrVar4.zzg.length < i24) {
                                    zzakrVar4.zzf = new long[i24];
                                    zzakrVar4.zzg = new int[i24];
                                }
                                if (zzakrVar4.zzh.length < i25) {
                                    int i26 = (i25 * 125) / 100;
                                    zzakrVar4.zzh = new int[i26];
                                    zzakrVar4.zzi = new long[i26];
                                    zzakrVar4.zzj = new boolean[i26];
                                    zzakrVar4.zzl = new boolean[i26];
                                }
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (i27 < size4) {
                                    zzajn zzajnVar3 = (zzajn) list2.get(i27);
                                    if (zzajnVar3.zzd == i4) {
                                        int i30 = i28 + 1;
                                        zzfu zzfuVar6 = zzajnVar3.zza;
                                        zzfuVar6.zzK(8);
                                        int iZzg6 = zzfuVar6.zzg();
                                        list = list2;
                                        zzakp zzakpVar3 = zzakcVar.zzd.zza;
                                        i7 = size3;
                                        zzakr zzakrVar5 = zzakcVar.zzb;
                                        i9 = size4;
                                        zzajy zzajyVar3 = zzakrVar5.zza;
                                        int i31 = zzgd.zza;
                                        zzakrVar5.zzg[i28] = zzfuVar6.zzp();
                                        long[] jArr2 = zzakrVar5.zzf;
                                        zzajmVar2 = zzajmVar4;
                                        bArr4 = bArr5;
                                        long j4 = zzakrVar5.zzb;
                                        jArr2[i28] = j4;
                                        if ((iZzg6 & 1) != 0) {
                                            i6 = i27;
                                            jArr2[i28] = j4 + zzfuVar6.zzg();
                                        } else {
                                            i6 = i27;
                                        }
                                        boolean z5 = (iZzg6 & 4) != 0;
                                        int iZzg7 = zzajyVar3.zzd;
                                        if (z5) {
                                            iZzg7 = zzfuVar6.zzg();
                                        }
                                        int i32 = iZzg6 & 256;
                                        int i33 = iZzg6 & 512;
                                        int i34 = iZzg6 & 1024;
                                        int i35 = iZzg6 & 2048;
                                        int i36 = iZzg7;
                                        long[] jArr3 = zzakpVar3.zzh;
                                        if (jArr3 != null) {
                                            i8 = i22;
                                            zzajmVar3 = zzajmVar5;
                                            if (jArr3.length != 1 || (jArr = zzakpVar3.zzi) == null) {
                                                z2 = z5;
                                                i10 = i35;
                                            } else {
                                                long j5 = jArr3[0];
                                                if (j5 == 0) {
                                                    z2 = z5;
                                                    i10 = i35;
                                                } else {
                                                    long jZzt = zzgd.zzt(j5 + jArr[0], 1000000L, zzakpVar3.zzd, RoundingMode.FLOOR);
                                                    z2 = z5;
                                                    i10 = i35;
                                                    if (jZzt < zzakpVar3.zze) {
                                                    }
                                                    int[] iArr = zzakrVar5.zzh;
                                                    long[] jArr4 = zzakrVar5.zzi;
                                                    boolean[] zArr = zzakrVar5.zzj;
                                                    i11 = zzakrVar5.zzg[i28] + i29;
                                                    zzakr zzakrVar6 = zzakrVar3;
                                                    long j6 = zzakpVar3.zzc;
                                                    zzakrVar = zzakrVar6;
                                                    long j7 = zzakrVar5.zzp;
                                                    while (i29 < i11) {
                                                        if (i32 != 0) {
                                                            i12 = i32;
                                                            iZzg = zzfuVar6.zzg();
                                                        } else {
                                                            i12 = i32;
                                                            iZzg = zzajyVar3.zzb;
                                                        }
                                                        zza(iZzg);
                                                        if (i33 != 0) {
                                                            i13 = i33;
                                                            iZzg2 = zzfuVar6.zzg();
                                                        } else {
                                                            i13 = i33;
                                                            iZzg2 = zzajyVar3.zzc;
                                                        }
                                                        zza(iZzg2);
                                                        if (i34 != 0) {
                                                            i14 = i11;
                                                            iZzg3 = zzfuVar6.zzg();
                                                        } else {
                                                            i14 = i11;
                                                            if (i29 != 0) {
                                                                iZzg3 = zzajyVar3.zzd;
                                                            } else if (z2) {
                                                                iZzg3 = i36;
                                                                i29 = 0;
                                                            } else {
                                                                i29 = 0;
                                                                iZzg3 = zzajyVar3.zzd;
                                                            }
                                                        }
                                                        if (i10 != 0) {
                                                            z3 = z2;
                                                            zzajyVar = zzajyVar3;
                                                            iZzg4 = zzfuVar6.zzg();
                                                        } else {
                                                            z3 = z2;
                                                            zzajyVar = zzajyVar3;
                                                            iZzg4 = 0;
                                                        }
                                                        long jZzt2 = zzgd.zzt((iZzg4 + j7) - j2, 1000000L, j6, RoundingMode.FLOOR);
                                                        jArr4[i29] = jZzt2;
                                                        long j8 = j6;
                                                        if (!zzakrVar5.zzq) {
                                                            jArr4[i29] = jZzt2 + zzakcVar.zzd.zzh;
                                                        }
                                                        iArr[i29] = iZzg2;
                                                        zArr[i29] = 1 == (((iZzg3 >> 16) & 1) ^ 1);
                                                        j7 += iZzg;
                                                        i29++;
                                                        j6 = j8;
                                                        i32 = i12;
                                                        i33 = i13;
                                                        i11 = i14;
                                                        z2 = z3;
                                                        zzajyVar3 = zzajyVar;
                                                    }
                                                    int i37 = i11;
                                                    zzakrVar5.zzp = j7;
                                                    i28 = i30;
                                                    i29 = i37;
                                                }
                                                j2 = zzakpVar3.zzi[0];
                                                int[] iArr2 = zzakrVar5.zzh;
                                                long[] jArr42 = zzakrVar5.zzi;
                                                boolean[] zArr2 = zzakrVar5.zzj;
                                                i11 = zzakrVar5.zzg[i28] + i29;
                                                zzakr zzakrVar62 = zzakrVar3;
                                                long j62 = zzakpVar3.zzc;
                                                zzakrVar = zzakrVar62;
                                                long j72 = zzakrVar5.zzp;
                                                while (i29 < i11) {
                                                }
                                                int i372 = i11;
                                                zzakrVar5.zzp = j72;
                                                i28 = i30;
                                                i29 = i372;
                                            }
                                        } else {
                                            i8 = i22;
                                            i10 = i35;
                                            zzajmVar3 = zzajmVar5;
                                            z2 = z5;
                                        }
                                        j2 = 0;
                                        int[] iArr22 = zzakrVar5.zzh;
                                        long[] jArr422 = zzakrVar5.zzi;
                                        boolean[] zArr22 = zzakrVar5.zzj;
                                        i11 = zzakrVar5.zzg[i28] + i29;
                                        zzakr zzakrVar622 = zzakrVar3;
                                        long j622 = zzakpVar3.zzc;
                                        zzakrVar = zzakrVar622;
                                        long j722 = zzakrVar5.zzp;
                                        while (i29 < i11) {
                                        }
                                        int i3722 = i11;
                                        zzakrVar5.zzp = j722;
                                        i28 = i30;
                                        i29 = i3722;
                                    } else {
                                        i6 = i27;
                                        zzajmVar2 = zzajmVar4;
                                        bArr4 = bArr5;
                                        zzakrVar = zzakrVar3;
                                        list = list2;
                                        i7 = size3;
                                        i8 = i22;
                                        zzajmVar3 = zzajmVar5;
                                        i9 = size4;
                                    }
                                    i27 = i6 + 1;
                                    list2 = list;
                                    size3 = i7;
                                    size4 = i9;
                                    zzajmVar4 = zzajmVar2;
                                    bArr5 = bArr4;
                                    i22 = i8;
                                    zzajmVar5 = zzajmVar3;
                                    zzakrVar3 = zzakrVar;
                                    i4 = 1953658222;
                                }
                                zzajmVar = zzajmVar4;
                                byte[] bArr6 = bArr5;
                                zzakr zzakrVar7 = zzakrVar3;
                                i = size3;
                                i3 = i22;
                                zzajm zzajmVar6 = zzajmVar5;
                                zzakp zzakpVar4 = zzakcVar.zzd.zza;
                                zzajy zzajyVar4 = zzakrVar7.zza;
                                zzajyVar4.getClass();
                                zzakq zzakqVarZza = zzakpVar4.zza(zzajyVar4.zza);
                                zzajn zzajnVarZzb3 = zzajmVar6.zzb(1935763834);
                                if (zzajnVarZzb3 != null) {
                                    zzakqVarZza.getClass();
                                    zzfu zzfuVar7 = zzajnVarZzb3.zza;
                                    zzfuVar7.zzK(8);
                                    if ((zzfuVar7.zzg() & 1) == 1) {
                                        zzfuVar7.zzL(8);
                                    }
                                    int iZzm = zzfuVar7.zzm();
                                    int iZzp2 = zzfuVar7.zzp();
                                    int i38 = zzakrVar7.zze;
                                    if (iZzp2 > i38) {
                                        throw zzch.zza("Saiz sample count " + iZzp2 + " is greater than fragment sample count" + i38, null);
                                    }
                                    int i39 = zzakqVarZza.zzd;
                                    if (iZzm == 0) {
                                        boolean[] zArr3 = zzakrVar7.zzl;
                                        i5 = 0;
                                        for (int i40 = 0; i40 < iZzp2; i40++) {
                                            int iZzm2 = zzfuVar7.zzm();
                                            i5 += iZzm2;
                                            zArr3[i40] = iZzm2 > i39;
                                        }
                                        z = false;
                                    } else {
                                        boolean z6 = iZzm > i39;
                                        i5 = iZzm * iZzp2;
                                        z = false;
                                        Arrays.fill(zzakrVar7.zzl, 0, iZzp2, z6);
                                    }
                                    Arrays.fill(zzakrVar7.zzl, iZzp2, zzakrVar7.zze, z);
                                    if (i5 > 0) {
                                        zzakrVar7.zza(i5);
                                    }
                                }
                                zzajn zzajnVarZzb4 = zzajmVar6.zzb(1935763823);
                                if (zzajnVarZzb4 != null) {
                                    zzfu zzfuVar8 = zzajnVarZzb4.zza;
                                    zzfuVar8.zzK(8);
                                    int iZzg8 = zzfuVar8.zzg();
                                    if ((iZzg8 & 1) == 1) {
                                        zzfuVar8.zzL(8);
                                    }
                                    int iZzp3 = zzfuVar8.zzp();
                                    if (iZzp3 != 1) {
                                        throw zzch.zza("Unexpected saio entry count: " + iZzp3, null);
                                    }
                                    zzakrVar7.zzc += zzajo.zze(iZzg8) == 0 ? zzfuVar8.zzu() : zzfuVar8.zzv();
                                }
                                zzajn zzajnVarZzb5 = zzajmVar6.zzb(1936027235);
                                if (zzajnVarZzb5 != null) {
                                    zzi(zzajnVarZzb5.zza, 0, zzakrVar7);
                                }
                                String str = zzakqVarZza != null ? zzakqVarZza.zzb : null;
                                zzfu zzfuVar9 = null;
                                zzfu zzfuVar10 = null;
                                for (int i41 = 0; i41 < zzajmVar6.zzb.size(); i41++) {
                                    zzajn zzajnVar4 = (zzajn) zzajmVar6.zzb.get(i41);
                                    zzfu zzfuVar11 = zzajnVar4.zza;
                                    int i42 = zzajnVar4.zzd;
                                    if (i42 == 1935828848) {
                                        zzfuVar11.zzK(12);
                                        if (zzfuVar11.zzg() == 1936025959) {
                                            zzfuVar9 = zzfuVar11;
                                        }
                                    } else if (i42 == 1936158820) {
                                        zzfuVar11.zzK(12);
                                        if (zzfuVar11.zzg() == 1936025959) {
                                            zzfuVar10 = zzfuVar11;
                                        }
                                    }
                                }
                                if (zzfuVar9 != null && zzfuVar10 != null) {
                                    zzfuVar9.zzK(8);
                                    int iZze = zzajo.zze(zzfuVar9.zzg());
                                    zzfuVar9.zzL(4);
                                    if (iZze == 1) {
                                        zzfuVar9.zzL(4);
                                    }
                                    if (zzfuVar9.zzg() != 1) {
                                        throw zzch.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzfuVar10.zzK(8);
                                    int iZze2 = zzajo.zze(zzfuVar10.zzg());
                                    zzfuVar10.zzL(4);
                                    if (iZze2 == 1) {
                                        if (zzfuVar10.zzu() == 0) {
                                            throw zzch.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZze2 >= 2) {
                                        zzfuVar10.zzL(4);
                                    }
                                    if (zzfuVar10.zzu() != 1) {
                                        throw zzch.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzfuVar10.zzL(1);
                                    int iZzm3 = zzfuVar10.zzm();
                                    int i43 = (iZzm3 & 240) >> 4;
                                    int i44 = iZzm3 & 15;
                                    if (zzfuVar10.zzm() == 1) {
                                        int iZzm4 = zzfuVar10.zzm();
                                        byte[] bArr7 = new byte[16];
                                        zzfuVar10.zzG(bArr7, 0, 16);
                                        if (iZzm4 == 0) {
                                            int iZzm5 = zzfuVar10.zzm();
                                            byte[] bArr8 = new byte[iZzm5];
                                            zzfuVar10.zzG(bArr8, 0, iZzm5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzakrVar7.zzk = true;
                                        zzakrVar7.zzm = new zzakq(true, str, iZzm4, bArr7, i43, i44, bArr3);
                                    }
                                }
                                int size5 = zzajmVar6.zzb.size();
                                int i45 = 0;
                                while (i45 < size5) {
                                    zzajn zzajnVar5 = (zzajn) zzajmVar6.zzb.get(i45);
                                    if (zzajnVar5.zzd == 1970628964) {
                                        zzfu zzfuVar12 = zzajnVar5.zza;
                                        zzfuVar12.zzK(8);
                                        bArr2 = bArr6;
                                        zzfuVar12.zzG(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzi(zzfuVar12, 16, zzakrVar7);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i45++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i2 = 8;
                            }
                        }
                        i17 = i2;
                        bArr5 = bArr;
                        size3 = i;
                        zzajmVar4 = zzajmVar;
                        i22 = i3 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzae zzaeVarZzg2 = zzg(zzajmVar4.zzb);
                    zzakdVar = this;
                    if (zzaeVarZzg2 != null) {
                        int size6 = zzakdVar.zzf.size();
                        for (int i46 = 0; i46 < size6; i46++) {
                            zzakc zzakcVar2 = (zzakc) zzakdVar.zzf.valueAt(i46);
                            zzakp zzakpVar5 = zzakcVar2.zzd.zza;
                            zzajy zzajyVar5 = zzakcVar2.zzb.zza;
                            int i47 = zzgd.zza;
                            zzakq zzakqVarZza2 = zzakpVar5.zza(zzajyVar5.zza);
                            zzae zzaeVarZzb = zzaeVarZzg2.zzb(zzakqVarZza2 != null ? zzakqVarZza2.zzb : null);
                            zzal zzalVarZzb = zzakcVar2.zzd.zza.zzf.zzb();
                            zzalVarZzb.zzE(zzaeVarZzb);
                            zzakcVar2.zza.zzl(zzalVarZzb.zzad());
                        }
                    }
                    if (zzakdVar.zzx != -9223372036854775807L) {
                        int size7 = zzakdVar.zzf.size();
                        for (int i48 = 0; i48 < size7; i48++) {
                            zzakc zzakcVar3 = (zzakc) zzakdVar.zzf.valueAt(i48);
                            long j9 = zzakdVar.zzx;
                            int i49 = zzakcVar3.zzf;
                            while (true) {
                                zzakr zzakrVar8 = zzakcVar3.zzb;
                                if (i49 >= zzakrVar8.zze || zzakrVar8.zzi[i49] > j9) {
                                    break;
                                }
                                if (zzakrVar8.zzj[i49]) {
                                    zzakcVar3.zzi = i49;
                                }
                                i49++;
                            }
                        }
                        zzakdVar.zzx = -9223372036854775807L;
                    }
                } else {
                    zzakdVar = zzakdVar2;
                    if (!zzakdVar.zzn.isEmpty()) {
                        ((zzajm) zzakdVar.zzn.peek()).zzc(zzajmVar4);
                    }
                }
                zzakdVar2 = zzakdVar;
            }
        }
        zzh();
    }

    private static final zzajy zzk(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzajy) sparseArray.valueAt(0);
        }
        zzajy zzajyVar = (zzajy) sparseArray.get(i);
        zzajyVar.getClass();
        return zzajyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0245, code lost:
    
        r5.zzs(r10, r20, r33.zzB, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0258, code lost:
    
        if (r33.zzo.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025a, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakb) r33.zzo.removeFirst();
        r33.zzw -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026d, code lost:
    
        if (r1.zzb == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x026f, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0270, code lost:
    
        r5 = r33.zzG;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0274, code lost:
    
        if (r8 >= r6) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0276, code lost:
    
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzw, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0291, code lost:
    
        if (r2.zzk() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0293, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0295, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0296, code lost:
    
        r33.zzq = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0299, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r33.zzq != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzadi) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        r3.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r3.zzL(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        r33.zzB = r3 - 8;
        ((com.google.android.gms.internal.ads.zzadi) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzn) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
    
        r33.zzC = r2.zzc(r33.zzB, 7);
        com.google.android.gms.internal.ads.zzacw.zzb(r33.zzB, r33.zzk);
        r2.zza.zzq(r33.zzk, 7);
        r3 = r33.zzC + 7;
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        r3 = r2.zzc(r33.zzB, 0);
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        r33.zzB += r3;
        r33.zzq = 4;
        r33.zzD = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
    
        if (r6 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013f, code lost:
    
        r3 = r33.zzC;
        r4 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        if (r3 >= r4) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        r33.zzC += r5.zzf(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        r13 = r33.zzh.zzM();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0166, code lost:
    
        if (r33.zzC >= r33.zzB) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0168, code lost:
    
        r12 = r33.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016c, code lost:
    
        if (r12 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016e, code lost:
    
        ((com.google.android.gms.internal.ads.zzadi) r34).zzn(r13, r6, r14, r9);
        r33.zzh.zzK(r9);
        r12 = r33.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017f, code lost:
    
        if (r12 <= 0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        r33.zzD = r12 - 1;
        r33.zzg.zzK(r9);
        r5.zzq(r33.zzg, 4);
        r5.zzq(r33.zzh, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
    
        if (r33.zzH.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
    
        r12 = r3.zzf.zzn;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzgr.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a8, code lost:
    
        if ("video/avc".equals(r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ac, code lost:
    
        if ((r17 & com.google.common.base.Ascii.US) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bc, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bf, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
    
        r33.zzE = r9;
        r33.zzC += 5;
        r33.zzB += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d4, code lost:
    
        throw com.google.android.gms.internal.ads.zzch.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d7, code lost:
    
        if (r33.zzE == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
    
        r33.zzi.zzH(r12);
        ((com.google.android.gms.internal.ads.zzadi) r34).zzn(r33.zzi.zzM(), 0, r33.zzD, false);
        r5.zzq(r33.zzi, r33.zzD);
        r4 = r33.zzD;
        r8 = r33.zzi;
        r8 = com.google.android.gms.internal.ads.zzgr.zzb(r8.zzM(), r8.zze());
        r33.zzi.zzK("video/hevc".equals(r3.zzf.zzn) ? 1 : 0);
        r33.zzi.zzJ(r8);
        com.google.android.gms.internal.ads.zzadf.zza(r10, r33.zzi, r33.zzH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x021e, code lost:
    
        r4 = r5.zzf(r34, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0224, code lost:
    
        r33.zzC += r4;
        r33.zzD -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0230, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0234, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023c, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023e, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0243, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzadu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzadv zzadvVar, zzaeq zzaeqVar) throws IOException {
        long jZzt;
        long jZzt2;
        String str;
        String str2;
        long jZzu;
        long j;
        long jZzv;
        long jZzv2;
        while (true) {
            int i = this.zzq;
            int i2 = 1;
            ?? r9 = 0;
            if (i == 0) {
                if (this.zzt == 0) {
                    if (!zzadvVar.zzn(this.zzm.zzM(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzt = 8;
                    this.zzm.zzK(0);
                    this.zzs = this.zzm.zzu();
                    this.zzr = this.zzm.zzg();
                }
                long j2 = this.zzs;
                if (j2 == 1) {
                    ((zzadi) zzadvVar).zzn(this.zzm.zzM(), 8, 8, false);
                    this.zzt += 8;
                    this.zzs = this.zzm.zzv();
                } else if (j2 == 0) {
                    long jZzd = zzadvVar.zzd();
                    if (jZzd == -1) {
                        jZzd = !this.zzn.isEmpty() ? ((zzajm) this.zzn.peek()).zza : -1L;
                    }
                    if (jZzd != -1) {
                        this.zzs = (jZzd - zzadvVar.zzf()) + this.zzt;
                    }
                }
                long j3 = this.zzs;
                long j4 = this.zzt;
                if (j3 < j4) {
                    throw zzch.zzc("Atom size less than header length (unsupported).");
                }
                long jZzf = zzadvVar.zzf() - j4;
                int i3 = this.zzr;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzI) {
                    this.zzF.zzO(new zzaes(this.zzy, jZzf));
                    this.zzI = true;
                }
                if (this.zzr == 1836019558) {
                    int size = this.zzf.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzakr zzakrVar = ((zzakc) this.zzf.valueAt(i4)).zzb;
                        zzakrVar.zzc = jZzf;
                        zzakrVar.zzb = jZzf;
                    }
                }
                int i5 = this.zzr;
                if (i5 == 1835295092) {
                    this.zzA = null;
                    this.zzv = jZzf + this.zzs;
                    this.zzq = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long jZzf2 = (zzadvVar.zzf() + this.zzs) - 8;
                    this.zzn.push(new zzajm(i5, jZzf2));
                    if (this.zzs == this.zzt) {
                        zzj(jZzf2);
                    } else {
                        zzh();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzt != 8) {
                        throw zzch.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzs > 2147483647L) {
                        throw zzch.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzfu zzfuVar = new zzfu((int) this.zzs);
                    System.arraycopy(this.zzm.zzM(), 0, zzfuVar.zzM(), 0, 8);
                    this.zzu = zzfuVar;
                    this.zzq = 1;
                } else {
                    if (this.zzs > 2147483647L) {
                        throw zzch.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzu = null;
                    this.zzq = 1;
                }
            } else if (i != 1) {
                long j5 = Long.MAX_VALUE;
                if (i != 2) {
                    zzakc zzakcVar = this.zzA;
                    if (zzakcVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j6 = Long.MAX_VALUE;
                    zzakc zzakcVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzakc zzakcVar3 = (zzakc) sparseArray.valueAt(i6);
                        if ((zzakcVar3.zzl || zzakcVar3.zzf != zzakcVar3.zzd.zzb) && (!zzakcVar3.zzl || zzakcVar3.zzh != zzakcVar3.zzb.zzd)) {
                            long jZzd2 = zzakcVar3.zzd();
                            if (jZzd2 < j6) {
                                zzakcVar2 = zzakcVar3;
                                j6 = jZzd2;
                            }
                        }
                    }
                    if (zzakcVar2 == null) {
                        int iZzf = (int) (this.zzv - zzadvVar.zzf());
                        if (iZzf < 0) {
                            throw zzch.zza("Offset to end of mdat was negative.", null);
                        }
                        ((zzadi) zzadvVar).zzo(iZzf, false);
                        zzh();
                    } else {
                        int iZzd = (int) (zzakcVar2.zzd() - zzadvVar.zzf());
                        if (iZzd < 0) {
                            zzfk.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZzd = 0;
                        }
                        ((zzadi) zzadvVar).zzo(iZzd, false);
                        this.zzA = zzakcVar2;
                        zzakcVar = zzakcVar2;
                    }
                } else {
                    int size3 = this.zzf.size();
                    zzakc zzakcVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzakr zzakrVar2 = ((zzakc) this.zzf.valueAt(i7)).zzb;
                        if (zzakrVar2.zzo) {
                            long j7 = zzakrVar2.zzc;
                            if (j7 < j5) {
                                zzakcVar4 = (zzakc) this.zzf.valueAt(i7);
                                j5 = j7;
                            }
                        }
                    }
                    if (zzakcVar4 == null) {
                        this.zzq = 3;
                    } else {
                        int iZzf2 = (int) (j5 - zzadvVar.zzf());
                        if (iZzf2 < 0) {
                            throw zzch.zza("Offset to encryption data was negative.", null);
                        }
                        zzadi zzadiVar = (zzadi) zzadvVar;
                        zzadiVar.zzo(iZzf2, false);
                        zzakr zzakrVar3 = zzakcVar4.zzb;
                        zzfu zzfuVar2 = zzakrVar3.zzn;
                        zzadiVar.zzn(zzfuVar2.zzM(), 0, zzfuVar2.zze(), false);
                        zzakrVar3.zzn.zzK(0);
                        zzakrVar3.zzo = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzs) - this.zzt;
                zzfu zzfuVar3 = this.zzu;
                if (zzfuVar3 != null) {
                    ((zzadi) zzadvVar).zzn(zzfuVar3.zzM(), 8, i8, false);
                    zzajn zzajnVar = new zzajn(this.zzr, zzfuVar3);
                    long jZzf3 = zzadvVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i9 = zzajnVar.zzd;
                        if (i9 == 1936286840) {
                            zzfu zzfuVar4 = zzajnVar.zza;
                            zzfuVar4.zzK(8);
                            int iZze = zzajo.zze(zzfuVar4.zzg());
                            zzfuVar4.zzL(4);
                            long jZzu2 = zzfuVar4.zzu();
                            if (iZze == 0) {
                                jZzv = zzfuVar4.zzu();
                                jZzv2 = zzfuVar4.zzu();
                            } else {
                                jZzv = zzfuVar4.zzv();
                                jZzv2 = zzfuVar4.zzv();
                            }
                            long j8 = jZzf3 + jZzv2;
                            long jZzt3 = zzgd.zzt(jZzv, 1000000L, jZzu2, RoundingMode.FLOOR);
                            zzfuVar4.zzL(2);
                            int iZzq = zzfuVar4.zzq();
                            int[] iArr = new int[iZzq];
                            long[] jArr = new long[iZzq];
                            long[] jArr2 = new long[iZzq];
                            long[] jArr3 = new long[iZzq];
                            long jZzt4 = jZzt3;
                            int i10 = 0;
                            while (i10 < iZzq) {
                                int iZzg = zzfuVar4.zzg();
                                if ((iZzg & Integer.MIN_VALUE) != 0) {
                                    throw zzch.zza("Unhandled indirect reference", null);
                                }
                                long jZzu3 = zzfuVar4.zzu();
                                iArr[i10] = iZzg & Integer.MAX_VALUE;
                                jArr[i10] = j8;
                                jArr3[i10] = jZzt4;
                                long j9 = jZzv + jZzu3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                jZzt4 = zzgd.zzt(j9, 1000000L, jZzu2, RoundingMode.FLOOR);
                                jArr5[i11] = jZzt4 - jArr4[i11];
                                zzfuVar4.zzL(4);
                                j8 += r3[i11];
                                i10 = i11 + 1;
                                iArr = iArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                jZzv = j9;
                                jArr = jArr;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jZzt3), new zzadg(iArr, jArr, jArr2, jArr3));
                            this.zzz = ((Long) pairCreate.first).longValue();
                            this.zzF.zzO((zzaet) pairCreate.second);
                            this.zzI = true;
                        } else if (i9 == 1701671783) {
                            zzfu zzfuVar5 = zzajnVar.zza;
                            if (this.zzG.length != 0) {
                                zzfuVar5.zzK(8);
                                int iZze2 = zzajo.zze(zzfuVar5.zzg());
                                if (iZze2 == 0) {
                                    String strZzx = zzfuVar5.zzx((char) 0);
                                    strZzx.getClass();
                                    String strZzx2 = zzfuVar5.zzx((char) 0);
                                    strZzx2.getClass();
                                    long jZzu4 = zzfuVar5.zzu();
                                    jZzt = zzgd.zzt(zzfuVar5.zzu(), 1000000L, jZzu4, RoundingMode.FLOOR);
                                    long j10 = this.zzz;
                                    long j11 = j10 != -9223372036854775807L ? j10 + jZzt : -9223372036854775807L;
                                    jZzt2 = zzgd.zzt(zzfuVar5.zzu(), 1000L, jZzu4, RoundingMode.FLOOR);
                                    str = strZzx;
                                    str2 = strZzx2;
                                    jZzu = zzfuVar5.zzu();
                                    j = j11;
                                } else if (iZze2 != 1) {
                                    zzfk.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iZze2);
                                } else {
                                    long jZzu5 = zzfuVar5.zzu();
                                    long jZzt5 = zzgd.zzt(zzfuVar5.zzv(), 1000000L, jZzu5, RoundingMode.FLOOR);
                                    long jZzt6 = zzgd.zzt(zzfuVar5.zzu(), 1000L, jZzu5, RoundingMode.FLOOR);
                                    long jZzu6 = zzfuVar5.zzu();
                                    String strZzx3 = zzfuVar5.zzx((char) 0);
                                    strZzx3.getClass();
                                    String strZzx4 = zzfuVar5.zzx((char) 0);
                                    strZzx4.getClass();
                                    jZzt2 = jZzt6;
                                    jZzu = jZzu6;
                                    str = strZzx3;
                                    str2 = strZzx4;
                                    j = jZzt5;
                                    jZzt = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzfuVar5.zzb()];
                                zzfuVar5.zzG(bArr, 0, zzfuVar5.zzb());
                                zzfu zzfuVar6 = new zzfu(this.zzl.zza(new zzagt(str, str2, jZzt2, jZzu, bArr)));
                                int iZzb = zzfuVar6.zzb();
                                for (zzafa zzafaVar : this.zzG) {
                                    zzfuVar6.zzK(0);
                                    zzafaVar.zzq(zzfuVar6, iZzb);
                                }
                                if (j == -9223372036854775807L) {
                                    this.zzo.addLast(new zzakb(jZzt, true, iZzb));
                                    this.zzw += iZzb;
                                } else if (this.zzo.isEmpty()) {
                                    for (zzafa zzafaVar2 : this.zzG) {
                                        zzafaVar2.zzs(j, 1, iZzb, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new zzakb(j, false, iZzb));
                                    this.zzw += iZzb;
                                }
                            }
                        }
                    } else {
                        ((zzajm) this.zzn.peek()).zzd(zzajnVar);
                    }
                } else {
                    ((zzadi) zzadvVar).zzo(i8, false);
                }
                zzj(zzadvVar.zzf());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final /* synthetic */ List zzc() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zzd(zzadx zzadxVar) {
        this.zzF = zzadxVar;
        zzh();
        zzafa[] zzafaVarArr = new zzafa[2];
        this.zzG = zzafaVarArr;
        int i = 0;
        zzafa[] zzafaVarArr2 = (zzafa[]) zzgd.zzP(zzafaVarArr, 0);
        this.zzG = zzafaVarArr2;
        for (zzafa zzafaVar : zzafaVarArr2) {
            zzafaVar.zzl(zzc);
        }
        this.zzH = new zzafa[this.zze.size()];
        int i2 = 100;
        while (i < this.zzH.length) {
            int i3 = i2 + 1;
            zzafa zzafaVarZzw = this.zzF.zzw(i2, 3);
            zzafaVarZzw.zzl((zzan) this.zze.get(i));
            this.zzH[i] = zzafaVarZzw;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final void zze(long j, long j2) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((zzakc) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzw = 0;
        this.zzx = j2;
        this.zzn.clear();
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzadu
    public final boolean zzf(zzadv zzadvVar) throws IOException {
        zzaex zzaexVarZza = zzako.zza(zzadvVar);
        this.zzp = zzaexVarZza != null ? zzgbc.zzn(zzaexVarZza) : zzgbc.zzm();
        return zzaexVarZza == null;
    }

    public zzakd(zzalt zzaltVar, int i) {
        this(zzaltVar, 32, null, null, zzgbc.zzm(), null);
    }

    public zzakd(zzalt zzaltVar, int i, zzgb zzgbVar, zzakp zzakpVar, List list, zzafa zzafaVar) {
        this.zzd = zzaltVar;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzagu();
        this.zzm = new zzfu(16);
        this.zzg = new zzfu(zzgr.zza);
        this.zzh = new zzfu(5);
        this.zzi = new zzfu();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzfu(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzp = zzgbc.zzm();
        this.zzy = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzF = zzadx.zza;
        this.zzG = new zzafa[0];
        this.zzH = new zzafa[0];
    }
}
