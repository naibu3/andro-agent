package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzcav {
    static zzcav zza;

    public static synchronized zzcav zzd(Context context) {
        zzcav zzcavVar = zza;
        if (zzcavVar != null) {
            return zzcavVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbep.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzi = com.google.android.gms.ads.internal.zzu.zzo().zzi();
        zzgVarZzi.zzs(applicationContext);
        zzcan zzcanVar = new zzcan(null);
        zzcanVar.zzb(applicationContext);
        zzcanVar.zzc(com.google.android.gms.ads.internal.zzu.zzB());
        zzcanVar.zza(zzgVarZzi);
        zzcanVar.zzd(com.google.android.gms.ads.internal.zzu.zzn());
        zzcav zzcavVarZze = zzcanVar.zze();
        zza = zzcavVarZze;
        zzcavVarZze.zza().zza();
        zzcaz zzcazVarZzc = zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            Map mapZzv = com.google.android.gms.ads.internal.util.zzt.zzv((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzat));
            Iterator it = mapZzv.keySet().iterator();
            while (it.hasNext()) {
                zzcazVarZzc.zzc((String) it.next());
            }
            zzcazVarZzc.zzd(new zzcax(zzcazVarZzc, mapZzv));
        }
        return zza;
    }

    abstract zzcag zza();

    abstract zzcak zzb();

    abstract zzcaz zzc();
}
