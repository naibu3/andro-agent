package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzhhp implements zzhbs {
    SAFE_OR_OTHER(0),
    MALWARE(1),
    PHISHING(2),
    UNWANTED(3),
    BILLING(4);

    private static final zzhbt zzf = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhhn
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            return zzhhp.zzb(i);
        }
    };
    private final int zzh;

    zzhhp(int i) {
        this.zzh = i;
    }

    public static zzhhp zzb(int i) {
        if (i == 0) {
            return SAFE_OR_OTHER;
        }
        if (i == 1) {
            return MALWARE;
        }
        if (i == 2) {
            return PHISHING;
        }
        if (i == 3) {
            return UNWANTED;
        }
        if (i != 4) {
            return null;
        }
        return BILLING;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzh;
    }
}
