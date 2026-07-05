.class public final Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;
.super Ljava/lang/Object;
.source "ShippingRateChangeRequestJsonParser_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;",
        ">;"
    }
.end annotation


# instance fields
.field private final shippingRateParserProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;>;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;->shippingRateParserProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;>;)",
            "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;>;)",
            "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/model/parsers/ModelJsonParser<",
            "Lcom/stripe/android/shoppay/bridge/ECEShippingRate;",
            ">;)",
            "Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;

    invoke-direct {v0, p0}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;-><init>(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;->shippingRateParserProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/core/model/parsers/ModelJsonParser;

    invoke-static {v0}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;->newInstance(Lcom/stripe/android/core/model/parsers/ModelJsonParser;)Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser_Factory;->get()Lcom/stripe/android/shoppay/bridge/ShippingRateChangeRequestJsonParser;

    move-result-object v0

    return-object v0
.end method
