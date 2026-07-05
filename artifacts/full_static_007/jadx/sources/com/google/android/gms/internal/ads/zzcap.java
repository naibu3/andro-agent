package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcap extends zzcav {
    private final Clock zzb;
    private final zzcap zzc = this;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;
    private final zzhky zzk;

    /* synthetic */ zzcap(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcau zzcauVar, zzcao zzcaoVar) {
        this.zzb = clock;
        zzhkp zzhkpVarZza = zzhkq.zza(context);
        this.zzd = zzhkpVarZza;
        zzhkp zzhkpVarZza2 = zzhkq.zza(zzgVar);
        this.zze = zzhkpVarZza2;
        this.zzf = zzhko.zzc(new zzcah(zzhkpVarZza, zzhkpVarZza2));
        zzhkp zzhkpVarZza3 = zzhkq.zza(clock);
        this.zzg = zzhkpVarZza3;
        zzhkp zzhkpVarZza4 = zzhkq.zza(zzcauVar);
        this.zzh = zzhkpVarZza4;
        zzhky zzhkyVarZzc = zzhko.zzc(new zzcaj(zzhkpVarZza3, zzhkpVarZza2, zzhkpVarZza4));
        this.zzi = zzhkyVarZzc;
        zzcal zzcalVar = new zzcal(zzhkpVarZza3, zzhkyVarZzc);
        this.zzj = zzcalVar;
        this.zzk = zzhko.zzc(new zzcba(zzhkpVarZza, zzcalVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    final zzcag zza() {
        return (zzcag) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    final zzcak zzb() {
        return new zzcak(this.zzb, (zzcai) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcav
    final zzcaz zzc() {
        return (zzcaz) this.zzk.zzb();
    }
}
