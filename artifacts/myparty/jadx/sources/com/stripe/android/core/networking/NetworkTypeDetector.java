package com.stripe.android.core.networking;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkTypeDetector.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\nH\u0086\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/core/networking/NetworkTypeDetector;", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "<init>", "(Landroid/net/ConnectivityManager;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "", "determineMobileNetworkType", "Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;", "subtype", "", "NetworkType", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkTypeDetector {
    private final ConnectivityManager connectivityManager;

    private NetworkTypeDetector(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkTypeDetector(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this((ConnectivityManager) systemService);
    }

    public final String invoke() {
        NetworkType networkTypeDetermineMobileNetworkType;
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            networkTypeDetermineMobileNetworkType = determineMobileNetworkType(activeNetworkInfo.getSubtype());
        } else if (type == 1) {
            networkTypeDetermineMobileNetworkType = NetworkType.WiFi;
        } else {
            networkTypeDetermineMobileNetworkType = NetworkType.Unknown;
        }
        return networkTypeDetermineMobileNetworkType.getValue();
    }

    private final NetworkType determineMobileNetworkType(int subtype) {
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkType.Mobile2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.Mobile3G;
            case 13:
            case 18:
            case 19:
                return NetworkType.Mobile4G;
            case 20:
                return NetworkType.Mobile5G;
            default:
                return NetworkType.Unknown;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkTypeDetector.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/core/networking/NetworkTypeDetector$NetworkType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WiFi", "Mobile2G", "Mobile3G", "Mobile4G", "Mobile5G", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class NetworkType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NetworkType[] $VALUES;
        private final String value;
        public static final NetworkType WiFi = new NetworkType("WiFi", 0, "Wi-Fi");
        public static final NetworkType Mobile2G = new NetworkType("Mobile2G", 1, "2G");
        public static final NetworkType Mobile3G = new NetworkType("Mobile3G", 2, "3G");
        public static final NetworkType Mobile4G = new NetworkType("Mobile4G", 3, "4G");
        public static final NetworkType Mobile5G = new NetworkType("Mobile5G", 4, "5G");
        public static final NetworkType Unknown = new NetworkType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 5, "unknown");

        private static final /* synthetic */ NetworkType[] $values() {
            return new NetworkType[]{WiFi, Mobile2G, Mobile3G, Mobile4G, Mobile5G, Unknown};
        }

        public static EnumEntries<NetworkType> getEntries() {
            return $ENTRIES;
        }

        private NetworkType(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            NetworkType[] networkTypeArr$values = $values();
            $VALUES = networkTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(networkTypeArr$values);
        }

        public static NetworkType valueOf(String str) {
            return (NetworkType) Enum.valueOf(NetworkType.class, str);
        }

        public static NetworkType[] values() {
            return (NetworkType[]) $VALUES.clone();
        }
    }
}
