package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbjx extends zzbiy {
    final /* synthetic */ zzbka zza;

    /* synthetic */ zzbjx(zzbka zzbkaVar, zzbjw zzbjwVar) {
        this.zza = zzbkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zze(zzbip zzbipVar, String str) {
        zzbka zzbkaVar = this.zza;
        if (zzbkaVar.zzb == null) {
            return;
        }
        zzbkaVar.zzb.zzb(zzbkaVar.zzf(zzbipVar), str);
    }
}
