.class public final Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;
.super Ljava/lang/Object;
.source "ErrorReporter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0007J\u0008\u0010\u0006\u001a\u00020\u0007H\u0007J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;",
        "",
        "<init>",
        "()V",
        "provideLogger",
        "Lcom/stripe/android/core/Logger;",
        "provideIoContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "providePublishableKey",
        "Lkotlin/Function0;",
        "",
        "context",
        "Landroid/content/Context;",
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


# static fields
.field static final synthetic $$INSTANCE:Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;


# direct methods
.method public static synthetic $r8$lambda$yefaj94BpuL9cApKaJN4uR2Q8UQ(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;->providePublishableKey$lambda$0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;->$$INSTANCE:Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final providePublishableKey$lambda$0(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 373
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final provideIoContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation runtime Lcom/stripe/android/core/injection/IOContext;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 367
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    return-object v0
.end method

.method public final provideLogger()Lcom/stripe/android/core/Logger;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 361
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    return-object v0
.end method

.method public final providePublishableKey(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "publishableKey"
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 373
    new-instance v0, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule$Companion$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
