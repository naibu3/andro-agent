package com.stripe.android.ui.core.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AutofillType;
import com.stripe.android.model.CardBrand;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldIcon;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardNumberController.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/ui/core/elements/CardNumberController;", "Lcom/stripe/android/uicore/elements/TextFieldController;", "<init>", "()V", "cardBrandFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/model/CardBrand;", "getCardBrandFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "selectedCardBrandFlow", "getSelectedCardBrandFlow", "cardScanEnabled", "", "getCardScanEnabled", "()Z", "autofillType", "Landroidx/compose/ui/autofill/AutofillType;", "getAutofillType$annotations", "getAutofillType", "()Landroidx/compose/ui/autofill/AutofillType;", "onCardScanResult", "", "cardScanSheetResult", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CardNumberController implements TextFieldController {
    public static final int $stable = 0;
    private final AutofillType autofillType;

    public /* synthetic */ CardNumberController(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getAutofillType$annotations() {
    }

    public abstract StateFlow<CardBrand> getCardBrandFlow();

    public abstract boolean getCardScanEnabled();

    public abstract StateFlow<CardBrand> getSelectedCardBrandFlow();

    private CardNumberController() {
        this.autofillType = AutofillType.CreditCardNumber;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement sectionFieldElement, Modifier modifier, Set<IdentifierSpec> set, IdentifierSpec identifierSpec, Composer composer, int i) {
        TextFieldController.DefaultImpls.ComposeUI(this, z, sectionFieldElement, modifier, set, identifierSpec, composer, i);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public boolean getEnabled() {
        return TextFieldController.DefaultImpls.getEnabled(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<String> getPlaceHolder() {
        return TextFieldController.DefaultImpls.getPlaceHolder(this);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onDropdownItemClicked(TextFieldIcon.Dropdown.Item item) {
        TextFieldController.DefaultImpls.onDropdownItemClicked(this, item);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public AutofillType getAutofillType() {
        return this.autofillType;
    }

    public final void onCardScanResult(CardScanSheetResult cardScanSheetResult) {
        Intrinsics.checkNotNullParameter(cardScanSheetResult, "cardScanSheetResult");
        if (cardScanSheetResult instanceof CardScanSheetResult.Completed) {
            onRawValueChange(((CardScanSheetResult.Completed) cardScanSheetResult).getScannedCard().getPan());
        }
    }
}
