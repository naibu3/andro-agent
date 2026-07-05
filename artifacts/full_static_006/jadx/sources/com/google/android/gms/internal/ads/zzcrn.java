package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcrn {
    private final zzdvc zza;
    private final zzfhf zzb;

    zzcrn(zzdvc zzdvcVar, zzfhf zzfhfVar) {
        this.zza = zzdvcVar;
        this.zzb = zzfhfVar;
    }

    public final void zza(long j, int i) {
        zzdvb zzdvbVarZza = this.zza.zza();
        zzdvbVarZza.zzd(this.zzb.zzb.zzb);
        zzdvbVarZza.zzb("action", "ad_closed");
        zzdvbVarZza.zzb("show_time", String.valueOf(j));
        zzdvbVarZza.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        zzdvbVarZza.zzb("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zzdvbVarZza.zzf();
    }
}
