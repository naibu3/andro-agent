package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzbxg extends zzbae implements zzbxh {
    public zzbxg() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbxk zzbxiVar = null;
        if (i == 1) {
            zzbwv zzbwvVar = (zzbwv) zzbaf.zza(parcel, zzbwv.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbxiVar = iInterfaceQueryLocalInterface instanceof zzbxk ? (zzbxk) iInterfaceQueryLocalInterface : new zzbxi(strongBinder);
            }
            zzbaf.zzc(parcel);
            zzf(zzbwvVar, zzbxiVar);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof zzbxk) {
                }
            }
            zzbaf.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbwz zzbwzVar = (zzbwz) zzbaf.zza(parcel, zzbwz.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbxiVar = iInterfaceQueryLocalInterface3 instanceof zzbxk ? (zzbxk) iInterfaceQueryLocalInterface3 : new zzbxi(strongBinder3);
            }
            zzbaf.zzc(parcel);
            zze(zzbwzVar, zzbxiVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
