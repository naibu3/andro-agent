package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzfdo implements zzfjw {
    private final zzfek zza;

    public zzfdo(zzfek zzfekVar) {
        this.zza = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final ListenableFuture zza(zzfjx zzfjxVar) {
        zzfdp zzfdpVar = (zzfdp) zzfjxVar;
        return ((zzfdl) this.zza).zzb(zzfdpVar.zzb, zzfdpVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final void zzb(zzfjl zzfjlVar) {
        zzfjlVar.zza = ((zzfdl) this.zza).zza();
    }
}
