package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcjv implements zzhkp {
    private final zzcjg zza;

    public zzcjv(zzcjg zzcjgVar) {
        this.zza = zzcjgVar;
    }

    public final VersionInfoParcel zza() {
        VersionInfoParcel versionInfoParcelZze = this.zza.zze();
        zzhkx.zzb(versionInfoParcelZze);
        return versionInfoParcelZze;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZze = this.zza.zze();
        zzhkx.zzb(versionInfoParcelZze);
        return versionInfoParcelZze;
    }
}
