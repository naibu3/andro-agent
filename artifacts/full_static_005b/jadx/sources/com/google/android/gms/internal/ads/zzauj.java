package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzauj implements zzhbs {
    ERROR_ENCODE_SIZE_FAIL(1),
    ERROR_UNKNOWN(3),
    ERROR_NO_SIGNALS(5),
    ERROR_ENCRYPTION(7),
    ERROR_MEMORY(9),
    ERROR_SIMULATOR(11),
    ERROR_SERVICE(13),
    ERROR_THREAD(15),
    ERROR_COLLECTION_TIMEOUT(17),
    PSN_WEB64_FAIL(2),
    PSN_DECRYPT_SIZE_FAIL(4),
    PSN_MD5_CHECK_FAIL(8),
    PSN_MD5_SIZE_FAIL(16),
    PSN_MD5_FAIL(32),
    PSN_DECODE_FAIL(64),
    PSN_SALT_FAIL(128),
    PSN_BITSLICER_FAIL(256),
    PSN_REQUEST_TYPE_FAIL(512),
    PSN_INVALID_ERROR_CODE(1024),
    PSN_TIMESTAMP_EXPIRED(2048),
    PSN_ENCODE_SIZE_FAIL(4096),
    PSN_BLANK_VALUE(8192),
    PSN_INITIALIZATION_FAIL(16384),
    PSN_GASS_CLIENT_FAIL(32768),
    PSN_SIGNALS_TIMEOUT(65536),
    PSN_TINK_FAIL(131072);

    private static final zzhbt zzA = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzaui
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            zzauj zzaujVar = zzauj.ERROR_ENCODE_SIZE_FAIL;
            if (i == 1) {
                return zzauj.ERROR_ENCODE_SIZE_FAIL;
            }
            if (i == 2) {
                return zzauj.PSN_WEB64_FAIL;
            }
            if (i == 3) {
                return zzauj.ERROR_UNKNOWN;
            }
            if (i == 4) {
                return zzauj.PSN_DECRYPT_SIZE_FAIL;
            }
            if (i == 5) {
                return zzauj.ERROR_NO_SIGNALS;
            }
            if (i == 7) {
                return zzauj.ERROR_ENCRYPTION;
            }
            if (i == 8) {
                return zzauj.PSN_MD5_CHECK_FAIL;
            }
            if (i == 9) {
                return zzauj.ERROR_MEMORY;
            }
            switch (i) {
                case 11:
                    return zzauj.ERROR_SIMULATOR;
                case 13:
                    return zzauj.ERROR_SERVICE;
                case 32:
                    return zzauj.PSN_MD5_FAIL;
                case 64:
                    return zzauj.PSN_DECODE_FAIL;
                case 128:
                    return zzauj.PSN_SALT_FAIL;
                case 256:
                    return zzauj.PSN_BITSLICER_FAIL;
                case 512:
                    return zzauj.PSN_REQUEST_TYPE_FAIL;
                case 1024:
                    return zzauj.PSN_INVALID_ERROR_CODE;
                case 2048:
                    return zzauj.PSN_TIMESTAMP_EXPIRED;
                case 4096:
                    return zzauj.PSN_ENCODE_SIZE_FAIL;
                case 8192:
                    return zzauj.PSN_BLANK_VALUE;
                case 16384:
                    return zzauj.PSN_INITIALIZATION_FAIL;
                case 32768:
                    return zzauj.PSN_GASS_CLIENT_FAIL;
                case 65536:
                    return zzauj.PSN_SIGNALS_TIMEOUT;
                case 131072:
                    return zzauj.PSN_TINK_FAIL;
                default:
                    switch (i) {
                        case 15:
                            return zzauj.ERROR_THREAD;
                        case 16:
                            return zzauj.PSN_MD5_SIZE_FAIL;
                        case 17:
                            return zzauj.ERROR_COLLECTION_TIMEOUT;
                        default:
                            return null;
                    }
            }
        }
    };
    private final int zzC;

    zzauj(int i) {
        this.zzC = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzC;
    }
}
