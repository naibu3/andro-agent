package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzcjd implements zzcoq {

    @Nullable
    private static zzcjd zza;

    private static synchronized zzcjd zzD(Context context, @Nullable zzbrf zzbrfVar, int i, boolean z, int i2, zzcki zzckiVar) {
        zzcjd zzcjdVar = zza;
        if (zzcjdVar != null) {
            return zzcjdVar;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        zzbep.zza(context);
        if (((Boolean) zzbgc.zze.zze()).booleanValue()) {
            zzbdz.zzd(context);
        }
        zzfik zzfikVarZzd = zzfik.zzd(context);
        VersionInfoParcel versionInfoParcelZzc = zzfikVarZzd.zzc(241806000, false, i2);
        zzfikVarZzd.zzf(zzbrfVar);
        zzclw zzclwVar = new zzclw(null);
        zzcje zzcjeVar = new zzcje();
        zzcjeVar.zzf(versionInfoParcelZzc);
        zzcjeVar.zze(context);
        zzcjeVar.zzd(jCurrentTimeMillis);
        zzclwVar.zzb(new zzcjg(zzcjeVar, null));
        zzclwVar.zzc(new zzcnj(zzckiVar));
        zzcjd zzcjdVarZza = zzclwVar.zza();
        com.google.android.gms.ads.internal.zzu.zzo().zzu(context, versionInfoParcelZzc);
        com.google.android.gms.ads.internal.zzu.zzc().zzi(context);
        com.google.android.gms.ads.internal.zzu.zzp().zzl(context);
        com.google.android.gms.ads.internal.zzu.zzp().zzk(context);
        com.google.android.gms.ads.internal.util.zzd.zza(context);
        com.google.android.gms.ads.internal.zzu.zzb().zzd(context);
        com.google.android.gms.ads.internal.zzu.zzv().zzb(context);
        zzcjdVarZza.zza().zzc();
        zzcav.zzd(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgs)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaw)).booleanValue()) {
                new zzefm(context, versionInfoParcelZzc, new zzbdm(new zzbdu(context)), new zzeer(new zzeen(context), zzcjdVarZza.zzA())).zzb(com.google.android.gms.ads.internal.zzu.zzo().zzi().zzS());
            }
        }
        zza = zzcjdVarZza;
        return zzcjdVarZza;
    }

    public static zzcjd zzb(Context context, @Nullable zzbrf zzbrfVar, int i) {
        return zzD(context, zzbrfVar, 241806000, false, i, new zzcki());
    }

    public abstract zzgge zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract com.google.android.gms.ads.internal.util.zzcf zza();

    public abstract zzcnt zzc();

    public abstract zzcrs zzd();

    public abstract zzctf zze();

    public abstract zzdca zzf();

    public abstract zzdjg zzg();

    public abstract zzdkc zzh();

    public abstract zzdrl zzi();

    public abstract zzdvc zzj();

    public abstract zzdwl zzk();

    public abstract zzdya zzl();

    public abstract zzdyx zzm();

    public abstract zzegk zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzk zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzq zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaj zzq();

    @Override // com.google.android.gms.internal.ads.zzcoq
    public final zzeyv zzr(zzbxu zzbxuVar, int i) {
        return zzs(new zzfay(zzbxuVar, i));
    }

    protected abstract zzeyv zzs(zzfay zzfayVar);

    public abstract zzfbt zzt();

    public abstract zzfdh zzu();

    public abstract zzfey zzv();

    public abstract zzfgm zzw();

    public abstract zzfid zzx();

    public abstract zzfin zzy();

    public abstract zzfmq zzz();
}
