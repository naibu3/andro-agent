package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzeiv extends zzbsr {
    final /* synthetic */ zzeiw zza;
    private final zzeho zzb;

    /* synthetic */ zzeiv(zzeiw zzeiwVar, zzeho zzehoVar, zzeiu zzeiuVar) {
        this.zza = zzeiwVar;
        this.zzb = zzehoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zze(String str) throws RemoteException {
        ((zzejh) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzejh) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzejh) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbss
    public final void zzh(zzbro zzbroVar) throws RemoteException {
        this.zza.zzd = zzbroVar;
        ((zzejh) this.zzb.zzc).zzo();
    }
}
