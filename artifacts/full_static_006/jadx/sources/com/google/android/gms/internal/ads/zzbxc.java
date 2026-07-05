package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzbxc extends zzbae implements zzbxd {
    public zzbxc() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxn zzbxlVar = null;
        if (i == 1) {
            zzbaf.zzc(parcel);
            parcel2.writeNoException();
            zzbaf.zze(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof zzbxe) {
                }
            }
            zzbaf.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbxu zzbxuVar = (zzbxu) zzbaf.zza(parcel, zzbxu.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbxlVar = iInterfaceQueryLocalInterface2 instanceof zzbxn ? (zzbxn) iInterfaceQueryLocalInterface2 : new zzbxl(strongBinder2);
            }
            zzbaf.zzc(parcel);
            zzg(zzbxuVar, zzbxlVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbxu zzbxuVar2 = (zzbxu) zzbaf.zza(parcel, zzbxu.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbxlVar = iInterfaceQueryLocalInterface3 instanceof zzbxn ? (zzbxn) iInterfaceQueryLocalInterface3 : new zzbxl(strongBinder3);
            }
            zzbaf.zzc(parcel);
            zzf(zzbxuVar2, zzbxlVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbxu zzbxuVar3 = (zzbxu) zzbaf.zza(parcel, zzbxu.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbxlVar = iInterfaceQueryLocalInterface4 instanceof zzbxn ? (zzbxn) iInterfaceQueryLocalInterface4 : new zzbxl(strongBinder4);
            }
            zzbaf.zzc(parcel);
            zze(zzbxuVar3, zzbxlVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbxlVar = iInterfaceQueryLocalInterface5 instanceof zzbxn ? (zzbxn) iInterfaceQueryLocalInterface5 : new zzbxl(strongBinder5);
            }
            zzbaf.zzc(parcel);
            zzh(string, zzbxlVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
