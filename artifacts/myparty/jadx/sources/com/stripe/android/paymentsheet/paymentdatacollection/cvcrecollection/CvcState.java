package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.CvcConfig;
import com.stripe.android.uicore.elements.TextFieldIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcState.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0012HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcState;", "", "cvc", "", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)V", "getCvc", "()Ljava/lang/String;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "cvcTextFieldConfig", "Lcom/stripe/android/ui/core/elements/CvcConfig;", "isValid", "", "()Z", "label", "", "getLabel", "()I", "cvcIcon", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "getCvcIcon", "()Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;", "updateCvc", "component1", "component2", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CvcState {
    public static final int $stable = 0;
    private final CardBrand cardBrand;
    private final String cvc;
    private final TextFieldIcon.Trailing cvcIcon;
    private final CvcConfig cvcTextFieldConfig;
    private final boolean isValid;
    private final int label;

    public static /* synthetic */ CvcState copy$default(CvcState cvcState, String str, CardBrand cardBrand, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvcState.cvc;
        }
        if ((i & 2) != 0) {
            cardBrand = cvcState.cardBrand;
        }
        return cvcState.copy(str, cardBrand);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    /* renamed from: component2, reason: from getter */
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final CvcState copy(String cvc, CardBrand cardBrand) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        return new CvcState(cvc, cardBrand);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvcState)) {
            return false;
        }
        CvcState cvcState = (CvcState) other;
        return Intrinsics.areEqual(this.cvc, cvcState.cvc) && this.cardBrand == cvcState.cardBrand;
    }

    public int hashCode() {
        return (this.cvc.hashCode() * 31) + this.cardBrand.hashCode();
    }

    public String toString() {
        return "CvcState(cvc=" + this.cvc + ", cardBrand=" + this.cardBrand + ")";
    }

    public CvcState(String cvc, CardBrand cardBrand) {
        int i;
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        this.cvc = cvc;
        this.cardBrand = cardBrand;
        CvcConfig cvcConfig = new CvcConfig();
        this.cvcTextFieldConfig = cvcConfig;
        this.isValid = cvcConfig.determineState(cardBrand, cvc, cardBrand.getMaxCvcLength()).isValid();
        if (cardBrand == CardBrand.AmericanExpress) {
            i = R.string.stripe_cvc_amex_hint;
        } else {
            i = R.string.stripe_cvc_number_hint;
        }
        this.label = i;
        this.cvcIcon = new TextFieldIcon.Trailing(cardBrand.getCvcIcon(), null, false, null, 10, null);
    }

    public final String getCvc() {
        return this.cvc;
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public final int getLabel() {
        return this.label;
    }

    public final TextFieldIcon.Trailing getCvcIcon() {
        return this.cvcIcon;
    }

    public final CvcState updateCvc(String cvc) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return cvc.length() > this.cardBrand.getMaxCvcLength() ? this : new CvcState(cvc, this.cardBrand);
    }
}
