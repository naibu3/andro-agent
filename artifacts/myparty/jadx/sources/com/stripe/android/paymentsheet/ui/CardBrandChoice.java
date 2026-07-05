package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.elements.SingleChoiceDropdownItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardBrandChoice.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\rHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;", "brand", "Lcom/stripe/android/model/CardBrand;", ViewProps.ENABLED, "", "<init>", "(Lcom/stripe/android/model/CardBrand;Z)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getEnabled", "()Z", PaymentSheetAppearanceKeys.ICON, "", "getIcon", "()Ljava/lang/Integer;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "component2", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardBrandChoice implements SingleChoiceDropdownItem {
    public static final int $stable = 0;
    private final CardBrand brand;
    private final boolean enabled;

    public static /* synthetic */ CardBrandChoice copy$default(CardBrandChoice cardBrandChoice, CardBrand cardBrand, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cardBrand = cardBrandChoice.brand;
        }
        if ((i & 2) != 0) {
            z = cardBrandChoice.enabled;
        }
        return cardBrandChoice.copy(cardBrand, z);
    }

    /* renamed from: component1, reason: from getter */
    public final CardBrand getBrand() {
        return this.brand;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final CardBrandChoice copy(CardBrand brand, boolean enabled) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        return new CardBrandChoice(brand, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBrandChoice)) {
            return false;
        }
        CardBrandChoice cardBrandChoice = (CardBrandChoice) other;
        return this.brand == cardBrandChoice.brand && this.enabled == cardBrandChoice.enabled;
    }

    public int hashCode() {
        return (this.brand.hashCode() * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "CardBrandChoice(brand=" + this.brand + ", enabled=" + this.enabled + ")";
    }

    public CardBrandChoice(CardBrand brand, boolean z) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.brand = brand;
        this.enabled = z;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    @Override // com.stripe.android.uicore.elements.SingleChoiceDropdownItem
    public boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.stripe.android.uicore.elements.SingleChoiceDropdownItem
    public Integer getIcon() {
        return Integer.valueOf(this.brand.getIcon());
    }

    @Override // com.stripe.android.uicore.elements.SingleChoiceDropdownItem
    public ResolvableString getLabel() {
        if (getEnabled()) {
            return ResolvableStringUtilsKt.getResolvableString(this.brand.getDisplayName());
        }
        return ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_card_brand_not_accepted_with_brand, new Object[]{this.brand.getDisplayName()}, null, 4, null);
    }
}
