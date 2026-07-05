package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgti {
    private HashMap zza = new HashMap();

    public final zzgtk zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgtk zzgtkVar = new zzgtk(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgtkVar;
    }
}
