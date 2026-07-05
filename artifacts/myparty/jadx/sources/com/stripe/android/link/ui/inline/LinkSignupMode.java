package com.stripe.android.link.ui.inline;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InlineSignupViewState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "", "<init>", "(Ljava/lang/String;I)V", "InsteadOfSaveForFutureUse", "AlongsideSaveForFutureUse", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkSignupMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkSignupMode[] $VALUES;
    public static final LinkSignupMode InsteadOfSaveForFutureUse = new LinkSignupMode("InsteadOfSaveForFutureUse", 0);
    public static final LinkSignupMode AlongsideSaveForFutureUse = new LinkSignupMode("AlongsideSaveForFutureUse", 1);

    private static final /* synthetic */ LinkSignupMode[] $values() {
        return new LinkSignupMode[]{InsteadOfSaveForFutureUse, AlongsideSaveForFutureUse};
    }

    public static EnumEntries<LinkSignupMode> getEntries() {
        return $ENTRIES;
    }

    private LinkSignupMode(String str, int i) {
    }

    static {
        LinkSignupMode[] linkSignupModeArr$values = $values();
        $VALUES = linkSignupModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(linkSignupModeArr$values);
    }

    public static LinkSignupMode valueOf(String str) {
        return (LinkSignupMode) Enum.valueOf(LinkSignupMode.class, str);
    }

    public static LinkSignupMode[] values() {
        return (LinkSignupMode[]) $VALUES.clone();
    }
}
