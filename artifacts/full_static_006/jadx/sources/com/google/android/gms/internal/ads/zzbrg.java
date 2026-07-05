package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbrg extends zzbad implements zzbri {
    zzbrg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzbaf.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzdc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzdc(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzdb = zzdb(22, zza());
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbrq zzO() throws RemoteException {
        zzbrq zzbrqVar;
        Parcel parcelZzdb = zzdb(15, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbrqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbrqVar = iInterfaceQueryLocalInterface instanceof zzbrq ? (zzbrq) iInterfaceQueryLocalInterface : new zzbrq(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbrr zzP() throws RemoteException {
        zzbrr zzbrrVar;
        Parcel parcelZzdb = zzdb(16, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbrrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbrrVar = iInterfaceQueryLocalInterface instanceof zzbrr ? (zzbrr) iInterfaceQueryLocalInterface : new zzbrr(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbip zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbro zzj() throws RemoteException {
        zzbro zzbrmVar;
        Parcel parcelZzdb = zzdb(36, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbrmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbrmVar = iInterfaceQueryLocalInterface instanceof zzbro ? (zzbro) iInterfaceQueryLocalInterface : new zzbrm(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbrmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbru zzk() throws RemoteException {
        zzbru zzbrsVar;
        Parcel parcelZzdb = zzdb(27, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbrsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbrsVar = iInterfaceQueryLocalInterface instanceof zzbru ? (zzbru) iInterfaceQueryLocalInterface : new zzbrs(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbtt zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(33, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(parcelZzdb, zzbtt.CREATOR);
        parcelZzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final zzbtt zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(34, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(parcelZzdb, zzbtt.CREATOR);
        parcelZzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbys zzbysVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(null);
        zzbaf.zzf(parcelZza, zzbysVar);
        parcelZza.writeString(str2);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzq(IObjectWrapper iObjectWrapper, zzbnr zzbnrVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbnrVar);
        parcelZza.writeTypedList(list);
        zzdc(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzr(IObjectWrapper iObjectWrapper, zzbys zzbysVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbysVar);
        parcelZza.writeStringList(list);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzdc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzqVar);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzqVar);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbrl zzbrlVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbri
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbrl zzbrlVar, zzbhk zzbhkVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzbaf.zzd(parcelZza, zzbhkVar);
        parcelZza.writeStringList(list);
        zzdc(14, parcelZza);
    }
}
