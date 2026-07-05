package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
final class zzgba extends zzfzc {
    private final zzgbc zza;

    zzgba(zzgbc zzgbcVar, int i) {
        super(zzgbcVar.size(), i);
        this.zza = zzgbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
