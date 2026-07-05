package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzaua implements zzhbs {
    FUNCTION_UNSPECIFIED(0),
    FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS(1),
    FUNCTION_METHOD_SETIMPLEMENTATIONS(2),
    FUNCTION_CLASS_ADDMETHOD(3),
    FUNCTION_CLASS_REPLACEMETHOD(4);

    private static final zzhbt zzf = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzaty
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            return zzaua.zzb(i);
        }
    };
    private final int zzh;

    zzaua(int i) {
        this.zzh = i;
    }

    public static zzaua zzb(int i) {
        if (i == 0) {
            return FUNCTION_UNSPECIFIED;
        }
        if (i == 1) {
            return FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS;
        }
        if (i == 2) {
            return FUNCTION_METHOD_SETIMPLEMENTATIONS;
        }
        if (i == 3) {
            return FUNCTION_CLASS_ADDMETHOD;
        }
        if (i != 4) {
            return null;
        }
        return FUNCTION_CLASS_REPLACEMETHOD;
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
