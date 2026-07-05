.class public final Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;
.super Ljava/lang/Object;
.source "DefaultPaymentSheetLauncher.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001BI\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u0019\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0013\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0014B\u0019\u0008\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0017B!\u0008\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;",
        "activityResultLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
        "activity",
        "Landroid/app/Activity;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "application",
        "Landroid/app/Application;",
        "callback",
        "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
        "paymentElementCallbackIdentifier",
        "",
        "initializedViaCompose",
        "",
        "<init>",
        "(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V",
        "Landroidx/activity/ComponentActivity;",
        "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "registry",
        "Landroidx/activity/result/ActivityResultRegistry;",
        "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V",
        "present",
        "",
        "mode",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
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
.field private final activity:Landroid/app/Activity;

.field private final activityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final application:Landroid/app/Application;

.field private final callback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

.field private final initializedViaCompose:Z

.field private final lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

.field private final paymentElementCallbackIdentifier:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$JPu_DVzAGqjr15zFeI0KvoXE2HA(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->_init_$lambda$0(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$aT-hGaFiynqXXj26gIpMQ6rIMEE(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->_init_$lambda$2(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public static synthetic $r8$lambda$gufpNZwZvOkuZM67OkI8nv0FqEs(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->_init_$lambda$1(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 12

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 45
    new-instance v1, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda2;

    invoke-direct {v1, p2}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {p1, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v3

    .line 50
    move-object v4, p1

    check-cast v4, Landroid/app/Activity;

    .line 51
    move-object v5, p1

    check-cast v5, Landroidx/lifecycle/LifecycleOwner;

    .line 52
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->getApplication()Landroid/app/Application;

    move-result-object v6

    const-string p1, "getApplication(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x60

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    move-object v7, p2

    .line 44
    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;",
            ">;",
            "Landroid/app/Activity;",
            "Landroidx/lifecycle/LifecycleOwner;",
            "Landroid/app/Application;",
            "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, "activityResultLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "application"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->activityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 23
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->activity:Landroid/app/Activity;

    .line 24
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    .line 25
    iput-object p4, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->application:Landroid/app/Application;

    .line 26
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->callback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    .line 27
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 28
    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->initializedViaCompose:Z

    .line 31
    invoke-interface {p3}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    .line 32
    new-instance p2, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;

    invoke-direct {p2, p0}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;-><init>(Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;)V

    check-cast p2, Landroidx/lifecycle/LifecycleObserver;

    .line 31
    invoke-virtual {p1, p2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    .line 27
    const-string p6, "PaymentSheet"

    :cond_0
    move-object v6, p6

    and-int/lit8 p6, p8, 0x40

    if-eqz p6, :cond_1

    const/4 p6, 0x0

    move v7, p6

    goto :goto_0

    :cond_1
    move v7, p7

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 21
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 12

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 77
    new-instance v1, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda1;

    invoke-direct {v1, p3}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {p1, v0, p2, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v3

    const-string p2, "registerForActivityResult(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-string v0, "requireActivity(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Landroid/app/Activity;

    .line 84
    move-object v5, p1

    check-cast v5, Landroidx/lifecycle/LifecycleOwner;

    .line 85
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v6

    const-string p1, "getApplication(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x60

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    move-object v7, p3

    .line 76
    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V
    .locals 12

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;-><init>()V

    check-cast v0, Landroidx/activity/result/contract/ActivityResultContract;

    .line 60
    new-instance v1, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda0;

    invoke-direct {v1, p2}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v3

    const-string v0, "registerForActivityResult(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "requireActivity(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 66
    move-object v5, p1

    check-cast v5, Landroidx/lifecycle/LifecycleOwner;

    .line 67
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v6

    const-string p1, "getApplication(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x60

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p0

    move-object v7, p2

    .line 59
    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;->onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;->onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method private static final _init_$lambda$2(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;->onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method

.method public static final synthetic access$getPaymentElementCallbackIdentifier$p(Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;)Ljava/lang/String;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public present(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V
    .locals 6

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 95
    sget-object p2, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Companion;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->activity:Landroid/app/Activity;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p2, v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Companion;->default(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    move-result-object p2

    :cond_0
    move-object v2, p2

    .line 96
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->activity:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/Window;->getStatusBarColor()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    move-object v4, p2

    .line 97
    iget-object v3, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 98
    iget-boolean v5, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->initializedViaCompose:Z

    .line 93
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$Args;-><init>(Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/String;Ljava/lang/Integer;Z)V

    .line 102
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->application:Landroid/app/Application;

    invoke-virtual {p1}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 103
    sget-object p2, Lcom/stripe/android/uicore/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/uicore/utils/AnimationConstants;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/utils/AnimationConstants;->getFADE_IN()I

    move-result p2

    .line 104
    sget-object v1, Lcom/stripe/android/uicore/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/uicore/utils/AnimationConstants;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/utils/AnimationConstants;->getFADE_OUT()I

    move-result v1

    .line 101
    invoke-static {p1, p2, v1}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object p1

    const-string p2, "makeCustomAnimation(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    :try_start_0
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->activityResultLauncher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {p2, v0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 110
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->lifecycleOwner:Landroidx/lifecycle/LifecycleOwner;

    invoke-interface {p2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The host activity is not in a valid state ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, ")."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 111
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;->callback:Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;

    new-instance v1, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;

    new-instance v2, Ljava/lang/IllegalStateException;

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v2, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v2, Ljava/lang/Throwable;

    invoke-direct {v1, v2}, Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/PaymentSheetResult;

    invoke-interface {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;->onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V

    return-void
.end method
