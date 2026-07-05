package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.link.model.LinkAppearance;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.MobileCardElementConfigParser;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkConfiguration.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u0083\u0001\u0084\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0006\u0010!\u001a\u00020\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010#\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020\f\u0012\u0006\u0010%\u001a\u00020\f\u0012\u0006\u0010&\u001a\u00020\f\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020\f\u0012\u0006\u0010*\u001a\u00020\f\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b,\u0010-J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010`\u001a\u00020\fHÆ\u0003J\u0015\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000eHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010c\u001a\u00020\u0012HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010e\u001a\u00020\u0016HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010g\u001a\u00020\fHÆ\u0003J\t\u0010h\u001a\u00020\fHÆ\u0003J\t\u0010i\u001a\u00020\fHÆ\u0003J\t\u0010j\u001a\u00020\u001dHÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010m\u001a\u00020\fHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010o\u001a\u00020\fHÆ\u0003J\t\u0010p\u001a\u00020\fHÆ\u0003J\t\u0010q\u001a\u00020\fHÆ\u0003J\t\u0010r\u001a\u00020\fHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010(HÆ\u0003J\t\u0010t\u001a\u00020\fHÆ\u0003J\t\u0010u\u001a\u00020\fHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005HÂ\u0003J¿\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020\f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\f2\b\b\u0002\u0010*\u001a\u00020\f2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010x\u001a\u00020yJ\u0013\u0010z\u001a\u00020\f2\b\u0010{\u001a\u0004\u0018\u00010|HÖ\u0003J\t\u0010}\u001a\u00020yHÖ\u0001J\t\u0010~\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0006\u0010\r\u001a\u00020yR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bE\u00108R\u0011\u0010\u001a\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bF\u00108R\u0011\u0010\u001b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bG\u00108R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bJ\u00101R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010!\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bM\u00108R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u00101R\u0011\u0010#\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bO\u00108R\u0011\u0010$\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bP\u00108R\u0011\u0010%\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bQ\u00108R\u0011\u0010&\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bR\u00108R\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010)\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bU\u00108R\u0011\u0010*\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bV\u00108R\u0010\u0010+\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010W\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bX\u00101R\u0011\u0010Y\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bZ\u00108¨\u0006\u0085\u0001"}, d2 = {"Lcom/stripe/android/link/LinkConfiguration;", "Landroid/os/Parcelable;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "merchantName", "", "merchantCountryCode", "customerInfo", "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "passthroughModeEnabled", "", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "", "cardBrandChoice", "Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "useAttestationEndpointsForLink", "suppress2faModal", "disableRuxInFlowController", "initializationMode", "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "elementsSessionId", "linkMode", "Lcom/stripe/android/model/LinkMode;", "allowDefaultOptIn", "googlePlacesApiKey", "collectMissingBillingDetailsForExistingPaymentMethods", "allowUserEmailEdits", "enableDisplayableDefaultValuesInEce", "skipWalletInFlowController", "linkAppearance", "Lcom/stripe/android/link/model/LinkAppearance;", "linkSignUpOptInFeatureEnabled", "linkSignUpOptInInitialValue", "customerId", "<init>", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)V", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "getMerchantName", "()Ljava/lang/String;", "getMerchantCountryCode", "getCustomerInfo", "()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getPassthroughModeEnabled", "()Z", "getFlags", "()Ljava/util/Map;", "getCardBrandChoice", "()Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getUseAttestationEndpointsForLink", "getSuppress2faModal", "getDisableRuxInFlowController", "getInitializationMode", "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;", "getElementsSessionId", "getLinkMode", "()Lcom/stripe/android/model/LinkMode;", "getAllowDefaultOptIn", "getGooglePlacesApiKey", "getCollectMissingBillingDetailsForExistingPaymentMethods", "getAllowUserEmailEdits", "getEnableDisplayableDefaultValuesInEce", "getSkipWalletInFlowController", "getLinkAppearance", "()Lcom/stripe/android/link/model/LinkAppearance;", "getLinkSignUpOptInFeatureEnabled", "getLinkSignUpOptInInitialValue", "customerIdForEceDefaultValues", "getCustomerIdForEceDefaultValues", "enableLinkPaymentSelectionHint", "getEnableLinkPaymentSelectionHint", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "CustomerInfo", "CardBrandChoice", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkConfiguration implements Parcelable {
    private final boolean allowDefaultOptIn;
    private final boolean allowUserEmailEdits;
    private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
    private final CardBrandChoice cardBrandChoice;
    private final CardBrandFilter cardBrandFilter;
    private final boolean collectMissingBillingDetailsForExistingPaymentMethods;
    private final String customerId;
    private final CustomerInfo customerInfo;
    private final PaymentSheet.BillingDetails defaultBillingDetails;
    private final boolean disableRuxInFlowController;
    private final String elementsSessionId;
    private final boolean enableDisplayableDefaultValuesInEce;
    private final FinancialConnectionsAvailability financialConnectionsAvailability;
    private final Map<String, Boolean> flags;
    private final String googlePlacesApiKey;
    private final PaymentElementLoader.InitializationMode initializationMode;
    private final LinkAppearance linkAppearance;
    private final LinkMode linkMode;
    private final boolean linkSignUpOptInFeatureEnabled;
    private final boolean linkSignUpOptInInitialValue;
    private final String merchantCountryCode;
    private final String merchantName;
    private final boolean passthroughModeEnabled;
    private final AddressDetails shippingDetails;
    private final boolean skipWalletInFlowController;
    private final StripeIntent stripeIntent;
    private final boolean suppress2faModal;
    private final boolean useAttestationEndpointsForLink;
    public static final Parcelable.Creator<LinkConfiguration> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: LinkConfiguration.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkConfiguration createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            LinkedHashMap linkedHashMap;
            CardBrandFilter cardBrandFilter;
            FinancialConnectionsAvailability financialConnectionsAvailability;
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
            PaymentSheet.BillingDetails billingDetails;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            String str;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(LinkConfiguration.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            CustomerInfo customerInfoCreateFromParcel = CustomerInfo.CREATOR.createFromParcel(parcel);
            AddressDetails addressDetailsCreateFromParcel = parcel.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel);
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z11 = false;
            }
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap2.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0 ? z : false));
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            CardBrandChoice cardBrandChoiceCreateFromParcel = parcel.readInt() == 0 ? null : CardBrandChoice.CREATOR.createFromParcel(parcel);
            CardBrandFilter cardBrandFilter2 = (CardBrandFilter) parcel.readParcelable(LinkConfiguration.class.getClassLoader());
            FinancialConnectionsAvailability financialConnectionsAvailabilityValueOf = parcel.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel.readString());
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = PaymentSheet.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel);
            PaymentSheet.BillingDetails billingDetailsCreateFromParcel = parcel.readInt() == 0 ? null : PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z2 = false;
                linkedHashMap = linkedHashMap3;
                cardBrandFilter = cardBrandFilter2;
                financialConnectionsAvailability = financialConnectionsAvailabilityValueOf;
                billingDetailsCollectionConfiguration = billingDetailsCollectionConfigurationCreateFromParcel;
                billingDetails = billingDetailsCreateFromParcel;
                z3 = z;
            } else {
                z2 = false;
                linkedHashMap = linkedHashMap3;
                cardBrandFilter = cardBrandFilter2;
                financialConnectionsAvailability = financialConnectionsAvailabilityValueOf;
                billingDetailsCollectionConfiguration = billingDetailsCollectionConfigurationCreateFromParcel;
                billingDetails = billingDetailsCreateFromParcel;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = z2;
                z2 = z;
            } else {
                z4 = z2;
            }
            if (parcel.readInt() != 0) {
                z5 = z4;
                z4 = z;
            } else {
                z5 = z4;
            }
            PaymentElementLoader.InitializationMode initializationMode = (PaymentElementLoader.InitializationMode) parcel.readParcelable(LinkConfiguration.class.getClassLoader());
            String string3 = parcel.readString();
            LinkMode linkModeValueOf = parcel.readInt() == 0 ? null : LinkMode.valueOf(parcel.readString());
            boolean z12 = parcel.readInt() != 0 ? true : z5;
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
                str = string4;
                z7 = true;
            } else {
                z6 = true;
                str = string4;
                z7 = z5;
            }
            if (parcel.readInt() != 0) {
                z8 = z6;
            } else {
                z8 = z6;
                z6 = z5;
            }
            if (parcel.readInt() != 0) {
                z9 = z8;
            } else {
                z9 = z8;
                z8 = z5;
            }
            if (parcel.readInt() != 0) {
                z10 = z9;
            } else {
                z10 = z9;
                z9 = z5;
            }
            return new LinkConfiguration(stripeIntent, string, string2, customerInfoCreateFromParcel, addressDetailsCreateFromParcel, z11, linkedHashMap, cardBrandChoiceCreateFromParcel, cardBrandFilter, financialConnectionsAvailability, billingDetailsCollectionConfiguration, billingDetails, z3, z2, z4, initializationMode, string3, linkModeValueOf, z12, str, z7, z6, z8, z9, parcel.readInt() != 0 ? LinkAppearance.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? z10 : z5, parcel.readInt() != 0 ? z10 : z5, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkConfiguration[] newArray(int i) {
            return new LinkConfiguration[i];
        }
    }

    /* renamed from: component28, reason: from getter */
    private final String getCustomerId() {
        return this.customerId;
    }

    public static /* synthetic */ LinkConfiguration copy$default(LinkConfiguration linkConfiguration, StripeIntent stripeIntent, String str, String str2, CustomerInfo customerInfo, AddressDetails addressDetails, boolean z, Map map, CardBrandChoice cardBrandChoice, CardBrandFilter cardBrandFilter, FinancialConnectionsAvailability financialConnectionsAvailability, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, PaymentSheet.BillingDetails billingDetails, boolean z2, boolean z3, boolean z4, PaymentElementLoader.InitializationMode initializationMode, String str3, LinkMode linkMode, boolean z5, String str4, boolean z6, boolean z7, boolean z8, boolean z9, LinkAppearance linkAppearance, boolean z10, boolean z11, String str5, int i, Object obj) {
        String str6;
        boolean z12;
        StripeIntent stripeIntent2 = (i & 1) != 0 ? linkConfiguration.stripeIntent : stripeIntent;
        String str7 = (i & 2) != 0 ? linkConfiguration.merchantName : str;
        String str8 = (i & 4) != 0 ? linkConfiguration.merchantCountryCode : str2;
        CustomerInfo customerInfo2 = (i & 8) != 0 ? linkConfiguration.customerInfo : customerInfo;
        AddressDetails addressDetails2 = (i & 16) != 0 ? linkConfiguration.shippingDetails : addressDetails;
        boolean z13 = (i & 32) != 0 ? linkConfiguration.passthroughModeEnabled : z;
        Map map2 = (i & 64) != 0 ? linkConfiguration.flags : map;
        CardBrandChoice cardBrandChoice2 = (i & 128) != 0 ? linkConfiguration.cardBrandChoice : cardBrandChoice;
        CardBrandFilter cardBrandFilter2 = (i & 256) != 0 ? linkConfiguration.cardBrandFilter : cardBrandFilter;
        FinancialConnectionsAvailability financialConnectionsAvailability2 = (i & 512) != 0 ? linkConfiguration.financialConnectionsAvailability : financialConnectionsAvailability;
        PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration2 = (i & 1024) != 0 ? linkConfiguration.billingDetailsCollectionConfiguration : billingDetailsCollectionConfiguration;
        PaymentSheet.BillingDetails billingDetails2 = (i & 2048) != 0 ? linkConfiguration.defaultBillingDetails : billingDetails;
        boolean z14 = (i & 4096) != 0 ? linkConfiguration.useAttestationEndpointsForLink : z2;
        boolean z15 = (i & 8192) != 0 ? linkConfiguration.suppress2faModal : z3;
        StripeIntent stripeIntent3 = stripeIntent2;
        boolean z16 = (i & 16384) != 0 ? linkConfiguration.disableRuxInFlowController : z4;
        PaymentElementLoader.InitializationMode initializationMode2 = (i & 32768) != 0 ? linkConfiguration.initializationMode : initializationMode;
        String str9 = (i & 65536) != 0 ? linkConfiguration.elementsSessionId : str3;
        LinkMode linkMode2 = (i & 131072) != 0 ? linkConfiguration.linkMode : linkMode;
        boolean z17 = (i & 262144) != 0 ? linkConfiguration.allowDefaultOptIn : z5;
        String str10 = (i & 524288) != 0 ? linkConfiguration.googlePlacesApiKey : str4;
        boolean z18 = (i & 1048576) != 0 ? linkConfiguration.collectMissingBillingDetailsForExistingPaymentMethods : z6;
        boolean z19 = (i & 2097152) != 0 ? linkConfiguration.allowUserEmailEdits : z7;
        boolean z20 = (i & 4194304) != 0 ? linkConfiguration.enableDisplayableDefaultValuesInEce : z8;
        boolean z21 = (i & 8388608) != 0 ? linkConfiguration.skipWalletInFlowController : z9;
        LinkAppearance linkAppearance2 = (i & 16777216) != 0 ? linkConfiguration.linkAppearance : linkAppearance;
        boolean z22 = (i & 33554432) != 0 ? linkConfiguration.linkSignUpOptInFeatureEnabled : z10;
        boolean z23 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? linkConfiguration.linkSignUpOptInInitialValue : z11;
        if ((i & 134217728) != 0) {
            z12 = z23;
            str6 = linkConfiguration.customerId;
        } else {
            str6 = str5;
            z12 = z23;
        }
        return linkConfiguration.copy(stripeIntent3, str7, str8, customerInfo2, addressDetails2, z13, map2, cardBrandChoice2, cardBrandFilter2, financialConnectionsAvailability2, billingDetailsCollectionConfiguration2, billingDetails2, z14, z15, z16, initializationMode2, str9, linkMode2, z17, str10, z18, z19, z20, z21, linkAppearance2, z22, z12, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    /* renamed from: component10, reason: from getter */
    public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
        return this.financialConnectionsAvailability;
    }

    /* renamed from: component11, reason: from getter */
    public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    /* renamed from: component12, reason: from getter */
    public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getUseAttestationEndpointsForLink() {
        return this.useAttestationEndpointsForLink;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getSuppress2faModal() {
        return this.suppress2faModal;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getDisableRuxInFlowController() {
        return this.disableRuxInFlowController;
    }

    /* renamed from: component16, reason: from getter */
    public final PaymentElementLoader.InitializationMode getInitializationMode() {
        return this.initializationMode;
    }

    /* renamed from: component17, reason: from getter */
    public final String getElementsSessionId() {
        return this.elementsSessionId;
    }

    /* renamed from: component18, reason: from getter */
    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getAllowDefaultOptIn() {
        return this.allowDefaultOptIn;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component20, reason: from getter */
    public final String getGooglePlacesApiKey() {
        return this.googlePlacesApiKey;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getCollectMissingBillingDetailsForExistingPaymentMethods() {
        return this.collectMissingBillingDetailsForExistingPaymentMethods;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getAllowUserEmailEdits() {
        return this.allowUserEmailEdits;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getEnableDisplayableDefaultValuesInEce() {
        return this.enableDisplayableDefaultValuesInEce;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getSkipWalletInFlowController() {
        return this.skipWalletInFlowController;
    }

    /* renamed from: component25, reason: from getter */
    public final LinkAppearance getLinkAppearance() {
        return this.linkAppearance;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getLinkSignUpOptInFeatureEnabled() {
        return this.linkSignUpOptInFeatureEnabled;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getLinkSignUpOptInInitialValue() {
        return this.linkSignUpOptInInitialValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPassthroughModeEnabled() {
        return this.passthroughModeEnabled;
    }

    public final Map<String, Boolean> component7() {
        return this.flags;
    }

    /* renamed from: component8, reason: from getter */
    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    /* renamed from: component9, reason: from getter */
    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    public final LinkConfiguration copy(StripeIntent stripeIntent, String merchantName, String merchantCountryCode, CustomerInfo customerInfo, AddressDetails shippingDetails, boolean passthroughModeEnabled, Map<String, Boolean> flags, CardBrandChoice cardBrandChoice, CardBrandFilter cardBrandFilter, FinancialConnectionsAvailability financialConnectionsAvailability, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, PaymentSheet.BillingDetails defaultBillingDetails, boolean useAttestationEndpointsForLink, boolean suppress2faModal, boolean disableRuxInFlowController, PaymentElementLoader.InitializationMode initializationMode, String elementsSessionId, LinkMode linkMode, boolean allowDefaultOptIn, String googlePlacesApiKey, boolean collectMissingBillingDetailsForExistingPaymentMethods, boolean allowUserEmailEdits, boolean enableDisplayableDefaultValuesInEce, boolean skipWalletInFlowController, LinkAppearance linkAppearance, boolean linkSignUpOptInFeatureEnabled, boolean linkSignUpOptInInitialValue, String customerId) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
        return new LinkConfiguration(stripeIntent, merchantName, merchantCountryCode, customerInfo, shippingDetails, passthroughModeEnabled, flags, cardBrandChoice, cardBrandFilter, financialConnectionsAvailability, billingDetailsCollectionConfiguration, defaultBillingDetails, useAttestationEndpointsForLink, suppress2faModal, disableRuxInFlowController, initializationMode, elementsSessionId, linkMode, allowDefaultOptIn, googlePlacesApiKey, collectMissingBillingDetailsForExistingPaymentMethods, allowUserEmailEdits, enableDisplayableDefaultValuesInEce, skipWalletInFlowController, linkAppearance, linkSignUpOptInFeatureEnabled, linkSignUpOptInInitialValue, customerId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkConfiguration)) {
            return false;
        }
        LinkConfiguration linkConfiguration = (LinkConfiguration) other;
        return Intrinsics.areEqual(this.stripeIntent, linkConfiguration.stripeIntent) && Intrinsics.areEqual(this.merchantName, linkConfiguration.merchantName) && Intrinsics.areEqual(this.merchantCountryCode, linkConfiguration.merchantCountryCode) && Intrinsics.areEqual(this.customerInfo, linkConfiguration.customerInfo) && Intrinsics.areEqual(this.shippingDetails, linkConfiguration.shippingDetails) && this.passthroughModeEnabled == linkConfiguration.passthroughModeEnabled && Intrinsics.areEqual(this.flags, linkConfiguration.flags) && Intrinsics.areEqual(this.cardBrandChoice, linkConfiguration.cardBrandChoice) && Intrinsics.areEqual(this.cardBrandFilter, linkConfiguration.cardBrandFilter) && this.financialConnectionsAvailability == linkConfiguration.financialConnectionsAvailability && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, linkConfiguration.billingDetailsCollectionConfiguration) && Intrinsics.areEqual(this.defaultBillingDetails, linkConfiguration.defaultBillingDetails) && this.useAttestationEndpointsForLink == linkConfiguration.useAttestationEndpointsForLink && this.suppress2faModal == linkConfiguration.suppress2faModal && this.disableRuxInFlowController == linkConfiguration.disableRuxInFlowController && Intrinsics.areEqual(this.initializationMode, linkConfiguration.initializationMode) && Intrinsics.areEqual(this.elementsSessionId, linkConfiguration.elementsSessionId) && this.linkMode == linkConfiguration.linkMode && this.allowDefaultOptIn == linkConfiguration.allowDefaultOptIn && Intrinsics.areEqual(this.googlePlacesApiKey, linkConfiguration.googlePlacesApiKey) && this.collectMissingBillingDetailsForExistingPaymentMethods == linkConfiguration.collectMissingBillingDetailsForExistingPaymentMethods && this.allowUserEmailEdits == linkConfiguration.allowUserEmailEdits && this.enableDisplayableDefaultValuesInEce == linkConfiguration.enableDisplayableDefaultValuesInEce && this.skipWalletInFlowController == linkConfiguration.skipWalletInFlowController && Intrinsics.areEqual(this.linkAppearance, linkConfiguration.linkAppearance) && this.linkSignUpOptInFeatureEnabled == linkConfiguration.linkSignUpOptInFeatureEnabled && this.linkSignUpOptInInitialValue == linkConfiguration.linkSignUpOptInInitialValue && Intrinsics.areEqual(this.customerId, linkConfiguration.customerId);
    }

    public int hashCode() {
        int iHashCode = ((this.stripeIntent.hashCode() * 31) + this.merchantName.hashCode()) * 31;
        String str = this.merchantCountryCode;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.customerInfo.hashCode()) * 31;
        AddressDetails addressDetails = this.shippingDetails;
        int iHashCode3 = (((((iHashCode2 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + Boolean.hashCode(this.passthroughModeEnabled)) * 31) + this.flags.hashCode()) * 31;
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        int iHashCode4 = (((iHashCode3 + (cardBrandChoice == null ? 0 : cardBrandChoice.hashCode())) * 31) + this.cardBrandFilter.hashCode()) * 31;
        FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
        int iHashCode5 = (((iHashCode4 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31;
        PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
        int iHashCode6 = (((((((((((iHashCode5 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31) + Boolean.hashCode(this.useAttestationEndpointsForLink)) * 31) + Boolean.hashCode(this.suppress2faModal)) * 31) + Boolean.hashCode(this.disableRuxInFlowController)) * 31) + this.initializationMode.hashCode()) * 31) + this.elementsSessionId.hashCode()) * 31;
        LinkMode linkMode = this.linkMode;
        int iHashCode7 = (((iHashCode6 + (linkMode == null ? 0 : linkMode.hashCode())) * 31) + Boolean.hashCode(this.allowDefaultOptIn)) * 31;
        String str2 = this.googlePlacesApiKey;
        int iHashCode8 = (((((((((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.collectMissingBillingDetailsForExistingPaymentMethods)) * 31) + Boolean.hashCode(this.allowUserEmailEdits)) * 31) + Boolean.hashCode(this.enableDisplayableDefaultValuesInEce)) * 31) + Boolean.hashCode(this.skipWalletInFlowController)) * 31;
        LinkAppearance linkAppearance = this.linkAppearance;
        int iHashCode9 = (((((iHashCode8 + (linkAppearance == null ? 0 : linkAppearance.hashCode())) * 31) + Boolean.hashCode(this.linkSignUpOptInFeatureEnabled)) * 31) + Boolean.hashCode(this.linkSignUpOptInInitialValue)) * 31;
        String str3 = this.customerId;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LinkConfiguration(stripeIntent=" + this.stripeIntent + ", merchantName=" + this.merchantName + ", merchantCountryCode=" + this.merchantCountryCode + ", customerInfo=" + this.customerInfo + ", shippingDetails=" + this.shippingDetails + ", passthroughModeEnabled=" + this.passthroughModeEnabled + ", flags=" + this.flags + ", cardBrandChoice=" + this.cardBrandChoice + ", cardBrandFilter=" + this.cardBrandFilter + ", financialConnectionsAvailability=" + this.financialConnectionsAvailability + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", defaultBillingDetails=" + this.defaultBillingDetails + ", useAttestationEndpointsForLink=" + this.useAttestationEndpointsForLink + ", suppress2faModal=" + this.suppress2faModal + ", disableRuxInFlowController=" + this.disableRuxInFlowController + ", initializationMode=" + this.initializationMode + ", elementsSessionId=" + this.elementsSessionId + ", linkMode=" + this.linkMode + ", allowDefaultOptIn=" + this.allowDefaultOptIn + ", googlePlacesApiKey=" + this.googlePlacesApiKey + ", collectMissingBillingDetailsForExistingPaymentMethods=" + this.collectMissingBillingDetailsForExistingPaymentMethods + ", allowUserEmailEdits=" + this.allowUserEmailEdits + ", enableDisplayableDefaultValuesInEce=" + this.enableDisplayableDefaultValuesInEce + ", skipWalletInFlowController=" + this.skipWalletInFlowController + ", linkAppearance=" + this.linkAppearance + ", linkSignUpOptInFeatureEnabled=" + this.linkSignUpOptInFeatureEnabled + ", linkSignUpOptInInitialValue=" + this.linkSignUpOptInInitialValue + ", customerId=" + this.customerId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.stripeIntent, flags);
        dest.writeString(this.merchantName);
        dest.writeString(this.merchantCountryCode);
        this.customerInfo.writeToParcel(dest, flags);
        AddressDetails addressDetails = this.shippingDetails;
        if (addressDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            addressDetails.writeToParcel(dest, flags);
        }
        dest.writeInt(this.passthroughModeEnabled ? 1 : 0);
        Map<String, Boolean> map = this.flags;
        dest.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        if (cardBrandChoice == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardBrandChoice.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.cardBrandFilter, flags);
        FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
        if (financialConnectionsAvailability == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(financialConnectionsAvailability.name());
        }
        this.billingDetailsCollectionConfiguration.writeToParcel(dest, flags);
        PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
        if (billingDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billingDetails.writeToParcel(dest, flags);
        }
        dest.writeInt(this.useAttestationEndpointsForLink ? 1 : 0);
        dest.writeInt(this.suppress2faModal ? 1 : 0);
        dest.writeInt(this.disableRuxInFlowController ? 1 : 0);
        dest.writeParcelable(this.initializationMode, flags);
        dest.writeString(this.elementsSessionId);
        LinkMode linkMode = this.linkMode;
        if (linkMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(linkMode.name());
        }
        dest.writeInt(this.allowDefaultOptIn ? 1 : 0);
        dest.writeString(this.googlePlacesApiKey);
        dest.writeInt(this.collectMissingBillingDetailsForExistingPaymentMethods ? 1 : 0);
        dest.writeInt(this.allowUserEmailEdits ? 1 : 0);
        dest.writeInt(this.enableDisplayableDefaultValuesInEce ? 1 : 0);
        dest.writeInt(this.skipWalletInFlowController ? 1 : 0);
        LinkAppearance linkAppearance = this.linkAppearance;
        if (linkAppearance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkAppearance.writeToParcel(dest, flags);
        }
        dest.writeInt(this.linkSignUpOptInFeatureEnabled ? 1 : 0);
        dest.writeInt(this.linkSignUpOptInInitialValue ? 1 : 0);
        dest.writeString(this.customerId);
    }

    public LinkConfiguration(StripeIntent stripeIntent, String merchantName, String str, CustomerInfo customerInfo, AddressDetails addressDetails, boolean z, Map<String, Boolean> flags, CardBrandChoice cardBrandChoice, CardBrandFilter cardBrandFilter, FinancialConnectionsAvailability financialConnectionsAvailability, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, PaymentSheet.BillingDetails billingDetails, boolean z2, boolean z3, boolean z4, PaymentElementLoader.InitializationMode initializationMode, String elementsSessionId, LinkMode linkMode, boolean z5, String str2, boolean z6, boolean z7, boolean z8, boolean z9, LinkAppearance linkAppearance, boolean z10, boolean z11, String str3) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Intrinsics.checkNotNullParameter(initializationMode, "initializationMode");
        Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
        this.stripeIntent = stripeIntent;
        this.merchantName = merchantName;
        this.merchantCountryCode = str;
        this.customerInfo = customerInfo;
        this.shippingDetails = addressDetails;
        this.passthroughModeEnabled = z;
        this.flags = flags;
        this.cardBrandChoice = cardBrandChoice;
        this.cardBrandFilter = cardBrandFilter;
        this.financialConnectionsAvailability = financialConnectionsAvailability;
        this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
        this.defaultBillingDetails = billingDetails;
        this.useAttestationEndpointsForLink = z2;
        this.suppress2faModal = z3;
        this.disableRuxInFlowController = z4;
        this.initializationMode = initializationMode;
        this.elementsSessionId = elementsSessionId;
        this.linkMode = linkMode;
        this.allowDefaultOptIn = z5;
        this.googlePlacesApiKey = str2;
        this.collectMissingBillingDetailsForExistingPaymentMethods = z6;
        this.allowUserEmailEdits = z7;
        this.enableDisplayableDefaultValuesInEce = z8;
        this.skipWalletInFlowController = z9;
        this.linkAppearance = linkAppearance;
        this.linkSignUpOptInFeatureEnabled = z10;
        this.linkSignUpOptInInitialValue = z11;
        this.customerId = str3;
    }

    public /* synthetic */ LinkConfiguration(StripeIntent stripeIntent, String str, String str2, CustomerInfo customerInfo, AddressDetails addressDetails, boolean z, Map map, CardBrandChoice cardBrandChoice, CardBrandFilter cardBrandFilter, FinancialConnectionsAvailability financialConnectionsAvailability, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, PaymentSheet.BillingDetails billingDetails, boolean z2, boolean z3, boolean z4, PaymentElementLoader.InitializationMode initializationMode, String str3, LinkMode linkMode, boolean z5, String str4, boolean z6, boolean z7, boolean z8, boolean z9, LinkAppearance linkAppearance, boolean z10, boolean z11, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeIntent, str, str2, customerInfo, addressDetails, z, map, cardBrandChoice, cardBrandFilter, financialConnectionsAvailability, billingDetailsCollectionConfiguration, billingDetails, z2, z3, z4, initializationMode, str3, linkMode, z5, (i & 524288) != 0 ? null : str4, z6, z7, z8, z9, linkAppearance, z10, z11, str5);
    }

    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public final boolean getPassthroughModeEnabled() {
        return this.passthroughModeEnabled;
    }

    public final Map<String, Boolean> getFlags() {
        return this.flags;
    }

    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
        return this.financialConnectionsAvailability;
    }

    public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    public final boolean getUseAttestationEndpointsForLink() {
        return this.useAttestationEndpointsForLink;
    }

    public final boolean getSuppress2faModal() {
        return this.suppress2faModal;
    }

    public final boolean getDisableRuxInFlowController() {
        return this.disableRuxInFlowController;
    }

    public final PaymentElementLoader.InitializationMode getInitializationMode() {
        return this.initializationMode;
    }

    public final String getElementsSessionId() {
        return this.elementsSessionId;
    }

    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    public final boolean getAllowDefaultOptIn() {
        return this.allowDefaultOptIn;
    }

    public final String getGooglePlacesApiKey() {
        return this.googlePlacesApiKey;
    }

    public final boolean getCollectMissingBillingDetailsForExistingPaymentMethods() {
        return this.collectMissingBillingDetailsForExistingPaymentMethods;
    }

    public final boolean getAllowUserEmailEdits() {
        return this.allowUserEmailEdits;
    }

    public final boolean getEnableDisplayableDefaultValuesInEce() {
        return this.enableDisplayableDefaultValuesInEce;
    }

    public final boolean getSkipWalletInFlowController() {
        return this.skipWalletInFlowController;
    }

    public final LinkAppearance getLinkAppearance() {
        return this.linkAppearance;
    }

    public final boolean getLinkSignUpOptInFeatureEnabled() {
        return this.linkSignUpOptInFeatureEnabled;
    }

    public final boolean getLinkSignUpOptInInitialValue() {
        return this.linkSignUpOptInInitialValue;
    }

    public final String getCustomerIdForEceDefaultValues() {
        if (this.enableDisplayableDefaultValuesInEce) {
            return this.customerId;
        }
        return null;
    }

    public final boolean getEnableLinkPaymentSelectionHint() {
        return Intrinsics.areEqual((Object) this.flags.get("link_mobile_enable_payment_selection_hint"), (Object) true);
    }

    /* compiled from: LinkConfiguration.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;", "Landroid/os/Parcelable;", "name", "", "email", "phone", "billingCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getEmail", "getPhone", "getBillingCountryCode", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomerInfo implements Parcelable {
        private final String billingCountryCode;
        private final String email;
        private final String name;
        private final String phone;
        public static final Parcelable.Creator<CustomerInfo> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkConfiguration.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomerInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomerInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomerInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomerInfo[] newArray(int i) {
                return new CustomerInfo[i];
            }
        }

        public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customerInfo.name;
            }
            if ((i & 2) != 0) {
                str2 = customerInfo.email;
            }
            if ((i & 4) != 0) {
                str3 = customerInfo.phone;
            }
            if ((i & 8) != 0) {
                str4 = customerInfo.billingCountryCode;
            }
            return customerInfo.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBillingCountryCode() {
            return this.billingCountryCode;
        }

        public final CustomerInfo copy(String name, String email, String phone, String billingCountryCode) {
            return new CustomerInfo(name, email, phone, billingCountryCode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerInfo)) {
                return false;
            }
            CustomerInfo customerInfo = (CustomerInfo) other;
            return Intrinsics.areEqual(this.name, customerInfo.name) && Intrinsics.areEqual(this.email, customerInfo.email) && Intrinsics.areEqual(this.phone, customerInfo.phone) && Intrinsics.areEqual(this.billingCountryCode, customerInfo.billingCountryCode);
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.email;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.billingCountryCode;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "CustomerInfo(name=" + this.name + ", email=" + this.email + ", phone=" + this.phone + ", billingCountryCode=" + this.billingCountryCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.email);
            dest.writeString(this.phone);
            dest.writeString(this.billingCountryCode);
        }

        public CustomerInfo(String str, String str2, String str3, String str4) {
            this.name = str;
            this.email = str2;
            this.phone = str3;
            this.billingCountryCode = str4;
        }

        public final String getName() {
            return this.name;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getBillingCountryCode() {
            return this.billingCountryCode;
        }
    }

    /* compiled from: LinkConfiguration.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;", "Landroid/os/Parcelable;", MobileCardElementConfigParser.FIELD_ELIGIBLE, "", "preferredNetworks", "", "", "<init>", "(ZLjava/util/List;)V", "getEligible", "()Z", "getPreferredNetworks", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardBrandChoice implements Parcelable {
        private final boolean eligible;
        private final List<String> preferredNetworks;
        public static final Parcelable.Creator<CardBrandChoice> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: LinkConfiguration.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CardBrandChoice> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBrandChoice createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardBrandChoice(parcel.readInt() != 0, parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardBrandChoice[] newArray(int i) {
                return new CardBrandChoice[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CardBrandChoice copy$default(CardBrandChoice cardBrandChoice, boolean z, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cardBrandChoice.eligible;
            }
            if ((i & 2) != 0) {
                list = cardBrandChoice.preferredNetworks;
            }
            return cardBrandChoice.copy(z, list);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEligible() {
            return this.eligible;
        }

        public final List<String> component2() {
            return this.preferredNetworks;
        }

        public final CardBrandChoice copy(boolean eligible, List<String> preferredNetworks) {
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            return new CardBrandChoice(eligible, preferredNetworks);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardBrandChoice)) {
                return false;
            }
            CardBrandChoice cardBrandChoice = (CardBrandChoice) other;
            return this.eligible == cardBrandChoice.eligible && Intrinsics.areEqual(this.preferredNetworks, cardBrandChoice.preferredNetworks);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.eligible) * 31) + this.preferredNetworks.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.eligible + ", preferredNetworks=" + this.preferredNetworks + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.eligible ? 1 : 0);
            dest.writeStringList(this.preferredNetworks);
        }

        public CardBrandChoice(boolean z, List<String> preferredNetworks) {
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            this.eligible = z;
            this.preferredNetworks = preferredNetworks;
        }

        public final boolean getEligible() {
            return this.eligible;
        }

        public final List<String> getPreferredNetworks() {
            return this.preferredNetworks;
        }
    }
}
