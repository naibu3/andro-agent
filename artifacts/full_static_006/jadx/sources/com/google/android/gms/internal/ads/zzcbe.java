package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcbe extends zzbad implements zzcbg {
    zzcbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzdb = zzdb(11, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(IObjectWrapper iObjectWrapper, zzcbk zzcbkVar, zzcbd zzcbdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzcbkVar);
        zzbaf.zzf(parcelZza, zzcbdVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(zzbwe zzbweVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbweVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbvvVar);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbvvVar);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbvvVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbvv zzbvvVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbvvVar);
        zzdc(5, parcelZza);
    }
}
