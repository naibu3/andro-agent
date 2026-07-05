.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetConfigurationModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0008\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\rH\u0007J\u0008\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;",
        "",
        "<init>",
        "()V",
        "providesPublishableKey",
        "",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;",
        "providesStripeAccountId",
        "providesEnableLogging",
        "",
        "providesApplicationId",
        "application",
        "Landroid/app/Application;",
        "providesApiVersion",
        "Lcom/stripe/android/core/ApiVersion;",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetConfigurationModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final providesApiVersion()Lcom/stripe/android/core/ApiVersion;
    .locals 2
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 44
    new-instance v0, Lcom/stripe/android/core/ApiVersion;

    .line 45
    const-string v1, "financial_connections_client_api_beta=v1"

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 44
    invoke-direct {v0, v1}, Lcom/stripe/android/core/ApiVersion;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public final providesApplicationId(Landroid/app/Application;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "applicationId"
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getPackageName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final providesEnableLogging()Z
    .locals 1
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "enableLogging"
    .end annotation

    const/4 v0, 0x0

    return v0
.end method

.method public final providesPublishableKey(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "publishableKey"
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final providesStripeAccountId(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "stripeAccountId"
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
