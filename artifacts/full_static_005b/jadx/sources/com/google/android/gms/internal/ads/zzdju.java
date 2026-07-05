package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbdv;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdju implements zzczl, zzdgn {
    private final zzcaq zza;
    private final Context zzb;
    private final zzcau zzc;
    private final View zzd;
    private String zze;
    private final zzbdv.zza.EnumC0014zza zzf;

    public zzdju(zzcaq zzcaqVar, Context context, zzcau zzcauVar, View view, zzbdv.zza.EnumC0014zza enumC0014zza) {
        this.zza = zzcaqVar;
        this.zzb = context;
        this.zzc = zzcauVar;
        this.zzd = view;
        this.zzf = enumC0014zza;
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzc() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    @ParametersAreNonnullByDefault
    public final void zzds(zzbyh zzbyhVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.zzc.zzp(this.zzb)) {
            try {
                zzcau zzcauVar = this.zzc;
                Context context = this.zzb;
                zzcauVar.zzl(context, zzcauVar.zza(context), this.zza.zza(), zzbyhVar.zzc(), zzbyhVar.zzb());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzczl
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzl() {
        if (this.zzf == zzbdv.zza.EnumC0014zza.APP_OPEN) {
            return;
        }
        String strZzc = this.zzc.zzc(this.zzb);
        this.zze = strZzc;
        this.zze = String.valueOf(strZzc).concat(this.zzf == zzbdv.zza.EnumC0014zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }
}
