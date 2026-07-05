package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzdsl implements zzdag {
    private final zzchd zza;

    zzdsl(zzchd zzchdVar) {
        this.zza = zzchdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(Context context) {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(Context context) {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(Context context) {
        zzchd zzchdVar = this.zza;
        if (zzchdVar != null) {
            zzchdVar.onResume();
        }
    }
}
