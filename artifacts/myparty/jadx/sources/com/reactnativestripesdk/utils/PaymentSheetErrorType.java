package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativestripesdk/utils/PaymentSheetErrorType;", "", "<init>", "(Ljava/lang/String;I)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", "Timeout", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentSheetErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentSheetErrorType[] $VALUES;
    public static final PaymentSheetErrorType Failed = new PaymentSheetErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 0);
    public static final PaymentSheetErrorType Canceled = new PaymentSheetErrorType("Canceled", 1);
    public static final PaymentSheetErrorType Timeout = new PaymentSheetErrorType("Timeout", 2);

    private static final /* synthetic */ PaymentSheetErrorType[] $values() {
        return new PaymentSheetErrorType[]{Failed, Canceled, Timeout};
    }

    public static EnumEntries<PaymentSheetErrorType> getEntries() {
        return $ENTRIES;
    }

    private PaymentSheetErrorType(String str, int i) {
    }

    static {
        PaymentSheetErrorType[] paymentSheetErrorTypeArr$values = $values();
        $VALUES = paymentSheetErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(paymentSheetErrorTypeArr$values);
    }

    public static PaymentSheetErrorType valueOf(String str) {
        return (PaymentSheetErrorType) Enum.valueOf(PaymentSheetErrorType.class, str);
    }

    public static PaymentSheetErrorType[] values() {
        return (PaymentSheetErrorType[]) $VALUES.clone();
    }
}
