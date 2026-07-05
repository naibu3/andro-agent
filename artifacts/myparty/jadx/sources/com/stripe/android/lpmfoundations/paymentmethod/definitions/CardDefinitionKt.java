package com.stripe.android.lpmfoundations.paymentmethod.definitions;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.BillingDetailsCollectionConfiguration;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.CardBillingAddressElement;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.EmailElement;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElement;
import com.stripe.android.uicore.elements.SameAsShippingController;
import com.stripe.android.uicore.elements.SameAsShippingElement;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CardDefinition.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001aN\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\nH\u0002\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¨\u0006\u0012"}, d2 = {"toInternal", "Lcom/stripe/android/ui/core/BillingDetailsCollectionConfiguration$AddressCollectionMode;", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "cardBillingElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "collectionMode", "autocompleteAddressInteractorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", NamedConstantsKt.SHIPPING_VALUES, "contactInformationElement", "collectEmail", "", "collectPhone", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardDefinitionKt {

    /* compiled from: CardDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.values().length];
            try {
                iArr[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Full.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BillingDetailsCollectionConfiguration.AddressCollectionMode toInternal(PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode) {
        Intrinsics.checkNotNullParameter(addressCollectionMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[addressCollectionMode.ordinal()];
        if (i == 1) {
            return BillingDetailsCollectionConfiguration.AddressCollectionMode.Automatic;
        }
        if (i == 2) {
            return BillingDetailsCollectionConfiguration.AddressCollectionMode.Never;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BillingDetailsCollectionConfiguration.AddressCollectionMode.Full;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<FormElement> cardBillingElements(BillingDetailsCollectionConfiguration.AddressCollectionMode addressCollectionMode, AutocompleteAddressInteractor.Factory factory, Map<IdentifierSpec, String> map, Map<IdentifierSpec, String> map2) {
        String str;
        Boolean booleanStrictOrNull;
        SameAsShippingElement sameAsShippingElement = (map2 == null || (str = map2.get(IdentifierSpec.INSTANCE.getSameAsShipping())) == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str)) == null) ? null : new SameAsShippingElement(IdentifierSpec.INSTANCE.getSameAsShipping(), new SameAsShippingController(booleanStrictOrNull.booleanValue()));
        return CollectionsKt.listOfNotNull((Object[]) new FormElement[]{SectionElement.INSTANCE.wrap(new CardBillingAddressElement(IdentifierSpec.INSTANCE.Generic("credit_billing"), map, CountryUtils.INSTANCE.getSupportedBillingCountries(), null, factory, sameAsShippingElement, map2, addressCollectionMode, 8, null), ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_billing_details, new Object[0], null, 4, null)), sameAsShippingElement});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormElement contactInformationElement(Map<IdentifierSpec, String> map, boolean z, boolean z2) {
        SectionSingleFieldElement[] sectionSingleFieldElementArr = new SectionSingleFieldElement[2];
        EmailElement emailElement = new EmailElement(null, map.get(IdentifierSpec.INSTANCE.getEmail()), null, 5, null);
        if (!z) {
            emailElement = null;
        }
        sectionSingleFieldElementArr[0] = emailElement;
        IdentifierSpec phone = IdentifierSpec.INSTANCE.getPhone();
        PhoneNumberController.Companion companion = PhoneNumberController.INSTANCE;
        String str = map.get(IdentifierSpec.INSTANCE.getPhone());
        if (str == null) {
            str = "";
        }
        PhoneNumberElement phoneNumberElement = new PhoneNumberElement(phone, PhoneNumberController.Companion.createPhoneNumberController$default(companion, str, null, null, false, false, 30, null));
        if (!z2) {
            phoneNumberElement = null;
        }
        sectionSingleFieldElementArr[1] = phoneNumberElement;
        List<? extends SectionFieldElement> listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) sectionSingleFieldElementArr);
        if (listListOfNotNull.isEmpty()) {
            return null;
        }
        return SectionElement.INSTANCE.wrap(listListOfNotNull, ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_contact_information, new Object[0], null, 4, null));
    }
}
