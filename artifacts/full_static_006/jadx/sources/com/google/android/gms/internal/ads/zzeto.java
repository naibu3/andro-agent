package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzeto implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeto(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbh zzgbhVarZzn;
        zzesw zzeswVarZza = zzesy.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzea)).booleanValue()) {
            zzgbhVarZzn = zzgbh.zzo(new zzewe(zzeswVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeb)).intValue(), scheduledExecutorService));
        } else {
            zzgbhVarZzn = zzgbh.zzn();
        }
        zzhkx.zzb(zzgbhVarZzn);
        return zzgbhVarZzn;
    }
}
