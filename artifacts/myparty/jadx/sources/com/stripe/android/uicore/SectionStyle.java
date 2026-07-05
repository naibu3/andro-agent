package com.stripe.android.uicore;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/SectionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Bordered", "Borderless", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SectionStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SectionStyle[] $VALUES;
    public static final SectionStyle Bordered = new SectionStyle("Bordered", 0);
    public static final SectionStyle Borderless = new SectionStyle("Borderless", 1);

    private static final /* synthetic */ SectionStyle[] $values() {
        return new SectionStyle[]{Bordered, Borderless};
    }

    public static EnumEntries<SectionStyle> getEntries() {
        return $ENTRIES;
    }

    private SectionStyle(String str, int i) {
    }

    static {
        SectionStyle[] sectionStyleArr$values = $values();
        $VALUES = sectionStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sectionStyleArr$values);
    }

    public static SectionStyle valueOf(String str) {
        return (SectionStyle) Enum.valueOf(SectionStyle.class, str);
    }

    public static SectionStyle[] values() {
        return (SectionStyle[]) $VALUES.clone();
    }
}
