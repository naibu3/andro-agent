package com.google.android.gms.internal.ads;

import androidx.room.RoomDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzazw implements zzhbs {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(RoomDatabase.MAX_BIND_PARAMETER_CNT);

    private static final zzhbt zzh = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzazv
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            zzazw zzazwVar = zzazw.UNSUPPORTED;
            if (i == 0) {
                return zzazw.UNSUPPORTED;
            }
            if (i == 2) {
                return zzazw.ARM7;
            }
            if (i == 999) {
                return zzazw.UNKNOWN;
            }
            if (i == 4) {
                return zzazw.X86;
            }
            if (i == 5) {
                return zzazw.ARM64;
            }
            if (i == 6) {
                return zzazw.X86_64;
            }
            if (i != 7) {
                return null;
            }
            return zzazw.RISCV64;
        }
    };
    private final int zzj;

    zzazw(int i) {
        this.zzj = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzj;
    }
}
