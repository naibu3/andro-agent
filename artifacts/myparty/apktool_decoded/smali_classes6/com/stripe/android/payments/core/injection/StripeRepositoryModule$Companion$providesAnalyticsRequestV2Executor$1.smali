.class final Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;
.super Ljava/lang/Object;
.source "StripeRepositoryModule.kt"

# interfaces
.implements Lcom/stripe/android/core/utils/IsWorkManagerAvailable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;->providesAnalyticsRequestV2Executor(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;

    invoke-direct {v0}, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;->INSTANCE:Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion$providesAnalyticsRequestV2Executor$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p1, 0x0

    .line 52
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
