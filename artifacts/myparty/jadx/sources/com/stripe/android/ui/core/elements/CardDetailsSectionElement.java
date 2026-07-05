package com.stripe.android.ui.core.elements;

import com.stripe.android.CardBrandFilter;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardDetailsSectionElement.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\"0!0 H\u0016J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060!0 H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsSectionElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "elementsSessionId", "collectName", "", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", NotificationsService.IDENTIFIER_KEY, "controller", "Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;Ljava/lang/String;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getController", "()Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;", "allowsUserInteraction", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getTextFieldIdentifiers", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDetailsSectionElement implements FormElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final CardBrandFilter cardBrandFilter;
    private final CardBrandChoiceEligibility cbcEligibility;
    private final boolean collectName;
    private final CardDetailsSectionController controller;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;

    public CardDetailsSectionElement(CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, String str, boolean z, CardBrandChoiceEligibility cbcEligibility, CardBrandFilter cardBrandFilter, IdentifierSpec identifier, CardDetailsSectionController controller) {
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.collectName = z;
        this.cbcEligibility = cbcEligibility;
        this.cardBrandFilter = cardBrandFilter;
        this.identifier = identifier;
        this.controller = controller;
        this.allowsUserInteraction = true;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CardDetailsSectionElement(com.stripe.android.cards.CardAccountRangeRepository.Factory r11, java.util.Map r12, java.lang.String r13, boolean r14, com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility r15, com.stripe.android.CardBrandFilter r16, com.stripe.android.uicore.elements.IdentifierSpec r17, com.stripe.android.ui.core.elements.CardDetailsSectionController r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 4
            if (r1 == 0) goto L7
            r13 = 0
        L7:
            r6 = r13
            r13 = r0 & 8
            if (r13 == 0) goto Lf
            r13 = 0
            r3 = r13
            goto L10
        Lf:
            r3 = r14
        L10:
            r13 = r0 & 16
            if (r13 == 0) goto L1a
            com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility$Ineligible r13 = com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility.Ineligible.INSTANCE
            com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility r13 = (com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility) r13
            r5 = r13
            goto L1b
        L1a:
            r5 = r15
        L1b:
            r13 = r0 & 32
            if (r13 == 0) goto L24
            com.stripe.android.DefaultCardBrandFilter r13 = com.stripe.android.DefaultCardBrandFilter.INSTANCE
            com.stripe.android.CardBrandFilter r13 = (com.stripe.android.CardBrandFilter) r13
            goto L26
        L24:
            r13 = r16
        L26:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L3b
            com.stripe.android.ui.core.elements.CardDetailsSectionController r0 = new com.stripe.android.ui.core.elements.CardDetailsSectionController
            r1 = r11
            r2 = r12
            r4 = r5
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r13 = r6
            r8 = r0
            r6 = r5
            r5 = r4
            r7 = r17
            r0 = r10
            goto L45
        L3b:
            r9 = r6
            r6 = r13
            r13 = r9
            r8 = r18
            r0 = r10
            r1 = r11
            r2 = r12
            r7 = r17
        L45:
            r4 = r3
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardDetailsSectionElement.<init>(com.stripe.android.cards.CardAccountRangeRepository$Factory, java.util.Map, java.lang.String, boolean, com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility, com.stripe.android.CardBrandFilter, com.stripe.android.uicore.elements.IdentifierSpec, com.stripe.android.ui.core.elements.CardDetailsSectionController, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public CardDetailsSectionController getController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return getController().getCardDetailsElement().getFormFieldValueFlow();
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return getController().getCardDetailsElement().getTextFieldIdentifiers();
    }
}
