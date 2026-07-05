package com.qonversion.android.sdk.dto.eligibility;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.products.QProductType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QIntroEligibilityStatus.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "NonIntroOrTrialProduct", "Eligible", "Ineligible", "Unknown", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QIntroEligibilityStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QIntroEligibilityStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String type;
    public static final QIntroEligibilityStatus NonIntroOrTrialProduct = new QIntroEligibilityStatus("NonIntroOrTrialProduct", 0, "non_intro_or_trial_product");
    public static final QIntroEligibilityStatus Eligible = new QIntroEligibilityStatus("Eligible", 1, "intro_or_trial_eligible");
    public static final QIntroEligibilityStatus Ineligible = new QIntroEligibilityStatus("Ineligible", 2, "intro_or_trial_ineligible");
    public static final QIntroEligibilityStatus Unknown = new QIntroEligibilityStatus("Unknown", 3, "unknown");

    private static final /* synthetic */ QIntroEligibilityStatus[] $values() {
        return new QIntroEligibilityStatus[]{NonIntroOrTrialProduct, Eligible, Ineligible, Unknown};
    }

    public static EnumEntries<QIntroEligibilityStatus> getEntries() {
        return $ENTRIES;
    }

    public static QIntroEligibilityStatus valueOf(String str) {
        return (QIntroEligibilityStatus) Enum.valueOf(QIntroEligibilityStatus.class, str);
    }

    public static QIntroEligibilityStatus[] values() {
        return (QIntroEligibilityStatus[]) $VALUES.clone();
    }

    private QIntroEligibilityStatus(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        QIntroEligibilityStatus[] qIntroEligibilityStatusArr$values = $values();
        $VALUES = qIntroEligibilityStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qIntroEligibilityStatusArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: QIntroEligibilityStatus.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;", "", "()V", "fromProductType", "Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;", "productType", "Lcom/qonversion/android/sdk/dto/products/QProductType;", "fromType", "type", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {

        /* compiled from: QIntroEligibilityStatus.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[QProductType.values().length];
                try {
                    iArr[QProductType.Intro.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[QProductType.Trial.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[QProductType.Subscription.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[QProductType.InApp.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[QProductType.Unknown.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final QIntroEligibilityStatus fromType(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int iHashCode = type.hashCode();
            if (iHashCode != -1048155314) {
                if (iHashCode != 97706639) {
                    if (iHashCode == 922320809 && type.equals("intro_or_trial_eligible")) {
                        return QIntroEligibilityStatus.Eligible;
                    }
                } else if (type.equals("non_intro_or_trial_product")) {
                    return QIntroEligibilityStatus.NonIntroOrTrialProduct;
                }
            } else if (type.equals("intro_or_trial_ineligible")) {
                return QIntroEligibilityStatus.Ineligible;
            }
            return QIntroEligibilityStatus.Unknown;
        }

        public final QIntroEligibilityStatus fromProductType(QProductType productType) {
            Intrinsics.checkNotNullParameter(productType, "productType");
            int i = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
            if (i == 1 || i == 2) {
                return QIntroEligibilityStatus.Eligible;
            }
            if (i == 3) {
                return QIntroEligibilityStatus.Ineligible;
            }
            if (i == 4) {
                return QIntroEligibilityStatus.NonIntroOrTrialProduct;
            }
            if (i == 5) {
                return QIntroEligibilityStatus.Unknown;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
