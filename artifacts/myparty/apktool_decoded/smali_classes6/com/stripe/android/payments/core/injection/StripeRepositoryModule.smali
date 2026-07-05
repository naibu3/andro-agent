.class public abstract Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;
.super Ljava/lang/Object;
.source "StripeRepositoryModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H!\u00a2\u0006\u0002\u0008\u0008J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH!\u00a2\u0006\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;",
        "",
        "<init>",
        "()V",
        "bindsAnalyticsRequestExecutor",
        "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;",
        "default",
        "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;",
        "bindsAnalyticsRequestExecutor$payments_core_release",
        "bindsStripeRepository",
        "Lcom/stripe/android/networking/StripeRepository;",
        "stripeApiRepository",
        "Lcom/stripe/android/networking/StripeApiRepository;",
        "bindsStripeRepository$payments_core_release",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;->Companion:Lcom/stripe/android/payments/core/injection/StripeRepositoryModule$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract bindsAnalyticsRequestExecutor$payments_core_release(Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;)Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsStripeRepository$payments_core_release(Lcom/stripe/android/networking/StripeApiRepository;)Lcom/stripe/android/networking/StripeRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
