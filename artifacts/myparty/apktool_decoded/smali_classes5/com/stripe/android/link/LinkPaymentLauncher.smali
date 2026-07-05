.class public final Lcom/stripe/android/link/LinkPaymentLauncher;
.super Ljava/lang/Object;
.source "LinkPaymentLauncher.kt"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B+\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ,\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017J$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00182\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00120\u0017H\u0002J\u0006\u0010\u001e\u001a\u00020\u0012J&\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("
    }
    d2 = {
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "",
        "linkAnalyticsComponentBuilder",
        "Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;",
        "paymentElementCallbackIdentifier",
        "",
        "linkActivityContract",
        "Lcom/stripe/android/link/LinkActivityContract;",
        "linkStore",
        "Lcom/stripe/android/link/account/LinkStore;",
        "<init>",
        "(Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lcom/stripe/android/link/account/LinkStore;)V",
        "analyticsHelper",
        "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;",
        "linkActivityResultLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "register",
        "",
        "key",
        "activityResultRegistry",
        "Landroidx/activity/result/ActivityResultRegistry;",
        "callback",
        "Lkotlin/Function1;",
        "Lcom/stripe/android/link/LinkActivityResult;",
        "activityResultCaller",
        "Landroidx/activity/result/ActivityResultCaller;",
        "handleActivityResult",
        "linkActivityResult",
        "nextStep",
        "unregister",
        "present",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAccountInfo",
        "Lcom/stripe/android/link/LinkAccountUpdate$Value;",
        "launchMode",
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "linkExpressMode",
        "Lcom/stripe/android/link/LinkExpressMode;",
        "paymentsheet_release"
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
.field private final analyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

.field private final linkActivityContract:Lcom/stripe/android/link/LinkActivityContract;

.field private linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final linkStore:Lcom/stripe/android/link/account/LinkStore;

.field private final paymentElementCallbackIdentifier:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$VDeMKAl5kq3tqPU0Uy1mvL9Va5c(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/link/LinkPaymentLauncher;->register$lambda$1(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$xhKWp918uVeM8x9p-ajP_T7WoqM(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/link/LinkPaymentLauncher;->register$lambda$0(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;Ljava/lang/String;Lcom/stripe/android/link/LinkActivityContract;Lcom/stripe/android/link/account/LinkStore;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "linkAnalyticsComponentBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkActivityContract"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStore"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p2, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityContract:Lcom/stripe/android/link/LinkActivityContract;

    .line 21
    iput-object p4, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    .line 23
    invoke-interface {p1}, Lcom/stripe/android/link/injection/LinkAnalyticsComponent$Builder;->build()Lcom/stripe/android/link/injection/LinkAnalyticsComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/link/injection/LinkAnalyticsComponent;->getLinkAnalyticsHelper()Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->analyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    return-void
.end method

.method private final handleActivityResult(Lcom/stripe/android/link/LinkActivityResult;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->analyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    invoke-interface {v0, p1}, Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;->onLinkResult(Lcom/stripe/android/link/LinkActivityResult;)V

    .line 58
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Completed;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Canceled;

    if-nez v0, :cond_3

    instance-of v0, p1, Lcom/stripe/android/link/LinkActivityResult$Failed;

    if-eqz v0, :cond_1

    goto :goto_1

    .line 57
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 59
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkStore:Lcom/stripe/android/link/account/LinkStore;

    invoke-virtual {v0}, Lcom/stripe/android/link/account/LinkStore;->markLinkAsUsed()V

    .line 63
    :cond_3
    :goto_1
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic register$default(Lcom/stripe/android/link/LinkPaymentLauncher;Ljava/lang/String;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 29
    const-string p1, "LinkPaymentLauncher"

    .line 28
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/LinkPaymentLauncher;->register(Ljava/lang/String;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final register$lambda$0(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 1

    const-string v0, "linkActivityResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p2, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->handleActivityResult(Lcom/stripe/android/link/LinkActivityResult;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final register$lambda$1(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/link/LinkActivityResult;)V
    .locals 1

    const-string v0, "linkActivityResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0, p2, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->handleActivityResult(Lcom/stripe/android/link/LinkActivityResult;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final present(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/link/LinkExpressMode;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkExpressMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    new-instance v0, Lcom/stripe/android/link/LinkActivityContract$Args;

    invoke-direct {v0, p1, p4, p2, p3}, Lcom/stripe/android/link/LinkActivityContract$Args;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkAccountUpdate$Value;Lcom/stripe/android/link/LinkLaunchMode;)V

    .line 88
    iget-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 89
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->analyticsHelper:Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;

    invoke-interface {p1}, Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;->onLinkLaunched()V

    return-void
.end method

.method public final register(Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultCaller;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activityResultCaller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityContract:Lcom/stripe/android/link/LinkActivityContract;

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 45
    new-instance v1, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p2}, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0, v1}, Landroidx/activity/result/ActivityResultCaller;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public final register(Ljava/lang/String;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/activity/result/ActivityResultRegistry;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/link/LinkActivityResult;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityContract:Lcom/stripe/android/link/LinkActivityContract;

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 33
    new-instance v1, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0, p3}, Lcom/stripe/android/link/LinkPaymentLauncher$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1, v0, v1}, Landroidx/activity/result/ActivityResultRegistry;->register(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method

.method public final unregister()V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    :cond_0
    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Lcom/stripe/android/link/LinkPaymentLauncher;->linkActivityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-void
.end method
