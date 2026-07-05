package com.stripe.android.uicore.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailElement.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J)\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lcom/stripe/android/uicore/elements/EmailElement;", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "initialValue", "", "controller", "Lcom/stripe/android/uicore/elements/TextFieldController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getInitialValue", "()Ljava/lang/String;", "getController", "()Lcom/stripe/android/uicore/elements/TextFieldController;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EmailElement extends SectionSingleFieldElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final TextFieldController controller;
    private final IdentifierSpec identifier;
    private final String initialValue;
    private final ResolvableString mandateText;

    public EmailElement() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EmailElement copy$default(EmailElement emailElement, IdentifierSpec identifierSpec, String str, TextFieldController textFieldController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = emailElement.identifier;
        }
        if ((i & 2) != 0) {
            str = emailElement.initialValue;
        }
        if ((i & 4) != 0) {
            textFieldController = emailElement.controller;
        }
        return emailElement.copy(identifierSpec, str, textFieldController);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitialValue() {
        return this.initialValue;
    }

    /* renamed from: component3, reason: from getter */
    public final TextFieldController getController() {
        return this.controller;
    }

    public final EmailElement copy(IdentifierSpec identifier, String initialValue, TextFieldController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new EmailElement(identifier, initialValue, controller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailElement)) {
            return false;
        }
        EmailElement emailElement = (EmailElement) other;
        return Intrinsics.areEqual(this.identifier, emailElement.identifier) && Intrinsics.areEqual(this.initialValue, emailElement.initialValue) && Intrinsics.areEqual(this.controller, emailElement.controller);
    }

    public int hashCode() {
        int iHashCode = this.identifier.hashCode() * 31;
        String str = this.initialValue;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.controller.hashCode();
    }

    public String toString() {
        return "EmailElement(identifier=" + this.identifier + ", initialValue=" + this.initialValue + ", controller=" + this.controller + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EmailElement(IdentifierSpec identifierSpec, String str, SimpleTextFieldController simpleTextFieldController, int i, DefaultConstructorMarker defaultConstructorMarker) {
        identifierSpec = (i & 1) != 0 ? IdentifierSpec.INSTANCE.getEmail() : identifierSpec;
        String str2 = (i & 2) != 0 ? "" : str;
        this(identifierSpec, str2, (i & 4) != 0 ? new SimpleTextFieldController(new EmailConfig(null, 1, null), false, str2, null, 10, null) : simpleTextFieldController);
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement, com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final String getInitialValue() {
        return this.initialValue;
    }

    @Override // com.stripe.android.uicore.elements.SectionSingleFieldElement
    public TextFieldController getController() {
        return this.controller;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailElement(IdentifierSpec identifier, String str, TextFieldController controller) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.initialValue = str;
        this.controller = controller;
        this.allowsUserInteraction = true;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }
}
