package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativestripesdk/utils/ConfirmPaymentErrorType;", "", "<init>", "(Ljava/lang/String;I)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmPaymentErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConfirmPaymentErrorType[] $VALUES;
    public static final ConfirmPaymentErrorType Failed = new ConfirmPaymentErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 0);
    public static final ConfirmPaymentErrorType Canceled = new ConfirmPaymentErrorType("Canceled", 1);
    public static final ConfirmPaymentErrorType Unknown = new ConfirmPaymentErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 2);

    private static final /* synthetic */ ConfirmPaymentErrorType[] $values() {
        return new ConfirmPaymentErrorType[]{Failed, Canceled, Unknown};
    }

    public static EnumEntries<ConfirmPaymentErrorType> getEntries() {
        return $ENTRIES;
    }

    private ConfirmPaymentErrorType(String str, int i) {
    }

    static {
        ConfirmPaymentErrorType[] confirmPaymentErrorTypeArr$values = $values();
        $VALUES = confirmPaymentErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(confirmPaymentErrorTypeArr$values);
    }

    public static ConfirmPaymentErrorType valueOf(String str) {
        return (ConfirmPaymentErrorType) Enum.valueOf(ConfirmPaymentErrorType.class, str);
    }

    public static ConfirmPaymentErrorType[] values() {
        return (ConfirmPaymentErrorType[]) $VALUES.clone();
    }
}
