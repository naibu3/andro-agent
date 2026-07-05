package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcbh extends zzbad implements zzcbj {
    zzcbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzcbg zze(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) throws RemoteException {
        zzcbg zzcbeVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzcbeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcbeVar = iInterfaceQueryLocalInterface instanceof zzcbg ? (zzcbg) iInterfaceQueryLocalInterface : new zzcbe(strongBinder);
        }
        parcelZzdb.recycle();
        return zzcbeVar;
    }
}
