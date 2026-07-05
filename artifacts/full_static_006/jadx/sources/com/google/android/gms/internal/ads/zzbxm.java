package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzbxm extends zzbae implements zzbxn {
    public zzbxm() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzbaf.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbaf.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else if (i == 2) {
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) zzbaf.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            zzbaf.zzc(parcel);
            zze(zzbbVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) zzbaf.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzbxu zzbxuVar = (zzbxu) zzbaf.zza(parcel, zzbxu.CREATOR);
            zzbaf.zzc(parcel);
            zzg(parcelFileDescriptor2, zzbxuVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
