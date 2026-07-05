package com.stripe.android.core.utils;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureFlags.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/core/utils/FeatureFlag;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "overrideEnabledValue", "", "Ljava/lang/Boolean;", "isEnabled", "()Z", "value", "Lcom/stripe/android/core/utils/FeatureFlag$Flag;", "getValue", "()Lcom/stripe/android/core/utils/FeatureFlag$Flag;", "setEnabled", "", "reset", "Flag", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureFlag {
    private final String name;
    private Boolean overrideEnabledValue;

    public final boolean isEnabled() {
        return false;
    }

    public FeatureFlag(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    public final Flag getValue() {
        return Flag.NotSet.INSTANCE;
    }

    public final void setEnabled(boolean isEnabled) {
        this.overrideEnabledValue = Boolean.valueOf(isEnabled);
    }

    public final void reset() {
        this.overrideEnabledValue = null;
    }

    /* compiled from: FeatureFlags.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/core/utils/FeatureFlag$Flag;", "", "Enabled", "Disabled", "NotSet", "Lcom/stripe/android/core/utils/FeatureFlag$Flag$Disabled;", "Lcom/stripe/android/core/utils/FeatureFlag$Flag$Enabled;", "Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Flag {

        /* compiled from: FeatureFlags.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/utils/FeatureFlag$Flag$Enabled;", "Lcom/stripe/android/core/utils/FeatureFlag$Flag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Enabled implements Flag {
            public static final Enabled INSTANCE = new Enabled();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Enabled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -518021628;
            }

            public String toString() {
                return "Enabled";
            }

            private Enabled() {
            }
        }

        /* compiled from: FeatureFlags.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/utils/FeatureFlag$Flag$Disabled;", "Lcom/stripe/android/core/utils/FeatureFlag$Flag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Disabled implements Flag {
            public static final Disabled INSTANCE = new Disabled();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Disabled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -250052583;
            }

            public String toString() {
                return "Disabled";
            }

            private Disabled() {
            }
        }

        /* compiled from: FeatureFlags.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/core/utils/FeatureFlag$Flag$NotSet;", "Lcom/stripe/android/core/utils/FeatureFlag$Flag;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NotSet implements Flag {
            public static final NotSet INSTANCE = new NotSet();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NotSet)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1558688404;
            }

            public String toString() {
                return "NotSet";
            }

            private NotSet() {
            }
        }
    }
}
