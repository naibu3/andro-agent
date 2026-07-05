package com.stripe.android.payments.financialconnections;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FinancialConnectionsAvailability.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "", "<init>", "(Ljava/lang/String;I)V", "Full", "Lite", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FinancialConnectionsAvailability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsAvailability[] $VALUES;
    public static final FinancialConnectionsAvailability Full = new FinancialConnectionsAvailability("Full", 0);
    public static final FinancialConnectionsAvailability Lite = new FinancialConnectionsAvailability("Lite", 1);

    private static final /* synthetic */ FinancialConnectionsAvailability[] $values() {
        return new FinancialConnectionsAvailability[]{Full, Lite};
    }

    public static EnumEntries<FinancialConnectionsAvailability> getEntries() {
        return $ENTRIES;
    }

    private FinancialConnectionsAvailability(String str, int i) {
    }

    static {
        FinancialConnectionsAvailability[] financialConnectionsAvailabilityArr$values = $values();
        $VALUES = financialConnectionsAvailabilityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(financialConnectionsAvailabilityArr$values);
    }

    public static FinancialConnectionsAvailability valueOf(String str) {
        return (FinancialConnectionsAvailability) Enum.valueOf(FinancialConnectionsAvailability.class, str);
    }

    public static FinancialConnectionsAvailability[] values() {
        return (FinancialConnectionsAvailability[]) $VALUES.clone();
    }
}
