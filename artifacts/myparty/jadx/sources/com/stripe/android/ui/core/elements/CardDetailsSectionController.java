package com.stripe.android.ui.core.elements;

import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.ui.core.DefaultIsStripeCardScanAvailable;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardDetailsSectionController.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "collectName", "", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "elementsSessionId", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;)V", "getElementsSessionId", "()Ljava/lang/String;", "cardDetailsElement", "Lcom/stripe/android/ui/core/elements/CardDetailsElement;", "getCardDetailsElement$payments_ui_core_release", "()Lcom/stripe/android/ui/core/elements/CardDetailsElement;", "isCardScanEnabled", "isCardScanEnabled$payments_ui_core_release", "()Z", "isStripeCardScanAvailable", "Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;", "isStripeCardScanAvailable$payments_ui_core_release", "()Lcom/stripe/android/ui/core/DefaultIsStripeCardScanAvailable;", "error", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDetailsSectionController implements SectionFieldErrorController {
    public static final int $stable = 8;
    private final CardDetailsElement cardDetailsElement;
    private final String elementsSessionId;
    private final StateFlow<FieldError> error;
    private final boolean isCardScanEnabled;
    private final DefaultIsStripeCardScanAvailable isStripeCardScanAvailable;

    public CardDetailsSectionController(CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, boolean z, CardBrandChoiceEligibility cbcEligibility, CardBrandFilter cardBrandFilter, String str) {
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        this.elementsSessionId = str;
        CardDetailsElement cardDetailsElement = new CardDetailsElement(IdentifierSpec.INSTANCE.Generic("card_detail"), cardAccountRangeRepositoryFactory, initialValues, z, cbcEligibility, cardBrandFilter, null, 64, null);
        this.cardDetailsElement = cardDetailsElement;
        this.isCardScanEnabled = cardDetailsElement.getIsCardScanEnabled();
        this.isStripeCardScanAvailable = new DefaultIsStripeCardScanAvailable();
        this.error = cardDetailsElement.getController().getError();
    }

    public /* synthetic */ CardDetailsSectionController(CardAccountRangeRepository.Factory factory, Map map, boolean z, CardBrandChoiceEligibility.Ineligible ineligible, DefaultCardBrandFilter defaultCardBrandFilter, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(factory, map, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CardBrandChoiceEligibility.Ineligible.INSTANCE : ineligible, (i & 16) != 0 ? DefaultCardBrandFilter.INSTANCE : defaultCardBrandFilter, (i & 32) != 0 ? null : str);
    }

    public final String getElementsSessionId() {
        return this.elementsSessionId;
    }

    /* renamed from: getCardDetailsElement$payments_ui_core_release, reason: from getter */
    public final CardDetailsElement getCardDetailsElement() {
        return this.cardDetailsElement;
    }

    /* renamed from: isCardScanEnabled$payments_ui_core_release, reason: from getter */
    public final boolean getIsCardScanEnabled() {
        return this.isCardScanEnabled;
    }

    /* renamed from: isStripeCardScanAvailable$payments_ui_core_release, reason: from getter */
    public final DefaultIsStripeCardScanAvailable getIsStripeCardScanAvailable() {
        return this.isStripeCardScanAvailable;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }
}
