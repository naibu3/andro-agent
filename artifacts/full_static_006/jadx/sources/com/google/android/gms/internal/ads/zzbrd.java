package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbrd extends zzbad implements zzbrf {
    zzbrd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbri zzb(String str) throws RemoteException {
        zzbri zzbrgVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbrgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbrgVar = iInterfaceQueryLocalInterface instanceof zzbri ? (zzbri) iInterfaceQueryLocalInterface : new zzbrg(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final zzbte zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        zzbte zzbteVarZzb = zzbtd.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbteVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(4, parcelZza);
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final boolean zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
