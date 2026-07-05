package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbus extends zzbjb {
    final /* synthetic */ zzbut zza;

    /* synthetic */ zzbus(zzbut zzbutVar, zzbur zzburVar) {
        this.zza = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zze(zzbip zzbipVar) {
        zzbut zzbutVar = this.zza;
        zzbutVar.zza.onCustomFormatAdLoaded(zzbutVar.zzf(zzbipVar));
    }
}
