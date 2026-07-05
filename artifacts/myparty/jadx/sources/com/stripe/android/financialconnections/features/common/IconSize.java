package com.stripe.android.financialconnections.features.common;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShapedIcon.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/features/common/IconSize;", "", "size", "Landroidx/compose/ui/unit/Dp;", "paddedSize", "<init>", "(Ljava/lang/String;IFF)V", "getSize-D9Ej5fM", "()F", "F", "getPaddedSize-D9Ej5fM", "Large", "Medium", "Small", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IconSize {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IconSize[] $VALUES;
    public static final IconSize Large = new IconSize("Large", 0, Dp.m6117constructorimpl(64), Dp.m6117constructorimpl(32));
    public static final IconSize Medium = new IconSize("Medium", 1, Dp.m6117constructorimpl(56), Dp.m6117constructorimpl(20));
    public static final IconSize Small = new IconSize("Small", 2, Dp.m6117constructorimpl(24), Dp.m6117constructorimpl(12));
    private final float paddedSize;
    private final float size;

    private static final /* synthetic */ IconSize[] $values() {
        return new IconSize[]{Large, Medium, Small};
    }

    public static EnumEntries<IconSize> getEntries() {
        return $ENTRIES;
    }

    private IconSize(String str, int i, float f, float f2) {
        this.size = f;
        this.paddedSize = f2;
    }

    /* renamed from: getPaddedSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getPaddedSize() {
        return this.paddedSize;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    static {
        IconSize[] iconSizeArr$values = $values();
        $VALUES = iconSizeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(iconSizeArr$values);
    }

    public static IconSize valueOf(String str) {
        return (IconSize) Enum.valueOf(IconSize.class, str);
    }

    public static IconSize[] values() {
        return (IconSize[]) $VALUES.clone();
    }
}
