package com.stripe.android.common.configuration;

import android.content.res.ColorStateList;
import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ConfigurationDefaults.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0&¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\"0&¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020A0&¢\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0011\u0010C\u001a\u00020D¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010G\u001a\u0004\u0018\u00010H¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010K\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bL\u0010$R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/stripe/android/common/configuration/ConfigurationDefaults;", "", "<init>", "()V", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", "allowsRemovalOfLastSavedPaymentMethod", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "billingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getCustomer", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getGooglePay", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "link", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "getLink", "()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "googlePayEnabled", "headerTextForSelectionScreen", "", "getHeaderTextForSelectionScreen", "()Ljava/lang/String;", "paymentMethodOrder", "", "getPaymentMethodOrder", "()Ljava/util/List;", "preferredNetworks", "Lcom/stripe/android/model/CardBrand;", "getPreferredNetworks", "primaryButtonColor", "Landroid/content/res/ColorStateList;", "getPrimaryButtonColor", "()Landroid/content/res/ColorStateList;", "primaryButtonLabel", "getPrimaryButtonLabel", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "externalPaymentMethods", "getExternalPaymentMethods", "paymentMethodLayout", "Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "getPaymentMethodLayout", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "getCardBrandAcceptance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "customPaymentMethods", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "getCustomPaymentMethods", "walletButtons", "Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;", "getWalletButtons", "()Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;", "shopPayConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "getShopPayConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "googlePlacesApiKey", "getGooglePlacesApiKey", "embeddedViewDisplaysMandateText", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfigurationDefaults {
    public static final boolean allowsDelayedPaymentMethods = false;
    public static final boolean allowsPaymentMethodsRequiringShippingAddress = false;
    public static final boolean allowsRemovalOfLastSavedPaymentMethod = true;
    private static final PaymentSheet.CustomerConfiguration customer = null;
    public static final boolean embeddedViewDisplaysMandateText = true;
    private static final PaymentSheet.GooglePayConfiguration googlePay = null;
    public static final boolean googlePayEnabled = false;
    private static final String googlePlacesApiKey = null;
    private static final String headerTextForSelectionScreen = null;
    private static final ColorStateList primaryButtonColor = null;
    private static final String primaryButtonLabel = null;
    private static final AddressDetails shippingDetails = null;
    private static final PaymentSheet.ShopPayConfiguration shopPayConfiguration = null;
    public static final ConfigurationDefaults INSTANCE = new ConfigurationDefaults();
    private static final PaymentSheet.Appearance appearance = new PaymentSheet.Appearance();
    private static final PaymentSheet.BillingDetails billingDetails = new PaymentSheet.BillingDetails(null, null, null, null, 15, null);
    private static final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = new PaymentSheet.BillingDetailsCollectionConfiguration(0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 31, null);
    private static final PaymentSheet.LinkConfiguration link = new PaymentSheet.LinkConfiguration((PaymentSheet.LinkConfiguration.Display) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    private static final List<String> paymentMethodOrder = CollectionsKt.emptyList();
    private static final List<CardBrand> preferredNetworks = CollectionsKt.emptyList();
    private static final List<String> externalPaymentMethods = CollectionsKt.emptyList();
    private static final PaymentSheet.PaymentMethodLayout paymentMethodLayout = PaymentSheet.PaymentMethodLayout.Automatic;
    private static final PaymentSheet.CardBrandAcceptance cardBrandAcceptance = PaymentSheet.CardBrandAcceptance.All.INSTANCE;
    private static final List<PaymentSheet.CustomPaymentMethod> customPaymentMethods = CollectionsKt.emptyList();
    private static final PaymentSheet.WalletButtonsConfiguration walletButtons = new PaymentSheet.WalletButtonsConfiguration(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    public static final int $stable = 8;

    private ConfigurationDefaults() {
    }

    public final PaymentSheet.Appearance getAppearance() {
        return appearance;
    }

    public final PaymentSheet.BillingDetails getBillingDetails() {
        return billingDetails;
    }

    public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return billingDetailsCollectionConfiguration;
    }

    public final PaymentSheet.CustomerConfiguration getCustomer() {
        return customer;
    }

    public final PaymentSheet.GooglePayConfiguration getGooglePay() {
        return googlePay;
    }

    public final PaymentSheet.LinkConfiguration getLink() {
        return link;
    }

    public final String getHeaderTextForSelectionScreen() {
        return headerTextForSelectionScreen;
    }

    public final List<String> getPaymentMethodOrder() {
        return paymentMethodOrder;
    }

    public final List<CardBrand> getPreferredNetworks() {
        return preferredNetworks;
    }

    public final ColorStateList getPrimaryButtonColor() {
        return primaryButtonColor;
    }

    public final String getPrimaryButtonLabel() {
        return primaryButtonLabel;
    }

    public final AddressDetails getShippingDetails() {
        return shippingDetails;
    }

    public final List<String> getExternalPaymentMethods() {
        return externalPaymentMethods;
    }

    public final PaymentSheet.PaymentMethodLayout getPaymentMethodLayout() {
        return paymentMethodLayout;
    }

    public final PaymentSheet.CardBrandAcceptance getCardBrandAcceptance() {
        return cardBrandAcceptance;
    }

    public final List<PaymentSheet.CustomPaymentMethod> getCustomPaymentMethods() {
        return customPaymentMethods;
    }

    public final PaymentSheet.WalletButtonsConfiguration getWalletButtons() {
        return walletButtons;
    }

    public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
        return shopPayConfiguration;
    }

    public final String getGooglePlacesApiKey() {
        return googlePlacesApiKey;
    }
}
