package com.stripe.android.paymentsheet.navigation;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetScreen.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/navigation/BuyButtonState;", "", ViewProps.VISIBLE, "", "buyButtonOverride", "Lcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;", "<init>", "(ZLcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;)V", "getVisible", "()Z", "getBuyButtonOverride", "()Lcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "BuyButtonOverride", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BuyButtonState {
    public static final int $stable = 8;
    private final BuyButtonOverride buyButtonOverride;
    private final boolean visible;

    public static /* synthetic */ BuyButtonState copy$default(BuyButtonState buyButtonState, boolean z, BuyButtonOverride buyButtonOverride, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buyButtonState.visible;
        }
        if ((i & 2) != 0) {
            buyButtonOverride = buyButtonState.buyButtonOverride;
        }
        return buyButtonState.copy(z, buyButtonOverride);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component2, reason: from getter */
    public final BuyButtonOverride getBuyButtonOverride() {
        return this.buyButtonOverride;
    }

    public final BuyButtonState copy(boolean visible, BuyButtonOverride buyButtonOverride) {
        return new BuyButtonState(visible, buyButtonOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyButtonState)) {
            return false;
        }
        BuyButtonState buyButtonState = (BuyButtonState) other;
        return this.visible == buyButtonState.visible && Intrinsics.areEqual(this.buyButtonOverride, buyButtonState.buyButtonOverride);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.visible) * 31;
        BuyButtonOverride buyButtonOverride = this.buyButtonOverride;
        return iHashCode + (buyButtonOverride == null ? 0 : buyButtonOverride.hashCode());
    }

    public String toString() {
        return "BuyButtonState(visible=" + this.visible + ", buyButtonOverride=" + this.buyButtonOverride + ")";
    }

    public BuyButtonState(boolean z, BuyButtonOverride buyButtonOverride) {
        this.visible = z;
        this.buyButtonOverride = buyButtonOverride;
    }

    public /* synthetic */ BuyButtonState(boolean z, BuyButtonOverride buyButtonOverride, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : buyButtonOverride);
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final BuyButtonOverride getBuyButtonOverride() {
        return this.buyButtonOverride;
    }

    /* compiled from: PaymentSheetScreen.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/navigation/BuyButtonState$BuyButtonOverride;", "", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "lockEnabled", "", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Z)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getLockEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BuyButtonOverride {
        public static final int $stable = 8;
        private final ResolvableString label;
        private final boolean lockEnabled;

        public static /* synthetic */ BuyButtonOverride copy$default(BuyButtonOverride buyButtonOverride, ResolvableString resolvableString, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                resolvableString = buyButtonOverride.label;
            }
            if ((i & 2) != 0) {
                z = buyButtonOverride.lockEnabled;
            }
            return buyButtonOverride.copy(resolvableString, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ResolvableString getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLockEnabled() {
            return this.lockEnabled;
        }

        public final BuyButtonOverride copy(ResolvableString label, boolean lockEnabled) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new BuyButtonOverride(label, lockEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuyButtonOverride)) {
                return false;
            }
            BuyButtonOverride buyButtonOverride = (BuyButtonOverride) other;
            return Intrinsics.areEqual(this.label, buyButtonOverride.label) && this.lockEnabled == buyButtonOverride.lockEnabled;
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + Boolean.hashCode(this.lockEnabled);
        }

        public String toString() {
            return "BuyButtonOverride(label=" + this.label + ", lockEnabled=" + this.lockEnabled + ")";
        }

        public BuyButtonOverride(ResolvableString label, boolean z) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.lockEnabled = z;
        }

        public final ResolvableString getLabel() {
            return this.label;
        }

        public final boolean getLockEnabled() {
            return this.lockEnabled;
        }
    }
}
