.class public final Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;
.super Ljava/lang/Object;
.source "SendAnalyticsRequestV2Worker.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSendAnalyticsRequestV2Worker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendAnalyticsRequestV2Worker.kt\ncom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion\n+ 2 Data.kt\nandroidx/work/DataKt\n*L\n1#1,81:1\n31#2,5:82\n*S KotlinDebug\n*F\n+ 1 SendAnalyticsRequestV2Worker.kt\ncom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion\n*L\n64#1:82,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0008\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR6\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "value",
        "Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "networkClient",
        "getNetworkClient",
        "()Lcom/stripe/android/core/networking/StripeNetworkClient;",
        "Lkotlin/Function1;",
        "Landroid/content/Context;",
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;",
        "storage",
        "getStorage",
        "()Lkotlin/jvm/functions/Function1;",
        "createInputData",
        "Landroidx/work/Data;",
        "id",
        "setNetworkClient",
        "",
        "setStorage",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$DWxaXYZvw00By3TqotHEwgg5hQs(Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Landroid/content/Context;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;->setStorage$lambda$0(Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Landroid/content/Context;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    move-result-object p0

    return-object p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;-><init>()V

    return-void
.end method

.method private static final setStorage$lambda$0(Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Landroid/content/Context;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final createInputData(Ljava/lang/String;)Landroidx/work/Data;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 64
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "data"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 82
    new-instance p1, Landroidx/work/Data$Builder;

    invoke-direct {p1}, Landroidx/work/Data$Builder;-><init>()V

    .line 83
    aget-object v0, v0, v1

    .line 84
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 86
    invoke-virtual {p1}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    move-result-object p1

    const-string v0, "dataBuilder.build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final getNetworkClient()Lcom/stripe/android/core/networking/StripeNetworkClient;
    .locals 1

    .line 56
    invoke-static {}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->access$getNetworkClient$cp()Lcom/stripe/android/core/networking/StripeNetworkClient;

    move-result-object v0

    return-object v0
.end method

.method public final getStorage()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/content/Context;",
            "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;",
            ">;"
        }
    .end annotation

    .line 59
    invoke-static {}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->access$getStorage$cp()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final setNetworkClient(Lcom/stripe/android/core/networking/StripeNetworkClient;)V
    .locals 1

    const-string v0, "networkClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-static {p1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->access$setNetworkClient$cp(Lcom/stripe/android/core/networking/StripeNetworkClient;)V

    return-void
.end method

.method public final setStorage(Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;)V
    .locals 1

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;)V

    invoke-static {v0}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->access$setStorage$cp(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
