package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmr;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcjd;
import com.google.android.gms.internal.ads.zzdmn;
import com.google.android.gms.internal.ads.zzdmp;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzeof;
import com.google.android.gms.internal.ads.zzfbt;
import com.google.android.gms.internal.ads.zzfdh;
import com.google.android.gms.internal.ads.zzfey;
import com.google.android.gms.internal.ads.zzfgm;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeof(zzcjd.zzb(context, zzbrfVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbrf zzbrfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbt zzfbtVarZzt = zzcjd.zzb(context, zzbrfVar, i).zzt();
        zzfbtVarZzt.zza(str);
        zzfbtVarZzt.zzb(context);
        return i >= ((Integer) zzba.zzc().zza(zzbep.zzfp)).intValue() ? zzfbtVarZzt.zzc().zza() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbrf zzbrfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfdh zzfdhVarZzu = zzcjd.zzb(context, zzbrfVar, i).zzu();
        zzfdhVarZzu.zzc(context);
        zzfdhVarZzu.zza(zzqVar);
        zzfdhVarZzu.zzb(str);
        return zzfdhVarZzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbrf zzbrfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfey zzfeyVarZzv = zzcjd.zzb(context, zzbrfVar, i).zzv();
        zzfeyVarZzv.zzc(context);
        zzfeyVarZzv.zza(zzqVar);
        zzfeyVarZzv.zzb(str);
        return zzfeyVarZzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i) {
        return new zzt((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new VersionInfoParcel(241806000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbrfVar, i).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbhz zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdmp((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 241806000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbif zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdmn((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbmr zzk(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i, zzbmo zzbmoVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdwl zzdwlVarZzk = zzcjd.zzb(context, zzbrfVar, i).zzk();
        zzdwlVarZzk.zzb(context);
        zzdwlVarZzk.zza(zzbmoVar);
        return zzdwlVarZzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuz zzl(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbrfVar, i).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzu(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.google.android.gms.ads.internal.overlay.zzu(activity) : new zzad(activity) : new zzz(activity, adOverlayInfoParcelZza) : new zzag(activity) : new zzaf(activity) : new com.google.android.gms.ads.internal.overlay.zzt(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyk zzn(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgm zzfgmVarZzw = zzcjd.zzb(context, zzbrfVar, i).zzw();
        zzfgmVarZzw.zzb(context);
        return zzfgmVarZzw.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbza zzo(IObjectWrapper iObjectWrapper, String str, zzbrf zzbrfVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfgm zzfgmVarZzw = zzcjd.zzb(context, zzbrfVar, i).zzw();
        zzfgmVarZzw.zzb(context);
        zzfgmVarZzw.zza(str);
        return zzfgmVarZzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzcbg zzp(IObjectWrapper iObjectWrapper, zzbrf zzbrfVar, int i) {
        return zzcjd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbrfVar, i).zzq();
    }
}
