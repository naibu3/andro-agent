package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdkj implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;

    public zzdkj(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcjd zzcjdVar = (zzcjd) this.zza.zzb();
        zzcyt zzcytVarZza = ((zzczd) this.zzb).zza();
        zzdfc zzdfcVarZza = ((zzdfw) this.zzc).zza();
        zzdjy zzdjyVarZza = ((zzdka) this.zzd).zza();
        zzdca zzdcaVarZzb = ((zzcse) this.zze).zzb();
        zzelf zzelfVar = (zzelf) this.zzf.zzb();
        zzctf zzctfVarZze = zzcjdVar.zze();
        zzctfVarZze.zzi(zzcytVarZza.zzj());
        zzctfVarZze.zzf(zzdfcVarZza);
        zzctfVarZze.zzd(zzdjyVarZza);
        zzctfVarZze.zze(new zzenl(null));
        zzctfVarZze.zzg(new zzcuh(zzdcaVarZzb, null));
        zzctfVarZze.zzc(new zzcsc(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdD)).booleanValue()) {
            zzctfVarZze.zzj(zzelo.zzb(zzelfVar));
        }
        zzcus zzcusVarZzc = zzctfVarZze.zzh().zzc();
        zzhkx.zzb(zzcusVarZzc);
        return zzcusVarZzc;
    }
}
