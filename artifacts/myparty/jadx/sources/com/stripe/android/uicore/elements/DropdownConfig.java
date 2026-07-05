package com.stripe.android.uicore.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DropdownConfig.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/uicore/elements/DropdownConfig;", "", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "rawItems", "", "getRawItems", "()Ljava/util/List;", "displayItems", "getDisplayItems", "mode", "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;", "getMode", "()Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;", "disableDropdownWithSingleElement", "", "getDisableDropdownWithSingleElement", "()Z", "getSelectedItemLabel", "index", "", "convertFromRaw", "rawValue", "Mode", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DropdownConfig {
    String convertFromRaw(String rawValue);

    String getDebugLabel();

    boolean getDisableDropdownWithSingleElement();

    List<String> getDisplayItems();

    ResolvableString getLabel();

    Mode getMode();

    List<String> getRawItems();

    String getSelectedItemLabel(int index);

    /* compiled from: DropdownConfig.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getDisableDropdownWithSingleElement(DropdownConfig dropdownConfig) {
            return false;
        }

        public static Mode getMode(DropdownConfig dropdownConfig) {
            return new Mode.Full(false, 1, null);
        }
    }

    /* compiled from: DropdownConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;", "", "Condensed", "Full", "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Condensed;", "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Mode {

        /* compiled from: DropdownConfig.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Condensed;", "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Condensed implements Mode {
            public static final int $stable = 0;
            public static final Condensed INSTANCE = new Condensed();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Condensed)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 409102248;
            }

            public String toString() {
                return "Condensed";
            }

            private Condensed() {
            }
        }

        /* compiled from: DropdownConfig.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Full;", "Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;", "selectsFirstOptionAsDefault", "", "<init>", "(Z)V", "getSelectsFirstOptionAsDefault", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Full implements Mode {
            public static final int $stable = 0;
            private final boolean selectsFirstOptionAsDefault;

            public Full() {
                this(false, 1, null);
            }

            public static /* synthetic */ Full copy$default(Full full, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = full.selectsFirstOptionAsDefault;
                }
                return full.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getSelectsFirstOptionAsDefault() {
                return this.selectsFirstOptionAsDefault;
            }

            public final Full copy(boolean selectsFirstOptionAsDefault) {
                return new Full(selectsFirstOptionAsDefault);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Full) && this.selectsFirstOptionAsDefault == ((Full) other).selectsFirstOptionAsDefault;
            }

            public int hashCode() {
                return Boolean.hashCode(this.selectsFirstOptionAsDefault);
            }

            public String toString() {
                return "Full(selectsFirstOptionAsDefault=" + this.selectsFirstOptionAsDefault + ")";
            }

            public Full(boolean z) {
                this.selectsFirstOptionAsDefault = z;
            }

            public /* synthetic */ Full(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? true : z);
            }

            public final boolean getSelectsFirstOptionAsDefault() {
                return this.selectsFirstOptionAsDefault;
            }
        }
    }
}
