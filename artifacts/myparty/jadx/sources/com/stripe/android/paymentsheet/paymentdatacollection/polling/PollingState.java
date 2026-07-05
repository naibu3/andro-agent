package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PollingViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "", "<init>", "(Ljava/lang/String;I)V", "Active", "Success", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PollingState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PollingState[] $VALUES;
    public static final PollingState Active = new PollingState("Active", 0);
    public static final PollingState Success = new PollingState("Success", 1);
    public static final PollingState Failed = new PollingState(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 2);
    public static final PollingState Canceled = new PollingState("Canceled", 3);

    private static final /* synthetic */ PollingState[] $values() {
        return new PollingState[]{Active, Success, Failed, Canceled};
    }

    public static EnumEntries<PollingState> getEntries() {
        return $ENTRIES;
    }

    private PollingState(String str, int i) {
    }

    static {
        PollingState[] pollingStateArr$values = $values();
        $VALUES = pollingStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pollingStateArr$values);
    }

    public static PollingState valueOf(String str) {
        return (PollingState) Enum.valueOf(PollingState.class, str);
    }

    public static PollingState[] values() {
        return (PollingState[]) $VALUES.clone();
    }
}
