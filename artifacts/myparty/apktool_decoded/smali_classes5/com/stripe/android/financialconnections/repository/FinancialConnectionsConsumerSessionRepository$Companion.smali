.class public final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;
.super Ljava/lang/Object;
.source "FinancialConnectionsConsumerSessionRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JU\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086\u0002\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;",
        "consumersApiService",
        "Lcom/stripe/android/repository/ConsumersApiService;",
        "provideApiRequestOptions",
        "Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;",
        "consumerSessionRepository",
        "Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;",
        "financialConnectionsConsumersApiService",
        "Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;",
        "locale",
        "Ljava/util/Locale;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "isLinkWithStripe",
        "Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;",
        "fraudDetectionDataRepository",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;",
        "elementsSessionContext",
        "Lcom/stripe/android/financialconnections/ElementsSessionContext;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;->$$INSTANCE:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/repository/ConsumersApiService;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/financialconnections/ElementsSessionContext;)Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;
    .locals 11

    const-string v0, "consumersApiService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "provideApiRequestOptions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumerSessionRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "financialConnectionsConsumersApiService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkWithStripe"

    move-object/from16 v10, p7

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fraudDetectionDataRepository"

    move-object/from16 v8, p8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    new-instance v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;

    move-object v3, p1

    move-object v5, p2

    move-object v4, p3

    move-object v2, p4

    move-object/from16 v6, p5

    move-object/from16 v9, p9

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepositoryImpl;-><init>(Lcom/stripe/android/financialconnections/repository/api/FinancialConnectionsConsumersApiService;Lcom/stripe/android/repository/ConsumersApiService;Lcom/stripe/android/financialconnections/repository/ConsumerSessionRepository;Lcom/stripe/android/financialconnections/repository/api/ProvideApiRequestOptions;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/frauddetection/FraudDetectionDataRepository;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/IsLinkWithStripe;)V

    check-cast v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;

    return-object v1
.end method
