package com.qonversion.android.sdk.dto.entitlements;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.dto.QProductRenewState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QEntitlementRenewState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "NonRenewable", "Unknown", "WillRenew", "Canceled", "BillingIssue", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QEntitlementRenewState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QEntitlementRenewState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String type;
    public static final QEntitlementRenewState NonRenewable = new QEntitlementRenewState("NonRenewable", 0, "non_renewable");
    public static final QEntitlementRenewState Unknown = new QEntitlementRenewState("Unknown", 1, "unknown");
    public static final QEntitlementRenewState WillRenew = new QEntitlementRenewState("WillRenew", 2, "will_renew");
    public static final QEntitlementRenewState Canceled = new QEntitlementRenewState("Canceled", 3, "canceled");
    public static final QEntitlementRenewState BillingIssue = new QEntitlementRenewState("BillingIssue", 4, "billing_issue");

    private static final /* synthetic */ QEntitlementRenewState[] $values() {
        return new QEntitlementRenewState[]{NonRenewable, Unknown, WillRenew, Canceled, BillingIssue};
    }

    public static EnumEntries<QEntitlementRenewState> getEntries() {
        return $ENTRIES;
    }

    public static QEntitlementRenewState valueOf(String str) {
        return (QEntitlementRenewState) Enum.valueOf(QEntitlementRenewState.class, str);
    }

    public static QEntitlementRenewState[] values() {
        return (QEntitlementRenewState[]) $VALUES.clone();
    }

    private QEntitlementRenewState(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        return this.type;
    }

    static {
        QEntitlementRenewState[] qEntitlementRenewStateArr$values = $values();
        $VALUES = qEntitlementRenewStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(qEntitlementRenewStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: QEntitlementRenewState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState$Companion;", "", "()V", "fromProductRenewState", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementRenewState;", "renewState", "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "fromProductRenewState$sdk_release", "fromType", "type", "", "fromType$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {

        /* compiled from: QEntitlementRenewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[QProductRenewState.values().length];
                try {
                    iArr[QProductRenewState.NonRenewable.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[QProductRenewState.WillRenew.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[QProductRenewState.Canceled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[QProductRenewState.BillingIssue.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final QEntitlementRenewState fromType$sdk_release(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (type.hashCode()) {
                case -1190451691:
                    if (type.equals("billing_issue")) {
                        return QEntitlementRenewState.BillingIssue;
                    }
                    break;
                case -466953611:
                    if (type.equals("non_renewable")) {
                        return QEntitlementRenewState.NonRenewable;
                    }
                    break;
                case -123173735:
                    if (type.equals("canceled")) {
                        return QEntitlementRenewState.Canceled;
                    }
                    break;
                case 719812576:
                    if (type.equals("will_renew")) {
                        return QEntitlementRenewState.WillRenew;
                    }
                    break;
            }
            return QEntitlementRenewState.Unknown;
        }

        public final QEntitlementRenewState fromProductRenewState$sdk_release(QProductRenewState renewState) {
            Intrinsics.checkNotNullParameter(renewState, "renewState");
            int i = WhenMappings.$EnumSwitchMapping$0[renewState.ordinal()];
            if (i == 1) {
                return QEntitlementRenewState.NonRenewable;
            }
            if (i == 2) {
                return QEntitlementRenewState.WillRenew;
            }
            if (i == 3) {
                return QEntitlementRenewState.Canceled;
            }
            if (i == 4) {
                return QEntitlementRenewState.BillingIssue;
            }
            return QEntitlementRenewState.Unknown;
        }
    }
}
