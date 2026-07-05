.class public interface abstract Lcom/stripe/android/shoppay/di/ShopPayModule;
.super Ljava/lang/Object;
.source "ShopPayModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 #2\u00020\u0001:\u0001#J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u0011\u001a\u00020\u0015H\'J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000f2\u0006\u0010\u0011\u001a\u00020\u0018H\'J\u0016\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\u0011\u001a\u00020\u001bH\'J\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u000f2\u0006\u0010\u0011\u001a\u00020\u001eH\'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\'\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/di/ShopPayModule;",
        "",
        "bindBridgeHandler",
        "Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;",
        "bridgeHandler",
        "Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;",
        "bindEventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;",
        "bindUserFacingLogger",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
        "logger",
        "Lcom/stripe/android/core/utils/RealUserFacingLogger;",
        "bindsHandleClickRequestJsonParser",
        "Lcom/stripe/android/core/model/parsers/ModelJsonParser;",
        "Lcom/stripe/android/shoppay/bridge/HandleClickRequest;",
        "parser",
        "Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;",
        "bindsShippingCalculationRequestJsonParser",
        "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;",
        "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;",
        "bindsShippingRateChangeRequestJsonParser",
        "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;",
        "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;",
        "bindsConfirmationRequestJsonParser",
        "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;",
        "Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;",
        "bindsECEShippingRateJsonParser",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
        "Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;",
        "bindsAnalyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;->$$INSTANCE:Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;

    sput-object v0, Lcom/stripe/android/shoppay/di/ShopPayModule;->Companion:Lcom/stripe/android/shoppay/di/ShopPayModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindBridgeHandler(Lcom/stripe/android/shoppay/bridge/DefaultShopPayBridgeHandler;)Lcom/stripe/android/shoppay/bridge/ShopPayBridgeHandler;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindEventReporter(Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;)Lcom/stripe/android/paymentsheet/analytics/EventReporter;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindUserFacingLogger(Lcom/stripe/android/core/utils/RealUserFacingLogger;)Lcom/stripe/android/core/utils/UserFacingLogger;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsAnalyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsConfirmationRequestJsonParser(Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;)Lcom/stripe/android/core/model/parsers/ModelJsonParser;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/ConfirmationRequestJsonParser;",
            ")",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ConfirmationRequest;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsECEShippingRateJsonParser(Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;)Lcom/stripe/android/core/model/parsers/ModelJsonParser;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRateJsonParser;",
            ")",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsHandleClickRequestJsonParser(Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;)Lcom/stripe/android/core/model/parsers/ModelJsonParser;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/HandleClickRequestJsonParser;",
            ")",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/HandleClickRequest;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsShippingCalculationRequestJsonParser(Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;)Lcom/stripe/android/core/model/parsers/ModelJsonParser;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequestJsonParser;",
            ")",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ShippingCalculationRequest;",
            ">;"
        }
    .end annotation
.end method

.method public abstract bindsShippingRateChangeRequestJsonParser(Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;)Lcom/stripe/android/core/model/parsers/ModelJsonParser;
    .annotation runtime Ldagger/Binds;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;",
            ")",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequest;",
            ">;"
        }
    .end annotation
.end method
