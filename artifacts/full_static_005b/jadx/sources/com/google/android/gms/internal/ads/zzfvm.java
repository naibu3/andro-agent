package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzfvm extends zzbad implements zzfvo {
    zzfvm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final void zze(Bundle bundle, zzfvq zzfvqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, bundle);
        zzbaf.zzf(parcelZza, zzfvqVar);
        zzdd(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final void zzf(String str, Bundle bundle, zzfvq zzfvqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbaf.zzd(parcelZza, bundle);
        zzbaf.zzf(parcelZza, zzfvqVar);
        zzdd(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvo
    public final void zzg(Bundle bundle, zzfvq zzfvqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, bundle);
        zzbaf.zzf(parcelZza, zzfvqVar);
        zzdd(3, parcelZza);
    }
}
