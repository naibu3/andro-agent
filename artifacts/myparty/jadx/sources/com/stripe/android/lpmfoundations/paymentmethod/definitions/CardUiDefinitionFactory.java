package com.stripe.android.lpmfoundations.paymentmethod.definitions;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.ui.inline.InlineSignupViewState;
import com.stripe.android.link.ui.inline.LinkSignupMode;
import com.stripe.android.lpmfoundations.FormHeaderInformation;
import com.stripe.android.lpmfoundations.luxe.SaveForFutureUseHelperKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.lpmfoundations.paymentmethod.link.LinkFormElement;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.LinkInlineHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.CardDetailsSectionElement;
import com.stripe.android.ui.core.elements.MandateTextElement;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardDefinition.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0017\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/CardUiDefinitionFactory;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;", "<init>", "()V", "createSupportedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "createFormHeaderInformation", "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "customerHasSavedPaymentMethods", "", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "createFormElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "arguments", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "addContactInformationElement", "", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "addCardBillingElements", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CardUiDefinitionFactory implements UiDefinitionFactory.Simple {
    public static final CardUiDefinitionFactory INSTANCE = new CardUiDefinitionFactory();

    private CardUiDefinitionFactory() {
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public boolean canBeDisplayedInUi(PaymentMethodDefinition paymentMethodDefinition, List<SharedDataSpec> list) {
        return UiDefinitionFactory.Simple.DefaultImpls.canBeDisplayedInUi(this, paymentMethodDefinition, list);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public List<FormElement> formElements(PaymentMethodDefinition paymentMethodDefinition, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, UiDefinitionFactory.Arguments arguments) {
        return UiDefinitionFactory.Simple.DefaultImpls.formElements(this, paymentMethodDefinition, paymentMethodMetadata, list, arguments);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public FormHeaderInformation formHeaderInformation(PaymentMethodDefinition paymentMethodDefinition, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, boolean z) {
        return UiDefinitionFactory.Simple.DefaultImpls.formHeaderInformation(this, paymentMethodDefinition, paymentMethodMetadata, list, z);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public SupportedPaymentMethod supportedPaymentMethod(PaymentMethodMetadata paymentMethodMetadata, PaymentMethodDefinition paymentMethodDefinition, List<SharedDataSpec> list) {
        return UiDefinitionFactory.Simple.DefaultImpls.supportedPaymentMethod(this, paymentMethodMetadata, paymentMethodDefinition, list);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.Simple
    public SupportedPaymentMethod createSupportedPaymentMethod() {
        return new SupportedPaymentMethod((PaymentMethodDefinition) CardDefinition.INSTANCE, (SharedDataSpec) null, R.string.stripe_paymentsheet_payment_method_card, R.drawable.stripe_ic_paymentsheet_pm_card, (Integer) null, true, (ResolvableString) null, Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_card_outlined), 66, (DefaultConstructorMarker) null);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.Simple
    public FormHeaderInformation createFormHeaderInformation(boolean customerHasSavedPaymentMethods, PaymentMethodIncentive incentive) {
        int i;
        if (customerHasSavedPaymentMethods) {
            i = R.string.stripe_paymentsheet_add_new_card;
        } else {
            i = R.string.stripe_paymentsheet_add_card;
        }
        return FormHeaderInformation.copy$default(createSupportedPaymentMethod().asFormHeaderInformation(incentive), ResolvableStringUtilsKt.getResolvableString(i), false, 0, null, null, null, false, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.Simple
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<FormElement> createFormElements(PaymentMethodMetadata metadata, UiDefinitionFactory.Arguments arguments) {
        boolean z;
        LinkSignupMode signupMode;
        float fM6117constructorimpl;
        StateFlow<InlineSignupViewState> stateFlowStateFlowOf;
        LinkConfiguration configuration;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = metadata.getBillingDetailsCollectionConfiguration();
        List<FormElement> listCreateListBuilder = CollectionsKt.createListBuilder();
        CardUiDefinitionFactory cardUiDefinitionFactory = INSTANCE;
        cardUiDefinitionFactory.addContactInformationElement(listCreateListBuilder, arguments, metadata.getBillingDetailsCollectionConfiguration());
        listCreateListBuilder.add(new CardDetailsSectionElement(arguments.getCardAccountRangeRepositoryFactory(), arguments.getInitialValues(), metadata.getElementsSessionId(), billingDetailsCollectionConfiguration.getCollectsName$paymentsheet_release(), arguments.getCbcEligibility(), arguments.getCardBrandFilter(), IdentifierSpec.INSTANCE.Generic("card_details"), null, 128, null));
        cardUiDefinitionFactory.addCardBillingElements(listCreateListBuilder, arguments, metadata.getBillingDetailsCollectionConfiguration());
        boolean zIsSaveForFutureUseValueChangeable = SaveForFutureUseHelperKt.isSaveForFutureUseValueChangeable(PaymentMethod.Type.Card.code, metadata);
        LinkState linkState = metadata.getLinkState();
        if (linkState == null || (configuration = linkState.getConfiguration()) == null) {
            z = false;
        } else {
            z = true;
            if (!configuration.getLinkSignUpOptInFeatureEnabled()) {
            }
        }
        if (zIsSaveForFutureUseValueChangeable && !z) {
            SaveForFutureUseHelperKt.addSavePaymentOptionElements(listCreateListBuilder, metadata, arguments);
        }
        LinkState linkState2 = metadata.getLinkState();
        if ((linkState2 != null ? linkState2.getSignupMode() : null) == null || arguments.getLinkConfigurationCoordinator() == null) {
            signupMode = null;
        } else {
            listCreateListBuilder.add(new LinkFormElement(metadata.getLinkState().getSignupMode(), metadata.getLinkState().getConfiguration(), arguments.getLinkConfigurationCoordinator(), arguments.getInitialLinkUserInput(), arguments.getOnLinkInlineSignupStateChanged()));
            signupMode = metadata.getLinkState().getSignupMode();
        }
        boolean zMandateAllowed = metadata.mandateAllowed(CardDefinition.INSTANCE.getType());
        if (z && signupMode != null) {
            IdentifierSpec identifierSpecGeneric = IdentifierSpec.INSTANCE.Generic("card_mandate");
            String merchantName = metadata.getMerchantName();
            LinkInlineHandler linkInlineHandler = arguments.getLinkInlineHandler();
            if (linkInlineHandler == null || (stateFlowStateFlowOf = linkInlineHandler.getLinkInlineState()) == null) {
                stateFlowStateFlowOf = StateFlowsKt.stateFlowOf(null);
            }
            listCreateListBuilder.add(new CombinedLinkMandateElement(identifierSpecGeneric, signupMode, zIsSaveForFutureUseValueChangeable, merchantName, stateFlowStateFlowOf));
        } else {
            LinkSignupMode linkSignupMode = signupMode;
            if (metadata.hasIntentToSetup(CardDefinition.INSTANCE.getType().code) && zMandateAllowed) {
                IdentifierSpec identifierSpecGeneric2 = IdentifierSpec.INSTANCE.Generic("card_mandate");
                int i = com.stripe.android.paymentsheet.R.string.stripe_paymentsheet_card_mandate;
                if (linkSignupMode != LinkSignupMode.AlongsideSaveForFutureUse) {
                    if (linkSignupMode == LinkSignupMode.InsteadOfSaveForFutureUse) {
                        fM6117constructorimpl = Dp.m6117constructorimpl(4);
                    } else if (zIsSaveForFutureUseValueChangeable) {
                        fM6117constructorimpl = Dp.m6117constructorimpl(6);
                    } else {
                        fM6117constructorimpl = Dp.m6117constructorimpl(2);
                    }
                } else {
                    fM6117constructorimpl = Dp.m6117constructorimpl(0);
                }
                listCreateListBuilder.add(new MandateTextElement(identifierSpecGeneric2, i, CollectionsKt.listOf(metadata.getMerchantName()), fM6117constructorimpl, null, 16, null));
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    private final boolean addContactInformationElement(List<FormElement> list, UiDefinitionFactory.Arguments arguments, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
        FormElement formElementContactInformationElement = CardDefinitionKt.contactInformationElement(arguments.getInitialValues(), billingDetailsCollectionConfiguration.getCollectsEmail$paymentsheet_release(), billingDetailsCollectionConfiguration.getCollectsPhone$paymentsheet_release());
        if (formElementContactInformationElement != null) {
            return list.add(formElementContactInformationElement);
        }
        return false;
    }

    private final boolean addCardBillingElements(List<FormElement> list, UiDefinitionFactory.Arguments arguments, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
        if (billingDetailsCollectionConfiguration.getAddress() != PaymentSheet.BillingDetailsCollectionConfiguration.AddressCollectionMode.Never) {
            return list.addAll(CardDefinitionKt.cardBillingElements(CardDefinitionKt.toInternal(billingDetailsCollectionConfiguration.getAddress()), arguments.getAutocompleteAddressInteractorFactory(), arguments.getInitialValues(), arguments.getShippingValues()));
        }
        return false;
    }
}
