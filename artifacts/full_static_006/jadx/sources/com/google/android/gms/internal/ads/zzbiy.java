package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzbiy extends zzbae implements zzbiz {
    public zzbiy() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbiz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof zzbiz ? (zzbiz) iInterfaceQueryLocalInterface : new zzbix(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbip zzbinVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbinVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbinVar = iInterfaceQueryLocalInterface instanceof zzbip ? (zzbip) iInterfaceQueryLocalInterface : new zzbin(strongBinder);
        }
        String string = parcel.readString();
        zzbaf.zzc(parcel);
        zze(zzbinVar, string);
        parcel2.writeNoException();
        return true;
    }
}
