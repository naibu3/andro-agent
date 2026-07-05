package com.stripe.android.ui.core.elements;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpiElement.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/ui/core/elements/UpiElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "controller", "Lcom/stripe/android/uicore/elements/InputController;", "<init>", "(Lcom/stripe/android/uicore/elements/InputController;)V", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpiElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final InputController controller;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;

    /* JADX WARN: Multi-variable type inference failed */
    public UpiElement() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UpiElement(SimpleTextFieldController simpleTextFieldController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SimpleTextFieldController(new UpiConfig(), false, null, null, 14, null) : simpleTextFieldController);
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public InputController getController() {
        return this.controller;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpiElement(InputController controller) {
        super(IdentifierSpec.INSTANCE.getVpa());
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.controller = controller;
        this.allowsUserInteraction = true;
        this.identifier = IdentifierSpec.INSTANCE.getVpa();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }
}
