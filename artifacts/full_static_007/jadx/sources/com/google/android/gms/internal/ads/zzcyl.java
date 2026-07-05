package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzcyl implements zzdaz, zzdag {
    private final Context zza;
    private final zzfgt zzb;
    private final zzbvl zzc;

    public zzcyl(Context context, zzfgt zzfgtVar, zzbvl zzbvlVar) {
        this.zza = context;
        this.zzb = zzfgtVar;
        this.zzc = zzbvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdj(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdl(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzdm(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdaz
    public final void zzs() {
        zzbvm zzbvmVar = this.zzb.zzae;
        if (zzbvmVar == null || !zzbvmVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
