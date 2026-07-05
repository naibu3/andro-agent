package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.2.0 */
/* loaded from: classes2.dex */
final class zzhbb {
    private static final zzhaz zza = new zzhba();
    private static final zzhaz zzb;

    static {
        zzhaz zzhazVar;
        try {
            zzhazVar = (zzhaz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzhazVar = null;
        }
        zzb = zzhazVar;
    }

    static zzhaz zza() {
        zzhaz zzhazVar = zzb;
        if (zzhazVar != null) {
            return zzhazVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzhaz zzb() {
        return zza;
    }
}
