package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/features/common/AccountSelectionState;", "", "alpha", "", "<init>", "(Ljava/lang/String;IF)V", "getAlpha", "()F", "Enabled", "Disabled", "VisuallyDisabled", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class AccountSelectionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountSelectionState[] $VALUES;
    private final float alpha;
    public static final AccountSelectionState Enabled = new AccountSelectionState("Enabled", 0, 1.0f);
    public static final AccountSelectionState Disabled = new AccountSelectionState("Disabled", 1, 0.6f);
    public static final AccountSelectionState VisuallyDisabled = new AccountSelectionState("VisuallyDisabled", 2, 0.6f);

    private static final /* synthetic */ AccountSelectionState[] $values() {
        return new AccountSelectionState[]{Enabled, Disabled, VisuallyDisabled};
    }

    public static EnumEntries<AccountSelectionState> getEntries() {
        return $ENTRIES;
    }

    private AccountSelectionState(String str, int i, float f) {
        this.alpha = f;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    static {
        AccountSelectionState[] accountSelectionStateArr$values = $values();
        $VALUES = accountSelectionStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(accountSelectionStateArr$values);
    }

    public static AccountSelectionState valueOf(String str) {
        return (AccountSelectionState) Enum.valueOf(AccountSelectionState.class, str);
    }

    public static AccountSelectionState[] values() {
        return (AccountSelectionState[]) $VALUES.clone();
    }
}
