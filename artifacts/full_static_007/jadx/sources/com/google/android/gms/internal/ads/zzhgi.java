package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzhgi implements zzhbs {
    UNKNOWN_USER_POPULATION(0),
    SAFE_BROWSING(1),
    EXTENDED_REPORTING(2),
    ENHANCED_PROTECTION(3);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhgg
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            return zzhgi.zzb(i);
        }
    };
    private final int zzg;

    zzhgi(int i) {
        this.zzg = i;
    }

    public static zzhgi zzb(int i) {
        if (i == 0) {
            return UNKNOWN_USER_POPULATION;
        }
        if (i == 1) {
            return SAFE_BROWSING;
        }
        if (i == 2) {
            return EXTENDED_REPORTING;
        }
        if (i != 3) {
            return null;
        }
        return ENHANCED_PROTECTION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzg;
    }
}
