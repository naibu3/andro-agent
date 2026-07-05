package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzbtc extends zzbad implements zzbte {
    zzbtc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final zzbtt zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(parcelZzdb, zzbtt.CREATOR);
        parcelZzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final zzbtt zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        zzbtt zzbttVar = (zzbtt) zzbaf.zza(parcelZzdb, zzbtt.CREATOR);
        parcelZzdb.recycle();
        return zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbth zzbthVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzbaf.zzd(parcelZza, bundle);
        zzbaf.zzd(parcelZza, bundle2);
        zzbaf.zzd(parcelZza, zzqVar);
        zzbaf.zzf(parcelZza, zzbthVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsp zzbspVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbspVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbss zzbssVar, zzbrl zzbrlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbssVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzbaf.zzd(parcelZza, zzqVar);
        zzdc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbss zzbssVar, zzbrl zzbrlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbssVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzbaf.zzd(parcelZza, zzqVar);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsv zzbsvVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbsvVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsy zzbsyVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbsyVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsy zzbsyVar, zzbrl zzbrlVar, zzbhk zzbhkVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbsyVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzbaf.zzd(parcelZza, zzbhkVar);
        zzdc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbtb zzbtbVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbtbVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbtb zzbtbVar, zzbrl zzbrlVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbaf.zzd(parcelZza, zzlVar);
        zzbaf.zzf(parcelZza, iObjectWrapper);
        zzbaf.zzf(parcelZza, zzbtbVar);
        zzbaf.zzf(parcelZza, zzbrlVar);
        zzdc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(24, parcelZza);
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(15, parcelZza);
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbaf.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(17, parcelZza);
        boolean zZzg = zzbaf.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
