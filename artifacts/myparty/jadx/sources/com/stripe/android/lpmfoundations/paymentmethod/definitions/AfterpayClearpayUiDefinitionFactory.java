package com.stripe.android.lpmfoundations.paymentmethod.definitions;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.lpmfoundations.FormHeaderInformation;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.luxe.TransformSpecToElements;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.AfterpayClearpayHeaderElement;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.FormElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AfterpayClearpayDefinition.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/AfterpayClearpayUiDefinitionFactory;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$RequiresSharedDataSpec;", "<init>", "()V", "createSupportedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "sharedDataSpec", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class AfterpayClearpayUiDefinitionFactory implements UiDefinitionFactory.RequiresSharedDataSpec {
    public static final AfterpayClearpayUiDefinitionFactory INSTANCE = new AfterpayClearpayUiDefinitionFactory();

    private AfterpayClearpayUiDefinitionFactory() {
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public boolean canBeDisplayedInUi(PaymentMethodDefinition paymentMethodDefinition, List<SharedDataSpec> list) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.canBeDisplayedInUi(this, paymentMethodDefinition, list);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.RequiresSharedDataSpec
    public List<FormElement> createFormElements(PaymentMethodMetadata paymentMethodMetadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.createFormElements(this, paymentMethodMetadata, sharedDataSpec, transformSpecToElements);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.RequiresSharedDataSpec
    public List<FormElement> createFormElements(PaymentMethodMetadata paymentMethodMetadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements, UiDefinitionFactory.Arguments arguments) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.createFormElements(this, paymentMethodMetadata, sharedDataSpec, transformSpecToElements, arguments);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.RequiresSharedDataSpec
    public FormHeaderInformation createFormHeaderInformation(PaymentMethodMetadata paymentMethodMetadata, SharedDataSpec sharedDataSpec, PaymentMethodIncentive paymentMethodIncentive) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.createFormHeaderInformation(this, paymentMethodMetadata, sharedDataSpec, paymentMethodIncentive);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public List<FormElement> formElements(PaymentMethodDefinition paymentMethodDefinition, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, UiDefinitionFactory.Arguments arguments) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.formElements(this, paymentMethodDefinition, paymentMethodMetadata, list, arguments);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public FormHeaderInformation formHeaderInformation(PaymentMethodDefinition paymentMethodDefinition, PaymentMethodMetadata paymentMethodMetadata, List<SharedDataSpec> list, boolean z) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.formHeaderInformation(this, paymentMethodDefinition, paymentMethodMetadata, list, z);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public SupportedPaymentMethod supportedPaymentMethod(PaymentMethodMetadata paymentMethodMetadata, PaymentMethodDefinition paymentMethodDefinition, List<SharedDataSpec> list) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.supportedPaymentMethod(this, paymentMethodMetadata, paymentMethodDefinition, list);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.RequiresSharedDataSpec
    public SupportedPaymentMethod createSupportedPaymentMethod(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec) {
        int i;
        int i2;
        ResolvableString resolvableString;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
        AfterpayClearpayDefinition afterpayClearpayDefinition = AfterpayClearpayDefinition.INSTANCE;
        if (AfterpayClearpayHeaderElement.INSTANCE.isClearpay(IntentKt.getCurrency(metadata.getStripeIntent()))) {
            i = R.string.stripe_paymentsheet_payment_method_clearpay;
        } else {
            i = R.string.stripe_paymentsheet_payment_method_afterpay;
        }
        int i3 = i;
        if (AfterpayClearpayHeaderElement.INSTANCE.isCashappAfterpay(IntentKt.getCurrency(metadata.getStripeIntent()))) {
            i2 = R.drawable.stripe_ic_paymentsheet_pm_cash_app_pay;
        } else {
            i2 = R.drawable.stripe_ic_paymentsheet_pm_afterpay_clearpay;
        }
        int i4 = i2;
        if (AfterpayClearpayHeaderElement.INSTANCE.isClearpay(IntentKt.getCurrency(metadata.getStripeIntent()))) {
            resolvableString = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.paymentsheet.R.string.stripe_clearpay_subtitle);
        } else if (AfterpayClearpayHeaderElement.INSTANCE.isCashappAfterpay(IntentKt.getCurrency(metadata.getStripeIntent()))) {
            resolvableString = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.paymentsheet.R.string.stripe_cashapp_afterpay_subtitle);
        } else {
            resolvableString = ResolvableStringUtilsKt.getResolvableString(com.stripe.android.paymentsheet.R.string.stripe_afterpay_subtitle);
        }
        return new SupportedPaymentMethod((PaymentMethodDefinition) afterpayClearpayDefinition, sharedDataSpec, i3, i4, (Integer) null, false, resolvableString, (Integer) null, 160, (DefaultConstructorMarker) null);
    }
}
