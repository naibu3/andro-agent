package com.stripe.android.lpmfoundations.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.common.configuration.ConfigurationDefaults;
import com.stripe.android.common.model.CommonConfiguration;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.utils.LinkBillingDetailsUtilsKt;
import com.stripe.android.lpmfoundations.FormHeaderInformation;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.lpmfoundations.paymentmethod.CustomerMetadata;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodSaveConsentBehavior;
import com.stripe.android.lpmfoundations.paymentmethod.UiDefinitionFactory;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.CustomPaymentMethodUiDefinitionFactory;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.ExternalPaymentMethodUiDefinitionFactory;
import com.stripe.android.lpmfoundations.paymentmethod.definitions.LinkCardBrandDefinition;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.LinkConsumerIncentive;
import com.stripe.android.model.LinkMode;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.payments.financialconnections.GetFinancialConnectionsAvailability;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentiveKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.ui.core.elements.ExternalPaymentMethodSpec;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.FormElement;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodMetadata.kt */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 ¬\u00012\u00020\u0001:\u0002¬\u0001B\u0091\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020\u000e\u0012\b\u0010.\u001a\u0004\u0018\u00010/\u0012\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301¢\u0006\u0004\b4\u00105J\u0012\u0010a\u001a\u00020\u00072\n\u0010b\u001a\u00060\u000ej\u0002`cJ\u000e\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u000202J\u000e\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u000eJ\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ\f\u0010i\u001a\b\u0012\u0004\u0012\u0002020\u000bJ\u0010\u0010j\u001a\u0004\u0018\u00010k2\u0006\u0010b\u001a\u00020\u000eJ\f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0\u000bJ\u000e\u0010m\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u001e\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020o01*\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u000e\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u000e\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u000e\u0010r\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u000eJ\u000e\u0010s\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u000eJ\u0012\u0010t\u001a\u0004\u0018\u00010u2\u0006\u0010b\u001a\u00020\u000eH\u0002J\u0012\u0010v\u001a\u0004\u0018\u00010u2\u0006\u0010b\u001a\u00020\u000eH\u0002J\u000e\u0010w\u001a\b\u0012\u0004\u0012\u00020x0\u000bH\u0002J\b\u0010y\u001a\u0004\u0018\u00010zJ\u0018\u0010{\u001a\u0004\u0018\u00010|2\u0006\u0010b\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020\u0007J \u0010~\u001a\n\u0012\u0004\u0012\u00020\u007f\u0018\u00010\u000b2\u0006\u0010b\u001a\u00020\u000e2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u001e\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\n\u0010b\u001a\u00060\u000ej\u0002`cJ\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u0010\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bHÆ\u0003J\u0010\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190\u000bHÆ\u0003J\u0010\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000bHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020 HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\"HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010*HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020,HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u000eHÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\u0016\u0010\u009f\u0001\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301HÆ\u0003JÈ\u0002\u0010 \u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u000e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301HÆ\u0001J\u0007\u0010¡\u0001\u001a\u00020oJ\u0016\u0010¢\u0001\u001a\u00020\u00072\n\u0010£\u0001\u001a\u0005\u0018\u00010¤\u0001HÖ\u0003J\n\u0010¥\u0001\u001a\u00020oHÖ\u0001J\n\u0010¦\u0001\u001a\u00020\u000eHÖ\u0001J\u001b\u0010§\u0001\u001a\u00030¨\u00012\b\u0010©\u0001\u001a\u00030ª\u00012\u0007\u0010«\u0001\u001a\u00020oR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b¢\u0006\b\n\u0000\u001a\u0004\bI\u0010?R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010?R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b¢\u0006\b\n\u0000\u001a\u0004\bK\u0010?R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u001e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010;R\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010-\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010DR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u001d\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`¨\u0006\u00ad\u0001"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "Landroid/os/Parcelable;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", "allowsLinkInSavedPaymentMethods", "availableWallets", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;", "paymentMethodOrder", "", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "merchantName", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "sharedDataSpecs", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "displayableCustomPaymentMethods", "Lcom/stripe/android/lpmfoundations/paymentmethod/DisplayableCustomPaymentMethod;", "externalPaymentMethodSpecs", "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "customerMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;", "isGooglePayReady", "linkConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "paymentMethodSaveConsentBehavior", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;", "linkMode", "Lcom/stripe/android/model/LinkMode;", "linkState", "Lcom/stripe/android/paymentsheet/state/LinkState;", "paymentMethodIncentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "elementsSessionId", "shopPayConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "termsDisplay", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;ZZZLjava/util/List;Ljava/util/List;Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;ZLcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;Lcom/stripe/android/model/LinkMode;Lcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/CardBrandFilter;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/util/Map;)V", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getAllowsDelayedPaymentMethods", "()Z", "getAllowsPaymentMethodsRequiringShippingAddress", "getAllowsLinkInSavedPaymentMethods", "getAvailableWallets", "()Ljava/util/List;", "getPaymentMethodOrder", "getCbcEligibility", "()Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "getMerchantName", "()Ljava/lang/String;", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getSharedDataSpecs", "getDisplayableCustomPaymentMethods", "getExternalPaymentMethodSpecs", "getCustomerMetadata", "()Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;", "getLinkConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "getPaymentMethodSaveConsentBehavior", "()Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;", "getLinkMode", "()Lcom/stripe/android/model/LinkMode;", "getLinkState", "()Lcom/stripe/android/paymentsheet/state/LinkState;", "getPaymentMethodIncentive", "()Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "getFinancialConnectionsAvailability", "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "getCardBrandFilter", "()Lcom/stripe/android/CardBrandFilter;", "getElementsSessionId", "getShopPayConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "getTermsDisplay", "()Ljava/util/Map;", "hasIntentToSetup", "code", "Lcom/stripe/android/model/PaymentMethodCode;", "mandateAllowed", "paymentMethodType", "requiresMandate", "paymentMethodCode", "supportedPaymentMethodTypes", "supportedSavedPaymentMethodTypes", "supportedPaymentMethodForCode", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "sortedSupportedPaymentMethods", "orderedPaymentMethodTypes", "mapOrderToIndex", "", "externalPaymentMethodTypes", "customPaymentMethodIds", "isExternalPaymentMethod", "isCustomPaymentMethod", "getUiDefinitionFactoryForCustomPaymentMethod", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Simple;", "getUiDefinitionFactoryForExternalPaymentMethod", "supportedPaymentMethodDefinitions", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodDefinition;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "Lcom/stripe/android/ui/core/Amount;", "formHeaderInformationForCode", "Lcom/stripe/android/lpmfoundations/FormHeaderInformation;", "customerHasSavedPaymentMethods", "formElementsForCode", "Lcom/stripe/android/uicore/elements/FormElement;", "uiDefinitionFactoryArgumentsFactory", "Lcom/stripe/android/lpmfoundations/paymentmethod/UiDefinitionFactory$Arguments$Factory;", "allowRedisplay", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentMethodMetadata implements Parcelable {
    private final boolean allowsDelayedPaymentMethods;
    private final boolean allowsLinkInSavedPaymentMethods;
    private final boolean allowsPaymentMethodsRequiringShippingAddress;
    private final List<WalletType> availableWallets;
    private final PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
    private final CardBrandFilter cardBrandFilter;
    private final CardBrandChoiceEligibility cbcEligibility;
    private final CustomerMetadata customerMetadata;
    private final PaymentSheet.BillingDetails defaultBillingDetails;
    private final List<DisplayableCustomPaymentMethod> displayableCustomPaymentMethods;
    private final String elementsSessionId;
    private final List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs;
    private final FinancialConnectionsAvailability financialConnectionsAvailability;
    private final boolean isGooglePayReady;
    private final PaymentSheet.LinkConfiguration linkConfiguration;
    private final LinkMode linkMode;
    private final LinkState linkState;
    private final String merchantName;
    private final PaymentMethodIncentive paymentMethodIncentive;
    private final List<String> paymentMethodOrder;
    private final PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior;
    private final List<SharedDataSpec> sharedDataSpecs;
    private final AddressDetails shippingDetails;
    private final PaymentSheet.ShopPayConfiguration shopPayConfiguration;
    private final StripeIntent stripeIntent;
    private final Map<PaymentMethod.Type, PaymentSheet.TermsDisplay> termsDisplay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PaymentMethodMetadata> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PaymentMethodMetadata.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodMetadata createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            AddressDetails addressDetails;
            ArrayList arrayList2;
            boolean z;
            LinkMode linkMode;
            LinkState linkStateCreateFromParcel;
            LinkState linkState;
            PaymentMethodIncentive paymentMethodIncentiveCreateFromParcel;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            StripeIntent stripeIntent = (StripeIntent) parcel2.readParcelable(PaymentMethodMetadata.class.getClassLoader());
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = PaymentSheet.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel2);
            boolean z2 = false;
            if (parcel2.readInt() != 0) {
                i = 0;
                z2 = true;
            } else {
                i = 0;
            }
            boolean z3 = parcel2.readInt() != 0 ? 1 : i;
            boolean z4 = parcel2.readInt() != 0 ? 1 : i;
            int i2 = parcel2.readInt();
            ArrayList arrayList3 = new ArrayList(i2);
            for (int i3 = i; i3 != i2; i3++) {
                arrayList3.add(WalletType.valueOf(parcel2.readString()));
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<String> arrayListCreateStringArrayList = parcel2.createStringArrayList();
            CardBrandChoiceEligibility cardBrandChoiceEligibility = (CardBrandChoiceEligibility) parcel2.readParcelable(PaymentMethodMetadata.class.getClassLoader());
            String string = parcel2.readString();
            PaymentSheet.BillingDetails billingDetailsCreateFromParcel = parcel2.readInt() == 0 ? null : PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel2);
            AddressDetails addressDetailsCreateFromParcel = parcel2.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel2);
            int i4 = parcel2.readInt();
            ArrayList arrayList5 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList5.add(parcel2.readParcelable(PaymentMethodMetadata.class.getClassLoader()));
            }
            ArrayList arrayList6 = arrayList5;
            int i6 = parcel2.readInt();
            ArrayList arrayList7 = new ArrayList(i6);
            int i7 = 0;
            while (true) {
                arrayList = arrayList6;
                if (i7 == i6) {
                    break;
                }
                arrayList7.add(DisplayableCustomPaymentMethod.CREATOR.createFromParcel(parcel2));
                i7++;
                arrayList6 = arrayList;
            }
            ArrayList arrayList8 = arrayList7;
            int i8 = parcel2.readInt();
            ArrayList arrayList9 = new ArrayList(i8);
            int i9 = 0;
            while (i9 != i8) {
                arrayList9.add(parcel2.readParcelable(PaymentMethodMetadata.class.getClassLoader()));
                i9++;
                i8 = i8;
            }
            ArrayList arrayList10 = arrayList9;
            CustomerMetadata customerMetadataCreateFromParcel = parcel2.readInt() == 0 ? null : CustomerMetadata.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() != 0) {
                addressDetails = addressDetailsCreateFromParcel;
                arrayList2 = arrayList;
                z = true;
            } else {
                addressDetails = addressDetailsCreateFromParcel;
                arrayList2 = arrayList;
                z = false;
            }
            PaymentSheet.LinkConfiguration linkConfigurationCreateFromParcel = PaymentSheet.LinkConfiguration.CREATOR.createFromParcel(parcel2);
            PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior = (PaymentMethodSaveConsentBehavior) parcel2.readParcelable(PaymentMethodMetadata.class.getClassLoader());
            LinkMode linkModeValueOf = parcel2.readInt() == 0 ? null : LinkMode.valueOf(parcel2.readString());
            if (parcel2.readInt() == 0) {
                linkMode = linkModeValueOf;
                linkStateCreateFromParcel = null;
            } else {
                linkMode = linkModeValueOf;
                linkStateCreateFromParcel = LinkState.CREATOR.createFromParcel(parcel2);
            }
            LinkState linkState2 = linkStateCreateFromParcel;
            if (parcel2.readInt() == 0) {
                linkState = linkState2;
                paymentMethodIncentiveCreateFromParcel = null;
            } else {
                linkState = linkState2;
                paymentMethodIncentiveCreateFromParcel = PaymentMethodIncentive.CREATOR.createFromParcel(parcel2);
            }
            PaymentMethodIncentive paymentMethodIncentive = paymentMethodIncentiveCreateFromParcel;
            FinancialConnectionsAvailability financialConnectionsAvailabilityValueOf = parcel2.readInt() == 0 ? null : FinancialConnectionsAvailability.valueOf(parcel2.readString());
            CardBrandFilter cardBrandFilter = (CardBrandFilter) parcel2.readParcelable(PaymentMethodMetadata.class.getClassLoader());
            String string2 = parcel2.readString();
            PaymentSheet.ShopPayConfiguration shopPayConfigurationCreateFromParcel = parcel2.readInt() == 0 ? null : PaymentSheet.ShopPayConfiguration.CREATOR.createFromParcel(parcel2);
            int i10 = parcel2.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            int i11 = 0;
            while (i11 != i10) {
                linkedHashMap.put(parcel2.readParcelable(PaymentMethodMetadata.class.getClassLoader()), PaymentSheet.TermsDisplay.valueOf(parcel2.readString()));
                i11++;
                parcel2 = parcel;
                i10 = i10;
            }
            return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfigurationCreateFromParcel, z2, z3, z4, arrayList4, arrayListCreateStringArrayList, cardBrandChoiceEligibility, string, billingDetailsCreateFromParcel, addressDetails, arrayList2, arrayList8, arrayList10, customerMetadataCreateFromParcel, z, linkConfigurationCreateFromParcel, paymentMethodSaveConsentBehavior, linkMode, linkState, paymentMethodIncentive, financialConnectionsAvailabilityValueOf, cardBrandFilter, string2, shopPayConfigurationCreateFromParcel, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodMetadata[] newArray(int i) {
            return new PaymentMethodMetadata[i];
        }
    }

    public static /* synthetic */ PaymentMethodMetadata copy$default(PaymentMethodMetadata paymentMethodMetadata, StripeIntent stripeIntent, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z, boolean z2, boolean z3, List list, List list2, CardBrandChoiceEligibility cardBrandChoiceEligibility, String str, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, List list3, List list4, List list5, CustomerMetadata customerMetadata, boolean z4, PaymentSheet.LinkConfiguration linkConfiguration, PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior, LinkMode linkMode, LinkState linkState, PaymentMethodIncentive paymentMethodIncentive, FinancialConnectionsAvailability financialConnectionsAvailability, CardBrandFilter cardBrandFilter, String str2, PaymentSheet.ShopPayConfiguration shopPayConfiguration, Map map, int i, Object obj) {
        Map map2;
        PaymentSheet.ShopPayConfiguration shopPayConfiguration2;
        StripeIntent stripeIntent2 = (i & 1) != 0 ? paymentMethodMetadata.stripeIntent : stripeIntent;
        PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration2 = (i & 2) != 0 ? paymentMethodMetadata.billingDetailsCollectionConfiguration : billingDetailsCollectionConfiguration;
        boolean z5 = (i & 4) != 0 ? paymentMethodMetadata.allowsDelayedPaymentMethods : z;
        boolean z6 = (i & 8) != 0 ? paymentMethodMetadata.allowsPaymentMethodsRequiringShippingAddress : z2;
        boolean z7 = (i & 16) != 0 ? paymentMethodMetadata.allowsLinkInSavedPaymentMethods : z3;
        List list6 = (i & 32) != 0 ? paymentMethodMetadata.availableWallets : list;
        List list7 = (i & 64) != 0 ? paymentMethodMetadata.paymentMethodOrder : list2;
        CardBrandChoiceEligibility cardBrandChoiceEligibility2 = (i & 128) != 0 ? paymentMethodMetadata.cbcEligibility : cardBrandChoiceEligibility;
        String str3 = (i & 256) != 0 ? paymentMethodMetadata.merchantName : str;
        PaymentSheet.BillingDetails billingDetails2 = (i & 512) != 0 ? paymentMethodMetadata.defaultBillingDetails : billingDetails;
        AddressDetails addressDetails2 = (i & 1024) != 0 ? paymentMethodMetadata.shippingDetails : addressDetails;
        List list8 = (i & 2048) != 0 ? paymentMethodMetadata.sharedDataSpecs : list3;
        List list9 = (i & 4096) != 0 ? paymentMethodMetadata.displayableCustomPaymentMethods : list4;
        List list10 = (i & 8192) != 0 ? paymentMethodMetadata.externalPaymentMethodSpecs : list5;
        StripeIntent stripeIntent3 = stripeIntent2;
        CustomerMetadata customerMetadata2 = (i & 16384) != 0 ? paymentMethodMetadata.customerMetadata : customerMetadata;
        boolean z8 = (i & 32768) != 0 ? paymentMethodMetadata.isGooglePayReady : z4;
        PaymentSheet.LinkConfiguration linkConfiguration2 = (i & 65536) != 0 ? paymentMethodMetadata.linkConfiguration : linkConfiguration;
        PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior2 = (i & 131072) != 0 ? paymentMethodMetadata.paymentMethodSaveConsentBehavior : paymentMethodSaveConsentBehavior;
        LinkMode linkMode2 = (i & 262144) != 0 ? paymentMethodMetadata.linkMode : linkMode;
        LinkState linkState2 = (i & 524288) != 0 ? paymentMethodMetadata.linkState : linkState;
        PaymentMethodIncentive paymentMethodIncentive2 = (i & 1048576) != 0 ? paymentMethodMetadata.paymentMethodIncentive : paymentMethodIncentive;
        FinancialConnectionsAvailability financialConnectionsAvailability2 = (i & 2097152) != 0 ? paymentMethodMetadata.financialConnectionsAvailability : financialConnectionsAvailability;
        CardBrandFilter cardBrandFilter2 = (i & 4194304) != 0 ? paymentMethodMetadata.cardBrandFilter : cardBrandFilter;
        String str4 = (i & 8388608) != 0 ? paymentMethodMetadata.elementsSessionId : str2;
        PaymentSheet.ShopPayConfiguration shopPayConfiguration3 = (i & 16777216) != 0 ? paymentMethodMetadata.shopPayConfiguration : shopPayConfiguration;
        if ((i & 33554432) != 0) {
            shopPayConfiguration2 = shopPayConfiguration3;
            map2 = paymentMethodMetadata.termsDisplay;
        } else {
            map2 = map;
            shopPayConfiguration2 = shopPayConfiguration3;
        }
        return paymentMethodMetadata.copy(stripeIntent3, billingDetailsCollectionConfiguration2, z5, z6, z7, list6, list7, cardBrandChoiceEligibility2, str3, billingDetails2, addressDetails2, list8, list9, list10, customerMetadata2, z8, linkConfiguration2, paymentMethodSaveConsentBehavior2, linkMode2, linkState2, paymentMethodIncentive2, financialConnectionsAvailability2, cardBrandFilter2, str4, shopPayConfiguration2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    /* renamed from: component10, reason: from getter */
    public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    /* renamed from: component11, reason: from getter */
    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public final List<SharedDataSpec> component12() {
        return this.sharedDataSpecs;
    }

    public final List<DisplayableCustomPaymentMethod> component13() {
        return this.displayableCustomPaymentMethods;
    }

    public final List<ExternalPaymentMethodSpec> component14() {
        return this.externalPaymentMethodSpecs;
    }

    /* renamed from: component15, reason: from getter */
    public final CustomerMetadata getCustomerMetadata() {
        return this.customerMetadata;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsGooglePayReady() {
        return this.isGooglePayReady;
    }

    /* renamed from: component17, reason: from getter */
    public final PaymentSheet.LinkConfiguration getLinkConfiguration() {
        return this.linkConfiguration;
    }

    /* renamed from: component18, reason: from getter */
    public final PaymentMethodSaveConsentBehavior getPaymentMethodSaveConsentBehavior() {
        return this.paymentMethodSaveConsentBehavior;
    }

    /* renamed from: component19, reason: from getter */
    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    /* renamed from: component2, reason: from getter */
    public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    /* renamed from: component20, reason: from getter */
    public final LinkState getLinkState() {
        return this.linkState;
    }

    /* renamed from: component21, reason: from getter */
    public final PaymentMethodIncentive getPaymentMethodIncentive() {
        return this.paymentMethodIncentive;
    }

    /* renamed from: component22, reason: from getter */
    public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
        return this.financialConnectionsAvailability;
    }

    /* renamed from: component23, reason: from getter */
    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    /* renamed from: component24, reason: from getter */
    public final String getElementsSessionId() {
        return this.elementsSessionId;
    }

    /* renamed from: component25, reason: from getter */
    public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
        return this.shopPayConfiguration;
    }

    public final Map<PaymentMethod.Type, PaymentSheet.TermsDisplay> component26() {
        return this.termsDisplay;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getAllowsDelayedPaymentMethods() {
        return this.allowsDelayedPaymentMethods;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
        return this.allowsPaymentMethodsRequiringShippingAddress;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAllowsLinkInSavedPaymentMethods() {
        return this.allowsLinkInSavedPaymentMethods;
    }

    public final List<WalletType> component6() {
        return this.availableWallets;
    }

    public final List<String> component7() {
        return this.paymentMethodOrder;
    }

    /* renamed from: component8, reason: from getter */
    public final CardBrandChoiceEligibility getCbcEligibility() {
        return this.cbcEligibility;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final PaymentMethodMetadata copy(StripeIntent stripeIntent, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean allowsDelayedPaymentMethods, boolean allowsPaymentMethodsRequiringShippingAddress, boolean allowsLinkInSavedPaymentMethods, List<? extends WalletType> availableWallets, List<String> paymentMethodOrder, CardBrandChoiceEligibility cbcEligibility, String merchantName, PaymentSheet.BillingDetails defaultBillingDetails, AddressDetails shippingDetails, List<SharedDataSpec> sharedDataSpecs, List<DisplayableCustomPaymentMethod> displayableCustomPaymentMethods, List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs, CustomerMetadata customerMetadata, boolean isGooglePayReady, PaymentSheet.LinkConfiguration linkConfiguration, PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior, LinkMode linkMode, LinkState linkState, PaymentMethodIncentive paymentMethodIncentive, FinancialConnectionsAvailability financialConnectionsAvailability, CardBrandFilter cardBrandFilter, String elementsSessionId, PaymentSheet.ShopPayConfiguration shopPayConfiguration, Map<PaymentMethod.Type, ? extends PaymentSheet.TermsDisplay> termsDisplay) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Intrinsics.checkNotNullParameter(availableWallets, "availableWallets");
        Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
        Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
        Intrinsics.checkNotNullParameter(displayableCustomPaymentMethods, "displayableCustomPaymentMethods");
        Intrinsics.checkNotNullParameter(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Intrinsics.checkNotNullParameter(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
        Intrinsics.checkNotNullParameter(termsDisplay, "termsDisplay");
        return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfiguration, allowsDelayedPaymentMethods, allowsPaymentMethodsRequiringShippingAddress, allowsLinkInSavedPaymentMethods, availableWallets, paymentMethodOrder, cbcEligibility, merchantName, defaultBillingDetails, shippingDetails, sharedDataSpecs, displayableCustomPaymentMethods, externalPaymentMethodSpecs, customerMetadata, isGooglePayReady, linkConfiguration, paymentMethodSaveConsentBehavior, linkMode, linkState, paymentMethodIncentive, financialConnectionsAvailability, cardBrandFilter, elementsSessionId, shopPayConfiguration, termsDisplay);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodMetadata)) {
            return false;
        }
        PaymentMethodMetadata paymentMethodMetadata = (PaymentMethodMetadata) other;
        return Intrinsics.areEqual(this.stripeIntent, paymentMethodMetadata.stripeIntent) && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, paymentMethodMetadata.billingDetailsCollectionConfiguration) && this.allowsDelayedPaymentMethods == paymentMethodMetadata.allowsDelayedPaymentMethods && this.allowsPaymentMethodsRequiringShippingAddress == paymentMethodMetadata.allowsPaymentMethodsRequiringShippingAddress && this.allowsLinkInSavedPaymentMethods == paymentMethodMetadata.allowsLinkInSavedPaymentMethods && Intrinsics.areEqual(this.availableWallets, paymentMethodMetadata.availableWallets) && Intrinsics.areEqual(this.paymentMethodOrder, paymentMethodMetadata.paymentMethodOrder) && Intrinsics.areEqual(this.cbcEligibility, paymentMethodMetadata.cbcEligibility) && Intrinsics.areEqual(this.merchantName, paymentMethodMetadata.merchantName) && Intrinsics.areEqual(this.defaultBillingDetails, paymentMethodMetadata.defaultBillingDetails) && Intrinsics.areEqual(this.shippingDetails, paymentMethodMetadata.shippingDetails) && Intrinsics.areEqual(this.sharedDataSpecs, paymentMethodMetadata.sharedDataSpecs) && Intrinsics.areEqual(this.displayableCustomPaymentMethods, paymentMethodMetadata.displayableCustomPaymentMethods) && Intrinsics.areEqual(this.externalPaymentMethodSpecs, paymentMethodMetadata.externalPaymentMethodSpecs) && Intrinsics.areEqual(this.customerMetadata, paymentMethodMetadata.customerMetadata) && this.isGooglePayReady == paymentMethodMetadata.isGooglePayReady && Intrinsics.areEqual(this.linkConfiguration, paymentMethodMetadata.linkConfiguration) && Intrinsics.areEqual(this.paymentMethodSaveConsentBehavior, paymentMethodMetadata.paymentMethodSaveConsentBehavior) && this.linkMode == paymentMethodMetadata.linkMode && Intrinsics.areEqual(this.linkState, paymentMethodMetadata.linkState) && Intrinsics.areEqual(this.paymentMethodIncentive, paymentMethodMetadata.paymentMethodIncentive) && this.financialConnectionsAvailability == paymentMethodMetadata.financialConnectionsAvailability && Intrinsics.areEqual(this.cardBrandFilter, paymentMethodMetadata.cardBrandFilter) && Intrinsics.areEqual(this.elementsSessionId, paymentMethodMetadata.elementsSessionId) && Intrinsics.areEqual(this.shopPayConfiguration, paymentMethodMetadata.shopPayConfiguration) && Intrinsics.areEqual(this.termsDisplay, paymentMethodMetadata.termsDisplay);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.stripeIntent.hashCode() * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + Boolean.hashCode(this.allowsDelayedPaymentMethods)) * 31) + Boolean.hashCode(this.allowsPaymentMethodsRequiringShippingAddress)) * 31) + Boolean.hashCode(this.allowsLinkInSavedPaymentMethods)) * 31) + this.availableWallets.hashCode()) * 31) + this.paymentMethodOrder.hashCode()) * 31) + this.cbcEligibility.hashCode()) * 31) + this.merchantName.hashCode()) * 31;
        PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
        int iHashCode2 = (iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        AddressDetails addressDetails = this.shippingDetails;
        int iHashCode3 = (((((((iHashCode2 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + this.sharedDataSpecs.hashCode()) * 31) + this.displayableCustomPaymentMethods.hashCode()) * 31) + this.externalPaymentMethodSpecs.hashCode()) * 31;
        CustomerMetadata customerMetadata = this.customerMetadata;
        int iHashCode4 = (((((((iHashCode3 + (customerMetadata == null ? 0 : customerMetadata.hashCode())) * 31) + Boolean.hashCode(this.isGooglePayReady)) * 31) + this.linkConfiguration.hashCode()) * 31) + this.paymentMethodSaveConsentBehavior.hashCode()) * 31;
        LinkMode linkMode = this.linkMode;
        int iHashCode5 = (iHashCode4 + (linkMode == null ? 0 : linkMode.hashCode())) * 31;
        LinkState linkState = this.linkState;
        int iHashCode6 = (iHashCode5 + (linkState == null ? 0 : linkState.hashCode())) * 31;
        PaymentMethodIncentive paymentMethodIncentive = this.paymentMethodIncentive;
        int iHashCode7 = (iHashCode6 + (paymentMethodIncentive == null ? 0 : paymentMethodIncentive.hashCode())) * 31;
        FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
        int iHashCode8 = (((((iHashCode7 + (financialConnectionsAvailability == null ? 0 : financialConnectionsAvailability.hashCode())) * 31) + this.cardBrandFilter.hashCode()) * 31) + this.elementsSessionId.hashCode()) * 31;
        PaymentSheet.ShopPayConfiguration shopPayConfiguration = this.shopPayConfiguration;
        return ((iHashCode8 + (shopPayConfiguration != null ? shopPayConfiguration.hashCode() : 0)) * 31) + this.termsDisplay.hashCode();
    }

    public String toString() {
        return "PaymentMethodMetadata(stripeIntent=" + this.stripeIntent + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", allowsDelayedPaymentMethods=" + this.allowsDelayedPaymentMethods + ", allowsPaymentMethodsRequiringShippingAddress=" + this.allowsPaymentMethodsRequiringShippingAddress + ", allowsLinkInSavedPaymentMethods=" + this.allowsLinkInSavedPaymentMethods + ", availableWallets=" + this.availableWallets + ", paymentMethodOrder=" + this.paymentMethodOrder + ", cbcEligibility=" + this.cbcEligibility + ", merchantName=" + this.merchantName + ", defaultBillingDetails=" + this.defaultBillingDetails + ", shippingDetails=" + this.shippingDetails + ", sharedDataSpecs=" + this.sharedDataSpecs + ", displayableCustomPaymentMethods=" + this.displayableCustomPaymentMethods + ", externalPaymentMethodSpecs=" + this.externalPaymentMethodSpecs + ", customerMetadata=" + this.customerMetadata + ", isGooglePayReady=" + this.isGooglePayReady + ", linkConfiguration=" + this.linkConfiguration + ", paymentMethodSaveConsentBehavior=" + this.paymentMethodSaveConsentBehavior + ", linkMode=" + this.linkMode + ", linkState=" + this.linkState + ", paymentMethodIncentive=" + this.paymentMethodIncentive + ", financialConnectionsAvailability=" + this.financialConnectionsAvailability + ", cardBrandFilter=" + this.cardBrandFilter + ", elementsSessionId=" + this.elementsSessionId + ", shopPayConfiguration=" + this.shopPayConfiguration + ", termsDisplay=" + this.termsDisplay + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.stripeIntent, flags);
        this.billingDetailsCollectionConfiguration.writeToParcel(dest, flags);
        dest.writeInt(this.allowsDelayedPaymentMethods ? 1 : 0);
        dest.writeInt(this.allowsPaymentMethodsRequiringShippingAddress ? 1 : 0);
        dest.writeInt(this.allowsLinkInSavedPaymentMethods ? 1 : 0);
        List<WalletType> list = this.availableWallets;
        dest.writeInt(list.size());
        Iterator<WalletType> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeStringList(this.paymentMethodOrder);
        dest.writeParcelable(this.cbcEligibility, flags);
        dest.writeString(this.merchantName);
        PaymentSheet.BillingDetails billingDetails = this.defaultBillingDetails;
        if (billingDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billingDetails.writeToParcel(dest, flags);
        }
        AddressDetails addressDetails = this.shippingDetails;
        if (addressDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            addressDetails.writeToParcel(dest, flags);
        }
        List<SharedDataSpec> list2 = this.sharedDataSpecs;
        dest.writeInt(list2.size());
        Iterator<SharedDataSpec> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        List<DisplayableCustomPaymentMethod> list3 = this.displayableCustomPaymentMethods;
        dest.writeInt(list3.size());
        Iterator<DisplayableCustomPaymentMethod> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, flags);
        }
        List<ExternalPaymentMethodSpec> list4 = this.externalPaymentMethodSpecs;
        dest.writeInt(list4.size());
        Iterator<ExternalPaymentMethodSpec> it4 = list4.iterator();
        while (it4.hasNext()) {
            dest.writeParcelable(it4.next(), flags);
        }
        CustomerMetadata customerMetadata = this.customerMetadata;
        if (customerMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customerMetadata.writeToParcel(dest, flags);
        }
        dest.writeInt(this.isGooglePayReady ? 1 : 0);
        this.linkConfiguration.writeToParcel(dest, flags);
        dest.writeParcelable(this.paymentMethodSaveConsentBehavior, flags);
        LinkMode linkMode = this.linkMode;
        if (linkMode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(linkMode.name());
        }
        LinkState linkState = this.linkState;
        if (linkState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkState.writeToParcel(dest, flags);
        }
        PaymentMethodIncentive paymentMethodIncentive = this.paymentMethodIncentive;
        if (paymentMethodIncentive == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentMethodIncentive.writeToParcel(dest, flags);
        }
        FinancialConnectionsAvailability financialConnectionsAvailability = this.financialConnectionsAvailability;
        if (financialConnectionsAvailability == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(financialConnectionsAvailability.name());
        }
        dest.writeParcelable(this.cardBrandFilter, flags);
        dest.writeString(this.elementsSessionId);
        PaymentSheet.ShopPayConfiguration shopPayConfiguration = this.shopPayConfiguration;
        if (shopPayConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            shopPayConfiguration.writeToParcel(dest, flags);
        }
        Map<PaymentMethod.Type, PaymentSheet.TermsDisplay> map = this.termsDisplay;
        dest.writeInt(map.size());
        for (Map.Entry<PaymentMethod.Type, PaymentSheet.TermsDisplay> entry : map.entrySet()) {
            dest.writeParcelable(entry.getKey(), flags);
            dest.writeString(entry.getValue().name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodMetadata(StripeIntent stripeIntent, PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, boolean z, boolean z2, boolean z3, List<? extends WalletType> availableWallets, List<String> paymentMethodOrder, CardBrandChoiceEligibility cbcEligibility, String merchantName, PaymentSheet.BillingDetails billingDetails, AddressDetails addressDetails, List<SharedDataSpec> sharedDataSpecs, List<DisplayableCustomPaymentMethod> displayableCustomPaymentMethods, List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs, CustomerMetadata customerMetadata, boolean z4, PaymentSheet.LinkConfiguration linkConfiguration, PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior, LinkMode linkMode, LinkState linkState, PaymentMethodIncentive paymentMethodIncentive, FinancialConnectionsAvailability financialConnectionsAvailability, CardBrandFilter cardBrandFilter, String elementsSessionId, PaymentSheet.ShopPayConfiguration shopPayConfiguration, Map<PaymentMethod.Type, ? extends PaymentSheet.TermsDisplay> termsDisplay) {
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        Intrinsics.checkNotNullParameter(availableWallets, "availableWallets");
        Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
        Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
        Intrinsics.checkNotNullParameter(displayableCustomPaymentMethods, "displayableCustomPaymentMethods");
        Intrinsics.checkNotNullParameter(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Intrinsics.checkNotNullParameter(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(elementsSessionId, "elementsSessionId");
        Intrinsics.checkNotNullParameter(termsDisplay, "termsDisplay");
        this.stripeIntent = stripeIntent;
        this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
        this.allowsDelayedPaymentMethods = z;
        this.allowsPaymentMethodsRequiringShippingAddress = z2;
        this.allowsLinkInSavedPaymentMethods = z3;
        this.availableWallets = availableWallets;
        this.paymentMethodOrder = paymentMethodOrder;
        this.cbcEligibility = cbcEligibility;
        this.merchantName = merchantName;
        this.defaultBillingDetails = billingDetails;
        this.shippingDetails = addressDetails;
        this.sharedDataSpecs = sharedDataSpecs;
        this.displayableCustomPaymentMethods = displayableCustomPaymentMethods;
        this.externalPaymentMethodSpecs = externalPaymentMethodSpecs;
        this.customerMetadata = customerMetadata;
        this.isGooglePayReady = z4;
        this.linkConfiguration = linkConfiguration;
        this.paymentMethodSaveConsentBehavior = paymentMethodSaveConsentBehavior;
        this.linkMode = linkMode;
        this.linkState = linkState;
        this.paymentMethodIncentive = paymentMethodIncentive;
        this.financialConnectionsAvailability = financialConnectionsAvailability;
        this.cardBrandFilter = cardBrandFilter;
        this.elementsSessionId = elementsSessionId;
        this.shopPayConfiguration = shopPayConfiguration;
        this.termsDisplay = termsDisplay;
    }

    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    public final PaymentSheet.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
        return this.billingDetailsCollectionConfiguration;
    }

    public final boolean getAllowsDelayedPaymentMethods() {
        return this.allowsDelayedPaymentMethods;
    }

    public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
        return this.allowsPaymentMethodsRequiringShippingAddress;
    }

    public final boolean getAllowsLinkInSavedPaymentMethods() {
        return this.allowsLinkInSavedPaymentMethods;
    }

    public final List<WalletType> getAvailableWallets() {
        return this.availableWallets;
    }

    public final List<String> getPaymentMethodOrder() {
        return this.paymentMethodOrder;
    }

    public final CardBrandChoiceEligibility getCbcEligibility() {
        return this.cbcEligibility;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final PaymentSheet.BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    public final AddressDetails getShippingDetails() {
        return this.shippingDetails;
    }

    public final List<SharedDataSpec> getSharedDataSpecs() {
        return this.sharedDataSpecs;
    }

    public final List<DisplayableCustomPaymentMethod> getDisplayableCustomPaymentMethods() {
        return this.displayableCustomPaymentMethods;
    }

    public final List<ExternalPaymentMethodSpec> getExternalPaymentMethodSpecs() {
        return this.externalPaymentMethodSpecs;
    }

    public final CustomerMetadata getCustomerMetadata() {
        return this.customerMetadata;
    }

    public final boolean isGooglePayReady() {
        return this.isGooglePayReady;
    }

    public final PaymentSheet.LinkConfiguration getLinkConfiguration() {
        return this.linkConfiguration;
    }

    public final PaymentMethodSaveConsentBehavior getPaymentMethodSaveConsentBehavior() {
        return this.paymentMethodSaveConsentBehavior;
    }

    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    public final LinkState getLinkState() {
        return this.linkState;
    }

    public final PaymentMethodIncentive getPaymentMethodIncentive() {
        return this.paymentMethodIncentive;
    }

    public final FinancialConnectionsAvailability getFinancialConnectionsAvailability() {
        return this.financialConnectionsAvailability;
    }

    public final CardBrandFilter getCardBrandFilter() {
        return this.cardBrandFilter;
    }

    public final String getElementsSessionId() {
        return this.elementsSessionId;
    }

    public final PaymentSheet.ShopPayConfiguration getShopPayConfiguration() {
        return this.shopPayConfiguration;
    }

    public final Map<PaymentMethod.Type, PaymentSheet.TermsDisplay> getTermsDisplay() {
        return this.termsDisplay;
    }

    public final boolean hasIntentToSetup(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        StripeIntent stripeIntent = this.stripeIntent;
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).isSetupFutureUsageSet(code);
        }
        if (stripeIntent instanceof SetupIntent) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean mandateAllowed(PaymentMethod.Type paymentMethodType) {
        Intrinsics.checkNotNullParameter(paymentMethodType, "paymentMethodType");
        return this.termsDisplay.get(paymentMethodType) != PaymentSheet.TermsDisplay.NEVER;
    }

    public final boolean requiresMandate(String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        PaymentMethodDefinition paymentMethodDefinition = PaymentMethodRegistry.INSTANCE.getDefinitionsByCode().get(paymentMethodCode);
        if (paymentMethodDefinition != null) {
            return paymentMethodDefinition.requiresMandate(this);
        }
        return false;
    }

    public final List<String> supportedPaymentMethodTypes() {
        List<PaymentMethodDefinition> listSupportedPaymentMethodDefinitions = supportedPaymentMethodDefinitions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSupportedPaymentMethodDefinitions, 10));
        Iterator<T> it = listSupportedPaymentMethodDefinitions.iterator();
        while (it.hasNext()) {
            arrayList.add(((PaymentMethodDefinition) it.next()).getType().code);
        }
        List<String> listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList, (Iterable) externalPaymentMethodTypes()), (Iterable) customPaymentMethodIds());
        if (this.paymentMethodOrder.isEmpty()) {
            return listPlus;
        }
        final Map<String, Integer> mapMapOrderToIndex = mapOrderToIndex(orderedPaymentMethodTypes());
        return CollectionsKt.sortedWith(listPlus, new Comparator() { // from class: com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata$supportedPaymentMethodTypes$lambda$2$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Integer) mapMapOrderToIndex.get((String) t), (Integer) mapMapOrderToIndex.get((String) t2));
            }
        });
    }

    public final List<PaymentMethod.Type> supportedSavedPaymentMethodTypes() {
        List<PaymentMethodDefinition> listSupportedPaymentMethodDefinitions = supportedPaymentMethodDefinitions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSupportedPaymentMethodDefinitions) {
            if (((PaymentMethodDefinition) obj).getSupportedAsSavedPaymentMethod()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((PaymentMethodDefinition) it.next()).getType());
        }
        ArrayList arrayList4 = arrayList3;
        return this.allowsLinkInSavedPaymentMethods ? CollectionsKt.plus((Collection) arrayList4, (Iterable) CollectionsKt.listOf(PaymentMethod.Type.Link)) : arrayList4;
    }

    public final SupportedPaymentMethod supportedPaymentMethodForCode(String code) {
        Object next;
        Intrinsics.checkNotNullParameter(code, "code");
        if (isExternalPaymentMethod(code)) {
            UiDefinitionFactory.Simple uiDefinitionFactoryForExternalPaymentMethod = getUiDefinitionFactoryForExternalPaymentMethod(code);
            if (uiDefinitionFactoryForExternalPaymentMethod != null) {
                return uiDefinitionFactoryForExternalPaymentMethod.createSupportedPaymentMethod();
            }
            return null;
        }
        if (isCustomPaymentMethod(code)) {
            UiDefinitionFactory.Simple uiDefinitionFactoryForCustomPaymentMethod = getUiDefinitionFactoryForCustomPaymentMethod(code);
            if (uiDefinitionFactoryForCustomPaymentMethod != null) {
                return uiDefinitionFactoryForCustomPaymentMethod.createSupportedPaymentMethod();
            }
            return null;
        }
        Iterator<T> it = supportedPaymentMethodDefinitions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentMethodDefinition) next).getType().code, code)) {
                break;
            }
        }
        PaymentMethodDefinition paymentMethodDefinition = (PaymentMethodDefinition) next;
        if (paymentMethodDefinition == null) {
            return null;
        }
        return paymentMethodDefinition.uiDefinitionFactory().supportedPaymentMethod(this, paymentMethodDefinition, this.sharedDataSpecs);
    }

    public final List<SupportedPaymentMethod> sortedSupportedPaymentMethods() {
        List<String> listSupportedPaymentMethodTypes = supportedPaymentMethodTypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listSupportedPaymentMethodTypes.iterator();
        while (it.hasNext()) {
            SupportedPaymentMethod supportedPaymentMethodSupportedPaymentMethodForCode = supportedPaymentMethodForCode((String) it.next());
            if (supportedPaymentMethodSupportedPaymentMethodForCode != null) {
                arrayList.add(supportedPaymentMethodSupportedPaymentMethodForCode);
            }
        }
        return arrayList;
    }

    private final List<String> orderedPaymentMethodTypes() {
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) this.stripeIntent.getPaymentMethodTypes(), (Iterable) externalPaymentMethodTypes()), (Iterable) customPaymentMethodIds()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.paymentMethodOrder) {
            if (mutableList.contains(str)) {
                arrayList.add(str);
                mutableList.remove(str);
            }
        }
        arrayList.addAll(mutableList);
        return arrayList;
    }

    private final Map<String, Integer> mapOrderToIndex(List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((String) obj, Integer.valueOf(i)));
            i = i2;
        }
        return MapsKt.toMap(arrayList);
    }

    private final List<String> externalPaymentMethodTypes() {
        List<ExternalPaymentMethodSpec> list = this.externalPaymentMethodSpecs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExternalPaymentMethodSpec) it.next()).getType());
        }
        return arrayList;
    }

    private final List<String> customPaymentMethodIds() {
        List<DisplayableCustomPaymentMethod> list = this.displayableCustomPaymentMethods;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DisplayableCustomPaymentMethod) it.next()).getId());
        }
        return arrayList;
    }

    public final boolean isExternalPaymentMethod(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return externalPaymentMethodTypes().contains(code);
    }

    public final boolean isCustomPaymentMethod(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return customPaymentMethodIds().contains(code);
    }

    private final UiDefinitionFactory.Simple getUiDefinitionFactoryForCustomPaymentMethod(String code) {
        Object next;
        Iterator<T> it = this.displayableCustomPaymentMethods.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((DisplayableCustomPaymentMethod) next).getId(), code)) {
                break;
            }
        }
        DisplayableCustomPaymentMethod displayableCustomPaymentMethod = (DisplayableCustomPaymentMethod) next;
        if (displayableCustomPaymentMethod == null) {
            return null;
        }
        return new CustomPaymentMethodUiDefinitionFactory(displayableCustomPaymentMethod);
    }

    private final UiDefinitionFactory.Simple getUiDefinitionFactoryForExternalPaymentMethod(String code) {
        Object next;
        Iterator<T> it = this.externalPaymentMethodSpecs.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ExternalPaymentMethodSpec) next).getType(), code)) {
                break;
            }
        }
        ExternalPaymentMethodSpec externalPaymentMethodSpec = (ExternalPaymentMethodSpec) next;
        if (externalPaymentMethodSpec == null) {
            return null;
        }
        return new ExternalPaymentMethodUiDefinitionFactory(externalPaymentMethodSpec);
    }

    private final List<PaymentMethodDefinition> supportedPaymentMethodDefinitions() {
        List<String> paymentMethodTypes = this.stripeIntent.getPaymentMethodTypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = paymentMethodTypes.iterator();
        while (it.hasNext()) {
            PaymentMethodDefinition paymentMethodDefinition = PaymentMethodRegistry.INSTANCE.getDefinitionsByCode().get((String) it.next());
            if (paymentMethodDefinition != null) {
                arrayList.add(paymentMethodDefinition);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (PaymentMethodDefinitionKt.isSupported((PaymentMethodDefinition) obj, this)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        List listListOf = CollectionsKt.listOf(LinkCardBrandDefinition.INSTANCE);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listListOf) {
            if (PaymentMethodDefinitionKt.isSupported((LinkCardBrandDefinition) obj2, this)) {
                arrayList4.add(obj2);
            }
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList3, (Iterable) arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : listPlus) {
            PaymentMethodDefinition paymentMethodDefinition2 = (PaymentMethodDefinition) obj3;
            if (!this.stripeIntent.isLiveMode() || !this.stripeIntent.getUnactivatedPaymentMethods().contains(paymentMethodDefinition2.getType().code)) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            PaymentMethodDefinition paymentMethodDefinition3 = (PaymentMethodDefinition) obj4;
            if (paymentMethodDefinition3.uiDefinitionFactory().canBeDisplayedInUi(paymentMethodDefinition3, this.sharedDataSpecs)) {
                arrayList6.add(obj4);
            }
        }
        return arrayList6;
    }

    public final Amount amount() {
        if (!(this.stripeIntent instanceof PaymentIntent)) {
            return null;
        }
        Long amount = ((PaymentIntent) this.stripeIntent).getAmount();
        if (amount == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        long jLongValue = amount.longValue();
        String currency = ((PaymentIntent) this.stripeIntent).getCurrency();
        if (currency != null) {
            return new Amount(jLongValue, currency);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final FormHeaderInformation formHeaderInformationForCode(String code, boolean customerHasSavedPaymentMethods) {
        Object next;
        Intrinsics.checkNotNullParameter(code, "code");
        if (isExternalPaymentMethod(code)) {
            UiDefinitionFactory.Simple uiDefinitionFactoryForExternalPaymentMethod = getUiDefinitionFactoryForExternalPaymentMethod(code);
            if (uiDefinitionFactoryForExternalPaymentMethod != null) {
                return uiDefinitionFactoryForExternalPaymentMethod.createFormHeaderInformation(customerHasSavedPaymentMethods, null);
            }
            return null;
        }
        if (isCustomPaymentMethod(code)) {
            UiDefinitionFactory.Simple uiDefinitionFactoryForCustomPaymentMethod = getUiDefinitionFactoryForCustomPaymentMethod(code);
            if (uiDefinitionFactoryForCustomPaymentMethod != null) {
                return uiDefinitionFactoryForCustomPaymentMethod.createFormHeaderInformation(customerHasSavedPaymentMethods, null);
            }
            return null;
        }
        Iterator<T> it = supportedPaymentMethodDefinitions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentMethodDefinition) next).getType().code, code)) {
                break;
            }
        }
        PaymentMethodDefinition paymentMethodDefinition = (PaymentMethodDefinition) next;
        if (paymentMethodDefinition == null) {
            return null;
        }
        return paymentMethodDefinition.uiDefinitionFactory().formHeaderInformation(paymentMethodDefinition, this, this.sharedDataSpecs, customerHasSavedPaymentMethods);
    }

    public final List<FormElement> formElementsForCode(String code, UiDefinitionFactory.Arguments.Factory uiDefinitionFactoryArgumentsFactory) {
        Object next;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uiDefinitionFactoryArgumentsFactory, "uiDefinitionFactoryArgumentsFactory");
        if (isExternalPaymentMethod(code)) {
            UiDefinitionFactory.Simple uiDefinitionFactoryForExternalPaymentMethod = getUiDefinitionFactoryForExternalPaymentMethod(code);
            if (uiDefinitionFactoryForExternalPaymentMethod != null) {
                return uiDefinitionFactoryForExternalPaymentMethod.createFormElements(this, uiDefinitionFactoryArgumentsFactory.create(this, false));
            }
            return null;
        }
        if (isCustomPaymentMethod(code)) {
            UiDefinitionFactory.Simple uiDefinitionFactoryForCustomPaymentMethod = getUiDefinitionFactoryForCustomPaymentMethod(code);
            if (uiDefinitionFactoryForCustomPaymentMethod != null) {
                return uiDefinitionFactoryForCustomPaymentMethod.createFormElements(this, uiDefinitionFactoryArgumentsFactory.create(this, false));
            }
            return null;
        }
        Iterator<T> it = supportedPaymentMethodDefinitions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((PaymentMethodDefinition) next).getType().code, code)) {
                break;
            }
        }
        PaymentMethodDefinition paymentMethodDefinition = (PaymentMethodDefinition) next;
        if (paymentMethodDefinition == null) {
            return null;
        }
        return paymentMethodDefinition.uiDefinitionFactory().formElements(paymentMethodDefinition, this, this.sharedDataSpecs, uiDefinitionFactoryArgumentsFactory.create(this, paymentMethodDefinition.requiresMandate(this)));
    }

    public final PaymentMethod.AllowRedisplay allowRedisplay(PaymentSelection.CustomerRequestedSave customerRequestedSave, String code) {
        Intrinsics.checkNotNullParameter(customerRequestedSave, "customerRequestedSave");
        Intrinsics.checkNotNullParameter(code, "code");
        return this.paymentMethodSaveConsentBehavior.allowRedisplay(hasIntentToSetup(code), customerRequestedSave);
    }

    /* compiled from: PaymentMethodMetadata.kt */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015JC\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u001d\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata$Companion;", "", "<init>", "()V", "createForPaymentElement", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", "configuration", "Lcom/stripe/android/common/model/CommonConfiguration;", "sharedDataSpecs", "", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "externalPaymentMethodSpecs", "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;", "isGooglePayReady", "", "linkState", "Lcom/stripe/android/paymentsheet/state/LinkState;", "customerMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata;", "createForPaymentElement$paymentsheet_release", "createForCustomerSheet", "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;", "paymentMethodSaveConsentBehavior", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodSaveConsentBehavior;", "createForCustomerSheet$paymentsheet_release", "createForNativeLink", "Lcom/stripe/android/link/LinkConfiguration;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "createForNativeLink$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentMethodMetadata createForPaymentElement$paymentsheet_release(ElementsSession elementsSession, CommonConfiguration configuration, List<SharedDataSpec> sharedDataSpecs, List<ExternalPaymentMethodSpec> externalPaymentMethodSpecs, boolean isGooglePayReady, LinkState linkState, CustomerMetadata customerMetadata) {
            LinkConsumerIncentive linkConsumerIncentive;
            Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            Intrinsics.checkNotNullParameter(externalPaymentMethodSpecs, "externalPaymentMethodSpecs");
            Intrinsics.checkNotNullParameter(customerMetadata, "customerMetadata");
            ElementsSession.LinkSettings linkSettings = elementsSession.getLinkSettings();
            StripeIntent stripeIntent = elementsSession.getStripeIntent();
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = configuration.getBillingDetailsCollectionConfiguration();
            boolean allowsDelayedPaymentMethods = configuration.getAllowsDelayedPaymentMethods();
            boolean allowsPaymentMethodsRequiringShippingAddress = configuration.getAllowsPaymentMethodsRequiringShippingAddress();
            boolean enableLinkInSpm = elementsSession.getEnableLinkInSpm();
            List<WalletType> listListFrom = WalletType.INSTANCE.listFrom(elementsSession, isGooglePayReady, linkState, configuration.getShopPayConfiguration() != null);
            List<String> paymentMethodOrder = configuration.getPaymentMethodOrder();
            CardBrandChoiceEligibility.Companion companion = CardBrandChoiceEligibility.INSTANCE;
            ElementsSession.CardBrandChoice cardBrandChoice = elementsSession.getCardBrandChoice();
            return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfiguration, allowsDelayedPaymentMethods, allowsPaymentMethodsRequiringShippingAddress, enableLinkInSpm, listListFrom, paymentMethodOrder, companion.create(cardBrandChoice != null ? cardBrandChoice.getEligible() : false, configuration.getPreferredNetworks()), configuration.getMerchantDisplayName(), configuration.getDefaultBillingDetails(), configuration.getShippingDetails(), sharedDataSpecs, PaymentMethodMetadataKtxKt.toDisplayableCustomPaymentMethods(elementsSession, configuration), externalPaymentMethodSpecs, customerMetadata, isGooglePayReady, configuration.getLink(), PaymentMethodMetadataKtxKt.toPaymentSheetSaveConsentBehavior(elementsSession), linkSettings != null ? linkSettings.getLinkMode() : null, linkState, (linkSettings == null || (linkConsumerIncentive = linkSettings.getLinkConsumerIncentive()) == null) ? null : PaymentMethodIncentiveKt.toPaymentMethodIncentive(linkConsumerIncentive), GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, elementsSession, null, 2, null), new PaymentSheetCardBrandFilter(configuration.getCardBrandAcceptance()), elementsSession.getElementsSessionId(), configuration.getShopPayConfiguration(), configuration.getTermsDisplay());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final PaymentMethodMetadata createForCustomerSheet$paymentsheet_release(ElementsSession elementsSession, CustomerSheet.Configuration configuration, PaymentMethodSaveConsentBehavior paymentMethodSaveConsentBehavior, List<SharedDataSpec> sharedDataSpecs, boolean isGooglePayReady, CustomerMetadata customerMetadata) {
            Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            Intrinsics.checkNotNullParameter(customerMetadata, "customerMetadata");
            StripeIntent stripeIntent = elementsSession.getStripeIntent();
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = configuration.getBillingDetailsCollectionConfiguration();
            PaymentSheet.LinkConfiguration.Display display = null;
            Object[] objArr = 0;
            List<WalletType> listListFrom = WalletType.INSTANCE.listFrom(elementsSession, isGooglePayReady, null, false);
            List<String> paymentMethodOrder$paymentsheet_release = configuration.getPaymentMethodOrder$paymentsheet_release();
            CardBrandChoiceEligibility.Companion companion = CardBrandChoiceEligibility.INSTANCE;
            ElementsSession.CardBrandChoice cardBrandChoice = elementsSession.getCardBrandChoice();
            CardBrandChoiceEligibility cardBrandChoiceEligibilityCreate = companion.create(cardBrandChoice != null ? cardBrandChoice.getEligible() : false, configuration.getPreferredNetworks());
            String merchantDisplayName = configuration.getMerchantDisplayName();
            PaymentSheet.BillingDetails defaultBillingDetails = configuration.getDefaultBillingDetails();
            PaymentSheet.LinkConfiguration linkConfiguration = new PaymentSheet.LinkConfiguration(display, 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
            ElementsSession.LinkSettings linkSettings = elementsSession.getLinkSettings();
            LinkMode linkMode = linkSettings != null ? linkSettings.getLinkMode() : null;
            return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfiguration, true, false, false, listListFrom, paymentMethodOrder$paymentsheet_release, cardBrandChoiceEligibilityCreate, merchantDisplayName, defaultBillingDetails, null, sharedDataSpecs, CollectionsKt.emptyList(), CollectionsKt.emptyList(), customerMetadata, isGooglePayReady, linkConfiguration, paymentMethodSaveConsentBehavior, linkMode, null, null, GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, elementsSession, null, 2, null), new PaymentSheetCardBrandFilter(configuration.getCardBrandAcceptance()), elementsSession.getElementsSessionId(), null, MapsKt.emptyMap());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final PaymentMethodMetadata createForNativeLink$paymentsheet_release(LinkConfiguration configuration, LinkAccount linkAccount) {
            ArrayList arrayListEmptyList;
            List<String> preferredNetworks;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
            StripeIntent stripeIntent = configuration.getStripeIntent();
            PaymentSheet.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = configuration.getBillingDetailsCollectionConfiguration();
            List listEmptyList = CollectionsKt.emptyList();
            List<String> paymentMethodOrder = ConfigurationDefaults.INSTANCE.getPaymentMethodOrder();
            CardBrandChoiceEligibility.Companion companion = CardBrandChoiceEligibility.INSTANCE;
            LinkConfiguration.CardBrandChoice cardBrandChoice = configuration.getCardBrandChoice();
            int i = 1;
            boolean z = cardBrandChoice != null && cardBrandChoice.getEligible();
            LinkConfiguration.CardBrandChoice cardBrandChoice2 = configuration.getCardBrandChoice();
            PaymentSheet.LinkConfiguration.Display display = null;
            Object[] objArr = 0;
            if (cardBrandChoice2 == null || (preferredNetworks = cardBrandChoice2.getPreferredNetworks()) == null) {
                arrayListEmptyList = null;
            } else {
                List<String> list = preferredNetworks;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(CardBrand.INSTANCE.fromCode((String) it.next()));
                }
                arrayListEmptyList = arrayList;
            }
            if (arrayListEmptyList == null) {
                arrayListEmptyList = CollectionsKt.emptyList();
            }
            return new PaymentMethodMetadata(stripeIntent, billingDetailsCollectionConfiguration, false, false, false, listEmptyList, paymentMethodOrder, companion.create(z, arrayListEmptyList), configuration.getMerchantName(), LinkBillingDetailsUtilsKt.effectiveBillingDetails(configuration, linkAccount), null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), new CustomerMetadata(true, false, CustomerMetadata.Permissions.INSTANCE.createForNativeLink$paymentsheet_release()), false, new PaymentSheet.LinkConfiguration(display, i, (DefaultConstructorMarker) (objArr == true ? 1 : 0)), new PaymentMethodSaveConsentBehavior.Disabled(null), null, null, null, GetFinancialConnectionsAvailability.invoke$default(GetFinancialConnectionsAvailability.INSTANCE, null, null, 2, null), configuration.getCardBrandFilter(), configuration.getElementsSessionId(), null, MapsKt.emptyMap());
        }
    }
}
