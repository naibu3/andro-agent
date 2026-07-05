package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Flow.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "", "arrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V", "getArrangement$flowlayout_release", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Center", "Start", "End", "SpaceEvenly", "SpaceBetween", "SpaceAround", "flowlayout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainAxisAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MainAxisAlignment[] $VALUES;
    private final Arrangement.Vertical arrangement;
    public static final MainAxisAlignment Center = new MainAxisAlignment("Center", 0, Arrangement.INSTANCE.getCenter());
    public static final MainAxisAlignment Start = new MainAxisAlignment("Start", 1, Arrangement.INSTANCE.getTop());
    public static final MainAxisAlignment End = new MainAxisAlignment("End", 2, Arrangement.INSTANCE.getBottom());
    public static final MainAxisAlignment SpaceEvenly = new MainAxisAlignment("SpaceEvenly", 3, Arrangement.INSTANCE.getSpaceEvenly());
    public static final MainAxisAlignment SpaceBetween = new MainAxisAlignment("SpaceBetween", 4, Arrangement.INSTANCE.getSpaceBetween());
    public static final MainAxisAlignment SpaceAround = new MainAxisAlignment("SpaceAround", 5, Arrangement.INSTANCE.getSpaceAround());

    private static final /* synthetic */ MainAxisAlignment[] $values() {
        return new MainAxisAlignment[]{Center, Start, End, SpaceEvenly, SpaceBetween, SpaceAround};
    }

    public static EnumEntries<MainAxisAlignment> getEntries() {
        return $ENTRIES;
    }

    public static MainAxisAlignment valueOf(String str) {
        return (MainAxisAlignment) Enum.valueOf(MainAxisAlignment.class, str);
    }

    public static MainAxisAlignment[] values() {
        return (MainAxisAlignment[]) $VALUES.clone();
    }

    private MainAxisAlignment(String str, int i, Arrangement.Vertical vertical) {
        this.arrangement = vertical;
    }

    /* renamed from: getArrangement$flowlayout_release, reason: from getter */
    public final Arrangement.Vertical getArrangement() {
        return this.arrangement;
    }

    static {
        MainAxisAlignment[] mainAxisAlignmentArr$values = $values();
        $VALUES = mainAxisAlignmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(mainAxisAlignmentArr$values);
    }
}
