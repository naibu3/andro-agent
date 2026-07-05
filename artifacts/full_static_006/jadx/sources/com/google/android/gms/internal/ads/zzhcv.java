package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhcv implements zzhdc {
    private final zzhdc[] zza;

    zzhcv(zzhdc... zzhdcVarArr) {
        this.zza = zzhdcVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final zzhdb zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzhdc zzhdcVar = this.zza[i];
            if (zzhdcVar.zzc(cls)) {
                return zzhdcVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
