package com.stripe.android.financialconnections.features.linkaccountpicker;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LinkAccountPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerClickableText;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DATA", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountPickerClickableText {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkAccountPickerClickableText[] $VALUES;
    public static final LinkAccountPickerClickableText DATA = new LinkAccountPickerClickableText("DATA", 0, "stripe://data-access-notice");
    private final String value;

    private static final /* synthetic */ LinkAccountPickerClickableText[] $values() {
        return new LinkAccountPickerClickableText[]{DATA};
    }

    public static EnumEntries<LinkAccountPickerClickableText> getEntries() {
        return $ENTRIES;
    }

    private LinkAccountPickerClickableText(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        LinkAccountPickerClickableText[] linkAccountPickerClickableTextArr$values = $values();
        $VALUES = linkAccountPickerClickableTextArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(linkAccountPickerClickableTextArr$values);
    }

    public static LinkAccountPickerClickableText valueOf(String str) {
        return (LinkAccountPickerClickableText) Enum.valueOf(LinkAccountPickerClickableText.class, str);
    }

    public static LinkAccountPickerClickableText[] values() {
        return (LinkAccountPickerClickableText[]) $VALUES.clone();
    }
}
