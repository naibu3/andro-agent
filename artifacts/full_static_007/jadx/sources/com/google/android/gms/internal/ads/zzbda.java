package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbda extends zzbad implements IInterface {
    zzbda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcy zzbcyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbcyVar);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        long j = parcelZzdb.readLong();
        parcelZzdb.recycle();
        return j;
    }

    public final zzbcv zzf(zzbcy zzbcyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbcyVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        zzbcv zzbcvVar = (zzbcv) zzbaf.zza(parcelZzdb, zzbcv.CREATOR);
        parcelZzdb.recycle();
        return zzbcvVar;
    }

    public final zzbcv zzg(zzbcy zzbcyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbcyVar);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        zzbcv zzbcvVar = (zzbcv) zzbaf.zza(parcelZzdb, zzbcv.CREATOR);
        parcelZzdb.recycle();
        return zzbcvVar;
    }
}
