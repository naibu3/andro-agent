package com.stripe.android.lpmfoundations.paymentmethod.definitions;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.lpmfoundations.FormHeaderInformation;
import com.stripe.android.lpmfoundations.luxe.SaveForFutureUseHelperKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.luxe.TransformSpecToElements;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodDefinition;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.MandateTextElement;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.FormElement;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SepaDebitDefinition.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/definitions/SepaDebitUiDefinitionFactory;", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$RequiresSharedDataSpec;", "<init>", "()V", "createFormElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "sharedDataSpec", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "transformSpecToElements", "Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;", "arguments", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "createSupportedPaymentMethod", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SepaDebitUiDefinitionFactory implements UiDefinitionFactory.RequiresSharedDataSpec {
    public static final SepaDebitUiDefinitionFactory INSTANCE = new SepaDebitUiDefinitionFactory();

    private SepaDebitUiDefinitionFactory() {
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
    public List<FormElement> createFormElements(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec, TransformSpecToElements transformSpecToElements, UiDefinitionFactory.Arguments arguments) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
        Intrinsics.checkNotNullParameter(transformSpecToElements, "transformSpecToElements");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        boolean zIsSaveForFutureUseValueChangeable = SaveForFutureUseHelperKt.isSaveForFutureUseValueChangeable(SepaDebitDefinition.INSTANCE.getType().code, metadata);
        List<FormElement> listCreateFormElements = UiDefinitionFactory.RequiresSharedDataSpec.DefaultImpls.createFormElements(this, metadata, sharedDataSpec, transformSpecToElements);
        if (!zIsSaveForFutureUseValueChangeable) {
            return listCreateFormElements;
        }
        List mutableList = CollectionsKt.toMutableList((Collection) listCreateFormElements);
        FormElement formElement = ((FormElement) CollectionsKt.lastOrNull(mutableList)) instanceof MandateTextElement ? (FormElement) mutableList.remove(CollectionsKt.getLastIndex(mutableList)) : null;
        SaveForFutureUseHelperKt.addSavePaymentOptionElements(mutableList, metadata, arguments);
        if (formElement != null) {
            mutableList.add(formElement);
        }
        return CollectionsKt.toList(mutableList);
    }

    @Override // com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory.RequiresSharedDataSpec
    public SupportedPaymentMethod createSupportedPaymentMethod(PaymentMethodMetadata metadata, SharedDataSpec sharedDataSpec) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(sharedDataSpec, "sharedDataSpec");
        return new SupportedPaymentMethod((PaymentMethodDefinition) SepaDebitDefinition.INSTANCE, sharedDataSpec, R.string.stripe_paymentsheet_payment_method_sepa_debit, R.drawable.stripe_ic_paymentsheet_pm_sepa_debit, (Integer) null, false, (ResolvableString) null, (Integer) null, 224, (DefaultConstructorMarker) null);
    }
}
