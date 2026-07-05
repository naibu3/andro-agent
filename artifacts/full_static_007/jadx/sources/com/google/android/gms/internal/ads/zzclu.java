package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzclu implements zzfdi {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcla zzd;
    private final zzclu zze = this;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;
    private final zzhky zzk;

    /* synthetic */ zzclu(zzcla zzclaVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzclt zzcltVar) {
        this.zzd = zzclaVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzhkp zzhkpVarZza = zzhkq.zza(context);
        this.zzf = zzhkpVarZza;
        zzhkp zzhkpVarZza2 = zzhkq.zza(zzqVar);
        this.zzg = zzhkpVarZza2;
        zzhky zzhkyVarZzc = zzhko.zzc(new zzepd(zzclaVar.zzM));
        this.zzh = zzhkyVarZzc;
        zzhky zzhkyVarZzc2 = zzhko.zzc(zzepi.zza());
        this.zzi = zzhkyVarZzc2;
        zzhky zzhkyVarZzc3 = zzhko.zzc(zzdej.zza());
        this.zzj = zzhkyVarZzc3;
        this.zzk = zzhko.zzc(new zzfdg(zzhkpVarZza, zzclaVar.zzc, zzhkpVarZza2, zzclaVar.zzO, zzhkyVarZzc, zzhkyVarZzc2, zzfhq.zza(), zzhkyVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final zzeoi zza() {
        zzfdf zzfdfVar = (zzfdf) this.zzk.zzb();
        zzepc zzepcVar = (zzepc) this.zzh.zzb();
        VersionInfoParcel versionInfoParcelZze = this.zzd.zza.zze();
        zzhkx.zzb(versionInfoParcelZze);
        return new zzeoi(this.zza, this.zzb, this.zzc, zzfdfVar, zzepcVar, versionInfoParcelZze, (zzdvc) this.zzd.zzM.zzb());
    }
}
