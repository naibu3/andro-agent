package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardDetailsEntry.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/CardDetailsEntry;", "", "cardBrandChoice", "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "expiryDateState", "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;", "<init>", "(Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;)V", "getCardBrandChoice", "()Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "getExpiryDateState", "()Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;", "hasChanged", "", "editCardPayload", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "originalCardBrandChoice", "isComplete", "expiryDateHasChanged", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardDetailsEntry {
    public static final int $stable = 0;
    private final CardBrandChoice cardBrandChoice;
    private final ExpiryDateState expiryDateState;

    public static /* synthetic */ CardDetailsEntry copy$default(CardDetailsEntry cardDetailsEntry, CardBrandChoice cardBrandChoice, ExpiryDateState expiryDateState, int i, Object obj) {
        if ((i & 1) != 0) {
            cardBrandChoice = cardDetailsEntry.cardBrandChoice;
        }
        if ((i & 2) != 0) {
            expiryDateState = cardDetailsEntry.expiryDateState;
        }
        return cardDetailsEntry.copy(cardBrandChoice, expiryDateState);
    }

    /* renamed from: component1, reason: from getter */
    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    /* renamed from: component2, reason: from getter */
    public final ExpiryDateState getExpiryDateState() {
        return this.expiryDateState;
    }

    public final CardDetailsEntry copy(CardBrandChoice cardBrandChoice, ExpiryDateState expiryDateState) {
        Intrinsics.checkNotNullParameter(cardBrandChoice, "cardBrandChoice");
        Intrinsics.checkNotNullParameter(expiryDateState, "expiryDateState");
        return new CardDetailsEntry(cardBrandChoice, expiryDateState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetailsEntry)) {
            return false;
        }
        CardDetailsEntry cardDetailsEntry = (CardDetailsEntry) other;
        return Intrinsics.areEqual(this.cardBrandChoice, cardDetailsEntry.cardBrandChoice) && Intrinsics.areEqual(this.expiryDateState, cardDetailsEntry.expiryDateState);
    }

    public int hashCode() {
        return (this.cardBrandChoice.hashCode() * 31) + this.expiryDateState.hashCode();
    }

    public String toString() {
        return "CardDetailsEntry(cardBrandChoice=" + this.cardBrandChoice + ", expiryDateState=" + this.expiryDateState + ")";
    }

    public CardDetailsEntry(CardBrandChoice cardBrandChoice, ExpiryDateState expiryDateState) {
        Intrinsics.checkNotNullParameter(cardBrandChoice, "cardBrandChoice");
        Intrinsics.checkNotNullParameter(expiryDateState, "expiryDateState");
        this.cardBrandChoice = cardBrandChoice;
        this.expiryDateState = expiryDateState;
    }

    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    public final ExpiryDateState getExpiryDateState() {
        return this.expiryDateState;
    }

    public final boolean hasChanged(EditCardPayload editCardPayload, CardBrandChoice originalCardBrandChoice) {
        Intrinsics.checkNotNullParameter(editCardPayload, "editCardPayload");
        Intrinsics.checkNotNullParameter(originalCardBrandChoice, "originalCardBrandChoice");
        return !Intrinsics.areEqual(originalCardBrandChoice, this.cardBrandChoice) || expiryDateHasChanged(editCardPayload);
    }

    public final boolean isComplete() {
        if (this.expiryDateState.getEnabled()) {
            return (this.expiryDateState.getExpiryMonth() == null || this.expiryDateState.getExpiryYear() == null) ? false : true;
        }
        return true;
    }

    private final boolean expiryDateHasChanged(EditCardPayload editCardPayload) {
        return (Intrinsics.areEqual(editCardPayload.getExpiryMonth(), this.expiryDateState.getExpiryMonth()) && Intrinsics.areEqual(editCardPayload.getExpiryYear(), this.expiryDateState.getExpiryYear())) ? false : true;
    }
}
