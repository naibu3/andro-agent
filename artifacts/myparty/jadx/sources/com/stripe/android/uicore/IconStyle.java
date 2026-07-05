package com.stripe.android.uicore;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/IconStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Filled", "Outlined", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IconStyle[] $VALUES;
    public static final IconStyle Filled = new IconStyle("Filled", 0);
    public static final IconStyle Outlined = new IconStyle("Outlined", 1);

    private static final /* synthetic */ IconStyle[] $values() {
        return new IconStyle[]{Filled, Outlined};
    }

    public static EnumEntries<IconStyle> getEntries() {
        return $ENTRIES;
    }

    private IconStyle(String str, int i) {
    }

    static {
        IconStyle[] iconStyleArr$values = $values();
        $VALUES = iconStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(iconStyleArr$values);
    }

    public static IconStyle valueOf(String str) {
        return (IconStyle) Enum.valueOf(IconStyle.class, str);
    }

    public static IconStyle[] values() {
        return (IconStyle[]) $VALUES.clone();
    }
}
