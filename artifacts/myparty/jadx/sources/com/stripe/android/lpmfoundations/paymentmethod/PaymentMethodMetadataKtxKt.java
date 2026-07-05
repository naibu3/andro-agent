package com.stripe.android.lpmfoundations.paymentmethod;

import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodSaveConsentBehavior;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.PaymentSheet;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodMetadataKtx.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"toPaymentSheetSaveConsentBehavior", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;", "Lcom/stripe/android/model/ElementsSession;", "toDisplayableCustomPaymentMethods", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodMetadataKtxKt {
    public static final PaymentMethodSaveConsentBehavior toPaymentSheetSaveConsentBehavior(ElementsSession elementsSession) {
        ElementsSession.Customer.Session session;
        ElementsSession.Customer.Components components;
        Intrinsics.checkNotNullParameter(elementsSession, "<this>");
        ElementsSession.Customer customer = elementsSession.getCustomer();
        ElementsSession.Customer.Components.MobilePaymentElement mobilePaymentElement = (customer == null || (session = customer.getSession()) == null || (components = session.getComponents()) == null) ? null : components.getMobilePaymentElement();
        if (mobilePaymentElement instanceof ElementsSession.Customer.Components.MobilePaymentElement.Enabled) {
            ElementsSession.Customer.Components.MobilePaymentElement.Enabled enabled = (ElementsSession.Customer.Components.MobilePaymentElement.Enabled) mobilePaymentElement;
            if (enabled.isPaymentMethodSaveEnabled()) {
                return PaymentMethodSaveConsentBehavior.Enabled.INSTANCE;
            }
            return new PaymentMethodSaveConsentBehavior.Disabled(enabled.getAllowRedisplayOverride());
        }
        if (!(mobilePaymentElement instanceof ElementsSession.Customer.Components.MobilePaymentElement.Disabled) && mobilePaymentElement != null) {
            throw new NoWhenBranchMatchedException();
        }
        return PaymentMethodSaveConsentBehavior.Legacy.INSTANCE;
    }

    public static final List<DisplayableCustomPaymentMethod> toDisplayableCustomPaymentMethods(ElementsSession elementsSession, CommonConfiguration configuration) {
        DisplayableCustomPaymentMethod displayableCustomPaymentMethod;
        Intrinsics.checkNotNullParameter(elementsSession, "<this>");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        List<ElementsSession.CustomPaymentMethod> customPaymentMethods = elementsSession.getCustomPaymentMethods();
        ArrayList arrayList = new ArrayList();
        for (ElementsSession.CustomPaymentMethod customPaymentMethod : customPaymentMethods) {
            if (!(customPaymentMethod instanceof ElementsSession.CustomPaymentMethod.Available)) {
                if (!(customPaymentMethod instanceof ElementsSession.CustomPaymentMethod.Unavailable)) {
                    throw new NoWhenBranchMatchedException();
                }
                displayableCustomPaymentMethod = null;
            } else {
                for (PaymentSheet.CustomPaymentMethod customPaymentMethod2 : configuration.getCustomPaymentMethods()) {
                    ElementsSession.CustomPaymentMethod.Available available = (ElementsSession.CustomPaymentMethod.Available) customPaymentMethod;
                    if (Intrinsics.areEqual(available.getType(), customPaymentMethod2.getId())) {
                        displayableCustomPaymentMethod = new DisplayableCustomPaymentMethod(available.getType(), available.getDisplayName(), available.getLogoUrl(), customPaymentMethod2.getSubtitle(), customPaymentMethod2.getDisableBillingDetailCollection());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (displayableCustomPaymentMethod != null) {
                arrayList.add(displayableCustomPaymentMethod);
            }
        }
        return arrayList;
    }
}
