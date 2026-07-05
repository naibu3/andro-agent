package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeba implements zzdcg {
    private final Context zza;
    private final zzcau zzb;

    zzeba(Context context, zzcau zzcauVar) {
        this.zza = context;
        this.zzb = zzcauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(zzfhfVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzm(this.zza, zzfhfVar.zza.zza.zzd);
        this.zzb.zzi(this.zza, zzfhfVar.zzb.zzb.zzd);
    }
}
