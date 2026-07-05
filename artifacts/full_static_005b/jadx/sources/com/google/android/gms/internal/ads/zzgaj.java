package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgaj extends zzfzw {
    final /* synthetic */ zzgal zza;
    private final Object zzb;
    private int zzc;

    zzgaj(zzgal zzgalVar, int i) {
        this.zza = zzgalVar;
        this.zzb = zzgal.zzg(zzgalVar, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfya.zza(this.zzb, zzgal.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzw, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgal.zzj(this.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfzw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzgal zzgalVar = this.zza;
        Object objZzj = zzgal.zzj(zzgalVar, i);
        zzgal.zzn(zzgalVar, this.zzc, obj);
        return objZzj;
    }
}
