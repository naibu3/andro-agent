package com.google.accompanist.flowlayout;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Flow.kt */
@Deprecated(message = "\naccompanist/SizeMode is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/accompanist/flowlayout/SizeMode;", "", "(Ljava/lang/String;I)V", "Wrap", "Expand", "flowlayout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SizeMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SizeMode[] $VALUES;
    public static final SizeMode Wrap = new SizeMode("Wrap", 0);
    public static final SizeMode Expand = new SizeMode("Expand", 1);

    private static final /* synthetic */ SizeMode[] $values() {
        return new SizeMode[]{Wrap, Expand};
    }

    public static EnumEntries<SizeMode> getEntries() {
        return $ENTRIES;
    }

    public static SizeMode valueOf(String str) {
        return (SizeMode) Enum.valueOf(SizeMode.class, str);
    }

    public static SizeMode[] values() {
        return (SizeMode[]) $VALUES.clone();
    }

    private SizeMode(String str, int i) {
    }

    static {
        SizeMode[] sizeModeArr$values = $values();
        $VALUES = sizeModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sizeModeArr$values);
    }
}
