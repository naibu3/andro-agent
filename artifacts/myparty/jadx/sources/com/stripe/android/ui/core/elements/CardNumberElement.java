package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardNumberElement.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "_identifier", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "controller", "Lcom/stripe/android/ui/core/elements/CardNumberController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/CardNumberController;)V", "get_identifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getController", "()Lcom/stripe/android/ui/core/elements/CardNumberController;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "setRawValue", "", "rawValuesMap", "", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardNumberElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final IdentifierSpec _identifier;
    private final boolean allowsUserInteraction;
    private final CardNumberController controller;
    private final ResolvableString mandateText;

    public static /* synthetic */ CardNumberElement copy$default(CardNumberElement cardNumberElement, IdentifierSpec identifierSpec, CardNumberController cardNumberController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = cardNumberElement._identifier;
        }
        if ((i & 2) != 0) {
            cardNumberController = cardNumberElement.controller;
        }
        return cardNumberElement.copy(identifierSpec, cardNumberController);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec get_identifier() {
        return this._identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final CardNumberController getController() {
        return this.controller;
    }

    public final CardNumberElement copy(IdentifierSpec _identifier, CardNumberController controller) {
        Intrinsics.checkNotNullParameter(_identifier, "_identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new CardNumberElement(_identifier, controller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardNumberElement)) {
            return false;
        }
        CardNumberElement cardNumberElement = (CardNumberElement) other;
        return Intrinsics.areEqual(this._identifier, cardNumberElement._identifier) && Intrinsics.areEqual(this.controller, cardNumberElement.controller);
    }

    public int hashCode() {
        return (this._identifier.hashCode() * 31) + this.controller.hashCode();
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
    }

    public String toString() {
        return "CardNumberElement(_identifier=" + this._identifier + ", controller=" + this.controller + ")";
    }

    public final IdentifierSpec get_identifier() {
        return this._identifier;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public CardNumberController getController() {
        return this.controller;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberElement(IdentifierSpec _identifier, CardNumberController controller) {
        super(_identifier);
        Intrinsics.checkNotNullParameter(_identifier, "_identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this._identifier = _identifier;
        this.controller = controller;
        this.allowsUserInteraction = true;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }
}
