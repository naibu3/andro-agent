.class public final Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;
.super Ljava/lang/Object;
.source "ProvideApiRequestOptions.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProvideApiRequestOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProvideApiRequestOptions.kt\ncom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0096\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "consumerSessionProvider",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;",
        "isLinkWithStripe",
        "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
        "apiRequestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/core/networking/ApiRequest$Options;)V",
        "invoke",
        "useConsumerPublishableKey",
        "",
        "consumerApiRequestOptions",
        "financial-connections_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final apiRequestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

.field private final isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/core/networking/ApiRequest$Options;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "consumerSessionProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkWithStripe"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    .line 14
    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

    .line 15
    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->apiRequestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-void
.end method

.method private final consumerApiRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 9

    .line 29
    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->consumerSessionProvider:Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;

    invoke-interface {v0}, Lcom/stripe/android/financialconnections/repository/ConsumerSessionProvider;->provideConsumerSession()Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->isVerified()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 30
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/repository/CachedConsumerSession;->getPublishableKey()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->isLinkWithStripe:Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;

    invoke-interface {v2}, Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;->invoke()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-eqz v4, :cond_2

    .line 33
    new-instance v3, Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/core/networking/ApiRequest$Options;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_2
    return-object v1
.end method


# virtual methods
.method public invoke(Z)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 0

    if-eqz p1, :cond_1

    .line 22
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->consumerApiRequestOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->apiRequestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    :cond_0
    return-object p1

    .line 24
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/financialconnections/repository/api/RealProvideApiRequestOptions;->apiRequestOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-object p1
.end method
