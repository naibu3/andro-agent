package com.stripe.android.lpmfoundations.paymentmethod;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodDefinition.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"isSupported", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentMethodDefinitionKt {
    public static final boolean isSupported(PaymentMethodDefinition paymentMethodDefinition, PaymentMethodMetadata metadata) {
        Intrinsics.checkNotNullParameter(paymentMethodDefinition, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Set<AddPaymentMethodRequirement> setRequirementsToBeUsedAsNewPaymentMethod = paymentMethodDefinition.requirementsToBeUsedAsNewPaymentMethod(metadata.hasIntentToSetup(paymentMethodDefinition.getType().code));
        if ((setRequirementsToBeUsedAsNewPaymentMethod instanceof Collection) && setRequirementsToBeUsedAsNewPaymentMethod.isEmpty()) {
            return true;
        }
        Iterator<T> it = setRequirementsToBeUsedAsNewPaymentMethod.iterator();
        while (it.hasNext()) {
            if (!((AddPaymentMethodRequirement) it.next()).isMetBy(metadata, paymentMethodDefinition.getType().code)) {
                return false;
            }
        }
        return true;
    }
}
