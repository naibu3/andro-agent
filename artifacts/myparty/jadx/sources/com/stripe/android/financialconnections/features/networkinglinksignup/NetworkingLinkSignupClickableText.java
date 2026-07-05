package com.stripe.android.financialconnections.features.networkinglinksignup;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkingLinkSignupViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupClickableText;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LEGAL_DETAILS", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class NetworkingLinkSignupClickableText {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkingLinkSignupClickableText[] $VALUES;
    public static final NetworkingLinkSignupClickableText LEGAL_DETAILS = new NetworkingLinkSignupClickableText("LEGAL_DETAILS", 0, "stripe://legal-details-notice");
    private final String value;

    private static final /* synthetic */ NetworkingLinkSignupClickableText[] $values() {
        return new NetworkingLinkSignupClickableText[]{LEGAL_DETAILS};
    }

    public static EnumEntries<NetworkingLinkSignupClickableText> getEntries() {
        return $ENTRIES;
    }

    private NetworkingLinkSignupClickableText(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        NetworkingLinkSignupClickableText[] networkingLinkSignupClickableTextArr$values = $values();
        $VALUES = networkingLinkSignupClickableTextArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(networkingLinkSignupClickableTextArr$values);
    }

    public static NetworkingLinkSignupClickableText valueOf(String str) {
        return (NetworkingLinkSignupClickableText) Enum.valueOf(NetworkingLinkSignupClickableText.class, str);
    }

    public static NetworkingLinkSignupClickableText[] values() {
        return (NetworkingLinkSignupClickableText[]) $VALUES.clone();
    }
}
