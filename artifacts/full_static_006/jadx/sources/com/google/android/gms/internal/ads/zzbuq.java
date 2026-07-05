package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbuq extends zzbiy {
    final /* synthetic */ zzbut zza;

    /* synthetic */ zzbuq(zzbut zzbutVar, zzbup zzbupVar) {
        this.zza = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zze(zzbip zzbipVar, String str) {
        zzbut zzbutVar = this.zza;
        if (zzbutVar.zzb == null) {
            return;
        }
        zzbutVar.zzb.onCustomClick(zzbutVar.zzf(zzbipVar), str);
    }
}
