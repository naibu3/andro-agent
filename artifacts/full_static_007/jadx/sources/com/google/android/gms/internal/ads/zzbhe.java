package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbhe extends zzbad implements IInterface {
    zzbhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbwq zzbwqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, zzbwqVar);
        zzdc(1, parcelZza);
    }
}
