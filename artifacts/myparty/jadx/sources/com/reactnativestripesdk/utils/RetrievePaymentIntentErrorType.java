package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/reactnativestripesdk/utils/RetrievePaymentIntentErrorType;", "", "<init>", "(Ljava/lang/String;I)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RetrievePaymentIntentErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RetrievePaymentIntentErrorType[] $VALUES;
    public static final RetrievePaymentIntentErrorType Unknown = new RetrievePaymentIntentErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 0);

    private static final /* synthetic */ RetrievePaymentIntentErrorType[] $values() {
        return new RetrievePaymentIntentErrorType[]{Unknown};
    }

    public static EnumEntries<RetrievePaymentIntentErrorType> getEntries() {
        return $ENTRIES;
    }

    private RetrievePaymentIntentErrorType(String str, int i) {
    }

    static {
        RetrievePaymentIntentErrorType[] retrievePaymentIntentErrorTypeArr$values = $values();
        $VALUES = retrievePaymentIntentErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(retrievePaymentIntentErrorTypeArr$values);
    }

    public static RetrievePaymentIntentErrorType valueOf(String str) {
        return (RetrievePaymentIntentErrorType) Enum.valueOf(RetrievePaymentIntentErrorType.class, str);
    }

    public static RetrievePaymentIntentErrorType[] values() {
        return (RetrievePaymentIntentErrorType[]) $VALUES.clone();
    }
}
