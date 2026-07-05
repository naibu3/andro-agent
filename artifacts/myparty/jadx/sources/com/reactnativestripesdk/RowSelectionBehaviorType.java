package com.reactnativestripesdk;

import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/reactnativestripesdk/RowSelectionBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", Profile.DEFAULT_PROFILE_NAME, "ImmediateAction", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RowSelectionBehaviorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RowSelectionBehaviorType[] $VALUES;
    public static final RowSelectionBehaviorType Default = new RowSelectionBehaviorType(Profile.DEFAULT_PROFILE_NAME, 0);
    public static final RowSelectionBehaviorType ImmediateAction = new RowSelectionBehaviorType("ImmediateAction", 1);

    private static final /* synthetic */ RowSelectionBehaviorType[] $values() {
        return new RowSelectionBehaviorType[]{Default, ImmediateAction};
    }

    public static EnumEntries<RowSelectionBehaviorType> getEntries() {
        return $ENTRIES;
    }

    private RowSelectionBehaviorType(String str, int i) {
    }

    static {
        RowSelectionBehaviorType[] rowSelectionBehaviorTypeArr$values = $values();
        $VALUES = rowSelectionBehaviorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(rowSelectionBehaviorTypeArr$values);
    }

    public static RowSelectionBehaviorType valueOf(String str) {
        return (RowSelectionBehaviorType) Enum.valueOf(RowSelectionBehaviorType.class, str);
    }

    public static RowSelectionBehaviorType[] values() {
        return (RowSelectionBehaviorType[]) $VALUES.clone();
    }
}
