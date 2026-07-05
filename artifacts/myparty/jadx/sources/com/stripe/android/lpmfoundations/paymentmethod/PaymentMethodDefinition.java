package com.stripe.android.lpmfoundations.paymentmethod;

import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: PaymentMethodDefinition.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0014H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;", "", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "supportedAsSavedPaymentMethod", "", "getSupportedAsSavedPaymentMethod", "()Z", "supportsTermDisplayConfiguration", "getSupportsTermDisplayConfiguration", "requiresMandate", "metadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "requirementsToBeUsedAsNewPaymentMethod", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/AddPaymentMethodRequirement;", "hasIntentToSetup", "uiDefinitionFactory", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PaymentMethodDefinition {

    /* compiled from: PaymentMethodDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getSupportsTermDisplayConfiguration(PaymentMethodDefinition paymentMethodDefinition) {
            return false;
        }
    }

    boolean getSupportedAsSavedPaymentMethod();

    boolean getSupportsTermDisplayConfiguration();

    PaymentMethod.Type getType();

    Set<AddPaymentMethodRequirement> requirementsToBeUsedAsNewPaymentMethod(boolean hasIntentToSetup);

    boolean requiresMandate(PaymentMethodMetadata metadata);

    UiDefinitionFactory uiDefinitionFactory();
}
