package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbyq extends zzbad implements zzbys {
    zzbyq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzm(IObjectWrapper iObjectWrapper, zzbyt zzbytVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzbytVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(5, parcelZza);
    }
}
