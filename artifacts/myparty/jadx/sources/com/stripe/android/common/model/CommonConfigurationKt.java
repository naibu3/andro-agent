package com.stripe.android.common.model;

import com.stripe.android.common.configuration.ConfigurationDefaults;
import com.stripe.android.link.LinkController;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: CommonConfiguration.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\u0014\u0010\t\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0002\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"asCommonConfiguration", "Lcom/stripe/android/common/model/CommonConfiguration;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Configuration;", "Lcom/stripe/android/link/LinkController$Configuration;", "isEKClientSecretValid", "", "", "EK_CLIENT_SECRET_VALID_REGEX_PATTERN", "containsVolatileDifferences", "other", "toVolatileConfiguration", "Lcom/stripe/android/common/model/VolatileCommonConfiguration;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonConfigurationKt {
    private static final String EK_CLIENT_SECRET_VALID_REGEX_PATTERN = "^ek_[^_](.)+$";

    public static final CommonConfiguration asCommonConfiguration(PaymentSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return new CommonConfiguration(configuration.getMerchantDisplayName(), configuration.getCustomer(), configuration.getGooglePay(), configuration.getLink$paymentsheet_release(), configuration.getDefaultBillingDetails(), configuration.getShippingDetails(), configuration.getAllowsDelayedPaymentMethods(), configuration.getAllowsPaymentMethodsRequiringShippingAddress(), configuration.getBillingDetailsCollectionConfiguration(), configuration.getPreferredNetworks(), configuration.getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release(), configuration.getPaymentMethodOrder$paymentsheet_release(), configuration.getExternalPaymentMethods$paymentsheet_release(), configuration.getCardBrandAcceptance$paymentsheet_release(), configuration.getCustomPaymentMethods$paymentsheet_release(), configuration.getShopPayConfiguration$paymentsheet_release(), configuration.getGooglePlacesApiKey$paymentsheet_release(), null, configuration.getTermsDisplay$paymentsheet_release(), configuration.getWalletButtons$paymentsheet_release(), 131072, null);
    }

    public static final CommonConfiguration asCommonConfiguration(EmbeddedPaymentElement.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return new CommonConfiguration(configuration.getMerchantDisplayName(), configuration.getCustomer(), configuration.getGooglePay(), configuration.getLink(), configuration.getDefaultBillingDetails(), configuration.getShippingDetails(), configuration.getAllowsDelayedPaymentMethods(), configuration.getAllowsPaymentMethodsRequiringShippingAddress(), configuration.getBillingDetailsCollectionConfiguration(), configuration.getPreferredNetworks$paymentsheet_release(), configuration.getAllowsRemovalOfLastSavedPaymentMethod(), configuration.getPaymentMethodOrder$paymentsheet_release(), configuration.getExternalPaymentMethods$paymentsheet_release(), configuration.getCardBrandAcceptance(), configuration.getCustomPaymentMethods$paymentsheet_release(), null, null, null, configuration.getTermsDisplay$paymentsheet_release(), null, 131072, null);
    }

    public static final CommonConfiguration asCommonConfiguration(LinkController.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return new CommonConfiguration(configuration.getMerchantDisplayName(), null, null, new PaymentSheet.LinkConfiguration(PaymentSheet.LinkConfiguration.Display.Automatic, true, configuration.getAllowUserEmailEdits()), configuration.getDefaultBillingDetails(), null, false, false, configuration.getBillingDetailsCollectionConfiguration(), ConfigurationDefaults.INSTANCE.getPreferredNetworks(), true, ConfigurationDefaults.INSTANCE.getPaymentMethodOrder(), ConfigurationDefaults.INSTANCE.getExternalPaymentMethods(), configuration.getCardBrandAcceptance(), ConfigurationDefaults.INSTANCE.getCustomPaymentMethods(), null, null, configuration.getLinkAppearance(), MapsKt.emptyMap(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isEKClientSecretValid(String str) {
        return new Regex(EK_CLIENT_SECRET_VALID_REGEX_PATTERN).matches(str);
    }

    public static final boolean containsVolatileDifferences(CommonConfiguration commonConfiguration, CommonConfiguration other) {
        Intrinsics.checkNotNullParameter(commonConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !Intrinsics.areEqual(toVolatileConfiguration(commonConfiguration), toVolatileConfiguration(other));
    }

    private static final VolatileCommonConfiguration toVolatileConfiguration(CommonConfiguration commonConfiguration) {
        return new VolatileCommonConfiguration(commonConfiguration.getDefaultBillingDetails(), commonConfiguration.getBillingDetailsCollectionConfiguration(), commonConfiguration.getCardBrandAcceptance());
    }
}
