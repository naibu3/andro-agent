package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes.dex */
public abstract class zzcd extends zzbae implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String string = parcel.readString();
                zzbrf zzbrfVarZzf = zzbre.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zzbuVarZzd = zzd(iObjectWrapperAsInterface, zzqVar, string, zzbrfVarZzf, i3);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbuVarZzd);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                zzbrf zzbrfVarZzf2 = zzbre.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zzbuVarZze = zze(iObjectWrapperAsInterface2, zzqVar2, string2, zzbrfVarZzf2, i4);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbuVarZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbrf zzbrfVarZzf3 = zzbre.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbq zzbqVarZzb = zzb(iObjectWrapperAsInterface3, string3, zzbrfVarZzf3, i5);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbqVarZzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbhz zzbhzVarZzi = zzi(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbhzVarZzi);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzbrfVarZzf4 = zzbre.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbyk zzbykVarZzn = zzn(iObjectWrapperAsInterface6, zzbrfVarZzf4, i6);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbykVarZzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbvg zzbvgVarZzm = zzm(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbvgVarZzm);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzco zzcoVarZzg = zzg(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzcoVarZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zzbuVarZzf = zzf(iObjectWrapperAsInterface9, zzqVar3, string4, i8);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbuVarZzf);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbif zzbifVarZzj = zzj(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbifVarZzj);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbrf zzbrfVarZzf5 = zzbre.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbza zzbzaVarZzo = zzo(iObjectWrapperAsInterface13, string5, zzbrfVarZzf5, i9);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbzaVarZzo);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                zzbrf zzbrfVarZzf6 = zzbre.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbu zzbuVarZzc = zzc(iObjectWrapperAsInterface14, zzqVar4, string6, zzbrfVarZzf6, i10);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbuVarZzc);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzbrfVarZzf7 = zzbre.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzcbg zzcbgVarZzp = zzp(iObjectWrapperAsInterface15, zzbrfVarZzf7, i11);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzcbgVarZzp);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzbrfVarZzf8 = zzbre.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzbuz zzbuzVarZzl = zzl(iObjectWrapperAsInterface16, zzbrfVarZzf8, i12);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbuzVarZzl);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzbrfVarZzf9 = zzbre.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbmo zzbmoVarZzc = zzbmn.zzc(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzbmr zzbmrVarZzk = zzk(iObjectWrapperAsInterface17, zzbrfVarZzf9, i13, zzbmoVarZzc);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbmrVarZzk);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrf zzbrfVarZzf10 = zzbre.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzbaf.zzc(parcel);
                zzdj zzdjVarZzh = zzh(iObjectWrapperAsInterface18, zzbrfVarZzf10, i14);
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzdjVarZzh);
                return true;
            default:
                return false;
        }
    }
}
