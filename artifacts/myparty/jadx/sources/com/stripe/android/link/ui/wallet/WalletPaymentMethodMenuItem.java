package com.stripe.android.link.ui.wallet;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.ui.menu.LinkMenuItem;
import com.stripe.android.paymentsheet.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletPaymentMethodMenuItem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "Lcom/stripe/android/link/ui/menu/LinkMenuItem;", "text", "Lcom/stripe/android/core/strings/ResolvableString;", "testTag", "", "isDestructive", "", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Z)V", "getText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getTestTag", "()Ljava/lang/String;", "()Z", "RemoveItem", "SetAsDefault", "Update", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class WalletPaymentMethodMenuItem implements LinkMenuItem {
    public static final int $stable = 8;
    private final boolean isDestructive;
    private final String testTag;
    private final ResolvableString text;

    public /* synthetic */ WalletPaymentMethodMenuItem(ResolvableString resolvableString, String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, str, z);
    }

    private WalletPaymentMethodMenuItem(ResolvableString resolvableString, String str, boolean z) {
        this.text = resolvableString;
        this.testTag = str;
        this.isDestructive = z;
    }

    public /* synthetic */ WalletPaymentMethodMenuItem(ResolvableString resolvableString, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolvableString, str, (i & 4) != 0 ? false : z, null);
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    public ResolvableString getText() {
        return this.text;
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    public String getTestTag() {
        return this.testTag;
    }

    @Override // com.stripe.android.link.ui.menu.LinkMenuItem
    /* renamed from: isDestructive, reason: from getter */
    public boolean getIsDestructive() {
        return this.isDestructive;
    }

    /* compiled from: WalletPaymentMethodMenuItem.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "text", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "getText", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveItem extends WalletPaymentMethodMenuItem {
        public static final int $stable = 8;
        private final ResolvableString text;

        public static /* synthetic */ RemoveItem copy$default(RemoveItem removeItem, ResolvableString resolvableString, int i, Object obj) {
            if ((i & 1) != 0) {
                resolvableString = removeItem.text;
            }
            return removeItem.copy(resolvableString);
        }

        /* renamed from: component1, reason: from getter */
        public final ResolvableString getText() {
            return this.text;
        }

        public final RemoveItem copy(ResolvableString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new RemoveItem(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RemoveItem) && Intrinsics.areEqual(this.text, ((RemoveItem) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "RemoveItem(text=" + this.text + ")";
        }

        @Override // com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuItem, com.stripe.android.link.ui.menu.LinkMenuItem
        public ResolvableString getText() {
            return this.text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveItem(ResolvableString text) {
            super(text, WalletPaymentMethodMenuItemKt.WALLET_MENU_REMOVE_ITEM_TAG, true, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }
    }

    /* compiled from: WalletPaymentMethodMenuItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetAsDefault extends WalletPaymentMethodMenuItem {
        public static final int $stable = 0;
        public static final SetAsDefault INSTANCE = new SetAsDefault();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetAsDefault)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -885878025;
        }

        public String toString() {
            return "SetAsDefault";
        }

        private SetAsDefault() {
            super(ResolvableStringUtilsKt.getResolvableString(R.string.stripe_wallet_set_as_default), WalletPaymentMethodMenuItemKt.WALLET_MENU_SET_AS_DEFAULT_TAG, false, 4, null);
        }
    }

    /* compiled from: WalletPaymentMethodMenuItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;", "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Update extends WalletPaymentMethodMenuItem {
        public static final int $stable = 0;
        public static final Update INSTANCE = new Update();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Update)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -314711085;
        }

        public String toString() {
            return "Update";
        }

        private Update() {
            super(ResolvableStringUtilsKt.getResolvableString(R.string.stripe_link_wallet_menu_action_update_card), WalletPaymentMethodMenuItemKt.WALLET_MENU_UPDATE_TAG, false, 4, null);
        }
    }
}
