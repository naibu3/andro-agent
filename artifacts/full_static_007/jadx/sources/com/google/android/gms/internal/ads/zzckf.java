package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzckf implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzckf(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxo zzb() {
        Context contextZza = ((zzcjj) this.zza).zza();
        zzfmq zzfmqVar = (zzfmq) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzu.zzf().zzb(contextZza, VersionInfoParcel.forPackage(), zzfmqVar).zza("google.afma.request.getAdDictionary", zzbqe.zza, zzbqe.zza);
        zzbqh zzbqhVarZzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(contextZza, VersionInfoParcel.forPackage(), zzfmqVar);
        zzbqb zzbqbVar = zzbqe.zza;
        return new zzbxq(contextZza, zzbqhVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbqbVar, zzbqbVar), VersionInfoParcel.forPackage());
    }
}
