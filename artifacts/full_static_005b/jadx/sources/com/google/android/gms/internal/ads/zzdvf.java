package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdvf implements zzflu {
    private final zzdux zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdvf(zzdux zzduxVar, Set set, Clock clock) {
        this.zzb = zzduxVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdve zzdveVar = (zzdve) it.next();
            this.zzd.put(zzdveVar.zzc, zzdveVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfln zzflnVar, boolean z) {
        zzfln zzflnVar2 = ((zzdve) this.zzd.get(zzflnVar)).zzb;
        if (this.zza.containsKey(zzflnVar2)) {
            String str = true != z ? "f." : "s.";
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflnVar2)).longValue();
            this.zzb.zzb().put("label.".concat(((zzdve) this.zzd.get(zzflnVar)).zza), str.concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzd(zzfln zzflnVar, String str) {
        if (this.zza.containsKey(zzflnVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflnVar)).longValue();
            zzdux zzduxVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzduxVar.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzflnVar)) {
            zze(zzflnVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdC(zzfln zzflnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdD(zzfln zzflnVar, String str, Throwable th) {
        if (this.zza.containsKey(zzflnVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflnVar)).longValue();
            zzdux zzduxVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzduxVar.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzflnVar)) {
            zze(zzflnVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdE(zzfln zzflnVar, String str) {
        this.zza.put(zzflnVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
