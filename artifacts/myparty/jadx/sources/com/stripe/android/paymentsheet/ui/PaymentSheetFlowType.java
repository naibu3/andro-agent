package com.stripe.android.paymentsheet.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PaymentSheetFlowType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PaymentSheetFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "Complete", TypedValues.Custom.NAME, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetFlowType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PaymentSheetFlowType[] $VALUES;
    public static final PaymentSheetFlowType Complete = new PaymentSheetFlowType("Complete", 0);
    public static final PaymentSheetFlowType Custom = new PaymentSheetFlowType(TypedValues.Custom.NAME, 1);

    private static final /* synthetic */ PaymentSheetFlowType[] $values() {
        return new PaymentSheetFlowType[]{Complete, Custom};
    }

    public static EnumEntries<PaymentSheetFlowType> getEntries() {
        return $ENTRIES;
    }

    private PaymentSheetFlowType(String str, int i) {
    }

    static {
        PaymentSheetFlowType[] paymentSheetFlowTypeArr$values = $values();
        $VALUES = paymentSheetFlowTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(paymentSheetFlowTypeArr$values);
    }

    public static PaymentSheetFlowType valueOf(String str) {
        return (PaymentSheetFlowType) Enum.valueOf(PaymentSheetFlowType.class, str);
    }

    public static PaymentSheetFlowType[] values() {
        return (PaymentSheetFlowType[]) $VALUES.clone();
    }
}
