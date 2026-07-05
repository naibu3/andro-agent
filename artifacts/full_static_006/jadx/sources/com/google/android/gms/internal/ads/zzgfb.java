package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgfb extends zzgfd {
    zzgfb(zzgax zzgaxVar, boolean z) {
        super(zzgaxVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList arrayListZza = zzgbs.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgfc zzgfcVar = (zzgfc) it.next();
            arrayListZza.add(zzgfcVar != null ? zzgfcVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
