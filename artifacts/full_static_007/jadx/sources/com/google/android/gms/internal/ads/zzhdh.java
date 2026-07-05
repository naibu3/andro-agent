package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhdh<T> implements zzhdz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhfa.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhde zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhcs zzm;
    private final zzheq zzn;
    private final zzhaz zzo;
    private final zzhdk zzp;
    private final zzhcz zzq;

    private zzhdh(int[] iArr, Object[] objArr, int i, int i2, zzhde zzhdeVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzhdk zzhdkVar, zzhcs zzhcsVar, zzheq zzheqVar, zzhaz zzhazVar, zzhcz zzhczVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhdeVar instanceof zzhbo;
        boolean z2 = false;
        if (zzhazVar != null && zzhazVar.zzj(zzhdeVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzhdkVar;
        this.zzm = zzhcsVar;
        this.zzn = zzheqVar;
        this.zzo = zzhazVar;
        this.zzg = zzhdeVar;
        this.zzq = zzhczVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhdz zzhdzVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzhdzVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhdzVarZzx.zze();
        if (object != null) {
            zzhdzVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzhdz zzhdzVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzhdzVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzhdzVarZzx.zze();
        if (object != null) {
            zzhdzVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhdz zzhdzVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhdzVarZzx.zze();
                    zzhdzVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzhdzVarZzx.zze();
                zzhdzVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzhdzVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzhdz zzhdzVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzhdzVarZzx.zze();
                    zzhdzVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzhdzVarZzx.zze();
                zzhdzVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzhdzVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzhdr zzhdrVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzhfa.zzv(obj, j, zzhdrVar.zzu());
        } else if (this.zzi) {
            zzhfa.zzv(obj, j, zzhdrVar.zzt());
        } else {
            zzhfa.zzv(obj, j, zzhdrVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzhfa.zzt(obj, j, (1 << (iZzr >>> 20)) | zzhfa.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhfa.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzhfa.zzd(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhfa.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhfa.zzc(obj, j2)) != 0;
            case 2:
                return zzhfa.zzf(obj, j2) != 0;
            case 3:
                return zzhfa.zzf(obj, j2) != 0;
            case 4:
                return zzhfa.zzd(obj, j2) != 0;
            case 5:
                return zzhfa.zzf(obj, j2) != 0;
            case 6:
                return zzhfa.zzd(obj, j2) != 0;
            case 7:
                return zzhfa.zzz(obj, j2);
            case 8:
                Object objZzh = zzhfa.zzh(obj, j2);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzhac) {
                    return !zzhac.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhfa.zzh(obj, j2) != null;
            case 10:
                return !zzhac.zzb.equals(zzhfa.zzh(obj, j2));
            case 11:
                return zzhfa.zzd(obj, j2) != 0;
            case 12:
                return zzhfa.zzd(obj, j2) != 0;
            case 13:
                return zzhfa.zzd(obj, j2) != 0;
            case 14:
                return zzhfa.zzf(obj, j2) != 0;
            case 15:
                return zzhfa.zzd(obj, j2) != 0;
            case 16:
                return zzhfa.zzf(obj, j2) != 0;
            case 17:
                return zzhfa.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhdz zzhdzVar) {
        return zzhdzVar.zzl(zzhfa.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhbo) {
            return ((zzhbo) obj).zzce();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhfa.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhfa.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzhfi zzhfiVar) throws IOException {
        if (obj instanceof String) {
            zzhfiVar.zzG(i, (String) obj);
        } else {
            zzhfiVar.zzd(i, (zzhac) obj);
        }
    }

    static zzher zzd(Object obj) {
        zzhbo zzhboVar = (zzhbo) obj;
        zzher zzherVar = zzhboVar.zzt;
        if (zzherVar != zzher.zzc()) {
            return zzherVar;
        }
        zzher zzherVarZzf = zzher.zzf();
        zzhboVar.zzt = zzherVarZzf;
        return zzherVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzhdh zzm(Class cls, zzhdb zzhdbVar, zzhdk zzhdkVar, zzhcs zzhcsVar, zzheq zzheqVar, zzhaz zzhazVar, zzhcz zzhczVar) {
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
        zzhdq zzhdqVar;
        int iObjectFieldOffset;
        String str;
        int i19;
        int i20;
        int i21;
        int iObjectFieldOffset2;
        Field fieldZzC;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzC2;
        Object obj2;
        Field fieldZzC3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        if (!(zzhdbVar instanceof zzhdq)) {
            throw null;
        }
        zzhdq zzhdqVar2 = (zzhdq) zzhdbVar;
        String strZzd = zzhdqVar2.zzd();
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
        Object[] objArrZze = zzhdqVar2.zze();
        Class<?> cls2 = zzhdqVar2.zza().getClass();
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
                        if (zzhdqVar2.zzc() == 1 || i73 != 0) {
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
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i83] = fieldZzC2;
                    } else {
                        fieldZzC2 = (Field) obj;
                    }
                    i17 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    int i84 = i83 + 1;
                    obj2 = objArrZze[i84];
                    if (obj2 instanceof Field) {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i84] = fieldZzC3;
                    } else {
                        fieldZzC3 = (Field) obj2;
                    }
                    zzhdqVar = zzhdqVar2;
                    str = strZzd;
                    i21 = i2;
                    i19 = i79;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                    i20 = 0;
                }
                i2 = i25;
                int i832 = iCharAt12 + iCharAt12;
                obj = objArrZze[i832];
                if (obj instanceof Field) {
                }
                i17 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC2);
                int i842 = i832 + 1;
                obj2 = objArrZze[i842];
                if (obj2 instanceof Field) {
                }
                zzhdqVar = zzhdqVar2;
                str = strZzd;
                i21 = i2;
                i19 = i79;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC3);
                i20 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i85 = i2 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i2]);
                if (i72 == 9 || i72 == 17) {
                    zzhdqVar = zzhdqVar2;
                    int i86 = i61 / 3;
                    objArr[i86 + i86 + 1] = fieldZzC4.getType();
                } else {
                    if (i72 == 27) {
                        zzhdqVar = zzhdqVar2;
                        i22 = 1;
                        i23 = i2 + 2;
                    } else if (i72 == 49) {
                        i23 = i2 + 2;
                        zzhdqVar = zzhdqVar2;
                        i22 = 1;
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        zzhdqVar = zzhdqVar2;
                        if (zzhdqVar2.zzc() == 1 || i73 != 0) {
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
                        zzhdqVar = zzhdqVar2;
                    }
                    int i92 = i61 / 3;
                    objArr[i92 + i92 + i22] = objArrZze[i85];
                    i85 = i23;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC4);
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
                        fieldZzC = (Field) obj3;
                    } else {
                        fieldZzC = zzC(cls2, (String) obj3);
                        objArrZze[i96] = fieldZzC;
                    }
                    i20 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC);
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
            zzhdqVar2 = zzhdqVar;
            strZzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzhdq zzhdqVar3 = zzhdqVar2;
        return new zzhdh(iArr2, objArr, i3, i6, zzhdqVar3.zza(), zzhdqVar3.zzc(), false, iArr, i4, i58, zzhdkVar, zzhcsVar, zzheqVar, zzhazVar, zzhczVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhfa.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhfa.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhfa.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
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

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhfa.zzh(obj, j)).longValue();
    }

    private final zzhbu zzw(int i) {
        int i2 = i / 3;
        return (zzhbu) this.zzd[i2 + i2 + 1];
    }

    private final zzhdz zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhdz zzhdzVar = (zzhdz) objArr[i3];
        if (zzhdzVar != null) {
            return zzhdzVar;
        }
        zzhdz zzhdzVarZzb = zzhdo.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzhdzVarZzb;
        return zzhdzVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzheq zzheqVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzh = zzhfa.zzh(obj, zzu(i) & 1048575);
        if (objZzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x054e  */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.google.android.gms.internal.ads.zzhcm] */
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
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int iZzD;
        int iZzD2;
        int iZzD3;
        int iZzE;
        int iZzD4;
        int iZzD5;
        int iZzd;
        int iZzD6;
        int size;
        int iZzD7;
        ?? Zzg;
        int iZzC;
        int iZzC2;
        ?? ZzD;
        int iZzA;
        ?? ZzD2;
        ?? ZzD3;
        int iZze;
        int iZzD8;
        int iZzD9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r1 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int iZzu = zzu(i4);
            int iZzt = zzt(iZzu);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (iZzt <= 17) {
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
            int i10 = iZzu & i3;
            if (iZzt >= zzhbe.DOUBLE_LIST_PACKED.zza()) {
                zzhbe.SINT64_LIST_PACKED.zza();
            }
            long j = i10;
            switch (iZzt) {
                case 0:
                    if (zzO(obj, i4, i, i2, r5)) {
                        iZzD = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD + 8;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        iZzD2 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD2 + 4;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(j2);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(j3);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(j4);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        iZzD = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD + 8;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        iZzD2 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD2 + 4;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        iZzD4 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD4 + 1;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzhac) {
                            iZzD5 = zzhat.zzD(i11);
                            iZzd = ((zzhac) object).zzd();
                            iZzD6 = zzhat.zzD(iZzd);
                            ZzD3 = iZzD5 + iZzD6 + iZzd;
                            i5 += ZzD3;
                            i4 += 3;
                            i6 = i;
                            r1 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            iZzD3 = zzhat.zzD(i11);
                            iZzE = zzhat.zzC((String) object);
                            ZzD3 = iZzD3 + iZzE;
                            i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        ZzD3 = zzheb.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzhac zzhacVar = (zzhac) unsafe.getObject(obj, j);
                        iZzD5 = zzhat.zzD(i7 << 3);
                        iZzd = zzhacVar.zzd();
                        iZzD6 = zzhat.zzD(iZzd);
                        ZzD3 = iZzD5 + iZzD6 + iZzd;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzD(i12);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(j5);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        iZzD2 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD2 + 4;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        iZzD = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD + 8;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzD((i13 >> 31) ^ (i13 + i13));
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE((j6 >> 63) ^ (j6 + j6));
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzO(obj, i4, i, i2, r5)) {
                        ZzD3 = zzhat.zzy(i7, (zzhde) unsafe.getObject(obj, j), zzx(i4));
                        i5 += ZzD3;
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
                    ZzD3 = zzheb.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 19:
                    ZzD3 = zzheb.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zzheb.zza;
                    Zzg = list.size() == 0 ? z : zzheb.zzg(list) + (list.size() * zzhat.zzD(i7 << 3));
                    i5 += Zzg;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zzheb.zza;
                    size = list2.size();
                    if (size != 0) {
                        iZzD3 = zzheb.zzl(list2);
                        iZzD7 = zzhat.zzD(i7 << 3);
                        iZzE = size * iZzD7;
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzheb.zza;
                    size = list3.size();
                    if (size != 0) {
                        iZzD3 = zzheb.zzf(list3);
                        iZzD7 = zzhat.zzD(i7 << 3);
                        iZzE = size * iZzD7;
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 23:
                    ZzD3 = zzheb.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 24:
                    ZzD3 = zzheb.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zzheb.zza;
                    int size2 = list4.size();
                    ZzD3 = size2 == 0 ? z : size2 * (zzhat.zzD(i7 << 3) + 1);
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 26:
                    ?? r0 = (List) unsafe.getObject(obj, j);
                    int i18 = zzheb.zza;
                    int size3 = r0.size();
                    if (size3 != 0) {
                        int iZzD10 = zzhat.zzD(i7 << 3) * size3;
                        if (r0 instanceof zzhcm) {
                            ?? r02 = (zzhcm) r0;
                            Zzg = iZzD10;
                            for (?? r3 = z; r3 < size3; r3++) {
                                Object objZze = r02.zze(r3);
                                if (objZze instanceof zzhac) {
                                    int iZzd2 = ((zzhac) objZze).zzd();
                                    iZzC2 = Zzg + zzhat.zzD(iZzd2) + iZzd2;
                                } else {
                                    iZzC2 = Zzg + zzhat.zzC((String) objZze);
                                }
                                Zzg = iZzC2;
                            }
                        } else {
                            Zzg = iZzD10;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object obj2 = r0.get(r32);
                                if (obj2 instanceof zzhac) {
                                    int iZzd3 = ((zzhac) obj2).zzd();
                                    iZzC = Zzg + zzhat.zzD(iZzd3) + iZzd3;
                                } else {
                                    iZzC = Zzg + zzhat.zzC((String) obj2);
                                }
                                Zzg = iZzC;
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
                    zzhdz zzhdzVarZzx = zzx(i4);
                    int i19 = zzheb.zza;
                    int size4 = r03.size();
                    if (size4 == 0) {
                        ZzD = z;
                    } else {
                        ZzD = zzhat.zzD(i7 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r03.get(r42);
                            if (obj3 instanceof zzhck) {
                                int iZza = ((zzhck) obj3).zza();
                                iZzA = (ZzD == true ? 1 : 0) + zzhat.zzD(iZza) + iZza;
                            } else {
                                iZzA = (ZzD == true ? 1 : 0) + zzhat.zzA((zzhde) obj3, zzhdzVarZzx);
                            }
                            ZzD = iZzA;
                        }
                    }
                    i5 += ZzD;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 28:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    int i20 = zzheb.zza;
                    int size5 = r04.size();
                    if (size5 == 0) {
                        ZzD2 = z;
                    } else {
                        ZzD2 = size5 * zzhat.zzD(i7 << 3);
                        for (?? r2 = z; r2 < r04.size(); r2++) {
                            int iZzd4 = ((zzhac) r04.get(r2)).zzd();
                            ZzD2 += zzhat.zzD(iZzd4) + iZzd4;
                        }
                    }
                    i5 += ZzD2;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i21 = zzheb.zza;
                    size = list5.size();
                    if (size != 0) {
                        iZzD3 = zzheb.zzk(list5);
                        iZzD7 = zzhat.zzD(i7 << 3);
                        iZzE = size * iZzD7;
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i22 = zzheb.zza;
                    size = list6.size();
                    if (size != 0) {
                        iZzD3 = zzheb.zza(list6);
                        iZzD7 = zzhat.zzD(i7 << 3);
                        iZzE = size * iZzD7;
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    ZzD3 = zzheb.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 32:
                    ZzD3 = zzheb.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zzheb.zza;
                    size = list7.size();
                    if (size != 0) {
                        iZzD3 = zzheb.zzi(list7);
                        iZzD7 = zzhat.zzD(i7 << 3);
                        iZzE = size * iZzD7;
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzheb.zza;
                    size = list8.size();
                    if (size != 0) {
                        iZzD3 = zzheb.zzj(list8);
                        iZzD7 = zzhat.zzD(i7 << 3);
                        iZzE = size * iZzD7;
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
                        i4 += 3;
                        i6 = i;
                        r1 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    i5 += ZzD3;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 35:
                    iZze = zzheb.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzg((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzl((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzf((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    int i25 = zzheb.zza;
                    iZze = list9.size();
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzk((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zza((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzc((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zze((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzi((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    iZze = zzheb.zzj((List) unsafe.getObject(obj, j));
                    if (iZze > 0) {
                        iZzD8 = zzhat.zzD(i7 << 3);
                        iZzD9 = zzhat.zzD(iZze);
                        ZzD2 = iZzD8 + iZzD9 + iZze;
                        i5 += ZzD2;
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
                    zzhdz zzhdzVarZzx2 = zzx(i4);
                    int i26 = zzheb.zza;
                    int size6 = r05.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z2 = z;
                        r4 = z2;
                        ?? r33 = z2;
                        while (r33 < size6) {
                            int iZzy = zzhat.zzy(i7, (zzhde) r05.get(r33), zzhdzVarZzx2);
                            r33++;
                            r4 = (r4 == true ? 1 : 0) + iZzy;
                        }
                    }
                    i5 += r4;
                    i4 += 3;
                    i6 = i;
                    r1 = i2;
                    z = false;
                    i3 = 1048575;
                case 50:
                    zzhcy zzhcyVar = (zzhcy) unsafe.getObject(obj, j);
                    if (zzhcyVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzhcyVar.entrySet().iterator();
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
                    if (zzR(obj, i7, i4)) {
                        iZzD = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD + 8;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        iZzD2 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD2 + 4;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        long jZzv = zzv(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(jZzv);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        long jZzv2 = zzv(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(jZzv2);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        long jZzp = zzp(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(jZzp);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        iZzD = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD + 8;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        iZzD2 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD2 + 4;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        iZzD4 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD4 + 1;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        int i27 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzhac) {
                            iZzD5 = zzhat.zzD(i27);
                            iZzd = ((zzhac) object2).zzd();
                            iZzD6 = zzhat.zzD(iZzd);
                            ZzD3 = iZzD5 + iZzD6 + iZzd;
                            i5 += ZzD3;
                            i4 += 3;
                            i6 = i;
                            r1 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            iZzD3 = zzhat.zzD(i27);
                            iZzE = zzhat.zzC((String) object2);
                            ZzD3 = iZzD3 + iZzE;
                            i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        ZzD3 = zzheb.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        zzhac zzhacVar2 = (zzhac) unsafe.getObject(obj, j);
                        iZzD5 = zzhat.zzD(i7 << 3);
                        iZzd = zzhacVar2.zzd();
                        iZzD6 = zzhat.zzD(iZzd);
                        ZzD3 = iZzD5 + iZzD6 + iZzd;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        int iZzp = zzp(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzD(iZzp);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        long jZzp2 = zzp(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE(jZzp2);
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        iZzD2 = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD2 + 4;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        iZzD = zzhat.zzD(i7 << 3);
                        ZzD3 = iZzD + 8;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        int iZzp2 = zzp(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzD((iZzp2 >> 31) ^ (iZzp2 + iZzp2));
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        long jZzv3 = zzv(obj, j);
                        iZzD3 = zzhat.zzD(i7 << 3);
                        iZzE = zzhat.zzE((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        ZzD3 = iZzD3 + iZzE;
                        i5 += ZzD3;
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
                    if (zzR(obj, i7, i4)) {
                        ZzD3 = zzhat.zzy(i7, (zzhde) unsafe.getObject(obj, j), zzx(i4));
                        i5 += ZzD3;
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
        zzheq zzheqVar = this.zzn;
        int iZza2 = i5 + zzheqVar.zza(zzheqVar.zzd(obj));
        if (!this.zzh) {
            return iZza2;
        }
        zzhbd zzhbdVarZzb = this.zzo.zzb(obj);
        int iZzc = 0;
        for (int i28 = 0; i28 < zzhbdVarZzb.zza.zzb(); i28++) {
            Map.Entry entryZzg = zzhbdVarZzb.zza.zzg(i28);
            iZzc += zzhbd.zzc((zzhbc) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzhbdVarZzb.zza.zzc()) {
            iZzc += zzhbd.zzc((zzhbc) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhfa.zzb(obj, j));
                    byte[] bArr = zzhcb.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhfa.zzc(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhfa.zzf(obj, j);
                    byte[] bArr2 = zzhcb.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhfa.zzf(obj, j);
                    byte[] bArr3 = zzhcb.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhfa.zzf(obj, j);
                    byte[] bArr4 = zzhcb.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzhcb.zza(zzhfa.zzz(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzhfa.zzh(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzh = zzhfa.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhfa.zzf(obj, j);
                    byte[] bArr5 = zzhcb.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzd(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzhfa.zzf(obj, j);
                    byte[] bArr6 = zzhcb.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzh2 = zzhfa.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
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
                    iFloatToIntBits = zzhfa.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzhfa.zzh(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzhcb.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzhcb.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzhcb.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzhcb.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhcb.zza(zzS(obj, j));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzhfa.zzh(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhfa.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhfa.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzhcb.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzp(obj, j);
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzhcb.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzhfa.zzh(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzo.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:484:0x0b6d, code lost:
    
        if (r5 == r0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b6f, code lost:
    
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b73, code lost:
    
        r11 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b78, code lost:
    
        if (r11 >= r12.zzl) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b7a, code lost:
    
        zzy(r34, r12.zzj[r11], null, r12.zzn, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b8d, code lost:
    
        if (r9 != 0) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b8f, code lost:
    
        if (r6 != r10) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0b96, code lost:
    
        throw com.google.android.gms.internal.ads.zzhcd.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b97, code lost:
    
        if (r6 > r10) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b99, code lost:
    
        if (r8 != r9) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b9b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0ba0, code lost:
    
        throw com.google.android.gms.internal.ads.zzhcd.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0836 A[PHI: r7 r8 r9 r10 r11 r14
      0x0836: PHI (r7v24 int) = (r7v6 int), (r7v8 int), (r7v9 int), (r7v14 int), (r7v18 int), (r7v22 int), (r7v28 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r8v98 int) = (r8v41 int), (r8v43 int), (r8v44 int), (r8v73 int), (r8v89 int), (r8v96 int), (r8v101 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r9v63 int) = (r9v35 int), (r9v37 int), (r9v38 int), (r9v51 int), (r9v59 int), (r9v61 int), (r9v66 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r10v72 int) = (r10v40 int), (r10v42 int), (r10v43 int), (r10v45 int), (r10v57 int), (r10v64 int), (r10v76 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r11v42 int) = (r11v20 int), (r11v22 int), (r11v23 int), (r11v25 int), (r11v34 int), (r11v40 int), (r11v46 int) binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]
      0x0836: PHI (r14v44 sun.misc.Unsafe) = 
      (r14v23 sun.misc.Unsafe)
      (r14v25 sun.misc.Unsafe)
      (r14v26 sun.misc.Unsafe)
      (r14v28 sun.misc.Unsafe)
      (r14v36 sun.misc.Unsafe)
      (r14v42 sun.misc.Unsafe)
      (r14v47 sun.misc.Unsafe)
     binds: [B:368:0x07ed, B:352:0x0797, B:336:0x0748, B:261:0x05f4, B:212:0x0529, B:179:0x0497, B:138:0x0392] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0ae3 A[PHI: r8 r10 r11 r12 r36
      0x0ae3: PHI (r8v123 com.google.android.gms.internal.ads.zzgzn) = 
      (r8v104 com.google.android.gms.internal.ads.zzgzn)
      (r8v105 com.google.android.gms.internal.ads.zzgzn)
      (r8v106 com.google.android.gms.internal.ads.zzgzn)
      (r8v107 com.google.android.gms.internal.ads.zzgzn)
      (r8v108 com.google.android.gms.internal.ads.zzgzn)
      (r8v109 com.google.android.gms.internal.ads.zzgzn)
      (r8v110 com.google.android.gms.internal.ads.zzgzn)
      (r8v111 com.google.android.gms.internal.ads.zzgzn)
      (r8v112 com.google.android.gms.internal.ads.zzgzn)
      (r8v116 com.google.android.gms.internal.ads.zzgzn)
      (r8v124 com.google.android.gms.internal.ads.zzgzn)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r10v101 int) = 
      (r10v80 int)
      (r10v81 int)
      (r10v82 int)
      (r10v83 int)
      (r10v84 int)
      (r10v85 int)
      (r10v86 int)
      (r10v87 int)
      (r10v88 int)
      (r10v94 int)
      (r10v102 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r11v64 int) = 
      (r11v48 int)
      (r11v49 int)
      (r11v50 int)
      (r11v51 int)
      (r11v52 int)
      (r11v53 int)
      (r11v54 int)
      (r11v55 int)
      (r11v56 int)
      (r11v59 int)
      (r11v65 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r12v34 int) = 
      (r12v15 int)
      (r12v16 int)
      (r12v17 int)
      (r12v18 int)
      (r12v19 int)
      (r12v20 int)
      (r12v21 int)
      (r12v22 int)
      (r12v23 int)
      (r12v27 int)
      (r12v35 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]
      0x0ae3: PHI (r36v21 int) = 
      (r36v3 int)
      (r36v4 int)
      (r36v5 int)
      (r36v6 int)
      (r36v7 int)
      (r36v8 int)
      (r36v9 int)
      (r36v10 int)
      (r36v14 int)
      (r36v16 int)
      (r36v22 int)
     binds: [B:463:0x0acc, B:460:0x0aaa, B:457:0x0a8c, B:454:0x0a6e, B:451:0x0a50, B:448:0x0a31, B:441:0x0a09, B:439:0x09fb, B:424:0x09b0, B:420:0x097d, B:396:0x08a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0839 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0ae6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x084a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0af9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgzn zzgznVar) throws IOException {
        zzhdh<T> zzhdhVar;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzq;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        zzgzn zzgznVar2;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe3;
        int i17;
        int i18;
        int i19;
        int i20;
        int iZzk;
        int i21;
        int i22;
        int i23;
        Unsafe unsafe4;
        int i24;
        int i25;
        int i26;
        long j;
        int i27;
        int i28;
        int i29;
        Unsafe unsafe5;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Unsafe unsafe6;
        int i36;
        int iZzf;
        Object obj2;
        int i37;
        int i38;
        Unsafe unsafe7;
        int i39;
        int iZzj;
        int i40;
        int i41;
        int i42;
        zzhdh<T> zzhdhVar2 = this;
        Object obj3 = obj;
        int i43 = i2;
        int i44 = i3;
        zzgzn zzgznVar3 = zzgznVar;
        zzD(obj);
        Unsafe unsafe8 = zzb;
        int i45 = -1;
        int iZzg = i;
        int i46 = -1;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 1048575;
        while (true) {
            if (iZzg < i43) {
                int i51 = iZzg + 1;
                int i52 = bArr[iZzg];
                if (i52 < 0) {
                    int iZzi = zzgzo.zzi(i52, bArr, i51, zzgznVar3);
                    i9 = zzgznVar3.zza;
                    i51 = iZzi;
                } else {
                    i9 = i52;
                }
                int i53 = i9 >>> 3;
                if (i53 > i46) {
                    iZzq = (i53 < zzhdhVar2.zze || i53 > zzhdhVar2.zzf) ? i45 : zzhdhVar2.zzs(i53, i47 / 3);
                } else {
                    iZzq = zzhdhVar2.zzq(i53);
                }
                int i54 = iZzq;
                if (i54 != i45) {
                    int i55 = i9 & 7;
                    int[] iArr = zzhdhVar2.zzc;
                    int i56 = iArr[i54 + 1];
                    int i57 = i53;
                    int iZzt = zzt(i56);
                    long j2 = i56 & 1048575;
                    int i58 = i9;
                    if (iZzt > 17) {
                        i11 = i49;
                        i12 = i50;
                        Unsafe unsafe9 = unsafe8;
                        i13 = -1;
                        if (iZzt != 27) {
                            unsafe2 = unsafe9;
                            if (iZzt > 49) {
                                i26 = i54;
                                i25 = i57;
                                i24 = i51;
                                if (iZzt != 50) {
                                    i48 = i58;
                                    obj3 = obj;
                                    Unsafe unsafe10 = zzb;
                                    long j3 = iArr[i26 + 2] & 1048575;
                                    switch (iZzt) {
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 1) {
                                                iZzg = i41 + 8;
                                                unsafe10.putObject(obj3, j2, Double.valueOf(Double.longBitsToDouble(zzgzo.zzn(bArr, i41))));
                                                unsafe10.putInt(obj3, j3, i15);
                                            } else {
                                                iZzg = i41;
                                            }
                                            if (iZzg == i41) {
                                                i14 = i40;
                                                i4 = i3;
                                                i10 = iZzg;
                                                break;
                                            } else {
                                                zzhdhVar2 = this;
                                                i47 = i40;
                                                i44 = i3;
                                                zzgznVar3 = zzgznVar2;
                                                i43 = i5;
                                                i46 = i15;
                                                i45 = -1;
                                                i49 = i11;
                                                unsafe8 = unsafe2;
                                                i50 = i12;
                                            }
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 5) {
                                                iZzg = i41 + 4;
                                                unsafe10.putObject(obj3, j2, Float.valueOf(Float.intBitsToFloat(zzgzo.zzb(bArr, i41))));
                                                unsafe10.putInt(obj3, j3, i15);
                                            }
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 0) {
                                                iZzg = zzgzo.zzk(bArr, i41, zzgznVar2);
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzgznVar2.zzb));
                                                unsafe10.putInt(obj3, j3, i15);
                                            }
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                        case 62:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 0) {
                                                iZzg = zzgzo.zzh(bArr, i41, zzgznVar2);
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzgznVar2.zza));
                                                unsafe10.putInt(obj3, j3, i15);
                                            }
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case 56:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 1) {
                                                iZzg = i41 + 8;
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzgzo.zzn(bArr, i41)));
                                                unsafe10.putInt(obj3, j3, i15);
                                            }
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 5) {
                                                iZzg = i41 + 4;
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzgzo.zzb(bArr, i41)));
                                                unsafe10.putInt(obj3, j3, i15);
                                            }
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case 58:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 0) {
                                                iZzg = zzgzo.zzk(bArr, i41, zzgznVar2);
                                                unsafe10.putObject(obj3, j2, Boolean.valueOf(zzgznVar2.zzb != 0));
                                                unsafe10.putInt(obj3, j3, i15);
                                            }
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case 59:
                                            i5 = i2;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 2) {
                                                int iZzh = zzgzo.zzh(bArr, i41, zzgznVar2);
                                                int i59 = zzgznVar2.zza;
                                                if (i59 == 0) {
                                                    unsafe10.putObject(obj3, j2, "");
                                                    i40 = i26;
                                                } else {
                                                    int i60 = iZzh + i59;
                                                    if ((i56 & 536870912) != 0 && !zzhff.zzj(bArr, iZzh, i60)) {
                                                        throw zzhcd.zzd();
                                                    }
                                                    i40 = i26;
                                                    unsafe10.putObject(obj3, j2, new String(bArr, iZzh, i59, zzhcb.zzb));
                                                    iZzh = i60;
                                                }
                                                unsafe10.putInt(obj3, j3, i15);
                                                iZzg = iZzh;
                                                if (iZzg == i41) {
                                                }
                                            } else {
                                                i40 = i26;
                                                iZzg = i41;
                                                if (iZzg == i41) {
                                                }
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 2) {
                                                Object objZzB = zzB(obj3, i25, i26);
                                                i15 = i25;
                                                iZzg = zzgzo.zzm(objZzB, zzx(i26), bArr, i41, i2, zzgznVar);
                                                zzK(obj3, i15, i26, objZzB);
                                                i40 = i26;
                                                i48 = i48;
                                                i5 = i2;
                                                if (iZzg == i41) {
                                                }
                                            } else {
                                                i15 = i25;
                                                i5 = i2;
                                                i40 = i26;
                                                iZzg = i41;
                                                if (iZzg == i41) {
                                                }
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                            i42 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 2) {
                                                iZzg = zzgzo.zza(bArr, i41, zzgznVar2);
                                                unsafe10.putObject(obj3, j2, zzgznVar2.zzc);
                                                unsafe10.putInt(obj3, j3, i42);
                                                i5 = i2;
                                                i40 = i26;
                                                i15 = i42;
                                                if (iZzg == i41) {
                                                }
                                            }
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i42;
                                            iZzg = i41;
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                            i42 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 0) {
                                                iZzg = zzgzo.zzh(bArr, i41, zzgznVar2);
                                                int i61 = zzgznVar2.zza;
                                                zzhbu zzhbuVarZzw = zzw(i26);
                                                if (zzhbuVarZzw == null || zzhbuVarZzw.zza(i61)) {
                                                    unsafe10.putObject(obj3, j2, Integer.valueOf(i61));
                                                    unsafe10.putInt(obj3, j3, i42);
                                                } else {
                                                    zzd(obj).zzj(i48, Long.valueOf(i61));
                                                }
                                                i5 = i2;
                                                i40 = i26;
                                                i15 = i42;
                                                if (iZzg == i41) {
                                                }
                                            }
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i42;
                                            iZzg = i41;
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                            i42 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 0) {
                                                iZzg = zzgzo.zzh(bArr, i41, zzgznVar2);
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzham.zzF(zzgznVar2.zza)));
                                                unsafe10.putInt(obj3, j3, i42);
                                                i5 = i2;
                                                i40 = i26;
                                                i15 = i42;
                                                if (iZzg == i41) {
                                                }
                                            }
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i42;
                                            iZzg = i41;
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                            i42 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            if (i55 == 0) {
                                                int iZzk2 = zzgzo.zzk(bArr, i41, zzgznVar2);
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzham.zzH(zzgznVar2.zzb)));
                                                unsafe10.putInt(obj3, j3, i42);
                                                iZzg = iZzk2;
                                                i5 = i2;
                                                i40 = i26;
                                                i15 = i42;
                                                if (iZzg == i41) {
                                                }
                                            }
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i42;
                                            iZzg = i41;
                                            if (iZzg == i41) {
                                            }
                                            break;
                                        case 68:
                                            if (i55 == 3) {
                                                Object objZzB2 = zzB(obj3, i25, i26);
                                                zzgzn zzgznVar4 = zzgznVar3;
                                                int iZzl = zzgzo.zzl(objZzB2, zzx(i26), bArr, i24, i2, (i48 & (-8)) | 4, zzgznVar);
                                                zzK(obj3, i25, i26, objZzB2);
                                                i5 = i2;
                                                i41 = i24;
                                                i40 = i26;
                                                i15 = i25;
                                                iZzg = iZzl;
                                                zzgznVar2 = zzgznVar4;
                                                if (iZzg == i41) {
                                                }
                                            }
                                            break;
                                        default:
                                            i5 = i2;
                                            i40 = i26;
                                            i15 = i25;
                                            zzgznVar2 = zzgznVar3;
                                            i41 = i24;
                                            iZzg = i41;
                                            if (iZzg == i41) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i55 == 2) {
                                        Unsafe unsafe11 = zzb;
                                        Object objZzz = zzhdhVar2.zzz(i26);
                                        Object object = unsafe11.getObject(obj, j2);
                                        if (zzhcz.zza(object)) {
                                            zzhcy zzhcyVarZzb = zzhcy.zza().zzb();
                                            zzhcz.zzb(zzhcyVarZzb, object);
                                            unsafe11.putObject(obj, j2, zzhcyVarZzb);
                                        }
                                        throw null;
                                    }
                                    i48 = i58;
                                    obj3 = obj;
                                    i4 = i3;
                                    i14 = i26;
                                    i5 = i2;
                                    i10 = i24;
                                    i15 = i25;
                                    zzgznVar2 = zzgznVar3;
                                }
                            } else {
                                long j4 = i56;
                                Unsafe unsafe12 = zzb;
                                zzhca zzhcaVarZzf = (zzhca) unsafe12.getObject(obj3, j2);
                                if (zzhcaVarZzf.zzc()) {
                                    j = j4;
                                } else {
                                    int size = zzhcaVarZzf.size();
                                    j = j4;
                                    zzhcaVarZzf = zzhcaVarZzf.zzf(size != 0 ? size + size : 10);
                                    unsafe12.putObject(obj3, j2, zzhcaVarZzf);
                                }
                                zzhca zzhcaVar = zzhcaVarZzf;
                                switch (iZzt) {
                                    case 18:
                                    case 35:
                                        i27 = i58;
                                        i28 = i51;
                                        i29 = i54;
                                        unsafe5 = unsafe2;
                                        i30 = i57;
                                        i31 = i2;
                                        if (i55 == 2) {
                                            zzhav zzhavVar = (zzhav) zzhcaVar;
                                            iZzg = zzgzo.zzh(bArr, i28, zzgznVar3);
                                            int i62 = zzgznVar3.zza + iZzg;
                                            while (iZzg < i62) {
                                                zzhavVar.zzh(Double.longBitsToDouble(zzgzo.zzn(bArr, iZzg)));
                                                iZzg += 8;
                                            }
                                            if (iZzg != i62) {
                                                throw zzhcd.zzj();
                                            }
                                            if (iZzg != i28) {
                                                i10 = iZzg;
                                                i48 = i27;
                                                i15 = i30;
                                                i14 = i29;
                                                zzgznVar2 = zzgznVar3;
                                                unsafe2 = unsafe5;
                                                obj3 = obj;
                                                i5 = i31;
                                                i4 = i3;
                                                break;
                                            } else {
                                                i44 = i3;
                                                i48 = i27;
                                                i46 = i30;
                                                i47 = i29;
                                                unsafe8 = unsafe5;
                                                i45 = -1;
                                                i49 = i11;
                                                i50 = i12;
                                                obj3 = obj;
                                                i43 = i31;
                                            }
                                        } else {
                                            if (i55 == 1) {
                                                i32 = i28 + 8;
                                                zzhav zzhavVar2 = (zzhav) zzhcaVar;
                                                zzhavVar2.zzh(Double.longBitsToDouble(zzgzo.zzn(bArr, i28)));
                                                while (i32 < i31) {
                                                    int iZzh2 = zzgzo.zzh(bArr, i32, zzgznVar3);
                                                    if (i27 == zzgznVar3.zza) {
                                                        zzhavVar2.zzh(Double.longBitsToDouble(zzgzo.zzn(bArr, iZzh2)));
                                                        i32 = iZzh2 + 8;
                                                    } else {
                                                        iZzg = i32;
                                                        if (iZzg != i28) {
                                                        }
                                                    }
                                                }
                                                iZzg = i32;
                                                if (iZzg != i28) {
                                                }
                                            }
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i27 = i58;
                                        i28 = i51;
                                        i29 = i54;
                                        unsafe5 = unsafe2;
                                        i30 = i57;
                                        i31 = i2;
                                        if (i55 == 2) {
                                            zzhbf zzhbfVar = (zzhbf) zzhcaVar;
                                            iZzg = zzgzo.zzh(bArr, i28, zzgznVar3);
                                            int i63 = zzgznVar3.zza + iZzg;
                                            while (iZzg < i63) {
                                                zzhbfVar.zzh(Float.intBitsToFloat(zzgzo.zzb(bArr, iZzg)));
                                                iZzg += 4;
                                            }
                                            if (iZzg != i63) {
                                                throw zzhcd.zzj();
                                            }
                                            if (iZzg != i28) {
                                            }
                                        } else {
                                            if (i55 == 5) {
                                                i32 = i28 + 4;
                                                zzhbf zzhbfVar2 = (zzhbf) zzhcaVar;
                                                zzhbfVar2.zzh(Float.intBitsToFloat(zzgzo.zzb(bArr, i28)));
                                                while (i32 < i31) {
                                                    int iZzh3 = zzgzo.zzh(bArr, i32, zzgznVar3);
                                                    if (i27 == zzgznVar3.zza) {
                                                        zzhbfVar2.zzh(Float.intBitsToFloat(zzgzo.zzb(bArr, iZzh3)));
                                                        i32 = iZzh3 + 4;
                                                    } else {
                                                        iZzg = i32;
                                                        if (iZzg != i28) {
                                                        }
                                                    }
                                                }
                                                iZzg = i32;
                                                if (iZzg != i28) {
                                                }
                                            }
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i27 = i58;
                                        i28 = i51;
                                        i29 = i54;
                                        unsafe5 = unsafe2;
                                        i30 = i57;
                                        i31 = i2;
                                        if (i55 == 2) {
                                            zzhct zzhctVar = (zzhct) zzhcaVar;
                                            iZzg = zzgzo.zzh(bArr, i28, zzgznVar3);
                                            int i64 = zzgznVar3.zza + iZzg;
                                            while (iZzg < i64) {
                                                iZzg = zzgzo.zzk(bArr, iZzg, zzgznVar3);
                                                zzhctVar.zzg(zzgznVar3.zzb);
                                            }
                                            if (iZzg != i64) {
                                                throw zzhcd.zzj();
                                            }
                                        } else if (i55 == 0) {
                                            zzhct zzhctVar2 = (zzhct) zzhcaVar;
                                            iZzg = zzgzo.zzk(bArr, i28, zzgznVar3);
                                            zzhctVar2.zzg(zzgznVar3.zzb);
                                            while (iZzg < i31) {
                                                int iZzh4 = zzgzo.zzh(bArr, iZzg, zzgznVar3);
                                                if (i27 == zzgznVar3.zza) {
                                                    iZzg = zzgzo.zzk(bArr, iZzh4, zzgznVar3);
                                                    zzhctVar2.zzg(zzgznVar3.zzb);
                                                }
                                            }
                                        } else {
                                            iZzg = i28;
                                        }
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 22:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                    case 39:
                                    case 43:
                                        i27 = i58;
                                        i33 = i51;
                                        i34 = i2;
                                        i35 = i54;
                                        unsafe6 = unsafe2;
                                        i36 = i57;
                                        if (i55 == 2) {
                                            iZzf = zzgzo.zzf(bArr, i33, zzhcaVar, zzgznVar3);
                                            i28 = i33;
                                            iZzg = iZzf;
                                            i30 = i36;
                                            i31 = i34;
                                            i29 = i35;
                                            unsafe5 = unsafe6;
                                            if (iZzg != i28) {
                                            }
                                        } else {
                                            if (i55 == 0) {
                                                i28 = i33;
                                                i30 = i36;
                                                i31 = i34;
                                                i29 = i35;
                                                unsafe5 = unsafe6;
                                                iZzg = zzgzo.zzj(i27, bArr, i28, i2, zzhcaVar, zzgznVar);
                                                if (iZzg != i28) {
                                                }
                                            }
                                            i28 = i33;
                                            i30 = i36;
                                            i31 = i34;
                                            i29 = i35;
                                            unsafe5 = unsafe6;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i27 = i58;
                                        i33 = i51;
                                        i34 = i2;
                                        i35 = i54;
                                        unsafe6 = unsafe2;
                                        i36 = i57;
                                        if (i55 == 2) {
                                            zzhct zzhctVar3 = (zzhct) zzhcaVar;
                                            iZzf = zzgzo.zzh(bArr, i33, zzgznVar3);
                                            int i65 = zzgznVar3.zza + iZzf;
                                            while (iZzf < i65) {
                                                zzhctVar3.zzg(zzgzo.zzn(bArr, iZzf));
                                                iZzf += 8;
                                            }
                                            if (iZzf != i65) {
                                                throw zzhcd.zzj();
                                            }
                                        } else {
                                            if (i55 == 1) {
                                                iZzf = i33 + 8;
                                                zzhct zzhctVar4 = (zzhct) zzhcaVar;
                                                zzhctVar4.zzg(zzgzo.zzn(bArr, i33));
                                                while (iZzf < i34) {
                                                    int iZzh5 = zzgzo.zzh(bArr, iZzf, zzgznVar3);
                                                    if (i27 == zzgznVar3.zza) {
                                                        zzhctVar4.zzg(zzgzo.zzn(bArr, iZzh5));
                                                        iZzf = iZzh5 + 8;
                                                    }
                                                }
                                            }
                                            i28 = i33;
                                            i30 = i36;
                                            i31 = i34;
                                            i29 = i35;
                                            unsafe5 = unsafe6;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i28 = i33;
                                        iZzg = iZzf;
                                        i30 = i36;
                                        i31 = i34;
                                        i29 = i35;
                                        unsafe5 = unsafe6;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 24:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                    case 41:
                                    case 45:
                                        i27 = i58;
                                        i33 = i51;
                                        i34 = i2;
                                        i35 = i54;
                                        unsafe6 = unsafe2;
                                        i36 = i57;
                                        if (i55 == 2) {
                                            zzhbp zzhbpVar = (zzhbp) zzhcaVar;
                                            iZzf = zzgzo.zzh(bArr, i33, zzgznVar3);
                                            int i66 = zzgznVar3.zza + iZzf;
                                            while (iZzf < i66) {
                                                zzhbpVar.zzi(zzgzo.zzb(bArr, iZzf));
                                                iZzf += 4;
                                            }
                                            if (iZzf != i66) {
                                                throw zzhcd.zzj();
                                            }
                                        } else {
                                            if (i55 == 5) {
                                                iZzf = i33 + 4;
                                                zzhbp zzhbpVar2 = (zzhbp) zzhcaVar;
                                                zzhbpVar2.zzi(zzgzo.zzb(bArr, i33));
                                                while (iZzf < i34) {
                                                    int iZzh6 = zzgzo.zzh(bArr, iZzf, zzgznVar3);
                                                    if (i27 == zzgznVar3.zza) {
                                                        zzhbpVar2.zzi(zzgzo.zzb(bArr, iZzh6));
                                                        iZzf = iZzh6 + 4;
                                                    }
                                                }
                                            }
                                            i28 = i33;
                                            i30 = i36;
                                            i31 = i34;
                                            i29 = i35;
                                            unsafe5 = unsafe6;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i28 = i33;
                                        iZzg = iZzf;
                                        i30 = i36;
                                        i31 = i34;
                                        i29 = i35;
                                        unsafe5 = unsafe6;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i27 = i58;
                                        i33 = i51;
                                        i34 = i2;
                                        i35 = i54;
                                        unsafe6 = unsafe2;
                                        i36 = i57;
                                        if (i55 == 2) {
                                            zzgzp zzgzpVar = (zzgzp) zzhcaVar;
                                            iZzf = zzgzo.zzh(bArr, i33, zzgznVar3);
                                            int i67 = zzgznVar3.zza + iZzf;
                                            while (iZzf < i67) {
                                                iZzf = zzgzo.zzk(bArr, iZzf, zzgznVar3);
                                                zzgzpVar.zzg(zzgznVar3.zzb != 0);
                                            }
                                            if (iZzf != i67) {
                                                throw zzhcd.zzj();
                                            }
                                        } else {
                                            if (i55 == 0) {
                                                zzgzp zzgzpVar2 = (zzgzp) zzhcaVar;
                                                iZzf = zzgzo.zzk(bArr, i33, zzgznVar3);
                                                zzgzpVar2.zzg(zzgznVar3.zzb != 0);
                                                while (iZzf < i34) {
                                                    int iZzh7 = zzgzo.zzh(bArr, iZzf, zzgznVar3);
                                                    if (i27 == zzgznVar3.zza) {
                                                        iZzf = zzgzo.zzk(bArr, iZzh7, zzgznVar3);
                                                        zzgzpVar2.zzg(zzgznVar3.zzb != 0);
                                                    }
                                                }
                                            }
                                            i28 = i33;
                                            i30 = i36;
                                            i31 = i34;
                                            i29 = i35;
                                            unsafe5 = unsafe6;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i28 = i33;
                                        iZzg = iZzf;
                                        i30 = i36;
                                        i31 = i34;
                                        i29 = i35;
                                        unsafe5 = unsafe6;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 26:
                                        i27 = i58;
                                        i33 = i51;
                                        i34 = i2;
                                        i35 = i54;
                                        unsafe6 = unsafe2;
                                        i36 = i57;
                                        if (i55 == 2) {
                                            if ((j & 536870912) == 0) {
                                                iZzf = zzgzo.zzh(bArr, i33, zzgznVar3);
                                                int i68 = zzgznVar3.zza;
                                                if (i68 < 0) {
                                                    throw zzhcd.zzf();
                                                }
                                                if (i68 == 0) {
                                                    obj2 = "";
                                                    zzhcaVar.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzhcaVar.add(new String(bArr, iZzf, i68, zzhcb.zzb));
                                                    iZzf += i68;
                                                }
                                                while (iZzf < i34) {
                                                    int iZzh8 = zzgzo.zzh(bArr, iZzf, zzgznVar3);
                                                    if (i27 == zzgznVar3.zza) {
                                                        iZzf = zzgzo.zzh(bArr, iZzh8, zzgznVar3);
                                                        int i69 = zzgznVar3.zza;
                                                        if (i69 < 0) {
                                                            throw zzhcd.zzf();
                                                        }
                                                        if (i69 == 0) {
                                                            zzhcaVar.add(obj2);
                                                        } else {
                                                            zzhcaVar.add(new String(bArr, iZzf, i69, zzhcb.zzb));
                                                            iZzf += i69;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iZzf = zzgzo.zzh(bArr, i33, zzgznVar3);
                                                int i70 = zzgznVar3.zza;
                                                if (i70 < 0) {
                                                    throw zzhcd.zzf();
                                                }
                                                if (i70 == 0) {
                                                    zzhcaVar.add("");
                                                } else {
                                                    int i71 = iZzf + i70;
                                                    if (!zzhff.zzj(bArr, iZzf, i71)) {
                                                        throw zzhcd.zzd();
                                                    }
                                                    zzhcaVar.add(new String(bArr, iZzf, i70, zzhcb.zzb));
                                                    iZzf = i71;
                                                }
                                                while (iZzf < i34) {
                                                    int iZzh9 = zzgzo.zzh(bArr, iZzf, zzgznVar3);
                                                    if (i27 == zzgznVar3.zza) {
                                                        iZzf = zzgzo.zzh(bArr, iZzh9, zzgznVar3);
                                                        int i72 = zzgznVar3.zza;
                                                        if (i72 < 0) {
                                                            throw zzhcd.zzf();
                                                        }
                                                        if (i72 == 0) {
                                                            zzhcaVar.add("");
                                                        } else {
                                                            int i73 = iZzf + i72;
                                                            if (!zzhff.zzj(bArr, iZzf, i73)) {
                                                                throw zzhcd.zzd();
                                                            }
                                                            zzhcaVar.add(new String(bArr, iZzf, i72, zzhcb.zzb));
                                                            iZzf = i73;
                                                        }
                                                    }
                                                }
                                            }
                                            i28 = i33;
                                            iZzg = iZzf;
                                            i30 = i36;
                                            i31 = i34;
                                            i29 = i35;
                                            unsafe5 = unsafe6;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i28 = i33;
                                        i30 = i36;
                                        i31 = i34;
                                        i29 = i35;
                                        unsafe5 = unsafe6;
                                        iZzg = i28;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 27:
                                        i37 = i58;
                                        i28 = i51;
                                        i38 = i2;
                                        unsafe7 = unsafe2;
                                        if (i55 == 2) {
                                            i27 = i37;
                                            int iZze = zzgzo.zze(zzhdhVar2.zzx(i54), i37, bArr, i28, i2, zzhcaVar, zzgznVar);
                                            zzgznVar3 = zzgznVar3;
                                            i31 = i38;
                                            i29 = i54;
                                            unsafe5 = unsafe7;
                                            iZzg = iZze;
                                            i30 = i57;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i27 = i37;
                                        unsafe5 = unsafe7;
                                        i30 = i57;
                                        int i74 = i38;
                                        i29 = i54;
                                        i31 = i74;
                                        iZzg = i28;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 28:
                                        i37 = i58;
                                        i28 = i51;
                                        i38 = i2;
                                        unsafe7 = unsafe2;
                                        if (i55 == 2) {
                                            iZzg = zzgzo.zzh(bArr, i28, zzgznVar3);
                                            int i75 = zzgznVar3.zza;
                                            if (i75 < 0) {
                                                throw zzhcd.zzf();
                                            }
                                            if (i75 > bArr.length - iZzg) {
                                                throw zzhcd.zzj();
                                            }
                                            if (i75 == 0) {
                                                zzhcaVar.add(zzhac.zzb);
                                            } else {
                                                zzhcaVar.add(zzhac.zzv(bArr, iZzg, i75));
                                                iZzg += i75;
                                            }
                                            while (iZzg < i38) {
                                                int iZzh10 = zzgzo.zzh(bArr, iZzg, zzgznVar3);
                                                if (i37 == zzgznVar3.zza) {
                                                    iZzg = zzgzo.zzh(bArr, iZzh10, zzgznVar3);
                                                    int i76 = zzgznVar3.zza;
                                                    if (i76 < 0) {
                                                        throw zzhcd.zzf();
                                                    }
                                                    if (i76 > bArr.length - iZzg) {
                                                        throw zzhcd.zzj();
                                                    }
                                                    if (i76 == 0) {
                                                        zzhcaVar.add(zzhac.zzb);
                                                    } else {
                                                        zzhcaVar.add(zzhac.zzv(bArr, iZzg, i76));
                                                        iZzg += i76;
                                                    }
                                                } else {
                                                    i27 = i37;
                                                    unsafe5 = unsafe7;
                                                    i30 = i57;
                                                    int i77 = i38;
                                                    i29 = i54;
                                                    i31 = i77;
                                                    if (iZzg != i28) {
                                                    }
                                                }
                                            }
                                            i27 = i37;
                                            unsafe5 = unsafe7;
                                            i30 = i57;
                                            int i772 = i38;
                                            i29 = i54;
                                            i31 = i772;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i27 = i37;
                                        unsafe5 = unsafe7;
                                        i30 = i57;
                                        int i742 = i38;
                                        i29 = i54;
                                        i31 = i742;
                                        iZzg = i28;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i55 == 2) {
                                            iZzj = zzgzo.zzf(bArr, i51, zzhcaVar, zzgznVar3);
                                            i39 = i58;
                                            i28 = i51;
                                            i38 = i2;
                                            unsafe7 = unsafe2;
                                        } else {
                                            if (i55 == 0) {
                                                i39 = i58;
                                                i28 = i51;
                                                i38 = i2;
                                                unsafe7 = unsafe2;
                                                iZzj = zzgzo.zzj(i58, bArr, i51, i2, zzhcaVar, zzgznVar);
                                            }
                                            i27 = i58;
                                            i28 = i51;
                                            i29 = i54;
                                            unsafe5 = unsafe2;
                                            i30 = i57;
                                            i31 = i2;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        int i78 = iZzj;
                                        zzheb.zzo(obj, i57, zzhcaVar, zzhdhVar2.zzw(i54), null, zzhdhVar2.zzn);
                                        i27 = i39;
                                        iZzg = i78;
                                        unsafe5 = unsafe7;
                                        i30 = i57;
                                        int i7722 = i38;
                                        i29 = i54;
                                        i31 = i7722;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i55 == 2) {
                                            zzhbp zzhbpVar3 = (zzhbp) zzhcaVar;
                                            iZzg = zzgzo.zzh(bArr, i51, zzgznVar3);
                                            int i79 = zzgznVar3.zza + iZzg;
                                            while (iZzg < i79) {
                                                iZzg = zzgzo.zzh(bArr, iZzg, zzgznVar3);
                                                zzhbpVar3.zzi(zzham.zzF(zzgznVar3.zza));
                                            }
                                            if (iZzg != i79) {
                                                throw zzhcd.zzj();
                                            }
                                        } else {
                                            if (i55 == 0) {
                                                zzhbp zzhbpVar4 = (zzhbp) zzhcaVar;
                                                iZzg = zzgzo.zzh(bArr, i51, zzgznVar3);
                                                zzhbpVar4.zzi(zzham.zzF(zzgznVar3.zza));
                                                while (iZzg < i2) {
                                                    int iZzh11 = zzgzo.zzh(bArr, iZzg, zzgznVar3);
                                                    if (i58 == zzgznVar3.zza) {
                                                        iZzg = zzgzo.zzh(bArr, iZzh11, zzgznVar3);
                                                        zzhbpVar4.zzi(zzham.zzF(zzgznVar3.zza));
                                                    }
                                                }
                                            }
                                            i27 = i58;
                                            i28 = i51;
                                            i29 = i54;
                                            unsafe5 = unsafe2;
                                            i30 = i57;
                                            i31 = i2;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i27 = i58;
                                        i28 = i51;
                                        i29 = i54;
                                        unsafe5 = unsafe2;
                                        i30 = i57;
                                        i31 = i2;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    case 34:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                        if (i55 == 2) {
                                            zzhct zzhctVar5 = (zzhct) zzhcaVar;
                                            iZzg = zzgzo.zzh(bArr, i51, zzgznVar3);
                                            int i80 = zzgznVar3.zza + iZzg;
                                            while (iZzg < i80) {
                                                iZzg = zzgzo.zzk(bArr, iZzg, zzgznVar3);
                                                zzhctVar5.zzg(zzham.zzH(zzgznVar3.zzb));
                                            }
                                            if (iZzg != i80) {
                                                throw zzhcd.zzj();
                                            }
                                        } else {
                                            if (i55 == 0) {
                                                zzhct zzhctVar6 = (zzhct) zzhcaVar;
                                                iZzg = zzgzo.zzk(bArr, i51, zzgznVar3);
                                                zzhctVar6.zzg(zzham.zzH(zzgznVar3.zzb));
                                                while (iZzg < i2) {
                                                    int iZzh12 = zzgzo.zzh(bArr, iZzg, zzgznVar3);
                                                    if (i58 == zzgznVar3.zza) {
                                                        iZzg = zzgzo.zzk(bArr, iZzh12, zzgznVar3);
                                                        zzhctVar6.zzg(zzham.zzH(zzgznVar3.zzb));
                                                    }
                                                }
                                            }
                                            i27 = i58;
                                            i28 = i51;
                                            i29 = i54;
                                            unsafe5 = unsafe2;
                                            i30 = i57;
                                            i31 = i2;
                                            iZzg = i28;
                                            if (iZzg != i28) {
                                            }
                                        }
                                        i27 = i58;
                                        i28 = i51;
                                        i29 = i54;
                                        unsafe5 = unsafe2;
                                        i30 = i57;
                                        i31 = i2;
                                        if (iZzg != i28) {
                                        }
                                        break;
                                    default:
                                        i27 = i58;
                                        i28 = i51;
                                        i29 = i54;
                                        unsafe5 = unsafe2;
                                        i30 = i57;
                                        i31 = i2;
                                        if (i55 == 3) {
                                            int i81 = (i27 & (-8)) | 4;
                                            zzhdz zzhdzVarZzx = zzhdhVar2.zzx(i29);
                                            iZzg = zzgzo.zzc(zzhdzVarZzx, bArr, i28, i2, i81, zzgznVar);
                                            zzhcaVar.add(zzgznVar3.zzc);
                                            while (iZzg < i31) {
                                                int iZzh13 = zzgzo.zzh(bArr, iZzg, zzgznVar3);
                                                if (i27 == zzgznVar3.zza) {
                                                    iZzg = zzgzo.zzc(zzhdzVarZzx, bArr, iZzh13, i2, i81, zzgznVar);
                                                    zzhcaVar.add(zzgznVar3.zzc);
                                                }
                                            }
                                        }
                                        if (iZzg != i28) {
                                        }
                                        break;
                                }
                            }
                        } else if (i55 == 2) {
                            zzhca zzhcaVarZzf2 = (zzhca) unsafe9.getObject(obj3, j2);
                            if (!zzhcaVarZzf2.zzc()) {
                                int size2 = zzhcaVarZzf2.size();
                                zzhcaVarZzf2 = zzhcaVarZzf2.zzf(size2 != 0 ? size2 + size2 : 10);
                                unsafe9.putObject(obj3, j2, zzhcaVarZzf2);
                            }
                            i46 = i57;
                            int iZze2 = zzgzo.zze(zzhdhVar2.zzx(i54), i58, bArr, i51, i2, zzhcaVarZzf2, zzgznVar);
                            i44 = i3;
                            zzgznVar3 = zzgznVar3;
                            i43 = i2;
                            unsafe8 = unsafe9;
                            i45 = -1;
                            i49 = i11;
                            i50 = i12;
                            i48 = i58;
                            i47 = i54;
                            iZzg = iZze2;
                        } else {
                            i24 = i51;
                            i25 = i57;
                            i48 = i58;
                            unsafe2 = unsafe9;
                            i26 = i54;
                            i4 = i3;
                            i14 = i26;
                            i5 = i2;
                            i10 = i24;
                            i15 = i25;
                            zzgznVar2 = zzgznVar3;
                        }
                    } else {
                        int i82 = iArr[i54 + 2];
                        int i83 = 1 << (i82 >>> 20);
                        int i84 = 1048575;
                        int i85 = i82 & 1048575;
                        if (i85 != i50) {
                            if (i50 != 1048575) {
                                unsafe8.putInt(obj3, i50, i49);
                                i84 = 1048575;
                            }
                            i49 = i85 == i84 ? 0 : unsafe8.getInt(obj3, i85);
                            i12 = i85;
                        } else {
                            i12 = i50;
                        }
                        switch (iZzt) {
                            case 0:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 1) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i86 = i51;
                                    i48 = i22;
                                    i10 = i86;
                                    break;
                                } else {
                                    iZzg = i51 + 8;
                                    i49 |= i83;
                                    zzhfa.zzr(obj3, j2, Double.longBitsToDouble(zzgzo.zzn(bArr, i51)));
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 1:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 5) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i862 = i51;
                                    i48 = i22;
                                    i10 = i862;
                                    break;
                                } else {
                                    iZzg = i51 + 4;
                                    i49 |= i83;
                                    zzhfa.zzs(obj3, j2, Float.intBitsToFloat(zzgzo.zzb(bArr, i51)));
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 2:
                            case 3:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 0) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i8622 = i51;
                                    i48 = i22;
                                    i10 = i8622;
                                    break;
                                } else {
                                    i20 = i49 | i83;
                                    iZzk = zzgzo.zzk(bArr, i51, zzgznVar3);
                                    unsafe8.putLong(obj, j2, zzgznVar3.zzb);
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i49 = i20;
                                    iZzg = iZzk;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 4:
                            case 11:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 0) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i86222 = i51;
                                    i48 = i22;
                                    i10 = i86222;
                                    break;
                                } else {
                                    i49 |= i83;
                                    iZzg = zzgzo.zzh(bArr, i51, zzgznVar3);
                                    unsafe8.putInt(obj3, j2, zzgznVar3.zza);
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 5:
                            case 14:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 1) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i862222 = i51;
                                    i48 = i22;
                                    i10 = i862222;
                                    break;
                                } else {
                                    iZzk = i51 + 8;
                                    i20 = i49 | i83;
                                    unsafe8.putLong(obj, j2, zzgzo.zzn(bArr, i51));
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i49 = i20;
                                    iZzg = iZzk;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 6:
                            case 13:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 5) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i8622222 = i51;
                                    i48 = i22;
                                    i10 = i8622222;
                                    break;
                                } else {
                                    iZzg = i51 + 4;
                                    i49 |= i83;
                                    unsafe8.putInt(obj3, j2, zzgzo.zzb(bArr, i51));
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 7:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 0) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i86222222 = i51;
                                    i48 = i22;
                                    i10 = i86222222;
                                    break;
                                } else {
                                    i49 |= i83;
                                    iZzg = zzgzo.zzk(bArr, i51, zzgznVar3);
                                    zzhfa.zzp(obj3, j2, zzgznVar3.zzb != 0);
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 8:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 2) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i862222222 = i51;
                                    i48 = i22;
                                    i10 = i862222222;
                                    break;
                                } else {
                                    if (zzM(i56)) {
                                        iZzg = zzgzo.zzh(bArr, i51, zzgznVar3);
                                        int i87 = zzgznVar3.zza;
                                        if (i87 < 0) {
                                            throw zzhcd.zzf();
                                        }
                                        int i88 = i49 | i83;
                                        if (i87 == 0) {
                                            zzgznVar3.zzc = "";
                                        } else {
                                            zzgznVar3.zzc = zzhff.zzh(bArr, iZzg, i87);
                                            iZzg += i87;
                                        }
                                        i49 = i88;
                                    } else {
                                        int i89 = i49 | i83;
                                        int iZzh14 = zzgzo.zzh(bArr, i51, zzgznVar3);
                                        int i90 = zzgznVar3.zza;
                                        if (i90 < 0) {
                                            throw zzhcd.zzf();
                                        }
                                        if (i90 == 0) {
                                            zzgznVar3.zzc = "";
                                        } else {
                                            zzgznVar3.zzc = new String(bArr, iZzh14, i90, zzhcb.zzb);
                                            iZzh14 += i90;
                                        }
                                        i49 = i89;
                                        iZzg = iZzh14;
                                    }
                                    unsafe8.putObject(obj3, j2, zzgznVar3.zzc);
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 9:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 2) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i8622222222 = i51;
                                    i48 = i22;
                                    i10 = i8622222222;
                                    break;
                                } else {
                                    Object objZzA = zzhdhVar2.zzA(obj3, i17);
                                    iZzg = zzgzo.zzm(objZzA, zzhdhVar2.zzx(i17), bArr, i51, i2, zzgznVar);
                                    zzhdhVar2.zzJ(obj3, i17, objZzA);
                                    i43 = i2;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i49 |= i83;
                                    i50 = i12;
                                    i45 = -1;
                                    i44 = i3;
                                }
                            case 10:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 2) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i86222222222 = i51;
                                    i48 = i22;
                                    i10 = i86222222222;
                                    break;
                                } else {
                                    i49 |= i83;
                                    iZzg = zzgzo.zza(bArr, i51, zzgznVar3);
                                    unsafe8.putObject(obj3, j2, zzgznVar3.zzc);
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 12:
                                i17 = i54;
                                i18 = i57;
                                if (i55 != 0) {
                                    i21 = i49;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i22 = i58;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i862222222222 = i51;
                                    i48 = i22;
                                    i10 = i862222222222;
                                    break;
                                } else {
                                    iZzg = zzgzo.zzh(bArr, i51, zzgznVar3);
                                    int i91 = zzgznVar3.zza;
                                    zzhbu zzhbuVarZzw2 = zzhdhVar2.zzw(i17);
                                    if ((i56 & Integer.MIN_VALUE) == 0 || zzhbuVarZzw2 == null || zzhbuVarZzw2.zza(i91)) {
                                        i19 = i58;
                                        i49 |= i83;
                                        unsafe8.putInt(obj3, j2, i91);
                                    } else {
                                        i19 = i58;
                                        zzd(obj).zzj(i19, Long.valueOf(i91));
                                    }
                                    i43 = i2;
                                    i44 = i3;
                                    i48 = i19;
                                    i46 = i18;
                                    i47 = i17;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 15:
                                i17 = i54;
                                i18 = i57;
                                if (i55 != 0) {
                                    i21 = i49;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i22 = i58;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i8622222222222 = i51;
                                    i48 = i22;
                                    i10 = i8622222222222;
                                    break;
                                } else {
                                    i49 |= i83;
                                    iZzg = zzgzo.zzh(bArr, i51, zzgznVar3);
                                    unsafe8.putInt(obj3, j2, zzham.zzF(zzgznVar3.zza));
                                    i43 = i2;
                                    i44 = i3;
                                    i46 = i18;
                                    i47 = i17;
                                    i48 = i58;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            case 16:
                                if (i55 != 0) {
                                    i23 = i54;
                                    i21 = i49;
                                    unsafe4 = unsafe8;
                                    i22 = i58;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i86222222222222 = i51;
                                    i48 = i22;
                                    i10 = i86222222222222;
                                    break;
                                } else {
                                    int i92 = i49 | i83;
                                    int iZzk3 = zzgzo.zzk(bArr, i51, zzgznVar3);
                                    i18 = i57;
                                    i17 = i54;
                                    unsafe8.putLong(obj, j2, zzham.zzH(zzgznVar3.zzb));
                                    iZzg = iZzk3;
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i92;
                                    i46 = i18;
                                    i47 = i17;
                                    i48 = i58;
                                    i50 = i12;
                                    i45 = -1;
                                }
                            default:
                                i17 = i54;
                                i18 = i57;
                                i19 = i58;
                                if (i55 != 3) {
                                    i21 = i49;
                                    i22 = i19;
                                    i57 = i18;
                                    i23 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i21;
                                    i14 = i23;
                                    i5 = i2;
                                    zzgznVar2 = zzgznVar3;
                                    i15 = i57;
                                    unsafe2 = unsafe4;
                                    int i862222222222222 = i51;
                                    i48 = i22;
                                    i10 = i862222222222222;
                                    break;
                                } else {
                                    int i93 = i49 | i83;
                                    Object objZzA2 = zzhdhVar2.zzA(obj3, i17);
                                    int iZzl2 = zzgzo.zzl(objZzA2, zzhdhVar2.zzx(i17), bArr, i51, i2, (i18 << 3) | 4, zzgznVar);
                                    zzhdhVar2.zzJ(obj3, i17, objZzA2);
                                    i44 = i3;
                                    zzgznVar3 = zzgznVar3;
                                    i43 = i2;
                                    unsafe8 = unsafe8;
                                    iZzg = iZzl2;
                                    i45 = -1;
                                    i50 = i12;
                                    i49 = i93;
                                    i48 = i19;
                                    i47 = i17;
                                    i46 = i18;
                                }
                        }
                    }
                } else {
                    i10 = i51;
                    i11 = i49;
                    i12 = i50;
                    i48 = i9;
                    i13 = i45;
                    unsafe2 = unsafe8;
                    zzgznVar2 = zzgznVar3;
                    i4 = i44;
                    i5 = i43;
                    i14 = 0;
                    i15 = i53;
                }
                if (i48 != i4 || i4 == 0) {
                    if (!this.zzh || zzgznVar2.zzd == zzhay.zza) {
                        i16 = i48;
                        unsafe3 = unsafe2;
                        iZzg = zzgzo.zzg(i16, bArr, i10, i2, zzd(obj), zzgznVar);
                    } else {
                        if (zzgznVar2.zzd.zzc(this.zzg, i15) != null) {
                            throw null;
                        }
                        i16 = i48;
                        unsafe3 = unsafe2;
                        iZzg = zzgzo.zzg(i48, bArr, i10, i2, zzd(obj), zzgznVar);
                    }
                    i47 = i14;
                    i46 = i15;
                    zzhdhVar2 = this;
                    i48 = i16;
                    unsafe8 = unsafe3;
                    i49 = i11;
                    i50 = i12;
                    zzgznVar3 = zzgznVar2;
                    i44 = i4;
                    i43 = i5;
                    i45 = i13;
                } else {
                    i8 = 1048575;
                    zzhdhVar = this;
                    i6 = i10;
                    i7 = i48;
                    i49 = i11;
                    unsafe = unsafe2;
                    i50 = i12;
                }
            } else {
                zzhdhVar = zzhdhVar2;
                i4 = i44;
                i5 = i43;
                unsafe = unsafe8;
                i6 = iZzg;
                i7 = i48;
                i8 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Object zze() {
        return ((zzhbo) this.zzg).zzbj();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzhbo) {
                zzhbo zzhboVar = (zzhbo) obj;
                zzhboVar.zzbU();
                zzhboVar.zzbT();
                zzhboVar.zzbW();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
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
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhcy) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzhfa.zzr(obj, j, zzhfa.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzhfa.zzs(obj, j, zzhfa.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzhfa.zzu(obj, j, zzhfa.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzhfa.zzu(obj, j, zzhfa.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzhfa.zzt(obj, j, zzhfa.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzhfa.zzu(obj, j, zzhfa.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzhfa.zzt(obj, j, zzhfa.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzhfa.zzp(obj, j, zzhfa.zzz(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzhfa.zzv(obj, j, zzhfa.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzhfa.zzv(obj, j, zzhfa.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzhfa.zzt(obj, j, zzhfa.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzhfa.zzt(obj, j, zzhfa.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzhfa.zzt(obj, j, zzhfa.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzhfa.zzu(obj, j, zzhfa.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzhfa.zzt(obj, j, zzhfa.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzhfa.zzu(obj, j, zzhfa.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzheb.zza;
                    zzhfa.zzv(obj, j, zzhcz.zzb(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzhfa.zzv(obj, j, zzhfa.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzF(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj2, i3, i)) {
                        zzhfa.zzv(obj, j, zzhfa.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzheb.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzheb.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0642 A[LOOP:2: B:172:0x063e->B:174:0x0642, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzhdr zzhdrVar, zzhay zzhayVar) throws Throwable {
        zzheq zzheqVar;
        Object obj2;
        int i;
        zzheq zzheqVar2;
        Object obj3;
        Object obj4;
        zzhaz zzhazVar;
        zzhay zzhayVar2;
        Object obj5 = obj;
        zzhay zzhayVar3 = zzhayVar;
        zzhayVar.getClass();
        zzD(obj);
        zzheq zzheqVar3 = this.zzn;
        zzhaz zzhazVar2 = this.zzo;
        zzhbd zzhbdVarZzc = null;
        Object objZzc = null;
        while (true) {
            try {
                int iZzc = zzhdrVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    obj4 = objZzc;
                    zzheqVar = zzheqVar3;
                    obj2 = obj5;
                    try {
                        int iZzu = zzu(iZzq);
                        try {
                        } catch (zzhcc unused) {
                            objZzc = obj4;
                            zzhazVar = zzhazVar2;
                            zzhayVar2 = zzhayVar3;
                        }
                        switch (zzt(iZzu)) {
                            case 0:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzr(obj2, iZzu & 1048575, zzhdrVar.zza());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 1:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzs(obj2, iZzu & 1048575, zzhdrVar.zzb());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 2:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzu(obj2, iZzu & 1048575, zzhdrVar.zzl());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 3:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzu(obj2, iZzu & 1048575, zzhdrVar.zzo());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 4:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzt(obj2, iZzu & 1048575, zzhdrVar.zzg());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 5:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzu(obj2, iZzu & 1048575, zzhdrVar.zzk());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 6:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzt(obj2, iZzu & 1048575, zzhdrVar.zzf());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 7:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzp(obj2, iZzu & 1048575, zzhdrVar.zzP());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 8:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzG(obj2, iZzu, zzhdrVar);
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 9:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhde zzhdeVar = (zzhde) zzA(obj2, iZzq);
                                zzhdrVar.zzw(zzhdeVar, zzx(iZzq), zzhayVar2);
                                zzJ(obj2, iZzq, zzhdeVar);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 10:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzv(obj2, iZzu & 1048575, zzhdrVar.zzp());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 11:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzt(obj2, iZzu & 1048575, zzhdrVar.zzj());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 12:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                int iZze = zzhdrVar.zze();
                                zzhbu zzhbuVarZzw = zzw(iZzq);
                                if (zzhbuVarZzw == null || zzhbuVarZzw.zza(iZze)) {
                                    zzhfa.zzt(obj2, iZzu & 1048575, iZze);
                                    zzH(obj2, iZzq);
                                } else {
                                    objZzc = zzheb.zzp(obj2, iZzc, iZze, objZzc, zzheqVar);
                                }
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                                break;
                            case 13:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzt(obj2, iZzu & 1048575, zzhdrVar.zzh());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 14:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzu(obj2, iZzu & 1048575, zzhdrVar.zzm());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 15:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzt(obj2, iZzu & 1048575, zzhdrVar.zzi());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 16:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhfa.zzu(obj2, iZzu & 1048575, zzhdrVar.zzn());
                                zzH(obj2, iZzq);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 17:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhde zzhdeVar2 = (zzhde) zzA(obj2, iZzq);
                                zzhdrVar.zzv(zzhdeVar2, zzx(iZzq), zzhayVar2);
                                zzJ(obj2, iZzq, zzhdeVar2);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 18:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzz(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 19:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzD(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 20:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzG(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 21:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzO(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 22:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzF(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 23:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzC(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 24:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzB(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 25:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzx(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 26:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                if (zzM(iZzu)) {
                                    ((zzhan) zzhdrVar).zzM(this.zzm.zza(obj2, iZzu & 1048575), true);
                                } else {
                                    ((zzhan) zzhdrVar).zzM(this.zzm.zza(obj2, iZzu & 1048575), false);
                                }
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 27:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzH(this.zzm.zza(obj2, iZzu & 1048575), zzx(iZzq), zzhayVar2);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 28:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzy(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzN(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 30:
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                List listZza = this.zzm.zza(obj2, iZzu & 1048575);
                                zzhdrVar.zzA(listZza);
                                objZzc = zzheb.zzo(obj, iZzc, listZza, zzw(iZzq), obj4, zzheqVar);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzI(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 32:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzJ(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 33:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzK(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 34:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzL(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 35:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzz(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 36:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzD(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 37:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzG(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 38:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzO(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 39:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzF(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 40:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzC(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 41:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzB(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 42:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzx(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 43:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                zzhdrVar.zzN(this.zzm.zza(obj2, iZzu & 1048575));
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 44:
                                List listZza2 = this.zzm.zza(obj2, iZzu & 1048575);
                                zzhdrVar.zzA(listZza2);
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                objZzc = zzheb.zzo(obj, iZzc, listZza2, zzw(iZzq), obj4, zzheqVar);
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 45:
                                zzhdrVar.zzI(this.zzm.zza(obj2, iZzu & 1048575));
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 46:
                                zzhdrVar.zzJ(this.zzm.zza(obj2, iZzu & 1048575));
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 47:
                                zzhdrVar.zzK(this.zzm.zza(obj2, iZzu & 1048575));
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                zzhdrVar.zzL(this.zzm.zza(obj2, iZzu & 1048575));
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                zzhdrVar.zzE(this.zzm.zza(obj2, iZzu & 1048575), zzx(iZzq), zzhayVar3);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 50:
                                Object objZzz = zzz(iZzq);
                                long jZzu = zzu(iZzq) & 1048575;
                                Object objZzh = zzhfa.zzh(obj2, jZzu);
                                if (objZzh == null) {
                                    objZzh = zzhcy.zza().zzb();
                                    zzhfa.zzv(obj2, jZzu, objZzh);
                                } else if (zzhcz.zza(objZzh)) {
                                    Object objZzb = zzhcy.zza().zzb();
                                    zzhcz.zzb(objZzb, objZzh);
                                    zzhfa.zzv(obj2, jZzu, objZzb);
                                    objZzh = objZzb;
                                }
                                throw null;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Double.valueOf(zzhdrVar.zza()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Float.valueOf(zzhdrVar.zzb()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Long.valueOf(zzhdrVar.zzl()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Long.valueOf(zzhdrVar.zzo()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Integer.valueOf(zzhdrVar.zzg()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 56:
                                zzhfa.zzv(obj2, iZzu & 1048575, Long.valueOf(zzhdrVar.zzk()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 57:
                                zzhfa.zzv(obj2, iZzu & 1048575, Integer.valueOf(zzhdrVar.zzf()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 58:
                                zzhfa.zzv(obj2, iZzu & 1048575, Boolean.valueOf(zzhdrVar.zzP()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 59:
                                zzG(obj2, iZzu, zzhdrVar);
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                zzhde zzhdeVar3 = (zzhde) zzB(obj2, iZzc, iZzq);
                                zzhdrVar.zzw(zzhdeVar3, zzx(iZzq), zzhayVar3);
                                zzK(obj2, iZzc, iZzq, zzhdeVar3);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, zzhdrVar.zzp());
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 62:
                                zzhfa.zzv(obj2, iZzu & 1048575, Integer.valueOf(zzhdrVar.zzj()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                int iZze2 = zzhdrVar.zze();
                                zzhbu zzhbuVarZzw2 = zzw(iZzq);
                                if (zzhbuVarZzw2 != null && !zzhbuVarZzw2.zza(iZze2)) {
                                    objZzc = zzheb.zzp(obj2, iZzc, iZze2, obj4, zzheqVar);
                                    obj5 = obj2;
                                    zzheqVar3 = zzheqVar;
                                }
                                zzhfa.zzv(obj2, iZzu & 1048575, Integer.valueOf(iZze2));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                                break;
                            case 64:
                                zzhfa.zzv(obj2, iZzu & 1048575, Integer.valueOf(zzhdrVar.zzh()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Long.valueOf(zzhdrVar.zzm()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Integer.valueOf(zzhdrVar.zzi()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                zzhfa.zzv(obj2, iZzu & 1048575, Long.valueOf(zzhdrVar.zzn()));
                                zzI(obj2, iZzc, iZzq);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            case 68:
                                zzhde zzhdeVar4 = (zzhde) zzB(obj2, iZzc, iZzq);
                                zzhdrVar.zzv(zzhdeVar4, zzx(iZzq), zzhayVar3);
                                zzK(obj2, iZzc, iZzq, zzhdeVar4);
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                            default:
                                objZzc = obj4;
                                zzhazVar = zzhazVar2;
                                zzhayVar2 = zzhayVar3;
                                if (objZzc == null) {
                                    try {
                                        try {
                                            objZzc = zzheqVar.zzc(obj2);
                                        } catch (Throwable th) {
                                            th = th;
                                            break;
                                        }
                                    } catch (zzhcc unused2) {
                                        zzheqVar.zzs(zzhdrVar);
                                        if (objZzc == null) {
                                            objZzc = zzheqVar.zzc(obj2);
                                        }
                                        if (!zzheqVar.zzr(objZzc, zzhdrVar)) {
                                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                                zzy(obj, this.zzj[i2], objZzc, zzheqVar, obj);
                                            }
                                            if (objZzc == null) {
                                            }
                                        }
                                        obj5 = obj2;
                                        zzhazVar2 = zzhazVar;
                                        zzhayVar3 = zzhayVar2;
                                        zzheqVar3 = zzheqVar;
                                    }
                                }
                                if (!zzheqVar.zzr(objZzc, zzhdrVar)) {
                                    for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                        zzy(obj, this.zzj[i3], objZzc, zzheqVar, obj);
                                    }
                                }
                                obj5 = obj2;
                                zzhazVar2 = zzhazVar;
                                zzhayVar3 = zzhayVar2;
                                zzheqVar3 = zzheqVar;
                                break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objZzc = obj4;
                        while (i < this.zzl) {
                        }
                        if (objZzc != null) {
                        }
                        throw th;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzy(obj, this.zzj[i4], objZzc, zzheqVar3, obj);
                    }
                    zzheqVar = zzheqVar3;
                    obj2 = obj5;
                } else {
                    try {
                        Object objZzd = !this.zzh ? null : zzhazVar2.zzd(zzhayVar3, this.zzg, iZzc);
                        if (objZzd != null) {
                            if (zzhbdVarZzc == null) {
                                zzhbdVarZzc = zzhazVar2.zzc(obj5);
                            }
                            zzhbd zzhbdVar = zzhbdVarZzc;
                            obj4 = objZzc;
                            zzheqVar2 = zzheqVar3;
                            obj3 = obj5;
                            try {
                                objZzc = zzhazVar2.zze(obj, zzhdrVar, objZzd, zzhayVar, zzhbdVar, obj4, zzheqVar2);
                                zzhbdVarZzc = zzhbdVar;
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = obj3;
                                zzheqVar = zzheqVar2;
                                objZzc = obj4;
                                while (i < this.zzl) {
                                }
                                if (objZzc != null) {
                                }
                                throw th;
                            }
                        } else {
                            Object obj6 = objZzc;
                            zzheqVar2 = zzheqVar3;
                            obj3 = obj5;
                            zzheqVar2.zzs(zzhdrVar);
                            objZzc = obj6 == null ? zzheqVar2.zzc(obj3) : obj6;
                            try {
                                if (!zzheqVar2.zzr(objZzc, zzhdrVar)) {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzheq zzheqVar4 = zzheqVar2;
                                        zzy(obj, this.zzj[i5], objZzc, zzheqVar4, obj);
                                        i5++;
                                        obj3 = obj3;
                                        zzheqVar2 = zzheqVar4;
                                    }
                                    obj2 = obj3;
                                    zzheqVar = zzheqVar2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj2 = obj3;
                                zzheqVar = zzheqVar2;
                            }
                        }
                        obj5 = obj3;
                        zzheqVar3 = zzheqVar2;
                    } catch (Throwable th5) {
                        th = th5;
                        zzheqVar = zzheqVar3;
                        obj2 = obj5;
                        while (i < this.zzl) {
                        }
                        if (objZzc != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
            for (i = this.zzk; i < this.zzl; i++) {
                zzy(obj, this.zzj[i], objZzc, zzheqVar, obj);
            }
            if (objZzc != null) {
                zzheqVar.zzn(obj2, objZzc);
            }
            throw th;
        }
        if (objZzc == null) {
            zzheqVar.zzn(obj2, objZzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgzn zzgznVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgznVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzhfi zzhfiVar) throws IOException {
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
            zzhbd zzhbdVarZzb = this.zzo.zzb(obj);
            if (zzhbdVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzg = zzhbdVarZzb.zzg();
                entry = (Map.Entry) itZzg.next();
                it = itZzg;
            }
        }
        int[] iArr2 = this.zzc;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < iArr2.length) {
            int iZzu = zzu(i5);
            int[] iArr3 = this.zzc;
            int iZzt = zzt(iZzu);
            int i6 = iArr3[i5];
            if (iZzt <= 17) {
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
            while (entry2 != null && this.zzo.zza(entry2) <= i6) {
                this.zzo.zzi(zzhfiVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    it2 = it;
                    iArr = iArr2;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzf(i6, zzhfa.zzb(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzo(i6, zzhfa.zzc(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzt(i6, unsafe.getLong(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzK(i6, unsafe.getLong(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzr(i6, unsafe.getInt(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzm(i6, unsafe.getLong(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzk(i6, unsafe.getInt(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzb(i6, zzhfa.zzz(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzT(i6, unsafe.getObject(obj, j), zzhfiVar);
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzv(i6, unsafe.getObject(obj, j), zzx(i5));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzd(i6, (zzhac) unsafe.getObject(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzI(i6, unsafe.getInt(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzi(i6, unsafe.getInt(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzx(i6, unsafe.getInt(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzz(i6, unsafe.getLong(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzB(i6, unsafe.getInt(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzD(i6, unsafe.getLong(obj, j));
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
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhfiVar.zzq(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 18:
                    z = false;
                    zzheb.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzK(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzB(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzy(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 26:
                    zzheb.zzI(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 27:
                    zzheb.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, zzx(i5));
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 28:
                    zzheb.zzu(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    z2 = false;
                    zzheb.zzJ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzG(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
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
                    zzheb.zzH(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, false);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 35:
                    zzheb.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 36:
                    zzheb.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 37:
                    zzheb.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 38:
                    zzheb.zzK(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 39:
                    zzheb.zzB(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 40:
                    zzheb.zzy(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 41:
                    zzheb.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 42:
                    zzheb.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 43:
                    zzheb.zzJ(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 44:
                    zzheb.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 45:
                    zzheb.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 46:
                    zzheb.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case 47:
                    zzheb.zzG(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzheb.zzH(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, true);
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzheb.zzA(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhfiVar, zzx(i5));
                    it2 = it;
                    iArr = iArr2;
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it2;
                    iArr2 = iArr;
                    i4 = i;
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzf(i6, zzn(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzo(i6, zzo(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzt(i6, zzv(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzK(i6, zzv(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzr(i6, zzp(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzm(i6, zzv(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzk(i6, zzp(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzb(i6, zzS(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzT(i6, unsafe.getObject(obj, j), zzhfiVar);
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzv(i6, unsafe.getObject(obj, j), zzx(i5));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzd(i6, (zzhac) unsafe.getObject(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzI(i6, zzp(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzi(i6, zzp(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzx(i6, zzp(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzz(i6, zzv(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzB(i6, zzp(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzD(i6, zzv(obj, j));
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
                    if (zzR(obj, i6, i5)) {
                        zzhfiVar.zzq(i6, unsafe.getObject(obj, j), zzx(i5));
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
            this.zzo.zzi(zzhfiVar, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        zzheq zzheqVar = this.zzn;
        zzheqVar.zzq(zzheqVar.zzd(obj), zzhfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzL;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzhfa.zzb(obj, j)) != Double.doubleToLongBits(zzhfa.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzhfa.zzc(obj, j)) != Float.floatToIntBits(zzhfa.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzhfa.zzf(obj, j) != zzhfa.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzhfa.zzf(obj, j) != zzhfa.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzhfa.zzd(obj, j) != zzhfa.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzhfa.zzf(obj, j) != zzhfa.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzhfa.zzd(obj, j) != zzhfa.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzhfa.zzz(obj, j) != zzhfa.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzheb.zzL(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzheb.zzL(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzheb.zzL(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzhfa.zzd(obj, j) != zzhfa.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzhfa.zzd(obj, j) != zzhfa.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzhfa.zzd(obj, j) != zzhfa.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzhfa.zzf(obj, j) != zzhfa.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzhfa.zzd(obj, j) != zzhfa.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzhfa.zzf(obj, j) != zzhfa.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzheb.zzL(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j))) {
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
                    zZzL = zzheb.zzL(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j));
                    break;
                case 50:
                    zZzL = zzheb.zzL(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j));
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
                    long jZzr = zzr(i) & 1048575;
                    if (zzhfa.zzd(obj, jZzr) != zzhfa.zzd(obj2, jZzr) || !zzheb.zzL(zzhfa.zzh(obj, j), zzhfa.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzL) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzo.zzb(obj).equals(this.zzo.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int iZzu = zzu(i6);
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
            if ((268435456 & iZzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i6, i, i2, i10) && !zzP(obj, iZzu, zzx(i6))) {
                    return false;
                }
            } else if (iZzt == 27) {
                List list = (List) zzhfa.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhdz zzhdzVarZzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzhdzVarZzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i7, i6) && !zzP(obj, iZzu, zzx(i6))) {
                    return false;
                }
            } else if (iZzt != 49) {
                if (iZzt == 50 && !((zzhcy) zzhfa.zzh(obj, iZzu & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        return !this.zzh || this.zzo.zzb(obj).zzl();
    }
}
