package com.stripe.android.link.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkTerms.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/link/ui/LinkTermsType;", "", "<init>", "(Ljava/lang/String;I)V", "InlineOptionalWithPhoneFirst", "InlineOptional", "Inline", "InlineWithDefaultOptIn", "Full", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkTermsType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkTermsType[] $VALUES;
    public static final LinkTermsType InlineOptionalWithPhoneFirst = new LinkTermsType("InlineOptionalWithPhoneFirst", 0);
    public static final LinkTermsType InlineOptional = new LinkTermsType("InlineOptional", 1);
    public static final LinkTermsType Inline = new LinkTermsType("Inline", 2);
    public static final LinkTermsType InlineWithDefaultOptIn = new LinkTermsType("InlineWithDefaultOptIn", 3);
    public static final LinkTermsType Full = new LinkTermsType("Full", 4);

    private static final /* synthetic */ LinkTermsType[] $values() {
        return new LinkTermsType[]{InlineOptionalWithPhoneFirst, InlineOptional, Inline, InlineWithDefaultOptIn, Full};
    }

    public static EnumEntries<LinkTermsType> getEntries() {
        return $ENTRIES;
    }

    private LinkTermsType(String str, int i) {
    }

    static {
        LinkTermsType[] linkTermsTypeArr$values = $values();
        $VALUES = linkTermsTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(linkTermsTypeArr$values);
    }

    public static LinkTermsType valueOf(String str) {
        return (LinkTermsType) Enum.valueOf(LinkTermsType.class, str);
    }

    public static LinkTermsType[] values() {
        return (LinkTermsType[]) $VALUES.clone();
    }
}
