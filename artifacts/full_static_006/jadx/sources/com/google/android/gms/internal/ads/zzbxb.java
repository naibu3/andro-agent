package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbxb extends zzbad implements zzbxd {
    zzbxb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zze(zzbxu zzbxuVar, zzbxn zzbxnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbxuVar);
        zzbaf.zzf(parcelZza, zzbxnVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzf(zzbxu zzbxuVar, zzbxn zzbxnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbxuVar);
        zzbaf.zzf(parcelZza, zzbxnVar);
        zzdc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzg(zzbxu zzbxuVar, zzbxn zzbxnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbxuVar);
        zzbaf.zzf(parcelZza, zzbxnVar);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxd
    public final void zzh(String str, zzbxn zzbxnVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbxnVar);
        zzdc(7, parcelZza);
    }
}
