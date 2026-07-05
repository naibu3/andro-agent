package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzfmy implements zzhbs {
    ORIENTATION_UNKNOWN(0),
    ORIENTATION_PORTRAIT(1),
    ORIENTATION_LANDSCAPE(2),
    UNRECOGNIZED(-1);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfmx
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            zzfmy zzfmyVar = zzfmy.ORIENTATION_UNKNOWN;
            if (i == 0) {
                return zzfmy.ORIENTATION_UNKNOWN;
            }
            if (i == 1) {
                return zzfmy.ORIENTATION_PORTRAIT;
            }
            if (i != 2) {
                return null;
            }
            return zzfmy.ORIENTATION_LANDSCAPE;
        }
    };
    private final int zzg;

    zzfmy(int i) {
        this.zzg = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzg;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
