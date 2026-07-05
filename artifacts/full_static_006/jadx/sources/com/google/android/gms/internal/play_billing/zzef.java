package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i, int i2, zzec zzecVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzfp.zzq(obj, j, (1 << (iZzp >>> 20)) | zzfp.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfp.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzfp.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j2)) != 0;
            case 2:
                return zzfp.zzd(obj, j2) != 0;
            case 3:
                return zzfp.zzd(obj, j2) != 0;
            case 4:
                return zzfp.zzc(obj, j2) != 0;
            case 5:
                return zzfp.zzd(obj, j2) != 0;
            case 6:
                return zzfp.zzc(obj, j2) != 0;
            case 7:
                return zzfp.zzw(obj, j2);
            case 8:
                Object objZzf = zzfp.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzbq) {
                    return !zzbq.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j2) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j2));
            case 11:
                return zzfp.zzc(obj, j2) != 0;
            case 12:
                return zzfp.zzc(obj, j2) != 0;
            case 13:
                return zzfp.zzc(obj, j2) != 0;
            case 14:
                return zzfp.zzd(obj, j2) != 0;
            case 15:
                return zzfp.zzc(obj, j2) != 0;
            case 16:
                return zzfp.zzd(obj, j2) != 0;
            case 17:
                return zzfp.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfp.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfp.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i, (String) obj);
        } else {
            zzfxVar.zzd(i, (zzbq) obj);
        }
    }

    static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzfgVarZzf = zzfg.zzf();
        zzcsVar.zzc = zzfgVarZzf;
        return zzfgVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzef zzl(Class cls, zzdz zzdzVar, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        zzen zzenVar;
        int iObjectFieldOffset;
        String str;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset2;
        Field fieldZzz;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzz2;
        Object obj2;
        Field fieldZzz3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        if (!(zzdzVar instanceof zzen)) {
            throw null;
        }
        zzen zzenVar2 = (zzen) zzdzVar;
        String strZzd = zzenVar2.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (strZzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i32 = iCharAt3 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                cCharAt13 = strZzd.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            iCharAt3 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt4 = strZzd.charAt(i31);
            if (iCharAt4 >= 55296) {
                int i35 = iCharAt4 & 8191;
                int i36 = 13;
                while (true) {
                    i14 = i34 + 1;
                    cCharAt8 = strZzd.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i14;
                }
                iCharAt4 = i35 | (cCharAt8 << i36);
                i34 = i14;
            }
            int i37 = i34 + 1;
            int iCharAt5 = strZzd.charAt(i34);
            if (iCharAt5 >= 55296) {
                int i38 = iCharAt5 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    cCharAt7 = strZzd.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                iCharAt5 = i38 | (cCharAt7 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int iCharAt6 = strZzd.charAt(i37);
            if (iCharAt6 >= 55296) {
                int i41 = iCharAt6 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    cCharAt6 = strZzd.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                iCharAt6 = i41 | (cCharAt6 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int iCharAt7 = strZzd.charAt(i40);
            if (iCharAt7 >= 55296) {
                int i44 = iCharAt7 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    cCharAt5 = strZzd.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                iCharAt7 = i44 | (cCharAt5 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            iCharAt = strZzd.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    cCharAt4 = strZzd.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                iCharAt = i47 | (cCharAt4 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            iCharAt2 = strZzd.charAt(i46);
            if (iCharAt2 >= 55296) {
                int i50 = iCharAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    cCharAt3 = strZzd.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                iCharAt2 = i50 | (cCharAt3 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            int iCharAt8 = strZzd.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    cCharAt2 = strZzd.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                iCharAt8 = i53 | (cCharAt2 << i54);
                i52 = i8;
            }
            int i55 = i52 + 1;
            int iCharAt9 = strZzd.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    cCharAt = strZzd.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                iCharAt9 = i56 | (cCharAt << i57);
                i55 = i7;
            }
            i2 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i3 = iCharAt6;
            i4 = iCharAt9;
            i5 = iCharAt4;
            i6 = iCharAt7;
            i31 = i55;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzenVar2.zze();
        Class<?> cls2 = zzenVar2.zza().getClass();
        int i58 = i4 + iCharAt2;
        int i59 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i59];
        int i60 = 0;
        int i61 = 0;
        int i62 = i4;
        int i63 = i58;
        while (i31 < length) {
            int i64 = i31 + 1;
            int iCharAt10 = strZzd.charAt(i31);
            if (iCharAt10 >= c) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    cCharAt12 = strZzd.charAt(i66);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i15 = i28;
            } else {
                i15 = i64;
            }
            int i68 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = strZzd.charAt(i70);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i27;
            } else {
                i16 = i68;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt11 & 2048;
            int i74 = length;
            if (i72 >= 51) {
                int i75 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i76 = 13;
                    int i77 = iCharAt12 & 8191;
                    int i78 = i75;
                    while (true) {
                        i26 = i78 + 1;
                        cCharAt10 = strZzd.charAt(i78);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i77 |= (cCharAt10 & 8191) << i76;
                        i76 += 13;
                        i78 = i26;
                        c2 = 55296;
                    }
                    iCharAt12 = i77 | (cCharAt10 << i76);
                    i24 = i26;
                } else {
                    i24 = i75;
                }
                int i79 = i24;
                int i80 = i72 - 51;
                i18 = i6;
                if (i80 == 9 || i80 == 17) {
                    i25 = i2 + 1;
                    int i81 = i61 / 3;
                    objArr[i81 + i81 + 1] = objArrZze[i2];
                } else {
                    if (i80 == 12) {
                        if (zzenVar2.zzc() == 1 || i73 != 0) {
                            i25 = i2 + 1;
                            int i82 = i61 / 3;
                            objArr[i82 + i82 + 1] = objArrZze[i2];
                        } else {
                            i73 = 0;
                        }
                    }
                    int i83 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i83];
                    if (obj instanceof Field) {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i83] = fieldZzz2;
                    } else {
                        fieldZzz2 = (Field) obj;
                    }
                    i17 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz2);
                    int i84 = i83 + 1;
                    obj2 = objArrZze[i84];
                    if (obj2 instanceof Field) {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i84] = fieldZzz3;
                    } else {
                        fieldZzz3 = (Field) obj2;
                    }
                    zzenVar = zzenVar2;
                    str = strZzd;
                    i21 = i2;
                    i19 = i79;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz3);
                    i20 = 0;
                }
                i2 = i25;
                int i832 = iCharAt12 + iCharAt12;
                obj = objArrZze[i832];
                if (obj instanceof Field) {
                }
                i17 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz2);
                int i842 = i832 + 1;
                obj2 = objArrZze[i842];
                if (obj2 instanceof Field) {
                }
                zzenVar = zzenVar2;
                str = strZzd;
                i21 = i2;
                i19 = i79;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz3);
                i20 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i85 = i2 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i2]);
                if (i72 == 9 || i72 == 17) {
                    zzenVar = zzenVar2;
                    int i86 = i61 / 3;
                    objArr[i86 + i86 + 1] = fieldZzz4.getType();
                } else {
                    if (i72 == 27) {
                        zzenVar = zzenVar2;
                        i22 = 1;
                        i23 = i2 + 2;
                    } else if (i72 == 49) {
                        i23 = i2 + 2;
                        zzenVar = zzenVar2;
                        i22 = 1;
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        zzenVar = zzenVar2;
                        if (zzenVar2.zzc() == 1 || i73 != 0) {
                            i23 = i2 + 2;
                            int i87 = i61 / 3;
                            objArr[i87 + i87 + 1] = objArrZze[i85];
                            i85 = i23;
                        } else {
                            i73 = 0;
                        }
                    } else {
                        if (i72 == 50) {
                            int i88 = i2 + 2;
                            int i89 = i62 + 1;
                            iArr[i62] = i61;
                            int i90 = i61 / 3;
                            int i91 = i90 + i90;
                            objArr[i91] = objArrZze[i85];
                            if (i73 != 0) {
                                i85 = i2 + 3;
                                objArr[i91 + 1] = objArrZze[i88];
                                i62 = i89;
                            } else {
                                i85 = i88;
                                i62 = i89;
                                i73 = 0;
                            }
                        }
                        zzenVar = zzenVar2;
                    }
                    int i92 = i61 / 3;
                    objArr[i92 + i92 + i22] = objArrZze[i85];
                    i85 = i23;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i72 > 17) {
                    str = strZzd;
                    i19 = i16;
                    i20 = 0;
                } else {
                    int i93 = i16 + 1;
                    int iCharAt13 = strZzd.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i94 = iCharAt13 & 8191;
                        int i95 = 13;
                        while (true) {
                            i19 = i93 + 1;
                            cCharAt9 = strZzd.charAt(i93);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i94 |= (cCharAt9 & 8191) << i95;
                            i95 += 13;
                            i93 = i19;
                        }
                        iCharAt13 = i94 | (cCharAt9 << i95);
                    } else {
                        i19 = i93;
                    }
                    int i96 = i5 + i5 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i96];
                    str = strZzd;
                    if (obj3 instanceof Field) {
                        fieldZzz = (Field) obj3;
                    } else {
                        fieldZzz = zzz(cls2, (String) obj3);
                        objArrZze[i96] = fieldZzz;
                    }
                    i20 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz);
                }
                if (i72 >= 18 && i72 <= 49) {
                    iArr[i63] = iObjectFieldOffset3;
                    i63++;
                }
                i21 = i85;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i97 = i61 + 1;
            iArr2[i61] = iCharAt10;
            int i98 = i61 + 2;
            iArr2[i97] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i73 != 0 ? Integer.MIN_VALUE : 0) | (i72 << 20);
            i61 += 3;
            iArr2[i98] = (i20 << 20) | iObjectFieldOffset;
            i2 = i21;
            i31 = i19;
            length = i74;
            zzenVar2 = zzenVar;
            strZzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzen zzenVar3 = zzenVar2;
        return new zzef(iArr2, objArr, i3, i6, zzenVar3.zza(), zzenVar3.zzc(), false, iArr, i4, i58, zzeiVar, zzdqVar, zzffVar, zzceVar, zzdxVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfp.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfp.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfp.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfp.zzf(obj, j)).longValue();
    }

    private final zzcw zzu(int i) {
        int i2 = i / 3;
        return (zzcw) this.zzd[i2 + i2 + 1];
    }

    private final zzeo zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzeo zzeoVar = (zzeo) objArr[i3];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzeoVarZzb = zzel.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzeoVarZzb;
        return zzeoVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzeo zzeoVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzeo zzeoVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x054e  */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.google.android.gms.internal.play_billing.zzdk] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v117, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v182, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v253, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r0v276 */
    /* JADX WARN: Type inference failed for: r0v277 */
    /* JADX WARN: Type inference failed for: r0v278 */
    /* JADX WARN: Type inference failed for: r0v279 */
    /* JADX WARN: Type inference failed for: r0v280 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v126, types: [int] */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v168 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v170 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v83, types: [int] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int iZzw;
        int iZzw2;
        int iZzw3;
        int iZzx;
        int iZzw4;
        int iZzw5;
        int iZzd;
        int iZzw6;
        int size;
        int iZzw7;
        ?? Zzg;
        int iZzv;
        int iZzv2;
        ?? Zzw;
        int iZzu;
        ?? Zzw2;
        ?? Zzw3;
        int iZze;
        int iZzw8;
        int iZzw9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r1 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int iZzs = zzs(i4);
            int iZzr = zzr(iZzs);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (iZzr <= 17) {
                if (i9 != i6) {
                    r1 = i9 == i3 ? z : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = i6;
                i2 = r1;
                r5 = 1 << (i8 >>> 20);
            } else {
                i = i6;
                i2 = r1;
                r5 = z;
            }
            int i10 = iZzs & i3;
            if (iZzr >= zzcj.DOUBLE_LIST_PACKED.zza()) {
                zzcj.SINT64_LIST_PACKED.zza();
            }
            long j = i10;
            switch (iZzr) {
                case 0:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        iZzw = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw + 8;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 1:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        iZzw2 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw2 + 4;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 2:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(j2);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 3:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(j3);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 4:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(j4);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 5:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        iZzw = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw + 8;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 6:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        iZzw2 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw2 + 4;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 7:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        iZzw4 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw4 + 1;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 8:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzbq) {
                            iZzw5 = zzby.zzw(i11);
                            iZzd = ((zzbq) object).zzd();
                            iZzw6 = zzby.zzw(iZzd);
                            Zzw3 = iZzw5 + iZzw6 + iZzd;
                            i5 += Zzw3;
                            i4 += 3;
                            i6 = i;
                            r1 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            iZzw3 = zzby.zzw(i11);
                            iZzx = zzby.zzv((String) object);
                            Zzw3 = iZzw3 + iZzx;
                            i5 += Zzw3;
                            i4 += 3;
                            i6 = i;
                            r1 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 9:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        Zzw3 = zzeq.zzh(i7, unsafe.getObject(obj, j), zzv(i4));
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        zzbq zzbqVar = (zzbq) unsafe.getObject(obj, j);
                        iZzw5 = zzby.zzw(i7 << 3);
                        iZzd = zzbqVar.zzd();
                        iZzw6 = zzby.zzw(iZzd);
                        Zzw3 = iZzw5 + iZzw6 + iZzd;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 11:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzw(i12);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 12:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(j5);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 13:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        iZzw2 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw2 + 4;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 14:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        iZzw = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw + 8;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 15:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzw((i13 >> 31) ^ (i13 + i13));
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 16:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx((j6 >> 63) ^ (j6 + j6));
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 17:
                    if (zzJ(obj, i4, i, i2, r5)) {
                        Zzw3 = zzby.zzt(i7, (zzec) unsafe.getObject(obj, j), zzv(i4));
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 18:
                    Zzw3 = zzeq.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 19:
                    Zzw3 = zzeq.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zzeq.zza;
                    Zzg = list.size() == 0 ? z : zzeq.zzg(list) + (list.size() * zzby.zzw(i7 << 3));
                    i5 += Zzg;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zzeq.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzl(list2);
                        iZzw7 = zzby.zzw(i7 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzeq.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzf(list3);
                        iZzw7 = zzby.zzw(i7 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 23:
                    Zzw3 = zzeq.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 24:
                    Zzw3 = zzeq.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zzeq.zza;
                    int size2 = list4.size();
                    Zzw3 = size2 == 0 ? z : size2 * (zzby.zzw(i7 << 3) + 1);
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 26:
                    ?? r0 = (List) unsafe.getObject(obj, j);
                    int i18 = zzeq.zza;
                    int size3 = r0.size();
                    if (size3 != 0) {
                        int iZzw10 = zzby.zzw(i7 << 3) * size3;
                        if (r0 instanceof zzdk) {
                            ?? r02 = (zzdk) r0;
                            Zzg = iZzw10;
                            for (?? r3 = z; r3 < size3; r3++) {
                                Object objZzf = r02.zzf(r3);
                                if (objZzf instanceof zzbq) {
                                    int iZzd2 = ((zzbq) objZzf).zzd();
                                    iZzv2 = Zzg + zzby.zzw(iZzd2) + iZzd2;
                                } else {
                                    iZzv2 = Zzg + zzby.zzv((String) objZzf);
                                }
                                Zzg = iZzv2;
                            }
                        } else {
                            Zzg = iZzw10;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object obj2 = r0.get(r32);
                                if (obj2 instanceof zzbq) {
                                    int iZzd3 = ((zzbq) obj2).zzd();
                                    iZzv = Zzg + zzby.zzw(iZzd3) + iZzd3;
                                } else {
                                    iZzv = Zzg + zzby.zzv((String) obj2);
                                }
                                Zzg = iZzv;
                            }
                        }
                    }
                    i5 += Zzg;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                    break;
                case 27:
                    ?? r03 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv = zzv(i4);
                    int i19 = zzeq.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        Zzw = z;
                    } else {
                        Zzw = zzby.zzw(i7 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzdi) {
                                int iZza = ((zzdi) obj3).zza();
                                iZzu = (Zzw == true ? 1 : 0) + zzby.zzw(iZza) + iZza;
                            } else {
                                iZzu = (Zzw == true ? 1 : 0) + zzby.zzu((zzec) obj3, zzeoVarZzv);
                            }
                            Zzw = iZzu;
                        }
                    }
                    i5 += Zzw;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i20 = zzeq.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        Zzw2 = z;
                    } else {
                        Zzw2 = size5 * zzby.zzw(i7 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int iZzd4 = ((zzbq) r04.get(r2)).zzd();
                            Zzw2 += zzby.zzw(iZzd4) + iZzd4;
                        }
                    }
                    i5 += Zzw2;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i21 = zzeq.zza;
                    size = list5.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzk(list5);
                        iZzw7 = zzby.zzw(i7 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i22 = zzeq.zza;
                    size = list6.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zza(list6);
                        iZzw7 = zzby.zzw(i7 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    Zzw3 = zzeq.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 32:
                    Zzw3 = zzeq.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zzeq.zza;
                    size = list7.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzi(list7);
                        iZzw7 = zzby.zzw(i7 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzeq.zza;
                    size = list8.size();
                    if (size != 0) {
                        iZzw3 = zzeq.zzj(list8);
                        iZzw7 = zzby.zzw(i7 << 3);
                        iZzx = size * iZzw7;
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += Zzw3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 35:
                    iZze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 36:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 37:
                    iZze = zzeq.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 38:
                    iZze = zzeq.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 39:
                    iZze = zzeq.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 40:
                    iZze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 41:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zzeq.zza;
                    iZze = list9.size();
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 43:
                    iZze = zzeq.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 44:
                    iZze = zzeq.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 45:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 46:
                    iZze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 47:
                    iZze = zzeq.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZze = zzeq.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzw8 = zzby.zzw(i7 << 3);
                        iZzw9 = zzby.zzw(iZze);
                        Zzw2 = iZzw8 + iZzw9 + iZze;
                        i5 += Zzw2;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv2 = zzv(i4);
                    int i26 = zzeq.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r33 = z2;
                        while (r33 < size6) {
                            int iZzt = zzby.zzt(i7, (zzec) r05.get(r33), zzeoVarZzv2);
                            r33++;
                            r4 = (r4 == true ? 1 : 0) + iZzt;
                        }
                    }
                    i5 += r4;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 50:
                    zzdw zzdwVar = (zzdw) unsafe.getObject(obj, j);
                    if (zzdwVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzdwVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i7, i4)) {
                        iZzw = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw + 8;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i7, i4)) {
                        iZzw2 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw2 + 4;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i7, i4)) {
                        long jZzt = zzt(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(jZzt);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i7, i4)) {
                        long jZzt2 = zzt(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(jZzt2);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i7, i4)) {
                        long jZzo = zzo(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(jZzo);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 56:
                    if (zzM(obj, i7, i4)) {
                        iZzw = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw + 8;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 57:
                    if (zzM(obj, i7, i4)) {
                        iZzw2 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw2 + 4;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 58:
                    if (zzM(obj, i7, i4)) {
                        iZzw4 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw4 + 1;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 59:
                    if (zzM(obj, i7, i4)) {
                        int i27 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzbq) {
                            iZzw5 = zzby.zzw(i27);
                            iZzd = ((zzbq) object2).zzd();
                            iZzw6 = zzby.zzw(iZzd);
                            Zzw3 = iZzw5 + iZzw6 + iZzd;
                            i5 += Zzw3;
                            i4 += 3;
                            i6 = i;
                            r1 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            iZzw3 = zzby.zzw(i27);
                            iZzx = zzby.zzv((String) object2);
                            Zzw3 = iZzw3 + iZzx;
                            i5 += Zzw3;
                            i4 += 3;
                            i6 = i;
                            r1 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i7, i4)) {
                        Zzw3 = zzeq.zzh(i7, unsafe.getObject(obj, j), zzv(i4));
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i7, i4)) {
                        zzbq zzbqVar2 = (zzbq) unsafe.getObject(obj, j);
                        iZzw5 = zzby.zzw(i7 << 3);
                        iZzd = zzbqVar2.zzd();
                        iZzw6 = zzby.zzw(iZzd);
                        Zzw3 = iZzw5 + iZzw6 + iZzd;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 62:
                    if (zzM(obj, i7, i4)) {
                        int iZzo = zzo(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzw(iZzo);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i7, i4)) {
                        long jZzo2 = zzo(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx(jZzo2);
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 64:
                    if (zzM(obj, i7, i4)) {
                        iZzw2 = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw2 + 4;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i7, i4)) {
                        iZzw = zzby.zzw(i7 << 3);
                        Zzw3 = iZzw + 8;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i7, i4)) {
                        int iZzo2 = zzo(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzw((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj, i7, i4)) {
                        long jZzt3 = zzt(obj, j);
                        iZzw3 = zzby.zzw(i7 << 3);
                        iZzx = zzby.zzx((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        Zzw3 = iZzw3 + iZzx;
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 68:
                    if (zzM(obj, i7, i4)) {
                        Zzw3 = zzby.zzt(i7, (zzec) unsafe.getObject(obj, j), zzv(i4));
                        i5 += Zzw3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                default:
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
            }
        }
        zzff zzffVar = this.zzm;
        int iZza2 = i5 + zzffVar.zza(zzffVar.zzd(obj));
        if (!this.zzh) {
            return iZza2;
        }
        zzci zzciVarZzb = this.zzn.zzb(obj);
        int iZzb = 0;
        for (int i28 = 0; i28 < zzciVarZzb.zza.zzb(); i28++) {
            Map.Entry entryZzg = zzciVarZzb.zza.zzg(i28);
            iZzb += zzci.zzb((zzch) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzciVarZzb.zza.zzc()) {
            iZzb += zzci.zzb((zzch) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzs = zzs(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j));
                    byte[] bArr = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr2 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr3 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr4 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzda.zza(zzfp.zzw(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzfp.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr5 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr6 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzfp.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
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
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzda.zza(zzN(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzm.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzn.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:561:0x0ce8, code lost:
    
        if (r6 == 1048575) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0cea, code lost:
    
        r13.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0cee, code lost:
    
        r3 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0cf2, code lost:
    
        if (r3 >= r0.zzk) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0cf4, code lost:
    
        r5 = r0.zzi;
        r6 = r0.zzc;
        r5 = r5[r3];
        r6 = r6[r5];
        r6 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r0.zzs(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0d06, code lost:
    
        if (r6 != null) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0d0d, code lost:
    
        if (r0.zzu(r5) != null) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d0f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0d12, code lost:
    
        r6 = (com.google.android.gms.internal.play_billing.zzdw) r6;
        r1 = (com.google.android.gms.internal.play_billing.zzdv) r0.zzw(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d1a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0d1b, code lost:
    
        if (r8 != 0) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d1f, code lost:
    
        if (r1 != r37) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d26, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0d29, code lost:
    
        if (r1 > r37) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0d2b, code lost:
    
        if (r4 != r8) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0d2d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0d32, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09ae A[PHI: r0 r7 r8 r9 r10 r11 r13
      0x09ae: PHI (r0v32 com.google.android.gms.internal.play_billing.zzef<T>) = 
      (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
      (r0v8 com.google.android.gms.internal.play_billing.zzef<T>)
      (r0v31 com.google.android.gms.internal.play_billing.zzef<T>)
      (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
     binds: [B:439:0x0967, B:423:0x090f, B:407:0x08be, B:332:0x0766, B:283:0x06a0, B:250:0x05ff, B:183:0x047f] A[DONT_GENERATE, DONT_INLINE]
      0x09ae: PHI (r7v28 int) = (r7v7 int), (r7v8 int), (r7v9 int), (r7v14 int), (r7v18 int), (r7v23 int), (r7v32 int) binds: [B:439:0x0967, B:423:0x090f, B:407:0x08be, B:332:0x0766, B:283:0x06a0, B:250:0x05ff, B:183:0x047f] A[DONT_GENERATE, DONT_INLINE]
      0x09ae: PHI (r8v74 int) = (r8v53 int), (r8v54 int), (r8v55 int), (r8v57 int), (r8v64 int), (r8v72 int), (r8v77 int) binds: [B:439:0x0967, B:423:0x090f, B:407:0x08be, B:332:0x0766, B:283:0x06a0, B:250:0x05ff, B:183:0x047f] A[DONT_GENERATE, DONT_INLINE]
      0x09ae: PHI (r9v59 int) = (r9v32 int), (r9v33 int), (r9v34 int), (r9v39 int), (r9v46 int), (r9v54 int), (r9v61 int) binds: [B:439:0x0967, B:423:0x090f, B:407:0x08be, B:332:0x0766, B:283:0x06a0, B:250:0x05ff, B:183:0x047f] A[DONT_GENERATE, DONT_INLINE]
      0x09ae: PHI (r10v74 int) = (r10v35 int), (r10v36 int), (r10v37 int), (r10v51 int), (r10v65 int), (r10v72 int), (r10v77 int) binds: [B:439:0x0967, B:423:0x090f, B:407:0x08be, B:332:0x0766, B:283:0x06a0, B:250:0x05ff, B:183:0x047f] A[DONT_GENERATE, DONT_INLINE]
      0x09ae: PHI (r11v34 sun.misc.Unsafe) = 
      (r11v10 sun.misc.Unsafe)
      (r11v11 sun.misc.Unsafe)
      (r11v12 sun.misc.Unsafe)
      (r11v14 sun.misc.Unsafe)
      (r11v22 sun.misc.Unsafe)
      (r11v29 sun.misc.Unsafe)
      (r11v36 sun.misc.Unsafe)
     binds: [B:439:0x0967, B:423:0x090f, B:407:0x08be, B:332:0x0766, B:283:0x06a0, B:250:0x05ff, B:183:0x047f] A[DONT_GENERATE, DONT_INLINE]
      0x09ae: PHI (r13v52 com.google.android.gms.internal.play_billing.zzbc) = 
      (r13v36 com.google.android.gms.internal.play_billing.zzbc)
      (r13v37 com.google.android.gms.internal.play_billing.zzbc)
      (r13v38 com.google.android.gms.internal.play_billing.zzbc)
      (r13v43 com.google.android.gms.internal.play_billing.zzbc)
      (r13v48 com.google.android.gms.internal.play_billing.zzbc)
      (r13v50 com.google.android.gms.internal.play_billing.zzbc)
      (r13v54 com.google.android.gms.internal.play_billing.zzbc)
     binds: [B:439:0x0967, B:423:0x090f, B:407:0x08be, B:332:0x0766, B:283:0x06a0, B:250:0x05ff, B:183:0x047f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0c60 A[PHI: r1 r4 r5 r6 r9 r20
      0x0c60: PHI (r1v190 int) = 
      (r1v166 int)
      (r1v167 int)
      (r1v168 int)
      (r1v169 int)
      (r1v170 int)
      (r1v171 int)
      (r1v174 int)
      (r1v183 int)
      (r1v191 int)
     binds: [B:539:0x0c49, B:536:0x0c28, B:532:0x0c07, B:529:0x0bea, B:526:0x0bcd, B:523:0x0baf, B:521:0x0ba2, B:499:0x0b34, B:466:0x0a1f] A[DONT_GENERATE, DONT_INLINE]
      0x0c60: PHI (r4v87 int) = (r4v58 int), (r4v59 int), (r4v60 int), (r4v61 int), (r4v62 int), (r4v63 int), (r4v66 int), (r4v79 int), (r4v88 int) binds: [B:539:0x0c49, B:536:0x0c28, B:532:0x0c07, B:529:0x0bea, B:526:0x0bcd, B:523:0x0baf, B:521:0x0ba2, B:499:0x0b34, B:466:0x0a1f] A[DONT_GENERATE, DONT_INLINE]
      0x0c60: PHI (r5v123 com.google.android.gms.internal.play_billing.zzbc) = 
      (r5v107 com.google.android.gms.internal.play_billing.zzbc)
      (r5v108 com.google.android.gms.internal.play_billing.zzbc)
      (r5v109 com.google.android.gms.internal.play_billing.zzbc)
      (r5v110 com.google.android.gms.internal.play_billing.zzbc)
      (r5v111 com.google.android.gms.internal.play_billing.zzbc)
      (r5v112 com.google.android.gms.internal.play_billing.zzbc)
      (r5v115 com.google.android.gms.internal.play_billing.zzbc)
      (r5v119 com.google.android.gms.internal.play_billing.zzbc)
      (r5v124 com.google.android.gms.internal.play_billing.zzbc)
     binds: [B:539:0x0c49, B:536:0x0c28, B:532:0x0c07, B:529:0x0bea, B:526:0x0bcd, B:523:0x0baf, B:521:0x0ba2, B:499:0x0b34, B:466:0x0a1f] A[DONT_GENERATE, DONT_INLINE]
      0x0c60: PHI (r6v98 byte[]) = 
      (r6v78 byte[])
      (r6v79 byte[])
      (r6v80 byte[])
      (r6v81 byte[])
      (r6v82 byte[])
      (r6v83 byte[])
      (r6v86 byte[])
      (r6v91 byte[])
      (r6v99 byte[])
     binds: [B:539:0x0c49, B:536:0x0c28, B:532:0x0c07, B:529:0x0bea, B:526:0x0bcd, B:523:0x0baf, B:521:0x0ba2, B:499:0x0b34, B:466:0x0a1f] A[DONT_GENERATE, DONT_INLINE]
      0x0c60: PHI (r9v90 int) = (r9v64 int), (r9v65 int), (r9v66 int), (r9v67 int), (r9v68 int), (r9v69 int), (r9v72 int), (r9v82 int), (r9v91 int) binds: [B:539:0x0c49, B:536:0x0c28, B:532:0x0c07, B:529:0x0bea, B:526:0x0bcd, B:523:0x0baf, B:521:0x0ba2, B:499:0x0b34, B:466:0x0a1f] A[DONT_GENERATE, DONT_INLINE]
      0x0c60: PHI (r20v36 int) = 
      (r20v16 int)
      (r20v17 int)
      (r20v18 int)
      (r20v19 int)
      (r20v20 int)
      (r20v21 int)
      (r20v24 int)
      (r20v30 int)
      (r20v37 int)
     binds: [B:539:0x0c49, B:536:0x0c28, B:532:0x0c07, B:529:0x0bea, B:526:0x0bcd, B:523:0x0baf, B:521:0x0ba2, B:499:0x0b34, B:466:0x0a1f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0c81 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0c90  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x09b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0c63 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:667:0x09bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0c7a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzbc zzbcVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int iZzi;
        int i5;
        int i6;
        int iZzq;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Unsafe unsafe2;
        zzbc zzbcVar2;
        int i12;
        int i13;
        Unsafe unsafe3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Unsafe unsafe4;
        zzbc zzbcVar3;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        zzbc zzbcVar4;
        Unsafe unsafe5;
        int i29;
        int i30;
        int iZzf;
        zzbc zzbcVar5;
        int i31;
        int i32;
        int i33;
        int iZzj;
        int i34;
        int iZzh;
        zzbc zzbcVar6;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        byte[] bArr2;
        int iZzh2;
        int iZzk;
        int i40;
        byte[] bArr3;
        zzbc zzbcVar7;
        zzef<T> zzefVar = this;
        Object obj2 = obj;
        byte[] bArr4 = bArr;
        int i41 = i2;
        int i42 = i3;
        zzbc zzbcVar8 = zzbcVar;
        zzA(obj);
        Unsafe unsafe6 = zzb;
        int i43 = 0;
        int iZzg = i;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = -1;
        int i48 = 1048575;
        while (true) {
            if (iZzg < i41) {
                int i49 = iZzg + 1;
                byte b = bArr4[iZzg];
                if (b < 0) {
                    iZzi = zzbd.zzi(b, bArr4, i49, zzbcVar8);
                    i45 = zzbcVar8.zza;
                } else {
                    i45 = b;
                    iZzi = i49;
                }
                int i50 = i45 >>> 3;
                if (i50 > i47) {
                    iZzq = (i50 < zzefVar.zze || i50 > zzefVar.zzf) ? -1 : zzefVar.zzq(i50, i44 / 3);
                } else if (i50 < zzefVar.zze || i50 > zzefVar.zzf) {
                    i5 = -1;
                    i6 = -1;
                    if (i6 != i5) {
                        i7 = iZzi;
                        i8 = i46;
                        i9 = i48;
                        i10 = i50;
                        i11 = i43;
                        unsafe2 = unsafe6;
                        zzbcVar2 = zzbcVar8;
                        i4 = i42;
                    } else {
                        int i51 = i45 & 7;
                        int[] iArr = zzefVar.zzc;
                        int i52 = iArr[i6 + 1];
                        int i53 = i45;
                        int iZzr = zzr(i52);
                        long j = i52 & 1048575;
                        if (iZzr <= 17) {
                            int i54 = iArr[i6 + 2];
                            int i55 = 1 << (i54 >>> 20);
                            int i56 = i54 & 1048575;
                            if (i56 != i48) {
                                if (i48 != 1048575) {
                                    unsafe6.putInt(obj2, i48, i46);
                                }
                                i46 = i56 == 1048575 ? 0 : unsafe6.getInt(obj2, i56);
                                i9 = i56;
                            } else {
                                i9 = i48;
                            }
                            switch (iZzr) {
                                case 0:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 != 1) {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4 && i4 != 0) {
                                            iZzg = i7;
                                            i48 = i9;
                                            i46 = i8;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            if (!zzefVar.zzh || zzbcVar2.zzd == zzcd.zza) {
                                                i12 = i10;
                                                i13 = i45;
                                                unsafe3 = unsafe2;
                                                iZzg = zzbd.zzg(i13, bArr, i7, i2, zzd(obj), zzbcVar);
                                            } else {
                                                if (zzbcVar2.zzd.zzb(zzefVar.zzg, i10) != null) {
                                                    throw null;
                                                }
                                                i12 = i10;
                                                i13 = i45;
                                                unsafe3 = unsafe2;
                                                iZzg = zzbd.zzg(i45, bArr, i7, i2, zzd(obj), zzbcVar);
                                            }
                                            bArr4 = bArr;
                                            i41 = i2;
                                            i44 = i43;
                                            i47 = i12;
                                            i45 = i13;
                                            unsafe6 = unsafe3;
                                            i48 = i9;
                                            i43 = i11;
                                            i46 = i8;
                                            zzbcVar8 = zzbcVar;
                                            i42 = i4;
                                        }
                                    } else {
                                        iZzg = i14 + 8;
                                        i46 |= i55;
                                        zzfp.zzo(obj2, j, Double.longBitsToDouble(zzbd.zzn(bArr4, i14)));
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                    break;
                                case 1:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 == 5) {
                                        iZzg = i14 + 4;
                                        i46 |= i55;
                                        zzfp.zzp(obj2, j, Float.intBitsToFloat(zzbd.zzb(bArr4, i14)));
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                            i12 = i10;
                                            i13 = i45;
                                            unsafe3 = unsafe2;
                                            iZzg = zzbd.zzg(i13, bArr, i7, i2, zzd(obj), zzbcVar);
                                            bArr4 = bArr;
                                            i41 = i2;
                                            i44 = i43;
                                            i47 = i12;
                                            i45 = i13;
                                            unsafe6 = unsafe3;
                                            i48 = i9;
                                            i43 = i11;
                                            i46 = i8;
                                            zzbcVar8 = zzbcVar;
                                            i42 = i4;
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                case 3:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 == 0) {
                                        int i57 = i46 | i55;
                                        int iZzk2 = zzbd.zzk(bArr4, i14, zzbcVar8);
                                        unsafe6.putLong(obj, j, zzbcVar8.zzb);
                                        i46 = i57;
                                        iZzg = iZzk2;
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 4:
                                case 11:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 == 0) {
                                        i46 |= i55;
                                        iZzg = zzbd.zzh(bArr4, i14, zzbcVar8);
                                        unsafe6.putInt(obj2, j, zzbcVar8.zza);
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 5:
                                case 14:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 == 1) {
                                        unsafe6.putLong(obj, j, zzbd.zzn(bArr4, i14));
                                        iZzg = i14 + 8;
                                        i46 = i55 | i46;
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 == 5) {
                                        iZzg = i14 + 4;
                                        i46 |= i55;
                                        unsafe6.putInt(obj2, j, zzbd.zzb(bArr4, i14));
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 7:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 == 0) {
                                        i46 |= i55;
                                        iZzg = zzbd.zzk(bArr4, i14, zzbcVar8);
                                        zzfp.zzm(obj2, j, zzbcVar8.zzb != 0);
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 8:
                                    int i58 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    if (i51 == 2) {
                                        if ((i52 & 536870912) != 0) {
                                            iZzg = zzbd.zzh(bArr4, i58, zzbcVar8);
                                            int i59 = zzbcVar8.zza;
                                            if (i59 < 0) {
                                                throw zzdc.zzd();
                                            }
                                            int i60 = i46 | i55;
                                            if (i59 == 0) {
                                                zzbcVar8.zzc = "";
                                                i22 = i60;
                                                i43 = 0;
                                            } else {
                                                int i61 = zzfu.zza;
                                                int length = bArr4.length;
                                                if ((((length - iZzg) - i59) | iZzg | i59) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzg), Integer.valueOf(i59)));
                                                }
                                                int i62 = iZzg + i59;
                                                char[] cArr = new char[i59];
                                                int i63 = 0;
                                                while (iZzg < i62) {
                                                    byte b2 = bArr4[iZzg];
                                                    if (zzfq.zzd(b2)) {
                                                        iZzg++;
                                                        cArr[i63] = (char) b2;
                                                        i63++;
                                                    } else {
                                                        while (iZzg < i62) {
                                                            int i64 = iZzg + 1;
                                                            byte b3 = bArr4[iZzg];
                                                            if (zzfq.zzd(b3)) {
                                                                cArr[i63] = (char) b3;
                                                                i63++;
                                                                iZzg = i64;
                                                                while (iZzg < i62) {
                                                                    byte b4 = bArr4[iZzg];
                                                                    if (zzfq.zzd(b4)) {
                                                                        iZzg++;
                                                                        cArr[i63] = (char) b4;
                                                                        i63++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i65 = i60;
                                                                if (b3 < -32) {
                                                                    if (i64 >= i62) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    iZzg += 2;
                                                                    zzfq.zzc(b3, bArr4[i64], cArr, i63);
                                                                    i63++;
                                                                } else if (b3 < -16) {
                                                                    if (i64 >= i62 - 1) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    zzfq.zzb(b3, bArr4[i64], bArr4[iZzg + 2], cArr, i63);
                                                                    i63++;
                                                                    i60 = i65;
                                                                    iZzg += 3;
                                                                } else {
                                                                    if (i64 >= i62 - 2) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    byte b5 = bArr4[i64];
                                                                    int i66 = iZzg + 3;
                                                                    byte b6 = bArr4[iZzg + 2];
                                                                    iZzg += 4;
                                                                    zzfq.zza(b3, b5, b6, bArr4[i66], cArr, i63);
                                                                    i63 += 2;
                                                                }
                                                                i60 = i65;
                                                            }
                                                        }
                                                        i22 = i60;
                                                        i43 = 0;
                                                        zzbcVar8.zzc = new String(cArr, 0, i63);
                                                        iZzg = i62;
                                                    }
                                                }
                                                while (iZzg < i62) {
                                                }
                                                i22 = i60;
                                                i43 = 0;
                                                zzbcVar8.zzc = new String(cArr, 0, i63);
                                                iZzg = i62;
                                            }
                                            i46 = i22;
                                        } else {
                                            i43 = 0;
                                            iZzg = zzbd.zzh(bArr4, i58, zzbcVar8);
                                            int i67 = zzbcVar8.zza;
                                            if (i67 < 0) {
                                                throw zzdc.zzd();
                                            }
                                            i46 |= i55;
                                            if (i67 == 0) {
                                                zzbcVar8.zzc = "";
                                            } else {
                                                zzbcVar8.zzc = new String(bArr4, iZzg, i67, zzda.zzb);
                                                iZzg += i67;
                                            }
                                        }
                                        unsafe6.putObject(obj2, j, zzbcVar8.zzc);
                                        i45 = i16;
                                        i44 = i15;
                                        i48 = i9;
                                        i47 = i50;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i17 = i46;
                                        i18 = i58;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        i11 = 0;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 9:
                                    i23 = i6;
                                    i24 = i53;
                                    if (i51 == 2) {
                                        int i68 = i46 | i55;
                                        Object objZzx = zzefVar.zzx(obj2, i23);
                                        iZzg = zzbd.zzm(objZzx, zzefVar.zzv(i23), bArr, iZzi, i2, zzbcVar);
                                        zzefVar.zzF(obj2, i23, objZzx);
                                        i46 = i68;
                                        i45 = i24;
                                        i44 = i23;
                                        i48 = i9;
                                        i47 = i50;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i18 = iZzi;
                                        i17 = i46;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i24;
                                        i20 = i23;
                                        i21 = i50;
                                        i11 = 0;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 10:
                                    i23 = i6;
                                    i24 = i53;
                                    if (i51 == 2) {
                                        i46 |= i55;
                                        iZzg = zzbd.zza(bArr4, iZzi, zzbcVar8);
                                        unsafe6.putObject(obj2, j, zzbcVar8.zzc);
                                        i45 = i24;
                                        i44 = i23;
                                        i48 = i9;
                                        i47 = i50;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i18 = iZzi;
                                        i17 = i46;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i24;
                                        i20 = i23;
                                        i21 = i50;
                                        i11 = 0;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 12:
                                    i23 = i6;
                                    i24 = i53;
                                    if (i51 == 0) {
                                        iZzg = zzbd.zzh(bArr4, iZzi, zzbcVar8);
                                        int i69 = zzbcVar8.zza;
                                        zzcw zzcwVarZzu = zzefVar.zzu(i23);
                                        if ((i52 & Integer.MIN_VALUE) == 0 || zzcwVarZzu == null || zzcwVarZzu.zza(i69)) {
                                            i46 |= i55;
                                            unsafe6.putInt(obj2, j, i69);
                                        } else {
                                            zzd(obj).zzj(i24, Long.valueOf(i69));
                                        }
                                        i45 = i24;
                                        i44 = i23;
                                        i48 = i9;
                                        i47 = i50;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i18 = iZzi;
                                        i17 = i46;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i24;
                                        i20 = i23;
                                        i21 = i50;
                                        i11 = 0;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 15:
                                    i23 = i6;
                                    i24 = i53;
                                    if (i51 == 0) {
                                        i46 |= i55;
                                        iZzg = zzbd.zzh(bArr4, iZzi, zzbcVar8);
                                        unsafe6.putInt(obj2, j, zzbu.zzb(zzbcVar8.zza));
                                        i45 = i24;
                                        i44 = i23;
                                        i48 = i9;
                                        i47 = i50;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i18 = iZzi;
                                        i17 = i46;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i24;
                                        i20 = i23;
                                        i21 = i50;
                                        i11 = 0;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                case 16:
                                    if (i51 == 0) {
                                        int i70 = i46 | i55;
                                        int iZzk3 = zzbd.zzk(bArr4, iZzi, zzbcVar8);
                                        i23 = i6;
                                        i24 = i53;
                                        unsafe6.putLong(obj, j, zzbu.zzc(zzbcVar8.zzb));
                                        i46 = i70;
                                        iZzg = iZzk3;
                                        i45 = i24;
                                        i44 = i23;
                                        i48 = i9;
                                        i47 = i50;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    } else {
                                        i18 = iZzi;
                                        i20 = i6;
                                        i17 = i46;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i53;
                                        i21 = i50;
                                        i11 = 0;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                                default:
                                    i14 = iZzi;
                                    i15 = i6;
                                    i16 = i53;
                                    i43 = 0;
                                    if (i51 == 3) {
                                        Object objZzx2 = zzefVar.zzx(obj2, i15);
                                        int iZzl = zzbd.zzl(objZzx2, zzefVar.zzv(i15), bArr, i14, i2, (i50 << 3) | 4, zzbcVar);
                                        zzefVar.zzF(obj2, i15, objZzx2);
                                        i42 = i3;
                                        zzbcVar8 = zzbcVar;
                                        i41 = i2;
                                        i47 = i50;
                                        unsafe6 = unsafe6;
                                        i44 = i15;
                                        iZzg = iZzl;
                                        i48 = i9;
                                        i43 = 0;
                                        i45 = i16;
                                        i46 |= i55;
                                    } else {
                                        i17 = i46;
                                        i18 = i14;
                                        i11 = i43;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i19 = i16;
                                        i20 = i15;
                                        i21 = i50;
                                        unsafe2 = unsafe4;
                                        i43 = i20;
                                        i8 = i17;
                                        i45 = i19;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i10 = i21;
                                        i7 = i18;
                                        if (i45 != i4) {
                                        }
                                        if (zzefVar.zzh) {
                                        }
                                    }
                                    break;
                            }
                        } else {
                            i9 = i48;
                            int i71 = i53;
                            i11 = 0;
                            int i72 = i6;
                            i8 = i46;
                            Unsafe unsafe7 = unsafe6;
                            i41 = i2;
                            int i73 = iZzi;
                            zzbc zzbcVar9 = zzbcVar8;
                            if (iZzr != 27) {
                                if (iZzr <= 49) {
                                    long j2 = i52;
                                    Unsafe unsafe8 = zzb;
                                    zzcz zzczVar = (zzcz) unsafe8.getObject(obj2, j);
                                    if (zzczVar.zzc()) {
                                        i25 = i50;
                                    } else {
                                        int size = zzczVar.size();
                                        i25 = i50;
                                        zzcz zzczVarZzd = zzczVar.zzd(size != 0 ? size + size : 10);
                                        unsafe8.putObject(obj2, j, zzczVarZzd);
                                        zzczVar = zzczVarZzd;
                                    }
                                    switch (iZzr) {
                                        case 18:
                                        case 35:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe6 = unsafe7;
                                            i43 = i72;
                                            i28 = i25;
                                            zzbcVar4 = zzbcVar9;
                                            if (i51 == 2) {
                                                zzca zzcaVar = (zzca) zzczVar;
                                                iZzg = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                int i74 = zzbcVar4.zza + iZzg;
                                                while (iZzg < i74) {
                                                    zzcaVar.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, iZzg)));
                                                    iZzg += 8;
                                                }
                                                if (iZzg != i74) {
                                                    throw zzdc.zzg();
                                                }
                                            } else if (i51 == 1) {
                                                iZzg = i26 + 8;
                                                zzca zzcaVar2 = (zzca) zzczVar;
                                                zzcaVar2.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, i26)));
                                                while (iZzg < i41) {
                                                    int iZzh3 = zzbd.zzh(bArr4, iZzg, zzbcVar4);
                                                    if (i27 == zzbcVar4.zza) {
                                                        zzcaVar2.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, iZzh3)));
                                                        iZzg = iZzh3 + 8;
                                                    }
                                                }
                                            } else {
                                                iZzg = i26;
                                            }
                                            if (iZzg == i26) {
                                                obj2 = obj;
                                                i7 = iZzg;
                                                i10 = i28;
                                                i45 = i27;
                                                unsafe2 = unsafe6;
                                                zzbcVar2 = zzbcVar4;
                                                i4 = i3;
                                                break;
                                            } else {
                                                obj2 = obj;
                                                i47 = i28;
                                                i45 = i27;
                                                i44 = i43;
                                                zzbcVar8 = zzbcVar4;
                                                i48 = i9;
                                                i43 = 0;
                                                i46 = i8;
                                                i42 = i3;
                                            }
                                        case 19:
                                        case 36:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe6 = unsafe7;
                                            i43 = i72;
                                            i28 = i25;
                                            zzbcVar4 = zzbcVar9;
                                            if (i51 == 2) {
                                                zzck zzckVar = (zzck) zzczVar;
                                                iZzg = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                int i75 = zzbcVar4.zza + iZzg;
                                                while (iZzg < i75) {
                                                    zzckVar.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, iZzg)));
                                                    iZzg += 4;
                                                }
                                                if (iZzg != i75) {
                                                    throw zzdc.zzg();
                                                }
                                            } else if (i51 == 5) {
                                                iZzg = i26 + 4;
                                                zzck zzckVar2 = (zzck) zzczVar;
                                                zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, i26)));
                                                while (iZzg < i41) {
                                                    int iZzh4 = zzbd.zzh(bArr4, iZzg, zzbcVar4);
                                                    if (i27 == zzbcVar4.zza) {
                                                        zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, iZzh4)));
                                                        iZzg = iZzh4 + 4;
                                                    }
                                                }
                                            }
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe6 = unsafe7;
                                            i43 = i72;
                                            i28 = i25;
                                            zzbcVar4 = zzbcVar9;
                                            if (i51 == 2) {
                                                zzdr zzdrVar = (zzdr) zzczVar;
                                                iZzg = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                int i76 = zzbcVar4.zza + iZzg;
                                                while (iZzg < i76) {
                                                    iZzg = zzbd.zzk(bArr4, iZzg, zzbcVar4);
                                                    zzdrVar.zzf(zzbcVar4.zzb);
                                                }
                                                if (iZzg != i76) {
                                                    throw zzdc.zzg();
                                                }
                                            } else if (i51 == 0) {
                                                zzdr zzdrVar2 = (zzdr) zzczVar;
                                                iZzg = zzbd.zzk(bArr4, i26, zzbcVar4);
                                                zzdrVar2.zzf(zzbcVar4.zzb);
                                                while (iZzg < i41) {
                                                    int iZzh5 = zzbd.zzh(bArr4, iZzg, zzbcVar4);
                                                    if (i27 == zzbcVar4.zza) {
                                                        iZzg = zzbd.zzk(bArr4, iZzh5, zzbcVar4);
                                                        zzdrVar2.zzf(zzbcVar4.zzb);
                                                    }
                                                }
                                            }
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 22:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                        case 39:
                                        case 43:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe5 = unsafe7;
                                            i29 = i72;
                                            zzbcVar4 = zzbcVar9;
                                            i30 = i25;
                                            if (i51 == 2) {
                                                iZzf = zzbd.zzf(bArr4, i26, zzczVar, zzbcVar4);
                                                i28 = i30;
                                                iZzg = iZzf;
                                                i43 = i29;
                                                unsafe6 = unsafe5;
                                                if (iZzg == i26) {
                                                }
                                            } else {
                                                if (i51 == 0) {
                                                    i28 = i30;
                                                    i43 = i29;
                                                    unsafe6 = unsafe5;
                                                    iZzg = zzbd.zzj(i27, bArr, i26, i2, zzczVar, zzbcVar);
                                                    if (iZzg == i26) {
                                                    }
                                                }
                                                i28 = i30;
                                                i43 = i29;
                                                unsafe6 = unsafe5;
                                                iZzg = i26;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe5 = unsafe7;
                                            i29 = i72;
                                            zzbcVar4 = zzbcVar9;
                                            i30 = i25;
                                            if (i51 == 2) {
                                                zzdr zzdrVar3 = (zzdr) zzczVar;
                                                iZzf = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                int i77 = zzbcVar4.zza + iZzf;
                                                while (iZzf < i77) {
                                                    zzdrVar3.zzf(zzbd.zzn(bArr4, iZzf));
                                                    iZzf += 8;
                                                }
                                                if (iZzf != i77) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i51 == 1) {
                                                    iZzf = i26 + 8;
                                                    zzdr zzdrVar4 = (zzdr) zzczVar;
                                                    zzdrVar4.zzf(zzbd.zzn(bArr4, i26));
                                                    while (iZzf < i41) {
                                                        int iZzh6 = zzbd.zzh(bArr4, iZzf, zzbcVar4);
                                                        if (i27 == zzbcVar4.zza) {
                                                            zzdrVar4.zzf(zzbd.zzn(bArr4, iZzh6));
                                                            iZzf = iZzh6 + 8;
                                                        }
                                                    }
                                                }
                                                i28 = i30;
                                                i43 = i29;
                                                unsafe6 = unsafe5;
                                                iZzg = i26;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            i28 = i30;
                                            iZzg = iZzf;
                                            i43 = i29;
                                            unsafe6 = unsafe5;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 24:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                        case 41:
                                        case 45:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe5 = unsafe7;
                                            i29 = i72;
                                            zzbcVar4 = zzbcVar9;
                                            i30 = i25;
                                            if (i51 == 2) {
                                                zzct zzctVar = (zzct) zzczVar;
                                                iZzf = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                int i78 = zzbcVar4.zza + iZzf;
                                                while (iZzf < i78) {
                                                    zzctVar.zzg(zzbd.zzb(bArr4, iZzf));
                                                    iZzf += 4;
                                                }
                                                if (iZzf != i78) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i51 == 5) {
                                                    iZzf = i26 + 4;
                                                    zzct zzctVar2 = (zzct) zzczVar;
                                                    zzctVar2.zzg(zzbd.zzb(bArr4, i26));
                                                    while (iZzf < i41) {
                                                        int iZzh7 = zzbd.zzh(bArr4, iZzf, zzbcVar4);
                                                        if (i27 == zzbcVar4.zza) {
                                                            zzctVar2.zzg(zzbd.zzb(bArr4, iZzh7));
                                                            iZzf = iZzh7 + 4;
                                                        }
                                                    }
                                                }
                                                i28 = i30;
                                                i43 = i29;
                                                unsafe6 = unsafe5;
                                                iZzg = i26;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            i28 = i30;
                                            iZzg = iZzf;
                                            i43 = i29;
                                            unsafe6 = unsafe5;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe5 = unsafe7;
                                            i29 = i72;
                                            zzbcVar4 = zzbcVar9;
                                            i30 = i25;
                                            if (i51 == 2) {
                                                zzbe zzbeVar = (zzbe) zzczVar;
                                                iZzf = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                int i79 = zzbcVar4.zza + iZzf;
                                                while (iZzf < i79) {
                                                    iZzf = zzbd.zzk(bArr4, iZzf, zzbcVar4);
                                                    zzbeVar.zze(zzbcVar4.zzb != 0);
                                                }
                                                if (iZzf != i79) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i51 == 0) {
                                                    zzbe zzbeVar2 = (zzbe) zzczVar;
                                                    iZzf = zzbd.zzk(bArr4, i26, zzbcVar4);
                                                    zzbeVar2.zze(zzbcVar4.zzb != 0);
                                                    while (iZzf < i41) {
                                                        int iZzh8 = zzbd.zzh(bArr4, iZzf, zzbcVar4);
                                                        if (i27 == zzbcVar4.zza) {
                                                            iZzf = zzbd.zzk(bArr4, iZzh8, zzbcVar4);
                                                            zzbeVar2.zze(zzbcVar4.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i28 = i30;
                                                i43 = i29;
                                                unsafe6 = unsafe5;
                                                iZzg = i26;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            i28 = i30;
                                            iZzg = iZzf;
                                            i43 = i29;
                                            unsafe6 = unsafe5;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 26:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe5 = unsafe7;
                                            i29 = i72;
                                            zzbcVar4 = zzbcVar9;
                                            i30 = i25;
                                            if (i51 == 2) {
                                                if ((j2 & 536870912) == 0) {
                                                    iZzf = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                    int i80 = zzbcVar4.zza;
                                                    if (i80 < 0) {
                                                        throw zzdc.zzd();
                                                    }
                                                    if (i80 == 0) {
                                                        zzczVar.add("");
                                                    } else {
                                                        zzczVar.add(new String(bArr4, iZzf, i80, zzda.zzb));
                                                        iZzf += i80;
                                                    }
                                                    while (iZzf < i41) {
                                                        int iZzh9 = zzbd.zzh(bArr4, iZzf, zzbcVar4);
                                                        if (i27 == zzbcVar4.zza) {
                                                            iZzf = zzbd.zzh(bArr4, iZzh9, zzbcVar4);
                                                            int i81 = zzbcVar4.zza;
                                                            if (i81 < 0) {
                                                                throw zzdc.zzd();
                                                            }
                                                            if (i81 == 0) {
                                                                zzczVar.add("");
                                                            } else {
                                                                zzczVar.add(new String(bArr4, iZzf, i81, zzda.zzb));
                                                                iZzf += i81;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iZzf = zzbd.zzh(bArr4, i26, zzbcVar4);
                                                    int i82 = zzbcVar4.zza;
                                                    if (i82 < 0) {
                                                        throw zzdc.zzd();
                                                    }
                                                    if (i82 == 0) {
                                                        zzczVar.add("");
                                                    } else {
                                                        int i83 = iZzf + i82;
                                                        if (!zzfu.zze(bArr4, iZzf, i83)) {
                                                            throw zzdc.zzc();
                                                        }
                                                        zzczVar.add(new String(bArr4, iZzf, i82, zzda.zzb));
                                                        iZzf = i83;
                                                    }
                                                    while (iZzf < i41) {
                                                        int iZzh10 = zzbd.zzh(bArr4, iZzf, zzbcVar4);
                                                        if (i27 == zzbcVar4.zza) {
                                                            iZzf = zzbd.zzh(bArr4, iZzh10, zzbcVar4);
                                                            int i84 = zzbcVar4.zza;
                                                            if (i84 < 0) {
                                                                throw zzdc.zzd();
                                                            }
                                                            if (i84 == 0) {
                                                                zzczVar.add("");
                                                            } else {
                                                                int i85 = iZzf + i84;
                                                                if (!zzfu.zze(bArr4, iZzf, i85)) {
                                                                    throw zzdc.zzc();
                                                                }
                                                                zzczVar.add(new String(bArr4, iZzf, i84, zzda.zzb));
                                                                iZzf = i85;
                                                            }
                                                        }
                                                    }
                                                }
                                                i28 = i30;
                                                iZzg = iZzf;
                                                i43 = i29;
                                                unsafe6 = unsafe5;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            i28 = i30;
                                            i43 = i29;
                                            unsafe6 = unsafe5;
                                            iZzg = i26;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 27:
                                            zzbcVar5 = zzbcVar9;
                                            i31 = i71;
                                            i32 = i72;
                                            i33 = i25;
                                            if (i51 == 2) {
                                                zzefVar = this;
                                                i26 = i73;
                                                int iZze = zzbd.zze(zzefVar.zzv(i32), i31, bArr, i73, i2, zzczVar, zzbcVar);
                                                zzbcVar4 = zzbcVar5;
                                                i43 = i32;
                                                unsafe6 = unsafe7;
                                                i27 = i31;
                                                i41 = i41;
                                                i28 = i33;
                                                iZzg = iZze;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            zzefVar = this;
                                            i26 = i73;
                                            zzbcVar4 = zzbcVar5;
                                            i43 = i32;
                                            i28 = i33;
                                            i27 = i31;
                                            unsafe6 = unsafe7;
                                            iZzg = i26;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 28:
                                            zzbcVar5 = zzbcVar9;
                                            i31 = i71;
                                            i32 = i72;
                                            i33 = i25;
                                            if (i51 == 2) {
                                                int iZzh11 = zzbd.zzh(bArr4, i73, zzbcVar5);
                                                int i86 = zzbcVar5.zza;
                                                if (i86 < 0) {
                                                    throw zzdc.zzd();
                                                }
                                                if (i86 > bArr4.length - iZzh11) {
                                                    throw zzdc.zzg();
                                                }
                                                if (i86 == 0) {
                                                    zzczVar.add(zzbq.zzb);
                                                } else {
                                                    zzczVar.add(zzbq.zzl(bArr4, iZzh11, i86));
                                                    iZzh11 += i86;
                                                }
                                                while (iZzh11 < i41) {
                                                    int iZzh12 = zzbd.zzh(bArr4, iZzh11, zzbcVar5);
                                                    if (i31 == zzbcVar5.zza) {
                                                        iZzh11 = zzbd.zzh(bArr4, iZzh12, zzbcVar5);
                                                        int i87 = zzbcVar5.zza;
                                                        if (i87 < 0) {
                                                            throw zzdc.zzd();
                                                        }
                                                        if (i87 > bArr4.length - iZzh11) {
                                                            throw zzdc.zzg();
                                                        }
                                                        if (i87 == 0) {
                                                            zzczVar.add(zzbq.zzb);
                                                        } else {
                                                            zzczVar.add(zzbq.zzl(bArr4, iZzh11, i87));
                                                            iZzh11 += i87;
                                                        }
                                                    } else {
                                                        iZzg = iZzh11;
                                                        i26 = i73;
                                                        zzefVar = this;
                                                        zzbcVar4 = zzbcVar5;
                                                        i43 = i32;
                                                        i28 = i33;
                                                        i27 = i31;
                                                        unsafe6 = unsafe7;
                                                        if (iZzg == i26) {
                                                        }
                                                    }
                                                }
                                                iZzg = iZzh11;
                                                i26 = i73;
                                                zzefVar = this;
                                                zzbcVar4 = zzbcVar5;
                                                i43 = i32;
                                                i28 = i33;
                                                i27 = i31;
                                                unsafe6 = unsafe7;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            zzefVar = this;
                                            i26 = i73;
                                            zzbcVar4 = zzbcVar5;
                                            i43 = i32;
                                            i28 = i33;
                                            i27 = i31;
                                            unsafe6 = unsafe7;
                                            iZzg = i26;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i31 = i71;
                                            if (i51 == 2) {
                                                iZzj = zzbd.zzf(bArr4, i73, zzczVar, zzbcVar9);
                                                zzbcVar5 = zzbcVar9;
                                                i32 = i72;
                                                i33 = i25;
                                            } else if (i51 == 0) {
                                                zzbcVar5 = zzbcVar9;
                                                i33 = i25;
                                                i32 = i72;
                                                iZzj = zzbd.zzj(i31, bArr, i73, i2, zzczVar, zzbcVar);
                                            } else {
                                                zzefVar = this;
                                                i27 = i31;
                                                i26 = i73;
                                                unsafe6 = unsafe7;
                                                i43 = i72;
                                                i28 = i25;
                                                zzbcVar4 = zzbcVar9;
                                                iZzg = i26;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            zzcw zzcwVarZzu2 = zzefVar.zzu(i32);
                                            zzff zzffVar = zzefVar.zzm;
                                            int i88 = zzeq.zza;
                                            if (zzcwVarZzu2 == null) {
                                                i34 = iZzj;
                                            } else if (zzczVar instanceof RandomAccess) {
                                                int size2 = zzczVar.size();
                                                i34 = iZzj;
                                                Object objZzo = null;
                                                int i89 = 0;
                                                for (int i90 = 0; i90 < size2; i90++) {
                                                    int iIntValue = ((Integer) zzczVar.get(i90)).intValue();
                                                    if (zzcwVarZzu2.zza(iIntValue)) {
                                                        if (i90 != i89) {
                                                            zzczVar.set(i89, Integer.valueOf(iIntValue));
                                                        }
                                                        i89++;
                                                    } else {
                                                        objZzo = zzeq.zzo(obj2, i33, iIntValue, objZzo, zzffVar);
                                                    }
                                                }
                                                if (i89 != size2) {
                                                    zzczVar.subList(i89, size2).clear();
                                                }
                                            } else {
                                                i34 = iZzj;
                                                Iterator it = zzczVar.iterator();
                                                Object objZzo2 = null;
                                                while (it.hasNext()) {
                                                    int iIntValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzcwVarZzu2.zza(iIntValue2)) {
                                                        objZzo2 = zzeq.zzo(obj2, i33, iIntValue2, objZzo2, zzffVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            zzefVar = this;
                                            iZzg = i34;
                                            i26 = i73;
                                            zzbcVar4 = zzbcVar5;
                                            i43 = i32;
                                            i28 = i33;
                                            i27 = i31;
                                            unsafe6 = unsafe7;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i31 = i71;
                                            if (i51 == 2) {
                                                zzct zzctVar3 = (zzct) zzczVar;
                                                iZzh = zzbd.zzh(bArr4, i73, zzbcVar9);
                                                int i91 = zzbcVar9.zza + iZzh;
                                                while (iZzh < i91) {
                                                    iZzh = zzbd.zzh(bArr4, iZzh, zzbcVar9);
                                                    zzctVar3.zzg(zzbu.zzb(zzbcVar9.zza));
                                                }
                                                if (iZzh != i91) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i51 == 0) {
                                                    zzct zzctVar4 = (zzct) zzczVar;
                                                    iZzh = zzbd.zzh(bArr4, i73, zzbcVar9);
                                                    zzctVar4.zzg(zzbu.zzb(zzbcVar9.zza));
                                                    while (iZzh < i41) {
                                                        int iZzh13 = zzbd.zzh(bArr4, iZzh, zzbcVar9);
                                                        if (i31 == zzbcVar9.zza) {
                                                            iZzh = zzbd.zzh(bArr4, iZzh13, zzbcVar9);
                                                            zzctVar4.zzg(zzbu.zzb(zzbcVar9.zza));
                                                        }
                                                    }
                                                }
                                                i27 = i31;
                                                i26 = i73;
                                                unsafe6 = unsafe7;
                                                i43 = i72;
                                                i28 = i25;
                                                zzbcVar4 = zzbcVar9;
                                                iZzg = i26;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            i27 = i31;
                                            i26 = i73;
                                            unsafe6 = unsafe7;
                                            i43 = i72;
                                            i28 = i25;
                                            zzbcVar4 = zzbcVar9;
                                            iZzg = iZzh;
                                            if (iZzg == i26) {
                                            }
                                            break;
                                        case 34:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                            if (i51 == 2) {
                                                zzdr zzdrVar5 = (zzdr) zzczVar;
                                                iZzh = zzbd.zzh(bArr4, i73, zzbcVar9);
                                                int i92 = zzbcVar9.zza + iZzh;
                                                while (iZzh < i92) {
                                                    iZzh = zzbd.zzk(bArr4, iZzh, zzbcVar9);
                                                    zzdrVar5.zzf(zzbu.zzc(zzbcVar9.zzb));
                                                }
                                                if (iZzh != i92) {
                                                    throw zzdc.zzg();
                                                }
                                                i26 = i73;
                                                i27 = i71;
                                                unsafe6 = unsafe7;
                                                i43 = i72;
                                                i28 = i25;
                                                zzbcVar4 = zzbcVar9;
                                                iZzg = iZzh;
                                                if (iZzg == i26) {
                                                }
                                            } else if (i51 == 0) {
                                                zzdr zzdrVar6 = (zzdr) zzczVar;
                                                iZzh = zzbd.zzk(bArr4, i73, zzbcVar9);
                                                zzdrVar6.zzf(zzbu.zzc(zzbcVar9.zzb));
                                                while (true) {
                                                    if (iZzh < i41) {
                                                        int iZzh14 = zzbd.zzh(bArr4, iZzh, zzbcVar9);
                                                        i31 = i71;
                                                        if (i31 == zzbcVar9.zza) {
                                                            iZzh = zzbd.zzk(bArr4, iZzh14, zzbcVar9);
                                                            zzdrVar6.zzf(zzbu.zzc(zzbcVar9.zzb));
                                                            i71 = i31;
                                                        }
                                                    } else {
                                                        i31 = i71;
                                                    }
                                                }
                                                i27 = i31;
                                                i26 = i73;
                                                unsafe6 = unsafe7;
                                                i43 = i72;
                                                i28 = i25;
                                                zzbcVar4 = zzbcVar9;
                                                iZzg = iZzh;
                                                if (iZzg == i26) {
                                                }
                                            } else {
                                                i26 = i73;
                                                i27 = i71;
                                                unsafe6 = unsafe7;
                                                i43 = i72;
                                                i28 = i25;
                                                zzbcVar4 = zzbcVar9;
                                                iZzg = i26;
                                                if (iZzg == i26) {
                                                }
                                            }
                                            break;
                                        default:
                                            i26 = i73;
                                            i27 = i71;
                                            unsafe6 = unsafe7;
                                            i43 = i72;
                                            i28 = i25;
                                            zzbcVar4 = zzbcVar9;
                                            if (i51 == 3) {
                                                int i93 = (i27 & (-8)) | 4;
                                                zzeo zzeoVarZzv = zzefVar.zzv(i43);
                                                iZzg = zzbd.zzc(zzeoVarZzv, bArr, i26, i2, i93, zzbcVar);
                                                zzczVar.add(zzbcVar4.zzc);
                                                while (iZzg < i41) {
                                                    int iZzh15 = zzbd.zzh(bArr4, iZzg, zzbcVar4);
                                                    if (i27 == zzbcVar4.zza) {
                                                        iZzg = zzbd.zzc(zzeoVarZzv, bArr, iZzh15, i2, i93, zzbcVar);
                                                        zzczVar.add(zzbcVar4.zzc);
                                                    }
                                                }
                                            }
                                            if (iZzg == i26) {
                                            }
                                            break;
                                    }
                                } else {
                                    zzbcVar6 = zzbcVar9;
                                    unsafe2 = unsafe7;
                                    i35 = i72;
                                    i36 = i71;
                                    if (iZzr != 50) {
                                        obj2 = obj;
                                        Unsafe unsafe9 = zzb;
                                        long j3 = iArr[i35 + 2] & 1048575;
                                        switch (iZzr) {
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                i38 = i35;
                                                i10 = i50;
                                                i45 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 1) {
                                                    iZzh2 = i39 + 8;
                                                    unsafe9.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzbd.zzn(bArr2, i39))));
                                                    unsafe9.putInt(obj2, j3, i10);
                                                } else {
                                                    iZzh2 = i39;
                                                }
                                                if (iZzh2 == i39) {
                                                    i4 = i3;
                                                    i7 = iZzh2;
                                                    i43 = i38;
                                                    break;
                                                } else {
                                                    i41 = i2;
                                                    i42 = i3;
                                                    zzbcVar8 = zzbcVar2;
                                                    bArr4 = bArr2;
                                                    i48 = i9;
                                                    i43 = 0;
                                                    i44 = i38;
                                                    i46 = i8;
                                                    unsafe6 = unsafe2;
                                                    int i94 = iZzh2;
                                                    i47 = i10;
                                                    iZzg = i94;
                                                }
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                                i38 = i35;
                                                i10 = i50;
                                                i45 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 5) {
                                                    iZzh2 = i39 + 4;
                                                    unsafe9.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzbd.zzb(bArr2, i39))));
                                                    unsafe9.putInt(obj2, j3, i10);
                                                }
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                                i38 = i35;
                                                i10 = i50;
                                                i45 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 0) {
                                                    iZzk = zzbd.zzk(bArr2, i39, zzbcVar2);
                                                    unsafe9.putObject(obj2, j, Long.valueOf(zzbcVar2.zzb));
                                                    unsafe9.putInt(obj2, j3, i10);
                                                    iZzh2 = iZzk;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                iZzh2 = i39;
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                            case 62:
                                                i38 = i35;
                                                i10 = i50;
                                                i45 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 0) {
                                                    iZzh2 = zzbd.zzh(bArr2, i39, zzbcVar2);
                                                    unsafe9.putObject(obj2, j, Integer.valueOf(zzbcVar2.zza));
                                                    unsafe9.putInt(obj2, j3, i10);
                                                }
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case 56:
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                                i38 = i35;
                                                i10 = i50;
                                                i45 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 1) {
                                                    iZzh2 = i39 + 8;
                                                    unsafe9.putObject(obj2, j, Long.valueOf(zzbd.zzn(bArr2, i39)));
                                                    unsafe9.putInt(obj2, j3, i10);
                                                }
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i38 = i35;
                                                i10 = i50;
                                                i45 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 5) {
                                                    iZzh2 = i39 + 4;
                                                    unsafe9.putObject(obj2, j, Integer.valueOf(zzbd.zzb(bArr2, i39)));
                                                    unsafe9.putInt(obj2, j3, i10);
                                                }
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case 58:
                                                i38 = i35;
                                                i10 = i50;
                                                i40 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 0) {
                                                    iZzk = zzbd.zzk(bArr2, i39, zzbcVar2);
                                                    i45 = i40;
                                                    unsafe9.putObject(obj2, j, Boolean.valueOf(zzbcVar2.zzb != 0));
                                                    unsafe9.putInt(obj2, j3, i10);
                                                    iZzh2 = iZzk;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                i45 = i40;
                                                iZzh2 = i39;
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case 59:
                                                i38 = i35;
                                                i10 = i50;
                                                i40 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i51 == 2) {
                                                    iZzh2 = zzbd.zzh(bArr2, i39, zzbcVar2);
                                                    int i95 = zzbcVar2.zza;
                                                    if (i95 == 0) {
                                                        unsafe9.putObject(obj2, j, "");
                                                    } else {
                                                        int i96 = iZzh2 + i95;
                                                        if ((i52 & 536870912) != 0 && !zzfu.zze(bArr2, iZzh2, i96)) {
                                                            throw zzdc.zzc();
                                                        }
                                                        unsafe9.putObject(obj2, j, new String(bArr2, iZzh2, i95, zzda.zzb));
                                                        iZzh2 = i96;
                                                    }
                                                    unsafe9.putInt(obj2, j3, i10);
                                                    i45 = i40;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                i45 = i40;
                                                iZzh2 = i39;
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i51 == 2) {
                                                    Object objZzy = zzefVar.zzy(obj2, i50, i35);
                                                    i39 = i73;
                                                    int iZzm = zzbd.zzm(objZzy, zzefVar.zzv(i35), bArr, i73, i2, zzbcVar);
                                                    zzefVar.zzG(obj2, i50, i35, objZzy);
                                                    iZzh2 = iZzm;
                                                    bArr2 = bArr3;
                                                    i38 = i35;
                                                    i10 = i50;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    if (iZzh2 == i39) {
                                                    }
                                                } else {
                                                    i39 = i73;
                                                    i38 = i35;
                                                    i10 = i50;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    iZzh2 = i39;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                break;
                                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i51 == 2) {
                                                    iZzh2 = zzbd.zza(bArr3, i73, zzbcVar7);
                                                    unsafe9.putObject(obj2, j, zzbcVar7.zzc);
                                                    unsafe9.putInt(obj2, j3, i50);
                                                    i38 = i35;
                                                    i10 = i50;
                                                    i39 = i73;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                i38 = i35;
                                                i10 = i50;
                                                i39 = i73;
                                                bArr2 = bArr3;
                                                zzbcVar2 = zzbcVar7;
                                                i45 = i36;
                                                iZzh2 = i39;
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i51 == 0) {
                                                    int iZzh16 = zzbd.zzh(bArr3, i73, zzbcVar7);
                                                    int i97 = zzbcVar7.zza;
                                                    zzcw zzcwVarZzu3 = zzefVar.zzu(i35);
                                                    if (zzcwVarZzu3 == null || zzcwVarZzu3.zza(i97)) {
                                                        unsafe9.putObject(obj2, j, Integer.valueOf(i97));
                                                        unsafe9.putInt(obj2, j3, i50);
                                                    } else {
                                                        zzd(obj).zzj(i36, Long.valueOf(i97));
                                                    }
                                                    iZzh2 = iZzh16;
                                                    i38 = i35;
                                                    i10 = i50;
                                                    i39 = i73;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                i38 = i35;
                                                i10 = i50;
                                                i39 = i73;
                                                bArr2 = bArr3;
                                                zzbcVar2 = zzbcVar7;
                                                i45 = i36;
                                                iZzh2 = i39;
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i51 == 0) {
                                                    iZzh2 = zzbd.zzh(bArr3, i73, zzbcVar7);
                                                    unsafe9.putObject(obj2, j, Integer.valueOf(zzbu.zzb(zzbcVar7.zza)));
                                                    unsafe9.putInt(obj2, j3, i50);
                                                    i38 = i35;
                                                    i10 = i50;
                                                    i39 = i73;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                i38 = i35;
                                                i10 = i50;
                                                i39 = i73;
                                                bArr2 = bArr3;
                                                zzbcVar2 = zzbcVar7;
                                                i45 = i36;
                                                iZzh2 = i39;
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                                zzbcVar7 = zzbcVar;
                                                if (i51 == 0) {
                                                    bArr3 = bArr;
                                                    iZzh2 = zzbd.zzk(bArr3, i73, zzbcVar7);
                                                    unsafe9.putObject(obj2, j, Long.valueOf(zzbu.zzc(zzbcVar7.zzb)));
                                                    unsafe9.putInt(obj2, j3, i50);
                                                    i38 = i35;
                                                    i10 = i50;
                                                    i39 = i73;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    if (iZzh2 == i39) {
                                                    }
                                                } else {
                                                    i38 = i35;
                                                    i10 = i50;
                                                    i39 = i73;
                                                    bArr2 = bArr;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    iZzh2 = i39;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i51 == 3) {
                                                    Object objZzy2 = zzefVar.zzy(obj2, i50, i35);
                                                    zzbcVar7 = zzbcVar;
                                                    int iZzl2 = zzbd.zzl(objZzy2, zzefVar.zzv(i35), bArr, i73, i2, (i36 & (-8)) | 4, zzbcVar);
                                                    zzefVar.zzG(obj2, i50, i35, objZzy2);
                                                    i38 = i35;
                                                    i10 = i50;
                                                    i39 = i73;
                                                    iZzh2 = iZzl2;
                                                    bArr2 = bArr;
                                                    zzbcVar2 = zzbcVar7;
                                                    i45 = i36;
                                                    if (iZzh2 == i39) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i38 = i35;
                                                i10 = i50;
                                                i45 = i36;
                                                i39 = i73;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                iZzh2 = i39;
                                                if (iZzh2 == i39) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i51 == 2) {
                                            Unsafe unsafe10 = zzb;
                                            Object objZzw = zzefVar.zzw(i35);
                                            Object object = unsafe10.getObject(obj, j);
                                            if (!((zzdw) object).zze()) {
                                                zzdw zzdwVarZzb = zzdw.zza().zzb();
                                                zzdx.zza(zzdwVarZzb, object);
                                                unsafe10.putObject(obj, j, zzdwVarZzb);
                                            }
                                            throw null;
                                        }
                                        i37 = i73;
                                        obj2 = obj;
                                        i4 = i3;
                                        i43 = i35;
                                        i10 = i50;
                                        i45 = i36;
                                        i7 = i37;
                                        zzbcVar2 = zzbcVar6;
                                    }
                                }
                                if (i45 != i4) {
                                }
                                if (zzefVar.zzh) {
                                }
                            } else if (i51 == 2) {
                                zzcz zzczVarZzd2 = (zzcz) unsafe7.getObject(obj2, j);
                                if (!zzczVarZzd2.zzc()) {
                                    int size3 = zzczVarZzd2.size();
                                    zzczVarZzd2 = zzczVarZzd2.zzd(size3 != 0 ? size3 + size3 : 10);
                                    unsafe7.putObject(obj2, j, zzczVarZzd2);
                                }
                                int iZze2 = zzbd.zze(zzefVar.zzv(i72), i71, bArr, i73, i2, zzczVarZzd2, zzbcVar);
                                i42 = i3;
                                zzbcVar8 = zzbcVar9;
                                i41 = i41;
                                i47 = i50;
                                unsafe6 = unsafe7;
                                i44 = i72;
                                iZzg = iZze2;
                                i48 = i9;
                                i43 = 0;
                                i45 = i71;
                                i46 = i8;
                            } else {
                                unsafe2 = unsafe7;
                                i36 = i71;
                                zzbcVar6 = zzbcVar9;
                                i35 = i72;
                                i37 = i73;
                                i4 = i3;
                                i43 = i35;
                                i10 = i50;
                                i45 = i36;
                                i7 = i37;
                                zzbcVar2 = zzbcVar6;
                            }
                        }
                    }
                    if (i45 != i4) {
                    }
                    if (zzefVar.zzh) {
                    }
                } else {
                    iZzq = zzefVar.zzq(i50, i43);
                }
                i6 = iZzq;
                i5 = -1;
                if (i6 != i5) {
                }
                if (i45 != i4) {
                }
                if (zzefVar.zzh) {
                }
            } else {
                i4 = i42;
                unsafe = unsafe6;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzu(Integer.MAX_VALUE);
                zzcsVar.zza = 0;
                zzcsVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzs = zzs(i);
                int i2 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j = i2;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
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
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                this.zzl.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfp.zzo(obj, j, zzfp.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzfp.zzp(obj, j, zzfp.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzfp.zzm(obj, j, zzfp.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
                    break;
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
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzeq.zza;
                    zzfp.zzs(obj, j, zzdx.zza(zzfp.zzf(obj, j), zzfp.zzf(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzfx zzfxVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        Map.Entry entry2;
        int i2;
        Iterator it2;
        int[] iArr;
        boolean z;
        boolean z2;
        Map.Entry entry3;
        if (this.zzh) {
            zzci zzciVarZzb = this.zzn.zzb(obj);
            if (zzciVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzciVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        }
        int[] iArr2 = this.zzc;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < iArr2.length) {
            int iZzs = zzs(i5);
            int[] iArr3 = this.zzc;
            int iZzr = zzr(iZzs);
            int i6 = iArr3[i5];
            if (iZzr <= 17) {
                int i7 = iArr3[i5 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i3) {
                    if (i8 == 1048575) {
                        entry3 = entry;
                        i4 = 0;
                    } else {
                        entry3 = entry;
                        i4 = unsafe.getInt(obj, i8);
                    }
                    i3 = i8;
                } else {
                    entry3 = entry;
                }
                i2 = 1 << (i7 >>> 20);
                i = i4;
                entry2 = entry3;
            } else {
                i = i4;
                entry2 = entry;
                i2 = 0;
            }
            int i9 = i3;
            while (entry2 != null && this.zzn.zza(entry2) <= i6) {
                this.zzn.zze(zzfxVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzs & 1048575;
            switch (iZzr) {
                case 0:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzf(i6, zzfp.zza(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 1:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzo(i6, zzfp.zzb(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 2:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzt(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 3:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzK(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 4:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzr(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 5:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzm(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 6:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzk(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 7:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzb(i6, zzfp.zzw(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 8:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzO(i6, unsafe.getObject(obj, j), zzfxVar);
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 9:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzv(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 10:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzd(i6, (zzbq) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 11:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzI(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 12:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzi(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 13:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzx(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 14:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzz(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 15:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzB(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 16:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzD(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 17:
                    it2 = it;
                    iArr = iArr2;
                    if (zzJ(obj, i5, i9, i, i2)) {
                        zzfxVar.zzq(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 18:
                    z = false;
                    zzeq.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 19:
                    z = false;
                    zzeq.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 20:
                    z = false;
                    zzeq.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 21:
                    z = false;
                    zzeq.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 22:
                    z = false;
                    zzeq.zzy(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 23:
                    z = false;
                    zzeq.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 24:
                    z = false;
                    zzeq.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 25:
                    z = false;
                    zzeq.zzs(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 26:
                    int i10 = this.zzc[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    int i11 = zzeq.zza;
                    if (list != null && !list.isEmpty()) {
                        zzfxVar.zzH(i10, list);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case 27:
                    int i12 = this.zzc[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv = zzv(i5);
                    int i13 = zzeq.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            ((zzbz) zzfxVar).zzv(i12, list2.get(i14), zzeoVarZzv);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case 28:
                    int i15 = this.zzc[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzeq.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzfxVar.zze(i15, list3);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    z2 = false;
                    zzeq.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 30:
                    z2 = false;
                    zzeq.zzu(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    z2 = false;
                    zzeq.zzA(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 32:
                    z2 = false;
                    zzeq.zzB(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 33:
                    z2 = false;
                    zzeq.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 34:
                    z2 = false;
                    zzeq.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 35:
                    zzeq.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 36:
                    zzeq.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 37:
                    zzeq.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 38:
                    zzeq.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 39:
                    zzeq.zzy(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 40:
                    zzeq.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 41:
                    zzeq.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 42:
                    zzeq.zzs(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 43:
                    zzeq.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 44:
                    zzeq.zzu(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 45:
                    zzeq.zzA(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 46:
                    zzeq.zzB(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 47:
                    zzeq.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzeq.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    int i17 = this.zzc[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv2 = zzv(i5);
                    int i18 = zzeq.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            ((zzbz) zzfxVar).zzq(i17, list4.get(i19), zzeoVarZzv2);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzf(i6, zzm(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzo(i6, zzn(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzt(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzK(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzr(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 56:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzm(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 57:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzk(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 58:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzb(i6, zzN(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 59:
                    if (zzM(obj, i6, i5)) {
                        zzO(i6, unsafe.getObject(obj, j), zzfxVar);
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzv(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzd(i6, (zzbq) unsafe.getObject(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 62:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzI(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzi(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 64:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzx(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzz(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzB(i6, zzo(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzD(i6, zzt(obj, j));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 68:
                    if (zzM(obj, i6, i5)) {
                        zzfxVar.zzq(i6, unsafe.getObject(obj, j), zzv(i5));
                    }
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                default:
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
            }
        }
        Iterator it3 = it;
        while (entry != null) {
            this.zzn.zze(zzfxVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zzff zzffVar = this.zzm;
        zzffVar.zzj(zzffVar.zzd(obj), zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzfp.zza(obj, j)) != Double.doubleToLongBits(zzfp.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzfp.zzb(obj, j)) != Float.floatToIntBits(zzfp.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzfp.zzw(obj, j) != zzfp.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 50:
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 68:
                    long jZzp = zzp(i) & 1048575;
                    if (zzfp.zzc(obj, jZzp) != zzfp.zzc(obj2, jZzp) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int iZzs = zzs(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & iZzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, iZzs, zzv(i6))) {
                    return false;
                }
            } else if (iZzr == 27) {
                List list = (List) zzfp.zzf(obj, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzeo zzeoVarZzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzeoVarZzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj, i7, i6) && !zzK(obj, iZzs, zzv(i6))) {
                    return false;
                }
            } else if (iZzr != 49) {
                if (iZzr == 50 && !((zzdw) zzfp.zzf(obj, iZzs & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || this.zzn.zzb(obj).zzj();
    }
}
