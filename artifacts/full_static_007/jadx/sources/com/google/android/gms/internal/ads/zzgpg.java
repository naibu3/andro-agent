package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzgpg {
    private static final zzgpg zza = new zzgpg();
    private static final zzgpf zzb = new zzgpf(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgpg zza() {
        return zza;
    }

    public final zzgtm zzb() {
        zzgtm zzgtmVar = (zzgtm) this.zzc.get();
        return zzgtmVar == null ? zzb : zzgtmVar;
    }
}
