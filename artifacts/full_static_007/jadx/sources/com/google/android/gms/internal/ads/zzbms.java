package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbms extends zzbad implements zzbmu {
    zzbms(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final zzbmr zze(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i, zzbmo zzbmoVar) throws RemoteException {
        zzbmr zzbmpVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        zzbaf.zzf(parcelZza, zzbmoVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbmpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbmpVar = iInterfaceQueryLocalInterface instanceof zzbmr ? (zzbmr) iInterfaceQueryLocalInterface : new zzbmp(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbmpVar;
    }
}
