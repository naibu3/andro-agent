.class public final Lcom/stripe/android/customersheet/CustomerSheet;
.super Ljava/lang/Object;
.source "CustomerSheet.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheet$Companion;,
        Lcom/stripe/android/customersheet/CustomerSheet$Configuration;,
        Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;,
        Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;,
        Lcom/stripe/android/customersheet/CustomerSheet$IntentConfiguration;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 *2\u00020\u0001:\u0005&\'()*BQ\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020!H\u0086@\u00a2\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheet;",
        "",
        "application",
        "Landroid/app/Application;",
        "lifecycleOwner",
        "Landroidx/lifecycle/LifecycleOwner;",
        "activityResultRegistryOwner",
        "Landroidx/activity/result/ActivityResultRegistryOwner;",
        "viewModelStoreOwner",
        "Landroidx/lifecycle/ViewModelStoreOwner;",
        "integrationType",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "paymentOptionFactory",
        "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
        "callback",
        "Lcom/stripe/android/customersheet/CustomerSheetResultCallback;",
        "statusBarColor",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Landroidx/lifecycle/ViewModelStoreOwner;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;Lkotlin/jvm/functions/Function0;)V",
        "customerSheetActivityLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
        "viewModel",
        "Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;",
        "configure",
        "",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "present",
        "resetCustomer",
        "retrievePaymentOptionSelection",
        "Lcom/stripe/android/customersheet/CustomerSheetResult;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onCustomerSheetResult",
        "result",
        "Lcom/stripe/android/customersheet/InternalCustomerSheetResult;",
        "Configuration",
        "IntentConfiguration",
        "CustomerSessionClientSecret",
        "CustomerSessionProvider",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;


# instance fields
.field private final application:Landroid/app/Application;

.field private final callback:Lcom/stripe/android/customersheet/CustomerSheetResultCallback;

.field private final customerSheetActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/customersheet/CustomerSheetContract$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

.field private final paymentOptionFactory:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

.field private final statusBarColor:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final viewModel:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheet;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/customersheet/CustomerSheet;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Landroidx/lifecycle/ViewModelStoreOwner;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Landroidx/lifecycle/LifecycleOwner;",
            "Landroidx/activity/result/ActivityResultRegistryOwner;",
            "Landroidx/lifecycle/ViewModelStoreOwner;",
            "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
            "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;",
            "Lcom/stripe/android/customersheet/CustomerSheetResultCallback;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityResultRegistryOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "integrationType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentOptionFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statusBarColor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet;->application:Landroid/app/Application;

    .line 38
    iput-object p5, p0, Lcom/stripe/android/customersheet/CustomerSheet;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    .line 39
    iput-object p6, p0, Lcom/stripe/android/customersheet/CustomerSheet;->paymentOptionFactory:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    .line 40
    iput-object p7, p0, Lcom/stripe/android/customersheet/CustomerSheet;->callback:Lcom/stripe/android/customersheet/CustomerSheetResultCallback;

    .line 41
    iput-object p8, p0, Lcom/stripe/android/customersheet/CustomerSheet;->statusBarColor:Lkotlin/jvm/functions/Function0;

    .line 44
    invoke-interface {p3}, Landroidx/activity/result/ActivityResultRegistryOwner;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object p1

    .line 46
    new-instance p3, Lcom/stripe/android/customersheet/CustomerSheetContract;

    invoke-direct {p3}, Lcom/stripe/android/customersheet/CustomerSheetContract;-><init>()V

    check-cast p3, Landroidx/activity/result/contract/ActivityResultContract;

    .line 47
    new-instance p5, Lcom/stripe/android/customersheet/CustomerSheet$customerSheetActivityLauncher$1;

    invoke-direct {p5, p0}, Lcom/stripe/android/customersheet/CustomerSheet$customerSheetActivityLauncher$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheet;)V

    check-cast p5, Landroidx/activity/result/ActivityResultCallback;

    .line 44
    const-string p6, "CustomerSheet"

    invoke-virtual {p1, p6, p3, p5}, Landroidx/activity/result/ActivityResultRegistry;->register(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet;->customerSheetActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    .line 50
    new-instance p1, Landroidx/lifecycle/ViewModelProvider;

    .line 52
    sget-object p3, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Factory;->INSTANCE:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel$Factory;

    check-cast p3, Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 50
    invoke-direct {p1, p4, p3}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    .line 53
    const-class p3, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;

    .line 50
    invoke-virtual {p1, p3}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;

    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet;->viewModel:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;

    .line 56
    invoke-interface {p2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    .line 57
    new-instance p2, Lcom/stripe/android/customersheet/CustomerSheet$1;

    invoke-direct {p2, p0}, Lcom/stripe/android/customersheet/CustomerSheet$1;-><init>(Lcom/stripe/android/customersheet/CustomerSheet;)V

    check-cast p2, Landroidx/lifecycle/LifecycleObserver;

    .line 56
    invoke-virtual {p1, p2}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    return-void
.end method

.method public static final synthetic access$getCustomerSheetActivityLauncher$p(Lcom/stripe/android/customersheet/CustomerSheet;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->customerSheetActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    return-object p0
.end method

.method public static final synthetic access$getPaymentOptionFactory$p(Lcom/stripe/android/customersheet/CustomerSheet;)Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->paymentOptionFactory:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    return-object p0
.end method

.method public static final synthetic access$onCustomerSheetResult(Lcom/stripe/android/customersheet/CustomerSheet;Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerSheet;->onCustomerSheetResult(Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V

    return-void
.end method

.method public static final create(Landroidx/activity/ComponentActivity;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheet;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$Companion;->create(Landroidx/activity/ComponentActivity;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Landroidx/activity/ComponentActivity;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheet;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$Companion;->create(Landroidx/activity/ComponentActivity;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Landroidx/fragment/app/Fragment;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheet;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$Companion;->create(Landroidx/fragment/app/Fragment;Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;

    move-result-object p0

    return-object p0
.end method

.method public static final create(Landroidx/fragment/app/Fragment;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheet;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/customersheet/CustomerSheet$Companion;->create(Landroidx/fragment/app/Fragment;Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;)Lcom/stripe/android/customersheet/CustomerSheet;

    move-result-object p0

    return-object p0
.end method

.method private final onCustomerSheetResult(Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->callback:Lcom/stripe/android/customersheet/CustomerSheetResultCallback;

    .line 168
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet;->paymentOptionFactory:Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;

    invoke-virtual {p1, v1}, Lcom/stripe/android/customersheet/InternalCustomerSheetResult;->toPublicResult(Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;)Lcom/stripe/android/customersheet/CustomerSheetResult;

    move-result-object p1

    .line 167
    invoke-interface {v0, p1}, Lcom/stripe/android/customersheet/CustomerSheetResultCallback;->onCustomerSheetResult(Lcom/stripe/android/customersheet/CustomerSheetResult;)V

    return-void
.end method


# virtual methods
.method public final configure(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)V
    .locals 2

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->viewModel:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

    invoke-direct {v1, p1}, Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;-><init>(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->setConfigureRequest(Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;)V

    return-void
.end method

.method public final present()V
    .locals 4

    .line 83
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->viewModel:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->getConfigureRequest()Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerSheet;

    .line 84
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->callback:Lcom/stripe/android/customersheet/CustomerSheetResultCallback;

    .line 85
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;

    .line 86
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 87
    const-string v3, "Must call `configure` first before attempting to present `CustomerSheet`!"

    .line 86
    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Throwable;

    .line 85
    invoke-direct {v1, v2}, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast v1, Lcom/stripe/android/customersheet/CustomerSheetResult;

    .line 84
    invoke-interface {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetResultCallback;->onCustomerSheetResult(Lcom/stripe/android/customersheet/CustomerSheetResult;)V

    return-void

    .line 96
    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;->getConfiguration()Lcom/stripe/android/customersheet/CustomerSheet$Configuration;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet;->integrationType:Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;

    .line 98
    iget-object v2, p0, Lcom/stripe/android/customersheet/CustomerSheet;->statusBarColor:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 95
    new-instance v3, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;

    invoke-direct {v3, v1, v0, v2}, Lcom/stripe/android/customersheet/CustomerSheetContract$Args;-><init>(Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Ljava/lang/Integer;)V

    .line 102
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->application:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 103
    sget-object v1, Lcom/stripe/android/uicore/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/uicore/utils/AnimationConstants;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/utils/AnimationConstants;->getFADE_IN()I

    move-result v1

    .line 104
    sget-object v2, Lcom/stripe/android/uicore/utils/AnimationConstants;->INSTANCE:Lcom/stripe/android/uicore/utils/AnimationConstants;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/utils/AnimationConstants;->getFADE_OUT()I

    move-result v2

    .line 101
    invoke-static {v0, v1, v2}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object v0

    const-string v1, "makeCustomAnimation(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet;->customerSheetActivityLauncher:Landroidx/activity/result/ActivityResultLauncher;

    invoke-virtual {v1, v3, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method

.method public final resetCustomer()V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->viewModel:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->setConfigureRequest(Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;)V

    .line 118
    sget-object v0, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->INSTANCE:Lcom/stripe/android/customersheet/util/CustomerSheetHacks;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/util/CustomerSheetHacks;->clear()V

    return-void
.end method

.method public final retrievePaymentOptionSelection(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/customersheet/CustomerSheetResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet;->viewModel:Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerSheetConfigViewModel;->getConfigureRequest()Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;

    move-result-object v0

    if-nez v0, :cond_0

    .line 127
    new-instance p1, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;

    .line 128
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 129
    const-string v1, "Must call `configure` first before attempting to fetch the saved payment option!"

    .line 128
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 127
    invoke-direct {p1, v0}, Lcom/stripe/android/customersheet/CustomerSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    return-object p1

    .line 133
    :cond_0
    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/stripe/android/customersheet/CustomerSheet$retrievePaymentOptionSelection$2;-><init>(Lcom/stripe/android/customersheet/CustomerSheet;Lcom/stripe/android/customersheet/CustomerSheetConfigureRequest;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v1, p1}, Lkotlinx/coroutines/CoroutineScopeKt;->coroutineScope(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
