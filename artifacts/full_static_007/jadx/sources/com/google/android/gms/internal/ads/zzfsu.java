package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfsu extends zzbad implements IInterface {
    zzfsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfss zze(zzfsq zzfsqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzfsqVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        zzfss zzfssVar = (zzfss) zzbaf.zza(parcelZzdb, zzfss.CREATOR);
        parcelZzdb.recycle();
        return zzfssVar;
    }

    public final zzftb zzf(zzfsz zzfszVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzfszVar);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        zzftb zzftbVar = (zzftb) zzbaf.zza(parcelZzdb, zzftb.CREATOR);
        parcelZzdb.recycle();
        return zzftbVar;
    }

    public final void zzg(zzfsn zzfsnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzfsnVar);
        zzdc(2, parcelZza);
    }
}
