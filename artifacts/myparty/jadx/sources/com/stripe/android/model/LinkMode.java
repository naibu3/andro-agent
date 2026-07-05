package com.stripe.android.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkMode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/LinkMode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Passthrough", "LinkPaymentMethod", "LinkCardBrand", "expectedPaymentMethodType", "getExpectedPaymentMethodType", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkMode[] $VALUES;
    private final String value;
    public static final LinkMode Passthrough = new LinkMode("Passthrough", 0, "PASSTHROUGH");
    public static final LinkMode LinkPaymentMethod = new LinkMode("LinkPaymentMethod", 1, "LINK_PAYMENT_METHOD");
    public static final LinkMode LinkCardBrand = new LinkMode("LinkCardBrand", 2, "LINK_CARD_BRAND");

    private static final /* synthetic */ LinkMode[] $values() {
        return new LinkMode[]{Passthrough, LinkPaymentMethod, LinkCardBrand};
    }

    public static EnumEntries<LinkMode> getEntries() {
        return $ENTRIES;
    }

    private LinkMode(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        LinkMode[] linkModeArr$values = $values();
        $VALUES = linkModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(linkModeArr$values);
    }

    public final String getExpectedPaymentMethodType() {
        return this == LinkCardBrand ? "card" : "bank_account";
    }

    public static LinkMode valueOf(String str) {
        return (LinkMode) Enum.valueOf(LinkMode.class, str);
    }

    public static LinkMode[] values() {
        return (LinkMode[]) $VALUES.clone();
    }
}
