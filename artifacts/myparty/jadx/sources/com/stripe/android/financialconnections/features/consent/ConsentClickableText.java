package com.stripe.android.financialconnections.features.consent;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConsentState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/features/consent/ConsentClickableText;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", "LEGAL_DETAILS", "MANUAL_ENTRY", "LINK_LOGIN_WARMUP", "LINK_ACCOUNT_PICKER", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsentClickableText {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConsentClickableText[] $VALUES;
    private final String value;
    public static final ConsentClickableText DATA = new ConsentClickableText("DATA", 0, "stripe://data-access-notice");
    public static final ConsentClickableText LEGAL_DETAILS = new ConsentClickableText("LEGAL_DETAILS", 1, "stripe://legal-details-notice");
    public static final ConsentClickableText MANUAL_ENTRY = new ConsentClickableText("MANUAL_ENTRY", 2, "stripe://manual-entry");
    public static final ConsentClickableText LINK_LOGIN_WARMUP = new ConsentClickableText("LINK_LOGIN_WARMUP", 3, "stripe://link-login");
    public static final ConsentClickableText LINK_ACCOUNT_PICKER = new ConsentClickableText("LINK_ACCOUNT_PICKER", 4, "stripe://link-account-picker");

    private static final /* synthetic */ ConsentClickableText[] $values() {
        return new ConsentClickableText[]{DATA, LEGAL_DETAILS, MANUAL_ENTRY, LINK_LOGIN_WARMUP, LINK_ACCOUNT_PICKER};
    }

    public static EnumEntries<ConsentClickableText> getEntries() {
        return $ENTRIES;
    }

    private ConsentClickableText(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        ConsentClickableText[] consentClickableTextArr$values = $values();
        $VALUES = consentClickableTextArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(consentClickableTextArr$values);
    }

    public static ConsentClickableText valueOf(String str) {
        return (ConsentClickableText) Enum.valueOf(ConsentClickableText.class, str);
    }

    public static ConsentClickableText[] values() {
        return (ConsentClickableText[]) $VALUES.clone();
    }
}
