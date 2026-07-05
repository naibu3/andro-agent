package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgbg extends zzgav {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzgbg() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgav, com.google.android.gms.internal.ads.zzgaw
    public final /* bridge */ /* synthetic */ zzgaw zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzgbg zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i = 0; i < 2; i++) {
                zzf(objArr[i]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    zzgbg(int i) {
        super(i);
        this.zzd = new Object[zzgbh.zzh(i)];
    }

    public final zzgbg zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzgbh zzi() {
        zzgbh zzgbhVarZzv;
        int i = this.zzb;
        if (i == 0) {
            return zzgcu.zza;
        }
        if (i == 1) {
            return new zzgdf(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzgbh.zzh(i) != this.zzd.length) {
            zzgbhVarZzv = zzgbh.zzv(this.zzb, this.zza);
            this.zzb = zzgbhVarZzv.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzgbh.zzw(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            zzgbhVarZzv = new zzgcu(objArrCopyOf, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzgbhVarZzv;
    }

    public final zzgbg zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzh = zzgbh.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzh <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzgau.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
