package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.R;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AuBecsDebitMandateTextElement.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u0019H\u0016J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextElement;", "Lcom/stripe/android/uicore/elements/FormElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "merchantName", "", "controller", "Lcom/stripe/android/uicore/elements/InputController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/InputController;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getMerchantName", "()Ljava/lang/String;", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AuBecsDebitMandateTextElement implements FormElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;
    private final String merchantName;

    public static /* synthetic */ AuBecsDebitMandateTextElement copy$default(AuBecsDebitMandateTextElement auBecsDebitMandateTextElement, IdentifierSpec identifierSpec, String str, InputController inputController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = auBecsDebitMandateTextElement.identifier;
        }
        if ((i & 2) != 0) {
            str = auBecsDebitMandateTextElement.merchantName;
        }
        if ((i & 4) != 0) {
            inputController = auBecsDebitMandateTextElement.controller;
        }
        return auBecsDebitMandateTextElement.copy(identifierSpec, str, inputController);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component3, reason: from getter */
    public final InputController getController() {
        return this.controller;
    }

    public final AuBecsDebitMandateTextElement copy(IdentifierSpec identifier, String merchantName, InputController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new AuBecsDebitMandateTextElement(identifier, merchantName, controller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuBecsDebitMandateTextElement)) {
            return false;
        }
        AuBecsDebitMandateTextElement auBecsDebitMandateTextElement = (AuBecsDebitMandateTextElement) other;
        return Intrinsics.areEqual(this.identifier, auBecsDebitMandateTextElement.identifier) && Intrinsics.areEqual(this.merchantName, auBecsDebitMandateTextElement.merchantName) && Intrinsics.areEqual(this.controller, auBecsDebitMandateTextElement.controller);
    }

    public int hashCode() {
        int iHashCode = this.identifier.hashCode() * 31;
        String str = this.merchantName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InputController inputController = this.controller;
        return iHashCode2 + (inputController != null ? inputController.hashCode() : 0);
    }

    public String toString() {
        return "AuBecsDebitMandateTextElement(identifier=" + this.identifier + ", merchantName=" + this.merchantName + ", controller=" + this.controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public AuBecsDebitMandateTextElement(IdentifierSpec identifier, String str, InputController inputController) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        this.merchantName = str;
        this.controller = inputController;
        this.mandateText = ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_au_becs_mandate, new Object[]{str == null ? "" : str}, null, 4, null);
    }

    public /* synthetic */ AuBecsDebitMandateTextElement(IdentifierSpec identifierSpec, String str, InputController inputController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, str, (i & 4) != 0 ? null : inputController);
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InputController getController() {
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
        return StateFlowsKt.stateFlowOf(CollectionsKt.emptyList());
    }
}
