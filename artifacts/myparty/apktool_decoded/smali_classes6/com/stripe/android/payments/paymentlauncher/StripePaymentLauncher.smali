.class public final Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;
.super Ljava/lang/Object;
.source "StripePaymentLauncher.kt"

# interfaces
.implements Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001Bk\u0008\u0001\u0012\u000e\u0008\u0001\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\u0008\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0001\u0010\r\u001a\u00020\u000c\u0012\u000e\u0008\u0001\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0004H\u0017R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "",
        "stripeAccountIdProvider",
        "hostActivityLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
        "statusBarColor",
        "",
        "includePaymentSheetNextHandlers",
        "",
        "enableLogging",
        "productUsage",
        "",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/Integer;ZZLjava/util/Set;)V",
        "Ljava/lang/Integer;",
        "confirm",
        "",
        "params",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "handleNextActionForPaymentIntent",
        "clientSecret",
        "handleNextActionForSetupIntent",
        "handleNextActionForHashedPaymentIntent",
        "hashedValue",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final enableLogging:Z

.field private final hostActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final includePaymentSheetNextHandlers:Z

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final publishableKeyProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final statusBarColor:Ljava/lang/Integer;

.field private final stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/activity/result/ActivityResultLauncher;Ljava/lang/Integer;ZZLjava/util/Set;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ldagger/assisted/Assisted;
            value = "publishableKey"
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation runtime Ldagger/assisted/Assisted;
            value = "stripeAccountId"
        .end annotation
    .end param
    .param p3    # Landroidx/activity/result/ActivityResultLauncher;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Ldagger/assisted/Assisted;
            value = "STATUS_BAR_COLOR"
        .end annotation
    .end param
    .param p5    # Z
        .annotation runtime Ldagger/assisted/Assisted;
            value = "INCLUDE_PAYMENT_SHEET_NEXT_ACTION_HANDLERS"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime Ljavax/inject/Named;
            value = "enableLogging"
        .end annotation
    .end param
    .param p7    # Ljava/util/Set;
        .annotation runtime Ljavax/inject/Named;
            value = "productUsage"
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;",
            ">;",
            "Ljava/lang/Integer;",
            "ZZ",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "publishableKeyProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeAccountIdProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostActivityLauncher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    .line 25
    iput-object p2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    .line 26
    iput-object p3, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 27
    iput-object p4, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->statusBarColor:Ljava/lang/Integer;

    .line 28
    iput-boolean p5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->includePaymentSheetNextHandlers:Z

    .line 29
    iput-boolean p6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    .line 30
    iput-object p7, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public confirm(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V
    .locals 10

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 35
    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 36
    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    .line 37
    iget-boolean v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    .line 38
    iget-object v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    .line 40
    iget-boolean v7, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->includePaymentSheetNextHandlers:Z

    .line 41
    iget-object v9, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->statusBarColor:Ljava/lang/Integer;

    .line 34
    new-instance v2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    .line 39
    move-object v8, p1

    check-cast v8, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    .line 34
    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/Integer;)V

    .line 33
    invoke-virtual {v0, v2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void
.end method

.method public confirm(Lcom/stripe/android/model/ConfirmSetupIntentParams;)V
    .locals 9

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 48
    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;

    .line 49
    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 50
    iget-object v3, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 51
    iget-boolean v4, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    .line 52
    iget-object v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    .line 53
    iget-boolean v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->includePaymentSheetNextHandlers:Z

    .line 54
    move-object v7, p1

    check-cast v7, Lcom/stripe/android/model/ConfirmStripeIntentParams;

    .line 55
    iget-object v8, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->statusBarColor:Ljava/lang/Integer;

    .line 48
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$IntentConfirmationArgs;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/Integer;)V

    .line 47
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void
.end method

.method public handleNextActionForHashedPaymentIntent(Ljava/lang/String;)V
    .locals 9

    const-string v0, "hashedValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 93
    iget-object v1, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    .line 94
    iget-boolean v4, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    .line 95
    iget-object v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    .line 96
    iget-boolean v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->includePaymentSheetNextHandlers:Z

    .line 97
    iget-object v8, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->statusBarColor:Ljava/lang/Integer;

    .line 91
    new-instance v2, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$HashedPaymentIntentNextActionArgs;

    move-object v7, p1

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$HashedPaymentIntentNextActionArgs;-><init>(Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;)V

    .line 90
    invoke-virtual {v0, v2}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void
.end method

.method public handleNextActionForPaymentIntent(Ljava/lang/String;)V
    .locals 9

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 62
    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;

    .line 63
    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 64
    iget-object v3, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 65
    iget-boolean v4, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    .line 66
    iget-object v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    .line 67
    iget-boolean v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->includePaymentSheetNextHandlers:Z

    .line 69
    iget-object v8, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->statusBarColor:Ljava/lang/Integer;

    move-object v7, p1

    .line 62
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$PaymentIntentNextActionArgs;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;)V

    .line 61
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void
.end method

.method public handleNextActionForSetupIntent(Ljava/lang/String;)V
    .locals 9

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->hostActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 76
    new-instance v1, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;

    .line 77
    iget-object v2, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->publishableKeyProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 78
    iget-object v3, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->stripeAccountIdProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 79
    iget-boolean v4, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->enableLogging:Z

    .line 80
    iget-object v5, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->productUsage:Ljava/util/Set;

    .line 81
    iget-boolean v6, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->includePaymentSheetNextHandlers:Z

    .line 83
    iget-object v8, p0, Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;->statusBarColor:Ljava/lang/Integer;

    move-object v7, p1

    .line 76
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args$SetupIntentNextActionArgs;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;)V

    .line 75
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void
.end method
