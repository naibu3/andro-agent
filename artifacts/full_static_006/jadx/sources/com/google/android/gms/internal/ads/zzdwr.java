package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzdwr extends zzbzc {
    final /* synthetic */ zzdws zza;

    zzdwr(zzdws zzdwsVar) {
        this.zza = zzdwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zze() throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzj(zzdwsVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzf() throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzo(zzdwsVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzg() throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzk(zzdwsVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzh(int i) throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzn(zzdwsVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzn(zzdwsVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzj() throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzr(zzdwsVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzd
    public final void zzk(zzbyx zzbyxVar) throws JSONException, RemoteException {
        zzdws zzdwsVar = this.zza;
        zzdwsVar.zzb.zzl(zzdwsVar.zza, zzbyxVar);
    }
}
