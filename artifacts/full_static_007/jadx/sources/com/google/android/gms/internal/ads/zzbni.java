package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzbni implements zzgfa {
    final /* synthetic */ zzbna zza;

    zzbni(zzbnm zzbnmVar, zzbna zzbnaVar) {
        this.zza = zzbnaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzccn zzccnVar = new zzccn();
        ((zzbng) obj).zze(this.zza, new zzbnh(this, zzccnVar));
        return zzccnVar;
    }
}
