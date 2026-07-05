package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativestripesdk/utils/GooglePayErrorType;", "", "<init>", "(Ljava/lang/String;I)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GooglePayErrorType[] $VALUES;
    public static final GooglePayErrorType Failed = new GooglePayErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 0);
    public static final GooglePayErrorType Canceled = new GooglePayErrorType("Canceled", 1);

    private static final /* synthetic */ GooglePayErrorType[] $values() {
        return new GooglePayErrorType[]{Failed, Canceled};
    }

    public static EnumEntries<GooglePayErrorType> getEntries() {
        return $ENTRIES;
    }

    private GooglePayErrorType(String str, int i) {
    }

    static {
        GooglePayErrorType[] googlePayErrorTypeArr$values = $values();
        $VALUES = googlePayErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(googlePayErrorTypeArr$values);
    }

    public static GooglePayErrorType valueOf(String str) {
        return (GooglePayErrorType) Enum.valueOf(GooglePayErrorType.class, str);
    }

    public static GooglePayErrorType[] values() {
        return (GooglePayErrorType[]) $VALUES.clone();
    }
}
