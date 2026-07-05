package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzatc implements zzhbs {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);

    private static final zzhbt zzd = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzata
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            return zzatc.zzb(i);
        }
    };
    private final int zzf;

    zzatc(int i) {
        this.zzf = i;
    }

    public static zzatc zzb(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return DISABLED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzf;
    }
}
