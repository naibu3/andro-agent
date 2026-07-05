package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public final class zzhkq implements zzhkp, zzhkj {
    private static final zzhkq zza = new zzhkq(null);
    private final Object zzb;

    private zzhkq(Object obj) {
        this.zzb = obj;
    }

    public static zzhkp zza(Object obj) {
        zzhkx.zza(obj, "instance cannot be null");
        return new zzhkq(obj);
    }

    public static zzhkp zzc(Object obj) {
        return obj == null ? zza : new zzhkq(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final Object zzb() {
        return this.zzb;
    }
}
