package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzml extends zzio {
    public static final /* synthetic */ int zzc = 0;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzdc[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzml(Collection collection, zzxi zzxiVar) {
        zzdc[] zzdcVarArr = new zzdc[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzdcVarArr[i2] = ((zzlu) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzlu) it2.next()).zzb();
            i++;
        }
        this(zzdcVarArr, objArr, zzxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzio
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzj.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzio
    protected final int zzq(int i) {
        return zzgd.zzb(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzio
    protected final int zzr(int i) {
        return zzgd.zzb(this.zzg, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzio
    protected final int zzs(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    protected final int zzt(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    protected final zzdc zzu(int i) {
        return this.zzh[i];
    }

    @Override // com.google.android.gms.internal.ads.zzio
    protected final Object zzv(int i) {
        return this.zzi[i];
    }

    final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzml zzx(zzxi zzxiVar) {
        zzdc[] zzdcVarArr = new zzdc[this.zzh.length];
        int i = 0;
        while (true) {
            zzdc[] zzdcVarArr2 = this.zzh;
            if (i >= zzdcVarArr2.length) {
                return new zzml(zzdcVarArr, this.zzi, zzxiVar);
            }
            zzdcVarArr[i] = new zzmk(this, zzdcVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzml(zzdc[] zzdcVarArr, Object[] objArr, zzxi zzxiVar) {
        super(false, zzxiVar);
        int i = 0;
        this.zzh = zzdcVarArr;
        int length = zzdcVarArr.length;
        this.zzf = new int[length];
        this.zzg = new int[length];
        this.zzi = objArr;
        this.zzj = new HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i2 = 0;
        while (i < zzdcVarArr.length) {
            zzdc zzdcVar = zzdcVarArr[i];
            this.zzh[i2] = zzdcVar;
            this.zzg[i2] = iZzc;
            this.zzf[i2] = iZzb;
            iZzc += zzdcVar.zzc();
            iZzb += this.zzh[i2].zzb();
            this.zzj.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.zzd = iZzc;
        this.zze = iZzb;
    }
}
