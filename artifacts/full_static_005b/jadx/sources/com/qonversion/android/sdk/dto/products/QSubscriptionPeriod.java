package com.qonversion.android.sdk.dto.products;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: QSubscriptionPeriod.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "", "unitCount", "", "unit", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "iso", "", "(ILcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;Ljava/lang/String;)V", "getIso", "()Ljava/lang/String;", "getUnit", "()Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "getUnitCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "Unit", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QSubscriptionPeriod {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String iso;
    private final Unit unit;
    private final int unitCount;

    public static /* synthetic */ QSubscriptionPeriod copy$default(QSubscriptionPeriod qSubscriptionPeriod, int i, Unit unit, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = qSubscriptionPeriod.unitCount;
        }
        if ((i2 & 2) != 0) {
            unit = qSubscriptionPeriod.unit;
        }
        if ((i2 & 4) != 0) {
            str = qSubscriptionPeriod.iso;
        }
        return qSubscriptionPeriod.copy(i, unit, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUnitCount() {
        return this.unitCount;
    }

    /* renamed from: component2, reason: from getter */
    public final Unit getUnit() {
        return this.unit;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIso() {
        return this.iso;
    }

    public final QSubscriptionPeriod copy(int unitCount, Unit unit, String iso) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(iso, "iso");
        return new QSubscriptionPeriod(unitCount, unit, iso);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QSubscriptionPeriod)) {
            return false;
        }
        QSubscriptionPeriod qSubscriptionPeriod = (QSubscriptionPeriod) other;
        return this.unitCount == qSubscriptionPeriod.unitCount && this.unit == qSubscriptionPeriod.unit && Intrinsics.areEqual(this.iso, qSubscriptionPeriod.iso);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.unitCount) * 31) + this.unit.hashCode()) * 31) + this.iso.hashCode();
    }

    public String toString() {
        return "QSubscriptionPeriod(unitCount=" + this.unitCount + ", unit=" + this.unit + ", iso=" + this.iso + ")";
    }

    public QSubscriptionPeriod(int i, Unit unit, String iso) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(iso, "iso");
        this.unitCount = i;
        this.unit = unit;
        this.iso = iso;
    }

    public final int getUnitCount() {
        return this.unitCount;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final String getIso() {
        return this.iso;
    }

    /* compiled from: QSubscriptionPeriod.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Companion;", "", "()V", "from", "Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod;", "isoPeriod", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private static final int from$toPeriodCount(String str) {
            Integer intOrNull;
            String str2 = str.length() > 0 ? str : null;
            if (str2 == null) {
                return 0;
            }
            String strSubstring = str2.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring == null || (intOrNull = StringsKt.toIntOrNull(strSubstring)) == null) {
                return 0;
            }
            return intOrNull.intValue();
        }

        public final QSubscriptionPeriod from(String isoPeriod) {
            Intrinsics.checkNotNullParameter(isoPeriod, "isoPeriod");
            MatchResult matchResultMatchEntire = new Regex("^P(?!$)(\\d+Y)?(\\d+M)?(\\d+W)?(\\d+D)?$").matchEntire(isoPeriod);
            if (matchResultMatchEntire == null) {
                return new QSubscriptionPeriod(0, Unit.Unknown, isoPeriod);
            }
            MatchResult.Destructured destructured = matchResultMatchEntire.getDestructured();
            String str = destructured.getMatch().getGroupValues().get(1);
            String str2 = destructured.getMatch().getGroupValues().get(2);
            String str3 = destructured.getMatch().getGroupValues().get(3);
            String str4 = destructured.getMatch().getGroupValues().get(4);
            int iFrom$toPeriodCount = from$toPeriodCount(str);
            int iFrom$toPeriodCount2 = from$toPeriodCount(str2);
            int iFrom$toPeriodCount3 = from$toPeriodCount(str3);
            int iFrom$toPeriodCount4 = from$toPeriodCount(str4);
            if (iFrom$toPeriodCount > 0) {
                return new QSubscriptionPeriod(iFrom$toPeriodCount, Unit.Year, isoPeriod);
            }
            if (iFrom$toPeriodCount2 > 0) {
                return new QSubscriptionPeriod(iFrom$toPeriodCount2, Unit.Month, isoPeriod);
            }
            if (iFrom$toPeriodCount3 > 0) {
                return new QSubscriptionPeriod(iFrom$toPeriodCount3, Unit.Week, isoPeriod);
            }
            if (iFrom$toPeriodCount4 > 0) {
                return new QSubscriptionPeriod(iFrom$toPeriodCount4, Unit.Day, isoPeriod);
            }
            return new QSubscriptionPeriod(0, Unit.Unknown, isoPeriod);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: QSubscriptionPeriod.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/products/QSubscriptionPeriod$Unit;", "", "(Ljava/lang/String;I)V", "Day", "Week", "Month", "Year", "Unknown", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Unit {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Unit[] $VALUES;
        public static final Unit Day = new Unit("Day", 0);
        public static final Unit Week = new Unit("Week", 1);
        public static final Unit Month = new Unit("Month", 2);
        public static final Unit Year = new Unit("Year", 3);
        public static final Unit Unknown = new Unit("Unknown", 4);

        private static final /* synthetic */ Unit[] $values() {
            return new Unit[]{Day, Week, Month, Year, Unknown};
        }

        public static EnumEntries<Unit> getEntries() {
            return $ENTRIES;
        }

        public static Unit valueOf(String str) {
            return (Unit) Enum.valueOf(Unit.class, str);
        }

        public static Unit[] values() {
            return (Unit[]) $VALUES.clone();
        }

        private Unit(String str, int i) {
        }

        static {
            Unit[] unitArr$values = $values();
            $VALUES = unitArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(unitArr$values);
        }
    }
}
