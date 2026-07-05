package com.stripe.android.stripe3ds2.transactions;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UiType.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/UiType;", "", "code", "", "requiresSubmitButton", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getRequiresSubmitButton$3ds2sdk_release", "()Z", "Text", "SingleSelect", "MultiSelect", "OutOfBand", "Html", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UiType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String code;
    private final boolean requiresSubmitButton;
    public static final UiType Text = new UiType("Text", 0, "01", true);
    public static final UiType SingleSelect = new UiType("SingleSelect", 1, "02", true);
    public static final UiType MultiSelect = new UiType("MultiSelect", 2, "03", true);
    public static final UiType OutOfBand = new UiType("OutOfBand", 3, "04", false);
    public static final UiType Html = new UiType("Html", 4, "05", false);

    private static final /* synthetic */ UiType[] $values() {
        return new UiType[]{Text, SingleSelect, MultiSelect, OutOfBand, Html};
    }

    public static EnumEntries<UiType> getEntries() {
        return $ENTRIES;
    }

    private UiType(String str, int i, String str2, boolean z) {
        this.code = str2;
        this.requiresSubmitButton = z;
    }

    public final String getCode() {
        return this.code;
    }

    /* renamed from: getRequiresSubmitButton$3ds2sdk_release, reason: from getter */
    public final boolean getRequiresSubmitButton() {
        return this.requiresSubmitButton;
    }

    static {
        UiType[] uiTypeArr$values = $values();
        $VALUES = uiTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(uiTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: UiType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;", "", "<init>", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "code", "", "fromCode$3ds2sdk_release", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UiType fromCode$3ds2sdk_release(String code) {
            UiType next;
            Iterator<UiType> it = UiType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(code, next.getCode())) {
                    break;
                }
            }
            return next;
        }
    }

    public static UiType valueOf(String str) {
        return (UiType) Enum.valueOf(UiType.class, str);
    }

    public static UiType[] values() {
        return (UiType[]) $VALUES.clone();
    }
}
