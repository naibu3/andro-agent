package com.stripe.android.view;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.SingleChoiceDropdownItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardBrandChoice.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/CardBrandChoice;", "Lcom/stripe/android/uicore/elements/SingleChoiceDropdownItem;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", PaymentSheetAppearanceKeys.ICON, "", ViewProps.ENABLED, "", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Z", "component1", "component2", "component3", "copy", "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/Integer;Z)Lcom/stripe/android/view/CardBrandChoice;", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardBrandChoice implements SingleChoiceDropdownItem {
    public static final int $stable = 8;
    private final boolean enabled;
    private final Integer icon;
    private final ResolvableString label;

    public static /* synthetic */ CardBrandChoice copy$default(CardBrandChoice cardBrandChoice, ResolvableString resolvableString, Integer num, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            resolvableString = cardBrandChoice.label;
        }
        if ((i & 2) != 0) {
            num = cardBrandChoice.icon;
        }
        if ((i & 4) != 0) {
            z = cardBrandChoice.enabled;
        }
        return cardBrandChoice.copy(resolvableString, num, z);
    }

    /* renamed from: component1, reason: from getter */
    public final ResolvableString getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final CardBrandChoice copy(ResolvableString label, Integer icon, boolean enabled) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new CardBrandChoice(label, icon, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardBrandChoice)) {
            return false;
        }
        CardBrandChoice cardBrandChoice = (CardBrandChoice) other;
        return Intrinsics.areEqual(this.label, cardBrandChoice.label) && Intrinsics.areEqual(this.icon, cardBrandChoice.icon) && this.enabled == cardBrandChoice.enabled;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        Integer num = this.icon;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "CardBrandChoice(label=" + this.label + ", icon=" + this.icon + ", enabled=" + this.enabled + ")";
    }

    public CardBrandChoice(ResolvableString label, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.icon = num;
        this.enabled = z;
    }

    @Override // com.stripe.android.uicore.elements.SingleChoiceDropdownItem
    public ResolvableString getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.SingleChoiceDropdownItem
    public Integer getIcon() {
        return this.icon;
    }

    @Override // com.stripe.android.uicore.elements.SingleChoiceDropdownItem
    public boolean getEnabled() {
        return this.enabled;
    }
}
