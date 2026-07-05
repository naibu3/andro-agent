package com.reactnativestripesdk.utils;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Errors.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/reactnativestripesdk/utils/ConfirmSetupIntentErrorType;", "", "<init>", "(Ljava/lang/String;I)V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmSetupIntentErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConfirmSetupIntentErrorType[] $VALUES;
    public static final ConfirmSetupIntentErrorType Failed = new ConfirmSetupIntentErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 0);
    public static final ConfirmSetupIntentErrorType Canceled = new ConfirmSetupIntentErrorType("Canceled", 1);
    public static final ConfirmSetupIntentErrorType Unknown = new ConfirmSetupIntentErrorType(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 2);

    private static final /* synthetic */ ConfirmSetupIntentErrorType[] $values() {
        return new ConfirmSetupIntentErrorType[]{Failed, Canceled, Unknown};
    }

    public static EnumEntries<ConfirmSetupIntentErrorType> getEntries() {
        return $ENTRIES;
    }

    private ConfirmSetupIntentErrorType(String str, int i) {
    }

    static {
        ConfirmSetupIntentErrorType[] confirmSetupIntentErrorTypeArr$values = $values();
        $VALUES = confirmSetupIntentErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(confirmSetupIntentErrorTypeArr$values);
    }

    public static ConfirmSetupIntentErrorType valueOf(String str) {
        return (ConfirmSetupIntentErrorType) Enum.valueOf(ConfirmSetupIntentErrorType.class, str);
    }

    public static ConfirmSetupIntentErrorType[] values() {
        return (ConfirmSetupIntentErrorType[]) $VALUES.clone();
    }
}
