package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzfyb implements Serializable {
    zzfyb() {
    }

    public static zzfyb zzc() {
        return zzfxk.zza;
    }

    public static zzfyb zzd(@CheckForNull Object obj) {
        return obj == null ? zzfxk.zza : new zzfyl(obj);
    }

    public abstract zzfyb zza(zzfxu zzfxuVar);

    public abstract Object zzb(Object obj);
}
