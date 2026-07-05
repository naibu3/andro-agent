package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdwq extends zzbzg {
    final /* synthetic */ zzdws zza;

    zzdwq(zzdws zzdwsVar) {
        this.zza = zzdwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(int i) throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzm(zzdwsVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzm(zzdwsVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg() throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzp(zzdwsVar.zza);
    }
}
