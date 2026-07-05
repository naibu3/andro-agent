package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzecs implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;
    private final zzhlg zzi;

    public zzecs(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8, zzhlg zzhlgVar9) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
        this.zzh = zzhlgVar8;
        this.zzi = zzhlgVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecr zzb() {
        zzdce zzdceVarZzb = ((zzdcf) this.zza).zzb();
        zzebz zzebzVarZzb = ((zzeca) this.zzb).zzb();
        zzflt zzfltVar = (zzflt) this.zzc.zzb();
        zzfho zzfhoVarZza = ((zzczc) this.zzd).zza();
        VersionInfoParcel versionInfoParcelZza = ((zzcjv) this.zze).zza();
        zzfmq zzfmqVar = (zzfmq) this.zzf.zzb();
        zzfmn zzfmnVar = (zzfmn) this.zzg.zzb();
        Context contextZza = ((zzcjj) this.zzh).zza();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzecr(zzdceVarZzb, zzebzVarZzb, zzfltVar, zzfhoVarZza, versionInfoParcelZza, zzfmqVar, zzfmnVar, contextZza, zzggeVar);
    }
}
