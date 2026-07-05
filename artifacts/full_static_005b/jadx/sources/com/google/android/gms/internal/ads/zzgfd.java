package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
abstract class zzgfd extends zzges {

    @CheckForNull
    private List zza;

    zzgfd(zzgax zzgaxVar, boolean z) {
        super(zzgaxVar, z, true);
        List listEmptyList = zzgaxVar.isEmpty() ? Collections.emptyList() : zzgbs.zza(zzgaxVar.size());
        for (int i = 0; i < zzgaxVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzges
    final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgfc(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
