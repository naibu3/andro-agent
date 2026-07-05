package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeaq implements zzgfp {
    final /* synthetic */ Context zza;

    zzeaq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        if (((Boolean) zzbgc.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzba)) {
            zzbdz.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbgc.zzj.zze()).booleanValue()) {
            zzbdz.zze(this.zza);
        }
    }
}
