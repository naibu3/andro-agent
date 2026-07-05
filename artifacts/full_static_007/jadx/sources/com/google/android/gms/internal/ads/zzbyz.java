package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzbyz extends zzbae implements zzbza {
    public zzbyz() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbza zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbza ? (zzbza) iInterfaceQueryLocalInterface : new zzbyy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbzh zzbzfVar = null;
        zzbzh zzbzfVar2 = null;
        zzbzi zzbziVar = null;
        zzbzd zzbzbVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbzfVar = iInterfaceQueryLocalInterface instanceof zzbzh ? (zzbzh) iInterfaceQueryLocalInterface : new zzbzf(strongBinder);
                }
                zzbaf.zzc(parcel);
                zzf(zzlVar, zzbzfVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbzbVar = iInterfaceQueryLocalInterface2 instanceof zzbzd ? (zzbzd) iInterfaceQueryLocalInterface2 : new zzbzb(strongBinder2);
                }
                zzbaf.zzc(parcel);
                zzk(zzbzbVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i3 = zzbaf.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzm(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbziVar = iInterfaceQueryLocalInterface3 instanceof zzbzi ? (zzbzi) iInterfaceQueryLocalInterface3 : new zzbzi(strongBinder3);
                }
                zzbaf.zzc(parcel);
                zzp(zzbziVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbzo zzbzoVar = (zzbzo) zzbaf.zza(parcel, zzbzo.CREATOR);
                zzbaf.zzc(parcel);
                zzl(zzbzoVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdd zzddVarZzb = com.google.android.gms.ads.internal.client.zzdc.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzi(zzddVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzbaf.zze(parcel2, bundleZzb);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZzg = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzn(iObjectWrapperAsInterface2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbyx zzbyxVarZzd = zzd();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbyxVarZzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdn zzdnVarZzc = zzc();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdnVarZzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdg zzdgVarZzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzj(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbzfVar2 = iInterfaceQueryLocalInterface4 instanceof zzbzh ? (zzbzh) iInterfaceQueryLocalInterface4 : new zzbzf(strongBinder4);
                }
                zzbaf.zzc(parcel);
                zzg(zzlVar2, zzbzfVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = zzbaf.zzg(parcel);
                zzbaf.zzc(parcel);
                zzh(zZzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
