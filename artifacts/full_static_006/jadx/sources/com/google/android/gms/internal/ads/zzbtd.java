package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public abstract class zzbtd extends zzbae implements zzbte {
    public zzbtd() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbte zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbte ? (zzbte) iInterfaceQueryLocalInterface : new zzbtc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbth zzbtfVar = null;
        zzbsp zzbsnVar = null;
        zzbsy zzbswVar = null;
        zzbss zzbsqVar = null;
        zzbtb zzbszVar = null;
        zzbsy zzbswVar2 = null;
        zzbtb zzbszVar2 = null;
        zzbsv zzbstVar = null;
        zzbss zzbsqVar2 = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Bundle bundle = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzbaf.zza(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbtfVar = iInterfaceQueryLocalInterface instanceof zzbth ? (zzbth) iInterfaceQueryLocalInterface : new zzbtf(strongBinder);
            }
            zzbth zzbthVar = zzbtfVar;
            zzbaf.zzc(parcel);
            zzh(iObjectWrapperAsInterface, string, bundle, bundle2, zzqVar, zzbthVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbtt zzbttVarZzf = zzf();
            parcel2.writeNoException();
            zzbaf.zze(parcel2, zzbttVarZzf);
        } else if (i == 3) {
            zzbtt zzbttVarZzg = zzg();
            parcel2.writeNoException();
            zzbaf.zze(parcel2, zzbttVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdq zzdqVarZze = zze();
            parcel2.writeNoException();
            zzbaf.zzf(parcel2, zzdqVarZze);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzbaf.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbsqVar2 = iInterfaceQueryLocalInterface2 instanceof zzbss ? (zzbss) iInterfaceQueryLocalInterface2 : new zzbsq(strongBinder2);
                    }
                    zzbss zzbssVar = zzbsqVar2;
                    zzbrl zzbrlVarZzb = zzbrk.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzbaf.zzc(parcel);
                    zzj(string2, string3, zzlVar, iObjectWrapperAsInterface2, zzbssVar, zzbrlVarZzb, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbstVar = iInterfaceQueryLocalInterface3 instanceof zzbsv ? (zzbsv) iInterfaceQueryLocalInterface3 : new zzbst(strongBinder3);
                    }
                    zzbsv zzbsvVar = zzbstVar;
                    zzbrl zzbrlVarZzb2 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzl(string4, string5, zzlVar2, iObjectWrapperAsInterface3, zzbsvVar, zzbrlVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    boolean zZzs = zzs(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzs ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbszVar2 = iInterfaceQueryLocalInterface4 instanceof zzbtb ? (zzbtb) iInterfaceQueryLocalInterface4 : new zzbsz(strongBinder4);
                    }
                    zzbtb zzbtbVar = zzbszVar2;
                    zzbrl zzbrlVarZzb3 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzp(string6, string7, zzlVar3, iObjectWrapperAsInterface5, zzbtbVar, zzbrlVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbswVar2 = iInterfaceQueryLocalInterface5 instanceof zzbsy ? (zzbsy) iInterfaceQueryLocalInterface5 : new zzbsw(strongBinder5);
                    }
                    zzbsy zzbsyVar = zzbswVar2;
                    zzbrl zzbrlVarZzb4 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzm(string8, string9, zzlVar4, iObjectWrapperAsInterface7, zzbsyVar, zzbrlVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzbaf.zzc(parcel);
                    zzq(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbszVar = iInterfaceQueryLocalInterface6 instanceof zzbtb ? (zzbtb) iInterfaceQueryLocalInterface6 : new zzbsz(strongBinder6);
                    }
                    zzbtb zzbtbVar2 = zzbszVar;
                    zzbrl zzbrlVarZzb5 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzo(string11, string12, zzlVar5, iObjectWrapperAsInterface8, zzbtbVar2, zzbrlVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbsqVar = iInterfaceQueryLocalInterface7 instanceof zzbss ? (zzbss) iInterfaceQueryLocalInterface7 : new zzbsq(strongBinder7);
                    }
                    zzbss zzbssVar2 = zzbsqVar;
                    zzbrl zzbrlVarZzb6 = zzbrk.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzbaf.zzc(parcel);
                    zzk(string13, string14, zzlVar6, iObjectWrapperAsInterface9, zzbssVar2, zzbrlVarZzb6, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbswVar = iInterfaceQueryLocalInterface8 instanceof zzbsy ? (zzbsy) iInterfaceQueryLocalInterface8 : new zzbsw(strongBinder8);
                    }
                    zzbsy zzbsyVar2 = zzbswVar;
                    zzbrl zzbrlVarZzb7 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbhk zzbhkVar = (zzbhk) zzbaf.zza(parcel, zzbhk.CREATOR);
                    zzbaf.zzc(parcel);
                    zzn(string15, string16, zzlVar7, iObjectWrapperAsInterface10, zzbsyVar2, zzbrlVarZzb7, zzbhkVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzbaf.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbsnVar = iInterfaceQueryLocalInterface9 instanceof zzbsp ? (zzbsp) iInterfaceQueryLocalInterface9 : new zzbsn(strongBinder9);
                    }
                    zzbsp zzbspVar = zzbsnVar;
                    zzbrl zzbrlVarZzb8 = zzbrk.zzb(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    zzi(string17, string18, zzlVar8, iObjectWrapperAsInterface11, zzbspVar, zzbrlVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzbaf.zzc(parcel);
                    boolean zZzr = zzr(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzr ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzbaf.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
