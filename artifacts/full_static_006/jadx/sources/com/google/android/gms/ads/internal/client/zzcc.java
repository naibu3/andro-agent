package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmq;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes.dex */
public final class zzcc extends zzbad implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelZzdb.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbrf zzbrfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(13, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbrf zzbrfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbrf zzbrfVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(10, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(9, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelZzdb.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(17, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(strongBinder);
        }
        parcelZzdb.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbhz zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, iObjectWrapper2);
        Parcel parcelZzdb = zzdb(5, parcelZza);
        zzbhz zzbhzVarZzdA = zzbhy.zzdA(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbhzVarZzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbif zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, iObjectWrapper2);
        zzbaf.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzdb = zzdb(11, parcelZza);
        zzbif zzbifVarZze = zzbie.zze(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbifVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbmr zzk(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i, zzbmo zzbmoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        zzbaf.zzf(parcelZza, zzbmoVar);
        Parcel parcelZzdb = zzdb(16, parcelZza);
        zzbmr zzbmrVarZzb = zzbmq.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbmrVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuz zzl(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(15, parcelZza);
        zzbuz zzbuzVarZzb = zzbuy.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbuzVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(8, parcelZza);
        zzbvg zzbvgVarZzI = zzbvf.zzI(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbvgVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyk zzn(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbza zzo(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(12, parcelZza);
        zzbza zzbzaVarZzq = zzbyz.zzq(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbzaVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcbg zzp(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbrfVar);
        parcelZza.writeInt(241806000);
        Parcel parcelZzdb = zzdb(14, parcelZza);
        zzcbg zzcbgVarZzb = zzcbf.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzcbgVarZzb;
    }
}
