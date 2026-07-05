package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbva extends zzbad implements zzbvc {
    zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final zzbuz zze(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) throws RemoteException {
        zzbuz zzbuxVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbuxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbuxVar = iInterfaceQueryLocalInterface instanceof zzbuz ? (zzbuz) iInterfaceQueryLocalInterface : new zzbux(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbuxVar;
    }
}
