package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbxl extends zzbad implements zzbxn {
    zzbxl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzbbVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, parcelFileDescriptor);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxn
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxu zzbxuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, parcelFileDescriptor);
        zzbaf.zzd(parcelZza, zzbxuVar);
        zzdc(3, parcelZza);
    }
}
