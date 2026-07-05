package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhdl {
    private static final zzhdk zza;
    private static final zzhdk zzb;

    static {
        zzhdk zzhdkVar;
        try {
            zzhdkVar = (zzhdk) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhdkVar = null;
        }
        zza = zzhdkVar;
        zzb = new zzhdk();
    }

    static zzhdk zza() {
        return zza;
    }

    static zzhdk zzb() {
        return zzb;
    }
}
