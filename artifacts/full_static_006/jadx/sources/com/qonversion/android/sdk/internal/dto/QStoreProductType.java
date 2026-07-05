package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QStoreProductType.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "", "(Ljava/lang/String;I)V", "toProductType", "", "toSkuType", "InApp", "Subscription", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QStoreProductType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QStoreProductType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final QStoreProductType InApp = new QStoreProductType("InApp", 0);
    public static final QStoreProductType Subscription = new QStoreProductType("Subscription", 1);

    /* compiled from: QStoreProductType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QStoreProductType.values().length];
            try {
                iArr[QStoreProductType.InApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QStoreProductType.Subscription.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ QStoreProductType[] $values() {
        return new QStoreProductType[]{InApp, Subscription};
    }

    public static EnumEntries<QStoreProductType> getEntries() {
        return $ENTRIES;
    }

    public static QStoreProductType valueOf(String str) {
        return (QStoreProductType) Enum.valueOf(QStoreProductType.class, str);
    }

    public static QStoreProductType[] values() {
        return (QStoreProductType[]) $VALUES.clone();
    }

    private QStoreProductType(String str, int i) {
    }

    static {
        QStoreProductType[] qStoreProductTypeArr$values = $values();
        $VALUES = qStoreProductTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qStoreProductTypeArr$values);
        INSTANCE = new Companion(null);
    }

    public final String toProductType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "inapp";
        }
        if (i == 2) {
            return "subs";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toSkuType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "inapp";
        }
        if (i == 2) {
            return "subs";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: QStoreProductType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QStoreProductType$Companion;", "", "()V", "fromProductType", "Lcom/qonversion/android/sdk/internal/dto/QStoreProductType;", "type", "", "fromSkuType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final QStoreProductType fromProductType(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type, "inapp")) {
                return QStoreProductType.InApp;
            }
            return QStoreProductType.Subscription;
        }

        public final QStoreProductType fromSkuType(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type, "inapp")) {
                return QStoreProductType.InApp;
            }
            return QStoreProductType.Subscription;
        }
    }
}
