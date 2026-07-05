package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgbe {
    Object[] zza;
    int zzb;
    zzgbd zzc;

    public zzgbe() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzgaw.zze(length, i2));
        }
    }

    public final zzgbe zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfzz.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgbe zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgbf zzc() {
        zzgbd zzgbdVar = this.zzc;
        if (zzgbdVar != null) {
            throw zzgbdVar.zza();
        }
        zzgct zzgctVarZzj = zzgct.zzj(this.zzb, this.zza, this);
        zzgbd zzgbdVar2 = this.zzc;
        if (zzgbdVar2 == null) {
            return zzgctVarZzj;
        }
        throw zzgbdVar2.zza();
    }

    zzgbe(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
