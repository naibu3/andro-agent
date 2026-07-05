package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SetAsDefaultPaymentMethodElement.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020!0 0\u001f0\u0005H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J-\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "initialValue", "", "saveForFutureUseCheckedFlow", "Lkotlinx/coroutines/flow/StateFlow;", "setAsDefaultMatchesSaveForFutureUse", "<init>", "(ZLkotlinx/coroutines/flow/StateFlow;Z)V", "getInitialValue", "()Z", "getSaveForFutureUseCheckedFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "getSetAsDefaultMatchesSaveForFutureUse", "shouldShowElementFlow", "getShouldShowElementFlow", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "controller", "Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;", "getController", "()Lcom/stripe/android/ui/core/elements/SetAsDefaultPaymentMethodController;", "allowsUserInteraction", "getAllowsUserInteraction", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getFormFieldValueFlow", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SetAsDefaultPaymentMethodElement implements FormElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final SetAsDefaultPaymentMethodController controller;
    private final IdentifierSpec identifier;
    private final boolean initialValue;
    private final ResolvableString mandateText;
    private final StateFlow<Boolean> saveForFutureUseCheckedFlow;
    private final boolean setAsDefaultMatchesSaveForFutureUse;
    private final StateFlow<Boolean> shouldShowElementFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetAsDefaultPaymentMethodElement copy$default(SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, boolean z, StateFlow stateFlow, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setAsDefaultPaymentMethodElement.initialValue;
        }
        if ((i & 2) != 0) {
            stateFlow = setAsDefaultPaymentMethodElement.saveForFutureUseCheckedFlow;
        }
        if ((i & 4) != 0) {
            z2 = setAsDefaultPaymentMethodElement.setAsDefaultMatchesSaveForFutureUse;
        }
        return setAsDefaultPaymentMethodElement.copy(z, stateFlow, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getInitialValue() {
        return this.initialValue;
    }

    public final StateFlow<Boolean> component2() {
        return this.saveForFutureUseCheckedFlow;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSetAsDefaultMatchesSaveForFutureUse() {
        return this.setAsDefaultMatchesSaveForFutureUse;
    }

    public final SetAsDefaultPaymentMethodElement copy(boolean initialValue, StateFlow<Boolean> saveForFutureUseCheckedFlow, boolean setAsDefaultMatchesSaveForFutureUse) {
        Intrinsics.checkNotNullParameter(saveForFutureUseCheckedFlow, "saveForFutureUseCheckedFlow");
        return new SetAsDefaultPaymentMethodElement(initialValue, saveForFutureUseCheckedFlow, setAsDefaultMatchesSaveForFutureUse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetAsDefaultPaymentMethodElement)) {
            return false;
        }
        SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement = (SetAsDefaultPaymentMethodElement) other;
        return this.initialValue == setAsDefaultPaymentMethodElement.initialValue && Intrinsics.areEqual(this.saveForFutureUseCheckedFlow, setAsDefaultPaymentMethodElement.saveForFutureUseCheckedFlow) && this.setAsDefaultMatchesSaveForFutureUse == setAsDefaultPaymentMethodElement.setAsDefaultMatchesSaveForFutureUse;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.initialValue) * 31) + this.saveForFutureUseCheckedFlow.hashCode()) * 31) + Boolean.hashCode(this.setAsDefaultMatchesSaveForFutureUse);
    }

    public String toString() {
        return "SetAsDefaultPaymentMethodElement(initialValue=" + this.initialValue + ", saveForFutureUseCheckedFlow=" + this.saveForFutureUseCheckedFlow + ", setAsDefaultMatchesSaveForFutureUse=" + this.setAsDefaultMatchesSaveForFutureUse + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public SetAsDefaultPaymentMethodElement(boolean z, StateFlow<Boolean> saveForFutureUseCheckedFlow, boolean z2) {
        Intrinsics.checkNotNullParameter(saveForFutureUseCheckedFlow, "saveForFutureUseCheckedFlow");
        this.initialValue = z;
        this.saveForFutureUseCheckedFlow = saveForFutureUseCheckedFlow;
        this.setAsDefaultMatchesSaveForFutureUse = z2;
        this.shouldShowElementFlow = StateFlowsKt.mapAsStateFlow(saveForFutureUseCheckedFlow, new Function1() { // from class: com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElement$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SetAsDefaultPaymentMethodElement.shouldShowElementFlow$lambda$0(this.f$0, ((Boolean) obj).booleanValue()));
            }
        });
        this.identifier = IdentifierSpec.INSTANCE.getSetAsDefaultPaymentMethod();
        this.controller = new SetAsDefaultPaymentMethodController(z, saveForFutureUseCheckedFlow, z2);
        this.allowsUserInteraction = true;
    }

    public final boolean getInitialValue() {
        return this.initialValue;
    }

    public final StateFlow<Boolean> getSaveForFutureUseCheckedFlow() {
        return this.saveForFutureUseCheckedFlow;
    }

    public final boolean getSetAsDefaultMatchesSaveForFutureUse() {
        return this.setAsDefaultMatchesSaveForFutureUse;
    }

    public final StateFlow<Boolean> getShouldShowElementFlow() {
        return this.shouldShowElementFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowElementFlow$lambda$0(SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, boolean z) {
        return z && !setAsDefaultPaymentMethodElement.setAsDefaultMatchesSaveForFutureUse;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public SetAsDefaultPaymentMethodController getController() {
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
        return StateFlowsKt.mapAsStateFlow(getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.SetAsDefaultPaymentMethodElement$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetAsDefaultPaymentMethodElement.getFormFieldValueFlow$lambda$1(this.f$0, (FormFieldEntry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFormFieldValueFlow$lambda$1(SetAsDefaultPaymentMethodElement setAsDefaultPaymentMethodElement, FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf(TuplesKt.to(setAsDefaultPaymentMethodElement.getIdentifier(), it));
    }
}
