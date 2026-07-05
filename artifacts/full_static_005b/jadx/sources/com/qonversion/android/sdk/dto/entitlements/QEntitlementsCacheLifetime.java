package com.qonversion.android.sdk.dto.entitlements;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QEntitlementsCacheLifetime.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementsCacheLifetime;", "", "days", "", "(Ljava/lang/String;II)V", "getDays", "()I", "Week", "TwoWeeks", "Month", "TwoMonths", "ThreeMonths", "SixMonths", "Year", "Unlimited", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QEntitlementsCacheLifetime {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QEntitlementsCacheLifetime[] $VALUES;
    private final int days;
    public static final QEntitlementsCacheLifetime Week = new QEntitlementsCacheLifetime("Week", 0, 7);
    public static final QEntitlementsCacheLifetime TwoWeeks = new QEntitlementsCacheLifetime("TwoWeeks", 1, 14);
    public static final QEntitlementsCacheLifetime Month = new QEntitlementsCacheLifetime("Month", 2, 30);
    public static final QEntitlementsCacheLifetime TwoMonths = new QEntitlementsCacheLifetime("TwoMonths", 3, 60);
    public static final QEntitlementsCacheLifetime ThreeMonths = new QEntitlementsCacheLifetime("ThreeMonths", 4, 90);
    public static final QEntitlementsCacheLifetime SixMonths = new QEntitlementsCacheLifetime("SixMonths", 5, 180);
    public static final QEntitlementsCacheLifetime Year = new QEntitlementsCacheLifetime("Year", 6, 365);
    public static final QEntitlementsCacheLifetime Unlimited = new QEntitlementsCacheLifetime("Unlimited", 7, Integer.MAX_VALUE);

    private static final /* synthetic */ QEntitlementsCacheLifetime[] $values() {
        return new QEntitlementsCacheLifetime[]{Week, TwoWeeks, Month, TwoMonths, ThreeMonths, SixMonths, Year, Unlimited};
    }

    public static EnumEntries<QEntitlementsCacheLifetime> getEntries() {
        return $ENTRIES;
    }

    public static QEntitlementsCacheLifetime valueOf(String str) {
        return (QEntitlementsCacheLifetime) Enum.valueOf(QEntitlementsCacheLifetime.class, str);
    }

    public static QEntitlementsCacheLifetime[] values() {
        return (QEntitlementsCacheLifetime[]) $VALUES.clone();
    }

    private QEntitlementsCacheLifetime(String str, int i, int i2) {
        this.days = i2;
    }

    public final int getDays() {
        return this.days;
    }

    static {
        QEntitlementsCacheLifetime[] qEntitlementsCacheLifetimeArr$values = $values();
        $VALUES = qEntitlementsCacheLifetimeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qEntitlementsCacheLifetimeArr$values);
    }
}
