package com.stripe.android.financialconnections.launcher;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FinancialConnectionsSheetFlowType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "ForData", "ForInstantDebits", "ForToken", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetFlowType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FinancialConnectionsSheetFlowType[] $VALUES;
    public static final FinancialConnectionsSheetFlowType ForData = new FinancialConnectionsSheetFlowType("ForData", 0);
    public static final FinancialConnectionsSheetFlowType ForInstantDebits = new FinancialConnectionsSheetFlowType("ForInstantDebits", 1);
    public static final FinancialConnectionsSheetFlowType ForToken = new FinancialConnectionsSheetFlowType("ForToken", 2);

    private static final /* synthetic */ FinancialConnectionsSheetFlowType[] $values() {
        return new FinancialConnectionsSheetFlowType[]{ForData, ForInstantDebits, ForToken};
    }

    public static EnumEntries<FinancialConnectionsSheetFlowType> getEntries() {
        return $ENTRIES;
    }

    private FinancialConnectionsSheetFlowType(String str, int i) {
    }

    static {
        FinancialConnectionsSheetFlowType[] financialConnectionsSheetFlowTypeArr$values = $values();
        $VALUES = financialConnectionsSheetFlowTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(financialConnectionsSheetFlowTypeArr$values);
    }

    public static FinancialConnectionsSheetFlowType valueOf(String str) {
        return (FinancialConnectionsSheetFlowType) Enum.valueOf(FinancialConnectionsSheetFlowType.class, str);
    }

    public static FinancialConnectionsSheetFlowType[] values() {
        return (FinancialConnectionsSheetFlowType[]) $VALUES.clone();
    }
}
