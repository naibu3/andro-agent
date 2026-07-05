package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzfna implements zzhbs {
    OS_UNKNOWN(0),
    OS_ANDROID(1),
    OS_IOS(2),
    UNRECOGNIZED(-1);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfmz
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            zzfna zzfnaVar = zzfna.OS_UNKNOWN;
            if (i == 0) {
                return zzfna.OS_UNKNOWN;
            }
            if (i == 1) {
                return zzfna.OS_ANDROID;
            }
            if (i != 2) {
                return null;
            }
            return zzfna.OS_IOS;
        }
    };
    private final int zzg;

    zzfna(int i) {
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
