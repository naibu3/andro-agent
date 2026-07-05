package com.qonversion.android.sdk.automations.internal.macros;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MacrosType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Unknown", "Price", "SubscriptionDuration", "TrialDuration", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class MacrosType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MacrosType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String type;
    public static final MacrosType Unknown = new MacrosType("Unknown", 0, "unknown");
    public static final MacrosType Price = new MacrosType("Price", 1, "price");
    public static final MacrosType SubscriptionDuration = new MacrosType("SubscriptionDuration", 2, "duration_subscription");
    public static final MacrosType TrialDuration = new MacrosType("TrialDuration", 3, "duration_trial");

    private static final /* synthetic */ MacrosType[] $values() {
        return new MacrosType[]{Unknown, Price, SubscriptionDuration, TrialDuration};
    }

    public static EnumEntries<MacrosType> getEntries() {
        return $ENTRIES;
    }

    public static MacrosType valueOf(String str) {
        return (MacrosType) Enum.valueOf(MacrosType.class, str);
    }

    public static MacrosType[] values() {
        return (MacrosType[]) $VALUES.clone();
    }

    private MacrosType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        MacrosType[] macrosTypeArr$values = $values();
        $VALUES = macrosTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(macrosTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: MacrosType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MacrosType fromType(String type) {
            MacrosType macrosType;
            Intrinsics.checkNotNullParameter(type, "type");
            MacrosType[] macrosTypeArrValues = MacrosType.values();
            int length = macrosTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    macrosType = null;
                    break;
                }
                macrosType = macrosTypeArrValues[i];
                if (Intrinsics.areEqual(macrosType.getType(), type)) {
                    break;
                }
                i++;
            }
            return macrosType == null ? MacrosType.Unknown : macrosType;
        }
    }
}
