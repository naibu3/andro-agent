package com.stripe.android.lpmfoundations.luxe;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.elements.AddressSpec;
import com.stripe.android.uicore.elements.FormElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormElementsBuilder.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0000J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\u0000J\u0016\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/lpmfoundations/luxe/FormElementsBuilder;", "", "arguments", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "<init>", "(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)V", "headerFormElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "uiFormElements", "footerFormElements", "requiredContactInformationCollectionModes", "", "Lcom/stripe/android/lpmfoundations/luxe/ContactInformationCollectionMode;", "requireBillingAddressCollection", "", "availableCountries", "", "", "header", "formElement", "ignoreContactInformationRequirements", "requireContactInformationIfAllowed", "type", "element", "ignoreBillingAddressRequirements", "requireBillingAddressIfAllowed", "footer", InAppPurchaseConstants.METHOD_BUILD, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormElementsBuilder {
    public static final int $stable = 8;
    private final UiDefinitionFactory.Arguments arguments;
    private Set<String> availableCountries;
    private final List<FormElement> footerFormElements;
    private final List<FormElement> headerFormElements;
    private boolean requireBillingAddressCollection;
    private final Set<ContactInformationCollectionMode> requiredContactInformationCollectionModes;
    private final List<FormElement> uiFormElements;

    public FormElementsBuilder(UiDefinitionFactory.Arguments arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.arguments = arguments;
        this.headerFormElements = new ArrayList();
        this.uiFormElements = new ArrayList();
        this.footerFormElements = new ArrayList();
        this.requiredContactInformationCollectionModes = new LinkedHashSet();
        this.availableCountries = CountryUtils.INSTANCE.getSupportedBillingCountries();
        for (ContactInformationCollectionMode contactInformationCollectionMode : ContactInformationCollectionMode.getEntries()) {
            if (contactInformationCollectionMode.isRequired(this.arguments.getBillingDetailsCollectionConfiguration())) {
                requireContactInformationIfAllowed(contactInformationCollectionMode);
            }
        }
        if (this.arguments.getBillingDetailsCollectionConfiguration().getAddress() == PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full) {
            requireBillingAddressIfAllowed$default(this, null, 1, null);
        }
    }

    public final FormElementsBuilder header(FormElement formElement) {
        Intrinsics.checkNotNullParameter(formElement, "formElement");
        this.headerFormElements.add(formElement);
        return this;
    }

    public final FormElementsBuilder ignoreContactInformationRequirements() {
        this.requiredContactInformationCollectionModes.clear();
        return this;
    }

    public final FormElementsBuilder requireContactInformationIfAllowed(ContactInformationCollectionMode type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isAllowed(this.arguments.getBillingDetailsCollectionConfiguration())) {
            this.requiredContactInformationCollectionModes.add(type);
        }
        return this;
    }

    public final FormElementsBuilder element(FormElement formElement) {
        Intrinsics.checkNotNullParameter(formElement, "formElement");
        this.uiFormElements.add(formElement);
        return this;
    }

    public final FormElementsBuilder ignoreBillingAddressRequirements() {
        this.requireBillingAddressCollection = false;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormElementsBuilder requireBillingAddressIfAllowed$default(FormElementsBuilder formElementsBuilder, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = formElementsBuilder.availableCountries;
        }
        return formElementsBuilder.requireBillingAddressIfAllowed(set);
    }

    public final FormElementsBuilder requireBillingAddressIfAllowed(Set<String> availableCountries) {
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        if (this.arguments.getBillingDetailsCollectionConfiguration().getAddress() != PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never) {
            this.requireBillingAddressCollection = true;
            this.availableCountries = availableCountries;
        }
        return this;
    }

    public final FormElementsBuilder footer(FormElement formElement) {
        Intrinsics.checkNotNullParameter(formElement, "formElement");
        this.footerFormElements.add(formElement);
        return this;
    }

    public final List<FormElement> build() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(this.headerFormElements);
        Iterator<ContactInformationCollectionMode> it = this.requiredContactInformationCollectionModes.iterator();
        while (it.hasNext()) {
            listCreateListBuilder.add(it.next().formElement(this.arguments.getInitialValues()));
        }
        listCreateListBuilder.addAll(this.uiFormElements);
        if (this.requireBillingAddressCollection) {
            listCreateListBuilder.addAll(new AddressSpec(null, this.availableCountries, null, false, null, false, 61, null).transform(this.arguments.getInitialValues(), this.arguments.getShippingValues(), this.arguments.getAutocompleteAddressInteractorFactory()));
        }
        listCreateListBuilder.addAll(this.footerFormElements);
        return CollectionsKt.build(listCreateListBuilder);
    }
}
