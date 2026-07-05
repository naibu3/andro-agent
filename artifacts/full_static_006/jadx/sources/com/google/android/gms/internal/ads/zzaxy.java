package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzaxy implements zzfth {
    private final zzfrg zza;
    private final zzfrx zzb;
    private final zzayl zzc;
    private final zzaxx zzd;
    private final zzaxh zze;
    private final zzayn zzf;
    private final zzayf zzg;
    private final zzaxw zzh;

    zzaxy(zzfrg zzfrgVar, zzfrx zzfrxVar, zzayl zzaylVar, zzaxx zzaxxVar, zzaxh zzaxhVar, zzayn zzaynVar, zzayf zzayfVar, zzaxw zzaxwVar) {
        this.zza = zzfrgVar;
        this.zzb = zzfrxVar;
        this.zzc = zzaylVar;
        this.zzd = zzaxxVar;
        this.zze = zzaxhVar;
        this.zzf = zzaynVar;
        this.zzg = zzayfVar;
        this.zzh = zzaxwVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzfrg zzfrgVar = this.zza;
        zzaus zzausVarZzb = this.zzb.zzb();
        map.put("v", zzfrgVar.zzb());
        map.put("gms", Boolean.valueOf(this.zza.zzc()));
        map.put("int", zzausVarZzb.zzi());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzayf zzayfVar = this.zzg;
        if (zzayfVar != null) {
            map.put("tcq", Long.valueOf(zzayfVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final Map zza() {
        zzayl zzaylVar = this.zzc;
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(zzaylVar.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final Map zzb() {
        zzfrg zzfrgVar = this.zza;
        zzfrx zzfrxVar = this.zzb;
        Map mapZze = zze();
        zzaus zzausVarZza = zzfrxVar.zza();
        mapZze.put("gai", Boolean.valueOf(zzfrgVar.zzd()));
        mapZze.put("did", zzausVarZza.zzh());
        mapZze.put("dst", Integer.valueOf(zzausVarZza.zzc().zza()));
        mapZze.put("doo", Boolean.valueOf(zzausVarZza.zzaq()));
        zzaxh zzaxhVar = this.zze;
        if (zzaxhVar != null) {
            mapZze.put("nt", Long.valueOf(zzaxhVar.zza()));
        }
        zzayn zzaynVar = this.zzf;
        if (zzaynVar != null) {
            mapZze.put("vs", Long.valueOf(zzaynVar.zzc()));
            mapZze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfth
    public final Map zzc() {
        zzaxw zzaxwVar = this.zzh;
        Map mapZze = zze();
        if (zzaxwVar != null) {
            mapZze.put("vst", zzaxwVar.zza());
        }
        return mapZze;
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
