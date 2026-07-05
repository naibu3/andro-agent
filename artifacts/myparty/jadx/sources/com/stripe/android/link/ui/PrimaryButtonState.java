package com.stripe.android.link.ui;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PrimaryButton.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/link/ui/PrimaryButtonState;", "", "isBlocking", "", "<init>", "(Ljava/lang/String;IZ)V", "()Z", "Enabled", "Disabled", "Processing", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrimaryButtonState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrimaryButtonState[] $VALUES;
    private final boolean isBlocking;
    public static final PrimaryButtonState Enabled = new PrimaryButtonState("Enabled", 0, false);
    public static final PrimaryButtonState Disabled = new PrimaryButtonState("Disabled", 1, false);
    public static final PrimaryButtonState Processing = new PrimaryButtonState("Processing", 2, true);
    public static final PrimaryButtonState Completed = new PrimaryButtonState(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, 3, true);

    private static final /* synthetic */ PrimaryButtonState[] $values() {
        return new PrimaryButtonState[]{Enabled, Disabled, Processing, Completed};
    }

    public static EnumEntries<PrimaryButtonState> getEntries() {
        return $ENTRIES;
    }

    private PrimaryButtonState(String str, int i, boolean z) {
        this.isBlocking = z;
    }

    /* renamed from: isBlocking, reason: from getter */
    public final boolean getIsBlocking() {
        return this.isBlocking;
    }

    static {
        PrimaryButtonState[] primaryButtonStateArr$values = $values();
        $VALUES = primaryButtonStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(primaryButtonStateArr$values);
    }

    public static PrimaryButtonState valueOf(String str) {
        return (PrimaryButtonState) Enum.valueOf(PrimaryButtonState.class, str);
    }

    public static PrimaryButtonState[] values() {
        return (PrimaryButtonState[]) $VALUES.clone();
    }
}
