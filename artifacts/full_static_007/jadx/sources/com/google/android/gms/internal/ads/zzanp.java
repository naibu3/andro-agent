package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzanp implements zzalq {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzanp(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzane zzaneVar = (zzane) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzaneVar.zzb;
            jArr[i2 + 1] = zzaneVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final long zzb(int i) {
        zzeq.zzd(i >= 0);
        zzeq.zzd(i < this.zzc.length);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzalq
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.zza.size(); i++) {
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzane zzaneVar = (zzane) this.zza.get(i);
                zzei zzeiVar = zzaneVar.zza;
                if (zzeiVar.zzg == -3.4028235E38f) {
                    arrayList2.add(zzaneVar);
                } else {
                    arrayList.add(zzeiVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzano
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzane) obj).zzb, ((zzane) obj2).zzb);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzeg zzegVarZzb = ((zzane) arrayList2.get(i3)).zza.zzb();
            zzegVarZzb.zze((-1) - i3, 1);
            arrayList.add(zzegVarZzb.zzp());
        }
        return arrayList;
    }
}
