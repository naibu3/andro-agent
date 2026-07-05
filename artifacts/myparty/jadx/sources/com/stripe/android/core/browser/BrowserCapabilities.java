package com.stripe.android.core.browser;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BrowserCapabilities.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/browser/BrowserCapabilities;", "", "<init>", "(Ljava/lang/String;I)V", "CustomTabs", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BrowserCapabilities {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrowserCapabilities[] $VALUES;
    public static final BrowserCapabilities CustomTabs = new BrowserCapabilities("CustomTabs", 0);
    public static final BrowserCapabilities Unknown = new BrowserCapabilities(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 1);

    private static final /* synthetic */ BrowserCapabilities[] $values() {
        return new BrowserCapabilities[]{CustomTabs, Unknown};
    }

    public static EnumEntries<BrowserCapabilities> getEntries() {
        return $ENTRIES;
    }

    private BrowserCapabilities(String str, int i) {
    }

    static {
        BrowserCapabilities[] browserCapabilitiesArr$values = $values();
        $VALUES = browserCapabilitiesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(browserCapabilitiesArr$values);
    }

    public static BrowserCapabilities valueOf(String str) {
        return (BrowserCapabilities) Enum.valueOf(BrowserCapabilities.class, str);
    }

    public static BrowserCapabilities[] values() {
        return (BrowserCapabilities[]) $VALUES.clone();
    }
}
