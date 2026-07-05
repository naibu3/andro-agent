package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcux implements zzelg {
    public final List zza;

    public zzcux(zzcup zzcupVar) {
        this.zza = Collections.singletonList(zzgft.zzh(zzcupVar));
    }

    public zzcux(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgft.zzr((ListenableFuture) it.next(), new zzcuw(this), zzggk.zzb());
        }
    }
}
