package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BacsMandateButtonType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Secondary", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BacsMandateButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BacsMandateButtonType[] $VALUES;
    public static final BacsMandateButtonType Primary = new BacsMandateButtonType("Primary", 0);
    public static final BacsMandateButtonType Secondary = new BacsMandateButtonType("Secondary", 1);

    private static final /* synthetic */ BacsMandateButtonType[] $values() {
        return new BacsMandateButtonType[]{Primary, Secondary};
    }

    public static EnumEntries<BacsMandateButtonType> getEntries() {
        return $ENTRIES;
    }

    private BacsMandateButtonType(String str, int i) {
    }

    static {
        BacsMandateButtonType[] bacsMandateButtonTypeArr$values = $values();
        $VALUES = bacsMandateButtonTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bacsMandateButtonTypeArr$values);
    }

    public static BacsMandateButtonType valueOf(String str) {
        return (BacsMandateButtonType) Enum.valueOf(BacsMandateButtonType.class, str);
    }

    public static BacsMandateButtonType[] values() {
        return (BacsMandateButtonType[]) $VALUES.clone();
    }
}
