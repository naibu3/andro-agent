package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgex extends zzgeu {
    private zzgex() {
        throw null;
    }

    /* synthetic */ zzgex(zzgew zzgewVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    final int zza(zzgey zzgeyVar) {
        int i;
        synchronized (zzgeyVar) {
            i = zzgeyVar.remaining - 1;
            zzgeyVar.remaining = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    final void zzb(zzgey zzgeyVar, @CheckForNull Set set, Set set2) {
        synchronized (zzgeyVar) {
            if (zzgeyVar.seenExceptions == null) {
                zzgeyVar.seenExceptions = set2;
            }
        }
    }
}
