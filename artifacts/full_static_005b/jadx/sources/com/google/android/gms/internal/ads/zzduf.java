package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzduf implements zzflu {
    private final Map zza;
    private final zzbdm zzb;

    zzduf(zzbdm zzbdmVar, Map map) {
        this.zza = map;
        this.zzb = zzbdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzd(zzfln zzflnVar, String str) {
        if (this.zza.containsKey(zzflnVar)) {
            this.zzb.zzb(((zzdue) this.zza.get(zzflnVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdC(zzfln zzflnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdD(zzfln zzflnVar, String str, Throwable th) {
        if (this.zza.containsKey(zzflnVar)) {
            this.zzb.zzb(((zzdue) this.zza.get(zzflnVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdE(zzfln zzflnVar, String str) {
        if (this.zza.containsKey(zzflnVar)) {
            this.zzb.zzb(((zzdue) this.zza.get(zzflnVar)).zza);
        }
    }
}
