.class public final Lcom/stripe/android/link/LinkConfiguration;
.super Ljava/lang/Object;
.source "LinkConfiguration.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;,
        Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008P\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0004\u0083\u0001\u0084\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u000c\u0012\u0006\u0010\u001a\u001a\u00020\u000c\u0012\u0006\u0010\u001b\u001a\u00020\u000c\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0006\u0010!\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010#\u001a\u00020\u000c\u0012\u0006\u0010$\u001a\u00020\u000c\u0012\u0006\u0010%\u001a\u00020\u000c\u0012\u0006\u0010&\u001a\u00020\u000c\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020\u000c\u0012\u0006\u0010*\u001a\u00020\u000c\u0012\u0008\u0010+\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008,\u0010-J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010`\u001a\u00020\u000cH\u00c6\u0003J\u0015\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000eH\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010c\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010e\u001a\u00020\u0016H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\t\u0010g\u001a\u00020\u000cH\u00c6\u0003J\t\u0010h\u001a\u00020\u000cH\u00c6\u0003J\t\u0010i\u001a\u00020\u000cH\u00c6\u0003J\t\u0010j\u001a\u00020\u001dH\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010 H\u00c6\u0003J\t\u0010m\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010o\u001a\u00020\u000cH\u00c6\u0003J\t\u0010p\u001a\u00020\u000cH\u00c6\u0003J\t\u0010q\u001a\u00020\u000cH\u00c6\u0003J\t\u0010r\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010(H\u00c6\u0003J\t\u0010t\u001a\u00020\u000cH\u00c6\u0003J\t\u0010u\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J\u00bf\u0002\u0010w\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00052\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0008\u0008\u0002\u0010!\u001a\u00020\u000c2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010#\u001a\u00020\u000c2\u0008\u0008\u0002\u0010$\u001a\u00020\u000c2\u0008\u0008\u0002\u0010%\u001a\u00020\u000c2\u0008\u0008\u0002\u0010&\u001a\u00020\u000c2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010(2\u0008\u0008\u0002\u0010)\u001a\u00020\u000c2\u0008\u0008\u0002\u0010*\u001a\u00020\u000c2\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0006\u0010x\u001a\u00020yJ\u0013\u0010z\u001a\u00020\u000c2\u0008\u0010{\u001a\u0004\u0018\u00010|H\u00d6\u0003J\t\u0010}\u001a\u00020yH\u00d6\u0001J\t\u0010~\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u007f\u001a\u00030\u0080\u00012\u0008\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0006\u0010\r\u001a\u00020yR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00101R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010>R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010DR\u0011\u0010\u0019\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u00108R\u0011\u0010\u001a\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u00108R\u0011\u0010\u001b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u00108R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010IR\u0011\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u00101R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010LR\u0011\u0010!\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u00108R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u00101R\u0011\u0010#\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u00108R\u0011\u0010$\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008P\u00108R\u0011\u0010%\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u00108R\u0011\u0010&\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u00108R\u0013\u0010\'\u001a\u0004\u0018\u00010(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010TR\u0011\u0010)\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u00108R\u0011\u0010*\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u00108R\u0010\u0010+\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010W\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008X\u00101R\u0011\u0010Y\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008Z\u00108\u00a8\u0006\u0085\u0001"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkConfiguration;",
        "Landroid/os/Parcelable;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "merchantName",
        "",
        "merchantCountryCode",
        "customerInfo",
        "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;",
        "shippingDetails",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "passthroughModeEnabled",
        "",
        "flags",
        "",
        "cardBrandChoice",
        "Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "billingDetailsCollectionConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "defaultBillingDetails",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "useAttestationEndpointsForLink",
        "suppress2faModal",
        "disableRuxInFlowController",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "elementsSessionId",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "allowDefaultOptIn",
        "googlePlacesApiKey",
        "collectMissingBillingDetailsForExistingPaymentMethods",
        "allowUserEmailEdits",
        "enableDisplayableDefaultValuesInEce",
        "skipWalletInFlowController",
        "linkAppearance",
        "Lcom/stripe/android/link/model/LinkAppearance;",
        "linkSignUpOptInFeatureEnabled",
        "linkSignUpOptInInitialValue",
        "customerId",
        "<init>",
        "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)V",
        "getStripeIntent",
        "()Lcom/stripe/android/model/StripeIntent;",
        "getMerchantName",
        "()Ljava/lang/String;",
        "getMerchantCountryCode",
        "getCustomerInfo",
        "()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;",
        "getShippingDetails",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "getPassthroughModeEnabled",
        "()Z",
        "getFlags",
        "()Ljava/util/Map;",
        "getCardBrandChoice",
        "()Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;",
        "getCardBrandFilter",
        "()Lcom/stripe/android/CardBrandFilter;",
        "getFinancialConnectionsAvailability",
        "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "getBillingDetailsCollectionConfiguration",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
        "getDefaultBillingDetails",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
        "getUseAttestationEndpointsForLink",
        "getSuppress2faModal",
        "getDisableRuxInFlowController",
        "getInitializationMode",
        "()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "getElementsSessionId",
        "getLinkMode",
        "()Lcom/stripe/android/model/LinkMode;",
        "getAllowDefaultOptIn",
        "getGooglePlacesApiKey",
        "getCollectMissingBillingDetailsForExistingPaymentMethods",
        "getAllowUserEmailEdits",
        "getEnableDisplayableDefaultValuesInEce",
        "getSkipWalletInFlowController",
        "getLinkAppearance",
        "()Lcom/stripe/android/link/model/LinkAppearance;",
        "getLinkSignUpOptInFeatureEnabled",
        "getLinkSignUpOptInInitialValue",
        "customerIdForEceDefaultValues",
        "getCustomerIdForEceDefaultValues",
        "enableLinkPaymentSelectionHint",
        "getEnableLinkPaymentSelectionHint",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "copy",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "CustomerInfo",
        "CardBrandChoice",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/link/LinkConfiguration;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final allowDefaultOptIn:Z

.field private final allowUserEmailEdits:Z

.field private final billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

.field private final cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

.field private final cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

.field private final collectMissingBillingDetailsForExistingPaymentMethods:Z

.field private final customerId:Ljava/lang/String;

.field private final customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

.field private final defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

.field private final disableRuxInFlowController:Z

.field private final elementsSessionId:Ljava/lang/String;

.field private final enableDisplayableDefaultValuesInEce:Z

.field private final financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

.field private final flags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final googlePlacesApiKey:Ljava/lang/String;

.field private final initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

.field private final linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

.field private final linkMode:Lcom/stripe/android/model/LinkMode;

.field private final linkSignUpOptInFeatureEnabled:Z

.field private final linkSignUpOptInInitialValue:Z

.field private final merchantCountryCode:Ljava/lang/String;

.field private final merchantName:Ljava/lang/String;

.field private final passthroughModeEnabled:Z

.field private final shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

.field private final skipWalletInFlowController:Z

.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;

.field private final suppress2faModal:Z

.field private final useAttestationEndpointsForLink:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/LinkConfiguration$Creator;

    invoke-direct {v0}, Lcom/stripe/android/link/LinkConfiguration$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/link/LinkConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/LinkConfiguration;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
            "ZZZ",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/LinkMode;",
            "Z",
            "Ljava/lang/String;",
            "ZZZZ",
            "Lcom/stripe/android/link/model/LinkAppearance;",
            "ZZ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p11

    move-object/from16 v1, p16

    move-object/from16 v2, p17

    const-string v3, "stripeIntent"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "merchantName"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "customerInfo"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "flags"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardBrandFilter"

    invoke-static {p9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "billingDetailsCollectionConfiguration"

    invoke-static {p11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "initializationMode"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "elementsSessionId"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    .line 17
    iput-object p2, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    .line 18
    iput-object p3, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    .line 19
    iput-object p4, p0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    .line 20
    iput-object p5, p0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    .line 21
    iput-boolean p6, p0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    .line 22
    iput-object p7, p0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    .line 23
    iput-object p8, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    .line 24
    iput-object p9, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    .line 25
    iput-object p10, p0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    .line 26
    iput-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    move-object/from16 p1, p12

    .line 27
    iput-object p1, p0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move/from16 p1, p13

    .line 28
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    move/from16 p1, p14

    .line 29
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    move/from16 p1, p15

    .line 30
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    .line 31
    iput-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    .line 32
    iput-object v2, p0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 33
    iput-object p1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    move/from16 p1, p19

    .line 34
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    move-object/from16 p1, p20

    .line 35
    iput-object p1, p0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    move/from16 p1, p21

    .line 36
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    move/from16 p1, p22

    .line 37
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    move/from16 p1, p23

    .line 38
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    move/from16 p1, p24

    .line 39
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    move-object/from16 p1, p25

    .line 40
    iput-object p1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    move/from16 p1, p26

    .line 41
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    move/from16 p1, p27

    .line 42
    iput-boolean p1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    move-object/from16 p1, p28

    .line 43
    iput-object p1, p0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 30

    const/high16 v0, 0x80000

    and-int v0, p29, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object/from16 v21, v0

    goto :goto_0

    :cond_0
    move-object/from16 v21, p20

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move/from16 v20, p19

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move-object/from16 v26, p25

    move/from16 v27, p26

    move/from16 v28, p27

    move-object/from16 v29, p28

    .line 15
    invoke-direct/range {v1 .. v29}, Lcom/stripe/android/link/LinkConfiguration;-><init>(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)V

    return-void
.end method

.method private final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/LinkConfiguration;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p29

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p29, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p29, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p29, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-boolean v1, v0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p29, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p29, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-boolean v1, v0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    goto :goto_14

    :cond_14
    move/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p29, v16

    move/from16 p7, v1

    if-eqz v16, :cond_15

    iget-boolean v1, v0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    goto :goto_15

    :cond_15
    move/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p29, v16

    move/from16 p8, v1

    if-eqz v16, :cond_16

    iget-boolean v1, v0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    goto :goto_16

    :cond_16
    move/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p29, v16

    move/from16 p9, v1

    if-eqz v16, :cond_17

    iget-boolean v1, v0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    goto :goto_17

    :cond_17
    move/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p29, v16

    move/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p29, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-boolean v1, v0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    goto :goto_19

    :cond_19
    move/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p29, v16

    move/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-boolean v1, v0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    goto :goto_1a

    :cond_1a
    move/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p29, v16

    if-eqz v16, :cond_1b

    move/from16 p13, v1

    iget-object v1, v0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    move/from16 p28, p13

    move-object/from16 p29, v1

    goto :goto_1b

    :cond_1b
    move-object/from16 p29, p28

    move/from16 p28, v1

    :goto_1b
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p20, p5

    move-object/from16 p21, p6

    move/from16 p22, p7

    move/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move-object/from16 p26, p11

    move/from16 p27, p12

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p29}, Lcom/stripe/android/link/LinkConfiguration;->copy(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)Lcom/stripe/android/link/LinkConfiguration;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object v0
.end method

.method public final component11()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object v0
.end method

.method public final component12()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    return v0
.end method

.method public final component16()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Lcom/stripe/android/model/LinkMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    return v0
.end method

.method public final component22()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    return v0
.end method

.method public final component23()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    return v0
.end method

.method public final component24()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    return v0
.end method

.method public final component25()Lcom/stripe/android/link/model/LinkAppearance;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    return-object v0
.end method

.method public final component26()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    return v0
.end method

.method public final component27()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    return v0
.end method

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/CardBrandFilter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)Lcom/stripe/android/link/LinkConfiguration;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;",
            "Lcom/stripe/android/CardBrandFilter;",
            "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
            "ZZZ",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/LinkMode;",
            "Z",
            "Ljava/lang/String;",
            "ZZZZ",
            "Lcom/stripe/android/link/model/LinkAppearance;",
            "ZZ",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/link/LinkConfiguration;"
        }
    .end annotation

    const-string v0, "stripeIntent"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantName"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerInfo"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flags"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "billingDetailsCollectionConfiguration"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializationMode"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "elementsSessionId"

    move-object/from16 v4, p17

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/LinkConfiguration;

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move-object/from16 v26, p25

    move/from16 v27, p26

    move/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v18, v4

    move-object/from16 v4, p3

    invoke-direct/range {v1 .. v29}, Lcom/stripe/android/link/LinkConfiguration;-><init>(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZLjava/util/Map;Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;ZZZLcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ZLjava/lang/String;ZZZZLcom/stripe/android/link/model/LinkAppearance;ZZLjava/lang/String;)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/LinkConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/LinkConfiguration;

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    iget-object v3, p1, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    return v2

    :cond_1d
    return v0
.end method

.method public final getAllowDefaultOptIn()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    return v0
.end method

.method public final getAllowUserEmailEdits()Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    return v0
.end method

.method public final getBillingDetailsCollectionConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    return-object v0
.end method

.method public final getCardBrandChoice()Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    return-object v0
.end method

.method public final getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    return-object v0
.end method

.method public final getCollectMissingBillingDetailsForExistingPaymentMethods()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    return v0
.end method

.method public final getCustomerIdForEceDefaultValues()Ljava/lang/String;
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    return-object v0
.end method

.method public final getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    return-object v0
.end method

.method public final getDisableRuxInFlowController()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    return v0
.end method

.method public final getElementsSessionId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnableDisplayableDefaultValuesInEce()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    return v0
.end method

.method public final getEnableLinkPaymentSelectionHint()Z
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    const-string v1, "link_mobile_enable_payment_selection_hint"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object v0
.end method

.method public final getFlags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    return-object v0
.end method

.method public final getGooglePlacesApiKey()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitializationMode()Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    return-object v0
.end method

.method public final getLinkAppearance()Lcom/stripe/android/link/model/LinkAppearance;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    return-object v0
.end method

.method public final getLinkMode()Lcom/stripe/android/model/LinkMode;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final getLinkSignUpOptInFeatureEnabled()Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    return v0
.end method

.method public final getLinkSignUpOptInInitialValue()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    return v0
.end method

.method public final getMerchantCountryCode()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getMerchantName()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPassthroughModeEnabled()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    return v0
.end method

.method public final getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    return-object v0
.end method

.method public final getSkipWalletInFlowController()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    return v0
.end method

.method public final getStripeIntent()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final getSuppress2faModal()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    return v0
.end method

.method public final getUseAttestationEndpointsForLink()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/stripe/android/model/LinkMode;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/link/model/LinkAppearance;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    iget-object v2, v0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    iget-object v3, v0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    iget-object v5, v0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-boolean v6, v0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    iget-object v7, v0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    iget-object v8, v0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    iget-object v9, v0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    iget-object v10, v0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    iget-object v11, v0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    iget-object v12, v0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-boolean v13, v0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    iget-boolean v14, v0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    move/from16 v16, v15

    iget-object v15, v0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    move-object/from16 v19, v15

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    move/from16 v20, v15

    iget-object v15, v0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    move/from16 v22, v15

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    move/from16 v23, v15

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    move/from16 v24, v15

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    move/from16 v25, v15

    iget-object v15, v0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    move-object/from16 v26, v15

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    move/from16 v27, v15

    iget-boolean v15, v0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    move/from16 v28, v15

    iget-object v15, v0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v29, v15

    const-string v15, "LinkConfiguration(stripeIntent="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", merchantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", merchantCountryCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customerInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shippingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", passthroughModeEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardBrandChoice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardBrandFilter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", financialConnectionsAvailability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", billingDetailsCollectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultBillingDetails="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", useAttestationEndpointsForLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", suppress2faModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", disableRuxInFlowController="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", initializationMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", elementsSessionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowDefaultOptIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", googlePlacesApiKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", collectMissingBillingDetailsForExistingPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", allowUserEmailEdits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enableDisplayableDefaultValuesInEce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", skipWalletInFlowController="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkAppearance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkSignUpOptInFeatureEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkSignUpOptInInitialValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->merchantCountryCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->customerInfo:Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->shippingDetails:Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->passthroughModeEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->flags:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandChoice:Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/LinkConfiguration$CardBrandChoice;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->cardBrandFilter:Lcom/stripe/android/CardBrandFilter;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->billingDetailsCollectionConfiguration:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->defaultBillingDetails:Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->useAttestationEndpointsForLink:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->suppress2faModal:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->disableRuxInFlowController:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->initializationMode:Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->elementsSessionId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Lcom/stripe/android/model/LinkMode;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_5
    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->allowDefaultOptIn:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->googlePlacesApiKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->collectMissingBillingDetailsForExistingPaymentMethods:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->allowUserEmailEdits:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->enableDisplayableDefaultValuesInEce:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/link/LinkConfiguration;->skipWalletInFlowController:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/link/LinkConfiguration;->linkAppearance:Lcom/stripe/android/link/model/LinkAppearance;

    if-nez v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/link/model/LinkAppearance;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-boolean p2, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInFeatureEnabled:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/stripe/android/link/LinkConfiguration;->linkSignUpOptInInitialValue:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/link/LinkConfiguration;->customerId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
