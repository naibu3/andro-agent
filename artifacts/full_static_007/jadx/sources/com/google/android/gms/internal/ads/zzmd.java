package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzmd implements zzlu {
    public final zzvj zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzmd(zzvq zzvqVar, boolean z) {
        this.zza = new zzvj(zzvqVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final zzdc zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
