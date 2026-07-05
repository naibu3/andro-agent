package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhbh implements zzhdc {
    private static final zzhbh zza = new zzhbh();

    private zzhbh() {
    }

    public static zzhbh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final zzhdb zzb(Class cls) {
        if (!zzhbo.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzhdb) zzhbo.zzbh(cls.asSubclass(zzhbo.class)).zzbN();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final boolean zzc(Class cls) {
        return zzhbo.class.isAssignableFrom(cls);
    }
}
