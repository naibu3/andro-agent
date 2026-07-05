package com.stripe.android.link.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/link/model/AccountStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Verified", "NeedsVerification", "VerificationStarted", "SignedOut", "Error", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountStatus[] $VALUES;
    public static final AccountStatus Verified = new AccountStatus("Verified", 0);
    public static final AccountStatus NeedsVerification = new AccountStatus("NeedsVerification", 1);
    public static final AccountStatus VerificationStarted = new AccountStatus("VerificationStarted", 2);
    public static final AccountStatus SignedOut = new AccountStatus("SignedOut", 3);
    public static final AccountStatus Error = new AccountStatus("Error", 4);

    private static final /* synthetic */ AccountStatus[] $values() {
        return new AccountStatus[]{Verified, NeedsVerification, VerificationStarted, SignedOut, Error};
    }

    public static EnumEntries<AccountStatus> getEntries() {
        return $ENTRIES;
    }

    private AccountStatus(String str, int i) {
    }

    static {
        AccountStatus[] accountStatusArr$values = $values();
        $VALUES = accountStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(accountStatusArr$values);
    }

    public static AccountStatus valueOf(String str) {
        return (AccountStatus) Enum.valueOf(AccountStatus.class, str);
    }

    public static AccountStatus[] values() {
        return (AccountStatus[]) $VALUES.clone();
    }
}
