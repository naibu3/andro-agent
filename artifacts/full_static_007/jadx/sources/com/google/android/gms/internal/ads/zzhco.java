package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhco extends zzhcs {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzhco() {
        throw null;
    }

    /* synthetic */ zzhco(zzhcn zzhcnVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzhcl zzhclVar;
        List list = (List) zzhfa.zzh(obj, j);
        if (list.isEmpty()) {
            List zzhclVar2 = list instanceof zzhcm ? new zzhcl(i) : ((list instanceof zzhdn) && (list instanceof zzhca)) ? ((zzhca) list).zzf(i) : new ArrayList(i);
            zzhfa.zzv(obj, j, zzhclVar2);
            return zzhclVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzhfa.zzv(obj, j, arrayList);
            zzhclVar = arrayList;
        } else {
            if (!(list instanceof zzhev)) {
                if (!(list instanceof zzhdn) || !(list instanceof zzhca)) {
                    return list;
                }
                zzhca zzhcaVar = (zzhca) list;
                if (zzhcaVar.zzc()) {
                    return list;
                }
                zzhca zzhcaVarZzf = zzhcaVar.zzf(list.size() + i);
                zzhfa.zzv(obj, j, zzhcaVarZzf);
                return zzhcaVarZzf;
            }
            zzhcl zzhclVar3 = new zzhcl(list.size() + i);
            zzhclVar3.addAll(zzhclVar3.size(), (zzhev) list);
            zzhfa.zzv(obj, j, zzhclVar3);
            zzhclVar = zzhclVar3;
        }
        return zzhclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    final void zzb(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) zzhfa.zzh(obj, j);
        if (list instanceof zzhcm) {
            objUnmodifiableList = ((zzhcm) list).zzd();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzhdn) && (list instanceof zzhca)) {
                zzhca zzhcaVar = (zzhca) list;
                if (zzhcaVar.zzc()) {
                    zzhcaVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzhfa.zzv(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzhfa.zzh(obj2, j);
        List listZzf = zzf(obj, j, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzhfa.zzv(obj, j, list);
    }
}
