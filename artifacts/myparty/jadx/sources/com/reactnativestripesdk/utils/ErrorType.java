package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativestripesdk/utils/ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType Failed = new ErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 0);
    public static final ErrorType Canceled = new ErrorType("Canceled", 1);
    public static final ErrorType Unknown = new ErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 2);

    private static final /* synthetic */ ErrorType[] $values() {
        return new ErrorType[]{Failed, Canceled, Unknown};
    }

    public static EnumEntries<ErrorType> getEntries() {
        return $ENTRIES;
    }

    private ErrorType(String str, int i) {
    }

    static {
        ErrorType[] errorTypeArr$values = $values();
        $VALUES = errorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(errorTypeArr$values);
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
