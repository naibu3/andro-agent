package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbxf extends zzbad implements zzbxh {
    zzbxf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zze(zzbwz zzbwzVar, zzbxk zzbxkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbwzVar);
        zzbaf.zzf(parcelZza, zzbxkVar);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(zzbwv zzbwvVar, zzbxk zzbxkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbwvVar);
        zzbaf.zzf(parcelZza, zzbxkVar);
        zzdc(1, parcelZza);
    }
}
