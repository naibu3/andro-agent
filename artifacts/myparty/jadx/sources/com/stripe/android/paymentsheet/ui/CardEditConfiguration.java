package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.CardBrandFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditCardDetailsInteractor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/CardEditConfiguration;", "", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "isCbcModifiable", "", "areExpiryDateAndAddressModificationSupported", "<init>", "(Lcom/stripe/android/CardBrandFilter;ZZ)V", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "()Z", "getAreExpiryDateAndAddressModificationSupported", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CardEditConfiguration {
    public static final int $stable = 8;
    private final boolean areExpiryDateAndAddressModificationSupported;
    private final CardBrandFilter cardBrandFilter;
    private final boolean isCbcModifiable;

    public static /* synthetic */ CardEditConfiguration copy$default(CardEditConfiguration cardEditConfiguration, CardBrandFilter cardBrandFilter, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            cardBrandFilter = cardEditConfiguration.cardBrandFilter;
        }
        if ((i & 2) != 0) {
            z = cardEditConfiguration.isCbcModifiable;
        }
        if ((i & 4) != 0) {
            z2 = cardEditConfiguration.areExpiryDateAndAddressModificationSupported;
        }
        return cardEditConfiguration.copy(cardBrandFilter, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCbcModifiable() {
        return this.isCbcModifiable;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAreExpiryDateAndAddressModificationSupported() {
        return this.areExpiryDateAndAddressModificationSupported;
    }

    public final CardEditConfiguration copy(CardBrandFilter cardBrandFilter, boolean isCbcModifiable, boolean areExpiryDateAndAddressModificationSupported) {
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        return new CardEditConfiguration(cardBrandFilter, isCbcModifiable, areExpiryDateAndAddressModificationSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardEditConfiguration)) {
            return false;
        }
        CardEditConfiguration cardEditConfiguration = (CardEditConfiguration) other;
        return Intrinsics.areEqual(this.cardBrandFilter, cardEditConfiguration.cardBrandFilter) && this.isCbcModifiable == cardEditConfiguration.isCbcModifiable && this.areExpiryDateAndAddressModificationSupported == cardEditConfiguration.areExpiryDateAndAddressModificationSupported;
    }

    public int hashCode() {
        return (((this.cardBrandFilter.hashCode() * 31) + Boolean.hashCode(this.isCbcModifiable)) * 31) + Boolean.hashCode(this.areExpiryDateAndAddressModificationSupported);
    }

    public String toString() {
        return "CardEditConfiguration(cardBrandFilter=" + this.cardBrandFilter + ", isCbcModifiable=" + this.isCbcModifiable + ", areExpiryDateAndAddressModificationSupported=" + this.areExpiryDateAndAddressModificationSupported + ")";
    }

    public CardEditConfiguration(CardBrandFilter cardBrandFilter, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        this.cardBrandFilter = cardBrandFilter;
        this.isCbcModifiable = z;
        this.areExpiryDateAndAddressModificationSupported = z2;
    }

    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    public final boolean isCbcModifiable() {
        return this.isCbcModifiable;
    }

    public final boolean getAreExpiryDateAndAddressModificationSupported() {
        return this.areExpiryDateAndAddressModificationSupported;
    }
}
