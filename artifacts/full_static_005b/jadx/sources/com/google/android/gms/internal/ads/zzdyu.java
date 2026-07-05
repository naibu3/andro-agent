package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdyu extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdyx zzb;

    zzdyu(zzdyx zzdyxVar, String str) {
        this.zza = str;
        this.zzb = zzdyxVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzm(zzdyx.zzl(loadAdError), this.zza);
    }
}
