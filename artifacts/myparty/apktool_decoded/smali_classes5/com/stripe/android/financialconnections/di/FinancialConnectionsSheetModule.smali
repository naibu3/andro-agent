.class public final Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;
.super Ljava/lang/Object;
.source "FinancialConnectionsSheetModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\u0008\u0008J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;",
        "",
        "<init>",
        "()V",
        "providesProvideApiRequestOptions",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "apiRequestOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "providesProvideApiRequestOptions$financial_connections_release",
        "providesFinancialConnectionsManifestRepository",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "provideApiRequestOptions",
        "locale",
        "Ljava/util/Locale;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
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

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;


# direct methods
.method public static synthetic $r8$lambda$pJf_OECsFGsCoRSAIUA14P8Ak_A(Lcom/stripe/android/core/networking/ApiRequest$Options;Z)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;->providesProvideApiRequestOptions$lambda$0(Lcom/stripe/android/core/networking/ApiRequest$Options;Z)Lcom/stripe/android/core/networking/ApiRequest$Options;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;->INSTANCE:Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final providesProvideApiRequestOptions$lambda$0(Lcom/stripe/android/core/networking/ApiRequest$Options;Z)Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 0

    return-object p0
.end method


# virtual methods
.method public final providesFinancialConnectionsManifestRepository(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;
    .locals 8
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;

    if-nez p4, :cond_0

    .line 37
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p4

    :cond_0
    move-object v6, p4

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    .line 32
    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository$Companion;->invoke(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/core/Logger;Ljava/util/Locale;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;

    move-result-object p1

    return-object p1
.end method

.method public final providesProvideApiRequestOptions$financial_connections_release(Lcom/stripe/android/core/networking/ApiRequest$Options;)Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;
    .locals 1
    .annotation runtime Lcom/stripe/android/financialconnections/di/ActivityRetainedScope;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "apiRequestOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetModule$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/core/networking/ApiRequest$Options;)V

    return-object v0
.end method
