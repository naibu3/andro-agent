package com.stripe.android.lpmfoundations.luxe;

import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.forms.PlaceholderHelper;
import com.stripe.android.paymentsheet.model.IntentKt;
import com.stripe.android.ui.core.elements.AddressSpec;
import com.stripe.android.ui.core.elements.AffirmTextSpec;
import com.stripe.android.ui.core.elements.AfterpayClearpayTextSpec;
import com.stripe.android.ui.core.elements.AuBankAccountNumberSpec;
import com.stripe.android.ui.core.elements.AuBecsDebitMandateTextSpec;
import com.stripe.android.ui.core.elements.BacsDebitBankAccountSpec;
import com.stripe.android.ui.core.elements.BacsDebitConfirmSpec;
import com.stripe.android.ui.core.elements.BsbSpec;
import com.stripe.android.ui.core.elements.CashAppPayMandateTextSpec;
import com.stripe.android.ui.core.elements.CountrySpec;
import com.stripe.android.ui.core.elements.DropdownSpec;
import com.stripe.android.ui.core.elements.EmailSpec;
import com.stripe.android.ui.core.elements.EmptyFormElement;
import com.stripe.android.ui.core.elements.EmptyFormSpec;
import com.stripe.android.ui.core.elements.FormItemSpec;
import com.stripe.android.ui.core.elements.IbanSpec;
import com.stripe.android.ui.core.elements.KlarnaHeaderStaticTextSpec;
import com.stripe.android.ui.core.elements.KlarnaMandateTextSpec;
import com.stripe.android.ui.core.elements.MandateTextSpec;
import com.stripe.android.ui.core.elements.NameSpec;
import com.stripe.android.ui.core.elements.OTPSpec;
import com.stripe.android.ui.core.elements.PhoneSpec;
import com.stripe.android.ui.core.elements.PlaceholderSpec;
import com.stripe.android.ui.core.elements.SepaMandateTextSpec;
import com.stripe.android.ui.core.elements.SimpleTextSpec;
import com.stripe.android.ui.core.elements.StaticTextSpec;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransformSpecToElements.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/lpmfoundations/luxe/TransformSpecToElements;", "", "arguments", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;", "<init>", "(Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments;)V", ViewProps.TRANSFORM, "", "Lcom/stripe/android/uicore/elements/FormElement;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "specs", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "placeholderOverrideList", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransformSpecToElements {
    public static final int $stable = 8;
    private final UiDefinitionFactory.Arguments arguments;

    public TransformSpecToElements(UiDefinitionFactory.Arguments arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.arguments = arguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List transform$default(TransformSpecToElements transformSpecToElements, PaymentMethodMetadata paymentMethodMetadata, List list, List list2, int i, Object obj) {
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return transformSpecToElements.transform(paymentMethodMetadata, list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.stripe.android.uicore.elements.Controller, com.stripe.android.uicore.elements.IdentifierSpec, kotlin.jvm.internal.DefaultConstructorMarker] */
    public final List<FormElement> transform(PaymentMethodMetadata metadata, List<? extends FormItemSpec> specs, List<IdentifierSpec> placeholderOverrideList) {
        List<FormElement> listListOf;
        StripeIntent stripeIntent;
        Intrinsics.checkNotNullParameter(specs, "specs");
        Intrinsics.checkNotNullParameter(placeholderOverrideList, "placeholderOverrideList");
        List<FormItemSpec> listSpecsForConfiguration$paymentsheet_release = PlaceholderHelper.INSTANCE.specsForConfiguration$paymentsheet_release(specs, placeholderOverrideList, this.arguments.getRequiresMandate(), this.arguments.getBillingDetailsCollectionConfiguration());
        ArrayList arrayList = new ArrayList();
        for (FormItemSpec formItemSpec : listSpecsForConfiguration$paymentsheet_release) {
            if (formItemSpec instanceof StaticTextSpec) {
                listListOf = CollectionsKt.listOf(((StaticTextSpec) formItemSpec).transform());
            } else {
                String currency = 0;
                currency = 0;
                if (formItemSpec instanceof AfterpayClearpayTextSpec) {
                    AfterpayClearpayTextSpec afterpayClearpayTextSpec = (AfterpayClearpayTextSpec) formItemSpec;
                    if (metadata != null && (stripeIntent = metadata.getStripeIntent()) != null) {
                        currency = IntentKt.getCurrency(stripeIntent);
                    }
                    listListOf = CollectionsKt.listOf(afterpayClearpayTextSpec.transform(currency));
                } else if (formItemSpec instanceof AffirmTextSpec) {
                    listListOf = CollectionsKt.listOf(((AffirmTextSpec) formItemSpec).transform());
                } else if (formItemSpec instanceof EmptyFormSpec) {
                    listListOf = CollectionsKt.listOf(new EmptyFormElement(currency, currency, 3, currency));
                } else if (formItemSpec instanceof MandateTextSpec) {
                    listListOf = CollectionsKt.listOf(((MandateTextSpec) formItemSpec).transform(this.arguments.getMerchantName()));
                } else if (formItemSpec instanceof AuBecsDebitMandateTextSpec) {
                    listListOf = CollectionsKt.listOf(((AuBecsDebitMandateTextSpec) formItemSpec).transform(this.arguments.getMerchantName()));
                } else if (formItemSpec instanceof BacsDebitBankAccountSpec) {
                    listListOf = CollectionsKt.listOf(((BacsDebitBankAccountSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof BacsDebitConfirmSpec) {
                    listListOf = CollectionsKt.listOf(((BacsDebitConfirmSpec) formItemSpec).transform(this.arguments.getMerchantName(), this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof BsbSpec) {
                    listListOf = CollectionsKt.listOf(((BsbSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof OTPSpec) {
                    listListOf = CollectionsKt.listOf(((OTPSpec) formItemSpec).transform());
                } else if (formItemSpec instanceof NameSpec) {
                    listListOf = CollectionsKt.listOf(((NameSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof EmailSpec) {
                    listListOf = CollectionsKt.listOf(((EmailSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof PhoneSpec) {
                    listListOf = CollectionsKt.listOf(((PhoneSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof SimpleTextSpec) {
                    listListOf = CollectionsKt.listOf(((SimpleTextSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof AuBankAccountNumberSpec) {
                    listListOf = CollectionsKt.listOf(((AuBankAccountNumberSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof IbanSpec) {
                    listListOf = CollectionsKt.listOf(((IbanSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof KlarnaHeaderStaticTextSpec) {
                    listListOf = CollectionsKt.listOf(((KlarnaHeaderStaticTextSpec) formItemSpec).transform());
                } else if (formItemSpec instanceof DropdownSpec) {
                    listListOf = CollectionsKt.listOf(((DropdownSpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof CountrySpec) {
                    listListOf = CollectionsKt.listOf(((CountrySpec) formItemSpec).transform(this.arguments.getInitialValues()));
                } else if (formItemSpec instanceof AddressSpec) {
                    listListOf = ((AddressSpec) formItemSpec).transform(this.arguments.getInitialValues(), this.arguments.getShippingValues(), this.arguments.getAutocompleteAddressInteractorFactory());
                } else if (formItemSpec instanceof SepaMandateTextSpec) {
                    listListOf = CollectionsKt.listOf(((SepaMandateTextSpec) formItemSpec).transform(this.arguments.getMerchantName()));
                } else if (formItemSpec instanceof PlaceholderSpec) {
                    listListOf = CollectionsKt.emptyList();
                } else if (formItemSpec instanceof CashAppPayMandateTextSpec) {
                    listListOf = CollectionsKt.listOf(((CashAppPayMandateTextSpec) formItemSpec).transform(this.arguments.getMerchantName()));
                } else {
                    if (!(formItemSpec instanceof KlarnaMandateTextSpec)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listListOf = CollectionsKt.listOf(((KlarnaMandateTextSpec) formItemSpec).transform(this.arguments.getMerchantName()));
                }
            }
            CollectionsKt.addAll(arrayList, listListOf);
        }
        return arrayList;
    }
}
