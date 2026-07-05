package com.stripe.android.ui.core.elements;

import android.content.res.Resources;
import androidx.compose.ui.text.intl.Locale;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.elements.Controller;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AfterpayClearpayHeaderElement.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0018\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a0\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010)\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000f¨\u00060"}, d2 = {"Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;", "Lcom/stripe/android/uicore/elements/FormElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "controller", "Lcom/stripe/android/uicore/elements/Controller;", "currency", "", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/Controller;Ljava/lang/String;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getController", "()Lcom/stripe/android/uicore/elements/Controller;", "getCurrency", "()Ljava/lang/String;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "infoUrl", "getInfoUrl", "getLocaleString", "locale", "Landroidx/compose/ui/text/intl/Locale;", "getLabel", "resources", "Landroid/content/res/Resources;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AfterpayClearpayHeaderElement implements FormElement {
    public static final String NO_BREAK_SPACE = " ";
    public static final String url = "https://static.afterpay.com/modal/%s.html";
    private final boolean allowsUserInteraction;
    private final Controller controller;
    private final String currency;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ AfterpayClearpayHeaderElement copy$default(AfterpayClearpayHeaderElement afterpayClearpayHeaderElement, IdentifierSpec identifierSpec, Controller controller, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = afterpayClearpayHeaderElement.identifier;
        }
        if ((i & 2) != 0) {
            controller = afterpayClearpayHeaderElement.controller;
        }
        if ((i & 4) != 0) {
            str = afterpayClearpayHeaderElement.currency;
        }
        return afterpayClearpayHeaderElement.copy(identifierSpec, controller, str);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final Controller getController() {
        return this.controller;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final AfterpayClearpayHeaderElement copy(IdentifierSpec identifier, Controller controller, String currency) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new AfterpayClearpayHeaderElement(identifier, controller, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AfterpayClearpayHeaderElement)) {
            return false;
        }
        AfterpayClearpayHeaderElement afterpayClearpayHeaderElement = (AfterpayClearpayHeaderElement) other;
        return Intrinsics.areEqual(this.identifier, afterpayClearpayHeaderElement.identifier) && Intrinsics.areEqual(this.controller, afterpayClearpayHeaderElement.controller) && Intrinsics.areEqual(this.currency, afterpayClearpayHeaderElement.currency);
    }

    public int hashCode() {
        int iHashCode = this.identifier.hashCode() * 31;
        Controller controller = this.controller;
        int iHashCode2 = (iHashCode + (controller == null ? 0 : controller.hashCode())) * 31;
        String str = this.currency;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AfterpayClearpayHeaderElement(identifier=" + this.identifier + ", controller=" + this.controller + ", currency=" + this.currency + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public AfterpayClearpayHeaderElement(IdentifierSpec identifier, Controller controller, String str) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        this.controller = controller;
        this.currency = str;
    }

    public /* synthetic */ AfterpayClearpayHeaderElement(IdentifierSpec identifierSpec, Controller controller, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, (i & 2) != 0 ? null : controller, str);
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public Controller getController() {
        return this.controller;
    }

    public final String getCurrency() {
        return this.currency;
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

    public final String getInfoUrl() {
        String str = String.format(url, Arrays.copyOf(new Object[]{getLocaleString(Locale.INSTANCE.getCurrent())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getLocaleString(Locale locale) {
        String lowerCase = locale.getLanguage().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String upperCase = locale.getRegion().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return lowerCase + "_" + upperCase;
    }

    public final String getLabel(Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(R.string.stripe_afterpay_clearpay_marketing);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return StringsKt.replace$default(string, "<img/>", "<img/> <b>ⓘ</b>", false, 4, (Object) null);
    }

    /* compiled from: AfterpayClearpayHeaderElement.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement$Companion;", "", "<init>", "()V", "url", "", "NO_BREAK_SPACE", "isClearpay", "", "currency", "isCashappAfterpay", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isClearpay(String currency) {
            return StringsKt.equals("GBP", currency, true);
        }

        public final boolean isCashappAfterpay(String currency) {
            return StringsKt.equals("USD", currency, true);
        }
    }
}
