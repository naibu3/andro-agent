package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzlj zzljVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i) {
        int i2 = i / 3;
        return (zzkg) this.zzd[i2 + i2 + 1];
    }

    private final zzlu zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzluVarZzb = zzlr.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzluVarZzb;
        return zzluVarZzb;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i) {
        long jZzB = zzB(i) & 1048575;
        if (zzO(obj2, i)) {
            Object objZzf = zzmv.zzf(obj, jZzB);
            Object objZzf2 = zzmv.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, jZzB, zzkk.zzg(objZzf, objZzf2));
                zzJ(obj, i);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int iZzB = zzB(i);
        int i2 = this.zzc[i];
        long j = iZzB & 1048575;
        if (zzR(obj2, i2, i)) {
            Object objZzf = zzR(obj, i2, i) ? zzmv.zzf(obj, j) : null;
            Object objZzf2 = zzmv.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(objZzf, objZzf2));
                zzK(obj, i2, i);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, j, objZzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmv.zzq(obj, zzy(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iZzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzB & i2;
            switch (iZzA) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i6, zzmv.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i6, zzmv.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i6, zzmv.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    z = false;
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 30:
                    z = false;
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    z = false;
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 32:
                    z = false;
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 33:
                    z = false;
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 34:
                    z = false;
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzlw.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 50:
                    zzM(zzndVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzb(i6, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i4)) {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i);
        long j2 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j2)) != 0;
            case 2:
                return zzmv.zzd(obj, j2) != 0;
            case 3:
                return zzmv.zzd(obj, j2) != 0;
            case 4:
                return zzmv.zzc(obj, j2) != 0;
            case 5:
                return zzmv.zzd(obj, j2) != 0;
            case 6:
                return zzmv.zzc(obj, j2) != 0;
            case 7:
                return zzmv.zzw(obj, j2);
            case 8:
                Object objZzf = zzmv.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjb) {
                    return !zzjb.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j2) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j2));
            case 11:
                return zzmv.zzc(obj, j2) != 0;
            case 12:
                return zzmv.zzc(obj, j2) != 0;
            case 13:
                return zzmv.zzc(obj, j2) != 0;
            case 14:
                return zzmv.zzd(obj, j2) != 0;
            case 15:
                return zzmv.zzc(obj, j2) != 0;
            case 16:
                return zzmv.zzd(obj, j2) != 0;
            case 17:
                return zzmv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzO(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzmv.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i, (String) obj);
        } else {
            zzndVar.zzd(i, (zzjb) obj);
        }
    }

    static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zzmmVarZze = zzmm.zze();
        zzkcVar.zzc = zzmmVarZze;
        return zzmmVarZze;
    }

    static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Object[] objArr;
        String str;
        int i20;
        int i21;
        int i22;
        Field fieldZzG;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzG2;
        Object obj2;
        Field fieldZzG3;
        int i26;
        char cCharAt10;
        int i27;
        char cCharAt11;
        int i28;
        char cCharAt12;
        int i29;
        char cCharAt13;
        boolean z = zzltVar.zzc() == 2;
        String strZzd = zzltVar.zzd();
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
        int iCharAt4 = strZzd.charAt(i);
        if (iCharAt4 >= 55296) {
            int i32 = iCharAt4 & 8191;
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
            iCharAt4 = i32 | (cCharAt13 << i33);
            i31 = i29;
        }
        if (iCharAt4 == 0) {
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i4 = 0;
            iCharAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt5 = strZzd.charAt(i31);
            if (iCharAt5 >= 55296) {
                int i35 = iCharAt5 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    cCharAt8 = strZzd.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                iCharAt5 = i35 | (cCharAt8 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int iCharAt6 = strZzd.charAt(i34);
            if (iCharAt6 >= 55296) {
                int i38 = iCharAt6 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    cCharAt7 = strZzd.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                iCharAt6 = i38 | (cCharAt7 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            iCharAt = strZzd.charAt(i37);
            if (iCharAt >= 55296) {
                int i41 = iCharAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    cCharAt6 = strZzd.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                iCharAt = i41 | (cCharAt6 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int iCharAt7 = strZzd.charAt(i40);
            if (iCharAt7 >= 55296) {
                int i44 = iCharAt7 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    cCharAt5 = strZzd.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                iCharAt7 = i44 | (cCharAt5 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            iCharAt2 = strZzd.charAt(i43);
            if (iCharAt2 >= 55296) {
                int i47 = iCharAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    cCharAt4 = strZzd.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                iCharAt2 = i47 | (cCharAt4 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int iCharAt8 = strZzd.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    cCharAt3 = strZzd.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                iCharAt8 = i50 | (cCharAt3 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int iCharAt9 = strZzd.charAt(i49);
            if (iCharAt9 >= 55296) {
                int i53 = iCharAt9 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    cCharAt2 = strZzd.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                iCharAt9 = i53 | (cCharAt2 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            iCharAt3 = strZzd.charAt(i52);
            if (iCharAt3 >= 55296) {
                int i56 = iCharAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt = strZzd.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                iCharAt3 = i56 | (cCharAt << i57);
                i55 = i6;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i2 = iCharAt5 + iCharAt5 + iCharAt6;
            i3 = iCharAt5;
            i31 = i55;
            int i58 = iCharAt8;
            i4 = iCharAt7;
            i5 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 + iCharAt2];
        int i59 = iCharAt3 + i5;
        int i60 = iCharAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
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
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int iCharAt11 = strZzd.charAt(i14);
            if (iCharAt11 >= c) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    cCharAt11 = strZzd.charAt(i70);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = iCharAt11 & 255;
            int i73 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i75 = iCharAt12 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        cCharAt10 = strZzd.charAt(i76);
                        i18 = i4;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i75 |= (cCharAt10 & 8191) << i77;
                        i77 += 13;
                        i76 = i26;
                        i4 = i18;
                    }
                    iCharAt12 = i75 | (cCharAt10 << i77);
                    i24 = i26;
                } else {
                    i18 = i4;
                    i24 = i74;
                }
                int i78 = i72 - 51;
                int i79 = i24;
                if (i78 == 9 || i78 == 17) {
                    int i80 = i62 / 3;
                    i25 = i2 + 1;
                    objArr2[i80 + i80 + 1] = objArrZze[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i81 = i62 / 3;
                        i25 = i2 + 1;
                        objArr2[i81 + i81 + 1] = objArrZze[i2];
                    }
                    int i82 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i82];
                    if (obj instanceof Field) {
                        fieldZzG2 = zzG(cls, (String) obj);
                        objArrZze[i82] = fieldZzG2;
                    } else {
                        fieldZzG2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzG2);
                    int i83 = i82 + 1;
                    obj2 = objArrZze[i83];
                    if (obj2 instanceof Field) {
                        fieldZzG3 = zzG(cls, (String) obj2);
                        objArrZze[i83] = fieldZzG3;
                    } else {
                        fieldZzG3 = (Field) obj2;
                    }
                    str = strZzd;
                    objArr = objArr2;
                    i20 = i2;
                    i21 = i79;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i22 = 0;
                }
                i2 = i25;
                int i822 = iCharAt12 + iCharAt12;
                obj = objArrZze[i822];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i17 = iCharAt;
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldZzG2);
                int i832 = i822 + 1;
                obj2 = objArrZze[i832];
                if (obj2 instanceof Field) {
                }
                str = strZzd;
                objArr = objArr2;
                i20 = i2;
                i21 = i79;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG3);
                iObjectFieldOffset = iObjectFieldOffset32;
                i22 = 0;
            } else {
                iArr2 = iArr3;
                i17 = iCharAt;
                i18 = i4;
                int i84 = i2 + 1;
                Field fieldZzG4 = zzG(cls, (String) objArrZze[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i85 = i62 / 3;
                    objArr2[i85 + i85 + 1] = fieldZzG4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i86 = i62 / 3;
                        i23 = i2 + 2;
                        objArr2[i86 + i86 + 1] = objArrZze[i84];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i87 = i62 / 3;
                            i23 = i2 + 2;
                            objArr2[i87 + i87 + 1] = objArrZze[i84];
                        }
                    } else if (i72 == 50) {
                        int i88 = i60 + 1;
                        iArr[i60] = i62;
                        int i89 = i62 / 3;
                        int i90 = i89 + i89;
                        int i91 = i2 + 2;
                        objArr2[i90] = objArrZze[i84];
                        if ((iCharAt11 & 2048) != 0) {
                            i84 = i2 + 3;
                            objArr2[i90 + 1] = objArrZze[i91];
                            i60 = i88;
                        } else {
                            i60 = i88;
                            i19 = i91;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                            iObjectFieldOffset2 = 1048575;
                            objArr = objArr2;
                            if ((iCharAt11 & 4096) != 4096 || i72 > 17) {
                                str = strZzd;
                                i20 = i19;
                                i21 = i16;
                                i22 = 0;
                            } else {
                                int i92 = i16 + 1;
                                int iCharAt13 = strZzd.charAt(i16);
                                if (iCharAt13 >= 55296) {
                                    int i93 = iCharAt13 & 8191;
                                    int i94 = 13;
                                    while (true) {
                                        i21 = i92 + 1;
                                        cCharAt9 = strZzd.charAt(i92);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i93 |= (cCharAt9 & 8191) << i94;
                                        i94 += 13;
                                        i92 = i21;
                                    }
                                    iCharAt13 = i93 | (cCharAt9 << i94);
                                } else {
                                    i21 = i92;
                                }
                                int i95 = i3 + i3 + (iCharAt13 / 32);
                                Object obj3 = objArrZze[i95];
                                str = strZzd;
                                if (obj3 instanceof Field) {
                                    fieldZzG = (Field) obj3;
                                } else {
                                    fieldZzG = zzG(cls, (String) obj3);
                                    objArrZze[i95] = fieldZzG;
                                }
                                i20 = i19;
                                i22 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG);
                            }
                            if (i72 >= 18 && i72 <= 49) {
                                iArr[i61] = iObjectFieldOffset;
                                i61++;
                            }
                        }
                    }
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                    iObjectFieldOffset2 = 1048575;
                    objArr = objArr2;
                    if ((iCharAt11 & 4096) != 4096) {
                        str = strZzd;
                        i20 = i19;
                        i21 = i16;
                        i22 = 0;
                        if (i72 >= 18) {
                            iArr[i61] = iObjectFieldOffset;
                            i61++;
                        }
                    }
                }
                i19 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG4);
                iObjectFieldOffset2 = 1048575;
                objArr = objArr2;
                if ((iCharAt11 & 4096) != 4096) {
                }
            }
            int i96 = i62 + 1;
            iArr2[i62] = iCharAt10;
            int i97 = i62 + 2;
            iArr2[i96] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | iObjectFieldOffset;
            i62 += 3;
            iArr2[i97] = (i22 << 20) | iObjectFieldOffset2;
            i2 = i20;
            iCharAt = i17;
            iCharAt3 = i73;
            i31 = i21;
            length = i15;
            objArr2 = objArr;
            strZzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzlm(iArr3, objArr2, iCharAt, i4, zzltVar.zza(), z, false, iArr, iCharAt3, i59, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int i2;
        int iZzu;
        boolean z;
        int iZzd2;
        int iZzi;
        int iZzz;
        int iZzA8;
        int iZzA9;
        int iZzA10;
        int iZzA11;
        int iZzA12;
        int iZzB2;
        int iZzA13;
        int iZzd3;
        int iZzA14;
        int i3;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int iZzA15 = 0;
        int i7 = 0;
        while (i6 < this.zzc.length) {
            int iZzB3 = zzB(i6);
            int[] iArr = this.zzc;
            int i8 = iArr[i6];
            int iZzA16 = zzA(iZzB3);
            if (iZzA16 <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i4;
                i = 1 << (i9 >>> 20);
                if (i10 != i5) {
                    i7 = unsafe.getInt(obj, i10);
                    i5 = i10;
                }
            } else {
                i = 0;
            }
            long j = iZzB3 & i4;
            switch (iZzA16) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA2 = zzjj.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA3 = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB(j2);
                        iZzA15 += iZzA3 + iZzB;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA3 = zzjj.zzA(i8 << 3);
                        iZzB = zzjj.zzB(j3);
                        iZzA15 += iZzA3 + iZzB;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i11 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzv(i11);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA2 = zzjj.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA5 = zzjj.zzA(i8 << 3) + 1;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i8 << 3);
                            iZzd = ((zzjb) object).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i2 = iZzA6 + iZzA7 + iZzd;
                            iZzA15 += i2;
                            break;
                        } else {
                            iZzA4 = zzjj.zzA(i8 << 3);
                            iZzv = zzjj.zzy((String) object);
                            i2 = iZzA4 + iZzv;
                            iZzA15 += i2;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA5 = zzlw.zzo(i8, unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzA5;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        iZzA6 = zzjj.zzA(i8 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i2 = iZzA6 + iZzA7 + iZzd;
                        iZzA15 += i2;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzA(i12);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzv(i13);
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA2 = zzjj.zzA(i8 << 3);
                        iZzA5 = iZzA2 + 4;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA = zzjj.zzA(i8 << 3);
                        iZzA5 = iZzA + 8;
                        iZzA15 += iZzA5;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i8 << 3);
                        iZzv = zzjj.zzA((i14 >> 31) ^ (i14 + i14));
                        i2 = iZzA4 + iZzv;
                        iZzA15 += i2;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        iZzA15 += zzjj.zzA(i8 << 3) + zzjj.zzB((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        iZzA5 = zzjj.zzu(i8, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzA5;
                        break;
                    }
                case 18:
                    iZzA5 = zzlw.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 19:
                    iZzA5 = zzlw.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 20:
                    iZzA5 = zzlw.zzm(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 21:
                    iZzA5 = zzlw.zzx(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 22:
                    iZzA5 = zzlw.zzk(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 23:
                    iZzA5 = zzlw.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 24:
                    iZzA5 = zzlw.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 25:
                    iZzA5 = zzlw.zza(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzA5;
                    break;
                case 26:
                    iZzu = zzlw.zzu(i8, (List) unsafe.getObject(obj, j));
                    iZzA15 += iZzu;
                    break;
                case 27:
                    iZzu = zzlw.zzp(i8, (List) unsafe.getObject(obj, j), zzE(i6));
                    iZzA15 += iZzu;
                    break;
                case 28:
                    iZzu = zzlw.zzc(i8, (List) unsafe.getObject(obj, j));
                    iZzA15 += iZzu;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iZzu = zzlw.zzv(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzu;
                    break;
                case 30:
                    z = false;
                    iZzd2 = zzlw.zzd(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    z = false;
                    iZzd2 = zzlw.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case 32:
                    z = false;
                    iZzd2 = zzlw.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case 33:
                    z = false;
                    iZzd2 = zzlw.zzq(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case 34:
                    z = false;
                    iZzd2 = zzlw.zzs(i8, (List) unsafe.getObject(obj, j), false);
                    iZzA15 += iZzd2;
                    break;
                case 35:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 36:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 37:
                    iZzi = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 38:
                    iZzi = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 39:
                    iZzi = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 40:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 41:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 42:
                    iZzi = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 43:
                    iZzi = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 44:
                    iZzi = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 45:
                    iZzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 46:
                    iZzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 47:
                    iZzi = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZzi = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iZzz = zzjj.zzz(i8);
                        iZzA8 = zzjj.zzA(iZzi);
                        iZzA9 = iZzz + iZzA8;
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzu = zzlw.zzj(i8, (List) unsafe.getObject(obj, j), zzE(i6));
                    iZzA15 += iZzu;
                    break;
                case 50:
                    zzle.zza(i8, unsafe.getObject(obj, j), zzF(i6));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i8, i6)) {
                        iZzA10 = zzjj.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i8, i6)) {
                        iZzA11 = zzjj.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i8, i6)) {
                        long jZzC = zzC(obj, j);
                        iZzA12 = zzjj.zzA(i8 << 3);
                        iZzB2 = zzjj.zzB(jZzC);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i8, i6)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA12 = zzjj.zzA(i8 << 3);
                        iZzB2 = zzjj.zzB(jZzC2);
                        iZzA15 += iZzA12 + iZzB2;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i8, i6)) {
                        int iZzr = zzr(obj, j);
                        iZzA9 = zzjj.zzA(i8 << 3);
                        iZzi = zzjj.zzv(iZzr);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 56:
                    if (zzR(obj, i8, i6)) {
                        iZzA10 = zzjj.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case 57:
                    if (zzR(obj, i8, i6)) {
                        iZzA11 = zzjj.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case 58:
                    if (zzR(obj, i8, i6)) {
                        iZzu = zzjj.zzA(i8 << 3) + 1;
                        iZzA15 += iZzu;
                    }
                    break;
                case 59:
                    if (zzR(obj, i8, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            iZzA13 = zzjj.zzA(i8 << 3);
                            iZzd3 = ((zzjb) object2).zzd();
                            iZzA14 = zzjj.zzA(iZzd3);
                            i3 = iZzA13 + iZzA14 + iZzd3;
                            iZzA15 += i3;
                        } else {
                            iZzA9 = zzjj.zzA(i8 << 3);
                            iZzi = zzjj.zzy((String) object2);
                            i3 = iZzA9 + iZzi;
                            iZzA15 += i3;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i8, i6)) {
                        iZzu = zzlw.zzo(i8, unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzu;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i8, i6)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        iZzA13 = zzjj.zzA(i8 << 3);
                        iZzd3 = zzjbVar2.zzd();
                        iZzA14 = zzjj.zzA(iZzd3);
                        i3 = iZzA13 + iZzA14 + iZzd3;
                        iZzA15 += i3;
                    }
                    break;
                case 62:
                    if (zzR(obj, i8, i6)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA9 = zzjj.zzA(i8 << 3);
                        iZzi = zzjj.zzA(iZzr2);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i8, i6)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA9 = zzjj.zzA(i8 << 3);
                        iZzi = zzjj.zzv(iZzr3);
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case 64:
                    if (zzR(obj, i8, i6)) {
                        iZzA11 = zzjj.zzA(i8 << 3);
                        iZzu = iZzA11 + 4;
                        iZzA15 += iZzu;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i8, i6)) {
                        iZzA10 = zzjj.zzA(i8 << 3);
                        iZzu = iZzA10 + 8;
                        iZzA15 += iZzu;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i8, i6)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA9 = zzjj.zzA(i8 << 3);
                        iZzi = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i3 = iZzA9 + iZzi;
                        iZzA15 += i3;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i8, i6)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA15 += zzjj.zzA(i8 << 3) + zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                    }
                    break;
                case 68:
                    if (zzR(obj, i8, i6)) {
                        iZzu = zzjj.zzu(i8, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        iZzA15 += iZzu;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int iZza = iZzA15 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzB2 = zzB(i3);
            int iZzA9 = zzA(iZzB2);
            int i4 = this.zzc[i3];
            long j = iZzB2 & 1048575;
            if (iZzA9 >= zzju.DOUBLE_LIST_PACKED.zza() && iZzA9 <= zzju.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (iZzA9) {
                case 0:
                    if (zzO(obj, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i3)) {
                        long jZzd = zzmv.zzd(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzd);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i3)) {
                        long jZzd2 = zzmv.zzd(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzd2);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i3)) {
                        int iZzc = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzc);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i3)) {
                        iZzA5 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i3)) {
                        break;
                    } else {
                        Object objZzf = zzmv.zzf(obj, j);
                        if (objZzf instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i4 << 3);
                            iZzd = ((zzjb) objZzf).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                            break;
                        } else {
                            iZzA4 = zzjj.zzA(i4 << 3);
                            iZzv = zzjj.zzy((String) objZzf);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzO(obj, i3)) {
                        iZzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i3)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j);
                        iZzA6 = zzjj.zzA(i4 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i3)) {
                        int iZzc2 = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA(iZzc2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i3)) {
                        int iZzc3 = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzc3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i3)) {
                        int iZzc4 = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i3)) {
                        long jZzd3 = zzmv.zzd(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i3)) {
                        iZzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iZzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 21:
                    iZzo = zzlw.zzx(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i4, (List) zzmv.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i4, (List) zzmv.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    iZzo = zzlw.zzv(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    iZzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 35:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZzv = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZzv = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZzv = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZzv = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZzv = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZzv = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZzv = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZzv = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzo = zzlw.zzj(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case 50:
                    zzle.zza(i4, zzmv.zzf(obj, j), zzF(i3));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i4, i3)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i4, i3)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        i2 += iZzA3 + iZzB;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i4, i3)) {
                        int iZzr = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzr);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i4, i3)) {
                        iZzA5 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i4, i3)) {
                        break;
                    } else {
                        Object objZzf2 = zzmv.zzf(obj, j);
                        if (objZzf2 instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i4 << 3);
                            iZzd = ((zzjb) objZzf2).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                            break;
                        } else {
                            iZzA4 = zzjj.zzA(i4 << 3);
                            iZzv = zzjj.zzy((String) objZzf2);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i4, i3)) {
                        iZzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i4, i3)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j);
                        iZzA6 = zzjj.zzA(i4 << 3);
                        iZzd = zzjbVar2.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i4, i3)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA(iZzr2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i4, i3)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i4, i3)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i4, i3)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i4, i3)) {
                        iZzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i2 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzldVarZzb = zzld.zza().zzb();
            zzle.zzb(zzldVarZzb, object);
            unsafe.putObject(obj, j, zzldVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i5 == 0) {
                    int iZzm = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case 62:
                if (i5 == 0) {
                    int iZzj = zzip.zzj(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj;
                }
                break;
            case 56:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int iZzm2 = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int iZzj2 = zzip.zzj(bArr, i, zzioVar);
                    int i9 = zzioVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zzna.zzf(bArr, iZzj2, iZzj2 + i9)) {
                            throw zzkm.zzc();
                        }
                        unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzkk.zzb));
                        iZzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzj2;
                }
                break;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    int iZzd = zzip.zzd(zzE(i8), bArr, i, i2, zzioVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzd;
                }
                break;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    int iZza = zzip.zza(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, zzioVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return iZza;
                }
                break;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 == 0) {
                    int iZzj3 = zzip.zzj(bArr, i, zzioVar);
                    int i10 = zzioVar.zza;
                    zzkg zzkgVarZzD = zzD(i8);
                    if (zzkgVarZzD == null || zzkgVarZzD.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzh(i3, Long.valueOf(i10));
                    }
                    return iZzj3;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                if (i5 == 0) {
                    int iZzj4 = zzip.zzj(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzj4;
                }
                break;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i5 == 0) {
                    int iZzm3 = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return iZzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int iZzc = zzip.zzc(zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzioVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object2, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0080. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        byte b;
        int iZzk;
        int i3;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzm;
        int iZzd;
        int i10;
        int i11;
        int i12;
        zzlm<T> zzlmVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i14 = 1048575;
        int i15 = -1;
        int iZzi = i;
        int i16 = -1;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (iZzi < i13) {
            int i20 = iZzi + 1;
            byte b2 = bArr2[iZzi];
            if (b2 < 0) {
                iZzk = zzip.zzk(b2, bArr2, i20, zzioVar2);
                b = zzioVar2.zza;
            } else {
                b = b2;
                iZzk = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            int iZzx = i21 > i16 ? zzlmVar.zzx(i21, i18 / 3) : zzlmVar.zzw(i21);
            if (iZzx == i15) {
                i3 = iZzk;
                i4 = i21;
                i5 = i15;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i23 = iArr[iZzx + 1];
                int iZzA = zzA(i23);
                long j = i23 & i14;
                if (iZzA <= 17) {
                    int i24 = iArr[iZzx + 2];
                    int i25 = 1 << (i24 >>> 20);
                    int i26 = i24 & 1048575;
                    if (i26 != i17) {
                        if (i17 != 1048575) {
                            unsafe2.putInt(obj2, i17, i19);
                        }
                        if (i26 != 1048575) {
                            i19 = unsafe2.getInt(obj2, i26);
                        }
                        i17 = i26;
                    }
                    switch (iZzA) {
                        case 0:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 1) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzmv.zzo(obj2, j, Double.longBitsToDouble(zzip.zzn(bArr2, i8)));
                                iZzi = i8 + 8;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 1:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 5) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzmv.zzp(obj2, j, Float.intBitsToFloat(zzip.zzb(bArr2, i8)));
                                iZzi = i8 + 4;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzm = zzip.zzm(bArr2, i8, zzioVar2);
                                unsafe2.putLong(obj, j, zzioVar2.zzb);
                                i19 |= i25;
                                iZzi = iZzm;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i8 = iZzk;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = zzip.zzj(bArr2, i8, zzioVar2);
                                unsafe2.putInt(obj2, j, zzioVar2.zza);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 1) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                i8 = iZzk;
                                unsafe2.putLong(obj, j, zzip.zzn(bArr2, iZzk));
                                iZzi = i8 + 8;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 5) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, zzip.zzb(bArr2, iZzk));
                                iZzi = iZzk + 4;
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 7:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = zzip.zzm(bArr2, iZzk, zzioVar2);
                                zzmv.zzm(obj2, j, zzioVar2.zzb != 0);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 8:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzi = (536870912 & i23) == 0 ? zzip.zzg(bArr2, iZzk, zzioVar2) : zzip.zzh(bArr2, iZzk, zzioVar2);
                                unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                i19 |= i25;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 9:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzip.zzd(zzlmVar.zzE(i7), bArr2, iZzk, i13, zzioVar2);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 10:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 2) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzip.zza(bArr2, iZzk, zzioVar2);
                                unsafe2.putObject(obj2, j, zzioVar2.zzc);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 12:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzip.zzj(bArr2, iZzk, zzioVar2);
                                unsafe2.putInt(obj2, j, zzioVar2.zza);
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 15:
                            zzioVar2 = zzioVar;
                            i7 = iZzx;
                            i9 = 1048575;
                            i4 = i21;
                            if (i22 != 0) {
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                iZzd = zzip.zzj(bArr2, iZzk, zzioVar2);
                                unsafe2.putInt(obj2, j, zzjf.zzb(zzioVar2.zza));
                                i19 |= i25;
                                iZzi = iZzd;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        case 16:
                            if (i22 != 0) {
                                i4 = i21;
                                i7 = iZzx;
                                i8 = iZzk;
                                i3 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                i5 = -1;
                                break;
                            } else {
                                zzioVar2 = zzioVar;
                                iZzm = zzip.zzm(bArr2, iZzk, zzioVar2);
                                i7 = iZzx;
                                i4 = i21;
                                i9 = 1048575;
                                unsafe2.putLong(obj, j, zzjf.zzc(zzioVar2.zzb));
                                i19 |= i25;
                                iZzi = iZzm;
                                i18 = i7;
                                i16 = i4;
                                i14 = i9;
                                i15 = -1;
                                break;
                            }
                        default:
                            i4 = i21;
                            i7 = iZzx;
                            i8 = iZzk;
                            i3 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            i5 = -1;
                            break;
                    }
                } else {
                    zzioVar2 = zzioVar;
                    i7 = iZzx;
                    int i27 = iZzk;
                    i9 = 1048575;
                    i4 = i21;
                    if (iZzA == 27) {
                        if (i22 == 2) {
                            zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj2, j);
                            if (!zzkjVarZzd.zzc()) {
                                int size = zzkjVarZzd.size();
                                zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzkjVarZzd);
                            }
                            iZzi = zzip.zze(zzlmVar.zzE(i7), b, bArr, i27, i2, zzkjVarZzd, zzioVar);
                            i19 = i19;
                            i18 = i7;
                            i16 = i4;
                            i14 = i9;
                            i15 = -1;
                        } else {
                            i10 = i27;
                            i11 = i19;
                            i12 = i17;
                            unsafe = unsafe2;
                            i6 = i7;
                            i5 = -1;
                        }
                    } else if (iZzA <= 49) {
                        i11 = i19;
                        i12 = i17;
                        i5 = -1;
                        unsafe = unsafe2;
                        i6 = i7;
                        iZzi = zzv(obj, bArr, i27, i2, b, i4, i22, i7, i23, iZzA, j, zzioVar);
                        if (iZzi != i27) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i13 = i2;
                            zzioVar2 = zzioVar;
                            i17 = i12;
                            i15 = i5;
                            i16 = i4;
                            i19 = i11;
                            i18 = i6;
                            unsafe2 = unsafe;
                            i14 = 1048575;
                            zzlmVar = this;
                        } else {
                            i3 = iZzi;
                            i17 = i12;
                            i19 = i11;
                        }
                    } else {
                        i10 = i27;
                        i11 = i19;
                        i12 = i17;
                        unsafe = unsafe2;
                        i6 = i7;
                        i5 = -1;
                        if (iZzA != 50) {
                            iZzi = zzt(obj, bArr, i10, i2, b, i4, i22, i23, iZzA, j, i6, zzioVar);
                            if (iZzi != i10) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i13 = i2;
                                zzioVar2 = zzioVar;
                                i17 = i12;
                                i15 = i5;
                                i16 = i4;
                                i19 = i11;
                                i18 = i6;
                                unsafe2 = unsafe;
                                i14 = 1048575;
                                zzlmVar = this;
                            } else {
                                i3 = iZzi;
                                i17 = i12;
                                i19 = i11;
                            }
                        } else if (i22 == 2) {
                            iZzi = zzs(obj, bArr, i10, i2, i6, j, zzioVar);
                            if (iZzi != i10) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i13 = i2;
                                zzioVar2 = zzioVar;
                                i17 = i12;
                                i15 = i5;
                                i16 = i4;
                                i19 = i11;
                                i18 = i6;
                                unsafe2 = unsafe;
                                i14 = 1048575;
                                zzlmVar = this;
                            } else {
                                i3 = iZzi;
                                i17 = i12;
                                i19 = i11;
                            }
                        }
                    }
                    i3 = i10;
                    i17 = i12;
                    i19 = i11;
                }
            }
            iZzi = zzip.zzi(b, bArr, i3, i2, zzd(obj), zzioVar);
            zzlmVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            zzioVar2 = zzioVar;
            i15 = i5;
            i16 = i4;
            i18 = i6;
            unsafe2 = unsafe;
            i14 = 1048575;
        }
        int i28 = i19;
        int i29 = i17;
        Unsafe unsafe3 = unsafe2;
        if (i29 != i14) {
            unsafe3.putInt(obj, i29, i28);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzio zzioVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzj;
        int iZzj2 = i;
        Unsafe unsafe = zzb;
        zzkj zzkjVarZzd = (zzkj) unsafe.getObject(obj, j2);
        if (!zzkjVarZzd.zzc()) {
            int size = zzkjVarZzd.size();
            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkjVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVarZzd;
                    int iZzj3 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i12 = zzioVar.zza + iZzj3;
                    while (iZzj3 < i12) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj3)));
                        iZzj3 += 8;
                    }
                    if (iZzj3 == i12) {
                        return iZzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVarZzd;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i)));
                    while (true) {
                        i8 = iZzj2 + 8;
                        if (i8 < i2) {
                            iZzj2 = zzip.zzj(bArr, i8, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj2)));
                            }
                        }
                    }
                    return i8;
                }
                return iZzj2;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVarZzd;
                    int iZzj4 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i13 = zzioVar.zza + iZzj4;
                    while (iZzj4 < i13) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj4)));
                        iZzj4 += 4;
                    }
                    if (iZzj4 == i13) {
                        return iZzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVarZzd;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj2 + 4;
                        if (i9 < i2) {
                            iZzj2 = zzip.zzj(bArr, i9, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj2)));
                            }
                        }
                    }
                    return i9;
                }
                return iZzj2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzky zzkyVar = (zzky) zzkjVarZzd;
                    int iZzj5 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i14 = zzioVar.zza + iZzj5;
                    while (iZzj5 < i14) {
                        iZzj5 = zzip.zzm(bArr, iZzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (iZzj5 == i14) {
                        return iZzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVarZzd;
                    int iZzm = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (iZzm < i2) {
                        int iZzj6 = zzip.zzj(bArr, iZzm, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzip.zzm(bArr, iZzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return iZzm;
                }
                return iZzj2;
            case 22:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                }
                if (i5 == 0) {
                    return zzip.zzl(i3, bArr, i, i2, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVarZzd;
                    int iZzj7 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i15 = zzioVar.zza + iZzj7;
                    while (iZzj7 < i15) {
                        zzkyVar3.zzg(zzip.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i15) {
                        return iZzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVarZzd;
                    zzkyVar4.zzg(zzip.zzn(bArr, i));
                    while (true) {
                        i10 = iZzj2 + 8;
                        if (i10 < i2) {
                            iZzj2 = zzip.zzj(bArr, i10, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, iZzj2));
                            }
                        }
                    }
                    return i10;
                }
                return iZzj2;
            case 24:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVarZzd;
                    int iZzj8 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i16 = zzioVar.zza + iZzj8;
                    while (iZzj8 < i16) {
                        zzkdVar.zzh(zzip.zzb(bArr, iZzj8));
                        iZzj8 += 4;
                    }
                    if (iZzj8 == i16) {
                        return iZzj8;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVarZzd;
                    zzkdVar2.zzh(zzip.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj2 + 4;
                        if (i11 < i2) {
                            iZzj2 = zzip.zzj(bArr, i11, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, iZzj2));
                            }
                        }
                    }
                    return i11;
                }
                return iZzj2;
            case 25:
            case 42:
                if (i5 == 2) {
                    zziq zziqVar = (zziq) zzkjVarZzd;
                    iZzj = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i17 = zzioVar.zza + iZzj;
                    while (iZzj < i17) {
                        iZzj = zzip.zzm(bArr, iZzj, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (iZzj != i17) {
                        throw zzkm.zzf();
                    }
                    return iZzj;
                }
                if (i5 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVarZzd;
                    int iZzm2 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (iZzm2 < i2) {
                        int iZzj9 = zzip.zzj(bArr, iZzm2, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzip.zzm(bArr, iZzj9, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return iZzj2;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj10 = zzip.zzj(bArr, iZzj2, zzioVar);
                        int i18 = zzioVar.zza;
                        if (i18 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i18 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            zzkjVarZzd.add(new String(bArr, iZzj10, i18, zzkk.zzb));
                            iZzj10 += i18;
                        }
                        while (iZzj10 < i2) {
                            int iZzj11 = zzip.zzj(bArr, iZzj10, zzioVar);
                            if (i3 != zzioVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzip.zzj(bArr, iZzj11, zzioVar);
                            int i19 = zzioVar.zza;
                            if (i19 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i19 == 0) {
                                zzkjVarZzd.add("");
                            } else {
                                zzkjVarZzd.add(new String(bArr, iZzj10, i19, zzkk.zzb));
                                iZzj10 += i19;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i20 = zzioVar.zza;
                    if (i20 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i20 == 0) {
                        zzkjVarZzd.add("");
                    } else {
                        int i21 = iZzj12 + i20;
                        if (!zzna.zzf(bArr, iZzj12, i21)) {
                            throw zzkm.zzc();
                        }
                        zzkjVarZzd.add(new String(bArr, iZzj12, i20, zzkk.zzb));
                        iZzj12 = i21;
                    }
                    while (iZzj12 < i2) {
                        int iZzj13 = zzip.zzj(bArr, iZzj12, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzip.zzj(bArr, iZzj13, zzioVar);
                        int i22 = zzioVar.zza;
                        if (i22 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i22 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            int i23 = iZzj12 + i22;
                            if (!zzna.zzf(bArr, iZzj12, i23)) {
                                throw zzkm.zzc();
                            }
                            zzkjVarZzd.add(new String(bArr, iZzj12, i22, zzkk.zzb));
                            iZzj12 = i23;
                        }
                    }
                    return iZzj12;
                }
                return iZzj2;
            case 27:
                if (i5 == 2) {
                    return zzip.zze(zzE(i6), i3, bArr, i, i2, zzkjVarZzd, zzioVar);
                }
                return iZzj2;
            case 28:
                if (i5 == 2) {
                    int iZzj14 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i24 = zzioVar.zza;
                    if (i24 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i24 > bArr.length - iZzj14) {
                        throw zzkm.zzf();
                    }
                    if (i24 == 0) {
                        zzkjVarZzd.add(zzjb.zzb);
                    } else {
                        zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i24));
                        iZzj14 += i24;
                    }
                    while (iZzj14 < i2) {
                        int iZzj15 = zzip.zzj(bArr, iZzj14, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzip.zzj(bArr, iZzj15, zzioVar);
                        int i25 = zzioVar.zza;
                        if (i25 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i25 > bArr.length - iZzj14) {
                            throw zzkm.zzf();
                        }
                        if (i25 == 0) {
                            zzkjVarZzd.add(zzjb.zzb);
                        } else {
                            zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i25));
                            iZzj14 += i25;
                        }
                    }
                    return iZzj14;
                }
                return iZzj2;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZzj = zzip.zzl(i3, bArr, i, i2, zzkjVarZzd, zzioVar);
                    }
                    return iZzj2;
                }
                iZzj = zzip.zzf(bArr, iZzj2, zzkjVarZzd, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object objZzC = zzlw.zzC(i4, zzkjVarZzd, zzD(i6), zzmmVar, this.zzn);
                if (objZzC != null) {
                    zzkcVar.zzc = (zzmm) objZzC;
                    return iZzj;
                }
                return iZzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVarZzd;
                    int iZzj16 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i26 = zzioVar.zza + iZzj16;
                    while (iZzj16 < i26) {
                        iZzj16 = zzip.zzj(bArr, iZzj16, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (iZzj16 == i26) {
                        return iZzj16;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVarZzd;
                    int iZzj17 = zzip.zzj(bArr, iZzj2, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (iZzj17 < i2) {
                        int iZzj18 = zzip.zzj(bArr, iZzj17, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzip.zzj(bArr, iZzj18, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return iZzj17;
                }
                return iZzj2;
            case 34:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                if (i5 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVarZzd;
                    int iZzj19 = zzip.zzj(bArr, iZzj2, zzioVar);
                    int i27 = zzioVar.zza + iZzj19;
                    while (iZzj19 < i27) {
                        iZzj19 = zzip.zzm(bArr, iZzj19, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (iZzj19 == i27) {
                        return iZzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVarZzd;
                    int iZzm3 = zzip.zzm(bArr, iZzj2, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (iZzm3 < i2) {
                        int iZzj20 = zzip.zzj(bArr, iZzm3, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzip.zzm(bArr, iZzj20, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return iZzm3;
                }
                return iZzj2;
            default:
                if (i5 == 3) {
                    zzlu zzluVarZzE = zzE(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iZzc = zzip.zzc(zzluVarZzE, bArr, i, i2, i28, zzioVar);
                    zzkjVarZzd.add(zzioVar.zzc);
                    while (iZzc < i2) {
                        int iZzj21 = zzip.zzj(bArr, iZzc, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzip.zzc(zzluVarZzE, bArr, iZzj21, i2, i28, zzioVar);
                        zzkjVarZzd.add(zzioVar.zzc);
                    }
                    return iZzc;
                }
                return iZzj2;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzB = zzB(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i2 = i + iZzc;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i2 = i + iZzc;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzkk.zza(zzmv.zzw(obj, j));
                    i2 = i + iZzc;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i2 = i + iZzc;
                    break;
                case 9:
                    Object objZzf = zzmv.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzmv.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zza(zzS(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x036a, code lost:
    
        if (r0 != r21) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x036c, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r18;
        r3 = r19;
        r5 = r21;
        r2 = r24;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0386, code lost:
    
        r2 = r0;
        r7 = r18;
        r6 = r25;
        r0 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03b6, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03db, code lost:
    
        if (r0 != r15) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0456, code lost:
    
        if (r6 == 1048575) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0458, code lost:
    
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x045e, code lost:
    
        r3 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0462, code lost:
    
        if (r3 >= r8.zzl) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0464, code lost:
    
        r4 = r8.zzj[r3];
        r5 = r8.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r8.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0476, code lost:
    
        if (r5 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x047d, code lost:
    
        if (r8.zzD(r4) != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x047f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0482, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzld) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlc) r8.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x048a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x048b, code lost:
    
        if (r9 != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x048f, code lost:
    
        if (r0 != r33) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0496, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0499, code lost:
    
        if (r0 > r33) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x049b, code lost:
    
        if (r1 != r9) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x049d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x04a2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzlm<T> zzlmVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj3;
        zzio zzioVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iZzg;
        zzlm<T> zzlmVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i22 = i2;
        int i23 = i3;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int iZzi = i;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        int i28 = 1048575;
        while (true) {
            if (iZzi < i22) {
                int i29 = iZzi + 1;
                byte b = bArr2[iZzi];
                if (b < 0) {
                    int iZzk = zzip.zzk(b, bArr2, i29, zzioVar3);
                    i5 = zzioVar3.zza;
                    i29 = iZzk;
                } else {
                    i5 = b;
                }
                int i30 = i5 >>> 3;
                int i31 = i5 & 7;
                int iZzx = i30 > i27 ? zzlmVar2.zzx(i30, i25 / 3) : zzlmVar2.zzw(i30);
                if (iZzx == -1) {
                    i6 = i30;
                    i7 = i29;
                    i8 = i5;
                    i9 = i26;
                    unsafe = unsafe2;
                    i10 = i23;
                    i11 = 0;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i32 = iArr[iZzx + 1];
                    int iZzA = zzA(i32);
                    int i33 = i29;
                    long j = i32 & 1048575;
                    if (iZzA <= 17) {
                        int i34 = iArr[iZzx + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i28) {
                            i13 = i5;
                            if (i28 != 1048575) {
                                unsafe2.putInt(obj4, i28, i26);
                            }
                            i26 = unsafe2.getInt(obj4, i36);
                            i14 = i36;
                        } else {
                            i13 = i5;
                            i14 = i28;
                        }
                        int i37 = i26;
                        switch (iZzA) {
                            case 0:
                                i16 = iZzx;
                                i17 = i30;
                                i18 = i33;
                                if (i31 != 1) {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    zzmv.zzo(obj4, j, Double.longBitsToDouble(zzip.zzn(bArr2, i18)));
                                    iZzi = i18 + 8;
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i23 = i3;
                                    i25 = i16;
                                    i24 = i13;
                                    i28 = i14;
                                    i22 = i2;
                                    break;
                                }
                            case 1:
                                i16 = iZzx;
                                i17 = i30;
                                i18 = i33;
                                if (i31 != 5) {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    zzmv.zzp(obj4, j, Float.intBitsToFloat(zzip.zzb(bArr2, i18)));
                                    iZzi = i18 + 4;
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i23 = i3;
                                    i25 = i16;
                                    i24 = i13;
                                    i28 = i14;
                                    i22 = i2;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = iZzx;
                                i17 = i30;
                                i18 = i33;
                                if (i31 != 0) {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    int iZzm = zzip.zzm(bArr2, i18, zzioVar3);
                                    unsafe2.putLong(obj, j, zzioVar3.zzb);
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i23 = i3;
                                    iZzi = iZzm;
                                    i25 = i16;
                                    i24 = i13;
                                    i28 = i14;
                                    i22 = i2;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = iZzx;
                                i17 = i30;
                                i18 = i33;
                                if (i31 != 0) {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzi = zzip.zzj(bArr2, i18, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzioVar3.zza);
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i23 = i3;
                                    i25 = i16;
                                    i24 = i13;
                                    i28 = i14;
                                    i22 = i2;
                                    break;
                                }
                            case 5:
                            case 14:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 1) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    unsafe2.putLong(obj, j, zzip.zzn(bArr2, i21));
                                    iZzi = i18 + 8;
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i23 = i3;
                                    i25 = i16;
                                    i24 = i13;
                                    i28 = i14;
                                    i22 = i2;
                                    break;
                                }
                            case 6:
                            case 13:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 5) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, zzip.zzb(bArr2, i21));
                                    iZzi = i21 + 4;
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i25 = i19;
                                    i24 = i20;
                                    i28 = i14;
                                    i23 = i3;
                                    break;
                                }
                            case 7:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 0) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzi = zzip.zzm(bArr2, i21, zzioVar3);
                                    zzmv.zzm(obj4, j, zzioVar3.zzb != 0);
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i25 = i19;
                                    i24 = i20;
                                    i28 = i14;
                                    i23 = i3;
                                    break;
                                }
                            case 8:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 2) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzg = (536870912 & i32) == 0 ? zzip.zzg(bArr2, i21, zzioVar3) : zzip.zzh(bArr2, i21, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i26 = i37 | i35;
                                    iZzi = iZzg;
                                    i25 = i19;
                                    i24 = i20;
                                    i28 = i14;
                                    i27 = i17;
                                    i23 = i3;
                                    break;
                                }
                            case 9:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 2) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzg = zzip.zzd(zzlmVar2.zzE(i19), bArr2, i21, i22, zzioVar3);
                                    if ((i37 & i35) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i26 = i37 | i35;
                                    iZzi = iZzg;
                                    i25 = i19;
                                    i24 = i20;
                                    i28 = i14;
                                    i27 = i17;
                                    i23 = i3;
                                    break;
                                }
                            case 10:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 2) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzg = zzip.zza(bArr2, i21, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i26 = i37 | i35;
                                    iZzi = iZzg;
                                    i25 = i19;
                                    i24 = i20;
                                    i28 = i14;
                                    i27 = i17;
                                    i23 = i3;
                                    break;
                                }
                            case 12:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 0) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzg = zzip.zzj(bArr2, i21, zzioVar3);
                                    int i38 = zzioVar3.zza;
                                    zzkg zzkgVarZzD = zzlmVar2.zzD(i19);
                                    if (zzkgVarZzD == null || zzkgVarZzD.zza(i38)) {
                                        unsafe2.putInt(obj4, j, i38);
                                        i26 = i37 | i35;
                                        iZzi = iZzg;
                                        i25 = i19;
                                        i24 = i20;
                                        i28 = i14;
                                        i27 = i17;
                                        i23 = i3;
                                        break;
                                    } else {
                                        zzd(obj).zzh(i20, Long.valueOf(i38));
                                        iZzi = iZzg;
                                        i25 = i19;
                                        i26 = i37;
                                        i24 = i20;
                                        i28 = i14;
                                        i27 = i17;
                                        i23 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i19 = iZzx;
                                i20 = i13;
                                i17 = i30;
                                i21 = i33;
                                if (i31 != 0) {
                                    i16 = i19;
                                    i13 = i20;
                                    i18 = i21;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzi = zzip.zzj(bArr2, i21, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzjf.zzb(zzioVar3.zza));
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i25 = i19;
                                    i24 = i20;
                                    i28 = i14;
                                    i23 = i3;
                                    break;
                                }
                            case 16:
                                if (i31 != 0) {
                                    i17 = i30;
                                    i16 = iZzx;
                                    i18 = i33;
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    int iZzm2 = zzip.zzm(bArr2, i33, zzioVar3);
                                    int i39 = iZzx;
                                    i20 = i13;
                                    unsafe2.putLong(obj, j, zzjf.zzc(zzioVar3.zzb));
                                    i26 = i37 | i35;
                                    i27 = i30;
                                    iZzi = iZzm2;
                                    i25 = i39;
                                    i24 = i20;
                                    i28 = i14;
                                    i23 = i3;
                                    break;
                                }
                            default:
                                i16 = iZzx;
                                i17 = i30;
                                i18 = i33;
                                if (i31 != 3) {
                                    i6 = i17;
                                    i10 = i3;
                                    i9 = i37;
                                    unsafe = unsafe2;
                                    i7 = i18;
                                    i11 = i16;
                                    i8 = i13;
                                    i28 = i14;
                                    break;
                                } else {
                                    iZzi = zzip.zzc(zzlmVar2.zzE(i16), bArr, i18, i2, (i17 << 3) | 4, zzioVar);
                                    if ((i37 & i35) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i26 = i37 | i35;
                                    i27 = i17;
                                    i23 = i3;
                                    i25 = i16;
                                    i24 = i13;
                                    i28 = i14;
                                    i22 = i2;
                                    break;
                                }
                        }
                    } else {
                        int i40 = iZzx;
                        i13 = i5;
                        if (iZzA != 27) {
                            i9 = i26;
                            i14 = i28;
                            if (iZzA <= 49) {
                                i6 = i30;
                                unsafe = unsafe2;
                                i11 = i40;
                                iZzi = zzv(obj, bArr, i33, i2, i13, i6, i31, i40, i32, iZzA, j, zzioVar);
                            } else {
                                i6 = i30;
                                unsafe = unsafe2;
                                i15 = i33;
                                i11 = i40;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i15, i2, i13, i6, i31, i32, iZzA, j, i11, zzioVar);
                                } else if (i31 == 2) {
                                    iZzi = zzs(obj, bArr, i15, i2, i11, j, zzioVar);
                                }
                            }
                        } else if (i31 == 2) {
                            zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj4, j);
                            if (!zzkjVarZzd.zzc()) {
                                int size = zzkjVarZzd.size();
                                zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzkjVarZzd);
                            }
                            i24 = i13;
                            i14 = i28;
                            iZzi = zzip.zze(zzlmVar2.zzE(i40), i24, bArr, i33, i2, zzkjVarZzd, zzioVar);
                            i23 = i3;
                            i27 = i30;
                            i25 = i40;
                            i26 = i26;
                            i28 = i14;
                            i22 = i2;
                        } else {
                            i9 = i26;
                            i14 = i28;
                            i6 = i30;
                            unsafe = unsafe2;
                            i15 = i33;
                            i11 = i40;
                        }
                        i10 = i3;
                        i7 = i15;
                        i8 = i13;
                        i28 = i14;
                    }
                }
                if (i8 != i10 || i10 == 0) {
                    int i41 = i10;
                    if (this.zzh) {
                        zzioVar2 = zzioVar;
                        if (zzioVar2.zzd != zzjo.zza()) {
                            i12 = i6;
                            if (zzioVar2.zzd.zzc(this.zzg, i12) != null) {
                                throw null;
                            }
                            iZzi = zzip.zzi(i8, bArr, i7, i2, zzd(obj), zzioVar);
                            obj3 = obj;
                            i22 = i2;
                            i24 = i8;
                            zzlmVar2 = this;
                            i27 = i12;
                            obj4 = obj3;
                            i25 = i11;
                            i26 = i9;
                            bArr2 = bArr;
                            i23 = i41;
                            zzioVar3 = zzioVar2;
                            unsafe2 = unsafe;
                        } else {
                            obj3 = obj;
                        }
                    } else {
                        obj3 = obj;
                        zzioVar2 = zzioVar;
                    }
                    i12 = i6;
                    iZzi = zzip.zzi(i8, bArr, i7, i2, zzd(obj), zzioVar);
                    i22 = i2;
                    i24 = i8;
                    zzlmVar2 = this;
                    i27 = i12;
                    obj4 = obj3;
                    i25 = i11;
                    i26 = i9;
                    bArr2 = bArr;
                    i23 = i41;
                    zzioVar3 = zzioVar2;
                    unsafe2 = unsafe;
                } else {
                    zzlmVar = this;
                    obj2 = obj;
                    i4 = i10;
                    iZzi = i7;
                    i24 = i8;
                    i26 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i23;
                obj2 = obj4;
                zzlmVar = zzlmVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long jZzB = zzB(this.zzj[i2]) & 1048575;
            Object objZzf = zzmv.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzld) objZzf).zzc();
                zzmv.zzs(obj, jZzB, objZzf);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzioVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i)) {
                        zzndVar.zzf(i2, zzmv.zza(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i)) {
                        zzndVar.zzo(i2, zzmv.zzb(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i)) {
                        zzndVar.zzt(i2, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i)) {
                        zzndVar.zzJ(i2, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i)) {
                        zzndVar.zzr(i2, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i)) {
                        zzndVar.zzm(i2, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i)) {
                        zzndVar.zzk(i2, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i)) {
                        zzndVar.zzb(i2, zzmv.zzw(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i)) {
                        zzT(i2, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i)) {
                        zzndVar.zzH(i2, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i)) {
                        zzndVar.zzi(i2, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i)) {
                        zzndVar.zzw(i2, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i)) {
                        zzndVar.zzy(i2, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i)) {
                        zzndVar.zzA(i2, zzmv.zzc(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i)) {
                        zzndVar.zzC(i2, zzmv.zzd(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i));
                    break;
                case 28:
                    zzlw.zzI(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzlw.zzO(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i));
                    break;
                case 50:
                    zzM(zzndVar, i2, zzmv.zzf(obj, iZzB & 1048575), i);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzf(i2, zzn(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzo(i2, zzo(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzt(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzJ(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzr(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzm(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzk(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzb(i2, zzS(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i2, i)) {
                        zzT(i2, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzH(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzi(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzw(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzy(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzA(i2, zzr(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzC(i2, zzC(obj, iZzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i) || Double.doubleToLongBits(zzmv.zza(obj, j)) != Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i) || Float.floatToIntBits(zzmv.zzb(obj, j)) != Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i) || zzmv.zzw(obj, j) != zzmv.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
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
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    long jZzy = zzy(i) & 1048575;
                    if (zzmv.zzc(obj, jZzy) != zzmv.zzc(obj2, jZzy) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int iZzB = zzB(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iZzB) != 0 && !zzP(obj, i6, i, i2, i10)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzP(obj, i6, i, i2, i10) && !zzQ(obj, iZzB, zzE(i6))) {
                    return false;
                }
            } else if (iZzA == 27) {
                List list = (List) zzmv.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzluVarZzE = zzE(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzluVarZzE.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzR(obj, i7, i6) && !zzQ(obj, iZzB, zzE(i6))) {
                    return false;
                }
            } else if (iZzA != 49) {
                if (iZzA == 50 && !((zzld) zzmv.zzf(obj, iZzB & 1048575)).isEmpty()) {
                    throw null;
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB = zzB(i);
            long j = 1048575 & iZzB;
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzI(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }
}
