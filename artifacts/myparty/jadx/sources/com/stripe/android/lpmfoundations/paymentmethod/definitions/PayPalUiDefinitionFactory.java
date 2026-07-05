package com.stripe.android.lpmfoundations.paymentmethod.definitions;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.FormHeaderInformation;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.luxe.TransformSpecToElements;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.MandateTextSpec;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PayPalDefinition.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/PayPalUiDefinitionFactory;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$RequiresSharedDataSpec;", "<init>", "()V", "createSupportedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "sharedDataSpec", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "createFormElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "transformSpecToElements", "Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PayPalUiDefinitionFactory implements UiDefinitionFactory.RequiresSharedDataSpec {
    public static final PayPalUiDefinitionFactory INSTANCE = new PayPalUiDefinitionFactory();

    private PayPalUiDefinitionFactory() {
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory
    public boolean canBeDisplayedInUi(PaymentMethodDefinition paymentMethodDefinition, List<SharedDataSpec> list) {
        return UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.canBeDisplayedInUi(this, paymentMethodDefinition, list);
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
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
        return new SupportedPaymentMethod((PaymentMethodDefinition) PayPalDefinition.INSTANCE, sharedDataSpec, R.string.stripe_paymentsheet_payment_method_paypal, R.drawable.stripe_ic_paymentsheet_pm_paypal, (Integer) null, false, (ResolvableString) null, (Integer) null, 224, (DefaultConstructorMarker) null);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.RequiresSharedDataSpec
    public List<FormElement> createFormElements(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
        Intrinsics.checkNotNullParameter(transformSpecToElements, "transformSpecToElements");
        if (PayPalDefinition.INSTANCE.requiresMandate(metadata)) {
            listEmptyList = CollectionsKt.listOf(new MandateTextSpec((IdentifierSpec) null, R.string.stripe_paypal_mandate, 1, (DefaultConstructorMarker) null));
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return TransformSpecToElements.transform$default(transformSpecToElements, metadata, CollectionsKt.plus((Collection) sharedDataSpec.getFields(), (Iterable) listEmptyList), null, 4, null);
    }
}
