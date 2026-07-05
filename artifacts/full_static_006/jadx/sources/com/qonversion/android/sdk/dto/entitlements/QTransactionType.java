package com.qonversion.android.sdk.dto.entitlements;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QTransactionType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Unknown", "SubscriptionStarted", "SubscriptionRenewed", "TrialStarted", "IntroStarted", "IntroRenewed", "NonConsumablePurchase", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QTransactionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QTransactionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String type;
    public static final QTransactionType Unknown = new QTransactionType("Unknown", 0, "unknown");
    public static final QTransactionType SubscriptionStarted = new QTransactionType("SubscriptionStarted", 1, "subscription_started");
    public static final QTransactionType SubscriptionRenewed = new QTransactionType("SubscriptionRenewed", 2, "subscription_renewed");
    public static final QTransactionType TrialStarted = new QTransactionType("TrialStarted", 3, "trial_started");
    public static final QTransactionType IntroStarted = new QTransactionType("IntroStarted", 4, "intro_started");
    public static final QTransactionType IntroRenewed = new QTransactionType("IntroRenewed", 5, "intro_renewed");
    public static final QTransactionType NonConsumablePurchase = new QTransactionType("NonConsumablePurchase", 6, "non_consumable_purchase");

    private static final /* synthetic */ QTransactionType[] $values() {
        return new QTransactionType[]{Unknown, SubscriptionStarted, SubscriptionRenewed, TrialStarted, IntroStarted, IntroRenewed, NonConsumablePurchase};
    }

    public static EnumEntries<QTransactionType> getEntries() {
        return $ENTRIES;
    }

    public static QTransactionType valueOf(String str) {
        return (QTransactionType) Enum.valueOf(QTransactionType.class, str);
    }

    public static QTransactionType[] values() {
        return (QTransactionType[]) $VALUES.clone();
    }

    private QTransactionType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        QTransactionType[] qTransactionTypeArr$values = $values();
        $VALUES = qTransactionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qTransactionTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: QTransactionType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType$Companion;", "", "()V", "fromType", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "type", "", "fromType$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final QTransactionType fromType$sdk_release(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (type.hashCode()) {
                case -2099435797:
                    if (type.equals("non_consumable_purchase")) {
                        return QTransactionType.NonConsumablePurchase;
                    }
                    break;
                case -1034208566:
                    if (type.equals("subscription_renewed")) {
                        return QTransactionType.SubscriptionRenewed;
                    }
                    break;
                case -946921042:
                    if (type.equals("intro_started")) {
                        return QTransactionType.IntroStarted;
                    }
                    break;
                case -898269096:
                    if (type.equals("trial_started")) {
                        return QTransactionType.TrialStarted;
                    }
                    break;
                case 271111007:
                    if (type.equals("subscription_started")) {
                        return QTransactionType.SubscriptionStarted;
                    }
                    break;
                case 2042726681:
                    if (type.equals("intro_renewed")) {
                        return QTransactionType.IntroRenewed;
                    }
                    break;
            }
            return QTransactionType.Unknown;
        }
    }
}
