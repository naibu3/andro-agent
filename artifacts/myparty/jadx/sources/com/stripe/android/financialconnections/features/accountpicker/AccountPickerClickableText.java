package com.stripe.android.financialconnections.features.accountpicker;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerClickableText;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountPickerClickableText {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountPickerClickableText[] $VALUES;
    public static final AccountPickerClickableText DATA = new AccountPickerClickableText("DATA", 0, "stripe://data-access-notice");
    private final String value;

    private static final /* synthetic */ AccountPickerClickableText[] $values() {
        return new AccountPickerClickableText[]{DATA};
    }

    public static EnumEntries<AccountPickerClickableText> getEntries() {
        return $ENTRIES;
    }

    private AccountPickerClickableText(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        AccountPickerClickableText[] accountPickerClickableTextArr$values = $values();
        $VALUES = accountPickerClickableTextArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(accountPickerClickableTextArr$values);
    }

    public static AccountPickerClickableText valueOf(String str) {
        return (AccountPickerClickableText) Enum.valueOf(AccountPickerClickableText.class, str);
    }

    public static AccountPickerClickableText[] values() {
        return (AccountPickerClickableText[]) $VALUES.clone();
    }
}
