package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbin extends zzbad implements zzbip {
    zzbin(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhs zzf() throws RemoteException {
        zzbhs zzbhqVar;
        Parcel parcelZzdb = zzdb(16, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbhqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbhqVar = iInterfaceQueryLocalInterface instanceof zzbhs ? (zzbhs) iInterfaceQueryLocalInterface : new zzbhq(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhv zzg(String str) throws RemoteException {
        zzbhv zzbhtVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbhtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbhtVar = iInterfaceQueryLocalInterface instanceof zzbhv ? (zzbhv) iInterfaceQueryLocalInterface : new zzbht(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbhtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final List zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzdb.createStringArrayList();
        parcelZzdb.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzl() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzm() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzo() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(17, parcelZza);
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(10, parcelZza);
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
