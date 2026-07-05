package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcks extends zzezk {
    private final zzfar zza;
    private final zzcla zzb;
    private final zzcks zzc = this;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;
    private final zzhky zzk;
    private final zzhky zzl;
    private final zzhky zzm;
    private final zzhky zzn;

    /* synthetic */ zzcks(zzcla zzclaVar, zzfar zzfarVar, zzckr zzckrVar) {
        this.zzb = zzclaVar;
        this.zza = zzfarVar;
        zzfat zzfatVar = new zzfat(zzfarVar);
        this.zzd = zzfatVar;
        zzhky zzhkyVarZzc = zzhko.zzc(zzdtx.zza());
        this.zze = zzhkyVarZzc;
        zzhky zzhkyVarZzc2 = zzhko.zzc(zzdtv.zza());
        this.zzf = zzhkyVarZzc2;
        zzhky zzhkyVarZzc3 = zzhko.zzc(zzdtz.zza());
        this.zzg = zzhkyVarZzc3;
        zzhky zzhkyVarZzc4 = zzhko.zzc(zzdub.zza());
        this.zzh = zzhkyVarZzc4;
        zzhks zzhksVarZzc = zzhkt.zzc(4);
        zzhksVarZzc.zzb(zzfln.GMS_SIGNALS, zzhkyVarZzc);
        zzhksVarZzc.zzb(zzfln.BUILD_URL, zzhkyVarZzc2);
        zzhksVarZzc.zzb(zzfln.HTTP, zzhkyVarZzc3);
        zzhksVarZzc.zzb(zzfln.PRE_PROCESS, zzhkyVarZzc4);
        zzhkt zzhktVarZzc = zzhksVarZzc.zzc();
        this.zzi = zzhktVarZzc;
        zzhky zzhkyVarZzc5 = zzhko.zzc(new zzduc(zzfatVar, zzclaVar.zzh, zzfko.zza(), zzhktVarZzc));
        this.zzj = zzhkyVarZzc5;
        zzhlc zzhlcVarZza = zzhld.zza(0, 1);
        zzhlcVarZza.zza(zzhkyVarZzc5);
        zzhld zzhldVarZzc = zzhlcVarZza.zzc();
        this.zzk = zzhldVarZzc;
        zzflw zzflwVar = new zzflw(zzhldVarZzc);
        this.zzl = zzflwVar;
        this.zzm = zzhko.zzc(new zzflv(zzfko.zza(), zzclaVar.zze, zzflwVar));
        this.zzn = zzhko.zzc(new zzfmo(zzclaVar.zzz));
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final zzexz zza() {
        Context contextZzb = this.zzb.zza.zzb();
        zzhkx.zzb(contextZzb);
        zzcbm zzcbmVar = new zzcbm();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        zzfal zzfalVar = new zzfal(zzcbmVar, zzggeVar, zzfas.zza(this.zza));
        zzgge zzggeVar2 = zzcci.zza;
        zzhkx.zzb(zzggeVar2);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzfmn zzfmnVar = (zzfmn) this.zzn.zzb();
        zzdvc zzdvcVar = (zzdvc) this.zzb.zzM.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzewe(zzfalVar, 0L, scheduledExecutorService));
        return new zzexz(contextZzb, zzggeVar2, hashSet, zzfmnVar, zzdvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final zzflt zzb() {
        return (zzflt) this.zzm.zzb();
    }
}
