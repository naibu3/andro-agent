package com.stripe.android.lpmfoundations.paymentmethod;

import androidx.webkit.Profile;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.lpmfoundations.FormHeaderInformation;
import com.stripe.android.lpmfoundations.luxe.InitialValuesFactory;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.luxe.TransformSpecToElements;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.PaymentMethodOptionsParamsKt;
import com.stripe.android.paymentsheet.LinkInlineHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressDetailsKt;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.AutocompleteAddressInteractor;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiDefinitionFactory.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J(\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J0\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J6\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;", "", "canBeDisplayedInUi", "", "definition", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;", "sharedDataSpecs", "", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "supportedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "formHeaderInformation", "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "customerHasSavedPaymentMethods", "formElements", "Lcom/stripe/android/uicore/elements/FormElement;", "arguments", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "Arguments", "RequiresSharedDataSpec", "Simple", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$RequiresSharedDataSpec;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UiDefinitionFactory {
    boolean canBeDisplayedInUi(PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs);

    List<FormElement> formElements(PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, Arguments arguments);

    FormHeaderInformation formHeaderInformation(PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean customerHasSavedPaymentMethods);

    SupportedPaymentMethod supportedPaymentMethod(PaymentMethodMetadata metadata, PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs);

    /* compiled from: UiDefinitionFactory.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001:\u0001=B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0014\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u001b\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "initialLinkUserInput", "Lcom/stripe/android/link/ui/inline/UserInput;", NamedConstantsKt.SHIPPING_VALUES, "saveForFutureUseInitialValue", "", "merchantName", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "requiresMandate", "onLinkInlineSignupStateChanged", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "setAsDefaultMatchesSaveForFutureUse", "autocompleteAddressInteractorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "linkInlineHandler", "Lcom/stripe/android/paymentsheet/LinkInlineHandler;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Ljava/util/Map;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/util/Map;ZLjava/lang/String;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZLkotlin/jvm/functions/Function1;Lcom/stripe/android/CardBrandFilter;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Lcom/stripe/android/paymentsheet/LinkInlineHandler;)V", "getCardAccountRangeRepositoryFactory", "()Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "getLinkConfigurationCoordinator", "()Lcom/stripe/android/link/LinkConfigurationCoordinator;", "getInitialValues", "()Ljava/util/Map;", "getInitialLinkUserInput", "()Lcom/stripe/android/link/ui/inline/UserInput;", "getShippingValues", "getSaveForFutureUseInitialValue", "()Z", "getMerchantName", "()Ljava/lang/String;", "getCbcEligibility", "()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getRequiresMandate", "getOnLinkInlineSignupStateChanged", "()Lkotlin/jvm/functions/Function1;", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "getSetAsDefaultMatchesSaveForFutureUse", "getAutocompleteAddressInteractorFactory", "()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "getLinkInlineHandler", "()Lcom/stripe/android/paymentsheet/LinkInlineHandler;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Arguments {
        public static final int $stable = 8;
        private final AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory;
        private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
        private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
        private final CardBrandFilter cardBrandFilter;
        private final CardBrandChoiceEligibility cbcEligibility;
        private final UserInput initialLinkUserInput;
        private final Map<IdentifierSpec, String> initialValues;
        private final LinkConfigurationCoordinator linkConfigurationCoordinator;
        private final LinkInlineHandler linkInlineHandler;
        private final String merchantName;
        private final Function1<InlineSignupViewState, Unit> onLinkInlineSignupStateChanged;
        private final boolean requiresMandate;
        private final boolean saveForFutureUseInitialValue;
        private final boolean setAsDefaultMatchesSaveForFutureUse;
        private final Map<IdentifierSpec, String> shippingValues;

        /* JADX WARN: Multi-variable type inference failed */
        public Arguments(CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, LinkConfigurationCoordinator linkConfigurationCoordinator, Map<IdentifierSpec, String> initialValues, UserInput userInput, Map<IdentifierSpec, String> map, boolean z, String merchantName, CardBrandChoiceEligibility cbcEligibility, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z2, Function1<? super InlineSignupViewState, Unit> onLinkInlineSignupStateChanged, CardBrandFilter cardBrandFilter, boolean z3, AutocompleteAddressInteractor.Factory factory, LinkInlineHandler linkInlineHandler) {
            Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
            Intrinsics.checkNotNullParameter(initialValues, "initialValues");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
            Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
            this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
            this.linkConfigurationCoordinator = linkConfigurationCoordinator;
            this.initialValues = initialValues;
            this.initialLinkUserInput = userInput;
            this.shippingValues = map;
            this.saveForFutureUseInitialValue = z;
            this.merchantName = merchantName;
            this.cbcEligibility = cbcEligibility;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.requiresMandate = z2;
            this.onLinkInlineSignupStateChanged = onLinkInlineSignupStateChanged;
            this.cardBrandFilter = cardBrandFilter;
            this.setAsDefaultMatchesSaveForFutureUse = z3;
            this.autocompleteAddressInteractorFactory = factory;
            this.linkInlineHandler = linkInlineHandler;
        }

        public final CardAccountRangeRepository.Factory getCardAccountRangeRepositoryFactory() {
            return this.cardAccountRangeRepositoryFactory;
        }

        public final LinkConfigurationCoordinator getLinkConfigurationCoordinator() {
            return this.linkConfigurationCoordinator;
        }

        public final Map<IdentifierSpec, String> getInitialValues() {
            return this.initialValues;
        }

        public final UserInput getInitialLinkUserInput() {
            return this.initialLinkUserInput;
        }

        public final Map<IdentifierSpec, String> getShippingValues() {
            return this.shippingValues;
        }

        public final boolean getSaveForFutureUseInitialValue() {
            return this.saveForFutureUseInitialValue;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final CardBrandChoiceEligibility getCbcEligibility() {
            return this.cbcEligibility;
        }

        public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        public final boolean getRequiresMandate() {
            return this.requiresMandate;
        }

        public final Function1<InlineSignupViewState, Unit> getOnLinkInlineSignupStateChanged() {
            return this.onLinkInlineSignupStateChanged;
        }

        public final CardBrandFilter getCardBrandFilter() {
            return this.cardBrandFilter;
        }

        public final boolean getSetAsDefaultMatchesSaveForFutureUse() {
            return this.setAsDefaultMatchesSaveForFutureUse;
        }

        public final AutocompleteAddressInteractor.Factory getAutocompleteAddressInteractorFactory() {
            return this.autocompleteAddressInteractorFactory;
        }

        public final LinkInlineHandler getLinkInlineHandler() {
            return this.linkInlineHandler;
        }

        /* compiled from: UiDefinitionFactory.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;", "", "create", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "requiresMandate", "", Profile.DEFAULT_PROFILE_NAME, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface Factory {
            Arguments create(PaymentMethodMetadata metadata, boolean requiresMandate);

            /* compiled from: UiDefinitionFactory.kt */
            @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory$Default;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "linkInlineHandler", "Lcom/stripe/android/paymentsheet/LinkInlineHandler;", "onLinkInlineSignupStateChanged", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "initialLinkUserInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "setAsDefaultMatchesSaveForFutureUse", "", "autocompleteAddressInteractorFactory", "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentsheet/LinkInlineHandler;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/PaymentMethodOptionsParams;Lcom/stripe/android/model/PaymentMethodExtraParams;Lcom/stripe/android/link/ui/inline/UserInput;ZLcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;)V", "create", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "requiresMandate", "getSaveForFutureUseInitialValue", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Default implements Factory {
                public static final int $stable = 8;
                private final AutocompleteAddressInteractor.Factory autocompleteAddressInteractorFactory;
                private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
                private final UserInput initialLinkUserInput;
                private final LinkConfigurationCoordinator linkConfigurationCoordinator;
                private final LinkInlineHandler linkInlineHandler;
                private final Function1<InlineSignupViewState, Unit> onLinkInlineSignupStateChanged;
                private final PaymentMethodCreateParams paymentMethodCreateParams;
                private final PaymentMethodExtraParams paymentMethodExtraParams;
                private final PaymentMethodOptionsParams paymentMethodOptionsParams;
                private final boolean setAsDefaultMatchesSaveForFutureUse;

                /* JADX WARN: Multi-variable type inference failed */
                public Default(CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, LinkConfigurationCoordinator linkConfigurationCoordinator, LinkInlineHandler linkInlineHandler, Function1<? super InlineSignupViewState, Unit> onLinkInlineSignupStateChanged, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, UserInput userInput, boolean z, AutocompleteAddressInteractor.Factory factory) {
                    Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
                    Intrinsics.checkNotNullParameter(onLinkInlineSignupStateChanged, "onLinkInlineSignupStateChanged");
                    this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
                    this.linkConfigurationCoordinator = linkConfigurationCoordinator;
                    this.linkInlineHandler = linkInlineHandler;
                    this.onLinkInlineSignupStateChanged = onLinkInlineSignupStateChanged;
                    this.paymentMethodCreateParams = paymentMethodCreateParams;
                    this.paymentMethodOptionsParams = paymentMethodOptionsParams;
                    this.paymentMethodExtraParams = paymentMethodExtraParams;
                    this.initialLinkUserInput = userInput;
                    this.setAsDefaultMatchesSaveForFutureUse = z;
                    this.autocompleteAddressInteractorFactory = factory;
                }

                public /* synthetic */ Default(CardAccountRangeRepository.Factory factory, LinkConfigurationCoordinator linkConfigurationCoordinator, LinkInlineHandler linkInlineHandler, Function1 function1, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodOptionsParams paymentMethodOptionsParams, PaymentMethodExtraParams paymentMethodExtraParams, UserInput userInput, boolean z, AutocompleteAddressInteractor.Factory factory2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(factory, linkConfigurationCoordinator, linkInlineHandler, function1, (i & 16) != 0 ? null : paymentMethodCreateParams, (i & 32) != 0 ? null : paymentMethodOptionsParams, (i & 64) != 0 ? null : paymentMethodExtraParams, (i & 128) != 0 ? null : userInput, (i & 256) != 0 ? false : z, factory2);
                }

                @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.Arguments.Factory
                public Arguments create(PaymentMethodMetadata metadata, boolean requiresMandate) {
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    CardAccountRangeRepository.Factory factory = this.cardAccountRangeRepositoryFactory;
                    LinkConfigurationCoordinator linkConfigurationCoordinator = this.linkConfigurationCoordinator;
                    String merchantName = metadata.getMerchantName();
                    CardBrandChoiceEligibility cbcEligibility = metadata.getCbcEligibility();
                    Map<IdentifierSpec, String> mapCreate = InitialValuesFactory.INSTANCE.create(metadata.getDefaultBillingDetails(), this.paymentMethodCreateParams, this.paymentMethodExtraParams);
                    AddressDetails shippingDetails = metadata.getShippingDetails();
                    return new Arguments(factory, linkConfigurationCoordinator, mapCreate, this.initialLinkUserInput, shippingDetails != null ? AddressDetailsKt.toIdentifierMap(shippingDetails, metadata.getDefaultBillingDetails()) : null, getSaveForFutureUseInitialValue(), merchantName, cbcEligibility, metadata.getBillingDetailsCollectionConfiguration(), requiresMandate, this.onLinkInlineSignupStateChanged, metadata.getCardBrandFilter(), this.setAsDefaultMatchesSaveForFutureUse, this.autocompleteAddressInteractorFactory, this.linkInlineHandler);
                }

                private final boolean getSaveForFutureUseInitialValue() {
                    ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
                    PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptionsParams;
                    return (paymentMethodOptionsParams == null || (setupFutureUsage = PaymentMethodOptionsParamsKt.setupFutureUsage(paymentMethodOptionsParams)) == null || setupFutureUsage == ConfirmPaymentIntentParams.SetupFutureUsage.Blank) ? false : true;
                }
            }
        }
    }

    /* compiled from: UiDefinitionFactory.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$RequiresSharedDataSpec;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;", "createSupportedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "sharedDataSpec", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "createFormHeaderInformation", "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "createFormElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "transformSpecToElements", "Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;", "arguments", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RequiresSharedDataSpec extends UiDefinitionFactory {
        List<FormElement> createFormElements(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements);

        List<FormElement> createFormElements(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements, Arguments arguments);

        FormHeaderInformation createFormHeaderInformation(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, PaymentMethodIncentive incentive);

        SupportedPaymentMethod createSupportedPaymentMethod(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec);

        /* compiled from: UiDefinitionFactory.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static boolean canBeDisplayedInUi(RequiresSharedDataSpec requiresSharedDataSpec, PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs) {
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                return DefaultImpls.canBeDisplayedInUi(requiresSharedDataSpec, definition, sharedDataSpecs);
            }

            public static List<FormElement> formElements(RequiresSharedDataSpec requiresSharedDataSpec, PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, Arguments arguments) {
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                return DefaultImpls.formElements(requiresSharedDataSpec, definition, metadata, sharedDataSpecs, arguments);
            }

            public static FormHeaderInformation formHeaderInformation(RequiresSharedDataSpec requiresSharedDataSpec, PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean z) {
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                return DefaultImpls.formHeaderInformation(requiresSharedDataSpec, definition, metadata, sharedDataSpecs, z);
            }

            public static SupportedPaymentMethod supportedPaymentMethod(RequiresSharedDataSpec requiresSharedDataSpec, PaymentMethodMetadata metadata, PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                return DefaultImpls.supportedPaymentMethod(requiresSharedDataSpec, metadata, definition, sharedDataSpecs);
            }

            public static FormHeaderInformation createFormHeaderInformation(RequiresSharedDataSpec requiresSharedDataSpec, PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, PaymentMethodIncentive paymentMethodIncentive) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
                return requiresSharedDataSpec.createSupportedPaymentMethod(metadata, sharedDataSpec).asFormHeaderInformation(paymentMethodIncentive);
            }

            public static List<FormElement> createFormElements(RequiresSharedDataSpec requiresSharedDataSpec, PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements, Arguments arguments) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
                Intrinsics.checkNotNullParameter(transformSpecToElements, "transformSpecToElements");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                return requiresSharedDataSpec.createFormElements(metadata, sharedDataSpec, transformSpecToElements);
            }

            public static List<FormElement> createFormElements(RequiresSharedDataSpec requiresSharedDataSpec, PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
                Intrinsics.checkNotNullParameter(transformSpecToElements, "transformSpecToElements");
                return TransformSpecToElements.transform$default(transformSpecToElements, metadata, sharedDataSpec.getFields(), null, 4, null);
            }
        }
    }

    /* compiled from: UiDefinitionFactory.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;", "createSupportedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "createFormHeaderInformation", "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "customerHasSavedPaymentMethods", "", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "createFormElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "arguments", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Simple extends UiDefinitionFactory {
        List<FormElement> createFormElements(PaymentMethodMetadata metadata, Arguments arguments);

        FormHeaderInformation createFormHeaderInformation(boolean customerHasSavedPaymentMethods, PaymentMethodIncentive incentive);

        SupportedPaymentMethod createSupportedPaymentMethod();

        /* compiled from: UiDefinitionFactory.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static boolean canBeDisplayedInUi(Simple simple, PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs) {
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                return DefaultImpls.canBeDisplayedInUi(simple, definition, sharedDataSpecs);
            }

            public static List<FormElement> formElements(Simple simple, PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, Arguments arguments) {
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                return DefaultImpls.formElements(simple, definition, metadata, sharedDataSpecs, arguments);
            }

            public static FormHeaderInformation formHeaderInformation(Simple simple, PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean z) {
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                return DefaultImpls.formHeaderInformation(simple, definition, metadata, sharedDataSpecs, z);
            }

            public static SupportedPaymentMethod supportedPaymentMethod(Simple simple, PaymentMethodMetadata metadata, PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs) {
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(definition, "definition");
                Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
                return DefaultImpls.supportedPaymentMethod(simple, metadata, definition, sharedDataSpecs);
            }

            public static FormHeaderInformation createFormHeaderInformation(Simple simple, boolean z, PaymentMethodIncentive paymentMethodIncentive) {
                return simple.createSupportedPaymentMethod().asFormHeaderInformation(paymentMethodIncentive);
            }
        }
    }

    /* compiled from: UiDefinitionFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean canBeDisplayedInUi(UiDefinitionFactory uiDefinitionFactory, PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs) {
            Object next;
            Intrinsics.checkNotNullParameter(definition, "definition");
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            if (uiDefinitionFactory instanceof Simple) {
                return true;
            }
            if (!(uiDefinitionFactory instanceof RequiresSharedDataSpec)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = sharedDataSpecs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((SharedDataSpec) next).getType(), definition.getType().code)) {
                    break;
                }
            }
            return next != null;
        }

        public static SupportedPaymentMethod supportedPaymentMethod(UiDefinitionFactory uiDefinitionFactory, PaymentMethodMetadata metadata, PaymentMethodDefinition definition, List<SharedDataSpec> sharedDataSpecs) {
            Object next;
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(definition, "definition");
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            if (uiDefinitionFactory instanceof Simple) {
                return ((Simple) uiDefinitionFactory).createSupportedPaymentMethod();
            }
            if (!(uiDefinitionFactory instanceof RequiresSharedDataSpec)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = sharedDataSpecs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((SharedDataSpec) next).getType(), definition.getType().code)) {
                    break;
                }
            }
            SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
            if (sharedDataSpec != null) {
                return ((RequiresSharedDataSpec) uiDefinitionFactory).createSupportedPaymentMethod(metadata, sharedDataSpec);
            }
            return null;
        }

        public static FormHeaderInformation formHeaderInformation(UiDefinitionFactory uiDefinitionFactory, PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, boolean z) {
            Object next;
            Intrinsics.checkNotNullParameter(definition, "definition");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            if (uiDefinitionFactory instanceof Simple) {
                return ((Simple) uiDefinitionFactory).createFormHeaderInformation(z, metadata.getPaymentMethodIncentive());
            }
            if (!(uiDefinitionFactory instanceof RequiresSharedDataSpec)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = sharedDataSpecs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((SharedDataSpec) next).getType(), definition.getType().code)) {
                    break;
                }
            }
            SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
            if (sharedDataSpec != null) {
                return ((RequiresSharedDataSpec) uiDefinitionFactory).createFormHeaderInformation(metadata, sharedDataSpec, metadata.getPaymentMethodIncentive());
            }
            return null;
        }

        public static List<FormElement> formElements(UiDefinitionFactory uiDefinitionFactory, PaymentMethodDefinition definition, PaymentMethodMetadata metadata, List<SharedDataSpec> sharedDataSpecs, Arguments arguments) {
            Object next;
            Intrinsics.checkNotNullParameter(definition, "definition");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            if (uiDefinitionFactory instanceof Simple) {
                return ((Simple) uiDefinitionFactory).createFormElements(metadata, arguments);
            }
            if (!(uiDefinitionFactory instanceof RequiresSharedDataSpec)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = sharedDataSpecs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((SharedDataSpec) next).getType(), definition.getType().code)) {
                    break;
                }
            }
            SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
            if (sharedDataSpec != null) {
                return ((RequiresSharedDataSpec) uiDefinitionFactory).createFormElements(metadata, sharedDataSpec, new TransformSpecToElements(arguments), arguments);
            }
            return null;
        }
    }
}
