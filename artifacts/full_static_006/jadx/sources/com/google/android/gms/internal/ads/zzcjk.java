package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzcjk implements zzhkp {
    private final zzcjg zza;

    public zzcjk(zzcjg zzcjgVar) {
        this.zza = zzcjgVar;
    }

    public final WeakReference zza() {
        WeakReference weakReferenceZzg = this.zza.zzg();
        zzhkx.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        WeakReference weakReferenceZzg = this.zza.zzg();
        zzhkx.zzb(weakReferenceZzg);
        return weakReferenceZzg;
    }
}
