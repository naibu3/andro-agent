package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgct extends zzgbf {
    static final zzgbf zza = new zzgct(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzgct(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzgct zzj(int i, Object[] objArr, zzgbe zzgbeVar) {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr2;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzgct) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            zzfzz.zzb(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
            return new zzgct(null, objArrCopyOf, 1);
        }
        zzfyg.zzb(i2, objArrCopyOf.length >> 1, "index");
        int iZzh = zzgbh.zzh(i);
        if (i2 == 1) {
            zzfzz.zzb(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = iZzh - 1;
            char c3 = 65535;
            if (iZzh <= 128) {
                byte[] bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object objRequireNonNull = Objects.requireNonNull(objArrCopyOf[i8]);
                    Object objRequireNonNull2 = Objects.requireNonNull(objArrCopyOf[i8 ^ i3]);
                    zzfzz.zzb(objRequireNonNull, objRequireNonNull2);
                    int iZza = zzgau.zza(objRequireNonNull.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArrCopyOf[i7] = objRequireNonNull;
                                objArrCopyOf[i7 ^ 1] = objRequireNonNull2;
                            }
                            i6++;
                        } else {
                            if (objRequireNonNull.equals(objArrCopyOf[i10])) {
                                int i11 = i10 ^ 1;
                                zzgbd zzgbdVar = new zzgbd(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArrCopyOf[i11]));
                                objArrCopyOf[i11] = objRequireNonNull2;
                                obj = zzgbdVar;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i6), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object objRequireNonNull3 = Objects.requireNonNull(objArrCopyOf[i15]);
                        Object objRequireNonNull4 = Objects.requireNonNull(objArrCopyOf[i15 ^ 1]);
                        zzfzz.zzb(objRequireNonNull3, objRequireNonNull4);
                        int iZza2 = zzgau.zza(objRequireNonNull3.hashCode());
                        while (true) {
                            int i16 = iZza2 & i4;
                            char c4 = (char) sArr[i16];
                            if (c4 == 65535) {
                                sArr[i16] = (short) i14;
                                if (i12 < i13) {
                                    objArrCopyOf[i14] = objRequireNonNull3;
                                    objArrCopyOf[i14 ^ 1] = objRequireNonNull4;
                                }
                                i12++;
                            } else {
                                if (objRequireNonNull3.equals(objArrCopyOf[c4])) {
                                    int i17 = c4 ^ 1;
                                    zzgbd zzgbdVar2 = new zzgbd(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArrCopyOf[i17]));
                                    objArrCopyOf[i17] = objRequireNonNull4;
                                    obj = zzgbdVar2;
                                    break;
                                }
                                iZza2 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        Integer numValueOf = Integer.valueOf(i12);
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, numValueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i18 = 1;
                    sArr = new int[iZzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object objRequireNonNull5 = Objects.requireNonNull(objArrCopyOf[i22]);
                        Object objRequireNonNull6 = Objects.requireNonNull(objArrCopyOf[i22 ^ i18]);
                        zzfzz.zzb(objRequireNonNull5, objRequireNonNull6);
                        int iZza3 = zzgau.zza(objRequireNonNull5.hashCode());
                        while (true) {
                            int i23 = iZza3 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == c3) {
                                sArr[i23] = i21;
                                if (i20 < i19) {
                                    objArrCopyOf[i21] = objRequireNonNull5;
                                    objArrCopyOf[i21 ^ 1] = objRequireNonNull6;
                                }
                                i20++;
                            } else {
                                if (objRequireNonNull5.equals(objArrCopyOf[r15])) {
                                    int i24 = r15 ^ 1;
                                    zzgbd zzgbdVar3 = new zzgbd(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArrCopyOf[i24]));
                                    objArrCopyOf[i24] = objRequireNonNull6;
                                    obj = zzgbdVar3;
                                    break;
                                }
                                iZza3 = i23 + 1;
                                c3 = 65535;
                            }
                        }
                        i19++;
                        i18 = 1;
                        c3 = 65535;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c = 1;
            }
            c2 = 2;
            c = 1;
        }
        boolean z = obj instanceof Object[];
        Object obj2 = obj;
        if (z) {
            Object[] objArr3 = (Object[]) obj;
            zzgbd zzgbdVar4 = (zzgbd) objArr3[c2];
            if (zzgbeVar == null) {
                throw zzgbdVar4.zza();
            }
            zzgbeVar.zzc = zzgbdVar4;
            Object obj3 = objArr3[0];
            int iIntValue = ((Integer) objArr3[c]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj2 = obj3;
            i2 = iIntValue;
        }
        return new zzgct(obj2, objArrCopyOf, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x003a->B:22:0x0050], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0065->B:32:0x007c], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x008b->B:43:0x00a2]] */
    @Override // com.google.android.gms.internal.ads.zzgbf, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object objRequireNonNull;
        if (obj == null) {
            objRequireNonNull = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i != 1) {
                Object obj2 = this.zzc;
                if (obj2 != null) {
                    if (obj2 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj2;
                        int length = bArr.length - 1;
                        int iZza = zzgau.zza(obj.hashCode());
                        while (true) {
                            int i2 = iZza & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                objRequireNonNull = objArr[i3 ^ 1];
                                break;
                            }
                            iZza = i2 + 1;
                        }
                    } else if (obj2 instanceof short[]) {
                        short[] sArr = (short[]) obj2;
                        int length2 = sArr.length - 1;
                        int iZza2 = zzgau.zza(obj.hashCode());
                        while (true) {
                            int i4 = iZza2 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                objRequireNonNull = objArr[c ^ 1];
                                break;
                            }
                            iZza2 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj2;
                        int length3 = iArr.length - 1;
                        int iZza3 = zzgau.zza(obj.hashCode());
                        while (true) {
                            int i5 = iZza3 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                objRequireNonNull = objArr[i6 ^ 1];
                                break;
                            }
                            iZza3 = i5 + 1;
                        }
                    }
                }
            } else if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                objRequireNonNull = Objects.requireNonNull(objArr[1]);
            }
        }
        if (objRequireNonNull == null) {
            return null;
        }
        return objRequireNonNull;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    final zzgax zza() {
        return new zzgcs(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    final zzgbh zzf() {
        return new zzgcq(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    final zzgbh zzg() {
        return new zzgcr(this, new zzgcs(this.zzb, 0, this.zzd));
    }
}
