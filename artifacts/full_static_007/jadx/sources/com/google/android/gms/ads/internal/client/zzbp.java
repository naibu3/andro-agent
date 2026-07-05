package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbae;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzboi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes.dex */
public abstract class zzbp extends zzbae implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                zzbaf.zzf(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzbaf.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbit zzbitVarZzb = zzbis.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzf(zzbitVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbiw zzbiwVarZzb = zzbiv.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzg(zzbiwVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbjc zzbjcVarZzb = zzbjb.zzb(parcel.readStrongBinder());
                zzbiz zzbizVarZzb = zzbiy.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzh(string, zzbjcVarZzb, zzbizVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbhk zzbhkVar = (zzbhk) zzbaf.zza(parcel, zzbhk.CREATOR);
                zzbaf.zzc(parcel);
                zzo(zzbhkVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzbaf.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbjg zzbjgVarZzb = zzbjf.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzbaf.zza(parcel, zzq.CREATOR);
                zzbaf.zzc(parcel);
                zzj(zzbjgVarZzb, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzbaf.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzbaf.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbjj zzbjjVarZzb = zzbji.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzk(zzbjjVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbnz zzbnzVar = (zzbnz) zzbaf.zza(parcel, zzbnz.CREATOR);
                zzbaf.zzc(parcel);
                zzn(zzbnzVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzboi zzboiVarZzb = zzboh.zzb(parcel.readStrongBinder());
                zzbaf.zzc(parcel);
                zzi(zzboiVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzbaf.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzbaf.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
