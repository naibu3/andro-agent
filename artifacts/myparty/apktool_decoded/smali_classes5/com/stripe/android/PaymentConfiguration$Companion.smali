.class public final Lcom/stripe/android/PaymentConfiguration$Companion;
.super Ljava/lang/Object;
.source "PaymentConfiguration.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentConfiguration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0008\u0010\u000f\u001a\u00020\u000bH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/PaymentConfiguration$Companion;",
        "",
        "<init>",
        "()V",
        "instance",
        "Lcom/stripe/android/PaymentConfiguration;",
        "getInstance",
        "context",
        "Landroid/content/Context;",
        "loadInstance",
        "init",
        "",
        "publishableKey",
        "",
        "stripeAccountId",
        "clearInstance",
        "payments-core_release"
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
.method private constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/PaymentConfiguration$Companion;-><init>()V

    return-void
.end method

.method public static synthetic init$default(Lcom/stripe/android/PaymentConfiguration$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 86
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/PaymentConfiguration$Companion;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final loadInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;
    .locals 1

    .line 74
    new-instance v0, Lcom/stripe/android/PaymentConfiguration$Store;

    invoke-direct {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Store;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration$Store;->load$payments_core_release()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 75
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-static {p1}, Lcom/stripe/android/PaymentConfiguration;->access$setInstance$cp(Lcom/stripe/android/PaymentConfiguration;)V

    return-object p1

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    const-string v0, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    .line 78
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final synthetic clearInstance()V
    .locals 1

    const/4 v0, 0x0

    .line 110
    invoke-static {v0}, Lcom/stripe/android/PaymentConfiguration;->access$setInstance$cp(Lcom/stripe/android/PaymentConfiguration;)V

    return-void
.end method

.method public final getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-static {}, Lcom/stripe/android/PaymentConfiguration;->access$getInstance$cp()Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentConfiguration$Companion;->loadInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final init(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/PaymentConfiguration$Companion;->init$default(Lcom/stripe/android/PaymentConfiguration$Companion;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    new-instance v0, Lcom/stripe/android/PaymentConfiguration;

    invoke-direct {v0, p2, p3}, Lcom/stripe/android/PaymentConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/stripe/android/PaymentConfiguration;->access$setInstance$cp(Lcom/stripe/android/PaymentConfiguration;)V

    .line 97
    new-instance v0, Lcom/stripe/android/PaymentConfiguration$Store;

    invoke-direct {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Store;-><init>(Landroid/content/Context;)V

    .line 98
    invoke-virtual {v0, p2, p3}, Lcom/stripe/android/PaymentConfiguration$Store;->save(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 p3, 0x2

    .line 103
    invoke-static {p1, p2, p3, p2}, Lcom/stripe/android/PaymentsFraudDetectionDataRepositoryFactoryKt;->DefaultFraudDetectionDataRepository$default(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;ILjava/lang/Object;)Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRepository;->refresh()V

    return-void
.end method
