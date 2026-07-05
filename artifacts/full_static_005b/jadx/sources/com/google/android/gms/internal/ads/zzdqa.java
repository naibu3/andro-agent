package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdqa extends zzbio {
    private final Context zza;
    private final zzdlt zzb;
    private zzdmt zzc;
    private zzdlo zzd;

    public zzdqa(Context context, zzdlt zzdltVar, zzdmt zzdmtVar, zzdlo zzdloVar) {
        this.zza = context;
        this.zzb = zzdltVar;
        this.zzc = zzdmtVar;
        this.zzd = zzdloVar;
    }

    private final zzbhj zzd(String str) {
        return new zzdpz(this, NativeCustomFormatAd.ASSET_NAME_VIDEO);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhs zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final zzbhv zzg(String str) {
        return (zzbhv) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final List zzk() {
        try {
            SimpleArrayMap simpleArrayMapZzh = this.zzb.zzh();
            SimpleArrayMap simpleArrayMapZzi = this.zzb.zzi();
            String[] strArr = new String[simpleArrayMapZzh.size() + simpleArrayMapZzi.size()];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMapZzh.size(); i2++) {
                strArr[i] = (String) simpleArrayMapZzh.keyAt(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMapZzi.size(); i3++) {
                strArr[i] = (String) simpleArrayMapZzi.keyAt(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzl() {
        zzdlo zzdloVar = this.zzd;
        if (zzdloVar != null) {
            zzdloVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzm() {
        try {
            String strZzC = this.zzb.zzC();
            if (Objects.equals(strZzC, "Google")) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strZzC)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            zzdlo zzdloVar = this.zzd;
            if (zzdloVar != null) {
                zzdloVar.zzf(strZzC, false);
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzn(String str) {
        zzdlo zzdloVar = this.zzd;
        if (zzdloVar != null) {
            zzdloVar.zzF(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzo() {
        zzdlo zzdloVar = this.zzd;
        if (zzdloVar != null) {
            zzdloVar.zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdlo zzdloVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzu() == null || (zzdloVar = this.zzd) == null) {
            return;
        }
        zzdloVar.zzJ((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzq() {
        zzdlo zzdloVar = this.zzd;
        return (zzdloVar == null || zzdloVar.zzW()) && this.zzb.zzr() != null && this.zzb.zzs() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdmt zzdmtVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdmtVar = this.zzc) == null || !zzdmtVar.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzq().zzar(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdmt zzdmtVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdmtVar = this.zzc) == null || !zzdmtVar.zzg((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzs().zzar(zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbip
    public final boolean zzt() {
        zzehg zzehgVarZzu = this.zzb.zzu();
        if (zzehgVarZzu == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzu.zzA().zzk(zzehgVarZzu.zza());
        if (this.zzb.zzr() == null) {
            return true;
        }
        this.zzb.zzr().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}
