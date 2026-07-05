package com.google.accompanist.flowlayout;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Flow.kt */
@Deprecated(message = "\naccompanist/FlowCrossAxisAlignment is deprecated.\nFor more migration information, please visit https://google.github.io/accompanist/flowlayout/\n")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/accompanist/flowlayout/FlowCrossAxisAlignment;", "", "(Ljava/lang/String;I)V", "Center", "Start", "End", "flowlayout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlowCrossAxisAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlowCrossAxisAlignment[] $VALUES;
    public static final FlowCrossAxisAlignment Center = new FlowCrossAxisAlignment("Center", 0);
    public static final FlowCrossAxisAlignment Start = new FlowCrossAxisAlignment("Start", 1);
    public static final FlowCrossAxisAlignment End = new FlowCrossAxisAlignment("End", 2);

    private static final /* synthetic */ FlowCrossAxisAlignment[] $values() {
        return new FlowCrossAxisAlignment[]{Center, Start, End};
    }

    public static EnumEntries<FlowCrossAxisAlignment> getEntries() {
        return $ENTRIES;
    }

    public static FlowCrossAxisAlignment valueOf(String str) {
        return (FlowCrossAxisAlignment) Enum.valueOf(FlowCrossAxisAlignment.class, str);
    }

    public static FlowCrossAxisAlignment[] values() {
        return (FlowCrossAxisAlignment[]) $VALUES.clone();
    }

    private FlowCrossAxisAlignment(String str, int i) {
    }

    static {
        FlowCrossAxisAlignment[] flowCrossAxisAlignmentArr$values = $values();
        $VALUES = flowCrossAxisAlignmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(flowCrossAxisAlignmentArr$values);
    }
}
