package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfec implements zzfxu {
    final /* synthetic */ zzfeg zza;

    zzfec(zzfeg zzfegVar) {
        this.zza = zzfegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        com.google.android.gms.ads.internal.util.client.zzm.zzh("", (zzebh) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfeg zzfegVar = this.zza;
        zzfegVar.zzd = new zzfef(null, zzfegVar.zze(), null);
        return this.zza.zzd;
    }
}
