package com.stripe.android.link.ui.updatecard;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.CardUpdateParams;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateCardScreenState.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003Ja\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0013\u00101\u001a\u00020\t2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0011\u0010!\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0018¨\u00066"}, d2 = {"Lcom/stripe/android/link/ui/updatecard/UpdateCardScreenState;", "", "paymentDetailsId", "", "billingDetailsUpdateFlow", "Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "primaryButtonLabel", "Lcom/stripe/android/core/strings/ResolvableString;", "isDefault", "", "cardUpdateParams", "Lcom/stripe/android/paymentsheet/CardUpdateParams;", "preferredCardBrand", "Lcom/stripe/android/model/CardBrand;", "error", BaseSheetViewModel.SAVE_PROCESSING, "<init>", "(Ljava/lang/String;Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;Lcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/CardUpdateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/core/strings/ResolvableString;Z)V", "getPaymentDetailsId", "()Ljava/lang/String;", "getBillingDetailsUpdateFlow", "()Lcom/stripe/android/link/LinkScreen$UpdateCard$BillingDetailsUpdateFlow;", "getPrimaryButtonLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "()Z", "getCardUpdateParams", "()Lcom/stripe/android/paymentsheet/CardUpdateParams;", "getPreferredCardBrand", "()Lcom/stripe/android/model/CardBrand;", "getError", "getProcessing", "readyToSubmit", "getReadyToSubmit", "isBillingDetailsUpdateFlow", "primaryButtonState", "Lcom/stripe/android/link/ui/PrimaryButtonState;", "getPrimaryButtonState", "()Lcom/stripe/android/link/ui/PrimaryButtonState;", "shouldShowDefaultTag", "getShouldShowDefaultTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UpdateCardScreenState {
    public static final int $stable = 0;
    private final LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow;
    private final CardUpdateParams cardUpdateParams;
    private final ResolvableString error;
    private final boolean isDefault;
    private final String paymentDetailsId;
    private final CardBrand preferredCardBrand;
    private final ResolvableString primaryButtonLabel;
    private final boolean processing;

    public static /* synthetic */ UpdateCardScreenState copy$default(UpdateCardScreenState updateCardScreenState, String str, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, ResolvableString resolvableString, boolean z, CardUpdateParams cardUpdateParams, CardBrand cardBrand, ResolvableString resolvableString2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateCardScreenState.paymentDetailsId;
        }
        if ((i & 2) != 0) {
            billingDetailsUpdateFlow = updateCardScreenState.billingDetailsUpdateFlow;
        }
        if ((i & 4) != 0) {
            resolvableString = updateCardScreenState.primaryButtonLabel;
        }
        if ((i & 8) != 0) {
            z = updateCardScreenState.isDefault;
        }
        if ((i & 16) != 0) {
            cardUpdateParams = updateCardScreenState.cardUpdateParams;
        }
        if ((i & 32) != 0) {
            cardBrand = updateCardScreenState.preferredCardBrand;
        }
        if ((i & 64) != 0) {
            resolvableString2 = updateCardScreenState.error;
        }
        if ((i & 128) != 0) {
            z2 = updateCardScreenState.processing;
        }
        ResolvableString resolvableString3 = resolvableString2;
        boolean z3 = z2;
        CardUpdateParams cardUpdateParams2 = cardUpdateParams;
        CardBrand cardBrand2 = cardBrand;
        return updateCardScreenState.copy(str, billingDetailsUpdateFlow, resolvableString, z, cardUpdateParams2, cardBrand2, resolvableString3, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPaymentDetailsId() {
        return this.paymentDetailsId;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkScreen.UpdateCard.BillingDetailsUpdateFlow getBillingDetailsUpdateFlow() {
        return this.billingDetailsUpdateFlow;
    }

    /* renamed from: component3, reason: from getter */
    public final ResolvableString getPrimaryButtonLabel() {
        return this.primaryButtonLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component5, reason: from getter */
    public final CardUpdateParams getCardUpdateParams() {
        return this.cardUpdateParams;
    }

    /* renamed from: component6, reason: from getter */
    public final CardBrand getPreferredCardBrand() {
        return this.preferredCardBrand;
    }

    /* renamed from: component7, reason: from getter */
    public final ResolvableString getError() {
        return this.error;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getProcessing() {
        return this.processing;
    }

    public final UpdateCardScreenState copy(String paymentDetailsId, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, ResolvableString primaryButtonLabel, boolean isDefault, CardUpdateParams cardUpdateParams, CardBrand preferredCardBrand, ResolvableString error, boolean processing) {
        Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        return new UpdateCardScreenState(paymentDetailsId, billingDetailsUpdateFlow, primaryButtonLabel, isDefault, cardUpdateParams, preferredCardBrand, error, processing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateCardScreenState)) {
            return false;
        }
        UpdateCardScreenState updateCardScreenState = (UpdateCardScreenState) other;
        return Intrinsics.areEqual(this.paymentDetailsId, updateCardScreenState.paymentDetailsId) && Intrinsics.areEqual(this.billingDetailsUpdateFlow, updateCardScreenState.billingDetailsUpdateFlow) && Intrinsics.areEqual(this.primaryButtonLabel, updateCardScreenState.primaryButtonLabel) && this.isDefault == updateCardScreenState.isDefault && Intrinsics.areEqual(this.cardUpdateParams, updateCardScreenState.cardUpdateParams) && this.preferredCardBrand == updateCardScreenState.preferredCardBrand && Intrinsics.areEqual(this.error, updateCardScreenState.error) && this.processing == updateCardScreenState.processing;
    }

    public int hashCode() {
        int iHashCode = this.paymentDetailsId.hashCode() * 31;
        LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow = this.billingDetailsUpdateFlow;
        int iHashCode2 = (((((iHashCode + (billingDetailsUpdateFlow == null ? 0 : billingDetailsUpdateFlow.hashCode())) * 31) + this.primaryButtonLabel.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31;
        CardUpdateParams cardUpdateParams = this.cardUpdateParams;
        int iHashCode3 = (iHashCode2 + (cardUpdateParams == null ? 0 : cardUpdateParams.hashCode())) * 31;
        CardBrand cardBrand = this.preferredCardBrand;
        int iHashCode4 = (iHashCode3 + (cardBrand == null ? 0 : cardBrand.hashCode())) * 31;
        ResolvableString resolvableString = this.error;
        return ((iHashCode4 + (resolvableString != null ? resolvableString.hashCode() : 0)) * 31) + Boolean.hashCode(this.processing);
    }

    public String toString() {
        return "UpdateCardScreenState(paymentDetailsId=" + this.paymentDetailsId + ", billingDetailsUpdateFlow=" + this.billingDetailsUpdateFlow + ", primaryButtonLabel=" + this.primaryButtonLabel + ", isDefault=" + this.isDefault + ", cardUpdateParams=" + this.cardUpdateParams + ", preferredCardBrand=" + this.preferredCardBrand + ", error=" + this.error + ", processing=" + this.processing + ")";
    }

    public UpdateCardScreenState(String paymentDetailsId, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, ResolvableString primaryButtonLabel, boolean z, CardUpdateParams cardUpdateParams, CardBrand cardBrand, ResolvableString resolvableString, boolean z2) {
        Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        this.paymentDetailsId = paymentDetailsId;
        this.billingDetailsUpdateFlow = billingDetailsUpdateFlow;
        this.primaryButtonLabel = primaryButtonLabel;
        this.isDefault = z;
        this.cardUpdateParams = cardUpdateParams;
        this.preferredCardBrand = cardBrand;
        this.error = resolvableString;
        this.processing = z2;
    }

    public /* synthetic */ UpdateCardScreenState(String str, LinkScreen.UpdateCard.BillingDetailsUpdateFlow billingDetailsUpdateFlow, ResolvableString resolvableString, boolean z, CardUpdateParams cardUpdateParams, CardBrand cardBrand, ResolvableString resolvableString2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : billingDetailsUpdateFlow, resolvableString, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : cardUpdateParams, (i & 32) != 0 ? null : cardBrand, (i & 64) != 0 ? null : resolvableString2, (i & 128) != 0 ? false : z2);
    }

    public final String getPaymentDetailsId() {
        return this.paymentDetailsId;
    }

    public final LinkScreen.UpdateCard.BillingDetailsUpdateFlow getBillingDetailsUpdateFlow() {
        return this.billingDetailsUpdateFlow;
    }

    public final ResolvableString getPrimaryButtonLabel() {
        return this.primaryButtonLabel;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final CardUpdateParams getCardUpdateParams() {
        return this.cardUpdateParams;
    }

    public final CardBrand getPreferredCardBrand() {
        return this.preferredCardBrand;
    }

    public final ResolvableString getError() {
        return this.error;
    }

    public final boolean getProcessing() {
        return this.processing;
    }

    private final boolean getReadyToSubmit() {
        return this.cardUpdateParams != null;
    }

    public final boolean isBillingDetailsUpdateFlow() {
        return this.billingDetailsUpdateFlow != null;
    }

    public final PrimaryButtonState getPrimaryButtonState() {
        return !getReadyToSubmit() ? PrimaryButtonState.Disabled : this.processing ? PrimaryButtonState.Processing : PrimaryButtonState.Enabled;
    }

    public final boolean getShouldShowDefaultTag() {
        return this.isDefault && !isBillingDetailsUpdateFlow();
    }
}
