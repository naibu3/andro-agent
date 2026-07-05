package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcpt implements zzdag {
    private final zzfim zza;

    public zzcpt(zzfim zzfimVar) {
        this.zza = zzfimVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfhv e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfhv e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfhv e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
