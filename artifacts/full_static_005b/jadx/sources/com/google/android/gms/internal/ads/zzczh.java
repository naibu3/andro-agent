package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzczh implements zzhkp {
    private final zzczg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzczh(zzczg zzczgVar, zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4) {
        this.zza = zzczgVar;
        this.zzb = zzhlgVar;
        this.zzc = zzhlgVar2;
        this.zzd = zzhlgVar3;
        this.zze = zzhlgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzcjv) this.zzc).zza();
        zzfgt zzfgtVarZza = ((zzcvg) this.zzd).zza();
        zzcab zzcabVar = new zzcab();
        zzcac zzcacVar = zzfgtVarZza.zzB;
        if (zzcacVar == null) {
            return null;
        }
        zzfgy zzfgyVar = zzfgtVarZza.zzt;
        return new zzcaa(context, versionInfoParcelZza, zzcacVar, zzfgyVar == null ? null : zzfgyVar.zzb, zzcabVar);
    }
}
