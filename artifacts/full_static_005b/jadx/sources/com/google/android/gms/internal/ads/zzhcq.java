package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhcq extends zzhcs {
    private zzhcq() {
        throw null;
    }

    /* synthetic */ zzhcq(zzhcp zzhcpVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    final List zza(Object obj, long j) {
        zzhca zzhcaVar = (zzhca) zzhfa.zzh(obj, j);
        if (zzhcaVar.zzc()) {
            return zzhcaVar;
        }
        int size = zzhcaVar.size();
        zzhca zzhcaVarZzf = zzhcaVar.zzf(size == 0 ? 10 : size + size);
        zzhfa.zzv(obj, j, zzhcaVarZzf);
        return zzhcaVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    final void zzb(Object obj, long j) {
        ((zzhca) zzhfa.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    final void zzc(Object obj, Object obj2, long j) {
        zzhca zzhcaVarZzf = (zzhca) zzhfa.zzh(obj, j);
        zzhca zzhcaVar = (zzhca) zzhfa.zzh(obj2, j);
        int size = zzhcaVarZzf.size();
        int size2 = zzhcaVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzhcaVarZzf.zzc()) {
                zzhcaVarZzf = zzhcaVarZzf.zzf(size2 + size);
            }
            zzhcaVarZzf.addAll(zzhcaVar);
        }
        if (size > 0) {
            zzhcaVar = zzhcaVarZzf;
        }
        zzhfa.zzv(obj, j, zzhcaVar);
    }
}
