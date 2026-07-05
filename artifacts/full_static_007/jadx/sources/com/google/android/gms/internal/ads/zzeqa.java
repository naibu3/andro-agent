package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeqa implements zzexw {
    private final Context zza;

    zzeqa(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcR)).booleanValue()) {
            return zzgft.zzh(new zzeqb(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzgft.zzh(null);
    }
}
