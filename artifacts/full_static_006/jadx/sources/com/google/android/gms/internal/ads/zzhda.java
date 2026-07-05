package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhda {
    private static final zzhcz zza;
    private static final zzhcz zzb;

    static {
        zzhcz zzhczVar;
        try {
            zzhczVar = (zzhcz) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhczVar = null;
        }
        zza = zzhczVar;
        zzb = new zzhcz();
    }

    static zzhcz zza() {
        return zza;
    }

    static zzhcz zzb() {
        return zzb;
    }
}
