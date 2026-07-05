package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
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

/* compiled from: StaticTextElement.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ \u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b0\u001aH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006("}, d2 = {"Lcom/stripe/android/ui/core/elements/StaticTextElement;", "Lcom/stripe/android/uicore/elements/FormElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "text", "Lcom/stripe/android/core/strings/ResolvableString;", "controller", "Lcom/stripe/android/uicore/elements/InputController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/uicore/elements/InputController;)V", "stringResId", "", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/uicore/elements/InputController;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "getMandateText", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StaticTextElement implements FormElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;
    private final ResolvableString text;

    public static /* synthetic */ StaticTextElement copy$default(StaticTextElement staticTextElement, IdentifierSpec identifierSpec, ResolvableString resolvableString, InputController inputController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = staticTextElement.identifier;
        }
        if ((i & 2) != 0) {
            resolvableString = staticTextElement.text;
        }
        if ((i & 4) != 0) {
            inputController = staticTextElement.controller;
        }
        return staticTextElement.copy(identifierSpec, resolvableString, inputController);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final ResolvableString getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final InputController getController() {
        return this.controller;
    }

    public final StaticTextElement copy(IdentifierSpec identifier, ResolvableString text, InputController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(text, "text");
        return new StaticTextElement(identifier, text, controller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticTextElement)) {
            return false;
        }
        StaticTextElement staticTextElement = (StaticTextElement) other;
        return Intrinsics.areEqual(this.identifier, staticTextElement.identifier) && Intrinsics.areEqual(this.text, staticTextElement.text) && Intrinsics.areEqual(this.controller, staticTextElement.controller);
    }

    public int hashCode() {
        int iHashCode = ((this.identifier.hashCode() * 31) + this.text.hashCode()) * 31;
        InputController inputController = this.controller;
        return iHashCode + (inputController == null ? 0 : inputController.hashCode());
    }

    public String toString() {
        return "StaticTextElement(identifier=" + this.identifier + ", text=" + this.text + ", controller=" + this.controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public StaticTextElement(IdentifierSpec identifier, ResolvableString text, InputController inputController) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(text, "text");
        this.identifier = identifier;
        this.text = text;
        this.controller = inputController;
    }

    public /* synthetic */ StaticTextElement(IdentifierSpec identifierSpec, ResolvableString resolvableString, InputController inputController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, resolvableString, (i & 4) != 0 ? null : inputController);
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final ResolvableString getText() {
        return this.text;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public InputController getController() {
        return this.controller;
    }

    public /* synthetic */ StaticTextElement(IdentifierSpec identifierSpec, int i, InputController inputController, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i, (i2 & 4) != 0 ? null : inputController);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StaticTextElement(IdentifierSpec identifier, int i, InputController inputController) {
        this(identifier, ResolvableStringUtilsKt.getResolvableString(i), inputController);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
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
