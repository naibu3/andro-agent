package com.stripe.android.ui.core.elements;

import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MandateTextElement.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ \u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%0$0\u00070#H\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003JJ\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u00020\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/stripe/android/ui/core/elements/MandateTextElement;", "Lcom/stripe/android/uicore/elements/FormElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "stringResId", "", CardScanActivity.ARGS, "", "", "topPadding", "Landroidx/compose/ui/unit/Dp;", "controller", "Lcom/stripe/android/uicore/elements/InputController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILjava/util/List;FLcom/stripe/android/uicore/elements/InputController;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getStringResId", "()I", "getArgs", "()Ljava/util/List;", "getTopPadding-D9Ej5fM", "()F", "F", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "component5", "copy", "copy-2lqI77k", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILjava/util/List;FLcom/stripe/android/uicore/elements/InputController;)Lcom/stripe/android/ui/core/elements/MandateTextElement;", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MandateTextElement implements FormElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final List<String> args;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;
    private final int stringResId;
    private final float topPadding;

    public /* synthetic */ MandateTextElement(IdentifierSpec identifierSpec, int i, List list, float f, InputController inputController, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i, list, f, inputController);
    }

    /* renamed from: copy-2lqI77k$default, reason: not valid java name */
    public static /* synthetic */ MandateTextElement m8657copy2lqI77k$default(MandateTextElement mandateTextElement, IdentifierSpec identifierSpec, int i, List list, float f, InputController inputController, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            identifierSpec = mandateTextElement.identifier;
        }
        if ((i2 & 2) != 0) {
            i = mandateTextElement.stringResId;
        }
        if ((i2 & 4) != 0) {
            list = mandateTextElement.args;
        }
        if ((i2 & 8) != 0) {
            f = mandateTextElement.topPadding;
        }
        if ((i2 & 16) != 0) {
            inputController = mandateTextElement.controller;
        }
        InputController inputController2 = inputController;
        List list2 = list;
        return mandateTextElement.m8659copy2lqI77k(identifierSpec, i, list2, f, inputController2);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStringResId() {
        return this.stringResId;
    }

    public final List<String> component3() {
        return this.args;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final InputController getController() {
        return this.controller;
    }

    /* renamed from: copy-2lqI77k, reason: not valid java name */
    public final MandateTextElement m8659copy2lqI77k(IdentifierSpec identifier, int stringResId, List<String> args, float topPadding, InputController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(args, "args");
        return new MandateTextElement(identifier, stringResId, args, topPadding, controller, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MandateTextElement)) {
            return false;
        }
        MandateTextElement mandateTextElement = (MandateTextElement) other;
        return Intrinsics.areEqual(this.identifier, mandateTextElement.identifier) && this.stringResId == mandateTextElement.stringResId && Intrinsics.areEqual(this.args, mandateTextElement.args) && Dp.m6122equalsimpl0(this.topPadding, mandateTextElement.topPadding) && Intrinsics.areEqual(this.controller, mandateTextElement.controller);
    }

    public int hashCode() {
        int iHashCode = ((((((this.identifier.hashCode() * 31) + Integer.hashCode(this.stringResId)) * 31) + this.args.hashCode()) * 31) + Dp.m6123hashCodeimpl(this.topPadding)) * 31;
        InputController inputController = this.controller;
        return iHashCode + (inputController == null ? 0 : inputController.hashCode());
    }

    public String toString() {
        return "MandateTextElement(identifier=" + this.identifier + ", stringResId=" + this.stringResId + ", args=" + this.args + ", topPadding=" + Dp.m6128toStringimpl(this.topPadding) + ", controller=" + this.controller + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    private MandateTextElement(IdentifierSpec identifier, int i, List<String> args, float f, InputController inputController) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(args, "args");
        this.identifier = identifier;
        this.stringResId = i;
        this.args = args;
        this.topPadding = f;
        this.controller = inputController;
        String[] strArr = (String[]) args.toArray(new String[0]);
        this.mandateText = ResolvableStringUtilsKt.resolvableString$default(i, Arrays.copyOf(strArr, strArr.length), null, 4, null);
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final int getStringResId() {
        return this.stringResId;
    }

    public final List<String> getArgs() {
        return this.args;
    }

    /* renamed from: getTopPadding-D9Ej5fM, reason: not valid java name */
    public final float m8660getTopPaddingD9Ej5fM() {
        return this.topPadding;
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

    public /* synthetic */ MandateTextElement(IdentifierSpec identifierSpec, int i, List list, float f, InputController inputController, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i, list, (i2 & 8) != 0 ? Dp.m6117constructorimpl(8) : f, (i2 & 16) != 0 ? null : inputController, null);
    }
}
