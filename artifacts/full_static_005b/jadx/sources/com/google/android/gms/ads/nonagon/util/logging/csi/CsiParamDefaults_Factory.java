package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzhkp;
import com.google.android.gms.internal.ads.zzhlg;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public final class CsiParamDefaults_Factory implements zzhkp<CsiParamDefaults> {
    private final zzhlg zza;
    private final zzhlg zzb;

    public CsiParamDefaults_Factory(zzhlg<Context> zzhlgVar, zzhlg<VersionInfoParcel> zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    public static CsiParamDefaults_Factory create(zzhlg<Context> zzhlgVar, zzhlg<VersionInfoParcel> zzhlgVar2) {
        return new CsiParamDefaults_Factory(zzhlgVar, zzhlgVar2);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
