package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.2.0 */
/* loaded from: classes2.dex */
public enum zzhfl implements zzhbs {
    USER_POPULATION_UNSPECIFIED(0),
    CARTER_SB_CHROME_INTERSTITIAL(1),
    GMAIL_PHISHY_JOURNEY(2),
    DOWNLOAD_RELATED_POPULATION_MIN(1000),
    RISKY_DOWNLOADER(1001),
    INFREQUENT_DOWNLOADER(1002),
    REGULAR_DOWNLOADER(PointerIconCompat.TYPE_HELP),
    BOTLIKE_DOWNLOADER(1004),
    DOCUMENT_DOWNLOADER(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT),
    HIGHLY_TECHNICAL_DOWNLOADER(PointerIconCompat.TYPE_CELL),
    LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(PointerIconCompat.TYPE_CROSSHAIR),
    HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(PointerIconCompat.TYPE_TEXT),
    SPAM_PING_SENDER(PointerIconCompat.TYPE_VERTICAL_TEXT),
    RFA_TRUSTED(PointerIconCompat.TYPE_ALIAS),
    DOWNLOAD_RELATED_POPULATION_MAX(1999);

    private static final zzhbt zzp = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhfj
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i) {
            return zzhfl.zzc(i);
        }
    };
    private final int zzr;

    zzhfl(int i) {
        this.zzr = i;
    }

    public static zzhbu zzb() {
        return zzhfk.zza;
    }

    public static zzhfl zzc(int i) {
        if (i == 0) {
            return USER_POPULATION_UNSPECIFIED;
        }
        if (i == 1) {
            return CARTER_SB_CHROME_INTERSTITIAL;
        }
        if (i == 2) {
            return GMAIL_PHISHY_JOURNEY;
        }
        if (i == 1999) {
            return DOWNLOAD_RELATED_POPULATION_MAX;
        }
        switch (i) {
            case 1000:
                return DOWNLOAD_RELATED_POPULATION_MIN;
            case 1001:
                return RISKY_DOWNLOADER;
            case 1002:
                return INFREQUENT_DOWNLOADER;
            case PointerIconCompat.TYPE_HELP /* 1003 */:
                return REGULAR_DOWNLOADER;
            case 1004:
                return BOTLIKE_DOWNLOADER;
            case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT /* 1005 */:
                return DOCUMENT_DOWNLOADER;
            case PointerIconCompat.TYPE_CELL /* 1006 */:
                return HIGHLY_TECHNICAL_DOWNLOADER;
            case PointerIconCompat.TYPE_CROSSHAIR /* 1007 */:
                return LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case PointerIconCompat.TYPE_TEXT /* 1008 */:
                return HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                return SPAM_PING_SENDER;
            case PointerIconCompat.TYPE_ALIAS /* 1010 */:
                return RFA_TRUSTED;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzr;
    }
}
