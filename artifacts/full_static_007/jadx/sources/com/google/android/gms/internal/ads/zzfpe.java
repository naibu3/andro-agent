package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfpe {
    private static final zzfpe zza = new zzfpe();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfpe() {
    }

    public static zzfpe zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfon zzfonVar) {
        this.zzb.add(zzfonVar);
    }

    public final void zze(zzfon zzfonVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfonVar);
        this.zzc.remove(zzfonVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfpm.zzb().zzg();
    }

    public final void zzf(zzfon zzfonVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfonVar);
        if (zZzg) {
            return;
        }
        zzfpm.zzb().zzf();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
