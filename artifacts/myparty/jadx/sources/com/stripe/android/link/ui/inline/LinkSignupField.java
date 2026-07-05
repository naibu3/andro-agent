package com.stripe.android.link.ui.inline;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineSignupViewState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/ui/inline/LinkSignupField;", "", "<init>", "(Ljava/lang/String;I)V", "Email", "Phone", "Name", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkSignupField {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkSignupField[] $VALUES;
    public static final LinkSignupField Email = new LinkSignupField("Email", 0);
    public static final LinkSignupField Phone = new LinkSignupField("Phone", 1);
    public static final LinkSignupField Name = new LinkSignupField("Name", 2);

    private static final /* synthetic */ LinkSignupField[] $values() {
        return new LinkSignupField[]{Email, Phone, Name};
    }

    public static EnumEntries<LinkSignupField> getEntries() {
        return $ENTRIES;
    }

    private LinkSignupField(String str, int i) {
    }

    static {
        LinkSignupField[] linkSignupFieldArr$values = $values();
        $VALUES = linkSignupFieldArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(linkSignupFieldArr$values);
    }

    public static LinkSignupField valueOf(String str) {
        return (LinkSignupField) Enum.valueOf(LinkSignupField.class, str);
    }

    public static LinkSignupField[] values() {
        return (LinkSignupField[]) $VALUES.clone();
    }
}
