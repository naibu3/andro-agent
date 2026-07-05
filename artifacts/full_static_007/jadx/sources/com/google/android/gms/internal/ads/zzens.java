package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzens {
    private final zzdjh zza;

    public zzens(zzdjh zzdjhVar) {
        this.zza = zzdjhVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfhf zzfhfVar, zzfgt zzfgtVar, View view, zzeno zzenoVar) {
        zzenq zzenqVar = new zzenq(this, new zzdjp() { // from class: com.google.android.gms.internal.ads.zzenp
            @Override // com.google.android.gms.internal.ads.zzdjp
            public final void zza(boolean z, Context context, zzczy zzczyVar) {
            }
        });
        zzdih zzdihVarZze = this.zza.zze(new zzcvf(zzfhfVar, zzfgtVar, null), zzenqVar);
        zzenoVar.zzd(new zzenr(this, zzdihVarZze));
        return zzdihVarZze.zzg();
    }
}
