package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdv;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdrp implements zzhkp {
    private final zzhlg zza;

    public zzdrp(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdv.zza.EnumC0014zza enumC0014zza = ((zzczc) this.zza).zza().zzo.zza == 3 ? zzbdv.zza.EnumC0014zza.REWARDED_INTERSTITIAL : zzbdv.zza.EnumC0014zza.REWARD_BASED_VIDEO_AD;
        zzhkx.zzb(enumC0014zza);
        return enumC0014zza;
    }
}
