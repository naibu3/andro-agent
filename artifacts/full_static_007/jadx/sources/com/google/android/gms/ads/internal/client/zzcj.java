package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes.dex */
public final class zzcj extends zzbad implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbrf getAdapterCreator() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        zzbrf zzbrfVarZzf = zzbre.zzf(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbrfVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zza());
        zzen zzenVar = (zzen) zzbaf.zza(parcelZzdb, zzen.CREATOR);
        parcelZzdb.recycle();
        return zzenVar;
    }
}
