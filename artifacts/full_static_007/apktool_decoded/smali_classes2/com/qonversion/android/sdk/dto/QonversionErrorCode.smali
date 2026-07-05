.class public final enum Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
.super Ljava/lang/Enum;
.source "QonversionError.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001d\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
        "",
        "specification",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getSpecification",
        "()Ljava/lang/String;",
        "Unknown",
        "PlayStoreError",
        "BillingUnavailable",
        "PurchasePending",
        "PurchaseUnspecified",
        "PurchaseInvalid",
        "PurchaseCanceled",
        "ProductNotOwned",
        "ProductAlreadyOwned",
        "FeatureNotSupported",
        "StoreProductNotAvailable",
        "NetworkConnectionFailed",
        "ResponseParsingFailed",
        "BackendError",
        "ProductNotFound",
        "OfferingsNotFound",
        "LaunchError",
        "InvalidCredentials",
        "InvalidClientUid",
        "UnknownClientPlatform",
        "FraudPurchase",
        "ProjectConfigError",
        "InvalidStoreCredentials",
        "RemoteConfigurationNotAvailable",
        "ApiRateLimitExceeded",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum BillingUnavailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProductAlreadyOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProductNotOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchaseCanceled:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum ResponseParsingFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum StoreProductNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

.field public static final enum UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;


# instance fields
.field private final specification:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 25

    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v2, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BillingUnavailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v3, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v4, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v5, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v6, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseCanceled:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v7, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v8, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductAlreadyOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v9, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v10, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->StoreProductNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v11, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v12, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ResponseParsingFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v13, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v14, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v15, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v16, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v17, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v18, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v19, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v20, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v21, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v22, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v23, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    sget-object v24, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    filled-new-array/range {v0 .. v24}, [Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 22
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x0

    const-string v2, "Unknown error"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 23
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x1

    const-string v2, "There was an issue with the Play Store service"

    const-string v3, "PlayStoreError"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PlayStoreError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 24
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x2

    const-string v2, "The Billing service is unavailable on the device"

    const-string v3, "BillingUnavailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BillingUnavailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x3

    const-string v2, "Purchase is pending"

    const-string v3, "PurchasePending"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchasePending:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 26
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x4

    const-string v2, "Unspecified state of the purchase"

    const-string v3, "PurchaseUnspecified"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseUnspecified:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 27
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x5

    const-string v2, "Failure of purchase"

    const-string v3, "PurchaseInvalid"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseInvalid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 28
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x6

    const-string v2, "User pressed back or canceled a dialog for purchase"

    const-string v3, "PurchaseCanceled"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->PurchaseCanceled:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 29
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v1, 0x7

    const-string v2, "Failed to consume purchase since item is not owned"

    const-string v3, "ProductNotOwned"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 30
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x8

    const-string v2, "Failed to purchase since item is already owned"

    const-string v3, "ProductAlreadyOwned"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductAlreadyOwned:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 31
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x9

    const-string v2, "The requested feature is not supported"

    const-string v3, "FeatureNotSupported"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FeatureNotSupported:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 32
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0xa

    const-string v2, "Requested product is not available for purchase or its product id was not found"

    const-string v3, "StoreProductNotAvailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->StoreProductNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 33
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0xb

    const-string v2, "There was a network issue. Please make sure that the Internet connection is available on the device"

    const-string v3, "NetworkConnectionFailed"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->NetworkConnectionFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 35
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0xc

    const-string v2, "A problem occurred while serializing or deserializing data"

    const-string v3, "ResponseParsingFailed"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ResponseParsingFailed:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0xd

    const-string v2, "There was a backend error"

    const-string v3, "BackendError"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->BackendError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 37
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0xe

    const-string v2, "Failed to purchase since the Qonversion product was not found"

    const-string v3, "ProductNotFound"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProductNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 38
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0xf

    const-string v2, "No offerings found"

    const-string v3, "OfferingsNotFound"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->OfferingsNotFound:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 39
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x10

    const-string v2, "There was an error while launching Qonversion SDK"

    const-string v3, "LaunchError"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->LaunchError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 40
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x11

    const-string v2, "Access token is invalid or not set"

    const-string v3, "InvalidCredentials"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 41
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x12

    const-string v2, "Client Uid is invalid or not set"

    const-string v3, "InvalidClientUid"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidClientUid:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 42
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x13

    const-string v2, "The current platform is not supported"

    const-string v3, "UnknownClientPlatform"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->UnknownClientPlatform:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 43
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x14

    const-string v2, "Fraud purchase was detected"

    const-string v3, "FraudPurchase"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->FraudPurchase:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 44
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x15

    const-string v2, "The project is not configured or configured incorrectly in the Qonversion Dashboard"

    const-string v3, "ProjectConfigError"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ProjectConfigError:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 45
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x16

    const-string v2, "This account does not have access to the requested application"

    const-string v3, "InvalidStoreCredentials"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->InvalidStoreCredentials:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 46
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x17

    const-string v2, "Remote configuration is not available for the current user or for the provided context key"

    const-string v3, "RemoteConfigurationNotAvailable"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->RemoteConfigurationNotAvailable:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    .line 47
    new-instance v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/16 v1, 0x18

    const-string v2, "API requests rate limit exceeded"

    const-string v3, "ApiRateLimitExceeded"

    invoke-direct {v0, v3, v1, v2}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->ApiRateLimitExceeded:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    invoke-static {}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$values()[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$VALUES:[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->specification:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/qonversion/android/sdk/dto/QonversionErrorCode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 1

    const-class v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    return-object p0
.end method

.method public static values()[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;
    .locals 1

    sget-object v0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->$VALUES:[Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    return-object v0
.end method


# virtual methods
.method public final getSpecification()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->specification:Ljava/lang/String;

    return-object v0
.end method
