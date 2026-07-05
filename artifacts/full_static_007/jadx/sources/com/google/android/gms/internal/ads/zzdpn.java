package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdpn {
    private final Executor zza;
    private final zzcrk zzb;
    private final zzdhc zzc;
    private final zzcqd zzd;

    zzdpn(Executor executor, zzcrk zzcrkVar, zzdhc zzdhcVar, zzcqd zzcqdVar) {
        this.zza = executor;
        this.zzc = zzdhcVar;
        this.zzb = zzcrkVar;
        this.zzd = zzcqdVar;
    }

    public final void zza(final zzchd zzchdVar) {
        if (zzchdVar == null) {
            return;
        }
        this.zzc.zza(zzchdVar.zzF());
        this.zzc.zzo(new zzban() { // from class: com.google.android.gms.internal.ads.zzdpj
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzdp(zzbam zzbamVar) {
                zzciv zzcivVarZzN = zzchdVar.zzN();
                Rect rect = zzbamVar.zzd;
                zzcivVarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzo(new zzban() { // from class: com.google.android.gms.internal.ads.zzdpk
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzdp(zzbam zzbamVar) {
                HashMap map = new HashMap();
                map.put("isVisible", true != zzbamVar.zzj ? "0" : "1");
                zzchdVar.zzd("onAdVisibilityChanged", map);
            }
        }, this.zza);
        this.zzc.zzo(this.zzb, this.zza);
        this.zzb.zzf(zzchdVar);
        zzciv zzcivVarZzN = zzchdVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkf)).booleanValue() && zzcivVarZzN != null) {
            zzcivVarZzN.zzJ(this.zzd);
            zzcivVarZzN.zzK(this.zzd, null, null);
        }
        zzchdVar.zzag("/trackActiveViewUnit", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdpl
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzchd) obj, map);
            }
        });
        zzchdVar.zzag("/untrackActiveViewUnit", new zzblp() { // from class: com.google.android.gms.internal.ads.zzdpm
            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzchd) obj, map);
            }
        });
    }

    final /* synthetic */ void zzb(zzchd zzchdVar, Map map) {
        this.zzb.zzb();
    }

    final /* synthetic */ void zzc(zzchd zzchdVar, Map map) {
        this.zzb.zza();
    }
}
