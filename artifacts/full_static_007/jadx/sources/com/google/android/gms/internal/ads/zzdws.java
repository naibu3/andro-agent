package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdws implements zzdwc {
    private final long zza;
    private final zzdwh zzb;
    private final zzfgk zzc;

    zzdws(long j, Context context, zzdwh zzdwhVar, zzcjd zzcjdVar, String str) {
        this.zza = j;
        this.zzb = zzdwhVar;
        zzfgm zzfgmVarZzw = zzcjdVar.zzw();
        zzfgmVarZzw.zzb(context);
        zzfgmVarZzw.zza(str);
        this.zzc = zzfgmVarZzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdwq(this));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwc
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdwr(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }
}
