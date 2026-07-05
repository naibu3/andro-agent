package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzfne implements zzhbs {
    TAG_UNKNOWN(0),
    UNRECOGNIZED(-1);

    private static final zzhbt zzc = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfnd
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            return zzfne.zzb(i);
        }
    };
    private final int zze;

    zzfne(int i) {
        this.zze = i;
    }

    public static zzfne zzb(int i) {
        if (i != 0) {
            return null;
        }
        return TAG_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zze;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
