package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdvb {
    final /* synthetic */ zzdvc zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdvb(zzdvc zzdvcVar) {
        this.zza = zzdvcVar;
    }

    static /* bridge */ /* synthetic */ zzdvb zza(zzdvb zzdvbVar) {
        zzdvbVar.zzb.putAll(zzdvbVar.zza.zzc);
        return zzdvbVar;
    }

    public final zzdvb zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdvb zzc(zzfgt zzfgtVar) {
        zzb("aai", zzfgtVar.zzx);
        zzb("request_id", zzfgtVar.zzao);
        zzb("ad_format", zzfgt.zza(zzfgtVar.zzb));
        return this;
    }

    public final zzdvb zzd(zzfgw zzfgwVar) {
        zzb("gqi", zzfgwVar.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzf() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh();
            }
        });
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdva
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    final /* synthetic */ void zzh() {
        this.zza.zza.zzf(this.zzb);
    }

    final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }
}
