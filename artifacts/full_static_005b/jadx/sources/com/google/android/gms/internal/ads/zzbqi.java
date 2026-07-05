package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbqi implements zzccr {
    final /* synthetic */ zzbpn zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzccn zzc;
    final /* synthetic */ zzbql zzd;

    zzbqi(zzbql zzbqlVar, zzbpn zzbpnVar, Object obj, zzccn zzccnVar) {
        this.zza = zzbpnVar;
        this.zzb = obj;
        this.zzc = zzccnVar;
        this.zzd = zzbqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccr
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzccn zzccnVar = this.zzc;
        zzbql.zzd(this.zzd, this.zza, (zzbpu) obj, obj2, zzccnVar);
    }
}
